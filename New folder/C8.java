/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class C8
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ C8(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onChanged(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = "this$0";
        Fragment fragment = this.b;
        int bl2 = this.a;
        switch (bl2) {
            default: {
                object = (DataCallback)object;
                Object object4 = dc0_1.Companion;
                fragment = (dc0_1)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object3);
                Intrinsics.checkNotNullParameter(object, "cartDeliveryAddressInfoDataCallback");
                object3 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n7 != 0) {
                    ((dc0_1)fragment).Sa().falrPbLoading.stopLoader();
                    object3 = ((dc0_1)fragment).k;
                    if (object3 != null && (n7 = object3.isFinishing()) == 0) {
                        n7 = ((DataCallback)object).getStatus();
                        if (n7 == 0) {
                            if ((object = (CartDeliveryAddressInfo)((DataCallback)object).getData()) != null && (object3 = ((CartDeliveryAddressInfo)object).getAddresses()) != null) {
                                boolean bl3;
                                object = (CartDeliveryAddress)((CartDeliveryAddressInfo)object).getAddresses().get(0);
                                object3 = ((dc0_1)fragment).l;
                                if (object3 != null && !(bl3 = ((ArrayList)object3).isEmpty()) && object != null) {
                                    boolean bl4;
                                    Intrinsics.checkNotNull(object3);
                                    object3 = ((ArrayList)object3).iterator();
                                    object4 = "iterator(...)";
                                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                                    while (bl4 = object3.hasNext()) {
                                        object4 = object3.next();
                                        Intrinsics.checkNotNullExpressionValue(object4, "next(...)");
                                        object4 = (j33)object4;
                                        Object object5 = ((j33)object4).b;
                                        String string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartDeliveryAddress";
                                        Intrinsics.checkNotNull(object5, string2);
                                        object5 = ((CartDeliveryAddress)object5).getId();
                                        String string3 = ((CartDeliveryAddress)object).getId();
                                        boolean bl5 = Intrinsics.areEqual(object5, string3);
                                        object4 = ((j33)object4).b;
                                        if (bl5) {
                                            ((dc0_1)fragment).h = object;
                                            Intrinsics.checkNotNull(object4, string2);
                                            object5 = object4;
                                            object5 = (CartDeliveryAddress)object4;
                                            ((CartDeliveryAddress)object5).setSelectedAddress(n4 != 0);
                                            Intrinsics.checkNotNull(object4, string2);
                                            boolean bl6 = ((CartDeliveryAddress)object).isExchangeService();
                                            ((CartDeliveryAddress)object5).setExchangeService(bl6);
                                            Intrinsics.checkNotNull(object4, string2);
                                            bl6 = ((CartDeliveryAddress)object).isReverseService();
                                            ((CartDeliveryAddress)object5).setReverseService(bl6);
                                            Intrinsics.checkNotNull(object4, string2);
                                            bl4 = ((CartDeliveryAddress)object).isDropAtStoreService();
                                            ((CartDeliveryAddress)object5).setDropAtStoreService(bl4);
                                            continue;
                                        }
                                        Intrinsics.checkNotNull(object4, string2);
                                        object4 = (CartDeliveryAddress)object4;
                                        ((CartDeliveryAddress)object4).setSelectedAddress(false);
                                    }
                                }
                                ((dc0_1)fragment).Ta();
                                object = ((dc0_1)fragment).n;
                                if (object != null) {
                                    ((xb0_0)object).e = n3 = ((dc0_1)fragment).j;
                                }
                                if (object != null) {
                                    ((RecyclerView$f)object).notifyDataSetChanged();
                                }
                            }
                        } else {
                            int n8 = ((DataCallback)object).getStatus();
                            if (n8 == n4) {
                                object = StringCompanionObject.INSTANCE;
                                n8 = R$string.acc_error_message;
                                object = hv3_0.K(n8);
                                n7 = R$string.addresses_not_able_to_fetch;
                                object3 = hv3_0.K(n7);
                                object4 = new Object[n4];
                                object4[0] = object3;
                                object = xh2_0.a((Object[])object4, n4, (String)object, "format(...)");
                                object2 = ((dc0_1)fragment).k;
                                if (object2 != null) {
                                    n4 = R$string.addresses_not_able_to_fetch;
                                    String string4 = hv3_0.K(n4);
                                    ((ExReturnAddressActivity)object2).showNotification(string4, (String)object);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        object = (Boolean)object;
        object2 = q9_0.Companion;
        fragment = (q9_0)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object3);
        if (object != null) {
            ((q9_0)fragment).Z0 = object;
            boolean bl7 = ((q9_0)fragment).X0;
            ((q9_0)fragment).Ra(bl7);
        }
    }
}

