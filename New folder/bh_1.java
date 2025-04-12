/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from bh
 */
public final class bh_1
extends Lambda
implements Function2 {
    public final /* synthetic */ long c;
    public final /* synthetic */ LP1 d;

    public bh_1(long l2, LP1 lP1) {
        this.c = l2;
        this.d = lP1;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
            return Unit.a;
        }
        long l2 = 9205357640488583168L;
        long l3 = this.c;
        n4 = 0;
        object2 = null;
        Object object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object3 == false) {
            n3 = 1829217412;
            object.K(n3);
            LP1 lP1 = this.d;
            ih.b(0, 0, (b30_0)object, lP1);
            object.E();
            return Unit.a;
        }
        n3 = 1828881000;
        object.K(n3);
        float f5 = bs0_0.b(l3);
        float f6 = bs0_0.a(l3);
        Object object4 = this.d;
        int n7 = 12;
        LP1 lP1 = j.g((LP1)object4, f5, f6, 0.0f, 0.0f, n7);
        Object object5 = HA.e(Nc$a.b, false);
        int n8 = object.F();
        Object object6 = object.m();
        lP1 = a30_0.c((b30_0)object, lP1);
        N20.W.getClass();
        object4 = N20$a.b;
        mp mp2 = object.i();
        boolean bl2 = mp2 instanceof mp;
        f6 = 0.0f;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object.A();
        bl2 = object.e();
        if (bl2) {
            object.C((Function0)object4);
        } else {
            object.n();
        }
        object4 = N20$a.e;
        Ow3.a((b30_0)object, object5, (Function2)object4);
        object5 = N20$a.d;
        Ow3.a((b30_0)object, object6, (Function2)object5);
        object5 = N20$a.f;
        boolean bl3 = object.e();
        if (bl3 || !(bl3 = Intrinsics.areEqual(object6 = object.v(), object4 = Integer.valueOf(n8)))) {
            re0_0.a(n8, (b30_0)object, n8, (N20$a$a)object5);
        }
        object5 = N20$a.c;
        Ow3.a((b30_0)object, lP1, (Function2)object5);
        n3 = 1;
        ih.b(0, n3, (b30_0)object, null);
        object.p();
        object.E();
        return Unit.a;
    }
}

