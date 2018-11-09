package Others.prototype;

public class ProInfo  implements Cloneable{
    String timeArea;
    String profession;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return obj;
    }

    @Override
    public String toString() {
        return "ProInfo{" +
                "timeArea='" + timeArea + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
