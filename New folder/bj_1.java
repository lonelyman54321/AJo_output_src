/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.ViewConfiguration
 */
import android.os.Build;
import android.view.ViewConfiguration;

/*
 * Renamed from Bj
 */
public final class bj_1
implements NC3 {
    public final ViewConfiguration a;

    public bj_1(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public final float c() {
        float f5;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            Ej ej2 = Ej.a;
            ViewConfiguration viewConfiguration = this.a;
            f5 = ej2.b(viewConfiguration);
        } else {
            n3 = 0x40000000;
            f5 = 2.0f;
        }
        return f5;
    }

    public final long d() {
        float f5 = 48;
        return zs0_1.c(f5, f5);
    }

    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    public final float g() {
        float f5;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            Ej ej2 = Ej.a;
            ViewConfiguration viewConfiguration = this.a;
            f5 = ej2.a(viewConfiguration);
        } else {
            n3 = 1098907648;
            f5 = 16.0f;
        }
        return f5;
    }
}

