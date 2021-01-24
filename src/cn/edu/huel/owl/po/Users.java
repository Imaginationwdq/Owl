package cn.edu.huel.owl.po;

/**
 * @Auther: wdq
 * @Date: 2021/1/16 13:26
 * @Description:
 */
public class Users {

    private Integer user_id;
    private String username;
    private String password;
    private String status;
    private String classes;
    private String name;
    private Integer age;

    public Users(Integer user_id, String username, String password, String status, String classes, String name, Integer age) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.classes = classes;
        this.name = name;
        this.age = age;
    }

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
