/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YL2
 */
public final class yl2_0
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ String b;

    public yl2_0(ax1_0 ax1_02, String string2) {
        this.a = ax1_02;
        this.b = string2;
    }

    public final Object invoke(Object object, Object object2) {
        block9: {
            block8: {
                int n3;
                Object object3;
                Object object4;
                int n4;
                yl2_0 yl2_02;
                block7: {
                    yl2_02 = this;
                    n4 = 2;
                    object4 = object;
                    object4 = (b30_0)object;
                    object3 = object2;
                    object3 = (Number)object2;
                    n3 = ((Number)object3).intValue() & 0xB;
                    if (n3 != n4 || (n3 = (int)(object4.h() ? 1 : 0)) == 0) break block7;
                    object4.D();
                    break block8;
                }
                LP1$a lP1$a = LP1$a.b;
                float f5 = 1.0f;
                object3 = j.c(lP1$a, f5);
                Object object5 = zp.a;
                float f6 = uq0_0.o;
                object5 = zp.g(f6);
                Object object6 = Nc$a.k;
                int n7 = 54;
                object5 = iQ2.a((zp$e)object5, (Gx$b)object6, (b30_0)object4, n7);
                int n8 = object4.F();
                Object object7 = object4.m();
                object3 = a30_0.c((b30_0)object4, (LP1)object3);
                N20.W.getClass();
                Object object8 = N20$a.b;
                mp mp2 = object4.i();
                boolean bl2 = mp2 instanceof mp;
                Object object9 = null;
                if (!bl2) break block9;
                object4.A();
                bl2 = object4.e();
                if (bl2) {
                    object4.C((Function0)object8);
                } else {
                    object4.n();
                }
                object8 = N20$a.e;
                Ow3.a((b30_0)object4, object5, (Function2)object8);
                object5 = N20$a.d;
                Ow3.a((b30_0)object4, object7, (Function2)object5);
                object5 = N20$a.f;
                n7 = (int)(object4.e() ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object7 = object4.v(), object8 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    re0_0.a(n8, (b30_0)object4, n8, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object4, object3, (Function2)object5);
                n3 = R$drawable.nav_back;
                int n10 = 0;
                av0_0 av0_02 = null;
                object3 = km2.a(n3, (b30_0)object4, 0);
                int n14 = R$string.acc_back_icon;
                String string2 = hv3_0.K(n14);
                object7 = null;
                int n15 = 14;
                bl2 = false;
                mp2 = null;
                object5 = lP1$a;
                float f7 = f6;
                object5 = h.i(lP1$a, f6, 0.0f, 0.0f, 0.0f, n15);
                f7 = uq0_0.s;
                object5 = j.h((LP1)object5, f7);
                n8 = 138089101;
                f7 = 5.629507E-34f;
                object4.K(n8);
                object6 = yl2_02.a;
                n7 = (int)(object4.J(object6) ? 1 : 0);
                object8 = object4.v();
                if (n7 != 0 || object8 == (object7 = b30$a.a)) {
                    object6 = (ax1_0)object6;
                    object8 = new oj0_1(object6, n4);
                    object4.o(object8);
                }
                object8 = (Function0)object8;
                object4.E();
                object6 = d.b((LP1)object5, false, null, (Function0)object8, 7);
                n10 = 8;
                n4 = 120;
                object8 = null;
                bl2 = false;
                mp2 = null;
                object5 = string2;
                object9 = object4;
                Pd1.a((im2)object3, string2, (LP1)object6, null, null, 0.0f, null, (b30_0)object4, n10, n4);
                n8 = 0;
                f7 = 0.0f;
                object6 = null;
                n7 = 0;
                object7 = null;
                object5 = lP1$a;
                object5 = j.c(h.i(lP1$a, 0.0f, 0.0f, f6, 0.0f, 11), f5);
                av0_02 = y20_0.a;
                object9 = tv0_0.h;
                long l2 = oj3_2.f;
                int n16 = 130964;
                object3 = yl2_02.b;
                long l3 = 0L;
                n15 = 0;
                long l4 = 0L;
                f5 = 0.0f;
                f6 = 0.0f;
                long l7 = 0L;
                int n17 = 1772592;
                Ll3.b((String)object3, (LP1)object5, l3, l2, null, (tv0_0)object9, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object4, n17, 0, n16);
                object4.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

