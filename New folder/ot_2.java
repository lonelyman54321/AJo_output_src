/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.PickFromStoreRepo;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity$a;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from OT
 */
public final class ot_2
extends Fragment
implements s72_0 {
    public static final OT$a Companion;
    public LT a;
    public CheckoutAddressActivity b;
    public h5_0 c;
    public RecyclerView d;
    public CartDeliveryAddress e;
    public final ArrayList f;
    public l82_0 g;
    public final UserInformation h;
    public boolean i;
    public ys2_1 j;

    static {
        OT$a oT$a;
        Companion = oT$a = new Object();
    }

    public ot_2() {
        Object object = new ArrayList();
        this.f = object;
        this.h = object = VX0.a(AJIOApplication.Companion);
    }

    public final void Oa() {
        h5_0 h5_02;
        Object object = this.g;
        if (object != null) {
            boolean bl2 = true;
            object.X9(bl2);
        }
        object = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        Object object2 = p90.a((Context)AJIOApplication$a.a());
        ((HashMap)object).put("client_version", object2);
        object2 = this.h;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        String string2 = ServiceUtil.getToken((UserInformation)object2);
        if (string2 != null && (h5_02 = this.c) != null) {
            object2 = ((UserInformation)object2).getUserId();
            String string3 = "getUserId(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            h5_02.d(string2, (String)object2, (HashMap)object);
        }
    }

    public final void Pa() {
        F62 f62;
        mu1_1 mu1_12;
        Object object = this.c;
        if (object != null && (object = ((h5_0)object).f) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new MT(this);
            ((LiveData)object).e(mu1_12, f62);
        }
        if ((object = this.c) != null && (object = ((h5_0)object).e) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new NT(this, 0);
            ((LiveData)object).e(mu1_12, f62);
        }
    }

    public final void Qa(String object) {
        Object object2;
        Bundle bundle = new Bundle();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        boolean bl3 = true;
        if (!bl2) {
            object2 = "add_json";
            bundle.putString((String)object2, (String)object);
            object = "shipping_update";
            bundle.putBoolean((String)object, bl3);
        }
        bundle.putBoolean("isAddressNeeded", bl3);
        bundle.putBoolean("isGoogleLocationEnable", bl3);
        object = this.b;
        if (object != null) {
            object2 = NewAddressActivity.Companion;
            object2.getClass();
            NewAddressActivity$a.a((Context)object, this, bundle);
        }
    }

    public final void Ra() {
        Object object = this.e;
        Object object2 = this.f;
        if (object != null && (object = ((CartDeliveryAddress)object).getId()) != null) {
            boolean bl2;
            object = ((ArrayList)object2).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                String string2;
                boolean bl3;
                object2 = object.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                object2 = (CartDeliveryAddress)object2;
                Object object3 = this.e;
                if (object3 != null) {
                    object3 = ((CartDeliveryAddress)object3).getId();
                } else {
                    bl3 = false;
                    object3 = null;
                }
                if (!(bl3 = kotlin.text.b.i((String)object3, string2 = ((CartDeliveryAddress)object2).getId(), false))) continue;
                this.e = object2;
                object = this.g;
                if (object != null) {
                    object.k6((CartDeliveryAddress)object2, false);
                }
                break;
            }
        } else {
            int n3;
            int n4;
            object = this.e;
            if (object == null && (n4 = ((ArrayList)object2).size()) == (n3 = 1)) {
                this.e = object = (CartDeliveryAddress)((ArrayList)object2).get(0);
                object2 = this.g;
                if (object2 != null) {
                    object2.k6((CartDeliveryAddress)object, false);
                }
            }
        }
    }

    public final void W0(CartDeliveryAddress cartDeliveryAddress) {
        ot_2 ot_22 = this;
        Object object = cartDeliveryAddress;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        Object object2 = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        NewCustomEventsRevamp newCustomEventsRevamp2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        String string2 = newCustomEventsRevamp2.getEC_CHECKOUT_INTERACTIONS();
        String string3 = bv_0.a((AnalyticsManager$Companion)object2);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        String string5 = "change address";
        String string6 = "";
        String string7 = "change_address";
        String string8 = "shipping screen";
        String string9 = "shipping screen";
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string6, string7, string8, string9, string3, null, string4, false, null, n3, null);
        this.e = cartDeliveryAddress;
        object2 = this.g;
        if (object2 != null) {
            boolean bl2 = true;
            object2.k6(cartDeliveryAddress, bl2);
        }
        if ((object = ot_22.a) != null) {
            ((LT)object).b = object2 = ot_22.e;
        }
        if (object != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.Pa();
        this.i = false;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        Object object;
        n4 = 26;
        if (n3 == n4 && (object = this.c) != null) {
            this.c = null;
            object = kd3_2.a();
            Object object2 = new AddressRepo();
            intent = this.requireActivity().getApplication();
            ((kd3_2)object).a = object2;
            ((kd3_2)object).b = intent;
            Intrinsics.checkNotNull(object);
            object2 = new E(this, (E$b)object);
            this.c = object = (h5_0)((E)object2).b(h5_0.class);
            n3 = 1;
            this.i = n3;
            this.Pa();
            this.Oa();
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (CheckoutAddressActivity)object;
        this.b = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        boolean bl2 = true;
        this.setHasOptionsMenu(bl2);
        object = kd3_2.a();
        Object object2 = new AddressRepo();
        Object object3 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        Intrinsics.checkNotNull(object);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object4, string2);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object6 = h5_0.class;
        String string4 = "modelClass";
        object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object5, object6, string4);
        object4 = "<this>";
        object5 = ef0_0.a(object6, string4, string4, (String)object4);
        object6 = object5.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.c = object = (h5_0)((pD3)object).a((yn1_2)object5, (String)object6);
            object = kd3_2.a();
            object5 = new PickFromStoreRepo();
            object6 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object5;
            ((kd3_2)object).b = object6;
            object5 = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(object5, "requireActivity(...)");
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullParameter(object5, (String)object2);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object6 = object5.getViewModelStore();
            Intrinsics.checkNotNullParameter(object5, (String)object2);
            object2 = object5.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object6, string2);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object2, string3);
            object3 = new pD3((rd3_0)object6, (E$b)object, (Wd0)object2);
            object = ys2_1.class;
            object = do_0.a((Class)object, string4, (Class)object, string4, string4);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object2 = object.getQualifiedName();
            if (object2 != null) {
                object2 = string6.concat((String)object2);
                this.j = object = (ys2_1)((pD3)object3).a((yn1_2)object, (String)object2);
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_checkout_home_address_lux;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_checkout_home_address_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "menuItem";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        km_1.a(AnalyticsManager.Companion, "Shipping Address Screen");
    }

    public final void onStop() {
        super.onStop();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        String string2 = "shipping screen";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.checkout_address_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.d = object;
        if (object != null) {
            object3 = this.b;
            Intrinsics.checkNotNull(object3);
            object2 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        object2 = this.f;
        object = new LT((ArrayList)object2, this);
        this.a = object;
        object2 = this.e;
        ((LT)object).b = object2;
        this.Oa();
        object = this.d;
        if (object != null) {
            object2 = this.a;
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        }
    }

    public final void y5(CartDeliveryAddress cartDeliveryAddress) {
        Object object = cartDeliveryAddress;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        Object object2 = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        String string2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEC_CHECKOUT_INTERACTIONS();
        String string3 = bv_0.a((AnalyticsManager$Companion)object2);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "edit address", "", "edit_address", "shipping screen", "shipping screen", string3, null, string4, false, null, 1536, null);
        object2 = new Gson();
        object = ((Gson)object2).toJson(cartDeliveryAddress);
        object2 = this;
        this.Qa((String)object);
    }
}

