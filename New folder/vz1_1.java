/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.View
 */
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vz1
 */
public final class vz1_1
implements Function1 {
    public final /* synthetic */ az1_2 a;

    public /* synthetic */ vz1_1(az1_2 az1_22) {
        this.a = az1_22;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((az1_2)object2).j;
        if (object3 != null) {
            object3.stopLoader();
        }
        if ((n3 = nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object)) != 0 && object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
            ((az1_2)object2).h = object = (AccountCheckResponse)((DataCallback)object).getData();
            if (object != null) {
                Intrinsics.checkNotNull(object);
                boolean bl2 = ((AccountCheckResponse)object).isSuccess();
                n3 = 0;
                object3 = null;
                if (!bl2) {
                    object = ((az1_2)object2).x;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("referralCodeETV");
                        bl2 = false;
                        object = null;
                    }
                    if ((object = ((AppCompatEditText)object).getText()) != null) {
                        object3 = object.toString();
                    }
                    bv1_0.a = object3;
                    object = ((az1_2)object2).Sa();
                    object3 = new Bundle();
                    object3.putBoolean("ISFROMSOCIALLOGIN", false);
                    boolean bl3 = true;
                    object3.putBoolean("ISMANUALSIGNUP", bl3);
                    object3.putBoolean("ISEXISTINGUSER", false);
                    AccountCheckResponse accountCheckResponse = ((az1_2)object2).h;
                    object3.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)accountCheckResponse);
                    String string2 = "QUERYCUSTOMER_DATA";
                    object3.putParcelable(string2, (Parcelable)object);
                    boolean bl4 = ((az1_2)object2).i;
                    object3.putBoolean("ISINPUTMOBILENUMBER", bl4);
                    da1_1.Companion.getClass();
                    object = da1$a_0.a((Bundle)object3);
                    object2 = ((az1_2)object2).j;
                    if (object2 != null) {
                        object3 = "SignInOTPFragment";
                        object2.Z0((Fragment)object, (String)object3);
                    }
                } else {
                    object = h40_0.a;
                    object = h40_0.R().getAccount_check_api_error_msg_for_signup();
                    uy1_0.d((String)object);
                    Object object4 = h40_0.R();
                    boolean bl5 = object4.getEnable_restore_phone_number();
                    String string3 = "idLoginRemoval";
                    if (!bl5) {
                        object4 = ((az1_2)object2).Q;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            bl5 = false;
                            object4 = null;
                        }
                        ai0_2.i((View)object4);
                        object4 = ((az1_2)object2).F;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loginNewUserMailTil");
                            bl5 = false;
                            object4 = null;
                        }
                        ((TextInputLayout)((Object)object4)).setError((CharSequence)object);
                    } else {
                        object = ((az1_2)object2).Q;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            bl2 = false;
                            object = null;
                        }
                        ai0_2.B((View)object);
                    }
                    object = ((az1_2)object2).S;
                    if (object == null) {
                        object = "rilEmployeeEmailInfoText";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    ai0_2.i((View)object3);
                }
            }
        }
        return Unit.a;
    }
}

