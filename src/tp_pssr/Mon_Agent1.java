package tp_pssr;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;

public class Mon_Agent1 extends Agent {

      protected void setup() {
            if( this.getLocalName().equals("AMIN")) {
              this.addBehaviour(new b1());
              
          }
            
        
            
          if( this.getLocalName().equals("AMINA")) {
                           this.addBehaviour(new b2());

          } 
    }
      public class b1 extends OneShotBehaviour{

        @Override
        public void action() {
                      System.out.println("helloooooooooo" +this.myAgent.getLocalName());

        }
          
      }
      
        public class b2 extends CyclicBehaviour{
            int i=0;
        @Override
        public void action() {
            System.out.println("helloooooooooo" +this.myAgent.getLocalName());
            i++;
            if (i==5)
            {
                this.myAgent.doWait(3000);
            }
        }   
      }
       public class b3 extends Behaviour {

        @Override
        public void action() {
              Object[] t= this.myAgent.getArguments() ;
              String a =(String)t[0];
              String b = (String)t[1];
              int c = Integer.parseInt(a)+  Integer.parseInt(b) ;
              System.out.println("Somme " + c);        }

        @Override
        public boolean done() {
            return true;
        }
           
       }
    
}

