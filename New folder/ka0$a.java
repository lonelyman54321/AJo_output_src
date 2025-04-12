/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$string;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ka0$a
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public ka0$a(int n3, String string2, String string3) {
        this.a = n3;
        this.b = string2;
        this.c = string3;
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                long l2;
                int n3;
                int n4;
                Object object3;
                Object object4;
                ka0$a ka0$a;
                block6: {
                    ka0$a = this;
                    object4 = object;
                    object4 = (b30_0)object;
                    object3 = object2;
                    object3 = (Number)object2;
                    n4 = ((Number)object3).intValue() & 0xB;
                    if (n4 != (n3 = 2) || (n4 = (int)(object4.h() ? 1 : 0)) == 0) break block6;
                    object4.D();
                    break block7;
                }
                LP1$a lP1$a = LP1$a.b;
                n4 = 16;
                float f5 = n4;
                object3 = h.e(lP1$a, f5);
                Object object5 = zp.c;
                Gx$a gx$a = Nc$a.m;
                object5 = oZ.a((zp$l)object5, gx$a, (b30_0)object4, 0);
                int n7 = object4.F();
                Object object6 = object4.m();
                object3 = a30_0.c((b30_0)object4, (LP1)object3);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object4.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block8;
                object4.A();
                bl2 = object4.e();
                if (bl2) {
                    object4.C((Function0)((Object)serializable));
                } else {
                    object4.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object4, object5, (Function2)((Object)serializable));
                object5 = N20$a.d;
                Ow3.a((b30_0)object4, object6, (Function2)object5);
                object5 = N20$a.f;
                boolean bl3 = object4.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object6 = object4.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object4, n7, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object4, object3, (Function2)object5);
                object3 = km2.a(ka0$a.a, (b30_0)object4, 0);
                n3 = R$string.acc_icon;
                object5 = Ex0.a(nk_0.f((b30_0)object4, n3));
                String string2 = ka0$a.b;
                ((StringBuilder)object5).append(string2);
                object5 = ((StringBuilder)object5).toString();
                int n8 = 124;
                n7 = 0;
                gx$a = null;
                Object object7 = object4;
                Pd1.a((im2)object3, (String)object5, null, null, null, 0.0f, null, (b30_0)object4, 8, n8);
                f5 = 8;
                object5 = lP1$a;
                object5 = h.i(lP1$a, f5, f5, 0.0f, 0.0f, 12);
                long l3 = xx_1.f;
                long l4 = l2 = 0L;
                object3 = string2;
                Ll3.b(string2, (LP1)object5, l3, 0L, null, null, null, 0L, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object4, 432, 0, 131064);
                serializable = null;
                bl3 = false;
                object6 = null;
                object5 = lP1$a;
                object5 = h.i(lP1$a, f5, f5, 0.0f, 0.0f, 12);
                l3 = OX.b;
                n4 = 14;
                f5 = 2.0E-44f;
                long l7 = Em3.f(n4);
                object7 = tv0_0.n;
                int n10 = 131024;
                object3 = ka0$a.c;
                bl2 = false;
                mp2 = null;
                long l8 = 0L;
                string2 = null;
                l4 = 0L;
                int n14 = 200112;
                Ll3.b((String)object3, (LP1)object5, l3, l7, null, (tv0_0)object7, null, l8, null, null, l4, 0, false, 0, 0, null, null, (b30_0)object4, n14, 0, n10);
                object4.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

