/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Sr1
 */
public final class sr1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Tr1 c;
    public final /* synthetic */ Tr1$a d;

    public sr1_1(Tr1 tr1, Tr1$a tr1$a) {
        this.c = tr1;
        this.d = tr1$a;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        Object object3;
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
            return Unit.a;
        }
        object2 = this.c;
        Object object4 = (wr1_0)((Tr1)object2).b.invoke();
        Tr1$a tr1$a = this.d;
        int n7 = tr1$a.c;
        int n8 = object4.getItemCount();
        Object object5 = tr1$a.a;
        int n10 = -1;
        if ((n7 >= n8 || (n8 = (int)(Intrinsics.areEqual(object3 = object4.c(n7), object5) ? 1 : 0)) == 0) && (n7 = object4.b(object5)) != n10) {
            tr1$a.c = n7;
        }
        n8 = n7;
        if (n7 != n10) {
            n7 = -660479623;
            object.K(n7);
            bs2_1 bs2_12 = ((Tr1)object2).a;
            Object object6 = tr1$a.a;
            en3.a((wr1_0)object4, bs2_12, n8, object6, (b30_0)object, 0);
            object.E();
        } else {
            n4 = -660272047;
            object.K(n4);
            object.E();
        }
        n4 = (int)(object.x(tr1$a) ? 1 : 0);
        object4 = object.v();
        if (n4 != 0 || object4 == (object2 = b30$a.a)) {
            object4 = new rr1_1(tr1$a);
            object.o(object4);
        }
        object4 = (Function1)object4;
        ly0_0.b(object5, (Function1)object4, (b30_0)object);
        return Unit.a;
    }
}

