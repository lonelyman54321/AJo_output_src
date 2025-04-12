/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from uM
 */
public final class um_2
implements F62 {
    public final /* synthetic */ CartAddressListBottomSheet a;

    public /* synthetic */ um_2(CartAddressListBottomSheet cartAddressListBottomSheet) {
        this.a = cartAddressListBottomSheet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChanged(Object object) {
        block24: {
            Object object2;
            int n3;
            Object object3;
            CartAddressListBottomSheet cartAddressListBottomSheet;
            int n4;
            block27: {
                int n7;
                block25: {
                    Object object4;
                    block26: {
                        IllegalStateException illegalStateException2;
                        block23: {
                            block22: {
                                n4 = 1;
                                object = (DataCallback)object;
                                cartAddressListBottomSheet = this.a;
                                Intrinsics.checkNotNullParameter(cartAddressListBottomSheet, "this$0");
                                object3 = cp_1.Companion;
                                boolean bl2 = nn_2.b(object3, (DataCallback)object);
                                if (!bl2) break block24;
                                object3 = cartAddressListBottomSheet.b;
                                if (object3 != null) {
                                    ((AjioProgressView)((Object)object3)).dismiss();
                                }
                                if ((object3 = cartAddressListBottomSheet.g) != null) {
                                    ((AjioLoaderView)((Object)object3)).stopLoader();
                                }
                                object3 = cartAddressListBottomSheet.f;
                                if (object == null || (n7 = ((DataCallback)object).getStatus()) != 0) break block25;
                                try {
                                    object = ((DataCallback)object).getData();
                                    object = (CartDeliveryAddressInfo)object;
                                    if (object == null || (object4 = ((CartDeliveryAddressInfo)object).getAddresses()) == null) break block22;
                                    n7 = ((ArrayList)object4).size();
                                    cartAddressListBottomSheet.Ua(n7);
                                }
                                catch (IllegalStateException illegalStateException2) {
                                    break block23;
                                }
                            }
                            if (object != null && (object4 = ((CartDeliveryAddressInfo)object).getAddresses()) != null) {
                                ((ArrayList)object3).clear();
                                object = ((CartDeliveryAddressInfo)object).getAddresses();
                                ((ArrayList)object3).addAll(object);
                                cartAddressListBottomSheet.Va();
                            }
                            break block26;
                        }
                        object4 = yn3_0.a;
                        ((yn3$a)object4).e(illegalStateException2);
                    }
                    if ((object = cartAddressListBottomSheet.getActivity()) == null) break block27;
                    object = cartAddressListBottomSheet.a;
                    if (object != null) {
                        ((bn_1)object).b = object4 = cartAddressListBottomSheet.e;
                    }
                    if ((n3 = ((ArrayList)object3).size()) == 0) {
                        object = cartAddressListBottomSheet.l;
                        if (object != null) {
                            ai0_2.i((View)object);
                        }
                        if ((object = cartAddressListBottomSheet.m) != null) {
                            ai0_2.B((View)object);
                        }
                        if ((object = cartAddressListBottomSheet.n) != null) {
                            n7 = R$string.add_a_delivery_address;
                            object4 = hv3_0.K(n7);
                            object.setText((CharSequence)object4);
                        }
                        if ((object = cartAddressListBottomSheet.d) != null) {
                            n7 = 8;
                            object.setVisibility(n7);
                        }
                        if ((object = cartAddressListBottomSheet.h) != null) {
                            ai0_2.i((View)object);
                        }
                        break block27;
                    } else {
                        object = cartAddressListBottomSheet.l;
                        if (object != null) {
                            ai0_2.B((View)object);
                        }
                        if ((object = cartAddressListBottomSheet.m) != null) {
                            ai0_2.i((View)object);
                        }
                        if ((object = cartAddressListBottomSheet.n) != null) {
                            n7 = R$string.choose_a_delivery_address;
                            object4 = hv3_0.K(n7);
                            object.setText((CharSequence)object4);
                        }
                        if ((object = cartAddressListBottomSheet.d) != null) {
                            object.setVisibility(0);
                        }
                        if ((object = cartAddressListBottomSheet.h) != null) {
                            ai0_2.B((View)object);
                        }
                        if ((object = cartAddressListBottomSheet.a) != null) {
                            ((RecyclerView$f)object).notifyDataSetChanged();
                        }
                    }
                    break block27;
                }
                n3 = ((DataCallback)object).getStatus();
                if (n3 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n3 = R$string.acc_error_message;
                    object = hv3_0.K(n3);
                    String string2 = hv3_0.K(R$string.addresses_not_able_to_fetch);
                    object2 = new Object[n4];
                    object2[0] = string2;
                    object = xh2_0.a((Object[])object2, n4, (String)object, "format(...)");
                    n7 = 0;
                    string2 = null;
                    hv3_0.o0(n4, (String)object, null);
                }
            }
            Bundle bundle = new Bundle();
            n3 = ((ArrayList)object3).isEmpty() ^ n4;
            NewCustomEventsRevamp newCustomEventsRevamp = cartAddressListBottomSheet.z;
            if (n3 != 0) {
                object = newCustomEventsRevamp.getNO_OF_ADDRESS();
                n4 = ((ArrayList)object3).size();
                bundle.putInt((String)object, n4);
            } else {
                object = newCustomEventsRevamp.getNO_OF_ADDRESS();
                bundle.putInt((String)object, 0);
            }
            String string3 = cartAddressListBottomSheet.A;
            String string4 = cartAddressListBottomSheet.B;
            object2 = cartAddressListBottomSheet.z;
            String string5 = "address list screen - shipping";
            String string6 = "address management screen";
            ((NewCustomEventsRevamp)object2).newPushCustomScreenView(string5, string6, string3, bundle, string4);
        }
    }
}

