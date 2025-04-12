/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class NU1 {
    public final xo1_2 a;

    public NU1(xo1_2 xo1_22) {
        this.a = xo1_22;
    }

    public static String a(String object, pL0 object2, boolean n3) {
        int n4 = 1;
        object2 = n3 != 0 ? ((pL0)((Object)object2)).tempExtension() : ((pL0)((Object)object2)).extension;
        Object object3 = "\\W+";
        String string2 = "";
        object = ((String)object).replaceAll((String)object3, string2);
        n3 = ((String)object2).length();
        n3 = 242 - n3;
        int n7 = ((String)object).length();
        if (n7 > n3) {
            byte by2;
            string2 = "MD5";
            try {
                object3 = MessageDigest.getInstance(string2);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                object = ((String)object).substring(0, n3);
            }
            object = ((String)object).getBytes();
            object = ((MessageDigest)object3).digest((byte[])object);
            object3 = new StringBuilder();
            string2 = null;
            for (n7 = 0; n7 < (by2 = ((Object)object).length); n7 += n4) {
                by2 = (byte)object[n7];
                Object object4 = by2;
                Object[] objectArray = new Object[n4];
                objectArray[0] = object4;
                object4 = String.format("%02x", objectArray);
                ((StringBuilder)object3).append((String)object4);
            }
            object = ((StringBuilder)object3).toString();
        }
        return cP.a("lottie_cache_", (String)object, (String)object2);
    }

    public final File b(String string2) {
        File file = this.c();
        Object object = pL0.JSON;
        File file2 = new File(file, (String)(object = NU1.a(string2, object, false)));
        boolean bl2 = file2.exists();
        if (bl2) {
            return file2;
        }
        file = this.c();
        object = pL0.ZIP;
        file2 = new File(file, (String)(object = NU1.a(string2, object, false)));
        bl2 = file2.exists();
        if (bl2) {
            return file2;
        }
        file = this.c();
        file2 = new File(file, string2 = NU1.a(string2, object = pL0.GZIP, false));
        boolean bl3 = file2.exists();
        if (bl3) {
            return file2;
        }
        return null;
    }

    public final File c() {
        Object object = this.a;
        object.getClass();
        object = ((Context)((xo1_2)object).a).getCacheDir();
        String string2 = "lottie_network_cache";
        File file = new File((File)object, string2);
        boolean bl2 = file.isFile();
        if (bl2) {
            file.delete();
        }
        if (!(bl2 = file.exists())) {
            file.mkdirs();
        }
        return file;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final File d(String object, InputStream inputStream, pL0 object2) {
        Throwable throwable3;
        Throwable throwable22;
        block7: {
            int n3 = 1;
            object = NU1.a((String)object, object2, n3 != 0);
            Object object3 = this.c();
            object2 = new File((File)object3, (String)object);
            object = new FileOutputStream((File)object2);
            n3 = 1024;
            try {
                int n4;
                int n7;
                object3 = new byte[n3];
                while ((n7 = inputStream.read((byte[])object3)) != (n4 = -1)) {
                    n4 = 0;
                    ((OutputStream)object).write((byte[])object3, 0, n7);
                }
            }
            catch (Throwable throwable22) {
                break block7;
            }
            ((OutputStream)object).flush();
            try {
                ((OutputStream)object).close();
            }
            catch (Throwable throwable3) {}
            inputStream.close();
            return object2;
        }
        ((OutputStream)object).close();
        throw throwable22;
        inputStream.close();
        throw throwable3;
    }
}

