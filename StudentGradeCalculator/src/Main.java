import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of subjects that you had this semester.");
        double Grade=0;
        int TotalSubjects = s.nextInt();
        double GradeArr[] = new double[TotalSubjects];
        for(int i=0; i<TotalSubjects; i++)
        {
            double x;
            System.out.println("Enter grade for subject " + (i+1) + ".");
            x = s.nextInt();
            Grade += x;
            GradeArr[i] = x;
        }
        for(int i=0; i<TotalSubjects; i++)
        {
            if(GradeArr[i]>100 || GradeArr[i]<0)
            {
                System.out.println("Wrong mark was given initially, please reenter the marks you entered previously and try again!");
                break;
            }
            if(GradeArr[i]>=97)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: A+");
            }
            else if(GradeArr[i]>=94)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: A");
            }
            else if(GradeArr[i]>=90)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: A-");
            }
            else if(GradeArr[i]>=87)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: B+");
            }
            else if(GradeArr[i]>=84)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: B");
            }
            else if(GradeArr[i]>=80)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: B-");
            }
            else if(GradeArr[i]>=77)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: C+");
            }
            else if(GradeArr[i]>=74)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: C-");
            }
            else if(GradeArr[i]>=70)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: C-");
            }
            else if(GradeArr[i]>=67)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: D+");
            }
            else if(GradeArr[i]>=64)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: D");
            }
            else if(GradeArr[i]>=60)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: D-");
            }
            else if(GradeArr[i]<=59)
            {
                System.out.println("Subject" + "[" + (i+1) + "]: F");
            }
            while(i==TotalSubjects-1)
            {
                System.out.println("Total score: " + Grade + "/" + TotalSubjects*100);
                System.out.println("Percentage:" + ((Grade/(TotalSubjects*100))*100) + "%");
                break;
            }
        }

    }
}