# pacmall

[English](./README.md) | [简体中文](./README.zh-CN.md)

`pacmall` 是一个较大型的分布式电商项目，主要后端采用 Spring Boot 2.1.8.RELEASE，前端使用 Vue 2 和 Element-UI 框架。

## 项目简介

本仓库包含后端微服务、网关、公共模块、SQL 脚本和后台前端项目。

## 技术栈

- 后端：Spring Boot、Spring Cloud Alibaba、MyBatis-Plus
- 数据与消息：MySQL、Redis、RabbitMQ、Elasticsearch
- 前端：Vue 2、Element UI
- 基础设施：Nacos、OpenFeign、Sentinel、Seata、Gateway

## 服务模块

- `pacmall-gateway`：网关服务
- `pacmall-product`：商品服务
- `pacmall-member`：会员服务
- `pacmall-order`：订单服务
- `pacmall-cart`：购物车服务
- `pacmall-ware`：仓储服务
- `pacmall-coupon`：优惠券服务
- `pacmall-search`：搜索服务（Elasticsearch）
- `pacmall-seckill`：秒杀服务
- `pacmall-third-party`：第三方服务（OSS/短信等）
- `pacmall-auth-server`：认证服务
- `pacmall-common`：公共组件
- `renren-fast`：后台管理后端
- `renren-fast-vue`：后台管理前端
- `renren-generator`：代码生成器

## 快速开始

1. 克隆仓库：

   ```bash
   git clone git@github.com:Patrick12138/pacmall.git
   ```

2. 准备基础环境：
   - MySQL 5.7+
   - Redis
   - RabbitMQ
   - Nacos
   - Elasticsearch（搜索服务可选）

3. 导入 `sql/` 目录下脚本。

4. 配置各服务 `application.yml`。

5. 启动后端微服务。

6. 启动后台前端：

   ```bash
   cd renren-fast-vue
   npm install
   npm run dev
   ```

7. 访问后台地址：`http://localhost:8080`

## 参与贡献

1. Fork 本仓库。
2. 新建功能分支。
3. 提交代码。
4. 发起 Pull Request。
