public class SingletonDesignPatternWithLazyInitialization {
    private static SingletonDesignPatternWithLazyInitialization INSTANCE;

    private SingletonDesignPatternWithLazyInitialization(){}

    public SingletonDesignPatternWithLazyInitialization getInstance(){
        if(null == INSTANCE){
            INSTANCE = new SingletonDesignPatternWithLazyInitialization();

        }
        return INSTANCE;
    }
}
