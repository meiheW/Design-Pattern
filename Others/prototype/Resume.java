package Others.prototype;

/**
 * Cloneable抽象原型类，声明克隆自生的接口
 * Resume具体原型类，实现克隆的具体操作
 *
 * @author meihewang
 * @date 2018/11/9
 */
public class Resume implements Cloneable {

    String name;
    String birthday;
    String sex;
    String school;

    ProInfo proInfo;

    public Resume(String name){
        this.name = name;
    }

    public void setPersonInfo(String birthday, String sex, String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSex() {
        return sex;
    }

    public String getSchool() {
        return school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public ProInfo getProInfo() {
        return proInfo;
    }

    public void setProInfo(ProInfo proInfo) {
        this.proInfo = proInfo;
    }

    public Object clone(){
        Object obj = null;

        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        Resume resume = (Resume)obj;
        resume.proInfo = (ProInfo)resume.getProInfo().clone();

        return obj;

    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                ", proInfo=" + proInfo +
                '}';
    }
}
