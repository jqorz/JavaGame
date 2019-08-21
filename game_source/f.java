import java.util.Vector;

public final class f
  implements k
{
  public static String a = null;
  public static boolean b = false;
  public static int c = 240;
  public static int d = 3;
  public static int e = 0;
  public static String[] f = null;
  public static boolean g = false;
  private static Vector h = new Vector();
  private static c i = null;
  
  private static void c(String paramString)
  {
    c = x.a - 2;
    e = 0;
    if (paramString != null) {
      f = m.a(paramString, '|', c);
    }
    d = 3;
    if (d > f.length) {
      d = f.length;
    }
  }
  
  public static final void a(byte paramByte, String paramString)
  {
    switch (paramByte)
    {
    case 0: 
      if (paramString != null) {
        a = paramString;
      }
      b = true;
      return;
    case 1: 
      c = x.a;
      c(paramString);
      g = true;
    }
  }
  
  public static final void a(String paramString)
  {
    a(, null, paramString);
  }
  
  public static final void b(String paramString)
  {
    a(, new c(paramString, x.a / 2, x.b / 2 + 6, 1, 0, 12), null);
  }
  
  public static final void a(String paramString, int paramInt)
  {
    c localc;
    (localc = new c(paramString, x.a / 2, x.b / 3, 1, 0, 12)).h = paramInt;
    a((byte)2, localc, null);
  }
  
  public static final void b(String paramString, int paramInt)
  {
    a(, new c(paramString, x.a / 2, x.b / 4, 0, 0, paramInt), null);
  }
  
  public static final void a(byte paramByte, c paramc, String paramString)
  {
    if (h == null) {
      h = new Vector();
    }
    switch (paramByte)
    {
    case 2: 
      if (!h.contains(paramc))
      {
        h.addElement(paramc);
        return;
      }
      break;
    case 3: 
      if (i == null)
      {
        i = new c(paramString, x.a / 2, x.b / 2 + 4, 1, 0, 8);
        return;
      }
      i.a(paramString, x.a / 2, x.b / 2 + 4, 1, 0, 8);
    }
  }
  
  public static final boolean a()
  {
    int j = 0;
    if (b) {
      if (x.e())
      {
        a = null;
        b = false;
        x.f();
      }
      else
      {
        return true;
      }
    }
    if (g) {
      if (x.e())
      {
        e += 1;
        if (e * d >= f.length)
        {
          g = false;
          f = null;
        }
        x.f();
      }
      else
      {
        return true;
      }
    }
    int k = 0;
    while (k < h.size())
    {
      c localc;
      if ((localc = (c)h.elementAt(k)).b()) {
        h.removeElementAt(k);
      } else {
        k++;
      }
    }
    if ((i != null) && (i.g)) {
      i.b();
    }
    return false;
  }
  
  public static final void b()
  {
    int j;
    if (h != null) {
      for (j = 0; j < h.size(); j++)
      {
        c localc;
        (localc = (c)h.elementAt(j)).a();
      }
    }
    int k;
    int m;
    int n;
    if ((f != null) && (g))
    {
      j = c;
      k = x.k * d;
      m = 0;
      n = x.b - 1 - k;
      z.a(1, n, j, k, 1);
      for (int i1 = e * d; i1 < e * d + d; i1++)
      {
        if (i1 >= f.length) {
          break;
        }
        m.a(f[i1], 1, n, 12303291, 0);
        n += x.k;
      }
    }
    if ((i != null) && (i.g)) {
      i.a();
    }
    if ((a != null) && (b))
    {
      j = m.d(a);
      k = x.k;
      m = (x.a - j) / 2;
      n = (x.b - k) / 2;
      z.a(m, n + -1, j, k, 0);
      m.a(a, m, n, 12303291, 0);
    }
  }
  
  public static final void c()
  {
    if (h != null)
    {
      h.removeAllElements();
      h = null;
      i = null;
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */