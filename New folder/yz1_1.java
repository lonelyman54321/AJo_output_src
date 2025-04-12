/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.UserProfileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from yZ1
 */
public final class yz1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yz1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        jo_2 jo_22;
        jo_2 jo_23;
        String string2;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = 1;
        int n4 = 0;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                zr1_1 zr1_12 = ((op2_2)object2).i;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = apiErrorRepo.handleApiException((Throwable)object4, "LP_BALANCE", true, "single page checkout", "Forward");
                zr1_12.k(object2);
                return Unit.a;
            }
            case 0: 
        }
        DataCallback dataCallback = (DataCallback)object;
        object2 = (bz1_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object3, dataCallback);
        if (n8 == 0) {
            ((bz1_2)object2).Wa();
            return Unit.a;
        }
        object3 = ((bz1_2)object2).k0;
        n7 = 0;
        Object[] objectArray = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScrollviewAccount");
            n8 = 0;
            object3 = null;
        }
        int n10 = 33;
        ((NestedScrollView)object3).f(n10);
        Intrinsics.checkNotNull(dataCallback);
        n8 = dataCallback.getStatus();
        String string3 = "format(...)";
        if (n8 == 0) {
            int n14;
            UserProfileData userProfileData;
            object3 = (UserProfileData)dataCallback.getData();
            if (object3 != null) {
                ((UserProfileData)object3).getEmailVerified();
            }
            if ((object3 = (UserProfileData)dataCallback.getData()) != null && (n8 = (int)(((UserProfileData)object3).getDisplayEmail() ? 1 : 0)) == n3) {
                n8 = 1;
            } else {
                n8 = 0;
                object3 = null;
            }
            ((bz1_2)object2).O = n8;
            ((bz1_2)object2).N = userProfileData = (UserProfileData)dataCallback.getData();
            if (userProfileData != null) {
                Intrinsics.checkNotNull(userProfileData);
                ((bz1_2)object2).gb(userProfileData);
            }
            UserProfileData userProfileData2 = ((bz1_2)object2).N;
            object3 = "cancelRequestConstraint";
            if (userProfileData2 != null && (n14 = userProfileData2.updateRequestPending) == 0) {
                ConstraintLayout constraintLayout = ((bz1_2)object2).l;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    objectArray = constraintLayout;
                }
                ai0_2.i((View)objectArray);
            } else {
                Object object5;
                void var1_12;
                void var1_9;
                ConstraintLayout constraintLayout = ((bz1_2)object2).l;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n14 = 0;
                    Object var1_8 = null;
                }
                ai0_2.B((View)var1_9);
                ConstraintLayout constraintLayout2 = ((bz1_2)object2).l;
                if (constraintLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n14 = 0;
                    Object var1_11 = null;
                }
                int n15 = R$id.ril_employee_info_msg;
                TextView textView = (TextView)var1_12.findViewById(n15);
                Object object6 = ((bz1_2)object2).N;
                if (object6 != null) {
                    object6 = ((UserProfileData)object6).updateNumberRequestWindow;
                } else {
                    n15 = 0;
                    object6 = null;
                }
                if ((object6 == null || (n15 = ((String)object6).length()) == 0) && (object6 = ((bz1_2)object2).N) != null) {
                    object5 = "24 hours";
                    ((UserProfileData)object6).updateNumberRequestWindow = object5;
                }
                object6 = StringCompanionObject.INSTANCE;
                object6 = h40_0.a;
                object6 = h40_0.R().getMyaccount_request_phone_update_message();
                object5 = ((bz1_2)object2).N;
                object5 = object5 != null ? ((UserProfileData)object5).updateNumberRequestWindow : null;
                Object[] objectArray2 = new Object[n3];
                objectArray2[0] = object5;
                zn0_1.b(objectArray2, n3, (String)object6, string3, textView);
                ConstraintLayout constraintLayout3 = ((bz1_2)object2).l;
                if (constraintLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    objectArray = constraintLayout3;
                }
                n14 = R$id.ril_employee_verify_email;
                TextView textView2 = (TextView)objectArray.findViewById(n14);
                n8 = R$string.cancel_request_text;
                object3 = ((Fragment)object2).getString(n8);
                textView2.setText((CharSequence)object3);
                object3 = new uZ1((Fragment)object2, 0);
                textView2.setOnClickListener((View.OnClickListener)object3);
            }
            ((bz1_2)object2).Wa();
            return Unit.a;
        }
        n8 = dataCallback.getStatus();
        if (n8 != n3) return Unit.a;
        ((bz1_2)object2).Wa();
        object3 = dataCallback.getError();
        if (object3 == null) return Unit.a;
        if ((object3 = ((DataError)object3).getErrors()) == null) return Unit.a;
        int n16 = object3.size();
        if (n16 <= 0) return Unit.a;
        Object[] objectArray3 = ((DataError$ErrorMessage)object3.get(0)).getType();
        n16 = (int)(kotlin.text.b.i((String)objectArray3, string2 = "UnknownIdentifierError", n3 != 0) ? 1 : 0);
        if (n16 == 0 && (n8 = kotlin.text.b.i((String)(object3 = ((DataError$ErrorMessage)object3.get(0)).getType()), (String)(objectArray3 = "InvalidTokenError"), n3 != 0)) == 0) {
            object3 = dataCallback.getError();
            Intrinsics.checkNotNull(object3);
            n8 = (int)(((DataError)object3).isException ? 1 : 0);
            objectArray = "token";
            if (n8 == 0) {
                object3 = dataCallback.getError();
                Intrinsics.checkNotNull(object3);
                object3 = ((DataError$ErrorMessage)((DataError)object3).getErrors().get(0)).getMessage();
                n8 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n8 == 0) {
                    object3 = dataCallback.getError();
                    Intrinsics.checkNotNull(object3);
                    object3 = ((DataError$ErrorMessage)((DataError)object3).getErrors().get(0)).getMessage();
                    if (object3 != null) {
                        object3 = dataCallback.getError();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((DataError$ErrorMessage)((DataError)object3).getErrors().get(0)).getMessage();
                        n8 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                        if (n8 == 0) {
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = hv3_0.K(R$string.acc_error_message);
                            DataError dataError = dataCallback.getError();
                            Intrinsics.checkNotNull(dataError);
                            String string4 = ((DataError$ErrorMessage)dataError.getErrors().get(0)).getMessage();
                            objectArray3 = new Object[n3];
                            objectArray3[0] = string4;
                            String string5 = xh2_0.a(objectArray3, n3, (String)object3, string3);
                            n8 = (int)(StringsKt.F(string5, (CharSequence)objectArray, false) ? 1 : 0);
                            if (n8 != 0) return Unit.a;
                            object2 = ((bz1_2)object2).p;
                            Intrinsics.checkNotNull(object2);
                            n8 = R$string.something_wrong_msg;
                            object3 = hv3_0.K(n8);
                            object2.t0((String)object3, string5);
                            return Unit.a;
                        }
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    int n17 = R$string.acc_error_message;
                    String string6 = hv3_0.K(n17);
                    object3 = hv3_0.K(R$string.something_wrong_msg);
                    objectArray = new Object[n3];
                    objectArray[0] = object3;
                    String string7 = xh2_0.a(objectArray, n3, string6, string3);
                    object2 = ((bz1_2)object2).p;
                    Intrinsics.checkNotNull(object2);
                    n8 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n8);
                    object2.t0((String)object3, string7);
                    return Unit.a;
                }
            }
            object3 = StringCompanionObject.INSTANCE;
            object3 = hv3_0.K(R$string.acc_error_message);
            DataError dataError = dataCallback.getError();
            Intrinsics.checkNotNull(dataError);
            String string8 = ((DataError$ErrorMessage)dataError.getErrors().get(0)).getMessage();
            objectArray3 = new Object[n3];
            objectArray3[0] = string8;
            String string9 = xh2_0.a(objectArray3, n3, (String)object3, string3);
            n8 = (int)(StringsKt.F(string9, (CharSequence)objectArray, false) ? 1 : 0);
            if (n8 != 0) return Unit.a;
            object2 = ((bz1_2)object2).p;
            Intrinsics.checkNotNull(object2);
            n8 = R$string.something_wrong_msg;
            object3 = hv3_0.K(n8);
            object2.t0((String)object3, string9);
            return Unit.a;
        }
        int n18 = R$string.something_wrong_msg;
        String string10 = hv3_0.K(n18);
        object3 = StringCompanionObject.INSTANCE;
        n8 = R$string.acc_error_message;
        object3 = hv3_0.K(n8);
        n16 = R$string.something_wrong_msg;
        objectArray3 = hv3_0.K(n16);
        Object[] objectArray4 = new Object[n3];
        objectArray4[0] = objectArray3;
        object3 = xh2_0.a(objectArray4, n3, (String)object3, string3);
        Object object7 = ((bz1_2)object2).p;
        Intrinsics.checkNotNull(object7);
        object7.t0(string10, (String)object3);
        tj2_0.e(AnalyticsManager.Companion, "SIGN OUT USER", string2, "my account screen");
        OnFragmentInteractionListener onFragmentInteractionListener = ((bz1_2)object2).M;
        Intrinsics.checkNotNull(onFragmentInteractionListener);
        object3 = ((bz1_2)object2).T;
        object7 = "BZ1";
        n4 = 11;
        onFragmentInteractionListener.onFragmentInteraction((String)object7, n4, (Bundle)object3);
        ConstraintLayout constraintLayout = ((bz1_2)object2).g;
        if (constraintLayout == null) {
            String string11 = "walletLayout";
            Intrinsics.throwUninitializedPropertyAccessException(string11);
        } else {
            objectArray = constraintLayout;
        }
        n18 = 8;
        objectArray.setVisibility(n18);
        hy3_0 hy3_02 = ((bz1_2)object2).r0;
        Intrinsics.checkNotNull(hy3_02);
        hy3_02.h();
        ((bz1_2)object2).ib();
        hy3_0 hy3_03 = ((bz1_2)object2).r0;
        Intrinsics.checkNotNull(hy3_03);
        hy3_03.f();
        b52_0 b52_02 = ((bz1_2)object2).s0;
        Intrinsics.checkNotNull(b52_02);
        b52_02.b();
        hy3_0 hy3_04 = ((bz1_2)object2).r0;
        Intrinsics.checkNotNull(hy3_04);
        hy3_04.e();
        tj2_2.Companion.getClass();
        tj2_2 tj2_22 = tj2$a_0.a();
        tj2_22.getClass();
        object3 = "";
        Intrinsics.checkNotNullParameter(object3, "pincode");
        tj2_22.a = object3;
        jo_2 jo_24 = ((bz1_2)object2).t0;
        Intrinsics.checkNotNull(jo_24);
        object7 = "LOCATION_DATA";
        jo_24.putPreference((String)object7, (String)object3);
        hy3_0 hy3_05 = ((bz1_2)object2).r0;
        Intrinsics.checkNotNull(hy3_05);
        hy3_05.d();
        jo_2 jo_25 = ((bz1_2)object2).t0;
        Intrinsics.checkNotNull(jo_25);
        jo_25.B();
        jo_2 jo_26 = ((bz1_2)object2).t0;
        Intrinsics.checkNotNull(jo_26);
        LocationData locationData = jo_26.i();
        if (locationData != null && (n18 = locationData.getSource()) == (n4 = 101)) {
            jo_2 jo_27 = ((bz1_2)object2).t0;
            Intrinsics.checkNotNull(jo_27);
            jo_27.removePreference((String)object7);
        }
        hy3_0 hy3_06 = ((bz1_2)object2).r0;
        Intrinsics.checkNotNull(hy3_06);
        hy3_06.q();
        lz1_1 lz1_12 = ((bz1_2)object2).s;
        Intrinsics.checkNotNull(lz1_12);
        lz1_12.G();
        jo_2 jo_28 = ((bz1_2)object2).t0;
        if (jo_28 != null) {
            object7 = "USER_ADDRESS";
            jo_28.putPreference((String)object7, (String)object3);
        }
        if ((jo_23 = ((bz1_2)object2).t0) != null) {
            object7 = "USER_PINCODE";
            jo_23.putPreference((String)object7, (String)object3);
        }
        if ((jo_22 = ((bz1_2)object2).t0) == null) return Unit.a;
        jo_22.z((String)object3);
        return Unit.a;
    }
}

