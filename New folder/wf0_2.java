/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WF0
 */
public final class wf0_2
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ wf0_2(nf0_1 nf0_12, int n3) {
        this.a = nf0_12;
        this.b = n3;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onClickExpanded");
        Integer n3 = this.b;
        function1.invoke(n3);
        return Unit.a;
    }
}

