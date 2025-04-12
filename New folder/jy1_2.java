/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.login.activity.LoginBaseActivity;
import com.ril.ajio.services.data.Status;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from jy1
 */
public final class jy1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        int n3 = 1;
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (dl2_2)object;
                return UserRepo.U((UserRepo)object3, (dl2_2)object);
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object4 = LoginActivityRevampNew.Companion;
        object3 = (LoginActivityRevampNew)object3;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        ((LoginActivityRevampNew)object3).stopLoader();
        object4 = cp_1.Companion;
        n4 = (int)(nn_2.b((cp$a)object4, (DataCallback)object) ? 1 : 0);
        if (n4 != 0) {
            Intrinsics.checkNotNull(object);
            n4 = ((DataCallback)object).getStatus();
            Object[] objectArray = null;
            if (n4 == 0) {
                object = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                object = (Status)object;
                boolean bl2 = ((Status)object).isSuccess();
                if (bl2) {
                    object = ((LoginActivityRevampNew)object3).F0;
                    object2 = ((LoginActivityRevampNew)object3).r0;
                    if (object2 == null) {
                        object2 = "loginViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        objectArray = object2;
                    }
                    object2 = objectArray.f();
                    object = LoginBaseActivity.A2((AccountCheckResponse)object, (QueryCustomer)object2);
                    da1_1.Companion.getClass();
                    object = da1$a_0.a((Bundle)object);
                    object2 = "SignInOTPFragment";
                    ((LoginActivityRevampNew)object3).Z0((Fragment)object, (String)object2);
                }
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == n3) {
                    if ((object = ((DataCallback)object).getError()) != null) {
                        objectArray = ((DataError)object).getErrorMessage();
                    }
                    if (objectArray != null) {
                        object3 = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_error_message;
                        object3 = hv3_0.K(n7);
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

