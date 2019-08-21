import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;

public final class l
  implements k
{
  public static final String[] a = { "编号", "名称", "图标", "描述", "价格", "加生命", "加法力", "传送", "部位", "类别", "颜色", "攻击", "防御", "加伤害", "加闪避", "加命中", "需要等级", "生命增强", "法力增强" };
  public static short[][] b = null;
  public static byte[] c = { 0, 1, 2, 8, 9, 10, 11, 16, 13, 15, 17, 18, 4 };
  public static short[][] d = null;
  public static byte[] e = { 0, 1, 2, 8, 10, 12, 16, 14, 15, 17, 18, 4 };
  public static short[][] f = null;
  public static byte[] g = { 0, 1, 2, 8, 10, 16, 13, 14, 15, 17, 18, 4 };
  public static short[][] h = null;
  public static byte[] i = { 0, 1, 2, 3 };
  public static short[][] j = null;
  public static byte[] k = { 0, 1, 2, 3, 4, 7 };
  public static short[][] l = null;
  public static byte[] m = { 0, 1, 2, 3, 4, 5, 6 };
  public static short[][] n = null;
  public static String[] o = null;
  
  public static final void a()
  {
    if (n == null) {
      n = b("/data/arm/n.bin");
    }
    if (l == null) {
      l = b("/data/arm/b.bin");
    }
    if (j == null) {
      j = b("/data/arm/c.bin");
    }
    if (d == null) {
      d = b("/data/arm/f.bin");
    }
    if (b == null) {
      b = b("/data/arm/w.bin");
    }
    if (f == null) {
      f = b("/data/arm/s.bin");
    }
    if (h == null) {
      h = b("/data/arm/r.bin");
    }
    if (o == null) {
      o = m.c("/data/arm/dic.bin");
    }
  }
  
  private static short[][] b(String paramString)
  {
    DataInputStream localDataInputStream = new DataInputStream(Runtime.getRuntime().getClass().getResourceAsStream(paramString));
    short[][] arrayOfShort = (short[][])null;
    try
    {
      int i1;
      arrayOfShort = new short[i1 = localDataInputStream.readShort()][];
      for (int i2 = 0; i2 < i1; i2++)
      {
        int i3;
        if ((i3 = localDataInputStream.readShort()) > 0)
        {
          arrayOfShort[i2] = new short[i3];
          for (int i4 = 0; i4 < i3; i4++) {
            arrayOfShort[i2][i4] = localDataInputStream.readShort();
          }
        }
      }
    }
    catch (IOException localIOException2)
    {
      IOException localIOException1;
      (localIOException1 = localIOException2).printStackTrace();
    }
    return arrayOfShort;
  }
  
  public static final int a(int paramInt)
  {
    int i1 = 0;
    switch (b(paramInt))
    {
    case 0: 
      i1 = 16777215;
      break;
    case 1: 
      i1 = 255;
      break;
    case 2: 
      i1 = 16776960;
      break;
    default: 
      i1 = 902093;
    }
    return i1;
  }
  
  public static final byte b(int paramInt)
  {
    return a(b(paramInt, (byte)10));
  }
  
  public static final byte a(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    if (paramString.equals("白")) {
      return 0;
    }
    if (paramString.equals("蓝")) {
      return 1;
    }
    if (paramString.equals("金")) {
      return 2;
    }
    return -1;
  }
  
  public static final int a(int[] paramArrayOfInt, byte paramByte)
  {
    int i1 = 0;
    if (paramArrayOfInt == null) {
      return 0;
    }
    int i2 = 0;
    for (int i3 = 0; i3 < paramArrayOfInt.length; i3++) {
      if ((i2 = a(paramArrayOfInt[i3], paramByte)) > 0) {
        i1 += i2;
      }
    }
    return i1;
  }
  
  public static final int a(int paramInt, byte paramByte)
  {
    short[] arrayOfShort = d(paramInt);
    byte[] arrayOfByte = e(paramInt);
    if ((arrayOfShort != null) && (arrayOfByte != null)) {
      for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
        if (arrayOfByte[i1] == paramByte)
        {
          if (i1 >= arrayOfShort.length) {
            return -1;
          }
          int i2;
          if ((i2 = arrayOfShort[i1]) >= 30001) {
            return -1;
          }
          return arrayOfShort[i1];
        }
      }
    }
    return -1;
  }
  
  public static final String b(int paramInt, byte paramByte)
  {
    String str = null;
    short[] arrayOfShort = d(paramInt);
    byte[] arrayOfByte = e(paramInt);
    if ((arrayOfShort != null) && (arrayOfByte != null)) {
      for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
        if (arrayOfByte[i1] == paramByte)
        {
          if (i1 >= arrayOfShort.length) {
            return null;
          }
          int i2;
          if ((i2 = arrayOfShort[i1]) >= 30001)
          {
            str = o[(i2 - 30001)];
            break;
          }
          str = arrayOfShort[i1];
          break;
        }
      }
    }
    return str;
  }
  
  public static final byte c(int paramInt)
  {
    if ((paramInt >= 1) && (paramInt < 1 + l.length)) {
      return 5;
    }
    if ((paramInt >= 100) && (paramInt < 100 + j.length)) {
      return 4;
    }
    if ((paramInt >= 200) && (paramInt < 200 + h.length)) {
      return 3;
    }
    if ((paramInt >= 300) && (paramInt < 300 + b.length)) {
      return 0;
    }
    if ((paramInt >= 500) && (paramInt < 500 + d.length)) {
      return 1;
    }
    if ((paramInt >= 700) && (paramInt < 700 + f.length)) {
      return 2;
    }
    return -1;
  }
  
  public static final short[] d(int paramInt)
  {
    short[] arrayOfShort = (short[])null;
    int i1;
    if ((i1 = c(paramInt)) < 0) {
      return null;
    }
    switch (i1)
    {
    case 5: 
      arrayOfShort = l[(paramInt - 1)];
      break;
    case 0: 
      arrayOfShort = b[(paramInt - 300)];
      break;
    case 1: 
      arrayOfShort = d[(paramInt - 500)];
      break;
    case 2: 
      arrayOfShort = f[(paramInt - 700)];
      break;
    case 3: 
      arrayOfShort = h[(paramInt - 200)];
      break;
    case 4: 
      arrayOfShort = j[(paramInt - 100)];
    }
    return arrayOfShort;
  }
  
  public static final byte[] e(int paramInt)
  {
    byte[] arrayOfByte = (byte[])null;
    int i1;
    if ((i1 = c(paramInt)) < 0) {
      return null;
    }
    switch (i1)
    {
    case 5: 
      arrayOfByte = m;
      break;
    case 0: 
      arrayOfByte = c;
      break;
    case 1: 
      arrayOfByte = e;
      break;
    case 2: 
      arrayOfByte = g;
      break;
    case 3: 
      arrayOfByte = i;
      break;
    case 4: 
      arrayOfByte = k;
    }
    return arrayOfByte;
  }
  
  public static final String a(int paramInt1, int paramInt2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    short[] arrayOfShort = d(paramInt1);
    byte[] arrayOfByte = e(paramInt1);
    if ((arrayOfShort != null) && (arrayOfByte != null)) {
      for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
        if ((arrayOfByte[i1] != 0) && (arrayOfByte[i1] != 2) && (arrayOfByte[i1] != 7) && (arrayOfByte[i1] != 8))
        {
          localStringBuffer.append(a[arrayOfByte[i1]]);
          localStringBuffer.append(":");
          if (arrayOfShort[i1] < 30001) {
            localStringBuffer.append(arrayOfShort[i1]);
          } else if (arrayOfShort[i1] - 30001 < o.length) {
            localStringBuffer.append(o[(arrayOfShort[i1] - 30001)]);
          }
          localStringBuffer.append("|");
          if (arrayOfByte[i1] == 1) {
            localStringBuffer.append("|");
          }
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static final boolean f(int paramInt)
  {
    for (int i1 = 0; i1 < n.length; i1++) {
      if (paramInt == n[i1][0])
      {
        System.out.println("不可掉落 armID=" + paramInt);
        return false;
      }
    }
    return true;
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */