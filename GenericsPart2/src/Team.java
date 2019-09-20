import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    private String name;
    int played =0;
    int won =0;
    int lost =0;
    int tied =0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team "+ this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent , int ourScore , int theirScore){

        String message;
        if(ourScore > theirScore){
            won++;
            message =" Best ";
        }else if(ourScore == theirScore){
            tied++;
            message = " Drew with ";
        }else {
            lost++;
            message = " Lost to ";
        }
        played++;
        if(opponent !=null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return (won * 2) + tied;
    }
}
