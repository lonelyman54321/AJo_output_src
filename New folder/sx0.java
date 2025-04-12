/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 */
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.EditProfileData;
import com.ril.ajio.services.data.Login.OTPData;
import com.ril.ajio.utility.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class sx0
implements F62 {
    public final /* synthetic */ ux0_0 a;

    public /* synthetic */ sx0(ux0_0 ux0_02) {
        this.a = ux0_02;
    }

    public final void onChanged(Object object) {
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        ((ux0_0)object2).Qa(false);
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            Intrinsics.checkNotNull(object);
            n4 = ((DataCallback)object).getStatus();
            String string2 = "format(...)";
            if (n4 == 0) {
                object3 = ((Fragment)object2).getActivity();
                if (object3 != null && (object3 = ((Fragment)object2).getView()) != null && (object = (OTPData)((DataCallback)object).getData()) != null) {
                    ((OTPData)object).isSuccess();
                    n4 = (int)(((OTPData)object).isSuccess() ? 1 : 0);
                    if (n4 == n3) {
                        int n7;
                        ux0_0.Pa(((Fragment)object2).getActivity());
                        object = ((ux0_0)object2).h;
                        n4 = 0;
                        object3 = null;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditEmailView");
                            n7 = 0;
                            object = null;
                        }
                        int n8 = 8;
                        object.setVisibility(n8);
                        object = ((ux0_0)object2).i;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEnterOtpView");
                            n7 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((ux0_0)object2).k;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mOtpEt");
                            n7 = 0;
                            object = null;
                        }
                        object.requestFocus();
                        object = ((ux0_0)object2).r;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTv");
                            n7 = 0;
                            object = null;
                        }
                        object.setVisibility(n8);
                        object = ((ux0_0)object2).s;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTimerTv");
                            n7 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((ux0_0)object2).p;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mValidTimeTv");
                            n7 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((ux0_0)object2).q;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mErrorOtpTv");
                            n7 = 0;
                            object = null;
                        }
                        object.setVisibility(n8);
                        object = ((ux0_0)object2).m;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConfirmOtpTv");
                            n7 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        n7 = R$string.enter_otp_new_number;
                        Object object4 = ((ux0_0)object2).x;
                        object4 = object4 != null ? ((EditProfileData)object4).getMobileNumber() : null;
                        Object object5 = new Object[n3];
                        object5[0] = object4;
                        object = hv3_0.L(n7, (Object[])object5);
                        object4 = new SpannableString((CharSequence)object);
                        object5 = ((ux0_0)object2).x;
                        String string3 = "";
                        if (object5 == null || (object5 = ((EditProfileData)object5).getMobileNumber()) == null) {
                            object5 = string3;
                        }
                        int n10 = 6;
                        n7 = StringsKt.O((CharSequence)object, (String)object5, 0, false, n10);
                        object5 = ((ux0_0)object2).x;
                        if (object5 == null || (object5 = ((EditProfileData)object5).getMobileNumber()) == null) {
                            object5 = string3;
                        }
                        int n14 = ((String)object5).length() + n7;
                        AJIOApplication.Companion.getClass();
                        AJIOApplication aJIOApplication = AJIOApplication$a.a();
                        Typeface typeface = mz3_0.t(aJIOApplication, n8);
                        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, typeface);
                        string3 = "#666666";
                        int n15 = Color.parseColor((String)string3);
                        typeface = new ForegroundColorSpan(n15);
                        n15 = 18;
                        object4.setSpan((Object)typeface, n7, n14, n15);
                        object4.setSpan((Object)ajioCustomTypefaceSpan, n7, n14, n15);
                        object = ((ux0_0)object2).n;
                        if (object == null) {
                            object = "mSubHeaderOtpTv";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        } else {
                            object3 = object;
                        }
                        object3.setText((CharSequence)object4);
                        object = new ux0$a((ux0_0)object2);
                        ((ux0_0)object2).u = object;
                        Intrinsics.checkNotNull(object);
                        object.start();
                        object = b.Companion;
                        object3 = ((ux0_0)object2).w;
                        Intrinsics.checkNotNull(object3);
                        ((ux0_0)object2).v = object = (b)((x63_0)object).a(object3);
                        Intrinsics.checkNotNull(object);
                        ((b)object).b((nr2_2)object2);
                        object = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_alert_message;
                        object = hv3_0.K(n7);
                        int n16 = R$string.otp_sent_msg_mobile;
                        object2 = hv3_0.K(n16);
                        object3 = new Object[n3];
                        object3[0] = object2;
                        object = xh2_0.a(object3, n3, (String)object, string2);
                        n3 = R$string.otp_sent_msg_mobile;
                        String string4 = hv3_0.K(n3);
                        mq0_2.d(string4, (String)object);
                    } else {
                        int n17;
                        object2 = ((OTPData)object).getMessage();
                        object3 = "getMessage(...)";
                        if (object2 != null && (n17 = ((String)object2).length()) != 0) {
                            object2 = StringCompanionObject.INSTANCE;
                            n17 = R$string.acc_alert_message;
                            object2 = hv3_0.K(n17);
                            String string5 = ((OTPData)object).getMessage();
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = string5;
                            String string6 = xh2_0.a(objectArray, n3, (String)object2, string2);
                            object = ((OTPData)object).getMessage();
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            mq0_2.d((String)object, string6);
                        } else {
                            object2 = StringCompanionObject.INSTANCE;
                            n17 = R$string.acc_error_message;
                            object2 = hv3_0.K(n17);
                            int n18 = R$string.server_alert_title;
                            String string7 = hv3_0.K(n18);
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = string7;
                            String string8 = xh2_0.a(objectArray, n3, (String)object2, string2);
                            object = ((OTPData)object).getMessage();
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            mq0_2.d((String)object, string8);
                        }
                    }
                }
            } else {
                int n19 = ((DataCallback)object).getStatus();
                if (n19 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n19 = R$string.acc_error_message;
                    object = hv3_0.K(n19);
                    int n20 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n20);
                    object3 = new Object[n3];
                    object3[0] = object2;
                    object = xh2_0.a(object3, n3, (String)object, string2);
                    n3 = R$string.server_alert_title;
                    String string9 = hv3_0.K(n3);
                    mq0_2.d(string9, (String)object);
                }
            }
        }
    }
}

