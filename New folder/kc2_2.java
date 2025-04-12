/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import com.ril.ajio.view.BaseActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KC2
 */
public final class kc2_2
extends Fragment
implements FragmentTitlesInterface,
sc2_0,
OnNavigationClickListener {
    public static final KC2$a Companion;
    public RecyclerView a;
    public LinearLayoutManager b;
    public CustomToolbarViewMerger c;
    public boolean d;

    static {
        KC2$a kC2$a;
        Companion = kC2$a = new Object();
    }

    public final String getAjioTitle() {
        return "";
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.TITLE;
    }

    public final String getProductListDetail() {
        return "";
    }

    public final String getProductListTitle() {
        return "";
    }

    public final String getToolbarTitle() {
        return "Quick View";
    }

    public final Boolean hasBackButton() {
        return Boolean.FALSE;
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = (BaseActivity)this.getActivity();
        if (object != null) {
            int n3 = R$drawable.ic_close;
            String string2 = "Quick View";
            boolean bl2 = true;
            int n4 = 3;
            ((BaseActivity)object).showUpButton(bl2, n4, n3, string2);
        }
        if ((object = (BaseActivity)this.getActivity()) != null) {
            ((BaseActivity)object).setToolbarState(this);
        }
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        super.onCreate((Bundle)object);
        object = cp_1.Companion;
        FragmentManager fragmentManager = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
        object.getClass();
        cp$a.D(fragmentManager);
        this.d = bl2 = og1_1.b();
        this.c = object = new CustomToolbarViewMerger(this);
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater object) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        String string2 = "inflater";
        Intrinsics.checkNotNullParameter(object, string2);
        menu2.clear();
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$menu.cart_quickview_menu_luxe;
            object.inflate(n3, menu2);
            int bl2 = R$id.close;
            menu2 = menu2.findItem(bl2);
            object = hv3_0.K(R$string.acc_close_icon);
            ic2_0.a((String)object, (MenuItem)menu2);
            boolean bl3 = true;
            menu2.setVisible(bl3);
            menu2.setEnabled(bl3);
            menu2 = menu2.getActionView();
            if (menu2 != null) {
                object = new jc2_0(this);
                menu2.setOnClickListener((View.OnClickListener)object);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        this.setHasOptionsMenu(true);
        og1_1.g(this.d, false);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_quickview_cart_luxe;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        } else {
            n3 = R$layout.fragment_quickview_cart_refresh;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customToolbarViewMerger");
                object = null;
            }
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public final void onNavigationClick() {
        boolean bl2;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && !(bl2 = (fragmentActivity = this.requireActivity()).isFinishing()) && (fragmentActivity = this.getActivity()) != null) {
            fragmentActivity.onBackPressed();
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        int n7;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n8 = og1_1.b();
        Object object4 = null;
        Object object5 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
        if (n8 != 0) {
            n8 = R$id.quickview_toolbar_luxe;
            object2 = (Toolbar)object.findViewById(n8);
            object3 = this.getActivity();
            n7 = object3 instanceof AppCompatActivity;
            if (n7 != 0) {
                object3 = this.getActivity();
                Intrinsics.checkNotNull(object3, (String)object5);
                object3 = (AppCompatActivity)object3;
                ((AppCompatActivity)object3).setSupportActionBar((Toolbar)object2);
                object2 = this.getActivity();
                Intrinsics.checkNotNull(object2, (String)object5);
                object2 = ((AppCompatActivity)object2).getSupportActionBar();
                if (object2 != null) {
                    ((ActionBar)object2).q();
                }
            }
        } else {
            Object object6;
            object2 = this.getActivity();
            n8 = object2 instanceof AppCompatActivity;
            object3 = "customToolbarViewMerger";
            if (n8 != 0) {
                object2 = this.getActivity();
                Intrinsics.checkNotNull(object2, (String)object5);
                object2 = (AppCompatActivity)object2;
                object5 = this.c;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n4 = 0;
                    object5 = null;
                }
                object5 = ((CustomToolbarViewMerger)object5).getToolbar();
                ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object5);
            }
            if ((object2 = this.c) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object6 = null;
            } else {
                object6 = object2;
            }
            object2 = ((CustomToolbarViewMerger)object6).getToolbar();
            if (object2 != null) {
                object2.invalidate();
            }
            ((CustomToolbarViewMerger)object6).setSubTitleVisibility(8);
            n8 = R$string.quick_view_refresh;
            object2 = this.getString(n8);
            object5 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            ((CustomToolbarViewMerger)object6).setTitleText((String)object2);
            ((CustomToolbarViewMerger)object6).setNavigationClick();
            int n10 = R$drawable.ic_cancel_small_refresh;
            n8 = R$string.close;
            String string2 = this.getString(n8);
            String string3 = "cartpage";
            int n14 = 8;
            CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object6, n10, string2, string3, null, n14, null);
        }
        n8 = R$id.quickview_cart_list;
        object = (RecyclerView)object.findViewById(n8);
        this.a = object;
        object2 = this.requireActivity();
        object = new LinearLayoutManager((Context)object2);
        n8 = 1;
        ((LinearLayoutManager)object).setOrientation(n8);
        object2 = this.a;
        object5 = "quickViewList";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n8 = 0;
            object2 = null;
        }
        ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        this.b = object;
        object = this.getArguments();
        if (object != null && (n7 = object.containsKey((String)(object2 = "quickview"))) != 0) {
            int n15;
            n7 = Build.VERSION.SDK_INT;
            n3 = 33;
            if (n7 >= n3) {
                object = hc2_0.a((Bundle)object);
            } else {
                n8 = (object = object.getSerializable((String)object2)) instanceof QuickViewProduct;
                if (n8 == 0) {
                    n15 = 0;
                    object = null;
                }
                object = (QuickViewProduct)object;
            }
            object = (QuickViewProduct)object;
            if (object != null) {
                object3 = ((QuickViewProduct)object).getProducts();
                object2 = new nc2_0(this, (List)object3);
                object3 = this.a;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n7 = 0;
                    object3 = null;
                }
                ((RecyclerView)object3).setAdapter((RecyclerView$f)object2);
                n8 = ((QuickViewProduct)object).getSelectedIndex();
                n4 = -1;
                if (n8 > n4) {
                    object2 = this.b;
                    if (object2 == null) {
                        object2 = "layoutManager";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object4 = object2;
                    }
                    n15 = ((QuickViewProduct)object).getSelectedIndex();
                    n8 = mz3_0.d(40);
                    ((LinearLayoutManager)object4).scrollToPositionWithOffset(n15, n8);
                }
            }
        }
    }

    public final void y9(String string2, String string3) {
        Object object = this.getActivity();
        boolean bl2 = object instanceof AjioHomeActivity;
        if (bl2 && (bl2 = (object = this.getParentFragment()) instanceof qn_2)) {
            boolean bl3;
            object = this.getParentFragment();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.cart.CartFragment");
            object = (qn_2)object;
            Object object2 = ((Fragment)object).getActivity();
            if (object2 != null && !(bl3 = (object2 = ((Fragment)object).requireActivity()).isFinishing())) {
                object2 = ((Fragment)object).requireActivity();
                ((ComponentActivity)object2).onBackPressed();
            }
            if ((object = ((qn_2)object).i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pdpListener");
                bl2 = false;
                object = null;
            }
            object2 = object;
            int n3 = 1003;
            object.S0(n3, string2, string3, null, null);
        }
    }
}

