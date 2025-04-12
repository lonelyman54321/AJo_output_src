/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.bonanza.model.IFilter;
import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class gN0$b
implements hx0_2 {
    public final /* synthetic */ IFilter a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ p83_0 c;

    public gN0$b(ob0_1 ob0_12, p83_0 p83_02, IFilter iFilter) {
        this.a = iFilter;
        this.b = ob0_12;
        this.c = p83_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        block9: {
            block8: {
                float f5;
                int n3;
                Object object5;
                int n4;
                Object object6;
                Object object7;
                int n7;
                Object object8;
                Object object9;
                gN0$b gN0$b;
                block7: {
                    gN0$b = this;
                    object9 = object;
                    object9 = (wr1_2)object;
                    object8 = object2;
                    object8 = (Number)object2;
                    n7 = ((Number)object8).intValue();
                    object7 = object3;
                    object7 = (b30_0)object3;
                    object6 = object4;
                    object6 = (Number)object4;
                    n4 = ((Number)object6).intValue();
                    object5 = "$this$items";
                    Intrinsics.checkNotNullParameter(object9, (String)object5);
                    n3 = n4 & 0x70;
                    if (n3 == 0) {
                        n3 = (int)(object7.c(n7) ? 1 : 0);
                        n3 = n3 != 0 ? 32 : 16;
                        n4 |= n3;
                    }
                    n3 = n4 & 0x2D1;
                    n4 = 144;
                    f5 = 2.02E-43f;
                    if (n3 != n4 || (n3 = (int)(object7.h() ? 1 : 0)) == 0) break block7;
                    object7.D();
                    break block8;
                }
                object9 = gN0$b.a;
                object6 = ((IFilter)object9).getCouponAttributeValues();
                Intrinsics.checkNotNull(object6);
                object8 = (CouponAttributeValues)((p83_0)object6).get(n7);
                LP1$a lP1$a = LP1$a.b;
                n4 = 1065353216;
                f5 = 1.0f;
                object6 = j.c(lP1$a, f5);
                int n8 = 4;
                float f6 = n8;
                object6 = h.e((LP1)object6, f6);
                object5 = Nc$a.k;
                Object object10 = zp.a;
                int n10 = 48;
                object5 = iQ2.a((zp$e)object10, (Gx$b)object5, (b30_0)object7, n10);
                int n14 = object7.F();
                Object object11 = object7.m();
                object6 = a30_0.c((b30_0)object7, (LP1)object6);
                N20.W.getClass();
                Object object12 = N20$a.b;
                Object object13 = object7.i();
                int n15 = object13 instanceof mp;
                if (n15 == 0) break block9;
                object7.A();
                n15 = object7.e();
                if (n15 != 0) {
                    object7.C((Function0)object12);
                } else {
                    object7.n();
                }
                object12 = N20$a.e;
                Ow3.a((b30_0)object7, object5, (Function2)object12);
                object5 = N20$a.d;
                Ow3.a((b30_0)object7, object11, (Function2)object5);
                object5 = N20$a.f;
                n10 = (int)(object7.e() ? 1 : 0);
                if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object11 = object7.v(), object12 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                    re0_0.a(n14, (b30_0)object7, n14, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object7, object6, (Function2)object5);
                object6 = ((CouponAttributeValues)object8).getSelected();
                Intrinsics.checkNotNull(object6);
                boolean n16 = (Boolean)object6;
                LP1 lP1 = h.e(lP1$a, f6);
                long l2 = xx_1.e;
                n15 = 54;
                object12 = object7;
                object13 = SS.a(l2, l2, (b30_0)object7, n15, 28);
                object6 = gN0$b.b;
                object10 = gN0$b.c;
                object5 = new jn0_2((ob0_1)object6, (CouponAttributeValues)object8, (IFilter)object9, (p83_0)object10);
                object12 = null;
                n10 = 0;
                object11 = null;
                n4 = (int)(n16 ? 1 : 0);
                object10 = lP1;
                int n17 = 384;
                VS.a(n4 != 0, (Function1)object5, lP1, false, null, (RS)object13, (b30_0)object7, n17);
                object6 = ((CouponAttributeValues)object8).getValue();
                Intrinsics.checkNotNull(object6);
                long l3 = Em3.f(14);
                tv0_0 tv0_02 = tv0_0.m;
                object5 = h.e(lP1$a, f6);
                int n18 = 3072;
                int n19 = 122832;
                lP1$a = null;
                long l4 = 0L;
                n3 = 0;
                object9 = null;
                object8 = object7;
                object7 = null;
                long l7 = 0L;
                int n20 = 1;
                int n21 = 200112;
                Ll3.b((String)object6, (LP1)object5, l2, l3, null, tv0_02, null, l4, null, null, l7, 0, false, n20, 0, null, null, (b30_0)object8, n21, n18, n19);
                object8.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

