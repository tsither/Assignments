import java.util.Scanner;

public class VoteRecorder {
	private static String nameCandidatePresident1;
	private static String nameCandidatePresident2;	
	private static String nameCandidateVicePresident1;	
	private static String nameCandidateVicePresident2;	
	private static int votesCandidatePresident1;
	private static int votesCandidatePresident2;
	private static int votesCandidateVicePresident1;
	private static int votesCandidateVicePresident2;
	private int myVoteForPresident;
	private int myVoteForVicePresident;
	
	/*VoteRecorder(String name1, String name2){
		nameCandidatePresident1 = name1;
		nameCandidatePresident2 = name2;
	}*/
	
	public static void setCandidatesPresident(String name1, String name2) { //requires constructors for names
		nameCandidatePresident1 = name1;
		nameCandidatePresident2 = name2; 
	}
	
	public static String getCurrentVotePresident() {
		
		String votesCandidatePresident1 = votesCandidatePresident1.toString();
		String votesCandidatePresident2 = votesCandidatePresident2.toString();
		
		String CandidatesPresidentVotesAdded = nameCandidatePresident1 + "has" + votesCandidatePresident1 + "votes;" + nameCandidatePresident2 + "has" + votesCandidatePresident2 + "votes;";
		return(CandidatesPresidentVotesAdded);//return current number of votes for both candidates
	}
	
	public static void setCandidatesVicePresident(String name1, String name2) {
		nameCandidateVicePresident1 = name1;
		nameCandidateVicePresident2 = name2;
	}
	public static String getCurrentVoteVicePresident() {
		
		String candidatesVicePresidentVotesAdded = nameCandidateVicePresident1 + "has" + votesCandidateVicePresident1 + "votes;" + nameCandidateVicePresident2 + "has" + votesCandidateVicePresident2 + "votes;";
		
		return(candidatesVicePresidentVotesAdded);//return current number of votes for both candidates
	}
	
	public static void resetVotes() {
		votesCandidatePresident1 = 0;
		votesCandidatePresident2 = 0;
		votesCandidateVicePresident1 = 0;
		votesCandidateVicePresident2 = 0;
	}
	
	public void recordVotes() {
		
		if (myVoteForPresident == 1) {
			votesCandidatePresident1++;
		} else if (myVoteForPresident == 2) {
			votesCandidatePresident2++;
		}
		
		if (myVoteForVicePresident == 1) {
			votesCandidateVicePresident1++;
		} else if (myVoteForVicePresident == 2) {
			votesCandidateVicePresident2++;
		}
		
		
	}
	
	
	private int getAVote(String name1, String name2) {
 		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please choose a candidate:");
		System.out.println("/t" + "0 - No one" + "/n" + "/t" + "1 - " + name1 + "/n" + "/t" + "2 - " + name2); //****new to refine invalid numbers with boolean
		int choice = keyboard.nextInt();
		 
		
		return(choice);//single vote choice from individual
	}
	
	
	private int[] getVotes() {
		myVoteForPresident = getAVote(nameCandidatePresident1, nameCandidatePresident2);
		myVoteForVicePresident = getAVote(nameCandidateVicePresident1, nameCandidateVicePresident2);
		
		int votes [] = new int[2];
		votes [0] = myVoteForPresident;
		votes [1] = myVoteForVicePresident;
		
		return(votes);
		
		/*
		String [] president = new String[3];
		president [0] = "no one";
		president [1] = "Annie";
		president [2] = "Bob";
		
		String [] vicePresident = new String [3];
		vicePresident [0] = "no one";
		vicePresident [1] = "John";
		vicePresident [2] = "Susan"; 
		*/
	}
	
	private boolean confirmVotes() {
 		Scanner keyboard = new Scanner(System.in);

		System.out.println("Your vote for president is " ); //need vote choice here
		System.out.println("Your vote for vice president is "); //need vote choice here
		System.out.println("Type yes if you are happy with your vote");
		String confirmed = keyboard.nextLine();
		return() //returns true or false value whether user is happy with their vote or not	
	}
	
	public void getAndConfirmVotes() {
		System.out.println("YOU ARE VOTING FOR PRESIDENT:");
		getAVote(nameCandidatePresident1, nameCandidatePresident2);
		System.out.println("YOU ARE VOTING FOR VICE PRESIDENT:");
		getAVote(nameCandidateVicePresident1, nameCandidateVicePresident2);


		
	}




}
