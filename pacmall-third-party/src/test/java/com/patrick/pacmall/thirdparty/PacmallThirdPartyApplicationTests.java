package com.patrick.pacmall.thirdparty;

import com.aliyun.oss.OSS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PacmallThirdPartyApplicationTests {
    @Autowired
    OSS ossClient;

    @Test
    public void testUpload() throws IOException {
        InputStream fileInputStream = new FileInputStream("E:\\Wallpapers\\Stack\\01.jpg");
        ossClient.putObject("pacmall", "01.jpg", fileInputStream);
        ossClient.shutdown();
        System.out.println("上传完成...");
    }

}
