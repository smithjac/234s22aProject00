public class Team4 extends Team {

    public Team4(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Jacob Smith"));
        members.add(new TeamMember("Devin McCormack"));
        members.add(new TeamMember("Dylan Fodor"));
        members.add(new TeamMember("Vito Leone"));

        // create a new member class for each team member
        // and add it to the team members list
    }
}
