package test.ch12.Annotation;

import java.lang.annotation.*;

//어노테이션 정의


//@Target: 어노테이션을 사용할 수 있는 곳을 지정
//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})

//@Retention: 유지정책, 어노테이션을 언제시작해서 언제까지 유지를 할건지 지정.
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
