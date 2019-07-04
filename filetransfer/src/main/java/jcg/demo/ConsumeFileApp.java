package jcg.demo;
 
import javax.jms.JMSException;
 
import jcg.demo.activemq.QueueMessageConsumer;
 
public class ConsumeFileApp {
 
    public static void main(String[] args) {
 
        QueueMessageConsumer queueMsgListener = new QueueMessageConsumer(Constants.TEST_BROKER_URL, Constants.ADMIN,
                Constants.ADMIN);
        queueMsgListener.setDestinationName(Constants.TEST_QUEUE);
 
        try {
            queueMsgListener.run();
 
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}