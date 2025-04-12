/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$raw;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class GK0$b
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public GK0$b(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                float f5;
                int n3;
                block6: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    int n4 = ((Number)object2).intValue() & 0xB;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    if (n4 != n3 || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = LP1$a.b;
                n3 = 1065353216;
                f5 = 1.0f;
                LP1 lP1 = j.c((LP1)object2, f5);
                long l2 = nz_1.a;
                Object object3 = fg2_1.a;
                lP1 = androidx.compose.foundation.a.b(lP1, l2, (i13)object3);
                Object object4 = Nc$a.e;
                dr0_0 dr0_02 = null;
                object4 = HA.e((Nc)object4, false);
                int n7 = object.F();
                object3 = object.m();
                lP1 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Object object5 = N20$a.b;
                mp mp2 = object.i();
                int n8 = mp2 instanceof mp;
                if (n8 == 0) break block8;
                object.A();
                n8 = object.e();
                if (n8 != 0) {
                    object.C((Function0)object5);
                } else {
                    object.n();
                }
                object5 = N20$a.e;
                Ow3.a((b30_0)object, object4, (Function2)object5);
                object4 = N20$a.d;
                Ow3.a((b30_0)object, object3, (Function2)object4);
                object4 = N20$a.f;
                boolean bl2 = object.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object3 = object.v(), object5 = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object, lP1, (Function2)object4);
                f5 = uq0_0.w;
                object4 = j.h((LP1)object2, f5);
                n3 = R$raw.fleek_loader;
                object2 = dr0_0.Companion;
                bl2 = false;
                object3 = null;
                n8 = 4144;
                dr0_02 = this.a;
                object5 = object;
                ov3.o(n3, (LP1)object4, dr0_02, null, (b30_0)object, n8);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

