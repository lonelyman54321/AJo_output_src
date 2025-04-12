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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from dj
 */
public final class dj_2
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;

    public dj_2(long l2, Function0 function0, boolean bl2) {
        this.c = l2;
        this.d = function0;
        this.e = bl2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (xi_0)object;
        Object object2 = ((xi_0)object).a;
        long l2 = object2.l();
        float f5 = C63.d(l2) / 2.0f;
        hd1_0 hd1_02 = bj_0.d((xi_0)object, f5);
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
        Function0 function0 = this.d;
        boolean bl2 = this.e;
        object2 = new cj_0(function0, bl2, hd1_02, ay_12, 0);
        return ((xi_0)object).e((Function1)object2);
    }
}

