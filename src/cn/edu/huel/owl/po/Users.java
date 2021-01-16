package cn.edu.huel.owl.po;

/**
 * @Auther: wdq
 * @Date: 2021/1/16 13:26
 * @Description:
 */
public class Users {

    private Integer userId;
    private String username;
    private String password;
    private String status;
    private String classes;
    private String name;
    private Integer age;

    public Users(Integer userId, String username, String password, String status, String classes, String name, Integer age) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.status = status;
        this.classes = classes;
        this.name = name;
        this.age = age;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
