/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cb0
 */
public final class cb0_2
implements Function0 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ i90_0 b;

    public /* synthetic */ cb0_2(c80 c802, ob0_1 ob0_12) {
        this.a = ob0_12;
        this.b = c802;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        i90_0 i90_02 = this.b;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_12.u(true);
        fb0_2 fb0_22 = new fb0_2(ob0_12, null);
        Ae3.d(i90_02, null, null, fb0_22, 3);
        return Unit.a;
    }
}

