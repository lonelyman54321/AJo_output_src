/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Cm
 */
public final class cm_0
extends Lambda
implements Function2 {
    public final /* synthetic */ lg3_0 c;
    public final /* synthetic */ mk2_0 d;
    public final /* synthetic */ gx0_2 e;

    public cm_0(oO0 oO02, nk2_0 nk2_02, u10 u102) {
        this.c = oO02;
        this.d = nk2_02;
        this.e = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                float f5;
                int n3;
                block6: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    int n4 = ((Number)object2).intValue() & 3;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    if (n4 != n3 || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = LP1$a.b;
                n3 = 1065353216;
                object2 = j.c((LP1)object2, 1.0f);
                Object object3 = (oO0)this.c;
                Object object4 = dh3_0.a;
                object4 = ji1.a;
                Object object5 = new fh3_1((oO0)object3);
                object2 = a30_0.a((LP1)object2, (Function1)object4, (gx0_2)object5);
                object3 = this.d;
                object2 = h.d((LP1)object2, (mk2_0)object3);
                f5 = Km.a;
                object2 = j.d((LP1)object2, f5);
                object3 = zp.a;
                object4 = Nc$a.k;
                int n7 = 54;
                object3 = iQ2.a((zp$e)object3, (Gx$b)object4, (b30_0)object, n7);
                int n8 = object.F();
                object5 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block8;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)((Object)serializable));
                } else {
                    object.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object5, (Function2)object3);
                object3 = N20$a.f;
                n7 = (int)(object.e() ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object5 = object.v(), serializable = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    re0_0.a(n8, (b30_0)object, n8, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = mq2_0.a;
                n3 = 6;
                f5 = 8.4E-45f;
                object3 = n3;
                object4 = this.e;
                object4.invoke(object2, object, object3);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

