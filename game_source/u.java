import com.MainMidlet;
import java.io.PrintStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class u
  implements k
{
  public static Image a = null;
  public static Image[] b;
  public static Image[] c = null;
  public static Image d = null;
  public static short[][] e = { { 0, 0, 16, 16 }, { 16, 0, 13, 32 }, { 0, 0, 1, 1 }, { 51, 87, 9, 9 }, { 42, 87, 9, 9 }, { 0, 16, 16, 16 }, { 44, 62, 16, 16 }, { 32, 0, 30, 30 }, { 0, 32, 30, 30 }, { 30, 32, 30, 30 }, { 0, 185, 30, 30 }, { 30, 185, 30, 30 }, { 0, 155, 30, 30 }, { 0, 215, 30, 30 }, { 30, 215, 30, 30 }, { 30, 155, 30, 30 }, { 0, 62, 22, 22 }, { 22, 62, 22, 22 }, { 0, 106, 22, 22 }, { 22, 106, 22, 22 }, { 0, 84, 21, 22 }, { 21, 84, 21, 22 }, { 44, 107, 10, 20 }, { 54, 107, 6, 9 }, { 44, 78, 8, 9 }, { 52, 78, 8, 9 }, { 52, 96, 8, 9 }, { 43, 96, 9, 8 }, { 0, 128, 60, 12 }, { 0, 140, 60, 15 } };
  private static String[] n = { "直接升级", "获得金币", "武神大斧", "武神头盔", "武神宝铠", "武神指环", "武神之靴", "武神护符" };
  private static String[] o = { "声音设置", "保存游戏", "帮助关于", "退出游戏" };
  private static String[] p = { "宝物", "状态", "物品", "技能", "任务", "系统" };
  private static String q = "名称";
  private static String r = "卖出价格";
  private static String s = "买入价格";
  private static String t = "金钱";
  private static String J = null;
  private static int K = 0;
  private static String[] L = null;
  private static int M = 0;
  private static int N = 4;
  private static int O = 0;
  public static int f;
  public static int g;
  public static int h;
  public static int i;
  public static int j = 0;
  public static int k = 0;
  public static int l = 0;
  public static int m = 0;
  private static short[][][] P = { { { 14 }, { 1 }, { 2 }, { 4 }, { 5 }, { 6 } }, { { 100, 101 }, { 102, 103 } }, { { 200, 200 }, { 200, 200 }, { 200, 200 }, { 201, 201, 201, 201, 201, 201, 201 }, { 201, 201, 201, 201, 201, 201, 201 }, { 201, 201, 201, 201, 201, 201, 201 }, { 201, 201, 201, 201, 201, 201, 201 } }, { { 203, 203, 203, 203, 203, 203, 203 }, { 203, 203, 203, 203, 203, 203, 203 }, { 203, 203, 203, 203, 203, 203, 203 }, { 203, 203, 203, 203, 203, 203, 203 }, { 204, 204, 204, 204, 204, 204, 204 }, { 204, 204, 204, 204, 204, 204, 204 }, { 204, 204, 204, 204, 204, 204, 204 }, { 204, 204, 204, 204, 204, 204, 204 } }, { { 300, 301, 302 } }, { { -1, -1, -1 }, { -1, -1, -1 } }, { { 10 }, { 12 }, { 11 }, { 13 } }, { { -1 } }, { { -1 } }, { { 206 } }, { { -1, -1 } }, { { -1 } }, { { -1 } }, { { -1 } }, { { 15 }, { 16 }, { 17 }, { 18 }, { 19 }, { 20 }, { 21 }, { 22 } }, { { -1 } }, { { -1 } }, { { -1 } }, { { -1 } }, { { -1 } }, { { -1 } }, { { -1 } }, { { -1 } } };
  
  public static final void a()
  {
    if (a == null) {
      a = m.a("UI");
    }
    if (d == null) {
      d = m.a("frame");
    }
    int i1;
    if (c == null)
    {
      c = new Image[11];
      for (i1 = 0; i1 < c.length; i1++) {
        c[i1] = m.a("fonts/" + i1);
      }
    }
    if (b == null)
    {
      b = new Image[23];
      for (i1 = 0; i1 < b.length; i1++) {
        b[i1] = m.a("icons/" + i1);
      }
    }
    f = e[1][2];
    g = e[1][2];
    h = x.b - e[1][2];
    i = x.a - e[1][2];
    j = 0;
    j();
  }
  
  private static void j()
  {
    l = 0;
    m = 0;
    k();
  }
  
  private static void k()
  {
    M = 0;
  }
  
  public static final void b() {}
  
  public static final void c()
  {
    
    if ((x.K >= 0) && (x.K <= 3))
    {
      if (j != 7) {
        m();
      }
      d();
      b();
    }
    l();
    boolean bool;
    switch (j)
    {
    case 3: 
      if (x.K == 9)
      {
        if ((bool = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF12", k.A[1]))) {
          p.L[7] += 30000;
        }
        b();
        return;
      }
      break;
    case 1: 
    case 4: 
      if (x.K == 9)
      {
        if ((bool = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF12", k.A[10]))) {
          ((p)e.a).K();
        }
        b();
        return;
      }
      break;
    case 0: 
      
    case 2: 
      if (x.K == 8)
      {
        c(202);
        b();
        return;
      }
      break;
    case 5: 
      
    case 6: 
      
    case 7: 
      
    case 8: 
      
    case 9: 
      if (x.n % 1 == 0)
      {
        if (O + L.length * x.k > h)
        {
          O -= 1;
          return;
        }
        e.k = true;
      }
      break;
    }
  }
  
  private static void l()
  {
    int i1 = -1;
    if (x.K == 5) {
      i1 = x.L;
    } else if (x.K == 6) {
      i1 = x.M;
    } else if (x.K == 4) {
      i1 = 0;
    }
    if (i1 == 0)
    {
      if (j == 10)
      {
        m.b = m == 0;
        if (m.b) {
          m.b(1, -1);
        } else {
          m.a();
        }
        b(k);
      }
      else if ((j != 12) && (j != 13) && (j >= 0) && (j < P.length) && (l < P[j].length) && (m < P[j][l].length))
      {
        c(P[j][l][m]);
      }
      b();
      return;
    }
    if (i1 == 3)
    {
      if ((j == 2) || (j == 3))
      {
        int i2;
        if ((i2 = e()) > 0)
        {
          if (j == 3) {
            L = m.a("按0键快速购买金币|" + l.a(i2, i - f).toString(), '|', i - f);
          } else {
            L = m.a(l.a(i2, i - f).toString(), '|', i - f);
          }
          b(7);
        }
      }
      else if (j == 4)
      {
        L = p.f(m, i - f);
        b(7);
      }
      else if (j == 5)
      {
        L = h.a(l * 3 + m, i - f);
        b(7);
      }
      else if (j == 1)
      {
        L = m.a("按0键能重置点数。|力量：影响攻击力。|敏捷：影响命中率和回避。|体力：增加最大生命值上限。|精力：增加法力上限影响魔法技能威力。||攻击力：数字越大给予敌人伤害越大。|防御力：数字越大受到敌人伤害越小。|命中：  数字越大越容易砍中敌人。|属性点：可以加到力量、敏捷、体力、精力四个属性上去的点数。", '|', i - f);
        b(7);
      }
      b();
      return;
    }
    if (i1 == 1)
    {
      if ((j == 0) || (j == 3) || (j == 8) || (j == 14))
      {
        e.j = false;
        x.a(2, -1);
      }
      else if (j == 7)
      {
        b(k);
      }
      else if ((j >= 10) && (j <= 13))
      {
        b(6);
      }
      else if ((j >= 15) && (j <= 22))
      {
        b(14);
      }
      else
      {
        b(0);
      }
      b();
    }
  }
  
  public static final void d()
  {
    if (L == null) {
      return;
    }
    if ((x.K == 2) && (M > 0)) {
      M -= 1;
    }
    if ((x.K == 3) && (M + N < L.length)) {
      M += 1;
    }
  }
  
  private static void c(int paramInt)
  {
    if (((paramInt <= 6) && (paramInt >= 0)) || (paramInt == 14))
    {
      b(paramInt);
      return;
    }
    if ((paramInt >= 10) && (paramInt <= 13))
    {
      if (paramInt == 13)
      {
        e.a();
        MainMidlet.b.a(5);
        return;
      }
      if (paramInt == 12)
      {
        g.a();
        return;
      }
      b(paramInt);
      if (paramInt == 10) {
        m = m.b ? 0 : 1;
      }
    }
    else
    {
      boolean bool1;
      if ((paramInt >= 15) && (paramInt <= 22))
      {
        bool1 = false;
        if ((paramInt >= 1) && (paramInt <= 16)) {
          bool1 = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF12", k.A[(paramInt - 15)]);
        } else {
          bool1 = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF3", k.A[(paramInt - 15)]);
        }
        if (bool1)
        {
          switch (paramInt)
          {
          case 15: 
            p.h(p.L[6] - p.L[5] + 1);
            return;
          case 16: 
            p.L[7] += 30000;
            return;
          case 17: 
            if (p.r())
            {
              p.e(438);
              return;
            }
            e.a(438, e.a.k, e.a.l);
            return;
          case 18: 
            if (p.r())
            {
              p.e(688);
              return;
            }
            e.a(688, e.a.k, e.a.l);
            return;
          case 19: 
            if (p.r())
            {
              p.e(687);
              return;
            }
            e.a(687, e.a.k, e.a.l);
            return;
          case 20: 
            if (p.r())
            {
              p.e(701);
              return;
            }
            e.a(701, e.a.k, e.a.l);
            return;
          case 21: 
            if (p.r())
            {
              p.e(689);
              return;
            }
            e.a(689, e.a.k, e.a.l);
            return;
          case 22: 
            if (p.r())
            {
              p.e(721);
              return;
            }
            e.a(721, e.a.k, e.a.l);
          }
          return;
        }
        System.out.println("false false");
        return;
      }
      if ((e.a.m()) || (!e.a.b)) {
        return;
      }
      int i1;
      switch (paramInt)
      {
      case 100: 
      case 101: 
      case 102: 
      case 103: 
        if (p.N[3] > 0)
        {
          p.N[3] -= 1;
          p.M[(0 + (paramInt - 100))] += 1;
          p.q();
        }
        else if ((bool1 = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF12", k.A[10])))
        {
          ((p)e.a).K();
        }
        b();
        return;
      case 200: 
        p.s();
        f();
        return;
      case 201: 
        p.t();
        f();
        return;
      case 202: 
        if (p.C())
        {
          f();
          f.a("物品已丢弃");
          return;
        }
        break;
      case 203: 
        p.A();
        return;
      case 204: 
        p.B();
        f();
        return;
      case 205: 
        if ((h.f != null) && (l < h.f.length))
        {
          if (h.f[l][1] == 2)
          {
            i1 = h.f[l][0];
            e.a(new short[] { i1, k.E[i1][0], k.E[i1][1] });
            return;
          }
          f.a("传送地未曾到达");
          return;
        }
        break;
      case 300: 
      case 301: 
      case 302: 
        i1 = 0 + paramInt - 300;
        if (p.Z > 0)
        {
          p.Z = (short)(p.Z - 1);
          p.V[i1][3] -= 1;
          if (p.V[i1][3] <= 0) {
            p.V[i1][0] += 1;
          }
          p.o();
        }
        else
        {
          boolean bool2;
          if ((bool2 = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF12", k.A[10]))) {
            ((p)e.a).K();
          }
        }
        b();
      }
    }
  }
  
  public static final int e()
  {
    int i1 = 0;
    if (j == 2)
    {
      if (l < p.R.length / 2) {
        i1 = p.R[(l * 2 + m)];
      } else {
        i1 = p.S[(l - p.R.length / 2)][m];
      }
    }
    else if (j == 3) {
      if (l < p.U.length) {
        i1 = p.U[l][m];
      } else {
        i1 = p.S[(l - p.U.length)][m];
      }
    }
    return i1;
  }
  
  public static final void a(int paramInt)
  {
    e.j = true;
    k = j;
    j = paramInt;
    j();
    b();
    switch (j)
    {
    case 3: 
      if (k != 7) {
        j();
      }
      J = l.b(e(), (byte)1);
      K = l.a(e(), (byte)4);
      x.a(3, 1);
      return;
    case 8: 
      h.c();
      P[8] = new short[h.f.length][];
      for (int i1 = 0; i1 < P[8].length; i1++)
      {
        P[8][i1] = new short[1];
        P[8][i1][0] = 'Í';
      }
      L = new String[h.f.length];
      for (i1 = 0; i1 < h.f.length; i1++) {
        L[i1] = k.y[h.f[i1][0]];
      }
      x.a(0, 1);
      N = (h - g - 30) / x.k;
      if (N > L.length)
      {
        N = L.length;
        return;
      }
      break;
    case 9: 
      O = h;
      L = m.a(" |开发团队|程序：范树亮，周建桥|策划：杨文君，黄玉清|美术：吴倩，顾挺|测试：柏发渊 | |客服电话:021-63912145|客服EMAIL:Hotline@netwalk.com.cn|开发商：IN-FUSIO公司|", '|', i - f);
      x.a(-1, -1);
    }
  }
  
  public static final void b(int paramInt)
  {
    e.j = true;
    k = j;
    j = paramInt;
    b();
    switch (j)
    {
    case 14: 
      L = n;
      k();
      N = (h - g - 30) / (x.k * 5 / 4);
      if (N > L.length) {
        N = L.length;
      }
      j();
      x.a(0, 1);
      return;
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
      L = m.a(k.A[(j - 15)], '|', i - f);
      k();
      N = (h - g - 30) / x.k;
      if (N > L.length) {
        N = L.length;
      }
      j();
      x.a(4, 5);
      return;
    case 0: 
      j();
      x.a(0, 1);
      return;
    case 1: 
      if (k != 7) {
        j();
      }
      x.a(3, 1);
      return;
    case 2: 
      if (k != 7) {
        j();
      }
      J = l.b(e(), (byte)1);
      K = l.a(e(), (byte)4);
      x.a(3, 1);
      return;
    case 3: 
      if (k != 7) {
        j();
      }
      J = l.b(e(), (byte)1);
      K = l.a(e(), (byte)4);
      x.a(3, 1);
      return;
    case 4: 
      j();
      x.a(3, 1);
      return;
    case 5: 
      if (k != 7) {
        j();
      }
      x.a(3, 1);
      return;
    case 6: 
      j();
      x.a(0, 1);
      return;
    case 7: 
      k();
      N = (h - g - 30) / x.k;
      if (N > L.length) {
        N = L.length;
      }
      x.a(-1, 1);
      return;
    case 10: 
      x.a(0, 1);
      return;
    case 11: 
      L = m.a("游戏简介：|游戏介绍：闻名遐迩的《暗黑》原汁原味地呈现在您的面前，剽悍的野蛮人舞动起死亡旋风席卷整个大陆。强大的可视化功能，不计其数的武器装备，难以忘怀的经典任务，令人窒息的恐怖迷宫。在游戏中你就是那个曾经的野蛮人战神！在杀戮中释放强大的炙热火焰和令人恐惧的冰风暴！邪恶的不死军团已经降临，深入女王的墓地，恐怖的军营，以及阴森的丛林中。追朔当年回味无穷《暗黑》记忆！尽在暗黑战神（精装版）！战神苏醒了！||游戏规则：|野蛮人你已经苏醒了，整个大陆已经被恶魔所控制。作为战神你必须击败黑暗的力量，拯救苍生。营地是你的庇护所，提供你足够的情报和物品，外面是无尽的世界。挥动武器，解决问题！传送点提供你自由传送的力量。六大任务迎接你的挑战！||游戏操作：|方向键或数字键2，4，6，8：移动人物|确认键或数字键5：攻击|数字键1键：释放旋风斩|数字键3键：释放冰风暴|数字键7键：释放陨石雨|数字键9键：快速使用血瓶|数字键#键：快速使用蓝瓶|数字键*键：删除装备物品 |左软键 使用菜单||开发团队|程序：范树亮，周建桥|策划：杨文君，黄玉清|美术：吴倩，顾挺|测试：柏发渊 | |客服电话:021-63912145|客服EMAIL:Hotline@netwalk.com.cn|开发商：IN-FUSIO公司| ", '|', i - f);
      k();
      N = (h - g - 30) / x.k;
      if (N > L.length) {
        N = L.length;
      }
      x.a(-1, 1);
      return;
    case 12: 
      x.a(-1, 1);
    }
  }
  
  private static void m()
  {
    int i1 = m;
    int i2 = l;
    if ((x.K == 0) || (x.K == 1))
    {
      if (x.K == 0) {
        m -= 1;
      } else if (x.K == 1) {
        m += 1;
      }
      m = (m + P[j][l].length) % P[j][l].length;
    }
    else if ((x.K == 2) || (x.K == 3))
    {
      if (x.K == 2) {
        l -= 1;
      } else if (x.K == 3) {
        l += 1;
      }
      l = (l + P[j].length) % P[j].length;
      if (m >= P[j][l].length) {
        m = 0;
      }
    }
    if ((i1 != m) || (i2 != l)) {
      f();
    }
  }
  
  public static final void f()
  {
    if ((j == 2) || (j == 3))
    {
      int i1;
      if ((i1 = e()) == 0)
      {
        J = null;
        return;
      }
      J = l.b(i1, (byte)1);
      K = l.a(i1, (byte)4);
    }
  }
  
  public static final void g()
  {
    switch (j)
    {
    case 14: 
      i();
      n();
      return;
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
      i();
      w();
      return;
    case 0: 
      i();
      o();
      return;
    case 1: 
      i();
      p();
      return;
    case 2: 
      i();
      q();
      return;
    case 3: 
      i();
      r();
      return;
    case 4: 
      i();
      s();
      return;
    case 5: 
      i();
      t();
      return;
    case 6: 
      i();
      u();
      return;
    case 8: 
      i();
      v();
      return;
    case 7: 
    case 11: 
      i();
      w();
      return;
    case 9: 
      y();
      return;
    case 10: 
      i();
      x();
    }
  }
  
  private static void n()
  {
    int i1 = x.a - x.j * 4 >> 1;
    int i2 = g;
    int i3 = x.k * 5 / 4;
    i2 += 10;
    int i4 = m.d(L[0]) + 2;
    int i5 = 0;
    if (l < N) {
      i5 = 0;
    } else if (l < L.length) {
      i5 = l - (N - 1);
    } else {
      i5 = L.length - N;
    }
    for (int i6 = i5; i6 < i5 + N; i6++)
    {
      i7 = i6 == l ? 902093 : 11184810;
      z.b(i1, i2 - 2 + -1, i4, 1, i7);
      z.b(i1, i2 + x.k + 1 + -1, i4 - 1, 1, i7);
      m.a(L[i6], i1 + i4 / 2, i2, i7, 1);
      i2 += i3;
    }
    i6 = x.b;
    int i7 = x.a;
    int i8 = i6 - 40;
    if (N < L.length - 1)
    {
      if (l > 0)
      {
        z.e(i7 >> 1, i8, (i7 >> 1) - 5, i8 + 5, 11184810);
        z.e(i7 >> 1, i8, (i7 >> 1) + 5, i8 + 5, 11184810);
        z.e((i7 >> 1) + 5, i8 + 5, (i7 >> 1) - 5, i8 + 5, 11184810);
      }
      if (l < L.length - 1)
      {
        z.e(i7 >> 1, i8 + 15, (i7 >> 1) - 5, i8 + 5 + 5, 11184810);
        z.e(i7 >> 1, i8 + 15, (i7 >> 1) + 5, i8 + 5 + 5, 11184810);
        z.e((i7 >> 1) + 5, i8 + 5 + 5, (i7 >> 1) - 5, i8 + 5 + 5, 11184810);
      }
    }
  }
  
  private static void o()
  {
    int i1 = f;
    int i2 = h - g;
    int i3 = g;
    int i4 = x.k * 5 / 4;
    i3 += (i2 - p.length * i4 >> 1);
    int i5 = m.d(p[0]) + 2;
    for (int i6 = 0; i6 < p.length; i6++)
    {
      i7 = i6 == l ? 902093 : 11184810;
      z.b(i1, i3 - 2 + -1, i5, 1, i7);
      m.a(p[i6], i1 + i5 / 2, i3, i7, 1);
      z.b(i1, i3 + x.k + 1 + -1, i5, 1, i7);
      i3 += i4;
    }
    i1 += i5;
    i6 = i - i1;
    i3 = g + 46 + (i2 - p.O.length * i4 - 46) / 2;
    s.a(i1 + i6 / 2, i3, 0, 5, x.n % e.a.f[5].length);
    int i7 = m.d(p.O[0]) + 1;
    int i8 = 0;
    int i9 = x.k;
    i1 += (i6 - (i7 + 96) >> 1);
    int i10 = 0;
    for (int i11 = 0; i11 < p.O.length; i11++)
    {
      int i12 = i1;
      m.a(p.O[i11], i12, i3, 12303291, 0);
      a(i12 += i7, i3, 96, x.k);
      if ((i10 == 1) || (i10 == 3) || (i10 == 5))
      {
        m.a(c, p.L[i10], i12 + 48 - 4, i3 + i9 / 2, 10);
        m.a(x.s, c[10], i12 + 48, i3 + i9 / 2, 3, 0);
        i10++;
        m.a(c, p.L[i10], i12 + 48 + 4, i3 + i9 / 2, 6);
      }
      else
      {
        m.a(c, p.L[i10], i12 + 48, i3 + i9 / 2, 3);
      }
      i3 += i4;
      i10++;
    }
  }
  
  private static void p()
  {
    int i1 = f;
    int i2 = g;
    int i3 = h - g;
    int i4 = i - f;
    int i5 = x.k * 5 / 4;
    int i6 = 0;
    i2 += (i3 - (p.P.length / 2 + p.Q.length) * i5 >> 1);
    int i7 = e[3][2];
    int i8 = e[3][3];
    int i9 = m.d(p.P[0]) + 1;
    int i10 = 0;
    int i11 = x.k;
    for (int i12 = 0; i12 < p.P.length; i12++)
    {
      i13 = i1 + (i4 - 4 - (i9 + 64) * 2) / 2;
      m.a(p.P[i12], i13, i2, 12303291, 0);
      a(i13 += i9, i2, 64, i11);
      m.a(c, p.M[i12], i13 + 32, i2 + i11 / 2, 3);
      i13 += 64;
      m.a(p.N[3] > 0 ? 4 : 3, a, e, i13, i2 + i11, 40, 0);
      if (l * 2 + m == i12) {
        z.c(i13 - i7, i2 + i11 - i8, i7, i8, 902093);
      }
      i13 += 4;
      i12++;
      if (i12 >= p.P.length) {
        break;
      }
      m.a(p.P[i12], i13, i2, 12303291, 0);
      a(i13 += i9, i2, 64, i11);
      m.a(c, p.M[i12], i13 + 32, i2 + i11 / 2, 3);
      i13 += 64;
      m.a(p.N[3] > 0 ? 4 : 3, a, e, i13, i2 + i11, 40, 0);
      if (l * 2 + m == i12) {
        z.c(i13 - i7, i2 + i11 - i8, i7, i8, 902093);
      }
      i2 += i5;
    }
    i12 = 64 + i9;
    int i13 = 0;
    for (int i14 = 0; i14 < p.Q.length; i14++)
    {
      int i15 = i1 + (i4 - i12) / 2;
      i9 = m.d(p.Q[i14]) + 1;
      m.a(p.Q[i14], i15, i2, 12303291, 0);
      i15 += i9;
      i10 = i12 - i9;
      a(i15, i2, i10, i11);
      m.a(c, p.N[i14], i15 + i10 / 2, i2 + i11 / 2, 3);
      i2 += i5;
    }
    m.a("0键", x.a >> 1, x.b - g, 12303291, 33);
  }
  
  private static void q()
  {
    int i1 = f;
    int i2 = g;
    int i3 = h - g;
    int i4 = i - f;
    int i5 = e[5][2];
    int i6 = e[5][3];
    int i7 = x.j * 6;
    int i8 = x.k;
    int i9 = x.k * 5 / 4;
    i2 += (i3 - i9 * p.T.length / 2 - p.S.length * i6 - i8 * 2) / 2;
    int i10 = m.d(p.T[0]) + 1;
    int i11 = x.k;
    int i12 = e();
    int i13 = 0;
    if (i12 == 0) {
      i13 = 902093;
    } else {
      i13 = l.a(i12);
    }
    for (int i14 = 0; i14 < p.T.length; i14++)
    {
      m.a(p.T[i14], i1, i2, 12303291, 0);
      m.a(5, a, e, i1 + i10, i2 + i11 / 2, 6, 0);
      a(p.R[i14], i1 + i10 + i5 / 2, i2 + i11 / 2);
      if (l * 2 + m == i14) {
        z.c(i1 + i10, i2 + i11 / 2 - i6 / 2, i5, i6, i13);
      }
      i14++;
      if (i14 >= p.T.length) {
        break;
      }
      m.a(p.T[i14], i1 + i4, i2, 12303291, 24);
      m.a(5, a, e, i1 + i4 - i10, i2 + i11 / 2, 10, 0);
      a(p.R[i14], i1 + i4 - i10 - i5 / 2, i2 + i11 / 2);
      if (l * 2 + m == i14) {
        z.c(i1 + i4 - i10 - i5, i2 + i11 / 2 - i6 / 2, i5, i6, i13);
      }
      i2 += i9;
    }
    i14 = (i9 * (p.T.length / 2) - 46) / 2;
    s.a(i1 + i4 / 2, i2 - i14, 0, 5, x.n % e.a.f[5].length);
    int i15 = 22 + i14 * 2;
    int i16 = 46 + i14;
    z.c(i1 + i4 / 2 - i15 / 2, i2 - i14 - i16 + (i16 - 46) / 2, i15, i16, 12303291);
    i1 += (i4 - p.S[0].length * i5) / 2;
    i9 = i6;
    int i17 = i2;
    for (int i18 = 0; i18 < p.S.length; i18++)
    {
      for (int i19 = 0; i19 < p.S[i18].length; i19++)
      {
        m.a(6, a, e, i1 + i19 * i5, i17, 20, 0);
        a(p.S[i18][i19], i1 + i19 * i5 + i5 / 2, i17 + i6 / 2);
      }
      i17 += i9;
    }
    if (l >= p.T.length / 2) {
      z.c(i1 + i5 * m, i2 + i9 * (l - p.T.length / 2), i5, i6, i13);
    }
    i2 = i17 + i8;
    if (J != null)
    {
      if (i13 == 902093) {
        i13 = 12303291;
      }
      i1 = f + (i4 - m.d(q) - i7 - 1) / 2;
      m.a(q, i1, i2, 12303291, 0);
      a(i1 += m.d(q) + 2, i2 + -1, i7, i8);
      m.a(J, i1 + i7 / 2, i2, i13, 1);
    }
  }
  
  private static void r()
  {
    int i1 = e[5][2];
    int i2 = e[5][3];
    int i3 = x.k;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7;
    int i8 = (i7 = p.U.length * (i2 + 2)) * 2 + 24 + i3 * 3 + 4;
    int i9 = p.S[0].length * (i1 + 2);
    int i10 = (x.a - i9) / 2;
    int i11 = (x.b - i8) / 2;
    int i12 = i10;
    int i13 = i11;
    z.c(i10 - 12, i11 - 3, i9 + 24, i7 + 6, 6710886);
    for (int i14 = 0; i14 < p.U.length; i14++)
    {
      for (i15 = 0; i15 < p.U[i14].length; i15++) {
        if (a != null)
        {
          m.a(6, a, e, i10 + i15 * (i1 + 2), i11, 20, 0);
          a(p.U[i14][i15], i10 + i15 * (i1 + 2) + i1 / 2, i11 + i2 / 2);
        }
      }
      i11 += i2 + 2;
    }
    i11 += 12;
    z.c(i10 - 12, i11 - 3, i9 + 24, i7 + 6, 6710886);
    for (i14 = 0; i14 < p.S.length; i14++)
    {
      for (i15 = 0; i15 < p.S[i14].length; i15++)
      {
        m.a(6, a, e, i10 + i15 * (i1 + 2), i11, 20, 0);
        a(p.S[i14][i15], i10 + i15 * (i1 + 2) + i1 / 2, i11 + i2 / 2);
      }
      i11 += i2 + 2;
    }
    i14 = e();
    int i15 = 0;
    if (i14 == 0) {
      i15 = 902093;
    } else {
      i15 = l.a(i14);
    }
    z.c(i12 + (i1 + 2) * m, i13 + (i2 + 2) * l + (l >= p.U.length ? 12 : 0), i1, i2, i15);
    i11 += 12;
    int i16 = 0;
    i10 += 2;
    int i17 = m.d(t) + 1;
    int i18 = 0;
    m.a(t, i10, i11, 12303291, 0);
    a(i10 + i17 + 2, i11 + -1, 48, i3);
    m.a(c, p.L[7], i10 + i17 + 2 + 24, i11 + i3 / 2 + -1, 3);
    i11 += i3 + 2;
    if (J != null)
    {
      i17 = m.d(q) + 1;
      int i19 = m.d(J) + 2;
      m.a(q, i10, i11, 12303291, 0);
      a(i10 + i17 + 2, i11 + -1, i19, i3);
      m.a(J, i10 + i17 + 2 + i19 / 2, i11 + -1, 12303291, 1);
      i11 += i3 + 2;
      if (l < p.U.length)
      {
        i17 = m.d(s) + 1;
        m.a(s, i10, i11, 12303291, 0);
        a(i10 + i17 + 2, i11 + -1, 48, i3);
        m.a(c, K, i10 + i17 + 2 + 24, i11 + i3 / 2 + -1, 3);
      }
      else
      {
        i17 = m.d(r) + 1;
        m.a(r, i10, i11, 12303291, 0);
        a(i10 + i17 + 2, i11 + -1, 48, i3);
        m.a(c, K * 10 / 100, i10 + i17 + 2 + 24, i11 + i3 / 2 + -1, 3);
      }
    }
    m.a("0键", x.a >> 1, x.b - g, 12303291, 33);
  }
  
  private static void s()
  {
    int i1 = f;
    int i2 = g;
    int i3 = h - g;
    int i4 = i - f;
    int i5 = e[7][2];
    int i6 = e[7][3];
    int i7 = (i4 - p.V.length * i5) / (p.V.length + 1);
    int i8 = x.k * 5 / 4;
    int i9 = (i3 - i8 * p.V.length - i6) / 3;
    i2 += (i3 - i8 * (2 + p.V.length) - i6 - i9) / 2;
    int i10 = i1 + i7;
    for (int i11 = 0; i11 < p.V.length; i11++)
    {
      m.a(7 + i11, a, e, i10, i2, 20, 0);
      z.c(i10, i2, e[(7 + i11)][2], e[(7 + i11)][3], 6710886);
      i10 += i5;
      m.a(p.Z > 0 ? 4 : 3, a, e, i10, i2 + i6, 40, 0);
      i12 = e[3][2];
      i13 = e[3][3];
      if (i11 == m) {
        z.c(i10 - i12, i2 + i6 - i13, i12, i13, 902093);
      }
      i10 += i7;
    }
    i2 += i6 + i9 / 2;
    i11 = m.d(p.aa) + 1;
    int i12 = 0;
    int i13 = x.k;
    i10 = i1 + (i4 - i11 - 64) / 2;
    m.a(p.aa, i10, i2, 12303291, 20);
    b(i10 += i11, i2, 64, i13);
    m.a(c, p.Z, i10 + 32, i2 + i13 / 2, 3);
    i2 += i8 + i9 / 2;
    i12 = (i11 = m.d(p.Y[0]) + 1) + 4;
    for (int i14 = 0; i14 < p.Y.length; i14++)
    {
      i10 = i1 + (i4 - i11 - i12) / 2;
      m.a(p.Y[i14], i10, i2, 12303291, 0);
      a(i10 += i11, i2, i12, i13);
      m.a(c, p.V[m][i14], i10 + i12 / 2, i2 + i13 / 2, 3);
      i2 += i8;
    }
    m.a("0键", x.a >> 1, x.b - g, 12303291, 33);
  }
  
  private static void t()
  {
    int i1 = f;
    int i2 = g;
    int i3 = h - g;
    int i4 = i - f;
    int i5 = e[10][2];
    int i6 = e[10][3];
    int i7 = 0;
    int i8 = h.c.length > 3 ? 3 : h.c.length;
    int i9 = (h.c.length + 3 - 1) / 3;
    int i10 = (i4 - i8 * i5) / (i8 + 1);
    int i11 = x.k * 5 / 4;
    int i12 = (i3 - (i9 * i6 + i11)) / (11 + (i9 - 1));
    i2 += i12 * 4;
    int i14 = 0;
    int i15 = 0;
    while (i15 < h.c.length)
    {
      i13 = i1 + i10;
      for (i16 = 0; i16 < i8; i16++)
      {
        m.a(10 + i15, a, e, i13, i2, 20, 0);
        if (i15 == m + l * 3) {
          i14 = 902093;
        } else if (h.b(i15)) {
          i14 = 16777215;
        } else if (h.a(i15)) {
          i14 = 255;
        } else {
          i14 = 6710886;
        }
        z.c(i13, i2, i5, i6, i14);
        i13 += i5 + i10;
        i15++;
        if (i15 >= h.c.length) {
          break;
        }
      }
      i2 += i6 + i12;
    }
    i2 += i12 * 2;
    i15 = m.d("任务名称") + 2;
    int i16 = m.d(h.c[(m + l * 3)]) + x.j;
    int i17 = x.k;
    int i13 = i1 + (i4 - i15 - i16) / 2;
    m.a("任务名称", i13, i2, 12303291, 20);
    a(i13 += i15, i2 + -1, i16, i17);
    m.a(h.c[(m + l * 3)], i13 + i16 / 2, i2, 12303291, 17);
  }
  
  private static void u()
  {
    int i1 = x.a - x.j * 4 >> 1;
    int i2 = h - g;
    int i3 = g;
    int i4 = x.k * 6 / 4;
    i3 += (i2 - o.length * i4 >> 1);
    int i5 = m.d(o[0]) + 2;
    for (int i6 = 0; i6 < o.length; i6++)
    {
      int i7 = i6 == l ? 902093 : 11184810;
      z.b(i1, i3 - 2 + -1, i5, 1, i7);
      z.b(i1, i3 + x.k + 1 + -1, i5 - 1, 1, i7);
      m.a(o[i6], i1 + i5 / 2, i3, i7, 1);
      i3 += i4;
    }
  }
  
  public static final void h()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = e[29][3];
    z.b(0, 0 + i3 - 5, p.L[1] * 97 / p.L[2], 5, 16711680);
    m.a(28, a, e, 0, 0 + i3, 36, 0);
    m.a(29, a, e, 0 + e[28][2], 0 + i3, 36, 0);
    z.b(0, 0 + i3, p.L[3] * 97 / p.L[4], 5, 255);
    m.a(28, a, e, 0, 0 + i3 - 1, 20, 5);
    m.a(29, a, e, 0 + e[28][2], 0 + i3 - 1, 20, 5);
    i1 = x.a;
    i2 = x.b;
    m.a(22, a, e, i1, i2, 40, 4);
    i1 -= e[22][2];
    m.a(22, a, e, i1, i2, 40, 0);
    a(p.w(), i1, i2 - e[22][3] / 2);
    i1 -= e[22][2];
    m.a(27, a, e, i1, i2, 36, 0);
    m.a(22, a, e, i1, i2, 40, 4);
    i1 -= e[22][2];
    m.a(22, a, e, i1, i2, 40, 0);
    a(p.v(), i1, i2 - e[22][3] / 2);
    i1 -= e[22][2];
    m.a(26, a, e, i1, i2, 36, 0);
    m.a(x.s, a, i1, i2, e[21][0], e[21][1], e[21][2], e[21][3], 40, 0);
    i3 = e[21][3] * (40 - p.ae) / 40;
    m.a(x.s, a, i1, i2, e[20][0], e[20][1] + e[20][3] - i3, e[20][2], i3, 40, 0);
    i1 -= e[20][2];
    m.a(25, a, e, i1, i2, 36, 0);
    m.a(x.s, a, i1, i2, e[19][0], e[19][1], e[19][2], e[19][3], 40, 0);
    i3 = e[19][3] * (40 - p.ad) / 40;
    m.a(x.s, a, i1, i2, e[18][0], e[18][1] + e[18][3] - i3, e[18][2], i3, 40, 0);
    i1 -= e[18][2];
    m.a(24, a, e, i1, i2, 36, 0);
    m.a(x.s, a, i1, i2, e[16][0], e[16][1], e[16][2], e[16][3], 40, 0);
    i1 -= e[18][2];
    m.a(23, a, e, i1, i2, 36, 0);
    m.a(3, d, k.v, x.a, x.b - e[22][3], 40, 0);
    m.a(4, d, k.v, x.a - 19, x.b - e[22][3], 40, 0);
    m.a(6, x.p, x.a - (k.v[3][2] >> 1), x.b - e[22][3] - (k.v[3][3] >> 1), 3);
    m.a(5, d, k.v, x.a, x.b - e[22][3] - k.v[3][3] - (x.n / 2 % 2 == 0 ? 0 : 2), 40, 0);
    m.a(x.n / 100 % 3 == 1 ? 1 : x.n / 100 % 3 == 0 ? 0 : 2, d, k.v, x.a - (k.v[3][2] >> 1), x.b - e[22][3] - k.v[3][3] - 15 - (k.v[3][3] >> 1) - (x.n / 2 % 2 == 0 ? 0 : 2), 3, 0);
  }
  
  private static void v()
  {
    if (L == null) {
      return;
    }
    int i2 = 0;
    for (int i3 = 0; i3 < L.length; i3++)
    {
      i4 = m.d(L[i3]);
      if (i2 < i4) {
        i2 = i4;
      }
    }
    int i1 = f + (i - f - i2) / 2;
    i3 = x.k * N;
    int i4 = g + (h - g - i3) / 2;
    int i5 = 12303291;
    for (int i6 = 0; i6 < N; i6++)
    {
      int i7;
      if ((i7 = i6 + M) >= L.length) {
        return;
      }
      if ((h.f != null) && (i7 <= h.f.length)) {
        if (l == i6) {
          i5 = 902093;
        } else if (h.f[i7][1] == 1) {
          i5 = 6710886;
        } else {
          i5 = 16777215;
        }
      }
      m.a(L[i7], i1 + (i2 - m.d(L[i6])) / 2, i4 + x.k * i6, i5, 0);
    }
  }
  
  private static void w()
  {
    if (L == null) {
      return;
    }
    int i2 = 0;
    for (int i3 = 0; i3 < L.length; i3++)
    {
      i4 = m.d(L[i3]);
      if (i2 < i4) {
        i2 = i4;
      }
    }
    int i1 = f + (i - f - i2) / 2;
    i3 = g + (h - g - x.k * N) / 2;
    for (int i4 = 0; i4 < N; i4++)
    {
      if (i4 + M >= L.length) {
        break;
      }
      m.a(L[(M + i4)], i1, i3 + x.k * i4, 12303291, 0);
    }
    i4 = x.b;
    int i5 = x.a;
    int i6 = i4 - 30;
    if (M > 0)
    {
      z.e(i5 >> 1, i6, (i5 >> 1) - 5, i6 + 5, 11184810);
      z.e(i5 >> 1, i6, (i5 >> 1) + 5, i6 + 5, 11184810);
      z.e((i5 >> 1) + 5, i6 + 5, (i5 >> 1) - 5, i6 + 5, 11184810);
    }
    if (M + N < L.length)
    {
      z.e(i5 >> 1, i6 + 15, (i5 >> 1) - 5, i6 + 5 + 5, 11184810);
      z.e(i5 >> 1, i6 + 15, (i5 >> 1) + 5, i6 + 5 + 5, 11184810);
      z.e((i5 >> 1) + 5, i6 + 5 + 5, (i5 >> 1) - 5, i6 + 5 + 5, 11184810);
    }
  }
  
  private static void x()
  {
    int i1 = x.a >> 2;
    int i2 = x.b - e[6][3] >> 1;
    int i3 = (x.a >> 1) + 20;
    m.a("声音设置", x.a >> 1, x.a >> 2, 16777215, 3);
    m.a(x.s, a, i1, i2, e[6][0], e[6][1], e[6][2], e[6][3], 20, 0);
    m.a(x.s, a, i3, i2, e[6][0], e[6][1], e[6][2], e[6][3], 20, 0);
    if (m == 0) {
      z.b(i1 + 2, i2 + 2, e[6][2] - 4, e[6][3] - 4, 902093);
    } else {
      z.b(i3 + 2, i2 + 2, e[6][2] - 4, e[6][3] - 4, 902093);
    }
    i2 += (e[6][3] - k.u[4][3]) / 2;
    i1 += 2;
    i3 += 2;
    m.a(4, x.p, i1 + e[6][2], i2, 20);
    m.a(5, x.p, i3 + e[6][2], i2, 20);
  }
  
  private static void y()
  {
    x.d(0);
    s.a(i - 30, g + 60, 0, 5, x.n % e.a.f[5].length);
    if (L == null) {
      return;
    }
    int i2 = 0;
    for (int i3 = 0; i3 < L.length; i3++) {
      m.d(L[i3]);
    }
    int i1 = f;
    i3 = O;
    Graphics localGraphics;
    (localGraphics = x.s).setClip(f, g, i - f, h - g);
    localGraphics.setColor(12303291);
    localGraphics.setFont(x.i);
    for (int i4 = 0; i4 < L.length; i4++) {
      localGraphics.drawString(L[i4], i1, i3 + x.k * i4, 20);
    }
  }
  
  public static final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((b == null) || (paramInt1 <= 0)) {
      return;
    }
    int i1;
    if ((i1 = l.a(paramInt1, (byte)2)) > 0)
    {
      i1--;
      if (i1 < b.length)
      {
        if (b[i1] != null) {
          m.a(b[i1], paramInt2, paramInt3, 3, 0);
        }
      }
      else {
        System.out.println("iconIndex error:" + i1);
      }
    }
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    z.b(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2, 10460572);
    z.b(paramInt1, paramInt2, paramInt3, paramInt4, 2236962);
  }
  
  private static void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    z.b(paramInt1, paramInt2, paramInt3, paramInt4, 1344136);
    z.b(paramInt1 + 1, paramInt2 + 1, paramInt3 - 2, paramInt4 - 2, 2236962);
  }
  
  public static final void i()
  {
    Graphics localGraphics = x.s;
    if (a == null) {
      return;
    }
    int i1 = 0;
    int i2 = 0;
    z.b(0, 0, x.a, x.b, 0);
    i2 = e[1][3];
    for (int i3 = 0; i3 < x.b / i2 + 1; i3++)
    {
      m.a(localGraphics, 1, a, e, 0, i3 * i2, 0, 0);
      m.a(localGraphics, 1, a, e, x.a, i3 * i2, 24, 4);
    }
    for (i3 = 0; i3 < x.a / i2 + 1; i3++)
    {
      m.a(localGraphics, 1, a, e, i3 * i2, 0, 0, 3);
      m.a(localGraphics, 1, a, e, i3 * i2, x.b, 36, 1);
    }
    m.a(localGraphics, 0, a, e, 0, 0, 0, 0);
    m.a(localGraphics, 0, a, e, x.a, 0, 24, 4);
    m.a(localGraphics, 0, a, e, 0, x.b, 36, 5);
    m.a(localGraphics, 0, a, e, x.a, x.b, 40, 2);
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\u.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */