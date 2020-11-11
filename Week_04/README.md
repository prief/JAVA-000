# 学习笔记

## 锁最佳实践
- 更新对象成员变量加锁
- 访问可变成员变量加锁
- 调用其他对象的方法不加锁

## 加锁vsCAS
- 并发很低时没区别 
- 并发稍高时无锁好，效率高 
- 并发非常高加锁好，一直自旋还不如排队加锁
## 线程池的创建
- com.wangzhi.thread.pool.create.CreateTheadPool
- 演示了线程池的创建，包括了使用工具类创建和手动创建两种方式， 以及固定大小线程池中线程数的大小如何设置比较合适
## Java 并发工具
- Java 等待通知机制--synchronized、wait、notify
- Lock 和 Condition
- 信号量
