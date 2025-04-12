/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public final class pt3 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(File file, Resources object, int n3) {
        void var0_3;
        block4: {
            boolean bl2;
            try {
                object = object.openRawResource(n3);
            }
            catch (Throwable throwable) {
                object = null;
                break block4;
            }
            try {
                bl2 = pt3.c((InputStream)object, file);
            }
            catch (Throwable throwable) {
                break block4;
            }
            pt3.a((Closeable)object);
            return bl2;
        }
        pt3.a((Closeable)object);
        throw var0_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean c(InputStream var0, File var1_6) {
        block8: {
            var2_7 = StrictMode.allowThreadDiskWrites();
            var3_8 = 0;
            var4_9 = null;
            try {
                var5_10 = new FileOutputStream((File)var1_6, false);
                var6_11 = 1024;
            }
            catch (Throwable var0_3) {
                break block8;
            }
            catch (IOException var0_4) {
                // empty catch block
                ** GOTO lbl-1000
            }
            try {
                var1_6 = new byte[var6_11];
                while ((var3_8 = var0.read((byte[])var1_6)) != (var7_12 = -1)) {
                    var5_10.write((byte[])var1_6, 0, var3_8);
                }
            }
            catch (Throwable var0_1) {
                var4_9 = var5_10;
                break block8;
            }
            catch (IOException var0_2) {
                var4_9 = var5_10;
                ** GOTO lbl-1000
            }
            pt3.a(var5_10);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var2_7);
            return true;
lbl-1000:
            // 2 sources

            {
                var0.getMessage();
            }
            pt3.a(var4_9);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var2_7);
            return false;
        }
        pt3.a(var4_9);
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var2_7);
        throw var0_5;
    }

    public static File d(Context object) {
        if ((object = object.getCacheDir()) == null) {
            return null;
        }
        CharSequence charSequence = new StringBuilder(".font");
        int n3 = Process.myPid();
        charSequence.append(n3);
        String string2 = "-";
        charSequence.append(string2);
        int n4 = Process.myTid();
        charSequence.append(n4);
        charSequence.append(string2);
        charSequence = charSequence.toString();
        string2 = null;
        for (n3 = 0; n3 < (n4 = 100); ++n3) {
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append((String)charSequence);
            charSequence2.append(n3);
            charSequence2 = charSequence2.toString();
            File file = new File((File)object, (String)charSequence2);
            try {
                boolean bl2 = file.createNewFile();
                if (!bl2) continue;
                return file;
            }
            catch (IOException iOException) {}
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MappedByteBuffer e(Context context, Uri object) {
        Throwable throwable422222;
        Object object2;
        block14: {
            context = context.getContentResolver();
            object2 = "r";
            context = context.openFileDescriptor((Uri)object, (String)object2, null);
            if (context != null) break block14;
            if (context == null) return null;
            context.close();
            return null;
            {
                catch (IOException iOException) {
                    return null;
                }
            }
        }
        object2 = context.getFileDescriptor();
        object = new FileInputStream((FileDescriptor)object2);
        FileChannel fileChannel = ((FileInputStream)object).getChannel();
        long l2 = fileChannel.size();
        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
        long l3 = 0L;
        object2 = fileChannel.map(mapMode, l3, l2);
        ((FileInputStream)object).close();
        context.close();
        return object2;
        catch (Throwable throwable2) {
            try {
                ((FileInputStream)object).close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Throwable throwable422222) {}
            }
        }
        try {
            context.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
    }
}

