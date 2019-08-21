public final class v
  extends d
{
  private int K = 0;
  public boolean J = false;
  
  public v(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = true;
    this.J = false;
    this.j = 100;
    this.K = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
    a();
  }
  
  public final void a()
  {
    this.n = 16;
    this.o = 16;
    this.p = this.n;
    this.q = this.o;
  }
  
  public final boolean b()
  {
    p localp;
    if (((localp = (p)e.a) == null) || (localp.m()) || (!localp.b)) {
      return true;
    }
    if (localp.c(this))
    {
      if (!this.J)
      {
        this.J = true;
        if (p.e(this.K))
        {
          int i = l.a(this.K);
          f.a("获得" + l.b(this.K, (byte)1), i);
          this.b = false;
        }
        else
        {
          f.b("储物箱已满");
        }
      }
    }
    else {
      this.J = false;
    }
    return true;
  }
  
  public final void c()
  {
    if (!this.b) {
      return;
    }
    u.a(this.K, this.k - r.b, this.l - r.d);
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */