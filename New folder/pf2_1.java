/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.b;
import com.ril.ajio.R$drawable;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pf2
 */
public final class pf2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;

    public pf2_1(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    public final Object invoke(Object object, Object object2) {
        block11: {
            block12: {
                block10: {
                    Object object3;
                    Object object4;
                    int n3;
                    Object object5;
                    Object object6;
                    block9: {
                        object6 = object;
                        object6 = (b30_0)object;
                        object5 = object2;
                        object5 = (Number)object2;
                        int n4 = ((Number)object5).intValue() & 0xB;
                        if (n4 != (n3 = 2) || (n4 = (int)(object6.h() ? 1 : 0)) == 0) break block9;
                        object6.D();
                        break block10;
                    }
                    object5 = LP1$a.b;
                    int n7 = 12;
                    float f5 = n7;
                    Object object7 = object5;
                    Object object8 = h.i((LP1)object5, 0.0f, f5, 0.0f, 0.0f, 13);
                    n3 = R$drawable.chat_disabled_bg;
                    boolean bl2 = false;
                    Object object9 = km2.a(n3, (b30_0)object6, 0);
                    int n8 = 62;
                    object7 = j.o(j.m(b.a((LP1)object8, (im2)object9, null, null, 0.0f, null, n8)));
                    Object object10 = Nc$a.e;
                    Object object11 = HA.e((Nc)object10, false);
                    int n10 = object6.F();
                    Object object12 = object6.m();
                    object7 = a30_0.c((b30_0)object6, (LP1)object7);
                    N20.W.getClass();
                    Serializable serializable = N20$a.b;
                    Object object13 = object6.i();
                    boolean bl3 = object13 instanceof mp;
                    boolean bl4 = false;
                    if (!bl3) break block11;
                    object6.A();
                    bl3 = object6.e();
                    if (bl3) {
                        object6.C((Function0)((Object)serializable));
                    } else {
                        object6.n();
                    }
                    object13 = N20$a.e;
                    Ow3.a((b30_0)object6, object11, (Function2)object13);
                    object11 = N20$a.d;
                    Ow3.a((b30_0)object6, object12, (Function2)object11);
                    object12 = N20$a.f;
                    boolean bl5 = object6.e();
                    if (bl5 || !(bl5 = Intrinsics.areEqual(object4 = object6.v(), object3 = Integer.valueOf(n10)))) {
                        re0_0.a(n10, (b30_0)object6, n10, (N20$a$a)object12);
                    }
                    object10 = N20$a.c;
                    Ow3.a((b30_0)object6, object7, (Function2)object10);
                    n3 = 3;
                    object5 = j.n((LP1)object5, null, n3);
                    object4 = Nc$a.n;
                    object3 = oZ.a(zp.d, (Gx$a)object4, (b30_0)object6, 54);
                    int n14 = object6.F();
                    object8 = object6.m();
                    object5 = a30_0.c((b30_0)object6, (LP1)object5);
                    object9 = object6.i();
                    boolean bl6 = object9 instanceof mp;
                    if (!bl6) break block12;
                    object6.A();
                    bl4 = object6.e();
                    if (bl4) {
                        object6.C((Function0)((Object)serializable));
                    } else {
                        object6.n();
                    }
                    Ow3.a((b30_0)object6, object3, (Function2)object13);
                    Ow3.a((b30_0)object6, object8, (Function2)object11);
                    bl2 = object6.e();
                    if (bl2 || !(bl2 = Intrinsics.areEqual(object11 = object6.v(), serializable = Integer.valueOf(n14)))) {
                        re0_0.a(n14, (b30_0)object6, n14, (N20$a$a)object12);
                    }
                    Ow3.a((b30_0)object6, object5, (Function2)object10);
                    object5 = kk2_2.b(this.a.w0);
                    long l2 = xx_1.C;
                    Object object14 = tv0_0.m;
                    object12 = new HorizontalAlignElement((Gx$a)object4);
                    long l3 = Em3.f(n7);
                    av0_0 av0_02 = y20_0.a;
                    Object object15 = new Cj3(n3);
                    int n15 = 261520;
                    bl3 = false;
                    object13 = null;
                    long l4 = 0L;
                    n14 = 0;
                    long l7 = 0L;
                    n8 = 0;
                    int n16 = 1772928;
                    object7 = object12;
                    Cj3 cj3 = object15;
                    object15 = object14;
                    Object object16 = object6;
                    object6 = cj3;
                    object14 = object16;
                    Ll3.c((Sl)object5, (LP1)object12, l2, l3, null, (tv0_0)object15, av0_02, l4, null, cj3, l7, 0, false, 0, 0, null, null, null, (b30_0)object16, n16, 0, n15);
                    object16.p();
                    object16.p();
                }
                return Unit.a;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

