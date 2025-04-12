/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Base64OutputStream
 */
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * Renamed from tY2
 */
public final class ty2_2 {
    public final boolean a;
    public String b = "/ComplaintDetails";

    public ty2_2(boolean bl2) {
        this.a = bl2;
    }

    public static String b(Context object, Uri uri) {
        object = object.getContentResolver();
        object = object.openInputStream(uri);
        try {
            object = ty2_2.g((InputStream)object);
        }
        catch (IOException iOException) {
            object = "";
        }
        return object;
    }

    public static String c(String string2, String string3) {
        Locale locale = Locale.getDefault();
        Object object = new SimpleDateFormat("yyyyMMdd_HHmmss", locale);
        Date date = new Date();
        object = ((DateFormat)object).format(date);
        return KW.a(string2, "_", (String)object, ".", string3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Bitmap d(int n3, String string2) {
        File file;
        Bitmap bitmap = null;
        try {
            file = new File(string2);
        }
        catch (Exception exception) {
            return bitmap;
        }
        string2 = new BitmapFactory.Options();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        ((BitmapFactory.Options)string2).inPreferredConfig = config;
        ((BitmapFactory.Options)string2).inSampleSize = n3;
        FileInputStream fileInputStream = new FileInputStream(file);
        return BitmapFactory.decodeStream((InputStream)fileInputStream, null, (BitmapFactory.Options)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e(Context context, Uri uri) {
        String[] stringArray = new String[]{"_display_name"};
        String string2 = "";
        if (context == null) return string2;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) return string2;
            contentResolver = context.getContentResolver();
            if ((context = contentResolver.query(uri, stringArray, null, null, null)) == null) return string2;
            boolean bl2 = context.moveToFirst();
            if (bl2) {
                bl2 = false;
                uri = null;
                string2 = context.getString(0);
            }
            context.close();
            return string2;
        }
        catch (Exception exception) {
            return string2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float f(Context context, Uri object) {
        float f5;
        block9: {
            ContentResolver contentResolver;
            f5 = 0.0f;
            try {
                contentResolver = context.getContentResolver();
            }
            catch (Exception exception) {
                return f5;
            }
            context = contentResolver.query(object, null, null, null, null);
            if (context == null) break block9;
            String string2 = "_size";
            int n3 = context.getColumnIndex(string2);
            context.moveToFirst();
            long l2 = context.getLong(n3);
            long l3 = 0L;
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 > 0) {
                float f6 = l2;
                f5 = f6 / (float)8;
            }
            context.close();
        }
        return f5;
    }

    public static String g(InputStream inputStream) {
        String string2;
        if (inputStream != null) {
            int n3;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            string2 = new Base64OutputStream((OutputStream)byteArrayOutputStream, 2);
            int n4 = 1536;
            byte[] byArray = new byte[n4];
            while ((n3 = inputStream.read(byArray)) >= 0) {
                string2.write(byArray, 0, n3);
            }
            byteArrayOutputStream.size();
            ((OutputStream)((Object)string2)).flush();
            string2.close();
            byArray = byteArrayOutputStream.toByteArray();
            Charset charset = StandardCharsets.UTF_8;
            string2 = new String(byArray, charset);
            byteArrayOutputStream.close();
            inputStream.close();
        } else {
            string2 = "";
        }
        return string2;
    }

    public static String i(String string2) {
        block4: {
            Object[] objectArray = null;
            int n3 = TextUtils.isEmpty((CharSequence)string2);
            if (n3 != 0) break block4;
            n3 = 46;
            n3 = string2.lastIndexOf(n3);
            int n4 = -1;
            if (n3 <= n4) break block4;
            try {
                string2 = string2.substring(0, n3);
            }
            catch (Exception exception) {
                String string3 = kp1_0.c("trimExtension ", string2);
                objectArray = new Object[]{};
                yn3$a yn3$a = yn3_0.a;
                yn3$a.d(string3, objectArray);
            }
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String a(Uri object, Context object2, String object3) {
        void var2_9;
        Object object4;
        void var2_4;
        if (var2_4 != null && (object4 = var2_4.getContentResolver().openInputStream(object)) != null) {
            File file;
            int n3;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = n3 = 1;
            InputStream inputStream = var2_4.getContentResolver().openInputStream(object);
            BitmapFactory.decodeStream((InputStream)inputStream, null, (BitmapFactory.Options)options);
            int n4 = options.outHeight;
            int n7 = options.outWidth;
            options.inJustDecodeBounds = false;
            int n8 = 1000;
            if (n4 > n7) {
                if (n4 > n8) {
                    n3 = n4 / 1000;
                }
                options.inSampleSize = n3;
            } else {
                if (n7 > n8) {
                    n3 = n7 / 1000;
                }
                options.inSampleSize = n3;
            }
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)object4, null, (BitmapFactory.Options)options);
            ((InputStream)object4).close();
            if (bitmap != null && (file = var2_4.getExternalCacheDir()) != null) {
                String string2 = this.b;
                object4 = new File(file, string2);
                ((File)object4).mkdir();
                boolean bl2 = ((File)object4).exists();
                if (bl2) {
                    FileOutputStream fileOutputStream;
                    String string3 = n1.a(((File)object4).getAbsolutePath(), "/", (String)((Object)fileOutputStream));
                    fileOutputStream = new FileOutputStream(string3);
                    object4 = Bitmap.CompressFormat.JPEG;
                    int n10 = 80;
                    bitmap.compress((Bitmap.CompressFormat)object4, n10, (OutputStream)fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return var2_9;
                }
            }
        }
        String string4 = "";
        return var2_9;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final uy2_2 h(Context object, Uri object2) {
        Object object3;
        String string2;
        void var2_3;
        uy2_2 uy2_22;
        block18: {
            block17: {
                uy2_22 = new uy2_2();
                try {
                    string2 = ty2_2.e(object, (Uri)var2_3);
                }
                catch (IOException iOException) {
                    return uy2_22;
                }
                boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
                if (!bl2) break block17;
                string2 = "IMG";
                object3 = "jpeg";
                string2 = ty2_2.c(string2, (String)object3);
                break block18;
            }
            object3 = new StringBuilder();
            string2 = ty2_2.i(string2);
            ((StringBuilder)object3).append(string2);
            string2 = ".jpeg";
            ((StringBuilder)object3).append(string2);
            string2 = ((StringBuilder)object3).toString();
        }
        String string3 = this.a((Uri)var2_3, (Context)object, string2);
        FileInputStream fileInputStream = new FileInputStream(string3);
        String string4 = ty2_2.g(fileInputStream);
        object3 = new File(string3);
        ((File)object3).length();
        uy2_22.b = string4;
        uy2_22.a = string2;
        uy2_22.c = string3;
        return uy2_22;
    }
}

