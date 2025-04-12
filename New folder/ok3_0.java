/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ok3
 */
public final class ok3_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ float c;
    public final /* synthetic */ ln0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 f;

    public ok3_0(float f5, ln0 ln02, boolean bl2, Function2 function2) {
        this.c = f5;
        this.d = ln02;
        this.e = bl2;
        this.f = function2;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block9: {
            block8: {
                int n3;
                int n4;
                block7: {
                    object = (LP1)object;
                    object2 = (b30_0)object2;
                    n4 = ((Number)(object3 = (Number)object3)).intValue();
                    n3 = n4 & 6;
                    if (n3 == 0) {
                        n3 = (int)(object2.J(object) ? 1 : 0);
                        n3 = n3 != 0 ? 4 : 2;
                        n4 |= n3;
                    }
                    if ((n4 &= 0x13) != (n3 = 18) || (n4 = (int)(object2.h() ? 1 : 0)) == 0) break block7;
                    object2.D();
                    break block8;
                }
                float f5 = this.c;
                object = be_1.b((LP1)object, f5);
                object3 = HA.e(Nc$a.a, false);
                n3 = object2.F();
                Object object4 = object2.m();
                object = a30_0.c((b30_0)object2, (LP1)object);
                N20.W.getClass();
                Object object5 = N20$a.b;
                mp mp2 = object2.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block9;
                object2.A();
                bl2 = object2.e();
                if (bl2) {
                    object2.C((Function0)object5);
                } else {
                    object2.n();
                }
                object5 = N20$a.e;
                Ow3.a((b30_0)object2, object3, (Function2)object5);
                object3 = N20$a.d;
                Ow3.a((b30_0)object2, object4, (Function2)object3);
                object3 = N20$a.f;
                boolean bl3 = object2.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = object2.v(), object5 = Integer.valueOf(n3)))) {
                    re0_0.a(n3, (b30_0)object2, n3, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object2, object, (Function2)object3);
                object = this.d;
                n4 = (int)(this.e ? 1 : 0);
                long l2 = ((OX)((ln0)object).f(n4 != 0, (b30_0)object2).getValue()).a;
                object = Bt3.b;
                object = (At3)object2.j((H30)object);
                object5 = ((At3)object).g;
                int n7 = 4;
                bl2 = false;
                mp2 = null;
                Function2 function2 = this.f;
                lk3_0.b(l2, (xm3)object5, null, function2, (b30_0)object2, 0, n7);
                object2.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

