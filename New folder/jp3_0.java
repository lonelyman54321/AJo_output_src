/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jp3
 */
public final class jp3_0
implements Function0 {
    public final /* synthetic */ qz1_2 a;

    public /* synthetic */ jp3_0(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Boolean bl2 = Boolean.TRUE;
        qz1_22.t.setValue(bl2);
        return Unit.a;
    }
}

