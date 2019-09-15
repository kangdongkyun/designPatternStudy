package 빌더패턴1;

public abstract class Blueprint {
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();
    abstract Computer getComputer();
}
