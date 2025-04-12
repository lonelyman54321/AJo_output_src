/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity$a;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from gT
 */
public final class gt_2
extends Fragment
implements View.OnClickListener,
s72_0 {
    public LT a;
    public CheckoutAddressActivity b;
    public AjioProgressView c;
    public h5_0 d;
    public RecyclerView e;
    public CartDeliveryAddress f;
    public final ArrayList g;
    public AjioTextView h;
    public AjioTextView i;
    public AjioLoaderView j;
    public View k;
    public ShimmerFrameLayout l;
    public final hh3_2 m;
    public final NewEEcommerceEventsRevamp n;
    public final NewCustomEventsRevamp o;
    public final String p;
    public final String q;

    public gt_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new ArrayList();
        this.g = object;
        object = new dt_2(this, 0);
        this.m = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.n = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.o = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.p = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.q = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void Oa() {
        hv3_0.s0(this.l);
        Object object = this.k;
        if (object != null) {
            int n3 = 8;
            object.setVisibility(n3);
        }
        if ((object = this.c) != null) {
            ((AjioProgressView)((Object)object)).dismiss();
        }
        if ((object = this.j) != null) {
            ((AjioLoaderView)((Object)object)).stopLoader();
        }
    }

    public final void Pa() {
        Object object;
        Object object2 = this.k;
        if (object2 != null) {
            object = null;
            object2.setVisibility(0);
        }
        hv3_0.p0(this.l);
        object2 = this.c;
        if (object2 != null) {
            ((AjioProgressView)((Object)object2)).show();
        }
        if ((object2 = this.j) != null) {
            ((AjioLoaderView)((Object)object2)).startLoader();
        }
        object2 = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        object = p90.a((Context)AJIOApplication$a.a());
        ((HashMap)object2).put("client_version", object);
        object = this.m;
        Object object3 = (UserInformation)((hh3_2)object).getValue();
        Object object4 = "<get-userInformation>(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = ServiceUtil.getToken((UserInformation)object3);
        if (object3 != null && (object4 = this.d) != null) {
            object = ((UserInformation)((hh3_2)object).getValue()).getUserId();
            String string2 = "getUserId(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ((h5_0)object4).d((String)object3, (String)object, (HashMap)object2);
        }
    }

    public final void Qa() {
        F62 f62;
        mu1_1 mu1_12;
        Object object = this.d;
        if (object != null && (object = ((h5_0)object).f) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new bt_0(this);
            ((LiveData)object).e(mu1_12, f62);
        }
        if ((object = this.d) != null && (object = ((h5_0)object).e) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new ct_0(this);
            ((LiveData)object).e(mu1_12, f62);
        }
    }

    public final void Ra(String object) {
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

    public final void Sa() {
        Object object = this.f;
        Object object2 = this.g;
        boolean bl2 = true;
        if (object != null && (object = ((CartDeliveryAddress)object).getId()) != null) {
            boolean bl3;
            object = ((ArrayList)object2).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl3 = object.hasNext()) {
                String string2;
                boolean bl4;
                object2 = object.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                object2 = (CartDeliveryAddress)object2;
                Object object3 = this.f;
                if (object3 != null) {
                    object3 = ((CartDeliveryAddress)object3).getId();
                } else {
                    bl4 = false;
                    object3 = null;
                }
                if (!(bl4 = kotlin.text.b.i((String)object3, string2 = ((CartDeliveryAddress)object2).getId(), false))) continue;
                this.f = object2;
                object = this.h;
                if (object != null) {
                    object.setEnabled(bl2);
                }
                break;
            }
        } else {
            boolean bl5;
            object = this.f;
            if (object == null && object2 != null && (bl5 = ((ArrayList)object2).size()) == bl2) {
                this.f = object = (CartDeliveryAddress)((ArrayList)object2).get(0);
                object2 = this.h;
                if (object2 != null) {
                    if (object == null) {
                        bl2 = false;
                    }
                    object2.setEnabled(bl2);
                }
            }
        }
    }

    public final void W0(CartDeliveryAddress cartDeliveryAddress) {
        gt_2 gt_22 = this;
        Object object = cartDeliveryAddress;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        NewCustomEventsRevamp newCustomEventsRevamp = this.o;
        String string2 = newCustomEventsRevamp.getEC_CHECKOUT_INTERACTIONS();
        String string3 = "change address";
        String string4 = "";
        String string5 = "change_address";
        String string6 = "address list screen - shipping";
        String string7 = "address management screen";
        String string8 = this.p;
        String string9 = this.q;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n3, null);
        this.f = cartDeliveryAddress;
        Object object2 = this.h;
        if (object2 != null) {
            boolean bl2;
            if (cartDeliveryAddress != null) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
            object2.setEnabled(bl2);
        }
        if ((object = gt_22.a) != null) {
            ((LT)object).b = object2 = gt_22.f;
        }
        if (object != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        this.setResultAndFinish();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.Qa();
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        Object object;
        n4 = 26;
        if (n3 == n4 && (object = this.d) != null) {
            n3 = 0;
            this.d = null;
            object = kd3_2.a();
            Object object2 = new AddressRepo();
            intent = this.requireActivity().getApplication();
            ((kd3_2)object).a = object2;
            ((kd3_2)object).b = intent;
            Intrinsics.checkNotNull(object);
            object2 = new E(this, (E$b)object);
            this.d = object = (h5_0)((E)object2).b(h5_0.class);
            this.Qa();
            this.Pa();
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (CheckoutAddressActivity)object;
        this.b = object;
    }

    public final void onClick(View view) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.checkout_address_tv_done;
        if (n3 == n4) {
            this.setResultAndFinish();
        } else {
            n4 = R$id.checkout_address_lbl_addaddress;
            if (n3 == n4) {
                NewCustomEventsRevamp newCustomEventsRevamp = this.o;
                String string3 = newCustomEventsRevamp.getEC_CHECKOUT_INTERACTIONS();
                int n7 = 1536;
                String string4 = "add address";
                String string5 = "";
                String string6 = "add_address";
                String string7 = "address list screen - shipping";
                String string8 = "address management screen";
                String string9 = this.p;
                String string10 = this.q;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, string5, string6, string7, string8, string9, null, string10, false, null, n7, null);
                n3 = 0;
                string2 = null;
                this.Ra(null);
            }
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        Object object3;
        super.onCreate((Bundle)object);
        boolean bl2 = true;
        this.setHasOptionsMenu(bl2);
        object = this.getArguments();
        if (object != null) {
            object = this.getArguments();
            object3 = "SELECTED_ADDRESS";
            object2 = null;
            if (object != null) {
                bl2 = object.containsKey((String)object3);
                object = bl2;
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                object = this.getArguments();
                if (object != null) {
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 33;
                    if (n3 >= n4) {
                        object = at_0.b((Bundle)object);
                    } else {
                        boolean bl3 = (object = object.getSerializable((String)object3)) instanceof CartDeliveryAddress;
                        if (bl3) {
                            object2 = object;
                        }
                        object = object2;
                        object = (CartDeliveryAddress)object2;
                    }
                    object2 = object;
                    object2 = (CartDeliveryAddress)object;
                }
                this.f = object2;
            }
        }
        object = kd3_2.a();
        object3 = new AddressRepo();
        object2 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object3;
        ((kd3_2)object).b = object2;
        Intrinsics.checkNotNull(object);
        object3 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object2 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        rd3_0 rd3_02 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object3 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
        object2 = h5_0.class;
        String string2 = "modelClass";
        object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object3, (Class)object2, string2);
        object3 = "<this>";
        object2 = sw0_0.a((Class)object2, (String)object3, (Class)object2, string2, string2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.d = object = (h5_0)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_checkout_address_lux;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_checkout_address_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "menuItem";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            this.setResultAndFinish();
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
        this.n.setPreviousScreenData("address list screen - shipping", "address management screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = og1_1.b();
        Object object3 = "Delivery Address";
        Object object4 = "findViewById(...)";
        if (n3 != 0) {
            int n4;
            n3 = R$id.checkout_address_toolbar_luxe;
            object2 = (Toolbar)object.findViewById(n3);
            int n7 = R$id.checkout_address_toolbar_title;
            View view = object.findViewById(n7);
            Intrinsics.checkNotNullExpressionValue(view, (String)object4);
            view = (TextView)view;
            if (object2 != null) {
                n4 = R$drawable.ic_luxe_back_arrow;
                ((Toolbar)object2).setNavigationIcon(n4);
            }
            if (object2 != null) {
                n4 = R$string.back_button_text;
                ((Toolbar)object2).setNavigationContentDescription(n4);
            }
            n4 = R$id.checkout_address_lbl_addaddress;
            this.i = object4 = (AjioTextView)object.findViewById(n4);
            if (object4 != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            if ((object4 = this.i) != null) {
                ((AjioTextView)object4).underlineText();
            }
            if ((object4 = this.b) != null) {
                ((AppCompatActivity)object4).setSupportActionBar((Toolbar)object2);
            }
            object4 = new eT(this);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object4);
            view.setText((CharSequence)object3);
        } else {
            n3 = R$id.checkout_address_collapse_toolbar;
            object2 = object.findViewById(n3);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            object2 = (CollapsingToolbarLayout)((Object)object2);
            int n8 = R$style.header_plp;
            ((CollapsingToolbarLayout)((Object)object2)).setCollapsedTitleTextAppearance(n8);
            n8 = R$style.expanded_toolbar_title;
            ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleTextAppearance(n8);
            n8 = mz3_0.d(16);
            int n10 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginTop();
            int n14 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginEnd();
            int n15 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginBottom();
            ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleMargin(n8, n10, n14, n15);
            n3 = R$id.checkout_address_toolbar;
            object2 = object.findViewById(n3);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            object2 = (Toolbar)object2;
            int n16 = R$drawable.nav_back;
            ((Toolbar)object2).setNavigationIcon(n16);
            n16 = R$string.back_button_text;
            ((Toolbar)object2).setNavigationContentDescription(n16);
            ((Toolbar)object2).setTitle((CharSequence)object3);
            int n17 = R$id.checkout_address_lbl_addaddress;
            this.i = object3 = (AjioTextView)object.findViewById(n17);
            if (object3 != null) {
                object3.setOnClickListener((View.OnClickListener)this);
            }
            object3 = new fT(this);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object3);
        }
        n3 = R$id.checkout_address_loader;
        object2 = (AjioLoaderView)object.findViewById(n3);
        this.j = object2;
        n3 = R$id.checkout_address_shimmer;
        object2 = object.findViewById(n3);
        this.k = object2;
        n3 = R$id.shipping_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n3);
        this.l = object2;
        n3 = R$id.checkout_address_rv;
        this.e = object2 = (RecyclerView)object.findViewById(n3);
        if (object2 != null) {
            object4 = this.b;
            Intrinsics.checkNotNull(object4);
            object3 = new LinearLayoutManager((Context)object4);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
        }
        n3 = R$id.checkout_progress_bar;
        object2 = (AjioProgressView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.checkout_address_tv_done;
        object = (AjioTextView)object.findViewById(n3);
        this.h = object;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.h) != null) {
            n3 = 0;
            object2 = null;
            object.setEnabled(false);
        }
        object2 = this.g;
        object = new LT((ArrayList)object2, this);
        this.a = object;
        ((LT)object).b = object2 = this.f;
        this.Pa();
        object = this.e;
        if (object != null) {
            object2 = this.a;
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        }
    }

    public final void setResultAndFinish() {
        Object object = this.b;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            boolean bl2 = object.isFinishing();
            if (!bl2 && (object = this.f) != null) {
                object = new Intent();
                Object object2 = this.f;
                int n3 = object2 instanceof Serializable;
                if (n3 != 0) {
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.io.Serializable");
                    String string2 = "BUNDLE_CART_ADDRESS";
                    object.putExtra(string2, (Serializable)object2);
                }
                if ((object2 = this.b) != null) {
                    n3 = -1;
                    object2.setResult(n3, (Intent)object);
                }
                if ((object = this.b) != null) {
                    object.finish();
                }
            }
        }
    }

    public final void y5(CartDeliveryAddress cartDeliveryAddress) {
        Object object = cartDeliveryAddress;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        NewCustomEventsRevamp newCustomEventsRevamp = this.o;
        String string2 = newCustomEventsRevamp.getEC_CHECKOUT_INTERACTIONS();
        String string3 = this.p;
        String string4 = this.q;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "edit address", "", "edit_address", "address list screen - shipping", "address management screen", string3, null, string4, false, null, 1536, null);
        Gson gson = new Gson();
        object = gson.toJson(cartDeliveryAddress);
        this.Ra((String)object);
    }
}

