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
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import com.ril.ajio.services.data.Status;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class My1
implements Function1 {
    public final /* synthetic */ ry1_1 a;

    public /* synthetic */ My1(ry1_1 ry1_12) {
        this.a = ry1_12;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((ry1_1)object2).g;
        if (object3 != null) {
            object3.stopLoader();
        }
        if (bl2 = nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object)) {
            int n3;
            bl2 = false;
            object3 = null;
            Object object4 = null;
            int n4 = 1;
            if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
                Status status = (Status)((DataCallback)object).getData();
                if (status != null && (n3 = (int)(status.isSuccess() ? 1 : 0)) == n4) {
                    object = Ey1.a;
                    object = ((ry1_1)object2).h;
                    oa1_1 oa1_12 = ((ry1_1)object2).i;
                    if (oa1_12 != null) {
                        object3 = oa1_12.f();
                    }
                    object = Ey1.b((AccountCheckResponse)object, (QueryCustomer)object3, false);
                    object3 = sz1_2.Companion;
                    object3.getClass();
                    object = Sz1$a.a((Bundle)object);
                    object2 = ((ry1_1)object2).g;
                    if (object2 != null) {
                        object3 = "LoginOtpFragment";
                        object2.Z0((Fragment)object, (String)object3);
                    }
                } else {
                    object4 = ((ry1_1)object2).r;
                    if (object4 != null && (object4 = ((FragmentLoginLayoutNewBinding)object4).mobileEtError) != null) {
                        if ((object = (Status)((DataCallback)object).getData()) != null) {
                            object3 = ((Status)object).getMessage();
                        }
                        object4.setText((CharSequence)object3);
                    }
                    if ((object = ((ry1_1)object2).r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEtError) != null) {
                        ai0_2.B((View)object);
                    }
                }
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == n4) {
                    if ((object = ((DataCallback)object).getError()) != null) {
                        object2 = ((DataError)object).getErrorMessage();
                    } else {
                        n7 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object = ((DataError)object).getErrorMessage().getMessage();
                        object2 = "getMessage(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        hv3_0.o0(0, (String)object, null);
                    }
                }
            }
        }
        return Unit.a;
    }
}

