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
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

public final class eb$b
implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ j7_0 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ ou0_0 f;

    public eb$b(long l2, long l3, j7_0 j7_02, Ref$ObjectRef ref$ObjectRef, yT1 yT12, ou0_0 ou0_02) {
        this.a = l2;
        this.b = l3;
        this.c = j7_02;
        this.d = ref$ObjectRef;
        this.e = yT12;
        this.f = ou0_02;
    }

    public final Object invoke(Object object, Object object2) {
        block11: {
            block10: {
                PorterDuff.Mode mode;
                int n3;
                int n4;
                Object object3;
                Object object4;
                eb$b eb$b;
                block9: {
                    eb$b = this;
                    object4 = object;
                    object4 = (b30_0)object;
                    object3 = object2;
                    object3 = (Number)object2;
                    n4 = ((Number)object3).intValue() & 0xB;
                    if (n4 != (n3 = 2) || (n4 = (int)(object4.h() ? 1 : 0)) == 0) break block9;
                    object4.D();
                    break block10;
                }
                LP1$a lP1$a = LP1$a.b;
                object3 = fg2_1.a;
                long l2 = eb$b.a;
                Object object5 = androidx.compose.foundation.a.b(lP1$a, l2, (i13)object3);
                float f5 = 12;
                int n7 = 16;
                float f6 = n7;
                object3 = androidx.compose.foundation.a.b(h.h((LP1)object5, f5, f6, f6, f6), l2, (i13)object3);
                Object object6 = Nc$a.k;
                Object object7 = zp.a;
                int n8 = 48;
                object6 = iQ2.a((zp$e)object7, (Gx$b)object6, (b30_0)object4, n8);
                int n10 = object4.F();
                object5 = object4.m();
                object3 = a30_0.c((b30_0)object4, (LP1)object3);
                N20.W.getClass();
                Object object8 = N20$a.b;
                Object object9 = object4.i();
                int n14 = object9 instanceof mp;
                if (n14 == 0) break block11;
                object4.A();
                n14 = object4.e();
                if (n14 != 0) {
                    object4.C((Function0)object8);
                } else {
                    object4.n();
                }
                object8 = N20$a.e;
                Ow3.a((b30_0)object4, object6, (Function2)object8);
                object6 = N20$a.d;
                Ow3.a((b30_0)object4, object5, (Function2)object6);
                object6 = N20$a.f;
                n8 = (int)(object4.e() ? 1 : 0);
                if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object5 = object4.v(), object8 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                    re0_0.a(n10, (b30_0)object4, n10, (N20$a$a)object6);
                }
                object6 = N20$a.c;
                Ow3.a((b30_0)object4, object3, (Function2)object6);
                n4 = R$drawable.nav_back;
                n3 = 0;
                object6 = null;
                object3 = km2.a(n4, (b30_0)object4, 0);
                n10 = R$string.acc_back_icon;
                object7 = hv3_0.K(n10);
                object8 = i70$a.b;
                n8 = Build.VERSION.SDK_INT;
                n14 = 5;
                int n15 = 29;
                long l3 = eb$b.b;
                if (n8 >= n15) {
                    object5 = gy_0.a.a(l3, n14);
                } else {
                    n15 = zx_0.i(l3);
                    mode = Lf.b(n14);
                    object5 = new PorterDuffColorFilter(n15, mode);
                }
                ay_1 ay_12 = new ay_1(l3, n14, (ColorFilter)object5);
                object5 = j.n(lP1$a, null, 3);
                Object object10 = eb$b.e;
                object9 = new fb_2(object10, 0);
                object5 = androidx.compose.foundation.d.b((LP1)object5, false, null, (Function0)object9, 7);
                object6 = object7;
                object7 = object5;
                n8 = 0;
                n14 = 0;
                object9 = null;
                object10 = object4;
                int n16 = 24584;
                int n17 = 40;
                Pd1.a((im2)object3, (String)object6, (LP1)object5, null, (i70_0)object8, 0.0f, ay_12, (b30_0)object4, n16, n17);
                object3 = (String)((tr1_0)eb$b.d.element).getValue();
                eb$b.c.getClass();
                Intrinsics.checkNotNullParameter(object3, "path");
                object3 = StringsKt.h0((String)object3, "/", (String)object3);
                long l4 = Em3.f(14);
                av0_0 av0_02 = qv0_1.a;
                n3 = 3;
                object7 = h.i(j.n(lP1$a, null, n3), f5, 0.0f, 0.0f, 0.0f, 14);
                object5 = new Cj3(n3);
                int n18 = 130480;
                ay_12 = null;
                n15 = 0;
                object10 = null;
                long l7 = 0L;
                mode = null;
                long l8 = 0L;
                int n19 = 1575984;
                object6 = object7;
                object = object4;
                object4 = object5;
                Ll3.b((String)object3, (LP1)object7, l3, l4, null, null, av0_02, l7, null, (Cj3)object5, l8, 0, false, 0, 0, null, null, (b30_0)object, n19, 0, n18);
                object.p();
                object3 = Unit.a;
                n3 = 446281185;
                object7 = object;
                object.K(n3);
                object6 = object.v();
                object5 = b30$a.a;
                if (object6 == object5) {
                    object5 = eb$b.f;
                    n7 = 0;
                    f6 = 0.0f;
                    object8 = null;
                    object6 = new hb_2((ou0_0)object5, null);
                    object.o(object6);
                }
                object6 = (Function2)object6;
                object7.E();
                ly0_0.d((b30_0)object7, object3, (Function2)object6);
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

