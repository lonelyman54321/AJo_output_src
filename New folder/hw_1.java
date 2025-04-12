/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
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
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from hW
 */
public final class hw_1
extends RecyclerView$f {
    public final List a;
    public final HashMap b;
    public final int c;
    public final r82_0 d;
    public final g71_0 e;
    public final boolean f;
    public final long g;

    public hw_1(List object, HashMap hashMap, g71_0 g71_02) {
        long l2;
        this.a = object;
        this.b = hashMap;
        this.c = 5;
        this.d = null;
        this.e = g71_02;
        this.f = true;
        object = z40_0.Companion;
        this.g = l2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("price_drop_min_value");
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
        int n4 = this.c;
        if (n3 > n4) {
            n3 = n4;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block43: {
            block45: {
                block44: {
                    block42: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_5 = "viewHolder";
                        Intrinsics.checkNotNullParameter(var1_1, (String)var5_5);
                        var6_6 = var1_1 instanceof pw_0;
                        if (!var6_6) break block43;
                        var4_4 = (pw_0)var1_1;
                        var5_5 = this.a;
                        Intrinsics.checkNotNull(var5_5);
                        var7_7 = var2_2;
                        var5_5 = (Product)var5_5.get(var2_2);
                        var4_4.getClass();
                        Intrinsics.checkNotNullParameter(var5_5, "product");
                        var8_8 = var5_5.getFnlColorVariantData();
                        var9_9 = var5_5.getImages();
                        var10_10 = 1;
                        var11_11 = null;
                        if (var9_9 != null) {
                            var9_9 = var9_9.iterator();
                            do {
                                if ((var13_13 = (var12_12 = (ProductImage)var9_9.next()).getFormat()) == null || (var15_15 = (int)kotlin.text.b.i((String)(var13_13 = var12_12.getFormat()), (String)(var14_14 = "mobileProductListingImage"), (boolean)var10_10)) == 0) continue;
                                var9_9 = var12_12.getUrl();
                                break block42;
                            } while (var16_16 = var9_9.hasNext());
                        }
                        var17_17 = 0;
                        var9_9 = null;
                        var18_18 = 0.0f;
                    }
                    if (var9_9 == null) {
                        if (var8_8 != null) {
                            var9_9 = var8_8.getOutfitPictureURL();
                        } else {
                            var17_17 = 0;
                            var9_9 = null;
                            var18_18 = 0.0f;
                        }
                    }
                    var12_12 = new da$a();
                    var12_12.k = var10_10;
                    var12_12.g = var10_10;
                    var12_12.b = var15_15 = R$drawable.item_dummy_noimg;
                    var15_15 = R$string.acc_icon_product_placeholder;
                    var13_13 = hv3_0.K(var15_15);
                    var12_12.b((String)var13_13);
                    var12_12.s = var10_10;
                    var13_13 = UrlHelper.Companion.getInstance();
                    var12_12.n = var9_9 = var13_13.getImageUrl((String)var9_9);
                    var9_9 = var4_4.e;
                    var12_12.u = var9_9;
                    var12_12.i = var10_10;
                    var12_12.a();
                    if (var8_8 != null) {
                        var9_9 = var8_8.getBrandName();
                    } else {
                        var17_17 = 0;
                        var9_9 = null;
                        var18_18 = 0.0f;
                    }
                    var12_12 = var4_4.g;
                    var12_12.setText((CharSequence)var9_9);
                    var9_9 = var4_4.h;
                    if (var9_9 != null) {
                        var12_12 = var5_5.getName();
                        var9_9.setText((CharSequence)var12_12);
                    }
                    var9_9 = var5_5.getPrice();
                    var12_12 = var4_4.j;
                    var15_15 = 8;
                    var14_14 = var4_4.i;
                    var19_19 = null;
                    if (var9_9 == null) break block44;
                    var9_9 = var5_5.getPrice();
                    ai0_2.B((View)var14_14);
                    if (var9_9 != null) {
                        var20_20 = var9_9.getFormattedValue();
                    } else {
                        var20_20 = null;
                        var21_21 = 0.0f;
                    }
                    var20_20 = qz2_0.n(var20_20);
                    var14_14.setText((CharSequence)var20_20);
                    var14_14 = var5_5.getVariantOptions();
                    if (var14_14 == null) ** GOTO lbl-1000
                    var14_14 = var5_5.getVariantOptions();
                    if (var14_14 != null) {
                        var22_22 = var14_14.size();
                    } else {
                        var22_22 = 0;
                        var14_14 = null;
                    }
                    if (var22_22 > 0 && (var14_14 = var5_5.getVariantOptions()) != null && (var14_14 = (ProductOptionItem)var14_14.get(0)) != null) {
                        var14_14 = var14_14.getWasPriceData();
                    } else lbl-1000:
                    // 2 sources

                    {
                        var22_22 = 0;
                        var14_14 = null;
                    }
                    var21_21 = 0.0f;
                    var20_20 = null;
                    if (var9_9 != null && (var9_9 = var9_9.getValue()) != null) {
                        var18_18 = Float.parseFloat((String)var9_9);
                    } else {
                        var17_17 = 0;
                        var18_18 = 0.0f;
                        var9_9 = null;
                    }
                    if (var14_14 != null && (var14_14 = var14_14.getValue()) != null) {
                        var21_21 = Float.parseFloat((String)var14_14);
                    }
                    if ((var22_22 = Float.compare(var21_21, var18_18)) > 0) {
                        qz2_0.b((Product)var5_5, (TextView)var12_12);
                    }
                    if ((var12_12 = var5_5.getVariantOptions()) == null) ** GOTO lbl119
                    var14_14 = var12_12;
                    var14_14 = (Collection)var12_12;
                    var22_22 = var14_14.isEmpty() ^ var10_10;
                    if (var22_22 == 0) ** GOTO lbl119
                    var12_12 = var12_12.iterator();
                    while ((var22_22 = (int)var12_12.hasNext()) != 0) {
                        var14_14 = ((ProductOptionItem)var12_12.next()).getStock();
                        if (var14_14 == null) continue;
                        if ((var14_14 = var14_14.getStockLevel()) != null) {
                            var22_22 = var14_14.intValue();
                        } else {
                            var22_22 = 0;
                            var14_14 = null;
                        }
                        if (var22_22 <= 0) continue;
lbl119:
                        // 3 sources

                        var10_10 = 0;
                        var23_23 = null;
                        break;
                    }
                    var12_12 = var4_4.l;
                    var14_14 = var4_4.k;
                    if (var10_10 != 0) {
                        var14_14.setVisibility(0);
                        var12_12.setVisibility(0);
                    } else {
                        var14_14.setVisibility(var15_15);
                        var12_12.setVisibility(var15_15);
                        var10_10 = var3_3.f;
                        if (var10_10 != 0) {
                            if (var8_8 != null) {
                                var23_23 = var8_8.getColorGroup();
                            } else {
                                var10_10 = 0;
                                var23_23 = null;
                            }
                            var10_10 = TextUtils.isEmpty((CharSequence)var23_23);
                            if (var10_10 == 0) {
                                if (var8_8 != null) {
                                    var8_8 = var8_8.getColorGroup();
                                } else {
                                    var7_7 = 0;
                                    var8_8 = null;
                                    var24_24 = 0.0f;
                                }
                            } else {
                                var8_8 = var5_5.getCode();
                                var7_7 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                                var8_8 = var7_7 == 0 ? var5_5.getCode() : "";
                            }
                            var23_23 = var3_3.b;
                            var12_12 = var4_4.d;
                            if (var23_23 != null && (var22_22 = (int)TextUtils.isEmpty((CharSequence)var8_8)) == 0 && (var22_22 = (int)var23_23.containsKey(var8_8)) != 0) {
                                var8_8 = var23_23.get(var8_8);
                                Intrinsics.checkNotNull(var8_8);
                                var8_8 = (String)var8_8;
                                var24_24 = Float.parseFloat((String)var8_8);
                                var10_10 = Float.compare(var24_24, var18_18);
                                if (var10_10 > 0 && (var17_17 = (cfr_temp_0 = (var24_24 -= var18_18) - (var18_18 = (float)(var25_25 = var3_3.g))) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1)) >= 0) {
                                    ai0_2.B(var12_12);
                                    var8_8 = qz2_0.m(Float.valueOf(var24_24));
                                    var9_9 = var4_4.f;
                                    var9_9.setText((CharSequence)var8_8);
                                } else {
                                    ai0_2.i(var12_12);
                                }
                            } else {
                                ai0_2.i(var12_12);
                            }
                        }
                    }
                    break block45;
                }
                ai0_2.k((View)var14_14);
                ai0_2.k(var12_12);
            }
            var8_8 = tr2_2.a;
            var9_9 = var5_5.getSourceStoreId();
            var7_7 = (int)var8_8.k((String)var9_9, false);
            if (var7_7 != 0) {
                var8_8 = var5_5.getPrice();
                if (var8_8 != null) {
                    var13_13 = var8_8 = var8_8.getValue();
                } else {
                    var15_15 = 0;
                    var13_13 = null;
                }
                var8_8 = var5_5.getPrice();
                if (var8_8 != null) {
                    var14_14 = var8_8 = var8_8.getFutureBestPrice();
                } else {
                    var22_22 = 0;
                    var14_14 = null;
                }
                var8_8 = var5_5.getPrice();
                var19_19 = var8_8 != null ? (var8_8 = var8_8.getFutureDiscountPercent()) : null;
                var5_5 = var5_5.getOfferPrice();
                if (var5_5 != null) {
                    var11_11 = var5_5.getValue();
                }
                var20_20 = var11_11;
                var27_26 = ScreenType.SCREEN_WISHLIST;
                var28_27 = 352;
                var12_12 = var4_4.m;
                tr2_2.A(var12_12, (String)var13_13, (Float)var14_14, (String)var19_19, var11_11, false, false, var27_26, null, var28_27);
            } else {
                var4_4 = var4_4.m;
                if (var4_4 != null) {
                    var4_4.setVisibility(var15_15);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_home_closet_card_item_revamp;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.d;
        g71_0 g71_02 = this.e;
        pw_0 pw_02 = new pw_0((View)viewGroup, (r82_0)object, g71_02);
        return pw_02;
    }
}

