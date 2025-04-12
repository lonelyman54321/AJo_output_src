/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.IFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VM0
 */
public final class vm0_1
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ IFilter c;
    public final /* synthetic */ ob0_1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ vm0_1(LP1 lP1, p83_0 p83_02, IFilter iFilter, ob0_1 ob0_12, int n3) {
        this.a = lP1;
        this.b = p83_02;
        this.c = iFilter;
        this.d = ob0_12;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        p83_0 p83_02 = this.b;
        Intrinsics.checkNotNullParameter(p83_02, "$filters");
        ob0_1 ob0_12 = this.d;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        int n3 = Me3.b(this.e | 1);
        IFilter iFilter = this.c;
        gn0_2.c(lP1, p83_02, iFilter, ob0_12, (b30_0)object3, n3);
        return Unit.a;
    }
}

