/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.selection.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Nh3
 */
public final class nh3_1
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wr1_1 e;
    public final /* synthetic */ Lg1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ gx0_2 i;

    public nh3_1(LP1 lP1, boolean bl2, wr1_1 wr1_12, Lg1 lg1, boolean bl3, ip_0 ip_02, u10 u102) {
        this.c = lP1;
        this.d = bl2;
        this.e = wr1_12;
        this.f = lg1;
        this.g = bl3;
        this.h = ip_02;
        this.i = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                float f5;
                int n3;
                int n4;
                block6: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    n4 = ((Number)object2).intValue() & 3;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    if (n4 != n3 || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                n4 = 4;
                CP2 cP2 = new CP2(n4);
                Object object3 = this.e;
                Function0 function0 = this.h;
                Object object4 = this.c;
                int n7 = this.d;
                Object object5 = this.f;
                boolean bl2 = this.g;
                object2 = b.a((LP1)object4, n7 != 0, (wr1_1)object3, (Lg1)object5, bl2, cP2, function0);
                n3 = 1065353216;
                f5 = 1.0f;
                object2 = j.c((LP1)object2, f5);
                object4 = Nc$a.n;
                Object object6 = zp.d;
                int n8 = 54;
                object4 = oZ.a((zp$l)object6, (Gx$a)object4, (b30_0)object, n8);
                n7 = object.F();
                object3 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                object5 = N20$a.b;
                mp mp2 = object.i();
                bl2 = mp2 instanceof mp;
                if (!bl2) break block8;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)object5);
                } else {
                    object.n();
                }
                object5 = N20$a.e;
                Ow3.a((b30_0)object, object4, (Function2)object5);
                object4 = N20$a.d;
                Ow3.a((b30_0)object, object3, (Function2)object4);
                object4 = N20$a.f;
                n8 = (int)(object.e() ? 1 : 0);
                if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object3 = object.v(), object5 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
                    re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object4);
                object2 = sz_0.a;
                n3 = 6;
                f5 = 8.4E-45f;
                object4 = n3;
                object6 = this.i;
                object6.invoke(object2, object, object4);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

