/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.PickFromStoreRepo;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreAddress;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dU
 */
public final class du_1
extends Fragment
implements a82_0 {
    public static final dU$a Companion;
    public yt_0 a;
    public AppCompatActivity b;
    public RecyclerView c;
    public final ArrayList d;
    public ys2_1 e;
    public StoreNode f;
    public String g;
    public l82_0 h;
    public final UserInformation i;
    public final NewCustomEventsRevamp j;
    public final NewEEcommerceEventsRevamp k;
    public final String l;
    public final String m;

    static {
        dU$a dU$a;
        Companion = dU$a = new Object();
    }

    public du_1() {
        Object object = new ArrayList();
        this.d = object;
        this.g = "";
        this.i = object = VX0.a(AJIOApplication.Companion);
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.j = object2;
        this.k = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.l = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.m = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
    }

    public final void C7(String string2, String string3, String string4, Bundle bundle, String string5) {
        Intrinsics.checkNotNullParameter(string2, "eventAction");
        Intrinsics.checkNotNullParameter(string3, "eventCategory");
        Intrinsics.checkNotNullParameter(string4, "eventLabel");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        String string6 = this.l;
        String string7 = this.m;
        NewCustomEventsRevamp.newPushCustomEvent$default(this.j, string3, string2, string4, string5, "store pickup", "shipping screen", string6, bundle, string7, false, null, 1536, null);
    }

    public final void L4(StoreNode storeNode) {
        this.f = storeNode;
        Object object = this.a;
        if (object != null) {
            ((yt_0)object).c = storeNode;
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        if ((object = this.h) != null) {
            object.v5(storeNode);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (AppCompatActivity)object;
        this.b = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = kd3_2.a();
        Object object2 = new PickFromStoreRepo();
        Object object3 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        object2 = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
        Intrinsics.checkNotNull(object);
        object3 = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object, string2);
        rd3_0 rd3_02 = object2.getViewModelStore();
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = object2.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object3 = new pD3(rd3_02, (E$b)object, (Wd0)object2);
        object = ys2_1.class;
        object2 = "modelClass";
        object = do_0.a((Class)object, (String)object2, (Class)object, (String)object2, (String)object2);
        Intrinsics.checkNotNullParameter(object, "<this>");
        object2 = object.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.e = object = (ys2_1)((pD3)object3).a((yn1_2)object, (String)object2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_checkout_store_address_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        du_1 du_12 = this;
        Object object = "menuItem";
        Object object2 = menuItem;
        Intrinsics.checkNotNullParameter(menuItem, (String)object);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            object = this.b;
            if (object != null && (n3 = (int)(object.isFinishing() ? 1 : 0)) == 0) {
                object = new Intent();
                object2 = this.f;
                if (object2 != null) {
                    Object object3 = this.j;
                    Object object4 = ((NewCustomEventsRevamp)object3).getEC_CHECKOUT_INTERACTIONS();
                    object2 = this.f;
                    String string2 = null;
                    Object object5 = object2 != null ? (object2 = ((StoreNode)object2).getStoreName()) : null;
                    Intrinsics.checkNotNull(object5);
                    String string3 = "find store search select";
                    String string4 = "store_search_select";
                    String string5 = "shipping screen";
                    String string6 = "shipping screen";
                    String string7 = du_12.l;
                    String string8 = du_12.m;
                    int n7 = 1664;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, string3, (String)object5, string4, string5, string6, string7, null, string8, false, null, n7, null);
                    object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object3 = du_12.g;
                    object4 = du_12.f;
                    if (object4 != null && (object4 = ((StoreNode)object4).getStoreAddress()) != null) {
                        string2 = ((StoreAddress)object4).getPostalCode();
                    }
                    object4 = string2;
                    object5 = " search";
                    object3 = y02.a((String)object3, " store selected after ", string2, (String)object5);
                    object4 = "Shipping Address Screen";
                    string3 = "Pick from Store-Shipping";
                    ((GTMEvents)object2).pushButtonTapEvent(string3, object3, (String)object4);
                    object2 = "BUNDLE_STORE_NODE";
                    object3 = du_12.f;
                    object.putExtra((String)object2, (Serializable)object3);
                }
                if ((object2 = du_12.b) != null) {
                    n4 = -1;
                    object2.setResult(n4, (Intent)object);
                }
                if ((object = du_12.b) != null) {
                    object.finish();
                }
            }
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onStop() {
        super.onStop();
        this.k.setPreviousScreenData("store pickup", "shipping screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.checkout_store_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        boolean bl2 = og1_1.b();
        if (bl2 && (object = this.c) != null) {
            n3 = hv3_0.m(R$color.luxe_color_F5F5F5);
            object.setBackgroundColor(n3);
        }
        object = this.b;
        object2 = "null cannot be cast to non-null type com.ril.ajio.payment.activity.CheckoutAddressActivity";
        Intrinsics.checkNotNull(object, (String)object2);
        object = ((CheckoutAddressActivity)object).p0;
        this.g = object;
        object = this.c;
        if (object != null) {
            object3 = this.b;
            Intrinsics.checkNotNull(object3);
            object2 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        object = this.d;
        int n4 = 1;
        dU$b dU$b = null;
        object2 = new kc3_1(n4, null);
        ((ArrayList)object).add(object2);
        object2 = new yt_0((ArrayList)object, this);
        this.a = object2;
        object = this.c;
        if (object != null) {
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        }
        if ((object = this.e) != null && (object = ((ys2_1)object).c) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new bu_0(this);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.e) != null && (object = ((ys2_1)object).d) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new cu_0(this, 0);
            dU$b = new dU$b((cu_0)object3);
            ((LiveData)object).e((mu1_1)object2, dU$b);
        }
        object = new Handler();
        object2 = new ZT(this, 0);
        object.postDelayed((Runnable)object2, 600L);
    }

    public final void v() {
        Handler handler = new Handler();
        au_1 au_12 = new au_1(this);
        handler.postDelayed((Runnable)au_12, 500L);
    }

    public final void w(String object) {
        String string2;
        boolean bl2;
        Object object2;
        int n3;
        Object object3 = "pincode";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.h;
        if (object4 != null) {
            n3 = 0;
            object2 = null;
            object4.X9(false);
        }
        hv3_0.S(this.b);
        this.g = object;
        HashMap hashMap = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        object4 = p90.a((Context)AJIOApplication$a.a());
        object2 = "client_version";
        hashMap.put(object2, object4);
        hashMap.put(object3, object);
        object = this.i;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((UserInformation)object).getUserId()))) && (bl2 = ap_0.b()) && (string2 = ServiceUtil.getToken((UserInformation)object)) != null && (object3 = this.e) != null) {
            String string3 = ((UserInformation)object).getUserId();
            Intrinsics.checkNotNullExpressionValue(string3, "getUserId(...)");
            object = ap_0.c;
            if (object == null) {
                object = "";
            }
            Intrinsics.checkNotNullParameter(string3, "userId");
            String string4 = "pickFromStoreList";
            Intrinsics.checkNotNullParameter(string4, "requestID");
            Intrinsics.checkNotNullParameter(string2, "accessToken");
            Intrinsics.checkNotNullParameter(object, "cartID");
            Intrinsics.checkNotNullParameter(hashMap, "query");
            object = ((ys2_1)object3).b.getPickUpStoreList(string3, string4, string2, (String)object, hashMap);
            n3 = 2;
            object4 = new zc0_1(object3, n3);
            int n4 = 2;
            object2 = new ad0_2(n4, (Function1)object4);
            object4 = new xs2_2((ys2_1)object3);
            int n7 = 3;
            gc_0 gc_02 = new gc_0(n7, (Function1)object4);
            object = ((g53_0)object).f((o60_0)object2, gc_02);
            object3 = ((ys2_1)object3).a;
            ((t30_0)object3).b((yr0_2)object);
        }
    }
}

