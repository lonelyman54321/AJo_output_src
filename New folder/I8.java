/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.user.GPSLocationData;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class I8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ I8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = null;
        int n4 = 1;
        Object object4 = "this$0";
        Object object5 = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (DataCallback)object;
                object5 = (wd2_0)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object2 = ((wd2_0)object5).a;
                if (object2 != null && (object2 = ((gE2)object2).a) != null) {
                    object3 = ((wd2_0)object5).q;
                    ((LiveData)object2).i(object3);
                }
                if ((n3 = nn_2.b((cp$a)(object2 = cp_1.Companion), (DataCallback)object)) == 0) return Unit.a;
                if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
                    ((wd2_0)object5).db();
                    ((wd2_0)object5).Va();
                    return Unit.a;
                }
                int n8 = ((DataCallback)object).getStatus();
                if (n8 != n4) return Unit.a;
                object = ((wd2_0)object5).a;
                if (object != null && (object = ((gE2)object).b) != null) {
                    object2 = Boolean.FALSE;
                    ((LiveData)object).i(object2);
                }
                ((BottomSheetDialogFragment)object5).dismiss();
                return Unit.a;
            }
            case 2: {
                object = (Product)object;
                object5 = (e12_0)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object2 = "productItem";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((Product)object).getFnlColorVariantData();
                if (object != null) {
                    object = ((ProductFnlColorVariantData)object).getColorGroup();
                } else {
                    boolean bl2 = false;
                    object = null;
                }
                object2 = ((e12_0)object5).q;
                if (object2 == null) return Intrinsics.areEqual(object, object3);
                object3 = ((Product)object2).getCode();
                return Intrinsics.areEqual(object, object3);
            }
            case 1: {
                object = (Throwable)object;
                object5 = (hq_2)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object2 = ((hq_2)object5).f;
                Intrinsics.checkNotNull(object);
                object = ((hq_2)object5).a.handleApiException((Throwable)object, "BackGround_AllCMSCategories");
                ((LiveData)object2).k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object6 = q9_0.Companion;
        object5 = (q9_0)object5;
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object4 = cp_1.Companion;
        boolean bl3 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (!bl3) return Unit.a;
        object4 = "appPreferences";
        if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
            IllegalStateException illegalStateException2;
            block28: {
                int n10;
                Object object7;
                block29: {
                    block27: {
                        try {
                            object = ((DataCallback)object).getData();
                            object = (CartDeliveryAddressInfo)object;
                            if (object == null || (object6 = ((CartDeliveryAddressInfo)object).getAddresses()) == null) break block27;
                            ((ArrayList)object6).size();
                        }
                        catch (IllegalStateException illegalStateException2) {
                            break block28;
                        }
                    }
                    if (object == null) return Unit.a;
                    object6 = ((CartDeliveryAddressInfo)object).getAddresses();
                    if (object6 == null) return Unit.a;
                    object = ((CartDeliveryAddressInfo)object).getAddresses();
                    object6 = "getAddresses(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object6);
                    object = object.iterator();
                    while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        object7 = object6 = object.next();
                        object7 = (CartDeliveryAddress)object6;
                        if ((object7 = ((CartDeliveryAddress)object7).getId()) != null && (n10 = ((String)object7).length()) != 0) {
                            n10 = 0;
                            object7 = null;
                        } else {
                            n10 = 1;
                        }
                        if ((n10 ^= n4) == 0) continue;
                        break block29;
                    }
                    n7 = 0;
                    object6 = null;
                }
                object6 = (CartDeliveryAddress)object6;
                int n14 = ap_0.b();
                if (n14 != 0) {
                    object = ((q9_0)object5).E2;
                    if (object == null) {
                        object = "cartViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        n14 = 0;
                        object = null;
                    }
                    String string2 = "";
                    if (object6 != null) {
                        object7 = ((CartDeliveryAddress)object6).getId();
                    } else {
                        n10 = 0;
                        object7 = null;
                    }
                    object7 = String.valueOf(object7);
                    ((wx1_1)object).h(string2, (String)object7);
                }
                if (object6 == null) {
                    ((q9_0)object5).Xa();
                    return Unit.a;
                }
                object = ((CartDeliveryAddress)object6).getFormattedAddress();
                if (object == null || (n14 = ((String)object).length()) == 0) {
                    object = ai0_2.g((CartDeliveryAddress)object6);
                    ((CartDeliveryAddress)object6).setFormattedAddress((String)object);
                }
                object = AddressType.Address;
                ((CartDeliveryAddress)object6).setAddressType((AddressType)((Object)object));
                object = ((q9_0)object5).S0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                ((jo_2)object3).F((CartDeliveryAddress)object6);
                ((q9_0)object5).Lb((CartDeliveryAddress)object6);
                object = ((q9_0)object5).gb();
                String string3 = ((CartDeliveryAddress)object6).getPostalCode();
                int n15 = 3;
                object7 = object3;
                object3 = new GPSLocationData(null, null, string3, n15, null);
                ((hy3_0)object).j((GPSLocationData)object3, false);
                return Unit.a;
            }
            object2 = yn3_0.a;
            ((yn3$a)object2).e(illegalStateException2);
            return Unit.a;
        }
        int n16 = ((DataCallback)object).getStatus();
        if (n16 != n4) return Unit.a;
        object = StringCompanionObject.INSTANCE;
        n16 = R$string.acc_error_message;
        object = hv3_0.K(n16);
        n7 = R$string.addresses_not_able_to_fetch;
        object6 = hv3_0.K(n7);
        Object[] objectArray = new Object[n4];
        objectArray[0] = object6;
        object2 = Arrays.copyOf(objectArray, n4);
        Intrinsics.checkNotNullExpressionValue(String.format(object, (Object[])object2), "format(...)");
        object = new CartDeliveryAddress();
        object2 = AddressType.PinCodeEmpty;
        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
        object2 = ((q9_0)object5).S0;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object2;
        }
        ((jo_2)object3).F((CartDeliveryAddress)object);
        ((q9_0)object5).Lb((CartDeliveryAddress)object);
        return Unit.a;
    }
}

