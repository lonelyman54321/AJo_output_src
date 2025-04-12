/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserProfileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Xb
 */
public final class xb_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xb_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (dl2_2)object;
                object3 = (jH2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object, "referralCodeResp");
                object2 = (UserProfileData)((dl2_2)object).b;
                object = ((dl2_2)object).a;
                boolean bl2 = ((cl2_2)object).d();
                if (bl2) {
                    String string2;
                    bl2 = false;
                    object = null;
                    if (object2 != null) {
                        string2 = ((UserProfileData)object2).getUserReferralCode();
                    } else {
                        n3 = 0;
                        string2 = null;
                    }
                    if (string2 != null && (n3 = string2.length()) != 0) {
                        object3 = ((jH2)object3).b;
                        if (object2 != null) {
                            object = ((UserProfileData)object2).getUserReferralCode();
                        }
                        ((UserInformation)object3).setUserReferralCode((String)object);
                        return g53_0.d(Boolean.TRUE);
                    }
                }
                if (!(bl2 = kotlin.text.b.i((String)(object = ((jH2)object3).b.getUserId()), (String)(object2 = "optionalemailiduser"), (n3 = 1) != 0))) return g53_0.d(Boolean.FALSE);
                object = ((jH2)object3).b;
                object2 = "";
                ((UserInformation)object).setUserId((String)object2);
                return g53_0.d(Boolean.FALSE);
            }
            case 1: {
                object = (DataCallback)object;
                object3 = (h91)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                int n4 = ((DataCallback)object).getStatus();
                if (n4 != 0) return Unit.a;
                object2 = ((h91)object3).l;
                object = ((DataCallback)object).getData();
                ((LiveData)object2).k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        Object object4 = object3;
        object4 = (zr1_1)object3;
        Intrinsics.checkNotNullParameter(object4, "$ajioWalletMLD");
        Intrinsics.checkNotNullParameter(object, "it");
        object2 = dc.a;
        Intrinsics.checkNotNullParameter(object, "throwable");
        String string3 = "AJIOCashBonus";
        Intrinsics.checkNotNullParameter(string3, "requestID");
        object2 = ApiErrorRepo.INSTANCE;
        object3 = object;
        object2 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object2, (Throwable)object, string3, true, null, null, 24, null);
        ((LiveData)object4).i(object2);
        return g53_0.c((Throwable)object);
    }
}

