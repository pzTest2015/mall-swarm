启动网关服务jgj-gateway，直接运行GatewayApplication的main函数即可；

启动认证中心jgj-auth，直接运行AuthApplication的main函数即可；

启动后台管理服务jgj-admin，直接运行AdminApplication的main函数即可；

启动前台服务jgj-portal，直接运行PortalApplication的main函数即可；

启动搜索服务jgj-search，直接运行SearchApplication的main函数即可；

启动监控中心jgj-monitor，直接运行MonitorApplication的main函数即可；


运行完成后可以通过监控中心查看监控信息，账号密码为macro:123456：http://localhost:8101

运行完成后可以直接通过如下地址访问API文档：http://localhost:8201/doc.html

``` lua
jgj
├── jgj-common -- 工具类及通用代码模块
├── jgj-base -- MyBatisGenerator生成的数据库操作代码模块
├── jgj-auth -- 基于Spring Security Oauth2的统一的认证中心
├── jgj-gateway -- 基于Spring Cloud Gateway的微服务API网关服务
├── jgj-monitor -- 基于Spring Boot Admin的微服务监控中心
├── jgj-admin -- 后台管理系统服务
├── jgj-search -- 基于Elasticsearch的商品搜索系统服务
├── jgj-portal -- 移动端商城系统服务
├── jgj-demo -- 微服务远程调用测试服务
└── config -- 配置中心存储的配置
```

### 后端技术

| 技术                   | 说明                 | 官网                                                 |
| ---------------------- | -------------------- | ---------------------------------------------------- |
| Spring Cloud           | 微服务框架           | https://spring.io/projects/spring-cloud              |
| Spring Cloud Alibaba   | 微服务框架           | https://github.com/alibaba/spring-cloud-alibaba      |
| Spring Boot            | 容器+MVC框架         | https://spring.io/projects/spring-boot               |
| Spring Security Oauth2 | 认证和授权框架       | https://spring.io/projects/spring-security-oauth     |
| MyBatis                | ORM框架              | http://www.mybatis.org/mybatis-3/zh/index.html       |
| MyBatisGenerator       | 数据层代码生成       | http://www.mybatis.org/generator/index.html          |
| PageHelper             | MyBatis物理分页插件  | http://git.oschina.net/free/Mybatis_PageHelper       |
| Knife4j                | 文档生产工具         | https://github.com/xiaoymin/swagger-bootstrap-ui     |
| Elasticsearch          | 搜索引擎             | https://github.com/elastic/elasticsearch             |
| Redis                  | 分布式缓存           | https://redis.io/                                    |
| Docker                 | 应用容器引擎         | https://www.docker.com/                              |
| Druid                  | 数据库连接池         | https://github.com/alibaba/druid                     |
| OSS                    | 对象存储             | https://github.com/aliyun/aliyun-oss-java-sdk        |
| JWT                    | JWT登录支持          | https://github.com/jwtk/jjwt                         |
| LogStash               | 日志收集             | https://github.com/logstash/logstash-logback-encoder |
| Lombok                 | 简化对象封装工具     | https://github.com/rzwitserloot/lombok               |
| Seata                  | 全局事务管理框架     | https://github.com/seata/seata                       |
| Portainer              | 可视化Docker容器管理 | https://github.com/portainer/portainer               |
| Jenkins                | 自动化部署工具       | https://github.com/jenkinsci/jenkins                 |


## 环境搭建

### 开发环境

| 工具          | 版本号 | 下载                                                         |
| ------------- | ------ | ------------------------------------------------------------ |
| JDK           | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Mysql         | 5.7    | https://www.mysql.com/                                       |
| Redis         | 5.0    | https://redis.io/download                                    |
| Elasticsearch | 7.6.2  | https://www.elastic.co/cn/downloads/elasticsearch            |
| Kibana        | 7.6.2  | https://www.elastic.co/cn/downloads/kibana                   |
| Logstash      | 7.6.2  | https://www.elastic.co/cn/downloads/logstash                 |
| nginx         | 1.10   | http://nginx.org/en/download.html                            |
