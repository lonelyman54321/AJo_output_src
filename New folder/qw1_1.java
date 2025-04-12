/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.UpdateCartEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from qW1
 */
public final class qw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ qw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        int n4 = 0;
        Object object2 = null;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n7 != 0) {
            ((ex1_0)object3).Xa();
            Intrinsics.checkNotNull(object);
            n7 = ((DataCallback)object).getStatus();
            Object[] objectArray = null;
            String string2 = "format(...)";
            if (n7 == 0) {
                object = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                object = (UpdateCartEntry)object;
                object4 = ((UpdateCartEntry)object).getStatusCode();
                String string3 = "lowStock";
                n7 = (int)(b.i((String)object4, string3, n3 != 0) ? 1 : 0);
                if (n7 == 0 && (n7 = b.i((String)(object4 = ((UpdateCartEntry)object).getStatusCode()), string3 = "outOfStock", n3 != 0)) == 0) {
                    object4 = ((UpdateCartEntry)object).getStatusCode();
                    n7 = b.i((String)object4, (String)(objectArray = "maxOrderQuantityExceeded"), n3 != 0);
                    if (n7 != 0) {
                        ((ex1_0)object3).sb(false);
                        object = ((UpdateCartEntry)object).getEntry().getProduct().getName();
                        object = cP.a("Failed to update quantity of ", (String)object, ".");
                        object4 = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_error_message;
                        object4 = hv3_0.K(n7);
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        String string4 = xh2_0.a(objectArray, n3, (String)object4, string2);
                        ((ex1_0)object3).kb((String)object, string4);
                    } else {
                        ((ex1_0)object3).sb(false);
                        int n8 = R$string.bag_updated_refresh;
                        object = hv3_0.K(n8);
                        object4 = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_alert_message;
                        object4 = hv3_0.K(n7);
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        String string5 = xh2_0.a(objectArray, n3, (String)object4, string2);
                        ((ex1_0)object3).kb((String)object, string5);
                    }
                } else {
                    Object object5 = ((UpdateCartEntry)object).getEntry();
                    object2 = ((ex1_0)object3).t;
                    object4 = "cartViewModel";
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n4 = 0;
                        object2 = null;
                    }
                    n4 = ((wx1_1)object2).g1;
                    ((CartEntry)object5).setQuantityToBeUpdated(n4);
                    ((ex1_0)object3).Lb();
                    object5 = ((ex1_0)object3).t;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n3 = 0;
                        object5 = null;
                    }
                    object5.getClass();
                    Intrinsics.checkNotNullParameter(object, "updateCartEntry");
                    object2 = md3_0.c((jD3)object5);
                    object3 = new sx1_1((wx1_1)object5, (UpdateCartEntry)object, null);
                    int n10 = 3;
                    Ae3.d((i90_0)object2, null, null, (Function2)object3, n10);
                }
            } else {
                n7 = ((DataCallback)object).getStatus();
                if (n7 == n3) {
                    if ((object = ((DataCallback)object).getError()) != null) {
                        objectArray = ((DataError)object).getErrorMessage();
                    }
                    if (objectArray != null) {
                        object4 = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_error_message;
                        object4 = hv3_0.K(n7);
                        objectArray = ((DataError)object).getErrorMessage().getMessage();
                        Object[] objectArray2 = new Object[n3];
                        objectArray2[0] = objectArray;
                        String string6 = xh2_0.a(objectArray2, n3, (String)object4, string2);
                        object = ((DataError)object).getErrorMessage().getMessage();
                        ((ex1_0)object3).kb((String)object, string6);
                    }
                    ((ex1_0)object3).sb(false);
                }
            }
        }
        return Unit.a;
    }
}

