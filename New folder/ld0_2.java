/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ImageFileInfo;
import com.ril.ajio.services.data.Order.ImageUploadResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from LD0
 */
public final class ld0_2
implements F62 {
    public final /* synthetic */ ExchangeReturnTabActivity a;

    public /* synthetic */ ld0_2(ExchangeReturnTabActivity exchangeReturnTabActivity) {
        this.a = exchangeReturnTabActivity;
    }

    public final void onChanged(Object object) {
        TextView textView = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = ExchangeReturnTabActivity.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                int n7;
                int n8;
                object3 = (ImageUploadResponse)((DataCallback)object).getData();
                Object object4 = null;
                if (object3 != null) {
                    object3 = ((ImageUploadResponse)object3).getImageUrls();
                } else {
                    n4 = 0;
                    object3 = null;
                }
                if (object3 != null && (object3 = ((ExchangeReturnTabActivity)object2).q0) != null && (object3 = ((CartEntry)object3).getImageInfoList()) != null && (object3 = (ImageFileInfo)((ArrayList)object3).get(n8 = ((ExchangeReturnTabActivity)object2).v0)) != null) {
                    if ((object = (ImageUploadResponse)((DataCallback)object).getData()) != null && (object = ((ImageUploadResponse)object).getImageUrls()) != null) {
                        object4 = object = ((ArrayList)object).get(0);
                        object4 = (String)object;
                    }
                    ((ImageFileInfo)object3).setImageName((String)object4);
                }
                ((ExchangeReturnTabActivity)object2).v0 = n7 = ((ExchangeReturnTabActivity)object2).v0 + n3;
                ((ExchangeReturnTabActivity)object2).D2(n7);
            } else {
                int n10 = ((DataCallback)object).getStatus();
                if (n10 == n3) {
                    object = ((ExchangeReturnTabActivity)object2).Z;
                    if (object != null) {
                        ((AjioLoaderView)((Object)object)).stopLoader();
                    }
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object = hv3_0.K(n10);
                    n4 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
                    textView = ((ExchangeReturnTabActivity)object2).r0;
                    n3 = R$string.something_wrong_msg;
                    String string2 = hv3_0.K(n3);
                    hv3_0.j0(string2, (String)object, textView);
                }
            }
        }
    }
}

