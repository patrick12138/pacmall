# pacmall

#### 介绍
派克商城项目是一个较大型的分布式电商项目，主要后端采用 Spirngboot 2.1.8.RELEASE，前端使用Vue2和Element-UI框架

派克商城后端分为商城后台管理系统和商城本体，后台系统可以实现品牌 管理，商品属性管理，商品发布与上架，商品库存管理等功能，商城本体可以实现商品信息查询，购物车等功能。

前后端简单crud代码均由人人开源的自动生成器生成，学习只用关心较难的业务逻辑。是一个较为不错的进阶Springboot的电商项目。


#### 技术栈

后端技术：Springboot，SpringCloud Alibaba，Mybatis-Plus，MySQL，Redis，RabbitMQ

前端技术：HTML，CSS，jQuery，VUE， Element-UI ，thymeleaf

云服务：阿里云oss，nacos ，openfeign ，seata，gateway ，sentinel等

#### 软件架构
gulimall-common  共需的共有包，其中包括共同的依赖，to, 常量，统一异常处理， 一些工具类等

gulimall-coupon  优惠券服务，管理优惠卷和满减信息

gulimall-gateway 网关服务 , 进行服务转发和负载均衡 端口为88

gulimall-member 用户管理服务

gulimall-order 订单服务

gulimall-product 商品服务

gulimall-thrid-party 第三方服务（oss）

gulimall-ware 仓库服务

renren-fast 人人开源的默认后台系统

renren-generator 代码生成器

### 安装教程

1. 安装node-js v10.2.4 以上，安装地址 [http://nodejs.cn/](http://nodejs.cn/)

2. 安装git 版本控制 [https://gitforwindows.org/](https://gitforwindows.org/)

3. 安装mysql5.7 [https://www.mysql.com/](https://www.mysql.com/)

4. git终端 下载项目

   ```shell
   git clone https://gitee.com/patrick12138/pacmall
   ```

6. 建数据库
      

##### 数据库和微服务对应关系

> gulimall-admin ------ renren-fast
>
> gulimall-oms ----- gulimall-order
>
> gulimall-pms ----- gulimall-product
>
> gulimall-sms ----- gulimall-coupon
>
> gulimall-ums ----- gulimall-member
>
> gulimall-wms ----- gulimall-ware

4. 导入sql文件（）

5. 修改各微服务的 application.yml 文件对应自己的数据库地址和数据库名称，用户，密码

6. 安装nacos，并在application.yml 中配置nacos的注册地址，启动nacos

7. 若要使用 gulimall-thrid-party 第三方服务里面的oss 需要自己去阿里云获取自己的 endpoint accessId  secret-key bucket 等，

   然后修改application.yml 将其修改为自己的。

8. 启动上述各个微服务。


11. 进入安装目录，在终端使用命令

     ```shell
    npm run dev
     ```

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


