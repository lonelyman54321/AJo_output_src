/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from r6
 */
public final class r6_0
implements Function2 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ r6_0(j7_0 j7_02, int n3) {
        this.a = j7_02;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        int n3 = Me3.b(this.b | 1);
        s6.a(j7_02, (b30_0)object, n3);
        return Unit.a;
    }
}

