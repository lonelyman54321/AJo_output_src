/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 */
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookSdk;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LS1
 */
public final class ls1_1 {
    public static final ls1_1 a;
    public static File b;

    static {
        ls1_1 ls1_12;
        a = ls1_12 = new ls1_1();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(Collection var0) {
        block18: {
            block20: {
                block19: {
                    if (var0 == null) return;
                    var1_4 = var0.isEmpty();
                    if (var1_4) {
                        return;
                    }
                    var2_5 = ls1_1.b;
                    if (var2_5 == null && (var2_5 = ls1_1.e()) != null) {
                        qm0_1.d((File)var2_5);
                    }
                    if ((var2_5 = ls1_1.e()) != null) {
                        var2_5.mkdirs();
                    }
                    var2_5 = new ArrayList();
                    try {
                        var0 = var0.iterator();
lbl15:
                        // 5 sources

                        while (true) {
                            if ((var3_6 = var0.hasNext()) == false) return;
                            var4_7 = var0.next();
                            var4_7 = (ls1$a_0)var4_7;
                            var5_8 = var4_7.g;
                            if (!var5_8) continue;
                            var6_9 = var4_7.a;
                            var7_10 = var4_7.e;
                            var8_11 = 1;
                            if ((var6_9 = ls1_1.d((UUID)var6_9, var7_10, (boolean)var8_11)) == null) continue;
                            var2_5.add(var6_9);
                            var7_10 = var4_7.b;
                            var9_12 = ls1_1.a;
                            if (var7_10 != null) {
                                var9_12.getClass();
                                var4_7 = new FileOutputStream((File)var6_9);
                            }
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    catch (IOException var0_3) {
                        break block18;
                    }
                    try {
                        var6_9 = Bitmap.CompressFormat.JPEG;
                        var8_11 = 100;
                        var7_10.compress((Bitmap.CompressFormat)var6_9, var8_11, (OutputStream)var4_7);
                        ** GOTO lbl15
                    }
                    finally {
                        lz3_0.e((Closeable)var4_7);
                        ** GOTO lbl15
                    }
lbl-1000:
                    // 1 sources

                    {
                        var7_10 = var4_7.c;
                        if (var7_10 == null) ** GOTO lbl15
                        var3_6 = var4_7.f;
                        var9_12.getClass();
                        var9_12 = new FileOutputStream((File)var6_9);
                        if (var3_6) break block19;
                    }
                    try {
                        var6_9 = var7_10.getPath();
                        var4_7 = new FileInputStream((String)var6_9);
                        break block20;
                    }
                    catch (Throwable var0_2) {
                        ** GOTO lbl68
                    }
                }
                var4_7 = FacebookSdk.a();
                var4_7 = var4_7.getContentResolver();
                var4_7 = var4_7.openInputStream((Uri)var7_10);
            }
            lz3_0.k((InputStream)var4_7, (OutputStream)var9_12);
            {
                lz3_0.e((Closeable)var9_12);
                ** continue;
lbl68:
                // 1 sources

                lz3_0.e((Closeable)var9_12);
                throw var0_2;
            }
        }
        var0_3.toString();
        var2_5 = var2_5.iterator();
        while (true) {
            if (!(var3_6 = var2_5.hasNext())) {
                var2_5 = new RuntimeException(var0_3);
                throw var2_5;
            }
            var4_7 = (File)var2_5.next();
            if (var4_7 == null) continue;
            try {
                var4_7.delete();
            }
            catch (Exception v0) {
            }
        }
    }

    public static final ls1$a_0 b(UUID uUID, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(uUID, "callId");
        Intrinsics.checkNotNullParameter(bitmap, "attachmentBitmap");
        ls1$a_0 ls1$a_0 = new ls1$a_0(uUID, bitmap, null);
        return ls1$a_0;
    }

    public static final ls1$a_0 c(UUID uUID, Uri uri) {
        Intrinsics.checkNotNullParameter(uUID, "callId");
        Intrinsics.checkNotNullParameter(uri, "attachmentUri");
        ls1$a_0 ls1$a_0 = new ls1$a_0(uUID, null, uri);
        return ls1$a_0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final File d(UUID comparable, String string2, boolean bl2) {
        String string3;
        boolean bl3;
        Object object = "callId";
        Intrinsics.checkNotNullParameter(comparable, (String)object);
        File file = ls1_1.f(comparable, bl3);
        bl3 = false;
        Object object2 = null;
        if (file == null) {
            return null;
        }
        String string4 = "UTF-8";
        try {
            string3 = URLEncoder.encode(string3, string4);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return object2;
        }
        object = new File(file, string3);
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final File e() {
        Class<ls1_1> clazz = ls1_1.class;
        synchronized (clazz) {
            try {
                File file = b;
                if (file != null) return b;
                Object object = FacebookSdk.a();
                object = object.getCacheDir();
                String string2 = "com.facebook.NativeAppCallAttachmentStore.files";
                b = file = new File((File)object, string2);
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static final File f(UUID object, boolean bl2) {
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "callId");
        File file = b;
        if (file == null) {
            return null;
        }
        File file2 = b;
        object = ((UUID)object).toString();
        file = new File(file2, (String)object);
        if (bl2 && !(bl3 = file.exists())) {
            file.mkdirs();
        }
        return file;
    }
}

