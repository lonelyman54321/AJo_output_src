/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from wW1
 */
public final class ww1_0
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ ww1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            Object object4;
            int n4;
            ((ex1_0)object2).Xa();
            bl2 = false;
            object3 = null;
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                object4 = ((ex1_0)object2).t;
                String string2 = "cartViewModel";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object4 = null;
                }
                ((wx1_1)object4).V0 = object = (ProductsList)((DataCallback)object).getData();
                object = ((ex1_0)object2).x;
                if (object != null) {
                    object4 = ((ex1_0)object2).t;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object4 = null;
                    }
                    ((om_1)object).a = object4 = ((wx1_1)object4).V0;
                }
            } else {
                int n7;
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3 && (n7 = ((ex1_0)object2).Ua((DataError)(object = ((DataCallback)object).getError()))) == 0) {
                    object = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_error_message;
                    object = hv3_0.K(n7);
                    n4 = R$string.something_wrong_msg;
                    String string3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string3;
                    string3 = "format(...)";
                    object = xh2_0.a(objectArray, n3, (String)object, string3);
                    n3 = R$string.something_wrong_msg;
                    object4 = hv3_0.K(n3);
                    ((ex1_0)object2).kb((String)object4, (String)object);
                }
            }
            if ((object = ((ex1_0)object2).H) != null) {
                object4 = ((ex1_0)object2).x;
                if (object4 != null) {
                    object3 = ((om_1)object4).a;
                }
                object4 = ((Fragment)object2).requireActivity().getApplication();
                object2 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
                ((fz0_1)object).b((ProductsList)object3, (Application)object4);
            }
        }
        return Unit.a;
    }
}

