## 麻将社区跟做

## 资料
[spring文档](https://spring.io/guides)  
[spring wen文档](https://spring.io/guides/gs/serving-web-content/)  
[spring data](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)


## 工具
git  
[visual Paradigm](https://www.visual-paradigm.com)  
[mybatis](http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)  

## 脚本  
```sql
create table USER
(
    ID           INT auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);
```