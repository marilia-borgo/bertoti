package composity.AntiPattern;

public class ComposityAntiPattern {

    public static void main(String[] args) {
        Developer dev1 = new Developer("Alice");
        Developer dev2 = new Developer("Bob");

        Team subTeam = new Team();
        subTeam.addMember(dev1);

        Team mainTeam = new Team();
        mainTeam.addMember(dev2);
        mainTeam.addMember(subTeam);
        mainTeam.addMember("InvalidMember"); // membro invalido

        mainTeam.showMembers();
    }
}
