/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fc2
 */
public final class fc2_0
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ fc2_0(rd2_2 rd2_22) {
        this.a = rd2_22;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
        function0.invoke();
        return Unit.a;
    }
}

