import groovy.util.logging.Log4j
import org.springframework.beans.factory.config.BeanPostProcessor

@Log4j
class CustomBeanPostprocessor implements BeanPostProcessor{

    @Override
    Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean
    }

    @Override
    Object postProcessAfterInitialization(Object bean, String beanName) {
        log.error("Setting custom value inside post processor 2")
        log.error(beanName + " " + bean.getClass().getSimpleName())
//        if(beanName == 'flowExecutor') {
//            log.error("Setting custom value inside post processor")
        try
        {
            bean.maxFlowExecutionSnapshots = 0
            log.error("SETEADO!!!")
        }
        catch (Exception e)
        {

        }
//        }
        return bean
    }
}
