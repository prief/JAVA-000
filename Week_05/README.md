- Spring Framework
  - Core
  - Testing
  - Data access
  - Spring mvc/WebFlux
  - Integration
  - Languages
- Spring Aop
1. 面向切面编程（字节码增强，中间层代理）
  - 有接口实现：默认使用JDK动态代理 $Proxy
  - proxyTargetClass = true cglibProxy
  - 无接口实现：cglib
2. Aop相关概念
  - 切面（Aspect）：关注点的模块化（包含了其他概念的这样一个集合），可能会切多个对象，通过xml或者@AspectJ实现
  - 连接点（Join Point）：程序执行的某个特定的点，比如方法调用或者异常处理
  - 通知（advice）：在切面的某个特定连接点上的操作，包括（around，before，after）等
  - 切入点（Pointcut）：匹配切入点的方法被拦截
  - 引入（Introduction）：声明额外的方法或者字段，在运行期添加
  - 目标对象（target Object）：被一个或者多个切面通知的对象，aop会生成一个该代理对象的子类
  - aop代理（aop proxy）：aop框架创建的代理对象，在spring aop中可以是jdkproxy也可以是cglib代理
  - 织入（weaving）：创建代理对象的过程
3. 通知（advice）的类型
  - 前置通知（Before Advice）：在连接点执行前执行
  - 返回后通知（After returing Advice）：在连接点执行成功返回后执行
  - 异常通知（After throwing Advice）：方法抛出异常后
  - 后置通知（After Advice）：某个连接点退出，不管是正常还是异常退出
  - 环绕通知（Around Advice）：包围一个连接点，可以在执行目标方法前后执行额外操作的通知
4. xml方式的aop配置
5. 字节码增强和反射
 - 反射不改变字节码问价，字节码增强会改变，类似于基因操作


- Springboot
1. 核心原理
  - 自动化配置：基于Configuration,Enablexx,Condition
  - spring-boot-starter：脚手架核心，整合了很多三方的组件
2. 自动配置原理
  - 核心注解 @EnableAutoConfiguration