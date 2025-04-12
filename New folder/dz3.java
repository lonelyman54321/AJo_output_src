/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Handler
 *  android.os.Looper
 */
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

public final class dz3 {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    public static volatile Handler c;

    public static void a() {
        Looper looper;
        Object object = Looper.myLooper();
        if (object == (looper = Looper.getMainLooper())) {
            return;
        }
        object = new IllegalArgumentException("You must call this method on the main thread");
        throw object;
    }

    public static boolean b(Object object, Object object2) {
        boolean bl2;
        if (object == null) {
            if (object2 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
        } else {
            bl2 = object.equals(object2);
        }
        return bl2;
    }

    public static int c(Bitmap object) {
        int n3 = object.isRecycled();
        if (n3 == 0) {
            try {
                return object.getAllocationByteCount();
            }
            catch (NullPointerException nullPointerException) {
                n3 = object.getHeight();
                return object.getRowBytes() * n3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        stringBuilder.append(object);
        stringBuilder.append("[");
        int n4 = object.getWidth();
        stringBuilder.append(n4);
        stringBuilder.append("x");
        n4 = object.getHeight();
        stringBuilder.append(n4);
        stringBuilder.append("] ");
        object = object.getConfig();
        stringBuilder.append(object);
        object = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public static int d(Bitmap.Config config) {
        int n3;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int[] nArray = dz3$a.a;
        int n4 = config.ordinal();
        int n7 = 1;
        if ((n4 = nArray[n4]) != n7 && n4 != (n7 = 2) && n4 != (n3 = 3) && n4 == (n7 = 4)) {
            n7 = 8;
        }
        return n7;
    }

    public static ArrayList e(Collection object) {
        int n3 = object.size();
        ArrayList arrayList = new ArrayList(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object e2 = object.next();
            if (e2 == null) continue;
            arrayList.add(e2);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Handler f() {
        Object object = c;
        if (object != null) return c;
        object = dz3.class;
        synchronized (object) {
            try {
                Handler handler = c;
                if (handler != null) return c;
                Looper looper = Looper.getMainLooper();
                c = handler = new Handler(looper);
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static int g(int n3, int n4) {
        return n4 * 31 + n3;
    }

    public static int h(int n3, Object object) {
        int n4;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        return dz3.g(n4, n3);
    }

    public static boolean i(int n3, int n4) {
        int n7 = -1 << -1;
        n3 = n3 <= 0 && n3 != n7 || n4 <= 0 && n4 != n7 ? 0 : 1;
        return n3 != 0;
    }
}

