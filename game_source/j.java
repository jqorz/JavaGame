public final class j
  implements Runnable
{
  public final n a;
  
  public j(n paramn)
  {
    this.a = paramn;
  }
  
  public final void run()
  {
    try
    {
      this.a.a = "==申请发送==";
      int i;
      n.e = (i = this.a.j.a(n.b, n.c)) == 4;
      this.a.a = ("==发送" + (n.e ? "成功" : "失败") + "==");
      n.d = false;
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */