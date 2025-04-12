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
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.login.activity.LoginBaseActivity;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Status;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Xx1
 */
public final class xx1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "format(...)";
        int n3 = 0;
        Object object3 = null;
        Object[] objectArray = "this$0";
        Object[] objectArray2 = this.b;
        int n4 = 1;
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                objectArray2 = (ex1_0)objectArray2;
                Intrinsics.checkNotNullParameter(objectArray2, (String)objectArray);
                objectArray = cp_1.Companion;
                int n8 = nn_2.b((cp$a)objectArray, (DataCallback)object);
                if (n8 != 0) {
                    objectArray2.Xa();
                    Intrinsics.checkNotNull(object);
                    n8 = ((DataCallback)object).getStatus();
                    if (n8 == 0) {
                        if ((object = (Product)((DataCallback)object).getData()) != null) {
                            objectArray2.Lb();
                            object2 = objectArray2.t;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                                boolean bl2 = false;
                                object2 = null;
                            }
                            object2.getClass();
                            Intrinsics.checkNotNullParameter(object, "product");
                            objectArray = md3_0.c((jD3)object2);
                            objectArray2 = new vx1_1((Product)object, (wx1_1)object2, null);
                            int n10 = 3;
                            Ae3.d((i90_0)objectArray, null, null, (Function2)objectArray2, n10);
                        }
                    } else {
                        int n14;
                        n3 = ((DataCallback)object).getStatus();
                        if (n3 == n4 && (n14 = objectArray2.Ua((DataError)(object = ((DataCallback)object).getError()))) == 0) {
                            object = StringCompanionObject.INSTANCE;
                            n14 = R$string.acc_error_message;
                            object = hv3_0.K(n14);
                            n3 = R$string.something_wrong_msg;
                            object3 = hv3_0.K(n3);
                            objectArray = new Object[n4];
                            objectArray[0] = object3;
                            object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
                            int n15 = R$string.something_wrong_msg;
                            object2 = hv3_0.K(n15);
                            objectArray2.kb((String)object2, (String)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        objectArray2 = (LoginActivityRevamp)objectArray2;
        Intrinsics.checkNotNullParameter(objectArray2, (String)objectArray);
        objectArray2.stopLoader();
        objectArray = cp_1.Companion;
        int n16 = nn_2.b((cp$a)objectArray, (DataCallback)object);
        if (n16 != 0) {
            if (object != null && (n16 = ((DataCallback)object).getStatus()) == 0) {
                int n17;
                if ((object = (Status)((DataCallback)object).getData()) != null && (n17 = ((Status)object).isSuccess()) == n4) {
                    object = objectArray2.E0;
                    object2 = objectArray2.q0;
                    if (object2 == null) {
                        object2 = "loginViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object2;
                    }
                    object2 = ((oa1_1)object3).f();
                    object = LoginBaseActivity.A2((AccountCheckResponse)object, (QueryCustomer)object2);
                    da1_1.Companion.getClass();
                    object = da1$a_0.a((Bundle)object);
                    object2 = "SignInOTPFragment";
                    objectArray2.Z0((Fragment)object, (String)object2);
                }
            } else {
                n16 = ((DataCallback)object).getStatus();
                if (n16 == n4) {
                    if ((object = ((DataCallback)object).getError()) != null) {
                        object3 = ((DataError)object).getErrorMessage();
                    }
                    if (object3 != null) {
                        object3 = StringCompanionObject.INSTANCE;
                        n3 = R$string.acc_error_message;
                        object3 = hv3_0.K(n3);
                        objectArray = ((DataError)object).getErrorMessage().getMessage();
                        objectArray2 = new Object[n4];
                        objectArray2[0] = objectArray;
                        object2 = xh2_0.a(objectArray2, n4, (String)object3, (String)object2);
                        object = ((DataError)object).getErrorMessage().getMessage();
                        object3 = "getMessage(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        hv3_0.o0(0, (String)object, (String)object2);
                    }
                }
            }
        }
        return Unit.a;
    }
}

