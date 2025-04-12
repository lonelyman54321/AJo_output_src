/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YO2
 */
public final class yo2_0
implements Function0 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ yo2_0(bP2$m bP2$m) {
        this.a = bP2$m;
    }

    public final Object invoke() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onClick");
        function0.invoke();
        return Unit.a;
    }
}

