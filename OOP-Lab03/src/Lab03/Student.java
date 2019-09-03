package Lab03;

public class Student {
    public String name;
    public double MidtermScore;
    public double FinalScore;

    public void showGrade(){
        if ((MidtermScore < 0 || MidtermScore > 100) || (FinalScore < 0 || FinalScore > 100)){
            System.out.println("Error");
        }
        else {
            double score = (MidtermScore*0.4) + (FinalScore*0.4) + 20;
            if (score < 50) {
                System.out.println("F");
            }
            else if (score < 60) {
                System.out.println("D");
            }
            else if (score < 70) {
                System.out.println("C");
            }
            else if (score < 80){
                System.out.println("B");
            }
            else {
                System.out.println("A");
            }
        }
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.MidtermScore = 49;
        stu1.FinalScore = 50;
        stu1.showGrade();
    }
}
