/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class yd3$c
implements gx0_2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Activity g;
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    public yd3$c(LP1 lP1, ft1_2 ft1_22, p83_0 p83_02, dr0_0 dr0_02, boolean bl2, Function2 function2, Activity activity, int n3, String string2) {
        this.a = lP1;
        this.b = ft1_22;
        this.c = p83_02;
        this.d = dr0_02;
        this.e = bl2;
        this.f = function2;
        this.g = activity;
        this.h = n3;
        this.i = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        yd3$c yd3$c = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            Gx$b gx$b = Nc$a.j;
            object4 = zp.a;
            zp$i zp$i = zp.g(uq0_0.h);
            object4 = yd3$c.f;
            object6 = yd3$c.g;
            object7 = yd3$c.c;
            dr0_0 dr0_02 = yd3$c.d;
            boolean bl2 = yd3$c.e;
            ft1_2 ft1_22 = yd3$c.b;
            int n7 = yd3$c.h;
            String string2 = yd3$c.i;
            ft1_2 ft1_23 = ft1_22;
            zd3_2 zd3_22 = new zd3_2(n7, dr0_02, ft1_22, (p83_0)object7, (Activity)object6, string2, (Function2)object4, bl2);
            int n8 = 221184;
            n7 = 204;
            object6 = yd3$c.a;
            bl2 = false;
            n4 = 0;
            object4 = null;
            string2 = null;
            object7 = ft1_22;
            ft1_22 = null;
            xq1_0.b((LP1)object6, ft1_23, null, false, zp$i, gx$b, null, false, zd3_22, (b30_0)object5, n8, n7);
        }
        return Unit.a;
    }
}

