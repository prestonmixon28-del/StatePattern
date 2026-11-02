public class SenyinslGuard {

    private GuardStatus status = GuardStatus.IDLE;

    public void hearNoise() {
        if (status == GuardStatus.IDLE) {
            System.out.println("Guard is now alert!");
            status = GuardStatus.ALERT;
        } else if (status == GuardStatus.PATROLLING) {
            System.out.println("Guard is already patrolling, but now alert!");
            status = GuardStatus.ALERT;
        } else {
            System.out.println("Guard is already alert!");
        }
    }

    public void seeEnemy() {
        status = GuardStatus.ALERT;
        System.out.println("Guard sees an enemy and is now alert!");
    }

    public void loseTarget() {
        if (status == GuardStatus.ALERT) {
            System.out.println("Guard lost the target and is now patrolling.");
            status = GuardStatus.PATROLLING;
        } else {
            System.out.println("Guard is not alert, cannot lose target.");
        }
    }

    public GuardStatus getStatus() {
        return status;
    }
    
}
