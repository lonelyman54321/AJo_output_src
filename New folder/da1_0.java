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
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Status;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DA1
 */
public final class da1_0
implements F62 {
    public final /* synthetic */ ga1_0 a;

    public /* synthetic */ da1_0(ga1_0 ga1_02) {
        this.a = ga1_02;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            int n3;
            object3 = ((ga1_0)object2).i;
            if (object3 != null) {
                object3.stopLoader();
            }
            bl2 = false;
            object3 = null;
            int n4 = 1;
            if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
                int n7;
                if ((object = (Status)((DataCallback)object).getData()) != null && (n7 = ((Status)object).isSuccess()) == n4) {
                    object = new Bundle();
                    object.putBoolean("ISFROMSOCIALLOGIN", false);
                    object.putBoolean("ISEXISTINGSOCIALLOGINUSER", n4 != 0);
                    object.putBoolean("ISMANUALSIGNUP", false);
                    object.putBoolean("ISEXISTINGUSER", false);
                    Object object4 = ((ga1_0)object2).n;
                    object.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)object4);
                    object3 = ((ga1_0)object2).t;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((oa1_1)object3).f();
                    object4 = "QUERYCUSTOMER_DATA";
                    object.putParcelable((String)object4, (Parcelable)object3);
                    object.putBoolean("ISINPUTMOBILENUMBER", n4 != 0);
                    String string2 = ((ga1_0)object2).f;
                    object.putString("SIGIN_SOURCE", string2);
                    object3 = da1_1.Companion;
                    object3.getClass();
                    object = da1$a_0.a((Bundle)object);
                    object2 = ((ga1_0)object2).i;
                    if (object2 != null) {
                        object3 = "SignInOTPFragment";
                        object2.Z0((Fragment)object, (String)object3);
                    }
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n4) {
                    Object object5;
                    object = ((DataCallback)object).getError();
                    n8 = 0;
                    object2 = null;
                    if (object != null) {
                        object5 = ((DataError)object).getErrorMessage();
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    if (object5 != null) {
                        object = ((DataError)object).getErrorMessage().getMessage();
                        object5 = "getMessage(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                        hv3_0.o0(0, (String)object, null);
                    }
                }
            }
        }
    }
}

