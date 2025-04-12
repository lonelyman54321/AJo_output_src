/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xb0
 */
public final class xb0_1
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xb0_1(ob0_1 ob0_12, p83_0 p83_02, int n3) {
        this.a = ob0_12;
        this.b = p83_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        p83_0 p83_02 = this.b;
        Intrinsics.checkNotNullParameter(p83_02, "$unlockedCouponsList");
        int n3 = Me3.b(this.c | 1);
        Jb0.a(ob0_12, p83_02, (b30_0)object, n3);
        return Unit.a;
    }
}

