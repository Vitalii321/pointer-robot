public class Main {

    public static void main(String[] args) {


        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCooker.work();

    }
}
