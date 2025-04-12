/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.GPSLocationData;
import com.ril.ajio.services.query.QueryAddress;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from WL
 */
public final class wl_2
implements F62 {
    public final /* synthetic */ lm_2 a;

    public /* synthetic */ wl_2(lm_2 lm_22) {
        this.a = lm_22;
    }

    public final void onChanged(Object object) {
        block39: {
            String string2;
            Object object2;
            Object object3;
            Object object4;
            int n3;
            Object object5;
            int n4;
            block40: {
                Object object6;
                Object object7;
                int n7;
                block41: {
                    n4 = 0;
                    object5 = null;
                    n3 = 1;
                    object = (DataCallback)object;
                    object4 = "Address created";
                    object3 = this.a;
                    Intrinsics.checkNotNullParameter(object3, "this$0");
                    object2 = cp_1.Companion;
                    n7 = nn_2.b(object2, (DataCallback)object);
                    if (n7 == 0) break block39;
                    object2 = ((lm_2)object3).u;
                    if (object2 != null) {
                        ((AjioLoaderView)((Object)object2)).stopLoader();
                    }
                    Intrinsics.checkNotNull(object);
                    n7 = ((DataCallback)object).getStatus();
                    string2 = "format(...)";
                    if (n7 != 0) break block40;
                    object2 = new Bundle();
                    object7 = "pincode";
                    Object object8 = ((lm_2)object3).x;
                    Intrinsics.checkNotNull(object8);
                    object8 = ((h5_0)object8).q;
                    object8 = ((QueryAddress)object8).getPostCode();
                    object2.putString((String)object7, (String)object8);
                    object7 = "city";
                    object8 = ((lm_2)object3).x;
                    Intrinsics.checkNotNull(object8);
                    object8 = ((h5_0)object8).q;
                    object8 = ((QueryAddress)object8).getCity();
                    object2.putString((String)object7, (String)object8);
                    object7 = "state";
                    object8 = ((lm_2)object3).x;
                    Intrinsics.checkNotNull(object8);
                    object8 = ((h5_0)object8).q;
                    object8 = ((QueryAddress)object8).getState();
                    object2.putString((String)object7, (String)object8);
                    object7 = FirebaseEvents.Companion;
                    object7 = object7.getInstance();
                    object8 = "add_address";
                    object7.sendEvent((String)object8, (Bundle)object2);
                    object2 = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n7);
                    object7 = new Object[n3];
                    object7[0] = object4;
                    object6 = Arrays.copyOf(object7, n3);
                    object6 = String.format((String)object2, object6);
                    Intrinsics.checkNotNullExpressionValue(object6, string2);
                    try {
                        ((lm_2)object3).showNotification((String)object4, (String)object6);
                    }
                    catch (NullPointerException nullPointerException) {
                        object4 = yn3_0.a;
                        ((yn3$a)object4).e(nullPointerException);
                    }
                    n3 = (int)(h40_0.Q1() ? 1 : 0);
                    if (n3 != 0) break block41;
                    object6 = ((lm_2)object3).t;
                    if (object6 == null) break block39;
                    Intrinsics.checkNotNull(object6);
                    n3 = (int)(object6.isFinishing() ? 1 : 0);
                    if (n3 != 0) break block39;
                }
                object6 = (CartDeliveryAddress)((DataCallback)object).getData();
                object4 = "";
                if (object6 == null || (object6 = object6.getId()) == null) {
                    object6 = object4;
                }
                n7 = (int)(h40_0.Q1() ? 1 : 0);
                if (n7 != 0) {
                    if ((object = (CartDeliveryAddress)((DataCallback)object).getData()) != null) {
                        object6 = ((CartDeliveryAddress)object).getFormattedAddress();
                        if ((object6 == null || (n3 = object6.length()) == 0) && (object6 = ((lm_2)object3).U) != null) {
                            object2 = ai0_2.g((CartDeliveryAddress)object);
                            object6.setFormattedAddress((String)object2);
                        }
                        ((lm_2)object3).U = object;
                        n3 = (int)(ap_0.b() ? 1 : 0);
                        if (n3 != 0) {
                            object5 = ((lm_2)object3).T;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                                n4 = 0;
                                object5 = null;
                            }
                            object = ((CartDeliveryAddress)object).getId().toString();
                            ((wx1_1)object5).h((String)object4, (String)object);
                        } else {
                            object6 = ((lm_2)object3).y;
                            if (object6 != null) {
                                GPSLocationData gPSLocationData;
                                object7 = (object = ((CartDeliveryAddress)object).getPostalCode()) == null ? object4 : object;
                                n7 = 0;
                                object2 = null;
                                string2 = null;
                                int n8 = 3;
                                object3 = gPSLocationData;
                                gPSLocationData = new GPSLocationData(null, null, (String)object7, n8, null);
                                object6.j(gPSLocationData, false);
                            }
                        }
                    }
                } else {
                    object = ((lm_2)object3).S;
                    if (object != null) {
                        object.M9((String)object6);
                    }
                    ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
                }
                break block39;
            }
            int n10 = ((DataCallback)object).getStatus();
            if (n10 == n3) {
                object = StringCompanionObject.INSTANCE;
                n10 = R$string.acc_error_message;
                object = hv3_0.K(n10);
                int n14 = R$string.address_cannot_be_created;
                object4 = hv3_0.K(n14);
                object2 = new Object[n3];
                object2[0] = object4;
                object = xh2_0.a((Object[])object2, n3, (String)object, string2);
                n4 = R$string.address_cannot_be_created;
                object5 = hv3_0.K(n4);
                ((lm_2)object3).showNotification((String)object5, (String)object);
            }
        }
    }
}

