/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UG2
 */
public final class ug2_0
implements Function1 {
    public final /* synthetic */ jH2 a;
    public final /* synthetic */ zr1_1 b;

    public /* synthetic */ ug2_0(zr1_1 zr1_12, jH2 jH22) {
        this.a = jH22;
        this.b = zr1_12;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        jH2 jH22 = this.a;
        Intrinsics.checkNotNullParameter(jH22, "this$0");
        zr1_1 zr1_12 = this.b;
        Intrinsics.checkNotNullParameter(zr1_12, "$referralFAQMLD");
        Intrinsics.checkNotNullParameter(object, "it");
        return jH22.b(zr1_12, "referral");
    }
}

