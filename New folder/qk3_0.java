/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from qk3
 */
public final class qk3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ mk2_0 d;
    public final /* synthetic */ Function2 e;

    public qk3_0(tr1_0 tr1_02, mk2_0 mk2_02, Function2 function2) {
        this.c = tr1_02;
        this.d = mk2_02;
        this.e = function2;
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
        object2 = androidx.compose.ui.layout.a.b("border");
        long l2 = ((C63)this.c.getValue()).a;
        Object object3 = this.d;
        Object object4 = new ig2_0(l2, (mk2_0)object3);
        object2 = a.c((LP1)object2, (Function1)object4);
        Object object5 = HA.e(Nc$a.a, true);
        int n7 = object.F();
        object4 = object.m();
        object2 = a30_0.c((b30_0)object, (LP1)object2);
        N20.W.getClass();
        object3 = N20$a.b;
        mp mp2 = object.i();
        boolean bl2 = mp2 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object.A();
        bl2 = object.e();
        if (bl2) {
            object.C((Function0)object3);
        } else {
            object.n();
        }
        object3 = N20$a.e;
        Ow3.a((b30_0)object, object5, (Function2)object3);
        object5 = N20$a.d;
        Ow3.a((b30_0)object, object4, (Function2)object5);
        object5 = N20$a.f;
        boolean bl3 = object.e();
        if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = object.v(), object3 = Integer.valueOf(n7)))) {
            re0_0.a(n7, (b30_0)object, n7, (N20$a$a)object5);
        }
        object5 = N20$a.c;
        Ow3.a((b30_0)object, object2, (Function2)object5);
        object2 = this.e;
        if (object2 == null) {
            n4 = 719996434;
            object.K(n4);
        } else {
            object.K(-392416305);
            n3 = 0;
            object5 = 0;
            object2.invoke(object, object5);
        }
        object.E();
        object.p();
        return Unit.a;
    }
}

