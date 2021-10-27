package slr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;


public class SLR extends Agent {

    int x[]={23,26,30,34,43,48,52,57,58};
    int y[]={651,762,856,1063,1190,1298,1421,1440,1518};

    @Override
    public void setup() {
        Operaciones op = new Operaciones();
        Betas betas = new Betas();
        int n = 9;
        
        double xpory = op.OperacionMulti(x, y);
        double x1 = op.OperacionX1(x);
        double x2 = op.OperacionX2(x);
        double y1 = op.OperacionY1(y);

        double y = y1 / n;
        double x = x1 / n;

        double b1 = betas.beta1(n, xpory, x1, y1, x2);
        double b0 = betas.beta0(y, b1, x);
        System.out.println("Valor de Beta 1: " + b1);
        System.out.println("\nValor de Beta0: " + b0);
        
        addBehaviour(new MyOneshotBehaviour());

    }

    private class MyOneshotBehaviour extends OneShotBehaviour {

        @Override
        public void action() {
            System.out.println("Agente ejecutado");
        }
        
        @Override
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }

}
