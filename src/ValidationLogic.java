public class ValidationLogic {

    public static boolean validate(ParticipantChessCompetition participantChessCompetition) {
        boolean x;
        switch (participantChessCompetition.getDes()) {

            case "Pro":
                x = true;
                break;
            case "Amu":
                x = true;
                break;
            default:
                x = false;
                throw new IllegalArgumentException("The input should be either Pro or Amu");

        }

        return x;
    }


}

