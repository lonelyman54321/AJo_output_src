/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xt
 */
public final class xt_1
implements Function0 {
    public final /* synthetic */ ob0_1 a;

    public /* synthetic */ xt_1(ob0_1 ob0_12) {
        this.a = ob0_12;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Boolean bl2 = Boolean.FALSE;
        ob0_12.i.setValue(bl2);
        return Unit.a;
    }
}

