/*    */ import java.io.IOException;
/*    */ import java.io.InterruptedIOException;
/*    */ import javax.wireless.messaging.Message;
/*    */ import javax.wireless.messaging.MessageConnection;
/*    */ import javax.wireless.messaging.MessageListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class XConnection
/*    */   implements MessageConnection
/*    */ {
/*    */   public void close()
/*    */     throws IOException
/*    */   {}
/*    */   
/*    */   public Message newMessage(String s)
/*    */   {
/* 25 */     return null;
/*    */   }
/*    */   
/*    */   public Message newMessage(String s, String s1)
/*    */   {
/* 30 */     return null;
/*    */   }
/*    */   
/*    */   public int numberOfSegments(Message message)
/*    */   {
/* 35 */     return 0;
/*    */   }
/*    */   
/*    */   public Message receive()
/*    */     throws IOException, InterruptedIOException
/*    */   {
/* 41 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */   public void send(Message message1)
/*    */     throws IOException, InterruptedIOException
/*    */   {}
/*    */   
/*    */   public void setMessageListener(MessageListener messagelistener1)
/*    */     throws IOException
/*    */   {}
/*    */   
/*    */   public String toString()
/*    */   {
/* 55 */     return "javax.wireless.messaging.MessageConnection";
/*    */   }
/*    */ }


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\XConnection.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */