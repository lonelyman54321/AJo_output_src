/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

public final class qn {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static qn c;
    public OK2 a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static qn a() {
        Class<qn> clazz = qn.class;
        synchronized (clazz) {
            try {
                qn qn3 = c;
                if (qn3 != null) return c;
                qn.d();
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PorterDuffColorFilter c(int n3, PorterDuff.Mode mode) {
        Class<qn> clazz = qn.class;
        synchronized (clazz) {
            return OK2.h(n3, mode);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        Class<qn> clazz = qn.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = c;
                        if (object != null) break block4;
                        object = new Object();
                        c = object;
                        Object object2 = OK2.d();
                        ((qn)object).a = object2;
                        object = c;
                        object = ((qn)object).a;
                        object2 = new qn$a();
                        ((OK2)object).l((qn$a)object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static void e(Drawable drawable2, Rn3 rn3, int[] nArray) {
        Object object = OK2.h;
        object = drawable2.getState();
        Object object2 = drawable2.mutate();
        if (object2 == drawable2) {
            int n3;
            boolean bl2;
            boolean bl3 = drawable2 instanceof LayerDrawable;
            if (bl3 && (bl3 = drawable2.isStateful())) {
                object2 = new int[0];
                drawable2.setState((int[])object2);
                drawable2.setState((int[])object);
            }
            if (!(bl2 = rn3.d) && !(bl3 = rn3.c)) {
                drawable2.clearColorFilter();
            } else {
                bl3 = false;
                object2 = null;
                if (bl2) {
                    object = rn3.a;
                } else {
                    bl2 = false;
                    object = null;
                }
                boolean bl4 = rn3.c;
                rn3 = bl4 ? rn3.b : OK2.h;
                if (object != null && rn3 != null) {
                    n3 = object.getColorForState(nArray, 0);
                    object2 = OK2.h(n3, (PorterDuff.Mode)rn3);
                }
                drawable2.setColorFilter((ColorFilter)object2);
            }
            int n4 = Build.VERSION.SDK_INT;
            n3 = 23;
            if (n4 <= n3) {
                drawable2.invalidateSelf();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable b(Context context, int n3) {
        synchronized (this) {
            OK2 oK2 = this.a;
            return oK2.f(context, n3);
        }
    }
}

