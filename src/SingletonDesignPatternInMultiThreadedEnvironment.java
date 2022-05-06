public class SingletonDesignPatternInMultiThreadedEnvironment {
    //in addition to above detailed steps, also make INSTANCE variable as volatile.
    // This will help getting latest updated copy every time, as it will read from main memory than in its own CPU-cache area
    private static volatile SingletonDesignPatternInMultiThreadedEnvironment INSTANCE;

    private SingletonDesignPatternInMultiThreadedEnvironment() {

    }

    public static SingletonDesignPatternInMultiThreadedEnvironment getInstance() {
        synchronized
        (SingletonDesignPatternInMultiThreadedEnvironment.class) {
            if (null == INSTANCE) {
                INSTANCE =
                        new
                                SingletonDesignPatternInMultiThreadedEnvironment();
            }
            return INSTANCE;

        }
    }
}
