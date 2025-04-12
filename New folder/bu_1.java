/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bu
 */
public final class bu_1
implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ICoupon c;
    public final /* synthetic */ String d;

    public /* synthetic */ bu_1(boolean bl2, tt_0 tt_02, ICoupon iCoupon, String string2) {
        this.a = bl2;
        this.b = tt_02;
        this.c = iCoupon;
        this.d = string2;
    }

    public final Object invoke() {
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onCheckBoxPressed");
        Object object = this.c;
        Intrinsics.checkNotNullParameter(object, "$coupon");
        String string2 = this.d;
        String string3 = "$loginToast";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = this.a;
        int n3 = 1;
        if (bl2) {
            boolean bl3 = ((ICoupon)object).isSelected() ^ n3;
            object = bl3;
            function1.invoke(object);
        } else {
            function1 = null;
            hv3_0.o0(n3, string2, null);
        }
        return Unit.a;
    }
}

