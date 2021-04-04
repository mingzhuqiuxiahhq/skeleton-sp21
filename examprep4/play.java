public class play {
    public static void main(String[] args) {
        /*
         -
         */
         Person itai = new Person();
        
         // SoccerPlayer shivani = new Person();
        
         Athlete sohum = new SoccerPlayer();
        
         Person jack = new Athlete();
        
         Athlete anjali = new Athlete();
        
         SoccerPlayer chirasree = new SoccerPlayer();
        
         itai.watch(chirasree);
        
         jack.watch((SoccerPlayer) sohum);

        ((Athlete) jack).watch( sohum);
        
         itai.speakTo(sohum);
        
         jack.speakTo(anjali);

         anjali.speakTo(chirasree);
        
         sohum.speakTo(itai);
        
         chirasree.speakTo((SoccerPlayer) sohum);
        
         //sohum.watch((Athlete) itai);
        
         //sohum.watch((Athlete) itai);
        
         ((Athlete) jack).speakTo(anjali);
        
        (jack).speakTo(chirasree);
        
         ((Person) chirasree).speakTo(itai);

    }
}
