/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ma0
 */
public final class ma0_0
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ ma0_0(ob0_1 ob0_12, String string2, int n3) {
        this.a = ob0_12;
        this.b = string2;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        int n3 = Me3.b(this.c | 1);
        String string2 = this.b;
        Ue3.a((ob0_1)object2, string2, (b30_0)object, n3);
        return Unit.a;
    }
}

