/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vt
 */
public final class vt_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ICoupon b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ vt_1(boolean bl2, ICoupon iCoupon, tt_0 tt_02, int n3) {
        this.a = bl2;
        this.b = iCoupon;
        this.c = tt_02;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$coupon");
        Function1 function1 = this.c;
        Intrinsics.checkNotNullParameter(function1, "$onCheckBoxPressed");
        int n3 = Me3.b(this.d | 1);
        boolean bl2 = this.a;
        function1 = (tt_0)function1;
        qt_0.i(bl2, (ICoupon)object2, (tt_0)function1, (b30_0)object, n3);
        return Unit.a;
    }
}

