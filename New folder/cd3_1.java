/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cd3
 */
public final class cd3_1
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;

    public cd3_1(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Integer n3;
        int n4;
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n7 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n8 = n7 & 0x51;
        int n10 = 16;
        float f5 = 2.2E-44f;
        if (n8 == n10 && (n8 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
            return Unit.a;
        }
        object4 = cd3$a_0.$EnumSwitchMapping$0;
        object = this.a;
        object3 = ((dr0_0)object).D();
        int n14 = ((Enum)object3).ordinal();
        Object object5 = object4[n14];
        if (object5 == (n4 = 1)) {
            n8 = -1138036546;
            object2.K(n8);
            object2.E();
            return Unit.a;
        }
        n4 = 2;
        if (object5 != n4) {
            n4 = 3;
            if (object5 == n4) {
                n8 = -1137197314;
                object2.K(n8);
                object2.E();
                return Unit.a;
            }
            n4 = 4;
            if (object5 == n4) {
                int n15 = -1137084350;
                f5 = -0.011320176f;
                object2.K(n15);
                n4 = 1;
                object3 = new zf0_2(object, n4);
                yd3_2.a((Function0)object3, (b30_0)object2, 0);
                object2.E();
                return Unit.a;
            }
            n8 = 5;
            if (object5 != n8) {
                n8 = -1136718178;
                object2.K(n8);
                object2.E();
                return Unit.a;
            }
            n8 = -1136826306;
            object2.K(n8);
            object2.E();
            return Unit.a;
        }
        n8 = -1137908950;
        object2.K(n8);
        object = LP1$a.b;
        float f6 = uq0_0.o;
        int n16 = 10;
        float f7 = 0.0f;
        Object object6 = object;
        object3 = h.i((LP1)object, f6, 0.0f, f6, 0.0f, n16);
        object4 = zp.c;
        object6 = Nc$a.m;
        object4 = oZ.a((zp$l)object4, (Gx$a)object6, (b30_0)object2, 0);
        int n17 = object2.F();
        Object object7 = object2.m();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = object2.i();
        boolean bl2 = mp2 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object2.A();
        bl2 = object2.e();
        if (bl2) {
            object2.C(xp1$a);
        } else {
            object2.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object2, object4, n20$a$b);
        object4 = N20$a.d;
        Ow3.a((b30_0)object2, object7, (Function2)object4);
        object4 = N20$a.f;
        boolean bl3 = object2.e();
        if (bl3 || !(bl3 = Intrinsics.areEqual(object7 = object2.v(), n3 = Integer.valueOf(n17)))) {
            re0_0.a(n17, (b30_0)object2, n17, (N20$a$a)object4);
        }
        object4 = N20$a.c;
        Ow3.a((b30_0)object2, object3, (Function2)object4);
        f5 = uq0_0.E;
        object4 = j.h((LP1)object, f5);
        object6 = SP2.a;
        object4 = x20_0.f(QV.a((LP1)object4, (i13)object6));
        HA.a((LP1)object4, (b30_0)object2, 0);
        f7 = uq0_0.h;
        bl3 = false;
        object7 = null;
        n16 = 13;
        bl2 = false;
        f6 = 0.0f;
        mp2 = null;
        object6 = object;
        object = j.k(h.i((LP1)object, 0.0f, f7, 0.0f, 0.0f, n16), f5);
        f5 = uq0_0.m;
        object = x20_0.f(j.d((LP1)object, f5));
        HA.a((LP1)object, (b30_0)object2, 0);
        object2.p();
        object2.E();
        return Unit.a;
    }
}

