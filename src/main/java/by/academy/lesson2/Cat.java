package by.academy.lesson2;

public class Cat {
    private String nickname;
    private int age;
    private double money;

    public Cat() {
        super();
    }

    public Cat(String nickname) {
        super();
        this.nickname = nickname;
    }

    public Cat(String nickname, int age) {
        super();
        this.nickname = nickname;
        this.age = age;
    }
    public Cat(String nickname, int age, double money) {
        super();
        this.nickname = nickname;
        this.age = age;
        this.money = money;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;

    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setMoney(double money) {
        this.money = money;

    }

    public double getMoney() {
        return money;
    }
   public void sleep(){
        System.out.println("Кот спит");
   }
    public void walk(){
        System.out.println("Кот гуляет");
    }
    public void eat(){
        System.out.println("Кот ест");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("nickname='").append(nickname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }
}
