package inheritance;

public abstract class Animal {
    private String color;

    public String getColor(){
        return color;
    }

    public Animal (String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();
}
