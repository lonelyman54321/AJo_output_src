/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 */
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.ValidateOTPResponse;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from iB3
 */
public final class ib3_1
implements F62 {
    public final /* synthetic */ jb3_0 a;

    public /* synthetic */ ib3_1(jb3_0 jb3_02) {
        this.a = jb3_02;
    }

    public final void onChanged(Object object) {
        int n3 = 1;
        int n4 = 0;
        String string2 = null;
        object = (DataCallback)object;
        jb3_0 jb3_02 = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(jb3_02, (String)object2);
        if (object != null) {
            int n7;
            object2 = jb3_02.h;
            String string3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loaderView");
                n7 = 0;
                object2 = null;
            }
            ((AjioLoaderView)((Object)object2)).stopLoader();
            n7 = ((DataCallback)object).getStatus();
            if (n7 == 0) {
                int n8;
                Object object3;
                object = (ValidateOTPResponse)((DataCallback)object).getData();
                object2 = "single page checkout";
                if (object != null && (object3 = ((ValidateOTPResponse)object).getStatusCode()) != null && (n8 = ((Integer)object3).intValue()) == 0) {
                    dm0_0.f = n3;
                    object = AnalyticsManager.Companion;
                    string2 = "spc wallet verify otp success";
                    object3 = "";
                    tj2_0.e((AnalyticsManager$Companion)object, string2, (String)object3, (String)object2);
                    jb3_02.Oa(null, n3 != 0);
                    object = jb3_02.getTargetFragment();
                    if (object != null) {
                        n3 = jb3_02.getTargetRequestCode();
                        n4 = -1;
                        ((Fragment)object).onActivityResult(n3, n4, null);
                    }
                    jb3_02.dismiss();
                } else if (object != null) {
                    Object object4 = jb3_02.c;
                    object3 = "errorMsgTv";
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        object4 = null;
                    }
                    object4.setVisibility(0);
                    object4 = jb3_02.c;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        object4 = null;
                    }
                    ai0_2.a((View)object4);
                    object4 = jb3_02.j;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("validMsg");
                        n3 = 0;
                        object4 = null;
                    }
                    int n10 = 8;
                    object4.setVisibility(n10);
                    object4 = ((ValidateOTPResponse)object).getMessage();
                    if (object4 != null) {
                        object4 = jb3_02.c;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n3 = 0;
                            object4 = null;
                        }
                        object = ((ValidateOTPResponse)object).getMessage();
                        object4.setText((CharSequence)object);
                    } else {
                        object = jb3_02.c;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            object = null;
                        }
                        n3 = R$string.otp_invalid;
                        object.setText(n3);
                    }
                    object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object4 = jb3_02.c;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        object4 = null;
                    }
                    if ((object4 = object4.getText()) != null) {
                        object4 = object4.toString();
                    } else {
                        n3 = 0;
                        object4 = null;
                    }
                    String string4 = "spc wallet verify otp failure";
                    ((GTMEvents)object).pushButtonTapEvent(string4, object4, (String)object2);
                    object = jb3_02.c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        object = null;
                    }
                    if ((object = object.getText()) != null) {
                        string3 = object.toString();
                    }
                    jb3_02.Oa(string3, false);
                }
            } else {
                n7 = ((DataCallback)object).getStatus();
                if (n7 == n3) {
                    if ((object = ((DataCallback)object).getError()) != null && (object2 = ((DataError)object).getErrorMessage()) != null && (n7 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((DataError)object).getErrorMessage().getMessage())) ? 1 : 0)) == 0) {
                        object2 = ((DataError)object).getErrorMessage().getMessage();
                        Object object5 = StringCompanionObject.INSTANCE;
                        int n14 = R$string.acc_alert_message;
                        object5 = hv3_0.K(n14);
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object2;
                        Object object6 = Arrays.copyOf(objectArray, n3);
                        object6 = String.format((String)object5, object6);
                        object5 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                        jb3_0.Pa((String)object2, (String)object6);
                    }
                    if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
                        string3 = ((DataError$ErrorMessage)object).getMessage();
                    }
                    jb3_02.Oa(string3, false);
                }
            }
        }
    }
}

