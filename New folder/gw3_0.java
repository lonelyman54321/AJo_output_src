/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ajio.ril.core.network.model.DataError;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.AccessProfileOtpResponse;
import com.ril.ajio.services.data.EditProfileData;
import com.ril.ajio.services.data.UserDetails;
import com.ril.ajio.web.CustomWebViewActivity;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from Gw3
 */
public final class gw3_0
implements F62 {
    public final /* synthetic */ hw3_0 a;

    public /* synthetic */ gw3_0(hw3_0 hw3_02) {
        this.a = hw3_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        TextView textView;
        String string2;
        TextView textView2;
        Object object2;
        Object var2_2 = null;
        int n3 = 1;
        Object object3 = object;
        object3 = (DataCallback)object;
        Object object4 = this.a;
        Object[] objectArray = "this$0";
        Intrinsics.checkNotNullParameter(object4, (String)objectArray);
        if (object3 == null) return;
        ((hw3_0)object4).Oa();
        int n4 = ((DataCallback)object3).getStatus();
        if (n4 != 0) {
            int n7 = ((DataCallback)object3).getStatus();
            if (n7 != n3) return;
            if ((object3 = ((DataCallback)object3).getError()) == null) return;
            object4 = ((DataError)object3).getErrorMessage();
            if (object4 == null) return;
            object4 = ((DataError)object3).getErrorMessage().getMessage();
            n7 = TextUtils.isEmpty((CharSequence)object4);
            if (n7 != 0) return;
            object3 = ((DataError)object3).getErrorMessage().getMessage();
            object4 = StringCompanionObject.INSTANCE;
            n7 = R$string.acc_alert_message;
            object4 = hv3_0.K(n7);
            objectArray = new Object[n3];
            objectArray[0] = object3;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            String string3 = String.format((String)object4, objectArray2);
            String string4 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(string3, string4);
            hw3_0.Pa((String)object3, string3);
            return;
        }
        if ((object3 = (AccessProfileOtpResponse)((DataCallback)object3).getData()) != null && (n3 = b.i((String)(objectArray = ((AccessProfileOtpResponse)object3).getMessage()), (String)(object2 = "success"), n3 != 0)) != 0) {
            FragmentActivity fragmentActivity = ((Fragment)object4).getActivity();
            n3 = fragmentActivity instanceof CustomWebViewActivity;
            if (n3 != 0) {
                DeleteAccountInteractionListener deleteAccountInteractionListener = ((hw3_0)object4).z;
                if (deleteAccountInteractionListener != null) {
                    deleteAccountInteractionListener.moveToDeleteReasonScreen();
                }
                ((BottomSheetDialogFragment)object4).dismiss();
                return;
            }
            n3 = ((hw3_0)object4).q;
            objectArray = "BZ1";
            if (n3 != 0) {
                Bundle bundle = new Bundle();
                object3 = ((hw3_0)object4).o;
                if (object3 != null) {
                    object3.onFragmentInteraction((String)objectArray, 0, bundle);
                }
            } else {
                Bundle bundle = new Bundle();
                if ((object3 = ((AccessProfileOtpResponse)object3).getUserDetails()) != null) {
                    String string5;
                    Object object5;
                    object2 = ((UserDetails)object3).getDateOfBirth();
                    if (object2 != null) {
                        object2 = ((UserDetails)object3).getDateOfBirth();
                        Intrinsics.checkNotNullExpressionValue(object2, "getDateOfBirth(...)");
                        object5 = "yyyy-MM-dd";
                        string5 = "dd MMMM yyyy";
                        object2 = k7.a((String)object2, (String)object5, string5);
                    } else {
                        object2 = "";
                    }
                    string5 = object2;
                    String string6 = ((UserDetails)object3).getFirstName();
                    String string7 = ((UserDetails)object3).getLastName();
                    String string8 = ((UserDetails)object3).getScreenName();
                    String string9 = ((UserDetails)object3).getDisplayUid();
                    String string10 = ((UserDetails)object3).getGenderType();
                    String string11 = ((UserDetails)object3).getMobileNumber();
                    boolean bl2 = ((UserDetails)object3).isKioskCustomer();
                    Boolean bl3 = bl2;
                    Boolean bl4 = ((UserDetails)object3).getDisplayEmail();
                    object5 = object2;
                    object2 = new EditProfileData(string5, string6, string7, string8, string9, string10, string11, bl3, bl4);
                    bundle.putParcelable("USER_EDIT_PROFILE_DATA", (Parcelable)object2);
                    object3 = ((Fragment)object4).requireArguments();
                    object2 = "INTENT_UPDATE_MOBILE_NUMBER_WINDOW";
                    boolean bl5 = object3.containsKey((String)object2);
                    if (bl5) {
                        object3 = ((Fragment)object4).requireArguments().getString((String)object2);
                        bundle.putString((String)object2, (String)object3);
                    }
                    if (bl5 = (object3 = ((Fragment)object4).requireArguments()).containsKey((String)(object2 = "INTENT_UPDATE_PENDING_REQUEST"))) {
                        ((Fragment)object4).requireArguments().getBoolean((String)object2);
                        object3 = ((Fragment)object4).requireArguments();
                        bl5 = object3.getBoolean((String)object2);
                        bundle.putBoolean((String)object2, bl5);
                    }
                    if ((object3 = ((hw3_0)object4).o) != null) {
                        object3.onFragmentInteraction((String)objectArray, 0, bundle);
                    }
                }
            }
            ((BottomSheetDialogFragment)object4).dismiss();
            return;
        }
        if (object3 == null) return;
        TextView textView3 = ((hw3_0)object4).b;
        if (textView3 != null) {
            n4 = 8;
            textView3.setVisibility(n4);
        }
        if ((textView2 = ((hw3_0)object4).c) != null) {
            textView2.setVisibility(0);
        }
        if ((string2 = ((AccessProfileOtpResponse)object3).getMessage()) != null) {
            TextView textView4 = ((hw3_0)object4).c;
            if (textView4 != null) {
                String string12 = ((AccessProfileOtpResponse)object3).getMessage();
                textView4.setText((CharSequence)string12);
            }
        } else {
            TextView textView5 = ((hw3_0)object4).c;
            if (textView5 != null) {
                n3 = R$string.otp_invalid;
                textView5.setText(n3);
            }
        }
        if ((textView = ((hw3_0)object4).c) == null) return;
        ai0_2.a((View)textView);
    }
}

