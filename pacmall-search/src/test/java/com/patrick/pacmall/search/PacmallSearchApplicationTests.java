package com.patrick.pacmall.search;

import com.alibaba.fastjson.JSON;
import com.patrick.pacmall.search.config.PacmallElasticConfig;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PacmallSearchApplicationTests {
    @Autowired
    private RestHighLevelClient client;

    @Test
    public void indexData() {
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1");
        User user = new User();
        user.setAge("18");
        user.setGender("female");
        user.setUserName("lisi");
        String s = JSON.toJSONString(user);
        indexRequest.source(s, XContentType.JSON);
//        indexRequest.source("userName","lisi","age","18","gender","female");
        try {
            IndexResponse index = client.index(indexRequest, PacmallElasticConfig.COMMON_OPTIONS);
            System.out.println(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Data

    class User{
       private String userName;
       private String age;
       private String gender;
    }

    @Test
    public void contextLoads() {
        System.out.println(client);
    }

}
