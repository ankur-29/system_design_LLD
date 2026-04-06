package solid_principles.isp.good_example.worker;

public class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot working");
    }
}