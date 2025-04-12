/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.ForegroundColorSpan
 */
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.OTPData;
import com.ril.ajio.utility.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from Bx0
 */
public final class bx0_1
implements F62 {
    public final /* synthetic */ dx0_1 a;

    public /* synthetic */ bx0_1(dx0_1 dx0_12) {
        this.a = dx0_12;
    }

    public final void onChanged(Object object) {
        int n3 = 0;
        String string2 = null;
        int n4 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0) {
            Intrinsics.checkNotNull(object);
            n7 = ((DataCallback)object).getStatus();
            String string3 = "format(...)";
            if (n7 == 0) {
                object3 = ((Fragment)object2).getActivity();
                if (object3 != null && (object3 = ((Fragment)object2).getView()) != null && (object = (OTPData)((DataCallback)object).getData()) != null) {
                    ((OTPData)object).isSuccess();
                    n7 = (int)(((OTPData)object).isSuccess() ? 1 : 0);
                    if (n7 == n4) {
                        Object object4;
                        int n8;
                        object = ((dx0_1)object2).e;
                        n7 = 0;
                        object3 = null;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditMobileView");
                            n8 = 0;
                            object = null;
                        }
                        int n10 = 8;
                        object.setVisibility(n10);
                        object = ((dx0_1)object2).f;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEnterOtpView");
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((dx0_1)object2).k;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTv");
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(n10);
                        object = ((dx0_1)object2).l;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTimerTv");
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((dx0_1)object2).i;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mValidTimeTv");
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((dx0_1)object2).j;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mErrorOtpTv");
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(n10);
                        object = ((dx0_1)object2).o;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConfirmOtpTv");
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                        object = ((dx0_1)object2).c;
                        CharSequence charSequence = "mMobileEt";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                            n8 = 0;
                            object = null;
                        }
                        if ((object = object.getText()) != null) {
                            object = StringsKt.m0((CharSequence)object);
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        object = String.valueOf(object);
                        n8 = TextUtils.isEmpty((CharSequence)object);
                        String string4 = "";
                        if (n8 != 0) {
                            object = string4;
                        } else {
                            object = ((dx0_1)object2).c;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                                n8 = 0;
                                object = null;
                            }
                            if ((object = object.getText()) != null) {
                                object = StringsKt.m0((CharSequence)object);
                            } else {
                                n8 = 0;
                                object = null;
                            }
                            object4 = "+91";
                            charSequence = new StringBuilder((String)object4);
                            ((StringBuilder)charSequence).append(object);
                            object = ((StringBuilder)charSequence).toString();
                        }
                        int n14 = R$string.user_info_phone_edit;
                        object4 = new Object[n4];
                        object4[0] = object;
                        charSequence = hv3_0.L(n14, (Object[])object4);
                        object4 = new SpannableString(charSequence);
                        int n15 = 6;
                        n14 = StringsKt.O(charSequence, (String)object, 0, false, n15);
                        n8 = ((String)object).length() + n14;
                        AJIOApplication.Companion.getClass();
                        AJIOApplication aJIOApplication = AJIOApplication$a.a();
                        Typeface typeface = mz3_0.t(aJIOApplication, n10);
                        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string4, typeface);
                        string4 = "#666666";
                        int n16 = Color.parseColor((String)string4);
                        typeface = new ForegroundColorSpan(n16);
                        n16 = 18;
                        object4.setSpan((Object)typeface, n14, n8, n16);
                        object4.setSpan((Object)ajioCustomTypefaceSpan, n14, n8, n16);
                        object = ((dx0_1)object2).g;
                        if (object == null) {
                            object = "mUserInfoTv";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        } else {
                            object3 = object;
                        }
                        object3.setText((CharSequence)object4);
                        object = new Dx0$b((dx0_1)object2);
                        ((dx0_1)object2).t = object;
                        Intrinsics.checkNotNull(object);
                        object.start();
                        object = b.Companion;
                        object3 = ((dx0_1)object2).a;
                        Intrinsics.checkNotNull(object3);
                        ((dx0_1)object2).s = object = (b)((x63_0)object).a(object3);
                        Intrinsics.checkNotNull(object);
                        ((b)object).b((nr2_2)object2);
                        object = StringCompanionObject.INSTANCE;
                        n8 = R$string.acc_alert_message;
                        object = hv3_0.K(n8);
                        int n17 = R$string.otp_sent_msg_mobile;
                        object2 = hv3_0.K(n17);
                        object3 = new Object[n4];
                        object3[0] = object2;
                        object = xh2_0.a(object3, n4, (String)object, string3);
                        n3 = R$string.otp_sent_msg_mobile;
                        string2 = hv3_0.K(n3);
                        mq0_2.d(string2, (String)object);
                    } else {
                        int n18;
                        object2 = ((OTPData)object).getMessage();
                        if (object2 != null && (n18 = ((String)object2).length()) != 0) {
                            object2 = StringCompanionObject.INSTANCE;
                            n18 = R$string.acc_alert_message;
                            object2 = hv3_0.K(n18);
                            object3 = ((OTPData)object).getMessage();
                            Object[] objectArray = new Object[n4];
                            objectArray[0] = object3;
                            string2 = xh2_0.a(objectArray, n4, (String)object2, string3);
                            object = ((OTPData)object).getMessage();
                            String string5 = "getMessage(...)";
                            Intrinsics.checkNotNullExpressionValue(object, string5);
                            mq0_2.d((String)object, string2);
                        } else {
                            object = StringCompanionObject.INSTANCE;
                            int n19 = R$string.acc_error_message;
                            object = hv3_0.K(n19);
                            n18 = R$string.server_alert_title;
                            object2 = hv3_0.K(n18);
                            object3 = new Object[n4];
                            object3[0] = object2;
                            object = xh2_0.a(object3, n4, (String)object, string3);
                            n3 = R$string.server_alert_title;
                            string2 = hv3_0.K(n3);
                            mq0_2.d(string2, (String)object);
                        }
                    }
                }
            } else {
                int n20 = ((DataCallback)object).getStatus();
                if (n20 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n20 = R$string.acc_error_message;
                    object = hv3_0.K(n20);
                    n7 = R$string.server_alert_title;
                    object3 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object3;
                    object = xh2_0.a(objectArray, n4, (String)object, string3);
                    n3 = R$string.server_alert_title;
                    string2 = hv3_0.K(n3);
                    object2.getClass();
                    mq0_2.d(string2, (String)object);
                }
            }
        }
    }
}

