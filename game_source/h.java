import com.MainMidlet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class h
  implements k, o
{
  public static byte[] a = null;
  public static short b = -1;
  public static final String[] c = { "邪恶的洞穴", "杀死邪骸", "瑟恩的灵魂", "遗忘之塔", "雷娜的铁锤", "屠杀女魔" };
  public static final String[][] d = { { "在营地外的荒地中找一个洞穴，杀死洞穴内怪物的首领。", "回去找夏拉领赏。", "任务完成！" }, { "到冰冷荒野南边的活埋墓地，找到邪骸的踪迹，杀了邪骸！", "回去找罗格领赏。", "任务完成！" }, { "穿过秘密通道来到迷雾森林，找到艾尼弗斯之树，取回卷轴。", "回去求助夏拉。", "进入石冢野林，找到石冢，进入恶魔废墟，找到并解救瑟恩灵魂。", "找到被囚禁的灵魂。", "赶紧回去让瑟恩苏醒……", "找夏拉领赏！", "任务完成！" }, { "到遗忘荒地寻找高塔的废墟。", "到高塔之下找到尸王的墓室，并处死她！", "任务完成！" }, { "在僧院的军营中寻找雷娜的铁锤。", "把铁锤送给雷娜,找她领赏！", "任务完成！" }, { "在僧院的地下墓穴中，找到芙罗塞娜的老巢，杀了芙罗塞娜。", "瑟恩将告诉您新的征途。", "任务完成！" } };
  private static short[][][][][] g = null;
  public static byte[] e = { 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 001 };
  public static byte[][] f = new byte[29][2];
  
  public final void a(DataInputStream paramDataInputStream)
  {
    g = m.a(g, paramDataInputStream);
    try
    {
      paramDataInputStream.read(a);
      paramDataInputStream.read(e);
      b = paramDataInputStream.readShort();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public final void a(DataOutputStream paramDataOutputStream)
  {
    m.a(g, paramDataOutputStream);
    try
    {
      paramDataOutputStream.write(a);
      paramDataOutputStream.write(e);
      paramDataOutputStream.writeShort(b);
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public static final void a()
  {
    if ((e == null) || (g.b)) {
      e = new byte[] { 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1 };
    }
    if (g.b) {
      b = -1;
    }
    if ((a == null) || (g.b)) {
      a = new byte[] { -1, -1, -1, -1, -1, -1 };
    }
    if ((g == null) || (g.b)) {
      g = new short[][][][][] { { { { new short[1], { -1 } } }, { { { 0, 5 }, { 102, 2, 6 }, { 101, 204 } }, { { 9, 204, 31, 8 } } } }, { { { new short[1], { -1 } } }, { { { 3, 204 } }, { { 1, 11 }, { 2 }, { 7, 3 }, { 5 }, { 5, 1 } } } }, { { { new short[1], { -1 } } }, { { { 0, 6 }, { 102, 2, 3 }, { 101, 202 } }, { { 9, 202, 22, 9 } } } }, { { { new short[1], { -1 } } }, { { { 3, 202 } }, { { 1, 8 }, { 2 }, { 7, 2, 4 }, { 12, 4 }, { 5, 2 }, { 5, 3 } } } }, { { { new short[1], { -1 } } }, { { { 0, 19 }, { 102, 4 }, { 101, 203 } }, { { 9, 203, 7, 35 } } } }, { { { new short[1], { -1 } } }, { { { 3, 203 } }, { { 1, 15 }, { 2 }, { 7, 4, 1 }, { 12, 5 }, { 5, 4 }, { 5, 5 } } } }, { { { new short[1], { -1, -1, -1, -1, -1, -1 } } }, { { { 1, 7 } }, { { 1 }, { 2 }, { 7 }, { 13 }, { 4, 6, 1 } } }, { { { 2, 2, 8 } }, { { 7, 0, 1 }, { 11, 22 }, { 12, 1 }, { 4, 6, 2 } } }, { { { 1, 7 } }, { { 1, 1 }, { 2 }, { 3, 418 }, { 7, 0, 2 }, { 13 }, { 12, 2 }, { 4, 6, 3 } } }, { { { 1, 7 }, { 102, 1, 2 } }, { { 1, 4 }, { 2 }, { 7, 2 }, { 13 }, { 4, 6, 4 } } }, { { { 1, 7 }, { 102, 2, 1 } }, { { 1, 6 }, { 2 }, { 8, 200 }, { 3, 201 }, { 7, 2, 2 }, { 13 }, { 4, 6, 5 } } }, { { { 1, 7 }, { 102, 2, 5 } }, { { 1, 10 }, { 2 }, { 3, 701 }, { 7, 2, 6 }, { 13 }, { 12, 5 }, { 5, 6 } } } }, { { { new short[1], { -1, -1, -1 } } }, { { { 1, 8 }, { 102, 0, 2 } }, { { 1, 2 }, { 2 }, { 7, 1 }, { 13 }, { 4, 7, 1 } } }, { { { 2, 4, 7 } }, { { 7, 1, 1 }, { 11, 23 }, { 12, 2 }, { 4, 7, 2 } } }, { { { 1, 8 } }, { { 1, 3 }, { 2 }, { 3, 661 }, { 7, 1, 2 }, { 13 }, { 12, 1 }, { 5, 7 } } } }, { { { new short[1], { -1 } } }, { { { 1, 13 }, { 102, 2 } }, { { 1, 5 }, { 2 }, { 3, 200 }, { 7, 2, 1 }, { 12, 1 }, { 5, 8 } } } }, { { { new short[1], { -1 } } }, { { { 1, 15 }, { 102, 2, 2 } }, { { 1, 7 }, { 2 }, { 8, 201 }, { 7, 2, 3 }, { 10, 6, 30, 38 } } } }, { { { new short[1], { -1, -1, -1 } } }, { { { 1, 10 }, { 102, 2, 4 } }, { { 1, 9 }, { 2 }, { 8, 202 }, { 7, 2, 5 }, { 13 }, { 12, 1 }, { 4, 10, 1 } } }, { { { 1, 10 }, { 102, 4, 2 } }, { { 1, 17 }, { 2 }, { 7, 5 }, { 13 }, { 4, 10, 2 } } }, { { { 1, 10 }, { 102, 5, 1 } }, { { 1, 20 }, { 2 }, { 7, 5, 2 }, { 13 }, { 5, 10 } } } }, { { { new short[1], { -1 } } }, { { { 1, 17 }, { 102, 3 } }, { { 1, 12 }, { 2 }, { 8, 204 }, { 7, 3, 1 }, { 10, 11, 10, 9 } } } }, { { { new short[1], { -1 } } }, { { { 2, 14, 8 } }, { { 11, 24 }, { 1, 13 }, { 2 }, { 3, 710 }, { 7, 3, 2 }, { 5, 12 } } } }, { { { new short[1], { -1, -1 } } }, { { { 1, 11 }, { 102, 2, 6 } }, { { 1, 14 }, { 2 }, { 7, 4 }, { 13 }, { 4, 13, 1 } } }, { { { 1, 11 }, { 102, 4, 1 } }, { { 1, 16 }, { 2 }, { 8, 203 }, { 3, 683 }, { 7, 4, 2 }, { 13 }, { 12, 4 }, { 5, 13 } } } }, { { { new short[1], { -1 } } }, { { { 2, 28, 9 } }, { { 11, 25 }, { 1, 18 }, { 2 }, { 7, 5, 1 }, { 12, 4 }, { 10, 0, 17, 21 }, { 5, 14 } } } }, { { { new short[1], { -1, -1 } } }, { { { 1, 12 } }, { { 1, 19 }, { 2 }, { 6, 3 }, { 4, 15, 1 } } }, { { { 1, 12 } }, { { 1, 21 }, { 2 }, { 6, 3 } } } }, { { { new short[1], { -1 } } }, { { new short[2] }, { { 1, 26 }, { 2 }, { 12, 1 }, { 5, 16 } } } } };
    }
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= a.length) || (paramInt2 < 0)) {
      return false;
    }
    return a[paramInt1] >= paramInt2;
  }
  
  public static final boolean a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= a.length)) {
      return false;
    }
    return a[paramInt] >= 0;
  }
  
  public static final boolean b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= a.length)) {
      return false;
    }
    return a[paramInt] == d[paramInt].length - 1;
  }
  
  public static final String[] a(int paramInt1, int paramInt2)
  {
    String str = null;
    if (a[paramInt1] < 0) {
      str = "任务描述：尚未接受。";
    } else {
      str = "任务描述：" + d[paramInt1][a[paramInt1]];
    }
    return m.a(str, '|', paramInt2);
  }
  
  public static final boolean b()
  {
    if (g != null) {
      for (int i = 0; i < g.length; i++)
      {
        short[][] arrayOfShort1;
        int j;
        int k;
        if ((g[i].length >= 2) && ((j = (arrayOfShort1 = g[i][0][0])[0][0]) >= 0) && (j < arrayOfShort1[1].length) && ((k = arrayOfShort1[1][j]) != -1))
        {
          short[][][] arrayOfShort;
          short[][] arrayOfShort2 = (arrayOfShort = g[i][(j + 1)])[1];
          for (int m = k; m < arrayOfShort2.length; m++)
          {
            short[] arrayOfShort3;
            int n;
            switch (n = a((arrayOfShort3 = arrayOfShort2[m])[0], (short)(arrayOfShort3.length > 1 ? arrayOfShort3[1] : 0), (short)(arrayOfShort3.length > 2 ? arrayOfShort3[2] : 0), (short)(arrayOfShort3.length > 3 ? arrayOfShort3[3] : 0)))
            {
            case 0: 
              int tmp180_179 = j;
              short[] tmp180_178 = arrayOfShort1[1];
              tmp180_178[tmp180_179] = ((short)(tmp180_178[tmp180_179] + 1));
              if (arrayOfShort1[1][j] + 1 > arrayOfShort2.length)
              {
                arrayOfShort1[1][j] = -1;
                return false;
              }
              break;
            case 1: 
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  private static boolean a(short paramShort1, short paramShort2, short paramShort3)
  {
    if (g != null) {
      for (int i = 0; i < g.length; i++)
      {
        short[][][][] arrayOfShort;
        short[][] arrayOfShort1;
        int j;
        int k;
        if (((arrayOfShort = g[i]).length >= 2) && ((j = (arrayOfShort1 = arrayOfShort[0][0])[0][0]) >= 0) && (j < arrayOfShort1[1].length) && ((k = arrayOfShort1[1][j]) == -1))
        {
          short[][][] arrayOfShort2;
          short[][] arrayOfShort3 = (arrayOfShort2 = arrayOfShort[(j + 1)])[0];
          if ((paramShort1 == arrayOfShort3[0][0]) && ((arrayOfShort3[0].length <= 1) || (arrayOfShort3[0][1] == paramShort2)) && ((arrayOfShort3[0].length <= 2) || (arrayOfShort3[0][2] == paramShort3)))
          {
            int m = 1;
            for (int n = 1; n < arrayOfShort3.length; n++) {
              if (!b(arrayOfShort3[n][0], (short)(arrayOfShort3[n].length > 1 ? arrayOfShort3[n][1] : 0), (short)(arrayOfShort3[n].length > 2 ? arrayOfShort3[n][2] : 0)))
              {
                m = 0;
                break;
              }
            }
            if (m != 0)
            {
              arrayOfShort1[1][j] = 0;
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public static final void c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= e.length)) {
      return;
    }
    if (e[paramInt] == 0) {
      return;
    }
    if (e[paramInt] == 1) {
      e[paramInt] = 2;
    }
  }
  
  public static final void c()
  {
    int i = e.f;
    int j = 0;
    for (int k = 0; k < e.length; k = (byte)(k + 1)) {
      if ((k != i) && (e[k] > 0)) {
        j++;
      }
    }
    if (j == 0) {
      return;
    }
    f = new byte[j][];
    j = 0;
    for (k = 0; k < e.length; k = (byte)(k + 1)) {
      if ((k != i) && (e[k] > 0))
      {
        f[j] = new byte[2];
        f[j][0] = k;
        f[j][1] = e[k];
        j++;
      }
    }
  }
  
  public static final boolean a(d paramd, int paramInt1, int paramInt2)
  {
    if (paramd.j == 0)
    {
      int i = 0;
      short s;
      if (((s = r.b(paramInt1, paramInt2)) >= 2) && (s <= 4)) {
        e.a(k.D[e.f][(s - 2)]);
      } else if (s == 5) {
        if (g.a("rmsTRANS"))
        {
          c(e.f);
          u.a(8);
        }
        else
        {
          boolean bool;
          if ((bool = n.a().a(MainMidlet.b, 0, q.a, "YXBY10 " + q.b + " IF12", k.A[9]))) {
            g.a("rmsTRANS", 1);
          }
          x.f();
        }
      }
      return a((short)1, s, (short)0);
    }
    return false;
  }
  
  public static final boolean a(short paramShort)
  {
    return a(, paramShort, (short)0);
  }
  
  public static final boolean b(short paramShort)
  {
    return a(, (short)e.f, paramShort);
  }
  
  public static final boolean c(short paramShort)
  {
    if (l.c(paramShort) == 3) {
      return a((short)3, paramShort, (short)0);
    }
    return false;
  }
  
  private static boolean b(short paramShort1, short paramShort2, short paramShort3)
  {
    switch (paramShort1)
    {
    case 100: 
      return p.g(paramShort2);
    case 101: 
      return !p.g(paramShort2);
    case 102: 
      return b(paramShort2, paramShort3);
    case 103: 
      return e.f == paramShort2;
    }
    return false;
  }
  
  private static byte a(short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    byte b1 = 0;
    switch (paramShort1)
    {
    case 1: 
      d(paramShort2);
      b1 = 0;
      break;
    case 2: 
      if (f.g) {
        b1 = 1;
      } else {
        b1 = 0;
      }
      break;
    case 6: 
      u.a(paramShort2);
      b1 = 0;
      break;
    case 4: 
      a(paramShort2, paramShort3);
      b1 = 0;
      break;
    case 5: 
      b(paramShort2, paramShort3);
      b1 = 0;
      break;
    case 3: 
      e(paramShort2);
      b1 = 0;
      break;
    case 9: 
      e.a(paramShort2, paramShort3 * 16 + 8, paramShort4 * 16 + 8);
      b1 = 0;
      break;
    case 8: 
      p.f(paramShort2);
      b1 = 0;
      break;
    case 10: 
      e.a(new short[] { paramShort2, paramShort3, paramShort4 });
      b1 = 0;
      break;
    case 7: 
      c(paramShort2, paramShort3);
      b1 = 0;
      break;
    case 11: 
      if ((paramShort2 >= 0) && (paramShort2 < k.x.length)) {
        f.b(k.x[paramShort2], 40);
      }
      b1 = 0;
      break;
    case 12: 
      f(paramShort2);
      break;
    case 13: 
      d();
    }
    return b1;
  }
  
  private static void d(short paramShort)
  {
    f.a(, k.x[paramShort]);
  }
  
  private static void a(short paramShort1, short paramShort2)
  {
    g[paramShort1][0][0][0][0] = paramShort2;
  }
  
  private static void b(short paramShort1, short paramShort2)
  {
    g[paramShort1][0][0][0][0] = -1;
  }
  
  private static void e(short paramShort)
  {
    int i = l.a(paramShort);
    f.a("获得" + l.b(paramShort, (byte)1), i);
    if (!p.e(paramShort))
    {
      f.b("[无法存放任务品]");
      e.a(paramShort, e.a.k, e.a.l);
    }
  }
  
  private static void f(short paramShort)
  {
    b = paramShort;
  }
  
  private static void d()
  {
    b = -1;
  }
  
  private static void c(short paramShort1, short paramShort2)
  {
    if ((paramShort1 >= 0) && (paramShort1 < a.length) && (a[paramShort1] < paramShort2)) {
      a[paramShort1] = ((byte)paramShort2);
    }
    int i = 1;
    for (int j = 0; j < a.length; j++) {
      if (a[j] < d[j].length - 1)
      {
        i = 0;
        break;
      }
    }
    if (a[paramShort1] == d[paramShort1].length - 1) {
      f.b("任务" + (paramShort1 + 1) + "已完成");
    }
    if (i != 0) {
      u.a(9);
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */