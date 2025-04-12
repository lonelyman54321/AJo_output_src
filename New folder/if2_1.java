/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from iF2
 */
public final class if2_1
extends RecyclerView$f {
    public static final iF2$a Companion;
    public final List a;
    public final boolean b;
    public final boolean c;
    public final HashMap d;
    public final r82_0 e;
    public final long f;
    public final String g;

    static {
        iF2$a iF2$a;
        Companion = iF2$a = new Object();
    }

    public if2_1(List object, HashMap hashMap, String string2, r82_0 r82_02) {
        boolean bl2;
        long l2;
        Intrinsics.checkNotNullParameter(object, "recentlyViewed");
        Intrinsics.checkNotNullParameter(hashMap, "recentlyViewedProdPrice");
        Intrinsics.checkNotNullParameter(string2, "title");
        this.a = object;
        object = z40_0.Companion;
        this.f = l2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("price_drop_min_value");
        this.d = hashMap;
        this.g = string2;
        this.b = bl2 = true;
        this.c = bl2;
        this.e = r82_02;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        return this.b ^ 1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block57: {
            block58: {
                block56: {
                    var3_3 = var1_1;
                    Intrinsics.checkNotNullParameter(var1_1, "viewHolder");
                    var3_3 = (hf2_1)var1_1;
                    var4_4 = this.a;
                    if (var4_4 != null) {
                        var5_5 = var2_2;
                        var4_4 = (Product)var4_4.get(var2_2);
                    } else {
                        var6_6 = 0;
                        var7_7 = 0.0f;
                        var4_4 = null;
                    }
                    Intrinsics.checkNotNull(var4_4);
                    var3_3.getClass();
                    var8_8 = "originalProduct";
                    Intrinsics.checkNotNullParameter(var4_4, (String)var8_8);
                    var3_3.s = var4_4;
                    var6_6 = var3_3.getAdapterPosition();
                    var5_5 = (int)var3_3.f;
                    var9_9 /* !! */  = var3_3.i;
                    var10_10 = 8;
                    if (var5_5 != 0) {
                        if (var6_6 != 0) {
                            var7_7 = 2.8E-45f;
                            var6_6 = mz3_0.d(2);
                            var9_9 /* !! */ .setPadding(var6_6, 0, 0, 0);
                        } else {
                            var6_6 = mz3_0.d(var10_10);
                            var9_9 /* !! */ .setPadding(var6_6, 0, 0, 0);
                        }
                    } else if (var6_6 != 0) {
                        var7_7 = 8.4E-45f;
                        var6_6 = mz3_0.d(6);
                        var9_9 /* !! */ .setPadding(var6_6, 0, 0, 0);
                    } else {
                        var9_9 /* !! */ .setPadding(0, 0, 0, 0);
                    }
                    var4_4 = var3_3.s;
                    var9_9 /* !! */  = "product";
                    if (var4_4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                        var6_6 = 0;
                        var7_7 = 0.0f;
                        var4_4 = null;
                    }
                    var4_4 = var4_4.getFnlColorVariantData();
                    var11_11 = "-";
                    var12_12 = " of ";
                    var13_13 = var3_3.j;
                    var14_14 = 1;
                    var15_15 = 1.4E-45f;
                    if (var4_4 != null && (var16_16 = var4_4.isAllPromotions()) == var14_14) {
                        var13_13.setVisibility(0);
                        var16_16 = R$string.product_image;
                        var17_17 = hv3_0.K(var16_16);
                        var18_18 = var3_3.s;
                        if (var18_18 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                            var19_19 = 0;
                            var18_18 = null;
                        }
                        var18_18 = var18_18.getBrandName();
                        var20_20 /* !! */  = var3_3.s;
                        if (var20_20 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                            var20_20 /* !! */  = null;
                        }
                        var20_20 /* !! */  = var20_20 /* !! */ .getName();
                        var17_17 = KW.a((String)var17_17, (String)var12_12, (String)var18_18, (String)var11_11, (String)var20_20 /* !! */ );
                        var13_13.setContentDescription((CharSequence)var17_17);
                        var17_17 = new da$a();
                        var17_17.k = var14_14;
                        var17_17.r = var14_14;
                        var19_19 = R$string.acc_banner;
                        var18_18 = hv3_0.K(var19_19);
                        var17_17.b((String)var18_18);
                        var18_18 = UrlHelper.Companion.getInstance();
                        var20_20 /* !! */  = new Object[]{};
                        var21_21 = "misc";
                        var17_17.n = var22_22 = var18_18.getApiUrl(var21_21, "plp_offer_imv", var20_20 /* !! */ );
                        var17_17.u = var13_13;
                        var17_17.a();
                    } else {
                        var13_13.setVisibility(var10_10);
                    }
                    var22_22 = var3_3.q;
                    if (var22_22 != null) {
                        hv3_0.a.getClass();
                        var13_13 = hv3_0.A((ProductFnlColorVariantData)var4_4);
                        if (var13_13 != null) {
                            var22_22.setText((CharSequence)var13_13);
                            var22_22.setVisibility(0);
                        } else {
                            var22_22.setVisibility(var10_10);
                        }
                    }
                    if (var4_4 != null) {
                        var22_22 = var4_4.getColorGroup();
                    } else {
                        var23_23 = false;
                        var24_24 = 0.0f;
                        var22_22 = null;
                    }
                    var23_23 = TextUtils.isEmpty((CharSequence)var22_22);
                    if (var23_23) break block57;
                    if (var4_4 != null) {
                        var22_22 = var4_4.getColorGroup();
                    } else {
                        var23_23 = false;
                        var24_24 = 0.0f;
                        var22_22 = null;
                    }
                    var3_3.r = var22_22;
                    var13_13 = var3_3.s;
                    if (var13_13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                        var13_13 = null;
                    }
                    if ((var13_13 = var13_13.getImages()) != null) {
                        var13_13 = var13_13.iterator();
                        do {
                            if ((var18_18 = (var17_17 = (ProductImage)var13_13.next()).getFormat()) == null || (var19_19 = (int)kotlin.text.b.i((String)(var18_18 = var17_17.getFormat()), (String)(var20_20 /* !! */  = "mobileProductListingImage"), (boolean)var14_14)) == 0) continue;
                            var13_13 = var17_17.getUrl();
                            break block56;
                        } while ((var16_16 = (int)var13_13.hasNext()) != 0);
                    }
                    var13_13 = null;
                }
                if (var13_13 == null) {
                    var13_13 = var4_4 != null ? var4_4.getOutfitPictureURL() : null;
                }
                var16_16 = R$string.product_image;
                var17_17 = hv3_0.K(var16_16);
                var18_18 = var3_3.s;
                if (var18_18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                    var19_19 = 0;
                    var18_18 = null;
                }
                var18_18 = var18_18.getBrandName();
                var20_20 /* !! */  = var3_3.s;
                if (var20_20 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                    var20_20 /* !! */  = null;
                }
                var20_20 /* !! */  = var20_20 /* !! */ .getName();
                var11_11 = KW.a((String)var17_17, (String)var12_12, (String)var18_18, (String)var11_11, (String)var20_20 /* !! */ );
                var12_12 = var3_3.k;
                var12_12.setContentDescription((CharSequence)var11_11);
                var11_11 = new da$a();
                var11_11.k = var14_14;
                var11_11.g = var14_14;
                var11_11.b = var16_16 = R$drawable.item_dummy_noimg;
                var16_16 = R$string.acc_icon_product_placeholder;
                var17_17 = hv3_0.K(var16_16);
                var11_11.b((String)var17_17);
                var11_11.s = var14_14;
                var17_17 = UrlHelper.Companion.getInstance();
                var11_11.n = var13_13 = var17_17.getImageUrl((String)var13_13);
                var11_11.u = var12_12;
                var11_11.i = var14_14;
                var11_11.a();
                if (var4_4 != null) {
                    var4_4 = var4_4.getBrandName();
                } else {
                    var6_6 = 0;
                    var7_7 = 0.0f;
                    var4_4 = null;
                }
                var11_11 = var3_3.l;
                var11_11.setText((CharSequence)var4_4);
                var4_4 = var3_3.m;
                if (var4_4 != null) {
                    var11_11 = var3_3.s;
                    if (var11_11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                        var25_25 = 0;
                        var11_11 = null;
                    }
                    var11_11 = var11_11.getName();
                    var4_4.setText((CharSequence)var11_11);
                }
                if ((var4_4 = var3_3.s) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                    var6_6 = 0;
                    var7_7 = 0.0f;
                    var4_4 = null;
                }
                var4_4 = var4_4.getPrice();
                var25_25 = 4;
                var12_12 = var3_3.n;
                var13_13 = var3_3.o;
                if (var4_4 == null) break block58;
                var4_4 = var3_3.s;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                    var6_6 = 0;
                    var7_7 = 0.0f;
                    var4_4 = null;
                }
                var4_4 = var4_4.getPrice();
                var12_12.setVisibility(0);
                if (var4_4 != null) {
                    var26_26 = var4_4.getFormattedValue();
                } else {
                    var14_14 = 0;
                    var15_15 = 0.0f;
                    var26_26 = null;
                }
                var26_26 = qz2_0.n(var26_26);
                var12_12.setText((CharSequence)var26_26);
                var26_26 = var12_12.getResources();
                Intrinsics.checkNotNullExpressionValue(var26_26, "getResources(...)");
                var17_17 = var3_3.s;
                if (var17_17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                    var16_16 = 0;
                    var17_17 = null;
                }
                var26_26 = qz2_0.e((Resources)var26_26, (Product)var17_17);
                var12_12.setContentDescription((CharSequence)var26_26);
                var12_12 = var3_3.s;
                if (var12_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                    var27_27 = 0;
                    var12_12 = null;
                }
                var12_12 = var12_12.getWasPriceData();
                var14_14 = 0;
                var15_15 = 0.0f;
                var26_26 = null;
                if (var4_4 != null && (var4_4 = var4_4.getValue()) != null) {
                    var7_7 = Float.parseFloat((String)var4_4);
                } else {
                    var6_6 = 0;
                    var7_7 = 0.0f;
                    var4_4 = null;
                }
                if (var12_12 == null) ** GOTO lbl-1000
                if ((var12_12 = var12_12.getValue()) != null) {
                    var15_15 = Float.parseFloat((String)var12_12);
                }
                if ((var27_27 = Float.compare(var15_15, var7_7)) > 0) {
                    var8_8 = var3_3.s;
                    if (var8_8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_9 /* !! */ );
                        var5_5 = 0;
                        var8_8 = null;
                    }
                    qz2_0.d((Product)var8_8, (TextView)var13_13);
                } else if (var5_5 != 0) {
                    var13_13.setVisibility(var25_25);
                } else {
                    var13_13.setVisibility(var10_10);
                }
                var5_5 = (int)var3_3.g;
                if (var5_5 == 0) break block57;
                var8_8 = var3_3.d;
                var9_9 /* !! */  = var3_3.h;
                if (var8_8 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var8_8);
                var25_25 = (int)var8_8.containsKey(var22_22);
                if (var25_25 != 0) {
                    if ((var22_22 = (String)var8_8.get(var22_22)) != null) {
                        var24_24 = Float.parseFloat((String)var22_22);
                        var22_22 = Float.valueOf(var24_24);
                    } else {
                        var23_23 = false;
                        var24_24 = 0.0f;
                        var22_22 = null;
                    }
                    Intrinsics.checkNotNull(var22_22);
                    var24_24 = var22_22.floatValue();
                    var5_5 = Float.compare(var24_24, var7_7);
                    if (var5_5 > 0 && (var6_6 = (int)((cfr_temp_0 = (var24_24 -= var7_7) - (var7_7 = (float)(var28_28 = var3_3.e))) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) >= 0) {
                        if (var9_9 /* !! */  != null) {
                            var9_9 /* !! */ .setVisibility(0);
                        }
                        var4_4 = qz2_0.m(Float.valueOf(var24_24));
                        var3_3 = var3_3.p;
                        if (var3_3 != null) {
                            var3_3.setText((CharSequence)var4_4);
                        }
                    } else if (var9_9 /* !! */  != null) {
                        var9_9 /* !! */ .setVisibility(var10_10);
                    }
                } else if (var9_9 /* !! */  != null) {
                    var9_9 /* !! */ .setVisibility(var10_10);
                }
                break block57;
            }
            var12_12.setVisibility(var10_10);
            if (var5_5 != 0) {
                var13_13.setVisibility(var25_25);
            } else {
                var13_13.setVisibility(var10_10);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        if (n3 != 0) {
            int n4 = 2;
            if (n3 != n4) {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_shop_the_look;
                View view = layoutInflater.inflate(n4, object, false);
                Intrinsics.checkNotNull(view);
                boolean bl2 = this.b;
                boolean bl3 = this.c;
                r82_0 r82_02 = this.e;
                String string2 = this.g;
                HashMap hashMap = this.d;
                long l2 = this.f;
                object = new hf2_1(view, null, r82_02, string2, hashMap, l2, bl2, bl3);
                return object;
            }
            LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
            n4 = R$layout.layout_recently_viewed_item_revamp;
            View view = layoutInflater.inflate(n4, object, false);
            Intrinsics.checkNotNull(view);
            boolean bl4 = this.b;
            boolean bl5 = this.c;
            r82_0 r82_03 = this.e;
            String string3 = this.g;
            HashMap hashMap = this.d;
            long l3 = this.f;
            object = new hf2_1(view, null, r82_03, string3, hashMap, l3, bl4, bl5);
            return object;
        }
        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
        int n7 = R$layout.layout_recently_viewed;
        View view = layoutInflater.inflate(n7, object, false);
        Intrinsics.checkNotNull(view);
        boolean bl6 = this.b;
        boolean bl7 = this.c;
        r82_0 r82_04 = this.e;
        String string4 = this.g;
        HashMap hashMap = this.d;
        long l4 = this.f;
        object = new hf2_1(view, null, r82_04, string4, hashMap, l4, bl6, bl7);
        return object;
    }
}

