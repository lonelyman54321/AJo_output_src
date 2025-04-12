/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.animation.a;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ib2
 */
public final class ib2_0
implements Function2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ tr1_0 e;
    public final /* synthetic */ Function2 f;

    public ib2_0(u10 u102, u10 u103, u10 u104, u10 u105, tr1_0 tr1_02, u10 u106) {
        this.a = u102;
        this.b = u103;
        this.c = u104;
        this.d = u105;
        this.e = tr1_02;
        this.f = u106;
    }

    public final Object invoke(Object object, Object object2) {
        block11: {
            block10: {
                int n3;
                int n4;
                block9: {
                    object = (b30_0)object;
                    n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
                    if (n4 != (n3 = 2) || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block9;
                    object.D();
                    break block10;
                }
                object2 = LP1$a.b;
                Object object3 = zp.c;
                Object object4 = Nc$a.m;
                object3 = oZ.a((zp$l)object3, (Gx$a)object4, (b30_0)object, 0);
                int n7 = object.F();
                Object object5 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block11;
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
                boolean bl3 = object.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = object.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = this.e;
                n3 = (int)(vb2.g((tr1_0)object2) ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1891948290;
                    object.K(n3);
                    object3 = 0;
                    object4 = this.a;
                    object4.invoke(object, object3);
                    object.E();
                } else {
                    n3 = 1892013576;
                    object.K(n3);
                    object3 = 0;
                    object4 = this.b;
                    object4.invoke(object, object3);
                    object.E();
                }
                object3 = (Boolean)object2.getValue();
                n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                object5 = (u10)this.f;
                object4 = new hb2_1((u10)object5);
                u10 u102 = v10.c(-1100914694, (fx0_2)object4, (b30_0)object);
                bl3 = false;
                object5 = null;
                int n8 = 1572870;
                n7 = 0;
                object4 = null;
                serializable = null;
                bl2 = false;
                mp2 = null;
                androidx.compose.animation.a.d(n3 != 0, null, null, null, null, u102, (b30_0)object, n8);
                n3 = -2017171764;
                object.K(n3);
                object2 = (Boolean)object2.getValue();
                n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                if (n4 == 0) {
                    object2 = 0;
                    object3 = this.c;
                    object3.invoke(object, object2);
                }
                object.E();
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

