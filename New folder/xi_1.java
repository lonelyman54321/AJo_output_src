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
 * Renamed from Xi
 */
public final class xi_1
extends Lambda
implements Function2 {
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ k72 f;

    public xi_1(long l2, boolean bl2, LP1 lP1, k72 k722) {
        this.c = l2;
        this.d = bl2;
        this.e = lP1;
        this.f = k722;
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
        object2 = b30$a.a;
        long l2 = 9205357640488583168L;
        int n7 = 0;
        Object object3 = null;
        k72 k722 = this.f;
        boolean bl2 = this.d;
        long l3 = this.c;
        long l4 = l3 - l2;
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 != false) {
            Integer n8;
            n3 = -837727128;
            object.K(n3);
            Object object5 = bl2 ? zp$a_0.b : zp$a_0.a;
            float f5 = bs0_0.b(l3);
            float f6 = bs0_0.a(l3);
            Object object6 = this.e;
            int n10 = 12;
            LP1 lP1 = j.g((LP1)object6, f5, f6, 0.0f, 0.0f, n10);
            Object object7 = Nc$a.j;
            object5 = iQ2.a((zp$e)object5, (Gx$b)object7, (b30_0)object, 0);
            n7 = object.F();
            object7 = object.m();
            lP1 = a30_0.c((b30_0)object, lP1);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            object6 = object.i();
            boolean bl3 = object6 instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            object.A();
            boolean bl4 = object.e();
            if (bl4) {
                object.C(xp1$a);
            } else {
                object.n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object, object5, n20$a$b);
            object5 = N20$a.d;
            Ow3.a((b30_0)object, object7, (Function2)object5);
            object5 = N20$a.f;
            boolean bl5 = object.e();
            if (bl5 || !(bl5 = Intrinsics.areEqual(object7 = object.v(), n8 = Integer.valueOf(n7)))) {
                re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object5);
            }
            object5 = N20$a.c;
            Ow3.a((b30_0)object, lP1, (Function2)object5);
            object5 = LP1$a.b;
            boolean bl6 = object.x(k722);
            object3 = object.v();
            if (bl6 || object3 == object2) {
                object3 = new vi_1(k722);
                object.o(object3);
            }
            object3 = (Function0)object3;
            n4 = 6;
            bj_0.c((LP1)object5, (Function0)object3, bl2, (b30_0)object, n4);
            object.p();
            object.E();
            return Unit.a;
        }
        object.K(-836867312);
        n3 = (int)(object.x(k722) ? 1 : 0);
        Object object8 = object.v();
        if (n3 != 0 || object8 == object2) {
            object8 = new wi_1(k722);
            object.o(object8);
        }
        object8 = (Function0)object8;
        object2 = this.e;
        bj_0.c((LP1)object2, (Function0)object8, bl2, (b30_0)object, 0);
        object.E();
        return Unit.a;
    }
}

