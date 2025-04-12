/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zb0
 */
public final class zb0_0
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ zb0_0(ob0_1 ob0_12, int n3) {
        this.a = ob0_12;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        int n3 = Me3.b(this.b | 1);
        Jb0.d(ob0_12, (b30_0)object, n3);
        return Unit.a;
    }
}

