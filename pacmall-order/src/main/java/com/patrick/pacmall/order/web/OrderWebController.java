package com.patrick.pacmall.order.web;

import com.patrick.pacmall.order.service.OrderService;
import com.patrick.pacmall.order.vo.OrderConfirmVo;
import com.patrick.pacmall.order.vo.OrderSubmitVo;
import com.patrick.pacmall.order.vo.SubmitOrderResponseVo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;

@Controller
public class OrderWebController {

    @Autowired
    OrderService orderService;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/toTrade")
    public String toTrade(Model model, HttpServletRequest request) throws ExecutionException, InterruptedException {
        OrderConfirmVo confirmVo = orderService.confirmOrder();
        model.addAttribute("orderConfirmData", confirmVo);
        return "confirm";
    }

    /**
     * 下单功能
     *
     * @return
     */
    @PostMapping("/submitOrder")
    public String submitOrder(OrderSubmitVo vo, Model model, RedirectAttributes redirectAttributes) {
        //try {
            SubmitOrderResponseVo responseVo = orderService.submitOrder(vo);
            if (responseVo.getCode() == 0) {
                model.addAttribute("submitOrderResp", responseVo);
                return "pay";
            } else {
                String msg = "下单失败";
                switch (responseVo.getCode()) {
                    case 1:
                        msg += "订单信息过期，请刷新重新提交";
                        break;
                    case 2:
                        msg += "订单商品价格发生变化，请确认后再次提交";
                        break;
                    case 3:
                        msg += "商品库存不足";
                }
                redirectAttributes.addFlashAttribute("msg", msg);
                return "redirect:http://order.pacmall.com/toTrade";
           // }
        //}catch (Exception e){
            //if(e instanceof NoStockException){
                //String msg = ((NoStockException) e).getMessage();
                //redirectAttributes.addFlashAttribute("msg",msg);
            }
            //return "redirect:http://order.pacmall.com/toTrade";
        //}
    }
}
