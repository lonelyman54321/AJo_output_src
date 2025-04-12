/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a20$a
 */
public final class a20$a_0
implements Function2 {
    public static final a20$a_0 a;

    static {
        a20$a_0 a20$a_0;
        a = a20$a_0 = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                int n3;
                int n4;
                Object object3;
                Object object4;
                block6: {
                    object4 = object;
                    object4 = (b30_0)object;
                    object3 = object2;
                    object3 = (Number)object2;
                    n4 = ((Number)object3).intValue() & 0xB;
                    if (n4 != (n3 = 2) || (n4 = (int)(object4.h() ? 1 : 0)) == 0) break block6;
                    object4.D();
                    break block7;
                }
                object3 = zp.f;
                Object object5 = Nc$a.k;
                LP1 lP1 = j.c(LP1$a.b, 1.0f);
                int n7 = 16;
                float f5 = n7;
                lP1 = h.e(lP1, f5);
                int n8 = 54;
                f5 = 7.6E-44f;
                object3 = iQ2.a((zp$e)object3, (Gx$b)object5, (b30_0)object4, n8);
                n3 = object4.F();
                Object object6 = object4.m();
                lP1 = a30_0.c((b30_0)object4, lP1);
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
                Ow3.a((b30_0)object4, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object4, object6, (Function2)object3);
                object3 = N20$a.f;
                n8 = (int)(object4.e() ? 1 : 0);
                if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object6 = object4.v(), serializable = Integer.valueOf(n3)) ? 1 : 0)) == 0) {
                    re0_0.a(n3, (b30_0)object4, n3, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object4, lP1, (Function2)object3);
                n4 = R$string.delivery_address_new;
                object3 = nk_0.f((b30_0)object4, n4);
                Object object7 = tv0_0.o;
                long l2 = Em3.f(n7);
                long l3 = xx_1.e;
                int n10 = 131026;
                bl2 = false;
                mp2 = null;
                long l4 = 0L;
                long l7 = 0L;
                int n14 = 200064;
                object = object4;
                object4 = object7;
                object7 = object;
                Ll3.b((String)object3, null, l3, l2, null, (tv0_0)object4, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object, n14, 0, n10);
                n4 = R$drawable.down_arrow;
                object3 = km2.a(n4, (b30_0)object, 0);
                n3 = R$string.acc_icon_down_arrow_icon;
                object5 = nk_0.f((b30_0)object, n3);
                int n15 = 8;
                int n16 = 124;
                lP1 = null;
                n7 = 0;
                n8 = 0;
                f5 = 0.0f;
                object6 = null;
                serializable = null;
                object4 = object;
                Pd1.a((im2)object3, (String)object5, null, null, null, 0.0f, null, (b30_0)object, n15, n16);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

