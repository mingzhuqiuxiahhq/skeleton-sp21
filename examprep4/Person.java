public class Person {

    void speakTo(Person other){
        System.out.println("Kudos");
    }
    void watch(SoccerPlayer other){
        System.out.println("wow");
    }
}
/*
name            static             dynamic

itai            person              person
shivani         SoccerPlayer        Person
sohum           Athlete             SoccerPlay
jack            person              athlete
anjali          Athlete             athlete
chirasree       soccerplayer        soccerplay
 */


/*
 Person itai = new Person();

 SoccerPlayer shivani = new Person();  ce

 Athlete sohum = new SoccerPlayer();

 Person jack = new Athlete();

 Athlete anjali = new Athlete();

 SoccerPlayer chirasree = new SoccerPlayer();

 itai.watch(chirasree);             person.watch(soccerplayer) - wow

 xxxxx jack.watch(sohum);   person.watch(athlete) - ce

 xxxxx itai.speakTo(sohum);   person.speakto(person.athlete) - kudos

 jack.speakTo(anjali);   person.speakto(person.athlete) - kudos

 anjali.speakTo(chirasree);  athlete.speakto(athlete.soccerplayer)  - take notes

 sohum.speakTo(itai);    athlete.speakto(person) - hmph - speakto in athlete gets override and dynamic selection choose dynamic type of sohum which is soccerplayer.speakto(person)

 chirasree.speakTo((SoccerPlayer) sohum); - soccerplayer.speakto(athlete.soccerplayer) - respect

 sohum.watch(itai); - athlete.watch(person) - ce

 sohum.watch((Athlete) itai); - athlete.watch(athlete-person) - re

 ((Athlete) jack).speakTo(anjali); - athlete.speakto(athlete) - take notes

 ((SoccerPlayer) jack).speakTo(chirasree); - soccer.speakto(athlete.soccerplayer) - respect

 ((Person) chirasree).speakTo(itai); - hmph



 */