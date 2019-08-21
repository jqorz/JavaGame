import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class r
{
  public static int[][] a = null;
  private static int j = 0;
  private static int k = 0;
  public static int b = 0;
  public static int c = 0;
  public static int d = 0;
  public static int e = 0;
  public static int f = 0;
  private static Image l = null;
  private static Graphics m = null;
  private static int n = 0;
  private static int o = 0;
  public static int g;
  public static int h;
  public static short[][][] i = null;
  private static int p = 4;
  private static int q = 40;
  private static int r;
  private static int s;
  private static int t;
  private static int u;
  private static boolean v = true;
  
  public static final void a(short[] paramArrayOfShort)
  {
    if (i == null) {
      i = m.a(i, "/data/map/buildings.dat");
    }
    a = m.a(a, "/data/map/map_" + paramArrayOfShort[0] + ".dat");
    g = a[0].length * 16;
    h = a.length * 16;
    b = paramArrayOfShort[1] * 16 - x.a / 2;
    c = paramArrayOfShort[2] * 16 - x.b / 2;
    d();
    j = b;
    k = c;
    d = c;
    v = true;
    a();
  }
  
  public static final void a()
  {
    n = (x.a / 16 + 2) * 16;
    o = (x.b / 16 + 2) * 16;
    if (l == null) {
      l = Image.createImage(n, o);
    }
    m = l.getGraphics();
  }
  
  public static final boolean a(int paramInt1, int paramInt2)
  {
    int i1 = x.a / 2;
    int i2 = x.b / 2;
    if (paramInt1 - b > i1)
    {
      if (paramInt1 - b - i1 > q) {
        b = paramInt1 - i1 - q;
      } else {
        b += (paramInt1 - b - i1) / p;
      }
    }
    else if (paramInt1 - b < i1) {
      if (paramInt1 - b - i1 < -q) {
        b = paramInt1 - i1 + q;
      } else {
        b += (paramInt1 - b - i1) / p;
      }
    }
    if (paramInt2 - c > i2)
    {
      if (paramInt2 - c - i2 > q) {
        c = paramInt2 - i2 - q;
      } else {
        c += (paramInt2 - c - i2) / p;
      }
    }
    else if (paramInt2 - c < i2) {
      if (paramInt2 - c - i2 < -q) {
        c = paramInt2 - i2 + q;
      } else {
        c += (paramInt2 - c - i2) / p;
      }
    }
    d();
    if ((j != b) || (k != c))
    {
      j = b;
      k = c;
      return true;
    }
    return false;
  }
  
  private static void d()
  {
    if (b < 0) {
      b = 0;
    }
    if (b > g - x.a) {
      b = g - x.a;
    }
    if (c < 0) {
      c = 0;
    }
    if (c > h - x.b) {
      c = h - x.b;
    }
  }
  
  public static final void b()
  {
    if (e > 0)
    {
      f = e % 2 == 0 ? -1 : 1;
      e -= 1;
    }
    else
    {
      f = 0;
    }
    d = c + f;
    if (d < 0) {
      d = 0;
    }
    if (d > h - x.b) {
      d = h - x.b;
    }
  }
  
  public static final byte b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= g) || (paramInt2 < 0) || (paramInt2 >= h)) {
      return 1;
    }
    return (byte)(a[(paramInt2 / 16)][(paramInt1 / 16)] >> 24 & 0xFF);
  }
  
  public static final boolean c(int paramInt1, int paramInt2)
  {
    return b(paramInt1, paramInt2) == 0;
  }
  
  public static final void a(int paramInt)
  {
    if (e != 0) {
      return;
    }
    e = paramInt;
  }
  
  public static final void c()
  {
    d(b, d);
  }
  
  private static void d(int paramInt1, int paramInt2)
  {
    int i1;
    int i3 = (i1 = paramInt1 / 16) + x.a / 16 + 1;
    int i2;
    int i4 = (i2 = paramInt2 / 16) + x.b / 16 + 1;
    if (v)
    {
      v = false;
      a(m, i1, i2, i3, i4);
      r = i1;
      t = i2;
      s = i3;
      u = i4;
    }
    int i5;
    int i6;
    if (r != i1)
    {
      if (r < i1)
      {
        i5 = s + 1;
        i6 = i3;
      }
      else
      {
        i5 = i1;
        i6 = r - 1;
      }
      a(m, i5, i2, i6, i4);
      r = i1;
      s = i3;
    }
    if (t != i2)
    {
      if (t < i2)
      {
        i5 = u + 1;
        i6 = i4;
      }
      else
      {
        i5 = i2;
        i6 = t - 1;
      }
      a(m, i1, i5, i3, i6);
      t = i2;
      u = i4;
    }
    int i7 = paramInt1 % n;
    int i9 = paramInt2 % o;
    int i8 = (paramInt1 + x.a) % n;
    int i10 = (paramInt2 + x.b) % o;
    if (i8 > i7)
    {
      if (i10 > i9)
      {
        a(i7, i9, x.a, x.b, 0, x.c);
        return;
      }
      a(i7, i9, x.a, x.b - i10, 0, x.c);
      a(i7, 0, x.a, i10, 0, x.c + x.b - i10);
      return;
    }
    if (i10 > i9)
    {
      a(i7, i9, x.a - i8, x.b, 0, x.c);
      a(0, i9, i8, x.b, x.a - i8, x.c);
      return;
    }
    a(i7, i9, x.a - i8, x.b - i10, 0, x.c);
    a(i7, 0, x.a - i8, i10, 0, x.c + x.b - i10);
    a(0, i9, i8, x.b - i10, x.a - i8, x.c);
    a(0, 0, i8, i10, x.a - i8, x.c + x.b - i10);
  }
  
  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i2 = paramInt2 * 16 % o;
    for (int i4 = paramInt2; i4 <= paramInt4; i4++)
    {
      int i1 = paramInt1 * 16 % n;
      for (int i3 = paramInt1; i3 <= paramInt3; i3++)
      {
        int i5 = e(i3, i4);
        paramGraphics.setClip(i1, i2, 16, 16);
        if (i5 > 0)
        {
          i5--;
          short[] arrayOfShort = s.k[i5];
          int i6;
          if (s.k[i5].length >= 6) {
            i6 = arrayOfShort[5];
          } else {
            i6 = 0;
          }
          if (s.m[arrayOfShort[0]] == null) {
            continue;
          }
          paramGraphics.setClip(i1, i2, arrayOfShort[3], arrayOfShort[4]);
          paramGraphics.clipRect(0, 0, n, o);
          switch (i6)
          {
          case 0: 
            paramGraphics.drawImage(s.m[arrayOfShort[0]], i1 - arrayOfShort[1], i2 - arrayOfShort[2], 0);
            break;
          case 1: 
            paramGraphics.drawRegion(s.m[arrayOfShort[0]], arrayOfShort[1], arrayOfShort[2], arrayOfShort[3], arrayOfShort[4], 6, i1, i2, 0);
            break;
          case 2: 
            paramGraphics.drawRegion(s.m[arrayOfShort[0]], arrayOfShort[1], arrayOfShort[2], arrayOfShort[3], arrayOfShort[4], 3, i1, i2, 0);
            break;
          case 3: 
            paramGraphics.drawRegion(s.m[arrayOfShort[0]], arrayOfShort[1], arrayOfShort[2], arrayOfShort[3], arrayOfShort[4], 5, i1, i2, 0);
            break;
          case 4: 
            paramGraphics.drawRegion(s.m[arrayOfShort[0]], arrayOfShort[1], arrayOfShort[2], arrayOfShort[3], arrayOfShort[4], 2, i1, i2, 0);
            break;
          case 5: 
            paramGraphics.drawRegion(s.m[arrayOfShort[0]], arrayOfShort[1], arrayOfShort[2], arrayOfShort[3], arrayOfShort[4], 1, i1, i2, 0);
            break;
          case 6: 
            paramGraphics.drawRegion(s.m[arrayOfShort[0]], arrayOfShort[1], arrayOfShort[2], arrayOfShort[3], arrayOfShort[4], 4, i1, i2, 0);
            break;
          case 7: 
            paramGraphics.drawRegion(s.m[arrayOfShort[0]], arrayOfShort[1], arrayOfShort[2], arrayOfShort[3], arrayOfShort[4], 7, i1, i2, 0);
          }
        }
        else
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(i1, i2, 16, 16);
        }
        i1 += 16;
        if (i1 >= n) {
          i1 -= n;
        }
      }
      i2 += 16;
      if (i2 >= o) {
        i2 -= o;
      }
    }
  }
  
  private static int e(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 0) || (paramInt2 >= a.length)) {
      return -1;
    }
    if ((paramInt1 < 0) || (paramInt1 >= a[paramInt2].length)) {
      return -1;
    }
    return a[paramInt2][paramInt1] & 0xFF;
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    Graphics localGraphics;
    if ((localGraphics = x.s) == null) {
      return;
    }
    localGraphics.setClip(paramInt5, paramInt6, paramInt3, paramInt4);
    localGraphics.drawImage(l, paramInt5 - paramInt1, paramInt6 - paramInt2, 0);
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */