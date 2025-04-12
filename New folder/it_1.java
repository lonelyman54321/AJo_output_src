/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from It
 */
public final class it_1
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ICoupon c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ it_1(ob0_1 ob0_12, boolean bl2, ICoupon iCoupon, LP1 lP1, tt_0 tt_02, int n3) {
        this.a = ob0_12;
        this.b = bl2;
        this.c = iCoupon;
        this.d = lP1;
        this.e = tt_02;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        ICoupon iCoupon = this.c;
        Intrinsics.checkNotNullParameter(iCoupon, "$coupon");
        LP1 lP1 = this.d;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        object = this.e;
        Intrinsics.checkNotNullParameter(object, "$onCheckBoxPressed");
        int n3 = Me3.b(this.f | 1);
        boolean bl2 = this.b;
        Object object4 = object;
        object4 = (tt_0)object;
        qt_0.g(ob0_12, bl2, iCoupon, lP1, (tt_0)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

