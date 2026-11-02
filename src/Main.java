public class Main {
    static void main() {

        SenyinslGuard guard = new SenyinslGuard();
        System.out.println("Initial Guard Status: " + guard.getStatus());

        guard.hearNoise();

        guard.seeEnemy();

        guard.loseTarget();

        guard.hearNoise();

        System.out.println("Final Guard Status: " + guard.getStatus());
        
    }
}
