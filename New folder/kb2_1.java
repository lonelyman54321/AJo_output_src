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
 * Renamed from Kb2
 */
public final class kb2_1
implements Function2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ Function2 c;

    public kb2_1(u10 u102, tr1_0 tr1_02, u10 u103) {
        this.a = u102;
        this.b = tr1_02;
        this.c = u103;
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                int n3;
                block6: {
                    object = (b30_0)object;
                    int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
                    if (n4 != (n3 = 2) || !(n4 = (int)(object.h() ? 1 : 0))) break block6;
                    object.D();
                    break block7;
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
                Object object6 = object.i();
                boolean bl2 = object6 instanceof mp;
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
                boolean bl3 = object.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = object.v(), serializable = Integer.valueOf(n7)))) {
                    re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = 0;
                object3 = this.a;
                object3.invoke(object, object2);
                n3 = (int)(((Boolean)this.b.getValue()).booleanValue() ? 1 : 0);
                object4 = (u10)this.c;
                object2 = new jb2_1((u10)object4);
                object6 = v10.c(-650708996, (fx0_2)object2, (b30_0)object);
                int n8 = 1572870;
                n7 = 0;
                object4 = null;
                bl3 = false;
                object5 = null;
                serializable = null;
                androidx.compose.animation.a.d(n3 != 0, null, null, null, null, (u10)object6, (b30_0)object, n8);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

