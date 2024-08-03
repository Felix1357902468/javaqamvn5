public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }

    public int calcBonus(int amount, boolean isRegistered) {
        int percent = isRegistered ? 3 : 1;
        int bonus = amount * percent / 100;
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}