/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Xfermode
 *  android.os.Build
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class Zq3 {
    public static final Paint a;
    public static final Paint b;
    public static final Paint c;
    public static final Lock d;

    static {
        Object object = new Paint(6);
        a = object;
        int n3 = 7;
        object = new Paint(n3);
        b = object;
        String string2 = "XT1072";
        String string3 = "XT1077";
        String string4 = "XT1092";
        String string5 = "XT1093";
        String string6 = "XT1094";
        String string7 = "XT1095";
        String string8 = "XT1096";
        String string9 = "XT1097";
        String string10 = "XT1098";
        String string11 = "XT1031";
        String string12 = "XT1028";
        String string13 = "XT937C";
        String string14 = "XT1032";
        String string15 = "XT1008";
        String string16 = "XT1033";
        String string17 = "XT1035";
        String string18 = "XT1034";
        String string19 = "XT939G";
        String string20 = "XT1039";
        String string21 = "XT1040";
        String string22 = "XT1042";
        String string23 = "XT1045";
        String string24 = "XT1063";
        String string25 = "XT1064";
        String string26 = "XT1068";
        String string27 = "XT1069";
        String string28 = "XT1078";
        String string29 = "XT1079";
        Object object2 = Arrays.asList("XT1085", string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string2, string3, string28, string29);
        object = new HashSet(object2);
        boolean bl2 = ((HashSet)object).contains(object2 = Build.MODEL);
        object = bl2 ? new ReentrantLock() : new Object();
        d = object;
        object = new Paint(n3);
        c = object;
        object2 = PorterDuff.Mode.SRC_IN;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode((PorterDuff.Mode)object2);
        object.setXfermode((Xfermode)porterDuffXfermode);
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            bitmap2 = a;
            canvas.drawBitmap(bitmap, matrix, (Paint)bitmap2);
            bitmap = null;
            canvas.setBitmap(null);
            return;
        }
        finally {
            lock.unlock();
        }
    }

    public static Bitmap b(ny_0 ny_02, Bitmap bitmap, int n3, int n4) {
        int n7 = bitmap.getWidth();
        int n8 = 2;
        String string2 = "TransformationUtils";
        if (n7 == n3 && (n7 = bitmap.getHeight()) == n4) {
            Log.isLoggable((String)string2, (int)n8);
            return bitmap;
        }
        float f5 = n3;
        float f6 = bitmap.getWidth();
        f5 /= f6;
        float f7 = n4;
        f6 = bitmap.getHeight();
        f5 = Math.min(f5, f7 /= f6);
        f7 = (float)bitmap.getWidth() * f5;
        n4 = Math.round(f7);
        f6 = (float)bitmap.getHeight() * f5;
        n7 = Math.round(f6);
        int n10 = bitmap.getWidth();
        if (n10 == n4 && (n4 = bitmap.getHeight()) == n7) {
            Log.isLoggable((String)string2, (int)n8);
            return bitmap;
        }
        f7 = (float)bitmap.getWidth() * f5;
        n4 = (int)f7;
        f6 = (float)bitmap.getHeight() * f5;
        n7 = (int)f6;
        Bitmap.Config config = bitmap.getConfig();
        config = config != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
        ny_02 = ny_02.e(n4, n7, config);
        n4 = (int)(bitmap.hasAlpha() ? 1 : 0);
        ny_02.setHasAlpha(n4 != 0);
        n4 = (int)(Log.isLoggable((String)string2, (int)n8) ? 1 : 0);
        if (n4 != 0) {
            bitmap.getWidth();
            bitmap.getHeight();
            ny_02.getWidth();
            ny_02.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f5);
        Zq3.a(bitmap, (Bitmap)ny_02, matrix);
        return ny_02;
    }
}

