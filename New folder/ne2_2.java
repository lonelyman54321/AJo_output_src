/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ne2
 */
public final class ne2_2
implements Function0 {
    public final /* synthetic */ qz1_2 a;

    public /* synthetic */ ne2_2(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Boolean bl2 = Boolean.FALSE;
        qz1_22.T.setValue(bl2);
        qz1_22.F("outside tap");
        return Unit.a;
    }
}

