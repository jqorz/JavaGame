import javax.microedition.lcdui.Graphics;

public final class z
  implements k
{
  static
  {
    new int[] { 12560009, 10059874, 14339001 }[3] = 12429455;
  }
  
  public static final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Graphics localGraphics = x.s;
    if (paramInt5 > k.C.length) {
      return;
    }
    for (int m = 0; m < k.C[paramInt5].length; m++)
    {
      if (k.C[paramInt5][m].length != 3) {
        return;
      }
      int i = k.C[paramInt5][m][0];
      int j = k.C[paramInt5][m][1];
      int k = k.C[paramInt5][m][2];
      localGraphics.setColor(k);
      localGraphics.setClip(paramInt1 - i, paramInt2 - j, paramInt3 + i * 2, paramInt4 + j * 2);
      localGraphics.fillRect(paramInt1 - i, paramInt2 - j, paramInt3 + i * 2, paramInt4 + j * 2);
    }
  }
  
  public static final void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = m.d(paramString);
    int j = x.k;
    a(paramInt1 - i / 2, paramInt2 - j / 2 + -1, i, j, paramInt3);
    m.a(paramString, paramInt1, paramInt2, paramInt4, 3);
  }
  
  public static final void a(int paramInt1, int paramInt2)
  {
    x.d(0);
    int i = 0;
    int j = x.a * 3 / 4;
    int k = (x.a - j) / 2;
    int m = (x.a - 6 - x.k) * 70 / 100;
    m.a("载入中...", k, m, 13421772, 0);
    m += x.k;
    a(k, m, j, 6, 3);
    b(k, m, j * paramInt1 / paramInt2, 6, 6167);
  }
  
  public static final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((paramInt3 < 0) || (paramInt4 < 0)) {
      return;
    }
    Graphics localGraphics;
    (localGraphics = x.s).setClip(paramInt1, paramInt2, paramInt3, paramInt4);
    localGraphics.setColor(paramInt5);
    localGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    d(paramInt1 - 1, paramInt2 - 1, paramInt3 + 1, paramInt4 + 1, paramInt5);
  }
  
  public static final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((paramInt3 < 0) || (paramInt4 < 0)) {
      return;
    }
    Graphics localGraphics;
    (localGraphics = x.s).setClip(paramInt1, paramInt2, paramInt3 + 1, paramInt4 + 1);
    localGraphics.setColor(paramInt5);
    localGraphics.drawRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Graphics localGraphics;
    (localGraphics = x.s).setClip(Math.min(paramInt1, paramInt3) - 1, Math.min(paramInt2, paramInt4) - 1, Math.abs(paramInt1 - paramInt3) + 2, Math.abs(paramInt2 - paramInt4) + 2);
    localGraphics.setColor(paramInt5);
    localGraphics.drawLine(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\z.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */