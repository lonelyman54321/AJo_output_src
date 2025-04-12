/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Renamed from Ud3
 */
public final class ud3_0
implements Ez0 {
    public final Kp a;

    public ud3_0(Kp kp) {
        this.a = kp;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(Object object, File file, Z92 object2) {
        void var1_4;
        Kp kp;
        block18: {
            boolean bl2;
            block17: {
                OutputStream outputStream;
                block15: {
                    int n3;
                    block16: {
                        object = (InputStream)object;
                        int n4 = 65536;
                        kp = this.a;
                        object2 = (byte[])kp.c(byte[].class, n4);
                        bl2 = false;
                        int n7 = 0;
                        outputStream = null;
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            while ((n3 = ((InputStream)object).read((byte[])object2)) != (n7 = -1)) {
                                ((OutputStream)fileOutputStream).write((byte[])object2, 0, n3);
                            }
                            ((OutputStream)fileOutputStream).close();
                        }
                        catch (Throwable throwable) {
                            outputStream = fileOutputStream;
                            break block15;
                        }
                        catch (IOException iOException) {
                            outputStream = fileOutputStream;
                            break block16;
                        }
                        try {
                            ((OutputStream)fileOutputStream).close();
                        }
                        catch (IOException iOException) {}
                        kp.put(object2);
                        return true;
                        catch (Throwable throwable) {
                            break block15;
                        }
                        catch (IOException iOException) {}
                    }
                    object = "StreamEncoder";
                    n3 = 3;
                    {
                        Log.isLoggable((String)object, (int)n3);
                        if (outputStream == null) break block17;
                    }
                    try {
                        outputStream.close();
                        break block17;
                    }
                    catch (IOException iOException) {}
                }
                if (outputStream == null) break block18;
                try {
                    outputStream.close();
                    break block18;
                }
                catch (IOException iOException) {}
            }
            kp.put(object2);
            return bl2;
        }
        kp.put(object2);
        throw var1_4;
    }
}

