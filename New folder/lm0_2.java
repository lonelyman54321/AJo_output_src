/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LM0
 */
public final class lm0_2
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ lm0_2(Function0 function0) {
        this.a = function0;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onReset");
        function0.invoke();
        return Unit.a;
    }
}

