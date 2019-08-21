import java.io.PrintStream;
import javax.microedition.lcdui.Graphics;

public abstract class d
  implements k
{
  public boolean a = true;
  public boolean b = true;
  public int c = 0;
  public int d = 0;
  public short[][] e = null;
  public short[][][] f = null;
  public short[][] g = null;
  public int[] h = null;
  public int i = 1;
  public byte j = 0;
  public int k;
  public int l;
  public int m = 8;
  public int n = 24;
  public int o = 50;
  public int p = 6;
  public int q = 6;
  public byte r = 1;
  public int s;
  public int t;
  
  public final void a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.f.length))
    {
      this.d = paramInt;
      this.g = this.f[this.d];
      this.r = ((byte)(paramInt % 4));
    }
    c(0);
  }
  
  public final boolean b(int paramInt)
  {
    if (paramInt >= this.f.length) {
      return false;
    }
    if (this.d != paramInt)
    {
      a(paramInt);
      return true;
    }
    return false;
  }
  
  public final void c(int paramInt)
  {
    if ((paramInt < this.g.length) && (paramInt >= 0))
    {
      this.c = paramInt;
      this.i = 0;
    }
  }
  
  public final boolean d()
  {
    boolean bool = false;
    this.i += 1;
    if (this.i >= (this.h == null ? 1 : this.h[this.d]))
    {
      this.i = 0;
      this.c += 1;
      if (this.c >= this.g.length)
      {
        this.c = 0;
        bool = true;
      }
    }
    return bool;
  }
  
  public final boolean e()
  {
    boolean bool = false;
    this.i += 1;
    if (this.i >= (this.h == null ? 1 : this.h[this.d]))
    {
      this.i = 0;
      this.c += 1;
      if (this.c >= this.g.length)
      {
        this.c = (this.g.length - 1);
        bool = true;
      }
    }
    return bool;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.k = paramInt1;
    this.l = paramInt2;
  }
  
  public static final d a(boolean paramBoolean, byte paramByte, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    if (!paramBoolean) {
      localObject = new aa(paramByte, paramInt1, paramInt2);
    } else {
      switch (paramByte)
      {
      case 0: 
        localObject = new p(paramInt1, paramInt2);
        break;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
        localObject = new a(paramByte, paramInt1, paramInt2);
        break;
      case 7: 
      case 8: 
      case 9: 
        localObject = new b(paramByte, paramInt1, paramInt2);
      }
    }
    if (localObject != null)
    {
      ((d)localObject).b = true;
      return (d)localObject;
    }
    return null;
  }
  
  public abstract boolean b();
  
  public final boolean f()
  {
    this.t = this.l;
    this.s = this.k;
    boolean bool = false;
    switch (this.r)
    {
    case 0: 
      this.t -= this.m;
      if ((!r.c(this.s, this.t - this.q)) || (!r.c(this.s - this.p, this.t - this.q)) || (!r.c(this.s + this.p, this.t - this.q)))
      {
        h.a(this, this.s, this.t);
        this.t = (this.l & 0xFFFFFFF0);
        this.t += this.q;
        bool = true;
      }
      break;
    case 1: 
      this.t += this.m;
      if ((!r.c(this.s, this.t + this.q)) || (!r.c(this.s - this.p, this.t + this.q)) || (!r.c(this.s + this.p, this.t + this.q)))
      {
        h.a(this, this.s, this.t);
        this.t = (this.t + this.q & 0xFFFFFFF0);
        this.t -= this.q;
        this.t -= 1;
        bool = true;
      }
      break;
    case 2: 
      this.s -= this.m;
      if ((!r.c(this.s - this.p, this.t)) || (!r.c(this.s - this.p, this.t + this.q)) || (!r.c(this.s - this.p, this.t - this.q)))
      {
        h.a(this, this.s, this.t);
        this.s = (this.k & 0xFFFFFFF0);
        this.s += this.p;
        bool = true;
      }
      break;
    case 3: 
      this.s += this.m;
      if ((!r.c(this.s + this.p, this.t)) || (!r.c(this.s + this.p, this.t - this.q)) || (!r.c(this.s + this.p, this.t + this.q)))
      {
        h.a(this, this.s, this.t);
        this.s = (this.s + this.p & 0xFFFFFFF0);
        this.s -= this.p;
        this.s -= 1;
        bool = true;
      }
      break;
    }
    this.l = this.t;
    this.k = this.s;
    g();
    return bool;
  }
  
  public final void g()
  {
    int i1 = this.n >> 1;
    if (this.k < i1) {
      this.k = i1;
    }
    if (this.k > r.g - i1) {
      this.k = (r.g - i1);
    }
    if (this.l < 10) {
      this.l = 10;
    }
    if (this.l > r.h) {
      this.l = r.h;
    }
  }
  
  public final void h()
  {
    switch (this.r)
    {
    case 0: 
      this.r = 3;
      return;
    case 3: 
      this.r = 1;
      return;
    case 1: 
      this.r = 2;
      return;
    case 2: 
      this.r = 0;
    }
  }
  
  public final void i()
  {
    switch (this.r)
    {
    case 0: 
      this.r = 1;
      return;
    case 2: 
      this.r = 3;
      return;
    case 1: 
      this.r = 0;
      return;
    case 3: 
      this.r = 2;
    }
  }
  
  public final void j()
  {
    switch (this.r)
    {
    case 0: 
      this.r = 2;
      return;
    case 2: 
      this.r = 1;
      return;
    case 1: 
      this.r = 3;
      return;
    case 3: 
      this.r = 0;
    }
  }
  
  public final boolean b(int paramInt1, int paramInt2)
  {
    int i1 = k.I[paramInt1][0] * paramInt2;
    int i2 = k.I[paramInt1][1] * paramInt2;
    int i3 = this.k + i1;
    int i4 = this.l + i2;
    if (i1 != 0) {
      return (r.c(i3, i4)) && (r.c(i3, i4 + this.q)) && (r.c(i3, i4 - this.q));
    }
    if (i2 != 0) {
      return (r.c(i3, i4)) && (r.c(i3 + this.p, i4)) && (r.c(i3 - this.p, i4));
    }
    return false;
  }
  
  public final boolean k()
  {
    switch (this.r)
    {
    case 0: 
      return (r.c(this.k - this.m - this.p, this.l)) && (r.c(this.k - this.m - this.p, this.l - this.q)) && (r.c(this.k - this.m - this.p, this.l + this.q));
    case 2: 
      return (r.c(this.k, this.l + this.m + this.q)) && (r.c(this.k + this.p, this.l + this.m + this.q)) && (r.c(this.k - this.p, this.l + this.m + this.q));
    case 1: 
      return (r.c(this.k + this.m + this.p, this.l)) && (r.c(this.k + this.m + this.p, this.l + this.q)) && (r.c(this.k + this.m + this.p, this.l - this.q));
    case 3: 
      return (r.c(this.k, this.l - this.m - this.q)) && (r.c(this.k - this.p, this.l - this.m - this.q)) && (r.c(this.k + this.p, this.l - this.m - this.q));
    }
    return false;
  }
  
  public final void d(int paramInt)
  {
    switch (this.r)
    {
    case 0: 
      this.l += paramInt;
      return;
    case 2: 
      this.k += paramInt;
      return;
    case 1: 
      this.l -= paramInt;
      return;
    case 3: 
      this.k -= paramInt;
    }
  }
  
  public final boolean c(int paramInt1, int paramInt2)
  {
    return ((this.k > paramInt1) && (this.r == 2)) || ((this.k < paramInt1) && (this.r == 3)) || ((this.l > paramInt2) && (this.r == 0)) || ((this.l < paramInt2) && (this.r == 1));
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    for (int i1 = 0; i1 < 4; i1++)
    {
      this.r = ((byte)(this.r + 1));
      this.r = ((byte)(this.r % 4));
      if (c(paramInt1, paramInt2)) {
        return;
      }
    }
  }
  
  public final boolean a(d paramd)
  {
    if (paramd == null) {
      return false;
    }
    int i1 = this.r;
    int i2 = paramd.k;
    int i3;
    if ((i3 = paramd.l) < this.l) {
      this.r = 0;
    } else {
      this.r = 1;
    }
    if (Math.abs(i2 - this.k) > Math.abs(i3 - this.l)) {
      if (i2 > this.k) {
        this.r = 3;
      } else {
        this.r = 2;
      }
    }
    return this.r != i1;
  }
  
  public final byte a(byte paramByte)
  {
    if (paramByte % 2 == 0) {
      return (byte)(paramByte + 1);
    }
    return (byte)(paramByte - 1);
  }
  
  public final void b(d paramd)
  {
    if (paramd == null) {
      return;
    }
    byte b1 = a(paramd.r);
    if (this.r != b1) {
      this.r = b1;
    }
  }
  
  public final boolean l()
  {
    return (this.d >= 8) && (this.d <= 11);
  }
  
  public final boolean m()
  {
    return (this.d >= 12) && (this.d <= 15);
  }
  
  public final boolean n()
  {
    return (this.k >= r.b - this.n) && (this.k <= r.b + x.a + this.n) && (this.l >= r.c - this.o) && (this.l <= r.c + x.b + this.o);
  }
  
  public final boolean c(d paramd)
  {
    if (paramd == null) {
      return false;
    }
    return m.a(this.k - this.p / 2, this.l - this.q / 2, this.p, this.q, paramd.k - paramd.p / 2, paramd.l - paramd.q / 2, paramd.p, paramd.q);
  }
  
  public void c()
  {
    e(this.k - r.b, this.l - r.d);
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    Graphics localGraphics = x.s;
    if (this.c >= this.g.length)
    {
      System.out.println("actionIndex:" + this.d + ",frameIndex:" + this.c);
      return;
    }
    short[] arrayOfShort = this.g[this.c];
    for (int i11 = 0; i11 < arrayOfShort.length / 3; i11++)
    {
      int i9 = arrayOfShort[(i11 * 3)];
      int i10;
      if ((i10 = this.e[i9][0]) < s.m.length)
      {
        int i1 = this.e[i9][1];
        int i2 = this.e[i9][2];
        int i3 = this.e[i9][3];
        int i4 = this.e[i9][4];
        int i5 = arrayOfShort[(i11 * 3 + 1)];
        int i6 = arrayOfShort[(i11 * 3 + 2)];
        int i7 = paramInt1 + i5 - i3 / 2;
        int i8 = paramInt2 + i6 - i4 / 2;
        s.m.getClass();
        if ((i7 + i3 >= 0) && (i7 <= x.a) && (i8 + i4 >= 0) && (i8 <= x.b) && (s.m[i10] != null)) {
          if (this.e[i9].length <= 5) {
            m.a(localGraphics, s.m[i10], i7, i8, i1, i2, i3, i4, 0);
          } else {
            m.a(localGraphics, s.m[i10], i7, i8, i1, i2, i3, i4, this.e[i9][5]);
          }
        }
      }
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */