import java.util.Scanner;

public class newone {

    public static void main(String[] args) {
        
        // Game: Nier: Automata
        // 5 questions with 3 answers each
        // Control Structures, arrays and other functions
        
        Scanner input = new Scanner(System.in);

        // Qustion 1
        System.out.println("What council YoRHa is fighting for");
        System.out.println("");
        String question1[] = {"A.Humanity","B.Robots","C.Androids" }; 
        
        for(String firstQuestion : question1){ // 
            System.out.println(firstQuestion);
        }
        System.out.print("What is your answer?");
        String answer1 = input.nextLine().toUpperCase();

        switch(answer1){
            case "A":
                System.out.println("Letter A is correct");
                break;
            case "B":
                System.out.println("Letter B is incorrect");
                System.out.println("The correct answer is A");
                break;
            case "C":
                System.out.println("Letter C is incorrect");
                System.out.println("The correct answer is A");
                break;
            default:
                System.out.println("Type only A, B, C");
        }

        System.out.println("");

        System.out.println("Congratulation!!! Moving to the 2nd Question");

        System.out.println("");

        // Qustion 2
        System.out.println("What ost were played after finishing the side quest of Emil's memories?");
        System.out.println("");
        String question2[] = {"A.Weight of the World","B.Voice Of No Return","C.Kaine's Salvation" }; 
        
        for(String secondQuestion : question2){ 
            System.out.println(secondQuestion);
        }
        System.out.print("What is your answer?");
        String answer2 = input.nextLine().toUpperCase();

        switch(answer2){
            case "A":
                System.out.println("Letter A is correct");
                System.out.println("The correct answer is C");
                break;
            case "B":
                System.out.println("Letter B is incorrect");
                System.out.println("The correct answer is C");
                break;
            case "C":
                System.out.println("Letter C is correct");
                break;
            default:
                System.out.println("Type only A, B, C"); 
        }
        
        System.out.println("");

        System.out.println("Congratulation!!! Moving to the 3rd Question");

        System.out.println("");

         // Qustion 3
         System.out.println("How many times did 2B killed 9s?");
         System.out.println("");
         String question3[] = {"A.48","B.59","C.127" }; 
         
         for(String thirdQuestion : question3){ 
             System.out.println(thirdQuestion);
         }
         System.out.print("What is your answer?");
         String answer3 = input.nextLine().toUpperCase();
 
         switch(answer3){
             case "A":
                 System.out.println("Letter A is correct");
                 break;
             case "B":
                 System.out.println("Letter B is incorrect");
                 System.out.println("The correct answer is A");
                 break;
             case "C":
                 System.out.println("Letter C is incorrect");
                 System.out.println("The correct answer is A");
                 break;
             default:
                 System.out.println("Type only A, B, C");
         }

         System.out.println("");

        System.out.println("Congratulation!!! Moving to the 4th Question");

        System.out.println("");

        // Qustion 4
        System.out.println("How many endings does Nier:Automata have?");
        System.out.println("");
        String question4[] = {"A.2","B.5","C.26" }; 
        
        for(String fourthQuestion : question4){ 
            System.out.println(fourthQuestion);
        }
        System.out.print("What is your answer?");
        String answer4 = input.nextLine().toUpperCase();

        switch(answer4){
            case "A":
                System.out.println("Letter A is correct");
                System.out.println("The correct answer is C");
                break;
            case "B":
                System.out.println("Letter B is incorrect");
                System.out.println("The correct answer is C");
                break;
            case "C":
                System.out.println("Letter C is correct");
                break;
            default:
                System.out.println("Type only A, B, C");
        }

        System.out.println("");

        System.out.println("Congratulation!!! Moving to the Last question. The Fifth question!");

        System.out.println("");

        // Qustion 5
        System.out.println("Why are the androids like 2B and 9S blindfolded and the YoRHa operators wear veils?");
        System.out.println("");
        String question5[] = {"A.The blindfolds creates another sense to androids","B.the blindfolds to symbolically show that they are blind to the truth and YoRHa operators wear veils to symbolize their inability to speak the truth","C.To not see the Robots when they  kill them " }; 
        
        for(String fifthQuestion : question5){ 
            System.out.println(fifthQuestion);
        }
        System.out.print("What is your answer?");
        String answer5 = input.nextLine().toUpperCase();

        switch(answer5){
            case "A":
                System.out.println("Letter A is incorrect");
                System.out.println("The correct answer is B");
                break;
            case "B":
                System.out.println("Letter B is correct");
                break;
            case "C":
                System.out.println("Letter C is incorrect");
                System.out.println("The correct answer is B");
                break;
            default:
                System.out.println("Type only A, B, C");
        }

        System.out.println("");
        System.out.println("Thank you for playing");

    }
    
}
