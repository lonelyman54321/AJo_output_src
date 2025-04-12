/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.UserProfileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from yY0
 */
public final class yy0_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yy0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "format(...)";
        int n3 = 0;
        Object object3 = null;
        Object[] objectArray = "this$0";
        Object object4 = this.b;
        GAEcommerceEvents gAEcommerceEvents = null;
        int n4 = 1;
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                object4 = (ex1_0)object4;
                Intrinsics.checkNotNullParameter(object4, (String)objectArray);
                objectArray = cp_1.Companion;
                int n8 = nn_2.b((cp$a)objectArray, (DataCallback)object);
                if (n8 != 0) {
                    Intrinsics.checkNotNull(object);
                    n8 = ((DataCallback)object).getStatus();
                    if (n8 == 0) {
                        boolean bl2;
                        object = ((ex1_0)object4).W0;
                        if (object != null) {
                            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                        }
                        if ((object = ((ex1_0)object4).X0) != null) {
                            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                        }
                        if ((object = ((ex1_0)object4).Y0) != null) {
                            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                        }
                        if (bl2 = h40_0.Q1()) {
                            bl2 = ((ex1_0)object4).e1;
                            object2 = ((ew_2)object4).a;
                            if (bl2) {
                                object = ((ex1_0)object4).d1;
                                ((jo_2)object2).F((CartDeliveryAddress)object);
                                object = ((ex1_0)object4).c1;
                                ((jo_2)object2).G((String)object);
                                ((ex1_0)object4).e1 = false;
                            } else {
                                object = new CartDeliveryAddress();
                                object3 = AddressType.Pincode;
                                ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object3));
                                object3 = ((ex1_0)object4).c1;
                                ((CartDeliveryAddress)object).setPostalCode((String)object3);
                                ((jo_2)object2).F((CartDeliveryAddress)object);
                                object = ((ex1_0)object4).c1;
                                ((jo_2)object2).G((String)object);
                            }
                        }
                        ((ex1_0)object4).tb();
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n4) {
                            object = ((ex1_0)object4).W0;
                            if (object != null) {
                                object = ((fo_1)object).e;
                                if (object != null) {
                                    object3 = object;
                                } else {
                                    object = "mProgressview";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                                }
                                ai0_2.i((View)object3);
                            }
                            object = StringCompanionObject.INSTANCE;
                            n10 = R$string.acc_error_message;
                            object = hv3_0.K(n10);
                            n3 = R$string.addresses_not_able_to_updated;
                            object3 = hv3_0.K(n3);
                            objectArray = new Object[n4];
                            objectArray[0] = object3;
                            object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
                            int n14 = R$string.pincode_is_not_valid;
                            object2 = hv3_0.K(n14);
                            ((ex1_0)object4).kb((String)object2, (String)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object5 = GameZoneWebViewActivity.Companion;
        object4 = (GameZoneWebViewActivity)object4;
        Intrinsics.checkNotNullParameter(object4, (String)objectArray);
        objectArray = cp_1.Companion;
        int n15 = nn_2.b((cp$a)objectArray, (DataCallback)object);
        if (n15 != 0) {
            Intrinsics.checkNotNull(object);
            n15 = ((DataCallback)object).getStatus();
            if (n15 == 0) {
                if ((object = (UserProfileData)((DataCallback)object).getData()) != null) {
                    object = ((GameZoneWebViewActivity)object4).y0;
                    if (object != null) {
                        object2 = ((GameZoneWebViewActivity)object4).H0;
                        object.setText((CharSequence)object2);
                    }
                    ((GameZoneWebViewActivity)object4).F0 = n4;
                    object = mz3_0.Q(((GameZoneWebViewActivity)object4).z2());
                    object2 = ((GameZoneWebViewActivity)object4).G0;
                    objectArray = "&sub=";
                    ((GameZoneWebViewActivity)object4).G0 = object = n1.a((String)object2, (String)objectArray, (String)object);
                    gAEcommerceEvents = GAEcommerceEvents.INSTANCE;
                    String string2 = ((GameZoneWebViewActivity)object4).H0;
                    String string3 = ((GameZoneWebViewActivity)object4).A2();
                    object5 = "game rules screen clicks";
                    String string4 = "start playing";
                    String string5 = "gamezone";
                    String string6 = "game rules screen";
                    gAEcommerceEvents.pushGameZonePlayEvent(string5, (String)object5, string4, string2, string6, string3);
                    object = AnalyticsManager.Companion;
                    object2 = "game screen";
                    km_1.a((AnalyticsManager$Companion)object, (String)object2);
                    object = ((GameZoneWebViewActivity)object4).k0;
                    if (object == null) {
                        object = "gameZoneJavaInterface";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    ((my0_1)object3).c = object = ((GameZoneWebViewActivity)object4).H0;
                    object = ((GameZoneWebViewActivity)object4).G0;
                    ((GameZoneWebViewActivity)object4).D2((String)object);
                }
            } else {
                int n16 = ((DataCallback)object).getStatus();
                if (n16 == n4) {
                    ((GameZoneWebViewActivity)object4).stopLoader();
                    object = StringCompanionObject.INSTANCE;
                    n16 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n16);
                    n3 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n3);
                    objectArray = new Object[n4];
                    objectArray[0] = object3;
                    object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
                    int n17 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n17);
                    ((GameZoneWebViewActivity)object4).showNotification((String)object2, (String)object);
                }
            }
        } else {
            ((GameZoneWebViewActivity)object4).stopLoader();
        }
        return Unit.a;
    }
}

