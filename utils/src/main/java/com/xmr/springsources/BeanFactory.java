package com.xmr.springsources;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.core.ResolvableType;
import org.springframework.lang.Nullable;

public interface BeanFactory {
    String FACTORY_BEAN_PREFIX = "&";

    Object getBean(String var1) throws BeansException;

    <T> T getBean(String var1, Class<T> var2) throws BeansException;

    Object getBean(String var1, Object... var2) throws BeansException;

    <T> T getBean(Class<T> var1) throws BeansException;

    <T> T getBean(Class<T> var1, Object... var2) throws BeansException;

    <T> ObjectProvider<T> getBeanProvider(Class<T> var1);

    <T> ObjectProvider<T> getBeanProvider(ResolvableType var1);

    boolean containsBean(String var1);

    boolean isSingleton(String var1) throws NoSuchBeanDefinitionException;

    boolean isPrototype(String var1) throws NoSuchBeanDefinitionException;

    boolean isTypeMatch(String var1, ResolvableType var2) throws NoSuchBeanDefinitionException;

    boolean isTypeMatch(String var1, Class<?> var2) throws NoSuchBeanDefinitionException;

    @Nullable
    Class<?> getType(String var1) throws NoSuchBeanDefinitionException;

    @Nullable
    Class<?> getType(String var1, boolean var2) throws NoSuchBeanDefinitionException;

    String[] getAliases(String var1);
}

/*
* Bean工厂实现应该尽可能地支持标准的Bean生命周期接口。完整的初始化方法集及其标准顺序是

BeanNameAware's setBeanName
BeanClassLoaderAware's setBeanClassLoader
BeanFactoryAware's setBeanFactory
EnvironmentAware's setEnvironment
EmbeddedValueResolverAware's setEmbeddedValueResolver
(only applicable when running in an application context，仅用在运行于应用上下文时)， ResourceLoaderAware's  setResourceLoader
(only applicable when running in an application context，仅用在运行于应用上下文时)  ApplicationEventPublisherAware's setApplicationEventPublisher
(only applicable when running in an application context，仅用在运行于应用上下文时) MessageSourceAware's  setMessageSource
(only applicable when running in an application context,仅用在运行于应用上下文时) ApplicationContextAware's  setApplicationContext
ServletContextAware's (only applicable when running in a web application context,仅用在运行于Web应用上下文时) setServletContext
postProcessBeforeInitialization methods of BeanPostProcessors
InitializingBean's afterPropertiesSet
a custom definition init-method
postProcessAfterInitialization methods of BeanPostProcessors
* */