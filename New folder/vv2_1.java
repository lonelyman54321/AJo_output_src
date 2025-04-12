/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RatingBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.pdprefresh.data.AjiogramInterventions;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from vv2
 */
public final class vv2_1
extends RecyclerView$B
implements View.OnClickListener,
Oj2,
u21_0 {
    public static final vv2$b_0 Companion;
    public final TextView A;
    public final ImageView A0;
    public final TextView B;
    public final AjioTextView B0;
    public final TextView C;
    public final TextView C0;
    public final TextView D;
    public final RecyclerView D0;
    public final TextView E;
    public final TextView E0;
    public final LinearLayout F;
    public final TextView F0;
    public final ImageView G;
    public final View G0;
    public final TextView H;
    public final View H0;
    public final TextView I;
    public final TextView I0;
    public final ImageView J;
    public final TextView J0;
    public final LinearLayout K;
    public final TextView K0;
    public final TextView L;
    public final View L0;
    public final TextView M;
    public final hh3_2 M0;
    public final TextView N;
    public Product N0;
    public final TextView O;
    public PlpProductUIModel O0;
    public final TextView P;
    public CountDownTimer P0;
    public final LinearLayout Q;
    public int Q0;
    public final TextView R;
    public final ImageView R0;
    public final TextView S;
    public final View S0;
    public final View T;
    public final TextView T0;
    public final TextView U;
    public la2_1 U0;
    public final View V0;
    public final View W0;
    public final View X;
    public final ImageView X0;
    public final TextView Y;
    public final ImageView Y0;
    public final ImageView Z;
    public final View Z0;
    public final View a;
    public final AjioTextView a1;
    public jo_2 b;
    public final RecyclerView b1;
    public nw_0 c;
    public int c1;
    public x82_0 d;
    public final uv2_0 d1;
    public String e;
    public HomeRowData f;
    public r82_0 g;
    public M82 h;
    public Cw2 i;
    public boolean j;
    public hy0_0 k;
    public final TextView k0;
    public Yj2 l;
    public AjiogramInterventions m;
    public p82_0 n;
    public int o;
    public boolean p;
    public final RecyclerView p0;
    public boolean q;
    public View q0;
    public boolean r;
    public final ConstraintLayout r0;
    public boolean s;
    public final TextView s0;
    public boolean t;
    public final TextView t0;
    public final ConstraintLayout u;
    public final LinearLayout u0;
    public final View v;
    public final LottieAnimationView v0;
    public final CardView w;
    public final ImageView w0;
    public final AjioRoundedCornerImageView x;
    public final View x0;
    public final TextView y;
    public final TextView y0;
    public final TextView z;
    public final ImageView z0;

    static {
        vv2$b_0 vv2$b_0;
        Companion = vv2$b_0 = new Object();
    }

    public vv2_1(View view) {
        int n3;
        TextView textView;
        Object object;
        TextView textView2;
        ImageView imageView;
        TextView textView3;
        TextView textView4;
        Object object2;
        vv2_1 vv2_12 = this;
        Object object3 = view;
        Intrinsics.checkNotNullParameter(view, "rowView");
        super(view);
        this.a = view;
        this.l = object2 = Yj2.GRID;
        int n4 = R$id.productInfoContainer;
        object2 = view.findViewById(n4);
        Object object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        object2 = (ConstraintLayout)((Object)object2);
        this.u = object2;
        int n7 = R$id.productSizeContainer;
        Object object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        this.v = object5;
        n7 = R$id.plp_row_product_iv_root;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (CardView)((Object)object5);
        this.w = object5;
        n7 = R$id.row_stl_imv_promo;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (AjioRoundedCornerImageView)((Object)object5);
        this.x = object5;
        n7 = R$id.plp_row_prd_name_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.y = object5;
        n7 = R$id.plp_row_brand_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.z = object5;
        n7 = R$id.plp_row_exclusive_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.A = object5;
        n7 = R$id.plp_ad_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.B = object5;
        n7 = R$id.plp_row_price_view;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (RelativeLayout)object5;
        n7 = R$id.plp_row_final_price_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.C = object5;
        n7 = R$id.plp_row_mrp_price_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.D = object5;
        n7 = R$id.plp_row_discount_percent_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.E = object5;
        n7 = R$id.layout_tag_ajiogram;
        object5 = (LinearLayout)view.findViewById(n7);
        this.F = object5;
        n7 = R$id.iv_tag_ajiogram;
        object5 = (ImageView)view.findViewById(n7);
        this.G = object5;
        n7 = R$id.tv_tag_ajiogram;
        object5 = (TextView)view.findViewById(n7);
        this.H = object5;
        n7 = R$id.plp_row_offer_price_tv;
        object5 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        this.I = object5;
        n7 = R$id.plp_row_product_iv;
        object5 = (ImageView)view.findViewById(n7);
        this.J = object5;
        int n8 = R$id.plp_row_size_list;
        View view2 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object4);
        view2 = (LinearLayout)view2;
        this.K = view2;
        int n10 = R$id.plp_row_size_count_tv;
        View view3 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object4);
        view3 = (TextView)view3;
        this.L = view3;
        n10 = R$id.item_plp_size_1;
        view3 = view2.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object4);
        view3 = (TextView)view3;
        this.M = view3;
        n10 = R$id.item_plp_size_2;
        view3 = view2.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object4);
        view3 = (TextView)view3;
        this.N = view3;
        n10 = R$id.item_plp_size_3;
        view3 = view2.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object4);
        view3 = (TextView)view3;
        this.O = view3;
        n10 = R$id.item_plp_size_4;
        view2 = view2.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object4);
        view2 = (TextView)view2;
        this.P = view2;
        n8 = R$id.plp_row_dod_timer_view;
        view2 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object4);
        view2 = (LinearLayout)view2;
        this.Q = view2;
        n8 = R$id.plp_row_dod_timer_tv;
        view2 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object4);
        view2 = (TextView)view2;
        this.R = view2;
        n8 = R$id.plp_row_add_to_closet_wishcount_iv;
        view2 = (TextView)view.findViewById(n8);
        this.S = view2;
        n10 = R$id.plp_row_add_to_closet_iv;
        view3 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object4);
        this.T = view3;
        int n14 = R$id.selling_fast_tag;
        this.U = textView4 = (TextView)view.findViewById(n14);
        n14 = R$id.plp_row_closet_iv_added;
        textView4 = view.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(textView4, (String)object4);
        this.X = textView4;
        int n15 = R$id.plp_row_closet_iv_added_wishcount;
        this.Y = textView3 = (TextView)view.findViewById(n15);
        int n16 = R$id.plp_row_similar_product_iv;
        this.Z = imageView = (ImageView)view.findViewById(n16);
        int n17 = R$id.plp_row_similar_product_tv;
        this.k0 = textView2 = (TextView)view.findViewById(n17);
        int n18 = R$id.plp_row_product_rv;
        Object object6 = (RecyclerView)view.findViewById(n18);
        this.p0 = object6;
        int n19 = R$id.sale_container;
        this.q0 = object = view.findViewById(n19);
        n19 = R$id.freebie_lyt;
        object = (ConstraintLayout)view.findViewById(n19);
        this.r0 = object;
        n19 = R$id.freebies_text;
        object = (TextView)view.findViewById(n19);
        this.s0 = object;
        n19 = R$id.priority_date;
        object = (TextView)view.findViewById(n19);
        this.t0 = object;
        n19 = R$id.ll_pd_delivery;
        object = (LinearLayout)view.findViewById(n19);
        this.u0 = object;
        n19 = R$id.id_delivery_anim;
        object = (LottieAnimationView)view.findViewById(n19);
        this.v0 = object;
        n19 = R$id.freebieIcon;
        object = (ImageView)view.findViewById(n19);
        this.w0 = object;
        n19 = R$id.closetAddBagContainer;
        this.x0 = object = view.findViewById(n19);
        int n20 = R$id.closetAddBagTv;
        Object object7 = view.findViewById(n20);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object4);
        object7 = (TextView)object7;
        this.y0 = object7;
        n20 = R$id.closetAddBagImg;
        object7 = view.findViewById(n20);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object4);
        object7 = (ImageView)object7;
        this.z0 = object7;
        n20 = R$id.closetAddBagSimImg;
        object7 = view.findViewById(n20);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object4);
        object7 = (ImageView)object7;
        this.A0 = object7;
        n20 = R$id.closetAddedToBag;
        object7 = view.findViewById(n20);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object4);
        object7 = (AjioTextView)object7;
        this.B0 = object7;
        n20 = R$id.cancelSizeTv;
        object7 = view.findViewById(n20);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object4);
        object7 = (TextView)object7;
        this.C0 = object7;
        int n21 = R$id.closetSizeRv;
        Object object8 = view.findViewById(n21);
        Intrinsics.checkNotNullExpressionValue(object8, (String)object4);
        object8 = (RecyclerView)object8;
        this.D0 = object8;
        n21 = R$id.sizeSelectTv;
        object8 = view.findViewById(n21);
        Intrinsics.checkNotNullExpressionValue(object8, (String)object4);
        object8 = (TextView)object8;
        this.E0 = object8;
        n21 = R$id.size_unit_tv;
        object8 = view.findViewById(n21);
        Intrinsics.checkNotNullExpressionValue(object8, (String)object4);
        object8 = (TextView)object8;
        this.F0 = object8;
        n21 = R$id.oosTv;
        this.G0 = object8 = view.findViewById(n21);
        n21 = R$id.oosSimilarContainer;
        this.H0 = object8 = view.findViewById(n21);
        int n22 = R$id.oosSimilarContainerText;
        this.I0 = textView = (TextView)view.findViewById(n22);
        n22 = R$id.new_ratings_count;
        textView = view.findViewById(n22);
        Intrinsics.checkNotNullExpressionValue(textView, (String)object4);
        this.J0 = textView;
        n22 = R$id.new_rating_star;
        textView = (RatingBar)view.findViewById(n22);
        n22 = R$id.new_ratings_value;
        textView = view.findViewById(n22);
        Intrinsics.checkNotNullExpressionValue(textView, (String)object4);
        this.K0 = textView;
        n22 = R$id.productParentContainer;
        textView = view.findViewById(n22);
        Intrinsics.checkNotNullExpressionValue(textView, (String)object4);
        this.L0 = textView;
        object4 = new tv2_1(this);
        this.M0 = object4 = yr1_2.b((Function0)object4);
        int n24 = R$id.deleteImg;
        object4 = (ImageView)view.findViewById(n24);
        this.R0 = object4;
        n22 = R$id.deleteOOSContainer;
        textView = view.findViewById(n22);
        this.S0 = textView;
        RecyclerView recyclerView = object6;
        n18 = R$id.removeOOSTV;
        object6 = (TextView)view.findViewById(n18);
        this.T0 = object6;
        n18 = R$id.oosBg;
        object6 = view.findViewById(n18);
        this.V0 = object6;
        n18 = R$id.pllVUnselected;
        object6 = view.findViewById(n18);
        this.W0 = object6;
        n18 = R$id.pllBgGrey;
        object6 = (ImageView)view.findViewById(n18);
        this.X0 = object6;
        n18 = R$id.pllIvSelected;
        object6 = (ImageView)view.findViewById(n18);
        this.Y0 = object6;
        n18 = R$id.lrv_layout_price_drop;
        object6 = view.findViewById(n18);
        this.Z0 = object6;
        n18 = R$id.lrv_tv_price_drop_value;
        this.a1 = object6 = (AjioTextView)view.findViewById(n18);
        n18 = R$id.luxe_closet_row_price_rv;
        object3 = (RecyclerView)view.findViewById(n18);
        this.b1 = object3;
        this.c1 = n3 = -1;
        object.setOnClickListener((View.OnClickListener)this);
        if (object5 != null) {
            object5.setOnClickListener((View.OnClickListener)this);
        }
        object2.setOnClickListener(vv2_12);
        object7.setOnClickListener((View.OnClickListener)vv2_12);
        if (object8 != null) {
            object8.setOnClickListener((View.OnClickListener)vv2_12);
        }
        if (view2 != null) {
            view2.setOnClickListener((View.OnClickListener)vv2_12);
        }
        view3.setOnClickListener((View.OnClickListener)vv2_12);
        textView4.setOnClickListener((View.OnClickListener)vv2_12);
        if (textView3 != null) {
            textView3.setOnClickListener((View.OnClickListener)vv2_12);
        }
        if (imageView != null) {
            imageView.setOnClickListener((View.OnClickListener)vv2_12);
        }
        if (textView2 != null) {
            textView2.setOnClickListener((View.OnClickListener)vv2_12);
        }
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)vv2_12);
        }
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener)vv2_12);
        }
        if (recyclerView != null) {
            super(vv2_12);
            object6 = recyclerView;
            recyclerView.addOnScrollListener((RecyclerView$s)object3);
        }
        super(vv2_12);
        vv2_12.d1 = object3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void D(vv2_1 var0, int var1_1, Product var2_2, PlpProductUIModel var3_3, ScreenType var4_4, yt2_2 var5_5, int var6_6) {
        block258: {
            block255: {
                block256: {
                    block257: {
                        block226: {
                            block254: {
                                block251: {
                                    block252: {
                                        block253: {
                                            block225: {
                                                block250: {
                                                    block249: {
                                                        block247: {
                                                            block248: {
                                                                block245: {
                                                                    block246: {
                                                                        block243: {
                                                                            block244: {
                                                                                block242: {
                                                                                    block241: {
                                                                                        block240: {
                                                                                            block237: {
                                                                                                block238: {
                                                                                                    block239: {
                                                                                                        block236: {
                                                                                                            block233: {
                                                                                                                block234: {
                                                                                                                    block235: {
                                                                                                                        block228: {
                                                                                                                            block222: {
                                                                                                                                block229: {
                                                                                                                                    block230: {
                                                                                                                                        block221: {
                                                                                                                                            block232: {
                                                                                                                                                block231: {
                                                                                                                                                    block227: {
                                                                                                                                                        var7_7 = var0;
                                                                                                                                                        var8_8 = var3_3;
                                                                                                                                                        var9_9 = var4_4;
                                                                                                                                                        var10_10 = 16;
                                                                                                                                                        var11_11 = 2.2E-44f;
                                                                                                                                                        var12_12 = var6_6 & 16;
                                                                                                                                                        var13_13 /* !! */  = var12_12 != 0 ? yt2_2.UNKNOWN : var5_5;
                                                                                                                                                        var0.getClass();
                                                                                                                                                        Intrinsics.checkNotNullParameter(var9_9, "screenType");
                                                                                                                                                        Intrinsics.checkNotNullParameter((Object)var13_13 /* !! */ , "screenName");
                                                                                                                                                        var7_7.O0 = var8_8;
                                                                                                                                                        var14_14 = var2_2;
                                                                                                                                                        var7_7.N0 = var2_2;
                                                                                                                                                        var15_15 = var1_1;
                                                                                                                                                        var7_7.c1 = var1_1;
                                                                                                                                                        var14_14 = var7_7.y;
                                                                                                                                                        var16_16 = 1;
                                                                                                                                                        if (var8_8 != null && (var17_17 = var3_3.getProductTextWrap()) == var16_16) {
                                                                                                                                                            var14_14.setMaxLines(var16_16);
                                                                                                                                                        }
                                                                                                                                                        var17_17 = 0;
                                                                                                                                                        var18_18 = null;
                                                                                                                                                        var19_19 = mz3_0.d(0);
                                                                                                                                                        var14_14.setMinimumHeight(var19_19);
                                                                                                                                                        var19_19 = mz3_0.d(0);
                                                                                                                                                        var14_14.setMinHeight(var19_19);
                                                                                                                                                        var20_20 = var14_14.getLayoutParams();
                                                                                                                                                        var21_21 = -2;
                                                                                                                                                        var22_22 = 0.0f / 0.0f;
                                                                                                                                                        var20_20.height = var21_21;
                                                                                                                                                        var20_20 = var7_7.O0;
                                                                                                                                                        var23_23 = var7_7.u;
                                                                                                                                                        if (var20_20 != null) break block227;
                                                                                                                                                        var24_24 = var13_13 /* !! */ ;
                                                                                                                                                        var25_25 = var14_14;
                                                                                                                                                        var26_26 = 0;
                                                                                                                                                        var27_27 = 0.0f;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        break block228;
                                                                                                                                                    }
                                                                                                                                                    var28_28 = var20_20.getAddToBagContentDescription();
                                                                                                                                                    var29_29 = var7_7.c1;
                                                                                                                                                    var30_30 = " index ";
                                                                                                                                                    var28_28 = LO1.a(var29_29, (String)var28_28, (String)var30_30);
                                                                                                                                                    var31_31 = var7_7.x0;
                                                                                                                                                    var31_31.setContentDescription((CharSequence)var28_28);
                                                                                                                                                    var28_28 = var7_7.H0;
                                                                                                                                                    if (var28_28 != null) {
                                                                                                                                                        var32_32 = var20_20.getOosSimilarContentDescription();
                                                                                                                                                        var21_21 = var7_7.c1;
                                                                                                                                                        var33_33 = new StringBuilder();
                                                                                                                                                        var33_33.append((String)var32_32);
                                                                                                                                                        var33_33.append((String)var30_30);
                                                                                                                                                        var33_33.append(var21_21);
                                                                                                                                                        var32_32 = var33_33.toString();
                                                                                                                                                        var28_28.setContentDescription((CharSequence)var32_32);
                                                                                                                                                    }
                                                                                                                                                    var32_32 = var20_20.getClosetAddBagContentDescription();
                                                                                                                                                    var33_33 = var7_7.y0;
                                                                                                                                                    var33_33.setContentDescription((CharSequence)var32_32);
                                                                                                                                                    var10_10 = (int)var20_20.getEnableAddtoCart();
                                                                                                                                                    if (var10_10 == 0) break block229;
                                                                                                                                                    var10_10 = (int)var20_20.isAllOutOfStock();
                                                                                                                                                    var34_34 = var7_7.B0;
                                                                                                                                                    var30_30 = var7_7.z0;
                                                                                                                                                    var35_35 /* !! */  = var7_7.G0;
                                                                                                                                                    var18_18 = "oosBg";
                                                                                                                                                    var36_36 = var7_7.V0;
                                                                                                                                                    var9_9 = "deleteWishlist";
                                                                                                                                                    var24_24 = var13_13 /* !! */ ;
                                                                                                                                                    var13_13 /* !! */  = var7_7.R0;
                                                                                                                                                    var25_25 = var14_14;
                                                                                                                                                    var14_14 = var7_7.S0;
                                                                                                                                                    var8_8 = "oosTv";
                                                                                                                                                    if (var10_10 == 0) break block230;
                                                                                                                                                    var10_10 = (int)var20_20.isComingSoonEnable();
                                                                                                                                                    if (var10_10 == 0) break block231;
                                                                                                                                                    var32_32 = "addToBag";
                                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var31_31, (String)var32_32);
                                                                                                                                                    ai0_2.B((View)var31_31);
                                                                                                                                                    Intrinsics.checkNotNullExpressionValue((Object)var13_13 /* !! */ , (String)var9_9);
                                                                                                                                                    var37_37 = (int)var20_20.getEnabledeleteImg();
                                                                                                                                                    ai0_2.x((View)var13_13 /* !! */ , (boolean)var37_37);
                                                                                                                                                    if (var28_28 != null) {
                                                                                                                                                        ai0_2.i((View)var28_28);
                                                                                                                                                    }
                                                                                                                                                    var9_9 = "deleteOOSContainer";
                                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var14_14, (String)var9_9);
                                                                                                                                                    ai0_2.i((View)var14_14);
                                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var35_35 /* !! */ , (String)var8_8);
                                                                                                                                                    ai0_2.i(var35_35 /* !! */ );
                                                                                                                                                    var26_26 = (int)var20_20.isAfterCartLuxEnabled();
                                                                                                                                                    var26_26 = var26_26 != 0 ? R$drawable.ic_notify_me_luxe : R$drawable.ic_notify_me;
                                                                                                                                                    var30_30.setImageResource(var26_26);
                                                                                                                                                    var26_26 = R$string.notify_me;
                                                                                                                                                    var8_8 = hv3_0.K(var26_26);
                                                                                                                                                    var33_33.setText((CharSequence)var8_8);
                                                                                                                                                    var37_37 = 2;
                                                                                                                                                    var38_38 = 2.8E-45f;
                                                                                                                                                    var8_8 = new oi0_2(var7_7, var37_37);
                                                                                                                                                    var31_31.setOnClickListener((View.OnClickListener)var8_8);
                                                                                                                                                    break block221;
                                                                                                                                                }
                                                                                                                                                var10_10 = 8;
                                                                                                                                                var11_11 = 1.1E-44f;
                                                                                                                                                var31_31.setVisibility(var10_10);
                                                                                                                                                var13_13 /* !! */ .setVisibility(var10_10);
                                                                                                                                                var10_10 = (int)var20_20.isSimilarOOSWishlistEnabled();
                                                                                                                                                if (var10_10 == 0) break block232;
                                                                                                                                                Intrinsics.checkNotNullExpressionValue(var35_35 /* !! */ , (String)var8_8);
                                                                                                                                                var26_26 = (int)var20_20.getEnableOOSTV();
                                                                                                                                                ai0_2.x(var35_35 /* !! */ , (boolean)var26_26);
                                                                                                                                                Intrinsics.checkNotNullExpressionValue(var36_36, (String)var18_18);
                                                                                                                                                var26_26 = (int)var20_20.isLuxeEnabled();
                                                                                                                                                if (var26_26 == 0 && (var26_26 = (int)var20_20.getCheckIfTalkbackServiceEnabled()) == 0 && (var26_26 = (int)var20_20.getEnableOOSBG()) != 0) {
                                                                                                                                                    var26_26 = 1;
                                                                                                                                                    var27_27 = 1.4E-45f;
                                                                                                                                                } else {
                                                                                                                                                    var26_26 = 0;
                                                                                                                                                    var27_27 = 0.0f;
                                                                                                                                                    var8_8 = null;
                                                                                                                                                }
                                                                                                                                                ai0_2.x(var36_36, (boolean)var26_26);
                                                                                                                                                Intrinsics.checkNotNullExpressionValue((Object)var13_13 /* !! */ , (String)var9_9);
                                                                                                                                                var26_26 = (int)var20_20.getEnabledeleteImg();
                                                                                                                                                ai0_2.x((View)var13_13 /* !! */ , (boolean)var26_26);
                                                                                                                                                var26_26 = var20_20.getEnableSimilarCartClosetCLick();
                                                                                                                                                if (var26_26 != 0) {
                                                                                                                                                    if (var28_28 != null) {
                                                                                                                                                        var26_26 = 0;
                                                                                                                                                        var27_27 = 0.0f;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        var28_28.setVisibility(0);
                                                                                                                                                        var10_10 = 1;
                                                                                                                                                        var11_11 = 1.4E-45f;
                                                                                                                                                        var9_9 = new aj2_1(var10_10, var7_7);
                                                                                                                                                        var28_28.setOnClickListener((View.OnClickListener)var9_9);
                                                                                                                                                    }
lbl138:
                                                                                                                                                    // 5 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        var26_26 = 8;
                                                                                                                                                        var27_27 = 1.1E-44f;
                                                                                                                                                        var34_34.setVisibility(var26_26);
                                                                                                                                                        break block221;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var26_26 = 0;
                                                                                                                                                var27_27 = 0.0f;
                                                                                                                                                var8_8 = null;
                                                                                                                                                if (var28_28 != null) {
                                                                                                                                                    var28_28.setVisibility(0);
                                                                                                                                                }
                                                                                                                                                if (var28_28 == null) ** GOTO lbl138
                                                                                                                                                var28_28.setOnClickListener((View.OnClickListener)var7_7);
                                                                                                                                                ** while (true)
                                                                                                                                            }
                                                                                                                                            var26_26 = (int)var20_20.getEnableOutOfStock();
                                                                                                                                            if (var26_26 != 0) {
                                                                                                                                                var8_8 = hv3_0.K(R$string.oos_cart_label);
                                                                                                                                                var34_34.setText((CharSequence)var8_8);
                                                                                                                                                var26_26 = hv3_0.m(R$color.accent_color_32);
                                                                                                                                                var34_34.setTextColor(var26_26);
                                                                                                                                                var26_26 = 0x3F000000;
                                                                                                                                                var27_27 = 0.5f;
                                                                                                                                                var34_34.setAlpha(var27_27);
                                                                                                                                                var9_9 = hv3_0.r(R$drawable.round_rect_4_cr_grey);
                                                                                                                                                var34_34.setBackground((Drawable)var9_9);
                                                                                                                                                var37_37 = 0;
                                                                                                                                                var38_38 = 0.0f;
                                                                                                                                                var9_9 = null;
                                                                                                                                                var34_34.setVisibility(0);
                                                                                                                                                var34_34.setEnabled(false);
                                                                                                                                                var10_10 = 0;
                                                                                                                                                var11_11 = 0.0f;
                                                                                                                                                var32_32 = null;
                                                                                                                                                var34_34.setOnClickListener(null);
                                                                                                                                                var23_23.setAlpha(var27_27);
                                                                                                                                            } else {
                                                                                                                                                var37_37 = 0;
                                                                                                                                                var38_38 = 0.0f;
                                                                                                                                                var9_9 = null;
                                                                                                                                                var26_26 = (int)var20_20.getEnableDeleteOssContainer();
                                                                                                                                                if (var26_26 != 0) {
                                                                                                                                                    var14_14.setVisibility(0);
                                                                                                                                                    var14_14.setOnClickListener((View.OnClickListener)var7_7);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
lbl182:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            var26_26 = 0;
                                                                                                                                            var27_27 = 0.0f;
                                                                                                                                            var8_8 = null;
                                                                                                                                            break block222;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var35_35 /* !! */ , (String)var8_8);
                                                                                                                                    ai0_2.i(var35_35 /* !! */ );
                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var36_36, (String)var18_18);
                                                                                                                                    ai0_2.i(var36_36);
                                                                                                                                    var26_26 = var20_20.isSimilarOOSWishlistEnabled();
                                                                                                                                    if (var26_26 != 0) {
                                                                                                                                        if (var28_28 != null) {
                                                                                                                                            ai0_2.i((View)var28_28);
                                                                                                                                        }
                                                                                                                                        if (var28_28 != null) {
                                                                                                                                            var26_26 = 0;
                                                                                                                                            var27_27 = 0.0f;
                                                                                                                                            var8_8 = null;
                                                                                                                                            var28_28.setOnClickListener(null);
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var26_26 = 8;
                                                                                                                                        var27_27 = 1.1E-44f;
                                                                                                                                        var34_34.setVisibility(var26_26);
                                                                                                                                        var14_14.setVisibility(var26_26);
                                                                                                                                    }
                                                                                                                                    var26_26 = (int)var20_20.getShowAddedToCart();
                                                                                                                                    var10_10 = 1065353216;
                                                                                                                                    var11_11 = 1.0f;
                                                                                                                                    if (var26_26 != 0) {
                                                                                                                                        var8_8 = hv3_0.K(R$string.added_to_bag_closet);
                                                                                                                                        var34_34.setText((CharSequence)var8_8);
                                                                                                                                        var34_34.setVisibility(0);
                                                                                                                                        var23_23.setAlpha(var11_11);
                                                                                                                                        var34_34.setEnabled(false);
                                                                                                                                        var26_26 = 0;
                                                                                                                                        var27_27 = 0.0f;
                                                                                                                                        var8_8 = null;
                                                                                                                                        var34_34.setOnClickListener(null);
                                                                                                                                        var37_37 = (int)var20_20.isLuxeEnabled();
                                                                                                                                        if (var37_37 != 0) {
                                                                                                                                            var37_37 = hv3_0.m(R$color.luxe_color_F5F5F5);
                                                                                                                                            var34_34.setBackgroundColor(var37_37);
                                                                                                                                            var37_37 = hv3_0.m(R$color.luxe_color_989898);
                                                                                                                                            var34_34.setTextColor(var37_37);
                                                                                                                                        } else {
                                                                                                                                            hv3_0.r(R$drawable.round_rect_4_cr_grey);
                                                                                                                                            var37_37 = hv3_0.m(R$color.accent_color_12);
                                                                                                                                            var34_34.setTextColor(var37_37);
                                                                                                                                        }
                                                                                                                                        var15_15 = 8;
                                                                                                                                        var31_31.setVisibility(var15_15);
                                                                                                                                        break block222;
                                                                                                                                    } else {
                                                                                                                                        var26_26 = 0;
                                                                                                                                        var27_27 = 0.0f;
                                                                                                                                        var8_8 = null;
                                                                                                                                        var15_15 = 8;
                                                                                                                                        var23_23.setAlpha(var11_11);
                                                                                                                                        var10_10 = 0;
                                                                                                                                        var11_11 = 0.0f;
                                                                                                                                        var32_32 = null;
                                                                                                                                        var31_31.setVisibility(0);
                                                                                                                                        Intrinsics.checkNotNullExpressionValue((Object)var13_13 /* !! */ , (String)var9_9);
                                                                                                                                        var37_37 = (int)var20_20.getEnabledeleteImg();
                                                                                                                                        ai0_2.x((View)var13_13 /* !! */ , (boolean)var37_37);
                                                                                                                                        var34_34.setVisibility(var15_15);
                                                                                                                                        var37_37 = (int)var20_20.getEnablebackground();
                                                                                                                                        if (var37_37 != 0) {
                                                                                                                                            var37_37 = hv3_0.m(R$color.accent_color_12);
                                                                                                                                            var32_32 = PorterDuff.Mode.SRC_IN;
                                                                                                                                            var30_30.setColorFilter(var37_37, (PorterDuff.Mode)var32_32);
                                                                                                                                            var9_9 = hv3_0.r(R$drawable.rounded_rect_4_black_stroke);
                                                                                                                                            var31_31.setBackground((Drawable)var9_9);
                                                                                                                                            var37_37 = hv3_0.m(R$color.accent_color_17);
                                                                                                                                            var33_33.setTextColor(var37_37);
                                                                                                                                        }
                                                                                                                                        if ((var37_37 = (int)var20_20.getEnableAddToBagCartClosetClick()) != 0) {
                                                                                                                                            var10_10 = 1;
                                                                                                                                            var11_11 = 1.4E-45f;
                                                                                                                                            var9_9 = new bj2_1(var10_10, var7_7);
                                                                                                                                            var31_31.setOnClickListener((View.OnClickListener)var9_9);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break block222;
                                                                                                                                }
                                                                                                                                var24_24 = var13_13 /* !! */ ;
                                                                                                                                var25_25 = var14_14;
                                                                                                                                ** while (true)
                                                                                                                            }
                                                                                                                            var9_9 = var7_7.O0;
                                                                                                                            if (var9_9 != null) {
                                                                                                                                var37_37 = (int)var9_9.isLuxeEnabled();
                                                                                                                                var10_10 = 1;
                                                                                                                                var11_11 = 1.4E-45f;
                                                                                                                                if (var37_37 == var10_10) {
                                                                                                                                    var0.A();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var9_9 = var7_7.O0;
                                                                                                                        var10_10 = 4;
                                                                                                                        var11_11 = 5.6E-45f;
                                                                                                                        if (var9_9 == null) break block233;
                                                                                                                        var12_12 = (int)var9_9.getEnableCartClosetSizeLayout();
                                                                                                                        var14_14 = var7_7.v;
                                                                                                                        if (var12_12 == 0) break block234;
                                                                                                                        var12_12 = (int)var9_9.getShowSizeLayout();
                                                                                                                        if (var12_12 == 0) break block235;
                                                                                                                        var33_33 = Looper.getMainLooper();
                                                                                                                        var13_13 /* !! */  = new Handler((Looper)var33_33);
                                                                                                                        var17_17 = 1;
                                                                                                                        var33_33 = new cy0_0(var17_17, var7_7, var9_9);
                                                                                                                        var39_39 = 100;
                                                                                                                        var13_13 /* !! */ .postDelayed((Runnable)var33_33, var39_39);
                                                                                                                        var37_37 = 0;
                                                                                                                        var38_38 = 0.0f;
                                                                                                                        var9_9 = null;
                                                                                                                        var14_14.setVisibility(0);
                                                                                                                        var23_23.setVisibility(var10_10);
                                                                                                                        break block233;
                                                                                                                    }
                                                                                                                    var37_37 = 0;
                                                                                                                    var38_38 = 0.0f;
                                                                                                                    var9_9 = null;
                                                                                                                    var12_12 = 8;
                                                                                                                    var14_14.setVisibility(var12_12);
                                                                                                                    var23_23.setVisibility(0);
                                                                                                                    break block236;
                                                                                                                }
                                                                                                                var37_37 = 0;
                                                                                                                var38_38 = 0.0f;
                                                                                                                var9_9 = null;
                                                                                                                var12_12 = 8;
                                                                                                                var14_14.setVisibility(var12_12);
                                                                                                                var23_23.setVisibility(0);
                                                                                                                break block236;
                                                                                                            }
                                                                                                            var12_12 = 8;
                                                                                                        }
                                                                                                        var37_37 = og1_1.b();
                                                                                                        if (var37_37 != 0) {
                                                                                                            var9_9 = var7_7.C0;
                                                                                                            var15_15 = var9_9.getPaintFlags() | var12_12;
                                                                                                            var9_9.setPaintFlags(var15_15);
                                                                                                        }
                                                                                                        var9_9 = var7_7.O0;
                                                                                                        var13_13 /* !! */  = var7_7.D0;
                                                                                                        if (var9_9 != null && (var15_15 = (int)var9_9.getEnableCartClosetSelectSize()) != 0) {
                                                                                                            var14_14 = var7_7.E0;
                                                                                                            var33_33 = var9_9.getHeaderText();
                                                                                                            var14_14.setText((CharSequence)var33_33);
                                                                                                            var33_33 = var7_7.N0;
                                                                                                            if (var33_33 != null) {
                                                                                                                var33_33 = var33_33.getVariantOptions();
                                                                                                            } else {
                                                                                                                var16_16 = 0;
                                                                                                                var33_33 = null;
                                                                                                            }
                                                                                                            var18_18 = var7_7.c;
                                                                                                            var18_18 = var7_7.N0;
                                                                                                            var14_14 = new RecyclerView$f();
                                                                                                            var14_14.a = var33_33;
                                                                                                            var14_14.d = var7_7;
                                                                                                            var14_14.c = var18_18;
                                                                                                            var7_7.U0 = var14_14;
                                                                                                            var33_33 = var7_7.N0;
                                                                                                            if (var33_33 != null) {
                                                                                                                var33_33 = var33_33.getProductOptionVariants();
                                                                                                            } else {
                                                                                                                var16_16 = 0;
                                                                                                                var33_33 = null;
                                                                                                            }
                                                                                                            var14_14.b = var33_33;
                                                                                                            var14_14 = var7_7.U0;
                                                                                                            var13_13 /* !! */ .setAdapter((RecyclerView$f)var14_14);
                                                                                                            var14_14 = var7_7.N0;
                                                                                                            if (var14_14 != null && (var14_14 = var14_14.getProductOptionVariants()) != null) {
                                                                                                                var14_14 = (Collection)var14_14;
                                                                                                                var15_15 = (int)var14_14.isEmpty();
                                                                                                                var16_16 = 1;
                                                                                                                if ((var15_15 ^= var16_16) == var16_16 && (var37_37 = (int)var9_9.getPopulateSelectSizeLabel()) != 0 && (var9_9 = var7_7.N0) != null && (var9_9 = var9_9.getProductOptionVariants()) != null) {
                                                                                                                    var15_15 = 0;
                                                                                                                    var14_14 = null;
                                                                                                                    if ((var9_9 = (ProductOptionVariant)var9_9.get(0)) != null) {
                                                                                                                        var14_14 = var7_7.F0;
                                                                                                                        Y63.h((TextView)var14_14, (ProductOptionVariant)var9_9);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        if ((var9_9 = var7_7.O0) == null) break block237;
                                                                                                        var15_15 = (int)var9_9.isAllOutOfStock();
                                                                                                        var33_33 = var7_7.r0;
                                                                                                        if (var15_15 != 0 || (var17_17 = (int)var9_9.getEnableFreebie()) == 0) break block238;
                                                                                                        var37_37 = (int)var9_9.isGiftAvailable();
                                                                                                        var18_18 = var7_7.O0;
                                                                                                        if (var18_18 == null) break block239;
                                                                                                        var19_19 = (int)var18_18.isGWPFeatureEnabledAjioLuxe();
                                                                                                        var21_21 = 1;
                                                                                                        var22_22 = 1.4E-45f;
                                                                                                        if (var19_19 != var21_21) break block239;
                                                                                                        if (var37_37 != 0 && var15_15 == 0) {
                                                                                                            var9_9 = var7_7.s0;
                                                                                                            if (var9_9 != null) {
                                                                                                                var14_14 = var18_18.getGwpFreebiesOneText();
                                                                                                                var9_9.setText((CharSequence)var14_14);
                                                                                                                var15_15 = (int)var18_18.isLuxeEnabled();
                                                                                                                if (var15_15 != 0) {
                                                                                                                    var14_14 = var9_9.getContext();
                                                                                                                    var19_19 = R$color.luxe_color_121212;
                                                                                                                    var15_15 = t70.getColor((Context)var14_14, var19_19);
                                                                                                                    var9_9.setTextColor(var15_15);
                                                                                                                }
                                                                                                            }
                                                                                                            if ((var37_37 = (int)var18_18.isLuxeEnabled()) != 0 && (var9_9 = var7_7.w0) != null) {
                                                                                                                var14_14 = var9_9.getContext();
                                                                                                                var17_17 = R$drawable.ic_gift_with_product_luxe;
                                                                                                                var14_14 = t70.getDrawable((Context)var14_14, var17_17);
                                                                                                                var9_9.setImageDrawable((Drawable)var14_14);
                                                                                                            }
                                                                                                            if (var33_33 != null) {
                                                                                                                ai0_2.B((View)var33_33);
                                                                                                            }
                                                                                                            break block237;
                                                                                                        } else if (var33_33 != null) {
                                                                                                            ai0_2.i((View)var33_33);
                                                                                                        }
                                                                                                        break block237;
                                                                                                    }
                                                                                                    if (var33_33 != null) {
                                                                                                        ai0_2.i((View)var33_33);
                                                                                                    }
                                                                                                    break block237;
                                                                                                }
                                                                                                if (var33_33 != null) {
                                                                                                    var37_37 = 8;
                                                                                                    var38_38 = 1.1E-44f;
                                                                                                    var33_33.setVisibility(var37_37);
                                                                                                }
                                                                                            }
                                                                                            if ((var9_9 = var7_7.O0) != null && (var37_37 = var9_9.isLuxeEnabled()) == (var15_15 = 1) && (var9_9 = var7_7.O0) != null && (var37_37 = (int)var9_9.isLuxeCartPriceEnable()) == var15_15 && (var9_9 = var7_7.N0) != null) {
                                                                                                var18_18 = var7_7.itemView.getContext();
                                                                                                var33_33 = new FlexboxLayoutManager((Context)var18_18);
                                                                                                var33_33.setFlexWrap(var15_15);
                                                                                                var15_15 = 0;
                                                                                                var33_33.setFlexDirection(0);
                                                                                                var33_33.setJustifyContent(0);
                                                                                                var18_18 = var7_7.b1;
                                                                                                var18_18.setVisibility(0);
                                                                                                var18_18.setLayoutManager((RecyclerView$o)var33_33);
                                                                                                var14_14 = new EF1((Product)var9_9);
                                                                                                var18_18.setAdapter((RecyclerView$f)var14_14);
                                                                                            }
                                                                                            var9_9 = var7_7.O0;
                                                                                            var14_14 = var7_7.L0;
                                                                                            var33_33 = var7_7.w;
                                                                                            var17_17 = 2;
                                                                                            var20_20 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams";
                                                                                            if (var9_9 == null) break block240;
                                                                                            var37_37 = (int)var9_9.isRecentlyViewLayoutChanges();
                                                                                            var21_21 = 1;
                                                                                            var22_22 = 1.4E-45f;
                                                                                            if (var37_37 == var21_21) break block241;
                                                                                        }
                                                                                        if ((var37_37 = (int)var7_7.s) == 0 && (var37_37 = (int)var7_7.p) == 0) break block242;
                                                                                    }
                                                                                    var9_9 = var14_14.getLayoutParams();
                                                                                    Intrinsics.checkNotNull(var9_9, (String)var20_20);
                                                                                    var9_9 = (RecyclerView$LayoutParams)var9_9;
                                                                                    var9_9.width = var21_21 = mz3_0.d(150);
                                                                                    var21_21 = -1;
                                                                                    var22_22 = 0.0f / 0.0f;
                                                                                    var9_9.height = var21_21;
                                                                                    var14_14.setLayoutParams((ViewGroup.LayoutParams)var9_9);
                                                                                    var34_34 = var7_7.O0;
                                                                                    if (var34_34 != null) {
                                                                                        var41_40 = var0.getAdapterPosition();
                                                                                        var42_41 = var7_7.s;
                                                                                        if (var42_41) {
                                                                                            var21_21 = (int)var34_34.isLuxeEnabled();
                                                                                            if (var21_21 == 0) {
                                                                                                var21_21 = 0x42200000;
                                                                                                var22_22 = 40.0f;
                                                                                                var33_33.setRadius(var22_22);
                                                                                            }
                                                                                            if (var41_40 > 0) {
                                                                                                var42_41 = false;
                                                                                                var36_36 = null;
                                                                                                var43_42 = 8;
                                                                                                var44_43 = 1.1E-44f;
                                                                                                var9_9.setMargins(var43_42, 0, 0, 0);
                                                                                            }
                                                                                        } else {
                                                                                            var42_41 = false;
                                                                                            var36_36 = null;
                                                                                            var43_42 = 8;
                                                                                            var44_43 = 1.1E-44f;
                                                                                            var37_37 = (int)var34_34.getCardUi();
                                                                                            if (var37_37 != 0) {
                                                                                                if (var41_40 != 0) {
                                                                                                    var37_37 = mz3_0.d(var17_17);
                                                                                                    var14_14.setPadding(var37_37, 0, 0, 0);
                                                                                                } else {
                                                                                                    var37_37 = mz3_0.d(var43_42);
                                                                                                    var14_14.setPadding(var37_37, 0, 0, 0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if ((var9_9 = var7_7.O0) != null) {
                                                                                    var21_21 = (int)var9_9.isPromoImageAvailable();
                                                                                    var35_35 /* !! */  = var7_7.x;
                                                                                    if (var21_21 != 0) {
                                                                                        var21_21 = (int)var9_9.isAllPromotions();
                                                                                        if (var21_21 != 0) {
                                                                                            var21_21 = 0;
                                                                                            var22_22 = 0.0f;
                                                                                            var34_34 = null;
                                                                                            var35_35 /* !! */ .setVisibility(0);
                                                                                            var9_9 = var9_9.getPromoContentDescription();
                                                                                            var35_35 /* !! */ .setContentDescription((CharSequence)var9_9);
                                                                                            var7_7.E((ImageView)var35_35 /* !! */ );
                                                                                        } else {
                                                                                            var37_37 = 8;
                                                                                            var38_38 = 1.1E-44f;
                                                                                            var35_35 /* !! */ .setVisibility(var37_37);
                                                                                        }
                                                                                    } else {
                                                                                        var37_37 = 8;
                                                                                        var38_38 = 1.1E-44f;
                                                                                        var35_35 /* !! */ .setVisibility(var37_37);
                                                                                    }
                                                                                }
                                                                                var9_9 = var7_7.O0;
                                                                                var34_34 = var7_7.C;
                                                                                var35_35 /* !! */  = var7_7.D;
                                                                                var36_36 = var7_7.E;
                                                                                if (var9_9 == null || (var43_42 = var9_9.isPriceValueChanges()) == 0) break block243;
                                                                                var28_28 = var9_9.getFinalPriceValue();
                                                                                if (var28_28 == null) break block244;
                                                                                var9_9 = var34_34.getText();
                                                                                var28_28 = var35_35 /* !! */ .getText();
                                                                                var31_31 = new StringBuilder();
                                                                                var31_31.append(var9_9);
                                                                                var31_31.append(var28_28);
                                                                                var9_9 = var31_31.toString();
                                                                                var43_42 = var36_36.getVisibility();
                                                                                if (var43_42 != 0) break block243;
                                                                                var37_37 = var9_9.length();
                                                                                var43_42 = 11;
                                                                                var44_43 = 1.5E-44f;
                                                                                if (var37_37 > var43_42 && (var9_9 = var7_7.O0) != null) {
                                                                                    var37_37 = (int)var9_9.isFromHomeProductWidget();
                                                                                    var43_42 = 1;
                                                                                    var44_43 = 1.4E-45f;
                                                                                    if (var37_37 == var43_42) {
                                                                                        var9_9 = var36_36.getLayoutParams();
                                                                                        Intrinsics.checkNotNull(var9_9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                                                        var9_9 = (RelativeLayout.LayoutParams)var9_9;
                                                                                        var9_9.removeRule(var43_42);
                                                                                        var29_29 = R$id.capsule_item_price;
                                                                                        var9_9.addRule(3, var29_29);
                                                                                        var28_28 = var36_36.getContext().getResources();
                                                                                        var29_29 = R$dimen.dp3;
                                                                                        var44_43 = var28_28.getDimension(var29_29);
                                                                                        var43_42 = (int)var44_43;
                                                                                        var29_29 = 0;
                                                                                        var31_31 = null;
                                                                                        var9_9.setMargins(0, var43_42, 0, 0);
                                                                                        var9_9.setMarginStart(0);
                                                                                        var36_36.setLayoutParams((ViewGroup.LayoutParams)var9_9);
                                                                                    }
                                                                                }
                                                                                break block243;
                                                                            }
                                                                            var37_37 = (int)var9_9.getCardUi();
                                                                            if (var37_37 != 0) {
                                                                                var35_35 /* !! */ .setVisibility(var10_10);
                                                                                var36_36.setVisibility(var10_10);
                                                                            } else {
                                                                                var37_37 = 8;
                                                                                var38_38 = 1.1E-44f;
                                                                                var35_35 /* !! */ .setVisibility(var37_37);
                                                                                var36_36.setVisibility(var37_37);
                                                                            }
                                                                        }
                                                                        if ((var9_9 = var7_7.O0) == null || (var43_42 = var9_9.isPriceDropReqd()) == 0) break block245;
                                                                        var43_42 = var9_9.getRecentlyViewedProdPrice();
                                                                        var31_31 = var7_7.Z0;
                                                                        if (var43_42 == 0) break block246;
                                                                        var43_42 = var9_9.getPriceDropValue();
                                                                        if (var43_42 != 0) {
                                                                            if (var31_31 != null) {
                                                                                var43_42 = 0;
                                                                                var44_43 = 0.0f;
                                                                                var28_28 = null;
                                                                                var31_31.setVisibility(0);
                                                                            }
                                                                            if ((var28_28 = var7_7.a1) != null) {
                                                                                var9_9 = var9_9.getPriceDrop();
                                                                                var28_28.setText((CharSequence)var9_9);
                                                                            }
                                                                            break block245;
                                                                        } else if (var31_31 != null) {
                                                                            var37_37 = 8;
                                                                            var38_38 = 1.1E-44f;
                                                                            var31_31.setVisibility(var37_37);
                                                                        }
                                                                        break block245;
                                                                    }
                                                                    var37_37 = 8;
                                                                    var38_38 = 1.1E-44f;
                                                                    if (var31_31 != null) {
                                                                        var31_31.setVisibility(var37_37);
                                                                    }
                                                                }
                                                                if ((var37_37 = (int)var7_7.p) == 0 && var3_3 != null) {
                                                                    var37_37 = (int)var3_3.getEnableWishlistView();
                                                                    var43_42 = 1;
                                                                    var44_43 = 1.4E-45f;
                                                                    if (var37_37 == var43_42 && (var37_37 = (int)var7_7.s) == 0) {
                                                                        var9_9 = var3_3.getClosetButtonContentDescription();
                                                                        var28_28 = var7_7.T;
                                                                        var28_28.setContentDescription((CharSequence)var9_9);
                                                                        var9_9 = var3_3.getClosetAddedButtonContentDescription();
                                                                        var31_31 = var7_7.X;
                                                                        var31_31.setContentDescription((CharSequence)var9_9);
                                                                        var37_37 = (int)var3_3.isProductWishlisted();
                                                                        var30_30 = var7_7.S;
                                                                        var26_26 = 1;
                                                                        var27_27 = 1.4E-45f;
                                                                        if (var37_37 == var26_26) {
                                                                            var26_26 = 8;
                                                                            var27_27 = 1.1E-44f;
                                                                            if (var30_30 != null) {
                                                                                var30_30.setVisibility(var26_26);
                                                                            }
                                                                            var28_28.setVisibility(var26_26);
                                                                            var37_37 = 0;
                                                                            var38_38 = 0.0f;
                                                                            var9_9 = null;
                                                                            var31_31.setVisibility(0);
                                                                            var28_28 = var7_7.Y;
                                                                            if (var28_28 != null) {
                                                                                var28_28.setVisibility(var26_26);
                                                                            }
                                                                            var31_31.setVisibility(0);
                                                                            var9_9 = var7_7.O0;
                                                                            if (var9_9 != null && (var37_37 = (int)var9_9.isWishlistCountAvailable()) == (var45_44 = 1)) {
                                                                                if (var28_28 != null && (var37_37 = var28_28.getVisibility()) == var26_26) {
                                                                                    var8_8 = var7_7.O0;
                                                                                    if (var8_8 != null) {
                                                                                        var8_8 = var8_8.getWishlistCountShortText();
                                                                                    } else {
                                                                                        var26_26 = 0;
                                                                                        var27_27 = 0.0f;
                                                                                        var8_8 = null;
                                                                                    }
                                                                                    var28_28.setText((CharSequence)var8_8);
                                                                                    var8_8 = var7_7.O0;
                                                                                    if (var8_8 != null) {
                                                                                        var8_8 = var8_8.getWishlistCountLongText();
                                                                                    } else {
                                                                                        var26_26 = 0;
                                                                                        var27_27 = 0.0f;
                                                                                        var8_8 = null;
                                                                                    }
                                                                                    var28_28.setContentDescription((CharSequence)var8_8);
                                                                                    var8_8 = null;
                                                                                    var28_28.setVisibility(0);
                                                                                    var26_26 = 8;
                                                                                    var27_27 = 1.1E-44f;
                                                                                    var31_31.setVisibility(var26_26);
                                                                                }
                                                                                var37_37 = 0;
                                                                                var38_38 = 0.0f;
                                                                                var9_9 = null;
                                                                            } else {
                                                                                if (var28_28 != null) {
                                                                                    var28_28.setVisibility(var26_26);
                                                                                }
                                                                                var37_37 = 0;
                                                                                var38_38 = 0.0f;
                                                                                var9_9 = null;
                                                                                var31_31.setVisibility(0);
                                                                            }
                                                                        } else {
                                                                            var26_26 = 8;
                                                                            var27_27 = 1.1E-44f;
                                                                            var37_37 = 0;
                                                                            var38_38 = 0.0f;
                                                                            var9_9 = null;
                                                                            var31_31.setVisibility(var26_26);
                                                                            var28_28.setVisibility(0);
                                                                            if (var30_30 != null) {
                                                                                var30_30.setVisibility(var26_26);
                                                                            }
                                                                            var28_28.setVisibility(0);
                                                                            var9_9 = var7_7.O0;
                                                                            if (var9_9 != null && (var37_37 = (int)var9_9.isWishlistCountAvailable()) == (var29_29 = 1)) {
                                                                                if (var30_30 != null && (var37_37 = var30_30.getVisibility()) == var26_26) {
                                                                                    var8_8 = var7_7.O0;
                                                                                    if (var8_8 != null) {
                                                                                        var8_8 = var8_8.getWishlistCountShortText();
                                                                                    } else {
                                                                                        var26_26 = 0;
                                                                                        var27_27 = 0.0f;
                                                                                        var8_8 = null;
                                                                                    }
                                                                                    var30_30.setText((CharSequence)var8_8);
                                                                                    var8_8 = var7_7.O0;
                                                                                    if (var8_8 != null) {
                                                                                        var8_8 = var8_8.getWishlistCountLongText();
                                                                                    } else {
                                                                                        var26_26 = 0;
                                                                                        var27_27 = 0.0f;
                                                                                        var8_8 = null;
                                                                                    }
                                                                                    var30_30.setContentDescription((CharSequence)var8_8);
                                                                                    var8_8 = null;
                                                                                    var30_30.setVisibility(0);
                                                                                    var26_26 = 8;
                                                                                    var27_27 = 1.1E-44f;
                                                                                    var28_28.setVisibility(var26_26);
                                                                                }
                                                                            } else {
                                                                                if (var30_30 != null) {
                                                                                    var30_30.setVisibility(var26_26);
                                                                                }
                                                                                var26_26 = 0;
                                                                                var27_27 = 0.0f;
                                                                                var8_8 = null;
                                                                                var28_28.setVisibility(0);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                var8_8 = var7_7.O0;
                                                                var9_9 = "getContext(...)";
                                                                if (var8_8 == null || (var43_42 = var8_8.getShowOODEnable()) == 0) break block247;
                                                                var43_42 = (int)var8_8.isDodEnabled();
                                                                var31_31 = var7_7.I;
                                                                if (var43_42 == 0) break block248;
                                                                var8_8 = var7_7.O0;
                                                                if (var8_8 != null) {
                                                                    var8_8 = var8_8.getOfferPriceValue();
                                                                } else {
                                                                    var26_26 = 0;
                                                                    var27_27 = 0.0f;
                                                                    var8_8 = null;
                                                                }
                                                                var31_31.setText((CharSequence)var8_8);
                                                                var26_26 = 0;
                                                                var27_27 = 0.0f;
                                                                var31_31.setVisibility(0);
                                                                var8_8 = var7_7.O0;
                                                                if (var8_8 != null) {
                                                                    var8_8 = var8_8.getOfferPriceContentDescription();
                                                                } else {
                                                                    var26_26 = 0;
                                                                    var27_27 = 0.0f;
                                                                    var8_8 = null;
                                                                }
                                                                var31_31.setContentDescription((CharSequence)var8_8);
                                                                var8_8 = var7_7.O0;
                                                                if (var8_8 != null) {
                                                                    var26_26 = (int)var8_8.getSetDiscountColor();
                                                                    var43_42 = 1;
                                                                    var44_43 = 1.4E-45f;
                                                                    if (var26_26 == var43_42) {
                                                                        var26_26 = hv3_0.m(R$color.accent_color_10);
                                                                        var36_36.setTextColor(var26_26);
                                                                    }
                                                                }
                                                                break block247;
                                                            }
                                                            var43_42 = (int)var8_8.getShowOfferPrice();
                                                            if (var43_42 != 0) {
                                                                var28_28 = var7_7.O0;
                                                                if (var28_28 != null) {
                                                                    var28_28 = var28_28.getOfferPriceValue();
                                                                } else {
                                                                    var43_42 = 0;
                                                                    var44_43 = 0.0f;
                                                                    var28_28 = null;
                                                                }
                                                                var31_31.setText((CharSequence)var28_28);
                                                                var43_42 = 0;
                                                                var44_43 = 0.0f;
                                                                var28_28 = null;
                                                                var31_31.setVisibility(0);
                                                                var8_8 = var8_8.getOfferPriceContentDescription();
                                                                var31_31.setContentDescription((CharSequence)var8_8);
                                                            } else {
                                                                var26_26 = 8;
                                                                var27_27 = 1.1E-44f;
                                                                var31_31.setVisibility(var26_26);
                                                            }
                                                            var8_8 = var7_7.O0;
                                                            if (var8_8 != null) {
                                                                var26_26 = (int)var8_8.getSetDiscountColor();
                                                                var43_42 = 1;
                                                                var44_43 = 1.4E-45f;
                                                                if (var26_26 == var43_42) {
                                                                    var8_8 = var7_7.itemView.getContext();
                                                                    Intrinsics.checkNotNullExpressionValue(var8_8, (String)var9_9);
                                                                    var43_42 = R$attr.plp_discount_percentage;
                                                                    var26_26 = tm3_0.a(var43_42, (Context)var8_8);
                                                                    var36_36.setTextColor(var26_26);
                                                                }
                                                            }
                                                        }
                                                        var8_8 = var7_7.O0;
                                                        var28_28 = var7_7.U;
                                                        if (var8_8 == null || (var26_26 = (int)var8_8.getSellingFastTag()) != (var29_29 = 1)) break block249;
                                                        var8_8 = var7_7.O0;
                                                        if (var8_8 != null && (var26_26 = var8_8.isPlpUrgencyTagEnabled()) == var29_29) {
                                                            if (var28_28 != null) {
                                                                var26_26 = 0;
                                                                var27_27 = 0.0f;
                                                                var8_8 = null;
                                                                var28_28.setVisibility(0);
                                                            }
                                                            if (var28_28 != null) {
                                                                var8_8 = var7_7.O0;
                                                                if (var8_8 != null) {
                                                                    var8_8 = var8_8.getUrgencyTagValue();
                                                                } else {
                                                                    var26_26 = 0;
                                                                    var27_27 = 0.0f;
                                                                    var8_8 = null;
                                                                }
                                                                var28_28.setText((CharSequence)var8_8);
                                                            }
                                                            break block250;
                                                        } else if (var28_28 != null) {
                                                            var26_26 = 8;
                                                            var27_27 = 1.1E-44f;
                                                            var28_28.setVisibility(var26_26);
                                                        }
                                                        break block250;
                                                    }
                                                    var26_26 = 8;
                                                    var27_27 = 1.1E-44f;
                                                    if (var28_28 != null) {
                                                        var28_28.setVisibility(var26_26);
                                                    }
                                                }
                                                if ((var8_8 = var7_7.O0) == null) break block251;
                                                var26_26 = var8_8.getShowAjiogramTag();
                                                var43_42 = 1;
                                                var44_43 = 1.4E-45f;
                                                if (var26_26 != var43_42) break block251;
                                                var8_8 = var7_7.m;
                                                var28_28 = var7_7.F;
                                                if (var8_8 == null) break block252;
                                                var31_31 = var7_7.N0;
                                                if (var31_31 != null) {
                                                    var31_31 = var31_31.getCatalogName();
                                                } else {
                                                    var29_29 = 0;
                                                    var31_31 = null;
                                                }
                                                var30_30 = "ajioGram";
                                                var29_29 = (int)Intrinsics.areEqual(var31_31, var30_30);
                                                if (var29_29 == 0 || ((var31_31 = var8_8.getTag_text()) == null || (var29_29 = var31_31.length()) == 0) && ((var31_31 = var8_8.getTag_image()) == null || (var29_29 = var31_31.length()) == 0)) {
                                                    var26_26 = 0;
                                                    var27_27 = 0.0f;
                                                    var8_8 = null;
                                                }
                                                if (var8_8 == null) break block252;
                                                var31_31 = var7_7.H;
                                                if (var31_31 != null) {
                                                    var30_30 = var8_8.getTag_text();
                                                    var31_31.setText((CharSequence)var30_30);
                                                }
                                                if (var28_28 != null) {
                                                    ai0_2.B((View)var28_28);
                                                }
                                                try {
                                                    var30_30 = var8_8.getTag_bg_color();
                                                    if (var30_30 != null && var28_28 != null) {
                                                        var45_44 = Color.parseColor((String)var30_30);
                                                        var30_30 = ColorStateList.valueOf((int)var45_44);
                                                        var28_28.setBackgroundTintList((ColorStateList)var30_30);
                                                    }
                                                }
                                                catch (Exception v0) {
                                                    ** GOTO lbl811
                                                }
                                                {
                                                    if ((var30_30 = var8_8.getTag_text_color()) != null && var31_31 != null) {
                                                        var45_44 = Color.parseColor((String)var30_30);
                                                        var31_31.setTextColor(var45_44);
                                                    }
lbl811:
                                                    // 4 sources

                                                    var31_31 = var7_7.G;
                                                    if (var31_31 == null) break block225;
                                                    cp_1.Companion.getClass();
                                                }
                                                var30_30 = cp$a.e();
                                                var18_18 = var8_8.getTag_image();
                                                var30_30.getClass();
                                                if (var18_18 == null) ** GOTO lbl-1000
                                                var30_30 = ".gif";
                                                var32_32 = null;
                                                var17_17 = (int)StringsKt.F((CharSequence)var18_18, (CharSequence)var30_30, false);
                                                var10_10 = 1;
                                                var11_11 = 1.4E-45f;
                                                if (var17_17 == var10_10) {
                                                    var32_32 = da_2.Companion;
                                                    var8_8 = var8_8.getTag_image();
                                                    var32_32.getClass();
                                                    da$b.c((ImageView)var31_31, (String)var8_8);
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var32_32 = da_2.Companion;
                                                    var8_8 = var8_8.getTag_image();
                                                    var32_32.getClass();
                                                    da$b.d((ImageView)var31_31, (String)var8_8);
                                                }
                                                var32_32 = Unit.a;
                                                break block253;
                                            }
                                            var10_10 = 0;
                                            var11_11 = 0.0f;
                                            var32_32 = null;
                                        }
                                        if (var32_32 != null) break block251;
                                    }
                                    if (var28_28 != null) {
                                        ai0_2.i((View)var28_28);
                                    }
                                }
                                var8_8 = var7_7.O0;
                                var32_32 = var7_7.K;
                                var18_18 = "";
                                if (var8_8 == null) break block254;
                                var26_26 = (int)var8_8.getShowSizeView();
                                var43_42 = 1;
                                var44_43 = 1.4E-45f;
                                if (var26_26 != var43_42) break block254;
                                var8_8 = var7_7.O0;
                                if (var8_8 != null && (var26_26 = (int)var8_8.getShowSizeLayout()) == var43_42) {
                                    var26_26 = 0;
                                    var27_27 = 0.0f;
                                    var32_32.setVisibility(0);
                                    var8_8 = var7_7.M;
                                    var10_10 = 8;
                                    var11_11 = 1.1E-44f;
                                    var8_8.setVisibility(var10_10);
                                    var28_28 = var7_7.N;
                                    var28_28.setVisibility(var10_10);
                                    var31_31 = var7_7.O;
                                    var31_31.setVisibility(var10_10);
                                    var30_30 = var7_7.P;
                                    var30_30.setVisibility(var10_10);
                                    var8_8.setContentDescription((CharSequence)var18_18);
                                    var28_28.setContentDescription((CharSequence)var18_18);
                                    var31_31.setContentDescription((CharSequence)var18_18);
                                    var30_30.setContentDescription((CharSequence)var18_18);
                                    var32_32 = var7_7.O0;
                                    if (var32_32 != null) {
                                        var10_10 = (int)var32_32.getShowSizeFirstView();
                                        var46_45 = var13_13 /* !! */ ;
                                        var12_12 = 1;
                                        if (var10_10 == var12_12) {
                                            var10_10 = 0;
                                            var11_11 = 0.0f;
                                            var8_8.setVisibility(0);
                                            var32_32 = var7_7.O0;
                                            if (var32_32 != null) {
                                                var32_32 = var32_32.getSizeFirstViewText();
                                            } else {
                                                var10_10 = 0;
                                                var11_11 = 0.0f;
                                                var32_32 = null;
                                            }
                                            var8_8.setText((CharSequence)var32_32);
                                        }
                                    } else {
                                        var46_45 = var13_13 /* !! */ ;
                                    }
                                    if ((var8_8 = var7_7.O0) != null) {
                                        var26_26 = (int)var8_8.getShowSizeSecondView();
                                        var10_10 = 1;
                                        var11_11 = 1.4E-45f;
                                        if (var26_26 == var10_10) {
                                            var26_26 = 0;
                                            var27_27 = 0.0f;
                                            var28_28.setVisibility(0);
                                            var8_8 = var7_7.O0;
                                            if (var8_8 != null) {
                                                var32_32 = var8_8.getSizeSecondViewText();
                                            } else {
                                                var10_10 = 0;
                                                var11_11 = 0.0f;
                                                var32_32 = null;
                                            }
                                            var28_28.setText((CharSequence)var32_32);
                                        }
                                    }
                                    if ((var8_8 = var7_7.O0) != null) {
                                        var26_26 = (int)var8_8.getShowSizeThirdView();
                                        var10_10 = 1;
                                        var11_11 = 1.4E-45f;
                                        if (var26_26 == var10_10) {
                                            var26_26 = 0;
                                            var27_27 = 0.0f;
                                            var31_31.setVisibility(0);
                                            var8_8 = var7_7.O0;
                                            if (var8_8 != null) {
                                                var32_32 = var8_8.getSizeThirdViewText();
                                            } else {
                                                var10_10 = 0;
                                                var11_11 = 0.0f;
                                                var32_32 = null;
                                            }
                                            var31_31.setText((CharSequence)var32_32);
                                        }
                                    }
                                    if ((var8_8 = var7_7.O0) != null) {
                                        var26_26 = (int)var8_8.getShowSizeFourthView();
                                        var10_10 = 1;
                                        var11_11 = 1.4E-45f;
                                        if (var26_26 == var10_10) {
                                            var26_26 = 0;
                                            var27_27 = 0.0f;
                                            var30_30.setVisibility(0);
                                            var8_8 = var7_7.O0;
                                            if (var8_8 != null) {
                                                var32_32 = var8_8.getSizeFourthViewText();
                                            } else {
                                                var10_10 = 0;
                                                var11_11 = 0.0f;
                                                var32_32 = null;
                                            }
                                            var30_30.setText((CharSequence)var32_32);
                                        }
                                    }
                                    var8_8 = var7_7.O0;
                                    var32_32 = var7_7.L;
                                    if (var8_8 != null && (var26_26 = (int)var8_8.getShowSizeCount()) == (var12_12 = 1)) {
                                        var26_26 = 0;
                                        var27_27 = 0.0f;
                                        var32_32.setVisibility(0);
                                        var8_8 = var7_7.O0;
                                        if (var8_8 != null) {
                                            var8_8 = var8_8.getSizeCountText();
                                        } else {
                                            var26_26 = 0;
                                            var27_27 = 0.0f;
                                            var8_8 = null;
                                        }
                                        var32_32.setText((CharSequence)var8_8);
                                        break block226;
                                    } else {
                                        var26_26 = 8;
                                        var27_27 = 1.1E-44f;
                                        var32_32.setVisibility(var26_26);
                                    }
                                    break block226;
                                } else {
                                    var46_45 = var13_13 /* !! */ ;
                                    var26_26 = 8;
                                    var27_27 = 1.1E-44f;
                                    var32_32.setVisibility(var26_26);
                                }
                                break block226;
                            }
                            var46_45 = var13_13 /* !! */ ;
                            var26_26 = 8;
                            var27_27 = 1.1E-44f;
                            var32_32.setVisibility(var26_26);
                        }
                        if (var3_3 != null) {
                            var26_26 = (int)var3_3.isPrioritydeliveryFeatureEnable();
                            var10_10 = 1;
                            var11_11 = 1.4E-45f;
                            if (var26_26 == var10_10 && (var8_8 = var3_3.getFnlColorVariantData()) != null) {
                                var8_8 = var3_3.getDeliverySlaTag();
                                var32_32 = var7_7.t0;
                                var13_13 /* !! */  = var7_7.u0;
                                if (var8_8 != null && (var43_42 = var8_8.length()) != 0) {
                                    var17_17 = (int)var3_3.isAjiogramStoreId();
                                    var28_28 = var7_7.v0;
                                    if (var17_17 != 0) {
                                        if (var28_28 != null) {
                                            var18_18 = "ajiogram_plp_delivery.json";
                                            var28_28.setAnimation((String)var18_18);
                                        }
                                    } else if (var28_28 != null) {
                                        var18_18 = "ajio_plp_delivery.json";
                                        var28_28.setAnimation((String)var18_18);
                                    }
                                    if (var13_13 /* !! */  != null) {
                                        var17_17 = 0;
                                        var18_18 = null;
                                        var13_13 /* !! */ .setVisibility(0);
                                    }
                                    if (var32_32 != null) {
                                        var32_32.setText((CharSequence)var8_8);
                                    }
                                } else {
                                    if (var13_13 /* !! */  != null) {
                                        var26_26 = 8;
                                        var27_27 = 1.1E-44f;
                                        var13_13 /* !! */ .setVisibility(var26_26);
                                    }
                                    if (var32_32 != null) {
                                        var32_32.setText((CharSequence)var18_18);
                                    }
                                }
                            }
                        }
                        var8_8 = var7_7.O0;
                        var32_32 = var7_7.J;
                        if (var8_8 != null && (var26_26 = (int)var8_8.getShowPlpGrid()) == (var12_12 = 1)) {
                            var8_8 = var7_7.l;
                            var13_13 /* !! */  = Yj2.GRID;
                            var18_18 = var7_7.p0;
                            if (var8_8 != var13_13 /* !! */ ) {
                                var26_26 = 8;
                                var27_27 = 1.1E-44f;
                                var33_33.setVisibility(var26_26);
                                if (var32_32 != null) {
                                    var32_32.setVisibility(var26_26);
                                }
                                if (var18_18 != null) {
                                    var26_26 = 0;
                                    var27_27 = 0.0f;
                                    var8_8 = null;
                                    var18_18.setVisibility(0);
                                }
                                var27_27 = 2.8E-44f;
                                var26_26 = mz3_0.d(20);
                                var7_7.B(var26_26);
                            } else {
                                if (var18_18 != null) {
                                    var26_26 = 8;
                                    var27_27 = 1.1E-44f;
                                    var18_18.setVisibility(var26_26);
                                }
                                var26_26 = 0;
                                var27_27 = 0.0f;
                                var8_8 = null;
                                if (var32_32 != null) {
                                    var32_32.setVisibility(0);
                                }
                                var33_33.setVisibility(0);
                                var27_27 = 5.6E-45f;
                                var26_26 = mz3_0.d(4);
                                var7_7.B(var26_26);
                            }
                        }
                        var8_8 = var7_7.O0;
                        var13_13 /* !! */  = var7_7.k0;
                        var18_18 = var7_7.Z;
                        if (var8_8 == null) break block255;
                        var26_26 = (int)var8_8.isSimilarProductEnabled();
                        var43_42 = 1;
                        var44_43 = 1.4E-45f;
                        if (var26_26 != var43_42) break block255;
                        var26_26 = 8;
                        var27_27 = 1.1E-44f;
                        if (var18_18 != null) {
                            var18_18.setVisibility(var26_26);
                        }
                        if (var13_13 /* !! */  != null) {
                            var13_13 /* !! */ .setVisibility(var26_26);
                        }
                        if (var18_18 != null) {
                            var8_8 = var7_7.O0;
                            if (var8_8 != null) {
                                var8_8 = var8_8.getSimilarIconContentDescription();
                            } else {
                                var26_26 = 0;
                                var27_27 = 0.0f;
                                var8_8 = null;
                            }
                            var18_18.setContentDescription((CharSequence)var8_8);
                        }
                        if ((var8_8 = var7_7.O0) == null) break block256;
                        var26_26 = (int)var8_8.isSimilarProductEnabled();
                        var43_42 = 1;
                        var44_43 = 1.4E-45f;
                        if (var26_26 != var43_42) break block256;
                        var8_8 = var7_7.O0;
                        if (var8_8 != null) {
                            var8_8 = var8_8.getSimilarProductType();
                        } else {
                            var26_26 = 0;
                            var27_27 = 0.0f;
                            var8_8 = null;
                        }
                        var28_28 = "icon";
                        var43_42 = (int)Intrinsics.areEqual(var8_8, var28_28);
                        if (var43_42 == 0) break block257;
                        var26_26 = (int)var7_7.q;
                        if (var26_26 == 0 && (var26_26 = (int)var7_7.t) == 0) {
                            if (var18_18 != null) {
                                var26_26 = 0;
                                var27_27 = 0.0f;
                                var8_8 = null;
                                var18_18.setVisibility(0);
                            }
                            break block258;
                        } else if (var18_18 != null) {
                            var26_26 = 8;
                            var27_27 = 1.1E-44f;
                            var18_18.setVisibility(var26_26);
                        }
                        break block258;
                    }
                    var28_28 = "text";
                    var26_26 = (int)Intrinsics.areEqual(var8_8, var28_28);
                    if (var26_26 == 0) break block258;
                    var26_26 = (int)var7_7.q;
                    if (var26_26 == 0 && (var26_26 = (int)var7_7.t) == 0) {
                        if (var13_13 /* !! */  != null) {
                            var26_26 = 0;
                            var27_27 = 0.0f;
                            var8_8 = null;
                            var13_13 /* !! */ .setVisibility(0);
                        }
                        break block258;
                    } else if (var18_18 != null) {
                        var26_26 = 8;
                        var27_27 = 1.1E-44f;
                        var18_18.setVisibility(var26_26);
                    }
                    break block258;
                }
                var26_26 = 8;
                var27_27 = 1.1E-44f;
                break block258;
            }
            var26_26 = 8;
            var27_27 = 1.1E-44f;
            if (var18_18 != null) {
                var18_18.setVisibility(var26_26);
            }
            if (var13_13 /* !! */  != null) {
                var13_13 /* !! */ .setVisibility(var26_26);
            }
        }
        if ((var8_8 = var7_7.O0) != null && (var26_26 = (int)var8_8.isSimilarProductEnabled()) == 0) {
            if (var18_18 != null) {
                ai0_2.i((View)var18_18);
            }
            if (var13_13 /* !! */  != null) {
                ai0_2.i((View)var13_13 /* !! */ );
            }
        }
        var8_8 = var7_7.O0;
        var13_13 /* !! */  = var7_7.z;
        if (var8_8 != null && (var26_26 = (int)var8_8.getLayoutWidthChangesRequired()) == (var17_17 = 1) && (var26_26 = (int)var7_7.r) == 0 && (var26_26 = (int)var7_7.s) == 0 && (var26_26 = (int)var7_7.p) == 0) {
            var8_8 = var14_14.getLayoutParams();
            Intrinsics.checkNotNull(var8_8, (String)var20_20);
            var8_8 = (RecyclerView$LayoutParams)var8_8;
            var8_8.width = var17_17 = -2;
            var8_8.height = var17_17;
            var8_8.setMargins(0, 0, 0, 0);
            Intrinsics.checkNotNullParameter((Object)var23_23, "<this>");
            var18_18 = var23_23.getLayoutParams();
            var20_20 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
            Intrinsics.checkNotNull(var18_18, (String)var20_20);
            var18_18 = (ViewGroup.MarginLayoutParams)var18_18;
            var19_19 = 16;
            var43_42 = 8;
            var44_43 = 1.1E-44f;
            var18_18.setMargins(var19_19, var43_42, var43_42, var43_42);
            var23_23.setLayoutParams((ViewGroup.LayoutParams)var18_18);
            var14_14.setLayoutParams((ViewGroup.LayoutParams)var8_8);
            var26_26 = R$style.txt_body_small_bold;
            Gm3.a((TextView)var13_13 /* !! */ , var26_26);
            var26_26 = R$style.txt_body_small_reg;
            var14_14 = var25_25;
            Gm3.a((TextView)var25_25, var26_26);
            var8_8 = var7_7.J0;
            var17_17 = R$style.txt_body_small_bold;
            Gm3.a((TextView)var8_8, var17_17);
            var8_8 = var7_7.K0;
            var17_17 = R$style.txt_body_small_reg;
            Gm3.a((TextView)var8_8, var17_17);
            var26_26 = R$style.txt_body_small_bold;
            Gm3.a((TextView)var34_34, var26_26);
            var26_26 = R$style.txt_body_small_reg;
            Gm3.a((TextView)var35_35 /* !! */ , var26_26);
            var26_26 = R$style.txt_body_small_reg;
            Gm3.a((TextView)var36_36, var26_26);
            var8_8 = var7_7.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(var8_8, (String)var9_9);
            var26_26 = tm3_0.a(R$attr.plp_discount_percentage, (Context)var8_8);
            var36_36.setTextColor(var26_26);
            var37_37 = -2;
            var38_38 = 0.0f / 0.0f;
            var8_8 = new FrameLayout.LayoutParams(var37_37, var37_37);
            if (var32_32 != null && (var9_9 = var32_32.getLayoutParams()) != null) {
                var9_9.width = var17_17 = mz3_0.d(130);
            }
            if (var32_32 != null && (var9_9 = var32_32.getLayoutParams()) != null) {
                var11_11 = 2.24E-43f;
                var9_9.height = var10_10 = mz3_0.d(160);
            }
            var37_37 = 1103101952;
            var38_38 = 24.0f;
            var33_33.setRadius(var38_38);
            var33_33.setLayoutParams((ViewGroup.LayoutParams)var8_8);
            var9_9 = var7_7.itemView.getContext();
            var10_10 = 2;
            var11_11 = 2.8E-45f;
            var8_8 = new GridLayoutManager((Context)var9_9, var10_10);
            var9_9 = var46_45;
            var46_45.setLayoutManager((RecyclerView$o)var8_8);
        } else {
            var14_14 = var25_25;
        }
        var8_8 = var7_7.O0;
        if (var8_8 != null) {
            var9_9 = var8_8.getProductName();
            var14_14.setText((CharSequence)var9_9);
            var8_8 = var8_8.getBrandName();
            var13_13 /* !! */ .setText((CharSequence)var8_8);
        }
        if ((var8_8 = var7_7.O0) == null) ** GOTO lbl-1000
        var26_26 = (int)var8_8.getShowFinalPrice();
        var37_37 = 1;
        var38_38 = 1.4E-45f;
        if (var26_26 == var37_37) {
            var26_26 = 0;
            var27_27 = 0.0f;
            var34_34.setVisibility(0);
            var8_8 = var7_7.O0;
            if (var8_8 != null) {
                var32_32 = var8_8.getFinalPriceValue();
            } else {
                var10_10 = 0;
                var11_11 = 0.0f;
                var32_32 = null;
            }
            var34_34.setText((CharSequence)var32_32);
            var8_8 = var7_7.O0;
            if (var8_8 != null) {
                var32_32 = var8_8.getFinalPriceContentDescription();
            } else {
                var10_10 = 0;
                var11_11 = 0.0f;
                var32_32 = null;
            }
            var34_34.setContentDescription((CharSequence)var32_32);
        } else lbl-1000:
        // 2 sources

        {
            var26_26 = 8;
            var27_27 = 1.1E-44f;
            var34_34.setVisibility(var26_26);
        }
        var8_8 = var7_7.O0;
        if (var8_8 == null) ** GOTO lbl-1000
        var26_26 = (int)var8_8.getShowMrpPrice();
        var37_37 = 1;
        var38_38 = 1.4E-45f;
        if (var26_26 == var37_37) {
            var26_26 = 0;
            var27_27 = 0.0f;
            var35_35 /* !! */ .setVisibility(0);
            var8_8 = var7_7.O0;
            if (var8_8 != null) {
                var32_32 = var8_8.getMrpPriceValue();
            } else {
                var10_10 = 0;
                var11_11 = 0.0f;
                var32_32 = null;
            }
            var35_35 /* !! */ .setText((CharSequence)var32_32);
            var8_8 = var7_7.O0;
            if (var8_8 != null) {
                var32_32 = var8_8.getMrpPriceContentDescription();
            } else {
                var10_10 = 0;
                var11_11 = 0.0f;
                var32_32 = null;
            }
            var35_35 /* !! */ .setContentDescription((CharSequence)var32_32);
        } else lbl-1000:
        // 2 sources

        {
            var26_26 = 8;
            var27_27 = 1.1E-44f;
            var35_35 /* !! */ .setVisibility(var26_26);
        }
        var8_8 = var7_7.O0;
        if (var8_8 == null) ** GOTO lbl-1000
        var26_26 = (int)var8_8.getShowDiscountPrice();
        var37_37 = 1;
        var38_38 = 1.4E-45f;
        if (var26_26 == var37_37) {
            var26_26 = 0;
            var27_27 = 0.0f;
            var36_36.setVisibility(0);
            var8_8 = var7_7.O0;
            if (var8_8 != null) {
                var32_32 = var8_8.getDiscountPriceValue();
            } else {
                var10_10 = 0;
                var11_11 = 0.0f;
                var32_32 = null;
            }
            var36_36.setText((CharSequence)var32_32);
            var8_8 = var7_7.O0;
            if (var8_8 != null) {
                var32_32 = var8_8.getDiscountPriceContentDescription();
            } else {
                var10_10 = 0;
                var11_11 = 0.0f;
                var32_32 = null;
            }
            var36_36.setContentDescription((CharSequence)var32_32);
        } else lbl-1000:
        // 2 sources

        {
            var26_26 = 8;
            var27_27 = 1.1E-44f;
            var36_36.setVisibility(var26_26);
        }
        var8_8 = var7_7.O0;
        if (var8_8 != null) {
            var26_26 = (int)var8_8.getCheckIfTalkbackServiceEnabled();
            var37_37 = 1;
            var38_38 = 1.4E-45f;
            if (var26_26 == var37_37) {
                var8_8 = var7_7.O0;
                if (var8_8 != null) {
                    var35_35 /* !! */  = var8_8.getFinalPriceContentDescription();
                } else {
                    var41_40 = 0;
                    var35_35 /* !! */  = null;
                }
                var34_34.setContentDescription((CharSequence)var35_35 /* !! */ );
            }
        }
        var0.F();
        var0.x();
        var8_8 = var4_4;
        var13_13 /* !! */  = var24_24;
        var7_7.z(var4_4, var24_24);
        var0.y();
    }

    public final void A() {
        TextView textView = this.z;
        int n3 = 1;
        textView.setAllCaps(n3 != 0);
        int n4 = R$style.muli_bold_12_accent_21;
        Gm3.a(textView, n4);
        textView = this.I0;
        if (textView != null) {
            textView.setAllCaps(n3 != 0);
        }
        Object object = this.A0;
        int n7 = 8;
        object.setVisibility(n7);
        object = this.y0;
        object.setAllCaps(n3 != 0);
        ImageView imageView = this.z0;
        imageView.setVisibility(n7);
        this.B0.setAllCaps(n3 != 0);
        View view = this.x0;
        int n8 = R$color.accent_color_21;
        view.setBackgroundResource(n8);
        view = this.H0;
        if (view != null) {
            n8 = R$drawable.rect_black_stroke;
            view.setBackgroundResource(n8);
        }
        n7 = R$style.muli_bold_12_accent_11;
        Gm3.a((TextView)object, n7);
        n7 = R$style.muli_bold_12_accent_11;
        Gm3.a((TextView)object, n7);
        object = this.w;
        n7 = R$drawable.component_placeholder;
        object.setBackgroundColor(n7);
        object = this.T0;
        object.setAllCaps(n3 != 0);
        if (textView != null) {
            n3 = R$style.muli_bold_12_accent_21;
            Gm3.a(textView, n3);
        }
        textView = this.R0;
        n3 = R$drawable.rect_black_stroke;
        textView.setBackgroundResource(n3);
        textView = this.S0;
        n3 = R$drawable.rect_black_stroke;
        textView.setBackgroundResource(n3);
    }

    public final void B(int n3) {
        ImageView imageView = this.Z;
        int n4 = 7;
        if (imageView != null) {
            ai0_2.u(0, n3, n4, (View)imageView);
        }
        if ((imageView = this.k0) != null) {
            ai0_2.u(0, n3, n4, (View)imageView);
        }
        imageView = this.X;
        ai0_2.u(0, n3, n4, (View)imageView);
        imageView = this.Y;
        if (imageView != null) {
            ai0_2.u(0, n3, n4, (View)imageView);
        }
        if ((imageView = this.S) != null) {
            ai0_2.u(0, n3, n4, (View)imageView);
        }
        imageView = this.T;
        ai0_2.u(0, n3, n4, (View)imageView);
        n3 = mz3_0.d(0);
        imageView = this.y;
        imageView.setMinimumHeight(n3);
        n3 = mz3_0.d(0);
        imageView.setMinHeight(n3);
        imageView.getLayoutParams().height = -2;
    }

    public final void C() {
        View view = this.a;
        int n3 = R$id.sale_container_v2;
        this.q0 = view = view.findViewById(n3);
    }

    public final void E(ImageView imageView) {
        if (imageView != null) {
            int n3;
            boolean bl2 = true;
            imageView.setClickable(bl2);
            imageView.setOnClickListener((View.OnClickListener)this);
            imageView.setLongClickable(bl2);
            Object object = this.d1;
            imageView.setOnLongClickListener((View.OnLongClickListener)object);
            object = new da$a();
            ((da$a)object).a = n3 = R$drawable.component_placeholder;
            ((da$a)object).b = n3;
            Object object2 = this.O0;
            if (object2 != null) {
                object2 = ((PlpProductUIModel)object2).getProductImageUrl();
            } else {
                n3 = 0;
                object2 = null;
            }
            ((da$a)object).n = object2;
            ((da$a)object).u = imageView;
            ((da$a)object).a();
        }
    }

    public final void F() {
        int n3;
        Object object = this.O0;
        Object object2 = this.B;
        int n4 = 1;
        TextView textView = this.A;
        if (object != null && (n3 = ((PlpProductUIModel)object).getShowAdTag()) == n4) {
            ai0_2.B((View)object2);
            ai0_2.i((View)textView);
        } else {
            ai0_2.i((View)object2);
            object = this.O0;
            if (object != null && (n3 = (int)(((PlpProductUIModel)object).getShowProductTags() ? 1 : 0)) == n4) {
                object = this.O0;
                object2 = null;
                if (object != null) {
                    object = ((PlpProductUIModel)object).getProductTagViewContentDescription();
                } else {
                    n3 = 0;
                    object = null;
                }
                textView.setContentDescription((CharSequence)object);
                object = this.O0;
                if (object != null) {
                    object2 = ((PlpProductUIModel)object).getProductTagValue();
                }
                textView.setText((CharSequence)object2);
                n3 = 0;
                object = null;
                textView.setVisibility(0);
            } else {
                n3 = 8;
                textView.setVisibility(n3);
            }
        }
    }

    public final void e(ProductOptionItem productOptionItem) {
        Intrinsics.checkNotNullParameter(productOptionItem, "optionItem");
        nw_0 nw_02 = this.c;
        if (nw_02 != null) {
            Product product = this.N0;
            nw_02.t4(product, productOptionItem);
        }
    }

    public final void g() {
        this.w();
    }

    public final void n(int n3) {
        Object object = this.i;
        if (object != null) {
            int n4;
            object = this.O0;
            if (object != null && (object = ((PlpProductUIModel)object).getExtraImagesUrlList()) != null) {
                n4 = ((ArrayList)object).size();
            } else {
                n4 = 0;
                object = null;
            }
            if (n4 > 0 && (object = this.N0) != null) {
                Object object2;
                Object object3 = this.O0;
                if (object3 == null || (object3 = ((PlpProductUIModel)object3).getExtraImagesUrlList()) == null || (object2 = (String)((ArrayList)object3).get(n3)) == null) {
                    object2 = "";
                }
                int n7 = this.getBindingAdapterPosition();
                lv2 lv22 = new lv2((Product)object, n7, (String)object2);
                object2 = this.i;
                if (object2 != null) {
                    object2.L(lv22);
                }
            }
        }
    }

    public final void onClick(View object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n7 = object.getId();
        int n8 = R$id.plp_row_add_to_closet_iv;
        Object object4 = null;
        if (n7 == n8) {
            object = this.N0;
            if (object != null) {
                n3 = this.getLayoutPosition();
                ((Product)object).setViewHolderPos(n3);
            }
            if ((object = this.O0) != null) {
                n3 = this.getLayoutPosition();
                ((PlpProductUIModel)object).setViewHolderPos(n3);
            }
            if ((object = this.h) != null) {
                object2 = this.N0;
                PlpProductUIModel plpProductUIModel = this.O0;
                if (plpProductUIModel != null) {
                    object4 = plpProductUIModel.getProductCode();
                }
                object.R4((Product)object2, (String)object4);
            }
        } else {
            n8 = R$id.plp_row_add_to_closet_wishcount_iv;
            if (n7 == n8) {
                object = this.N0;
                if (object != null) {
                    n3 = this.getLayoutPosition();
                    ((Product)object).setViewHolderPos(n3);
                }
                if ((object = this.O0) != null) {
                    n3 = this.getLayoutPosition();
                    ((PlpProductUIModel)object).setViewHolderPos(n3);
                }
                if ((object = this.h) != null) {
                    object2 = this.N0;
                    PlpProductUIModel plpProductUIModel = this.O0;
                    if (plpProductUIModel != null) {
                        object4 = plpProductUIModel.getProductCode();
                    }
                    object.R4((Product)object2, (String)object4);
                }
            } else {
                n8 = R$id.plp_row_closet_iv_added;
                if (n7 == n8) {
                    object = this.N0;
                    if (object != null) {
                        n3 = this.getLayoutPosition();
                        ((Product)object).setViewHolderPos(n3);
                    }
                    if ((object = this.O0) != null) {
                        n3 = this.getLayoutPosition();
                        ((PlpProductUIModel)object).setViewHolderPos(n3);
                    }
                    if ((object = this.h) != null) {
                        object2 = this.N0;
                        PlpProductUIModel plpProductUIModel = this.O0;
                        if (plpProductUIModel != null) {
                            object4 = plpProductUIModel.getProductCode();
                        }
                        object.C((Product)object2, (String)object4);
                    }
                } else {
                    n8 = R$id.plp_row_closet_iv_added_wishcount;
                    if (n7 == n8) {
                        object = this.N0;
                        if (object != null) {
                            n3 = this.getLayoutPosition();
                            ((Product)object).setViewHolderPos(n3);
                        }
                        if ((object = this.O0) != null) {
                            n3 = this.getLayoutPosition();
                            ((PlpProductUIModel)object).setViewHolderPos(n3);
                        }
                        if ((object = this.h) != null) {
                            object2 = this.N0;
                            PlpProductUIModel plpProductUIModel = this.O0;
                            if (plpProductUIModel != null) {
                                object4 = plpProductUIModel.getProductCode();
                            }
                            object.C((Product)object2, (String)object4);
                        }
                    } else {
                        n8 = R$id.plp_row_similar_product_tv;
                        if (n7 != n8 && n7 != (n8 = R$id.plp_row_similar_product_iv)) {
                            int n10 = R$id.closetAddBagContainer;
                            if (n7 == n10) {
                                object = this.N0;
                                if (object != null) {
                                    ((Product)object).setShowSizeLayout(n4 != 0);
                                }
                                if ((object = this.O0) != null) {
                                    ((PlpProductUIModel)object).setShowSizeLayout(n4 != 0);
                                }
                                if ((object = this.c) != null) {
                                    n7 = this.getAdapterPosition();
                                    object.J0(n7);
                                }
                                if ((object = this.c) != null) {
                                    object3 = this.N0;
                                    object.i5((Product)object3);
                                }
                                if ((object = this.b) != null) {
                                    n10 = ((jo_2)object).d();
                                    object4 = n10;
                                }
                                object = yn3_0.a;
                                object3 = "Bag Count%s";
                                Object[] objectArray = new Object[n4];
                                objectArray[0] = object4;
                                ((yn3$a)object).a((String)object3, objectArray);
                                if (object4 != null && (n10 = ((Integer)object4).intValue()) == 0) {
                                    object = this.k;
                                    if (object != null) {
                                        object2 = "Closet Button/Empty Cart";
                                        object.F3((Integer)object4, (String)object2);
                                    }
                                } else {
                                    object = this.k;
                                    if (object != null) {
                                        object2 = "Closet Button";
                                        object.F3((Integer)object4, (String)object2);
                                    }
                                }
                            } else {
                                n10 = R$id.plp_row_product_iv;
                                if (n7 != n10 && n7 != (n10 = R$id.productInfoContainer)) {
                                    n10 = R$id.cancelSizeTv;
                                    if (n7 == n10) {
                                        object = this.N0;
                                        if (object != null) {
                                            ((Product)object).setShowSizeLayout(false);
                                        }
                                        if ((object = this.O0) != null) {
                                            ((PlpProductUIModel)object).setShowSizeLayout(false);
                                        }
                                        if ((object = this.c) != null) {
                                            n3 = this.getAdapterPosition();
                                            object.y1(n3);
                                        }
                                    } else {
                                        n10 = R$id.closetAddedToBag;
                                        if (n7 == n10) {
                                            object = this.O0;
                                            if (object != null && (n10 = (int)(((PlpProductUIModel)object).isSimilarOOSWishlistEnabled() ? 1 : 0)) == n4 && (object = this.c) != null) {
                                                object2 = this.N0;
                                                object.a0((Product)object2);
                                            }
                                        } else {
                                            n10 = R$id.oosSimilarContainer;
                                            if (n7 == n10) {
                                                object = this.O0;
                                                if (object != null && (n10 = (int)(((PlpProductUIModel)object).isSimilarOOSWishlistEnabled() ? 1 : 0)) == n4 && (object = this.c) != null) {
                                                    object2 = this.N0;
                                                    object.a0((Product)object2);
                                                }
                                            } else {
                                                n10 = R$id.deleteOOSContainer;
                                                if (n7 == n10 || n7 == (n10 = R$id.deleteImg)) {
                                                    object = this.O0;
                                                    if (object != null) {
                                                        object4 = ((PlpProductUIModel)object).getDeleteWishlistContentDescription();
                                                    }
                                                    n10 = this.c1;
                                                    object = LO1.a(n10, (String)object4, " index ");
                                                    object2 = this.R0;
                                                    object2.setContentDescription((CharSequence)object);
                                                    object = this.N0;
                                                    if (object != null && (object2 = this.n) != null) {
                                                        this.getAdapterPosition();
                                                        object2.U9((Product)object);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    object = this.O0;
                                    if (object != null && (n10 = (int)(((PlpProductUIModel)object).getCartClosetClickListners() ? 1 : 0)) == n4) {
                                        object = this.c;
                                        if (object != null) {
                                            object2 = this.N0;
                                            String string2 = "bag screen - wishlist screen";
                                            object.K7((Product)object2, string2);
                                        }
                                    } else {
                                        object = this.O0;
                                        if (object != null && (n10 = (int)(((PlpProductUIModel)object).getLuxeCartClickListners() ? 1 : 0)) == n4) {
                                            object = this.n;
                                            if (object != null) {
                                                object2 = this.N0;
                                                Intrinsics.checkNotNull(object2);
                                                object.k5((Product)object2);
                                            }
                                        } else {
                                            object = this.O0;
                                            if (object != null && (n10 = (int)(((PlpProductUIModel)object).getCartClickListners() ? 1 : 0)) == n4) {
                                                object = this.X0;
                                                n10 = object.getVisibility();
                                                if (n10 == (n3 = 4) && (n10 = (object = this.W0).getVisibility()) == (n3 = 8) && (n10 = (object = this.Y0).getVisibility()) == n3 && (object = this.n) != null) {
                                                    object2 = this.N0;
                                                    Intrinsics.checkNotNull(object2);
                                                    object.k5((Product)object2);
                                                }
                                            } else {
                                                object = this.O0;
                                                if (object != null && (n10 = (int)(((PlpProductUIModel)object).getRecentViewclickListners() ? 1 : 0)) == n4 || (n10 = (int)(this.s ? 1 : 0)) != 0) {
                                                    Product product = this.N0;
                                                    object = this.d;
                                                    if (object != null) {
                                                        if (product != null) {
                                                            object = this.O0;
                                                            if (object != null) {
                                                                object4 = ((PlpProductUIModel)object).getProductCode();
                                                            }
                                                            product.setCode((String)object4);
                                                        }
                                                        if (product != null && (object = this.O0) != null && (object = ((PlpProductUIModel)object).getProductCode()) != null && (object2 = this.d) != null) {
                                                            n4 = this.getAdapterPosition();
                                                            object3 = this.f;
                                                            object2.d((String)object, product, n4, (HomeRowData)object3);
                                                        }
                                                    } else {
                                                        hy0_0 hy0_02;
                                                        object = this.g;
                                                        if (object != null && (hy0_02 = this.k) != null) {
                                                            int n14 = this.getAdapterPosition();
                                                            String string3 = this.e;
                                                            HomeRowData homeRowData = this.f;
                                                            int n15 = this.o;
                                                            hy0_02.V8(product, n14, string3, homeRowData, n15);
                                                        }
                                                    }
                                                } else {
                                                    this.w();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int n16;
                            object2 = this.N0;
                            if (object2 != null) {
                                n4 = this.getLayoutPosition();
                                ((Product)object2).setViewHolderPos(n4);
                            }
                            object = (n16 = object.getId()) == (n3 = R$id.plp_row_similar_product_iv) ? "icon" : "text";
                            object2 = this.h;
                            if (object2 != null) {
                                Product product = this.N0;
                                object2.h9(product, (String)object);
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w() {
        block26: {
            Object object;
            Object object2;
            String string2;
            Object object3;
            block28: {
                block27: {
                    Object object4;
                    Object object5;
                    boolean bl2;
                    int n3;
                    object3 = this.h;
                    if (object3 == null) break block26;
                    object3 = this.O0;
                    if (object3 != null) {
                        object3 = ((PlpProductUIModel)object3).getWasPriceValue();
                    }
                    if ((object3 = this.O0) != null) {
                        object3 = ((PlpProductUIModel)object3).getPriceValue();
                    }
                    object3 = this.O0;
                    string2 = null;
                    if (object3 != null && (n3 = ((PlpProductUIModel)object3).isDodEnabled()) == 0 && (n3 = this.j) != 0) {
                        object3 = this.O0;
                        bl2 = false;
                        object5 = null;
                        int n4 = 1;
                        if (object3 != null && (n3 = ((PlpProductUIModel)object3).isPreSalePlp()) == n4) {
                            float f5;
                            int n7;
                            float f6;
                            object2 = this.O0;
                            if (object2 != null && (object2 = ((PlpProductUIModel)object2).getBestPriceValue()) != null) {
                                f6 = ((Float)object2).floatValue();
                            } else {
                                n7 = 0;
                                f6 = 0.0f;
                                object2 = null;
                            }
                            n7 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                            if (n7 > 0) {
                                bl2 = true;
                            }
                            if ((object4 = this.O0) != null && (object4 = ((PlpProductUIModel)object4).getBestPriceValue()) != null) {
                                object4 = ((Float)object4).toString();
                            } else {
                                n4 = 0;
                                object4 = null;
                            }
                            object2 = this.O0;
                            if (object2 != null) {
                                object2 = ((PlpProductUIModel)object2).getDiscountPercentValue();
                            } else {
                                n7 = 0;
                                object2 = null;
                                f6 = 0.0f;
                            }
                            object3 = new SaleGAData(bl2, (String)object4, (String)object2);
                        } else {
                            int n8;
                            object2 = this.O0;
                            if (object2 != null) {
                                object2 = ((PlpProductUIModel)object2).getOfferPrice();
                            } else {
                                n8 = 0;
                                object2 = null;
                                float f7 = 0.0f;
                            }
                            if (object2 == null || (n8 = ((String)object2).length()) == 0) {
                                bl2 = true;
                            }
                            bl2 ^= n4;
                            object4 = this.O0;
                            if (object4 != null) {
                                object4 = ((PlpProductUIModel)object4).getOfferPrice();
                            } else {
                                n4 = 0;
                                object4 = null;
                            }
                            object3 = new SaleGAData(bl2, (String)object4, null);
                        }
                        object = object3;
                    } else {
                        object = null;
                    }
                    object3 = this.m;
                    if (object3 == null) break block27;
                    object5 = this.N0;
                    if (object5 != null) {
                        object5 = ((Product)object5).getCatalogName();
                    } else {
                        bl2 = false;
                        object5 = null;
                    }
                    object4 = "ajioGram";
                    bl2 = Intrinsics.areEqual(object5, object4);
                    if (!bl2 || (object5 = ((AjiogramInterventions)object3).getTag_text()) == null || !(bl2 = ((String)object5).length())) {
                        n3 = 0;
                        object3 = null;
                    }
                    if (object3 != null && (object3 = ((AjiogramInterventions)object3).getTag_text()) != null) break block28;
                }
                object3 = "";
            }
            Object object6 = object3;
            object2 = this.h;
            if (object2 != null) {
                object3 = this.O0;
                if (object3 != null) {
                    string2 = ((PlpProductUIModel)object3).getProductCode();
                }
                int n10 = this.getBindingAdapterPosition();
                Product product = this.N0;
                object3 = this.C.getText();
                String string3 = object3.toString();
                object2.S6(string2, n10, product, string3, (SaleGAData)object, (String)object6);
            }
        }
    }

    public final void x() {
        Object object;
        int n3;
        Object object2;
        Object object3 = this.J;
        if (object3 != null) {
            object2 = this.O0;
            if (object2 != null) {
                object2 = ((PlpProductUIModel)object2).getProductImageContentDescription();
            } else {
                n3 = 0;
                object2 = null;
            }
            object3.setContentDescription((CharSequence)object2);
        }
        if ((object2 = this.l) == (object = Yj2.GRID)) {
            this.E((ImageView)object3);
        } else {
            object3 = this.p0;
            if (object3 != null) {
                int n4;
                n3 = ((RecyclerView)object3).getItemDecorationCount();
                if (n3 < (n4 = 1)) {
                    n4 = hv3_0.q(R$dimen.margin_8);
                    object2 = new t91(n4);
                    ((RecyclerView)object3).addItemDecoration((RecyclerView$n)object2);
                }
                if ((object = this.O0) == null || (object = ((PlpProductUIModel)object).getExtraImagesUrlList()) == null) {
                    object = new ArrayList();
                }
                object2 = new mq1_0((List)object, this);
                Context context = object3.getContext();
                object = new LinearLayoutManager(context, 0, false);
                ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
                ((RecyclerView)object3).setAdapter((RecyclerView$f)object2);
            }
        }
    }

    public final void y() {
        int n3;
        Object object = this.O0;
        hh3_2 hh3_22 = this.M0;
        int n4 = 8;
        int n7 = 1;
        if (object != null && (n3 = ((PlpProductUIModel)object).getEnableRatingView()) == n7) {
            Object object2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(object2, "getContext(...)");
            Object object3 = this.itemView;
            object = new oa_0((Context)object2, (View)object3);
            object2 = this.O0;
            object3 = null;
            if (object2 != null) {
                boolean bl2 = ((PlpProductUIModel)object2).isRatingEnabledPlp();
                object2 = bl2;
            } else {
                boolean bl3 = false;
                object2 = null;
            }
            Object object4 = this.O0;
            object4 = object4 != null ? ((PlpProductUIModel)object4).getProductRatingCount() : null;
            PlpProductUIModel plpProductUIModel = this.O0;
            if (plpProductUIModel != null) {
                object3 = plpProductUIModel.getAverageRating();
            }
            ((oa_0)object).m = object3;
            ((oa_0)object).n = object4;
            ((oa_0)object).d((Boolean)object2, n7);
        } else {
            object = (View)hh3_22.getValue();
            if (object != null) {
                object.setVisibility(n4);
            }
        }
        object = this.O0;
        if (object != null && (n3 = ((PlpProductUIModel)object).isLuxeEnabled()) == n7 && (object = (View)hh3_22.getValue()) != null) {
            object.setVisibility(n4);
        }
        if ((object = this.O0) != null && (n3 = ((PlpProductUIModel)object).isRecentlyWidgetEnable()) == n7) {
            object = this.O0;
            hh3_22 = this.y;
            if (object != null && (n3 = ((PlpProductUIModel)object).getShouldShowProductDescription()) == n7) {
                n3 = 0;
                object = null;
                hh3_22.setVisibility(0);
            } else {
                hh3_22.setVisibility(n4);
            }
        }
    }

    public final void z(ScreenType object, yt2_2 object2) {
        int n3;
        int n4;
        PlpProductUIModel plpProductUIModel = this.O0;
        if (plpProductUIModel != null) {
            boolean bl2 = plpProductUIModel.getEnableSaleContainer();
            String string2 = null;
            if (bl2) {
                View view = this.q0;
                object2 = this.O0;
                if (object2 != null) {
                    object2 = ((PlpProductUIModel)object2).getPriceValue();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                String string3 = String.valueOf(object2);
                object2 = this.O0;
                Object object3 = object2 != null ? (object2 = ((PlpProductUIModel)object2).getBestPriceValue()) : null;
                object2 = this.O0;
                Object object4 = object2 != null ? (object2 = ((PlpProductUIModel)object2).getDiscountPercentValue()) : null;
                object2 = this.O0;
                if (object2 != null) {
                    string2 = ((PlpProductUIModel)object2).getOfferPrice();
                }
                boolean bl3 = plpProductUIModel.isLuxeAfercartAndLuxeEnable();
                boolean bl4 = plpProductUIModel.isSaleContainerSpaceRetained();
                int n7 = 256;
                Object object5 = object;
                tr2_2.A(view, string3, (Float)object3, (String)object4, string2, bl3, bl4, (ScreenType)((Object)object), null, n7);
            } else {
                object = this.O0;
                if (object != null && (n3 = ((PlpProductUIModel)object).isDodEnabled()) == 0 && (n3 = (int)(this.j ? 1 : 0)) != 0) {
                    object = tr2_2.a;
                    View view = this.q0;
                    object = this.O0;
                    if (object != null) {
                        object = ((PlpProductUIModel)object).getPriceValue();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    String string4 = String.valueOf(object);
                    object = this.O0;
                    Object object6 = object != null ? (object = ((PlpProductUIModel)object).getBestPriceValue()) : null;
                    object = this.O0;
                    Object object7 = object != null ? (object = ((PlpProductUIModel)object).getDiscountPercentValue()) : null;
                    object = this.O0;
                    if (object != null) {
                        string2 = ((PlpProductUIModel)object).getOfferPrice();
                    }
                    ScreenType screenType = ScreenType.SCREEN_PLP;
                    boolean bl5 = false;
                    boolean bl6 = false;
                    int n8 = 96;
                    tr2_2.A(view, string4, (Float)object6, (String)object7, string2, false, false, screenType, (yt2_2)((Object)object2), n8);
                } else {
                    object = this.q0;
                    if (object != null) {
                        n4 = 8;
                        object.setVisibility(n4);
                    }
                }
            }
        }
        if ((object = this.O0) != null && (n3 = ((PlpProductUIModel)object).isFromHomeProductWidget()) == (n4 = 1) && (object = this.O0) != null && (n3 = (int)(((PlpProductUIModel)object).isLuxeEnabled() ? 1 : 0)) == n4) {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            n4 = R$color.transparent;
            n3 = t70.getColor((Context)object, n4);
            object2 = this.L0;
            object2.setBackgroundColor(n3);
            this.A();
        }
    }
}

