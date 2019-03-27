使用swagger生成API文档

application.properties设置为false时不生效

结合标签@ConditionalOnExpression("${swagger.enable:true}")
在SwaggerConfig类里面使用
