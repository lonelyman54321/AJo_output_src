/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vd2
 */
public final class vd2_2
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vd2_2(qz1_2 qz1_22, boolean bl2) {
        this.a = qz1_22;
        this.b = bl2;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Boolean bl2 = this.b ^ true;
        qz1_22.R.setValue(bl2);
        return Unit.a;
    }
}

