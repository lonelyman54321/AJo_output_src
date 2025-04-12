/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.JsonParser;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.ExtraImage;
import com.ril.ajio.services.data.Product.PriceReveal;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.Product.Tag;
import com.ril.ajio.services.data.Product.TagPrimary;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class b32
extends RecyclerView$B
implements View.OnClickListener,
Oj2 {
    public static final b32$a Companion;
    public final TextView A;
    public final View B;
    public final TextView C;
    public final View D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final RecyclerView H;
    public final TextView I;
    public final LinearLayout J;
    public final View K;
    public final LottieAnimationView L;
    public final ConstraintLayout M;
    public final TextView N;
    public final RelativeLayout O;
    public final LinearLayout P;
    public final LinearLayout Q;
    public final LinearLayout R;
    public final boolean S;
    public Product T;
    public String U;
    public long X;
    public boolean Y;
    public ArrayList Z;
    public final M82 a;
    public final Cw2 b;
    public final boolean c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final Yj2 g;
    public final boolean h;
    public final yi2_1 i;
    public final boolean j;
    public final hh3_2 k;
    public int k0;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final Z22 p0;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final ImageView t;
    public final LinearLayout u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    static {
        b32$a b32$a;
        Companion = b32$a = new Object();
    }

    public b32(View object, M82 object2, boolean bl2, yi2_1 object3) {
        boolean bl3;
        LinearLayout linearLayout;
        Object object4;
        RecyclerView recyclerView;
        TextView textView;
        ImageView imageView;
        TextView textView2;
        int n3;
        String string2;
        int n4 = 1;
        Object object5 = Boolean.FALSE;
        Yj2 yj2 = Yj2.GRID;
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter((Object)yj2, "plpViewType");
        Intrinsics.checkNotNullParameter(object3, "pdpInfoProvider");
        super((View)object);
        this.a = object2;
        boolean bl4 = false;
        object2 = null;
        this.b = null;
        this.c = bl2;
        this.d = string2 = "Similar Products";
        this.e = object5;
        this.f = null;
        this.g = yj2;
        this.h = n4;
        this.i = object3;
        object3 = h40_0.a;
        this.j = n3 = h40_0.L1();
        object3 = new Object();
        this.k = object3 = yr1_2.b((Function0)object3);
        n3 = R$id.plp_row_prd_name_tv;
        object3 = object.findViewById(n3);
        object5 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.l = object3;
        n3 = R$id.plp_row_brand_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.m = object3;
        n3 = R$id.plp_row_exclusive_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.n = object3;
        n3 = R$id.plp_ad_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.o = object3;
        n3 = R$id.plp_row_final_price_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.p = object3;
        n3 = R$id.plp_row_mrp_price_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.q = object3;
        n3 = R$id.plp_row_discount_percent_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.r = object3;
        n3 = R$id.plp_row_offer_price_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.s = object3;
        n3 = R$id.plp_row_product_iv;
        object3 = (ImageView)object.findViewById(n3);
        this.t = object3;
        n3 = R$id.plp_row_size_list;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (LinearLayout)object3;
        this.u = object3;
        int n7 = R$id.plp_row_size_count_tv;
        yj2 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue((Object)yj2, (String)object5);
        yj2 = (TextView)yj2;
        this.v = yj2;
        n7 = R$id.item_plp_size_1;
        yj2 = object3.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue((Object)yj2, (String)object5);
        yj2 = (TextView)yj2;
        this.w = yj2;
        n7 = R$id.item_plp_size_2;
        yj2 = object3.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue((Object)yj2, (String)object5);
        yj2 = (TextView)yj2;
        this.x = yj2;
        n7 = R$id.item_plp_size_3;
        yj2 = object3.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue((Object)yj2, (String)object5);
        yj2 = (TextView)yj2;
        this.y = yj2;
        n7 = R$id.item_plp_size_4;
        object3 = object3.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        this.z = object3;
        n3 = R$id.plp_row_dod_timer_view;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (LinearLayout)object3;
        n3 = R$id.plp_row_dod_timer_tv;
        object3 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        object3 = (TextView)object3;
        n3 = R$id.plp_row_add_to_closet_wishcount_iv;
        object3 = (TextView)object.findViewById(n3);
        this.A = object3;
        n7 = R$id.plp_row_add_to_closet_iv;
        yj2 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue((Object)yj2, (String)object5);
        this.B = yj2;
        int n8 = R$id.selling_fast_tag;
        this.C = textView2 = (TextView)object.findViewById(n8);
        n8 = R$id.plp_row_closet_iv_added;
        textView2 = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(textView2, (String)object5);
        this.D = textView2;
        int n10 = R$id.plp_row_closet_iv_added_wishcount;
        object5 = (TextView)object.findViewById(n10);
        this.E = object5;
        int n14 = R$id.plp_row_similar_product_iv;
        this.F = imageView = (ImageView)object.findViewById(n14);
        int n15 = R$id.plp_row_similar_product_tv;
        this.G = textView = (TextView)object.findViewById(n15);
        int n16 = R$id.plp_row_product_rv;
        this.H = recyclerView = (RecyclerView)object.findViewById(n16);
        int n17 = R$id.priority_date;
        this.I = object4 = (TextView)object.findViewById(n17);
        n17 = R$id.ll_pd_delivery;
        object4 = (LinearLayout)object.findViewById(n17);
        this.J = object4;
        n17 = R$id.sale_container;
        object4 = object.findViewById(n17);
        this.K = object4;
        n17 = R$id.id_delivery_anim;
        object4 = (LottieAnimationView)object.findViewById(n17);
        this.L = object4;
        n17 = R$id.freebie_lyt;
        object4 = (ConstraintLayout)object.findViewById(n17);
        this.M = object4;
        n17 = R$id.freebies_text;
        this.N = object4 = (TextView)object.findViewById(n17);
        n17 = R$id.no_product_available_rl;
        object4 = (RelativeLayout)object.findViewById(n17);
        this.O = object4;
        n17 = R$id.ll_main_view;
        object4 = (LinearLayout)object.findViewById(n17);
        this.P = object4;
        n17 = R$id.ll_odd;
        object4 = (LinearLayout)object.findViewById(n17);
        this.Q = object4;
        int n18 = R$id.ll_even;
        this.R = linearLayout = (LinearLayout)object.findViewById(n18);
        Object object6 = el1_2.a;
        this.S = bl3 = el1_2.l();
        this.U = "";
        object6 = new ArrayList();
        this.Z = object6;
        if (object4 != null) {
            object6 = new eW(this, n4);
            object4.post((Runnable)object6);
        }
        if (linearLayout != null) {
            Y22 y22 = new Y22(this);
            linearLayout.post((Runnable)y22);
        }
        if (object3 != null) {
            object3.setOnClickListener((View.OnClickListener)this);
        }
        yj2.setOnClickListener(this);
        textView2.setOnClickListener((View.OnClickListener)this);
        if (object5 != null) {
            object5.setOnClickListener((View.OnClickListener)this);
        }
        if (imageView != null) {
            imageView.setOnClickListener((View.OnClickListener)this);
        }
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener)this);
        }
        object.setOnClickListener((View.OnClickListener)this);
        int n19 = 8;
        if (imageView != null) {
            imageView.setVisibility(n19);
        }
        if (textView != null) {
            textView.setVisibility(n19);
        }
        if ((n19 = (int)(Intrinsics.areEqual(null, object = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0)) != 0) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object2 = "showSimilarOptionOnPLPLuxe";
            n19 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
        } else {
            object = ld3_2.STORE_AJIOGRAM.getStoreId();
            n19 = (int)(Intrinsics.areEqual(null, object) ? 1 : 0);
            if (n19 != 0) {
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                object2 = "showSimilarOptionOnPLPAjiogram";
                n19 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
            } else {
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                object2 = "showSimilarOptionOnPLPAjio";
                n19 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
            }
        }
        if (n19 != 0 && (n19 = (int)(Intrinsics.areEqual(string2, string2) ? 1 : 0)) == 0) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("showIconOrTextForSimilarOnPLP");
            object2 = Locale.ROOT;
            object = ((String)object).toLowerCase((Locale)object2);
            Intrinsics.checkNotNullExpressionValue(object, "toLowerCase(...)");
            object2 = "icon";
            bl4 = Intrinsics.areEqual(object, object2);
            bl2 = false;
            string2 = null;
            if (bl4) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            } else {
                object2 = "text";
                n19 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                if (n19 != 0 && textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
        if (recyclerView != null) {
            super(this);
            recyclerView.addOnScrollListener((RecyclerView$s)object);
        }
        super(this);
        this.p0 = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void B(b32 var0, int var1_1, Product var2_2) {
        block205: {
            block216: {
                block215: {
                    block213: {
                        block214: {
                            block204: {
                                block211: {
                                    block212: {
                                        block203: {
                                            block210: {
                                                block208: {
                                                    block209: {
                                                        block207: {
                                                            block206: {
                                                                var3_3 = var0;
                                                                var4_4 = var1_1;
                                                                var5_5 = var2_2;
                                                                var6_6 = 2;
                                                                var7_7 = 0;
                                                                var8_8 = null;
                                                                var9_9 = 1;
                                                                var10_10 = var0.O;
                                                                var11_11 = 8;
                                                                if (var10_10 != null) {
                                                                    var10_10.setVisibility(var11_11);
                                                                }
                                                                if ((var10_10 = var3_3.P) != null) {
                                                                    var10_10.setVisibility(0);
                                                                }
                                                                var3_3.T = var5_5;
                                                                var12_12 = 0;
                                                                var10_10 = null;
                                                                if (var5_5 != null) {
                                                                    var13_13 = var2_2.getOfferPrice();
                                                                    if (var13_13 != null) {
                                                                        var13_13 = var13_13.getGiftAvailable();
                                                                        var14_14 /* !! */  = Boolean.TRUE;
                                                                        var15_15 = Intrinsics.areEqual(var13_13, var14_14 /* !! */ );
                                                                    } else {
                                                                        var15_15 = false;
                                                                        var13_13 = null;
                                                                    }
                                                                    var14_14 /* !! */  = var3_3.M;
                                                                    var16_16 = var3_3.N;
                                                                    mz3_0.O(var15_15, (ConstraintLayout)var14_14 /* !! */ , (TextView)var16_16, null);
                                                                }
                                                                if (var5_5 != null) {
                                                                    var13_13 = var2_2.getFnlColorVariantData();
                                                                } else {
                                                                    var15_15 = false;
                                                                    var13_13 = null;
                                                                }
                                                                if (var13_13 == null) break block205;
                                                                var13_13 = "-";
                                                                var14_14 /* !! */  = var3_3.F;
                                                                var16_16 = " index ";
                                                                var17_17 = "";
                                                                if (var14_14 /* !! */  != null) {
                                                                    var18_18 = var2_2.getFnlColorVariantData();
                                                                    if (var18_18 != null) {
                                                                        var18_18 = var18_18.getBrandName();
                                                                    } else {
                                                                        var19_19 = 0;
                                                                        var18_18 = null;
                                                                        var20_20 = 0.0f;
                                                                    }
                                                                    var21_21 = var2_2.getName();
                                                                    if (var21_21 == null) {
                                                                        var21_21 = var17_17;
                                                                    }
                                                                    var22_22 = "VIEW SIMILAR of ";
                                                                    var18_18 = og_1.a((String)var22_22, (String)var18_18, (String)var13_13, (String)var21_21, (String)var16_16);
                                                                    var18_18.append(var4_4);
                                                                    var18_18 = var18_18.toString();
                                                                    var14_14 /* !! */ .setContentDescription((CharSequence)var18_18);
                                                                }
                                                                var19_19 = R$string.added_wishlist_txt;
                                                                var21_21 = var2_2.getFnlColorVariantData();
                                                                if (var21_21 == null || (var21_21 = var21_21.getBrandName()) == null) {
                                                                    var21_21 = var17_17;
                                                                }
                                                                if ((var22_22 = var2_2.getName()) == null) {
                                                                    var22_22 = var17_17;
                                                                }
                                                                var23_23 = new Object[var6_6];
                                                                var23_23[0] = var21_21;
                                                                var23_23[var9_9] = var22_22;
                                                                var18_18 = hv3_0.L(var19_19, (Object[])var23_23);
                                                                var18_18 = LO1.a(var4_4, (String)var18_18, (String)var16_16);
                                                                var21_21 = var3_3.B;
                                                                var21_21.setContentDescription((CharSequence)var18_18);
                                                                var19_19 = R$string.removed_wishlist_txt;
                                                                var22_22 = var2_2.getFnlColorVariantData();
                                                                if (var22_22 == null || (var22_22 = var22_22.getBrandName()) == null) {
                                                                    var22_22 = var17_17;
                                                                }
                                                                if ((var23_23 = var2_2.getName()) == null) {
                                                                    var23_23 = var17_17;
                                                                }
                                                                var10_10 = new Object[var6_6];
                                                                var10_10[0] = var22_22;
                                                                var10_10[var9_9] = var23_23;
                                                                var10_10 = hv3_0.L(var19_19, (Object[])var10_10);
                                                                var24_24 = LO1.a(var4_4, (String)var10_10, (String)var16_16);
                                                                var10_10 = var3_3.D;
                                                                var10_10.setContentDescription((CharSequence)var24_24);
                                                                var24_24 = ih3_1.b;
                                                                var16_16 = var2_2.getFnlColorVariantData();
                                                                if (var16_16 != null) {
                                                                    var16_16 = var16_16.getColorGroup();
                                                                } else {
                                                                    var25_25 = 0;
                                                                    var26_26 = 0.0f;
                                                                    var16_16 = null;
                                                                }
                                                                var4_4 = (int)CollectionsKt.F((Iterable)var24_24, var16_16);
                                                                var16_16 = "longText";
                                                                var18_18 = "SOCIAL_PROOFING";
                                                                var22_22 = "shortText";
                                                                var23_23 = var3_3.A;
                                                                if (var4_4 != 0) {
                                                                    if (var23_23 != null) {
                                                                        var23_23.setVisibility(var11_11);
                                                                    }
                                                                    var21_21.setVisibility(var11_11);
                                                                    var10_10.setVisibility(0);
                                                                    var24_24 = var3_3.E;
                                                                    if (var24_24 != null) {
                                                                        var24_24.setVisibility(var11_11);
                                                                    }
                                                                    var10_10.setVisibility(0);
                                                                    var21_21 = h40_0.a;
                                                                    var27_27 = h40_0.I1();
                                                                    if (var27_27 != 0) {
                                                                        var21_21 = var2_2.getTags();
                                                                        if (var21_21 != null && (var21_21 = var21_21.getCategoryTags()) != null) {
                                                                            var21_21 = ((Iterable)var21_21).iterator();
                                                                            var28_28 = 0;
                                                                            var23_23 = null;
                                                                            while (var29_29 = var21_21.hasNext()) {
                                                                                block199: {
                                                                                    var30_30 = (CategoryTags)var21_21.next();
                                                                                    if (var30_30 != null && (var31_31 = var30_30.getCategory()) != null && (var6_6 = (int)var31_31.equalsIgnoreCase((String)var18_18)) == var9_9) {
                                                                                        block198: {
                                                                                            block197: {
                                                                                                var31_31 = var30_30.getPrimary();
                                                                                                if (var31_31 != null) {
                                                                                                    var31_31 = var31_31.getValue();
                                                                                                } else {
                                                                                                    var6_6 = 0;
                                                                                                    var31_31 = null;
                                                                                                }
                                                                                                var31_31 = String.valueOf(var31_31);
                                                                                                try {
                                                                                                    var32_32 = cp_1.Companion;
                                                                                                }
                                                                                                catch (Exception v0) {}
                                                                                                var30_30 = var30_30.getPrimary();
                                                                                                if (var30_30 == null) break block197;
                                                                                                var30_30 = var30_30.getName();
                                                                                                break block198;
                                                                                            }
                                                                                            var29_29 = false;
                                                                                            var30_30 = null;
                                                                                        }
                                                                                        var32_32.getClass();
                                                                                        var29_29 = cp$a.x((String)var30_30);
                                                                                        if (var29_29) break block199;
                                                                                        var31_31 = JsonParser.parseString((String)var31_31);
                                                                                        var31_31 = var31_31.getAsJsonObject();
                                                                                        if (var31_31 == null) break block199;
                                                                                        var29_29 = var31_31.has((String)var22_22);
                                                                                        if (!var29_29 || var24_24 == null) break block199;
                                                                                        var9_9 = var24_24.getVisibility();
                                                                                        if (var9_9 != var11_11) break block199;
                                                                                        var33_33 = var31_31.get((String)var22_22);
                                                                                        var33_33 = var33_33.getAsString();
                                                                                        var24_24.setText((CharSequence)var33_33);
                                                                                        var31_31 = var31_31.get((String)var16_16);
                                                                                        var31_31 = var31_31.getAsString();
                                                                                        var24_24.setContentDescription((CharSequence)var31_31);
                                                                                        var24_24.setVisibility(0);
                                                                                        var10_10.setVisibility(var11_11);
                                                                                        var28_28 = 1;
                                                                                    } else if (var28_28 == 0) {
                                                                                        if (var24_24 != null) {
                                                                                            var24_24.setVisibility(var11_11);
                                                                                        }
                                                                                        var10_10.setVisibility(0);
                                                                                    }
                                                                                }
                                                                                var6_6 = 2;
                                                                                var9_9 = 1;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (var24_24 != null) {
                                                                            var24_24.setVisibility(var11_11);
                                                                        }
                                                                        var10_10.setVisibility(0);
                                                                    }
                                                                } else {
                                                                    var10_10.setVisibility(var11_11);
                                                                    var21_21.setVisibility(0);
                                                                    if (var23_23 != null) {
                                                                        var23_23.setVisibility(var11_11);
                                                                    }
                                                                    var21_21.setVisibility(0);
                                                                    var24_24 = h40_0.a;
                                                                    var4_4 = (int)h40_0.I1();
                                                                    if (var4_4 != 0) {
                                                                        var24_24 = var2_2.getTags();
                                                                        if (var24_24 != null && (var24_24 = var24_24.getCategoryTags()) != null) {
                                                                            var24_24 = ((Iterable)var24_24).iterator();
                                                                            var6_6 = 0;
                                                                            var31_31 = null;
                                                                            while ((var9_9 = (int)var24_24.hasNext()) != 0) {
                                                                                block202: {
                                                                                    var33_33 = (CategoryTags)var24_24.next();
                                                                                    if (var33_33 != null && (var10_10 = var33_33.getCategory()) != null && (var12_12 = var10_10.equalsIgnoreCase((String)var18_18)) == (var7_7 = 1)) {
                                                                                        block201: {
                                                                                            block200: {
                                                                                                var8_8 = var33_33.getPrimary();
                                                                                                if (var8_8 != null) {
                                                                                                    var8_8 = var8_8.getValue();
                                                                                                } else {
                                                                                                    var7_7 = 0;
                                                                                                    var8_8 = null;
                                                                                                }
                                                                                                var8_8 = String.valueOf(var8_8);
                                                                                                try {
                                                                                                    var10_10 = cp_1.Companion;
                                                                                                }
                                                                                                catch (Exception v1) {}
                                                                                                var33_33 = var33_33.getPrimary();
                                                                                                if (var33_33 == null) break block200;
                                                                                                var33_33 = var33_33.getName();
                                                                                                break block201;
                                                                                            }
                                                                                            var9_9 = 0;
                                                                                            var33_33 = null;
                                                                                        }
                                                                                        var10_10.getClass();
                                                                                        var9_9 = (int)cp$a.x((String)var33_33);
                                                                                        if (var9_9 != 0) break block202;
                                                                                        var8_8 = JsonParser.parseString((String)var8_8);
                                                                                        var8_8 = var8_8.getAsJsonObject();
                                                                                        if (var8_8 == null) break block202;
                                                                                        var9_9 = (int)var8_8.has((String)var22_22);
                                                                                        if (var9_9 == 0 || var23_23 == null) break block202;
                                                                                        var9_9 = var23_23.getVisibility();
                                                                                        if (var9_9 != var11_11) break block202;
                                                                                        var33_33 = var8_8.get((String)var22_22);
                                                                                        var33_33 = var33_33.getAsString();
                                                                                        var23_23.setText((CharSequence)var33_33);
                                                                                        var8_8 = var8_8.get((String)var16_16);
                                                                                        var8_8 = var8_8.getAsString();
                                                                                        var23_23.setContentDescription((CharSequence)var8_8);
                                                                                        var7_7 = 0;
                                                                                        var8_8 = null;
                                                                                        var23_23.setVisibility(0);
                                                                                        var21_21.setVisibility(var11_11);
                                                                                        var6_6 = 1;
                                                                                    } else if (var6_6 == 0) {
                                                                                        if (var23_23 != null) {
                                                                                            var23_23.setVisibility(var11_11);
                                                                                        }
                                                                                        var7_7 = 0;
                                                                                        var8_8 = null;
                                                                                        var21_21.setVisibility(0);
                                                                                    }
                                                                                }
                                                                                var7_7 = 0;
                                                                                var8_8 = null;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (var23_23 != null) {
                                                                            var23_23.setVisibility(var11_11);
                                                                        }
                                                                        var4_4 = 0;
                                                                        var24_24 = null;
                                                                        var21_21.setVisibility(0);
                                                                    }
                                                                }
                                                                var24_24 = var3_3.l;
                                                                var31_31 = var2_2.getName();
                                                                var24_24.setText((CharSequence)var31_31);
                                                                var24_24 = var2_2.getFnlColorVariantData();
                                                                if (var24_24 != null) {
                                                                    var24_24 = var24_24.getBrandName();
                                                                } else {
                                                                    var4_4 = 0;
                                                                    var24_24 = null;
                                                                }
                                                                var31_31 = var3_3.m;
                                                                var31_31.setText((CharSequence)var24_24);
                                                                var4_4 = (int)h40_0.Q1();
                                                                if (var4_4 != 0) {
                                                                    var24_24 = h40_0.a.g0();
                                                                    if (var24_24 != null) {
                                                                        var31_31 = var2_2.getFnlColorVariantData();
                                                                        if (var31_31 != null) {
                                                                            var31_31 = var31_31.getDeliverySlaTag();
                                                                        } else {
                                                                            var6_6 = 0;
                                                                            var31_31 = null;
                                                                        }
                                                                        var24_24 = (String)var24_24.get(var31_31);
                                                                    } else {
                                                                        var4_4 = 0;
                                                                        var24_24 = null;
                                                                    }
                                                                    var31_31 = var3_3.I;
                                                                    var8_8 = var3_3.J;
                                                                    if (var24_24 != null && (var9_9 = var24_24.length()) != 0) {
                                                                        var33_33 = od3_2.a();
                                                                        var10_10 = ld3_2.STORE_AJIOGRAM.getStoreId();
                                                                        var9_9 = (int)Intrinsics.areEqual(var33_33, var10_10);
                                                                        var10_10 = var3_3.L;
                                                                        if (var9_9 != 0) {
                                                                            if (var10_10 != null) {
                                                                                var33_33 = "ajiogram_plp_delivery.json";
                                                                                var10_10.setAnimation((String)var33_33);
                                                                            }
                                                                        } else if (var10_10 != null) {
                                                                            var33_33 = "ajio_plp_delivery.json";
                                                                            var10_10.setAnimation((String)var33_33);
                                                                        }
                                                                        if (var8_8 != null) {
                                                                            var9_9 = 0;
                                                                            var33_33 = null;
                                                                            var8_8.setVisibility(0);
                                                                        }
                                                                        if (var31_31 != null) {
                                                                            var31_31.setText((CharSequence)var24_24);
                                                                        }
                                                                    } else {
                                                                        if (var8_8 != null) {
                                                                            var8_8.setVisibility(var11_11);
                                                                        }
                                                                        if (var31_31 != null) {
                                                                            var31_31.setText((CharSequence)var17_17);
                                                                        }
                                                                    }
                                                                }
                                                                if ((var24_24 = var3_3.T) != null) {
                                                                    var24_24 = var24_24.getPrice();
                                                                } else {
                                                                    var4_4 = 0;
                                                                    var24_24 = null;
                                                                }
                                                                var31_31 = var3_3.r;
                                                                var8_8 = "format(...)";
                                                                var33_33 = "getString(...)";
                                                                var10_10 = var3_3.p;
                                                                if (var24_24 == null) break block206;
                                                                var4_4 = 0;
                                                                var10_10.setVisibility(0);
                                                                var24_24 = var3_3.T;
                                                                if (var24_24 != null) {
                                                                    var24_24 = var24_24.getPrice();
                                                                } else {
                                                                    var4_4 = 0;
                                                                    var24_24 = null;
                                                                }
                                                                var24_24 = qz2_0.r((Price)var24_24);
                                                                var10_10.setText((CharSequence)var24_24);
                                                                var24_24 = StringCompanionObject.INSTANCE;
                                                                var24_24 = var10_10.getContext().getResources();
                                                                var25_25 = R$string.acc_plp_final_price;
                                                                var24_24 = var24_24.getString(var25_25);
                                                                Intrinsics.checkNotNullExpressionValue(var24_24, (String)var33_33);
                                                                var16_16 = var3_3.T;
                                                                if (var16_16 != null) {
                                                                    var16_16 = var16_16.getPrice();
                                                                } else {
                                                                    var25_25 = 0;
                                                                    var26_26 = 0.0f;
                                                                    var16_16 = null;
                                                                }
                                                                var16_16 = qz2_0.r((Price)var16_16);
                                                                var19_19 = 1;
                                                                var20_20 = 1.4E-45f;
                                                                var21_21 = new Object[var19_19];
                                                                var34_34 = 0;
                                                                var22_22 = null;
                                                                var21_21[0] = var16_16;
                                                                He1.a((Object[])var21_21, var19_19, (String)var24_24, (String)var8_8, (TextView)var10_10);
                                                                var24_24 = var3_3.T;
                                                                if (var24_24 != null) {
                                                                    var24_24 = var24_24.getWasPriceData();
                                                                } else {
                                                                    var4_4 = 0;
                                                                    var24_24 = null;
                                                                }
                                                                var10_10 = var3_3.q;
                                                                if (var24_24 == null) ** GOTO lbl-1000
                                                                var16_16 = var24_24.getValue();
                                                                var19_19 = 0;
                                                                var20_20 = 0.0f;
                                                                var18_18 = null;
                                                                if (var16_16 != null) {
                                                                    var26_26 = Float.parseFloat((String)var16_16);
                                                                } else {
                                                                    var25_25 = 0;
                                                                    var26_26 = 0.0f;
                                                                    var16_16 = null;
                                                                }
                                                                var21_21 = var3_3.T;
                                                                if (var21_21 != null && (var21_21 = var21_21.getPrice()) != null && (var21_21 = var21_21.getValue()) != null) {
                                                                    var20_20 = Float.parseFloat((String)var21_21);
                                                                }
                                                                if ((var25_25 = Float.compare(var26_26, var20_20)) > 0) {
                                                                    var16_16 = qz2_0.s(mz3_0.h(var24_24.getValue()));
                                                                    var18_18 = new SpannableString((CharSequence)var16_16);
                                                                    var21_21 = new StrikethroughSpan();
                                                                    var34_34 = var16_16.length();
                                                                    var28_28 = 33;
                                                                    var11_11 = 0;
                                                                    var35_35 = null;
                                                                    var18_18.setSpan(var21_21, 0, var34_34, var28_28);
                                                                    var21_21 = var3_3.T;
                                                                    if (var21_21 != null) {
                                                                        var21_21 = var21_21.getPrice();
                                                                    } else {
                                                                        var27_27 = 0;
                                                                        var21_21 = null;
                                                                    }
                                                                    var24_24 = qz2_0.g((Price)var21_21, (Price)var24_24);
                                                                    var10_10.setVisibility(0);
                                                                    var31_31.setVisibility(0);
                                                                    var10_10.setText((CharSequence)var18_18);
                                                                    var18_18 = var10_10.getContext().getResources();
                                                                    var27_27 = R$string.acc_plp_original_price;
                                                                    var18_18 = var18_18.getString(var27_27);
                                                                    Intrinsics.checkNotNullExpressionValue(var18_18, (String)var33_33);
                                                                    var27_27 = 1;
                                                                    var22_22 = new Object[var27_27];
                                                                    var22_22[0] = var16_16;
                                                                    He1.a(var22_22, var27_27, (String)var18_18, (String)var8_8, (TextView)var10_10);
                                                                    var10_10 = var3_3.T;
                                                                    if (var10_10 != null) {
                                                                        var10_10 = var10_10.getDiscountPercent();
                                                                    } else {
                                                                        var12_12 = 0;
                                                                        var10_10 = null;
                                                                    }
                                                                    var12_12 = (int)TextUtils.isEmpty((CharSequence)var10_10);
                                                                    if (var12_12 == 0) {
                                                                        var10_10 = var31_31.getContext().getResources();
                                                                        var11_11 = R$string.acc_plp_discount_price;
                                                                        var10_10 = var10_10.getString(var11_11);
                                                                        Intrinsics.checkNotNullExpressionValue(var10_10, (String)var33_33);
                                                                        var11_11 = 1;
                                                                        var16_16 = new Object[var11_11];
                                                                        var19_19 = 0;
                                                                        var20_20 = 0.0f;
                                                                        var18_18 = null;
                                                                        var16_16[0] = var24_24;
                                                                        He1.a((Object[])var16_16, var11_11, (String)var10_10, (String)var8_8, (TextView)var31_31);
                                                                        var24_24 = var3_3.T;
                                                                        if (var24_24 != null) {
                                                                            var24_24 = var24_24.getDiscountPercent();
                                                                        } else {
                                                                            var4_4 = 0;
                                                                            var24_24 = null;
                                                                        }
                                                                        var31_31.setText((CharSequence)var24_24);
                                                                    } else {
                                                                        var12_12 = (int)TextUtils.isEmpty((CharSequence)var24_24);
                                                                        if (var12_12 == 0) {
                                                                            var10_10 = var31_31.getContext().getResources();
                                                                            var11_11 = R$string.acc_plp_discount_price;
                                                                            var10_10 = var10_10.getString(var11_11);
                                                                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var33_33);
                                                                            var11_11 = 1;
                                                                            var16_16 = new Object[var11_11];
                                                                            var19_19 = 0;
                                                                            var20_20 = 0.0f;
                                                                            var18_18 = null;
                                                                            var16_16[0] = var24_24;
                                                                            var16_16 = Arrays.copyOf(var16_16, var11_11);
                                                                            var10_10 = String.format((String)var10_10, (Object[])var16_16);
                                                                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var8_8);
                                                                            var31_31.setContentDescription((CharSequence)var10_10);
                                                                            var10_10 = new StringBuilder();
                                                                            var10_10.append((String)var24_24);
                                                                            var10_10.append("% OFF");
                                                                            var24_24 = var10_10.toString();
                                                                            var31_31.setText((CharSequence)var24_24);
                                                                        } else {
                                                                            var4_4 = 8;
                                                                            var31_31.setVisibility(var4_4);
                                                                        }
                                                                    }
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var4_4 = 8;
                                                                    var10_10.setVisibility(var4_4);
                                                                    var31_31.setVisibility(var4_4);
                                                                }
                                                                break block207;
                                                            }
                                                            var4_4 = 8;
                                                            var10_10.setVisibility(var4_4);
                                                        }
                                                        var4_4 = (int)var2_2.isDODEnabled();
                                                        if (var4_4 != 0) {
                                                            var3_3.X = var36_36 = var2_2.getDodEndTime();
                                                            var3_3.Y = true;
                                                            var24_24 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
                                                            var36_36 = var24_24.getTimeInMillis();
                                                            cfr_temp_0 = var36_36 - (var38_37 = var3_3.X);
                                                            var4_4 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                            if (var4_4 < 0) {
                                                                var24_24 = qz2_0.r(var2_2.getDodPriceData());
                                                                var10_10 = StringCompanionObject.INSTANCE;
                                                                AJIOApplication.Companion.getClass();
                                                                var10_10 = AJIOApplication$a.a();
                                                                var11_11 = R$string.deal_price_plp;
                                                                var10_10 = var10_10.getString(var11_11);
                                                                Intrinsics.checkNotNullExpressionValue(var10_10, (String)var33_33);
                                                                var11_11 = 1;
                                                                var16_16 = new Object[var11_11];
                                                                var19_19 = 0;
                                                                var20_20 = 0.0f;
                                                                var18_18 = null;
                                                                var16_16[0] = var24_24;
                                                                var24_24 = xh2_0.a((Object[])var16_16, var11_11, (String)var10_10, (String)var8_8);
                                                                var10_10 = var3_3.s;
                                                                var10_10.setText((CharSequence)var24_24);
                                                                var10_10.setVisibility(0);
                                                                var24_24 = var10_10.getContext().getResources();
                                                                var25_25 = R$string.acc_plp_offer_price;
                                                                var24_24 = var24_24.getString(var25_25);
                                                                Intrinsics.checkNotNullExpressionValue(var24_24, (String)var33_33);
                                                                var33_33 = var2_2.getDodPriceData();
                                                                var16_16 = new Object[var11_11];
                                                                var16_16[0] = var33_33;
                                                                He1.a((Object[])var16_16, var11_11, (String)var24_24, var8_8, (TextView)var10_10);
                                                                var4_4 = hv3_0.m(R$color.accent_color_10);
                                                                var31_31.setTextColor(var4_4);
                                                            } else {
                                                                var19_19 = 0;
                                                                var20_20 = 0.0f;
                                                                var18_18 = null;
                                                                var3_3.Y = false;
                                                                var0.A();
                                                            }
                                                        } else {
                                                            var19_19 = 0;
                                                            var20_20 = 0.0f;
                                                            var18_18 = null;
                                                            var3_3.Y = false;
                                                            var0.A();
                                                        }
                                                        var24_24 = h40_0.a;
                                                        var4_4 = (int)h40_0.W0();
                                                        if (var4_4 == 0) ** GOTO lbl-1000
                                                        var24_24 = hv3_0.a;
                                                        var31_31 = var3_3.T;
                                                        var24_24.getClass();
                                                        var4_4 = (int)hv3_0.V((Product)var31_31);
                                                        if (var4_4 != 0) {
                                                            var24_24 = var3_3.T;
                                                            if (var24_24 != null) {
                                                                var31_31 = var24_24.getFnlColorVariantData();
                                                            } else {
                                                                var6_6 = 0;
                                                                var31_31 = null;
                                                            }
                                                            var24_24 = hv3_0.z((Product)var24_24, (ProductFnlColorVariantData)var31_31);
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var24_24 = hv3_0.a;
                                                            var31_31 = var3_3.T;
                                                            if (var31_31 != null) {
                                                                var31_31 = var31_31.getFnlColorVariantData();
                                                            } else {
                                                                var6_6 = 0;
                                                                var31_31 = null;
                                                            }
                                                            var24_24.getClass();
                                                            var24_24 = hv3_0.A((ProductFnlColorVariantData)var31_31);
                                                        }
                                                        var31_31 = var3_3.n;
                                                        if (var24_24 == null && (var7_7 = (var8_8 = (Boolean)var0.y().a).booleanValue()) == 0) {
                                                            var7_7 = 8;
                                                            var31_31.setVisibility(var7_7);
                                                        } else {
                                                            var7_7 = h40_0.W0();
                                                            if (var7_7 == 0) {
                                                                var24_24 = var0.x();
                                                            }
                                                            var31_31.setContentDescription((CharSequence)var24_24);
                                                            var24_24 = var0.x();
                                                            var31_31.setText((CharSequence)var24_24);
                                                            var4_4 = 0;
                                                            var24_24 = null;
                                                            var31_31.setVisibility(0);
                                                        }
                                                        var24_24 = var3_3.C;
                                                        if (var24_24 != null) {
                                                            var7_7 = 8;
                                                            var24_24.setVisibility(var7_7);
                                                        }
                                                        if ((var7_7 = (int)h40_0.H1()) == 0) break block208;
                                                        var8_8 = var2_2.getTags();
                                                        if (var8_8 == null || (var8_8 = var8_8.getCategoryTags()) == null) break block209;
                                                        var8_8 = ((Iterable)var8_8).iterator();
                                                        var9_9 = 0;
                                                        var33_33 = null;
                                                        while ((var12_12 = (int)var8_8.hasNext()) != 0) {
                                                            var10_10 = (CategoryTags)var8_8.next();
                                                            if (var10_10 == null || (var35_35 = var10_10.getCategory()) == null) ** GOTO lbl-1000
                                                            var16_16 = "URGENCY";
                                                            var11_11 = (int)var35_35.equalsIgnoreCase((String)var16_16);
                                                            var25_25 = 1;
                                                            var26_26 = 1.4E-45f;
                                                            if (var11_11 == var25_25) {
                                                                if (var24_24 != null) {
                                                                    var9_9 = 0;
                                                                    var33_33 = null;
                                                                    var24_24.setVisibility(0);
                                                                }
                                                                if (var24_24 != null) {
                                                                    var33_33 = var10_10.getPrimary();
                                                                    if (var33_33 != null) {
                                                                        var33_33 = var33_33.getValue();
                                                                    } else {
                                                                        var9_9 = 0;
                                                                        var33_33 = null;
                                                                    }
                                                                    var33_33 = String.valueOf(var33_33);
                                                                    var24_24.setText((CharSequence)var33_33);
                                                                }
                                                                var9_9 = 1;
                                                            } else if (var9_9 == 0 && var24_24 != null) {
                                                                var12_12 = 8;
                                                                var24_24.setVisibility(var12_12);
                                                                continue;
                                                            }
                                                            var12_12 = 8;
                                                        }
                                                        break block210;
                                                    }
                                                    var12_12 = 8;
                                                    break block210;
                                                }
                                                var12_12 = 8;
                                                if (var24_24 != null) {
                                                    var24_24.setVisibility(var12_12);
                                                }
                                            }
                                            if ((var24_24 = var3_3.t) != null) {
                                                var7_7 = R$string.product_image;
                                                var8_8 = hv3_0.K(var7_7);
                                                var33_33 = var2_2.getFnlColorVariantData();
                                                if (var33_33 != null) {
                                                    var33_33 = var33_33.getBrandName();
                                                } else {
                                                    var9_9 = 0;
                                                    var33_33 = null;
                                                }
                                                var10_10 = var2_2.getName();
                                                if (var10_10 == null) {
                                                    var10_10 = var17_17;
                                                }
                                                var35_35 = " of ";
                                                var8_8 = KW.a((String)var8_8, (String)var35_35, (String)var33_33, (String)var13_13, (String)var10_10);
                                                var24_24.setContentDescription(var8_8);
                                            }
                                            var8_8 = Yj2.GRID;
                                            var33_33 = var3_3.g;
                                            var10_10 = "mobileProductListingImage";
                                            if (var33_33 != var8_8) break block211;
                                            var8_8 = var2_2.getImages();
                                            if (var8_8 != null) {
                                                var7_7 = var8_8.size();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var7_7 <= 0) ** GOTO lbl-1000
                                            var8_8 = var2_2.getImages();
                                            Intrinsics.checkNotNull(var8_8);
                                            var8_8 = var8_8.iterator();
                                            while ((var9_9 = (int)var8_8.hasNext()) != 0) {
                                                var33_33 = (ProductImage)var8_8.next();
                                                var35_35 = var33_33.getFormat();
                                                var11_11 = (int)var10_10.equalsIgnoreCase((String)var35_35);
                                                if (var11_11 == 0) continue;
                                                var8_8 = var33_33.getUrl();
                                                break block203;
                                            }
                                            var7_7 = 0;
                                            var8_8 = null;
                                        }
                                        if (var8_8 != null) break block212;
                                        var8_8 = var2_2.getImages();
                                        if (var8_8 == null) ** GOTO lbl-1000
                                        var9_9 = 0;
                                        var33_33 = null;
                                        if ((var8_8 = (ProductImage)var8_8.get(0)) != null) {
                                            var8_8 = var8_8.getUrl();
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            var7_7 = 0;
                                            var8_8 = null;
                                        }
                                    }
                                    var33_33 = UrlHelper.Companion.getInstance();
                                    var3_3.U = var8_8 = var33_33.getImageUrl((String)var8_8);
                                    if (var24_24 != null) {
                                        var8_8 = Ft2.a((String)var8_8, "?quality=medium");
                                        var33_33 = new da$a();
                                        var33_33.k = var12_12 = 1;
                                        var33_33.a = var11_11 = R$drawable.component_placeholder;
                                        var33_33.b = var11_11;
                                        var33_33.r = var12_12;
                                        var11_11 = R$string.acc_banner;
                                        var35_35 = hv3_0.K(var11_11);
                                        var33_33.b((String)var35_35);
                                        var33_33.n = var8_8;
                                        var33_33.u = var24_24;
                                        var33_33.i = var12_12;
                                        var33_33.a();
                                    } else {
                                        var12_12 = 1;
                                    }
                                    if (var24_24 != null) {
                                        var24_24.setClickable((boolean)var12_12);
                                    }
                                    if (var24_24 != null) {
                                        var24_24.setOnClickListener((View.OnClickListener)var3_3);
                                    }
                                    if (var24_24 != null) {
                                        var24_24.setLongClickable((boolean)var12_12);
                                    }
                                    if (var24_24 != null) {
                                        var8_8 = var3_3.p0;
                                        var24_24.setOnLongClickListener(var8_8);
                                    }
                                    break block213;
                                }
                                var24_24 = var3_3.H;
                                if (var24_24 == null) break block213;
                                var7_7 = var24_24.getItemDecorationCount();
                                if (var7_7 < (var9_9 = 1)) {
                                    var9_9 = hv3_0.q(R$dimen.margin_8);
                                    var8_8 = new t91(var9_9);
                                    var24_24.addItemDecoration((RecyclerView$n)var8_8);
                                }
                                if ((var8_8 = var2_2.getImages()) != null) {
                                    var7_7 = var8_8.size();
                                } else {
                                    var7_7 = 0;
                                    var8_8 = null;
                                }
                                if (var7_7 <= 0) ** GOTO lbl-1000
                                var8_8 = var2_2.getImages();
                                Intrinsics.checkNotNull(var8_8);
                                var8_8 = var8_8.iterator();
                                while ((var9_9 = (int)var8_8.hasNext()) != 0) {
                                    var33_33 = (ProductImage)var8_8.next();
                                    var35_35 = var33_33.getFormat();
                                    var11_11 = (int)var10_10.equalsIgnoreCase((String)var35_35);
                                    if (var11_11 == 0) continue;
                                    var8_8 = var33_33.getUrl();
                                    break block204;
                                }
                                var7_7 = 0;
                                var8_8 = null;
                            }
                            if (var8_8 != null) break block214;
                            var8_8 = var2_2.getImages();
                            if (var8_8 == null) ** GOTO lbl-1000
                            var9_9 = 0;
                            var33_33 = null;
                            if ((var8_8 = (ProductImage)var8_8.get(0)) != null) {
                                var8_8 = var8_8.getUrl();
                            } else lbl-1000:
                            // 3 sources

                            {
                                var7_7 = 0;
                                var8_8 = null;
                            }
                        }
                        var33_33 = UrlHelper.Companion.getInstance();
                        var3_3.U = var8_8 = var33_33.getImageUrl((String)var8_8);
                        var3_3.Z = var8_8 = new ArrayList();
                        var8_8 = var2_2.getExtraImages();
                        if (var8_8 != null) {
                            var8_8 = ((Iterable)var8_8).iterator();
                            while ((var9_9 = (int)var8_8.hasNext()) != 0) {
                                var33_33 = (ExtraImage)var8_8.next();
                                var10_10 = var33_33.getImages();
                                if (var10_10 != null) {
                                    var12_12 = var10_10.size();
                                } else {
                                    var12_12 = 0;
                                    var10_10 = null;
                                }
                                if (var12_12 <= 0) continue;
                                var33_33 = var33_33.getImages();
                                Intrinsics.checkNotNull(var33_33);
                                var33_33 = var33_33.iterator();
                                while ((var12_12 = (int)var33_33.hasNext()) != 0) {
                                    var10_10 = (ProductImage)var33_33.next();
                                    var35_35 = var3_3.Z;
                                    var13_13 = UrlHelper.Companion.getInstance();
                                    var10_10 = var10_10.getUrl();
                                    var10_10 = var13_13.getImageUrl((String)var10_10);
                                    var35_35.add(var10_10);
                                }
                            }
                        }
                        var33_33 = var3_3.Z;
                        var8_8 = new mq1_0((List)var33_33, var3_3);
                        var10_10 = var24_24.getContext();
                        var11_11 = 0;
                        var35_35 = null;
                        var33_33 = new LinearLayoutManager((Context)var10_10, 0, false);
                        var24_24.setLayoutManager((RecyclerView$o)var33_33);
                        var24_24.setAdapter((RecyclerView$f)var8_8);
                    }
                    var4_4 = (int)var3_3.h;
                    var8_8 = var3_3.u;
                    if (var4_4 == 0) break block215;
                    var24_24 = z40_0.Companion;
                    var24_24 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var24_24).a;
                    var33_33 = "plp_sizes_enable";
                    var4_4 = (int)var24_24.a((String)var33_33);
                    if (var4_4 == 0 || (var24_24 = var2_2.getProductSizeData()) == null) ** GOTO lbl883
                    var24_24 = var2_2.getProductSizeData();
                    Intrinsics.checkNotNull(var24_24);
                    var24_24 = var24_24.getSizeVariants();
                    if (var24_24 == null) ** GOTO lbl883
                    var24_24 = var2_2.getProductSizeData();
                    Intrinsics.checkNotNull(var24_24);
                    var24_24 = var24_24.getSizeVariants();
                    Intrinsics.checkNotNull(var24_24);
                    var4_4 = var24_24.size();
                    if (var4_4 <= 0) ** GOTO lbl883
                    var4_4 = 0;
                    var8_8.setVisibility(0);
                    var24_24 = var2_2.getProductSizeData();
                    Intrinsics.checkNotNull(var24_24);
                    var8_8 = var3_3.w;
                    var9_9 = 8;
                    var8_8.setVisibility(var9_9);
                    var10_10 = var3_3.x;
                    var10_10.setVisibility(var9_9);
                    var35_35 = var3_3.y;
                    var35_35.setVisibility(var9_9);
                    var13_13 = var3_3.z;
                    var13_13.setVisibility(var9_9);
                    var8_8.setContentDescription((CharSequence)var17_17);
                    var10_10.setContentDescription((CharSequence)var17_17);
                    var35_35.setContentDescription((CharSequence)var17_17);
                    var13_13.setContentDescription((CharSequence)var17_17);
                    var24_24 = var24_24.getSizeVariants();
                    if (var24_24 != null && (var9_9 = var24_24.size()) > 0) {
                        var9_9 = 0;
                        var33_33 = null;
                        var16_16 = (String)CollectionsKt.N(0, (List)var24_24);
                        if (var16_16 != null) {
                            var25_25 = var40_38 = var16_16.length();
                        } else {
                            var25_25 = 0;
                            var26_26 = 0.0f;
                            var16_16 = null;
                        }
                        var17_17 = (String)CollectionsKt.N(0, (List)var24_24);
                        var8_8.setText((CharSequence)var17_17);
                        var8_8.setVisibility(0);
                        var7_7 = var24_24.size();
                        var9_9 = 1;
                        if (var7_7 > var9_9 && var25_25 <= (var7_7 = 6)) {
                            var8_8 = (String)var24_24.get(var9_9);
                            if (var8_8 != null) {
                                var7_7 = var8_8.length();
                                var8_8 = var7_7;
                            } else {
                                var7_7 = 0;
                                var8_8 = null;
                            }
                            Intrinsics.checkNotNull(var8_8);
                            var25_25 = var8_8.intValue();
                            var8_8 = (String)var24_24.get(var9_9);
                            var10_10.setText((CharSequence)var8_8);
                            var8_8 = null;
                            var10_10.setVisibility(0);
                            var7_7 = 2;
                        } else {
                            var7_7 = 1;
                        }
                        var9_9 = var24_24.size();
                        var12_12 = 2;
                        if (var9_9 > var12_12 && var25_25 < (var9_9 = 4)) {
                            var33_33 = (String)var24_24.get(var12_12);
                            if (var33_33 != null) {
                                var9_9 = var33_33.length();
                                var33_33 = var9_9;
                            } else {
                                var9_9 = 0;
                                var33_33 = null;
                            }
                            Intrinsics.checkNotNull(var33_33);
                            var25_25 = var33_33.intValue();
                            var33_33 = (String)var24_24.get(var12_12);
                            var35_35.setText((CharSequence)var33_33);
                            var33_33 = null;
                            var35_35.setVisibility(0);
                            var9_9 = 1;
                            var7_7 += var9_9;
                        }
                        if ((var9_9 = var24_24.size()) > (var12_12 = 3) && var25_25 < var12_12) {
                            var33_33 = (String)var24_24.get(var12_12);
                            var13_13.setText((CharSequence)var33_33);
                            var33_33 = null;
                            var13_13.setVisibility(0);
                            var9_9 = 1;
                            var7_7 += var9_9;
                        }
                        var4_4 = var24_24.size() - var7_7;
                        var8_8 = var3_3.v;
                        if (var4_4 > 0) {
                            var10_10 = "+";
                            var33_33 = new StringBuilder((String)var10_10);
                            var33_33.append(var4_4);
                            var24_24 = var33_33.toString();
                            var8_8.setText((CharSequence)var24_24);
                            var4_4 = 0;
                            var24_24 = null;
                            var8_8.setVisibility(0);
lbl872:
                            // 2 sources

                            while (true) {
                                var9_9 = 8;
                                ** GOTO lbl893
                                break;
                            }
                        } else {
                            var4_4 = 0;
                            var24_24 = null;
                            var9_9 = 8;
                            var8_8.setVisibility(var9_9);
                        }
                    } else {
                        var4_4 = 0;
                        var24_24 = null;
                        ** continue;
lbl883:
                        // 3 sources

                        var4_4 = 0;
                        var24_24 = null;
                        var9_9 = 8;
                        var8_8.setVisibility(var9_9);
                    }
                    break block216;
                }
                var4_4 = 0;
                var24_24 = null;
                var9_9 = 8;
                var8_8.setVisibility(var9_9);
            }
            var7_7 = (int)var3_3.Y;
            if (var7_7 == 0 && (var7_7 = (int)var3_3.c) != 0) {
                var8_8 = tr2_2.a;
                var8_8 = var2_2.getPrice();
                if (var8_8 != null) {
                    var32_32 = var8_8 = var8_8.getValue();
                } else {
                    var40_38 = 0;
                    var32_32 = null;
                }
                var8_8 = var2_2.getOfferPrice();
                var41_39 = var8_8 != null && (var8_8 = var8_8.getPriceReveal()) != null ? (var8_8 = var8_8.getBestPrice()) : null;
                var8_8 = var2_2.getOfferPrice();
                var42_40 = var8_8 != null && (var8_8 = var8_8.getPriceReveal()) != null ? (var8_8 = var8_8.getDiscountPercent()) : null;
                var8_8 = var2_2.getOfferPrice();
                var43_41 = var8_8 != null ? (var10_10 = var8_8.getValue()) : null;
                var44_42 = ScreenType.SCREEN_PLP;
                var45_43 = yt2_2.PDP;
                var8_8 = var3_3.K;
                var46_44 = 96;
                tr2_2.A((View)var8_8, (String)var32_32, (Float)var41_39, (String)var42_40, (String)var43_41, false, false, var44_42, var45_43, var46_44);
            } else {
                var8_8 = var3_3.K;
                if (var8_8 != null) {
                    var9_9 = 8;
                    var8_8.setVisibility(var9_9);
                }
            }
            var7_7 = (int)var3_3.S;
            var33_33 = var3_3.o;
            if (var7_7 != 0 && (var8_8 = var2_2.getAdsData()) != null) {
                ai0_2.B((View)var33_33);
                ai0_2.i((View)var31_31);
            } else {
                ai0_2.i((View)var33_33);
            }
            var31_31 = var3_3.f;
            if (var31_31 != null) ** GOTO lbl940
            var24_24 = var3_3.d;
            var31_31 = "Similar Products";
            var4_4 = (int)Intrinsics.areEqual(var24_24, var31_31);
            if (var4_4 != 0) {
                var24_24 = h40_0.a;
                var4_4 = (int)h40_0.b2();
lbl934:
                // 2 sources

                while (true) {
                    var7_7 = var4_4;
                    break;
                }
            } else {
                var24_24 = h40_0.a;
                var4_4 = (int)h40_0.T1();
                ** continue;
lbl940:
                // 1 sources

                var33_33 = var3_3.e;
                var8_8 = Boolean.TRUE;
                var9_9 = (int)Intrinsics.areEqual(var33_33, var8_8);
                if (var9_9 != 0) {
                    var7_7 = (int)Intrinsics.areEqual(var31_31, var8_8);
                } else {
                    var7_7 = 0;
                    var8_8 = null;
                }
            }
            var31_31 = var3_3.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(var31_31, "getContext(...)");
            var33_33 = var3_3.itemView;
            var24_24 = new oa_0((Context)var31_31, (View)var33_33);
            var31_31 = var2_2.getAverageRating();
            var33_33 = var2_2.getRatingCount();
            var33_33 = var33_33 == null ? var2_2.getNumUserRatings() : var2_2.getRatingCount();
            var8_8 = (boolean)var7_7;
            var24_24.m = var31_31;
            var24_24.n = var33_33;
            var6_6 = 1;
            var24_24.d((Boolean)var8_8, var6_6);
            var24_24 = h40_0.a;
            var4_4 = h40_0.W0();
            if (var4_4 != 0 && (var4_4 = var2_2.isComingSoonProduct()) != 0) {
                if (var14_14 /* !! */  != null) {
                    ai0_2.i((View)var14_14 /* !! */ );
                }
                if ((var3_3 = var3_3.G) != null) {
                    ai0_2.i((View)var3_3);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void A() {
        int n3 = 0;
        Context context = null;
        int n4 = 1;
        int n7 = this.c;
        TextView textView = this.r;
        String string2 = "getContext(...)";
        TextView textView2 = this.s;
        if (n7 == 0) {
            float f5;
            Object object = this.T;
            int n8 = 0;
            String string3 = null;
            if (object != null) {
                object = ((Product)object).getOfferPrice();
            } else {
                n7 = 0;
                object = null;
                f5 = 0.0f;
            }
            if (object != null && (n7 = this.j) != 0) {
                boolean bl2;
                object = this.T;
                if (object != null && (object = ((Product)object).getOfferPrice()) != null) {
                    object = ((Price)object).getFormattedValue();
                } else {
                    n7 = 0;
                    object = null;
                    f5 = 0.0f;
                }
                object = qz2_0.n((String)object);
                Object object2 = this.T;
                if (object2 != null && (object2 = ((Product)object2).getPrice()) != null) {
                    object2 = ((Price)object2).getFormattedValue();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                object2 = qz2_0.n((String)object2);
                n7 = Intrinsics.areEqual(object, object2);
                if (n7 == 0) {
                    Object object3;
                    object = this.T;
                    if (object != null && (object = ((Product)object).getOfferPrice()) != null) {
                        object = ((Price)object).getFormattedValue();
                    } else {
                        n7 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    object = qz2_0.n((String)object);
                    object2 = (Boolean)this.w().a;
                    bl2 = (Boolean)object2;
                    String string4 = "format(...)";
                    Object[] objectArray = "getString(...)";
                    if (bl2) {
                        object2 = (String)this.w().b;
                        if (object2 != null) {
                            object3 = cP.a((String)object2, " :", (String)object);
                        } else {
                            object2 = StringCompanionObject.INSTANCE;
                            AJIOApplication.Companion.getClass();
                            object2 = AJIOApplication$a.a();
                            int n10 = R$string.plp_offer_price;
                            object2 = object2.getString(n10);
                            Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray);
                            objectArray = new Object[n4];
                            objectArray[0] = object;
                            object3 = xh2_0.a(objectArray, n4, (String)object2, string4);
                        }
                    } else {
                        object2 = StringCompanionObject.INSTANCE;
                        AJIOApplication.Companion.getClass();
                        object2 = AJIOApplication$a.a();
                        int n14 = R$string.plp_offer_price;
                        object2 = object2.getString(n14);
                        Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray);
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        object3 = xh2_0.a(objectArray, n4, (String)object2, string4);
                    }
                    object = cp_1.Companion;
                    object.getClass();
                    n7 = cp$a.o();
                    if (n7 != 0) {
                        object3 = (Boolean)this.w().a;
                        n4 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                        if (n4 != 0) {
                            object3 = (String)this.w().b;
                            if (object3 == null) {
                                n4 = R$string.offer_price_message;
                                object3 = hv3_0.K(n4);
                            }
                        } else {
                            n4 = R$string.offer_price_message;
                            object3 = hv3_0.K(n4);
                        }
                        if ((object = this.T) != null && (object = ((Product)object).getOfferPrice()) != null) {
                            string3 = ((Price)object).getFormattedValue();
                        }
                        f5 = Float.parseFloat(mz3_0.h(string3));
                        object = qz2_0.x(Float.valueOf(f5));
                        string3 = " ";
                        object3 = n1.a((String)object3, string3, (String)object);
                        object = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        n8 = R$attr.plp_offer_drawable;
                        n7 = tm3_0.b(n8, (Context)object);
                        textView2.setCompoundDrawablesWithIntrinsicBounds(n7, 0, 0, 0);
                        n7 = hv3_0.q(R$dimen.dimen_4);
                        textView2.setCompoundDrawablePadding(n7);
                    }
                    textView2.setText((CharSequence)object3);
                    textView2.setVisibility(0);
                    context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, string2);
                    n7 = R$attr.plp_discount_percentage;
                    n3 = tm3_0.a(n7, context);
                    textView.setTextColor(n3);
                    textView2.setContentDescription((CharSequence)object3);
                    return;
                }
            }
        }
        textView2.setVisibility(8);
        context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, string2);
        n4 = R$attr.plp_discount_percentage;
        n3 = tm3_0.a(n4, context);
        textView.setTextColor(n3);
    }

    public final void C() {
        String string2;
        String string3;
        boolean bl2;
        yi2_1 yi2_12;
        boolean bl3;
        int n3 = 8;
        LinearLayout linearLayout = this.P;
        if (linearLayout != null) {
            linearLayout.setVisibility(n3);
        }
        if ((linearLayout = this.O) != null) {
            bl3 = false;
            yi2_12 = null;
            linearLayout.setVisibility(0);
        }
        if ((bl2 = Intrinsics.areEqual(string3 = (yi2_12 = this.i).o5(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId())) && !(bl3 = yi2_12.w0()) && linearLayout != null) {
            linearLayout.setVisibility(n3);
        }
    }

    public final void g() {
        this.z();
    }

    public final void n(int n3) {
        Serializable serializable;
        int n4;
        Cw2 cw2 = this.b;
        if (cw2 != null && (n4 = (serializable = this.Z).size()) > 0 && (serializable = this.T) != null) {
            Object object = this.Z.get(n3);
            String string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (String)object;
            int n7 = this.getAdapterPosition();
            lv2 lv22 = new lv2((Product)serializable, n7, (String)object);
            cw2.L(lv22);
        }
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.plp_row_add_to_closet_iv;
        String string2 = null;
        M82 m82 = this.a;
        if (n3 == n4) {
            object = this.T;
            if (object != null) {
                n3 = this.getLayoutPosition();
                ((Product)object).setViewHolderPos(n3);
            }
            if (m82 != null) {
                object = this.T;
                if (object != null && (object2 = ((Product)object).getFnlColorVariantData()) != null) {
                    string2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                }
                m82.R4((Product)object, string2);
            }
        } else {
            n4 = R$id.plp_row_add_to_closet_wishcount_iv;
            if (n3 == n4) {
                object = this.T;
                if (object != null) {
                    n3 = this.getLayoutPosition();
                    ((Product)object).setViewHolderPos(n3);
                }
                if (m82 != null) {
                    object = this.T;
                    if (object != null && (object2 = ((Product)object).getFnlColorVariantData()) != null) {
                        string2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                    }
                    m82.R4((Product)object, string2);
                }
            } else {
                n4 = R$id.plp_row_closet_iv_added;
                if (n3 == n4) {
                    object = this.T;
                    if (object != null) {
                        n3 = this.getLayoutPosition();
                        ((Product)object).setViewHolderPos(n3);
                    }
                    if (m82 != null) {
                        object = this.T;
                        if (object != null && (object2 = ((Product)object).getFnlColorVariantData()) != null) {
                            string2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                        }
                        m82.C((Product)object, string2);
                    }
                } else {
                    n4 = R$id.plp_row_closet_iv_added_wishcount;
                    if (n3 == n4) {
                        object = this.T;
                        if (object != null) {
                            n3 = this.getLayoutPosition();
                            ((Product)object).setViewHolderPos(n3);
                        }
                        if (m82 != null) {
                            object = this.T;
                            if (object != null && (object2 = ((Product)object).getFnlColorVariantData()) != null) {
                                string2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                            }
                            m82.C((Product)object, string2);
                        }
                    } else {
                        n4 = R$id.plp_row_similar_product_tv;
                        if (n3 != n4 && n3 != (n4 = R$id.plp_row_similar_product_iv)) {
                            this.z();
                        } else {
                            int n7;
                            object2 = this.T;
                            if (object2 != null) {
                                n4 = this.getLayoutPosition();
                                ((Product)object2).setViewHolderPos(n4);
                            }
                            object = (n7 = object.getId()) == (n3 = R$id.plp_row_similar_product_iv) ? "icon" : "text";
                            if (m82 != null) {
                                object2 = this.T;
                                m82.h9((Product)object2, (String)object);
                            }
                        }
                    }
                }
            }
        }
    }

    public final Pair w() {
        Serializable serializable;
        Object object = (Boolean)this.k.getValue();
        boolean bl2 = (Boolean)object;
        String string2 = null;
        if (bl2 && (object = this.T) != null && (object = ((Product)object).getTags()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            boolean bl3;
            object = ((Iterable)object).iterator();
            while (bl3 = object.hasNext()) {
                boolean bl4;
                String string3;
                boolean bl5;
                Object object2;
                serializable = (CategoryTags)object.next();
                if (serializable == null || (object2 = ((CategoryTags)serializable).getCategory()) == null || (bl5 = ((String)object2).equalsIgnoreCase(string3 = "BARGAIN")) != (bl4 = true)) continue;
                object2 = Boolean.TRUE;
                if ((serializable = ((CategoryTags)serializable).getPrimary()) != null) {
                    string2 = ((TagPrimary)serializable).getValue();
                }
                object = new Pair(object2, string2);
                return object;
            }
        }
        serializable = Boolean.FALSE;
        object = new Pair(serializable, null);
        return object;
    }

    public final String x() {
        Product product;
        Object object = h40_0.a;
        boolean bl2 = h40_0.W0();
        ProductFnlColorVariantData productFnlColorVariantData = null;
        if (bl2) {
            object = hv3_0.a;
            product = this.T;
            object.getClass();
            bl2 = hv3_0.V(product);
            if (bl2) {
                object = this.T;
                if (object != null) {
                    productFnlColorVariantData = ((Product)object).getFnlColorVariantData();
                }
                return hv3_0.A(productFnlColorVariantData);
            }
        }
        if (bl2 = ((Boolean)(object = (Boolean)this.y().a)).booleanValue()) {
            object = (String)this.y().b;
        } else {
            object = hv3_0.a;
            product = this.T;
            if (product != null) {
                productFnlColorVariantData = product.getFnlColorVariantData();
            }
            object.getClass();
            object = hv3_0.A(productFnlColorVariantData);
        }
        return object;
    }

    public final Pair y() {
        Serializable serializable;
        Object object = (Boolean)this.k.getValue();
        boolean bl2 = (Boolean)object;
        String string2 = null;
        if (bl2 && (object = this.T) != null && (object = ((Product)object).getTags()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            boolean bl3;
            object = ((Iterable)object).iterator();
            while (bl3 = object.hasNext()) {
                boolean bl4;
                String string3;
                boolean bl5;
                Object object2;
                serializable = (CategoryTags)object.next();
                if (serializable == null || (object2 = ((CategoryTags)serializable).getCategory()) == null || (bl5 = ((String)object2).equalsIgnoreCase(string3 = "SELLING_POINT")) != (bl4 = true)) continue;
                object2 = Boolean.TRUE;
                if ((serializable = ((CategoryTags)serializable).getPrimary()) != null) {
                    string2 = ((TagPrimary)serializable).getValue();
                }
                object = new Pair(object2, string2);
                return object;
            }
        }
        serializable = Boolean.FALSE;
        object = new Pair(serializable, null);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z() {
        Object object = this.a;
        if (object != null) {
            SaleGAData saleGAData;
            Object object2;
            float f5;
            boolean bl2;
            object = this.T;
            String string2 = null;
            if (object != null) {
                object = ((Product)object).getWasPriceData();
            } else {
                bl2 = false;
                object = null;
                f5 = 0.0f;
            }
            if (object != null) {
                object = this.T;
                if (object != null && (object = ((Product)object).getWasPriceData()) != null) {
                    object = ((Price)object).getValue();
                } else {
                    bl2 = false;
                    object = null;
                    f5 = 0.0f;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2) {
                    object = this.T;
                    if (object != null && (object = ((Product)object).getWasPriceData()) != null && (object = ((Price)object).getValue()) != null) {
                        f5 = Float.parseFloat((String)object);
                        object = Float.valueOf(f5);
                    } else {
                        bl2 = false;
                        object = null;
                        f5 = 0.0f;
                    }
                    Intrinsics.checkNotNull(object);
                    ((Float)object).floatValue();
                }
            }
            if ((object = this.T) != null) {
                object = ((Product)object).getPrice();
            } else {
                bl2 = false;
                object = null;
                f5 = 0.0f;
            }
            if (object != null) {
                object = this.T;
                if (object != null && (object = ((Product)object).getPrice()) != null) {
                    object = ((Price)object).getValue();
                } else {
                    bl2 = false;
                    object = null;
                    f5 = 0.0f;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2) {
                    object = this.T;
                    if (object != null && (object = ((Product)object).getPrice()) != null && (object = ((Price)object).getValue()) != null) {
                        f5 = Float.parseFloat((String)object);
                        object = Float.valueOf(f5);
                    } else {
                        bl2 = false;
                        object = null;
                        f5 = 0.0f;
                    }
                    Intrinsics.checkNotNull(object);
                    ((Float)object).floatValue();
                }
            }
            if (!(bl2 = this.Y) && (bl2 = this.c)) {
                SaleGAData saleGAData2;
                bl2 = false;
                f5 = 0.0f;
                object = null;
                boolean bl3 = tr2_2.p(false);
                boolean bl4 = true;
                if (bl3) {
                    Object object3;
                    float f6;
                    int n3;
                    float f7;
                    object2 = this.T;
                    if (object2 != null && (object2 = ((Product)object2).getOfferPrice()) != null && (object2 = ((Price)object2).getPriceReveal()) != null && (object2 = ((PriceReveal)object2).getBestPrice()) != null) {
                        f7 = ((Float)object2).floatValue();
                    } else {
                        n3 = 0;
                        f7 = 0.0f;
                        object2 = null;
                    }
                    n3 = (f6 = f7 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                    if (n3 > 0) {
                        bl2 = true;
                        f5 = Float.MIN_VALUE;
                    }
                    if ((object3 = this.T) != null && (object3 = ((Product)object3).getOfferPrice()) != null && (object3 = ((Price)object3).getPriceReveal()) != null && (object3 = ((PriceReveal)object3).getBestPrice()) != null) {
                        object3 = ((Float)object3).toString();
                    } else {
                        bl4 = false;
                        object3 = null;
                    }
                    object2 = this.T;
                    if (object2 != null && (object2 = ((Product)object2).getOfferPrice()) != null && (object2 = ((Price)object2).getPriceReveal()) != null) {
                        object2 = ((PriceReveal)object2).getDiscountPercent();
                    } else {
                        n3 = 0;
                        object2 = null;
                        f7 = 0.0f;
                    }
                    saleGAData2 = new SaleGAData(bl2, (String)object3, (String)object2);
                } else {
                    int n4;
                    object2 = this.T;
                    if (object2 != null && (object2 = ((Product)object2).getOfferPrice()) != null) {
                        object2 = ((Price)object2).getValue();
                    } else {
                        n4 = 0;
                        object2 = null;
                        float f8 = 0.0f;
                    }
                    if (object2 == null || (n4 = ((String)object2).length()) == 0) {
                        bl2 = true;
                        f5 = Float.MIN_VALUE;
                    }
                    bl2 ^= bl4;
                    Object object4 = this.T;
                    if (object4 != null && (object4 = ((Product)object4).getOfferPrice()) != null) {
                        object4 = ((Price)object4).getValue();
                    } else {
                        bl4 = false;
                        object4 = null;
                    }
                    saleGAData2 = new SaleGAData(bl2, (String)object4, null);
                }
                saleGAData = saleGAData2;
            } else {
                saleGAData = null;
            }
            object = this.T;
            if (object != null && (object = ((Product)object).getFnlColorVariantData()) != null) {
                string2 = ((ProductFnlColorVariantData)object).getColorGroup();
            }
            int n7 = this.getAdapterPosition();
            Product product = this.T;
            object = this.p.getText();
            String string3 = object.toString();
            String string4 = "";
            object2 = this.a;
            object2.S6(string2, n7, product, string3, saleGAData, string4);
        }
    }
}

