package tread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");

        helloThread.start();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
//start()는 새로운 스레드(context)를 생성하고 run() 메서드 실행. 멀티스래딩 환경에서 동작
//run()은 현재 실행중인 스레드의 호출 스택에서 실행. 새로운 스레드 생성X