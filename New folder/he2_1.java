/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from he2
 */
public final class he2_1
implements Function0 {
    public final /* synthetic */ qz1_2 a;

    public /* synthetic */ he2_1(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Boolean bl2 = Boolean.TRUE;
        qz1_22.P.setValue(bl2);
        return Unit.a;
    }
}

