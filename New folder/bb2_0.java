/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bb2
 */
public final class bb2_0
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ bb2_0(Function0 function0) {
        this.a = function0;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
        function0.invoke();
        return Unit.a;
    }
}

