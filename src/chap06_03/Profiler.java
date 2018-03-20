package chap06_03;
//어라운드로 걸렸을때 처리 방식 기본적
//중간에 joinpoint 걸린 메소드를 실행해라. (write메소드)

import org.aspectj.lang.ProceedingJoinPoint;

public class Profiler {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + "시작");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + "종료");
			System.out.println(signatureString + " 실행 시간: " + (finish - start) + "ms");
		}
	}
}
