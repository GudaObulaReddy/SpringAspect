package springAspect.springAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track 
{
@Pointcut("execution(* Operation.m*(..))")
public void k()//pointcut name
{	}
@Before("k()")//applyiny pointcut on before advice
public void  myadvice(JoinPoint jp)//it is advice
{
	System.out.println("additional concern");
}

}
