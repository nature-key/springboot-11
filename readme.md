springboot事件监听

流程
1.自定义事件继承ApplicationEvent
2.实现监听 ApplicationListener
3.添加事件监听事件到spring容器
4.发布事件

方法
 1.app.addListeners(new MyApplicationListen());
 2.把类放到容器中@Component
 3.使用EventListener
 4.通过配置ontext.Listener.classes