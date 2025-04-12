/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SG2
 */
public final class sg2_1
implements Function1 {
    public final /* synthetic */ jH2 a;
    public final /* synthetic */ zr1_1 b;

    public /* synthetic */ sg2_1(zr1_1 zr1_12, jH2 jH22) {
        this.a = jH22;
        this.b = zr1_12;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        jH2 jH22 = this.a;
        Intrinsics.checkNotNullParameter(jH22, "this$0");
        zr1_1 zr1_12 = this.b;
        Intrinsics.checkNotNullParameter(zr1_12, "$referralCashMLD");
        String string2 = "referralCodeSuccess";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = jH22.a(zr1_12);
        } else {
            object = g53_0.d(Boolean.FALSE);
            Intrinsics.checkNotNull(object);
        }
        return object;
    }
}

