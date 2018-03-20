package chap06_01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import chap06.member.UpdateInfo;

@Aspect
public class UpdateMemberInfoTraceAdvice {

	public void traceReturn(String memberId, UpdateInfo info){
		System.out.printf("[TA====] ��������: ���ȸ�� = %s,��������=%s\n",memberId,info);
	}
}
