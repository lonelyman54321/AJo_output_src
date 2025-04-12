/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.referral.transform.ReferralAjioWalletTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from v81
 */
public final class v81_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v81_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                object2 = (gg2_1)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = cp_1.Companion;
                n4 = (int)(nn_2.b((cp$a)object3, (DataCallback)object) ? 1 : 0);
                if (n4 != 0) {
                    n4 = ((DataCallback)object).getStatus();
                    if (n4 == 0) {
                        object = (ReferralAjioWalletTransform)((DataCallback)object).getData();
                        ((gg2_1)object2).Qa((ReferralAjioWalletTransform)object);
                    } else {
                        object = ((Fragment)object2).getContext();
                        if (object != null) {
                            object3 = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_error_message;
                            object3 = hv3_0.K(n4);
                            int n7 = R$string.something_wrong_msg;
                            String string2 = hv3_0.K(n7);
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = string2;
                            string2 = "format(...)";
                            object3 = xh2_0.a(objectArray, n3, (String)object3, string2);
                            object2 = ((gg2_1)object2).c;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                                object2 = null;
                            }
                            n7 = R$string.something_wrong_msg;
                            string2 = hv3_0.K(n7);
                            object2.showToastNotification((Context)object, string2, n3, (String)object3);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object2 = (zr1_1)object2;
        object = (BottomNavigationData)object;
        return HomeRepo.F((zr1_1)object2, (BottomNavigationData)object);
    }
}

