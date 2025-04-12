/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gf2
 */
public final class gf2_2
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ gf2_2(sb2_1 sb2_12) {
        this.a = sb2_12;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onNeedHelpClicked");
        function0.invoke();
        return Unit.a;
    }
}

