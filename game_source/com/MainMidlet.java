package com;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import m;
import x;

public class MainMidlet
  extends MIDlet
{
  public static MainMidlet a;
  public static x b = null;
  
  public MainMidlet()
  {
    a = this;
    if (b == null)
    {
      b = new x(this);
      Display.getDisplay(this).setCurrent(b);
      new Thread(b).start();
    }
  }
  
  public final void startApp()
  {
    x.Q = false;
    b.showNotify();
  }
  
  public final void pauseApp()
  {
    x.Q = true;
    m.a();
    b.hideNotify();
  }
  
  public final void destroyApp(boolean paramBoolean) {}
  
  public static final void a()
  {
    m.a();
    a.notifyDestroyed();
    a = null;
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\com\MainMidlet.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */