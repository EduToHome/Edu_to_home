package com.edh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class BasicConsumerApplicaltion {
    public static void main(String[] args) {
        SpringApplication.run(BasicConsumerApplicaltion.class,args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 1 Ribbon中的7中页载 衡算法:
     *      (1) RoundRobinRule:轮询;
     *      (2) RandomRule:随机;
     *      (3) AvailabilityFilteringRule:会先过滤掉由于多次访问故障而处于断路器状态的服务,还有并发的连接数量超过阈值的服务,
     *          然后对剩余的服务列表按照轮询策略进行访问;
     *      (4) weightedResponseTimeRule:根据平均响应时间计算所有服务的权重,
     *          响应时间越快的服务权重越大被选中的概越大。刚启动时如果统计信息不足,则使用RoundRobinRule (轮询)策略,等统计信息足够,
     *          会切换到WeightedResponseTimeRule;
     *      (5) RetryRule:先按照RoundRobinRule (轮询)策略获取服务,如果获取服务失败则在指定时间内进行重试,获取可用的服务;
     *      (6) BestAvailableRule:会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务,然后选择一个并发量最小的服务;
     *      (7) ZoneAvoidanceRule:复合判断Server所在区域的性能和Server的可用性选择服务器,在没有zone的情况下是类似轮询的算法;
     * @return
     */
//    @Bean
//    public IRule iRule(){
//        //return new RoundRobinRule();
//        //return new RandomRule();
//        //return new BestAvailableRule();
//        return new RetryRule();
//    }
}
