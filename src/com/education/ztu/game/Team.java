package com.education.ztu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant & League> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        if (!participants.isEmpty()) {
            // Перевірка, чи учасник відповідає лізі команди
            String teamLeague = participants.get(0).getLeague();
            String participantLeague = participant.getLeague();
            if (!teamLeague.equals(participantLeague)) {
                System.out.println("Cannot add participant to the team " + name + " - different league.");
                return;
            }
        }
        participants.add(participant);
        System.out.println("To the team " + name + " was added participant " + participant.getName());
    }



    public void playWith(Team<T> team) {
        if (!participants.isEmpty() && !team.participants.isEmpty()) {
            // Перевірка, чи обидві команди мають учасників тієї ж ліги
            String teamLeague = participants.get(0).getLeague();
            String opponentLeague = team.participants.get(0).getLeague();
            if (!teamLeague.equals(opponentLeague)) {
                System.out.println("Cannot play with the team " + team.getName() + " - different league.");
                return;
            }
        }

        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("The team " + winnerName + " is the winner!");
    }


    public String getName() {
        return name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipants(List<T> participants) {
        this.participants = participants;
    }
}

