
import java.util.Scanner;
import java.util.HashSet;


public class StudentManager {
    private int ID;
    private String name;
    private String birDate;
    private boolean gender;
    Scanner IN = new Scanner(System.in);

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getBirDate() {
        return birDate;
    }

    public boolean getGender() {
        return gender;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    public int Find(String[][] a) {
        System.out.println("ID:");
        int n = -1;
        int id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }
    
    public void Add(StudentManager student) {
        System.out.println("Student Imformation");
        System.out.println("ID:");
        ID = IN.nextInt();
        student.setID(ID);
        System.out.println("Name:");
        IN.nextLine();
        name = IN.nextLine();
        student.setName(name);
        System.out.println("BirDate");
        birDate = IN.nextLine();
        student.setBirDate(birDate);
        System.out.println("Gender(true-Male，false-Female)");
        gender = IN.nextBoolean();
        student.setGender(gender);
    }
   

    public int Sys_out(String[][] a) {
        System.out.println("ID:");
        int id;
        int n = -1;
        id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }
    public int Delete(String[][] a) {
        System.out.println("ID:");
        int id;
        int n = -1;
        id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }
    public int Recivice(String[][] a) {
        System.out.println("ID:");
        int id;
        int n = -1;
        id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }

    public int Choose() {
        System.out.println("Choices：0.ID 1.Name 2.BirDate 3.Gender");
        int n = IN.nextInt();
        return n;
    }

    public void App() {
        System.out.println("请选择操作：");
        System.out.println("*************-----------************");
        System.out.println("*              1插入                          *");
        System.out.println("*              2查找                          *");
        System.out.println("*              3删除                          *");
        System.out.println("*              4修改                          *");
        System.out.println("*              5输出                          *");
        System.out.println("*              6退出                          *");
        System.out.println("*************-----------*************");
    }

    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        boolean flag = true;
        HashSet a = new HashSet();
        StudentManager std = new StudentManager();
        String[][] student = new String[4][10];
        int num = 0;
        int number;
        int m, n;
        while (flag) {
        	std.App();
            number = IN.nextInt();
            switch (number) {
                case 1: {
                	std.Add(std);
                    student[num][0] = std.ID + "";
                    student[num][1] = std.name + "";
                    student[num][2] = std.birDate + "";
                    student[num][3] = std.gender + "";
                    num++;

                    break;
                }
                case 2: {
                    m = std.Find(student);
                    if (m >= 0) {
                        System.out.println("ID：" + student[m][0]);
                        System.out.println("Name：" + student[m][1]);
                        System.out.println("BirDate：" + student[m][2]);
                        System.out.println("Gender：" + student[m][3]);
                    } else {
                        System.out.println("Error,No such student");
                        break;
                    }
                    break;
                }
                case 3: {
                    m = std.Delete(student);
                    for (int i = 0; i < 4; i++) {
                        student[m][i] = null;
                    }
                    System.out.println("Sucessfully Deleted");
                    break;
                }
                case 4: {
                    m = std.Recivice(student);
                    n = std.Choose();
                    System.out.println("What u will update：");
                    student[m][n] = IN.next();
                    System.out.println("Successfully Updating");
                    break;
                }

                case 5: {
                    m = std.Sys_out(student);
                    System.out.println("ID" + student[m][0] + "Information：");
                    System.out.println("ID：" + student[m][0]);
                    System.out.println("Name：" + student[m][1]);
                    System.out.println("Birdate：" + student[m][2]);
                    System.out.println("Gender：" + student[m][3]);
                    break;
                }
                case 6: {
                    System.out.println("Loggin out！");
                    flag = false;
                    break;
                }
            }
        }
    }
}