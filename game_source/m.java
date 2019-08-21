import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public final class m
  implements PlayerListener, k
{
  private static m j = null;
  public static String a;
  public static boolean b;
  private static int k;
  public static Player c;
  private static int l;
  public static InputStream d;
  public static Vector e;
  public static final int[] f;
  private static Random m;
  public static int[] g;
  public static final int[] h;
  public static boolean i = false;
  
  static
  {
    j = new m();
    { "3gpp", "mp4v-es", "mpv", "3gpp2", "3gpp-tt", "BMPEG", "BT656", "CelB", "DV", "example", "H261", "H263", "H263-1998", "H263-2000", "H264", "JPEG", "MJ2", "MP1S", "MP2P", "MP2T", "mp4", "mpeg", "mpeg4-generic", "nv", "parityfec", "pointer", "quicktime", "raw", "rtp-enc-aescm128", "rtx", "SMPTE292M", "ulpfec" }[32] = "vc1";
    a = null;
    b = true;
    k = 1;
    c = null;
    l = 0;
    d = null;
    e = null;
    f = new int[] { 0, 6, 3, 5, 2, 1, 4, 7 };
    m = new Random();
    g = new int[20];
    h = new int['Ũ'];
    a("/data/sin.bin", 0, h);
  }
  
  public static final byte[] a(String paramString, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = (byte[])null;
    DataInputStream localDataInputStream = null;
    Exception localException3;
    try
    {
      localDataInputStream = new DataInputStream(j.getClass().getResourceAsStream(paramString));
      localDataInputStream.skip(paramInt1);
      if (paramInt2 <= 0) {
        paramInt2 = localDataInputStream.available();
      }
      if (Runtime.getRuntime().freeMemory() >= paramInt2 + 10240)
      {
        arrayOfByte = new byte[paramInt2];
        localDataInputStream.read(arrayOfByte, 0, paramInt2);
      }
    }
    catch (Exception localException1)
    {
      System.out.println("readRes_Bytes error==>" + localException1.getMessage());
      localException1.printStackTrace();
    }
    finally
    {
      try
      {
        if (localDataInputStream != null) {
          localDataInputStream.close();
        }
        System.gc();
      }
      catch (Exception localException2)
      {
        (localException3 = localException2).printStackTrace();
      }
    }
    try
    {
      if (localDataInputStream != null) {
        localDataInputStream.close();
      }
      System.gc();
    }
    catch (Exception localException4)
    {
      (localException3 = localException4).printStackTrace();
    }
    return arrayOfByte;
  }
  
  public static final short a(short paramShort, DataInputStream paramDataInputStream)
  {
    short s = 0;
    try
    {
      s = paramDataInputStream.readShort();
    }
    catch (Exception localException) {}
    return s;
  }
  
  public static final short[] a(short[] paramArrayOfShort, DataInputStream paramDataInputStream)
  {
    short[] arrayOfShort = (short[])null;
    try
    {
      int n;
      arrayOfShort = new short[n = paramDataInputStream.readShort()];
      for (int i1 = 0; i1 < arrayOfShort.length; i1++) {
        arrayOfShort[i1] = paramDataInputStream.readShort();
      }
    }
    catch (Exception localException) {}
    return arrayOfShort;
  }
  
  public static final short[][] a(short[][] paramArrayOfShort, DataInputStream paramDataInputStream)
  {
    short[][] arrayOfShort = (short[][])null;
    try
    {
      int n;
      arrayOfShort = new short[n = paramDataInputStream.readShort()][];
      for (int i1 = 0; i1 < arrayOfShort.length; i1++) {
        arrayOfShort[i1] = a(arrayOfShort[i1], paramDataInputStream);
      }
    }
    catch (Exception localException)
    {
      System.out.println("read data error" + localException);
    }
    return arrayOfShort;
  }
  
  public static final short[][][] a(short[][][] paramArrayOfShort, DataInputStream paramDataInputStream)
  {
    short[][][] arrayOfShort = (short[][][])null;
    try
    {
      int n;
      arrayOfShort = new short[n = paramDataInputStream.readShort()][][];
      for (int i1 = 0; i1 < arrayOfShort.length; i1++) {
        arrayOfShort[i1] = a(arrayOfShort[i1], paramDataInputStream);
      }
    }
    catch (Exception localException) {}
    return arrayOfShort;
  }
  
  public static final short[][][][] a(short[][][][] paramArrayOfShort, DataInputStream paramDataInputStream)
  {
    short[][][][] arrayOfShort = (short[][][][])null;
    try
    {
      int n;
      arrayOfShort = new short[n = paramDataInputStream.readShort()][][][];
      for (int i1 = 0; i1 < arrayOfShort.length; i1++) {
        arrayOfShort[i1] = a(arrayOfShort[i1], paramDataInputStream);
      }
    }
    catch (Exception localException) {}
    return arrayOfShort;
  }
  
  public static final short[][][][][] a(short[][][][][] paramArrayOfShort, DataInputStream paramDataInputStream)
  {
    short[][][][][] arrayOfShort = (short[][][][][])null;
    try
    {
      int n;
      arrayOfShort = new short[n = paramDataInputStream.readShort()][][][][];
      for (int i1 = 0; i1 < arrayOfShort.length; i1++) {
        arrayOfShort[i1] = a(arrayOfShort[i1], paramDataInputStream);
      }
    }
    catch (Exception localException) {}
    return arrayOfShort;
  }
  
  public static final int[] a(int[] paramArrayOfInt, DataInputStream paramDataInputStream)
  {
    int[] arrayOfInt = (int[])null;
    try
    {
      int n;
      arrayOfInt = new int[n = paramDataInputStream.readInt()];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        arrayOfInt[i1] = paramDataInputStream.readInt();
      }
    }
    catch (Exception localException) {}
    return arrayOfInt;
  }
  
  public static final int[][] a(int[][] paramArrayOfInt, DataInputStream paramDataInputStream)
  {
    int[][] arrayOfInt = (int[][])null;
    try
    {
      int n;
      arrayOfInt = new int[n = paramDataInputStream.readInt()][];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        arrayOfInt[i1] = a(arrayOfInt[i1], paramDataInputStream);
      }
    }
    catch (Exception localException) {}
    return arrayOfInt;
  }
  
  /* Error */
  public static final short[][][][] a(short[][][][] paramArrayOfShort, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: checkcast 8	[[[[S
    //   4: astore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: new 10	java/io/DataInputStream
    //   10: dup
    //   11: getstatic 47	m:j	Lm;
    //   14: invokevirtual 108	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: aload_1
    //   18: invokevirtual 112	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: invokespecial 58	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   24: astore_3
    //   25: aconst_null
    //   26: aload_3
    //   27: invokestatic 66	m:a	([[[[SLjava/io/DataInputStream;)[[[[S
    //   30: astore_2
    //   31: goto +67 -> 98
    //   34: astore 4
    //   36: getstatic 51	java/lang/System:out	Ljava/io/PrintStream;
    //   39: new 20	java/lang/StringBuffer
    //   42: dup
    //   43: ldc -81
    //   45: invokespecial 59	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   48: aload_1
    //   49: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   52: ldc -111
    //   54: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   57: aload 4
    //   59: invokevirtual 87	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   62: ldc -79
    //   64: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   67: invokevirtual 132	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   70: invokevirtual 119	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   73: aload 4
    //   75: invokevirtual 118	java/lang/Throwable:printStackTrace	()V
    //   78: goto +20 -> 98
    //   81: astore 6
    //   83: aload_3
    //   84: ifnull +11 -> 95
    //   87: aload_3
    //   88: invokevirtual 95	java/io/DataInputStream:close	()V
    //   91: goto +4 -> 95
    //   94: pop
    //   95: aload 6
    //   97: athrow
    //   98: aload_3
    //   99: ifnull +11 -> 110
    //   102: aload_3
    //   103: invokevirtual 95	java/io/DataInputStream:close	()V
    //   106: goto +4 -> 110
    //   109: pop
    //   110: aload_2
    //   111: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramArrayOfShort	short[][][][]
    //   0	112	1	paramString	String
    //   4	107	2	arrayOfShort	short[][][][]
    //   6	97	3	localDataInputStream	DataInputStream
    //   34	40	4	localException	Exception
    //   81	15	6	localObject	Object
    //   94	1	6	localIOException1	java.io.IOException
    //   109	1	7	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	34	34	java/lang/Exception
    //   7	81	81	finally
    //   87	94	94	java/io/IOException
    //   102	109	109	java/io/IOException
  }
  
  /* Error */
  public static final short[][][] a(short[][][] paramArrayOfShort, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: checkcast 7	[[[S
    //   4: astore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: new 10	java/io/DataInputStream
    //   10: dup
    //   11: getstatic 47	m:j	Lm;
    //   14: invokevirtual 108	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: aload_1
    //   18: invokevirtual 112	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: invokespecial 58	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   24: astore_3
    //   25: aconst_null
    //   26: aload_3
    //   27: invokestatic 65	m:a	([[[SLjava/io/DataInputStream;)[[[S
    //   30: astore_2
    //   31: goto +67 -> 98
    //   34: astore 4
    //   36: getstatic 51	java/lang/System:out	Ljava/io/PrintStream;
    //   39: new 20	java/lang/StringBuffer
    //   42: dup
    //   43: ldc -81
    //   45: invokespecial 59	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   48: aload_1
    //   49: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   52: ldc -111
    //   54: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   57: aload 4
    //   59: invokevirtual 87	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   62: ldc -79
    //   64: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   67: invokevirtual 132	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   70: invokevirtual 119	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   73: aload 4
    //   75: invokevirtual 118	java/lang/Throwable:printStackTrace	()V
    //   78: goto +20 -> 98
    //   81: astore 6
    //   83: aload_3
    //   84: ifnull +11 -> 95
    //   87: aload_3
    //   88: invokevirtual 95	java/io/DataInputStream:close	()V
    //   91: goto +4 -> 95
    //   94: pop
    //   95: aload 6
    //   97: athrow
    //   98: aload_3
    //   99: ifnull +11 -> 110
    //   102: aload_3
    //   103: invokevirtual 95	java/io/DataInputStream:close	()V
    //   106: goto +4 -> 110
    //   109: pop
    //   110: aload_2
    //   111: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramArrayOfShort	short[][][]
    //   0	112	1	paramString	String
    //   4	107	2	arrayOfShort	short[][][]
    //   6	97	3	localDataInputStream	DataInputStream
    //   34	40	4	localException	Exception
    //   81	15	6	localObject	Object
    //   94	1	6	localIOException1	java.io.IOException
    //   109	1	7	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	34	34	java/lang/Exception
    //   7	81	81	finally
    //   87	94	94	java/io/IOException
    //   102	109	109	java/io/IOException
  }
  
  /* Error */
  public static final short[][] a(short[][] paramArrayOfShort, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: checkcast 6	[[S
    //   4: astore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: new 10	java/io/DataInputStream
    //   10: dup
    //   11: getstatic 47	m:j	Lm;
    //   14: invokevirtual 108	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: aload_1
    //   18: invokevirtual 112	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: invokespecial 58	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   24: astore_3
    //   25: aconst_null
    //   26: aload_3
    //   27: invokestatic 64	m:a	([[SLjava/io/DataInputStream;)[[S
    //   30: astore_2
    //   31: goto +67 -> 98
    //   34: astore 4
    //   36: getstatic 51	java/lang/System:out	Ljava/io/PrintStream;
    //   39: new 20	java/lang/StringBuffer
    //   42: dup
    //   43: ldc -81
    //   45: invokespecial 59	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   48: aload_1
    //   49: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   52: ldc -111
    //   54: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   57: aload 4
    //   59: invokevirtual 87	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   62: ldc -79
    //   64: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   67: invokevirtual 132	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   70: invokevirtual 119	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   73: aload 4
    //   75: invokevirtual 118	java/lang/Throwable:printStackTrace	()V
    //   78: goto +20 -> 98
    //   81: astore 6
    //   83: aload_3
    //   84: ifnull +11 -> 95
    //   87: aload_3
    //   88: invokevirtual 95	java/io/DataInputStream:close	()V
    //   91: goto +4 -> 95
    //   94: pop
    //   95: aload 6
    //   97: athrow
    //   98: aload_3
    //   99: ifnull +11 -> 110
    //   102: aload_3
    //   103: invokevirtual 95	java/io/DataInputStream:close	()V
    //   106: goto +4 -> 110
    //   109: pop
    //   110: aload_2
    //   111: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramArrayOfShort	short[][]
    //   0	112	1	paramString	String
    //   4	107	2	arrayOfShort	short[][]
    //   6	97	3	localDataInputStream	DataInputStream
    //   34	40	4	localException	Exception
    //   81	15	6	localObject	Object
    //   94	1	6	localIOException1	java.io.IOException
    //   109	1	7	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	34	34	java/lang/Exception
    //   7	81	81	finally
    //   87	94	94	java/io/IOException
    //   102	109	109	java/io/IOException
  }
  
  public static final int[][] a(int[][] paramArrayOfInt, String paramString)
  {
    int[][] arrayOfInt = (int[][])null;
    try
    {
      DataInputStream localDataInputStream = new DataInputStream(j.getClass().getResourceAsStream(paramString));
      arrayOfInt = a(null, localDataInputStream);
      localDataInputStream.close();
      System.out.println("+++loaded " + paramString + " +++");
    }
    catch (Exception localException)
    {
      System.out.println("---------------------------------------------load " + paramString + " error" + localException);
      localException.printStackTrace();
    }
    return arrayOfInt;
  }
  
  /* Error */
  public static final void a(String paramString, int paramInt, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_2
    //   3: arraylength
    //   4: istore 4
    //   6: new 10	java/io/DataInputStream
    //   9: dup
    //   10: getstatic 47	m:j	Lm;
    //   13: invokevirtual 108	java/lang/Object:getClass	()Ljava/lang/Class;
    //   16: aload_0
    //   17: invokevirtual 112	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   20: invokespecial 58	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   23: astore_3
    //   24: iload_1
    //   25: ifle +10 -> 35
    //   28: aload_3
    //   29: iload_1
    //   30: i2l
    //   31: invokevirtual 129	java/io/DataInputStream:skip	(J)J
    //   34: pop2
    //   35: iconst_0
    //   36: istore 5
    //   38: goto +14 -> 52
    //   41: aload_2
    //   42: iload 5
    //   44: aload_3
    //   45: invokevirtual 121	java/io/DataInputStream:readInt	()I
    //   48: iastore
    //   49: iinc 5 1
    //   52: iload 5
    //   54: iload 4
    //   56: if_icmplt -15 -> 41
    //   59: goto +64 -> 123
    //   62: astore 5
    //   64: getstatic 51	java/lang/System:out	Ljava/io/PrintStream;
    //   67: new 20	java/lang/StringBuffer
    //   70: dup
    //   71: ldc -59
    //   73: invokespecial 59	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   76: aload 5
    //   78: invokevirtual 111	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   81: invokevirtual 86	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   84: invokevirtual 132	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   87: invokevirtual 119	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   90: aload 5
    //   92: invokevirtual 118	java/lang/Throwable:printStackTrace	()V
    //   95: goto +28 -> 123
    //   98: astore 7
    //   100: aload_3
    //   101: ifnull +7 -> 108
    //   104: aload_3
    //   105: invokevirtual 95	java/io/DataInputStream:close	()V
    //   108: invokestatic 107	java/lang/System:gc	()V
    //   111: goto +9 -> 120
    //   114: dup
    //   115: astore 8
    //   117: invokevirtual 118	java/lang/Throwable:printStackTrace	()V
    //   120: aload 7
    //   122: athrow
    //   123: aload_3
    //   124: ifnull +7 -> 131
    //   127: aload_3
    //   128: invokevirtual 95	java/io/DataInputStream:close	()V
    //   131: invokestatic 107	java/lang/System:gc	()V
    //   134: return
    //   135: dup
    //   136: astore 8
    //   138: invokevirtual 118	java/lang/Throwable:printStackTrace	()V
    //   141: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramString	String
    //   0	142	1	paramInt	int
    //   0	142	2	paramArrayOfInt	int[]
    //   1	127	3	localDataInputStream	DataInputStream
    //   4	53	4	n	int
    //   36	21	5	i1	int
    //   62	29	5	localException1	Exception
    //   98	23	7	localObject	Object
    //   115	22	8	localException2	Exception
    //   114	1	9	localException3	Exception
    //   135	1	10	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   6	62	62	java/lang/Exception
    //   6	98	98	finally
    //   100	114	114	java/lang/Exception
    //   123	135	135	java/lang/Exception
  }
  
  public static final void a(short paramShort, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeShort(paramShort);
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void a(short[] paramArrayOfShort, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeShort(paramArrayOfShort.length);
      for (int n = 0; n < paramArrayOfShort.length; n++) {
        paramDataOutputStream.writeShort(paramArrayOfShort[n]);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void a(short[][] paramArrayOfShort, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeShort(paramArrayOfShort.length);
      for (int n = 0; n < paramArrayOfShort.length; n++) {
        a(paramArrayOfShort[n], paramDataOutputStream);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void a(short[][][] paramArrayOfShort, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeShort(paramArrayOfShort.length);
      for (int n = 0; n < paramArrayOfShort.length; n++) {
        a(paramArrayOfShort[n], paramDataOutputStream);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void a(short[][][][] paramArrayOfShort, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeShort(paramArrayOfShort.length);
      for (int n = 0; n < paramArrayOfShort.length; n++) {
        a(paramArrayOfShort[n], paramDataOutputStream);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void a(short[][][][][] paramArrayOfShort, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeShort(paramArrayOfShort.length);
      for (int n = 0; n < paramArrayOfShort.length; n++) {
        a(paramArrayOfShort[n], paramDataOutputStream);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void a(int[] paramArrayOfInt, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeInt(paramArrayOfInt.length);
      for (int n = 0; n < paramArrayOfInt.length; n++) {
        paramDataOutputStream.writeInt(paramArrayOfInt[n]);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void a(int[][] paramArrayOfInt, DataOutputStream paramDataOutputStream)
  {
    try
    {
      paramDataOutputStream.writeInt(paramArrayOfInt.length);
      for (int n = 0; n < paramArrayOfInt.length; n++) {
        a(paramArrayOfInt[n], paramDataOutputStream);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final Image a(String paramString)
  {
    Image localImage = null;
    try
    {
      a("success to creat the Image " + paramString, true);
      localImage = Image.createImage("/images/" + paramString + ".png");
    }
    catch (Exception localException2)
    {
      Exception localException1;
      a((localException1 = localException2).getMessage(), true);
      a("fail to creat the Image " + paramString, true);
    }
    return localImage;
  }
  
  public static final Image a(int paramInt)
  {
    Image localImage = null;
    try
    {
      a("success to creat the Image " + paramInt, true);
      localImage = Image.createImage("/images/" + paramInt + ".png");
    }
    catch (Exception localException2)
    {
      Exception localException1;
      a((localException1 = localException2).getMessage(), true);
      a("fail to creat the Image " + paramInt, true);
    }
    return localImage;
  }
  
  public static final Image a(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2);
  }
  
  public static final Image a(String paramString, int paramInt)
  {
    Image localImage = null;
    try
    {
      localObject = a("/images/" + paramString + ".png", 0, -1);
      byte[] arrayOfByte = a("/images/" + paramString + "_" + paramInt + ".pal", 0, -1);
      a((byte[])localObject, arrayOfByte);
      localImage = Image.createImage((byte[])localObject, 0, localObject.length);
      System.out.println("success to creat pallete Image:" + paramString + "," + paramInt);
      System.gc();
    }
    catch (Exception localException)
    {
      Object localObject;
      a((localObject = localException).getMessage(), true);
      a("fail to creat the Image:" + paramString + ",palId:" + paramInt, true);
    }
    return localImage;
  }
  
  private static void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int n = 0;
    int i1 = 0;
    int i2 = paramArrayOfByte1.length;
    while (i1 < i2)
    {
      if ((paramArrayOfByte1[i1] == 80) && (paramArrayOfByte1[(i1 + 1)] == 76) && (paramArrayOfByte1[(i1 + 2)] == 84) && (paramArrayOfByte1[(i1 + 3)] == 69))
      {
        n = i1;
        break;
      }
      i1++;
    }
    if (n == 0) {
      return;
    }
    i1 = (paramArrayOfByte1[(n - 4)] & 0xFF) << 24 | (paramArrayOfByte1[(n - 3)] & 0xFF) << 16 | (paramArrayOfByte1[(n - 2)] & 0xFF) << 8 | (paramArrayOfByte1[(n - 1)] & 0xFF) + 4;
    for (int i3 = 0; i3 < i1; i3++) {
      paramArrayOfByte1[(n + 4 + i3)] = paramArrayOfByte2[i3];
    }
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject)
  {
    e(">>>>>>>>>>>>>>>eventType:" + paramString);
    if (paramString.equals("endOfMedia"))
    {
      try
      {
        if (k > 1)
        {
          c.setMediaTime(0L);
          paramPlayer.start();
          k -= 1;
          return;
        }
        if (k >= 0) {
          return;
        }
        paramPlayer.setMediaTime(0L);
        paramPlayer.start();
        return;
      }
      catch (Exception localException) {}
    }
    else
    {
      if (paramString.equals("started")) {
        return;
      }
      paramString.equals("stopped");
    }
  }
  
  public static final void b(int paramInt1, int paramInt2)
  {
    System.out.println("playSound---" + paramInt1);
    if (!b) {
      return;
    }
    a();
    c = b("/data/Sound/" + k.w[paramInt1]);
    if (c == null) {
      return;
    }
    k = paramInt2;
    try
    {
      if (c.getState() < 200) {
        c.realize();
      }
      if (c.getState() < 300) {
        c.prefetch();
      }
      c.addPlayerListener(j);
      c.start();
      e("sound started");
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
      a(localException1, true);
    }
  }
  
  public static final void a()
  {
    if (c != null) {
      try
      {
        if (c.getState() == 400) {
          c.stop();
        }
        if (c.getState() != 0) {
          c.close();
        }
      }
      catch (Exception localException2)
      {
        Exception localException1;
        (localException1 = localException2).printStackTrace();
      }
    }
    c = null;
    System.gc();
  }
  
  public static final Player b(String paramString)
  {
    Player localPlayer = null;
    try
    {
      d = j.getClass().getResourceAsStream(paramString);
      localPlayer = Manager.createPlayer(d, "audio/midi");
    }
    catch (Exception localException)
    {
      System.out.println("[load sound error:" + paramString + "]");
      localException.printStackTrace();
    }
    return localPlayer;
  }
  
  public static final String[] a(String paramString, char paramChar, int paramInt)
  {
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = paramString.length();
    if (e == null) {
      e = new Vector();
    }
    e.removeAllElements();
    char c1;
    for (;;)
    {
      if (n >= i3)
      {
        e.addElement(paramString.substring(i1, n));
        break;
      }
      c1 = paramString.charAt(n);
      i2 += x.i.charWidth(c1);
      if (c1 == paramChar)
      {
        e.addElement(paramString.substring(i1, n));
        i2 = 0;
        n++;
        i1 = n;
      }
      else if (i2 > paramInt)
      {
        e.addElement(paramString.substring(i1, n));
        i2 = x.i.charWidth(c1);
        i1 = n++;
      }
      else
      {
        n++;
      }
    }
    String[] arrayOfString = new String[c1 = e.size()];
    for (char c2 = '\000'; c2 < c1; c2++) {
      arrayOfString[c2] = ((String)e.elementAt(c2));
    }
    e.removeAllElements();
    e = null;
    System.gc();
    return arrayOfString;
  }
  
  public static final void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(x.s, paramImage, paramInt1, paramInt2, 0, 0, paramImage.getWidth(), paramImage.getHeight(), paramInt3, paramInt4);
  }
  
  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramImage == null) {
      return;
    }
    a(paramGraphics, paramImage, paramInt1, paramInt2, 0, 0, paramImage.getWidth(), paramImage.getHeight(), paramInt3, paramInt4);
  }
  
  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    int n = 0;
    int i1 = 0;
    if ((0x4 & paramInt7) != 0) {
      n = 0;
    } else if ((0x1 & paramInt7) != 0) {
      n = -paramInt5 / 2;
    } else if ((0x8 & paramInt7) != 0) {
      n = -paramInt5;
    }
    if ((0x10 & paramInt7) != 0) {
      i1 = 0;
    } else if ((0x2 & paramInt7) != 0) {
      i1 = -paramInt6 / 2;
    } else if ((0x20 & paramInt7) != 0) {
      i1 = -paramInt6;
    }
    a(paramGraphics, paramImage, paramInt1 + n, paramInt2 + i1, paramInt3, paramInt4, paramInt5, paramInt6, paramInt8);
  }
  
  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    if ((paramImage == null) || (paramInt7 >= f.length)) {
      return;
    }
    paramInt7 = f[paramInt7];
    int n = paramInt5;
    int i1 = paramInt6;
    if ((paramInt7 & 0x4) != 0)
    {
      n = paramInt6;
      i1 = paramInt5;
    }
    paramGraphics.setClip(paramInt1, paramInt2, n, i1);
    if (x.f == 3) {
      paramGraphics.clipRect(0, 0, x.a, x.b);
    }
    if (paramInt7 == 0)
    {
      paramGraphics.drawImage(paramImage, paramInt1 - paramInt3, paramInt2 - paramInt4, 0);
      return;
    }
    paramGraphics.drawRegion(paramImage, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt1, paramInt2, 0);
  }
  
  public static final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return (paramInt1 + paramInt3 > paramInt5) && (paramInt1 < paramInt5 + paramInt7) && (paramInt2 + paramInt4 > paramInt6) && (paramInt2 < paramInt6 + paramInt8);
  }
  
  public static final int b(int paramInt)
  {
    return Math.abs(m.nextInt()) % paramInt;
  }
  
  public static final int[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    int n = Math.abs(paramInt1 - paramInt2) + 1;
    int i1 = Math.min(paramInt1, paramInt2);
    if (paramInt3 > n) {
      paramInt3 = n;
    }
    int[] arrayOfInt = new int[paramInt3];
    for (int i2 = 0; i2 < arrayOfInt.length; i2++)
    {
      int i3 = b(n - i2);
      for (int i4 = 0; i4 < n; i4++)
      {
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++)
        {
          int i7;
          if ((i7 = i4 + i1) == arrayOfInt[i6])
          {
            i5 = 1;
            break;
          }
        }
        if (i5 == 0)
        {
          if (i3 == 0)
          {
            i3 = i4;
            break;
          }
          i3--;
        }
      }
      arrayOfInt[i2] = (i3 + i1);
    }
    return arrayOfInt;
  }
  
  public static final void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Graphics localGraphics;
    (localGraphics = x.s).setFont(x.i);
    localGraphics.setColor(paramInt3);
    int n = 0;
    int i1 = 0;
    int i2 = x.i.stringWidth(paramString);
    int i3 = x.i.getHeight();
    if ((0x4 & paramInt4) != 0) {
      n = 0;
    } else if ((0x1 & paramInt4) != 0) {
      n = -i2 / 2;
    } else if ((0x8 & paramInt4) != 0) {
      n = -i2;
    }
    if ((0x10 & paramInt4) != 0) {
      i1 = 0;
    } else if ((0x2 & paramInt4) != 0) {
      i1 = -i3 / 2;
    } else if ((0x20 & paramInt4) != 0) {
      i1 = -i3;
    }
    localGraphics.setClip(paramInt1 + n, paramInt2 + i1, i2, i3);
    localGraphics.drawString(paramString, paramInt1 + n, paramInt2 + i1, 0);
  }
  
  public static final void a(int paramInt1, Image paramImage, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramImage, k.u, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public static final void a(int paramInt1, Image paramImage, short[][] paramArrayOfShort, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a(x.s, paramInt1, paramImage, paramArrayOfShort, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, Image paramImage, short[][] paramArrayOfShort, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((paramImage == null) || (paramArrayOfShort == null) || (paramInt1 >= paramArrayOfShort.length)) {
      return;
    }
    int n = 0;
    int i1 = 0;
    int i2;
    int i3;
    int i4;
    int i5;
    if ((paramInt1 < 0) || (paramInt1 >= paramImage.getWidth()))
    {
      i2 = 0;
      i3 = 0;
      i4 = paramImage.getWidth();
      i5 = paramImage.getHeight();
    }
    else
    {
      i2 = paramArrayOfShort[paramInt1][0];
      i3 = paramArrayOfShort[paramInt1][1];
      i4 = paramArrayOfShort[paramInt1][2];
      i5 = paramArrayOfShort[paramInt1][3];
    }
    int i6 = i4;
    int i7 = i5;
    if ((paramInt5 == 1) || (paramInt5 == 3) || (paramInt5 == 6) || (paramInt5 == 7))
    {
      i6 = i5;
      i7 = i4;
    }
    if ((0x4 & paramInt4) != 0) {
      n = 0;
    } else if ((0x1 & paramInt4) != 0) {
      n = -i6 / 2;
    } else if ((0x8 & paramInt4) != 0) {
      n = -i6;
    }
    if ((0x10 & paramInt4) != 0) {
      i1 = 0;
    } else if ((0x2 & paramInt4) != 0) {
      i1 = -i7 / 2;
    } else if ((0x20 & paramInt4) != 0) {
      i1 = -i7;
    }
    a(paramGraphics, paramImage, paramInt2 + n, paramInt3 + i1, i2, i3, i4, i5, paramInt5);
  }
  
  public static final void a(Image[] paramArrayOfImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramArrayOfImage == null) {
      return;
    }
    a(paramArrayOfImage, paramInt1, paramInt2, paramInt3, 1, paramInt4);
  }
  
  public static final void a(Image[] paramArrayOfImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt1 < 0) {
      return;
    }
    if ((paramArrayOfImage == null) || (paramArrayOfImage.length < 10)) {
      return;
    }
    for (int n = 0; n < paramArrayOfImage.length; n++) {
      if (paramArrayOfImage[n] == null) {
        return;
      }
    }
    n = 10;
    int i1 = 1;
    while (paramInt1 / n >= 1)
    {
      i1++;
      n *= 10;
    }
    if (i1 < paramInt4) {
      i1 = paramInt4;
    }
    if ((g == null) || (i1 > g.length)) {
      g = new int[i1];
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      g[(g.length - i2 - 1)] = (paramInt1 % 10);
      paramInt1 /= 10;
    }
    i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6;
    Image localImage;
    for (int i7 = 0; i7 < i1; i7++)
    {
      i6 = g[(g.length - i1 + i7)];
      localImage = paramArrayOfImage[i6];
      i4 += localImage.getWidth();
      if (i5 < localImage.getHeight()) {
        i5 = localImage.getHeight();
      }
    }
    if ((0x4 & paramInt5) != 0) {
      i2 = 0;
    } else if ((0x1 & paramInt5) != 0) {
      i2 = -i4 / 2;
    } else if ((0x8 & paramInt5) != 0) {
      i2 = -i4;
    }
    if ((0x10 & paramInt5) != 0) {
      i3 = 0;
    } else if ((0x2 & paramInt5) != 0) {
      i3 = -i5 / 2;
    } else if ((0x20 & paramInt5) != 0) {
      i3 = -i5;
    }
    paramInt2 += i2;
    paramInt3 += i3;
    for (i7 = 0; i7 < i1; i7++)
    {
      i6 = g[(g.length - i1 + i7)];
      localImage = paramArrayOfImage[i6];
      a(x.s, localImage, paramInt2, paramInt3, 0, 0, localImage.getWidth(), localImage.getHeight(), 0);
      paramInt2 += localImage.getWidth();
    }
  }
  
  /* Error */
  public static final String[] c(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: new 10	java/io/DataInputStream
    //   8: dup
    //   9: invokestatic 113	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   12: invokevirtual 108	java/lang/Object:getClass	()Ljava/lang/Class;
    //   15: aload_0
    //   16: invokevirtual 112	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: invokespecial 58	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   22: dup
    //   23: astore_3
    //   24: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   27: dup
    //   28: istore_2
    //   29: anewarray 19	java/lang/String
    //   32: astore 4
    //   34: iconst_0
    //   35: istore_1
    //   36: goto +14 -> 50
    //   39: aload 4
    //   41: iload_1
    //   42: aload_3
    //   43: invokevirtual 123	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   46: aastore
    //   47: iinc 1 1
    //   50: iload_1
    //   51: iload_2
    //   52: if_icmplt -13 -> 39
    //   55: goto +48 -> 103
    //   58: astore 5
    //   60: new 20	java/lang/StringBuffer
    //   63: dup
    //   64: ldc -93
    //   66: invokespecial 59	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   69: aload 5
    //   71: invokevirtual 87	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   74: invokevirtual 132	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   77: iconst_1
    //   78: invokestatic 74	m:a	(Ljava/lang/String;Z)V
    //   81: aconst_null
    //   82: checkcast 3	[Ljava/lang/String;
    //   85: astore 4
    //   87: goto +16 -> 103
    //   90: astore 7
    //   92: aload_3
    //   93: invokevirtual 95	java/io/DataInputStream:close	()V
    //   96: goto +4 -> 100
    //   99: pop
    //   100: aload 7
    //   102: athrow
    //   103: aload_3
    //   104: invokevirtual 95	java/io/DataInputStream:close	()V
    //   107: goto +4 -> 111
    //   110: pop
    //   111: aload 4
    //   113: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramString	String
    //   35	18	1	n	int
    //   28	25	2	i1	int
    //   1	103	3	localDataInputStream	DataInputStream
    //   3	109	4	arrayOfString	String[]
    //   58	12	5	localException1	Exception
    //   90	11	7	localObject	Object
    //   99	1	7	localException2	Exception
    //   110	1	8	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   5	58	58	java/lang/Exception
    //   5	90	90	finally
    //   92	99	99	java/lang/Exception
    //   103	110	110	java/lang/Exception
  }
  
  public static final int d(String paramString)
  {
    return x.i.stringWidth(paramString);
  }
  
  public static final void a(int[][] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramArrayOfInt.length)
    {
      System.out.println("error in orderArrayMin");
      return;
    }
    for (int n = 1; n < paramInt2; n++) {
      for (int i1 = 0; i1 < n; i1++) {
        if (paramArrayOfInt[n][paramInt1] < paramArrayOfInt[i1][paramInt1])
        {
          int[] arrayOfInt = paramArrayOfInt[n];
          for (int i2 = n; i2 > i1; i2--) {
            paramArrayOfInt[i2] = paramArrayOfInt[(i2 - 1)];
          }
          paramArrayOfInt[i1] = arrayOfInt;
          break;
        }
      }
    }
  }
  
  public static final int c(int paramInt)
  {
    paramInt = e(paramInt);
    return h[paramInt];
  }
  
  public static final int d(int paramInt)
  {
    paramInt = ((paramInt = e(paramInt)) + 360 + 90) % 360;
    return h[paramInt];
  }
  
  public static final int e(int paramInt)
  {
    if (paramInt < 0)
    {
      paramInt = (paramInt = 360 - paramInt) % 360;
      paramInt = 360 - paramInt;
    }
    else if (paramInt >= 360)
    {
      paramInt %= 360;
    }
    return paramInt;
  }
  
  public static final void a(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      return;
    }
    if (paramBoolean)
    {
      System.out.println(paramString);
      return;
    }
    if (i) {
      System.out.println(paramString);
    }
  }
  
  public static final void e(String paramString)
  {
    if (paramString == null) {
      return;
    }
    a(paramString, false);
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */