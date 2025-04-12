/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class WG2
implements Function1 {
    public final /* synthetic */ zr1_1 a;
    public final /* synthetic */ jH2 b;

    public /* synthetic */ WG2(zr1_1 zr1_12, jH2 jH22) {
        this.a = zr1_12;
        this.b = jH22;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        zr1_1 zr1_12 = this.a;
        Intrinsics.checkNotNullParameter(zr1_12, "$referralCashMLD");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "it");
        object2.getClass();
        object2 = jH2.d("referral_cash", (Throwable)object, true);
        zr1_12.i(object2);
        return g53_0.c((Throwable)object);
    }
}

