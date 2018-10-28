package pl.sdacademy.designpattterns.duck;

public interface Duck {
    void quack();
    void swim();
    void fly();
    Integer totalEggsLaid();
    Integer age();
    DuckEgg layEgg();
    void walkTODuckCoop(DuckCoop duckCoop);
    void notify(DuckEgg egg);

}
