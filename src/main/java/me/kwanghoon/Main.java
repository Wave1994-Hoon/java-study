package me.kwanghoon;

public class Main {
    public static void main(String[] args) {
        /* Dog 객체 생성 */
        Dog dog = new Dog();

        /* Dog 객체 필드 값 출력 */
        System.out.println("이름: " + dog.name);    // String 의 기본 값 null
        System.out.println("품종: " + dog.breeds);  // String 의 기본 값 null
        System.out.println("나이: " + dog.age);     // int 의 기본 값 0


    }
}
