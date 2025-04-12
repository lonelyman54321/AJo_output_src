/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cb0
 */
public final class cb0_1
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ ICoupon b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ cb0_1(ob0_1 ob0_12, ICoupon iCoupon, Jb0$b jb0$b, int n3) {
        this.a = ob0_12;
        this.b = iCoupon;
        this.c = jb0$b;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        ICoupon iCoupon = this.b;
        Intrinsics.checkNotNullParameter(iCoupon, "$coupon");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onCopyClicked");
        int n3 = Me3.b(this.d | 1);
        function0 = (Jb0$b)function0;
        Jb0.b((ob0_1)object2, iCoupon, (Jb0$b)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

