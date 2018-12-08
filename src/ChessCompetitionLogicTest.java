import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ChessCompetitionLogicTest {
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
    List<ParticipantChessCompetition> participantsChessList = new ArrayList<>();

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
        participantsChessList.add(participantChessCompetition1);
        participantsChessList.add(participantChessCompetition2);
        participantsChessList.add(participantChessCompetition3);
        participantsChessList.add(participantChessCompetition4);
        participantsChessList.add(participantChessCompetition5);
        participantsChessList.add(participantChessCompetition6);
        participantsChessList.add(participantChessCompetition7);
        participantsChessList.add(participantChessCompetition8);
        participantsChessList.add(participantChessCompetition9);
        participantsChessList.add(participantChessCompetition10);
        participantsChessList.add(participantChessCompetition11);
        participantsChessList.add(participantChessCompetition12);
        participantsChessList.add(participantChessCompetition13);
        participantsChessList.add(participantChessCompetition14);
        participantsChessList.add(participantChessCompetition15);
        participantsChessList.add(participantChessCompetition16);


    }

    @Test
    public void chessCompetitionslogic1Test() {
        assertEquals(ChessCompetitionLogic.chessCompetitionslogic1(participantsChessList).size(), 8, 0);

    }

    @Test
    public void chessCompetitionslogic1Test2() {
        assertTrue(ChessCompetitionLogic.chessCompetitionslogic2(ChessCompetitionLogic.chessCompetitionslogic1(participantsChessList)).size() == 4);
    }

    @Test
    public void chessCompetitionslogic1Test3() {

        assertTrue(ChessCompetitionLogic.chessCompetitionslogic3(ChessCompetitionLogic.chessCompetitionslogic2(ChessCompetitionLogic.chessCompetitionslogic1(participantsChessList))).size() == 2);


    }

    @Test
    public void chessCompetitionslogic1Test4() {

        assertTrue(ChessCompetitionLogic.chessCompetitionslogic4(ChessCompetitionLogic.chessCompetitionslogic3(ChessCompetitionLogic.chessCompetitionslogic2(ChessCompetitionLogic.chessCompetitionslogic1(participantsChessList)))).size() == 1);


    }


}






