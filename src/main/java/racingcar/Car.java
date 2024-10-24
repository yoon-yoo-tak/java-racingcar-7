package racingcar;

public class Car {
    private final String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }

    public void move(){
        this.position++;
    }

    @Override
    public String toString(){
        return this.name + " : " + "-".repeat(this.position);
    }
}