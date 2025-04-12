/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ju0
 */
public final class ju0_2
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;

    public ju0_2(gx0_2 gx0_22) {
        this.c = gx0_22;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                int n3;
                block6: {
                    object = (b30_0)object;
                    int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
                    if (n4 != (n3 = 2) || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = j.c;
                Object object3 = zp.c;
                Object object4 = Nc$a.m;
                boolean bl2 = false;
                object3 = oZ.a((zp$l)object3, (Gx$a)object4, (b30_0)object, 0);
                int n7 = object.F();
                Object object5 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object.i();
                boolean bl3 = mp2 instanceof mp;
                if (!bl3) break block8;
                object.A();
                bl3 = object.e();
                if (bl3) {
                    object.C((Function0)((Object)serializable));
                } else {
                    object.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object5, (Function2)object3);
                object3 = N20$a.f;
                bl2 = object.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object5 = object.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = sz_0.a;
                n3 = 6;
                object3 = n3;
                object4 = this.c;
                object4.invoke(object2, object, object3);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

