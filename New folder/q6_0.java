/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q6
 */
public final class q6_0
implements Function0 {
    public final /* synthetic */ j7_0 a;

    public /* synthetic */ q6_0(j7_0 j7_02) {
        this.a = j7_02;
    }

    public final Object invoke() {
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        String string2 = od3_2.a();
        ld3_2 ld3_22 = ld3_2.STORE_AJIOGRAM;
        String string3 = ld3_22.getStoreId();
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        string2 = bl2 ? ld3_22.getStoreId() : ld3_2.STORE_AJIO.getStoreId();
        j7_02.b(string2);
        return Unit.a;
    }
}

