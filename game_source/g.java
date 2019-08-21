import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.rms.RecordStore;

public final class g
{
  public static boolean a = false;
  public static boolean b = false;
  
  public static final void a(String paramString, int paramInt)
  {
    int[] arrayOfInt;
    (arrayOfInt = new int[1])[0] = paramInt;
    a(paramString, arrayOfInt);
  }
  
  private static void a(String paramString, int[] paramArrayOfInt)
  {
    byte[] arrayOfByte = new byte[paramArrayOfInt.length * 4];
    for (int i = 0; i < arrayOfByte.length; i += 4)
    {
      arrayOfByte[i] = ((byte)(paramArrayOfInt[(i / 4)] >> 24));
      arrayOfByte[(i + 1)] = ((byte)(paramArrayOfInt[(i / 4)] >> 16));
      arrayOfByte[(i + 2)] = ((byte)(paramArrayOfInt[(i / 4)] >> 8));
      arrayOfByte[(i + 3)] = ((byte)paramArrayOfInt[(i / 4)]);
    }
    a(paramString, arrayOfByte);
  }
  
  private static byte[] b(String paramString)
  {
    try
    {
      RecordStore localRecordStore;
      byte[] arrayOfByte = (localRecordStore = RecordStore.openRecordStore(paramString, false)).getRecord(1);
      localRecordStore.closeRecordStore();
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static void a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      boolean bool = a(paramString);
      RecordStore localRecordStore = RecordStore.openRecordStore(paramString, true);
      byte[] arrayOfByte = paramArrayOfByte;
      if (!bool) {
        localRecordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
      } else {
        localRecordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
      }
      localRecordStore.closeRecordStore();
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
  
  public static final boolean a(String paramString)
  {
    int i = 0;
    try
    {
      RecordStore localRecordStore;
      i = (localRecordStore = RecordStore.openRecordStore(paramString, false)).getNumRecords();
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException) {}
    return i != 0;
  }
  
  public static final void a()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    Object localObject1;
    (localObject1 = (o)e.a).a(localDataOutputStream);
    (localObject1 = new h()).a(localDataOutputStream);
    a("rmsGAME", localByteArrayOutputStream.toByteArray());
    f.a("关卡已保存");
    try
    {
      localDataOutputStream.close();
      localByteArrayOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException;
      return;
    }
    finally
    {
      Object localObject2;
      throw (localObject2 = finally);
    }
  }
  
  public static final void b()
  {
    if (!a) {
      return;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(b("rmsGAME"));
    DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
    (localObject1 = (o)e.a).a(localDataInputStream);
    Object localObject1 = new h();
    h.a();
    ((o)localObject1).a(localDataInputStream);
    try
    {
      localDataInputStream.close();
      localByteArrayInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException;
      return;
    }
    finally
    {
      Object localObject2;
      throw (localObject2 = finally);
    }
  }
}


/* Location:              D:\Coding\Coding_JAVA\JavaGame\game_source.jar!\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */