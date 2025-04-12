/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from sS0
 */
public final class ss0_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;

    public ss0_1(u10 u102, Function2 function2) {
        this.c = function2;
        this.d = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block10: {
            block9: {
                float f5;
                int n3;
                block8: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    n3 = ((Number)object2).intValue() & 3;
                    int n4 = 2;
                    f5 = 2.8E-45f;
                    if (n3 != n4 || (n3 = (int)(object.h() ? 1 : 0)) == 0) break block8;
                    object.D();
                    break block9;
                }
                object2 = this.c;
                f5 = object2 == null ? zs0_0.d : zs0_0.c;
                Object object3 = LP1$a.b;
                float f6 = zs0_0.d;
                LP1 lP1 = object3;
                lP1 = h.i((LP1)object3, f5, 0.0f, f6, 0.0f, 10);
                Object object4 = Nc$a.k;
                zp$j zp$j = zp.a;
                int n7 = 48;
                f6 = 6.7E-44f;
                object4 = iQ2.a(zp$j, (Gx$b)object4, (b30_0)object, n7);
                int n8 = object.F();
                Object object5 = object.m();
                lP1 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block10;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)((Object)serializable));
                } else {
                    object.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object4, (Function2)((Object)serializable));
                object4 = N20$a.d;
                Ow3.a((b30_0)object, object5, (Function2)object4);
                object4 = N20$a.f;
                n7 = (int)(object.e() ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object5 = object.v(), serializable = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    re0_0.a(n8, (b30_0)object, n8, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object, lP1, (Function2)object4);
                lP1 = null;
                if (object2 != null) {
                    int n10 = -565171246;
                    object.K(n10);
                    object4 = 0;
                    object2.invoke(object, object4);
                    float f7 = zs0_0.c;
                    object2 = j.k((LP1)object3, f7);
                    Q93.b((b30_0)object, (LP1)object2);
                    object.E();
                } else {
                    n3 = -565074185;
                    float f8 = -3.7767584E18f;
                    object.K(n3);
                    object.E();
                }
                object2 = 0;
                object3 = this.d;
                object3.invoke(object, object2);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

