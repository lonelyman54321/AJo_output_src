/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class S61
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yz_0 b;
    public final /* synthetic */ String c;

    public S61(yz_0 yz_02, dr0_0 dr0_02, String string2) {
        this.a = dr0_02;
        this.b = yz_02;
        this.c = string2;
    }

    public final Object invoke(Object object, Object object2) {
        block9: {
            block8: {
                int n3;
                int n4;
                Object object3;
                Object object4;
                S61 s61;
                block7: {
                    s61 = this;
                    object4 = object;
                    object4 = (b30_0)object;
                    object3 = object2;
                    object3 = (Number)object2;
                    n4 = ((Number)object3).intValue() & 0xB;
                    if (n4 != (n3 = 2) || (n4 = (int)(object4.h() ? 1 : 0)) == 0) break block7;
                    object4.D();
                    break block8;
                }
                object3 = Nc$a.n;
                Object object5 = LP1$a.b;
                Object object6 = zp.c;
                int n7 = 48;
                float f5 = 6.7E-44f;
                object3 = oZ.a((zp$l)object6, (Gx$a)object3, (b30_0)object4, n7);
                n3 = object4.F();
                Object object7 = object4.m();
                LP1 lP1 = a30_0.c((b30_0)object4, (LP1)object5);
                N20.W.getClass();
                Object object8 = N20$a.b;
                Object object9 = object4.i();
                boolean bl2 = object9 instanceof mp;
                if (!bl2) break block9;
                object4.A();
                bl2 = object4.e();
                if (bl2) {
                    object4.C((Function0)object8);
                } else {
                    object4.n();
                }
                object8 = N20$a.e;
                Ow3.a((b30_0)object4, object3, (Function2)object8);
                object3 = N20$a.d;
                Ow3.a((b30_0)object4, object7, (Function2)object3);
                object3 = N20$a.f;
                n7 = (int)(object4.e() ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object7 = object4.v(), object8 = Integer.valueOf(n3)) ? 1 : 0)) == 0) {
                    re0_0.a(n3, (b30_0)object4, n3, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object4, lP1, (Function2)object3);
                object3 = h40_0.a;
                n4 = (int)(h40_0.c() ? 1 : 0);
                object8 = s61.a;
                object9 = s61.b;
                object3 = n4 != 0 && (n4 = (int)(((dr0_0)object8).o() ? 1 : 0)) == 0 && (n4 = (int)(Intrinsics.areEqual(object3 = ((yz_0)object9).d, object6 = "switch-store-route") ? 1 : 0)) != 0 ? "Home" : ((yz_0)object9).a;
                long l2 = Em3.f(10);
                Object object10 = y20_0.a;
                tv0_0 tv0_02 = tv0_0.m;
                float f6 = 4;
                n3 = 1;
                object6 = h.g((LP1)object5, 0.0f, f6, n3);
                int n8 = 3120;
                int n10 = 120724;
                long l3 = 0L;
                long l4 = 0L;
                long l7 = 0L;
                int n14 = 2;
                int n15 = 1;
                int n16 = 1772592;
                Object object11 = object8;
                LP1$a lP1$a = object5;
                object5 = tv0_02;
                object = object4;
                object4 = object10;
                object10 = object;
                Ll3.b((String)object3, (LP1)object6, l3, l2, null, tv0_02, (RU0)object4, l4, null, null, l7, n14, false, n15, 0, null, null, (b30_0)object, n16, n8, n10);
                float f7 = 3.10624E-24f;
                object6 = object;
                object.K(410015084);
                object3 = object9;
                object3 = ((yz_0)object9).d;
                object7 = s61.c;
                n4 = (int)(Intrinsics.areEqual(object7, object3) ? 1 : 0);
                if (n4 != 0) {
                    n4 = 1065353216;
                    f7 = 1.0f;
                    object7 = lP1$a;
                    object3 = j.c(lP1$a, f7);
                    f5 = 3;
                    object3 = j.d((LP1)object3, f5);
                    n7 = 12;
                    f5 = 1.7E-44f;
                    object8 = null;
                    object7 = SP2.b(f6, f6, 0.0f, 0.0f, n7);
                    boolean bl3 = h40_0.c();
                    long l8 = bl3 && (bl3 = ((dr0_0)object11).o()) ? nz_1.i : nz_1.c;
                    object3 = androidx.compose.foundation.a.b((LP1)object3, l8, (i13)object7);
                    Q93.b((b30_0)object6, (LP1)object3);
                }
                object6.E();
                object6.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

