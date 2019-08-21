public final class t
  extends b
{
  public t(byte paramByte, int paramInt1, int paramInt2)
  {
    super((byte)13, paramInt1, paramInt2);
    this.r = paramByte;
    this.d = this.r;
    this.k = paramInt1;
    this.l = paramInt2;
    this.m = 4;
    a();
    this.b = false;
  }
  
  public final void a()
  {
    if (this.e == null) {
      this.e = s.k;
    }
    if (this.f == null) {
      this.f = s.a(this.j);
    }
    a(this.d);
  }
  
  public final void a(byte paramByte, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = true;
    this.k = paramInt1;
    this.l = paramInt2;
    this.J = paramInt3;
    this.r = ((byte)(paramByte % 4));
    if ((this.r == 0) || (this.r == 1))
    {
      this.n = 9;
      this.o = 19;
      this.p = this.n;
      this.q = this.o;
    }
    else
    {
      this.n = 19;
      this.o = 9;
      this.p = this.n;
      this.q = this.o;
    }
    a(this.r);
  }
  
  public final boolean b()
  {
    d();
    if (f())
    {
      this.b = false;
      return this.b;
    }
    if (!n())
    {
      this.b = false;
      return this.b;
    }
    d locald;
    if (((locald = e.a) != null) && (((p)locald).a(this.k - this.n / 2, this.l - this.o / 2, this.n, this.o, this))) {
      this.b = false;
    }
    return this.b;
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\t.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */