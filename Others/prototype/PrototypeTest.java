package Others.prototype;

public class PrototypeTest {

    public static void main(String[] args){
        ProInfo proInfo1 = new ProInfo();
        proInfo1.setProfession("Machine Engenering");
        proInfo1.setTimeArea("4");

        Resume resume1 = new Resume("wmh");
        resume1.setPersonInfo("1993.02.01", "male", "jit");
        resume1.setProInfo(proInfo1);

        Resume resume2 = (Resume) resume1.clone();

        System.out.println(resume1.toString());
        System.out.println(resume2.toString());

        resume1.getProInfo().setTimeArea("3");
        resume1.getProInfo().setProfession("IT");
        resume1.setSchool("shu");
        System.out.println(resume1.toString());
        System.out.println(resume2.toString());

    }

}
