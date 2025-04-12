/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Renamed from uu0
 */
public final class uu0_0 {
    public static final int[] a;
    public static final int[] b;
    public static final Rect c;

    static {
        Rect rect;
        a = new int[]{0x10100A0};
        b = new int[0];
        c = rect = new Rect();
    }

    public static void a(Drawable drawable2) {
        String string2;
        Object object = drawable2.getClass().getName();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 21;
        int[] nArray = a;
        int[] nArray2 = b;
        if (n3 == n4 && (n4 = (int)((string2 = "android.graphics.drawable.VectorDrawable").equals(object) ? 1 : 0)) != 0) {
            object = drawable2.getState();
            if (object != null && (n3 = ((Object)object).length) != 0) {
                drawable2.setState(nArray2);
            } else {
                drawable2.setState(nArray);
            }
            drawable2.setState((int[])object);
        } else {
            String string3;
            boolean bl2;
            n4 = 29;
            if (n3 >= n4 && n3 < (n4 = 31) && (bl2 = (string3 = "android.graphics.drawable.ColorStateListDrawable").equals(object))) {
                object = drawable2.getState();
                if (object != null && (n3 = ((Object)object).length) != 0) {
                    drawable2.setState(nArray2);
                } else {
                    drawable2.setState(nArray);
                }
                drawable2.setState((int[])object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Rect b(Drawable object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            Insets insets = uu0$b.a((Drawable)object);
            n4 = mu0_0.a(insets);
            int n7 = ou0_1.a(insets);
            int n8 = qu0_0.a(insets);
            int n10 = su0_0.a(insets);
            return new Rect(n4, n7, n8, n10);
        }
        Drawable drawable2 = ut0_0.g((Drawable)object);
        if (n3 < n4) {
            n3 = (int)(uu0$a_0.a ? 1 : 0);
            if (n3 == 0) return c;
            try {
                Method method = uu0$a_0.b;
                n4 = 0;
                Field field = null;
                Object object2 = method.invoke((Object)drawable2, null);
                if (object2 == null) return c;
                field = uu0$a_0.c;
                n4 = field.getInt(object2);
                Field field2 = uu0$a_0.d;
                int n14 = field2.getInt(object2);
                Field field3 = uu0$a_0.e;
                int n15 = field3.getInt(object2);
                Field field4 = uu0$a_0.f;
                int n16 = field4.getInt(object2);
                return new Rect(n4, n14, n15, n16);
            }
            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                return c;
            }
        }
        boolean bl2 = uu0$a_0.a;
        return c;
    }

    public static PorterDuff.Mode c(int n3, PorterDuff.Mode mode) {
        int n4 = 3;
        if (n3 != n4) {
            n4 = 5;
            if (n3 != n4) {
                n4 = 9;
                if (n3 != n4) {
                    switch (n3) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}

