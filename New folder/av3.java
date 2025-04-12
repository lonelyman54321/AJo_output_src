/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class av3
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ av3(Function0 function0) {
        this.a = function0;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onBrandClicked");
        function0.invoke();
        return Unit.a;
    }
}

