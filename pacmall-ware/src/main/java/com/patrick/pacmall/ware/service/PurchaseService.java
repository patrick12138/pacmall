package com.patrick.pacmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.patrick.common.utils.PageUtils;
import com.patrick.pacmall.ware.entity.PurchaseEntity;
import com.patrick.pacmall.ware.vo.MergeVo;
import com.patrick.pacmall.ware.vo.PurchaseDoneVo;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:24:34
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);

    void mergePurchase(MergeVo mergeVo);

    void received(List<Long> ids);

    void done(PurchaseDoneVo doneVo);
}

