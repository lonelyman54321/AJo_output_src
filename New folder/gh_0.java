/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from gh
 */
public final class gh_0
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;

    public gh_0(long l2) {
        this.c = l2;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        object = (xi_0)object;
        uE uE2 = ((xi_0)object).a;
        long l2 = uE2.l();
        float f5 = C63.d(l2);
        float f6 = 2.0f;
        hd1_0 hd1_02 = bj_0.d((xi_0)object, f5 /= f6);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 5;
        int n7 = 29;
        long l3 = this.c;
        if (n3 >= n7) {
            object2 = gy_0.a.a(l3, n4);
        } else {
            n7 = zx_0.i(l3);
            PorterDuff.Mode mode = Lf.b(n4);
            object2 = new PorterDuffColorFilter(n7, mode);
        }
        ay_1 ay_12 = new ay_1(l3, n4, (ColorFilter)object2);
        object2 = new fh_0(f5, hd1_02, ay_12);
        return ((xi_0)object).e((Function1)object2);
    }
}

