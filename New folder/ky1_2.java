/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from ky1
 */
public final class ky1_2
implements Function1 {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ ky1_2(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object3 = LoginActivityRevampNew.Companion;
        object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (bl2) {
            int n4;
            bl2 = false;
            object4 = null;
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                int n7;
                ((LoginActivityRevampNew)object3).F0 = object = (AccountCheckResponse)((DataCallback)object).getData();
                object = ((LoginActivityRevampNew)object3).C0;
                if (object != null && (object = ((DialogFragment)object).getDialog()) != null && (n7 = object.isShowing()) == n3 && (object = ((LoginActivityRevampNew)object3).C0) != null) {
                    ((BottomSheetDialogFragment)object).dismiss();
                }
                object = ((LoginActivityRevampNew)object3).F0;
                object2 = "loginViewModel";
                if (object != null && (n7 = ((AccountCheckResponse)object).isSuccess()) == n3) {
                    object = ((LoginActivityRevampNew)object3).r0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n7 = 0;
                        object = null;
                    }
                    Object object5 = ((LoginActivityRevampNew)object3).F0;
                    Object object6 = ((BaseSplitActivity)object3).getAppPreferences();
                    Object object7 = "";
                    object6 = ((sw_0)object6).getPreference("FACEBOOK_PROFILE_ACCESS_TOKEN", (String)object7);
                    Object object8 = ((BaseSplitActivity)object3).getAppPreferences().g();
                    Object object9 = ((BaseSplitActivity)object3).getAppPreferences();
                    String string2 = "GOOGLE_PROFILE_ACCESS_TOKEN";
                    object7 = ((sw_0)object9).getPreference(string2, (String)object7);
                    object = ((oa1_1)object).d((AccountCheckResponse)object5, (String)object6, (String)object8, (String)object7);
                    object8 = object5 = ((xs3_0)object).a;
                    object8 = (String)object5;
                    object7 = object5 = ((xs3_0)object).b;
                    object7 = (String)object5;
                    object9 = object = ((xs3_0)object).c;
                    object9 = (String)object;
                    Intrinsics.checkNotNullParameter(object7, "loginvia");
                    object = ((LoginActivityRevampNew)object3).r0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n4 = 0;
                        object6 = null;
                    } else {
                        object6 = object;
                    }
                    string2 = ((BaseSplitActivity)object3).getAppPreferences().h();
                    String string3 = ((BaseSplitActivity)object3).getAppPreferences().a();
                    object = ((oa1_1)object6).g((String)object8, (String)object7, (String)object9, string2, string3);
                    if (object != null) {
                        object5 = ((LoginActivityRevampNew)object3).r0;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            object4 = object5;
                        }
                        object2 = "login/signup screen";
                        ((oa1_1)object4).l((QueryCustomer)object, (String)object2);
                    }
                } else {
                    ((LoginActivityRevampNew)object3).stopLoader();
                    object = ((LoginActivityRevampNew)object3).r0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object4 = object;
                    }
                    object = ((LoginActivityRevampNew)object3).z0;
                    object2 = ((BaseSplitActivity)object3).getAppPreferences().g();
                    object4.getClass();
                    object = oa1_1.c((String)object, (String)object2);
                    object2 = ga1_0.Companion;
                    String string4 = (String)((Pair)object).a;
                    n7 = (int)(((Boolean)((Pair)object).b).booleanValue() ? 1 : 0);
                    object2.getClass();
                    object2 = "param1";
                    Intrinsics.checkNotNullParameter(string4, (String)object2);
                    object4 = new ga1_0();
                    Bundle bundle = new Bundle();
                    bundle.putString((String)object2, string4);
                    object2 = "param2";
                    bundle.putBoolean((String)object2, n7 != 0);
                    ((Fragment)object4).setArguments(bundle);
                    object = "SocialLoginMobileNumberFragment";
                    ((LoginActivityRevampNew)object3).Z0((Fragment)object4, (String)object);
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3) {
                    int n8;
                    ((LoginActivityRevampNew)object3).stopLoader();
                    object = ((DataCallback)object).getError();
                    if (object != null && (object3 = ((DataError)object).getErrorMessage()) != null) {
                        object3 = ((DataError$ErrorMessage)object3).getMessage();
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    n8 = TextUtils.isEmpty((CharSequence)object3);
                    String string5 = "format(...)";
                    if (n8 == 0) {
                        Object object10;
                        object3 = StringCompanionObject.INSTANCE;
                        n8 = R$string.acc_error_message;
                        object3 = hv3_0.K(n8);
                        object10 = object != null && (object10 = ((DataError)object).getErrorMessage()) != null ? ((DataError$ErrorMessage)object10).getMessage() : null;
                        Intrinsics.checkNotNull(object10);
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object10;
                        String string6 = xh2_0.a(objectArray, n3, (String)object3, string5);
                        if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
                            object4 = ((DataError$ErrorMessage)object).getMessage();
                        }
                        Intrinsics.checkNotNull(object4);
                        hv3_0.o0(0, (String)object4, string6);
                    } else {
                        if (object != null) {
                            object4 = ((DataError)object).getErrors();
                        }
                        if (object4 != null && (n8 = (object3 = ((DataError)object).getErrors()).size()) > 0) {
                            object3 = StringCompanionObject.INSTANCE;
                            n8 = R$string.acc_error_message;
                            object3 = hv3_0.K(n8);
                            object4 = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = object4;
                            String string7 = xh2_0.a(objectArray, n3, (String)object3, string5);
                            object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            object3 = "getMessage(...)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            hv3_0.o0(0, (String)object, string7);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

