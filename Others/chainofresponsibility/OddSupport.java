package Others.chainofresponsibility;

public class OddSupport extends Support {

    public OddSupport(String name){
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(1 == trouble.getNumber()%2)
            return true;
        return false;
    }
}
