/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.referral.ReferralAjioWallet;
import com.ril.ajio.services.data.referral.transform.ReferralAjioWalletTransform$Builder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YG2
 */
public final class yg2_0
implements Function1 {
    public final /* synthetic */ zr1_1 a;
    public final /* synthetic */ jH2 b;

    public /* synthetic */ yg2_0(zr1_1 zr1_12, jH2 jH22) {
        this.a = zr1_12;
        this.b = jH22;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$referralCashMLD");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Intrinsics.checkNotNullParameter(object2, "cashResp");
        Object object4 = (ReferralAjioWallet)((dl2_2)object2).b;
        cl2_2 cl2_22 = ((dl2_2)object2).a;
        boolean bl2 = cl2_22.d();
        if (bl2 && object4 != null) {
            object3 = new ReferralAjioWalletTransform$Builder();
            object3 = ((ReferralAjioWalletTransform$Builder)object3).build((ReferralAjioWallet)object4);
            object2 = DataCallback.Companion;
            object3 = ((DataCallback$Companion)object2).onSuccess(object3);
            ((LiveData)object).i(object3);
            object = g53_0.d(Boolean.TRUE);
        } else {
            DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
            object3.getClass();
            object3 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object4 = "referral_cash";
            bl2 = false;
            cl2_22 = null;
            object3 = ApiErrorRepo.getApiError$default((ApiErrorRepo)object3, (dl2_2)object2, (String)object4, false, null, null, n3, null);
            object3 = dataCallback$Companion.onFailed((DataError)object3);
            ((LiveData)object).i(object3);
            object = g53_0.d(Boolean.FALSE);
        }
        return object;
    }
}

