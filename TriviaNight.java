import java.util.Scanner;

public class TriviaNight {

    int correntNumberIndex;
    String question;
    String[] answers;
    public static void main(String[] args){
        int correctAnswers = 0;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("It's TRIVIA NIGHT! Are you ready?!");

        System.out.println("FIRST QUESTION!");
        String[] answersOne = {"Source Code","Assembly Language","C#","Machine Code"};
        TriviaNight questionOne = new TriviaNight(answersOne, "What is the Lowest Level Programming Language?", 4);  

        System.out.println(questionOne.question);

        displayAnswers(questionOne.answers);

        System.out.print("YOUR ANSWER: ");
        if (Integer.parseInt(inputReader.nextLine()) == questionOne.correntNumberIndex ){
            correctAnswers+=1;
        }

        String[] answersTwo = {"Grace Hopper","Alan Turing", "Charles Babbage", "Larry Page"};
        TriviaNight questionTwo = new TriviaNight(answersTwo, "Website Security CAPTCHA Forms Are Descended From the Work of?", 2);  
        
        System.out.println(questionTwo.question);
        displayAnswers(questionTwo.answers);
        
        System.out.print("YOUR ANSWER: ");
        if (Integer.parseInt(inputReader.nextLine()) == questionTwo.correntNumberIndex ){
            correctAnswers+=1;
        }

        String[] answersThree = {"Serenity","The Battlestar Galactica", "The USS Enterprise", "The Millennium Falcon"};
        TriviaNight questionThree = new TriviaNight(answersThree, "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?", 2);  
        
        System.out.println(questionThree.question);
        displayAnswers(questionThree.answers);
        
        System.out.print("YOUR ANSWER: ");
        if (Integer.parseInt(inputReader.nextLine()) == questionThree.correntNumberIndex ){
            correctAnswers+=1;
        }
        System.out.printf("You got %d correct!\n",correctAnswers);
        inputReader.close();
    }

    public static void displayAnswers(String[] questions){
        
        for (int i = 0; i<questions.length;i++){
            System.out.printf("%d) %s\n",i+1,questions[i]);
        }
        return;
    }
    public TriviaNight(String[] myAnswers,String myQuestion, int correctAnswer){
        correntNumberIndex= correctAnswer;
        answers = myAnswers;
        question = myQuestion;
    }
    


}
