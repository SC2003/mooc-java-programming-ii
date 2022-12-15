
public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        this("Cat");
    }

    public Cat(String name) {
        super(name);
    }
    
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }
    
    @Override
    public void makeNoise() {
        this.purr();
    }
}
