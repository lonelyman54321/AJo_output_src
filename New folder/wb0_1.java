/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wb0
 */
public final class wb0_1
implements Function2 {
    public final /* synthetic */ ICoupon a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ wb0_1(ICoupon iCoupon, boolean bl2, Jb0$b jb0$b, int n3) {
        this.a = iCoupon;
        this.b = bl2;
        this.c = jb0$b;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$coupon");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onCheckBoxPressed");
        int n3 = Me3.b(this.d | 1);
        boolean bl2 = this.b;
        function0 = (Jb0$b)function0;
        Jb0.c((ICoupon)object2, bl2, (Jb0$b)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

