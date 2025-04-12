/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ke2
 */
public final class ke2_0
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ke2_0(qz1_2 qz1_22, String string2) {
        this.a = qz1_22;
        this.b = string2;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$toastMessage");
        qz1_22.getClass();
        Intrinsics.checkNotNullParameter(string2, "message");
        hv3_0.o0(1, string2, null);
        return Unit.a;
    }
}

