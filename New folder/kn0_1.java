/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.IFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kN0
 */
public final class kn0_1
implements Function0 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ IFilter b;

    public /* synthetic */ kn0_1(ob0_1 ob0_12, IFilter iFilter) {
        this.a = ob0_12;
        this.b = iFilter;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        IFilter iFilter = this.b;
        Intrinsics.checkNotNullParameter(iFilter, "$filter");
        ob0_12.getClass();
        Intrinsics.checkNotNullParameter(iFilter, "filter");
        ob0_12.n.setValue(iFilter);
        return Unit.a;
    }
}

