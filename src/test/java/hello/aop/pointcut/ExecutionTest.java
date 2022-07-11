package hello.aop.pointcut;

import hello.aop.order.aop.member.MemberServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

import java.lang.reflect.Method;

@Slf4j
public class ExecutionTest {

    AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    Method helloMethod;
    @BeforeEach
    public void init() throws NoSuchMethodException {
        helloMethod = MemberServiceImpl.class.getMethod("hello", String.class); //리플렉션으로 뽑는다. 파라미터가 String이라는 뜻
    }

    @Test
    void printMethod() {
        //public java.lang.String hello.aop.member.MemberServiceImpl.hello(java.lang.String) 이게 출력 값
        log.info("helloMethod={}", helloMethod);
    }
}