/*    */ import java.util.Date;
/*    */ import javax.wireless.messaging.BinaryMessage;
/*    */ import javax.wireless.messaging.TextMessage;
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
/*    */ 
/*    */ 
/*    */ public class XMessage
/*    */   implements TextMessage, BinaryMessage
/*    */ {
/*    */   String payloadText;
/*    */   String address;
/*    */   byte[] payloadData;
/*    */   
/*    */   public String getPayloadText()
/*    */   {
/* 25 */     return this.payloadText;
/*    */   }
/*    */   
/*    */   public void setPayloadText(String arg0)
/*    */   {
/* 30 */     this.payloadText = arg0;
/*    */   }
/*    */   
/*    */   public String getAddress()
/*    */   {
/* 35 */     return this.address;
/*    */   }
/*    */   
/*    */   public void setAddress(String arg0)
/*    */   {
/* 40 */     this.address = arg0;
/*    */   }
/*    */   
/*    */   public Date getTimestamp()
/*    */   {
/* 45 */     return new Date();
/*    */   }
/*    */   
/*    */   public byte[] getPayloadData() {
/* 49 */     return this.payloadData;
/*    */   }
/*    */   
/*    */   public void setPayloadData(byte[] arg0) {
/* 53 */     this.payloadData = arg0;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 57 */     return "javax.wireless.messaging.TextMessage";
/*    */   }
/*    */ }


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\XMessage.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */