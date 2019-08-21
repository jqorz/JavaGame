import com.MainMidlet;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public final class n
  extends Canvas
  implements Runnable
{
  private static n k;
  public String a = "";
  public static String b = null;
  public static String c = null;
  public static boolean d = false;
  public static boolean e = false;
  public static boolean f = false;
  public static String[] g = null;
  public static int h = 0;
  public static int i = 0;
  public q j = null;
  private static int l = -1;
  private static int m = -1;
  
  public static final n a()
  {
    if (k == null) {
      k = new n();
    }
    return k;
  }
  
  public final boolean a(Canvas paramCanvas, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    b = paramString1;
    c = paramString2;
    g = m.a(paramString3, '|', getWidth());
    h = (getHeight() - 30) / x.k;
    if (h > g.length) {
      h = g.length;
    }
    Display.getDisplay(MainMidlet.a).setCurrent(this);
    this.j = q.a(this, paramInt);
    x.U = false;
    if (this.j == null)
    {
      e = false;
      try
      {
        Thread.sleep(300L);
      }
      catch (InterruptedException localInterruptedException1) {}
    }
    else
    {
      f = true;
      new Thread(this).start();
      while (f) {
        try
        {
          x.U = false;
          repaint();
          Thread.sleep(100L);
        }
        catch (InterruptedException localInterruptedException2) {}
      }
    }
    c();
    x.U = false;
    x.V = false;
    Display.getDisplay(MainMidlet.a).setCurrent(paramCanvas);
    x.j();
    x.U = false;
    x.V = false;
    return e;
  }
  
  public final void b()
  {
    if ((m == 2) || (m == 3))
    {
      if (m == 2) {
        i -= 1;
      } else if (m == 3) {
        i += 1;
      }
      if (i <= 0)
      {
        i = 0;
        return;
      }
      if (i >= g.length - h) {
        i = g.length - h;
      }
    }
  }
  
  public final void c()
  {
    i = 0;
    h = 0;
    m = -1;
    l = -1;
    q.b();
  }
  
  public final boolean d()
  {
    d = true;
    e = false;
    new Thread(new j(this)).start();
    while (d) {
      try
      {
        Thread.sleep(100L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
    d = false;
    return e;
  }
  
  public final void keyPressed(int paramInt)
  {
    l = MainMidlet.b.c(paramInt);
  }
  
  public final void paint(Graphics paramGraphics)
  {
    setFullScreenMode(true);
    paramGraphics.setColor(0);
    paramGraphics.setClip(0, 0, getWidth(), getHeight());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    switch (q.a())
    {
    case 0: 
      paramGraphics.setColor(255, 0, 0);
      if (g == null) {
        return;
      }
      int i1 = 0;
      for (int i2 = 0; i2 < g.length; i2++)
      {
        i3 = m.d(g[i2]);
        if (i1 < i3) {
          i1 = i3;
        }
      }
      int n = (getWidth() - i1) / 2;
      i2 = (getHeight() - x.k * h) / 2;
      for (int i3 = 0; i3 < h; i3++)
      {
        if (i3 + i >= g.length) {
          break;
        }
        m.a(g[(i + i3)], n, i2 + x.k * i3, 12303291, 0);
      }
      i3 = x.b;
      int i4 = x.a;
      int i5 = i3 - 20;
      if (i > 0)
      {
        z.e(i4 >> 1, i5, (i4 >> 1) - 5, i5 + 5, 11184810);
        z.e(i4 >> 1, i5, (i4 >> 1) + 5, i5 + 5, 11184810);
        z.e((i4 >> 1) + 5, i5 + 5, (i4 >> 1) - 5, i5 + 5, 11184810);
      }
      if (i + h < g.length)
      {
        z.e(i4 >> 1, i5 + 15, (i4 >> 1) - 5, i5 + 5 + 5, 11184810);
        z.e(i4 >> 1, i5 + 15, (i4 >> 1) + 5, i5 + 5 + 5, 11184810);
        z.e((i4 >> 1) + 5, i5 + 5 + 5, (i4 >> 1) - 5, i5 + 5 + 5, 11184810);
      }
      m.a("是", 0, getHeight(), 12303291, 36);
      m.a("否", getWidth(), getHeight(), 12303291, 40);
      return;
    case 1: 
    case 2: 
    case 3: 
      paramGraphics.setColor(255, 0, 0);
      paramGraphics.drawString(this.a, getWidth() >> 1, getHeight() >> 1, 17);
      return;
    case 4: 
    case 5: 
      paramGraphics.setColor(255, 0, 0);
      paramGraphics.drawString(this.a, getWidth() >> 1, getHeight() >> 2, 33);
      paramGraphics.drawString("按任意键返回！", getWidth() >> 1, getHeight() >> 1, 17);
    }
  }
  
  public final void run()
  {
    int n = 1;
    while (n != 0)
    {
      m = l;
      b();
      if (m == 5)
      {
        n = 0;
        e = d();
      }
      else if (m == 6)
      {
        e = false;
        f = false;
        return;
      }
      m = -1;
      l = -1;
      repaint();
    }
    for (;;)
    {
      m = l;
      if (m != -1) {
        f = false;
      }
      m = -1;
      l = -1;
      if (!f) {
        return;
      }
      repaint();
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\n.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */