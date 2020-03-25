package springbt.domain;

import java.io.File;

public class Employ {
    int id;
    String name;
    String department;
    String sex;
    String intodate;
    String intro;
    String creatdate;

    String img;

    @Override
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", sex='" + sex + '\'' +
                ", intodate='" + intodate + '\'' +
                ", intro='" + intro + '\'' +
                ", creatdate='" + creatdate + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSex() {
        return sex;
    }

    public String getIntodate() {
        return intodate;
    }

    public String getIntro() {
        return intro;
    }

    public String getCreatdate() {
        return creatdate;
    }

    public String getImg() {
        return img;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setIntodate(String intodate) {
        this.intodate = intodate;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setCreatdate(String creatdate) {
        this.creatdate = creatdate;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
