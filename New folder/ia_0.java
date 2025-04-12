/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.SharedPreferences
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat$c;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$Behavior$DragCallback;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.AppsFlyerEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.AddressWidgetView;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.CircularImageView;
import com.ril.ajio.customviews.widgets.ImageSearchCategoryWidget;
import com.ril.ajio.customviews.widgets.ImageUploadWidget;
import com.ril.ajio.customviews.widgets.ImageUploadWidget$ImageUploadWidgetCTAListener;
import com.ril.ajio.customviews.widgets.OnImageSearchCategoryClickListener;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.pdprefresh.data.AjiogramInterventions;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.plp.ProgressRequestBody$a;
import com.ril.ajio.plp.a;
import com.ril.ajio.plp.a$a;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.FacetValueKt;
import com.ril.ajio.services.data.ImageSearchResponse;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.BrandDetails;
import com.ril.ajio.services.data.Product.NewUserBanner;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.ProductType;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.ProductListQuery;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.b;
import org.json.JSONObject;

/*
 * Renamed from Ia
 */
public final class ia_0
extends a51
implements nr2_1,
Pj2,
sg1_2,
OnImageSearchCategoryClickListener,
JU2,
ProgressRequestBody$a,
ImageUploadWidget$ImageUploadWidgetCTAListener,
D82,
yv2_1,
Sj2,
ChangeLocationListener,
zm_2 {
    public static final /* synthetic */ int Y1;
    public boolean A1;
    public ConstraintLayout B1;
    public ConstraintLayout C1;
    public Button D1;
    public ImageUploadWidget E1;
    public ImageView F1;
    public Button G1;
    public CardView H1;
    public ImageSearchResponse I1;
    public InAppBottomUpdatesView J1;
    public final NewCustomEventsRevamp K1;
    public final String L1;
    public final String M1;
    public ShimmerFrameLayout N1;
    public View O1;
    public View P1;
    public RecyclerView Q1;
    public CartAddressListBottomSheet R1;
    public fo_1 S1;
    public ff0_2 T1;
    public String U1;
    public ConstraintLayout V1;
    public boolean W1;
    public boolean X1;
    public final String l1;
    public View m1;
    public yr0_2 n1;
    public CustomToolbarViewMerger o1;
    public ConstraintLayout p1;
    public pr2_2 q1;
    public AppBarLayout r1;
    public CollapsingToolbarLayout s1;
    public SharedPreferences t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public Uri y1;
    public String z1;

    public ia_0() {
        this.l1 = "IS_TOGGLE_VISIBLE";
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.K1 = object2;
        this.L1 = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.M1 = object = cv_0.a((AnalyticsManager$Companion)object);
        this.U1 = "";
    }

    public static String Lb(ProductsList iterator) {
        if (iterator != null && (iterator = ((ProductsList)((Object)iterator)).getProduct_types()) != null) {
            boolean bl2;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                ProductType productType = (ProductType)iterator.next();
                boolean bl3 = productType.getSelected();
                if (!bl3) continue;
                return productType.getType();
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String Mb(ProductsList object) {
        int n3;
        int n4;
        Pagination pagination;
        Object object2 = null;
        if (object != null) {
            pagination = ((ProductsList)object).getPagination();
        } else {
            n4 = 0;
            pagination = null;
        }
        if (pagination == null) return object2;
        if ((object = ((ProductsList)object).getPagination()) != null) {
            n3 = ((Pagination)object).getTotalResults();
            object2 = n3;
        }
        if (object2 != null && (n3 = ((Integer)object2).intValue()) == (n4 = 1)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(object2);
            object2 = " Product";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(object2);
        object2 = " Products";
        ((StringBuilder)object).append((String)object2);
        return ((StringBuilder)object).toString();
    }

    /*
     * Unable to fully structure code
     */
    public final void Bb(CartDeliveryAddress var1_1) {
        var2_2 = this;
        var3_3 = 0;
        var4_4 = this.cb().d.M;
        var5_5 = this.cb().d;
        var6_6 = var5_5.u0;
        var7_7 = null;
        if (var6_6 != 0) {
            var5_5 = this.cb().d.v0;
            var8_8 = this.cb().d.w0;
            var9_9 = var5_5;
            var10_10 = var8_8;
        } else {
            var11_11 = 0;
            var9_9 = null;
            var10_10 = null;
        }
        var5_5 = z40_0.Companion;
        var8_8 = this.requireActivity().getApplication();
        var12_12 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(var8_8, (String)var12_12);
        var5_5.getClass();
        var5_5 = z40$a.a((Context)var8_8).a;
        var8_8 = "brand_description_enable";
        var13_13 = var5_5.a((String)var8_8);
        var14_14 = 1;
        if (var13_13 == 0) ** GOTO lbl-1000
        if (var4_4 != null) {
            var5_5 = var4_4.getDescriptionV2();
        } else {
            var13_13 = 0;
            var5_5 = null;
        }
        if (var5_5 != null && (var13_13 = var5_5.length()) != 0) {
            var15_15 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var15_15 = 0;
            var16_16 = null;
        }
        var17_17 = var15_15 != 0 && var4_4 != null ? (var5_5 = var4_4.getDescriptionV2()) : null;
        var18_18 = this.cb().d.v(false);
        var5_5 = this.cb().d;
        var8_8 = this.cb().e();
        var12_12 = this.cb().d.M;
        if (var12_12 != null && (var12_12 = var12_12.getPagination()) != null) {
            var19_19 = var12_12.getCurrentPage();
            var12_12 = var19_19;
        } else {
            var19_19 = 0;
            var12_12 = null;
        }
        var5_5.F((ArrayList)var8_8, (Integer)var12_12);
        var8_8 = this.cb();
        var12_12 = ImmutableList.copyOf((Collection)this.cb().d.K);
        Intrinsics.checkNotNullExpressionValue(var12_12, "copyOf(...)");
        var5_5 = this.cb().d.M;
        if (var5_5 != null) {
            var20_20 = var5_5 = var5_5.getPlpExtendedBanner();
        } else {
            var21_21 = 0;
            var20_20 = null;
        }
        var22_22 = this.cb().d.r0;
        var23_23 = var2_2.u1;
        var24_24 = this.Xa().c;
        var5_5 = this.Wa().getBannerAdList();
        if (var5_5 == null) {
            var5_5 = new ArrayList();
        }
        var25_25 = var5_5;
        var26_26 = var18_18;
        var5_5 = var8_8.c((ImmutableList)var12_12, (PlpExtendedBanner)var20_20, (boolean)var18_18, (String)var22_22, (boolean)var15_15, (boolean)var6_6, (boolean)var23_23, (List)var24_24, (List)var5_5);
        var25_25 = "<set-?>";
        Intrinsics.checkNotNullParameter(var5_5, (String)var25_25);
        var2_2.P0 = var5_5;
        var5_5 = this.cb().d;
        var5_5.J1 = var27_27 = this.cb().d.K.size();
        var5_5 = this.cb().d.l();
        var8_8 = ld3_2.STORE_AJIO.getStoreId();
        var13_13 = (int)Intrinsics.areEqual(var5_5, var8_8);
        if (var13_13 == 0) ** GOTO lbl-1000
        var5_5 = h40_0.a;
        var13_13 = (int)h40_0.o1();
        if (var13_13 != 0) {
            var28_28 = var5_5 = h40_0.f();
        } else lbl-1000:
        // 2 sources

        {
            var28_28 = null;
        }
        var8_8 = var2_2.P0;
        var12_12 = this.cb().d;
        var5_5 = this.cb().d.M;
        if (var5_5 != null) {
            var20_20 = var5_5 = var5_5.getPlpExtendedBanner();
        } else {
            var21_21 = 0;
            var20_20 = null;
        }
        var29_29 = var2_2.P;
        Intrinsics.checkNotNull(var29_29);
        var30_30 = this.cb().d.r0;
        var15_15 = var2_2.u1;
        var31_31 = ia_0.Lb(this.cb().d.M);
        var32_32 = ia_0.Mb(this.cb().d.M);
        var22_22 = new Ba((Fragment)var2_2, 0);
        var33_33 = new Ca(var2_2, 0);
        var34_34 = var2_2.U0;
        var5_5 = var24_24;
        var35_35 = var33_33;
        var33_33 = this;
        var36_36 = var22_22;
        var22_22 = this;
        var16_16 = this;
        var37_37 = var30_30;
        var30_30 = this;
        var38_38 = var24_24;
        var24_24 = this;
        var39_39 = var25_25;
        var25_25 = var37_37;
        var40_40 = var17_17;
        var37_37 = var4_4;
        var4_4 = var10_10;
        var3_3 = var15_15;
        var2_2 = var31_31;
        var10_10 = var32_32;
        var17_17 = var36_36;
        var31_31 = var35_35;
        var32_32 = this;
        var35_35 = this;
        var36_36 = this;
        var5_5 = new oa_1((List)var8_8, (bv2_0)var12_12, (PlpExtendedBanner)var20_20, this, this, this, (RecyclerViewScrollListener)var29_29, this, this, (String)var25_25, (String)var40_40, (String)var9_9, (String)var4_4, (boolean)var15_15, (String)var2_2, var10_10, (Ba)var17_17, (Ca)var31_31, this, var34_34, this, this, var1_1, (AjiogramInterventions)var28_28);
        var5_5 = this.cb().e();
        var8_8 = var38_38;
        var38_38.i((ArrayList)var5_5);
        var5_5 = this;
        var12_12 = this.G0;
        if (var12_12 == null) {
            var12_12 = Yj2.GRID;
        }
        var20_20 = var39_39;
        Intrinsics.checkNotNullParameter(var12_12, (String)var39_39);
        var8_8.e = var12_12;
        var19_19 = (int)var5_5.u1;
        if (var19_19 != 0) {
            var12_12 = ia_0.Lb(this.cb().d.M);
            var20_20 = ia_0.Mb(this.cb().d.M);
            var8_8.s = var26_26 = 1;
            var8_8.t = var12_12;
            var8_8.u = var20_20;
        } else {
            var26_26 = 1;
        }
        var12_12 = var5_5.B;
        if (var12_12 != null) {
            var12_12.setAdapter((RecyclerView$f)var8_8);
        }
        if ((var8_8 = this.cb().d.M) != null) {
            var8_8 = var8_8.getPlpExtendedBanner();
        } else {
            var27_27 = 0;
            var8_8 = null;
        }
        if (var8_8 != null && var18_18 == 0) {
            var8_8 = h40_0.a;
            var27_27 = (int)h40_0.G1();
            if (var27_27 != 0) {
                this.Kb();
            }
        }
        if (var37_37 != null) {
            var8_8 = var37_37.getFreeTextSearch();
        } else {
            var27_27 = 0;
            var8_8 = null;
        }
        if (var8_8 != null) {
            var8_8 = var37_37.getFreeTextSearch();
            var19_19 = (int)var5_5.a;
            if (var19_19 != 0) {
                var12_12 = this.cb().d;
                var19_19 = (int)var12_12.s;
                if (var19_19 != 0) {
                    var8_8 = this.cb().d.M;
                    if (var8_8 != null && (var8_8 = var8_8.getBrandDetails()) != null) {
                        var8_8 = var8_8.getName();
                    } else {
                        var27_27 = 0;
                        var8_8 = null;
                    }
                }
            }
            var12_12 = var37_37.getPagination();
            var20_20 = "";
            if (var12_12 != null) {
                var12_12 = var37_37.getPagination();
                if (var12_12 != null) {
                    var19_19 = var12_12.getTotalResults();
                    var12_12 = var19_19;
                } else {
                    var19_19 = 0;
                    var12_12 = null;
                }
                var22_22 = var37_37.getPagination();
                if (var22_22 != null) {
                    var22_22.getCurrentPage();
                }
                if ((var22_22 = this.cb().d.f1) != null && (var41_41 = var22_22.length()) != 0) {
                    var12_12 = this.cb().d.f1;
                    if (var12_12 != null) {
                        var20_20 = var12_12;
                    }
                } else if (var12_12 != null && (var21_21 = var12_12.intValue()) == var26_26) {
                    var20_20 = new StringBuilder();
                    var20_20.append(var12_12);
                    var12_12 = " Product";
                    var20_20.append((String)var12_12);
                    var20_20 = var20_20.toString();
                } else {
                    var20_20 = new StringBuilder();
                    var20_20.append(var12_12);
                    var12_12 = " Products";
                    var20_20.append((String)var12_12);
                    var20_20 = var20_20.toString();
                }
            }
            var12_12 = this.cb().d;
            var12_12.f1 = var20_20;
            var5_5.Eb((String)var8_8, (String)var20_20);
        }
        if ((var8_8 = this.cb().d.b1) != null && (var8_8 = this.cb().d.c1) != null) {
            var8_8 = this.cb().d.b1;
            Intrinsics.checkNotNull(var8_8);
            var42_42 = var8_8.longValue();
            var20_20 = this.cb().d.c1;
            Intrinsics.checkNotNull(var20_20);
            var44_43 = var20_20.longValue();
            var5_5.Rb(var42_42, var44_43);
        }
        var8_8 = cp_1.Companion;
        var8_8.getClass();
        cp$a.h();
        var27_27 = cp$a.h() ^ var26_26;
        var12_12 = this.cb().d.v;
        var20_20 = "plp_wishlist_coachmark_in_revamp";
        var41_41 = 0;
        var22_22 = null;
        var19_19 = var12_12.getPreference((String)var20_20, false) ^ var26_26;
        if (var19_19 != 0 && var27_27 != 0) {
            var8_8 = this.requireActivity();
            var12_12 = var5_5.o1;
            if (var12_12 != null) {
                var7_7 = var12_12.getToolbar();
            }
            var12_12 = var7_7;
            var21_21 = R$id.closet_menu;
            var15_15 = R$string.easy_access;
            var16_16 = var5_5.getString(var15_15);
            var29_29 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(var16_16, (String)var29_29);
            var23_23 = R$string.plp_wishlist_coach_mark_desc;
            var30_30 = var5_5.getString(var23_23);
            Intrinsics.checkNotNullExpressionValue(var30_30, (String)var29_29);
            var6_6 = R$color.color_2c4152;
            var24_24 = FontsManager.getInstance();
            AJIOApplication.Companion.getClass();
            var25_25 = AJIOApplication$a.a();
            var14_14 = 10;
            var24_24 = var24_24.getTypefaceWithFont((Context)var25_25, var14_14);
            var25_25 = FontsManager.getInstance();
            var40_40 = AJIOApplication$a.a();
            var11_11 = 9;
            var25_25 = var25_25.getTypefaceWithFont((Context)var40_40, var11_11);
            var40_40 = new Ia$c((ia_0)var5_5);
            Intrinsics.checkNotNullParameter(var16_16, "title");
            Intrinsics.checkNotNullParameter(var30_30, "description");
            var9_9 = "tapTargetViewListener";
            Intrinsics.checkNotNullParameter(var40_40, (String)var9_9);
            if (var8_8 != null && var7_7 != null && (var9_9 = var7_7.findViewById(var21_21)) != null && (var11_11 = (int)var8_8.isFinishing()) == 0) {
                var9_9 = new SpannableString((CharSequence)var30_30);
                var30_30 = new StyleSpan(0);
                var46_44 = var9_9.length();
                var3_3 = 33;
                var9_9.setSpan(var30_30, 0, var46_44, var3_3);
                var46_44 = R$color.white;
                var46_44 = t70.getColor((Context)var8_8, var46_44);
                var30_30 = new ForegroundColorSpan(var46_44);
                var46_44 = var9_9.length();
                var9_9.setSpan(var30_30, 0, var46_44, var3_3);
                var23_23 = var9_9.length();
                var9_9.setSpan(var25_25, 0, var23_23, var3_3);
                var30_30 = new SpannableString((CharSequence)var16_16);
                var15_15 = var30_30.length();
                var30_30.setSpan(var24_24, 0, var15_15, var3_3);
                var12_12 = TapTarget.forToolbarMenuItem(var7_7, var21_21, (CharSequence)var30_30, (CharSequence)var9_9).outerCircleColor(var6_6).drawShadow((boolean)var26_26).targetRadius(80).cancelable((boolean)var26_26).transparentTarget((boolean)var26_26).titleTextSize(16);
                var21_21 = 12;
                var12_12 = var12_12.descriptionTextSize(var21_21);
                TapTargetView.showFor((Activity)var8_8, (TapTarget)var12_12, (TapTargetView$Listener)var40_40);
            }
        }
        this.Sb();
    }

    public final void Cb() {
        Object object = this.cb().d.a1;
        if (object != null) {
            Object object2 = this.cb().d;
            int n3 = 0;
            Object object3 = null;
            boolean bl2 = ((bv2_0)object2).v(false);
            if (bl2) {
                object2 = this.q1;
                if (object2 != null && (object2 = ((pr2_2)object2).e) != null) {
                    object3 = ((StoreInfo)object).getColorTheme();
                    n3 = Color.parseColor((String)object3);
                    object2.setBackgroundColor(n3);
                }
                if ((object2 = this.q1) != null && (object2 = ((pr2_2)object2).f) != null) {
                    object3 = ((StoreInfo)object).getTextColor();
                    n3 = Color.parseColor((String)object3);
                    object2.setTextColor(n3);
                }
                if ((object2 = this.q1) != null && (object2 = ((pr2_2)object2).g) != null) {
                    object3 = ((StoreInfo)object).getTextColor();
                    n3 = Color.parseColor((String)object3);
                    object2.setTextColor(n3);
                }
                if ((object2 = this.q1) != null && (object2 = ((pr2_2)object2).e) != null && (object2 = ((Toolbar)object2).getNavigationIcon()) != null) {
                    int n4 = Color.parseColor((String)((StoreInfo)object).getHeaderIconColor());
                    object3 = hy_0.SRC_IN;
                    object = by_0.a(n4, (hy_0)((Object)object3));
                    object2.setColorFilter((ColorFilter)object);
                }
            } else {
                object2 = this.o1;
                if (object2 != null) {
                    object3 = ((StoreInfo)object).getColorTheme();
                    n3 = Color.parseColor((String)object3);
                    ((CustomToolbarViewMerger)object2).setBackGroundColor(n3);
                }
                if ((object2 = this.o1) != null) {
                    object3 = ((StoreInfo)object).getTextColor();
                    n3 = Color.parseColor((String)object3);
                    ((CustomToolbarViewMerger)object2).setTitleColor(n3);
                }
                if ((object2 = this.o1) != null) {
                    object3 = ((StoreInfo)object).getTextColor();
                    n3 = Color.parseColor((String)object3);
                    ((CustomToolbarViewMerger)object2).setSubTitleColor(n3);
                }
                if ((object2 = this.o1) != null) {
                    object = ((StoreInfo)object).getHeaderIconColor();
                    int n7 = Color.parseColor((String)object);
                    ((CustomToolbarViewMerger)object2).setNavigationIconColor(n7);
                }
            }
        }
        if ((object = this.getActivity()) != null) {
            object = this.requireActivity();
            object.invalidateOptionsMenu();
        }
    }

    public final void Db(String string2) {
        int n3;
        Object object = this.cb().d;
        boolean n32 = ((bv2_0)object).v(false);
        if (n32) {
            int n4;
            if (string2 != null && (n4 = string2.length()) != 0 && (object = this.q1) != null && (object = ((pr2_2)object).g) != null) {
                object.setText((CharSequence)string2);
            }
        } else if (string2 != null && (n3 = string2.length()) != 0) {
            object = this.V1;
            if (object != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.o1) != null) {
                ((CustomToolbarViewMerger)object).setSubTitleText(string2);
            }
        }
    }

    public final void Eb(String object, String object2) {
        int n3;
        Object object3;
        Object object4;
        int n7;
        int n8 = 1;
        Object object5 = this.cb().d.M;
        if (object5 != null && (object5 = ((ProductsList)object5).getPagination()) != null && (n7 = ((Pagination)object5).getCurrentPage()) == 0 && ((object5 = this.Z0) == null || (n7 = ((String)object5).length()) == 0)) {
            object5 = object == null ? "" : object;
            object4 = "<set-?>";
            Intrinsics.checkNotNullParameter(object5, (String)object4);
            this.Z0 = object5;
            object5 = object;
        } else {
            object5 = this.Z0;
        }
        object4 = this.cb().d.M;
        if (object4 != null && (object4 = ((ProductsList)object4).getBrandDetails()) != null) {
            object4 = ((BrandDetails)object4).getName();
        } else {
            boolean n4 = false;
            object4 = null;
        }
        Object object6 = this.cb();
        boolean bl2 = ((F12)object6).b();
        if (bl2) {
            int n4;
            object6 = this.cb().d;
            boolean bl3 = ((bv2_0)object6).s;
            if (bl3 && object4 != null && (n4 = ((String)object4).length()) != 0) {
                object5 = object4;
            }
        }
        boolean bl4 = this.u1;
        long l2 = 300L;
        if (bl4) {
            int n10;
            object = this.o1;
            if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                n10 = R$string.acc_page_header_plp;
                object2 = hv3_0.K(n10);
                object.setContentDescription((CharSequence)object2);
            }
            if ((object = this.q1) != null && (object = ((pr2_2)object).e) != null) {
                n10 = R$string.acc_page_header_plp;
                object2 = hv3_0.K(n10);
                object.setContentDescription((CharSequence)object2);
            }
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            object2 = new Ga(this, 0);
            object.postDelayed((Runnable)object2, l2);
            return;
        }
        object4 = this.cb().d;
        boolean bl5 = ((bv2_0)object4).v(false);
        if (bl5) {
            if (object != null && (n7 = ((String)object).length()) != 0 && (object5 = this.q1) != null && (object5 = ((pr2_2)object5).f) != null) {
                object5.setText((CharSequence)object);
            }
            if (object2 != null && (n7 = ((String)object2).length()) != 0 && (object5 = this.q1) != null && (object5 = ((pr2_2)object5).g) != null) {
                object5.setText((CharSequence)object2);
            }
        } else {
            int n14;
            if (object5 != null && (n14 = ((String)object5).length()) != 0) {
                StringBuilder stringBuilder;
                int n15;
                object4 = this.o1;
                if (object4 != null) {
                    ((CustomToolbarViewMerger)object4).setTitleText((String)object5);
                }
                object5 = this.o1;
                object4 = " ";
                if (object5 != null && (object5 = ((CustomToolbarViewMerger)object5).getHeaderTitleTv()) != null) {
                    n15 = R$string.header_text;
                    object3 = hv3_0.K(n15);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object);
                    stringBuilder.append((String)object4);
                    stringBuilder.append((String)object3);
                    object3 = stringBuilder.toString();
                    object5.setContentDescription((CharSequence)object3);
                }
                if ((object5 = this.o1) != null && (object5 = ((CustomToolbarViewMerger)object5).getHeaderSubTitleTv()) != null) {
                    n15 = R$string.title_text;
                    object3 = hv3_0.K(n15);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object);
                    stringBuilder.append((String)object4);
                    stringBuilder.append((String)object3);
                    object4 = stringBuilder.toString();
                    object5.setContentDescription((CharSequence)object4);
                }
            }
            if (object2 != null && (n7 = ((String)object2).length()) != 0 && (object5 = this.o1) != null) {
                ((CustomToolbarViewMerger)object5).setSubTitleText((String)object2);
            }
        }
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = this.o1;
            object5 = "format(...)";
            if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
                object4 = StringCompanionObject.INSTANCE;
                int n16 = R$string.acc_page_header_plp_title;
                object4 = hv3_0.K(n16);
                object3 = new Object[n8];
                object3[0] = object;
                object3 = Arrays.copyOf(object3, n8);
                object4 = String.format((String)object4, object3);
                Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                object2.setContentDescription((CharSequence)object4);
            }
            if ((object2 = this.q1) != null && (object2 = ((pr2_2)object2).e) != null) {
                object4 = StringCompanionObject.INSTANCE;
                int n17 = R$string.acc_page_header_plp_title;
                object4 = hv3_0.K(n17);
                object3 = new Object[n8];
                object3[0] = object;
                object = Arrays.copyOf(object3, n8);
                object = String.format((String)object4, (Object[])object);
                Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                object2.setContentDescription((CharSequence)object);
            }
        } else {
            object = this.o1;
            if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                n3 = R$string.acc_page_header_plp;
                object2 = hv3_0.K(n3);
                object.setContentDescription((CharSequence)object2);
            }
            if ((object = this.q1) != null && (object = ((pr2_2)object).e) != null) {
                n3 = R$string.acc_page_header_plp;
                object2 = hv3_0.K(n3);
                object.setContentDescription((CharSequence)object2);
            }
        }
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new qa(this);
        object.postDelayed((Runnable)object2, l2);
    }

    public final boolean H4() {
        bv2_0 bv2_02 = this.cb().d;
        return bv2_02.v(false);
    }

    public final void Ha(PLPExtras pLPExtras) {
        Intrinsics.checkNotNullParameter(pLPExtras, "plpExtras");
        String string2 = String.valueOf(pLPExtras.w);
        this.Qb(pLPExtras, string2);
    }

    public final void I5() {
        int n3;
        CardView cardView = this.z;
        if (cardView != null && (n3 = cardView.getVisibility()) == 0 && (cardView = this.z) != null) {
            ai0_2.k((View)cardView);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Ib() {
        var1_1 = this.cb().d;
        var2_2 = 0;
        var3_3 = var1_1.v(false);
        var1_1 = this.B;
        var4_4 = null;
        if (var1_1 != null) {
            var1_1 = var1_1.getAdapter();
        } else {
            var5_5 = 0;
            var1_1 = null;
        }
        var1_1 = (oa_1)var1_1;
        var6_6 = this.cb().d;
        var7_7 = var6_6.u0;
        if (var7_7) {
            var6_6 = this.cb().d.v0;
            var8_8 = this.cb().d.w0;
        } else {
            var9_9 = 0;
            var6_6 = null;
            var10_10 = 0;
            var8_8 = null;
        }
        var11_11 = this.U0;
        var12_12 = 1;
        if (var11_11 != null) {
            if (var1_1 != null) {
                var13_13 = "videoPlayer";
                Intrinsics.checkNotNullParameter(var11_11, (String)var13_13);
                var1_1.y = var11_11;
            }
            var11_11.j(var12_12, (boolean)var12_12);
            var14_14 = this.a;
            if (var14_14 != 0) {
                var11_11 = this.cb().d.M;
                if (var11_11 != null && (var11_11 = var11_11.getBrandDetails()) != null) {
                    var11_11 = var11_11.getMetaData();
                } else {
                    var14_14 = 0;
                    var11_11 = null;
                }
                if (var11_11 != null) {
                    var11_11 = this.B;
                    var13_13 = new Object();
                    var13_13.a = var11_11;
                    var13_13.d = -1;
                    var15_15 = 40 != 0;
                    var13_13.h = var15_15;
                    if (var11_11 != null) {
                        var16_16 = new ab3_1((bb3_1)var13_13);
                        var11_11.addOnScrollListener((RecyclerView$s)var16_16);
                    }
                    var13_13.h = var14_14 = 70;
                }
            }
        }
        var11_11 = z40_0.Companion;
        var13_13 = this.requireActivity().getApplication();
        var16_16 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(var13_13, (String)var16_16);
        var11_11.getClass();
        var11_11 = z40$a.a((Context)var13_13).a;
        var13_13 = "brand_description_enable";
        var14_14 = var11_11.a((String)var13_13);
        if (var14_14 == 0) ** GOTO lbl-1000
        var11_11 = this.cb().d.M;
        if (var11_11 != null) {
            var11_11 = var11_11.getDescriptionV2();
        } else {
            var14_14 = 0;
            var11_11 = null;
        }
        if (var11_11 != null && (var14_14 = var11_11.length()) != 0) {
            var15_15 = true;
        } else lbl-1000:
        // 2 sources

        {
            var15_15 = false;
            var16_16 = null;
        }
        if (var15_15 && (var11_11 = this.cb().d.M) != null) {
            var11_11 = var11_11.getDescriptionV2();
        } else {
            var14_14 = 0;
            var11_11 = null;
        }
        if (var1_1 != null) {
            var1_1.p = var11_11;
        }
        if (var1_1 != null) {
            var1_1.q = var6_6;
            var1_1.r = var8_8;
        }
        if ((var9_9 = this.u1) != 0 && var1_1 != null) {
            var6_6 = ia_0.Lb(this.cb().d.M);
            var8_8 = ia_0.Mb(this.cb().d.M);
            var1_1.s = var12_12;
            var1_1.t = var6_6;
            var1_1.u = var8_8;
        }
        if (var1_1 != null) {
            var6_6 = this.cb().d;
            var8_8 = this.cb().e();
            var11_11 = this.cb().d.M;
            if (var11_11 != null && (var11_11 = var11_11.getPagination()) != null) {
                var14_14 = var11_11.getCurrentPage();
                var11_11 = var14_14;
            } else {
                var14_14 = 0;
                var11_11 = null;
            }
            var6_6.F((ArrayList)var8_8, (Integer)var11_11);
            var6_6 = this.cb();
            var8_8 = ImmutableList.copyOf((Collection)this.cb().d.K);
            Intrinsics.checkNotNullExpressionValue(var8_8, "copyOf(...)");
            var11_11 = this.cb().d.M;
            if (var11_11 != null) {
                var11_11 = var11_11.getPlpExtendedBanner();
            } else {
                var14_14 = 0;
                var11_11 = null;
            }
            var13_13 = this.cb().d.r0;
            var17_17 = this.u1;
            var18_18 = this.Xa().c;
            var19_19 = this.Wa().getBannerAdList();
            if (var19_19 == null) {
                var19_19 = new ArrayList<E>();
            }
            var6_6 = var6_6.c((ImmutableList)var8_8, (PlpExtendedBanner)var11_11, var3_3, (String)var13_13, var15_15, var7_7, var17_17, var18_18, var19_19);
            Intrinsics.checkNotNullParameter(var6_6, "<set-?>");
            this.P0 = var6_6;
            var6_6 = this.cb().d;
            var8_8 = this.cb().d.K;
            var6_6.J1 = var10_10 = var8_8.size();
            var6_6 = this.cb().e();
            var1_1.i((ArrayList)var6_6);
            var6_6 = this.P0;
            if (var6_6 != null) {
                var1_1.f = var6_6;
            }
            var1_1.notifyDataSetChanged();
        }
        if (var1_1 != null) {
            var1_1.o = var6_6 = this.cb().d.r0;
        }
        if ((var1_1 = this.cb().d.M) != null) {
            var6_6 = var1_1.getFreeTextSearch();
        } else {
            var9_9 = 0;
            var6_6 = null;
        }
        if (var6_6 != null) {
            var6_6 = this.Z0;
            var6_6 = var6_6 != null && (var9_9 = var6_6.length()) != 0 ? this.Z0 : var1_1.getFreeTextSearch();
            var10_10 = this.a;
            if (var10_10 != 0) {
                var8_8 = this.cb().d;
                var10_10 = var8_8.s;
                if (var10_10 != 0) {
                    var6_6 = this.cb().d.M;
                    if (var6_6 != null && (var6_6 = var6_6.getBrandDetails()) != null) {
                        var6_6 = var6_6.getName();
                    } else {
                        var9_9 = 0;
                        var6_6 = null;
                    }
                }
            }
            if ((var8_8 = var1_1.getPagination()) != null) {
                var8_8 = var1_1.getPagination();
                if (var8_8 != null) {
                    var10_10 = var8_8.getTotalResults();
                    var4_4 = var10_10;
                }
                if ((var1_1 = var1_1.getPagination()) != null) {
                    var5_5 = var1_1.getCurrentPage();
                } else {
                    var5_5 = 0;
                    var1_1 = null;
                }
                if (var4_4 != null && (var10_10 = var4_4.intValue()) == var12_12) {
                    var8_8 = new StringBuilder();
                    var8_8.append(var4_4);
                    var11_11 = " Product";
                    var8_8.append((String)var11_11);
                    var8_8 = var8_8.toString();
                } else {
                    var8_8 = new StringBuilder();
                    var8_8.append(var4_4);
                    var11_11 = " Products";
                    var8_8.append((String)var11_11);
                    var8_8 = var8_8.toString();
                }
            } else {
                var8_8 = "";
                var5_5 = 0;
                var1_1 = null;
            }
            if (var5_5 == 0) {
                this.Eb((String)var6_6, (String)var8_8);
                var6_6 = this.B;
                if (var6_6 != null) {
                    var6_6.scrollToPosition(0);
                }
            }
            var2_2 = var5_5;
        }
        if (var2_2 == 0 && (var1_1 = this.cb().d.b1) != null && (var1_1 = this.cb().d.c1) != null) {
            var1_1 = this.cb().d.b1;
            Intrinsics.checkNotNull(var1_1);
            var20_20 = var1_1.longValue();
            var6_6 = this.cb().d.c1;
            Intrinsics.checkNotNull(var6_6);
            var22_21 = var6_6.longValue();
            this.Rb(var20_20, var22_21);
        }
    }

    public final void J2(int n3, List list) {
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3;
        ia_0 ia_02 = this;
        Object object3 = list;
        Object object4 = this.cb().d.W1;
        Object object5 = new ArrayList();
        object4 = ((ArrayList)object4).iterator();
        while (bl3 = object4.hasNext()) {
            object2 = object4.next();
            object = object2;
            object = (FacetValue)object2;
            bl2 = ((FacetValue)object).getSelected();
            if (!bl2) continue;
            ((ArrayList)object5).add(object2);
        }
        object4 = new ArrayList();
        object5 = ((ArrayList)object5).iterator();
        while (bl3 = object5.hasNext()) {
            object2 = object5.next();
            object = object2;
            object = (FacetValue)object2;
            bl2 = ((FacetValue)object).isQuickFilter() ^ true;
            if (!bl2) continue;
            ((ArrayList)object4).add(object2);
        }
        if (object3 != null) {
            int n4;
            object5 = this.cb().d;
            object5.getClass();
            object2 = "facetValueList";
            Intrinsics.checkNotNullParameter(object3, object2);
            object5 = ((bv2_0)object5).X1;
            ((ArrayList)object5).clear();
            object = object3;
            object = (Collection)object3;
            ((ArrayList)object5).addAll(object);
            object5 = this.cb().d;
            object5.getClass();
            Intrinsics.checkNotNullParameter(object4, object2);
            object5 = ((bv2_0)object5).W1;
            ((ArrayList)object5).clear();
            bl3 = ((ArrayList)object4).isEmpty() ^ true;
            if (bl3) {
                ((ArrayList)object5).addAll(object4);
            }
            object4 = (object4 = ia_02.B) != null ? ((RecyclerView)object4).getAdapter() : null;
            if ((object4 = (oa_1)object4) != null) {
                n4 = n3;
                ((RecyclerView$f)object4).notifyItemChanged(n3);
            }
            object3 = ((Iterable)object3).iterator();
            object4 = "";
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object5 = (FacetValue)object3.next();
                object2 = ((FacetValue)object5).getCode();
                if (object2 == null) continue;
                bl2 = ((FacetValue)object5).getSelected();
                if (bl2) {
                    object = this.cb().d.R;
                    ((HashMap)object).put(object2, object5);
                    n4 = ((String)object4).length();
                    if (n4 != 0) {
                        object5 = ",";
                        object2 = ((String)object5).concat((String)object2);
                    }
                    object4 = Qj0.b((String)object4, object2);
                    continue;
                }
                object = this.cb().d.S;
                ((HashMap)object).put(object2, object5);
            }
            object5 = ia_02.K1;
            object2 = ((NewCustomEventsRevamp)object5).getEVENT_CATEGORY_QUICK_FILTER_INTERACTIONS();
            int n7 = ((String)object4).length();
            if (n7 == 0) {
                object4 = "none";
            }
            String string2 = ((NewCustomEventsRevamp)object5).getEVENT_NAME_QUICK_FILTER_INTERACTIONS();
            String string3 = o72_0.a;
            object = "popup - done clicked";
            String string4 = "plp screen";
            String string5 = ia_02.L1;
            String string6 = ia_02.M1;
            int n8 = 1664;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, object2, (String)object, (String)object4, string2, string3, string4, string5, null, string6, false, null, n8, null);
            this.P2();
            object3 = this.cb().d;
            object5 = ((bv2_0)object3).M;
            if (object5 != null) {
                object3 = this.cb();
                object4 = ((F12)object3).d;
                string2 = null;
                string3 = null;
                bl3 = false;
                object2 = null;
                bl2 = false;
                object = null;
                int n10 = 60;
                bv2_0.B((bv2_0)object4, (ProductsList)object5, false, false, null, null, null, n10);
            }
        }
    }

    public final void Kb() {
        Object object = this.r1;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
            object = null;
        }
        boolean bl2 = true;
        ((AppBarLayout)object).setExpanded(false, bl2);
        object = this.B;
        if (object != null) {
            ((RecyclerView)object).setNestedScrollingEnabled(false);
        }
        if ((object = this.B) != null) {
            ViewCompat$c.n((View)object, false);
        }
    }

    public final void L5() {
        Object object = this.cb();
        boolean bl2 = ((F12)object).g();
        if (bl2) {
            object = tr2_2.a;
            tr2_2.h(this.v0);
            object = this.q1;
            if (object != null) {
                ((pr2_2)object).a();
            }
            if ((object = this.B) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            object = AnalyticsManager.Companion.getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
            String string2 = o72_0.a;
            String string3 = "show bbs price";
            String string4 = "bbs widget";
            int n3 = 8;
            GTMEvents.pushWidgetInteractionEvent$default(gTMEvents, string4, string3, string2, null, n3, null);
        } else {
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginListener");
                bl2 = false;
                object = null;
            }
            String string5 = "plp - bbs widget";
            int n4 = 58;
            object.z0(n4, string5);
        }
    }

    public final void L6(FacetValue facetValue, int n3, int n4) {
        ia_0 ia_02 = this;
        Object object = facetValue;
        Object object2 = "facetValue";
        Intrinsics.checkNotNullParameter(facetValue, (String)object2);
        String string2 = facetValue.getCode();
        if (string2 != null) {
            String string3;
            String string4;
            String string5;
            String string6;
            boolean bl2;
            String string7;
            Object object3;
            boolean bl3;
            this.P2();
            Object object4 = this.cb().d;
            object4.getClass();
            Intrinsics.checkNotNullParameter(facetValue, (String)object2);
            object2 = ((bv2_0)object4).X1.iterator();
            while (bl3 = object2.hasNext()) {
                object4 = (FacetValue)object2.next();
                object3 = ((FacetValue)object4).getCode();
                boolean bl4 = kotlin.text.b.i((String)object3, string7 = facetValue.getCode(), bl2 = true);
                if (!bl4) continue;
                bl4 = false;
                object3 = null;
                ((FacetValue)object4).setSelected(false);
            }
            object2 = this.cb().d.S;
            ((HashMap)object2).put(string2, object);
            object = this.cb().d;
            object3 = ((bv2_0)object).M;
            if (object3 != null) {
                object = this.cb();
                object4 = ((F12)object).d;
                string6 = null;
                string5 = null;
                string7 = null;
                bl2 = false;
                string4 = null;
                string3 = null;
                int n7 = 60;
                bv2_0.B((bv2_0)object4, (ProductsList)object3, false, false, null, null, null, n7);
            }
            object = (object = ia_02.B) != null ? ((RecyclerView)object).getAdapter() : null;
            if ((object = (oa_1)object) != null) {
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
            object = " - deselected";
            string7 = string2.concat((String)object);
            object4 = ia_02.K1;
            object3 = ((NewCustomEventsRevamp)object4).getEVENT_CATEGORY_QUICK_FILTER_INTERACTIONS();
            string4 = String.valueOf(n4);
            string3 = ((NewCustomEventsRevamp)object4).getEVENT_NAME_QUICK_FILTER_INTERACTIONS();
            string6 = o72_0.a;
            string5 = "plp screen";
            String string8 = ia_02.L1;
            String string9 = ia_02.M1;
            int n8 = 1664;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object3, string7, string4, string3, string6, string5, string8, null, string9, false, null, n8, null);
        }
    }

    public final void M9(String object) {
        String string2 = "addressId";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = h40_0.Q1();
        if (bl2 && (object = this.R1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        this.cb().h();
    }

    public final void N7() {
        lm_2 lm_22 = new lm_2();
        Intrinsics.checkNotNullParameter(this, "cartAddressCallBackListener");
        lm_22.S = this;
        Object object = this.Va().l();
        object = object != null ? object.getAddressType() : null;
        Object object2 = AddressType.Pincode;
        if (object == object2) {
            object = this.Va().m();
            if (object == null) {
                object = "";
            }
            object2 = "preFillPinCode";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            lm_22.R = object;
        }
        object = this.requireActivity().getSupportFragmentManager();
        lm_22.show((FragmentManager)object, "CartAddAddressBottomSheet");
    }

    public final void Nb() {
        boolean bl2 = this.A1;
        if (bl2) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.K1;
            String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
            int n3 = 1536;
            String string3 = "retake image";
            String string4 = "";
            String string5 = "event_upload_image_interactions";
            String string6 = "search plp screen";
            String string7 = "search plp screen";
            String string8 = this.L1;
            String string9 = this.M1;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n3, null);
        }
        this.A1 = false;
    }

    public final void O3() {
        View view = this.O1;
        if (view != null) {
            ai0_2.B(view);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Ob() {
        Object object;
        int n3;
        String string2;
        Object object2;
        Object object3;
        String string3;
        Object object4;
        Object object5;
        Object object6;
        ia_0 ia_02;
        block51: {
            block50: {
                long l2;
                long l3;
                long l4;
                long l7;
                int n4;
                block46: {
                    block48: {
                        block45: {
                            block44: {
                                block49: {
                                    int n7;
                                    int n8;
                                    block47: {
                                        ia_02 = this;
                                        boolean bl2 = this.u1;
                                        if (!bl2) return;
                                        object6 = (PLPExtras)this.bb().a.d();
                                        if (object6 == null) return;
                                        object6 = ((PLPExtras)object6).x;
                                        if (object6 == null) return;
                                        object5 = z40_0.Companion;
                                        object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a;
                                        boolean bl3 = ((ao0_0)object5).a("shouldResizeEnable");
                                        object4 = AJIOApplication$a.a();
                                        n8 = vV1.e((Context)object4);
                                        n4 = 0;
                                        string3 = null;
                                        int n10 = 8;
                                        if (n8 == 0) {
                                            this.Kb();
                                            object6 = this.C1;
                                            if (object6 != null) {
                                                object6.setVisibility(0);
                                            }
                                            if ((object6 = ia_02.w) != null) {
                                                object6.setVisibility(n10);
                                            }
                                            if ((object6 = ia_02.H1) != null) {
                                                object6.setVisibility(n10);
                                            }
                                            if ((object6 = ia_02.O) != null) {
                                                object6.setVisibility(n10);
                                            }
                                            if ((object6 = ia_02.u0) != null) {
                                                object6.setVisibility(n10);
                                            }
                                            if ((object6 = ia_02.E) != null) {
                                                object6.setVisibility(n10);
                                            }
                                            if ((object6 = ia_02.T) != null) {
                                                object6.setVisibility(n10);
                                            }
                                            if ((object6 = ia_02.F) != null) {
                                                object6.setVisibility(n10);
                                            }
                                            if ((object6 = ia_02.B1) == null) return;
                                            object6.setVisibility(n10);
                                            return;
                                        }
                                        object4 = this.E1;
                                        if (object4 != null) {
                                            ((ImageUploadWidget)((Object)object4)).requestAccessibilityFocus();
                                        }
                                        if ((object4 = ia_02.E1) != null) {
                                            object4.setVisibility(0);
                                        }
                                        object4 = new File((String)object6);
                                        object4 = Uri.fromFile((File)object4);
                                        object3 = ia_02.E1;
                                        if (object3 != null) {
                                            Intrinsics.checkNotNull(object4);
                                            object3.loadImage((Uri)object4);
                                        }
                                        if ((object3 = ia_02.E1) != null) {
                                            object3.startImageUpload();
                                        }
                                        this.Kb();
                                        object3 = ia_02.E1;
                                        if (object3 != null) {
                                            object3.setVisibility(0);
                                        }
                                        if ((object3 = ia_02.w) != null) {
                                            object3.setVisibility(0);
                                        }
                                        object3 = ia_02.s1;
                                        object2 = null;
                                        if (object3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("collapsingToolbar");
                                            n7 = 0;
                                            object3 = null;
                                        }
                                        object3.setVisibility(0);
                                        object3 = ia_02.p1;
                                        if (object3 != null) {
                                            object3.setVisibility(n10);
                                        }
                                        if ((object3 = ia_02.H1) != null) {
                                            object3.setVisibility(n10);
                                        }
                                        if ((object3 = ia_02.O) != null) {
                                            object3.setVisibility(n10);
                                        }
                                        if ((object3 = ia_02.u0) != null) {
                                            object3.setVisibility(n10);
                                        }
                                        if ((object3 = ia_02.E) != null) {
                                            object3.setVisibility(n10);
                                        }
                                        if ((object3 = ia_02.T) != null) {
                                            object3.setVisibility(n10);
                                        }
                                        if ((object3 = ia_02.F) != null) {
                                            object3.setVisibility(n10);
                                        }
                                        if ((object3 = ia_02.B1) != null) {
                                            object3.setVisibility(n10);
                                        }
                                        string2 = "ajio_compress";
                                        if (!bl3) break block47;
                                        object6 = ia_02.z1;
                                        if (object6 != null) {
                                            object5 = this.getContext();
                                            try {
                                                object6 = Od1.a((String)object6);
                                                object5 = object5.getCacheDir();
                                                object4 = new File((File)object5, string2);
                                                ((File)object4).createNewFile();
                                                break block44;
                                            }
                                            catch (Exception exception) {
                                                n8 = 0;
                                                object4 = null;
                                                break block45;
                                            }
                                        }
                                        break block48;
                                    }
                                    this.getContext();
                                    object5 = new File((String)object6);
                                    l7 = ((File)object5).length();
                                    l4 = 1024L;
                                    l7 = l7 / l4 / l4;
                                    l3 = 10;
                                    n7 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
                                    if (n7 < 0) break block49;
                                    object6 = ia_02.z1;
                                    if (object6 == null) break block50;
                                    object5 = this.getContext();
                                    object6 = BitmapFactory.decodeFile((String)object6);
                                    n8 = object6.getHeight();
                                    n7 = object6.getWidth();
                                    boolean bl4 = n8 * n7;
                                    n3 = 777600;
                                    double d2 = (double)(bl4 /= n3);
                                    long l8 = 0x3FF0000000000000L;
                                    double d5 = 1.0;
                                    double d7 = d2 - d5;
                                    object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                                    if (object > 0) {
                                        d2 = Math.sqrt(d2);
                                        l8 = Math.round((double)n8 / d2);
                                        n8 = (int)l8;
                                        d5 = (double)n7 / d2;
                                        long l12 = Math.round(d5);
                                        n7 = (int)l12;
                                        bl4 = true;
                                        object6 = Bitmap.createScaledBitmap((Bitmap)object6, (int)n7, (int)n8, (boolean)bl4);
                                    }
                                    object5 = object5.getCacheDir();
                                    object4 = new File((File)object5, string2);
                                    try {
                                        ((File)object4).createNewFile();
                                        break block46;
                                    }
                                    catch (IOException iOException) {}
                                }
                                Intrinsics.checkNotNull(object4);
                                ia_02.Ub((Uri)object4);
                                break block51;
                                catch (IOException iOException) {}
                            }
                            object5 = new ByteArrayOutputStream();
                            string2 = Bitmap.CompressFormat.PNG;
                            object6.compress((Bitmap.CompressFormat)string2, 0, (OutputStream)object5);
                            object6 = ((ByteArrayOutputStream)object5).toByteArray();
                            try {
                                object5 = new FileOutputStream((File)object4);
                                ((FileOutputStream)object5).write((byte[])object6);
                                ((OutputStream)object5).flush();
                                ((FileOutputStream)object5).close();
                            }
                            catch (Exception exception) {}
                        }
                        if (object4 != null) {
                            object2 = Uri.fromFile((File)object4);
                        }
                    }
                    if (object2 == null) {
                        object6 = ia_02.E1;
                        if (object6 != null) {
                            ((ImageUploadWidget)((Object)object6)).showTechError();
                        }
                        break block51;
                    } else {
                        ia_02.Ub((Uri)object2);
                    }
                    break block51;
                }
                object5 = new ByteArrayOutputStream();
                string2 = Bitmap.CompressFormat.PNG;
                object6.compress((Bitmap.CompressFormat)string2, 0, (OutputStream)object5);
                object6 = ((ByteArrayOutputStream)object5).toByteArray();
                try {
                    object5 = new FileOutputStream((File)object4);
                    ((FileOutputStream)object5).write((byte[])object6);
                    ((OutputStream)object5).flush();
                    ((FileOutputStream)object5).close();
                }
                catch (Exception exception) {}
                if ((n4 = (l2 = (l7 = ((File)object4).length() / l4 / l4) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) {
                    Intrinsics.checkNotNull(object4);
                    object2 = Uri.fromFile((File)object4);
                }
            }
            if (object2 == null) {
                object6 = ia_02.E1;
                if (object6 != null) {
                    ((ImageUploadWidget)((Object)object6)).showOverSizeError();
                }
            } else {
                ia_02.Ub((Uri)object2);
            }
        }
        object6 = h40_0.a;
        object6 = "isGA4";
        object5 = "true";
        Bundle bundle = E1.a((String)object6, (String)object5);
        object4 = ia_02.K1;
        string3 = ((NewCustomEventsRevamp)object4).getEC_IMAGE_SEARCH();
        n3 = 0;
        string2 = "";
        object3 = "";
        object2 = "screen_view";
        String string4 = "image upload screen";
        String string5 = "image upload screen";
        String string6 = ia_02.L1;
        String string7 = ia_02.M1;
        int n14 = 1536;
        object = 0;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string3, string2, (String)object3, (String)object2, string4, string5, string6, bundle, string7, false, null, n14, null);
    }

    public final void P8(int n3) {
        int n4;
        Object object;
        ia_0 ia_02 = this;
        int n7 = n3;
        int n8 = 4;
        if (n3 == n8 && (object = this.J1) != null && (n8 = object.getVisibility()) == (n4 = 8)) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.K1;
            String string2 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
            String string3 = this.K1.getINSTALL_NOW_CTA_VIEW();
            object = AnalyticsManager.Companion;
            String string4 = av_0.a((AnalyticsManager$Companion)object);
            String string5 = av_0.a((AnalyticsManager$Companion)object);
            int n10 = 1536;
            String string6 = "";
            String string7 = "event_app_update_interaction";
            String string8 = this.L1;
            String string9 = this.M1;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string6, string7, string4, string5, string8, null, string9, false, null, n10, null);
        }
        if ((object = ia_02.J1) != null) {
            object.setUIForState(n7);
        }
    }

    public final void Pb() {
        ue1_2.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "searchBarCameraListener");
        Object object = "PLP";
        Intrinsics.checkNotNullParameter(object, "sourcePage");
        ue1_2 ue1_22 = new ue1_2();
        ue1_22.h = this;
        ue1_22.i = object;
        ue1_22.j = null;
        object = this.getChildFragmentManager();
        ue1_22.show((FragmentManager)object, "ImageSearch");
        NewCustomEventsRevamp newCustomEventsRevamp = this.K1;
        String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
        String string3 = this.L1;
        String string4 = this.M1;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "image search click", "search plp screen-icon", "event_image_search_click", "search plp screen", "search plp screen", string3, null, string4, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Qb(PLPExtras object, String object2) {
        Object object3 = h40_0.a;
        boolean bl2 = h40_0.b();
        boolean bl3 = true;
        if (bl2) {
            if (object2 == null) return;
            try {
                object = this.getActivity();
                if (object != null) {
                    object = this.Ua();
                    object3 = this.Ua();
                    object3 = object3.y();
                    Object object4 = de0_2.Companion;
                    Boolean bl4 = Boolean.TRUE;
                    object4.getClass();
                    object2 = de0$a.a((String)object2, bl4);
                    object4 = "de0";
                    j3$a.a((j3_0)object, (Fragment)object3, (Fragment)object2, bl3, (String)object4);
                }
                object = Unit.a;
                return;
            }
            catch (Exception exception) {
                object = Unit.a;
                return;
            }
        }
        og1_1.c();
        this.bb().a.k(object);
        object2 = ((PLPExtras)object).e;
        if (object2 == null) {
            object2 = "";
        }
        object = ((PLPExtras)object).H;
        object = at2_1.b((String)object2, (String)object);
        object2 = this.getActivity();
        if (object2 == null) return;
        this.Ua().N();
        object2 = this.Ua();
        object3 = this.Ua().y();
        Object var6_7 = null;
        j3$a.a((j3_0)object2, (Fragment)object3, (Fragment)object, bl3, null);
    }

    public final void Rb(long l2, long l3) {
        long l4;
        long l7 = 1L;
        long l8 = k7.p();
        long l12 = (l2 += l7) - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object <= 0 && (l4 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1)) < 0) {
            CountDownTimer countDownTimer = this.Q;
            if (countDownTimer != null) {
                Intrinsics.checkNotNull(countDownTimer);
                countDownTimer.cancel();
            }
            countDownTimer = new Ia$b(this, l3 -= l8);
            this.Q = countDownTimer = countDownTimer.start();
        }
    }

    public final void Sb() {
        long l2;
        Serializable serializable;
        Object object;
        Object object2;
        int n3;
        Object object3 = this.cb().d.M;
        if (object3 == null) {
            return;
        }
        long l3 = k7.p();
        Object object4 = this.cb().d.M;
        boolean bl2 = false;
        Serializable serializable2 = null;
        object4 = object4 != null ? ((ProductsList)object4).getOfferEndTime() : null;
        long l4 = 0L;
        if (object4 != null && (n3 = ((String)object4).length()) != 0) {
            object2 = new Date();
            object = "yyyy-MM-dd HH:mm:ss";
            Locale locale = Locale.ENGLISH;
            serializable = new SimpleDateFormat((String)object, locale);
            try {
                object2 = serializable.parse((String)object4);
            }
            catch (ParseException parseException) {}
            if (object2 != null) {
                l2 = ((Date)object2).getTime();
                object4 = l2;
            } else {
                object4 = null;
            }
        } else {
            object4 = l4;
        }
        object2 = this.cb().d.M;
        if (object2 != null) {
            object2 = ((ProductsList)object2).getTimerStartBefore();
        } else {
            n3 = 0;
            object2 = null;
        }
        l2 = k7.t((String)object2);
        object = this.cb().d.M;
        if (object != null) {
            bl2 = ((ProductsList)object).getEndTimerVisibility();
            serializable2 = bl2;
        }
        if (bl2 = hv3_0.i0(serializable2, (Long)(object2 = Long.valueOf(l2)), (Long)object4, (Long)(serializable = Long.valueOf(l3)))) {
            long l7;
            long l8;
            serializable2 = new Ref$LongRef();
            if (object4 == null || (l8 = (l7 = (l2 = ((Long)object4).longValue()) - l4) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
                Intrinsics.checkNotNull(object4);
                l4 = (Long)object4;
                n3 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
                if (n3 > 0) {
                    ((Ref$LongRef)serializable2).element = l4 = (Long)object4 - l3;
                }
            }
            object3 = t62_0.d(TimeUnit.MILLISECONDS);
            Object object5 = qt2_2.b;
            object3 = ((t62_0)object3).g((Scheduler)object5);
            object5 = ti_2.a();
            object3 = ((t62_0)object3).e((HandlerScheduler)object5);
            object5 = new ja_0((Ref$LongRef)serializable2, this);
            ((t62_0)object3).c((e62_0)object5);
        }
    }

    public final void T2() {
        boolean bl2;
        Object object = new fo_1();
        this.S1 = object;
        ((fo_1)object).h = bl2 = true;
        Object object2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        ((fo_1)object).i = this;
        object = this.S1;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.S1) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void Ta(ProductsList object) {
        int n3;
        Object object2;
        g53_0 g53_02 = null;
        if (object != null) {
            object2 = ((ProductsList)object).getPagination();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            int n4;
            if ((object = ((ProductsList)object).getPagination()) != null) {
                n4 = ((Pagination)object).getCurrentPage();
                object = n4;
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null && (n4 = ((Integer)object).intValue()) == 0) {
                object = z40_0.Companion;
                object2 = this.requireActivity().getApplication();
                Object object3 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                object.getClass();
                object = z40$a.a((Context)object2).a;
                object2 = "new_user_plp";
                n4 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
                if (n4 != 0) {
                    object = this.cb();
                    object2 = this.r;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeListener");
                        n3 = 0;
                        object2 = null;
                    }
                    n3 = object2.M() ^ 1;
                    object = ((F12)object).b;
                    object3 = ((yx3)object).d;
                    Object object4 = ((UserInformation)object3).getUserEmailId();
                    boolean n7 = ((UserInformation)object3).isUserOnline();
                    BaseRepo baseRepo = ((yx3)object).b;
                    t30_0 t30_02 = ((yx3)object).c;
                    if (n7 && n3 != 0 && object4 != null && (n3 = ((String)object4).length()) != 0) {
                        object2 = baseRepo.getNewUserBanner();
                        baseRepo = ((yx3)object).a;
                        g53_02 = UserRepo.getUserType$default((UserRepo)baseRepo, (String)object4, null, 2, null);
                        object3 = new Object();
                        object4 = new vx3((ux3)object3);
                        g53_02 = g53_0.i((g53_0)object2, g53_02, (dx_0)object4);
                        object2 = new wx3((yx3)object);
                        int n8 = 1;
                        object = new of3_0(object2, n8);
                        object2 = new Object();
                        int n10 = 1;
                        object3 = new gu2_0(n10, (Function1)object2);
                        object = g53_02.f((o60_0)object, (o60_0)object3);
                        t30_02.b((yr0_2)object);
                    } else {
                        g53_02 = baseRepo.getNewUserBanner();
                        int n14 = 1;
                        object2 = new jw1_1(object, n14);
                        object3 = new iu2_0(1, (Function1)object2);
                        object2 = new lw1_1(object, 2);
                        int n15 = 1;
                        object = new ju2_1(n15, (Function1)object2);
                        object = g53_02.f((o60_0)object3, (o60_0)object);
                        t30_02.b((yr0_2)object);
                    }
                }
            }
        }
    }

    public final void Tb() {
        ia_0 ia_02 = this;
        boolean bl2 = this.u1;
        if (bl2) {
            Object object;
            Object object2 = this.cb().d.d1;
            if (object2 != null && (object = this.C) != null) {
                ((ImageSearchCategoryWidget)object).setDataImageSearch((Uri)object2);
            }
            if ((object2 = ia_02.C) != null) {
                ((ImageSearchCategoryWidget)object2).setImageSearchCamera();
            }
            this.Kb();
            object2 = ia_02.I1;
            if (object2 != null) {
                String string2;
                int n3;
                String string3;
                String string4;
                String string5;
                String string6;
                String string7;
                String string8;
                Object object3;
                Object object4;
                String string9;
                Object object5;
                boolean bl3;
                object = ((ImageSearchResponse)object2).getProduct_types();
                int n4 = 8;
                NewCustomEventsRevamp newCustomEventsRevamp = ia_02.K1;
                boolean bl4 = true;
                int n7 = 0;
                String string10 = null;
                if (object != null && (bl3 = (object = (Collection)object).isEmpty() ^ bl4) == bl4) {
                    boolean bl5;
                    object = ia_02.E;
                    if (object != null) {
                        object.setVisibility(0);
                    }
                    if ((object = ia_02.T) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = ia_02.F) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = ia_02.B) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = ia_02.C) != null) {
                        object5 = ((ImageSearchResponse)object2).getProduct_types();
                        string9 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.ril.ajio.services.data.ProductType>";
                        Intrinsics.checkNotNull(object5, string9);
                        object5 = TypeIntrinsics.asMutableList(object5);
                        ((ImageSearchCategoryWidget)object).setCategory((List)object5);
                    }
                    if ((object = ia_02.C) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = ((ImageSearchResponse)object2).getProduct_types()) == null) {
                        object = mz0_2.a;
                    }
                    object = object.iterator();
                    object5 = "";
                    object4 = object5;
                    while (bl5 = object.hasNext()) {
                        object5 = ((ProductType)object.next()).getType();
                        string9 = ", ";
                        object4 = n1.a((String)object4, string9, (String)object5);
                    }
                    string9 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
                    bl3 = false;
                    object3 = "impressions on category";
                    string8 = "search_interactions";
                    string7 = "search plp screen";
                    string6 = "search plp screen";
                    string5 = ia_02.L1;
                    string4 = null;
                    String string11 = ia_02.M1;
                    object5 = newCustomEventsRevamp;
                    string10 = string11;
                    bl4 = false;
                    string3 = null;
                    object = newCustomEventsRevamp;
                    newCustomEventsRevamp = null;
                    n3 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string9, (String)object3, (String)object4, string8, string7, string6, string5, null, string11, false, null, n3, null);
                    string9 = null;
                } else {
                    object = newCustomEventsRevamp;
                    object5 = ia_02.E;
                    if (object5 != null) {
                        object5.setVisibility(n4);
                    }
                    if ((object5 = ia_02.T) != null) {
                        object5.setVisibility(n4);
                    }
                    if ((object5 = ia_02.F) != null) {
                        object5.setVisibility(n4);
                    }
                    if ((object5 = ia_02.B) != null) {
                        object5.setVisibility(n4);
                    }
                    object5 = ia_02.B1;
                    string9 = null;
                    if (object5 != null) {
                        object5.setVisibility(0);
                    }
                    if ((object5 = ia_02.F1) != null) {
                        object3 = ia_02.y1;
                        object5.setImageURI(object3);
                    }
                    object4 = ia_02.K1;
                    string8 = ((NewCustomEventsRevamp)object4).getEC_IMAGE_SEARCH();
                    int n8 = 1536;
                    string7 = "retry another image";
                    string6 = "";
                    string5 = "zsr_screen_interactions";
                    string4 = "search plp screen";
                    string10 = "search plp screen";
                    string3 = ia_02.L1;
                    newCustomEventsRevamp = null;
                    object5 = ia_02.M1;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string8, string7, string6, string5, string4, string10, string3, null, (String)object5, false, null, n8, null);
                }
                object5 = ia_02.E1;
                if (object5 != null) {
                    object5.setVisibility(n4);
                }
                if ((object2 = ((ImageSearchResponse)object2).getPagination()) != null) {
                    n7 = ((Pagination)object2).getTotalResults();
                } else {
                    n7 = 0;
                    string10 = null;
                }
                string4 = new Bundle();
                object2 = ((NewCustomEventsRevamp)object).getNUMBER_OF_RESULT();
                string4.putInt((String)object2, n7);
                bl2 = ia_02.u1;
                if (bl2) {
                    string4.putString("plp_source_details", "image upload");
                    object2 = "plp_source";
                    string2 = "search";
                    string4.putString((String)object2, string2);
                }
                if (!(bl2 = ia_02.w1)) {
                    ia_02.w1 = bl2 = true;
                    object2 = h40_0.a;
                    object2 = "isGA4";
                    string2 = "true";
                    string4.putString((String)object2, string2);
                    string9 = ((NewCustomEventsRevamp)object).getEC_IMAGE_SEARCH();
                    bl4 = false;
                    string3 = null;
                    newCustomEventsRevamp = null;
                    object3 = "";
                    object4 = "";
                    string8 = "screen_view";
                    string7 = "search plp screen";
                    string6 = "search plp screen";
                    string5 = ia_02.L1;
                    string10 = ia_02.M1;
                    n3 = 1536;
                    object5 = object;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string9, (String)object3, (String)object4, string8, string7, string6, string5, (Bundle)string4, string10, false, null, n3, null);
                }
            }
        }
    }

    public final void U() {
        Object object = yn3_0.a;
        int n3 = 0;
        Object[] objectArray = new Object[]{};
        String string2 = "onFinish: 100%";
        ((yn3$a)object).a(string2, objectArray);
        object = this.E1;
        if (object != null) {
            n3 = 100;
            ((ImageUploadWidget)((Object)object)).setProgress(n3);
        }
    }

    public final void Ub(Uri object) {
        Object object2 = object.getPath();
        Object object3 = this.cb().d.p;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        ua ua2 = new ua(this, (String)object2);
        object2 = new Ia$a(ua2);
        ((LiveData)object3).e(mu1_12, (F62)object2);
        this.getContext();
        object = object.getPath();
        int n3 = ((String)object).lastIndexOf(".") + 1;
        object = ((String)object).substring(n3);
        object2 = this.cb();
        Intrinsics.checkNotNull(object);
        object2.getClass();
        object3 = "objectExtension";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object2 = ((F12)object2).d;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = new ev2_2((bv2_0)object2, (String)object, null);
        Ae3.d(((bv2_0)object2).e, null, null, (Function2)object3, 3);
    }

    public final int Ya() {
        return R$id.plp_filter_frag_container;
    }

    public final void Z5() {
        int n3;
        View view = null;
        this.X1 = false;
        Object object = this.v;
        if (object != null && (n3 = object.getVisibility()) == 0 && (object = this.q1) != null) {
            object.d = false;
            view = object.h;
            if (view != null) {
                ai0_2.B(view);
            }
        }
        if ((view = this.P1) != null) {
            n3 = 8;
            view.setVisibility(n3);
        }
    }

    public final void a1() {
        Object object = this.getContext();
        if (object != null) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object2 = o72_0.a;
            Object object3 = "about_brand_plp";
            ((GTMEvents)object).pushButtonTapEvent("about_brand", object3, (String)object2);
            object2 = this.requireContext();
            object = new BottomSheetDialog((Context)object2);
            object.requestWindowFeature(1);
            int n3 = R$layout.brand_desc_bottom_sheet_view;
            ((BottomSheetDialog)object).setContentView(n3);
            n3 = R$id.brand_desc_cancel_layout;
            object2 = ((on)object).findViewById(n3);
            int n4 = R$id.brand_desc_cancel_iv;
            View view = ((on)object).findViewById(n4);
            if (object2 != null) {
                object3 = new ra((BottomSheetDialog)object);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
            if (view != null) {
                object2 = new sa((BottomSheetDialog)object);
                view.setOnClickListener((View.OnClickListener)object2);
            }
            n3 = R$id.brand_desc_bottom_sheet_title_tv;
            object2 = (TextView)((on)object).findViewById(n3);
            n4 = R$id.brand_desc_bottom_sheet_desc_tv;
            view = (TextView)((on)object).findViewById(n4);
            object3 = this.cb().d.M;
            if (object3 != null) {
                String string2 = ((ProductsList)object3).getFreeTextSearch();
                object3 = ((ProductsList)object3).getDescriptionV2();
                if (object2 != null) {
                    object2.setText((CharSequence)string2);
                }
                if (view != null) {
                    view.setText((CharSequence)object3);
                }
            }
            object2 = new ta((BottomSheetDialog)object);
            object.setOnShowListener((DialogInterface.OnShowListener)object2);
            object.show();
        }
    }

    public final void a8(PLPExtras pLPExtras) {
        Intrinsics.checkNotNullParameter(pLPExtras, "plpExtras");
        String string2 = pLPExtras.x;
        if (string2 == null) {
            string2 = "";
        }
        Object object = new File(string2);
        object = Uri.fromFile((File)object).toString();
        this.Qb(pLPExtras, (String)object);
    }

    public final void b8(double d2, double d5) {
        ff0_2 ff0_22;
        this.T1 = ff0_22 = new ff0_2();
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ff0_22.j = this;
        ff0_22 = this.T1;
        if (ff0_22 != null) {
            string2 = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, string2);
            ff0_22.i = this;
        }
        if ((ff0_22 = this.T1) != null) {
            ff0_22.l = d2;
            ff0_22.m = d5;
        }
        if (ff0_22 != null) {
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string3 = "CartLocationBottomSheet";
            ff0_22.show(fragmentManager, string3);
        }
    }

    public final void eb(ProductsList object) {
        int n3;
        Object object2 = this.cb();
        boolean bl2 = ((F12)object2).b();
        if (bl2) {
            return;
        }
        bl2 = false;
        object2 = null;
        Object object3 = object != null ? ((ProductsList)object).getProducts() : null;
        Object object4 = object3;
        object4 = (Collection)object3;
        if (object4 != null && (n3 = object4.isEmpty()) == 0) {
            object4 = this.cb().d.u;
            Object object5 = Boolean.TRUE;
            n3 = Intrinsics.areEqual(object4, object5);
            if (n3 == 0) {
                return;
            }
            object3 = (Iterable)object3;
            n3 = 4;
            object3 = CollectionsKt.f0((Iterable)object3, n3);
            int n4 = yx_2.o((Iterable)object3, 10);
            object4 = new Object(n4);
            object3 = object3.iterator();
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object5 = ((Product)object3.next()).getFnlColorVariantData();
                if (object5 != null) {
                    object5 = ((ProductFnlColorVariantData)object5).getColorGroup();
                } else {
                    n4 = 0;
                    object5 = null;
                }
                ((ArrayList)object4).add(object5);
            }
            object2 = AppsFlyerEvents.INSTANCE;
            if ((object = ((ProductsList)object).getFreeTextSearch()) == null) {
                object = "";
            }
            n4 = 0;
            object5 = null;
            int n7 = 63;
            object3 = CollectionsKt.R(object4, null, null, null, null, n7);
            ((AppsFlyerEvents)object2).sendSearchEvent((String)object, (String)object3);
        }
    }

    public final void f0(boolean bl2) {
        NewCustomEventsRevamp newCustomEventsRevamp = null;
        this.A1 = false;
        if (bl2) {
            newCustomEventsRevamp = this.K1;
            String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
            String string3 = "upload image icon interactions";
            String string4 = "pop up close";
            String string5 = "event_upload_image_icon_interactions";
            String string6 = "search plp screen";
            String string7 = "search plp screen";
            String string8 = this.L1;
            String string9 = this.M1;
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n3, null);
        }
    }

    public final void f7(int n3) {
        boolean bl2;
        Object object;
        boolean bl3;
        Object object2;
        Object object3;
        int n4;
        ia_0 ia_02 = this;
        Object object4 = this.cb().d.X1;
        Object object5 = new ArrayList();
        object4 = ((ArrayList)object4).iterator();
        while ((n4 = object4.hasNext()) != 0) {
            object2 = object3 = object4.next();
            object2 = (FacetValue)object3;
            bl3 = ((FacetValue)object2).getSelected();
            if (!bl3) continue;
            ((ArrayList)object5).add(object3);
        }
        object4 = this.cb().d.W1.iterator();
        while ((n4 = object4.hasNext()) != 0) {
            object3 = (FacetValue)object4.next();
            object2 = ((FacetValue)object3).getCode();
            if (object2 == null) continue;
            object = this.cb().d.S;
            ((HashMap)object).put(object2, object3);
        }
        object4 = this.cb().d.X1.iterator();
        while ((n4 = object4.hasNext()) != 0) {
            object3 = (FacetValue)object4.next();
            bl3 = false;
            object2 = null;
            ((FacetValue)object3).setSelected(false);
        }
        object4 = ia_02.B;
        object4 = object4 != null ? ((RecyclerView)object4).getAdapter() : null;
        if ((object4 = (oa_1)object4) != null) {
            n4 = n3;
            ((RecyclerView$f)object4).notifyItemChanged(n3);
        }
        this.P2();
        object4 = ((ArrayList)object5).iterator();
        while (bl2 = object4.hasNext()) {
            object5 = (FacetValue)object4.next();
            object3 = ((FacetValue)object5).getCode();
            if (object3 == null) continue;
            object2 = this.cb().d.S;
            ((HashMap)object2).put(object3, object5);
        }
        object = ia_02.K1;
        String string2 = ((NewCustomEventsRevamp)object).getEVENT_CATEGORY_QUICK_FILTER_INTERACTIONS();
        String string3 = ((NewCustomEventsRevamp)object).getEVENT_NAME_QUICK_FILTER_INTERACTIONS();
        String string4 = o72_0.a;
        String string5 = "clear all - nav";
        String string6 = "";
        String string7 = "plp screen";
        String string8 = ia_02.L1;
        String string9 = ia_02.M1;
        int n7 = 1664;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string2, string5, string6, string3, string4, string7, string8, null, string9, false, null, n7, null);
        this.cb().d.W1.clear();
        object4 = this.cb().d;
        object3 = ((bv2_0)object4).M;
        if (object3 != null) {
            object4 = this.cb();
            object5 = ((F12)object4).d;
            string5 = null;
            string6 = null;
            bl3 = false;
            object2 = null;
            boolean bl4 = true;
            string2 = null;
            int n8 = 56;
            bv2_0.B((bv2_0)object5, (ProductsList)object3, false, bl4, null, null, null, n8);
        }
    }

    public final void fb() {
        int n3;
        Object object;
        Object object2;
        int n4;
        int n7;
        int n8;
        Object object3 = (PLPExtras)this.bb().a.d();
        if (object3 != null) {
            this.u1 = n8 = ((PLPExtras)object3).C;
            n7 = (int)(((PLPExtras)object3).A ? 1 : 0);
            this.v1 = n7;
        }
        this.B0 = n7 = this.l;
        object3 = this.v;
        n8 = 8;
        if (object3 != null) {
            object3.setVisibility(n8);
        }
        object3 = this.w;
        int n10 = 0;
        Object object4 = null;
        if (object3 != null) {
            object3.setVisibility(0);
        }
        n7 = (int)(h40_0.Q1() ? 1 : 0);
        Object object5 = null;
        if (n7 != 0) {
            object3 = this.w;
            if (object3 != null) {
                n4 = R$id.address_bar_ui_bau;
                object3 = object3.findViewById(n4);
            } else {
                n7 = 0;
                object3 = null;
            }
            this.y = object3;
            this.W1 = false;
            if (object3 != null) {
                object3.setVisibility(n8);
            }
            if ((object3 = this.x) != null) {
                object3.setVisibility(n8);
            }
        }
        if ((object3 = this.getView()) != null) {
            n4 = R$id.layout_category;
            object3 = (ImageSearchCategoryWidget)object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.C = object3;
        if (object3 != null) {
            ((ImageSearchCategoryWidget)object3).setOnImageSearchCategoryClickListener(this);
        }
        if ((object3 = this.w) != null) {
            n4 = R$id.plp_product_rv;
            object3 = (RecyclerView)object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.B = object3;
        object3 = this.w;
        if (object3 != null) {
            n4 = R$id.layout_selected_filter_bau;
            object3 = object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.P1 = object3;
        object3 = this.w;
        if (object3 != null) {
            n4 = R$id.sticky_selected_quick_filters_rv_bau;
            object3 = (RecyclerView)object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.Q1 = object3;
        n7 = (int)(this.u1 ? 1 : 0);
        if (n7 != 0 && (object3 = this.B) != null) {
            object3.setPadding(0, 0, 0, 0);
        }
        this.Ab();
        object3 = h40_0.a;
        object3 = this.cb();
        n7 = (int)(h40_0.P0(((F12)object3).b()) ? 1 : 0);
        if (n7 != 0 && (n7 = (int)(og1_1.c() ? 1 : 0)) == 0 && (n7 = (int)(this.u1 ? 1 : 0)) == 0) {
            object3 = this.w;
            if (object3 != null) {
                n4 = R$id.plp_filter_rv;
                object3 = (RecyclerView)object3.findViewById(n4);
            } else {
                n7 = 0;
                object3 = null;
            }
            this.D = object3;
            this.vb();
        }
        if ((object3 = this.w) != null) {
            n4 = R$id.offer_timer;
            object3 = (TextView)object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.M = object3;
        object3 = this.w;
        if (object3 != null) {
            n4 = R$id.plp_zero_product_layout;
            object3 = object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.Y = object3;
        if (object3 != null) {
            n4 = R$id.continue_shopping_pd_btn;
            object3 = (AjioTextView)object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.Z = object3;
        object3 = this.Y;
        if (object3 != null) {
            n4 = R$id.empty_layout_title;
            object3 = (AjioTextView)object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.k0 = object3;
        object3 = this.Y;
        if (object3 != null) {
            n4 = R$id.empty_layout_subtitle;
            object3 = (AjioTextView)object3.findViewById(n4);
        } else {
            n7 = 0;
            object3 = null;
        }
        this.p0 = object3;
        object3 = this.Y;
        if (object3 != null) {
            object3.setVisibility(n8);
        }
        if ((object3 = this.Z) != null) {
            object3.setVisibility(n8);
        }
        object3 = this.o1;
        Object object6 = "parentView";
        if (object3 == null) {
            this.o1 = object3 = new CustomToolbarViewMerger(this);
            object2 = this.m1;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n4 = 0;
                object2 = null;
            }
            ((CustomToolbarViewMerger)object3).initViews((View)object2);
        }
        if ((n7 = (object3 = this.getActivity()) instanceof AppCompatActivity) != 0) {
            object3 = this.getActivity();
            object2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = (AppCompatActivity)object3;
            object = this.o1;
            if (object != null) {
                object = ((CustomToolbarViewMerger)object).getToolbar();
            } else {
                n3 = 0;
                object = null;
            }
            ((AppCompatActivity)object3).setSupportActionBar((Toolbar)object);
            object3 = this.getActivity();
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = ((AppCompatActivity)object3).getSupportActionBar();
            if (object3 != null) {
                ((ActionBar)object3).q();
            }
        }
        if ((n7 = (int)(((F12)(object3 = this.cb())).b() ? 1 : 0)) != 0) {
            object2 = this.o1;
            if (object2 != null) {
                n3 = R$drawable.back_arrow_fleek;
                String string2 = "productListPage";
                boolean bl2 = false;
                Object var14_16 = null;
                int n14 = 10;
                CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object2, n3, null, string2, null, n14, null);
            }
            if ((object3 = this.m1) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            } else {
                object5 = object3;
            }
            n7 = R$id.app_bar_layout;
            object3 = (AppBarLayout)object5.findViewById(n7);
            if (object3 != null) {
                ((AppBarLayout)object3).setExpanded(false);
            }
        } else {
            object3 = this.o1;
            if (object3 != null) {
                object4 = this.m1;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object5 = object4;
                }
                object6 = object5.getContext();
                object4 = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
                n10 = R$attr.plp_filter_back;
                n4 = tm3_0.b(n10, (Context)object6);
                n8 = R$string.acc_back_icon_product_details;
                object = this.getString(n8);
                String string3 = "productListPage";
                Object var12_13 = null;
                int n15 = 8;
                boolean bl3 = false;
                object5 = object3;
                CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object3, n4, (String)object, string3, null, n15, null);
            }
        }
        if ((n7 = (int)(this.u1 ? 1 : 0)) != 0) {
            this.Tb();
        } else {
            this.Cb();
        }
        object3 = this.o1;
        if (object3 != null) {
            ((CustomToolbarViewMerger)object3).setNavigationClick();
        }
        if ((n7 = (int)(this.a ? 1 : 0)) != 0) {
            object3 = this.cb().d;
            n7 = (int)(((bv2_0)object3).s ? 1 : 0);
            if (n7 != 0) {
                object3 = this.B;
                object6 = new Object();
                ((bb3_1)object6).a = object3;
                ((bb3_1)object6).d = -1;
                ((bb3_1)object6).h = n10 = 40;
                if (object3 != null) {
                    object4 = new ab3_1((bb3_1)object6);
                    ((RecyclerView)object3).addOnScrollListener((RecyclerView$s)object4);
                }
                ((bb3_1)object6).h = n7 = 70;
            }
        }
        this.o0();
        n7 = (int)(this.X1 ? 1 : 0);
        if (n7 != 0) {
            this.ya();
        }
    }

    public final void gb() {
        int n3;
        int n4 = 0;
        Object object = null;
        int n7 = this.u1;
        if (n7 != 0) {
            this.fb();
            return;
        }
        this.B0 = n7 = this.m;
        Object object2 = this.w;
        int n8 = 8;
        if (object2 != null) {
            object2.setVisibility(n8);
        }
        if ((object2 = this.v) != null) {
            object2.setVisibility(0);
        }
        n7 = (int)(h40_0.Q1() ? 1 : 0);
        boolean bl2 = true;
        Object object3 = null;
        if (n7 != 0) {
            object2 = this.v;
            if (object2 != null) {
                n3 = R$id.address_bar_ui_sale;
                object2 = object2.findViewById(n3);
            } else {
                n7 = 0;
                object2 = null;
            }
            this.x = object2;
            this.W1 = bl2;
            if (object2 != null) {
                object2.setVisibility(n8);
            }
            if ((object2 = this.y) != null) {
                object2.setVisibility(n8);
            }
        }
        if ((object2 = this.v) != null) {
            n8 = R$id.plp_product_rv_sale;
            object2 = (RecyclerView)object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.B = object2;
        object2 = this.v;
        if (object2 != null) {
            n8 = R$id.layout_selected_filter_sale;
            object2 = object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.P1 = object2;
        object2 = this.v;
        if (object2 != null) {
            n8 = R$id.sticky_selected_quick_filters_rv_sale;
            object2 = (RecyclerView)object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.Q1 = object2;
        n7 = (int)(this.u1 ? 1 : 0);
        if (n7 != 0 && (object2 = this.B) != null) {
            object2.setPadding(0, 0, 0, 0);
        }
        if ((object2 = this.v) != null) {
            n8 = R$id.layout_category_sales;
            object2 = (ImageSearchCategoryWidget)object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.C = object2;
        if (object2 != null) {
            ((ImageSearchCategoryWidget)object2).setOnImageSearchCategoryClickListener(this);
        }
        this.Ab();
        object2 = h40_0.a;
        object2 = this.cb();
        n7 = (int)(h40_0.P0(((F12)object2).b()) ? 1 : 0);
        if (n7 != 0 && (n7 = (int)(og1_1.c() ? 1 : 0)) == 0) {
            object2 = this.v;
            if (object2 != null) {
                n8 = R$id.plp_filter_rv_sale;
                object2 = (RecyclerView)object2.findViewById(n8);
            } else {
                n7 = 0;
                object2 = null;
            }
            this.D = object2;
            this.vb();
        }
        if ((object2 = this.v) != null) {
            n8 = R$id.offer_timer_sale;
            object2 = (TextView)object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.M = object2;
        object2 = this.v;
        if (object2 != null) {
            n8 = R$id.plp_zero_product_layout_sale;
            object2 = object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.Y = object2;
        if (object2 != null) {
            n8 = R$id.continue_shopping_pd_btn;
            object2 = (AjioTextView)object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.Z = object2;
        object2 = this.Y;
        if (object2 != null) {
            n8 = R$id.empty_layout_title;
            object2 = (AjioTextView)object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.k0 = object2;
        object2 = this.Y;
        if (object2 != null) {
            n8 = R$id.empty_layout_subtitle;
            object2 = (AjioTextView)object2.findViewById(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        this.p0 = object2;
        this.o1 = null;
        Object object4 = this.v;
        this.q1 = object2 = new pr2_2((View)object4, this, false);
        object2 = this.getActivity();
        n7 = object2 instanceof AppCompatActivity;
        if (n7 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object4 = this.q1;
            if (object4 != null) {
                object4 = object4.e;
            } else {
                n8 = 0;
                object4 = null;
            }
            ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object4);
        }
        if ((n7 = (int)(((F12)(object2 = this.cb())).b() ? 1 : 0)) != 0) {
            object2 = this.q1;
            if (object2 != null && (object2 = ((pr2_2)object2).e) != null) {
                n8 = R$drawable.back_arrow_fleek;
                ((Toolbar)object2).setNavigationIcon(n8);
            }
        } else {
            object2 = this.q1;
            if (object2 != null && (object2 = ((pr2_2)object2).e) != null) {
                object4 = this.m1;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentView");
                    n8 = 0;
                    object4 = null;
                }
                object4 = object4.getContext();
                String string2 = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                n3 = R$attr.plp_filter_back;
                n8 = tm3_0.b(n3, (Context)object4);
                ((Toolbar)object2).setNavigationIcon(n8);
            }
        }
        if ((object2 = this.q1) != null && (object2 = ((pr2_2)object2).e) != null) {
            n8 = R$string.back_button_text;
            ((Toolbar)object2).setNavigationContentDescription(n8);
        }
        if ((object2 = this.q1) != null && (object2 = ((pr2_2)object2).e) != null) {
            object4 = new xa_0(this, 0);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object4);
        }
        this.Cb();
        object = this.q1;
        if (object != null) {
            object.d();
        }
        this.requireActivity().invalidateOptionsMenu();
        this.o0();
        object = this.s1;
        if (object == null) {
            object = "collapsingToolbar";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        n4 = R$id.saleHeaderContainer;
        object = (ConstraintLayout)object3.findViewById(n4);
        n4 = (int)(this.X1 ? 1 : 0);
        if (n4 != 0) {
            object = this.q1;
            if (object != null) {
                object.d = bl2;
                object2 = object.h;
                if (object2 != null) {
                    ai0_2.i((View)object2);
                }
                if (((object = object.o) == null || (n7 = object.getVisibility()) != 0) && object != null) {
                    ai0_2.i((View)object);
                }
            }
            this.ya();
        }
    }

    public final void h3() {
        a$a a$a = com.ril.ajio.plp.a.Companion;
        Object object = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object, "requireContext(...)");
        Object object2 = this.requireActivity().getActivityResultRegistry();
        a$a.getClass();
        a$a.a((Context)object, (K3)object2, this).b();
        object = this.K1;
        object2 = ((NewCustomEventsRevamp)object).getEC_IMAGE_SEARCH();
        String string2 = this.L1;
        String string3 = this.M1;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, "upload image icon interactions", "Select from gallery", "event_upload_image_icon_interactions", "image upload screen", "image upload screen", string2, null, string3, false, null, 1536, null);
        this.Nb();
    }

    public final void hb(View view) {
        int n3;
        Object object;
        int n4;
        Intrinsics.checkNotNullParameter(view, "view");
        Object object2 = this.p;
        int n7 = 0;
        PriceRevealMetaInfo priceRevealMetaInfo = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            n4 = 0;
            object2 = null;
        }
        object2.hideToolbarLayout();
        object2 = this.q;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n4 = 0;
            object2 = null;
        }
        object2.showTabLayout(false);
        n4 = R$id.app_bar_layout;
        this.r1 = object2 = (AppBarLayout)view.findViewById(n4);
        object2 = this.cb();
        n4 = (int)(((F12)object2).b() ? 1 : 0);
        if (n4 != 0) {
            object2 = this.r1;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
                n4 = 0;
                object2 = null;
            }
            object2 = object2.getLayoutParams();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            object2 = (CoordinatorLayout$e)((Object)object2);
            object = new AppBarLayout$Behavior();
            ha_0 ha_02 = new AppBarLayout$Behavior$DragCallback();
            ((AppBarLayout$Behavior)object).setDragCallback(ha_02);
            ((CoordinatorLayout$e)((Object)object2)).b((CoordinatorLayout$Behavior)object);
        }
        n4 = R$id.toolbar_header_view;
        object2 = (ConstraintLayout)view.findViewById(n4);
        this.V1 = object2;
        if (object2 != null) {
            n3 = R$id.toolbar_title_tv;
            object2 = (AjioTextView)object2.findViewById(n3);
        }
        n4 = R$id.collapsing_toolbar;
        object2 = (CollapsingToolbarLayout)view.findViewById(n4);
        this.s1 = object2;
        n4 = R$id.plpBAUContainer;
        object2 = view.findViewById(n4);
        this.w = object2;
        if (object2 != null) {
            n3 = R$id.float_header_view;
            object2 = (ConstraintLayout)object2.findViewById(n3);
        } else {
            n4 = 0;
            object2 = null;
        }
        this.p1 = object2;
        n4 = R$id.plpSaleContainer;
        object2 = view.findViewById(n4);
        this.v = object2;
        n4 = R$id.layout_no_products;
        object2 = (ConstraintLayout)view.findViewById(n4);
        this.B1 = object2;
        n4 = R$id.layout_no_internet;
        object2 = (ConstraintLayout)view.findViewById(n4);
        this.C1 = object2;
        n4 = R$id.btn_retry;
        object2 = (Button)view.findViewById(n4);
        this.D1 = object2;
        n4 = R$id.iv_uploaded_image;
        object2 = (ImageView)view.findViewById(n4);
        this.F1 = object2;
        n4 = R$id.plpImageUpload;
        object2 = (ImageUploadWidget)view.findViewById(n4);
        this.E1 = object2;
        n4 = R$id.btn_uploaded_image_action;
        object2 = (Button)view.findViewById(n4);
        this.G1 = object2;
        n4 = R$id.toggleListView;
        object2 = (CardView)view.findViewById(n4);
        this.z = object2;
        n4 = R$id.goToHome;
        object2 = (CardView)view.findViewById(n4);
        this.H1 = object2;
        n4 = R$id.imgBrandLogo;
        object2 = (CircularImageView)view.findViewById(n4);
        this.I0 = object2;
        object2 = this.cb().d.M;
        if (object2 != null) {
            priceRevealMetaInfo = ((ProductsList)object2).getPriceRevealMetaInfo();
        }
        if (priceRevealMetaInfo == null) {
            object2 = tr2_2.a;
            long l2 = 0L;
            object = l2;
            object2 = l2;
            tr2_2.B((Long)object, (Long)object2);
        }
        if ((n4 = (int)(((bv2_0)(object2 = this.cb().d)).v(false) ? 1 : 0)) != 0) {
            this.gb();
        } else {
            this.fb();
        }
        this.yb();
        object2 = h40_0.a;
        n4 = (int)(h40_0.M1() ? 1 : 0);
        if (n4 != 0) {
            n4 = R$id.plp_shimmer_container_quick_filters;
            object2 = view.findViewById(n4);
            this.O = object2;
            n4 = R$id.plp_shimmer_view_quick_filters;
            object2 = (ShimmerFrameLayout)view.findViewById(n4);
            this.N = object2;
        } else {
            n4 = R$id.plp_shimmer_container;
            object2 = view.findViewById(n4);
            this.O = object2;
            n4 = R$id.plp_shimmer_view;
            object2 = (ShimmerFrameLayout)view.findViewById(n4);
            this.N = object2;
        }
        n4 = R$id.plp_shimmer_view_image_search;
        object2 = (ShimmerFrameLayout)view.findViewById(n4);
        this.N1 = object2;
        n4 = R$id.plp_sort_filter_view;
        object2 = view.findViewById(n4);
        this.E = object2;
        n4 = R$id.plp_filter_frag_container;
        object2 = view.findViewById(n4);
        this.F = object2;
        object2 = this.E;
        if (object2 != null) {
            n7 = 8;
            object2.setVisibility(n7);
        }
        n4 = R$id.plp_sort_by_view;
        object2 = view.findViewById(n4);
        this.H = object2;
        n4 = R$id.plp_sort_subheading_tv;
        object2 = (TextView)view.findViewById(n4);
        this.U = object2;
        n4 = R$id.plp_filter_view;
        object2 = view.findViewById(n4);
        this.J = object2;
        n4 = R$id.plp_filter_selected_icon_view;
        object2 = view.findViewById(n4);
        this.R = object2;
        n4 = R$id.imgToggleView;
        object2 = (ImageView)view.findViewById(n4);
        this.T0 = object2;
        n4 = R$id.plp_filter_subheading_tv;
        object2 = (TextView)view.findViewById(n4);
        this.S = object2;
        n4 = R$id.plp_filter_background;
        object2 = view.findViewById(n4);
        this.T = object2;
        n4 = R$id.plp_category_view;
        object2 = view.findViewById(n4);
        this.K = object2;
        n4 = R$id.plp_category_heading_tv;
        object2 = (TextView)view.findViewById(n4);
        this.L = object2;
        n4 = R$id.refereeWidget;
        object2 = view.findViewById(n4);
        this.u0 = object2;
        n4 = R$id.inapp_update_widget;
        object2 = (InAppBottomUpdatesView)view.findViewById(n4);
        this.J1 = object2;
        n4 = R$id.searchHeader;
        object2 = view.findViewById(n4);
        this.O1 = object2;
        n4 = R$id.llpsTvSearch;
        view = (TextView)view.findViewById(n4);
        this.V0 = view;
        view = this.O1;
        if (view != null) {
            object2 = new va(this);
            view.setOnClickListener((View.OnClickListener)object2);
        }
        this.sb();
    }

    public final boolean l() {
        boolean bl2 = this.u1;
        if (bl2) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.K1;
            String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
            String string3 = "back button click";
            String string4 = "";
            String string5 = "event_upload_image_interactions";
            String string6 = "search plp screen";
            String string7 = "search plp screen";
            String string8 = this.L1;
            String string9 = this.M1;
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n3, null);
        }
        return super.l();
    }

    public final void loadCartBasedOnSelectedAddress(String string2, String object) {
        this.P2();
        object = this.R1;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.T1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.S1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        object = new CartDeliveryAddress();
        AddressType addressType = AddressType.Pincode;
        ((CartDeliveryAddress)object).setAddressType(addressType);
        ((CartDeliveryAddress)object).setPostalCode(string2);
        this.Va().F((CartDeliveryAddress)object);
        this.Va().G(string2);
        this.Bb((CartDeliveryAddress)object);
        this.cb().h();
    }

    public final BE3 m5() {
        return this.cb().d.t();
    }

    public final void mb() {
        db2_0 db2_02;
        int n3;
        Object object;
        Object object2 = this.B;
        object2 = object2 != null ? ((RecyclerView)object2).getAdapter() : null;
        if ((object2 = (oa_1)object2) != null) {
            object = this.Xa().c;
            ((oa_1)object2).D = object;
        }
        if ((n3 = (object = this.P0).size()) > 0 && (object = ((cB2)this.P0.get((int)0)).b) != (db2_02 = db2_0.IS_CMS_BANNER)) {
            object = this.P0;
            int n4 = 253;
            cB2 cB22 = new cB2(null, db2_02, null, null, null, null, null, null, n4);
            object.add(0, cB22);
        }
        if (object2 != null) {
            object = this.P0;
            if (object != null) {
                ((oa_1)object2).f = object;
            }
            ((RecyclerView$f)object2).notifyDataSetChanged();
        }
    }

    public final void nb(NewUserBanner object, String object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "newUserBanner");
        String string2 = "Existing";
        boolean bl2 = true;
        boolean bl3 = kotlin.text.b.i((String)object2, string2, bl2);
        object = bl3 ? ((NewUserBanner)object).getReturningUserImageUrl() : ((n3 = kotlin.text.b.i((String)object2, string2 = "New", bl2)) != 0 ? ((NewUserBanner)object).getNewUserImageUrl() : null);
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = this.cb().d;
            ((bv2_0)object2).r0 = object;
            this.Ib();
        }
    }

    public final void o0() {
        Object object = this.cb().d.X1;
        boolean bl2 = ((ArrayList)object).isEmpty();
        if (bl2 && (bl2 = ((ArrayList)(object = this.cb().d.W1)).isEmpty())) {
            return;
        }
        Object object2 = this.cb().d.W1;
        HashMap hashMap = this.cb().d.Y1;
        boolean bl3 = this.cb().d.X1.isEmpty();
        boolean bl4 = this.cb().d.v(false);
        boolean bl5 = true;
        int n3 = 4;
        Object object3 = object;
        ia_0 ia_02 = this;
        object = new bv2_1((List)object2, this, hashMap, 0, bl5, bl3, bl4, n3);
        object3 = this.Q1;
        if (object3 != null) {
            ia_02 = this.getContext();
            object2 = new LinearLayoutManager((Context)ia_02, 0, false);
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object2);
        }
        if ((object3 = this.Q1) != null) {
            ((RecyclerView)object3).setAdapter((RecyclerView$f)object);
        }
    }

    public final void onCameraCancelClick() {
        boolean bl2 = this.v1;
        if (bl2) {
            this.h3();
        } else {
            this.r3();
        }
    }

    public final void onCameraClick(boolean bl2) {
        block14: {
            if (bl2) {
                String string2;
                Object object;
                block15: {
                    object = this.bb();
                    object = ((bu2_0)object).a;
                    object = ((LiveData)object).d();
                    object = (PLPExtras)object;
                    if (object == null) break block14;
                    string2 = ((PLPExtras)object).z;
                    if (string2 != null) break block15;
                    string2 = "";
                }
                Object object2 = new File(string2);
                object2 = Uri.fromFile((File)object2);
                object2 = object2.toString();
                try {
                    this.Qb((PLPExtras)object, (String)object2);
                    object = Unit.a;
                }
                catch (Exception exception) {
                    object = Unit.a;
                }
            } else {
                bl2 = this.v1;
                if (bl2) {
                    this.h3();
                } else {
                    this.r3();
                }
            }
        }
    }

    public final void onCategoryClick(int n3, ProductType productType) {
        ia_0 ia_02 = this;
        Object object = null;
        Intrinsics.checkNotNullParameter(productType, "type");
        Object object2 = this.cb().d.q;
        Object object3 = this.getViewLifecycleOwner();
        Object object4 = new pa_0(this, 0);
        Object object5 = new Ia$a((Function1)object4);
        ((LiveData)object2).e((mu1_1)object3, (F62)object5);
        object2 = productType.getQuery().getUrl();
        if (object2 != null) {
            object3 = this.cb();
            object3.getClass();
            Intrinsics.checkNotNullParameter(object2, "url");
            object4 = h40_0.a;
            boolean bl2 = h40_0.m2();
            object4 = bl2 ? "more_image_search_url_v2" : "more_image_search_url";
            object5 = UrlHelper.Companion.getInstance();
            object = new Object[]{};
            String string2 = "plp";
            object = ((UrlHelper)object5).getApiUrl(string2, (String)object4, object);
            bl2 = h40_0.M1();
            if (bl2 && (bl2 = ((F12)object3).g())) {
                object4 = ((F12)object3).b.d.getCustomerUUID();
                object5 = "&userId=";
                object = y02.a((String)object, (String)object2, (String)object5, (String)object4);
            } else {
                object = Ft2.a((String)object, (String)object2);
            }
            object2 = new ProductListQuery();
            object4 = (Boolean)((F12)object3).a.getValue();
            ((Boolean)object4).booleanValue();
            ((ProductListQuery)object2).setUrgencyDriverEnabled((Boolean)object4);
            object3 = ((F12)object3).d;
            ((bv2_0)object3).o((String)object, (ProductListQuery)object2);
        }
        hv3_0.r0(ia_02.N1, null);
        object = ia_02.K1;
        object3 = object.getEC_IMAGE_SEARCH();
        object5 = productType.getType();
        String string3 = ia_02.L1;
        String string4 = ia_02.M1;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object3, "search category click", (String)object5, "search_interactions", "search plp screen", "search plp screen", string3, null, string4, false, null, 1536, null);
    }

    public final void onChangeLocationClick() {
        CartAddressListBottomSheet cartAddressListBottomSheet;
        this.R1 = cartAddressListBottomSheet = new CartAddressListBottomSheet();
        Object object = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(this, (String)object);
        cartAddressListBottomSheet.u = this;
        cartAddressListBottomSheet = this.R1;
        if (cartAddressListBottomSheet != null) {
            object = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartLocationBottomSheet";
            cartAddressListBottomSheet.show((FragmentManager)object, string2);
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = h40_0.a;
        boolean bl2 = h40_0.M1();
        if (bl2) {
            Iterator iterator;
            object = this.cb().d;
            object.getClass();
            JSONObject jSONObject = h40_0.h0().optJSONObject("filterIcons");
            HashMap<String, String> hashMap = new HashMap<String, String>();
            if (jSONObject != null && (iterator = jSONObject.keys()) != null) {
                boolean bl3;
                while (bl3 = iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    String string3 = jSONObject.getString(string2);
                    hashMap.put(string2, string3);
                }
            }
            ((bv2_0)object).Y1 = hashMap;
        }
        this.x1 = true;
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        Object object;
        Object object2;
        int n3;
        Object object3;
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "inflater");
        int n4 = R$menu.plp_menu;
        menuInflater.inflate(n4, menu2);
        super.onCreateOptionsMenu(menu2, menuInflater);
        int n7 = R$id.search;
        menuInflater = menu2.findItem(n7);
        this.J0 = menuInflater;
        n7 = R$id.closet_menu;
        menuInflater = menu2.findItem(n7);
        n4 = R$id.cart;
        menu2 = menu2.findItem(n4);
        Object object4 = this.cb();
        n4 = (int)(((F12)object4).b() ? 1 : 0);
        int n8 = 0;
        Object object5 = null;
        if (n4 != 0) {
            object4 = this.cb().d;
            n4 = (int)(((bv2_0)object4).s ? 1 : 0);
            if (n4 != 0 && (object4 = this.J0) != null) {
                object4.setVisible(false);
            }
        }
        if ((object4 = menu2.getActionView()) != null) {
            object3 = new Aa(this);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        object4 = menu2.getActionView();
        object3 = null;
        if (object4 != null) {
            n3 = R$id.menu_cart_count_tv;
            object4 = (TextView)object4.findViewById(n3);
        } else {
            n4 = 0;
            object4 = null;
        }
        if (object4 != null) {
            object2 = this.Va();
            n3 = object2.d();
            if (n3 == 0) {
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                String string2 = "enable_highlight_empty_cart";
                boolean bl2 = ((ao0_0)object).a(string2);
                if (bl2) {
                    object4.setVisibility(0);
                    object5 = String.valueOf(n3);
                    object4.setText((CharSequence)object5);
                    object5 = this.getContext();
                    if (object5 != null) {
                        n3 = R$drawable.circle_shape_cart_count_product;
                        object5 = xn.a((Context)object5, n3);
                    } else {
                        n8 = 0;
                        object5 = null;
                    }
                    object4.setBackground((Drawable)object5);
                } else {
                    n8 = 8;
                    object4.setVisibility(n8);
                }
            } else {
                object = this.getContext();
                if (object != null) {
                    int n10 = R$drawable.circle_shape_pink_cart_menu;
                    object = xn.a((Context)object, n10);
                } else {
                    boolean bl3 = false;
                    object = null;
                }
                object4.setBackground((Drawable)object);
                object4.setVisibility(0);
                n8 = 9;
                if (n3 <= n8) {
                    object5 = String.valueOf(n3);
                    object4.setText((CharSequence)object5);
                } else {
                    object5 = hv3_0.f("9<sup>+</sup>");
                    object4.setText((CharSequence)object5);
                }
            }
        }
        if ((object4 = this.cb().d.a1) != null) {
            object4 = this.cb().d.a1;
            object5 = this.J0;
            if (object5 != null && (object5 = object5.getIcon()) != null) {
                Intrinsics.checkNotNull(object4);
                n3 = Color.parseColor((String)((StoreInfo)object4).getHeaderIconColor());
                object = hy_0.SRC_IN;
                object2 = by_0.a(n3, (hy_0)((Object)object));
                object5.setColorFilter((ColorFilter)object2);
            }
            if ((menuInflater = menuInflater.getIcon()) != null) {
                if (object4 != null) {
                    object5 = ((StoreInfo)object4).getHeaderIconColor();
                } else {
                    n8 = 0;
                    object5 = null;
                }
                n8 = Color.parseColor((String)object5);
                object2 = hy_0.SRC_IN;
                object5 = by_0.a(n8, (hy_0)((Object)object2));
                menuInflater.setColorFilter((ColorFilter)object5);
            }
            if ((menu2 = menu2.getActionView()) != null) {
                n7 = R$id.menu_cart_iv;
                menu2 = (ImageView)menu2.findViewById(n7);
            } else {
                menu2 = null;
            }
            if (menu2 != null) {
                if (object4 != null) {
                    object3 = ((StoreInfo)object4).getHeaderIconColor();
                }
                n7 = Color.parseColor((String)object3);
                object4 = PorterDuff.Mode.SRC_IN;
                menu2.setColorFilter(n7, (PorterDuff.Mode)object4);
            }
        }
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        int n3 = this.s0;
        View view = null;
        og1_1.g(n3 != 0, false);
        n3 = R$layout.new_plp_layout;
        object = object.inflate(n3, object2, false);
        this.m1 = object;
        object = this.o1;
        object2 = "parentView";
        n3 = 0;
        bundle = null;
        if (object == null) {
            object = new CustomToolbarViewMerger(this);
            this.o1 = object;
            view = this.m1;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                view = null;
            }
            ((CustomToolbarViewMerger)object).initViews(view);
        }
        if ((object = this.m1) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            bundle = object;
        }
        return bundle;
    }

    public final void onDestroy() {
        super.onDestroy();
        Object object = this.t1;
        object = object != null ? object.edit() : null;
        if (object != null) {
            String string2 = "IS_IMAGE_SEARCH";
            object.putBoolean(string2, false);
        }
        if (object != null) {
            object.apply();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.o1 = null;
    }

    public final void onImageSearchCancelClick() {
        boolean bl2 = this.v1;
        if (bl2) {
            this.h3();
        } else {
            this.r3();
        }
        NewCustomEventsRevamp newCustomEventsRevamp = this.K1;
        String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
        String string3 = this.L1;
        String string4 = this.M1;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "upload image cancelled", "", "event_upload_image_interactions", "search plp screen", "search plp screen", string3, null, string4, false, null, 1536, null);
    }

    public final void onResume() {
        boolean bl2;
        super.onResume();
        Object object = this.o1;
        if (object != null) {
            object.forceCollapsingToolbarLayoutTitle();
        }
        if ((bl2 = this.u1) || (bl2 = this.a)) {
            object = this.p1;
            if (object != null) {
                int n3 = 8;
                object.setVisibility(n3);
            }
            this.Kb();
        }
    }

    public final void onStart() {
        boolean bl2;
        boolean bl3;
        super.onStart();
        Object object = this.n1;
        boolean bl4 = true;
        if (object != null && (bl3 = (boolean)object.isDisposed()) == bl4) {
            this.Sb();
        }
        if ((bl3 = Build.VERSION.SDK_INT) > (bl2 = 23 != 0) && (bl3 = (boolean)this.a)) {
            object = this.cb().d;
            bl3 = ((bv2_0)object).s;
            if (bl3) {
                object = this.U0;
                if (object == null) {
                    Context context = this.requireContext();
                    String string2 = "requireContext(...)";
                    Intrinsics.checkNotNullExpressionValue(context, string2);
                    this.U0 = object = new ma_2(context);
                }
                if ((object = this.U0) != null) {
                    ((ma_2)object).j((int)(bl4 ? 1 : 0), bl4);
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        yr0_2 yr0_22 = this.n1;
        if (yr0_22 != null) {
            yr0_22.dispose();
        }
        if ((yr0_22 = this.getArguments()) != null) {
            int n3;
            Object object = this.z;
            boolean bl2 = false;
            if (object != null && (n3 = object.getVisibility()) == 0) {
                bl2 = true;
            }
            object = this.l1;
            yr0_22.putBoolean((String)object, bl2);
        }
    }

    public final void onUploadAnotherImageClick(boolean bl2) {
        if (bl2) {
            this.Ua().N();
            j3_0 j3_02 = this.Ua();
            j3_02.N();
        } else {
            this.A1 = bl2 = true;
            this.Pb();
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.cb().d.n;
        object2 = this.getViewLifecycleOwner();
        boolean bl2 = false;
        ya_0 ya_02 = new ya_0(this, 0);
        Object object3 = new Ia$a(ya_02);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
        object = this.H1;
        if (object != null) {
            ya_02 = null;
            object2 = new za(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.z) != null) {
            ya_02 = null;
            object2 = new fa_0(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.G1) != null) {
            ya_02 = null;
            object2 = new da_0(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.D1) != null) {
            ya_02 = null;
            object2 = new Ea(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.E1) != null) {
            ((ImageUploadWidget)((Object)object)).setImageUploadWidgetCTAListener(this);
        }
        object = this.getContext();
        object2 = "PREFERENCE_NAME";
        ya_02 = null;
        if (object != null && (object = object.getSharedPreferences((String)object2, 0)) != null && (object = object.edit()) != null && (object = object.putBoolean((String)(object3 = "isFilterSelected"), false)) != null) {
            object.apply();
        }
        this.w1 = false;
        boolean bl3 = this.x1;
        if (bl3) {
            object = (PLPExtras)this.bb().a.d();
            if (object != null) {
                Object object4;
                this.u1 = bl2 = ((PLPExtras)object).C;
                this.y1 = object4 = ((PLPExtras)object).w;
                object4 = ((PLPExtras)object).x;
                this.z1 = object4;
                if (bl2) {
                    object3 = this.cb();
                    ((F12)object3).f((PLPExtras)object);
                    object = this.y1;
                    if (object != null && (object = this.C) != null) {
                        object3 = Uri.parse((String)this.z1);
                        object4 = "parse(...)";
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                        ((ImageSearchCategoryWidget)object).setDataImageSearch((Uri)object3);
                    }
                }
            }
            object = this.getContext();
            bl2 = false;
            object3 = null;
            if (object != null) {
                object = object.getSharedPreferences((String)object2, 0);
            } else {
                bl3 = false;
                object = null;
            }
            this.t1 = object;
            if (object != null) {
                object3 = object.edit();
            }
            if (object3 != null) {
                object = "IS_IMAGE_SEARCH";
                boolean bl4 = this.u1;
                object3.putBoolean((String)object, bl4);
            }
            if (object3 != null) {
                object3.apply();
            }
            this.Ob();
            this.x1 = false;
        } else {
            this.Tb();
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        boolean bl2;
        String string2;
        boolean bl3;
        super.onViewStateRestored(bundle);
        bundle = this.getArguments();
        if (bundle != null && (bl3 = bundle.getBoolean(string2 = this.l1, false)) == (bl2 = true)) {
            this.z0();
        }
    }

    public final void p0() {
        View view = this.O1;
        if (view != null) {
            ai0_2.i(view);
        }
    }

    public final void q4(String object) {
        Intrinsics.checkNotNullParameter(object, "pinCode");
        Object object2 = new fo_1();
        this.S1 = object2;
        ((fo_1)object2).Ra((String)object);
        object = this.S1;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.S1) != null) {
            boolean bl2;
            ((fo_1)object).h = bl2 = true;
        }
        if (object != null) {
            object2 = "changeLocationListener";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            ((fo_1)object).i = this;
        }
        if ((object = this.S1) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void r3() {
        a$a a$a = com.ril.ajio.plp.a.Companion;
        Object object = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object, "requireContext(...)");
        Object object2 = this.requireActivity().getActivityResultRegistry();
        a$a.getClass();
        a$a.a((Context)object, (K3)object2, this).a();
        object = this.K1;
        object2 = ((NewCustomEventsRevamp)object).getEC_IMAGE_SEARCH();
        String string2 = this.L1;
        String string3 = this.M1;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, "upload image icon interactions", "Click a photo", "event_upload_image_icon_interactions", "image upload screen", "image upload screen", string2, null, string3, false, null, 1536, null);
        this.Nb();
    }

    public final void r8(int n3) {
        mc2_0 mc2_02 = new mc2_0();
        Object object = this.cb().d.X1;
        HashMap hashMap = this.cb().d.Y1;
        Intrinsics.checkNotNullParameter(this, "plpQuickFiltersBottomSheetListener");
        Intrinsics.checkNotNullParameter(object, "listOfQuickFilters");
        Intrinsics.checkNotNullParameter(hashMap, "images");
        int n4 = yx_2.o((Iterable)object, 10);
        ArrayList<FacetValue> arrayList = new ArrayList<FacetValue>(n4);
        object = ((ArrayList)object).iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            FacetValue facetValue = FacetValueKt.deepCopy((FacetValue)object.next());
            arrayList.add(facetValue);
        }
        mc2_02.c = arrayList;
        mc2_02.i = this;
        mc2_02.d = hashMap;
        mc2_02.h = n3;
        FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
        mc2_02.show(fragmentManager, "QuickFilterBottomSheetFragment");
    }

    public final void t7(int n3) {
        Object object = yn3_0.a;
        String string2 = Gj0.b(n3, "onProgressUpdate: ", "%");
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a(string2, objectArray);
        object = this.E1;
        if (object != null) {
            ((ImageUploadWidget)((Object)object)).setProgress(n3);
        }
    }

    public final void tb() {
    }

    public final void y3(FacetValue facetValue, int n3, int n4) {
        ia_0 ia_02 = this;
        Object object = facetValue;
        Object object2 = "facetValue";
        Intrinsics.checkNotNullParameter(facetValue, (String)object2);
        String string2 = facetValue.getCode();
        if (string2 != null) {
            String string3;
            String string4;
            String string5;
            String string6;
            boolean bl2;
            String string7;
            Object object3;
            boolean bl3;
            this.P2();
            Object object4 = this.cb().d;
            object4.getClass();
            Intrinsics.checkNotNullParameter(facetValue, (String)object2);
            object2 = ((bv2_0)object4).X1.iterator();
            while (bl3 = object2.hasNext()) {
                object4 = (FacetValue)object2.next();
                object3 = ((FacetValue)object4).getCode();
                boolean bl4 = kotlin.text.b.i((String)object3, string7 = facetValue.getCode(), bl2 = true);
                if (!bl4) continue;
                ((FacetValue)object4).setSelected(bl2);
            }
            object2 = this.cb().d.R;
            ((HashMap)object2).put(string2, object);
            object = this.cb().d;
            object3 = ((bv2_0)object).M;
            if (object3 != null) {
                object = this.cb();
                object4 = ((F12)object).d;
                string6 = null;
                string5 = null;
                string7 = null;
                bl2 = false;
                string4 = null;
                string3 = null;
                int n7 = 60;
                bv2_0.B((bv2_0)object4, (ProductsList)object3, false, false, null, null, null, n7);
            }
            object = (object = ia_02.B) != null ? ((RecyclerView)object).getAdapter() : null;
            if ((object = (oa_1)object) != null) {
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
            object = " - selected";
            string7 = string2.concat((String)object);
            object4 = ia_02.K1;
            object3 = ((NewCustomEventsRevamp)object4).getEVENT_CATEGORY_QUICK_FILTER_INTERACTIONS();
            string4 = String.valueOf(n4);
            string3 = ((NewCustomEventsRevamp)object4).getEVENT_NAME_QUICK_FILTER_INTERACTIONS();
            string6 = o72_0.a;
            string5 = "plp screen";
            String string8 = ia_02.L1;
            String string9 = ia_02.M1;
            int n8 = 1664;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object3, string7, string4, string3, string6, string5, string8, null, string9, false, null, n8, null);
        }
    }

    public final void ya() {
        Object object = this.cb().d.X1;
        boolean bl2 = ((ArrayList)object).isEmpty();
        if (bl2 && (bl2 = ((ArrayList)(object = this.cb().d.W1)).isEmpty())) {
            this.Z5();
            return;
        }
        this.X1 = bl2 = true;
        object = this.Q1;
        if (object != null) {
            ai0_2.B((View)object);
        }
        if ((object = this.P1) != null) {
            object.setVisibility(0);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void yb() {
        void var10_16;
        String string2;
        int n3;
        int n4;
        String string3;
        boolean bl2;
        Object object;
        block17: {
            block18: {
                object = this.q1;
                bl2 = false;
                string3 = null;
                if (object == null || (object = ((pr2_2)object).o) != null && (n4 = object.getVisibility()) == 0) break block17;
                object = this.cb().d.M;
                if (object != null) {
                    object = ((ProductsList)object).getProducts();
                } else {
                    n4 = 0;
                    object = null;
                }
                object = (Collection)object;
                if (object == null || (n4 = (int)(object.isEmpty() ? 1 : 0)) != 0) break block18;
                object = this.q1;
                if (object != null) {
                    n3 = 0;
                    string2 = null;
                    ((pr2_2)object).d = false;
                    object = ((pr2_2)object).h;
                    if (object != null) {
                        ai0_2.B((View)object);
                    }
                }
                break block17;
            }
            object = this.q1;
            if (object != null) {
                ((pr2_2)object).d = n3 = 1;
                string2 = ((pr2_2)object).h;
                if (string2 != null) {
                    ai0_2.i((View)string2);
                }
                if (((object = ((pr2_2)object).o) == null || (n3 = object.getVisibility()) != 0) && object != null) {
                    ai0_2.i((View)object);
                }
            }
        }
        if ((n4 = h40_0.Q1()) == 0) return;
        object = this.Va().l();
        if (object != null) {
            string2 = ((CartDeliveryAddress)object).getCompleteAddress();
        } else {
            n3 = 0;
            string2 = null;
        }
        if (object != null) {
            string3 = ((CartDeliveryAddress)object).getDistrict();
        }
        Object object2 = ", ";
        String string4 = n1.a(string2, object2, string3);
        bl2 = this.W1;
        string2 = "";
        if (bl2) {
            void var10_13;
            string3 = this.x;
            if (string3 == null) return;
            if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
                object2 = AddressType.None;
            }
            Object object3 = object2;
            if (object != null && (object2 = ((CartDeliveryAddress)object).getPostalCode()) != null) {
                Object object4 = object2;
            } else {
                String string5 = string2;
            }
            Object object5 = object != null && (object = ((CartDeliveryAddress)object).getFirstName()) != null ? object : string2;
            object = this.getContext();
            if (object == null) return;
            AddressWidgetView addressWidgetView = new AddressWidgetView((Context)object, (View)string3, this);
            String string6 = od3_2.a();
            int n7 = 64;
            String string7 = "plp screen";
            AddressWidgetView.setData$default(addressWidgetView, (AddressType)((Object)object3), string4, string6, (String)object5, (String)var10_13, string7, null, n7, null);
            return;
        }
        string3 = this.y;
        if (string3 == null) return;
        if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
            object2 = AddressType.None;
        }
        Object object6 = object2;
        if (object != null && (object2 = ((CartDeliveryAddress)object).getPostalCode()) != null) {
            Object object7 = object2;
        } else {
            String string8 = string2;
        }
        Object object8 = object != null && (object = ((CartDeliveryAddress)object).getFirstName()) != null ? object : string2;
        object = this.getContext();
        if (object == null) return;
        AddressWidgetView addressWidgetView = new AddressWidgetView((Context)object, (View)string3, this);
        String string9 = od3_2.a();
        int n8 = 64;
        String string10 = "plp screen";
        AddressWidgetView.setData$default(addressWidgetView, (AddressType)((Object)object6), string4, string9, (String)object8, (String)var10_16, string10, null, n8, null);
    }

    public final void z0() {
        Object object = this.cb();
        boolean bl2 = object.b();
        if (bl2) {
            object = this.z;
            if (object != null) {
                ai0_2.k((View)object);
            }
        } else {
            object = this.z;
            if (object != null) {
                ai0_2.B((View)object);
            }
        }
        object = this.z;
        int n3 = R$color.color_2c4152;
        this.Fb(n3, (View)object);
        this.Ab();
    }

    public final void z8(CartDeliveryAddress cartDeliveryAddress) {
        int n3;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        Object object = this.S1;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = this.R1) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        this.U1 = object = cartDeliveryAddress.getPostalCode().toString();
        object = AddressType.Address;
        cartDeliveryAddress.setAddressType((AddressType)((Object)object));
        object = cartDeliveryAddress.getFormattedAddress();
        if (object == null || (n3 = object.length()) == 0) {
            object = ai0_2.g(cartDeliveryAddress);
            cartDeliveryAddress.setFormattedAddress((String)object);
        }
        this.Va().F(cartDeliveryAddress);
        object = this.Va();
        String string2 = this.U1;
        ((jo_2)object).G(string2);
        this.Bb(cartDeliveryAddress);
        this.cb().h();
    }
}

