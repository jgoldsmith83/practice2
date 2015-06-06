package practice2;
import java.util.Scanner;

/**
 *
 * @author JGoldsmith
 */
public class Practice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String addNew = "";
         
         String[][] name = {
            {"John", "Jane", "Louis"},
            {"Smith", "Doe", "CK"}
         };
         
         double[] grade = {88.8, 92.4, 98.8};
         int gradeSum = 0;
         for (double i : grade) {
             gradeSum += i;
         }
         double gradeAvg = gradeSum/grade.length;
         int COLS = 2;
         int row = 0;
         
         getNewGrades(name, grade, addNew, input);
         
         
        
        System.out.printf("%-12s %-12s %8s\n", "First", "Last", "Grade");
        
        /* 
        System.out.printf("%-12s %-12s %8s\n", name[0][0], name[1][0], grades[0]);
        System.out.printf("%-12s %-12s %8s\n", name[0][1], name[1][1], grades[1]);
        System.out.printf("%-12s %-12s %8s\n", name[0][2], name[1][2], grades[2]);
        */
        
        
        for (int newLine = 0; newLine < 2; newLine++){
            System.out.println();
        }
        
        for (int col = 0; col <= COLS; col++) {
            System.out.printf("%-12s %-12s %8.2f\n", name[row][col], name[row+1][col], grade[col]);
        }
        
        System.out.println();
        System.out.printf("%-12s %-12s %8.2f\n", "Average", "", gradeAvg);
    }
    
    
    
    public static void getNewGrades(String[][] name, double[] grade, String addNew, Scanner input){
        System.out.print("Do you have grades to add? (y/n)> ");
        addNew = input.nextLine().toLowerCase();
        
        if (addNew.equals("y")){
            System.out.print("How many do you need to add? > ");
            int addNewCount = input.nextInt();
            newGrades(name, grade, input, addNewCount);
        }
        
    }
    
    
    
    public static void newGrades(String[][] name, double[] grade, Scanner input, int addNewCount){
        for (int i = 0; i < addNewCount; i++){
             int newFrstIndex = name[0].length - 1;
             int newLstIndex = name[1].length - 1;
             int newGrdIndex = grade.length - 1;
             String newFirst = "";
             String newLast = "";
             double newGrade = 0.0;
             
             System.out.println();
             input.nextLine();
             
             System.out.print("First Name: ");
             newFirst = input.nextLine();
             
             System.out.print("Last Name: ");
             newLast = input.nextLine();
             
             System.out.print("Grade: ");
             newGrade = input.nextDouble();
             
             name[0][newFrstIndex] = newFirst;
             name[1][newLstIndex] = newLast;
             grade[newGrdIndex] = newGrade;
             
         }
    }
}
