package me.kwanghoon;

/* Example Class */
public class Cat {
    /* 필드(상태) 영역 */
    String name;
    String breeds;
    double weight;

    /* 생성자 - 객체 생성 및 초기화 */
    public Cat(String name, String breeds, double weight) {
        this.name = name;
        this.breeds = breeds;
        this.weight = weight;
    }

    /* 메소드(동작) 영역*/
    void claw() {
        System.out.println(" 할퀴기 !!");
    }

    void meow() {
        System.out.println(" 야옹 !!");
    }


    public void vvv() {
        char[] aa = new char[] {'a', 'v', 'd'};
    }
}