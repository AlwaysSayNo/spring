package ua.nazar.spring;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    private void doMyInit(){
        System.out.println(this.getClass().getName() + ": init method");
    }

    private void doMyDestroy(){
        System.out.println(this.getClass().getName() + ": destroy method");
    }
}
