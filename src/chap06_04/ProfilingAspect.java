package chap06_04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProfilingAspect {
	@Pointcut
	("execution(public * chap06.board..*(..))") 
	private void profileTarget() {
		
	}
	@Around("profileTarget()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " ����");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " ����");
			System.out.println(signatureString + " ����ð�: " + (finish - start) + "ms");
		}
		
	}
}
