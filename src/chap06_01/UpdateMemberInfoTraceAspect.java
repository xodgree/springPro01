package chap06_01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import chap06.member.UpdateInfo;

@Aspect
public class UpdateMemberInfoTraceAspect {

	@AfterReturning(pointcut = "args(memberId,info)", returning="result",argNames="joinPoint,memberId,info,result")
	public void traceReturn(JoinPoint joinPoint,String memberId, UpdateInfo info, boolean result){
		System.out.printf("[TA====] ��������: ���ȸ�� = %s,��������=%s, ���=%s\n",memberId,info,result);
	}
}
