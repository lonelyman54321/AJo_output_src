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
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class eb$a
implements Function2 {
    public final /* synthetic */ lq_2 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public eb$a(lq_2 lq_22, long l2, boolean bl2) {
        this.a = lq_22;
        this.b = l2;
        this.c = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        long l2;
        eb$a eb$a = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n3 = ((Number)object4).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
            return Unit.a;
        }
        Object object5 = LP1$a.b;
        object4 = j.c;
        n4 = 48;
        f5 = n4;
        object4 = j.d((LP1)object4, f5);
        Object object6 = Nc$a.k;
        Object object7 = zp.f;
        int n7 = 54;
        object6 = iQ2.a((zp$e)object7, (Gx$b)object6, (b30_0)object3, n7);
        int n8 = object3.F();
        Object object8 = object3.m();
        object4 = a30_0.c((b30_0)object3, (LP1)object4);
        N20.W.getClass();
        Object object9 = N20$a.b;
        mp mp2 = object3.i();
        int n10 = mp2 instanceof mp;
        if (n10 == 0) {
            s20.a();
            throw null;
        }
        object3.A();
        n10 = object3.e();
        if (n10 != 0) {
            object3.C((Function0)object9);
        } else {
            object3.n();
        }
        object9 = N20$a.e;
        Ow3.a((b30_0)object3, object6, (Function2)object9);
        object6 = N20$a.d;
        Ow3.a((b30_0)object3, object8, (Function2)object6);
        object6 = N20$a.f;
        n7 = (int)(object3.e() ? 1 : 0);
        if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object8 = object3.v(), object9 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
            re0_0.a(n8, (b30_0)object3, n8, (N20$a$a)object6);
        }
        object6 = N20$a.c;
        Ow3.a((b30_0)object3, object4, (Function2)object6);
        object9 = eb$a.a;
        object4 = ((lq_2)object9).a.getName();
        if (object4 == null) {
            object4 = "";
        }
        n4 = 12;
        f5 = 1.7E-44f;
        long l3 = Em3.f(n4);
        Object object10 = qv0_1.a;
        n10 = 3;
        object6 = j.n((LP1)object5, null, n10);
        float f6 = 8;
        n8 = 16;
        float f7 = n8;
        object6 = h.h((LP1)object6, f6, f7, f7, f7);
        n7 = 0;
        object8 = null;
        object7 = new db_1(object9, 0);
        object6 = CY2.b((LP1)object6, false, (Function1)object7);
        int n14 = 5;
        Cj3 cj3 = new Cj3(n14);
        int n15 = 130480;
        long l4 = l2 = eb$a.b;
        ay_1 ay_12 = null;
        long l7 = 0L;
        int n16 = 0;
        long l8 = 0L;
        float f8 = f6;
        int n17 = 0;
        int n18 = 1575936;
        LP1$a lP1$a = object5;
        object5 = object10;
        object = object3;
        object3 = cj3;
        object10 = object;
        Ll3.b((String)object4, (LP1)object6, l2, l3, null, null, (RU0)object5, l7, null, cj3, l8, 0, false, 0, 0, null, null, (b30_0)object, n18, 0, n15);
        n3 = -520506442;
        Object object11 = object;
        object.K(n3);
        object4 = object9;
        object4 = ((lq_2)object9).a.getChildDetails();
        n16 = object4 != null ? object4.size() : 0;
        if (n16 > 0) {
            long l12;
            n3 = (int)(eb$a.c ? 1 : 0);
            n4 = n3 != 0 ? R$drawable.arrow_up : R$drawable.arrow_down;
            n3 = n3 != 0 ? R$string.acc_up_arrow_icon : R$string.acc_down_arrow_icon;
            object7 = hv3_0.K(n3);
            n3 = 0;
            object4 = null;
            object4 = km2.a(n4, (b30_0)object11, 0);
            object9 = i70$a.b;
            n4 = Build.VERSION.SDK_INT;
            n7 = 29;
            if (n4 >= n7) {
                object6 = gy_0.a;
                l12 = l4;
                n7 = 5;
                object6 = ((gy_0)object6).a(l4, n7);
            } else {
                l12 = l4;
                n7 = 5;
                n10 = zx_0.i(l4);
                cj3 = Lf.b(n7);
                object6 = new PorterDuffColorFilter(n10, (PorterDuff.Mode)cj3);
            }
            ay_12 = new ay_1(l12, n7, (ColorFilter)object6);
            object6 = lP1$a;
            LP1 lP1 = j.n(lP1$a, null, 3);
            n17 = 11;
            object8 = h.i(lP1, 0.0f, 0.0f, f8, 0.0f, n17);
            int n19 = 24968;
            int n20 = 40;
            object6 = object7;
            object7 = object8;
            n7 = 0;
            object8 = null;
            n10 = 0;
            mp2 = null;
            Pd1.a((im2)object4, (String)object6, (LP1)object7, null, (i70_0)object9, 0.0f, ay_12, (b30_0)object11, n19, n20);
        }
        object11.E();
        object11.p();
        return Unit.a;
    }
}

