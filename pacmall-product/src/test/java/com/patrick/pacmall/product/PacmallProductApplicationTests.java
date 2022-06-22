package com.patrick.pacmall.product;

import com.aliyun.oss.OSS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.patrick.pacmall.product.dao.AttrAttrgroupRelationDao;
import com.patrick.pacmall.product.entity.AttrAttrgroupRelationEntity;
import com.patrick.pacmall.product.entity.BrandEntity;
import com.patrick.pacmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PacmallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Autowired
    OSS ossClient;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedissonClient redisson;
    @Test
    public void testUpload() throws IOException {
//        String endpoint = "oss-cn-guangzhou.aliyuncs.com";
//        String accessKeyId = "LTAI5tHduJ3gp7DamKH4Hyyr";
//        String accessKeySecret = "wk6eSDLoOR7WigwhGoJPuhP5Jtq4HA";
//
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        InputStream fileInputStream = new FileInputStream("E:\\Wallpapers\\Stack\\patrick.jpg");
        ossClient.putObject("pacmall", "patrick.jpg", fileInputStream);
        ossClient.shutdown();
        System.out.println("上传完成...");
    }

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华子");
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(item -> {
            System.out.println(item);
        });

//        brandService.updateById(brandEntity);
//
//		List<BrandEntity> list = brandService.list();
//		for (BrandEntity brandEntity : list) {
//			System.out.println(brandEntity);
//		}
    }

    @Test
    public void testStringRedis() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("hello","world"+ UUID.randomUUID().toString());
        String s = ops.get("hello");
        System.out.println("保存的数据是"+s);
    }

    @Test
    public void testRedisson(){
        System.out.println(redisson);
    }
}
