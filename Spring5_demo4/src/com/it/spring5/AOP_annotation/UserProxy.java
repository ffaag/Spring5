package com.it.spring5.AOP_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ZuYingFang
 * @time 2021-08-06 20:55
 * 增强的类
 * 总结：首先是环绕的前面，然后是before，接着是本体，然后是环绕后，接着是after
 * 这里无论是否有异常都会有after，有异常没有AfterReturning和Around后，先是after，后是AfterReturning
 */

@Component   // 注解创建对象
@Aspect      // 生成代理对象
@Order(0)    // 当有多个代理类对同一个方法进行增强时，我们可以对其增强设置增强的先后顺序，数字越小越先执行，0开始
public class UserProxy {

    // 这里有很多相同的切入点，于是我们可以进行抽取
    @Pointcut(value = "execution(* com.it.spring5.AOP_annotation.User.add(..))")
    public void pointCut(){

    }
    // before代表的就是前置通知，value的值是execution表达式，指定要增强的方法
    @Before(value="execution(* com.it.spring5.AOP_annotation.User.add(..))")
    public void before(){
        System.out.println("before......");
    }
    // 环绕通知
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around前......");

        // 中间执行原始方法，使用下面这条代码
        proceedingJoinPoint.proceed();

        System.out.println("around后......");
    }
    // 后置通知
    @AfterReturning(value = "pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning......");
    }
    // 异常通知
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
    // 最终通知
    @After(value = "pointCut()")
    public void after(){
        System.out.println("after......");
    }
}
