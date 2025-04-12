/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mB0
 */
public final class mb0_1
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ mb0_1(Function0 function0) {
        this.a = function0;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onButtonClicked");
        function0.invoke();
        return Unit.a;
    }
}

