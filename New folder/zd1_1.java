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
 *  android.view.ViewGroup
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.D;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from ZD1
 */
public final class zd1_1
extends Q51 {
    public static final ZD1$a Companion;
    public final D f;
    public final D g;
    public nm_1 h;
    public A71 i;
    public jo_2 j;
    public ComposeView k;
    public ConstraintLayout l;
    public ConstraintLayout m;
    public AppCompatImageView n;
    public LinearLayout o;
    public TextView p;
    public TextView q;

    static {
        ZD1$a zD1$a;
        Companion = zD1$a = new Object();
    }

    public zd1_1() {
        Object object = new ZD1$h(this);
        Object object2 = et1_2.NONE;
        Object object3 = new ZD1$i((ZD1$h)object);
        object = yr1_2.a(object2, (Function0)object3);
        object3 = Reflection.getOrCreateKotlinClass(bf1_2.class);
        Lambda lambda = new ZD1$j((rq1_2)object);
        Lambda lambda2 = new ZD1$k((rq1_2)object);
        Lambda lambda3 = new ZD1$l(this, (rq1_2)object);
        this.f = object = LW0.a(this, (yn1_2)object3, lambda, lambda2, lambda3);
        object = new ZD1$m(this);
        object3 = new ZD1$n((ZD1$m)object);
        object = yr1_2.a(object2, (Function0)object3);
        object3 = Reflection.getOrCreateKotlinClass(j7_0.class);
        super((rq1_2)object);
        super((rq1_2)object);
        super(this, (rq1_2)object);
        LW0.a(this, (yn1_2)object3, lambda, lambda2, lambda3);
        object = new ZD1$c(this);
        object3 = new ZD1$d((ZD1$c)object);
        object = yr1_2.a(object2, (Function0)object3);
        object2 = Reflection.getOrCreateKotlinClass(oa1_1.class);
        object3 = new ZD1$e((rq1_2)object);
        super((rq1_2)object);
        super(this, (rq1_2)object);
        this.g = object = LW0.a(this, (yn1_2)object2, (Function0)object3, lambda, lambda2);
    }

    public final TextView Pa() {
        TextView textView = this.p;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvMenuCartCountLuxe");
        return null;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof nm_1;
        if (bl2) {
            object2 = object;
            this.h = object2 = (nm_1)object;
        } else {
            object2 = yn3_0.a;
            String string2 = pn_2.b(object, " must implement CartClosetListener");
            Object[] objectArray = new Object[]{};
            ((yn3$a)object2).d(string2, objectArray);
        }
        bl2 = object instanceof A71;
        if (bl2) {
            object = (A71)object;
            this.i = object;
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
        this.j = object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_luxe_category;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        bf1_2 bf1_22 = (bf1_2)this.f.getValue();
        bf1_22.getClass();
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
        int n4 = ((jo_2)bf1_22.c.getValue()).d();
        bundle.putInt(string2, n4);
        vb0_0.a(AnalyticsManager.Companion, string3, bundle);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.compose_luxe_category;
        object2 = (ComposeView)object.findViewById(n4);
        this.k = object2;
        n4 = R$id.category_lyt_luxe_revamp;
        object2 = (ConstraintLayout)object.findViewById(n4);
        Object object3 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.l = object2;
        n4 = R$id.category_title;
        object2 = (TextView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.q = object2;
        n4 = R$id.search_lyt_parent_luxe_revamp;
        object2 = (ConstraintLayout)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.m = object2;
        n4 = R$id.wishlist_iv_luxe_revamp;
        object2 = (AppCompatImageView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.n = object2;
        n4 = R$id.menu_cart_layout_luxe_revamp;
        object2 = (LinearLayout)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.o = object2;
        n4 = R$id.menu_cart_count_tv_luxe_revamp;
        object2 = (TextView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.p = object2;
        n4 = R$id.top_toolbar_luxe_lyt_revamp;
        object = (ConstraintLayout)object.findViewById(n4);
        if (object != null) {
            n4 = R$string.acc_page_header_categories;
            object2 = hv3_0.K(n4);
            object.setContentDescription((CharSequence)object2);
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        boolean bl2 = true;
        object3 = new k9(object, (int)(bl2 ? 1 : 0));
        long l2 = 500L;
        object2.postDelayed((Runnable)object3, l2);
        object = this.m;
        n4 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeaderLayout");
            n3 = 0;
            object = null;
        }
        int n7 = 8;
        object.setVisibility(n7);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryHeaderLayout");
            n3 = 0;
            object = null;
        }
        n7 = 0;
        object3 = null;
        object.setVisibility(0);
        object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCategoryTitle");
            n3 = 0;
            object = null;
        }
        bl2 = true;
        object.setAllCaps(bl2);
        object = this.i;
        if (object != null) {
            object.c(false);
        }
        if ((object = this.j) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
            n3 = 0;
            object = null;
        }
        if ((n3 = object.d()) == 0) {
            ai0_2.i((View)this.Pa());
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object3 = "enable_highlight_empty_cart";
            n3 = (int)(object.a((String)object3) ? 1 : 0);
            if (n3 != 0) {
                object = this.Pa();
                ai0_2.B(object);
            } else {
                object = this.Pa();
                ai0_2.i(object);
            }
        } else {
            object3 = this.Pa();
            ai0_2.B((View)object3);
            n7 = 9;
            if (n3 > n7) {
                object = this.Pa();
                object3 = hv3_0.f("9<sup>+</sup>");
                object.setText((CharSequence)object3);
            } else {
                object3 = this.Pa();
                object = String.valueOf(n3);
                object3.setText((CharSequence)object);
            }
        }
        object = (bf1_2)this.f.getValue();
        object3 = this.getActivity();
        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        object3 = (AjioHomeActivity)object3;
        object.getClass();
        Intrinsics.checkNotNullParameter(object3, "ajioHomeActivity");
        object.h = object3;
        Object object4 = "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.OnNavigationClickListener";
        Intrinsics.checkNotNull(object3, (String)object4);
        object.g = object3;
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            n3 = 0;
            object = null;
        }
        object3 = new ee1_2(this);
        int n8 = 32615281;
        object4 = new u10(n8, object3, bl2);
        object.setContent((Function2)object4);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivWishListLuxe");
            n3 = 0;
            object = null;
        }
        bl2 = false;
        object3 = new yd1_0(this, 0);
        object.setOnClickListener((View.OnClickListener)object3);
        object = this.o;
        if (object != null) {
            object2 = object;
        } else {
            object = "cartMenuLayoutLuxe";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        }
        object = new m9(this, 2);
        object2.setOnClickListener((View.OnClickListener)object);
    }
}

