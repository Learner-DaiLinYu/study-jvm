package com.DLY.Dome;

import java.lang.annotation.*;

/**
 * 自定义一个注解
 */
/**
 * @Target：用于描述注解的使用范围
 * 类或接口：ElementType.TYPE；
 * 字段：ElementType.FIELD；
 * 方法：ElementType.METHOD；
 * 构造方法：ElementType.CONSTRUCTOR；
 * 方法参数：ElementType.PARAMETER。
 */
@Target(value={ElementType.FIELD,ElementType.METHOD})
/**
 * @Retention：表示需要在什么级别保存该注释信息，用于描述注解的生命周期
 * 仅编译期：RetentionPolicy.SOURCE；
 * 仅class文件：RetentionPolicy.CLASS；
 * 运行期：RetentionPolicy.RUNTIME。
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DlyAnnotation {
    String value() default "default";
}
