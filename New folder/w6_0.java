/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from W6
 */
public final class w6_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ j7_0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w6_0(String string2, j7_0 j7_02, int n3) {
        this.a = string2;
        this.b = j7_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        j7_0 j7_02 = this.b;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        int n3 = Me3.b(this.c | 1);
        Z6.e(this.a, j7_02, (b30_0)object, n3);
        return Unit.a;
    }
}

