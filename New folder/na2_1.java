/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.prioritydelivery.DeliveryTimeData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from na2
 */
public final class na2_1
extends ArrayAdapter {
    public final List a;

    public na2_1(Context context, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(arrayList, "mDataList");
        super(context, 0, (List)arrayList);
        this.a = arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final View getView(int var1_1, View var2_2, ViewGroup var3_3) {
        Intrinsics.checkNotNullParameter(var3_3, "parent");
        var4_4 = this.a.get(var1_1);
        Intrinsics.checkNotNull(var4_4, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry");
        var4_4 = (CartEntry)var4_4;
        var5_5 = null;
        if (var2_2 == null) {
            var6_6 = og1_1.b();
            if (var6_6) {
                var2_2 = LayoutInflater.from((Context)var3_3.getContext());
                var7_7 = R$layout.row_order_confirm_product_luxe;
                var2_2 = var2_2.inflate(var7_7, (ViewGroup)var3_3, false);
            } else {
                var2_2 = LayoutInflater.from((Context)var3_3.getContext());
                var7_7 = R$layout.row_order_confirm_product_revamp;
                var2_2 = var2_2.inflate(var7_7, (ViewGroup)var3_3, false);
            }
            Intrinsics.checkNotNull(var2_2);
            var3_3 = new oa2_0(var2_2);
            var2_2.setTag(var3_3);
        } else {
            var3_3 = var2_2.getTag();
            var8_8 = "null cannot be cast to non-null type com.ril.ajio.payment.viewholder.OrderConfirmRevampViewHolder";
            Intrinsics.checkNotNull(var3_3, (String)var8_8);
            var3_3 = (oa2_0)var3_3;
        }
        var8_8 = var4_4.getProduct();
        var9_9 = null;
        if (var8_8 != null) {
            var8_8 = var4_4.getProduct();
        } else {
            var7_7 = 0;
            var8_8 = null;
        }
        if (var8_8 == null) {
            Intrinsics.checkNotNull(var2_2);
            return var2_2;
        }
        var3_3.getClass();
        Intrinsics.checkNotNullParameter(var4_4, "cartEntry");
        var10_10 = var8_8.getImages();
        var11_11 = 1;
        var12_12 = "";
        if (var10_10 != null && (var10_10 = var8_8.getImages()) != null && (var13_13 = (var10_10 = (Collection)var10_10).isEmpty() ^ var11_11) == var11_11) {
            block56: {
                var10_10 = var8_8.getImages();
                Intrinsics.checkNotNull(var10_10);
                var10_10 = var10_10.iterator();
                while (var14_14 = var10_10.hasNext()) {
                    var17_17 = "mobileProductListingImage";
                    var15_15 = (ProductImage)var10_10.next();
                    var16_16 /* !! */  = var15_15.getFormat();
                    var18_18 = var17_17.equalsIgnoreCase((String)var16_16 /* !! */ );
                    if (var18_18 == 0) continue;
                    var10_10 = var15_15.getUrl();
                    break block56;
                }
                var10_10 = var12_12;
            }
            if (var10_10 == null) {
                var10_10 = var8_8.getImages();
                if (var10_10 != null && (var10_10 = (ProductImage)var10_10.get(0)) != null) {
                    var10_10 = var10_10.getUrl();
                } else {
                    var13_13 = 0;
                    var10_10 = null;
                }
            }
        } else {
            var10_10 = var12_12;
        }
        var14_14 = TextUtils.isEmpty((CharSequence)var10_10);
        var16_16 /* !! */  = var3_3.a;
        if (!var14_14) {
            var15_15 = new da$a();
            var15_15.k = var11_11;
            var15_15.r = var11_11;
            var19_19 = R$string.acc_banner;
            var17_17 = hv3_0.K(var19_19);
            var15_15.b(var17_17);
            var15_15.n = var10_10;
            var15_15.u = var16_16 /* !! */ ;
            var15_15.a();
        } else {
            var13_13 = R$drawable.item_dummy_noimg;
            var16_16 /* !! */ .setImageResource(var13_13);
        }
        var10_10 = var8_8.getFnlColorVariantData();
        if (var10_10 == null) ** GOTO lbl-1000
        var10_10 = var8_8.getFnlColorVariantData();
        if (var10_10 != null) {
            var10_10 = var10_10.getBrandName();
        } else {
            var13_13 = 0;
            var10_10 = null;
        }
        var13_13 = (int)TextUtils.isEmpty((CharSequence)var10_10);
        if (var13_13 == 0) {
            var10_10 = var8_8.getFnlColorVariantData();
            if (var10_10 != null) {
                var10_10 = var10_10.getBrandName();
            } else {
                var13_13 = 0;
                var10_10 = null;
            }
        } else lbl-1000:
        // 2 sources

        {
            var10_10 = var8_8.getBrandName();
        }
        var15_15 = var8_8.getName();
        var18_18 = TextUtils.isEmpty(var10_10);
        var17_17 = var3_3.f;
        if (var18_18 == 0) {
            var17_17.setText((CharSequence)var10_10);
        } else {
            var17_17.setText((CharSequence)var12_12);
        }
        var10_10 = h40_0.a;
        var13_13 = (int)var10_10.f1();
        var16_16 /* !! */  = var3_3.g;
        if (var13_13 != 0 && (var13_13 = (int)(var10_10 = var4_4.isGiftProduct()).booleanValue()) != 0) {
            var10_10 = var3_3.h;
            if (var10_10 != null) {
                var17_17 = h40_0.D(false).getFreeTextOnProduct();
                var10_10.setText((CharSequence)var17_17);
            }
            if ((var19_19 = (int)og1_1.c()) != 0 && var10_10 != null && (var10_10 = var10_10.getParent()) != null && (var19_19 = var10_10 instanceof ConstraintLayout) != 0) {
                var10_10 = (ConstraintLayout)var10_10;
                var17_17 = var10_10.getContext();
                var20_20 = R$color.luxe_color_121212;
                var17_17 = t70.getDrawable((Context)var17_17, var20_20);
                var10_10.setBackground((Drawable)var17_17);
            }
            if (var16_16 /* !! */  != null) {
                ai0_2.B((View)var16_16 /* !! */ );
            }
        } else if (var16_16 /* !! */  != null) {
            ai0_2.i((View)var16_16 /* !! */ );
        }
        var10_10 = ka2_2.a((CartEntry)var4_4);
        var18_18 = var10_10.b;
        var17_17 = var3_3.d;
        if (var18_18 != 0) {
            var18_18 = 8;
            var17_17.setVisibility(var18_18);
        } else {
            var17_17.setVisibility(0);
            var16_16 /* !! */  = hv3_0.i((CartEntry)var4_4);
            if (var16_16 /* !! */  != null && (var20_20 = b.k((CharSequence)var16_16 /* !! */ )) == 0) {
                var21_21 = "Size ";
                var16_16 /* !! */  = var21_21.concat((String)var16_16 /* !! */ );
            } else {
                var16_16 /* !! */  = var12_12;
            }
            var17_17.setText((CharSequence)var16_16 /* !! */ );
        }
        var18_18 = (int)TextUtils.isEmpty((CharSequence)var15_15);
        var17_17 = var3_3.c;
        if (var18_18 == 0) {
            var12_12 = var10_10.a;
            if (var12_12 != null && (var22_22 = var12_12.length()) != 0) {
                var10_10 = var10_10.a;
                var12_12 = new StringBuilder();
                var12_12.append((String)var15_15);
                var15_15 = " | ";
                var12_12.append((String)var15_15);
                var12_12.append((String)var10_10);
                var10_10 = var12_12.toString();
                var17_17.setText((CharSequence)var10_10);
            } else {
                var10_10 = String.valueOf(var15_15);
                var17_17.setText((CharSequence)var10_10);
            }
        } else {
            var17_17.setText((CharSequence)var12_12);
        }
        var8_8 = var8_8.getFnlColorVariantData();
        hv3_0.a.getClass();
        var8_8 = hv3_0.A((ProductFnlColorVariantData)var8_8);
        var10_10 = var3_3.b;
        if (var8_8 != null) {
            var10_10.setText((CharSequence)var8_8);
            ai0_2.B((View)var10_10);
        } else {
            ai0_2.i((View)var10_10);
        }
        var7_7 = (int)h40_0.O1();
        var10_10 = var3_3.i;
        if (var7_7 != 0 && (var8_8 = var4_4.getPriorityDeliveryApplied()) != null && (var7_7 = (int)(var8_8 = var4_4.getPriorityDeliveryApplied()).booleanValue()) != 0) {
            lp_0.h((ImageView)var10_10);
            ai0_2.B((View)var10_10);
        } else {
            ai0_2.i((View)var10_10);
        }
        var7_7 = (int)h40_0.Q1();
        if (var7_7 != 0) {
            var7_7 = (int)h40_0.Q1();
            if (var7_7 == 0 || (var5_5 = h40_0.k0(false)) == null || (var5_5 = var5_5.getThankYou()) == null || (var5_5 = var5_5.getDeliverySLA()) == null || (var7_7 = var5_5.isEmpty() ^ var11_11) == 0) {
                var5_5 = null;
            }
            if (var5_5 != null) {
                var8_8 = var4_4.getDeliverySLA();
                var5_5 = (DeliveryTimeData)var5_5.get(var8_8);
            } else {
                var5_5 = null;
            }
            if (var5_5 != null) {
                var8_8 = var4_4.getEddUpper();
                var4_4 = var4_4.getEddDate();
                var10_10 = var5_5.getDisplayName();
                if (var10_10 != null && (var13_13 = var10_10.length()) != 0) {
                    if (var8_8 != null) {
                        var1_1 = (int)var5_5.getShowTime();
                        var3_3 = var3_3.e;
                        if (var1_1 != 0) {
                            var4_4 = var5_5.getDisplayName();
                            var5_5 = new Date();
                            var23_23 = "yyyy-MM-dd'T'HH:mm";
                            var12_12 = Locale.ENGLISH;
                            var10_10 = new SimpleDateFormat(var23_23, (Locale)var12_12);
                            try {
                                var5_5 = var10_10.parse((String)var8_8);
                            }
                            catch (Exception v0) {}
                            if (var5_5 != null) {
                                var10_10 = Locale.ENGLISH;
                                var8_8 = new SimpleDateFormat("hh:mm a", (Locale)var10_10);
                                var9_9 = var8_8.format((Date)var5_5);
                            }
                            var5_5 = new StringBuilder();
                            var5_5.append((String)var4_4);
                            var5_5.append("  ");
                            var5_5.append(var9_9);
                            var4_4 = var5_5.toString();
                            var3_3.setText((CharSequence)var4_4);
                        } else {
                            var4_4 = var5_5.getDisplayName();
                            var3_3.setText((CharSequence)var4_4);
                        }
                        ai0_2.B((View)var3_3);
                    }
                } else {
                    var3_3.a((String)var4_4);
                }
            } else {
                var4_4 = var4_4.getEddDate();
                var3_3.a((String)var4_4);
            }
        } else {
            var4_4 = var4_4.getEddDate();
            var3_3.a((String)var4_4);
        }
        Intrinsics.checkNotNull(var2_2);
        return var2_2;
    }

    public final boolean isEnabled(int n3) {
        return false;
    }
}

