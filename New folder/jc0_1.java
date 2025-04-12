/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jC0
 */
public final class jc0_1
extends q51_0
implements fC0$d {
    public static final jC0$a Companion;
    public ExReturnAddressActivity f;
    public final ArrayList g;
    public fc0_1 h;
    public h5_0 i;
    public String j;
    public boolean k;
    public final jC0$b l;
    public final hh3_2 m;

    static {
        jC0$a jC0$a;
        Companion = jC0$a = new Object();
    }

    public jc0_1(jC0$b object) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(object, "onNoItemCallback");
        this.g = arrayList = new ArrayList();
        this.l = object;
        object = new ic0_2(this, 0);
        this.m = object = yr1_2.b((Function0)object);
    }

    public final void Pa(String object) {
        boolean bl2;
        boolean bl3;
        Object object2 = this.f;
        if (object2 != null && (bl3 = object2.isFinishing()) != (bl2 = true) && !(bl3 = TextUtils.isEmpty((CharSequence)object))) {
            this.j = object;
            object = this.f;
            Intrinsics.checkNotNull(object);
            object = ((ExReturnAddressActivity)object).k0;
            if (object != null) {
                ((AjioLoaderView)((Object)object)).startLoader();
            }
            object = p3.a("client_type", "Android");
            AJIOApplication.Companion.getClass();
            object2 = p90.a((Context)AJIOApplication$a.a());
            ((HashMap)object).put("client_version", object2);
            object2 = this.m;
            Object object3 = (UserInformation)((hh3_2)object2).getValue();
            Object object4 = "<get-userInformation>(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object3 = ServiceUtil.getToken((UserInformation)object3);
            if (object3 != null && (object4 = this.i) != null) {
                object2 = ((UserInformation)((hh3_2)object2).getValue()).getUserId();
                Intrinsics.checkNotNullExpressionValue(object2, "getUserId(...)");
                String string2 = this.j;
                String string3 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(string2, string3);
                ((h5_0)object4).e((String)object3, (String)object2, (HashMap)object, string2);
            }
            object = this.f;
            hv3_0.S((Activity)object);
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (ExReturnAddressActivity)object;
        this.f = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
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
        rd3_0 rd3_02 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object3 = h5_0.class;
        String string2 = "modelClass";
        object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object2, (Class)object3, string2);
        object2 = ef0_0.a((Class)object3, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.i = object = (h5_0)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ex_return_store_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Object object3;
        Object object4;
        int n3;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.f;
        String string2 = null;
        if (object2 != null) {
            object2 = ((ExReturnAddressActivity)object2).t0;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
            int n7;
            object2 = this.f;
            if (object2 != null) {
                object2 = ((ExReturnAddressActivity)object2).s0;
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = this.f;
                if (object2 != null) {
                    object2 = ((ExReturnAddressActivity)object2).s0;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n3 = ((ArrayList)object2).size();
            } else {
                n3 = 0;
                object2 = null;
            }
            object4 = this.f;
            if (object4 != null) {
                object4 = ((ExReturnAddressActivity)object4).t0;
            } else {
                n7 = 0;
                object4 = null;
            }
            if (object4 != null && (n7 = object4.isEmpty()) == 0) {
                object4 = this.f;
                if (object4 != null) {
                    object4 = ((ExReturnAddressActivity)object4).t0;
                } else {
                    n7 = 0;
                    object4 = null;
                }
                Intrinsics.checkNotNull(object4);
                n7 = ((ArrayList)object4).size();
            } else {
                n7 = 0;
                object4 = null;
            }
            int n8 = R$string.items_elligible;
            object2 = n3;
            object4 = n7;
            int n10 = 2;
            Object[] objectArray = new Object[n10];
            objectArray[0] = object2;
            objectArray[n4] = object4;
            hv3_0.L(n8, objectArray);
        } else {
            n3 = R$string.all_items_are_eligible;
            hv3_0.K(n3);
        }
        object2 = this.i;
        if (object2 != null && (object2 = ((h5_0)object2).b) != null) {
            object4 = this.getViewLifecycleOwner();
            object3 = new hc0_0(this);
            ((LiveData)object2).e((mu1_1)object4, (F62)object3);
        }
        n3 = R$id.ex_return_store_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (RecyclerView)object;
        object4 = this.f;
        Intrinsics.checkNotNull(object4);
        object2 = new LinearLayoutManager((Context)object4);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        ((RecyclerView)object).setHasFixedSize(n4 != 0);
        object4 = this.g;
        Intrinsics.checkNotNullParameter(object4, "dataList");
        object3 = "findStoreClickListener";
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object2 = new RecyclerView$f();
        ((fc0_1)object2).a = object4;
        ((fc0_1)object2).b = this;
        this.h = object2;
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        object = this.f;
        if (object != null) {
            object = ((ExReturnAddressActivity)object).s0;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null && !(bl2 = object.isEmpty())) {
            n3 = 5;
            object = new gc0_0(n3, null);
            ((ArrayList)object4).add(object);
            object = new gc0_0(n4, null);
            ((ArrayList)object4).add(object);
            object = this.h;
            if (object != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            if ((object = this.f) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = ((ExReturnAddressActivity)object).p0)))) {
                object = this.f;
                if (object != null) {
                    string2 = ((ExReturnAddressActivity)object).p0;
                }
                this.j = string2;
                this.Pa(string2);
            }
        } else {
            n3 = 4;
            object = new gc0_0(n3, null);
            ((ArrayList)object4).add(object);
            object = this.h;
            if (object != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            if ((object = this.l) != null) {
                object.k1(false);
            }
        }
        AnalyticsManager.Companion.getInstance().getGa().trackBannerImpressionEvent("Store Returns", "Store Returns visible to customer:");
    }

    public final void v() {
        Handler handler = new Handler();
        El0 el0 = new El0(this, 1);
        handler.postDelayed((Runnable)el0, 500L);
    }

    public final void w(String string2) {
        Intrinsics.checkNotNullParameter(string2, "pincode");
        this.k = true;
        this.Pa(string2);
    }
}

