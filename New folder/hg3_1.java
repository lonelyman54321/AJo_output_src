/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.material.MinimumInteractiveModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hg3
 */
public final class hg3_1
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ i13 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ nz g;
    public final /* synthetic */ float h;
    public final /* synthetic */ wr1_1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ Function2 l;

    public hg3_1(LP1 lP1, i13 i132, long l2, float f5, nz nz4, float f6, wr1_1 wr1_12, boolean bl2, Function0 function0, u10 u102) {
        this.c = lP1;
        this.d = i132;
        this.e = l2;
        this.f = f5;
        this.g = nz4;
        this.h = f6;
        this.i = wr1_12;
        this.j = bl2;
        this.k = function0;
        this.l = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                int n3;
                int n4;
                Object object3;
                Object object4;
                hg3_1 hg3_12;
                block6: {
                    hg3_12 = this;
                    object4 = object;
                    object4 = (b30_0)object;
                    object3 = object2;
                    object3 = (Number)object2;
                    n4 = ((Number)object3).intValue() & 3;
                    if (n4 != (n3 = 2) || (n4 = (int)(object4.h() ? 1 : 0)) == 0) break block6;
                    object4.D();
                    break block7;
                }
                object3 = lj1.a;
                object3 = MinimumInteractiveModifier.b;
                LP1 lP1 = hg3_12.c.then((LP1)object3);
                object3 = ty0_0.a;
                object3 = (sy0_1)object4.j((H30)object3);
                long l2 = hg3_12.e;
                float f5 = hg3_12.f;
                long l3 = jg3_0.d(l2, (sy0_1)object3, f5, (b30_0)object4);
                i13 i132 = hg3_12.d;
                nz nz4 = hg3_12.g;
                float f6 = hg3_12.h;
                lP1 = jg3_0.c(lP1, i132, l3, nz4, f6);
                n4 = 0;
                n3 = 0;
                long l4 = 0L;
                Object object5 = object4;
                Lg1 lg1 = vp2_0.a(false, 0.0f, l4, (b30_0)object4, 0, 7);
                boolean bl2 = hg3_12.j;
                int n7 = 24;
                Object object6 = hg3_12.i;
                Object object7 = hg3_12.k;
                object3 = lP1;
                object3 = androidx.compose.foundation.d.a(lP1, (wr1_1)object6, lg1, bl2, null, (Function0)object7, n7);
                object6 = HA.e(Nc$a.a, true);
                int n8 = object4.F();
                Object object8 = object4.m();
                object3 = a30_0.c((b30_0)object4, (LP1)object3);
                N20.W.getClass();
                object5 = N20$a.b;
                object7 = object4.i();
                boolean bl3 = object7 instanceof mp;
                if (!bl3) break block8;
                object4.A();
                bl3 = object4.e();
                if (bl3) {
                    object4.C((Function0)object5);
                } else {
                    object4.n();
                }
                object5 = N20$a.e;
                Ow3.a((b30_0)object4, object6, (Function2)object5);
                object6 = N20$a.d;
                Ow3.a((b30_0)object4, object8, (Function2)object6);
                object6 = N20$a.f;
                bl2 = object4.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object8 = object4.v(), object5 = Integer.valueOf(n8)))) {
                    re0_0.a(n8, (b30_0)object4, n8, (N20$a$a)object6);
                }
                object6 = N20$a.c;
                Ow3.a((b30_0)object4, object3, (Function2)object6);
                n4 = 0;
                object3 = 0;
                object6 = hg3_12.l;
                object6.invoke(object4, object3);
                object4.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

