/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wb2
 */
public final class wb2_1
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ wb2_1(md2_2 md2_22) {
        this.a = md2_22;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onCloseSheetButtonClicked");
        function0.invoke();
        return Unit.a;
    }
}

