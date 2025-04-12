/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.animation.AnimationUtils
 */
package androidx.compose.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class RippleHostView
extends View {
    public static final int[] f = new int[]{16842919, 16842910};
    public static final int[] g = new int[0];
    public lw3 a;
    public Boolean b;
    public Long c;
    public sp2_0 d;
    public Function0 e;

    public RippleHostView(Context context) {
        super(context);
    }

    public static /* synthetic */ void a(RippleHostView rippleHostView) {
        RippleHostView.setRippleState$lambda$2(rippleHostView);
    }

    private final void setRippleState(boolean bl2) {
        Object object;
        long l2;
        long l3;
        long l4;
        long l7 = AnimationUtils.currentAnimationTimeMillis();
        Object object2 = this.d;
        if (object2 != null) {
            this.removeCallbacks((Runnable)object2);
            ((sp2_0)object2).run();
        }
        long l8 = (object2 = this.c) != null ? (Long)object2 : 0L;
        l8 = l7 - l8;
        if (!bl2 && (l4 = (l3 = l8 - (l2 = (long)5)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            object = new sp2_0;
            object(this);
            this.d = object;
            l8 = 50;
            this.postDelayed((Runnable)object, l8);
        } else {
            object = bl2 ? f : g;
            object2 = this.a;
            if (object2 != null) {
                object2.setState(object);
            }
        }
        object = l7;
        this.c = object;
    }

    private static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        lw3 lw32 = rippleHostView.a;
        if (lw32 != null) {
            int[] nArray = g;
            lw32.setState(nArray);
        }
        rippleHostView.d = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Ey2$b ey2$b, boolean bl2, long l2, int n3, long l3, float f5, Function0 function0) {
        Object object;
        Object[] objectArray;
        int n4;
        RippleHostView rippleHostView = this;
        Ey2$b ey2$b2 = ey2$b;
        boolean bl3 = bl2;
        int n7 = n3;
        int n8 = 0;
        float f6 = 0.0f;
        lw3$a lw3$a = null;
        boolean bl4 = true;
        Object object2 = this.a;
        if (object2 == null || (n4 = Intrinsics.areEqual(object2 = Boolean.valueOf(bl2), objectArray = this.b)) == 0) {
            object2 = new lw3(bl2);
            this.setBackground((Drawable)object2);
            rippleHostView.a = object2;
            object2 = bl2;
            rippleHostView.b = object2;
        }
        lw3 lw32 = rippleHostView.a;
        Intrinsics.checkNotNull((Object)lw32);
        object2 = function0;
        rippleHostView.e = function0;
        object2 = lw32.c;
        if (object2 == null || (n4 = ((Integer)object2).intValue()) != n7) {
            lw32.c = object2 = Integer.valueOf(n3);
            n4 = Build.VERSION.SDK_INT;
            int n10 = 23;
            if (n4 < n10) {
                try {
                    n4 = (int)(lw3.f ? 1 : 0);
                    if (n4 == 0) {
                        Class<Integer> clazz;
                        lw3.f = bl4;
                        object2 = RippleDrawable.class;
                        objectArray = "setMaxRadius";
                        Class[] classArray = new Class[bl4];
                        classArray[0] = clazz = Integer.TYPE;
                        lw3.e = object2 = ((Class)object2).getDeclaredMethod((String)objectArray, classArray);
                    }
                    if ((object2 = lw3.e) != null) {
                        object = n3;
                        objectArray = new Object[bl4];
                        objectArray[0] = object;
                        ((Method)object2).invoke((Object)lw32, objectArray);
                    }
                }
                catch (Exception exception) {}
            } else {
                lw3$a = lw3$a.a;
                lw3$a.a(lw32, n7);
            }
        }
        object = this;
        long l4 = l2;
        this.setRippleProperties-07v42R4(l2, l3, f5);
        if (bl3) {
            long l7 = ey2$b2.a;
            float f7 = e72.d(l7);
            l4 = ey2$b2.a;
            f6 = e72.e(l4);
            lw32.setHotspot(f7, f6);
        } else {
            object = lw32.getBounds();
            n7 = object.centerX();
            float f8 = n7;
            lw3$a = lw32.getBounds();
            n8 = lw3$a.centerY();
            f6 = n8;
            lw32.setHotspot(f8, f6);
        }
        this.setRippleState(bl4);
    }

    public final void c() {
        this.e = null;
        Object object = this.d;
        if (object != null) {
            this.removeCallbacks((Runnable)object);
            object = this.d;
            Intrinsics.checkNotNull(object);
            object.run();
        } else {
            object = this.a;
            if (object != null) {
                int[] nArray = g;
                object.setState(nArray);
            }
        }
        object = this.a;
        if (object == null) {
            return;
        }
        object.setVisible(false, false);
        this.unscheduleDrawable((Drawable)object);
    }

    public final void d() {
        this.setRippleState(false);
    }

    public final void invalidateDrawable(Drawable object) {
        object = this.e;
        if (object != null) {
            object.invoke();
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public final void onMeasure(int n3, int n4) {
        this.setMeasuredDimension(0, 0);
    }

    public final void refreshDrawableState() {
    }

    public final void setRippleProperties-07v42R4(long l2, long l3, float f5) {
        Rect rect;
        boolean bl2;
        float f6;
        lw3 lw32 = this.a;
        if (lw32 == null) {
            return;
        }
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 < n4) {
            n3 = 2;
            f6 = n3;
            f5 *= f6;
        }
        f5 = kotlin.ranges.f.c(f5, 1.0f);
        l3 = OX.b(l3, f5);
        OX oX = lw32.b;
        n3 = 0;
        f6 = 0.0f;
        if (oX == null) {
            bl2 = false;
            f5 = 0.0f;
            oX = null;
        } else {
            long l4 = oX.a;
            bl2 = OX.c(l4, l3);
        }
        if (!bl2) {
            lw32.b = oX = new OX(l3);
            int n7 = zx_0.i(l3);
            rect = ColorStateList.valueOf((int)n7);
            lw32.setColor((ColorStateList)rect);
        }
        int n8 = ok1_1.b(C63.d(l2));
        int n10 = ok1_1.b(C63.b(l2));
        rect = new Rect(0, 0, n8, n10);
        n10 = rect.left;
        this.setLeft(n10);
        n10 = rect.top;
        this.setTop(n10);
        n10 = rect.right;
        this.setRight(n10);
        n10 = rect.bottom;
        this.setBottom(n10);
        lw32.setBounds(rect);
    }
}

