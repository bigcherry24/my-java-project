public class Singleton {
    // 유일한 인스턴스를 저장하기 위한 정적 변수
    private static Singleton instance;

    // 생성자를 private으로 선언하여 외부에서 인스턴스를 생성하지 못하도록 함
    private Singleton() {
        // 초기화 코드
    }

    // 유일한 인스턴스를 반환하는 정적 메서드
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 기타 메서드
    public void showMessage() {
        System.out.println("Hello World!");
    }
}