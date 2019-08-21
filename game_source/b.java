public class b
  extends d
{
  private byte M = 0;
  private int N = 0;
  private short O = 200;
  private short P = 150;
  private short Q = 200;
  private short R = 30;
  private d S = null;
  private static int T = 0;
  private String U = null;
  public int J = 0;
  public int K = 0;
  public int L = 0;
  private static int[] V = { 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
  private int W;
  private int X;
  private short Y = 0;
  private short Z = 800;
  
  public b(byte paramByte, int paramInt1, int paramInt2)
  {
    this.j = paramByte;
    this.k = paramInt1;
    this.l = paramInt2;
    this.W = this.k;
    this.X = this.l;
    a();
  }
  
  private void b(byte paramByte)
  {
    if ((this.M >= 0) && (this.M <= 4))
    {
      this.M = paramByte;
      w();
    }
  }
  
  public void a()
  {
    if ((this.j < 7) || (this.j > 9)) {
      return;
    }
    this.h = V;
    this.e = s.k;
    this.f = s.a(this.j);
    this.M = 0;
    a(m.b(4));
    switch (this.j)
    {
    case 7: 
      this.m = 2;
      this.n = 24;
      this.o = 38;
      if (e.f == 4) {
        this.U = k.z[7];
      }
      break;
    case 8: 
      this.m = 2;
      this.n = 20;
      this.o = 42;
      if (e.f == 2) {
        this.U = k.z[6];
      } else if (e.f == 14) {
        this.U = k.z[8];
      }
      break;
    case 9: 
      this.m = 2;
      this.O = ((short)(300 + this.J * 2));
      this.P = 60;
      this.Q = 120;
      this.R = ((short)(200 + this.J * 2));
      this.n = 24;
      this.o = 50;
      if (e.f == 28) {
        this.U = k.z[9];
      }
      break;
    }
    this.J = k.G[e.f][(this.j - 7)];
    this.K = (this.J * 100);
    this.L = (5 + this.J * 5);
    this.S = e.a;
  }
  
  public final boolean o()
  {
    return (Math.abs(this.k - this.W) < this.P / 2) && (Math.abs(this.l - this.X) < this.P / 2);
  }
  
  private boolean r()
  {
    if (!u()) {
      return false;
    }
    return (Math.abs(this.k - this.S.k) < this.O / 2) && (Math.abs(this.l - this.S.l) < this.O / 2);
  }
  
  private boolean s()
  {
    if (!u()) {
      return false;
    }
    if (this.j != 9) {
      return (Math.abs(this.k - this.S.k) < this.R / 2) && (Math.abs(this.l - this.S.l) < this.R / 2);
    }
    return ((Math.abs(this.k - this.S.k) < this.n / 2) && (Math.abs(this.l - this.S.l) < this.R / 2)) || ((Math.abs(this.k - this.S.k) < this.R / 2) && (Math.abs(this.l - this.S.l) < this.n / 2));
  }
  
  private boolean t()
  {
    if (!u()) {
      return false;
    }
    return (Math.abs(this.W - this.S.k) < this.Q / 2) && (Math.abs(this.X - this.S.l) < this.Q / 2);
  }
  
  private boolean u()
  {
    return (this.S != null) && (this.S.b) && (!this.S.m());
  }
  
  public boolean b()
  {
    if (!this.b) {
      return false;
    }
    boolean bool = d();
    if (m())
    {
      if (bool) {
        this.b = false;
      }
      return true;
    }
    if (!a(bool)) {
      switch (this.M)
      {
      case 0: 
        if (r())
        {
          b((byte)2);
          d(this.S.k, this.S.l);
          a(4 + this.r);
        }
        else if ((bool) && (m.b(100) < 50))
        {
          b((byte)1);
          a(4 + m.b(4));
        }
        break;
      case 1: 
        if (r())
        {
          b((byte)2);
          d(this.S.k, this.S.l);
          a(4 + this.r);
        }
        else if (!o())
        {
          f(this.W, this.X);
        }
        else
        {
          f();
          if ((bool) && (m.b(100) < 20))
          {
            b((byte)0);
            a(m.b(4));
          }
        }
        break;
      case 2: 
        if (s())
        {
          b((byte)3);
          a(16 + this.r);
        }
        else if ((!r()) && (!t()))
        {
          b((byte)1);
          a(4 + this.r);
        }
        else
        {
          f(this.S.k, this.S.l);
        }
        break;
      case 3: 
        if (s())
        {
          if (a(this.S))
          {
            b((byte)2);
            a(16 + this.r);
          }
          x();
        }
        else if (r())
        {
          b((byte)2);
          a(4 + this.r);
        }
        else if (!t())
        {
          b((byte)1);
          a(4 + this.r);
        }
        break;
      }
    }
    return true;
  }
  
  private boolean v()
  {
    return this.Y != 0;
  }
  
  private void w()
  {
    this.Y = 0;
  }
  
  private void f(int paramInt1, int paramInt2)
  {
    if ((!c(paramInt1, paramInt2)) && (!v()))
    {
      d(paramInt1, paramInt2);
      a(4 + this.r);
    }
    boolean bool;
    if ((bool = f()))
    {
      this.Y = ((short)(this.Y + 1));
      h();
      a(4 + this.r);
      return;
    }
    if (v())
    {
      this.Y = ((short)(this.Y + 1));
      if (k())
      {
        w();
        j();
        a(4 + this.r);
        return;
      }
      if (this.Y > this.Z)
      {
        w();
        i();
        a(4 + this.r);
      }
    }
  }
  
  public final boolean a(boolean paramBoolean)
  {
    if (this.N > 0) {
      this.N -= 1;
    }
    if (l())
    {
      if (paramBoolean)
      {
        if (this.N == 0)
        {
          b((byte)3);
          a(4 + this.r);
        }
        else
        {
          a(0 + this.r);
        }
      }
      else
      {
        b(this.S);
        if (b(a(this.r), 5)) {
          d(5);
        }
      }
      return true;
    }
    return this.N != 0;
  }
  
  private void x()
  {
    if ((this.d >= 16) && (this.d <= 19))
    {
      if (this.j == 9)
      {
        if (this.c == 5)
        {
          T += 1;
          if (T % 2 == 0) {
            switch (this.r)
            {
            case 0: 
              e.a(this.r, this.k, this.l - this.o, this.J);
              return;
            case 1: 
              e.a(this.r, this.k + 4, this.l + 1, this.J);
              return;
            case 2: 
              e.a(this.r, this.k - this.n / 4, this.l - 32, this.J);
              return;
            case 3: 
              e.a(this.r, this.k + this.n / 4, this.l - 32, this.J);
            }
          }
        }
        return;
      }
      if (this.d > this.f.length) {
        return;
      }
      short[][] arrayOfShort = this.f[this.d];
      if (this.c >= arrayOfShort.length) {
        return;
      }
      short[] arrayOfShort1;
      int i2 = (arrayOfShort1 = arrayOfShort[this.c])[0];
      int i3;
      if ((i3 = this.e[i2][0]) != s.R) {
        return;
      }
      int i = this.e[i2][3];
      int j = this.e[i2][4];
      int k = arrayOfShort1[1];
      int m = arrayOfShort1[2];
      int n = this.k + k - i / 2;
      int i1 = this.l + m - j / 2;
      if (this.S != null) {
        ((p)this.S).a(n, i1, i, j, this);
      }
    }
  }
  
  public final boolean p()
  {
    return (this.b) && (!l()) && (this.K > 0);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (!p()) {
      return;
    }
    if (paramInt5 < 5) {
      paramInt5 = 5;
    }
    if ((m.a(this.k - this.n / 2, this.l - this.o, this.n, this.o, paramInt1, paramInt2, paramInt3, paramInt4)) && (!e(paramInt5)))
    {
      b((byte)3);
      a(8 + this.r);
    }
  }
  
  private boolean e(int paramInt)
  {
    this.K -= paramInt;
    if (this.K <= 0)
    {
      this.K = 0;
      b((byte)4);
      a(12 + this.r);
      int i = 2 * this.J;
      p.L[7] += i;
      f.b("获得" + i + "金");
      int j;
      if ((j = q()) > 0) {
        e.a(j, this.k, this.l);
      }
      p.h(2 * this.J);
      h.b(this.j);
      return true;
    }
    return false;
  }
  
  public final int q()
  {
    int i = -1;
    int j = p.L[0];
    if (m.b(100 + j) > j) {
      return -1;
    }
    int k = m.b(1000);
    int m = 0;
    int n = 0;
    for (int i1 = 0; i1 < k.H.length; i1++)
    {
      if (k < k.H[i1][0])
      {
        n = k.H[i1][1];
        break;
      }
      m = k.H[i1][1];
    }
    i1 = this.J - m;
    int i2 = this.J - n;
    int i3 = this.J + m;
    int i4 = this.J + n;
    int i5 = m.b(1000);
    String str1 = null;
    if (i5 < 700) {
      str1 = "白";
    } else if (i5 < 950) {
      str1 = "蓝";
    } else {
      str1 = "金";
    }
    int i6 = 0;
    int i7 = 0;
    String str2 = null;
    for (int i8 = 0; i8 < 730; i8++) {
      if (((i7 = l.a(i8, (byte)16)) >= 0) && ((str2 = l.b(i8, (byte)10)) != null) && (str2.equals(str1)) && (((i7 >= i2) && (i7 <= i1)) || ((i7 >= i3) && (i7 <= i4) && (l.f(i8))))) {
        i6++;
      }
    }
    if (i6 > 0)
    {
      i8 = m.b(i6);
      for (int i9 = 0; i9 < 730; i9++) {
        if (((i7 = l.a(i9, (byte)16)) >= 0) && ((str2 = l.b(i9, (byte)10)) != null) && (str2.equals(str1)) && (((i7 >= i2) && (i7 <= i1)) || ((i7 >= i3) && (i7 <= i4))))
        {
          i8--;
          if (i8 == 0)
          {
            i = i9;
            break;
          }
        }
      }
    }
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (!p()) {
      return;
    }
    if (paramInt5 < 5) {
      paramInt5 = 5;
    }
    if ((m.a(this.k - this.n / 2, this.l - this.o, this.n, this.o, paramInt1, paramInt2, paramInt3, paramInt4)) && (!e(paramInt5)))
    {
      b((byte)3);
      a(8 + this.r);
      this.N = paramInt6;
    }
  }
  
  public final void c()
  {
    if (!this.b) {
      return;
    }
    super.c();
    if (l()) {
      s.a(this.k - r.b, this.l - this.o / 2 - r.d, 14, this.r, this.c % s.l[14][this.r].length);
    }
    if ((this.K > 0) && ((l()) || (this.N > 0)))
    {
      int i;
      if ((i = this.K * k.B.length / 3000) >= k.B.length) {
        i = k.B.length - 1;
      }
      if (i > 0) {
        z.b(this.k - 10 - r.b, this.l - this.o - 3 - r.d, 20, 3, k.B[(i - 1)]);
      }
      z.b(this.k - 10 - r.b, this.l - this.o - 3 - r.d, this.K % (3000 / k.B.length) * 20 / (3000 / k.B.length), 3, k.B[i]);
    }
    if (this.U != null) {
      z.a(this.U, this.k - r.b, this.l - r.d - 50 - x.k / 2, 2, 16118000);
    }
    if ((this.N > 0) && (!m())) {
      s.a(this.k - r.b, this.l - this.o - r.d, 12, 0, this.N % s.l[12][0].length);
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */