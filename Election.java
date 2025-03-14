/*An election is contested by 5 candidates. The candidates are numbered 1 to  5  and  the  voting  is  done  by  marking  the  candidate  number  on  the ballot  paper.  Develop  an  application  to  read  the  ballots  and  count  the votes  cast  for  each  candidate  using  an  array  variable  count.  In  case,  a number read is outside the range 1 to 5, the ballot should be considered as a 'spoilt ballot' and the program should also count the number of spoilt ballots.*/

import java.util.*;

class VoteCounter {
    int spoiltBallot = 0; int totalvotes=0;
//method to count the number of votes for each candidate
    void counting(int[] count) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n[Enter '0' to EXIT the voting process] \n");
        while (true) {
            System.out.print("Enter the Candidate number for whom you wish to vote: ");
            int vote = sc.nextInt();
            if (vote >= 1 && vote <= 5) {
                totalvotes++;
                System.out.println("VALID Ballot!");
                switch (vote) {
                    case 1:
                        count[0]++;
                        break;
                    case 2:
                        count[1]++;
                        break;
                    case 3:
                        count[2]++;
                        break;
                    case 4:
                        count[3]++;
                        break;
                    case 5:
                        count[4]++;
                        break;
                }
            } else if (vote == 0) {
                break;
            } else {
                System.out.println("SPOILT Ballot!");
                spoiltBallot++;
                totalvotes++;
            }
        }
        
    }
//method to display the overall count and result.
    void displayResult(int[] count) {
        System.out.println("\n******** Election RESULTS ********");
        System.out.println("Total number of cast votes = " +totalvotes +"\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Candidate # " + (i + 1) + " got ==> " + count[i] + " votes");
        }
        System.out.println("Number of Spoilt Ballot are: " + spoiltBallot);
    }
}

class Election {
    public static void main(String[] args) {
        int[] candidates = new int[5];
        
        System.out.println("\n***** WELCOME TO ELECTION VOTES COUNTING PROGRAM *****\n ***** Number of candidates is 5 *****\n");
        //Create a object of the VoteCounter class
        VoteCounter obj = new VoteCounter();
        obj.counting(candidates);
        obj.displayResult(candidates);
    }
}
