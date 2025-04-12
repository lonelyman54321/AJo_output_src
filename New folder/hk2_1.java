/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hk2
 */
public final class hk2_1
implements gx0_2 {
    public final /* synthetic */ la2_0 a;
    public final /* synthetic */ String b;

    public hk2_1(la2_0 la2_02, String string2) {
        this.a = la2_02;
        this.b = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block9: {
            block8: {
                Object object4;
                int n3;
                Object object5;
                Object object6;
                Object object7;
                hk2_1 hk2_12;
                block7: {
                    hk2_12 = this;
                    object7 = object;
                    object7 = (PA)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n3 = ((Number)object5).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    int n4 = n3 & 0x51;
                    n3 = 16;
                    if (n4 != n3 || (n4 = (int)(object6.h() ? 1 : 0)) == 0) break block7;
                    object6.D();
                    break block8;
                }
                object7 = Nc$a.k;
                Object object8 = LP1$a.b;
                object5 = zp.a;
                int n7 = 48;
                float f5 = 6.7E-44f;
                object7 = iQ2.a((zp$e)object5, (Gx$b)object7, (b30_0)object6, n7);
                n3 = object6.F();
                object4 = object6.m();
                Object object9 = a30_0.c((b30_0)object6, (LP1)object8);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object6.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block9;
                object6.A();
                bl2 = object6.e();
                if (bl2) {
                    object6.C((Function0)((Object)serializable));
                } else {
                    object6.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object6, object7, (Function2)((Object)serializable));
                object7 = N20$a.d;
                Ow3.a((b30_0)object6, object4, (Function2)object7);
                object7 = N20$a.f;
                n7 = (int)(object6.e() ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object4 = object6.v(), serializable = Integer.valueOf(n3)) ? 1 : 0)) == 0) {
                    re0_0.a(n3, (b30_0)object6, n3, (N20$a$a)object7);
                }
                object7 = N20$a.c;
                Ow3.a((b30_0)object6, object9, (Function2)object7);
                object7 = hk2_12.a.d();
                if (object7 == null) {
                    object7 = "";
                }
                int n8 = 12;
                long l2 = Em3.f(n8);
                av0_0 av0_02 = y20_0.a;
                Object object10 = tv0_0.m;
                long l3 = xx_1.e;
                float f6 = 0.0f;
                float f7 = 8;
                object5 = object8;
                f5 = f6;
                object4 = h.i((LP1)object8, f6, 0.0f, f7, 0.0f, 10);
                n3 = 0;
                long l4 = 0L;
                object5 = object7;
                long l7 = l3;
                object7 = object8;
                object8 = object10;
                object = object6;
                object6 = av0_02;
                object10 = object;
                Ll3.b((String)object5, (LP1)object4, l3, l2, null, (tv0_0)object8, av0_02, 0L, null, null, l4, 0, false, 0, 0, null, null, (b30_0)object, 1772976, 0, 130960);
                long l8 = xx_1.M;
                object9 = fg2_1.a;
                object5 = androidx.compose.foundation.a.b((LP1)object7, l8, (i13)object9);
                double d2 = 0.5;
                f5 = (float)d2;
                object5 = j.k((LP1)object5, f5);
                n7 = 18;
                f5 = n7;
                object5 = j.d((LP1)object5, f5);
                object6 = object;
                Q93.b((b30_0)object, (LP1)object5);
                object8 = tv0_0.o;
                long l12 = Em3.f(n8);
                bl2 = false;
                mp2 = null;
                int n10 = 10;
                object9 = null;
                object5 = object7;
                f5 = f7;
                object4 = h.i((LP1)object7, f7, 0.0f, f6, 0.0f, n10);
                int n14 = 130964;
                object5 = hk2_12.b;
                l7 = 0L;
                long l14 = 0L;
                f7 = 0.0f;
                l4 = 0L;
                int n15 = 1772592;
                object7 = object;
                object6 = av0_02;
                Ll3.b((String)object5, (LP1)object4, l7, l12, null, (tv0_0)object8, av0_02, l14, null, null, l4, 0, false, 0, 0, null, null, (b30_0)object, n15, 0, n14);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

