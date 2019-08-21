import com.MainMidlet;
import java.io.PrintStream;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class x
  extends Canvas
  implements Runnable, k
{
  private static int W = 240;
  private static int X = 320;
  public static int a = 240;
  public static int b = 320;
  public static int c = 0;
  public static int d = 0;
  public static String e = null;
  private static long Y = 70L;
  public static int f = 2;
  public static int g = -1;
  private static int Z = -1;
  public static final byte[][] h = { { -1, -1 }, { -1, -1 }, { -1, -1 }, { 4, 5 }, { -1, -1 }, { 0, -1 }, { 2, -1 }, { -1, 1 }, { 0, 1 } };
  private static int[] aa = new int[1];
  private int ab = 0;
  public static Font i;
  public static int j;
  public static int k;
  public String l = "打开声音?";
  private int ac = 0;
  public static String[] m = null;
  private int ad = 8;
  public static int n = 0;
  private static int ae = 0;
  public static Image o;
  public static Image p;
  public static boolean q = false;
  public static Image r;
  public static Graphics s = null;
  public int t = -1;
  public int J = 0;
  public static int K = -1;
  private static int af = -1;
  private static int ag = 64537;
  private static int ah = 64537;
  private static int ai = 64537;
  private static int aj = 64537;
  private static int ak = 64537;
  private static int al = 64537;
  private static int am = 64537;
  public static int L = -1;
  public static int M = -1;
  public static int N = 8;
  public static int O = 8;
  private static long an;
  private static long ao = 0L;
  private static long ap = 1000L;
  public static long P;
  public static boolean Q = false;
  public int R = 0;
  public int S = 0;
  private boolean aq = false;
  private boolean ar = false;
  public static boolean T = false;
  public static boolean U = false;
  public static boolean V = true;
  
  static
  {
    { "item1", "item2", "item3", "item4" }[4] = "item5";
    i = null;
    j = 12;
    k = 13;
    { "en" }[1] = "fr";
    { "english" }[1] = "francais";
  }
  
  public x(MainMidlet paramMainMidlet)
  {
    try
    {
      k();
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
  
  private void k()
  {
    l();
  }
  
  private void l()
  {
    e = System.getProperty("microedition.platform").toUpperCase();
    System.out.println("---platform" + e + "---");
    if (e.indexOf("NOKIA") >= 0) {
      f = 0;
    } else if (e.indexOf("SONY") >= 0) {
      f = 1;
    } else if (e.indexOf("MOTO") >= 0) {
      f = 2;
    } else if (e.indexOf("SAMSUNG") >= 0) {
      f = 3;
    }
    String str1 = "SOFT";
    String str2 = "SOFT1";
    String str3 = "SOFT2";
    String str4 = "SELECT";
    String str5 = "ENTER";
    String str6 = "LEFT";
    String str7 = "RIGHT";
    String str8 = "UP";
    String str9 = "DOWN";
    String str10 = null;
    for (int i1 = -127; i1 < 127; i1++) {
      try
      {
        str10 = getKeyName(i1);
        if ((ag == 64537) && ((str10.toUpperCase().indexOf(str2) >= 0) || ((str10.toUpperCase().indexOf(str1) >= 0) && (str10.toUpperCase().indexOf(str6) >= 0))))
        {
          ag = i1;
          System.out.println(i1 + "==KEY_SOFT1 from :" + str10);
        }
        else if ((ah == 64537) && ((str10.toUpperCase().indexOf(str3) >= 0) || ((str10.toUpperCase().indexOf(str1) >= 0) && (str10.toUpperCase().indexOf(str7) >= 0))))
        {
          ah = i1;
          System.out.println(i1 + "==KEY_SOFT2 from :" + str10);
        }
        else if ((al == 64537) && (str10.toUpperCase().indexOf(str8) >= 0))
        {
          al = i1;
          System.out.println(i1 + "==KEY_UP from :" + str10);
        }
        else if ((am == 64537) && (str10.toUpperCase().indexOf(str9) >= 0))
        {
          am = i1;
          System.out.println(i1 + "==KEY_DOWN from :" + str10);
        }
        else if ((aj == 64537) && (str10.toUpperCase().indexOf(str6) >= 0) && (str10.toUpperCase().indexOf(str1) < 0))
        {
          aj = i1;
          System.out.println(i1 + "==KEY_LEFT from :" + str10);
        }
        else if ((ak == 64537) && (str10.toUpperCase().indexOf(str7) >= 0) && (str10.toUpperCase().indexOf(str1) < 0))
        {
          ak = i1;
          System.out.println(i1 + "==KEY_RIGHT from :" + str10);
        }
        else if (((ai == 64537) && (str10.toUpperCase().indexOf(str4) >= 0)) || (str10.toUpperCase().indexOf(str5) >= 0))
        {
          ai = i1;
          System.out.println(i1 + "==KEY_SELECT from :" + str10);
        }
      }
      catch (Exception localException) {}
    }
    System.gc();
  }
  
  private void m()
  {
    W = getWidth();
    X = getHeight();
    if (a > W) {
      a = W;
    }
    if (b > X) {
      b = X;
    }
    m.a("SCREEN:" + W + "," + X, true);
    if (q)
    {
      r = Image.createImage(a, b);
      s = r.getGraphics();
    }
  }
  
  private void n()
  {
    setFullScreenMode(true);
    m();
    o();
    a(2);
  }
  
  private void o()
  {
    if (i == null) {
      i = Font.getFont(0, 0, 8);
    }
    j = i.stringWidth("测");
    if (j == 0) {
      j = 12;
    }
    i.stringWidth("9");
    k = i.getHeight();
    if (k == 0) {
      k = 13;
    }
  }
  
  private void p()
  {
    e.a(new short[] { 0, 28, 32 });
  }
  
  public final void a()
  {
    if (aa == null) {
      return;
    }
    d();
    if (K == 2) {
      this.ab -= 1;
    } else if (K == 3) {
      this.ab += 1;
    }
    this.ab = ((this.ab + aa.length) % aa.length);
    if (K == 3)
    {
      this.t = 0;
      this.J = ae;
      return;
    }
    if (K == 2)
    {
      this.t = 1;
      this.J = ae;
    }
  }
  
  public final void b()
  {
    
    if ((K == 2) && (this.ac > 0)) {
      this.ac -= 1;
    }
    if ((K == 3) && (this.ac + this.ad < m.length)) {
      this.ac += 1;
    }
  }
  
  public final void c()
  {
    int i1 = -1;
    if (K == 5) {
      i1 = L;
    } else if (K == 6) {
      i1 = M;
    } else if ((K == 4) || (K == 14)) {
      i1 = 0;
    }
    int i2 = 0;
    switch (i1)
    {
    case 0: 
      if ((aa != null) && (aa.length > 0) && (this.ab >= 0) && (this.ab < aa.length)) {
        if (aa[this.ab] == 10)
        {
          MainMidlet.a();
        }
        else if (aa[this.ab] == 11)
        {
          g.a = true;
          g.b = false;
          i2 = 1;
          a(6);
        }
        else
        {
          if (aa[this.ab] == 9)
          {
            g = 12;
            a(-1, -1);
            return;
          }
          if (g == 8) {
            m.b = this.ab == 0;
          }
          a(aa[this.ab]);
          i2 = 1;
        }
      }
      break;
    case 2: 
      e.j = true;
      a(0, 1);
      i2 = 1;
      break;
    case 4: 
      m.b = true;
      a(4);
      break;
    case 5: 
      m.b = false;
      a(4);
    case 1: 
      if (g == 10) {
        a(Z);
      } else {
        a(5);
      }
      i2 = 1;
    }
    if (i2 != 0) {
      f();
    }
  }
  
  private void q()
  {
    ae += 1;
    n += 1;
    K = af;
    if (U)
    {
      if (K == 5)
      {
        if (g == 5) {
          m.b(0, -1);
        } else if ((g == 6) && (e.g == null)) {
          m.b(1, -1);
        }
        U = false;
      }
      f();
      return;
    }
    switch (g)
    {
    case 0: 
      if (ae >= 30) {
        a(1);
      }
      f();
      return;
    case 1: 
      if (ae >= 30) {
        a(3);
      }
      f();
      return;
    case 2: 
      if (ae >= 30) {
        a(3);
      }
      f();
      return;
    case 3: 
      c();
      f();
      return;
    case 4: 
      if (s.b[0][0].length - 1 <= ae) {
        a(5);
      }
      f();
      return;
    case 5: 
      a();
      c();
      f();
      return;
    case 6: 
      e.b();
      return;
    case 7: 
      b();
      c();
      return;
    case 8: 
      if (K == 0) {
        this.ab -= 1;
      } else if (K == 1) {
        this.ab += 1;
      }
      this.ab = ((this.ab + 2) % 2);
      c();
      f();
      return;
    case 10: 
      a();
      c();
      f();
      return;
    case 12: 
      if (K == 5)
      {
        f();
        new Thread(new w(this)).start();
        MainMidlet.a();
        return;
      }
      if (K == 6)
      {
        a(0, -1);
        g = 5;
      }
      break;
    }
  }
  
  private void r()
  {
    this.ab = 0;
    ae = 0;
    this.ac = 0;
    f();
    this.t = -1;
  }
  
  public final void a(int paramInt)
  {
    b(paramInt);
  }
  
  public final void b(int paramInt)
  {
    if (paramInt != g)
    {
      r();
      a(g, false);
      a(paramInt, true);
      if (paramInt == 10) {
        Z = g;
      }
      g = paramInt;
    }
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {
      return;
    }
    if (paramBoolean) {
      a(h[paramInt][0], h[paramInt][1]);
    }
    switch (paramInt)
    {
    case 0: 
      if (paramBoolean)
      {
        o = m.a("cmcc");
        return;
      }
      o = null;
      System.gc();
      return;
    case 1: 
      if (paramBoolean)
      {
        o = m.a("mbox");
        return;
      }
      o = null;
      System.gc();
      return;
    case 2: 
      if (paramBoolean)
      {
        o = m.a("logo");
        p = m.a("misc");
        return;
      }
      o = null;
      System.gc();
      return;
    case 4: 
      if (paramBoolean)
      {
        if (p == null) {
          p = m.a("misc");
        }
        s.a();
        s.b();
        aa = new int[] { 5 };
        return;
      }
      System.gc();
      return;
    case 3: 
      if (paramBoolean)
      {
        aa = null;
        if (p == null) {
          p = m.a("misc");
        }
      }
      else
      {
        System.gc();
        return;
      }
      break;
    case 5: 
      if (paramBoolean)
      {
        m.b(0, -1);
        s.a();
        s.b();
        aa = new int[] { 6, 11, 8, 7, 9, 10 };
        g.b = true;
        return;
      }
      m.a();
      aa = null;
      System.gc();
      return;
    case 6: 
      if (paramBoolean)
      {
        aa = null;
        N = 2;
        O = 2;
        p();
        return;
      }
      e.j = false;
      m.a();
      N = 8;
      O = 8;
      return;
    case 7: 
      if (paramBoolean)
      {
        aa = new int[] { 5 };
        N = 15;
        O = 15;
        u.a = m.a("UI");
        m = m.a("游戏简介：|游戏介绍：闻名遐迩的《暗黑》原汁原味地呈现在您的面前，剽悍的野蛮人舞动起死亡旋风席卷整个大陆。强大的可视化功能，不计其数的武器装备，难以忘怀的经典任务，令人窒息的恐怖迷宫。在游戏中你就是那个曾经的野蛮人战神！在杀戮中释放强大的炙热火焰和令人恐惧的冰风暴！邪恶的不死军团已经降临，深入女王的墓地，恐怖的军营，以及阴森的丛林中。追朔当年回味无穷《暗黑》记忆！尽在暗黑战神（精装版）！战神苏醒了！||游戏规则：|野蛮人你已经苏醒了，整个大陆已经被恶魔所控制。作为战神你必须击败黑暗的力量，拯救苍生。营地是你的庇护所，提供你足够的情报和物品，外面是无尽的世界。挥动武器，解决问题！传送点提供你自由传送的力量。六大任务迎接你的挑战！||游戏操作：|方向键或数字键2，4，6，8：移动人物|确认键或数字键5：攻击|数字键1键：释放旋风斩|数字键3键：释放冰风暴|数字键7键：释放陨石雨|数字键9键：快速使用血瓶|数字键#键：快速使用蓝瓶|数字键*键：删除装备物品 |左软键 使用菜单||开发团队|程序：范树亮，周建桥|策划：杨文君，黄玉清|美术：吴倩，顾挺|测试：柏发渊 | |客服电话:021-63912145|客服EMAIL:Hotline@netwalk.com.cn|开发商：IN-FUSIO公司| ", '|', W - 40);
        this.ad = ((X - 50) / k);
        return;
      }
      N = 8;
      O = 8;
      u.a = null;
      System.gc();
      return;
    case 8: 
      if (paramBoolean)
      {
        N = 15;
        O = 15;
        aa = new int[] { 5, 5 };
        if (u.a == null) {
          u.a = m.a("UI");
        }
        this.ab = (m.b ? 0 : 1);
        return;
      }
      N = 8;
      O = 8;
      u.a = null;
      System.gc();
    }
  }
  
  public final void keyPressed(int paramInt)
  {
    af = c(paramInt);
  }
  
  public final int c(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    case 35: 
      i1 = 7;
      break;
    case 42: 
      i1 = 8;
      break;
    case 48: 
      i1 = 9;
      break;
    case 49: 
      i1 = 10;
      break;
    case 50: 
      i1 = 11;
      break;
    case 51: 
      i1 = 12;
      break;
    case 52: 
      i1 = 13;
      break;
    case 53: 
      i1 = 14;
      break;
    case 54: 
      i1 = 15;
      break;
    case 55: 
      i1 = 16;
      break;
    case 56: 
      i1 = 17;
      break;
    case 57: 
      i1 = 18;
      break;
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    default: 
      i1 = -1;
    }
    if (i1 == -1) {
      if (ah == 64537)
      {
        int i2 = -1;
        try
        {
          i2 = getGameAction(paramInt);
        }
        catch (Exception localException2)
        {
          Exception localException1;
          m.a = (localException1 = localException2).getMessage();
        }
        if (i1 == -1) {
          switch (i2)
          {
          case 2: 
            i1 = 0;
            break;
          case 5: 
            i1 = 1;
            break;
          case 1: 
            i1 = 2;
            break;
          case 6: 
            i1 = 3;
            break;
          case 8: 
            i1 = 4;
          }
        }
        if (i1 == -1) {
          if ((Math.abs(paramInt) == 6) || (Math.abs(paramInt) == 21)) {
            i1 = 5;
          } else if ((Math.abs(paramInt) == 7) || (Math.abs(paramInt) == 22)) {
            i1 = 6;
          }
        }
      }
      else if (paramInt == ag)
      {
        i1 = 5;
      }
      else if (paramInt == ah)
      {
        i1 = 6;
      }
      else if (paramInt == al)
      {
        i1 = 2;
      }
      else if (paramInt == am)
      {
        i1 = 3;
      }
      else if (paramInt == aj)
      {
        i1 = 0;
      }
      else if (paramInt == ak)
      {
        i1 = 1;
      }
      else if (paramInt == ai)
      {
        i1 = 4;
      }
    }
    return i1;
  }
  
  public final void keyReleased(int paramInt)
  {
    af = -1;
  }
  
  public static final void d()
  {
    if (K == 13)
    {
      K = 0;
      return;
    }
    if (K == 15)
    {
      K = 1;
      return;
    }
    if (K == 11)
    {
      K = 2;
      return;
    }
    if (K == 17)
    {
      K = 3;
      return;
    }
    if (K == 14) {
      K = 4;
    }
  }
  
  public static final boolean e()
  {
    return (K == 14) || (K == 4);
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2)
  {
    int i3;
    int i4;
    int i1;
    int i2;
    if (L != -1)
    {
      i3 = k.u[L][2];
      i4 = k.u[L][3];
      i1 = N;
      i2 = b - i4 - O;
      if ((paramInt1 > i1) && (paramInt1 < i1 + i3) && (paramInt2 > i2) && (paramInt2 < i2 + i4)) {
        af = 5;
      }
    }
    if (M != -1)
    {
      i3 = k.u[M][2];
      i4 = k.u[M][3];
      i1 = a - i3 - N;
      i2 = b - i4 - O;
      if ((paramInt1 > i1) && (paramInt1 < i1 + i3) && (paramInt2 > i2) && (paramInt2 < i2 + i4)) {
        af = 6;
      }
    }
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {}
  
  public static final void a(int paramInt1, int paramInt2)
  {
    L = paramInt1;
    M = paramInt2;
    System.out.println("setCommand:" + L + "," + M);
  }
  
  public static final void f()
  {
    af = -1;
    K = -1;
  }
  
  public static final void g()
  {
    if (e.j)
    {
      if (L != -1) {
        m.a(L, p, N + u.f, u.h - O, 36);
      }
      if (M != -1) {
        m.a(M, p, u.i - N, u.h - O, 40);
      }
    }
    else
    {
      if (L != -1) {
        m.a(L, p, N, b - O, 36);
      }
      if (M != -1) {
        m.a(M, p, a - N, b - O, 40);
      }
    }
  }
  
  public final void run()
  {
    n();
    try
    {
      Exception localException1;
      for (;;)
      {
        if (!Q)
        {
          P = ao - an;
          an = System.currentTimeMillis();
          ap -= P;
          if (ap < 0L)
          {
            ap += 1000L;
            if (ap < 0L) {
              ap = 1000L;
            }
            this.S = this.R;
            this.R = 0;
          }
          else
          {
            this.R += 1;
          }
          q();
          h();
          ao = System.currentTimeMillis();
          try
          {
            if (ao - an < Y) {
              Thread.sleep(Y - (ao - an));
            }
          }
          catch (Exception localException2)
          {
            (localException1 = localException2).printStackTrace();
          }
          ao = System.currentTimeMillis();
        }
      }
      return;
    }
    catch (Exception localException3)
    {
      (localException1 = localException3).printStackTrace();
    }
  }
  
  public static final void d(int paramInt)
  {
    s.setClip(0, 0, a, b);
    s.setColor(paramInt);
    s.fillRect(0, 0, a, b);
  }
  
  private void s()
  {
    e(0);
    s.a(s.b[0], s.a, a >> 1, b >> 1, 0, ae);
    s.a(s.b[2], s.a, a >> 1, b >> 1, 0, 0);
    g();
  }
  
  private void t()
  {
    s.a(s.b[1], s.a, a >> 1, b >> 1, 0, ae & 0x3);
    if (ae < 6)
    {
      s.a(s.b[3], s.a, a >> 1, b >> 1, 0, ae);
    }
    else if (this.t == 0)
    {
      s.a(s.b[3], s.a, a >> 1, b >> 1, 0, (this.ab + 1) * 6 + ae - this.J + 1);
      if ((this.ab == 1) && (ae - this.J == 1) && (!g.a("rmsGAME"))) {
        this.ab = 2;
      }
      if (ae - this.J + 1 >= 6) {
        this.t = -1;
      }
    }
    else if (this.t == 1)
    {
      s.a(s.b[3], s.a, a >> 1, b >> 1, 0, (this.ab + 7) * 6 + ae - this.J + 1);
      if ((this.ab == 1) && (ae - this.J == 1) && (!g.a("rmsGAME"))) {
        this.ab = 0;
      }
      if (ae - this.J + 1 >= 6) {
        this.t = -1;
      }
    }
    else if (this.t == -1)
    {
      s.a(s.b[3], s.a, a >> 1, b >> 1, 0, (this.ab + 2) * 6);
    }
    s.a(s.b[2], s.a, a >> 1, b >> 1, 0, 0);
    g();
  }
  
  private void u()
  {
    
    for (int i1 = this.ac; (i1 < this.ac + this.ad) && (i1 < m.length); i1++) {
      m.a(m[i1], 20, 20 + (i1 - this.ac) * k, 12303291, 0);
    }
    i1 = b - 30;
    if (this.ac > 0)
    {
      z.e(a >> 1, i1, (a >> 1) - 5, i1 + 5, 11184810);
      z.e(a >> 1, i1, (a >> 1) + 5, i1 + 5, 11184810);
      z.e((a >> 1) + 5, i1 + 5, (a >> 1) - 5, i1 + 5, 11184810);
    }
    if (this.ac + this.ad < m.length)
    {
      z.e(a >> 1, i1 + 15, (a >> 1) - 5, i1 + 5 + 5, 11184810);
      z.e(a >> 1, i1 + 15, (a >> 1) + 5, i1 + 5 + 5, 11184810);
      z.e((a >> 1) + 5, i1 + 5 + 5, (a >> 1) - 5, i1 + 5 + 5, 11184810);
    }
    g();
  }
  
  private void v()
  {
    u.i();
    int i1 = a >> 2;
    int i2 = b - u.e[6][3] >> 1;
    int i3 = (a >> 1) + 20;
    m.a("声音设置", a >> 1, a >> 2, 16777215, 3);
    m.a(s, u.a, i1, i2, u.e[6][0], u.e[6][1], u.e[6][2], u.e[6][3], 20, 0);
    m.a(s, u.a, i3, i2, u.e[6][0], u.e[6][1], u.e[6][2], u.e[6][3], 20, 0);
    if (this.ab == 0) {
      z.b(i1 + 2, i2 + 2, u.e[6][2] - 4, u.e[6][3] - 4, 902093);
    } else {
      z.b(i3 + 2, i2 + 2, u.e[6][2] - 4, u.e[6][3] - 4, 902093);
    }
    i2 += (u.e[6][3] - k.u[4][3]) / 2;
    i1 += 2;
    i3 += 2;
    m.a(s, p, i1 + u.e[6][2], i2, k.u[4][0], k.u[4][1], k.u[4][2], k.u[4][3], 20, 0);
    m.a(s, p, i3 + u.e[6][2], i2, k.u[5][0], k.u[5][1], k.u[5][2], k.u[5][3], 20, 0);
    g();
  }
  
  private void w() {}
  
  private void x()
  {
    e(16777215);
  }
  
  private void e(int paramInt)
  {
    d(paramInt);
    if (o != null)
    {
      s.setClip(0, 0, a, b);
      s.drawImage(o, (a - o.getWidth()) / 2, (b - o.getHeight()) / 2, 0);
    }
    g();
  }
  
  public final void h()
  {
    if (this.aq) {
      return;
    }
    this.aq = true;
    repaint();
    serviceRepaints();
    this.aq = false;
  }
  
  public final void paint(Graphics paramGraphics)
  {
    if (!q) {
      s = paramGraphics;
    }
    paramGraphics.setColor(10066329);
    paramGraphics.setClip(0, 0, W, X);
    paramGraphics.fillRect(0, 0, W, X);
    int i1 = (W - a) / 2;
    int i2 = (X - b) / 2;
    paramGraphics.translate(i1, i2);
    paramGraphics.setClip(c, d, a, b);
    i();
    if ((q) && (r != null)) {
      paramGraphics.drawImage(r, c, d, 0);
    }
    paramGraphics.translate(-i1, -i2);
    paramGraphics.setColor(0);
    paramGraphics.setClip(0, 0, W, i2);
    paramGraphics.fillRect(0, 0, W, i2);
    paramGraphics.setClip(0, 0, i1, X);
    paramGraphics.fillRect(0, 0, i1, X);
    paramGraphics.setClip(0, X - i2, W, i2);
    paramGraphics.fillRect(0, X - i2, W, i2);
    paramGraphics.setClip(W - i1, i2, i1, X);
    paramGraphics.fillRect(W - i1, i2, i1, X);
  }
  
  public final void i()
  {
    if (U)
    {
      d(0);
      m.a("暂停", a >> 1, b >> 1, 12303291, 3);
      m.a("确定", 0, b, 12303291, 36);
      return;
    }
    Object localObject;
    int i1;
    switch (g)
    {
    case 0: 
    case 1: 
    case 2: 
      x();
      break;
    case 3: 
      e(0);
      m.a(this.l, a >> 1, b >> 1, 16777215, 3);
      break;
    case 4: 
      s();
      break;
    case 5: 
      t();
      break;
    case 6: 
      d(0);
      w();
      break;
    case 7: 
      u();
      break;
    case 8: 
      v();
      break;
    case 10: 
      break;
    case 12: 
      e(0);
      localObject = m.a("点击确定将关闭程序并连接上网，请耐心等待。", '|', a - 20);
      for (i1 = 0; i1 < localObject.length; i1++) {
        m.a(localObject[i1], 10, (b >> 2) + i1 * k, 16777215, 0);
      }
      m.a("确定", 0, b, 16777215, 36);
      m.a("返回", a, b, 16777215, 40);
    }
    if (this.ar)
    {
      (localObject = s).setColor(16711680);
      ((Graphics)localObject).setFont(i);
      i1 = 0;
      ((Graphics)localObject).setClip(0, 0, a, b);
      ((Graphics)localObject).drawString("FPS:" + this.S, 10, 10, 0);
      ((Graphics)localObject).drawString("SH:" + X, 10, 30, 0);
      ((Graphics)localObject).drawString("FM:" + Runtime.getRuntime().freeMemory() / 1024L + "k " + ag, 10, 50, 0);
      if (m.a != null) {
        m.a(m.a, 0, 0, 16711680, 0);
      }
      if (n % 100 == 0) {
        System.gc();
      }
    }
  }
  
  public static final void j()
  {
    if (g == 5)
    {
      m.b(0, -1);
      return;
    }
    if ((g == 6) && (e.g == null)) {
      m.b(1, -1);
    }
  }
  
  public final void hideNotify()
  {
    super.hideNotify();
    Q = true;
    if (T)
    {
      m.a();
      if (V) {
        U = true;
      } else {
        U = false;
      }
      V = true;
      f();
      T = false;
    }
  }
  
  public final void showNotify()
  {
    super.showNotify();
    Q = false;
    if (!T)
    {
      f();
      T = true;
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\x.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */