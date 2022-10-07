package lesson8;

public class Competition { //Соревнование
    private Participant[] participants;
    private Track[] tracks;

    public Competition(Participant[] participants, Track[] tracks) {
        this.participants = participants;
        this.tracks = tracks;
    }
    public void start(){
        for (Participant participant : participants) {
            System.out.println("Участник " + participant.getName() + " готовится к припятствиям");
            for (Track track : tracks){
                boolean overcome = track.overcome(participant);
                if (!overcome){
                    break;
                }
            }
            System.out.println("Участник " + participant.getName() + " закончил свои соревнования!");

        }
    }
}
