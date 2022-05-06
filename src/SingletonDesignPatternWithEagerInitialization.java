public class SingletonDesignPatternWithEagerInitialization {

    private static final SingletonDesignPatternWithEagerInitialization INSTANCE = new SingletonDesignPatternWithEagerInitialization();


    private SingletonDesignPatternWithEagerInitialization(){}

    public static SingletonDesignPatternWithEagerInitialization getInstance(){
        return INSTANCE;
    }
}

    /*The above written code is very poor in terms of performance
        because program returns singleton instance eagerly
        i.e.; it instantiates and keeps instance ready to be available*/
