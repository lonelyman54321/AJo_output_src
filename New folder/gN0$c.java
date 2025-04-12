/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.bonanza.model.IFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class gN0$c
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ IFilter b;
    public final /* synthetic */ ob0_1 c;

    public gN0$c(ob0_1 ob0_12, p83_0 p83_02, IFilter iFilter) {
        this.a = p83_02;
        this.b = iFilter;
        this.c = ob0_12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        block16: {
            block15: {
                float f5;
                int n3;
                Object object5;
                int n4;
                Object object6;
                Object object7;
                int n7;
                Object object8;
                Object object9;
                gN0$c gN0$c;
                block14: {
                    gN0$c = this;
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
                        if (n3 != 0) {
                            n3 = 32;
                            f5 = 4.5E-44f;
                        } else {
                            n3 = 16;
                            f5 = 2.2E-44f;
                        }
                        n4 |= n3;
                    }
                    if ((n3 = n4 & 0x2D1) != (n4 = 144) || (n3 = (int)(object7.h() ? 1 : 0)) == 0) break block14;
                    object7.D();
                    break block15;
                }
                object9 = gN0$c.a;
                object8 = (IFilter)((p83_0)object9).get(n7);
                object6 = gN0$c.b;
                ob0_1 ob0_12 = gN0$c.c;
                if (object6 == null) {
                    object9 = (IFilter)((p83_0)object9).get(0);
                    ob0_12.getClass();
                    Intrinsics.checkNotNullParameter(object9, "filter");
                    object5 = ob0_12.n;
                    ((h83_0)object5).setValue(object9);
                }
                object9 = tv0_0.m;
                LP1$a lP1$a = LP1$a.b;
                int n8 = 1065353216;
                float f6 = 1.0f;
                object5 = j.c(lP1$a, f6);
                boolean bl2 = false;
                Object object10 = null;
                if (object6 != null) {
                    object6 = ((IFilter)object6).getKey();
                } else {
                    n4 = 0;
                    object6 = null;
                }
                Object object11 = ((IFilter)object8).getKey();
                n4 = (int)(kotlin.text.b.i((String)object6, (String)object11, false) ? 1 : 0);
                fG2$a fG2$a = fg2_1.a;
                if (n4 != 0) {
                    object9 = tv0_0.n;
                    long l2 = OX.f;
                    object5 = androidx.compose.foundation.a.b((LP1)object5, l2, fG2$a);
                }
                object6 = Nc$a.k;
                object11 = new kn0_1(ob0_12, (IFilter)object8);
                int n10 = 7;
                object5 = d.b((LP1)object5, false, null, (Function0)object11, n10);
                object11 = zp.a;
                int n14 = 48;
                object6 = iQ2.a((zp$e)object11, (Gx$b)object6, (b30_0)object7, n14);
                int n15 = object7.F();
                Object object12 = object7.m();
                object5 = a30_0.c((b30_0)object7, (LP1)object5);
                N20.W.getClass();
                Xp1$a xp1$a = N20$a.b;
                mp mp2 = object7.i();
                boolean bl3 = mp2 instanceof mp;
                if (!bl3) break block16;
                object7.A();
                bl2 = object7.e();
                if (bl2) {
                    object7.C(xp1$a);
                } else {
                    object7.n();
                }
                object10 = N20$a.e;
                Ow3.a((b30_0)object7, object6, (Function2)object10);
                object6 = N20$a.d;
                Ow3.a((b30_0)object7, object12, (Function2)object6);
                object6 = N20$a.f;
                bl2 = object7.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object10 = object7.v(), object12 = Integer.valueOf(n15)))) {
                    re0_0.a(n15, (b30_0)object7, n15, (N20$a$a)object6);
                }
                object6 = N20$a.c;
                Ow3.a((b30_0)object7, object5, (Function2)object6);
                object6 = ((IFilter)object8).getKey();
                Intrinsics.checkNotNull(object6);
                long l3 = Em3.f(13);
                long l4 = xx_1.e;
                n8 = 10;
                f6 = n8;
                object5 = h.e(lP1$a, f6);
                int n16 = 131024;
                n15 = 0;
                object11 = null;
                n14 = 0;
                object12 = null;
                long l7 = 0L;
                bl2 = false;
                object10 = null;
                n10 = 0;
                fG2$a fG2$a2 = fG2$a;
                fG2$a = null;
                long l8 = 0L;
                int n17 = 3504;
                object = object7;
                object7 = object9;
                Ll3.b((String)object6, (LP1)object5, l4, l3, null, (tv0_0)object9, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object, n17, 0, n16);
                f5 = -3.7472837E-22f;
                object6 = object;
                object.K(-1679654296);
                object9 = ob0_12;
                object9 = ob0_12.z;
                object8 = ((IFilter)object8).getKey();
                n3 = (int)(object9.containsKey(object8) ? 1 : 0);
                if (n3 != 0) {
                    n3 = 7;
                    f5 = n3;
                    object8 = lP1$a;
                    object9 = j.h(lP1$a, f5);
                    object8 = SP2.a;
                    object9 = QV.a((LP1)object9, (i13)object8);
                    long l12 = xx_1.s;
                    object8 = fG2$a2;
                    object9 = androidx.compose.foundation.a.b((LP1)object9, l12, fG2$a2);
                    n7 = 0;
                    object8 = null;
                    HA.a((LP1)object9, (b30_0)object, 0);
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

