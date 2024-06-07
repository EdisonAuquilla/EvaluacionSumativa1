public class Robot {

    public static void main(String[] args) {
        System.out.println(whereIsTheRobot(new int[]{10, 5, -2}));
        System.out.println(whereIsTheRobot(new int[]{0, 0, 0}));
        System.out.println(whereIsTheRobot(new int[]{}));
        System.out.println(whereIsTheRobot(new int[]{-10, -5, 2}));
        System.out.println(whereIsTheRobot(new int[]{-10, -5, 2, 4, -8}));
    }

    private enum Direction {
        POSITIVEY, NEGATIVEX, NEGATIVEY, POSITIVEX;

        public Direction turn() {
            switch (this) {
                case POSITIVEY: return NEGATIVEX;
                case NEGATIVEX: return NEGATIVEY;
                case NEGATIVEY: return POSITIVEX;
                case POSITIVEX: return POSITIVEY;
                default: throw new IllegalStateException("Unknown direction");
            }
        }
    }

    private static String whereIsTheRobot(int[] steps) {
        int x = 0;
        int y = 0;
        Direction direction = Direction.POSITIVEY;

        for (int step : steps) {
            switch (direction) {
                case POSITIVEY: y += step; break;
                case NEGATIVEX: x -= step; break;
                case NEGATIVEY: y -= step; break;
                case POSITIVEX: x += step; break;
            }
            direction = direction.turn();
        }

        return "x: " + x + ", y: " + y + ", direction: " + direction;
    }
}
