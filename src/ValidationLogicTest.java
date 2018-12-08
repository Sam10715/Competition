import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidationLogicTest {

    ParticipantChessCompetition participantChessCompetition1 = new ParticipantChessCompetition("Samer", "Pro");
    ParticipantChessCompetition participantChessCompetition9 = new ParticipantChessCompetition("Maher", "Amu");


    @Test
    public void validateTest() {
        assertTrue(ValidationLogic.validate(participantChessCompetition1) == true);
        assertTrue(ValidationLogic.validate(participantChessCompetition9) == true);


    }


}
