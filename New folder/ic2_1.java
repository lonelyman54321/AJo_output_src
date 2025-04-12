/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ic2
 */
public final class ic2_1
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ ic2_1(u8_0 u8_02) {
        this.a = u8_02;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$closeButtonClick");
        function0.invoke();
        return Unit.a;
    }
}

