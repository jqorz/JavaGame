import java.io.PrintStream;

public final class y
{
  private int b;
  public int a;
  private Object[] c;
  
  public y(int paramInt)
  {
    this.b = paramInt;
    this.c = new Object[paramInt];
    this.a = 0;
  }
  
  public final void a(Object paramObject)
  {
    if (this.a >= this.b)
    {
      System.out.println("################# not enough room in Vector #################");
      return;
    }
    this.c[this.a] = paramObject;
    this.a += 1;
  }
  
  public final void a()
  {
    for (int i = 0; i < this.a; i++) {
      this.c[i] = null;
    }
    this.a = 0;
  }
  
  public final boolean b(Object paramObject)
  {
    for (int i = 0; i < this.a; i++) {
      if (this.c[i].equals(paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public final Object a(int paramInt)
  {
    if (paramInt >= this.a) {
      return null;
    }
    return this.c[paramInt];
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\y.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */