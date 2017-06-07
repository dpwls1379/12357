package sample01;

public class Ex01 {
	public static void main(String[] args) {
		MessageBeanEn mb = new MessageBeanEn();
		mb.sayHello("Spring");

		MessageBeanKr mbk = new MessageBeanKr();
		mbk.SayHello("스프링");
	}
}
// MessageBean, MessageBeanKr두개의 클래스의 객체를 만들고 두 클래스들의 메소드를 실행시킨다 
// 무엇을 실행할지의 이때 Ex01은 자바파일은 두 자바파일에만 의존하게 된다
// 출력값을 변경시키려면 메소드가 있는 클래스 파일의 수정과, 메소드를 호출한 클래스파일의 수정이 필요하다