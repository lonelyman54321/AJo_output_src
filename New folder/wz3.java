/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import java.io.Closeable;

public final class wz3 {
    public static final Matrix a;
    public static final wz3$a b;
    public static final wz3$b c;
    public static final wz3$c d;
    public static final wz3$d e;
    public static final float f;

    static {
        Object object;
        a = object = new Matrix();
        object = new ThreadLocal();
        b = object;
        object = new ThreadLocal();
        c = object;
        object = new ThreadLocal();
        d = object;
        object = new ThreadLocal();
        e = object;
        double d2 = 2.0;
        f = (float)(Math.sqrt(d2) / d2);
    }

    public static void a(Path path, float f5, float f6, float f7) {
        double d2;
        float f8;
        double d5;
        double d7;
        float f11;
        Hq hq = Yo1.a;
        hq = (PathMeasure)b.get();
        Path path2 = (Path)c.get();
        Path path3 = (Path)d.get();
        hq.setPath(path, false);
        float f12 = hq.getLength();
        int n3 = 1065353216;
        float f14 = 1.0f;
        Object object = f5 == f14 ? 0 : (f5 > f14 ? 1 : -1);
        if (object == false && (object = (f11 = f6 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) == false) {
            return;
        }
        object = f12 == f14 ? 0 : (f12 < f14 ? -1 : 1);
        if (object >= 0 && (n3 = (int)((d7 = (d5 = (double)(f14 = Math.abs(f8 = f6 - f5 - f14))) - (d2 = 0.01)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1))) >= 0) {
            float f15;
            float f16;
            int n4;
            float f17;
            f14 = Math.min(f5 *= f12, f6 *= f12);
            f5 = Math.max(f5, f6);
            float f18 = (f14 += (f7 *= f12)) - f12;
            Object object2 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            if (object2 >= 0 && (object2 = (f17 = (f5 += f7) - f12) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1)) >= 0) {
                object2 = mp1_0.d(f14, f12);
                f14 = object2;
                n4 = mp1_0.d(f5, f12);
                f5 = n4;
            }
            if ((object2 = (f16 = f14 - 0.0f) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1)) < 0) {
                object2 = mp1_0.d(f14, f12);
                f14 = object2;
            }
            if ((object2 = (f15 = f5 - 0.0f) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1)) < 0) {
                n4 = mp1_0.d(f5, f12);
                f5 = n4;
            }
            if ((object2 = f14 == f5 ? 0 : (f14 > f5 ? 1 : -1)) == false) {
                path.reset();
                return;
            }
            if (object2 >= 0) {
                f14 -= f12;
            }
            path2.reset();
            object2 = true;
            f6 = Float.MIN_VALUE;
            hq.getSegment(f14, f5, path2, (boolean)object2);
            float f19 = f5 == f12 ? 0 : (f5 > f12 ? 1 : -1);
            if (f19 > 0) {
                path3.reset();
                hq.getSegment(0.0f, f5 %= f12, path3, (boolean)object2);
                path2.addPath(path3);
            } else {
                float f20 = f14 - 0.0f;
                n4 = (int)(f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1));
                if (n4 < 0) {
                    path3.reset();
                    hq.getSegment(f14 += f12, f12, path3, (boolean)object2);
                    path2.addPath(path3);
                }
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (RuntimeException runtimeException) {
                throw runtimeException;
            }
            catch (Exception exception) {}
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int n3, int n4) {
        int n7 = bitmap.getWidth();
        if (n7 == n3 && (n7 = bitmap.getHeight()) == n4) {
            return bitmap;
        }
        Bitmap bitmap2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n3, (int)n4, (boolean)true);
        bitmap.recycle();
        return bitmap2;
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 < n4) {
            n3 = 31;
            canvas.saveLayer(rectF, paint, n3);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }
}

