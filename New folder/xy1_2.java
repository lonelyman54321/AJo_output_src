/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.Status;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Xy1
 */
public final class xy1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        int n3 = 1;
        int n4 = 0;
        Object object2 = null;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (DataCallback)object;
                object3 = (hy3_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                ((hy3_0)object3).p.k(object);
                return Unit.a;
            }
            case 1: {
                object = (Boolean)object;
                object3 = (oy1_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                boolean bl3 = ((oy1_1)object3).p0;
                if (!bl3) {
                    object = ((oy1_1)object3).Qa();
                    ((ky1_0)object).o(0);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object[] objectArray = fz1_2.Companion;
        object3 = (fz1_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = ((fz1_2)object3).g;
        if (object4 != null) {
            object4.stopLoader();
        }
        if (bl2 = nn_2.b((cp$a)(object4 = cp_1.Companion), (DataCallback)object)) {
            bl2 = false;
            object4 = null;
            if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                object2 = (Status)((DataCallback)object).getData();
                if (object2 != null && (n4 = ((Status)object2).isSuccess()) == n3) {
                    object = Ey1.a;
                    object = ((fz1_2)object3).h;
                    object2 = ((fz1_2)object3).i;
                    if (object2 != null) {
                        object4 = ((oa1_1)object2).f();
                    }
                    object = Ey1.b((AccountCheckResponse)object, (QueryCustomer)object4, n3 != 0);
                    sz1_2.Companion.getClass();
                    object = Sz1$a.a((Bundle)object);
                    a a2 = ((fz1_2)object3).g;
                    if (a2 != null) {
                        object2 = "LoginOtpFragment";
                        a2.Z0((Fragment)object, (String)object2);
                    }
                } else {
                    Object object5 = ((fz1_2)object3).Qa().mobileEtError;
                    if ((object = (Status)((DataCallback)object).getData()) != null) {
                        object4 = ((Status)object).getMessage();
                    }
                    object5.setText((CharSequence)object4);
                    object = ((fz1_2)object3).Qa().mobileEtError;
                    object5 = "mobileEtError";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                    ai0_2.B((View)object);
                }
                ((BottomSheetDialogFragment)object3).dismiss();
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
                        objectArray = new Object[n3];
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
        return Unit.a;
    }
}

