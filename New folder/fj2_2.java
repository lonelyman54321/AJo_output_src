/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fj2
 */
public final class fj2_2
implements Function0 {
    public final /* synthetic */ hj2_1 a;

    public /* synthetic */ fj2_2(hj2_1 hj2_12) {
        this.a = hj2_12;
    }

    public final Object invoke() {
        hj2_1 hj2_12 = this.a;
        Intrinsics.checkNotNullParameter(hj2_12, "this$0");
        return UserInformation.getInstance(hj2_12.requireContext().getApplicationContext());
    }
}

