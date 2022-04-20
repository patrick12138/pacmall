package com.patrick.pacmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.patrick.pacmall.product.entity.BrandEntity;
import com.patrick.pacmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PacmallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华子");
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(item->{
            System.out.println(item);
        });

//        brandService.updateById(brandEntity);
//
//		List<BrandEntity> list = brandService.list();
//		for (BrandEntity brandEntity : list) {
//			System.out.println(brandEntity);
//		}
    }

}
