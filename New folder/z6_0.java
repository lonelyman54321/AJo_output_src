/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.D;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;

/*
 * Renamed from z6
 */
public final class z6_0
extends x41_0 {
    public static final z6$a Companion;
    public final D g;
    public final D h;
    public nm_1 i;
    public A71 j;
    public jo_2 k;
    public ComposeView l;
    public LinearLayout m;
    public ConstraintLayout n;
    public ConstraintLayout o;
    public ConstraintLayout p;
    public AppCompatImageView q;
    public LinearLayout r;
    public TextView s;
    public TextView t;
    public AppCompatImageView u;
    public View v;
    public yT1 w;
    public aw0_0 x;

    static {
        z6$a z6$a;
        Companion = z6$a = new Object();
    }

    public z6_0() {
        Object object = new z6$c(this);
        Object object2 = et1_2.NONE;
        Object object3 = new z6$d((z6$c)object);
        object = yr1_2.a(object2, (Function0)object3);
        object3 = Reflection.getOrCreateKotlinClass(j7_0.class);
        Lambda lambda = new z6$e((rq1_2)object);
        Lambda lambda2 = new z6$f((rq1_2)object);
        z6$g z6$g = new z6$g(this, (rq1_2)object);
        this.g = object = LW0.a(this, (yn1_2)object3, lambda, lambda2, z6$g);
        object = new z6$h(this);
        object3 = new z6$i((z6$h)object);
        object = yr1_2.a(object2, (Function0)object3);
        object2 = Reflection.getOrCreateKotlinClass(oa1_1.class);
        object3 = new z6$j((rq1_2)object);
        super((rq1_2)object);
        super(this, (rq1_2)object);
        this.h = object = LW0.a(this, (yn1_2)object2, (Function0)object3, lambda, lambda2);
    }

    public final TextView Qa() {
        TextView textView = this.s;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvMenuCartCountAjio");
        return null;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof nm_1;
        if (bl2) {
            object2 = object;
            this.i = object2 = (nm_1)object;
        } else {
            object2 = yn3_0.a;
            String string2 = pn_2.b(object, " must implement CartClosetListener");
            Object[] objectArray = new Object[]{};
            ((yn3$a)object2).d(string2, objectArray);
        }
        bl2 = object instanceof A71;
        if (bl2) {
            object = (A71)object;
            this.j = object;
            return;
        }
        object = pn_2.b(object, " must implement HomeListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Context context = this.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        object = new jo_2(context);
        this.k = object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ajio_category;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2;
        String string2;
        String string3;
        Object object = od3_2.a;
        int n3 = object.length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        n3 = (int)(s20.a ? 1 : 0);
        int n4 = 1;
        boolean bl3 = false;
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = 1;
        }
        if (n3 != 0 || (bl2 = Intrinsics.areEqual(object, string3 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
            bl3 = true;
        }
        if (bl3 && (bl2 = kotlin.text.b.i(object = od3_2.a(), string3 = ld3_2.STORE_AJIOGRAM.getStoreId(), n4 != 0))) {
            bundle = super.onGetLayoutInflater(bundle);
            string3 = this.requireContext();
            n4 = R$style.FleekTheme;
            object = new d80((Context)string3, n4);
            bundle = bundle.cloneInContext((Context)object);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        return super.onGetLayoutInflater(bundle);
    }

    public final void onResume() {
        super.onResume();
        j7_0 j7_02 = (j7_0)this.g.getValue();
        j7_02.getClass();
        String string2 = "number_of_items_on_cart";
        Intrinsics.checkNotNullParameter(string2, "pageTitle");
        Bundle bundle = new Bundle();
        bundle.putString("page_type", string2);
        boolean bl2 = true;
        bundle.putBoolean("served_from_cms", bl2);
        String string3 = "navigation - all categories screen";
        bundle.putString("ecomm_pageType", string3);
        String string4 = od3_2.a();
        Object object = CustomerStoreType.a;
        object = ScreenType.SCREEN_HOME;
        string4 = CustomerStoreType.a(string4, (ScreenType)((Object)object));
        int n3 = string4.length();
        if (n3 > 0) {
            object = "user_personalization_bucket";
            bundle.putString((String)object, string4);
        }
        int n4 = ((jo_2)j7_02.f.getValue()).d();
        bundle.putInt(string2, n4);
        vb0_0.a(AnalyticsManager.Companion, string3, bundle);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        Object object4;
        int n4;
        Object object5 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        super.onViewCreated((View)object, (Bundle)object2);
        int n7 = R$id.compose_ajio_category;
        object2 = (ComposeView)object.findViewById(n7);
        this.l = object2;
        n7 = R$id.top_toolbar_ajio_lyt_revamp;
        object2 = (ConstraintLayout)object.findViewById(n7);
        if (object2 != null) {
            n4 = R$string.acc_page_header_categories;
            object5 = hv3_0.K(n4);
            object2.setContentDescription((CharSequence)object5);
        }
        Object object6 = Looper.getMainLooper();
        object5 = new Handler((Looper)object6);
        object6 = new w6(object2, 0);
        long l2 = 500L;
        object5.postDelayed((Runnable)object6, l2);
        n7 = R$id.category_lyt_ajio_revamp;
        object2 = (LinearLayout)object.findViewById(n7);
        object5 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.m = object2;
        n7 = R$id.cl_main_toolbar;
        object2 = (ConstraintLayout)object.findViewById(n7);
        this.p = object2;
        n7 = R$id.category_title;
        object2 = (TextView)object.findViewById(n7);
        this.t = object2;
        n7 = R$id.close_btn_category;
        object2 = object.findViewById(n7);
        object6 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
        object2 = (ImageView)object2;
        int n8 = hu1_2.e();
        Object object7 = null;
        int n10 = 1;
        if (n8 != 0 && (object6 = this.getArguments()) != null && (n8 = object6.containsKey((String)(object4 = "IS_CATEGORY_POPUP"))) == n10) {
            ai0_2.B((View)object2);
        } else {
            String string2;
            object6 = od3_2.a;
            int n14 = ((String)object6).length();
            if (n14 == 0) {
                object6 = od3_2.a();
            }
            if ((n14 = (int)(s20.a ? 1 : 0)) == 0 && (n14 = (int)(Intrinsics.areEqual(object4 = od3_2.a(), string2 = (object3 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && (n8 = Intrinsics.areEqual(object6, object4 = object3.getStoreId())) == 0) {
                object6 = this.j;
                if (object6 != null) {
                    object6.f(false);
                }
            } else {
                object6 = this.getActivity();
                n14 = object6 instanceof AjioHomeActivity;
                if (n14 != 0) {
                    object6 = (AjioHomeActivity)object6;
                } else {
                    n8 = 0;
                    object6 = null;
                }
                if (object6 != null) {
                    ((AjioHomeActivity)object6).p3();
                }
            }
            ai0_2.i((View)object2);
        }
        object6 = new x6(this, 0);
        object2.setOnClickListener((View.OnClickListener)object6);
        object6 = od3_2.a();
        object4 = ld3_2.STORE_AJIOGRAM;
        object3 = ((ld3_2)((Object)object4)).getStoreId();
        n8 = Intrinsics.areEqual(object6, object3);
        if (n8 != 0) {
            ai0_2.i((View)object2);
        }
        n7 = R$id.search_lyt_parent_ajio_revamp;
        object2 = (ConstraintLayout)object.findViewById(n7);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.n = object2;
        n7 = R$id.wishlist_iv_ajio_revamp;
        object2 = (AppCompatImageView)object.findViewById(n7);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.q = object2;
        n7 = R$id.menu_cart_layout_ajio_revamp;
        object2 = (LinearLayout)object.findViewById(n7);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.r = object2;
        n7 = R$id.menu_cart_count_tv_ajio_revamp;
        object2 = (TextView)object.findViewById(n7);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.s = object2;
        n7 = R$id.menu_notification_layout_ajio_revamp;
        object2 = (ConstraintLayout)object.findViewById(n7);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.o = object2;
        n7 = R$id.menu_cart_iv;
        object2 = (AppCompatImageView)object.findViewById(n7);
        this.u = object2;
        n7 = R$id.shadow;
        this.v = object = object.findViewById(n7);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeaderLayout");
            n3 = 0;
            object = null;
        }
        n7 = 8;
        object.setVisibility(n7);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationMenuLayoutAjio");
            n3 = 0;
            object = null;
        }
        object.setVisibility(n7);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryHeaderLayout");
            n3 = 0;
            object = null;
        }
        object.setVisibility(0);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
            n3 = 0;
            object = null;
        }
        if ((n3 = object.d()) == 0) {
            ai0_2.i((View)this.Qa());
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object5 = "enable_highlight_empty_cart";
            n3 = (int)(object.a((String)object5) ? 1 : 0);
            if (n3 != 0) {
                object = this.Qa();
                ai0_2.B(object);
            } else {
                object = this.Qa();
                ai0_2.i(object);
            }
        } else {
            object5 = this.Qa();
            ai0_2.B((View)object5);
            n4 = 9;
            if (n3 > n4) {
                object = this.Qa();
                object5 = hv3_0.f("9<sup>+</sup>");
                object.setText((CharSequence)object5);
            } else {
                object5 = this.Qa();
                object = String.valueOf(n3);
                object5.setText((CharSequence)object);
            }
        }
        object = (j7_0)this.g.getValue();
        object5 = this.getActivity();
        Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        object5 = (AjioHomeActivity)object5;
        object.getClass();
        Intrinsics.checkNotNullParameter(object5, "ajioHomeActivity");
        object.b = object5;
        object6 = "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.OnNavigationClickListener";
        Intrinsics.checkNotNull(object5, (String)object6);
        object.g = object5;
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            n3 = 0;
            object = null;
        }
        object5 = new e6_0(this);
        int n15 = 1770054225;
        object6 = new u10(n15, object5, n10 != 0);
        object.setContent((Function2)object6);
        object = od3_2.a();
        object5 = ((ld3_2)((Object)object4)).getStoreId();
        n3 = (int)(Intrinsics.areEqual(object, object5) ? 1 : 0);
        object5 = "ivWishListAjio";
        if (n3 != 0) {
            object = this.p;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clMainToolbar");
                n3 = 0;
                object = null;
            }
            object6 = this.requireActivity();
            n15 = R$color.color_060c10;
            n8 = t6.a((FragmentActivity)object6, n15);
            object.setBackgroundColor(n8);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                n3 = 0;
                object = null;
            }
            object6 = this.requireActivity();
            n15 = R$color.white;
            n8 = t6.a((FragmentActivity)object6, n15);
            object.setTextColor(n8);
            object = this.q;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n3 = 0;
                object = null;
            }
            object6 = this.requireActivity();
            n15 = R$color.white;
            n8 = t6.a((FragmentActivity)object6, n15);
            object.setColorFilter(n8);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("menuCartIv");
                n3 = 0;
                object = null;
            }
            object6 = this.requireActivity();
            n15 = R$color.white;
            n8 = t6.a((FragmentActivity)object6, n15);
            object.setColorFilter(n8);
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shadowView");
                n3 = 0;
                object = null;
            }
            object.setVisibility(n7);
        }
        object = h40_0.a;
        n3 = (int)(h40_0.c() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(object = od3_2.a(), object2 = ((ld3_2)((Object)object4)).getStoreId()) ? 1 : 0)) != 0 && (object = this.getView()) != null) {
            object.setFocusableInTouchMode(n10 != 0);
            object.requestFocus();
            object2 = new y6(this);
            object.setOnKeyListener((View.OnKeyListener)object2);
        }
        if ((object = this.q) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object = null;
        }
        object2 = new u6(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.r;
        if (object != null) {
            object7 = object;
        } else {
            object = "cartMenuLayoutAjio";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        }
        object = new v6(this);
        object7.setOnClickListener((View.OnClickListener)object);
    }
}

