/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fM
 */
public final class fm_2
implements Function0 {
    public final /* synthetic */ lm_2 a;

    public /* synthetic */ fm_2(lm_2 lm_22) {
        this.a = lm_22;
    }

    public final Object invoke() {
        lm_2 lm_22 = this.a;
        Intrinsics.checkNotNullParameter(lm_22, "this$0");
        return UserInformation.getInstance(lm_22.requireContext().getApplicationContext());
    }
}

