/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ut
 */
public final class ut_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ p83_0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ i90_0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ ut_1(boolean bl2, ob0_1 ob0_12, boolean bl3, p83_0 p83_02, int n3, int n4, boolean bl4, c80 c802, int n7) {
        this.a = bl2;
        this.b = ob0_12;
        this.c = bl3;
        this.d = p83_02;
        this.e = n3;
        this.f = n4;
        this.g = bl4;
        this.h = c802;
        this.i = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        ob0_1 ob0_12 = this.b;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        p83_0 p83_02 = this.d;
        Intrinsics.checkNotNullParameter(p83_02, "$selectedCouponsList");
        object = this.h;
        Intrinsics.checkNotNullParameter(object, "$coroutineScope");
        int n3 = Me3.b(this.i | 1);
        boolean bl2 = this.g;
        Object object4 = object;
        object4 = (c80)object;
        boolean bl3 = this.a;
        boolean bl4 = this.c;
        int n4 = this.e;
        int n7 = this.f;
        qt_0.b(bl3, ob0_12, bl4, p83_02, n4, n7, bl2, (c80)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

