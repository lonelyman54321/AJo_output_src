/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import com.google.gson.JsonObject;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cQ0
 */
public final class cq0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ cq0_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        Fragment fragment;
        Object object2;
        String string2;
        block16: {
            int n3;
            Object object3;
            int n4;
            int n7;
            block15: {
                n7 = 1;
                string2 = null;
                object2 = "this$0";
                fragment = this.b;
                n4 = this.a;
                object = (DataCallback)object;
                switch (n4) {
                    default: {
                        int n8;
                        fragment = (zt3_0)fragment;
                        Intrinsics.checkNotNullParameter(fragment, (String)object2);
                        object2 = ((zt3_0)fragment).e;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressView");
                            n8 = 0;
                            object2 = null;
                        }
                        ((PEProgressView)((Object)object2)).dismiss();
                        n8 = ((DataCallback)object).getStatus();
                        if (n8 == 0) {
                            object = JsonUtils.toJson((JsonObject)((DataCallback)object).getData());
                            ((zt3_0)fragment).Pa((String)object);
                            return Unit.a;
                        }
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 != n7) return Unit.a;
                        ((zt3_0)fragment).Pa(null);
                        return Unit.a;
                    }
                    case 0: 
                }
                object3 = fq0_2.Companion;
                fragment = (fq0_2)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object2);
                object2 = cp_1.Companion;
                n3 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n3 == 0) return Unit.a;
                if (object == null) return Unit.a;
                n3 = ((DataCallback)object).getStatus();
                if (n3 != 0) return Unit.a;
                try {
                    object = ((DataCallback)object).getData();
                    object = (CartDeliveryAddressInfo)object;
                    if (object != null && (object2 = ((CartDeliveryAddressInfo)object).getAddresses()) != null) {
                        ((ArrayList)object2).size();
                    }
                    if (object == null) return Unit.a;
                    object2 = ((CartDeliveryAddressInfo)object).getAddresses();
                    if (object2 == null) return Unit.a;
                    object = ((CartDeliveryAddressInfo)object).getAddresses();
                    object2 = "getAddresses(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object = object.iterator();
                    break block15;
                }
                catch (IllegalStateException illegalStateException) {}
                yn3$a yn3$a = yn3_0.a;
                yn3$a.e(illegalStateException);
                return Unit.a;
            }
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object3 = object2 = object.next();
                object3 = (CartDeliveryAddress)object2;
                if ((object3 = ((CartDeliveryAddress)object3).getId()) != null && (n4 = ((String)object3).length()) != 0) {
                    n4 = 0;
                    object3 = null;
                } else {
                    n4 = 1;
                }
                if ((n4 ^= n7) == 0) continue;
                break block16;
            }
            n3 = 0;
            object2 = null;
        }
        object2 = (CartDeliveryAddress)object2;
        int n14 = ap_0.b();
        if (n14 != 0) {
            object = ((fq0_2)fragment).F;
            object = ((D)object).getValue();
            object = (wx1_1)object;
            String string3 = "";
            if (object2 != null) {
                string2 = ((CartDeliveryAddress)object2).getId();
            }
            string2 = String.valueOf(string2);
            ((wx1_1)object).h(string3, string2);
        }
        if (object2 == null) return Unit.a;
        object = ((CartDeliveryAddress)object2).getFormattedAddress();
        if (object == null || (n14 = ((String)object).length()) == 0) {
            object = ai0_2.g((CartDeliveryAddress)object2);
            ((CartDeliveryAddress)object2).setFormattedAddress((String)object);
        }
        object = AddressType.Address;
        ((CartDeliveryAddress)object2).setAddressType((AddressType)((Object)object));
        object = ((ew_2)fragment).a;
        ((jo_2)object).F((CartDeliveryAddress)object2);
        ((fq0_2)fragment).fb((CartDeliveryAddress)object2);
        return Unit.a;
    }
}

