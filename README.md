# CC API开放平台
`作者 CaoCao 😄`
## 项目介绍 📢
项目简介 : 基于SpringBoot +Dubbo+ SpringCloud 的接口开放调用平台,管理员可以接入并发布接口、可视化各接口调用情况；用户可以开通接口调用权限并通过客户端 SDK 轻松轻松调用接口
## 项目架构图 🔥
### 基础架构
![image](https://github.com/gitgg021/CC-API/blob/master/images/架构图.png)
## 项目功能 🎊
### 已有功能
1. 用户登录
2. 用户页: 查看接口、接口详情页、在线测试接口、查看在线测试结果
3. 管理页: 接口增删、上线、下载管理、接口调用次数可视化
### TODO 新增功能规划
1. 新增随机图片、随机文字等接口
2. 优化页面
## 主要工作🎊 :
1. 根据业务流程将项目后端分为五个模块, Web系统、模拟接口、公共模块、客户端 SDK、API 网关、使用 Maven 进行多模块依赖管理和打包。

2. 基于 MyBatis Plus 框架的 QueryWrapper 实现对 MySQL 数据库的灵活查询，并配合 MyBatis X 插件自动生成后端 CRUD 基础代码，减少重复工作。

3. 为防止接口被恶意调用，设计 API 签名认证算法，为用户分配唯一 ak / sk 以鉴权，保障调用的安全性、可溯源性。

4. 为解决开发者调用成本过高的问题（须自己使用 HTTP + 封装签名去调用接口，平均 20 行左右代码），基于 Spring Boot Starter 开发了客户端 SDK，只需一行代码即可调用接口，提高开发体验。

5. 选用 Spring Cloud Gateway 作为 API 网关，实现了路由转发、访问控制、流量染色，并集中处理签名校验、请求参数校验、接口调用统计等业务逻辑，提高安全性的同时、便于系统开发维护。

6. 为解决多个子系统内代码大量重复的问题，抽象模型层和业务层代码为公共模块，并使用 Dubbo RPC 框架实现子系统间的高性能接口调用，大幅减少重复代码。


## 项目技术栈🎊
### 后端
Java Spring Boot 框架  
MySQL数据库  
MyBatis-Plus及MyBatisX自动生成  
API签名认证（Http调用）  
Spring Boot Starter（SDK开发)  
Dubbo分布式（RPC、Nacos)  
Spring Cloud Gateway 微服务网关  
Swagger +Knife4j 接口文档生成   
Hutool、Apache Common Utils、Gson 等工具库   

### 前端
React 18  
Ant Design Pro 脚手架  
Ant Design &Procomponents 组件库  
Umi 4 前端框架  
OpenAPI 前端代码生成
数据可视化
## 项目展示🎊
### 用户查看接口页
![image](https://github.com/gitgg021/CC-API/blob/master/images/用户查看接口页.png)
### 用户接口详情页
![image](https://github.com/gitgg021/AI-Chart/blob/master/images/用户接口详情页.png)
### 管理页-接口管理
![image](https://github.com/gitgg021/AI-Chart/blob/master/images/管理页-接口管理.png)
### 管理页接口分析页
![image](https://github.com/gitgg021/AI-Chart/blob/master/images/管理页接口分析页.png)
