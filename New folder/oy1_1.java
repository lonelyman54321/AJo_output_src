/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$f$a;
import androidx.recyclerview.widget.RecyclerView$o;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.anim.CustomCoordinatorBehavior;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductfnlProductData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;

/*
 * Renamed from oY1
 */
public class oy1_1
extends Fragment
implements p82_0,
OnNavigationClickListener,
nr2_1,
s82_0,
J43,
sg1_2,
hy0_0 {
    public static final oY1$a Companion;
    public final String A;
    public final String B;
    public int C;
    public boolean D;
    public final Bundle E;
    public final hh3_2 F;
    public oy1$b_0 G;
    public CustomToolbarViewMerger H;
    public final hh3_2 I;
    public boolean J;
    public String K;
    public String L;
    public pg2_2 M;
    public View N;
    public Product O;
    public View P;
    public View Q;
    public pr2_2 R;
    public LottieAnimationView S;
    public n32_0 T;
    public MenuItem U;
    public AjioTextView X;
    public InAppBottomUpdatesView Y;
    public String Z;
    public final lq2_1 a;
    public Parcelable b;
    public final String c;
    public final hh3_2 d;
    public final hh3_2 e;
    public final hh3_2 f;
    public ea2_1 g;
    public View h;
    public View i;
    public TextView j;
    public View k;
    public final D k0;
    public j3_0 l;
    public A71 m;
    public fo3 n;
    public vh3_2 o;
    public ea2_1 p;
    public boolean p0;
    public lz1_1 q;
    public final oY1$d q0;
    public nm_1 r;
    public RecyclerView s;
    public View t;
    public ShimmerFrameLayout u;
    public View v;
    public TextView w;
    public ImageView x;
    public final NewEEcommerceEventsRevamp y;
    public final NewCustomEventsRevamp z;

    static {
        oY1$a oY1$a;
        Companion = oY1$a = new Object();
    }

    public oy1_1() {
        lq2_1.Companion.getClass();
        Object object = lq2$a_0.a(this);
        ((lq2_1)object).e();
        int n3 = 1;
        Object object2 = new iq2_1[n3];
        Object object3 = Iq2$b.b;
        object2[0] = object3;
        ((lq2_1)object).g((iq2_1[])object2);
        object2 = PermissionTrigger.WISHLIST;
        ((lq2_1)object).f((PermissionTrigger)((Object)object2));
        this.a = object;
        this.c = "KEY_RECYCLER_STATE";
        object = new ky1_1(this, 0);
        this.d = object = yr1_2.b((Function0)object);
        object = new ly1_0(this);
        this.e = object = yr1_2.b((Function0)object);
        object = new my1_0(this);
        this.f = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.y = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.z = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.A = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.B = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object = new Bundle();
        this.E = object;
        object = new m10_0(n3);
        this.F = object = yr1_2.b((Function0)object);
        object = new ny1_0(this);
        this.I = object = yr1_2.b((Function0)object);
        this.Z = "";
        object = Reflection.getOrCreateKotlinClass(zp2_1.class);
        oY1$f oY1$f = new oY1$f(this);
        object2 = new oY1$g(this);
        object3 = new oY1$h(this);
        this.k0 = object = LW0.a(this, (yn1_2)object, oY1$f, (Function0)object2, (Function0)object3);
        this.q0 = object = new Object();
    }

    public static ArrayList Ta(ArrayList object) {
        boolean bl2;
        int n3 = 1;
        ArrayList<Product> arrayList = new ArrayList<Product>();
        arrayList.addAll((Collection<Product>)object);
        object = arrayList.iterator();
        int n4 = 0;
        int n7 = 0;
        Object object2 = null;
        while (bl2 = object.hasNext()) {
            Object object3 = object.next();
            int n8 = n7 + 1;
            if (n7 >= 0) {
                object3 = (Product)object3;
                if ((n7 %= 2) == 0) {
                    n7 = 6;
                    object2 = n7;
                    ((Product)object3).setViewTypeWishlist((Integer)object2);
                } else {
                    n7 = 7;
                    object2 = n7;
                    ((Product)object3).setViewTypeWishlist((Integer)object2);
                }
                n7 = n8;
                continue;
            }
            xx_2.n();
            throw null;
        }
        object = h40_0.a;
        int n10 = h40_0.X1();
        if (n10 != 0) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object2 = "WishlistRatingCollectionPosition";
            n10 = ((ao0_0)object).g((String)object2);
            if (n10 > n3) {
                n4 = n10;
            }
            n10 = n4 % 2;
            if (n10 != 0) {
                n4 -= n3;
            }
            n10 = 23;
            if (n4 >= 0 && n4 < (n3 = arrayList.size())) {
                Product product = new Product();
                object = n10;
                product.setViewTypeWishlist((Integer)object);
                arrayList.add(n4, product);
            } else {
                Product product = new Product();
                object = n10;
                product.setViewTypeWishlist((Integer)object);
                arrayList.add(product);
            }
        }
        return arrayList;
    }

    public static ArrayList Ua(ArrayList arrayList) {
        int n3;
        Object object;
        boolean bl2;
        int n4 = 1;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        Object object2 = arrayList;
        arrayList2.addAll(arrayList);
        object2 = arrayList2.iterator();
        int n7 = 0;
        int n8 = 0;
        Object object3 = null;
        while (bl2 = object2.hasNext()) {
            object = object2.next();
            n3 = n8 + 1;
            if (n8 >= 0) {
                object = (PlpProductUIModel)object;
                if ((n8 %= 2) == 0) {
                    n8 = 6;
                    object3 = n8;
                    ((PlpProductUIModel)object).setViewTypeWishlist((Integer)object3);
                } else {
                    n8 = 7;
                    object3 = n8;
                    ((PlpProductUIModel)object).setViewTypeWishlist((Integer)object3);
                }
                n8 = n3;
                continue;
            }
            xx_2.n();
            throw null;
        }
        object2 = h40_0.a;
        int n10 = h40_0.X1();
        if (n10 != 0) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            object3 = "WishlistRatingCollectionPosition";
            n10 = ((ao0_0)object2).g((String)object3);
            if (n10 > n4) {
                n7 = n10;
            }
            n10 = n7 % 2;
            if (n10 != 0) {
                n7 -= n4;
            }
            n4 = 23;
            if (n7 >= 0 && n7 < (n10 = arrayList2.size())) {
                object3 = object2;
                int n14 = -1;
                int n15 = -1;
                int n16 = -1 >>> 4;
                bl2 = false;
                object = null;
                n3 = 0;
                long l2 = 0L;
                int n17 = -1;
                int n18 = -1;
                object2 = new PlpProductUIModel(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, l2, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, n17, n18, n14, n15, n16, null);
                Integer n19 = n4;
                ((PlpProductUIModel)object2).setViewTypeWishlist(n19);
                arrayList2.add(n7, object2);
            } else {
                object3 = object2;
                int n20 = -1;
                int n21 = -1;
                int n22 = -1 >>> 4;
                bl2 = false;
                object = null;
                n3 = 0;
                long l3 = 0L;
                int n24 = -1;
                int n25 = -1;
                object2 = new PlpProductUIModel(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, l3, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, n24, n25, n20, n21, n22, null);
                Integer n26 = n4;
                ((PlpProductUIModel)object2).setViewTypeWishlist(n26);
                arrayList2.add(object2);
            }
        }
        return arrayList2;
    }

    public final void F(Product product, int n3, String string2) {
        Object object = this;
        Object object2 = product;
        String string3 = string2;
        Object object3 = "listType";
        Intrinsics.checkNotNullParameter(string2, (String)object3);
        boolean bl2 = this.ab();
        if (bl2) {
            if (product == null) {
                return;
            }
            object3 = product.getCode();
            boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
            if (bl3) {
                return;
            }
            Object object4 = new ri2$a();
            ((ri2$a)object4).a = product;
            ((ri2$a)object4).b((String)object3);
            object4 = ((ri2$a)object4).a();
            Object object5 = this.g;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productDetailListener");
                object5 = null;
            }
            object5.n0((ri2_0)object4);
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            object4 = analyticsManager$Companion.getInstance().getGtmEvents();
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(string3);
            String string4 = "/";
            ((StringBuilder)object5).append(string4);
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append(string4);
            ((StringBuilder)object5).append(n3);
            object3 = ((StringBuilder)object5).toString();
            String string5 = "pdp screen";
            ((GTMEvents)object4).pushButtonTapEvent("PDP Click", object3, string5);
            object3 = object4 = ((oy1_1)object).y;
            object4 = ((NewEEcommerceEventsRevamp)object4).getEE_SELECT_ITEM();
            object5 = ((oy1_1)object).y;
            String string6 = ((NewEEcommerceEventsRevamp)object5).getPrevScreen();
            String string7 = ((NewEEcommerceEventsRevamp)object5).getPrevScreenType();
            object5 = "Closet List";
            string4 = null;
            String string8 = "closet screen";
            String string9 = "closet screen";
            String string10 = string5;
            string5 = null;
            long l2 = 0L;
            int n4 = 4192848;
            object2 = product;
            object = string3;
            NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object3, product, n3, (String)object4, (String)object5, null, string8, false, string6, string9, null, string7, null, null, false, null, null, l2, null, null, null, null, null, n4, null);
            object3 = "Similar Products";
            boolean bl4 = ((String)object3).equalsIgnoreCase(string3);
            if (bl4) {
                object = analyticsManager$Companion.getInstance().getGtmEvents();
                object3 = this;
                object2 = this.O;
                object2 = object2 == null ? "" : ((Product)object2).getName();
                string3 = "Recommendation PDP";
                object4 = string10;
                ((GTMEvents)object).pushButtonTapEvent(string3, object2, string10);
            } else {
                object3 = this;
            }
        } else {
            object3 = this;
        }
    }

    public final void F3(Integer n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter("Add to Bag", "name");
    }

    public final void G2(Product object) {
        if (object != null) {
            zz_2.a((Product)object);
            Object object2 = h40_0.a;
            object2 = h40_0.r();
            zz_2.b((Product)object, (String)object2);
            object2 = AnalyticsManager.Companion.getInstance().getCt();
            AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
            cp_1.Companion.getClass();
            cp_1 cp_12 = cp$a.e();
            cp_12.getClass();
            object = cp_1.i((Product)object);
            object = analyticsData$Builder.eventMap((HashMap)object).build();
            ((CleverTapEvents)object2).pushNotifyMeEvent((AnalyticsData)object);
            object = h40_0.r();
            object2 = null;
            analyticsData$Builder = null;
            hv3_0.o0(0, (String)object, null);
        }
    }

    public final void G7() {
        this.Qa().F = false;
        Object object = this.s;
        RecyclerView$f recyclerView$f = null;
        if ((object = object != null ? ((RecyclerView)object).getAdapter() : null) != null) {
            object = this.s;
            if (object != null) {
                recyclerView$f = ((RecyclerView)object).getAdapter();
            }
            Intrinsics.checkNotNull(recyclerView$f, "null cannot be cast to non-null type com.ril.ajio.closet.adapter.NewClosetAdapter");
            recyclerView$f = (tx1_0)recyclerView$f;
            object = ((tx1_0)recyclerView$f).f;
            String string2 = "listImages";
            Intrinsics.checkNotNullParameter(object, string2);
            ((tx1_0)recyclerView$f).e = false;
            ((tx1_0)recyclerView$f).f = object;
            recyclerView$f.notifyDataSetChanged();
        }
    }

    public final void L5() {
        Object object = tr2_2.a;
        tr2_2.h(this.S);
        object = this.R;
        if (object != null) {
            ((pr2_2)object).a();
        }
        if ((object = this.s) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public final void Oa(ProductOptionItem object) {
        Object object2 = this.Qa();
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        ((ky1_0)object2).s = object;
        object2 = ((ProductOptionItem)object).getCommercialType();
        ky1_0 ky1_02 = this.Qa();
        int n3 = ky1_02.j();
        if (n3 != 0) {
            this.Pa().startLoader();
            hv3_0.a.getClass();
            object = hv3_0.d((ProductOptionItem)object);
            ky1_02 = this.Qa();
            String string2 = this.Qa().C;
            ky1_02.e(string2, (String)object, (String)object2);
        } else {
            object = this.q;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginListener");
                object = null;
            }
            object2 = "source - cart";
            n3 = 6;
            object.z0(n3, (String)object2);
        }
    }

    public final void P8(int n3) {
        int n4;
        Object object;
        oy1_1 oy1_12 = this;
        int n7 = n3;
        int n8 = 4;
        if (n3 == n8 && (object = this.Y) != null && (n8 = object.getVisibility()) == (n4 = 8)) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.z;
            String string2 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
            String string3 = this.z.getINSTALL_NOW_CTA_VIEW();
            object = AnalyticsManager.Companion;
            String string4 = av_0.a((AnalyticsManager$Companion)object);
            String string5 = av_0.a((AnalyticsManager$Companion)object);
            int n10 = 1536;
            String string6 = "";
            String string7 = "event_app_update_interaction";
            String string8 = this.A;
            String string9 = this.B;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string6, string7, string4, string5, string8, null, string9, false, null, n10, null);
        }
        if ((object = oy1_12.Y) != null) {
            object.setUIForState(n7);
        }
    }

    public final j3_0 Pa() {
        j3_0 j3_02 = this.l;
        if (j3_02 != null) {
            return j3_02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
        return null;
    }

    public final ky1_0 Qa() {
        return (ky1_0)this.f.getValue();
    }

    public final View Ra() {
        View view = this.k;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parentView");
        return null;
    }

    public final K43 Sa() {
        return (K43)this.e.getValue();
    }

    public final void U9(Product product) {
        Object object = "product";
        Intrinsics.checkNotNullParameter(product, (String)object);
        Object object2 = this.Qa().y;
        int n3 = ((ArrayList)object2).size();
        if (n3 != 0) {
            object2 = this.Qa();
            n3 = (int)(((ky1_0)object2).F ? 1 : 0);
        }
        Intrinsics.checkNotNullParameter(product, (String)object);
        object = this.getContext();
        if (object != null) {
            by1_0 by1_02;
            cy1_0 cy1_02;
            int n4;
            int n7;
            object2 = this.requireContext();
            object = new BottomSheetDialog((Context)object2);
            n3 = (int)(this.J ? 1 : 0);
            int n8 = 0;
            Object object3 = null;
            if (n3 != 0) {
                object2 = this.getLayoutInflater();
                n7 = R$layout.dialog_luxe_closet_delete;
                object2 = object2.inflate(n7, null);
            } else {
                object2 = this.getLayoutInflater();
                n7 = R$layout.dialog_closet_delete_refresh;
                object2 = object2.inflate(n7, null);
            }
            ((BottomSheetDialog)object).setContentView((View)object2);
            n8 = this.J;
            if (n8 != 0) {
                n8 = R$id.cancelContainer;
                object3 = object2.findViewById(n8);
                n4 = 0;
                cy1_02 = null;
                by1_02 = new by1_0((BottomSheetDialog)object, 0);
                object3.setOnClickListener((View.OnClickListener)by1_02);
            }
            n8 = R$id.cancelBtn;
            object3 = object2.findViewById(n8);
            n7 = R$id.cancelBtnCloset;
            by1_02 = object2.findViewById(n7);
            n4 = R$id.removeBtn;
            object2 = object2.findViewById(n4);
            cy1_02 = new cy1_0(object, 0);
            object3.setOnClickListener((View.OnClickListener)cy1_02);
            n4 = 0;
            cy1_02 = null;
            object3 = new dy1_0(object, 0);
            by1_02.setOnClickListener((View.OnClickListener)object3);
            object3 = new ey1_0(this, product, (BottomSheetDialog)object);
            object2.setOnClickListener((View.OnClickListener)object3);
            object.show();
            product = object.getWindow();
            if (product != null) {
                product = object.getWindow();
                Intrinsics.checkNotNull(product);
                int n10 = com.google.android.material.R$id.design_bottom_sheet;
                product = product.findViewById(n10);
                n10 = 17170445;
                product.setBackgroundResource(n10);
            }
        }
    }

    public final void V8(Product product, int n3, String string2, HomeRowData homeRowData, int n4) {
    }

    public final void Va() {
        boolean bl2;
        oy1_1 oy1_12 = this;
        Object object = this.n;
        int n3 = 0;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            bl2 = false;
            object = null;
        }
        object.hideToolbarLayout();
        bl2 = oy1_12.J;
        Object object3 = "tabListener";
        Object object4 = "FROM_CART";
        long l2 = 300L;
        int n4 = 8;
        boolean bl3 = true;
        boolean n7 = false;
        if (bl2) {
            Object object5;
            Object object6;
            object = this.Ra();
            int n8 = R$id.closet_toolbar_navigation_iv;
            object = (ImageView)object.findViewById(n8);
            View view = this.Ra();
            int n10 = R$id.closet_view_bag_imv;
            view = (ImageView)view.findViewById(n10);
            Object object7 = new tm_1(oy1_12, 1);
            object.setOnClickListener((View.OnClickListener)object7);
            object7 = this.Ra();
            int n14 = R$id.closet_toolbar;
            object7 = (Toolbar)object7.findViewById(n14);
            if (object7 != null) {
                n14 = R$string.acc_page_header_wishlist;
                object6 = hv3_0.K(n14);
                object7.setContentDescription((CharSequence)object6);
            }
            if ((object6 = oy1_12.R) != null && (object6 = ((pr2_2)object6).e) != null) {
                int n15 = R$string.acc_page_header_wishlist;
                object5 = hv3_0.K(n15);
                object6.setContentDescription((CharSequence)object5);
            }
            object5 = Looper.getMainLooper();
            object6 = new Handler(object5);
            int n16 = 1;
            object5 = new v01_0(n16, object7, oy1_12);
            object6.postDelayed((Runnable)object5, l2);
            Object object8 = this.Ra();
            int n17 = R$id.closet_view_subheading_tv;
            object8 = (TextView)object8.findViewById(n17);
            oy1_12.j = object8;
            object8 = this.getArguments();
            if (object8 != null) {
                object8 = this.getArguments();
                if (object8 != null) {
                    boolean n18 = object8.getBoolean((String)object4, false);
                    object4 = n18;
                } else {
                    boolean n19 = false;
                    object4 = null;
                }
                Intrinsics.checkNotNull(object4);
                boolean bl4 = (Boolean)object4;
                if (bl4) {
                    object8 = oy1_12.o;
                    if (object8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        object8 = null;
                    }
                    object8.showTabLayout(false);
                    object.setVisibility(0);
                }
                n7 = bl4;
            }
            if (!n7) {
                object4 = oy1_12.o;
                if (object4 != null) {
                    object2 = object4;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                }
                object2.showTabLayout(bl3);
                object.setVisibility(n4);
                view.setVisibility(n4);
            }
        } else {
            object = this.getContext();
            if (object != null) {
                int n20;
                object = this.Ra();
                int n21 = R$id.float_header_view;
                object = object.findViewById(n21);
                Object object9 = object.getLayoutParams();
                Intrinsics.checkNotNull(object9, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                object9 = (CoordinatorLayout$e)((Object)object9);
                Object object10 = this.requireContext();
                String string2 = "requireContext(...)";
                Intrinsics.checkNotNullExpressionValue(object10, string2);
                CustomCoordinatorBehavior customCoordinatorBehavior = new CustomCoordinatorBehavior((Context)object10, null);
                ((CoordinatorLayout$e)((Object)object9)).b(customCoordinatorBehavior);
                object9 = oy1_12.H;
                if (object9 != null && (object9 = ((CustomToolbarViewMerger)object9).getToolbar()) != null) {
                    n20 = R$string.acc_page_header_wishlist;
                    object10 = hv3_0.K(n20);
                    object9.setContentDescription((CharSequence)object10);
                }
                if ((object9 = oy1_12.R) != null && (object9 = ((pr2_2)object9).e) != null) {
                    n20 = R$string.acc_page_header_wishlist;
                    object10 = hv3_0.K(n20);
                    object9.setContentDescription((CharSequence)object10);
                }
                object10 = Looper.getMainLooper();
                object9 = new Handler((Looper)object10);
                object10 = new ZX1(oy1_12);
                object9.postDelayed((Runnable)object10, l2);
                View view = this.Ra();
                int n22 = R$id.collapsing_toolbar;
                view = view.findViewById(n22);
                Object object5 = this.getArguments();
                if (object5 != null) {
                    object5 = this.getArguments();
                    if (object5 != null) {
                        boolean bl5 = object5.getBoolean((String)object4, false);
                        object4 = bl5;
                    } else {
                        boolean bl6 = false;
                        object4 = null;
                    }
                    Intrinsics.checkNotNull(object4);
                    boolean bl7 = (Boolean)object4;
                    if (bl7) {
                        object5 = oy1_12.o;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n22 = 0;
                            object5 = null;
                        }
                        object5.showTabLayout(false);
                        object5 = tr2_2.a;
                        n21 = (int)(oy1_12.J ? 1 : 0);
                        n22 = (int)(((tr2_2)object5).x(n21 != 0) ? 1 : 0);
                        if (n22 != 0) {
                            object5 = oy1_12.R;
                            if (object5 != null && (object5 = ((pr2_2)object5).e) != null) {
                                n20 = 0;
                                object10 = null;
                                object9 = new ay1_0(oy1_12, 0);
                                ((Toolbar)object5).setNavigationOnClickListener((View.OnClickListener)object9);
                            }
                            if ((object5 = oy1_12.R) != null && (object5 = ((pr2_2)object5).e) != null) {
                                n21 = R$drawable.nav_back;
                                ((Toolbar)object5).setNavigationIcon(n21);
                            }
                            if ((object5 = oy1_12.R) != null && (object5 = ((pr2_2)object5).e) != null) {
                                n21 = R$string.acc_back_icon;
                                ((Toolbar)object5).setNavigationContentDescription(n21);
                            }
                        } else {
                            object5 = oy1_12.H;
                            if (object5 != null) {
                                ((CustomToolbarViewMerger)object5).setNavigationClick();
                            }
                            if ((object5 = oy1_12.H) != null && (object5 = ((CustomToolbarViewMerger)object5).getToolbar()) != null) {
                                n21 = R$string.acc_page_header_wishlist;
                                object9 = hv3_0.K(n21);
                                object5.setContentDescription((CharSequence)object9);
                            }
                            if ((object10 = oy1_12.H) != null) {
                                int n24 = R$drawable.nav_back;
                                String string3 = "closetpage";
                                boolean bl4 = false;
                                int n8 = 10;
                                CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object10, n24, null, string3, null, n8, null);
                            }
                            if ((object5 = oy1_12.R) != null && (object5 = ((pr2_2)object5).e) != null) {
                                n21 = R$string.acc_back_icon;
                                object9 = hv3_0.K(n21);
                                ((Toolbar)object5).setNavigationContentDescription((CharSequence)object9);
                            }
                        }
                        customCoordinatorBehavior.setBackBtnDisable(false);
                        object.requestLayout();
                        object5 = view.getLayoutParams();
                        ((ViewGroup.LayoutParams)object5).height = n21 = hv3_0.q(R$dimen.wishlist_toolbar_height_refresh_2);
                        view.requestLayout();
                        object5 = oy1_12.x;
                        if (object5 != null) {
                            object5.setVisibility(0);
                        }
                    }
                    n7 = bl7;
                }
                if (!n7) {
                    object4 = oy1_12.x;
                    if (object4 != null) {
                        object4.setVisibility(n4);
                    }
                    if ((object4 = oy1_12.o) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        boolean bl8 = false;
                        object4 = null;
                    }
                    object4.showTabLayout(bl3);
                    object3 = oy1_12.R;
                    if (object3 != null && (object3 = ((pr2_2)object3).e) != null) {
                        ((Toolbar)object3).setNavigationIcon(null);
                    }
                    if ((object3 = oy1_12.H) != null) {
                        int n10 = 2;
                        CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object3, null, null, n10, null);
                    }
                    customCoordinatorBehavior.setBackBtnDisable(bl3);
                    object.requestLayout();
                    object = view.getLayoutParams();
                    ((ViewGroup.LayoutParams)object).height = n3 = hv3_0.q(R$dimen.wishlist_toolbar_height_refresh_1);
                    view.requestLayout();
                }
            }
            object = this.Ra();
            n3 = R$id.app_bar_layout;
            object = object.findViewById(n3);
            object2 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (AppBarLayout)object;
            ((AppBarLayout)object).setExpanded(bl3);
        }
    }

    public final void Wa() {
        this.Pa().stopLoader();
    }

    public final void Xa() {
        boolean bl2;
        Object object = this.Q;
        int n3 = 8;
        if (object != null) {
            object.setVisibility(n3);
        }
        if (!(bl2 = this.J)) {
            StringBuilder stringBuilder;
            String string2;
            Object object2;
            int n4;
            Object object3;
            int n7;
            object = this.P;
            if (object != null) {
                n7 = 0;
                object3 = null;
                object.setVisibility(0);
            }
            object = this.P;
            n7 = 0;
            object3 = null;
            if (object != null) {
                n4 = R$id.closet_grid;
                object = (RecyclerView)object.findViewById(n4);
            } else {
                bl2 = false;
                object = null;
            }
            this.s = object;
            this.Ya();
            object = this.H;
            if (object == null && object == null) {
                this.H = object = new CustomToolbarViewMerger(this);
                object2 = this.Ra();
                ((CustomToolbarViewMerger)object).initViews((View)object2);
            }
            if ((object = this.H) != null) {
                object = ((CustomToolbarViewMerger)object).getToolbar();
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                object = this.H;
                if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                    object.invalidate();
                }
                if (bl2 = (object = this.getActivity()) instanceof AppCompatActivity) {
                    object = this.getActivity();
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    object = (AppCompatActivity)object;
                    object2 = this.H;
                    if (object2 != null) {
                        object3 = ((CustomToolbarViewMerger)object2).getToolbar();
                    }
                    ((AppCompatActivity)object).setSupportActionBar((Toolbar)object3);
                }
            }
            if ((object = this.H) != null) {
                ((CustomToolbarViewMerger)object).setSubTitleVisibility(n3);
            }
            if ((object = this.H) != null) {
                n3 = R$string.wish_list;
                string2 = hv3_0.K(n3);
                ((CustomToolbarViewMerger)object).setTitleText(string2);
            }
            object = this.H;
            string2 = " ";
            if (object != null && (object = ((CustomToolbarViewMerger)object).getHeaderTitleTv()) != null) {
                n7 = R$string.header_text;
                object3 = hv3_0.K(n7);
                n4 = R$string.wish_list;
                object2 = hv3_0.K(n4);
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object3);
                stringBuilder.append(string2);
                stringBuilder.append((String)object2);
                object3 = stringBuilder.toString();
                object.setContentDescription((CharSequence)object3);
            }
            if ((object = this.H) != null && (object = ((CustomToolbarViewMerger)object).getFloatTitleTv()) != null) {
                n7 = R$string.title_text;
                object3 = hv3_0.K(n7);
                n4 = R$string.wish_list;
                object2 = hv3_0.K(n4);
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object3);
                stringBuilder.append(string2);
                stringBuilder.append((String)object2);
                string2 = stringBuilder.toString();
                object.setContentDescription((CharSequence)string2);
            }
        }
        this.Va();
    }

    public final void Y0(Product object, String string2, boolean bl2) {
        bl2 = this.ab();
        if (bl2 && string2 != null && (bl2 = string2.length())) {
            this.Pa().startLoader();
            BH3 bH3 = this.Qa().i;
            bH3.c = object;
            object = this.Qa();
            ((ky1_0)object).l(string2);
        }
    }

    public final void Ya() {
        Object object = this.getActivity();
        int n3 = 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context)object, n3);
        this.G = object = new oy1$b_0(this);
        object = this.s;
        if (object != null) {
            ((RecyclerView)object).clearOnScrollListeners();
        }
        if ((object = this.s) != null) {
            oy1$b_0 oy1$b_0 = this.G;
            Intrinsics.checkNotNull(oy1$b_0);
            ((RecyclerView)object).addOnScrollListener(oy1$b_0);
        }
        object = new oY1$c(this);
        gridLayoutManager.setSpanSizeLookup((GridLayoutManager$b)object);
        object = this.s;
        Intrinsics.checkNotNull(object);
        ((RecyclerView)object).setLayoutManager(gridLayoutManager);
    }

    public final void Za() {
        boolean bl2 = this.J;
        int n3 = 0;
        Object object = null;
        if (bl2) {
            Object object2 = this.i;
            if (object2 != null) {
                object2.setVisibility(0);
            }
            object = this.h;
            boolean bl3 = true;
            object2 = new pr2_2((View)object, this, bl3);
            this.R = object2;
            ((pr2_2)object2).d();
        } else {
            Object object3 = this.P;
            int n4 = 8;
            if (object3 != null) {
                object3.setVisibility(n4);
            }
            if ((object3 = this.Q) != null) {
                object3.setVisibility(0);
            }
            object3 = this.Q;
            Object object4 = null;
            if (object3 != null) {
                int n7 = R$id.closet_grid;
                object3 = (RecyclerView)object3.findViewById(n7);
            } else {
                bl2 = false;
                object3 = null;
            }
            this.s = object3;
            this.Ya();
            this.H = null;
            View view = this.Q;
            object3 = new pr2_2(view, this, false);
            this.R = object3;
            object3 = this.getActivity();
            bl2 = object3 instanceof AppCompatActivity;
            if (bl2) {
                object3 = this.getActivity();
                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                object3 = (AppCompatActivity)object3;
                object = this.R;
                if (object != null) {
                    object4 = object.e;
                }
                ((AppCompatActivity)object3).setSupportActionBar((Toolbar)object4);
            }
            if ((object3 = this.R) != null) {
                ((pr2_2)object3).d();
            }
            if ((object3 = this.R) != null && (object3 = ((pr2_2)object3).g) != null) {
                object3.setVisibility(n4);
            }
            if ((object3 = this.R) != null && (object3 = ((pr2_2)object3).f) != null) {
                n3 = R$string.wish_list;
                object = hv3_0.K(n3);
                object3.setText((CharSequence)object);
            }
            if ((object3 = this.R) != null && (object3 = ((pr2_2)object3).f) != null) {
                n3 = R$string.title_text;
                object = hv3_0.K(n3);
                n4 = R$string.wish_list;
                String string2 = hv3_0.K(n4);
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append(" ");
                ((StringBuilder)object4).append(string2);
                object = ((StringBuilder)object4).toString();
                object3.setContentDescription((CharSequence)object);
            }
            object3 = this.requireActivity();
            object3.invalidateOptionsMenu();
        }
        this.Va();
    }

    public final boolean ab() {
        return (Boolean)this.F.getValue();
    }

    public final void b1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "linkText");
    }

    public final void bb() {
        int n3;
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            n3 = 0;
            recyclerView.setVisibility(0);
        }
        if ((recyclerView = this.t) != null) {
            n3 = 8;
            recyclerView.setVisibility(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cb(ArrayList object, ArrayList object2) {
        Object object3;
        block35: {
            int n3;
            boolean bl2;
            int n4;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            int n7;
            Object object8;
            object3 = "productList";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Object object9 = "plpProductUIList";
            Intrinsics.checkNotNullParameter(object2, (String)object9);
            Object object10 = this.s;
            object10 = object10 != null ? ((RecyclerView)object10).getAdapter() : null;
            Object object11 = "copyOf(...)";
            if (object10 == null) {
                boolean bl3;
                object3 = this.Qa();
                object9 = iw_1.a;
                object10 = this.Qa().y;
                object8 = this.Qa().E;
                object9.getClass();
                ((ky1_0)object3).F = bl3 = iw_1.f((HashMap)object8, (ArrayList)object10);
                ArrayList arrayList = new ArrayList();
                object3 = this.Qa();
                n7 = ((ky1_0)object3).F;
                if (n7 != 0) {
                    object3 = this.Qa();
                    object9 = this.Qa().E;
                    object10 = this.Qa().y;
                    object3.getClass();
                    object3 = ky1_0.g((HashMap)object9, (ArrayList)object10);
                    arrayList.addAll(object3);
                }
                if ((n7 = this.J) == 0) {
                    object = oy1_1.Ta((ArrayList)object);
                }
                n7 = this.J;
                if (n7 == 0) {
                    object2 = oy1_1.Ua((ArrayList)object2);
                }
                object7 = ImmutableList.copyOf((Collection)object);
                Intrinsics.checkNotNullExpressionValue(object7, (String)object11);
                object6 = ImmutableList.copyOf((Collection)object2);
                Intrinsics.checkNotNullExpressionValue(object6, (String)object11);
                object5 = this.G;
                Intrinsics.checkNotNull(object5);
                object = this.Qa();
                boolean bl4 = ((ky1_0)object).F;
                object8 = object3;
                object4 = this;
                object3 = new tx1_0((ImmutableList)object7, (ImmutableList)object6, this, (RecyclerViewScrollListener)object5, bl4, arrayList, this);
                n4 = this.J;
                if (n4 == 0) {
                    object = RecyclerView$f$a.PREVENT_WHEN_EMPTY;
                    ((RecyclerView$f)object3).setStateRestorationPolicy((RecyclerView$f$a)((Object)object));
                }
                if ((object = this.s) != null) {
                    ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
                }
            } else {
                object10 = this.s;
                Intrinsics.checkNotNull(object10);
                object10 = ((RecyclerView)object10).getAdapter();
                Intrinsics.checkNotNull(object10, "null cannot be cast to non-null type com.ril.ajio.closet.adapter.NewClosetAdapter");
                object10 = (tx1_0)object10;
                object8 = this.Qa();
                object7 = iw_1.a;
                object6 = this.Qa().y;
                object4 = this.Qa().E;
                object7.getClass();
                ((ky1_0)object8).F = bl2 = iw_1.f((HashMap)object4, (ArrayList)object6);
                object8 = this.Qa();
                n3 = ((ky1_0)object8).F;
                if (n3 != 0) {
                    object8 = this.Qa();
                    n3 = ((ky1_0)object8).F;
                    object7 = this.Qa();
                    object6 = this.Qa().E;
                    object4 = this.Qa().y;
                    object7.getClass();
                    object7 = ky1_0.g((HashMap)object6, (ArrayList)object4);
                    object10.getClass();
                    object6 = "listImages";
                    Intrinsics.checkNotNullParameter(object7, (String)object6);
                    ((tx1_0)object10).e = n3;
                    ((tx1_0)object10).f = object7;
                }
                if ((n3 = this.J) != 0) {
                    object = ImmutableList.copyOf((Collection)object);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object11);
                    object2 = ImmutableList.copyOf((Collection)object2);
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object11);
                    object10.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    Intrinsics.checkNotNullParameter(object2, (String)object9);
                    ((tx1_0)object10).a = object;
                    ((tx1_0)object10).b = object2;
                    ((RecyclerView$f)object10).notifyDataSetChanged();
                } else {
                    object = ImmutableList.copyOf((Collection)oy1_1.Ta((ArrayList)object));
                    Intrinsics.checkNotNullExpressionValue(object, (String)object11);
                    object2 = ImmutableList.copyOf((Collection)oy1_1.Ua((ArrayList)object2));
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object11);
                    object10.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    Intrinsics.checkNotNullParameter(object2, (String)object9);
                    ((tx1_0)object10).a = object;
                    ((tx1_0)object10).b = object2;
                    ((RecyclerView$f)object10).notifyDataSetChanged();
                }
            }
            n4 = this.J;
            object2 = null;
            n7 = 1;
            if (n4 != 0) {
                object = this.Qa();
                n4 = ((ky1_0)object).B;
                object3 = n4 > n7 ? " Products" : " Product";
                object = UX.a(n4, (String)object3);
                object3 = this.j;
                if (object3 != null) {
                    object3.setText((CharSequence)object);
                }
                if ((object = this.j) == null) return;
                object.setVisibility(0);
                return;
            }
            object = new HashMap();
            object9 = "_Final_price";
            object10 = "";
            object11 = this.Qa().y;
            int n8 = ((ArrayList)object11).isEmpty() ^ n7;
            if (n8 == 0) break block35;
            object11 = this.Qa().y.iterator();
            Intrinsics.checkNotNullExpressionValue(object11, "iterator(...)");
            n3 = 0;
            object8 = null;
            while (bl2 = object11.hasNext()) {
                int n10;
                block36: {
                    Exception exception2;
                    block34: {
                        object7 = object11.next();
                        Intrinsics.checkNotNullExpressionValue(object7, "next(...)");
                        object7 = (Product)object7;
                        object6 = "Item ";
                        object4 = Gj0.b(n3 += n7, (String)object6, "_SKU");
                        object5 = ((Product)object7).getCode();
                        ((HashMap)object).put(object4, object5);
                        object4 = new StringBuilder((String)object6);
                        ((StringBuilder)object4).append(n3);
                        ((StringBuilder)object4).append("_Name");
                        object4 = ((StringBuilder)object4).toString();
                        object5 = ((Product)object7).getName();
                        ((HashMap)object).put(object4, object5);
                        object4 = new StringBuilder((String)object6);
                        ((StringBuilder)object4).append(n3);
                        ((StringBuilder)object4).append("_Brand");
                        object4 = ((StringBuilder)object4).toString();
                        object5 = ((Product)object7).getBrandName();
                        ((HashMap)object).put(object4, object5);
                        try {
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append((String)object6);
                            ((StringBuilder)object4).append(n3);
                            ((StringBuilder)object4).append((String)object9);
                            object4 = ((StringBuilder)object4).toString();
                            object5 = ((Product)object7).getPrice();
                            object5 = object5 != null ? ((Price)object5).getValue() : null;
                        }
                        catch (Exception exception2) {
                            break block34;
                        }
                        ((HashMap)object).put(object4, object5);
                        break block36;
                    }
                    object5 = new StringBuilder((String)object6);
                    ((StringBuilder)object5).append(n3);
                    ((StringBuilder)object5).append((String)object9);
                    object5 = ((StringBuilder)object5).toString();
                    ((HashMap)object).put(object5, object10);
                    object5 = yn3_0.a;
                    ((yn3$a)object5).e(exception2);
                }
                object4 = ((Product)object7).getVariantOptions();
                object5 = "0";
                CharSequence charSequence = "_MRP";
                if (object4 != null && (object4 = (ProductOptionItem)object4.get(0)) != null && (object4 = ((ProductOptionItem)object4).getWasPriceData()) != null) {
                    charSequence = Gj0.b(n3, (String)object6, (String)charSequence);
                    if ((object4 = ((Price)object4).getValue()) != null) {
                        object5 = object4;
                    }
                    object4 = Double.valueOf((String)object5);
                    ((HashMap)object).put(charSequence, object4);
                } else {
                    object4 = ((Product)object7).getWasPriceData();
                    if (object4 != null) {
                        charSequence = Gj0.b(n3, (String)object6, (String)charSequence);
                        if ((object4 = ((Price)object4).getValue()) != null) {
                            object5 = object4;
                        }
                        object4 = Double.valueOf((String)object5);
                        ((HashMap)object).put(charSequence, object4);
                    }
                }
                object4 = ((Product)object7).getFnlProductData();
                if (object4 != null) {
                    object4 = ((ProductfnlProductData)object4).getPlanningCategory();
                } else {
                    n10 = 0;
                    object4 = null;
                }
                if (object4 != null) {
                    object4 = ((Product)object7).getFnlProductData();
                    Intrinsics.checkNotNull(object4);
                    object4 = ((ProductfnlProductData)object4).getPlanningCategory();
                } else {
                    object4 = object10;
                }
                object5 = "Category";
                ((HashMap)object).put(object5, object4);
                object4 = ((Product)object7).getFnlProductData();
                if (object4 != null) {
                    object4 = ((ProductfnlProductData)object4).getProductGroups();
                } else {
                    n10 = 0;
                    object4 = null;
                }
                object5 = "_Vertical";
                if (object4 != null) {
                    object4 = Gj0.b(n3, (String)object6, (String)object5);
                    object5 = ((Product)object7).getFnlProductData();
                    Intrinsics.checkNotNull(object5);
                    object5 = ((ProductfnlProductData)object5).getProductGroups();
                    ((HashMap)object).put(object4, object5);
                } else {
                    object4 = new StringBuilder((String)object6);
                    ((StringBuilder)object4).append(n3);
                    ((StringBuilder)object4).append((String)object5);
                    object4 = ((StringBuilder)object4).toString();
                    ((HashMap)object).put(object4, object10);
                }
                object4 = ((Product)object7).getFnlColorVariantData();
                if (object4 != null) {
                    object4 = ((ProductFnlColorVariantData)object4).getBrickName();
                    object5 = "_Brick";
                    if (object4 != null) {
                        charSequence = new StringBuilder((String)object6);
                        ((StringBuilder)charSequence).append(n3);
                        ((StringBuilder)charSequence).append((String)object5);
                        object5 = ((StringBuilder)charSequence).toString();
                        ((HashMap)object).put(object5, object4);
                    } else {
                        object4 = new StringBuilder((String)object6);
                        ((StringBuilder)object4).append(n3);
                        ((StringBuilder)object4).append((String)object5);
                        object4 = ((StringBuilder)object4).toString();
                        ((HashMap)object).put(object4, object10);
                    }
                }
                object4 = ((Product)object7).getProductGalleryImageUrls();
                object5 = "_Image_URL";
                if (object4 != null && (n10 = object4.isEmpty()) == n7) {
                    object7 = new StringBuilder((String)object6);
                    ((StringBuilder)object7).append(n3);
                    ((StringBuilder)object7).append((String)object5);
                    object7 = ((StringBuilder)object7).toString();
                    ((HashMap)object).put(object7, object10);
                    continue;
                }
                object6 = Gj0.b(n3, (String)object6, (String)object5);
                if ((object7 = ((Product)object7).getProductGalleryImageUrls()) != null && (object7 = (ProductImage)object7.get(0)) != null) {
                    object7 = ((ProductImage)object7).getUrl();
                } else {
                    bl2 = false;
                    object7 = null;
                }
                ((HashMap)object).put(object6, object7);
            }
        }
        object2 = AnalyticsManager.Companion.getInstance().getCt();
        object3 = new AnalyticsData$Builder();
        object = ((AnalyticsData$Builder)object3).eventMap((HashMap)object).build();
        ((CleverTapEvents)object2).viewWishlist((AnalyticsData)object);
    }

    public final void db() {
        int n3 = this.D;
        if (n3 != 0) {
            n3 = og1_1.c();
            Object object = this.I;
            Object object2 = "9<sup>+</sup>";
            int n4 = 9;
            int n7 = 8;
            String string2 = "0";
            String string3 = "enable_highlight_empty_cart";
            int n8 = 0;
            Object object3 = null;
            if (n3 != 0) {
                Object object4 = this.getView();
                if (object4 != null) {
                    n8 = R$id.luxe_cart_count_tv;
                    object4 = object4.findViewById(n8);
                    object3 = object4;
                    object3 = (AjioTextView)object4;
                }
                this.X = object3;
                object4 = (jo_2)((hh3_2)object).getValue();
                n3 = ((jo_2)object4).d();
                if (n3 == 0) {
                    object4 = z40_0.Companion;
                    object = AJIOApplication.Companion;
                    object4 = Q.a((AJIOApplication$a)object, (z40$a)object4).a;
                    n3 = (int)(((ao0_0)object4).a(string3) ? 1 : 0);
                    if (n3 != 0) {
                        object4 = this.X;
                        if (object4 != null) {
                            object4.setVisibility(0);
                        }
                        if ((object4 = this.X) != null) {
                            object4.setText((CharSequence)string2);
                        }
                    } else {
                        object4 = this.X;
                        if (object4 != null) {
                            object4.setVisibility(n7);
                        }
                    }
                } else {
                    object = this.X;
                    if (object != null) {
                        object.setVisibility(0);
                    }
                    if (n3 <= n4) {
                        object = this.X;
                        if (object != null) {
                            object4 = String.valueOf(n3);
                            object.setText((CharSequence)object4);
                        }
                    } else {
                        object4 = this.X;
                        if (object4 != null) {
                            object = hv3_0.f((String)object2);
                            object4.setText((CharSequence)object);
                        }
                    }
                }
            } else {
                MenuItem menuItem = this.U;
                if (menuItem == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cartMenuItem");
                    n3 = 0;
                    menuItem = null;
                }
                if ((menuItem = menuItem.getActionView()) != null) {
                    int n10 = R$id.menu_cart_count_tv;
                    menuItem = (TextView)menuItem.findViewById(n10);
                } else {
                    n3 = 0;
                    menuItem = null;
                }
                if (menuItem != null) {
                    int n14 = ((jo_2)(object = (jo_2)((hh3_2)object).getValue())).d();
                    if (n14 == 0) {
                        object = z40_0.Companion;
                        object2 = AJIOApplication.Companion;
                        object = Q.a((AJIOApplication$a)object2, (z40$a)object).a;
                        n14 = (int)(((ao0_0)object).a(string3) ? 1 : 0);
                        if (n14 != 0) {
                            menuItem.setVisibility(0);
                            menuItem.setText((CharSequence)string2);
                            object = this.getContext();
                            if (object != null) {
                                int n15 = R$drawable.circle_shape_cart_count_product;
                                object3 = xn.a((Context)object, n15);
                            }
                            menuItem.setBackground((Drawable)object3);
                        } else {
                            menuItem.setVisibility(n7);
                        }
                    } else {
                        n7 = (int)(og1_1.c() ? 1 : 0);
                        if (n7 == 0) {
                            Context context = this.getContext();
                            if (context != null) {
                                int n16 = R$drawable.circle_shape_pink_cart_menu;
                                object3 = xn.a(context, n16);
                            }
                            menuItem.setBackground((Drawable)object3);
                        }
                        menuItem.setVisibility(0);
                        if (n14 <= n4) {
                            object = String.valueOf(n14);
                            menuItem.setText((CharSequence)object);
                        } else {
                            object = hv3_0.f((String)object2);
                            menuItem.setText((CharSequence)object);
                        }
                    }
                }
            }
        }
    }

    public final void ea(Product product) {
        Object object;
        Intrinsics.checkNotNullParameter(product, "product");
        this.O = product;
        Object object2 = object = this.d.getValue();
        object2 = (r43_0)object;
        String string2 = product.getCode();
        this.Qa().i();
        object = h40_0.a;
        boolean bl2 = h40_0.c2();
        object = product.getCatalogName();
        if (object == null) {
            product.getCatalog();
        }
        String string3 = product.getSourceStoreId();
        r43_0.b((r43_0)object2, string2, bl2, null, null, null, string3, false, 368);
        this.Qa().getClass();
        object2 = "Wishlist";
        Intrinsics.checkNotNullParameter(object2, "screenName");
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushShowSimilarEvent((String)object2, "wishlist_interactions", "wishlist interactions", "out of stock click", "show similar");
    }

    public final void eb(Product object) {
        int n3;
        int n4;
        int n7;
        Object object2;
        Object object3;
        int n8;
        int n10;
        if (object == null) {
            return;
        }
        boolean bl2 = false;
        Object object4 = null;
        this.K = null;
        this.L = null;
        Object object5 = new ArrayList();
        Object object6 = new ArrayList();
        Object object7 = ((Product)object).getProductOptionItems();
        if (object7 != null && (n10 = object7.isEmpty()) == 0) {
            object7 = ((Product)object).getBaseOptions();
            if (object7 != null && (object7 = (ProductOption)object7.get(0)) != null && (object7 = ((ProductOption)object7).getOptions()) != null && (object7 = (ProductOptionItem)object7.get(0)) != null) {
                object7 = ((ProductOptionItem)object7).getAttributes();
            } else {
                n10 = 0;
                object7 = null;
            }
            if (object7 != null) {
                object7 = ((Iterable)object7).iterator();
                while ((n8 = object7.hasNext()) != 0) {
                    Object object8;
                    object3 = (ProductOptionVariant)object7.next();
                    object2 = ((ProductOptionVariant)object3).getAttributeName();
                    if ((object3 = ((ProductOptionVariant)object3).getAttributeValue()) == null || (n7 = ((String)object3).length()) == 0 || (n7 = (int)(((String)object3).equalsIgnoreCase((String)(object8 = "null")) ? 1 : 0)) != 0) continue;
                    if (object2 != null) {
                        object8 = Locale.ROOT;
                        object2 = ((String)object2).toLowerCase((Locale)object8);
                        object8 = "toLowerCase(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object8);
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    object8 = "selection1";
                    n7 = (int)(Intrinsics.areEqual(object2, object8) ? 1 : 0);
                    if (n7 != 0) {
                        this.K = object3;
                        continue;
                    }
                    object8 = "selection2";
                    n4 = (int)(Intrinsics.areEqual(object2, object8) ? 1 : 0);
                    if (n4 == 0) continue;
                    this.L = object3;
                }
            }
        }
        if ((object7 = (Collection)((Product)object).getProductOptionItems()) != null && (n10 = object7.isEmpty()) == 0) {
            object7 = ((Product)object).getProductOptionItems();
            Intrinsics.checkNotNull(object7);
            object7 = object7.iterator();
            while ((n8 = object7.hasNext()) != 0) {
                object3 = (ProductOptionItem)object7.next();
                ((ArrayList)object6).add(object3);
            }
        }
        if ((object7 = (Collection)((Product)object).getProductOptionVariants()) != null && (n10 = object7.isEmpty()) == 0) {
            object7 = ((Product)object).getProductOptionVariants();
            n10 = object7.size();
            object3 = null;
            n4 = 0;
            object2 = null;
            for (n8 = 0; n8 < n10; ++n8) {
                object2 = (ProductOptionVariant)((Product)object).getProductOptionVariants().get(n8);
                n7 = (int)(((ProductOptionVariant)object2).isStockAvailable() ? 1 : 0);
                ((ProductOptionVariant)object2).setSelected(false);
                ((ArrayList)object5).add(object2);
                n4 = n7;
            }
        } else {
            n4 = 0;
            object2 = null;
        }
        if (((object5 = this.L) == null || (n3 = kotlin.text.b.k((CharSequence)object5)) != 0) && (object5 = this.K) != null && (n3 = kotlin.text.b.k((CharSequence)object5)) == 0 && (n3 = ((ArrayList)object6).size()) == (n10 = 1)) {
            object = (ProductOptionItem)((ArrayList)object6).get(0);
            if (n4 != 0) {
                object4 = this.Qa();
                ((ky1_0)object4).C = object5 = ((ProductOptionItem)object).getCode();
                this.Oa((ProductOptionItem)object);
            } else {
                this.Wa();
                int n14 = R$string.selected_product_out_of_stock;
                object = hv3_0.K(n14);
                hv3_0.o0(0, (String)object, null);
            }
        } else {
            this.Wa();
            object4 = this.getParentFragment();
            if (object4 != null && (bl2 = ((Fragment)(object4 = this.requireParentFragment())).isAdded()) && (bl2 = this.isAdded())) {
                object4 = new aw_1();
                object5 = new Bundle();
                object6 = "product";
                object5.putSerializable((String)object6, (Serializable)object);
                ((Fragment)object4).setArguments((Bundle)object5);
                int n15 = 101;
                ((Fragment)object4).setTargetFragment(this, n15);
                object = this.requireParentFragment();
                object = ((Fragment)object).getChildFragmentManager();
                object5 = "Size Dialog Wishlist";
                try {
                    ((DialogFragment)object4).show((FragmentManager)object, (String)object5);
                }
                catch (Exception exception) {
                    object4 = yn3_0.a;
                    ((yn3$a)object4).e(exception);
                }
            }
        }
    }

    public final void fb() {
        Object object;
        boolean bl2 = this.J;
        int n3 = 8;
        if (bl2 && (object = this.j) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.s) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.t) != null) {
            n3 = 0;
            object.setVisibility(0);
        }
    }

    public final void g0() {
        boolean bl2 = this.ab();
        if (bl2) {
            bl2 = false;
            this.T = null;
            K43 k43 = this.Sa();
            k43.b();
        }
    }

    public final void gb(String string2, String string3) {
        Object object = this.getContext();
        if (object != null) {
            object = this.Pa();
            Context context = this.requireContext();
            String string4 = "requireContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string4);
            int n3 = 1;
            object.showToastNotification(context, string2, n3, string3);
        }
    }

    public final void hb() {
        qn_2.Companion.getClass();
        qn_2 qn_22 = new qn_2();
        Object object = new Bundle();
        boolean bl2 = true;
        object.putBoolean("cart_tab_selection", bl2);
        qn_22.setArguments((Bundle)object);
        object = this.Pa();
        Fragment fragment = this.Pa().y();
        j3$a.a((j3_0)object, fragment, qn_22, bl2, "CartFragment");
        tj2_0.e(AnalyticsManager.Companion, "Header Click", "Proceed to Bag", "closet screen");
    }

    public final void k5(Product product) {
        Object object = product;
        Intrinsics.checkNotNullParameter(product, "clickedProduct");
        Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        Object object3 = "closet List";
        ((GTMEvents)object2).pushButtonTapEvent("Show PDP", object3, "closet screen");
        int n3 = product.getPosition();
        object2 = this.y;
        Object object4 = ((NewEEcommerceEventsRevamp)object2).getEE_SELECT_ITEM();
        String string2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        int n4 = 4192848;
        object2 = this.y;
        String string4 = "Closet List";
        String string5 = "closet screen";
        String string6 = "closet screen";
        long l2 = 0L;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object2, product, n3, (String)object4, string4, null, string5, false, string2, string6, null, string3, null, null, false, null, null, l2, null, null, null, null, null, n4, null);
        object2 = this.p;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpListener");
            object2 = null;
        }
        object = product.getSourceStoreId();
        object3 = Boolean.TRUE;
        object4 = product;
        object2.d1(product, (String)object, (Boolean)object3);
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        Intent intent2 = intent;
        int n7 = -1;
        if (n4 != n7 || n3 != (n7 = 17) && n3 != (n7 = 101)) {
            oy1_1 oy1_12 = this;
        } else {
            Object object;
            Object object2 = object;
            int n8 = 0;
            String string2 = null;
            int n10 = 0x1FFFFFF;
            object = new ProductOptionItem(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, 0, false, n10, null);
            if (intent2 != null) {
                int n14 = Build.VERSION.SDK_INT;
                n8 = 33;
                if (n14 >= n8) {
                    object2 = UX1.a(intent);
                } else {
                    object2 = intent2.getSerializableExtra("slected_product");
                    n8 = object2 instanceof ProductOptionItem;
                    if (n8 == 0) {
                        n14 = 0;
                        object2 = null;
                    }
                    object2 = (ProductOptionItem)object2;
                }
                object2 = (ProductOptionItem)object2;
                if (object2 != null) {
                    object = object2;
                }
            }
            object2 = this.Qa();
            ((ky1_0)object2).C = string2 = ((ProductOptionItem)object).getCode();
            object2 = this;
            this.Oa((ProductOptionItem)object);
        }
        super.onActivityResult(n3, n4, intent);
    }

    public final void onAttach(Context object) {
        boolean bl2;
        Object object2;
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onAttach((Context)object);
        boolean bl3 = object instanceof ea2_1;
        if (bl3) {
            object2 = object;
            object2 = (ea2_1)object;
            this.g = object2;
        }
        if (bl2 = object instanceof j3_0) {
            object2 = object;
            object2 = (j3_0)object;
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, string2);
            this.l = object2;
            bl2 = object instanceof A71;
            if (bl2) {
                object2 = object;
                object2 = (A71)object;
                Intrinsics.checkNotNullParameter(object2, string2);
                this.m = object2;
                bl2 = object instanceof fo3;
                if (bl2) {
                    object2 = object;
                    object2 = (fo3)object;
                    Intrinsics.checkNotNullParameter(object2, string2);
                    this.n = object2;
                    bl2 = object instanceof vh3_2;
                    if (bl2) {
                        object2 = object;
                        object2 = (vh3_2)object;
                        Intrinsics.checkNotNullParameter(object2, string2);
                        this.o = object2;
                        bl2 = object instanceof nm_1;
                        if (bl2) {
                            object2 = object;
                            object2 = (nm_1)object;
                            this.r = object2;
                            if (bl3) {
                                object3 = object;
                                this.p = object3 = (ea2_1)object;
                                bl3 = object instanceof lz1_1;
                                if (bl3) {
                                    boolean bl4;
                                    object = (lz1_1)object;
                                    this.q = object;
                                    this.J = bl4 = og1_1.d();
                                    return;
                                }
                                object = pn_2.b(object, " must implement LoginListener");
                                object3 = new ClassCastException((String)object);
                                throw object3;
                            }
                            object = pn_2.b(object, " must implement ProductDetailListener");
                            object3 = new ClassCastException((String)object);
                            throw object3;
                        }
                        object = pn_2.b(object, " must implement CartClosetListener");
                        object3 = new ClassCastException((String)object);
                        throw object3;
                    }
                    object = pn_2.b(object, " must implement TabListener");
                    object3 = new ClassCastException((String)object);
                    throw object3;
                }
                object = pn_2.b(object, " must implement ToolbarListener");
                object3 = new ClassCastException((String)object);
                throw object3;
            }
            object = pn_2.b(object, " must implement HomeListener");
            object3 = new ClassCastException((String)object);
            throw object3;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object3 = new ClassCastException((String)object);
        throw object3;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater object) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(object, "inflater");
        Object object2 = this.getArguments();
        if (object2 != null) {
            boolean bl2;
            object2 = this.getArguments();
            Menu menu3 = null;
            if (object2 != null) {
                String string2 = "FROM_CART";
                boolean bl22 = object2.getBoolean(string2, false);
                object2 = bl22;
            } else {
                boolean bl3 = false;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            this.D = bl2 = object2.booleanValue();
            if (bl2) {
                int n3 = R$menu.wishlist_menu;
                object.inflate(n3, menu2);
                int n4 = R$id.closet;
                menu2 = menu2.findItem(n4);
                this.U = menu2;
                this.db();
                menu2 = this.U;
                object = "cartMenuItem";
                if (menu2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    menu2 = null;
                }
                if ((menu2 = menu2.getActionView()) != null) {
                    int n7 = 1;
                    object2 = new kh0_0(this, n7);
                    menu2.setOnClickListener((View.OnClickListener)object2);
                }
                if ((menu2 = this.U) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    menu2 = null;
                }
                menu2 = menu2.getActionView();
                Intrinsics.checkNotNull(menu2);
                int n8 = R$id.menu_cart_iv;
                menu2 = menu2.findViewById(n8);
                object2 = "findViewById(...)";
                Intrinsics.checkNotNullExpressionValue(menu2, (String)object2);
                menu2 = (ImageView)menu2;
                boolean bl4 = og1_1.b();
                if (bl4) {
                    int n10 = R$drawable.ic_luxe_view_bag;
                    menu2.setImageResource(n10);
                } else {
                    int n14 = R$drawable.ic_view_bag;
                    menu2.setImageResource(n14);
                }
                int n15 = R$string.menu_cart;
                object2 = hv3_0.K(n15);
                menu2.setContentDescription((CharSequence)object2);
                menu2 = this.U;
                if (menu2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    menu2 = null;
                }
                boolean bl5 = true;
                menu2.setVisible(bl5);
                menu2 = this.U;
                if (menu2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    menu3 = menu2;
                }
                menu3.setEnabled(bl5);
            }
        }
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = this.J;
        String string2 = "<set-?>";
        if (n3 != 0) {
            n3 = R$layout.luxe_closet_layout;
            object = object.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNullParameter(object, string2);
            this.k = object;
        } else {
            n3 = R$layout.fragment_closet_refresh;
            object = object.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNullParameter(object, string2);
            this.k = object;
            object = this.H;
            if (object == null) {
                object = new CustomToolbarViewMerger(this);
                this.H = object;
                viewGroup = this.Ra();
                ((CustomToolbarViewMerger)object).initViews((View)viewGroup);
            }
        }
        return this.Ra();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.Pa().stopLoader();
        Object object = this.s;
        if (object != null) {
            ((RecyclerView)object).setAdapter(null);
        }
        this.H = null;
        object = this.M;
        if (object != null) {
            ((pg2_2)object).a();
        }
        object = new Message();
        ((Message)object).what = 1002;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage((Message)object);
    }

    public final void onNavigationClick() {
        Object object = this.requireActivity();
        Object object2 = "requireActivity(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        boolean bl2 = object.isFinishing();
        if (bl2) {
            return;
        }
        object2 = this.Qa();
        bl2 = ((ky1_0)object2).n();
        if (bl2) {
            int n3 = 1;
            object2 = new oj0_2(object, n3);
            object = this.a;
            ((lq2_1)object).a((Function1)object2);
        } else {
            ((ComponentActivity)object).onBackPressed();
        }
    }

    public final void onPause() {
        super.onPause();
        Object object = this.s;
        Intrinsics.checkNotNull(object);
        object = ((RecyclerView)object).getLayoutManager();
        object = object != null ? ((RecyclerView$o)object).onSaveInstanceState() : null;
        this.b = object;
        Bundle bundle = this.E;
        String string2 = this.c;
        bundle.putParcelable(string2, (Parcelable)object);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            tm3_0.d(fragmentActivity);
        }
        Object object = Looper.getMainLooper();
        fragmentActivity = new Handler(object);
        object = new XX1(this, 0);
        long l2 = 50;
        fragmentActivity.postDelayed((Runnable)object, l2);
        fragmentActivity = this.getView();
        if (fragmentActivity != null) {
            boolean bl2 = true;
            fragmentActivity.setFocusableInTouchMode(bl2);
            fragmentActivity.requestFocus();
            object = new YX1(this);
            fragmentActivity.setOnKeyListener((View.OnKeyListener)object);
        }
    }

    public final void onStop() {
        super.onStop();
        Object object = this.y;
        String string2 = "closet screen";
        ((NewEEcommerceEventsRevamp)object).setPreviousScreenData(string2, string2);
        object = el1_2.a;
        object = this.Z;
        long l2 = System.currentTimeMillis();
        Object object2 = "yyyy-MM-dd'T'hh:mm:ss+0530";
        string2 = k7.f(l2, (String)object2);
        Intrinsics.checkNotNullParameter(object, "startTime");
        Object object3 = "endTime";
        Intrinsics.checkNotNullParameter(string2, (String)object3);
        boolean bl2 = el1_2.j();
        if (bl2) {
            object3 = el1_2.b;
            object2 = new ul1_2((String)object, string2, null);
            int n3 = 3;
            Ae3.d((i90_0)object3, null, null, (Function2)object2, n3);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        this.J = n3 = og1_1.d();
        object2 = this.Qa().i.e;
        Object object4 = this.getViewLifecycleOwner();
        Object object5 = new gy1_2(this);
        oY1$e oY1$e = new oY1$e((Function1)object5);
        object2.e((mu1_1)object4, oY1$e);
        object2 = this.Qa().l;
        object4 = this.getViewLifecycleOwner();
        object5 = new pf1_2(this, 1);
        oY1$e = new oY1$e((Function1)object5);
        object2.e((mu1_1)object4, oY1$e);
        object2 = ((r43_0)this.d.getValue()).d;
        object4 = this.getViewLifecycleOwner();
        object5 = new C5(this, 1);
        oY1$e = new oY1$e((Function1)object5);
        object2.e((mu1_1)object4, oY1$e);
        object2 = this.Qa().m;
        object4 = this.getViewLifecycleOwner();
        object5 = new hy1_1(this);
        object2.e((mu1_1)object4, (F62)object5);
        object2 = this.Qa().i.g;
        object4 = this.getViewLifecycleOwner();
        object5 = new E5(this, 1);
        oY1$e = new oY1$e((Function1)object5);
        object2.e((mu1_1)object4, oY1$e);
        object2 = this.Qa().n;
        object4 = this.getViewLifecycleOwner();
        object5 = new sf1_2(this, 1);
        oY1$e = new oY1$e((Function1)object5);
        object2.e((mu1_1)object4, oY1$e);
        object2 = this.Qa().j;
        object4 = this.getViewLifecycleOwner();
        object5 = new iy1_1(this);
        object2.e((mu1_1)object4, (F62)object5);
        object2 = this.Qa().q;
        object4 = this.getViewLifecycleOwner();
        int n4 = 2;
        object5 = new uf1_2(this, n4);
        oY1$e = new oY1$e((Function1)object5);
        object2.e((mu1_1)object4, oY1$e);
        n3 = R$id.closet_view_bag_imv;
        object2 = (ImageView)object.findViewById(n3);
        this.x = object2;
        if (object2 != null) {
            int n7 = 2;
            object4 = new Y5(this, n7);
            object2.setOnClickListener((View.OnClickListener)object4);
        }
        Intrinsics.checkNotNullParameter(object, (String)object3);
        n3 = R$id.empty_closet_layout;
        object2 = object.findViewById(n3);
        this.t = object2;
        n3 = R$id.closet_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n3);
        this.u = object2;
        n3 = R$id.closet_shimmer_view_container;
        object2 = object.findViewById(n3);
        this.v = object2;
        n3 = R$id.gotoBag;
        object2 = (TextView)object.findViewById(n3);
        this.w = object2;
        int n8 = this.J;
        if (n8 == 0 && object2 != null) {
            n8 = R$string.continue_shopping;
            object3 = hv3_0.K(n8);
            object2.setText((CharSequence)object3);
        }
        if ((n3 = (int)(this.J ? 1 : 0)) != 0) {
            n3 = R$id.luxe_closet_product_rv;
            object2 = (RecyclerView)object.findViewById(n3);
            this.s = object2;
            object3 = this.getActivity();
            int bl2 = 2;
            object2 = new GridLayoutManager((Context)object3, bl2);
            this.G = object3 = new oy1$b_0(this);
            object3 = new py1_1(this);
            object2.setSpanSizeLookup((GridLayoutManager$b)object3);
            object3 = this.s;
            Intrinsics.checkNotNull(object3);
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object2);
            n3 = R$id.luxeClosetCollapsedToolbar;
            object2 = object.findViewById(n3);
            this.h = object2;
            n3 = R$id.saleAppBarLayout;
            object2 = object.findViewById(n3);
            this.i = object2;
        }
        if ((n3 = (int)(this.J ? 1 : 0)) == 0) {
            n3 = R$id.refereeWidget;
            object2 = object.findViewById(n3);
            this.N = object2;
            n3 = R$id.wishlistBAUContainer;
            object2 = object.findViewById(n3);
            this.P = object2;
            n3 = R$id.wishlistSaleContainer;
            object2 = object.findViewById(n3);
            this.Q = object2;
            n3 = R$id.inapp_update_widget;
            object2 = (InAppBottomUpdatesView)object.findViewById(n3);
            this.Y = object2;
        }
        n3 = (int)(this.J ? 1 : 0);
        n8 = 0;
        object3 = null;
        boolean bl2 = true;
        if (n3 != 0) {
            object2 = tr2_2.a;
            n3 = (int)(object2.x(bl2) ? 1 : 0);
            if (n3 != 0) {
                this.Za();
            } else {
                this.Xa();
            }
        } else {
            object2 = tr2_2.a;
            n3 = (int)(object2.x(false) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(tr2_2.l((ScreenType)((Object)(object2 = ScreenType.SCREEN_WISHLIST))) ? 1 : 0)) == 0) {
                this.Xa();
            } else {
                this.Za();
            }
        }
        n3 = R$id.confettiSaleAnim;
        object = (LottieAnimationView)object.findViewById(n3);
        this.S = object;
        object = this.w;
        if (object != null) {
            object2 = new WX1(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = this.Qa();
        object.getClass();
        object2 = md3_0.c((jD3)object);
        n4 = 0;
        oY1$e = null;
        object5 = new oy1_2((ky1_0)object, null);
        Ae3.d((i90_0)object2, null, null, (Function2)object5, 3);
        boolean bl3 = kx3_0.c;
        if (bl3) {
            object = this.u;
            object2 = this.v;
            hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)object2);
            this.p0 = bl2;
            this.Qa().o(0);
            long l2 = System.currentTimeMillis();
            object3 = "yyyy-MM-dd'T'hh:mm:ss+0530";
            object = k7.f(l2, (String)object3);
            this.Z = object;
        } else {
            object = this.Qa().y;
            if (object != null && !(bl3 = ((ArrayList)object).isEmpty())) {
                object = this.Qa().y;
                object2 = this.Qa().z;
                this.cb((ArrayList)object, (ArrayList)object2);
            } else {
                this.p0 = bl2;
                object = this.u;
                object2 = this.v;
                hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)object2);
                object = this.Qa();
                ((ky1_0)object).o(0);
            }
        }
        object = this.N;
        if (object != null) {
            object3 = "closet screen";
            object2 = new pg2_2((View)object, (String)object3);
            this.M = object2;
        }
        object = ((zp2_1)this.k0.getValue()).a;
        object2 = this.getViewLifecycleOwner();
        object3 = new xy1_2(this, 1);
        object4 = new oY1$e((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u2(Product object) {
        Object object2 = "product";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.J;
        String string2 = "<set-?>";
        if (bl2) {
            Exception exception2;
            block9: {
                String string3;
                Object object3;
                Object object4;
                block8: {
                    object4 = this.Qa();
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(object, string2);
                    ((ky1_0)object4).r = object;
                    object4 = this.getParentFragment();
                    if (object4 == null) return;
                    object4 = this.requireParentFragment();
                    bl2 = ((Fragment)object4).isAdded();
                    if (!bl2) return;
                    bl2 = this.isAdded();
                    if (!bl2) return;
                    try {
                        boolean bl3;
                        object4 = new ff1_2();
                        string2 = new Bundle();
                        object3 = ((Product)object).getVariantOptions();
                        object3 = (Collection)object3;
                        string3 = null;
                        if (object3 == null || (bl3 = object3.isEmpty()) || (object3 = ((Product)object).getVariantOptions()) == null) break block8;
                        object3 = object3.get(0);
                        if ((object3 = (ProductOptionItem)object3) == null) break block8;
                        string3 = ((ProductOptionItem)object3).getCode();
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                object3 = "product_code";
                if (string3 != null) {
                    string2.putString((String)object3, string3);
                } else {
                    string3 = ((Product)object).getCode();
                    string2.putString((String)object3, string3);
                }
                string2.putSerializable((String)object2, (Serializable)object);
                ((Fragment)object4).setArguments((Bundle)string2);
                int n3 = 101;
                ((Fragment)object4).setTargetFragment(this, n3);
                object = this.requireParentFragment();
                object = ((Fragment)object).getChildFragmentManager();
                object2 = "Size Dialog Wishlist";
                ((DialogFragment)object4).show((FragmentManager)object, (String)object2);
                return;
            }
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception2);
            return;
        }
        object2 = h40_0.a;
        boolean bl4 = h40_0.c2();
        if (bl4) {
            object2 = ((Product)object).getAverageRating();
            String string4 = ((Product)object).getNumUserRatings();
            jy1_1 jy1_12 = new jy1_1((Product)object);
            ai0_2.r(jy1_12, object2, string4);
        }
        object2 = this.Qa();
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        ((ky1_0)object2).r = object;
        object2 = this.getParentFragment();
        if (object2 == null) return;
        object2 = this.requireParentFragment();
        bl4 = ((Fragment)object2).isAdded();
        if (!bl4) return;
        bl4 = this.isAdded();
        if (!bl4) return;
        try {
            object = ((Product)object).clone();
            Y63.i((Product)object);
            this.eb((Product)object);
            return;
        }
        catch (Exception exception) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception);
        }
    }

    public final void x4(Product object, String string2, boolean bl2) {
        Object object2;
        bl2 = this.ab();
        if (bl2 && (object2 = this.getActivity()) != null && !(bl2 = (object2 = this.requireActivity()).isFinishing()) && object != null && string2 != null && (bl2 = string2.length())) {
            this.Pa().startLoader();
            object2 = this.Qa().i;
            ((BH3)object2).b = object;
            object = ((Product)object).getSourceStoreId();
            if (object == null) {
                object = ld3_2.STORE_AJIO.getStoreId();
            }
            object2 = this.Qa();
            String string3 = "similar products widget";
            ((ky1_0)object2).f(string2, (String)object, string3);
        }
    }
}

