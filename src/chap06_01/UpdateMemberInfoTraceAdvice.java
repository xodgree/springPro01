package chap06_01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import chap06.member.UpdateInfo;

@Aspect
public class UpdateMemberInfoTraceAdvice {

	public void traceReturn(String memberId, UpdateInfo info){
		System.out.printf("[TA====] 정보수정: 대상회원 = %s,수정정보=%s\n",memberId,info);
	}
}
