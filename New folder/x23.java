/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductStockLevelStatus;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class x23
implements F62 {
    public final /* synthetic */ B23 a;

    public /* synthetic */ x23(B23 b23) {
        this.a = b23;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        int n3 = 0;
        String string2 = null;
        int n4 = 1;
        object = (DataCallback)object;
        Object object2 = B23.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNull(object);
        object2.getClass();
        cp$a cp$a = cp_1.Companion;
        int n7 = nn_2.b(cp$a, (DataCallback)object);
        if (n7 == 0) return;
        AjioProgressView ajioProgressView = ((B23)object2).Ra().fswmdProgressView;
        if (ajioProgressView != null) {
            AjioProgressView ajioProgressView2 = ((B23)object2).Ra().fswmdProgressView;
            ajioProgressView2.dismiss();
        }
        n7 = ((DataCallback)object).getStatus();
        String string3 = null;
        if (n7 != 0) {
            if (n7 != n4) {
                return;
            }
        } else {
            if ((object = (ProductStockLevelStatus)((DataCallback)object).getData()) == null) {
                int n8 = ((Fragment)object2).isAdded();
                if (n8 == 0) return;
                object = StringCompanionObject.INSTANCE;
                n8 = R$string.acc_error_message;
                object = hv3_0.K(n8);
                object2 = "Could not add item to the cart";
                Object[] objectArray = new Object[n4];
                objectArray[0] = object2;
                string2 = "format(...)";
                ZK1.e(objectArray, n4, (String)object, string2, (String)object2);
                return;
            }
            String string4 = "success";
            String string5 = ((ProductStockLevelStatus)object).getStatusCode();
            n7 = (int)(Intrinsics.areEqual(string4, string5) ? 1 : 0);
            if (n7 != 0) {
                Object object3;
                int n10;
                Context context = ((Fragment)object2).requireActivity().getApplicationContext();
                string5 = "getApplicationContext(...)";
                Intrinsics.checkNotNullExpressionValue(context, string5);
                object = new jo_2(context);
                n7 = ((jo_2)object).d() + n4;
                ((jo_2)object).p(n7);
                object = ((B23)object2).i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mClosetViewModel");
                    n10 = 0;
                    object = null;
                }
                if ((n4 = ((String)(object3 = ((B23)object2).k)).length()) == 0) {
                    object3 = ((B23)object2).o;
                    if (object3 != null) {
                        object3 = ((Product)object3).getCode();
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                } else {
                    object3 = ((B23)object2).k;
                }
                Product product = ((B23)object2).o;
                Intrinsics.checkNotNull(product);
                Price price = product.getPrice();
                if (price != null) {
                    string3 = price.getValue();
                }
                ((ky1_0)object).b((String)object3, string3);
                object = ((Fragment)object2).getActivity();
                if (object == null) return;
                n10 = ((Fragment)object2).isAdded();
                if (n10 == 0) return;
                n10 = ((Fragment)object2).isVisible();
                if (n10 == 0) return;
                n10 = R$string.added_to_cart_successfully;
                object = hv3_0.K(n10);
                ((B23)object2).Ua((String)object, false);
                return;
            }
            n3 = R$string.productDetails_couldNotAddToCart;
            string2 = ((Fragment)object2).getString(n3);
            String string6 = ((ProductStockLevelStatus)object).getStatusCode();
            n7 = (int)(cs.a(string6) ? 1 : 0);
            string3 = ")";
            string5 = " (";
            if (n7 != 0) {
                int n14 = R$string.stock_details_low_stock;
                object = ((Fragment)object2).getString(n14);
            } else {
                object = ((ProductStockLevelStatus)object).getStatusCode();
            }
            object = cP.a(string5, (String)object, string3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            ((B23)object2).Ua((String)object, n4 != 0);
            return;
        }
        DataError dataError = ((DataCallback)object).getError();
        if (dataError == null) return;
        object = ((DataCallback)object).getError();
        Intrinsics.checkNotNull(object);
        object = ((DataError)object).errors;
        if (object == null) return;
        Object object4 = object;
        Collection collection = (Collection)object;
        n7 = collection.size();
        while (n3 < n7) {
            boolean bl2;
            Object object5;
            Object object6 = (DataError$ErrorMessage)object.get(n3);
            if (object6 != null) {
                object5 = ((DataError$ErrorMessage)object6).getSubjectType();
            } else {
                bl2 = false;
                object5 = null;
            }
            String string7 = "cart";
            bl2 = b.i((String)object5, string7, n4 != 0);
            if (bl2 && (bl2 = b.i((String)(object5 = ((DataError$ErrorMessage)object6).getReason()), string7 = "notFound", n4 != 0))) {
                object5 = ((B23)object2).c;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeViewModel");
                    bl2 = false;
                    object5 = null;
                }
                object5 = ((w23_0)object5).o;
                ((B23)object2).Sa((ProductOptionItem)object5);
            }
            if (bl2 = b.i((String)(object5 = ((DataError$ErrorMessage)object6).getType()), string7 = "CommerceCartModificationError", n4 != 0)) {
                object6 = ((DataError$ErrorMessage)object6).getMessage();
                object5 = "getMessage(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                ((B23)object2).Ua((String)object6, n4 != 0);
            }
            n3 += n4;
        }
    }
}

