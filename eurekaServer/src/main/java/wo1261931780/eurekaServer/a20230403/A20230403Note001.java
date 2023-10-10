package wo1261931780.eurekaServer.a20230403;

/**
 * Created by Intellij IDEA.
 * Project:st-springCloud
 * Package:wo1261931780.eurekaServer.a20230329
 *
 * @author liujiajun_junw
 * @Date 2023-03-15-04  星期三
 * @description
 */
public class A20230403Note001 {
	
	public static void main(String[] args) {
		// Feign就属于是同步通讯
		// Feign是基于Ribbon和Hystrix实现的
		// Feign是一个声明式的伪Http客户端，它使得编写Http客户端变得更加简单
		// Feign的调用，使得后期加业务很麻烦，需要改动业务代码
		// 同时，性能下降，也会导致吞吐量下降
		// 第四个问题，如果中间挂了一个服务，那么就会导致整个服务不可用
		// 这就叫做雪崩效应，级联失败
		// ========================================================
		// 现在的异步开发，是使用broker模式来做
		// 我的原始服务不需要改动，只需要在原始服务中，增加一个消息队列
		// 然后消息队列发布出来，然后其他的服务，就可以订阅这个消息队列
		// 按照消息队列，自己去完成处理就可以
		// 最终实现了服务解耦
		
		// 然后有服务不需要的时候，直接取消订阅就可以暂停了
		// ========================================================
		// 流量削峰，就是在高峰期，把流量分散到其他的时间段
		// 实际的开发就是，按照消息队列的承受能力，能处理多少消息，就处理多少消息
		// 其他的等着，这样不会超过我们的上限
		// 最后起到了保护服务的作用
		// ========================================================
		// 异步的劣势是，如果中间有一个服务挂了，那么就会导致消息丢失
		// 同时对消息队列的依赖性就会增加
		// 我们实际开发使用同步比较多，因为要求时效性
		// ========================================================
		// 常用的消息队列，kafka是使用Scala开发，一门jvm语言，也可以调用java
		// RabbitMQ是使用Erlang开发，一门jvm语言，也可以调用java
		// rabbitMQ支持了AMQP协议，所以可以使用其他语言开发，跨语言能力比较强
		// rocketMQ和kafka都是阿里开发的，协议支持比较少
		// activeMQ是apache开发的，不支持集群
		// RabbitMQ，kafka，rocketMQ，都是支持集群的
		// ========================================================
		// 一般来说，吞吐量也要按照发送数据的大小来计算
		// 有一定的差距
		// kafka就会出现消息丢失的情况
		// ========================================================
		// kafka的消息是有序的，但是不保证消息的唯一性，一般用来做日志收集
		// RabbitMQ和rocketMQ都是保证消息的唯一性，一般用来做业务通讯
		// ========================================================
		// rabbitMQ中，每个用户最好都有自己的虚拟主机，可以理解为一个独立的消息队列
		// publisher和consumer都是我们自己管理的，mq是服务管理
		
	}
}
