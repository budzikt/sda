package patterns.singleton;


public class Singleton {

    private static Singleton instance;

    private Integer singletonField1;
    private String singletonField2;

    public void setSingletonField1(Integer singletonField1) {
        this.singletonField1 = singletonField1;
    }

    public void setSingletonField2(String singletonField2) {
        this.singletonField2 = singletonField2;
    }

    public Integer getSingletonField1() {
        return singletonField1;
    }

    public String getSingletonField2() {
        return singletonField2;
    }

    private Singleton() {
    this.singletonField1 = 0;
    this.singletonField2 = "Im initialized";
    }

    public static Singleton getInstance() {
        if(instance != null){
            return instance;
        } else {
            instance = new Singleton();
            return instance;
        }
    }

}
