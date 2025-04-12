/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class dv3
implements Function2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ Function2 d;

    public dv3(u10 u102, LP1 lP1, ib3_0 ib3_02, u10 u103) {
        this.a = u102;
        this.b = lP1;
        this.c = ib3_02;
        this.d = u103;
    }

    public final Object invoke(Object object, Object object2) {
        block12: {
            block13: {
                block11: {
                    Object object3;
                    Object object4;
                    boolean bl2;
                    int n3;
                    int n4;
                    block10: {
                        object = (b30_0)object;
                        n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
                        if (n4 != (n3 = 2) || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block10;
                        object.D();
                        break block11;
                    }
                    object2 = LP1$a.b;
                    Object object5 = Nc$a.a;
                    Object object6 = HA.e((Nc)object5, false);
                    int n7 = object.F();
                    Object object7 = object.m();
                    object2 = a30_0.c((b30_0)object, (LP1)object2);
                    N20.W.getClass();
                    Xp1$a xp1$a = N20$a.b;
                    Object object8 = object.i();
                    boolean bl22 = object8 instanceof mp;
                    boolean bl3 = false;
                    if (!bl22) break block12;
                    object.A();
                    bl22 = object.e();
                    if (bl22) {
                        object.C(xp1$a);
                    } else {
                        object.n();
                    }
                    object8 = N20$a.e;
                    Ow3.a((b30_0)object, object6, (Function2)object8);
                    object6 = N20$a.d;
                    Ow3.a((b30_0)object, object7, (Function2)object6);
                    object7 = N20$a.f;
                    boolean n8 = object.e();
                    if (n8 || !(bl2 = Intrinsics.areEqual(object4 = object.v(), object3 = Integer.valueOf(n7)))) {
                        re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object7);
                    }
                    N20$a$c n20$a$c = N20$a.c;
                    Ow3.a((b30_0)object, object2, n20$a$c);
                    object2 = 0;
                    object4 = this.a;
                    object4.invoke(object, object2);
                    n4 = -1190036988;
                    object.K(n4);
                    object2 = this.c;
                    boolean bl4 = object.J(object2);
                    object3 = object.v();
                    if (bl4 || object3 == (object4 = b30$a.a)) {
                        int n10 = 1;
                        object3 = new E22(object2, n10);
                        object.o(object3);
                    }
                    object3 = (Function1)object3;
                    object.E();
                    object2 = g.b(this.b, (Function1)object3);
                    object4 = j.c;
                    object2 = object2.then((LP1)object4);
                    object5 = HA.e((Nc)object5, false);
                    int n14 = object.F();
                    object3 = object.m();
                    object2 = a30_0.c((b30_0)object, (LP1)object2);
                    mp mp2 = object.i();
                    boolean bl5 = mp2 instanceof mp;
                    if (!bl5) break block13;
                    object.A();
                    bl3 = object.e();
                    if (bl3) {
                        object.C(xp1$a);
                    } else {
                        object.n();
                    }
                    Ow3.a((b30_0)object, object5, (Function2)object8);
                    Ow3.a((b30_0)object, object3, (Function2)object6);
                    n3 = (int)(object.e() ? 1 : 0);
                    if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object5 = object.v(), object6 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                        re0_0.a(n14, (b30_0)object, n14, (N20$a$a)object7);
                    }
                    Ow3.a((b30_0)object, object2, n20$a$c);
                    object2 = 0;
                    object5 = this.d;
                    object5.invoke(object, object2);
                    object.p();
                    object.p();
                }
                return Unit.a;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

