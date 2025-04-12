/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZM0
 */
public final class zm0_2
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ ob0_1 b;

    public /* synthetic */ zm0_2(c80 c802, ob0_1 ob0_12) {
        this.a = c802;
        this.b = ob0_12;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.a;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_1 ob0_12 = this.b;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        hn0_2 hn0_22 = new hn0_2(ob0_12, null);
        Ae3.d(i90_02, null, null, hn0_22, 3);
        return Unit.a;
    }
}

