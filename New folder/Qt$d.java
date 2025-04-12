/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.bonanza.model.ICoupon;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class Qt$d
implements hx0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ p83_0 d;

    public Qt$d(ArrayList arrayList, ob0_1 ob0_12, boolean bl2, p83_0 p83_02) {
        this.a = arrayList;
        this.b = ob0_12;
        this.c = bl2;
        this.d = p83_02;
    }

    public final Object invoke(Object iterator, Object object, Object object2, Object object3) {
        block15: {
            block14: {
                long l2;
                float f5;
                Object object4;
                int n3;
                Object object5;
                Object object6;
                int n4;
                Object object7;
                Object object8;
                Qt$d qt$d;
                block13: {
                    qt$d = this;
                    object8 = iterator;
                    object8 = (wr1_2)((Object)iterator);
                    object7 = object;
                    object7 = (Number)object;
                    n4 = ((Number)object7).intValue();
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n3 = ((Number)object5).intValue();
                    object4 = "$this$items";
                    Intrinsics.checkNotNullParameter(object8, (String)object4);
                    int n7 = n3 & 0x70;
                    if (n7 == 0) {
                        n7 = (int)(object6.c(n4) ? 1 : 0);
                        n7 = n7 != 0 ? 32 : 16;
                        n3 |= n7;
                    }
                    n7 = n3 & 0x2D1;
                    n3 = 144;
                    f5 = 2.02E-43f;
                    if (n7 != n3 || (n7 = (int)(object6.h() ? 1 : 0)) == 0) break block13;
                    object6.D();
                    break block14;
                }
                object8 = qt$d.a;
                object5 = (List)object8.get(n4);
                n3 = object5.size();
                int n8 = 2;
                LP1$a lP1$a = LP1$a.b;
                float f6 = 1.0f;
                fG2$a fG2$a = fg2_1.a;
                if ((n3 %= n8) != 0) {
                    n3 = 0x3F000000;
                    f5 = 0.5f;
                    object5 = j.c(lP1$a, f5);
                    l2 = OX.f;
                    object5 = androidx.compose.foundation.a.b((LP1)object5, l2, fG2$a);
                } else {
                    object5 = j.c(lP1$a, f6);
                    l2 = OX.f;
                    object5 = androidx.compose.foundation.a.b((LP1)object5, l2, fG2$a);
                }
                object4 = zp.a;
                Object object9 = Nc$a.j;
                boolean bl2 = false;
                object4 = iQ2.a((zp$e)object4, (Gx$b)object9, (b30_0)object6, 0);
                int n10 = object6.F();
                Object object10 = object6.m();
                object5 = a30_0.c((b30_0)object6, (LP1)object5);
                N20.W.getClass();
                Object object11 = N20$a.b;
                Object object12 = object6.i();
                int n14 = object12 instanceof mp;
                if (n14 == 0) break block15;
                object6.A();
                n14 = object6.e();
                if (n14 != 0) {
                    object6.C((Function0)object11);
                } else {
                    object6.n();
                }
                object11 = N20$a.e;
                Ow3.a((b30_0)object6, object4, (Function2)object11);
                object4 = N20$a.d;
                Ow3.a((b30_0)object6, object10, (Function2)object4);
                object4 = N20$a.f;
                bl2 = object6.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object10 = object6.v(), object11 = Integer.valueOf(n10)))) {
                    re0_0.a(n10, (b30_0)object6, n10, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object6, object5, (Function2)object4);
                n3 = 332286040;
                f5 = 5.2073047E-27f;
                object6.K(n3);
                object8 = ((Iterable)object8.get(n4)).iterator();
                while ((n4 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
                    long l3;
                    float f7;
                    double d2;
                    object9 = object7 = object8.next();
                    object9 = (ICoupon)object7;
                    n4 = (int)(((ICoupon)object9).isSelected() ? 1 : 0);
                    long l4 = 4620130267728707584L;
                    double d5 = 7.5;
                    f5 = (float)d5;
                    object5 = h.e(lP1$a, f5);
                    boolean bl3 = 220 != 0;
                    float f8 = (float)bl3;
                    LP1 lP1 = j.d((LP1)object5, f8);
                    n3 = 20;
                    f5 = 2.8E-44f;
                    if (n4 != 0) {
                        d2 = 1.25;
                        f7 = (float)d2;
                        l3 = xx_1.e;
                        f5 = n3;
                        object5 = SP2.a(f5);
                        object7 = gz.a(lP1, f7, l3, (i13)object5);
                        l4 = OX.f;
                        object7 = androidx.compose.foundation.a.b((LP1)object7, l4, fG2$a);
                    } else {
                        f7 = n8;
                        f5 = n3;
                        rp2_0 rp2_02 = SP2.a(f5);
                        long l7 = 0L;
                        long l8 = 0L;
                        int n15 = 28;
                        object7 = c13_0.c(lP1, f7, rp2_02, l7, l8, n15);
                        l4 = OX.f;
                        object7 = androidx.compose.foundation.a.b((LP1)object7, l4, fG2$a);
                    }
                    d5 = f6;
                    l3 = 0L;
                    d2 = 0.0;
                    n14 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
                    if (n14 > 0) {
                        f8 = f.c(f6, Float.MAX_VALUE);
                        bl2 = true;
                        object5 = new LayoutWeightElement(f8, bl2);
                        object10 = object7.then((LP1)object5);
                        object5 = qt$d.b;
                        object7 = qt$d.d;
                        object11 = new tt_0((ob0_1)object5, (ICoupon)object9, (p83_0)object7);
                        int n16 = 520;
                        bl3 = qt$d.c;
                        object12 = object6;
                        qt_0.g((ob0_1)object5, bl3, (ICoupon)object9, (LP1)object10, (tt_0)object11, (b30_0)object6, n16);
                        continue;
                    }
                    object8 = g9_0.a(f6, "invalid weight ", "; must be greater than zero");
                    object8 = object8.toString();
                    object7 = new IllegalArgumentException((String)object8);
                    throw object7;
                }
                object6.E();
                object6.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

