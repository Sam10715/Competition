import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParticipantChessCompetioinTest {
    ParticipantChessCompetition participantChessCompetition1 = new ParticipantChessCompetition("Samer", "Pro");
    ParticipantChessCompetition participantChessCompetition2 = new ParticipantChessCompetition("Ahmad", "Pro");
    ParticipantChessCompetition participantChessCompetition3 = new ParticipantChessCompetition("Motaz", "Pro");
    ParticipantChessCompetition participantChessCompetition4 = new ParticipantChessCompetition("Moustafa", "Pro");
    ParticipantChessCompetition participantChessCompetition5 = new ParticipantChessCompetition("Shadi", "Pro");
    ParticipantChessCompetition participantChessCompetition6 = new ParticipantChessCompetition("Naser", "Pro");
    ParticipantChessCompetition participantChessCompetition7 = new ParticipantChessCompetition("Duaa", "Pro");
    ParticipantChessCompetition participantChessCompetition8 = new ParticipantChessCompetition("Jan", "Pro");
    ParticipantChessCompetition participantChessCompetition9 = new ParticipantChessCompetition("Maher", "Amu");
    ParticipantChessCompetition participantChessCompetition10 = new ParticipantChessCompetition("Reem", "Amu");
    ParticipantChessCompetition participantChessCompetition11 = new ParticipantChessCompetition("Ayham", "Amu");
    ParticipantChessCompetition participantChessCompetition12 = new ParticipantChessCompetition("Saleh", "Amu");
    ParticipantChessCompetition participantChessCompetition13 = new ParticipantChessCompetition("Basem", "Amu");
    ParticipantChessCompetition participantChessCompetition14 = new ParticipantChessCompetition("Maggie", "Amu");
    ParticipantChessCompetition participantChessCompetition15 = new ParticipantChessCompetition("Wim", "Amu");
    ParticipantChessCompetition participantChessCompetition16 = new ParticipantChessCompetition("Dima", "Amu");


    @Before
    public void before() {
        ParticipantChessCompetition participantChessCompetition1 = new ParticipantChessCompetition("Samer", "Pro");
        ParticipantChessCompetition participantChessCompetition2 = new ParticipantChessCompetition("Ahmad", "Pro");
        ParticipantChessCompetition participantChessCompetition3 = new ParticipantChessCompetition("Motaz", "Pro");
        ParticipantChessCompetition participantChessCompetition4 = new ParticipantChessCompetition("Moustafa", "Pro");
        ParticipantChessCompetition participantChessCompetition5 = new ParticipantChessCompetition("Shadi", "Pro");
        ParticipantChessCompetition participantChessCompetition6 = new ParticipantChessCompetition("Naser", "Pro");
        ParticipantChessCompetition participantChessCompetition7 = new ParticipantChessCompetition("Duaa", "Pro");
        ParticipantChessCompetition participantChessCompetition8 = new ParticipantChessCompetition("Jan", "Pro");
        ParticipantChessCompetition participantChessCompetition9 = new ParticipantChessCompetition("Maher", "Amu");
        ParticipantChessCompetition participantChessCompetition10 = new ParticipantChessCompetition("Reem", "Amu");
        ParticipantChessCompetition participantChessCompetition11 = new ParticipantChessCompetition("Ayham", "Amu");
        ParticipantChessCompetition participantChessCompetition12 = new ParticipantChessCompetition("Saleh", "Amu");
        ParticipantChessCompetition participantChessCompetition13 = new ParticipantChessCompetition("Basem", "Amu");
        ParticipantChessCompetition participantChessCompetition14 = new ParticipantChessCompetition("Maggie", "Amu");
        ParticipantChessCompetition participantChessCompetition15 = new ParticipantChessCompetition("Wim", "Amu");
        ParticipantChessCompetition participantChessCompetition16 = new ParticipantChessCompetition("Dima", "Amu");

    }

    @Test
    public void checkTest() {


        assertTrue(participantChessCompetition1.check() <= 75 && participantChessCompetition1.check() >= 0);
        assertTrue(participantChessCompetition2.check() <= 75 && participantChessCompetition2.check() >= 0);
        assertTrue(participantChessCompetition3.check() <= 75 && participantChessCompetition3.check() >= 0);
        assertTrue(participantChessCompetition4.check() <= 75 && participantChessCompetition4.check() >= 0);
        assertTrue(participantChessCompetition5.check() <= 75 && participantChessCompetition5.check() >= 0);
        assertTrue(participantChessCompetition6.check() <= 75 && participantChessCompetition6.check() >= 0);
        assertTrue(participantChessCompetition7.check() <= 75 && participantChessCompetition7.check() >= 0);
        assertTrue(participantChessCompetition8.check() <= 75 && participantChessCompetition8.check() >= 0);
        assertTrue(participantChessCompetition9.check() <= 25 && participantChessCompetition9.check() >= 0);
        assertTrue(participantChessCompetition10.check() <= 25 && participantChessCompetition10.check() >= 0);

        assertTrue(participantChessCompetition11.check() <= 25 && participantChessCompetition11.check() >= 0);
        assertTrue(participantChessCompetition12.check() <= 25 && participantChessCompetition12.check() >= 0);
        assertTrue(participantChessCompetition13.check() <= 25 && participantChessCompetition13.check() >= 0);
        assertTrue(participantChessCompetition14.check() <= 25 && participantChessCompetition14.check() >= 0);
        assertTrue(participantChessCompetition15.check() <= 25 && participantChessCompetition15.check() >= 0);
        assertTrue(participantChessCompetition16.check() <= 25 && participantChessCompetition16.check() >= 0);


    }
}
