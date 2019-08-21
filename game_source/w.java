import com.MainMidlet;
import javax.microedition.midlet.MIDlet;

public final class w
  implements Runnable
{
  public w(x paramx) {}
  
  public final void run()
  {
    try
    {
      MainMidlet.a.platformRequest("http://wap.infuns.com");
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\w.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */