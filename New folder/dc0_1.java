/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.databinding.FragmentExReturnAddressRevampBinding;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity$a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from dC0
 */
public final class dc0_1
extends p51_0
implements View.OnClickListener,
XB0$c {
    public static final dC0$a Companion;
    public static final /* synthetic */ gn1_2[] w;
    public final cc3_2 f;
    public AjioTextView g;
    public CartDeliveryAddress h;
    public CartDeliveryAddress i;
    public int j;
    public ExReturnAddressActivity k;
    public final ArrayList l;
    public final ArrayList m;
    public xb0_0 n;
    public h5_0 o;
    public String p;
    public RecyclerView q;
    public Boolean r;
    public boolean s;
    public boolean t;
    public final hh3_2 u;
    public final hh3_2 v;

    static {
        Object object = jz.a(dc0_1.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentExReturnAddressRevampBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        w = gn1_2Array;
        Companion = object = new Object();
    }

    public dc0_1() {
        Object object = z80_0.c(dC0$b.a, this);
        this.f = object;
        object = new ArrayList();
        this.l = object;
        object = new ArrayList();
        this.m = object;
        object = Boolean.FALSE;
        this.r = object;
        int n3 = 1;
        object = new yb_1(this, n3);
        this.u = object = yr1_2.b((Function0)object);
        object = new zb_1(this, n3);
        this.v = object = yr1_2.b((Function0)object);
    }

    public final void H2() {
        boolean bl2;
        boolean bl3;
        sD3 sD32 = this.k;
        if (sD32 != null && (sD32 == null || (bl3 = sD32.isFinishing()) != (bl2 = true))) {
            sD32 = new wy2_1();
            Object object = new Bundle();
            Object object2 = this.getArguments();
            String string2 = "product_id";
            String string3 = null;
            object2 = object2 != null ? object2.getString(string2) : null;
            object.putString(string2, (String)object2);
            object2 = this.getArguments();
            string2 = "order_id";
            object2 = object2 != null ? object2.getString(string2) : null;
            object.putString(string2, (String)object2);
            object2 = this.getArguments();
            string2 = "order_status";
            if (object2 != null) {
                string3 = object2.getString(string2);
            }
            object.putString(string2, string3);
            ((Fragment)sD32).setArguments((Bundle)object);
            object = this.getFragmentManager();
            if (object != null) {
                object2 = "SelfShip_bottom_sheet";
                ((DialogFragment)sD32).show((FragmentManager)object, (String)object2);
            }
        }
    }

    public final void J3() {
        this.Ua();
    }

    public final RecyclerView Pa() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addressRv");
        return null;
    }

    public final void Qa() {
        boolean bl2;
        boolean bl3;
        Object object = this.p;
        if (object != null && !(bl3 = kotlin.text.b.k((CharSequence)object)) && (object = this.k) != null && (bl3 = object.isFinishing()) != (bl2 = true)) {
            object = p3.a("client_type", "Android");
            AJIOApplication.Companion.getClass();
            Object object2 = p90.a((Context)AJIOApplication$a.a());
            ((HashMap)object).put("client_version", object2);
            object2 = this.u;
            Object object3 = (UserInformation)((hh3_2)object2).getValue();
            Object object4 = "<get-userInformation>(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object3 = ServiceUtil.getToken((UserInformation)object3);
            if (object3 != null && (object4 = this.o) != null) {
                object2 = ((UserInformation)((hh3_2)object2).getValue()).getUserId();
                String string2 = "getUserId(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                ((h5_0)object4).d((String)object3, (String)object2, (HashMap)object);
            }
        }
    }

    public final Bundle Ra(CartDeliveryAddress cartDeliveryAddress) {
        boolean bl2;
        Bundle bundle = new Bundle();
        Object object = this.getArguments();
        boolean bl3 = false;
        String string2 = null;
        String string3 = "non_refundable_fee";
        if (object != null) {
            object = object.getString(string3);
        } else {
            bl2 = false;
            object = null;
        }
        bundle.putString(string3, (String)object);
        object = this.getArguments();
        string3 = "discounts";
        if (object != null) {
            object = object.getString(string3);
        } else {
            bl2 = false;
            object = null;
        }
        bundle.putString(string3, (String)object);
        object = this.getArguments();
        string3 = "return_percentage";
        if (object != null) {
            string2 = object.getString(string3);
        }
        bundle.putString(string3, string2);
        bl2 = false;
        object = null;
        if (cartDeliveryAddress != null) {
            bl3 = cartDeliveryAddress.isDefaultAddress();
        } else {
            bl3 = false;
            string2 = null;
        }
        string3 = "default_address";
        bundle.putBoolean(string3, bl3);
        if (cartDeliveryAddress != null) {
            bl2 = cartDeliveryAddress.isServiceAble();
        }
        bundle.putBoolean("serviceability", bl2);
        return bundle;
    }

    public final FragmentExReturnAddressRevampBinding Sa() {
        Object object = w[0];
        object = this.f.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentExReturnAddressRevampBinding)object;
    }

    public final void Ta() {
        Object object = this.h;
        int n3 = 0;
        Object object2 = null;
        if (object != null) {
            boolean bl2 = h40_0.l1();
            hh3_2 hh3_22 = this.v;
            String string2 = "exchange";
            if (bl2 && (bl2 = kotlin.text.b.i((String)(object = (String)hh3_22.getValue()), string2, false)) && (object = this.h) != null && !(bl2 = ((CartDeliveryAddress)object).isExchangeService())) {
                Object object3;
                int n4;
                object = this.g;
                if (object != null) {
                    n4 = R$drawable.bg_button_disabled;
                    object3 = hv3_0.r(n4);
                    object.setBackground(object3);
                }
                if ((object = this.g) != null) {
                    n4 = hv3_0.m(R$color.color_a5a5a5);
                    object.setTextColor(n4);
                }
                if ((object = this.g) != null) {
                    object.setEnabled(false);
                }
                if ((object = this.g) != null) {
                    object.setFocusable(false);
                }
                object = this.r;
                Intrinsics.checkNotNull(object);
                bl2 = (Boolean)object;
                if (bl2 && (object = this.o) != null) {
                    object = ((h5_0)object).p;
                    object3 = Boolean.FALSE;
                    ((LiveData)object).k(object3);
                }
            } else {
                Object object4;
                int n7;
                bl2 = h40_0.l1();
                if (bl2) {
                    object = this.g;
                    n7 = 1;
                    if (object != null) {
                        object.setEnabled(n7 != 0);
                    }
                    if ((object = this.g) != null) {
                        object.setFocusable(n7 != 0);
                    }
                }
                if ((object = this.g) != null) {
                    n7 = R$drawable.bg_black_button;
                    object4 = hv3_0.r(n7);
                    object.setBackground(object4);
                }
                if ((object = this.g) != null) {
                    n7 = hv3_0.m(R$color.white);
                    object.setTextColor(n7);
                }
                object = this.r;
                Intrinsics.checkNotNull(object);
                bl2 = (Boolean)object;
                if (bl2 && (object = this.o) != null) {
                    object = ((h5_0)object).p;
                    object4 = Boolean.TRUE;
                    ((LiveData)object).k(object4);
                }
            }
            if ((bl2 = h40_0.l1()) && (bl2 = kotlin.text.b.i((String)(object = (String)hh3_22.getValue()), string2, false)) && (object = this.h) != null && !(bl2 = ((CartDeliveryAddress)object).isReverseService())) {
                int n8;
                object = this.g;
                if (object != null) {
                    n8 = R$drawable.bg_button_disabled;
                    hh3_22 = hv3_0.r(n8);
                    object.setBackground((Drawable)hh3_22);
                }
                if ((object = this.g) != null) {
                    n8 = hv3_0.m(R$color.color_a5a5a5);
                    object.setTextColor(n8);
                }
                if ((object = this.g) != null) {
                    object.setEnabled(false);
                }
                if ((object = this.g) != null) {
                    object.setFocusable(false);
                }
            }
        } else {
            boolean bl3 = h40_0.l1();
            if (bl3) {
                object = this.g;
                if (object != null) {
                    object.setEnabled(false);
                }
                if ((object = this.g) != null) {
                    object.setFocusable(false);
                }
            }
            if ((object = this.g) != null) {
                n3 = R$drawable.bg_button_disabled;
                object2 = hv3_0.r(n3);
                object.setBackground(object2);
            }
            if ((object = this.g) != null) {
                n3 = hv3_0.m(R$color.color_a5a5a5);
                object.setTextColor(n3);
            }
            object = this.r;
            Intrinsics.checkNotNull(object);
            bl3 = (Boolean)object;
            if (bl3 && (object = this.o) != null) {
                object = ((h5_0)object).p;
                object2 = Boolean.FALSE;
                ((LiveData)object).k(object2);
            }
        }
    }

    public final void Ua() {
        boolean bl2;
        boolean bl3;
        Object object = this.k;
        if (object != null && (bl3 = object.isFinishing()) != (bl2 = true)) {
            object = NewAddressActivity.Companion;
            FragmentActivity fragmentActivity = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, "requireActivity(...)");
            Bundle bundle = new Bundle();
            object.getClass();
            NewAddressActivity$a.a((Context)fragmentActivity, this, bundle);
        }
    }

    public final void Va() {
        Object object = this.l;
        if (object != null) {
            ((ArrayList)object).clear();
        }
        boolean bl2 = hv3_0.W();
        ArrayList arrayList = this.m;
        if (!bl2) {
            if (arrayList != null && object != null) {
                ((ArrayList)object).addAll(arrayList);
            }
        } else {
            bl2 = this.s;
            if (bl2) {
                if (arrayList != null && object != null) {
                    ((ArrayList)object).addAll(arrayList);
                }
            } else if (arrayList != null) {
                bl2 = false;
                j33 j332 = (j33)arrayList.get(0);
                if (j332 != null && object != null) {
                    ((ArrayList)object).add(j332);
                }
            }
        }
        if ((object = this.n) != null) {
            ((xb0_0)object).d = bl2 = this.s;
        }
        if (object != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void o2() {
        this.s = true;
        this.Va();
        Object object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getCurrentScreen();
        gTMEvents.pushButtonTapEvent("view more address click", "", (String)object);
    }

    public final void o9(CartDeliveryAddress object, int n3) {
        int n4;
        String string2 = "address";
        Intrinsics.checkNotNullParameter(object, string2);
        this.j = n3;
        String string3 = ((CartDeliveryAddress)object).getId();
        Intrinsics.checkNotNullExpressionValue(string3, "getId(...)");
        object = this.p;
        if (object != null && (n4 = kotlin.text.b.k((CharSequence)object)) == 0 && (object = this.k) != null && (n4 = object.isFinishing()) != (n3 = 1)) {
            HashMap hashMap = p3.a("client_type", "Android");
            AJIOApplication.Companion.getClass();
            object = p90.a((Context)AJIOApplication$a.a());
            hashMap.put("client_version", object);
            object = this.u;
            Object object2 = (UserInformation)((hh3_2)object).getValue();
            string2 = "<get-userInformation>(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            String string4 = ServiceUtil.getToken((UserInformation)object2);
            if (string4 != null) {
                object2 = this.Sa().falrPbLoading;
                ((AjioLoaderView)((Object)object2)).startLoader();
                h5_0 h5_02 = this.o;
                if (h5_02 != null) {
                    String string5 = this.p;
                    Intrinsics.checkNotNull(string5);
                    String string6 = ((UserInformation)((hh3_2)object).getValue()).getUserId();
                    Intrinsics.checkNotNullExpressionValue(string6, "getUserId(...)");
                    Intrinsics.checkNotNullParameter(string5, "consignmentCode");
                    Intrinsics.checkNotNullParameter("GetExReturnAddresses", "requestID");
                    Intrinsics.checkNotNullParameter(string4, "accessToken");
                    Intrinsics.checkNotNullParameter(hashMap, "queryParam");
                    Intrinsics.checkNotNullParameter(string6, "userId");
                    Intrinsics.checkNotNullParameter(string3, "addressId");
                    object = md3_0.c(h5_02);
                    object2 = new c5_0(h5_02, string5, string4, hashMap, string6, string3, null);
                    int n7 = 3;
                    Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
                }
            }
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        ExReturnAddressActivity exReturnAddressActivity;
        int n7 = -1;
        if (n4 == n7 && (exReturnAddressActivity = this.k) != null && exReturnAddressActivity != null && (n4 = (int)(exReturnAddressActivity.isFinishing() ? 1 : 0)) == 0 && n3 == (n4 = 26)) {
            this.Qa();
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (ExReturnAddressActivity)object;
        this.k = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.btnProceed;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            int n8;
            Object object2;
            boolean bl2;
            String string2;
            Object object3;
            Object object4;
            boolean bl3;
            Object object5;
            object = this.h;
            if (object == null) return;
            Object object6 = this.k;
            if (object6 != null) {
                ((ExReturnAddressActivity)object6).z2((CartDeliveryAddress)object);
            }
            object = this.h;
            object6 = this.m;
            n3 = 0;
            String string3 = null;
            String string4 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartDeliveryAddress";
            String string5 = "next(...)";
            Object object7 = "iterator(...)";
            if (object != null && object6 != null) {
                object5 = ((ArrayList)object6).iterator();
                Intrinsics.checkNotNullExpressionValue(object5, (String)object7);
                while (bl3 = object5.hasNext()) {
                    object4 = object5.next();
                    Intrinsics.checkNotNullExpressionValue(object4, string5);
                    object4 = ((j33)object4).b;
                    Intrinsics.checkNotNull(object4, string4);
                    object3 = ((CartDeliveryAddress)(object4 = (CartDeliveryAddress)object4)).getId();
                    bl2 = Intrinsics.areEqual(object3, string2 = ((CartDeliveryAddress)object).getId());
                    if (!bl2) continue;
                    n4 = (int)(((CartDeliveryAddress)object4).isDefaultAddress() ? 1 : 0);
                    break;
                }
            } else {
                n4 = 0;
                object = null;
            }
            object5 = "no";
            object4 = "yes";
            object = n4 != 0 ? object4 : object5;
            object3 = this.h;
            if (object3 != null && object6 != null) {
                boolean bl4;
                object6 = ((ArrayList)object6).iterator();
                Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
                while (bl4 = object6.hasNext()) {
                    object7 = object6.next();
                    Intrinsics.checkNotNullExpressionValue(object7, string5);
                    object7 = ((j33)object7).b;
                    Intrinsics.checkNotNull(object7, string4);
                    string2 = ((CartDeliveryAddress)(object7 = (CartDeliveryAddress)object7)).getId();
                    boolean bl5 = Intrinsics.areEqual(string2, object2 = ((CartDeliveryAddress)object3).getId());
                    if (!bl5) continue;
                    n7 = (int)(((CartDeliveryAddress)object7).isDeliveredAddress() ? 1 : 0);
                    break;
                }
            } else {
                n7 = 0;
                object6 = null;
            }
            object2 = n7 != 0 ? object4 : object5;
            Bundle bundle = E1.a("default_address", (String)object);
            object = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object6 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
            String string6 = ((NewEEcommerceEventsRevamp)object6).getCurrentScreen();
            string2 = "proceed to return|exchange";
            ((GTMEvents)object3).pushButtonTapEvent(string2, object2, string6, null, bundle);
            n7 = (int)(h40_0.l1() ? 1 : 0);
            if (n7 == 0) return;
            object6 = this.v;
            string4 = (String)((hh3_2)object6).getValue();
            if (string4 != null && (n8 = string4.length()) != 0) {
                n8 = 0;
                string4 = null;
            } else {
                n8 = 1;
            }
            if (n8 != 0) return;
            n7 = (int)(kotlin.text.b.i((String)(object6 = (String)((hh3_2)object6).getValue()), string4 = "return", false) ? 1 : 0);
            if (n7 != 0) {
                object6 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
                object = this.h;
                string2 = this.Ra((CartDeliveryAddress)object);
                string6 = null;
                string3 = "buttonTap";
                string4 = "proceed to return";
                string5 = "";
                object7 = "buttonTap";
                object5 = "return address selection screen";
                bl3 = false;
                object4 = null;
                bl2 = false;
                object3 = null;
                object2 = "";
                int n10 = 1632;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string3, string4, string5, (String)object7, (String)object5, null, null, (Bundle)string2, (String)object2, false, null, n10, null);
                return;
            }
            object6 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
            object = this.h;
            string2 = this.Ra((CartDeliveryAddress)object);
            string6 = null;
            string3 = "buttonTap";
            string4 = "proceed to exchange";
            string5 = "";
            object7 = "buttonTap";
            object5 = "exchange address selection screen";
            bl3 = false;
            object4 = null;
            bl2 = false;
            object3 = null;
            object2 = "";
            int n14 = 1632;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string3, string4, string5, (String)object7, (String)object5, null, null, (Bundle)string2, (String)object2, false, null, n14, null);
            return;
        }
        n7 = R$id.alfTvAddAddress;
        if (object == null) {
            return;
        }
        n4 = (Integer)object;
        if (n4 != n7) return;
        this.Ua();
    }

    public final void onCreate(Bundle object) {
        Object object2;
        Object object3;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Object object4 = null;
        if (object != null) {
            boolean bl2;
            int n3;
            object = this.getArguments();
            if (object != null) {
                object3 = "ui_changes_for_tab_address";
                n3 = 0;
                object2 = null;
                bl2 = object.getBoolean((String)object3, false);
                object = bl2;
            } else {
                bl2 = false;
                object = null;
            }
            this.r = object;
            object = this.getArguments();
            if (object != null) {
                int n4 = Build.VERSION.SDK_INT;
                n3 = 33;
                if (n4 >= n3) {
                    object = yb0_0.a((Bundle)object);
                } else {
                    object3 = "RETURN_ITEMS_ADDRESS_DATA";
                    n4 = (object = object.getSerializable((String)object3)) instanceof CartDeliveryAddress;
                    if (n4 == 0) {
                        bl2 = false;
                        object = null;
                    }
                    object = (CartDeliveryAddress)object;
                }
                object = (CartDeliveryAddress)object;
            } else {
                bl2 = false;
                object = null;
            }
            this.h = object;
            this.i = object;
            object = this.getArguments();
            if (object != null) {
                object3 = "consignment_code";
                object = object.getString((String)object3);
            } else {
                bl2 = false;
                object = null;
            }
            this.p = object;
        }
        object = kd3_2.a();
        object3 = new AddressRepo();
        object2 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object3;
        ((kd3_2)object).b = object2;
        object3 = this.getActivity();
        if (object3 != null) {
            Intrinsics.checkNotNull(object);
            object4 = "owner";
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object2 = "factory";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            rd3_0 rd3_02 = object3.getViewModelStore();
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object4 = object3.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(rd3_02, "store");
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(object4, "defaultCreationExtras");
            object3 = h5_0.class;
            object2 = "modelClass";
            object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object4, object3, (String)object2);
            object4 = "<this>";
            object3 = sw0_0.a(object3, (String)object4, object3, (String)object2, (String)object2);
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object4 = object3.getQualifiedName();
            if (object4 != null) {
                object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object4 = ((String)object2).concat((String)object4);
                object4 = object = ((pD3)object).a((yn1_2)object3, (String)object4);
                object4 = (h5_0)object;
            } else {
                object4 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object4);
                throw object;
            }
        }
        this.o = object4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ex_return_address_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View object, Bundle object2) {
        block14: {
            block13: {
                boolean bl2;
                void var8_15;
                void var8_13;
                Object object3 = "view";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                super.onViewCreated((View)object, (Bundle)object2);
                object2 = this.o;
                if (object2 != null) {
                    object2 = ((h5_0)object2).m;
                    object3 = Boolean.TRUE;
                    ((LiveData)object2).k(object3);
                }
                object2 = this.Sa().collapseToolBar;
                int n3 = R$style.collapsed_toolbar_title;
                ((CollapsingToolbarLayout)((Object)object2)).setCollapsedTitleTextAppearance(n3);
                int n4 = R$style.expanded_toolbar_title;
                ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleTextAppearance(n4);
                int n7 = mz3_0.d(16);
                int n8 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginTop();
                int n10 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginEnd();
                int n14 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginBottom();
                ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleMargin(n7, n8, n10, n14);
                object2 = this.getActivity();
                object3 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = ((ExReturnAddressActivity)object2).q0;
                if (object2 != null && (object2 = ((ReturnOrderItemDetails)object2).getConsignment()) != null && (object2 = ((Consignment)object2).getEntries()) != null) {
                    int n15 = object2.size();
                } else {
                    boolean bl3 = false;
                    object2 = null;
                }
                boolean bl4 = true;
                if (var8_13 > bl4) {
                    int n16 = 4;
                } else {
                    int n17 = 3;
                }
                object2 = hv3_0.J((int)(bl4 ? 1 : 0), (int)var8_15);
                Object object4 = this.Sa().alfToolbar;
                n10 = R$string.pick_up_address;
                Object object5 = this.getString(n10);
                ((Toolbar)object4).setTitle((CharSequence)object5);
                ((Toolbar)object4).setSubtitle((CharSequence)object2);
                object5 = this.getActivity();
                n14 = R$style.muli_regular_12_accent_18;
                ((Toolbar)object4).setSubtitleTextAppearance((Context)object5, n14);
                n10 = R$drawable.ic_cc_close;
                ((Toolbar)object4).setNavigationIcon(n10);
                n10 = R$string.close;
                ((Toolbar)object4).setNavigationContentDescription(n10);
                object5 = new ZB0(this);
                ((Toolbar)object4).setNavigationOnClickListener((View.OnClickListener)object5);
                object4 = this.Sa().appBarLayout;
                n10 = R$string.pick_up_address;
                object5 = this.getString(n10);
                Object object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)object5);
                ((StringBuilder)object6).append((String)object2);
                object2 = ((StringBuilder)object6).toString();
                object4.setContentDescription((CharSequence)object2);
                object2 = this.Sa().collapseToolBar;
                object4 = "collapseToolBar";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                ai0_2.m((View)object2);
                object2 = this.r;
                Intrinsics.checkNotNull(object2);
                boolean bl5 = (Boolean)object2;
                if (bl5) {
                    object2 = this.Sa().appBarLayout;
                    Intrinsics.checkNotNullExpressionValue(object2, "appBarLayout");
                    ai0_2.i((View)object2);
                    object2 = this.Sa().fragmentAddressLayoutProceed;
                    object4 = "fragmentAddressLayoutProceed";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                    ai0_2.i((View)object2);
                }
                if ((object2 = this.o) != null && (object2 = ((h5_0)object2).f) != null) {
                    object4 = this.getViewLifecycleOwner();
                    object5 = new ac0_1(this);
                    ((LiveData)object2).e((mu1_1)object4, (F62)object5);
                }
                if ((object2 = this.o) != null && (object2 = ((h5_0)object2).g) != null) {
                    object4 = this.getViewLifecycleOwner();
                    n14 = 1;
                    object5 = new C8(this, n14);
                    ((LiveData)object2).e((mu1_1)object4, (F62)object5);
                }
                if ((object2 = this.o) != null && (object2 = ((h5_0)object2).n) != null) {
                    object4 = this.getViewLifecycleOwner();
                    object5 = new bc0_2(this);
                    ((LiveData)object2).e((mu1_1)object4, (F62)object5);
                }
                if ((object2 = this.o) != null && (object2 = ((h5_0)object2).o) != null) {
                    object4 = this.getViewLifecycleOwner();
                    object5 = new cc0_1(this);
                    ((LiveData)object2).e((mu1_1)object4, (F62)object5);
                }
                int n18 = R$id.btnProceed;
                this.g = object2 = (AjioTextView)object.findViewById(n18);
                int n19 = R$id.addressRv;
                object = (RecyclerView)object.findViewById(n19);
                Intrinsics.checkNotNullParameter(object, "<set-?>");
                this.q = object;
                object2 = this.l;
                boolean bl6 = this.s;
                int n20 = this.j;
                boolean bl7 = this.t;
                Object object7 = object4 = this.v.getValue();
                object7 = (String)object4;
                object4 = object;
                object5 = this;
                object6 = object2;
                this.n = object = new xb0_0(this, (ArrayList)object2, bl6, n20, bl7, (String)object7);
                object = this.Pa();
                object5 = this.requireActivity();
                object4 = new LinearLayoutManager((Context)object5);
                ((RecyclerView)object).setLayoutManager((RecyclerView$o)object4);
                this.Pa().setHasFixedSize(bl4);
                object = this.Pa();
                object3 = this.n;
                ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
                object = this.g;
                if (object != null) {
                    object.setOnClickListener((View.OnClickListener)this);
                }
                if (object2 == null || (bl2 = ((ArrayList)object2).isEmpty())) break block13;
                object = this.h;
                if (object != null) {
                    ai0_2.B((View)this.Pa());
                    object = this.n;
                    if (object != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                }
                break block14;
            }
            object = this.Sa().falrShimmer.falrShimmerFL;
            object2 = "falrShimmerFL";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            ai0_2.B((View)object);
            this.Qa();
        }
        this.h = null;
        this.Ta();
        this.Sa().alfTvAddAddress.setOnClickListener((View.OnClickListener)this);
    }

    public final CartDeliveryAddress p1() {
        return this.h;
    }

    public final void x8() {
        this.s = false;
        this.Va();
    }
}

