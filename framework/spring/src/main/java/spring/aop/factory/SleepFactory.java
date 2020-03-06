package spring.aop.factory;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import spring.aop.advisor.Human;
import spring.aop.advisor.Sleepable;
import spring.aop.anno.SleepHelperAnno;

/**
 * @author Ariescat
 * @version 2020/3/6 18:08
 */
public class SleepFactory {

    public static void main(String[] args) {
        AspectJProxyFactory weaver = new AspectJProxyFactory();
        weaver.setProxyTargetClass(true);
        weaver.setTarget(new Human());
        weaver.addAspect(SleepHelperAnno.class);
        Object proxy = weaver.getProxy();
        ((Sleepable) proxy).sleep();
    }
}
