import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class s
  implements k
{
  public static short[][] a = null;
  public static short[][][][] b = null;
  public static byte c = 0;
  public static byte d = 1;
  public static byte e = 2;
  public static byte f = 3;
  public static byte g = 4;
  public static byte h = 5;
  public static byte i = 6;
  public static byte j = 7;
  public static short[][] k = null;
  public static short[][][][] l = null;
  public static Image[] m = new Image[15];
  public static byte n = 0;
  public static byte o = 1;
  public static byte p = 2;
  public static byte q = 3;
  public static byte r = 4;
  public static byte s = 5;
  public static byte t = 6;
  public static byte J = 7;
  public static byte K = 8;
  public static byte L = 9;
  public static byte M = 10;
  public static byte N = 11;
  public static byte O = 12;
  public static byte P = 13;
  public static byte Q = 14;
  public static byte R = 15;
  private static int S = -1;
  private static int T = -1;
  private static int U = -1;
  
  public static final void a()
  {
    if (a == null) {
      a = m.a(a, "/data/ui/ui_clips.dat");
    }
    if (b == null) {
      b = m.a(b, "/data/ui/ui_frames.dat");
    }
  }
  
  public static final void b()
  {
    m = new Image[8];
    if (m[c] == null) {
      m[c] = m.a("UI6");
    }
    if (m[d] == null) {
      m[d] = m.a("UI1");
    }
    if (m[e] == null) {
      m[e] = m.a("UI2");
    }
    if (m[f] == null) {
      m[f] = m.a("UI3");
    }
    if (m[g] == null) {
      m[g] = m.a("UI4");
    }
    if (m[h] == null) {
      m[h] = m.a("UI5");
    }
    if (m[i] == null) {
      m[i] = m.a("UI7");
    }
    if (m[j] == null) {
      m[j] = m.a("UI11");
    }
  }
  
  public static final void c()
  {
    a = null;
    b = null;
    if (k == null) {
      k = m.a(k, "/data/map/all_clips.dat");
    }
    if (l == null) {
      l = m.a(l, "/data/map/actors_frames.dat");
    }
  }
  
  public static final void d()
  {
    m = new Image[15];
    if (k.F[e.f] == 0)
    {
      m[n] = m.a(n);
      m[o] = m.a(o);
    }
    else if (k.F[e.f] == 1)
    {
      m[P] = m.a(P);
    }
    else if (k.F[e.f] == 2)
    {
      m[Q] = m.a(Q);
    }
    if (m[p] == null) {
      m[p] = m.a(p);
    }
    if ((m[K] == null) && (k.G[e.f][0] > 0)) {
      m[K] = m.a(K, k.G[e.f][0] / 6);
    }
    if ((m[N] == null) && (k.G[e.f][1] > 0)) {
      m[N] = m.a(N, k.G[e.f][1] / 6);
    }
    if ((m[L] == null) && (k.G[e.f][2] > 0)) {
      m[L] = m.a(L, k.G[e.f][2] / 6);
    }
    if ((m[M] == null) && (e.f == 0)) {
      m[M] = m.a(M);
    }
    if (m[O] == null) {
      m[O] = m.a(O);
    }
  }
  
  public static final void e()
  {
    if (m == null) {
      return;
    }
    if (m[s] == null) {
      m[s] = m.a(s);
    }
    int i1 = 0;
    String str = null;
    int i2 = p.R[0];
    if ((S != i2) || (m[q] == null))
    {
      S = i2;
      if (i2 != 0)
      {
        if (i2 > 0)
        {
          str = l.b(i2, (byte)9);
          i1 = l.a(l.b(i2, (byte)10));
          if (str != null) {
            if (str.equals("斧")) {
              m[q] = m.a(q + "_ax", i1);
            } else if (str.equals("剑")) {
              m[q] = m.a(q + "_sword", i1);
            }
          }
          m[r] = m.a(r, i1);
        }
      }
      else {
        m[q] = null;
      }
    }
    i2 = p.R[1];
    if ((T != i2) || (m[t] == null) || (i2 == 0))
    {
      T = i2;
      if (i2 != 0)
      {
        if (i2 > 0)
        {
          if ((i1 = l.a(l.b(i2, (byte)10))) >= 0) {
            m[t] = m.a(t, i1);
          }
        }
        else {
          m[t] = null;
        }
      }
      else {
        m[t] = null;
      }
    }
    i2 = p.R[2];
    if ((U != i2) || (m[J] == null) || (i2 == 0))
    {
      T = i2;
      if (i2 != 0)
      {
        if (i2 > 0)
        {
          if ((i1 = l.a(l.b(i2, (byte)10))) >= 0) {
            m[J] = m.a(J, i1);
          }
        }
        else {
          m[J] = null;
        }
      }
      else {
        m[J] = null;
      }
    }
  }
  
  public static final short[][][] a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= l.length)) {
      return null;
    }
    return l[paramInt];
  }
  
  public static final short[][] b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= r.i.length)) {
      return null;
    }
    return r.i[paramInt];
  }
  
  public static final void f()
  {
    k = null;
    l = null;
    for (int i1 = 0; i1 < m.length; i1++) {
      m[i1] = null;
    }
    m = null;
    System.gc();
  }
  
  public static final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt3 >= l.length) {
      return;
    }
    a(l[paramInt3], k, paramInt1, paramInt2, paramInt4, paramInt5);
  }
  
  public static final void a(short[][][] paramArrayOfShort, short[][] paramArrayOfShort1, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Graphics localGraphics = x.s;
    if (paramInt3 > paramArrayOfShort.length) {
      return;
    }
    short[][] arrayOfShort = paramArrayOfShort[paramInt3];
    if (paramInt4 >= arrayOfShort.length)
    {
      m.e("fameId overfload");
      return;
    }
    short[] arrayOfShort1 = arrayOfShort[paramInt4];
    for (int i11 = 0; i11 < arrayOfShort1.length / 3; i11++)
    {
      int i9 = arrayOfShort1[(i11 * 3)];
      int i10 = paramArrayOfShort1[i9][0];
      int i1 = paramArrayOfShort1[i9][1];
      int i2 = paramArrayOfShort1[i9][2];
      int i3 = paramArrayOfShort1[i9][3];
      int i4 = paramArrayOfShort1[i9][4];
      int i5 = arrayOfShort1[(i11 * 3 + 1)];
      int i6 = arrayOfShort1[(i11 * 3 + 2)];
      int i7 = paramInt1 + i5 - i3 / 2;
      int i8 = paramInt2 + i6 - i4 / 2;
      if ((i7 + i3 >= 0) && (i7 <= x.a) && (i8 + i4 >= 0) && (i8 <= x.b))
      {
        Image localImage = m[i10];
        if (paramArrayOfShort1[i9].length <= 5) {
          m.a(localGraphics, localImage, i7, i8, i1, i2, i3, i4, 0);
        } else {
          m.a(localGraphics, localImage, i7, i8, i1, i2, i3, i4, paramArrayOfShort1[i9][5]);
        }
      }
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */