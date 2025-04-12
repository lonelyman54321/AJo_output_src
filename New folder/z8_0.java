/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.GPSResponse;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.LocationResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z8
 */
public final class z8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        Object object3 = "this$0";
        Object object4 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                I8 i8;
                int n7;
                object = (DataCallback)object;
                object4 = (e12_0)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object3 = (ProductsList)((DataCallback)object).getData();
                if (object3 != null && (object3 = ((ProductsList)object3).getProducts()) != null) {
                    n7 = 2;
                    i8 = new I8(object4, n7);
                    R02 r02 = new R02(i8);
                    E02.a((List)object3, r02);
                }
                object3 = (ProductsList)((DataCallback)object).getData();
                n3 = 0;
                i8 = null;
                if (object3 != null && (object3 = ((ProductsList)object3).getProducts()) != null) {
                    n4 = object3.size();
                } else {
                    n4 = 0;
                    object3 = null;
                }
                n7 = 20;
                if (n4 > n7 && (object3 = (ProductsList)((DataCallback)object).getData()) != null) {
                    Object object5 = (ProductsList)((DataCallback)object).getData();
                    if (object5 != null && (object5 = ((ProductsList)object5).getProducts()) != null) {
                        object2 = object5.subList(0, n7);
                    }
                    ((ProductsList)object3).setProducts((List)object2);
                }
                ((e12_0)object4).k1.k(object);
                return Unit.a;
            }
            case 1: {
                object = (Throwable)object;
                object4 = (hq_2)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object2 = ((hq_2)object4).b;
                Intrinsics.checkNotNull(object);
                object = ((hq_2)object4).a.handleApiException((Throwable)object, "BackGround_StoreMetaData");
                ((LiveData)object2).k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object6 = q9_0.Companion;
        object4 = (q9_0)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n8 != 0) {
            n8 = ((DataCallback)object).getStatus();
            object6 = "appPreferences";
            if (n8 == 0 && (object3 = ((DataCallback)object).getData()) != null) {
                int n10;
                object3 = ((q9_0)object4).S0;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n8 = 0;
                    object3 = null;
                }
                Object object7 = (LocationResponse)((DataCallback)object).getData();
                Object object8 = "";
                if (object7 == null || (object7 = ((LocationResponse)object7).getData()) == null || (object7 = ((GPSResponse)object7).getPostalCode()) == null) {
                    object7 = object8;
                }
                ((jo_2)object3).G((String)object7);
                Intrinsics.checkNotNull(object);
                object = (LocationResponse)((DataCallback)object).getData();
                if (object != null) {
                    object = ((LocationResponse)object).getData();
                } else {
                    n10 = 0;
                    object = null;
                }
                if (object != null && (n8 = (int)(((GPSResponse)object).getInvalidpostalcode() ? 1 : 0)) == 0) {
                    int n14;
                    String string2 = ((GPSResponse)object).getCity();
                    String string3 = ((GPSResponse)object).getState();
                    String string4 = ((GPSResponse)object).getZone();
                    String string5 = ((GPSResponse)object).getPostalCode();
                    int n15 = 103;
                    object3 = new LocationData(n15, string2, string3, string4, string5);
                    object7 = ((q9_0)object4).S0;
                    if (object7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        n14 = 0;
                        object7 = null;
                    }
                    if ((object = ((GPSResponse)object).getPincodeGroup()) != null) {
                        object8 = object;
                    }
                    ((jo_2)object7).z((String)object8);
                    ((q9_0)object4).xb((LocationData)object3);
                    object = ((q9_0)object4).S0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        n10 = 0;
                        object = null;
                    }
                    ((jo_2)object).r((LocationData)object3);
                    n10 = (int)(h40_0.Q1() ? 1 : 0);
                    if (n10 != 0) {
                        object = ((q9_0)object4).S0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                            n10 = 0;
                            object = null;
                        }
                        if ((object = ((jo_2)object).l()) == null) {
                            object = new CartDeliveryAddress();
                            object7 = ((LocationData)object3).getPincode();
                            if (object7 != null && (n14 = ((String)object7).length()) != 0) {
                                object3 = ((LocationData)object3).getPincode();
                                ((CartDeliveryAddress)object).setPostalCode((String)object3);
                                object3 = AddressType.Pincode;
                                ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object3));
                            } else {
                                object3 = AddressType.PinCodeEmpty;
                                ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object3));
                            }
                        } else {
                            object3 = ((CartDeliveryAddress)object).getFormattedAddress();
                            if (object3 != null && (n8 = ((String)object3).length()) != 0) {
                                object3 = AddressType.Address;
                                ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object3));
                            }
                        }
                        object3 = ((q9_0)object4).S0;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        } else {
                            object2 = object3;
                        }
                        ((jo_2)object2).F((CartDeliveryAddress)object);
                        ((q9_0)object4).Lb((CartDeliveryAddress)object);
                    }
                } else {
                    object = ((q9_0)object4).S0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        n10 = 0;
                        object = null;
                    }
                    if ((object = ((jo_2)object).m()) == null || (n10 = ((String)object).length()) == 0) {
                        object = new CartDeliveryAddress();
                        object3 = AddressType.PinCodeEmpty;
                        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object3));
                        object3 = ((q9_0)object4).S0;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        } else {
                            object2 = object3;
                        }
                        ((jo_2)object2).F((CartDeliveryAddress)object);
                        ((q9_0)object4).Lb((CartDeliveryAddress)object);
                    }
                }
                if ((object = ((q9_0)object4).w0) != null) {
                    ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                }
                if ((object = ((q9_0)object4).v0) != null) {
                    ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                }
                if ((object = ((q9_0)object4).x0) != null) {
                    ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                }
            } else if ((object = ((DataCallback)object).getData()) == null) {
                int n16;
                object = ((q9_0)object4).S0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n16 = 0;
                    object = null;
                }
                if ((object = ((jo_2)object).m()) == null || (n16 = ((String)object).length()) == 0) {
                    object = new CartDeliveryAddress();
                    object3 = AddressType.PinCodeEmpty;
                    ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object3));
                    object3 = ((q9_0)object4).S0;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    } else {
                        object2 = object3;
                    }
                    ((jo_2)object2).F((CartDeliveryAddress)object);
                    ((q9_0)object4).Lb((CartDeliveryAddress)object);
                }
            }
        }
        return Unit.a;
    }
}

