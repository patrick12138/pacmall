# pacmall

[English](./README.md) | [Chinese](./README.zh-CN.md)

`pacmall` is a Spring Cloud Alibaba based microservices e-commerce project.

## Overview

This repository contains backend microservices, gateway, shared modules, SQL scripts, and an admin frontend.

## Tech Stack

- Backend: Spring Boot, Spring Cloud Alibaba, MyBatis-Plus
- Data & Messaging: MySQL, Redis, RabbitMQ, Elasticsearch
- Frontend: Vue 2, Element UI
- Infrastructure: Nacos, OpenFeign, Sentinel, Seata, Gateway

## Services

- `pacmall-gateway`: API gateway
- `pacmall-product`: Product service
- `pacmall-member`: Member service
- `pacmall-order`: Order service
- `pacmall-cart`: Cart service
- `pacmall-ware`: Warehouse service
- `pacmall-coupon`: Coupon service
- `pacmall-search`: Search service (Elasticsearch)
- `pacmall-seckill`: Flash sale service
- `pacmall-third-party`: Third-party integrations (OSS/SMS/etc.)
- `pacmall-auth-server`: Authentication service
- `pacmall-common`: Shared components
- `renren-fast`: Admin backend
- `renren-fast-vue`: Admin frontend
- `renren-generator`: Code generator

## Quick Start

1. Clone repository:

   ```bash
   git clone git@github.com:Patrick12138/pacmall.git
   ```

2. Prepare infrastructure:
   - MySQL 5.7+
   - Redis
   - RabbitMQ
   - Nacos
   - Elasticsearch (optional for search service)

3. Import SQL scripts under `sql/`.

4. Configure each service's `application.yml`.

5. Start backend services.

6. Start admin frontend:

   ```bash
   cd renren-fast-vue
   npm install
   npm run dev
   ```

7. Open admin site: `http://localhost:8080`

## Contributing

1. Fork this repository.
2. Create a feature branch.
3. Commit your changes.
4. Open a Pull Request.
