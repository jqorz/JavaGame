import com.MainMidlet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.util.Vector;

public final class p
  extends d
  implements k, o
{
  public static boolean J = true;
  public static byte K = 1;
  public static int[] L = new int[8];
  public static int[] M = new int[4];
  public static int[] N = new int[6];
  public static final String[] O = { "等级", "生命", "法力", "经验", "金钱" };
  public static final String[] P = { "力量", "敏捷", "体力", "精力" };
  public static final String[] Q = { "攻击", "防御", "命中", "属性点" };
  public static int[] R = null;
  public static int[][] S = new int[4][7];
  public static String[] T = { "武器", "头盔", "装甲", "项链", "鞋子", "戒指" };
  public static int[][] U = new int[4][7];
  public static int[][] V = { { 1 }, { 1 }, { 1 } };
  public static final String[] W = { "旋风斩", "冰风暴", "陨石雨" };
  public static final String[] X = { "旋转挥舞着武器，攻击角色周围区域内的所有敌人，并且期间自身无敌，每级伤害提升5%，力量影响旋风斩的威力。", "借助武器的力量引发冰风暴伤害周围的敌人，每级攻击伤害提升5%，精力影响冰风暴的威力。", "借助武器的力量召唤陨石雨伤害并砸晕周围的敌人，每级攻击伤害提升3%，精力影响陨石雨的威力。" };
  public static final String[] Y = { "技能等级", "技能伤害", "消耗法力", "升级需求" };
  public static short Z = 1;
  public static String aa = "技能点剩余";
  private static int ag = -1;
  private static int ah = -1;
  private static int ai = 45;
  private static int aj = 2;
  private static boolean ak = false;
  private static boolean al = false;
  public static int[][] ab = new int[aj * (360 / ai)][];
  public static int[][] ac = new int[aj * (360 / ai)][];
  public static int ad = 0;
  public static int ae = 0;
  public static int af = 30;
  
  static
  {
    new int[3][0] = -1;
    new int[3][0] = -1;
  }
  
  public final void a(DataInputStream paramDataInputStream)
  {
    L = m.a(L, paramDataInputStream);
    M = m.a(M, paramDataInputStream);
    N = m.a(N, paramDataInputStream);
    R = m.a(R, paramDataInputStream);
    S = m.a(S, paramDataInputStream);
    V = m.a(V, paramDataInputStream);
    Z = m.a(Z, paramDataInputStream);
    q();
    u();
  }
  
  public final void a(DataOutputStream paramDataOutputStream)
  {
    m.a(L, paramDataOutputStream);
    m.a(M, paramDataOutputStream);
    m.a(N, paramDataOutputStream);
    m.a(R, paramDataOutputStream);
    m.a(S, paramDataOutputStream);
    m.a(V, paramDataOutputStream);
    m.a(Z, paramDataOutputStream);
  }
  
  public p(int paramInt1, int paramInt2)
  {
    this.k = paramInt1;
    this.l = paramInt2;
    F();
  }
  
  public static final String[] f(int paramInt1, int paramInt2)
  {
    String str = "按0键能重置技能点数。|技能名称：" + W[paramInt1] + "|";
    return m.a(str = str + "技能描述：" + X[paramInt1], '|', paramInt2);
  }
  
  public final void a()
  {
    R = new int[6];
    for (int i = 0; i < S.length; i++) {
      for (int j = 0; j < S[i].length; j++) {
        S[i][j] = 0;
      }
    }
    e(1);
    e(6);
    e(100);
    e(300);
    R[0] = 339;
    L[0] = 1;
    M[0] = 10;
    M[1] = 10;
    M[2] = 10;
    M[3] = 10;
    N[3] = 0;
    q();
    u();
    L[1] = L[2];
    L[3] = L[4];
    L[5] = 0;
    L[7] = 100;
    for (i = 0; i < V.length; i++)
    {
      V[i][0] = 1;
      V[i][3] = 0;
    }
    o();
    Z = 1;
    O();
  }
  
  public static final void o()
  {
    V[0][1] = (N[0] * (100 + V[0][0] * 4) / 100);
    V[0][2] = (5 + (V[0][0] - 1) * 35 / 19);
    if (V[0][3] == 0) {
      V[0][3] = (V[0][0] + 1);
    }
    V[1][1] = (5 * M[3] * (100 + V[1][0] * 5) / 100);
    V[1][2] = (5 + (V[1][0] - 1) * 35 / 19);
    if (V[1][3] == 0) {
      V[1][3] = (V[1][0] + 1);
    }
    V[2][1] = (3 * M[3] * (100 + V[2][0] * 3) / 100);
    V[2][2] = (5 + (V[2][0] - 1) * 35 / 19);
    if (V[2][3] == 0) {
      V[2][3] = (V[2][0] + 1);
    }
  }
  
  public static final void p()
  {
    for (int i = 0; i < U.length; i++) {
      for (int j = 0; j < U[i].length; j++) {
        U[i][j] = 0;
      }
    }
    U[0][0] = 100;
    U[0][1] = 1;
    U[0][2] = 2;
    U[0][3] = 3;
    U[0][4] = 6;
    U[0][5] = 7;
    U[0][6] = 8;
    i = U[0].length;
    a(300, 500, 40, 5, i);
    i += 5;
    a(500, 700, 40, 10, i);
    U[(U.length - 1)][(U[(U.length - 1)].length - 1)] = '˗';
    U[(U.length - 1)][(U[(U.length - 1)].length - 2)] = '˖';
    U[(U.length - 1)][(U[(U.length - 1)].length - 3)] = 'ʴ';
    U[(U.length - 1)][(U[(U.length - 1)].length - 4)] = 'ʳ';
    U[(U.length - 1)][(U[(U.length - 1)].length - 5)] = 'ʲ';
    U[(U.length - 1)][(U[(U.length - 1)].length - 6)] = 'Ʒ';
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Vector localVector = new Vector();
    int i;
    if ((i = L[0]) > 40) {
      i = 40;
    }
    for (int j = paramInt1; j < paramInt2; j++)
    {
      if ((k = l.a(j, (byte)16)) < 0) {
        break;
      }
      if ((Math.abs(i - k) < paramInt3) && (l.f(j))) {
        localVector.addElement(j);
      }
    }
    if (localVector.size() <= 0) {
      return;
    }
    int[] arrayOfInt = m.a(0, localVector.size() - 1, paramInt4);
    int k = U[0].length;
    int m = paramInt5 / k;
    int n = paramInt5 % k;
    for (int i1 = 0; i1 < arrayOfInt.length; i1++)
    {
      if (m >= U.length) {
        return;
      }
      U[m][n] = Integer.parseInt((String)localVector.elementAt(arrayOfInt[i1]));
      n++;
      if (n >= k)
      {
        m++;
        n = 0;
      }
    }
  }
  
  public static final void q()
  {
    L[2] = (6 + 4 * L[0] + 4 * M[2] + l.a(R, 17));
    if (L[1] > L[2]) {
      L[1] = L[2];
    }
    L[4] = (2 * L[0] + 2 * M[3] - 2 + l.a(R, 18));
    if (L[3] > L[4]) {
      L[3] = L[4];
    }
    N[0] = (l.a(R[0], 11) + M[0] * 3);
    M[1] += l.a(R, 12);
    N[2] = (M[1] * 2 + l.a(R, 15));
    N[4] = l.a(R, 13);
    N[5] = l.a(R, 14);
    L[6] = (L[0] * L[0] * 7);
    s.e();
    o();
  }
  
  public static final boolean e(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < S.length; j++) {
      for (int k = 0; k < S[j].length; k++) {
        if (S[j][k] == 0)
        {
          S[j][k] = paramInt;
          h.c((short)paramInt);
          return true;
        }
      }
    }
    return false;
  }
  
  public static final boolean f(int paramInt)
  {
    for (int i = 0; i < S.length; i++) {
      for (int j = 0; j < S[i].length; j++) {
        if (S[i][j] == paramInt)
        {
          S[i][j] = 0;
          return true;
        }
      }
    }
    return false;
  }
  
  public static final boolean g(int paramInt)
  {
    int i;
    if (R != null) {
      for (i = 0; i < S.length; i++) {
        for (int j = 0; j < S[i].length; j++) {
          if (S[i][j] == paramInt) {
            return true;
          }
        }
      }
    }
    if (R != null) {
      for (i = 0; i < R.length; i++) {
        if (R[i] == paramInt) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static final boolean r()
  {
    for (int i = 0; i < S.length; i++) {
      for (int j = 0; j < S[i].length; j++) {
        if (S[i][j] == 0) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static final void s()
  {
    int i;
    if ((i = u.e()) <= 0) {
      return;
    }
    if (!r())
    {
      f.a("储物箱已满");
      return;
    }
    byte[] arrayOfByte = l.e(i);
    int j = l.c(i);
    int k = 0;
    int m = 0;
    if ((arrayOfByte != null) && (j >= 0)) {
      switch (j)
      {
      case 0: 
        f.a("这是您最后的武器");
        return;
      case 1: 
      case 2: 
        if (((k = l.a(i, (byte)8)) < 1) || (k > R.length)) {
          return;
        }
        m = R[(k - 1)];
        R[(k - 1)] = 0;
        e(m);
        q();
      }
    }
  }
  
  public static final void t()
  {
    int i;
    if ((i = u.e()) <= 0) {
      return;
    }
    byte[] arrayOfByte = l.e(i);
    int j = l.c(i);
    int k = 0;
    int m = 0;
    if ((arrayOfByte != null) && (j >= 0)) {
      switch (j)
      {
      case 0: 
      case 1: 
      case 2: 
        if (l.a(i, (byte)16) > L[0])
        {
          f.a("您的等级不够");
          return;
        }
        if (((m = l.a(i, (byte)8)) <= 0) || (m > R.length)) {
          return;
        }
        k = R[(m - 1)];
        R[(m - 1)] = i;
        S[(u.l - R.length / 2)][u.m] = k;
        q();
        return;
      case 3: 
        
      case 4: 
        D();
        e.a(new short[] { 0, k.E[0][0], k.E[0][1] });
        return;
      case 5: 
        x();
      }
    }
  }
  
  public static final void u()
  {
    ag = -1;
    ah = -1;
    for (int i = 0; i < S.length; i++) {
      for (int j = 0; j < S[i].length; j++) {
        if (S[i][j] > 0)
        {
          if ((ag < 0) && (l.a(S[i][j], (byte)5) > 0)) {
            ag = i * S[0].length + j;
          }
          if ((ah < 0) && (l.a(S[i][j], (byte)6) > 0)) {
            ah = i * S[0].length + j;
          }
        }
      }
    }
  }
  
  public static final int v()
  {
    if (ag < 0) {
      return -1;
    }
    return S[(ag / S[0].length)][(ag % S[0].length)];
  }
  
  public static final int w()
  {
    if (ah < 0) {
      return -1;
    }
    return S[(ah / S[0].length)][(ah % S[0].length)];
  }
  
  public static final boolean x()
  {
    int i;
    if ((i = u.e()) < 0) {
      return false;
    }
    int j = l.a(i, (byte)5);
    int k = l.a(i, (byte)6);
    if (j > 0)
    {
      if (L[1] == L[2])
      {
        f.a("生命值已满");
        return false;
      }
      L[1] += l.a(i, 5);
      if (L[1] > L[2]) {
        L[1] = L[2];
      }
    }
    else if (k > 0)
    {
      if (L[3] == L[4])
      {
        f.a("魔法值已满");
        return false;
      }
      L[3] += l.a(i, 6);
      if (L[3] > L[4]) {
        L[3] = L[4];
      }
    }
    D();
    u();
    return true;
  }
  
  public static final void y()
  {
    if ((ag < 0) || (L[1] == L[2])) {
      return;
    }
    int i = S[(ag / S[0].length)][(ag % S[0].length)];
    L[1] += l.a(i, 5);
    if (L[1] > L[2]) {
      L[1] = L[2];
    }
    S[(ag / S[0].length)][(ag % S[0].length)] = 0;
    u();
  }
  
  public static final void z()
  {
    if ((ah < 0) || (L[3] == L[4])) {
      return;
    }
    int i = S[(ah / S[0].length)][(ah % S[0].length)];
    L[3] += l.a(i, 6);
    System.out.println("add magic:" + l.a(i, (byte)6));
    if (L[3] > L[4]) {
      L[3] = L[4];
    }
    S[(ah / S[0].length)][(ah % S[0].length)] = 0;
    u();
  }
  
  public static final void A()
  {
    int i;
    if ((i = u.e()) <= 0) {
      return;
    }
    int j;
    if ((j = l.a(i, (byte)4)) > L[7])
    {
      boolean bool;
      if ((bool = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF12", k.A[1]))) {
        L[7] += 30000;
      }
      return;
    }
    if (!e(i))
    {
      f.a("储物箱已满");
      return;
    }
    f.a("买入 " + l.b(i, (byte)1));
    L[7] -= j;
    u();
  }
  
  public static final void B()
  {
    int i;
    if ((i = u.e()) <= 0) {
      return;
    }
    if (l.c(i) == 3)
    {
      f.a("不能删除任务物品");
      return;
    }
    int j = l.a(i, (byte)4);
    if (E())
    {
      f.a("物品已卖出");
      L[7] += j * 10 / 100;
    }
  }
  
  public static final boolean C()
  {
    int i;
    if ((i = u.e()) <= 0) {
      return false;
    }
    if (u.l < R.length / 2)
    {
      f.a("不能删除装备物品");
      return false;
    }
    if (l.c(i) == 3)
    {
      f.a("不能删除任务物品");
      return false;
    }
    S[(u.l - R.length / 2)][u.m] = 0;
    return true;
  }
  
  public static final boolean D()
  {
    int i;
    if ((i = u.e()) <= 0) {
      return false;
    }
    if (u.l < R.length / 2) {
      return false;
    }
    if (l.c(i) == 3) {
      return false;
    }
    S[(u.l - R.length / 2)][u.m] = 0;
    return true;
  }
  
  public static final boolean E()
  {
    if (u.l < U.length) {
      return false;
    }
    int i;
    if ((i = u.e()) <= 0) {
      return false;
    }
    if (l.c(i) == 3)
    {
      f.a("不能删除任务物品");
      return false;
    }
    S[(u.l - U.length)][u.m] = 0;
    return true;
  }
  
  public static final void h(int paramInt)
  {
    L[5] += paramInt;
    if (L[5] > L[6])
    {
      N[3] += 5;
      Z = (short)(Z + (1 + L[0] / 5 * 2));
      L[0] += 1;
      q();
      L[3] = L[4];
      L[1] = L[2];
      f.b("您已升至" + L[0] + "级", 60);
    }
  }
  
  public final void c()
  {
    super.c();
    I();
  }
  
  public final void F()
  {
    this.r = K;
    this.j = 0;
    this.e = s.k;
    this.h = new int[] { 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    this.f = s.a(this.j);
    a(K);
    if (J) {
      a();
    }
    J = false;
  }
  
  public final boolean b()
  {
    if (!this.b)
    {
      e.k = true;
      return false;
    }
    if (m())
    {
      if ((this.b) && (e())) {
        this.b = false;
      }
      return true;
    }
    if ((!H()) || (x.K == 10)) {
      switch (x.K)
      {
      case 0: 
      case 13: 
        this.r = 2;
        K = this.r;
        if (!b(6)) {
          d();
        }
        f();
        break;
      case 1: 
      case 15: 
        this.r = 3;
        K = this.r;
        if (!b(7)) {
          d();
        }
        f();
        break;
      case 2: 
      case 11: 
        this.r = 0;
        K = this.r;
        if (!b(4)) {
          d();
        }
        f();
        break;
      case 3: 
      case 17: 
        this.r = 1;
        K = this.r;
        if (!b(5)) {
          d();
        }
        f();
        break;
      case 4: 
      case 14: 
        if (!b(16 + this.r)) {
          d();
        }
        break;
      case 10: 
        if (!b((byte)0)) {
          N();
        }
        x.f();
        break;
      case 12: 
        b((byte)1);
        N();
        x.f();
        break;
      case 16: 
        b((byte)2);
        N();
        x.f();
        break;
      case 18: 
        y();
        N();
        x.f();
        break;
      case 7: 
        z();
        N();
        x.f();
        break;
      case 5: 
      case 6: 
      case 8: 
      case 9: 
      default: 
        N();
      }
    }
    G();
    P();
    M();
    return true;
  }
  
  private void M()
  {
    if ((x.n % 30 == 0) && (L[1] < L[2])) {
      L[1] += 1;
    }
    if ((x.n % 60 == 0) && (L[3] < L[4])) {
      L[3] += 1;
    }
  }
  
  private void N()
  {
    if ((this.d >= 4) && (this.d <= 7))
    {
      b(0 + this.r);
      return;
    }
    boolean bool;
    if (((bool = d())) && (((this.d >= 8) && (this.d <= 11)) || ((this.d >= 16) && (this.d <= 23)))) {
      b(0 + this.r);
    }
  }
  
  private boolean b(byte paramByte)
  {
    boolean bool = false;
    switch (paramByte)
    {
    case 0: 
      if (L[3] < V[0][2])
      {
        f.a("法力不足");
      }
      else if (b(20 + this.r))
      {
        L[3] -= V[0][2];
        bool = true;
      }
      break;
    case 1: 
      if (ad == 0)
      {
        if (L[3] < V[1][2])
        {
          f.a("法力不足");
        }
        else
        {
          a(paramByte, ab);
          ad = 40;
          L[3] -= V[1][2];
          bool = true;
        }
      }
      else {
        f.a("[冰风暴]准备中");
      }
      break;
    case 2: 
      if (ae == 0)
      {
        if (L[3] < V[2][2])
        {
          f.a("法力不足");
        }
        else
        {
          a(paramByte, ac);
          ae = 40;
          L[3] -= V[2][2];
          bool = true;
        }
      }
      else {
        f.a("[陨石雨]准备中");
      }
      break;
    }
    return bool;
  }
  
  private void O()
  {
    for (int i = 0; i < ab.length; i++) {
      ab[i] = new int[5];
    }
    for (i = 0; i < ac.length; i++) {
      ac[i] = new int[5];
    }
  }
  
  private void a(byte paramByte, int[][] paramArrayOfInt)
  {
    if (paramByte == 1) {
      ak = true;
    } else if (paramByte == 2) {
      al = true;
    }
    int i = 30;
    int j = 0;
    int n = x.b / 2;
    for (int i1 = 0; i1 < paramArrayOfInt.length; i1++)
    {
      int k = this.k - (i * m.c(j) >> 16);
      int m = this.l - (i * m.d(j) >> 16);
      paramArrayOfInt[i1][0] = 0;
      paramArrayOfInt[i1][1] = 0;
      paramArrayOfInt[i1][2] = m;
      paramArrayOfInt[i1][3] = k;
      paramArrayOfInt[i1][4] = (m - n);
      if ((j += ai) % 360 == 0)
      {
        i += 30;
        n += af * 2;
      }
    }
  }
  
  public static final void G()
  {
    if (ak) {
      ak = a(1, ab);
    } else if (ad > 0) {
      ad -= 1;
    }
    if (al)
    {
      al = a(2, ac);
      return;
    }
    if (ae > 0) {
      ae -= 1;
    }
  }
  
  private static boolean a(int paramInt, int[][] paramArrayOfInt)
  {
    int i = 0;
    if (paramInt == 1) {
      i = 10;
    } else if (paramInt == 2) {
      i = 11;
    }
    boolean bool = false;
    if (paramArrayOfInt != null) {
      for (int j = 0; j < paramArrayOfInt.length; j++) {
        if (paramArrayOfInt[j][0] >= 0)
        {
          bool = true;
          paramArrayOfInt[j][1] += 1;
          paramArrayOfInt[j][1] %= s.l[i][paramArrayOfInt[j][0]].length;
          paramArrayOfInt[j][4] += af;
          if (paramArrayOfInt[j][4] >= paramArrayOfInt[j][2])
          {
            r.a(4);
            paramArrayOfInt[j][4] = paramArrayOfInt[j][2];
            if (paramArrayOfInt[j][0] != 1)
            {
              paramArrayOfInt[j][0] = 1;
              paramArrayOfInt[j][1] = 0;
            }
            else if (paramArrayOfInt[j][1] == 0)
            {
              paramArrayOfInt[j][0] = -1;
            }
          }
          else
          {
            y localy;
            if ((localy = e.d) != null) {
              for (int k = 0; k < localy.a; k++)
              {
                d locald;
                if (((locald = (d)localy.a(k)).a) && (locald.j >= 7) && (locald.j <= 9)) {
                  ((b)locald).a(paramArrayOfInt[j][3] - 10, paramArrayOfInt[j][4] - 30, 20, 30, V[1][1], paramInt == 2 ? 30 + V[2][0] * 10 : 0);
                }
              }
            }
          }
        }
      }
    }
    return bool;
  }
  
  private void P()
  {
    if ((this.d >= 16) && (this.d <= 23))
    {
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
      y localy;
      if ((localy = e.d) == null) {
        return;
      }
      for (int i4 = 0; i4 < localy.a; i4++)
      {
        d locald;
        if (((locald = (d)localy.a(i4)).a) && (locald.j >= 7) && (locald.j <= 9))
        {
          b localb = (b)locald;
          int i5 = N[0] * (150 - localb.L) / 150 + N[4];
          localb.a(n, i1, i, j, i5);
        }
      }
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, b paramb)
  {
    boolean bool = false;
    if (m.a(this.k - this.n / 2, this.l - this.o, this.n, this.o, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      bool = true;
      if ((!l()) && (!m()) && ((this.d < 20) || (this.d > 23)) && (m.b(100) >= N[5]))
      {
        int i;
        if ((i = paramb.J * paramb.J - N[1]) < 0) {
          i = 2;
        }
        L[1] -= i;
        if (L[1] <= 0)
        {
          a(12 + this.r);
        }
        else
        {
          b(paramb);
          a(8 + this.r);
        }
      }
    }
    return bool;
  }
  
  public final boolean H()
  {
    if ((this.d >= 8) && (this.d <= 11))
    {
      boolean bool;
      if ((bool = d())) {
        a(0 + this.r);
      } else if (b(a(this.r), 5)) {
        d(2);
      }
      return true;
    }
    return false;
  }
  
  public static final void I()
  {
    int i;
    if (ak) {
      for (i = 0; i < ab.length; i++) {
        if (ab[i][0] >= 0) {
          s.a(ab[i][3] - r.b, ab[i][4] - r.c, 10, ab[i][0], ab[i][1]);
        }
      }
    }
    if (al) {
      for (i = 0; i < ac.length; i++) {
        if (ac[i][0] >= 0) {
          s.a(ac[i][3] - r.b, ac[i][4] - r.c, 11, ac[i][0], ac[i][1]);
        }
      }
    }
  }
  
  public final void J()
  {
    this.b = true;
    L[1] = L[2];
    L[3] = L[4];
    e.k = false;
    this.d = 0;
  }
  
  public final void K()
  {
    int i = 0;
    int j = 1;
    for (int k = 1; k < L[0]; k++)
    {
      i += 5;
      j = (short)(j + (1 + k / 5 * 2));
    }
    for (k = 0; k < V.length; k++)
    {
      V[k][0] = 1;
      V[k][3] = 0;
    }
    o();
    Z = j;
    M[0] = 10;
    M[1] = 10;
    M[2] = 10;
    M[3] = 10;
    N[3] = i;
    q();
  }
  
  public final void L()
  {
    L[1] = L[2];
    L[3] = L[4];
    L[5] = 0;
    L[7] = (L[7] * 6 / 10);
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */