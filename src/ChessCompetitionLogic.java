import java.util.ArrayList;
import java.util.List;

public class ChessCompetitionLogic {

    public static List<ParticipantChessCompetition> chessCompetitionslogic1(List<ParticipantChessCompetition> participantChessCompetitions) {
        System.out.println("The First round");
        System.out.println("-------------------------------------------------------------------------");
        List<ParticipantChessCompetition> p1 = new ArrayList<>();
        for (ParticipantChessCompetition participants1 : participantChessCompetitions) {

            participants1.check();

        }

        for (int i = 0; i < participantChessCompetitions.size() / 2; i++) {

            while (participantChessCompetitions.get(i).check() == participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                participantChessCompetitions.get(i).check();
                participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check();
            }
            System.out.println("Match Between : " + participantChessCompetitions.get(i).getName() + " and " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
            if (participantChessCompetitions.get(i).check() > participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                System.out.println("The winner is " + participantChessCompetitions.get(i).getName());
                p1.add(participantChessCompetitions.get(i));
            } else {
                System.out.println("The winner is " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
                p1.add(participantChessCompetitions.get(participantChessCompetitions.size() - i - 1));
            }


        }


        System.out.println("-------------------------------------------------------------------------");
        return p1;

    }

    public static List<ParticipantChessCompetition> chessCompetitionslogic2(List<ParticipantChessCompetition> participantChessCompetitions) {
        System.out.println("The Second round");
        System.out.println("-------------------------------------------------------------------------");
        List<ParticipantChessCompetition> p1 = new ArrayList<>();
        for (ParticipantChessCompetition participants1 : participantChessCompetitions) {

            participants1.check();

        }

        for (int i = 0; i < participantChessCompetitions.size() / 2; i++) {

            while (participantChessCompetitions.get(i).check() == participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                participantChessCompetitions.get(i).check();
                participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check();
            }
            System.out.println("Match Between : " + participantChessCompetitions.get(i).getName() + " and " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
            if (participantChessCompetitions.get(i).check() > participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                System.out.println("The winner is " + participantChessCompetitions.get(i).getName());
                p1.add(participantChessCompetitions.get(i));
            } else {
                System.out.println("The winner is " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
                p1.add(participantChessCompetitions.get(participantChessCompetitions.size() - i - 1));
            }


        }


        System.out.println("-------------------------------------------------------------------------");
        return p1;


    }

    public static List<ParticipantChessCompetition> chessCompetitionslogic3(List<ParticipantChessCompetition> participantChessCompetitions) {
        System.out.println("The Third round");
        System.out.println("-------------------------------------------------------------------------");
        List<ParticipantChessCompetition> p1 = new ArrayList<>();
        for (ParticipantChessCompetition participants1 : participantChessCompetitions) {

            participants1.check();

        }

        for (int i = 0; i < participantChessCompetitions.size() / 2; i++) {

            while (participantChessCompetitions.get(i).check() == participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                participantChessCompetitions.get(i).check();
                participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check();
            }
            System.out.println("Match Between : " + participantChessCompetitions.get(i).getName() + " and " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
            if (participantChessCompetitions.get(i).check() > participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                System.out.println("The winner is " + participantChessCompetitions.get(i).getName());
                p1.add(participantChessCompetitions.get(i));
            } else {
                System.out.println("The winner is " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
                p1.add(participantChessCompetitions.get(participantChessCompetitions.size() - i - 1));
            }


        }


        System.out.println("-------------------------------------------------------------------------");
        return p1;

    }


    public static List<ParticipantChessCompetition> chessCompetitionslogic4(List<ParticipantChessCompetition> participantChessCompetitions) {
        System.out.println("The Final Round");
        System.out.println("-------------------------------------------------------------------------");
        List<ParticipantChessCompetition> p1 = new ArrayList<>();
        for (ParticipantChessCompetition participants1 : participantChessCompetitions) {

            participants1.check();

        }

        for (int i = 0; i < participantChessCompetitions.size() / 2; i++) {

            while (participantChessCompetitions.get(i).check() == participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                participantChessCompetitions.get(i).check();
                participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check();
            }
            System.out.println("Match Between : " + participantChessCompetitions.get(i).getName() + " and " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
            if (participantChessCompetitions.get(i).check() > participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).check()) {
                System.out.println("The winner is " + participantChessCompetitions.get(i).getName());
                System.out.println("Congratulation you are the winner of 2018 compitition");
                p1.add(participantChessCompetitions.get(i));
            } else {
                System.out.println("The winner is " + participantChessCompetitions.get(participantChessCompetitions.size() - i - 1).getName());
                System.out.println("Congratulation you are the winner of 2018 competition");
                p1.add(participantChessCompetitions.get(participantChessCompetitions.size() - i - 1));
            }


        }


        System.out.println("-------------------------------------------------------------------------");
        return p1;

    }


}