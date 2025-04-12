/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AA$a
implements wj_2 {
    public final /* synthetic */ kd1_1 a;

    public AA$a(kd1_1 kd1_12) {
        this.a = kd1_12;
    }

    public final void onFailure(ij_2 object, IOException iOException) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(iOException, "e");
        object = yn3_0.a;
        String string2 = this.a.a;
        string2 = kp1_0.c("Bottom tab image load failed url = ", string2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).d(string2, objectArray);
        ((yn3$a)object).e(iOException);
    }

    public final void onResponse(ij_2 object, cl2_2 object2) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(object2, "response");
        object = aa_1.d;
        Object object3 = new wa_2((cl2_2)object2);
        object2 = new o53_0((Callable)object3);
        object3 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object3);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        Object object4 = this.a;
        object3 = new R7(object4, 1);
        object4 = new xa_2(0, (Function1)object3);
        object3 = new ya_2(0);
        za_2 za_22 = new za_2(object3, 0);
        object2 = ((g53_0)object2).f((o60_0)object4, za_22);
        ((t30_0)object).b((yr0_2)object2);
    }
}

