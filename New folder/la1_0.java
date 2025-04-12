/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Status;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from lA1
 */
public final class la1_0
implements F62 {
    public final /* synthetic */ pA1 a;

    public /* synthetic */ la1_0(pA1 pA12) {
        this.a = pA12;
    }

    public final void onChanged(Object object) {
        int n3 = 1;
        boolean bl2 = false;
        Object object2 = null;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = cp_1.Companion;
        boolean bl3 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (bl3) {
            int n4;
            object4 = ((pA1)object3).w;
            if (object4 != null) {
                object4.stopLoader();
            }
            bl3 = false;
            object4 = null;
            String string2 = "getMessage(...)";
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                Object object5 = (Status)((DataCallback)object).getData();
                if (object5 != null && (n4 = (int)(((Status)object5).isSuccess() ? 1 : 0)) == n3) {
                    object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object4 = hv3_0.K(R$string.glad_you_are_back);
                    string2 = "Login with OTP";
                    object5 = "login - password screen";
                    ((GTMEvents)object).pushButtonTapEvent((String)object4, string2, (String)object5);
                    object = new Bundle();
                    object.putBoolean("ISFROMSOCIALLOGIN", false);
                    object.putBoolean("ISMANUALSIGNUP", false);
                    object.putBoolean("ISEXISTINGUSER", n3 != 0);
                    object4 = ((pA1)object3).g;
                    object.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)object4);
                    object2 = ((pA1)object3).q;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((oa1_1)object2).f();
                    object.putParcelable("QUERYCUSTOMER_DATA", (Parcelable)object2);
                    bl3 = ((pA1)object3).l;
                    object.putBoolean("ISINPUTMOBILENUMBER", bl3);
                    object4 = ((pA1)object3).p;
                    object.putString("INPUT_MOBILE_EMAILID", (String)object4);
                    object2 = ((pA1)object3).q;
                    Intrinsics.checkNotNull(object2);
                    bl2 = ((oa1_1)object2).H;
                    object4 = "is_forgot_password";
                    object.putBoolean((String)object4, bl2);
                    object2 = "IsFromPassword";
                    object.putBoolean((String)object2, n3 != 0);
                    bl2 = ((pA1)object3).y;
                    if (bl2) {
                        object2 = "is_unrecognised_device";
                        object.putBoolean((String)object2, n3 != 0);
                    }
                    Object object6 = ((pA1)object3).q;
                    Intrinsics.checkNotNull(object6);
                    n3 = ((oa1_1)object6).H;
                    object6 = n3 != 0 ? "VerifySetPasswordTAG" : "LoginOtpFragment";
                    sz1_2.Companion.getClass();
                    object = Sz1$a.a((Bundle)object);
                    object2 = ((pA1)object3).w;
                    if (object2 != null) {
                        object2.Z0((Fragment)object, (String)object6);
                    }
                } else {
                    Object object7 = (Status)((DataCallback)object).getData();
                    if (object7 != null) {
                        object7 = ((Status)object7).getMessage();
                    } else {
                        n3 = 0;
                        object7 = null;
                    }
                    if (object7 != null && (n3 = ((String)object7).length())) {
                        object = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object);
                        object = ((Status)object).getMessage();
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        hv3_0.o0(0, (String)object, null);
                    }
                }
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == n3) {
                    if ((object = ((DataCallback)object).getError()) != null) {
                        object4 = ((DataError)object).getErrorMessage();
                    }
                    if (object4 != null) {
                        object3 = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_error_message;
                        object3 = hv3_0.K(n7);
                        object4 = ((DataError)object).getErrorMessage().getMessage();
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object4;
                        object4 = "format(...)";
                        String string3 = xh2_0.a(objectArray, n3, (String)object3, (String)object4);
                        object = ((DataError)object).getErrorMessage().getMessage();
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        hv3_0.o0(0, (String)object, string3);
                    }
                }
            }
        }
    }
}

