public final class c
  implements k
{
  private static final byte[][] i = { { 0, -1 }, { -1, -1 }, { -1 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1 }, { 1, -1 } };
  public String a = null;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public boolean g = true;
  public int h = 13421772;
  
  public c(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
    this.d = paramInt4;
    this.g = true;
    if (this.d > 7) {
      this.d = 0;
    }
    this.f = paramInt5;
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.g = true;
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
    this.d = paramInt4;
    if (this.d > 7) {
      this.d = 0;
    }
    this.f = paramInt5;
  }
  
  public final void a()
  {
    int j = m.d(this.a);
    int k = x.k;
    z.a(this.b - j / 2, this.c - k / 2 + -1, j, k, 0);
    m.a(this.a, this.b, this.c, this.h, 3);
  }
  
  public final boolean b()
  {
    this.b += i[this.d][0] * this.e;
    this.c += i[this.d][1] * this.e;
    this.f -= 1;
    if (this.f <= 0)
    {
      this.g = false;
      return true;
    }
    return false;
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */