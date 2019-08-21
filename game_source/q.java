import java.io.PrintStream;

public final class q
{
  private static int c = 0;
  private static int d = 0;
  private static String e;
  private static String f;
  private static q g;
  private static n h;
  private static Thread i;
  public static String a = "106633000015";
  public static String b = "99E308161";
  
  public static final q a(n paramn, int paramInt)
  {
    if (paramn == null)
    {
      b("[Observer can not be null.]");
      return null;
    }
    if ((paramInt < 0) || (paramInt > 2))
    {
      b("[smsType can not be " + paramInt + ".]");
      return null;
    }
    h = paramn;
    c = paramInt;
    if (g == null) {
      g = new q();
    }
    return g;
  }
  
  private q()
  {
    g();
  }
  
  public final int a(String paramString1, String paramString2)
  {
    if (h == null)
    {
      b("[Observer can not be null.]");
      return -2;
    }
    if ((c < 0) || (c > 2))
    {
      b("[smsType can not be " + c + ".]");
      return -2;
    }
    if ((paramString1 == null) || (paramString1.equals("")))
    {
      b("[address can not be null.]");
      return -2;
    }
    if ((paramString2 == null) || (paramString2.equals("")))
    {
      b("[message can not be null.]");
      return -2;
    }
    if (d != 0)
    {
      b("[message is in sending.]");
      return -3;
    }
    if (c != 2) {
      f = new String("sms://" + paramString1);
    } else {
      f = new String(paramString1);
    }
    e = new String(paramString2);
    d = 1;
    h();
    long l1 = System.currentTimeMillis();
    long l2 = 0L;
    j = -1;
    try
    {
      for (;;)
      {
        l2 = System.currentTimeMillis() - l1;
        if ((d == 4) || (d == 5) || (d <= -1))
        {
          j = d;
          break;
        }
        if (l2 > 20000L)
        {
          d = 5;
          b("[发送超时]");
          j = -4;
          break;
        }
        Thread.currentThread();
        Thread.sleep(100L);
      }
      Exception localException2;
      return j;
    }
    catch (Exception localException1)
    {
      (localException2 = localException1).printStackTrace();
    }
  }
  
  private void g()
  {
    d = 0;
    if (i != null)
    {
      while (i.isAlive()) {
        try
        {
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException) {}
      }
      i = null;
    }
  }
  
  private void h()
  {
    i = new Thread(new i(this));
    i.start();
  }
  
  private static void b(String paramString)
  {
    if (h != null)
    {
      h.a = paramString;
      return;
    }
    System.out.println("[SmsObserver is null]");
  }
  
  public static final int a()
  {
    return d;
  }
  
  public static final void b()
  {
    d = 0;
  }
  
  public static final void a(String paramString)
  {
    b(paramString);
  }
  
  public static final int c()
  {
    return c;
  }
  
  public static final String d()
  {
    return f;
  }
  
  public static final void a(int paramInt)
  {
    d = paramInt;
  }
  
  public static final String e()
  {
    return e;
  }
  
  public static final int f()
  {
    return d;
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */