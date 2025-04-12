/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Status;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Hz1
 */
public final class hz1_2
implements F62 {
    public final /* synthetic */ lz1_2 a;

    public /* synthetic */ hz1_2(lz1_2 lz1_22) {
        this.a = lz1_22;
    }

    public final void onChanged(Object object) {
        boolean bl2;
        int n3 = 1;
        boolean bl3 = false;
        Object object2 = null;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = ((lz1_2)object3).i;
        if (object4 != null) {
            object4.stopLoader();
        }
        if (bl2 = nn_2.b((cp$a)(object4 = cp_1.Companion), (DataCallback)object)) {
            int n4;
            bl2 = false;
            object4 = null;
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                int n7;
                if ((object = (Status)((DataCallback)object).getData()) != null && (n7 = ((Status)object).isSuccess()) == n3) {
                    object = ((lz1_2)object3).F;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("referralCodeETV");
                        n7 = 0;
                        object = null;
                    }
                    if ((object = ((AppCompatEditText)object).getText()) != null) {
                        object4 = object.toString();
                    }
                    bv1_0.a = object4;
                    object = new Bundle();
                    object.putBoolean("ISFROMSOCIALLOGIN", false);
                    object4 = "ISEXISTINGSOCIALLOGINUSER";
                    object.putBoolean((String)object4, n3 != 0);
                    object.putBoolean("ISMANUALSIGNUP", false);
                    object.putBoolean("ISEXISTINGUSER", false);
                    object2 = ((lz1_2)object3).g;
                    object.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)object2);
                    Object object5 = ((lz1_2)object3).C;
                    Intrinsics.checkNotNull(object5);
                    object5 = ((oa1_1)object5).f();
                    object.putParcelable("QUERYCUSTOMER_DATA", (Parcelable)object5);
                    bl3 = ((lz1_2)object3).h;
                    object.putBoolean("ISINPUTMOBILENUMBER", bl3);
                    da1_1.Companion.getClass();
                    object = da1$a_0.a((Bundle)object);
                    object5 = ((lz1_2)object3).i;
                    Intrinsics.checkNotNull(object5);
                    object2 = "SignInOTPFragment";
                    object5.Z0((Fragment)object, (String)object2);
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    if ((object = ((DataCallback)object).getError()) != null) {
                        object4 = ((DataError)object).getErrorMessage();
                    }
                    if (object4 != null) {
                        object3 = StringCompanionObject.INSTANCE;
                        n8 = R$string.acc_error_message;
                        object3 = hv3_0.K(n8);
                        object4 = ((DataError)object).getErrorMessage().getMessage();
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object4;
                        object4 = "format(...)";
                        String string2 = xh2_0.a(objectArray, n3, (String)object3, (String)object4);
                        object = ((DataError)object).getErrorMessage().getMessage();
                        object3 = "getMessage(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        hv3_0.o0(0, (String)object, string2);
                    }
                }
            }
        }
    }
}

