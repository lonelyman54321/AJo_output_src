/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.graphics.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ue0
 */
public final class ue0_2
extends Lambda
implements Function2 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ un0_0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ gx0_2 f;

    public ue0_2(gr3 gr32, un0_0 un0_02, Object object, u10 u102) {
        this.c = gr32;
        this.d = un0_02;
        this.e = object;
        this.f = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block12: {
            block11: {
                float f5;
                block10: {
                    int n3;
                    object = (b30_0)object;
                    int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
                    if (n4 != (n3 = 2) || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block10;
                    object.D();
                    break block11;
                }
                Object object3 = this.d;
                object2 = new te0_2((un0_0)object3);
                object3 = FloatCompanionObject.INSTANCE;
                Object object4 = ya3_0.a;
                object3 = this.c;
                Object object5 = ((gr3)object3).a.a();
                int n7 = -438678252;
                object.K(n7);
                Object object6 = this.e;
                int n8 = Intrinsics.areEqual(object5, object6);
                float f6 = 0.0f;
                Object object7 = null;
                if (n8 != 0) {
                    n8 = 1065353216;
                    f5 = 1.0f;
                } else {
                    n8 = 0;
                    f5 = 0.0f;
                    object5 = null;
                }
                object.E();
                object5 = Float.valueOf(f5);
                Object object8 = ((gr3)object3).d.getValue();
                object.K(n7);
                n7 = (int)(Intrinsics.areEqual(object8, object6) ? 1 : 0);
                if (n7 != 0) {
                    f6 = 1.0f;
                }
                object.E();
                Object object9 = Float.valueOf(f6);
                object7 = ((gr3)object3).f();
                Object object10 = 0;
                object7 = object2 = ((te0_2)object2).invoke(object7, object, object10);
                object7 = (un0_0)object2;
                object8 = null;
                object10 = object;
                object2 = yr3.b((gr3)object3, object5, object9, (un0_0)object7, (Vs3)object4, (b30_0)object, 0);
                object3 = LP1$a.b;
                n8 = (int)(object.J(object2) ? 1 : 0);
                object9 = object.v();
                if (n8 != 0 || object9 == (object5 = b30$a.a)) {
                    object9 = new se0_1((gr3$d)object2);
                    object.o(object9);
                }
                object9 = (Function1)object9;
                object2 = a.a((LP1)object3, (Function1)object9);
                object3 = HA.e(Nc$a.a, false);
                n8 = object.F();
                object9 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                object7 = N20$a.b;
                object4 = object.i();
                boolean bl2 = object4 instanceof mp;
                if (!bl2) break block12;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)object7);
                } else {
                    object.n();
                }
                object7 = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)object7);
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object9, (Function2)object3);
                object3 = N20$a.f;
                n7 = (int)(object.e() ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object9 = object.v(), object7 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    re0_0.a(n8, (b30_0)object, n8, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = 0;
                object3 = this.f;
                object3.invoke(object6, object, object2);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

