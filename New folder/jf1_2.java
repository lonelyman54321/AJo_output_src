/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.order.imps.d;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jf1
 */
public final class jf1_2
implements Function0 {
    public final /* synthetic */ d a;

    public /* synthetic */ jf1_2(d d2) {
        this.a = d2;
    }

    public final Object invoke() {
        d d2 = this.a;
        Intrinsics.checkNotNullParameter(d2, "this$0");
        return UserInformation.getInstance(d2.requireContext().getApplicationContext());
    }
}

