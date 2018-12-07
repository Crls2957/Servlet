package entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID= 1276264407447697721L;
    /**
     * 用户编号
     */private int id;
    /**

     * 用户姓名
     */
    private String name;
    /**
     * 用户密码
     */
    private String passwd;
    /**
     * 用户联系方式
     */
    private String tel;
    /**
     * 用户籍贯
     */
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
    }

    public User(int id, String name, String passwd, String tel, String address) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.tel = tel;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
