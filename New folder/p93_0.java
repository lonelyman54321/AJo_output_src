/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p93
 */
public final class p93_0
implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ yh0_0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ tr1_0 d;

    public /* synthetic */ p93_0(String string2, yh0_0 yh0_02, v93_0 v93_02, tr1_0 tr1_02) {
        this.a = string2;
        this.b = yh0_02;
        this.c = v93_02;
        this.d = tr1_02;
    }

    public final Object invoke() {
        yh0_0 yh0_02 = this.b;
        Intrinsics.checkNotNullParameter(yh0_02, "$viewModel");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onDismissClick");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$selectedItem$delegate");
        String string2 = this.a;
        tr1_02.setValue(string2);
        yh0_02.g.setValue(string2);
        function0.invoke();
        return Unit.a;
    }
}

