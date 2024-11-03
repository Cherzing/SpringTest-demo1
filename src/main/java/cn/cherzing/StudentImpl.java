package cn.cherzing;

/**
 * @author Cherzing
 * @date 2024/11/03 0003 13:06
 * @description StudentImpl
 */
public class StudentImpl implements IStudent{
    private int id;
    private String name;
    private String grade;

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public StudentImpl() {
    }

    public StudentImpl(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public void test() {
        System.out.println(name + "技术小白Cherzing在线测试....");
    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
