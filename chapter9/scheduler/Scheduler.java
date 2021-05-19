package chapter9.scheduler;

public interface Scheduler {

    public void getNextCall();

    public void sendCallToAgent();
}

// 고객센터에는 전화상담을 하는 상담원들이 있다. 고객 센터로 전화가 오면 대기열에 저장된다.
// 상담원이 지정되기 전까지 대기 상태가 된다. 각 전화가 상담원에게 배분되는 정책은 다음과 같이 여러 방식으로 구현될 수 있다.
// - 상담원 순서대로 배분하기.
// - 대기가 짧은 상담원 먼저 배분하기.
// - 우선순위가 높은(숙련도가 높은) 상담원에게 먼저 배분하기.
// 위와 같은 다양한 정책이 사용되는 경우 interface를 정의 하고 다양한 정책을 구현하여 실행하세요.