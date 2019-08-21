import com.MainMidlet;
import java.io.PrintStream;

public final class e
  implements k
{
  public static d a = null;
  public static y b = null;
  private static y l = null;
  private static y m = null;
  public static y c = null;
  public static y d = null;
  public static y e = null;
  private static int[][] n = new int['Ĭ'][2];
  public static int f = 0;
  public static short[] g = null;
  public static int h = 0;
  public static int i = 30;
  public static boolean j = false;
  public static boolean k = false;
  
  public static final void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      m.a();
      f = g[0];
      return;
    case 3: 
      f();
      return;
    case 6: 
      l.a();
      return;
    case 9: 
      r.a(g);
      return;
    case 12: 
      s.c();
      return;
    case 15: 
      s.d();
      return;
    case 18: 
      h();
      return;
    case 19: 
      g.b();
      return;
    case 20: 
      h.a();
      return;
    case 21: 
      s.e();
      return;
    case 24: 
      u.a();
      return;
    case 27: 
      g();
      return;
    case 29: 
      h.a((short)f);
      return;
    case 30: 
      g = null;
      f.b("进入" + k.y[f], 30);
      m.b(1, -1);
    }
  }
  
  private static void f()
  {
    if (d != null)
    {
      d.a();
      d = null;
    }
    if (c != null)
    {
      c.a();
      c = null;
    }
    if (b != null)
    {
      b.a();
      b = null;
    }
    if (l != null)
    {
      l.a();
      l = null;
    }
    if (m != null)
    {
      m.a();
      m = null;
    }
    if (e != null)
    {
      e.a();
      e = null;
    }
    s.f();
    f.c();
    System.gc();
  }
  
  public static final void a()
  {
    f();
    a = null;
    System.gc();
  }
  
  private static void g()
  {
    
    if (g != null) {
      a.a(g[1] * 16 + 8, g[2] * 16 + 8);
    }
    j = false;
    x.a(2, -1);
    k = false;
    g.a = false;
    g.b = false;
  }
  
  private static void h()
  {
    if (b == null) {
      b = new y(100);
    } else {
      b.a();
    }
    if (l == null) {
      l = new y(660);
    } else {
      l.a();
    }
    if (c == null) {
      c = new y(300);
    } else {
      c.a();
    }
    if (d == null) {
      d = new y(500);
    } else {
      d.a();
    }
    if (m == null) {
      m = new y(30);
    } else {
      m.a();
    }
    int i1;
    t localt;
    if (e == null)
    {
      e = new y(50);
      for (i1 = 0; i1 < 50; i1++)
      {
        localt = new t((byte)0, 0, 0);
        e.a(localt);
      }
    }
    else
    {
      for (i1 = 0; i1 < e.a; i1++) {
        (localt = (t)e.a(i1)).b = false;
      }
    }
    if (a == null) {
      a = d.a(true, (byte)0, g[1] * 16 + 8, g[2] * 16 + 8);
    }
    for (int i3 = 0; i3 < r.a.length; i3++) {
      for (int i4 = 0; i4 < r.a[i3].length; i4++)
      {
        int i2;
        d locald;
        if ((i2 = (i2 = (i1 = r.a[i3][i4]) & 0xFF00) >> 8) > 0)
        {
          locald = d.a(false, (byte)(i2 - 1), i4 * 16 + 8, i3 * 16 + 8);
          l.a(locald);
        }
        if (((i2 = (i2 = i1 & 0xFF0000) >> 16) > 0) && (i2 - 1 != 0) && ((locald = d.a(true, (byte)(i2 - 1), i4 * 16 + 8, i3 * 16 + 8)) != null)) {
          b.a(locald);
        }
      }
    }
    if (!b.b(a)) {
      b.a(a);
    }
    c();
  }
  
  public static final void a(short[] paramArrayOfShort)
  {
    h = 0;
    g = paramArrayOfShort;
  }
  
  public static final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (m == null) {
      return;
    }
    int i1 = 0;
    for (int i2 = 0; i2 < m.a; i2++)
    {
      v localv;
      if (!(localv = (v)m.a(i2)).b)
      {
        localv.a(paramInt1, paramInt2, paramInt3);
        i1 = 1;
        break;
      }
    }
    if (i1 == 0) {
      m.a(new v(paramInt1, paramInt2, paramInt3));
    }
  }
  
  public static final void b()
  {
    h += 1;
    int i1 = 0;
    if (g != null) {
      a(h);
    }
    if (g != null) {
      return;
    }
    if (k) {
      if (!a.b)
      {
        if ((i2 = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF5", k.A[8])))
        {
          ((p)a).J();
        }
        else
        {
          ((p)a).L();
          g.a();
          a();
          MainMidlet.b.b(5);
        }
      }
      else if (x.K != -1)
      {
        a();
        MainMidlet.b.b(5);
        return;
      }
    }
    if (f.a()) {
      x.f();
    }
    if (h.b())
    {
      i1 = 1;
      x.f();
    }
    if ((!j) && (a.b))
    {
      if (x.K == 5)
      {
        u.b(0);
        x.f();
        return;
      }
      if (x.K == 6)
      {
        u.b(14);
        x.f();
        return;
      }
    }
    if (j)
    {
      u.c();
      return;
    }
    if (r.a(a.k, a.l)) {
      c();
    }
    r.b();
    d locald1;
    for (int i2 = 0; i2 < c.a; i2++) {
      (locald1 = (d)c.a(i2)).b();
    }
    if (i1 == 0)
    {
      for (i3 = 0; i3 < b.a; i3++) {
        (locald1 = (d)b.a(i3)).b();
      }
      for (i3 = 0; i3 < e.a; i3++) {
        if ((locald1 = (d)e.a(i3)).b) {
          locald1.b();
        }
      }
    }
    for (int i3 = 0; i3 < m.a; i3++) {
      if ((locald1 = (d)m.a(i3)).b) {
        locald1.b();
      }
    }
    d();
    i3 = 0;
    for (int i4 = 0; i4 < d.a; i4++)
    {
      d locald2 = (d)d.a(i4);
      if (i3 >= n.length)
      {
        System.out.println("need more order room");
        break;
      }
      if (i3 >= 200) {
        System.out.println("=================all objs:" + d.a + "=================");
      }
      n[i3][0] = i3;
      n[i3][1] = locald2.l;
      i3++;
    }
    m.a(n, 1, d.a);
  }
  
  public static final void c()
  {
    c.a();
    for (int i1 = 0; i1 < l.a; i1++)
    {
      d locald;
      if ((!(locald = (d)l.a(i1)).a) && (locald.k >= r.b - 30) && (locald.k <= r.b + x.a + 30) && (locald.l >= r.c - 20) && (locald.l <= r.c + x.b + 80)) {
        c.a(locald);
      }
    }
  }
  
  public static final void d()
  {
    d.a();
    Object localObject;
    for (int i1 = 0; i1 < c.a; i1++)
    {
      localObject = (d)c.a(i1);
      d.a(localObject);
    }
    for (i1 = 0; i1 < b.a; i1++) {
      if (((localObject = (d)b.a(i1)).a) && (((d)localObject).n())) {
        d.a(localObject);
      }
    }
    if ((a != null) && (!d.b(a))) {
      d.a(a);
    }
    for (i1 = 0; i1 < m.a; i1++) {
      if ((localObject = (d)m.a(i1)).n()) {
        d.a(localObject);
      }
    }
    for (i1 = 0; i1 < e.a; i1++) {
      if ((localObject = (t)e.a(i1)).b) {
        if (((d)localObject).n()) {
          d.a(localObject);
        } else {
          ((d)localObject).b = false;
        }
      }
    }
  }
  
  public static final void a(byte paramByte, int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i1 = 0; i1 < e.a; i1++)
    {
      t localt;
      if (!(localt = (t)e.a(i1)).b)
      {
        localt.a(paramByte, paramInt1, paramInt2, paramInt3);
        return;
      }
    }
  }
  
  public static final void e()
  {
    if (g != null)
    {
      z.a(h, i);
      return;
    }
    if (j)
    {
      u.g();
    }
    else
    {
      r.c();
      if (d != null) {
        for (int i1 = 0; i1 < d.a; i1++)
        {
          int i2;
          d locald;
          if (((i2 = n[i1][0]) < d.a) && ((locald = (d)d.a(i2)) != null)) {
            locald.c();
          }
        }
      }
      u.h();
    }
    x.g();
    f.b();
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */