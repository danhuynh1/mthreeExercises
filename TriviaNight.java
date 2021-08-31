import java.util.Scanner;

public class TriviaNight {

    int correntNumberIndex;
    String question;
    String[] answers;
    public static void main(String[] args){

        /*Creates a Trivia night class with a question, a string array of possible answers, and a key integer representing what the correct answer is 
        answers are displayed as 1-4
        int variable correctAnswers is incremented depending on if console input matches correct answer integer.
        */
        int correctAnswers = 0;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("It's TRIVIA NIGHT! Are you ready?!");


        //First Question.
        System.out.println("FIRST QUESTION!");
        String[] answersOne = {"Source Code","Assembly Language","C#","Machine Code"};
        TriviaNight questionOne = new TriviaNight(answersOne, "What is the Lowest Level Programming Language?", 4);  
        System.out.println(questionOne.question);
        displayAnswers(questionOne.answers);

        //First Input
        System.out.print("YOUR ANSWER: ");
        if (Integer.parseInt(inputReader.nextLine()) == questionOne.correntNumberIndex ){
            correctAnswers+=1;
        }

        //Second Question
        String[] answersTwo = {"Grace Hopper","Alan Turing", "Charles Babbage", "Larry Page"};
        TriviaNight questionTwo = new TriviaNight(answersTwo, "Website Security CAPTCHA Forms Are Descended From the Work of?", 2);  
        System.out.println(questionTwo.question);
        displayAnswers(questionTwo.answers);
        
        //Second input
        System.out.print("YOUR ANSWER: ");
        if (Integer.parseInt(inputReader.nextLine()) == questionTwo.correntNumberIndex ){
            correctAnswers+=1;
        }

        //Third Question
        String[] answersThree = {"Serenity","The Battlestar Galactica", "The USS Enterprise", "The Millennium Falcon"};
        TriviaNight questionThree = new TriviaNight(answersThree, "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?", 2);  
        System.out.println(questionThree.question);
        displayAnswers(questionThree.answers);
        
        //Third Input
        System.out.print("YOUR ANSWER: ");
        if (Integer.parseInt(inputReader.nextLine()) == questionThree.correntNumberIndex ){
            correctAnswers+=1;
        }

 
        System.out.printf("You got %d correct!\n",correctAnswers);
        inputReader.close();
    }



    // public static TriviaNight[] initializeBasicQuestions(){
        
    // }
    /**
     * Helper method to print a string array.
     * @param questions
     */
    public static void displayAnswers(String[] questions){
        
        for (int i = 0; i<questions.length;i++){
            System.out.printf("%d) %s\n",i+1,questions[i]);
        }
        return;
    }

    /**Constructor for TriviaNight questions object
     * TriviaNight 
     * @params 
     * myAnswer is String array of possible answers
     * myQuestion is the question being asked
     * correctAnswer is the key integer for where the correct answer to myQuestion lies (+1)
     * 
     */
    public TriviaNight(String[] myAnswers,String myQuestion, int correctAnswer){
        correntNumberIndex= correctAnswer;
        answers = myAnswers;
        question = myQuestion;
    }
    


}
