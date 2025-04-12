/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.text.style.UnderlineSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$font;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductPromotion;
import com.ril.ajio.services.data.freebies.GiftPromotion;
import com.ril.ajio.services.data.ratings.AggregateRating;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from Yy2
 */
public final class yy2_1
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final Kq0 c;
    public final View d;
    public final zi2_1 e;
    public final NewEEcommerceEventsRevamp f;
    public final NewCustomEventsRevamp g;
    public View h;
    public ConstraintLayout i;
    public final boolean j;

    public yy2_1(View view, yi2_1 object, Kq0 object2) {
        boolean bl2;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object2, "discoverBrandCallback");
        super(view);
        this.a = view;
        this.b = object;
        this.c = object2;
        this.e = object2 = object.Aa();
        object2 = AnalyticsManager.Companion;
        this.f = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.g = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        object = ((NewProductDetailsFragment)object).o5();
        object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        this.j = bl2 = Intrinsics.areEqual(object, object2);
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.d = view;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        yy2_1 yy2_12 = this;
        int n7 = 0;
        Object object2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.color_layout;
        zi2_1 zi2_12 = yy2_12.e;
        if (object == null || (n3 = ((Integer)object).intValue()) != n8) {
            n8 = R$id.number_of_colors;
            if (object == null || (n3 = ((Integer)object).intValue()) != n8) {
                int n10;
                n8 = R$id.txt_discover_brand;
                NewCustomEventsRevamp newCustomEventsRevamp = yy2_12.g;
                Object object3 = yy2_12.b;
                if (object != null && (n10 = ((Integer)object).intValue()) == n8) {
                    Bundle bundle = new Bundle();
                    if (object3 != null && (object = object3.x5()) != null) {
                        object = ((Product)object).getCode();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    String string2 = "product_id";
                    bundle.putString(string2, (String)object);
                    if (object3 != null && (object = object3.x5()) != null) {
                        object = ((Product)object).getName();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    string2 = "product_name";
                    bundle.putString(string2, (String)object);
                    if (object3 != null && (object = object3.x5()) != null) {
                        object = ((Product)object).getBrandName();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    string2 = "product_brand";
                    bundle.putString(string2, (String)object);
                    if (object3 != null && (object = object3.x5()) != null) {
                        object2 = ((Product)object).getBrickCategory();
                    }
                    object = "product_brick";
                    bundle.putString((String)object, (String)object2);
                    if (newCustomEventsRevamp != null) {
                        object3 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTIONS();
                        String string3 = newCustomEventsRevamp.getSV_EP_DISCOVER_BRAND_CLICKED();
                        object2 = AnalyticsManager.Companion;
                        String string4 = bv_0.a((AnalyticsManager$Companion)object2);
                        String string5 = cv_0.a((AnalyticsManager$Companion)object2);
                        String string6 = "";
                        String string7 = "product_details_interactions";
                        String string8 = "pdp screen";
                        String string9 = "pdp screen";
                        int n14 = 1536;
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object3, string3, string6, string7, string8, string9, string4, bundle, string5, false, null, n14, null);
                    }
                    object2 = yy2_12.c;
                    object2.Q0();
                    return;
                }
                n8 = R$id.freebies_lyt;
                if (object == null) {
                    return;
                }
                n4 = (Integer)object;
                if (n4 != n8) return;
                n4 = (int)(mz3_0.z() ? 1 : 0);
                if (n4 != 0) {
                    object = object3.x5();
                    if (object != null) {
                        object = ((Product)object).getGiftPromotion();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = object3.x5();
                        if (object != null && (object = ((Product)object).getGiftPromotion()) != null) {
                            object2 = ((GiftPromotion)object).getGifts();
                        }
                        if (object2 != null) {
                            object2 = object3.x5();
                            if (object2 != null && (object2 = ((Product)object2).getGiftPromotion()) != null) {
                                n7 = ((GiftPromotion)object2).getTotalGiftCount();
                            } else {
                                n7 = 0;
                                object2 = null;
                            }
                            object3 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTIONS();
                            String string10 = String.valueOf(n7);
                            object2 = yy2_12.f;
                            String string11 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
                            String string12 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
                            int n15 = 1664;
                            String string13 = "Freebies click";
                            String string14 = "product_details_interactions";
                            String string15 = "pdp screen";
                            String string16 = "pdp screen";
                            Object var13_14 = null;
                            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object3, string13, string10, string14, string15, string16, string11, null, string12, false, null, n15, null);
                        }
                    }
                }
                zi2_12.K6();
                return;
            }
        }
        zi2_12.T8();
    }

    public final Bundle w() {
        Bundle bundle = new Bundle();
        Object object = this.g;
        Object object2 = ((NewCustomEventsRevamp)object).getPRODUCT_NAME();
        yi2_1 yi2_12 = this.b;
        Object object3 = yi2_12.x5();
        Object object4 = "";
        if (object3 == null || (object3 = ((Product)object3).getName()) == null) {
            object3 = object4;
        }
        bundle.putString((String)object2, (String)object3);
        object2 = ((NewCustomEventsRevamp)object).getPRODUCT_ID();
        object3 = yi2_12.x5();
        if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
            object3 = object4;
        }
        bundle.putString((String)object2, (String)object3);
        object = ((NewCustomEventsRevamp)object).getPRODUCT_BRAND();
        object2 = yi2_12.x5();
        if (object2 != null && (object2 = ((Product)object2).getBrandName()) != null) {
            object4 = object2;
        }
        bundle.putString((String)object, (String)object4);
        return bundle;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void x(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        int n3 = 1;
        String string2 = null;
        int n4 = mz3_0.z();
        if (n4 != 0) {
            Object object = this.b;
            Object object2 = object.x5();
            Object[] objectArray = null;
            if ((object2 = object2 != null ? ((Product)object2).getGiftPromotion() : null) != null) {
                object2 = object.x5();
                if (object2 != null && (object2 = ((Product)object2).getGiftPromotion()) != null) {
                    objectArray = ((GiftPromotion)object2).getGifts();
                }
                if (objectArray != null) {
                    int n7;
                    if ((object = object.x5()) == null) return;
                    if ((object = ((Product)object).getGiftPromotion()) == null) return;
                    n4 = ((GiftPromotion)object).getTotalGiftCount();
                    if (n4 <= 0) {
                        return;
                    }
                    if (n4 > n3) {
                        object2 = h40_0.a;
                        object2 = h40_0.D(false).getPdpFreebiesMoreThanOne();
                    } else {
                        object2 = h40_0.a;
                        object2 = h40_0.D(false).getPdpFreebiesOne();
                    }
                    if (textView != null) {
                        objectArray = StringCompanionObject.INSTANCE;
                        if (object2 == null) {
                            object2 = "";
                        }
                        object = n4;
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        string2 = "format(...)";
                        zn0_1.b(objectArray, n3, (String)object2, string2, textView);
                    }
                    if (constraintLayout != null) {
                        ai0_2.B((View)constraintLayout);
                    }
                    if ((n7 = og1_1.c()) == 0) return;
                    if (imageView != null) {
                        constraintLayout = imageView.getContext();
                        n3 = R$drawable.ic_freebies_with_arrow_luxe;
                        constraintLayout = t70.getDrawable((Context)constraintLayout, n3);
                        imageView.setImageDrawable((Drawable)constraintLayout);
                    }
                    if (textView == null) return;
                    n7 = hv3_0.m(R$color.luxe_color_121212);
                    textView.setTextColor(n7);
                    return;
                }
            }
        }
        if (constraintLayout == null) return;
        ai0_2.i((View)constraintLayout);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void y(String var1_1, String var2_2, Price var3_3, Price var4_4) {
        block306: {
            block325: {
                block307: {
                    block324: {
                        block323: {
                            block322: {
                                block321: {
                                    block320: {
                                        block318: {
                                            block319: {
                                                block317: {
                                                    block315: {
                                                        block316: {
                                                            block314: {
                                                                block313: {
                                                                    block310: {
                                                                        block305: {
                                                                            block312: {
                                                                                block311: {
                                                                                    block304: {
                                                                                        block302: {
                                                                                            block309: {
                                                                                                block308: {
                                                                                                    block301: {
                                                                                                        var5_5 = this;
                                                                                                        var6_6 = var1_1;
                                                                                                        var7_7 /* !! */  = var2_2;
                                                                                                        var8_8 = var3_3;
                                                                                                        var9_9 = var4_4;
                                                                                                        var10_10 = 0;
                                                                                                        var11_11 = null;
                                                                                                        var12_12 = this.d;
                                                                                                        if (var12_12 == null) {
                                                                                                            return;
                                                                                                        }
                                                                                                        var13_13 = this.b;
                                                                                                        var14_14 = var13_13.c9();
                                                                                                        var15_15 = "parentView";
                                                                                                        if (var14_14 == 0) {
                                                                                                            if (var12_12 == null) {
                                                                                                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                                                                                                                var14_14 = 0;
                                                                                                                var16_16 = null;
                                                                                                            } else {
                                                                                                                var16_16 = var12_12;
                                                                                                            }
                                                                                                            var17_17 = R$id.oos_tv;
                                                                                                            var16_16 = (AjioTextView)var16_16.findViewById(var17_17);
                                                                                                            var17_17 = (int)var13_13.S5();
                                                                                                            if (var17_17 == 0) {
                                                                                                                var19_19 /* !! */  = Looper.getMainLooper();
                                                                                                                var18_18 = new Handler(var19_19 /* !! */ );
                                                                                                                var19_19 /* !! */  = new wy2_0(0, var5_5, var16_16);
                                                                                                                var20_20 = var15_15;
                                                                                                                var21_21 = 100;
                                                                                                                var18_18.postDelayed((Runnable)var19_19 /* !! */ , var21_21);
                                                                                                                if (var16_16 != null) {
                                                                                                                    var16_16.setVisibility(0);
                                                                                                                    var23_22 = Unit.a;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var20_20 = var15_15;
                                                                                                                if (var16_16 != null) {
                                                                                                                    var24_23 = 8;
                                                                                                                    var25_24 = 1.1E-44f;
                                                                                                                    var16_16.setVisibility(var24_23);
                                                                                                                    var23_22 = Unit.a;
                                                                                                                }
                                                                                                            }
                                                                                                            var23_22 = h40_0.a;
                                                                                                            var24_23 = (int)h40_0.W0();
                                                                                                            if (var24_23 != 0) {
                                                                                                                var23_22 = hv3_0.a;
                                                                                                                var15_15 = var13_13.x5();
                                                                                                                var23_22.getClass();
                                                                                                                var24_23 = (int)hv3_0.V((Product)var15_15);
                                                                                                                if (var24_23 != 0 && var16_16 != null) {
                                                                                                                    var24_23 = 8;
                                                                                                                    var25_24 = 1.1E-44f;
                                                                                                                    var16_16.setVisibility(var24_23);
                                                                                                                    var16_16 = Unit.a;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            var20_20 = var15_15;
                                                                                                        }
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var14_14 = 0;
                                                                                                            var16_16 = null;
                                                                                                        } else {
                                                                                                            var16_16 = var12_12;
                                                                                                        }
                                                                                                        var24_23 = R$id.row_pdp_tv_exclusive;
                                                                                                        var16_16 = (AjioTextView)var16_16.findViewById(var24_23);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var24_23 = 0;
                                                                                                            var25_24 = 0.0f;
                                                                                                            var23_22 = null;
                                                                                                        } else {
                                                                                                            var23_22 = var12_12;
                                                                                                        }
                                                                                                        var26_25 = R$id.color_layout;
                                                                                                        var23_22 = (LinearLayout)var23_22.findViewById(var26_25);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var26_25 = 0;
                                                                                                            var27_26 = 0.0f;
                                                                                                            var15_15 = null;
                                                                                                        } else {
                                                                                                            var15_15 = var12_12;
                                                                                                        }
                                                                                                        var17_17 = R$id.number_of_colors;
                                                                                                        var15_15 = (AjioTextView)var15_15.findViewById(var17_17);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var17_17 = 0;
                                                                                                            var18_18 = null;
                                                                                                        } else {
                                                                                                            var18_18 = var12_12;
                                                                                                        }
                                                                                                        var28_27 = R$id.row_pdp_discount;
                                                                                                        var18_18 = (TextView)var18_18.findViewById(var28_27);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var28_27 = 0;
                                                                                                            var19_19 /* !! */  = null;
                                                                                                        } else {
                                                                                                            var19_19 /* !! */  = var12_12;
                                                                                                        }
                                                                                                        var29_28 = R$id.row_pdp_discount_container;
                                                                                                        var30_29 /* !! */  = (LinearLayout)var19_19 /* !! */ .findViewById(var29_28);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var28_27 = 0;
                                                                                                            var19_19 /* !! */  = null;
                                                                                                        } else {
                                                                                                            var19_19 /* !! */  = var12_12;
                                                                                                        }
                                                                                                        var31_30 = R$id.brand_name;
                                                                                                        var19_19 /* !! */  = (AjioTextView)var19_19 /* !! */ .findViewById(var31_30);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var10_10 = R$id.product_name;
                                                                                                        var11_11 = (AjioTextView)var33_32.findViewById(var10_10);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var34_33 = R$id.product_price;
                                                                                                        var35_34 = (TextView)var33_32.findViewById(var34_33);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var36_35 = var30_29 /* !! */ ;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                            var36_35 = var30_29 /* !! */ ;
                                                                                                        }
                                                                                                        var29_28 = R$id.product_disc_price;
                                                                                                        var30_29 /* !! */  = (TextView)var33_32.findViewById(var29_28);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var37_36 = var18_18;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                            var37_36 = var18_18;
                                                                                                        }
                                                                                                        var17_17 = R$id.product_mrp_text;
                                                                                                        var18_18 = (TextView)var33_32.findViewById(var17_17);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var38_37 = var18_18;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                            var38_37 = var18_18;
                                                                                                        }
                                                                                                        var17_17 = R$id.product_mrp_text_no_discount;
                                                                                                        var18_18 = (TextView)var33_32.findViewById(var17_17);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var39_38 = var18_18;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                            var39_38 = var18_18;
                                                                                                        }
                                                                                                        var17_17 = R$id.product_disc_percentage_off;
                                                                                                        var18_18 = (TextView)var33_32.findViewById(var17_17);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var40_39 = var18_18;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                            var40_39 = var18_18;
                                                                                                        }
                                                                                                        var17_17 = R$id.product_price_gst_tv;
                                                                                                        var18_18 = (AjioTextView)var33_32.findViewById(var17_17);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var41_40 = var30_29 /* !! */ ;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                            var41_40 = var30_29 /* !! */ ;
                                                                                                        }
                                                                                                        var29_28 = R$id.sale_imv;
                                                                                                        var30_29 /* !! */  = (ImageView)var33_32.findViewById(var29_28);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var42_41 = R$id.sale_bg_strip;
                                                                                                        var9_9 = var33_32.findViewById(var42_41);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var43_42 = R$id.selling_fast_tag;
                                                                                                        var8_8 = (TextView)var33_32.findViewById(var43_42);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var44_43 = var8_8;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var44_43 = var8_8;
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var43_42 = R$id.free_delivery_tag;
                                                                                                        var8_8 = (AjioTextView)var33_32.findViewById(var43_42);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var45_44 = var8_8;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var45_44 = var8_8;
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var43_42 = R$id.txt_discover_brand;
                                                                                                        var8_8 = (TextView)var33_32.findViewById(var43_42);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var46_45 /* !! */  = var16_16;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                            var46_45 /* !! */  = var16_16;
                                                                                                        }
                                                                                                        var14_14 = R$id.freebies_lyt;
                                                                                                        var16_16 = (ConstraintLayout)var33_32.findViewById(var14_14);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var47_46 = var11_11;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var47_46 = var11_11;
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var10_10 = R$id.freebies_text;
                                                                                                        var11_11 = (TextView)var33_32.findViewById(var10_10);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        } else {
                                                                                                            var33_32 = var12_12;
                                                                                                        }
                                                                                                        var48_47 = R$id.giftIcon;
                                                                                                        var7_7 /* !! */  = (ImageView)var33_32.findViewById(var48_47);
                                                                                                        var5_5.x((ConstraintLayout)var16_16, (ImageView)var7_7 /* !! */ , (TextView)var11_11);
                                                                                                        if (var16_16 != null) {
                                                                                                            var16_16.setOnClickListener((View.OnClickListener)var5_5);
                                                                                                            var7_7 /* !! */  = Unit.a;
                                                                                                        }
                                                                                                        if (var8_8 != null) {
                                                                                                            var8_8.setOnClickListener((View.OnClickListener)var5_5);
                                                                                                            var7_7 /* !! */  = Unit.a;
                                                                                                        }
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var48_47 = 0;
                                                                                                            var7_7 /* !! */  = null;
                                                                                                        } else {
                                                                                                            var7_7 /* !! */  = var12_12;
                                                                                                        }
                                                                                                        var10_10 = R$id.rating_container;
                                                                                                        var7_7 /* !! */  = var7_7 /* !! */ .findViewById(var10_10);
                                                                                                        var5_5.h = var7_7 /* !! */ ;
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var48_47 = 0;
                                                                                                            var7_7 /* !! */  = null;
                                                                                                        } else {
                                                                                                            var7_7 /* !! */  = var12_12;
                                                                                                        }
                                                                                                        var10_10 = R$id.new_rating_container;
                                                                                                        var7_7 /* !! */  = (ConstraintLayout)var7_7 /* !! */ .findViewById(var10_10);
                                                                                                        var5_5.i = var7_7 /* !! */ ;
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var48_47 = 0;
                                                                                                            var7_7 /* !! */  = null;
                                                                                                        } else {
                                                                                                            var7_7 /* !! */  = var12_12;
                                                                                                        }
                                                                                                        var10_10 = R$id.ratings_value;
                                                                                                        var7_7 /* !! */  = (TextView)var7_7 /* !! */ .findViewById(var10_10);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var48_47 = 0;
                                                                                                            var7_7 /* !! */  = null;
                                                                                                        } else {
                                                                                                            var7_7 /* !! */  = var12_12;
                                                                                                        }
                                                                                                        var10_10 = R$id.ratings_count;
                                                                                                        var7_7 /* !! */  = (TextView)var7_7 /* !! */ .findViewById(var10_10);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var48_47 = 0;
                                                                                                            var7_7 /* !! */  = null;
                                                                                                        } else {
                                                                                                            var7_7 /* !! */  = var12_12;
                                                                                                        }
                                                                                                        var10_10 = R$id.layout_tag_ajiogram;
                                                                                                        var7_7 /* !! */  = (LinearLayout)var7_7 /* !! */ .findViewById(var10_10);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var10_10 = 0;
                                                                                                            var11_11 = null;
                                                                                                        } else {
                                                                                                            var11_11 = var12_12;
                                                                                                        }
                                                                                                        var14_14 = R$id.iv_tag_ajiogram;
                                                                                                        var11_11 = (ImageView)var11_11.findViewById(var14_14);
                                                                                                        if (var12_12 == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                                                            var14_14 = 0;
                                                                                                            var16_16 = null;
                                                                                                        } else {
                                                                                                            var16_16 = var12_12;
                                                                                                        }
                                                                                                        var31_30 = R$id.tv_tag_ajiogram;
                                                                                                        var16_16 = (TextView)var16_16.findViewById(var31_30);
                                                                                                        var33_32 = var13_13.F7();
                                                                                                        if (var33_32 == null) ** GOTO lbl350
                                                                                                        var33_32 = var13_13.F7();
                                                                                                        if (var33_32 != null) {
                                                                                                            var31_30 = var33_32.size();
                                                                                                            var49_48 = var12_12;
                                                                                                            var50_49 = 1;
                                                                                                        } else {
                                                                                                            var49_48 = var12_12;
                                                                                                            var50_49 = 1;
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                        }
                                                                                                        if (var31_30 >= var50_49 && (var12_12 = var13_13.F7()) != null) {
                                                                                                            var31_30 = 0;
                                                                                                            var32_31 = 0.0f;
                                                                                                            var33_32 = null;
                                                                                                            var12_12 = (ProductPromotion)var12_12.get(0);
                                                                                                        } else lbl-1000:
                                                                                                        // 2 sources

                                                                                                        {
                                                                                                            while (true) {
                                                                                                                var50_49 = 0;
                                                                                                                var12_12 = null;
                                                                                                                break block301;
                                                                                                                break;
                                                                                                            }
lbl350:
                                                                                                            // 1 sources

                                                                                                            var49_48 = var12_12;
                                                                                                            ** continue;
                                                                                                        }
                                                                                                    }
                                                                                                    var33_32 = tr2_2.a;
                                                                                                    var31_30 = (int)tr2_2.j(var13_13.c9());
                                                                                                    if (var31_30 == 0 && (var31_30 = (int)tr2_2.m()) == 0) ** GOTO lbl-1000
                                                                                                    if (var12_12 == null) break block308;
                                                                                                    var32_31 = var12_12.getMaxSavingPrice();
                                                                                                    cfr_temp_0 = var32_31 - 0.0f;
                                                                                                    var31_30 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                                                                                    if (var31_30 == 0) {
                                                                                                        var31_30 = 1;
                                                                                                        var32_31 = 1.4E-45f;
                                                                                                    } else {
                                                                                                        var31_30 = 0;
                                                                                                        var32_31 = 0.0f;
                                                                                                        var33_32 = null;
                                                                                                    }
                                                                                                    if (var31_30 != 0) break block309;
                                                                                                }
                                                                                                if (var12_12 != null) ** GOTO lbl-1000
                                                                                            }
                                                                                            if ((var50_49 = (int)var13_13.u7()) == 0 && (var50_49 = (int)var13_13.S5()) != 0) {
                                                                                                var50_49 = (int)tr2_2.m();
                                                                                                Intrinsics.checkNotNull(var9_9);
                                                                                                ai0_2.B((View)var9_9);
                                                                                                var31_30 = (int)tr2_2.m();
                                                                                                var33_32 = var31_30 != 0 ? tr2_2.a() : tr2_2.d().i;
                                                                                                var51_50 = var13_13.c9();
                                                                                                if (!var51_50) {
                                                                                                    var31_30 = Color.parseColor((String)var33_32);
                                                                                                    var9_9.setBackgroundColor(var31_30);
                                                                                                }
                                                                                                Intrinsics.checkNotNull(var30_29 /* !! */ );
                                                                                                ai0_2.B((View)var30_29 /* !! */ );
                                                                                                var9_9 = var50_49 != 0 ? tr2_2.c() : tr2_2.d().q;
                                                                                                var12_12 = new da$a();
                                                                                                var31_30 = 1;
                                                                                                var12_12.k = var31_30;
                                                                                                var12_12.r = var31_30;
                                                                                                var33_32 = hv3_0.K(R$string.acc_banner);
                                                                                                var12_12.b((String)var33_32);
                                                                                                var12_12.n = var9_9;
                                                                                                var12_12.u = var30_29 /* !! */ ;
                                                                                                var12_12.a();
                                                                                                var9_9 = var35_34.getLayoutParams();
                                                                                                var12_12 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                                                                                                Intrinsics.checkNotNull(var9_9, (String)var12_12);
                                                                                                var9_9 = (ConstraintLayout$LayoutParams)var9_9;
                                                                                                var29_28 = 1092616192;
                                                                                                var52_51 = 10.0f;
                                                                                                var32_31 = hv3_0.x(var52_51);
                                                                                                var31_30 = (int)var32_31;
                                                                                                var9_9.setMarginStart(var31_30);
                                                                                                var9_9 = var18_18.getLayoutParams();
                                                                                                Intrinsics.checkNotNull(var9_9, (String)var12_12);
                                                                                                var9_9 = (ConstraintLayout$LayoutParams)var9_9;
                                                                                                var50_49 = (int)hv3_0.x(var52_51);
                                                                                                var9_9.setMarginStart(var50_49);
                                                                                                var53_52 = hv3_0.x(5.0f);
                                                                                                var42_41 = (int)var53_52;
                                                                                                var50_49 = 0;
                                                                                                var12_12 = null;
                                                                                                var18_18.setPadding(0, var42_41, 0, 0);
                                                                                            } else lbl-1000:
                                                                                            // 3 sources

                                                                                            {
                                                                                                Intrinsics.checkNotNull(var9_9);
                                                                                                ai0_2.i((View)var9_9);
                                                                                                Intrinsics.checkNotNull(var30_29 /* !! */ );
                                                                                                ai0_2.i((View)var30_29 /* !! */ );
                                                                                            }
                                                                                            var9_9 = var13_13.Y4();
                                                                                            if (var9_9 != null && (var50_49 = (int)var9_9.isEmpty()) == 0) {
                                                                                                var50_49 = 0;
                                                                                                var12_12 = null;
                                                                                            } else {
                                                                                                var50_49 = 1;
                                                                                            }
                                                                                            var29_28 = (int)var5_5.j;
                                                                                            if (var50_49 != 0) ** GOTO lbl443
                                                                                            var50_49 = var9_9.size();
                                                                                            var31_30 = 1;
                                                                                            var32_31 = 1.4E-45f;
                                                                                            if (var50_49 <= var31_30) ** GOTO lbl443
                                                                                            var50_49 = (int)var13_13.Ia();
                                                                                            if (var50_49 != 0 && (var50_49 = (int)var13_13.u7()) == 0 && var29_28 == 0) {
                                                                                                var12_12 = h40_0.a;
                                                                                                var50_49 = (int)h40_0.e0();
                                                                                                if (var50_49 != 0 && (var50_49 = (int)var13_13.S5()) == 0) {
                                                                                                    var42_41 = 8;
                                                                                                    var53_52 = 1.1E-44f;
                                                                                                    if (var23_22 != null) {
                                                                                                        var23_22.setVisibility(var42_41);
                                                                                                        var12_12 = Unit.a;
                                                                                                    }
                                                                                                    if (var15_15 != null) {
                                                                                                        var15_15.setVisibility(var42_41);
                                                                                                        var9_9 = Unit.a;
                                                                                                    }
lbl443:
                                                                                                    // 5 sources

                                                                                                    var54_53 = var35_34;
                                                                                                    var55_54 /* !! */  = var18_18;
                                                                                                } else {
                                                                                                    if (var23_22 != null) {
                                                                                                        var50_49 = 0;
                                                                                                        var23_22.setVisibility(0);
                                                                                                        var12_12 = Unit.a;
                                                                                                    }
                                                                                                    if (var23_22 != null) {
                                                                                                        var23_22.removeAllViews();
                                                                                                        var12_12 = Unit.a;
                                                                                                    }
                                                                                                    if (var23_22 != null) {
                                                                                                        var23_22.setOnClickListener((View.OnClickListener)var5_5);
                                                                                                        var12_12 = Unit.a;
                                                                                                    }
                                                                                                    if (var15_15 != null) {
                                                                                                        var15_15.setOnClickListener((View.OnClickListener)var5_5);
                                                                                                        var12_12 = Unit.a;
                                                                                                    }
                                                                                                    if (var15_15 != null) {
                                                                                                        var50_49 = 0;
                                                                                                        var15_15.setVisibility(0);
                                                                                                        var12_12 = Unit.a;
                                                                                                    }
                                                                                                    if ((var50_49 = (int)var13_13.c9()) != 0) {
                                                                                                        var31_30 = var9_9.size();
                                                                                                        var55_54 /* !! */  = var18_18;
                                                                                                        var18_18 = UX.a(var31_30, " Colors");
                                                                                                        var12_12 = new SpannableString((CharSequence)var18_18);
                                                                                                        var18_18 = new UnderlineSpan();
                                                                                                        var31_30 = var12_12.length();
                                                                                                        var54_53 = var35_34;
                                                                                                        var34_33 = 18;
                                                                                                        var56_55 = 0;
                                                                                                        var57_56 = 0.0f;
                                                                                                        var5_5 = null;
                                                                                                        var12_12.setSpan((Object)var18_18, 0, var31_30, var34_33);
                                                                                                        if (var15_15 != null) {
                                                                                                            var15_15.setText((CharSequence)var12_12);
                                                                                                            var5_5 = Unit.a;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var54_53 = var35_34;
                                                                                                        var55_54 /* !! */  = var18_18;
                                                                                                        AJIOApplication.Companion.getClass();
                                                                                                        var5_5 = AJIOApplication$a.a();
                                                                                                        var34_33 = R$font.muli_bold;
                                                                                                        var5_5 = WK2.c(var34_33, (Context)var5_5);
                                                                                                        if (var15_15 != null) {
                                                                                                            var15_15.setTypeface((Typeface)var5_5);
                                                                                                            var5_5 = Unit.a;
                                                                                                        }
                                                                                                        if (var15_15 != null) {
                                                                                                            var56_55 = var9_9.size();
                                                                                                            var35_34 = new StringBuilder();
                                                                                                            var35_34.append(var56_55);
                                                                                                            var35_34.append(" colors");
                                                                                                            var5_5 = var35_34.toString();
                                                                                                            var15_15.setText((CharSequence)var5_5);
                                                                                                            var5_5 = Unit.a;
                                                                                                        }
                                                                                                    }
                                                                                                    if ((var56_55 = var9_9.size()) <= (var34_33 = 5)) {
                                                                                                        var34_33 = var9_9.size();
                                                                                                    }
                                                                                                    var57_56 = 0.0f;
                                                                                                    var5_5 = null;
                                                                                                    for (var56_55 = 0; var56_55 < var34_33; ++var56_55) {
                                                                                                        var12_12 = var9_9.get(var56_55);
                                                                                                        var15_15 = "get(...)";
                                                                                                        Intrinsics.checkNotNullExpressionValue(var12_12, (String)var15_15);
                                                                                                        var12_12 = (ProductOptionVariant)var12_12;
                                                                                                        if (var23_22 != null) {
                                                                                                            var15_15 = var23_22.getContext();
                                                                                                        } else {
                                                                                                            var26_25 = 0;
                                                                                                            var27_26 = 0.0f;
                                                                                                            var15_15 = null;
                                                                                                        }
                                                                                                        var15_15 = LayoutInflater.from((Context)var15_15);
                                                                                                        var17_17 = R$layout.pdp_color_view_luxe;
                                                                                                        var31_30 = 0;
                                                                                                        var32_31 = 0.0f;
                                                                                                        var33_32 = null;
                                                                                                        var15_15 = var15_15.inflate(var17_17, (ViewGroup)var23_22, false);
                                                                                                        if (var56_55 > 0) {
                                                                                                            var18_18 = var15_15.getLayoutParams();
                                                                                                            Intrinsics.checkNotNull(var18_18, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                                                                                            var18_18 = (LinearLayout.LayoutParams)var18_18;
                                                                                                            var33_32 = hv3_0.C().getDisplayMetrics();
                                                                                                            var32_31 = var33_32.density;
                                                                                                            var58_57 = 30.0f;
                                                                                                            var32_31 = var58_57 / var32_31;
                                                                                                            var31_30 = -((int)var32_31);
                                                                                                            var59_58 = var34_33;
                                                                                                            var34_33 = 0;
                                                                                                            var35_34 = null;
                                                                                                            var18_18.setMargins(var31_30, 0, 0, 0);
                                                                                                            var15_15.setLayoutParams((ViewGroup.LayoutParams)var18_18);
lbl535:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                continue;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var59_58 = var34_33;
                                                                                                        var34_33 = 0;
                                                                                                        var35_34 = null;
                                                                                                        ** continue;
                                                                                                        var17_17 = 1;
                                                                                                        var15_15.setDuplicateParentStateEnabled((boolean)var17_17);
                                                                                                        var15_15.setClickable(false);
                                                                                                        var31_30 = R$id.row_product_detail_imv_color;
                                                                                                        var33_32 = (ImageView)var15_15.findViewById(var31_30);
                                                                                                        var33_32.setClickable(false);
                                                                                                        var33_32.setDuplicateParentStateEnabled((boolean)var17_17);
                                                                                                        var35_34 = new da$a();
                                                                                                        var35_34.k = var17_17;
                                                                                                        var35_34.a = var17_17 = R$drawable.component_placeholder;
                                                                                                        var35_34.b = var17_17;
                                                                                                        var17_17 = 1;
                                                                                                        var35_34.g = var17_17;
                                                                                                        var35_34.h = var17_17;
                                                                                                        var12_12 = var12_12.getSwatchImage();
                                                                                                        if (var12_12 != null) {
                                                                                                            var12_12 = var12_12.getUrl();
                                                                                                        } else {
                                                                                                            var50_49 = 0;
                                                                                                            var12_12 = null;
                                                                                                        }
                                                                                                        var35_34.n = var12_12;
                                                                                                        var35_34.u = var33_32;
                                                                                                        var35_34.a();
                                                                                                        if (var23_22 != null) {
                                                                                                            var23_22.addView((View)var15_15);
                                                                                                            var35_34 = Unit.a;
                                                                                                        }
                                                                                                        var34_33 = var59_58;
                                                                                                    }
                                                                                                    if (var23_22 != null) {
                                                                                                        var56_55 = var9_9.size();
                                                                                                        var9_9 = new StringBuilder();
                                                                                                        var9_9.append(var56_55);
                                                                                                        var9_9.append(" colors on product details page");
                                                                                                        var5_5 = var9_9.toString();
                                                                                                        var23_22.setContentDescription((CharSequence)var5_5);
                                                                                                        var5_5 = Unit.a;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var54_53 = var35_34;
                                                                                                var55_54 /* !! */  = var18_18;
                                                                                                var56_55 = 8;
                                                                                                var57_56 = 1.1E-44f;
                                                                                                if (var23_22 != null) {
                                                                                                    var23_22.setVisibility(var56_55);
                                                                                                    var9_9 = Unit.a;
                                                                                                }
                                                                                                if (var15_15 != null) {
                                                                                                    var15_15.setVisibility(var56_55);
                                                                                                    var5_5 = Unit.a;
                                                                                                }
                                                                                            }
                                                                                            if (var29_28 != 0 && (var5_5 = var13_13.P4()) != null && (var5_5 = var5_5.getBrand()) != null) {
                                                                                                if (var8_8 != null) {
                                                                                                    var56_55 = 0;
                                                                                                    var57_56 = 0.0f;
                                                                                                    var8_8.setVisibility(0);
                                                                                                    var5_5 = Unit.a;
                                                                                                }
                                                                                                var5_5 = Unit.a;
                                                                                            }
                                                                                            if ((var56_55 = var13_13.M1()) == 0) break block310;
                                                                                            var5_5 = h40_0.a;
                                                                                            var56_55 = h40_0.m1();
                                                                                            if (var56_55 == 0) break block310;
                                                                                            var5_5 = h40_0.f();
                                                                                            if (var5_5 == null || (var8_8 = var5_5.getTag_text()) == null) ** GOTO lbl-1000
                                                                                            var42_41 = var8_8.length();
                                                                                            if (var42_41 > 0) {
                                                                                                var42_41 = 1;
                                                                                                var53_52 = 1.4E-45f;
                                                                                            } else {
                                                                                                var42_41 = 0;
                                                                                                var53_52 = 0.0f;
                                                                                                var9_9 = null;
                                                                                            }
                                                                                            if (var42_41 == 0) {
                                                                                                var43_42 = 0;
                                                                                                var60_59 = 0.0f;
                                                                                                var8_8 = null;
                                                                                            }
                                                                                            if (var8_8 != null) {
                                                                                                if (var16_16 != null) {
                                                                                                    var16_16.setText((CharSequence)var8_8);
                                                                                                    var8_8 = Unit.a;
                                                                                                }
                                                                                                var8_8 = Unit.a;
                                                                                            } else if (var16_16 != null) {
                                                                                                ai0_2.i((View)var16_16);
                                                                                                var8_8 = Unit.a;
                                                                                            }
                                                                                            if (var5_5 != null) {
                                                                                                block303: {
                                                                                                    var8_8 = var5_5.getTag_bg_color();
                                                                                                    if (var8_8 == null) break block302;
                                                                                                    if (var7_7 /* !! */  == null) break block303;
                                                                                                    var43_42 = Color.parseColor((String)var8_8);
                                                                                                    var8_8 = ColorStateList.valueOf((int)var43_42);
                                                                                                    var7_7 /* !! */ .setBackgroundTintList((ColorStateList)var8_8);
                                                                                                    var8_8 = Unit.a;
                                                                                                }
                                                                                                var8_8 = Unit.a;
                                                                                            }
                                                                                        }
                                                                                        if (var5_5 == null) break block304;
                                                                                        var8_8 = var5_5.getTag_text_color();
                                                                                        if (var8_8 == null || var16_16 == null) break block304;
                                                                                        var43_42 = Color.parseColor((String)var8_8);
                                                                                        try {
                                                                                            var16_16.setTextColor(var43_42);
                                                                                            var8_8 = Unit.a;
                                                                                        }
                                                                                        catch (Exception v0) {
                                                                                            var8_8 = Unit.a;
                                                                                        }
                                                                                    }
                                                                                    if (var5_5 == null || (var5_5 = var5_5.getTag_image()) == null) break block311;
                                                                                    var43_42 = var5_5.length();
                                                                                    if (var43_42 > 0) {
                                                                                        var43_42 = 1;
                                                                                        var60_59 = 1.4E-45f;
                                                                                    } else {
                                                                                        var43_42 = 0;
                                                                                        var60_59 = 0.0f;
                                                                                        var8_8 = null;
                                                                                    }
                                                                                    if (var43_42 == 0) {
                                                                                        var56_55 = 0;
                                                                                        var57_56 = 0.0f;
                                                                                        var5_5 = null;
                                                                                    }
                                                                                    if (var5_5 == null) break block311;
                                                                                    if (var11_11 != null) {
                                                                                        cp_1.Companion.getClass();
                                                                                        cp$a.e().getClass();
                                                                                        var8_8 = ".gif";
                                                                                        var9_9 = null;
                                                                                        var43_42 = (int)StringsKt.F((CharSequence)var5_5, (CharSequence)var8_8, false);
                                                                                        var42_41 = 1;
                                                                                        var53_52 = 1.4E-45f;
                                                                                        if (var43_42 == var42_41) {
                                                                                            var43_42 = 1;
                                                                                            var60_59 = 1.4E-45f;
                                                                                        } else {
                                                                                            var43_42 = 0;
                                                                                            var60_59 = 0.0f;
                                                                                            var8_8 = null;
                                                                                        }
                                                                                        if (var43_42 != 0) {
                                                                                            var8_8 = da_2.Companion;
                                                                                            var8_8.getClass();
                                                                                            da$b.c((ImageView)var11_11, (String)var5_5);
                                                                                        } else {
                                                                                            var8_8 = da_2.Companion;
                                                                                            var8_8.getClass();
                                                                                            da$b.d((ImageView)var11_11, (String)var5_5);
                                                                                        }
                                                                                        var5_5 = Unit.a;
                                                                                    } else {
                                                                                        var56_55 = 0;
                                                                                        var57_56 = 0.0f;
                                                                                        var5_5 = null;
                                                                                    }
                                                                                    if (var5_5 != null) break block312;
                                                                                }
                                                                                if (var11_11 != null) {
                                                                                    ai0_2.i((View)var11_11);
                                                                                    var5_5 = Unit.a;
                                                                                }
                                                                            }
                                                                            if (var16_16 == null) ** GOTO lbl728
                                                                            var56_55 = var16_16.getVisibility();
                                                                            if (var56_55 == 0) {
                                                                                var56_55 = 1;
                                                                                var57_56 = 1.4E-45f;
lbl711:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var56_55 = 0;
                                                                            var57_56 = 0.0f;
                                                                            var5_5 = null;
                                                                            ** while (true)
                                                                            var43_42 = 1;
                                                                            var60_59 = 1.4E-45f;
                                                                            if (var56_55 == var43_42) {
                                                                                var56_55 = 1;
                                                                                var57_56 = 1.4E-45f;
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                while (true) {
                                                                                    var56_55 = 0;
                                                                                    var57_56 = 0.0f;
                                                                                    var5_5 = null;
                                                                                    break block305;
                                                                                    break;
                                                                                }
lbl728:
                                                                                // 1 sources

                                                                                var43_42 = 1;
                                                                                var60_59 = 1.4E-45f;
                                                                                ** continue;
                                                                            }
                                                                        }
                                                                        if (var56_55 != 0) ** GOTO lbl-1000
                                                                        if (var11_11 == null) ** GOTO lbl-1000
                                                                        var56_55 = var11_11.getVisibility();
                                                                        if (var56_55 == 0) {
                                                                            var56_55 = 1;
                                                                            var57_56 = 1.4E-45f;
                                                                        } else {
                                                                            var56_55 = 0;
                                                                            var57_56 = 0.0f;
                                                                            var5_5 = null;
                                                                        }
                                                                        if (var56_55 == var43_42) {
                                                                            var56_55 = 1;
                                                                            var57_56 = 1.4E-45f;
                                                                        } else lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var56_55 = 0;
                                                                            var57_56 = 0.0f;
                                                                            var5_5 = null;
                                                                        }
                                                                        if (var56_55 == 0) {
                                                                            if (var7_7 /* !! */  != null) {
                                                                                ai0_2.i((View)var7_7 /* !! */ );
                                                                                var5_5 = Unit.a;
                                                                            }
                                                                        } else if (var7_7 /* !! */  != null) {
                                                                            ai0_2.B((View)var7_7 /* !! */ );
                                                                            var5_5 = Unit.a;
                                                                        }
                                                                        break block313;
                                                                    }
                                                                    if (var7_7 /* !! */  != null) {
                                                                        ai0_2.i((View)var7_7 /* !! */ );
                                                                        var5_5 = Unit.a;
                                                                    }
                                                                }
                                                                if (var6_6 != null && (var56_55 = var1_1.length()) != 0) {
                                                                    var56_55 = 0;
                                                                    var57_56 = 0.0f;
                                                                    var5_5 = null;
                                                                } else {
                                                                    var56_55 = 1;
                                                                    var57_56 = 1.4E-45f;
                                                                }
                                                                if (var56_55 == 0) {
                                                                    if (var19_19 /* !! */  != null) {
                                                                        var19_19 /* !! */ .setText((CharSequence)var6_6);
                                                                        var5_5 = Unit.a;
                                                                    }
lbl774:
                                                                    // 5 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var19_19 /* !! */  == null) ** GOTO lbl774
                                                                var56_55 = 8;
                                                                var57_56 = 1.1E-44f;
                                                                var19_19 /* !! */ .setVisibility(var56_55);
                                                                var5_5 = Unit.a;
                                                                ** while (true)
                                                                var5_5 = var2_2;
                                                                if (var2_2 != null && (var61_60 = var2_2.length()) != 0) {
                                                                    var61_60 = 0;
                                                                    var62_61 = 0.0f;
                                                                    var6_6 = null;
                                                                } else {
                                                                    var61_60 = 1;
                                                                    var62_61 = 1.4E-45f;
                                                                }
                                                                if (var61_60 == 0) {
                                                                    var61_60 = (int)var13_13.r5();
                                                                    var7_7 /* !! */  = " | ";
                                                                    if (var61_60 != 0) {
                                                                        var6_6 = var13_13.k3();
                                                                        if (var6_6 != null && (var61_60 = var6_6.length()) != 0) {
                                                                            var61_60 = 0;
                                                                            var62_61 = 0.0f;
                                                                            var6_6 = null;
                                                                        } else {
                                                                            var61_60 = 1;
                                                                            var62_61 = 1.4E-45f;
                                                                        }
                                                                        if (var61_60 == 0) {
                                                                            var6_6 = var13_13.k3();
                                                                            var5_5 = n1.a((String)var5_5, (String)var7_7 /* !! */ , (String)var6_6);
                                                                        }
                                                                    }
                                                                    if ((var61_60 = (int)var13_13.m4()) != 0) {
                                                                        var6_6 = var13_13.R5();
                                                                        if (var6_6 != null && (var61_60 = var6_6.length()) != 0) {
                                                                            var61_60 = 0;
                                                                            var62_61 = 0.0f;
                                                                            var6_6 = null;
                                                                        } else {
                                                                            var61_60 = 1;
                                                                            var62_61 = 1.4E-45f;
                                                                        }
                                                                        if (var61_60 == 0) {
                                                                            var6_6 = var13_13.R5();
                                                                            var5_5 = n1.a((String)var5_5, (String)var7_7 /* !! */ , (String)var6_6);
                                                                        }
                                                                    }
                                                                    if (var47_46 != null) {
                                                                        var11_11 = var47_46;
                                                                        var47_46.setText((CharSequence)var5_5);
                                                                        var5_5 = Unit.a;
                                                                    }
                                                                    while (true) {
                                                                        var56_55 = 8;
                                                                        var57_56 = 1.1E-44f;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    var11_11 = var47_46;
                                                                    if (var47_46 == null) ** continue;
                                                                    var56_55 = 8;
                                                                    var57_56 = 1.1E-44f;
                                                                    var47_46.setVisibility(var56_55);
                                                                    var6_6 = Unit.a;
                                                                }
                                                                if (var46_45 /* !! */  != null) {
                                                                    var16_16 = var46_45 /* !! */ ;
                                                                    var46_45 /* !! */ .setVisibility(var56_55);
                                                                    var5_5 = Unit.a;
                                                                }
                                                                var5_5 = var3_3;
                                                                if (var3_3 != null) {
                                                                    var6_6 = var3_3.getValue();
                                                                } else {
                                                                    var61_60 = 0;
                                                                    var62_61 = 0.0f;
                                                                    var6_6 = null;
                                                                }
                                                                var61_60 = (int)mz3_0.C((String)var6_6);
                                                                var7_7 /* !! */  = "";
                                                                if (var61_60 != 0) {
                                                                    if (var5_5 != null && (var6_6 = var3_3.getValue()) != null) {
                                                                        var62_61 = Float.parseFloat((String)var6_6);
                                                                        var6_6 = Float.valueOf(var62_61);
                                                                    } else {
                                                                        var61_60 = 0;
                                                                        var62_61 = 0.0f;
                                                                        var6_6 = null;
                                                                    }
                                                                    Intrinsics.checkNotNull(var6_6);
                                                                    var6_6 = qz2_0.x((Float)var6_6);
                                                                } else {
                                                                    var6_6 = var7_7 /* !! */ ;
                                                                }
                                                                var8_8 = h40_0.a;
                                                                var43_42 = (int)h40_0.C1();
                                                                if (var43_42 == 0 || (var43_42 = (int)var13_13.S5()) == 0) break block314;
                                                                var8_8 = var13_13.x9();
                                                                var42_41 = var8_8.length();
                                                                if (var42_41 > 0) {
                                                                    var42_41 = 1;
                                                                    var53_52 = 1.4E-45f;
                                                                } else {
                                                                    var42_41 = 0;
                                                                    var53_52 = 0.0f;
                                                                    var9_9 = null;
                                                                }
                                                                if (var42_41 != 0) {
                                                                    var9_9 = var44_43;
                                                                    var44_43.setText((CharSequence)var8_8);
                                                                    var43_42 = 0;
                                                                    var60_59 = 0.0f;
                                                                    var8_8 = null;
                                                                    var44_43.setVisibility(0);
lbl875:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var9_9 = var44_43;
                                                                var43_42 = 8;
                                                                var60_59 = 1.1E-44f;
                                                                var44_43.setVisibility(var43_42);
                                                                ** GOTO lbl875
                                                            }
                                                            var9_9 = var44_43;
                                                            var43_42 = 8;
                                                            var60_59 = 1.1E-44f;
                                                            var44_43.setVisibility(var43_42);
                                                            ** while (true)
                                                            var8_8 = this;
                                                            var35_34 = this.g;
                                                            var11_11 = this.f;
                                                            var12_12 = "format(...)";
                                                            var16_16 = var4_4;
                                                            if (var4_4 == null || var5_5 == null || (var23_22 = var4_4.getValue()) == null || (var23_22 = var3_3.getValue()) == null) break block315;
                                                            var23_22 = var4_4.getValue();
                                                            if (var23_22 != null) {
                                                                var25_24 = Float.parseFloat((String)var23_22);
                                                            } else {
                                                                var24_23 = 0;
                                                                var25_24 = 0.0f;
                                                                var23_22 = null;
                                                            }
                                                            var15_15 = var3_3.getValue();
                                                            if (var15_15 != null) {
                                                                var27_26 = Float.parseFloat((String)var15_15);
                                                            } else {
                                                                var26_25 = 0;
                                                                var27_26 = 0.0f;
                                                                var15_15 = null;
                                                            }
                                                            var24_23 = Float.compare(var25_24, var27_26);
                                                            if (var24_23 <= 0) break block315;
                                                            Intrinsics.checkNotNull(var41_40);
                                                            var30_29 /* !! */  = var41_40;
                                                            qz2_0.c((Price)var5_5, (Price)var16_16, (TextView)var41_40);
                                                            var23_22 = qz2_0.i(var3_3, var4_4);
                                                            var15_15 = var54_53;
                                                            if (var54_53 != null) {
                                                                var54_53.setText((CharSequence)var6_6);
                                                                var18_18 = Unit.a;
                                                            }
                                                            var18_18 = StringCompanionObject.INSTANCE;
                                                            if (var49_48 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                var17_17 = 0;
                                                                var18_18 = null;
                                                            } else {
                                                                var18_18 = var49_48;
                                                            }
                                                            var18_18 = var18_18.getContext();
                                                            var28_27 = R$string.acc_plp_final_price;
                                                            var18_18 = var18_18.getString(var28_27);
                                                            var19_19 /* !! */  = "getString(...)";
                                                            Intrinsics.checkNotNullExpressionValue(var18_18, (String)var19_19 /* !! */ );
                                                            var31_30 = 1;
                                                            var32_31 = 1.4E-45f;
                                                            var8_8 = new Object[var31_30];
                                                            var8_8[0] = var6_6;
                                                            He1.a((Object[])var8_8, var31_30, (String)var18_18, (String)var12_12, (TextView)var15_15);
                                                            var6_6 = var3_3.getValue();
                                                            if (var6_6 != null && (var8_8 = var4_4.getValue()) != null) {
                                                                var60_59 = Float.parseFloat((String)var8_8);
                                                                var62_61 = Float.parseFloat((String)var6_6);
                                                                var60_59 -= var62_61;
                                                                var6_6 = Unit.a;
                                                            } else {
                                                                var43_42 = 0;
                                                                var60_59 = 0.0f;
                                                                var8_8 = null;
                                                            }
                                                            var15_15 = var23_22.a;
                                                            var6_6 = new SpannableString((CharSequence)var15_15);
                                                            var15_15 = new StrikethroughSpan();
                                                            var17_17 = var6_6.length();
                                                            var31_30 = 33;
                                                            var32_31 = 4.6E-44f;
                                                            var14_14 = 0;
                                                            var16_16 = null;
                                                            var6_6.setSpan(var15_15, 0, var17_17, var31_30);
                                                            var30_29 /* !! */ .setText((CharSequence)var6_6);
                                                            if (var49_48 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                var61_60 = 0;
                                                                var62_61 = 0.0f;
                                                                var6_6 = null;
                                                            } else {
                                                                var6_6 = var49_48;
                                                            }
                                                            var6_6 = var6_6.getContext();
                                                            var14_14 = R$string.acc_plp_mrp;
                                                            var6_6 = var6_6.getString(var14_14);
                                                            Intrinsics.checkNotNullExpressionValue(var6_6, (String)var19_19 /* !! */ );
                                                            var16_16 = var23_22.a;
                                                            var26_25 = 1;
                                                            var27_26 = 1.4E-45f;
                                                            var18_18 = new Object[var26_25];
                                                            var31_30 = 0;
                                                            var32_31 = 0.0f;
                                                            var33_32 = null;
                                                            var18_18[0] = var16_16;
                                                            He1.a((Object[])var18_18, var26_25, (String)var6_6, (String)var12_12, (TextView)var30_29 /* !! */ );
                                                            var6_6 = z40_0.Companion;
                                                            var6_6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var6_6).a;
                                                            var61_60 = (int)var6_6.a("TD_Value_And_Percentage_Limit_PDP_MasterFlag");
                                                            var16_16 = " OFF";
                                                            if (var61_60 != 0) break block316;
                                                            var6_6 = var3_3.getDiscountPercent();
                                                            var61_60 = (int)TextUtils.isEmpty((CharSequence)var6_6);
                                                            if (var61_60 == 0) {
                                                                if (var40_39 != null) {
                                                                    var6_6 = var3_3.getDiscountPercent();
                                                                    var18_18 = var40_39;
                                                                    var40_39.setText((CharSequence)var6_6);
                                                                    var6_6 = Unit.a;
                                                                } else {
                                                                    var18_18 = var40_39;
                                                                }
                                                                if (var49_48 == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                    var49_48 = null;
                                                                }
                                                                var6_6 = var49_48.getContext();
                                                                var43_42 = R$string.acc_plp_discount_price;
                                                                var6_6 = var6_6.getString(var43_42);
                                                                Intrinsics.checkNotNullExpressionValue(var6_6, (String)var19_19 /* !! */ );
                                                                var8_8 = var3_3.getDiscountPercent();
                                                                var14_14 = 1;
                                                                var23_22 = new Object[var14_14];
                                                                var26_25 = 0;
                                                                var27_26 = 0.0f;
                                                                var15_15 = null;
                                                                var23_22[0] = var8_8;
                                                                He1.a((Object[])var23_22, var14_14, (String)var6_6, (String)var12_12, (TextView)var18_18);
                                                            } else {
                                                                var18_18 = var40_39;
                                                                var6_6 = var23_22.a();
                                                                var61_60 = (int)TextUtils.isEmpty((CharSequence)var6_6);
                                                                if (var61_60 == 0) {
                                                                    if (var40_39 != null) {
                                                                        var6_6 = var23_22.a();
                                                                        var8_8 = new StringBuilder();
                                                                        var8_8.append((String)var6_6);
                                                                        var8_8.append((String)var16_16);
                                                                        var6_6 = var8_8.toString();
                                                                        var40_39.setText((CharSequence)var6_6);
                                                                        var6_6 = Unit.a;
                                                                    }
                                                                    if (var49_48 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                        var49_48 = null;
                                                                    }
                                                                    var6_6 = var49_48.getContext();
                                                                    var43_42 = R$string.acc_plp_discount_price;
                                                                    var6_6 = var6_6.getString(var43_42);
                                                                    Intrinsics.checkNotNullExpressionValue(var6_6, (String)var19_19 /* !! */ );
                                                                    var8_8 = var23_22.a();
                                                                    var14_14 = 1;
                                                                    var23_22 = new Object[var14_14];
                                                                    var26_25 = 0;
                                                                    var27_26 = 0.0f;
                                                                    var15_15 = null;
                                                                    var23_22[0] = var8_8;
                                                                    He1.a((Object[])var23_22, var14_14, (String)var6_6, (String)var12_12, (TextView)var18_18);
                                                                } else if (var40_39 != null) {
                                                                    var40_39.setText((CharSequence)var7_7 /* !! */ );
                                                                    var6_6 = Unit.a;
                                                                }
                                                            }
                                                            break block317;
                                                        }
                                                        var18_18 = var40_39;
                                                        var6_6 = var3_3.getDiscountValue();
                                                        if (var6_6 != null) {
                                                            var62_61 = Float.parseFloat((String)var6_6);
                                                            var15_15 = Unit.a;
                                                        } else {
                                                            var61_60 = 0;
                                                            var62_61 = 0.0f;
                                                            var6_6 = null;
                                                        }
                                                        var15_15 = var3_3.getDiscountValue();
                                                        if (var15_15 == null) ** GOTO lbl-1000
                                                        cfr_temp_1 = var62_61 - 0.0f;
                                                        var26_25 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                                        if (var26_25 == 0) {
                                                            var26_25 = 1;
                                                            var27_26 = 1.4E-45f;
                                                        } else {
                                                            var26_25 = 0;
                                                            var27_26 = 0.0f;
                                                            var15_15 = null;
                                                        }
                                                        if (var26_25 != 0) ** GOTO lbl-1000
                                                        var15_15 = h40_0.K0();
                                                        var26_25 = (int)var15_15.has((String)(var30_29 /* !! */  = "totalDiscountPercentageMin"));
                                                        if (var26_25 != 0) {
                                                            var15_15 = h40_0.K0();
                                                            var26_25 = var15_15.getInt((String)var30_29 /* !! */ );
                                                        } else {
                                                            var26_25 = 30;
                                                            var27_26 = 4.2E-44f;
                                                        }
                                                        var27_26 = var26_25;
                                                        var61_60 = (int)(var62_61 == var27_26 ? 0 : (var62_61 < var27_26 ? -1 : 1));
                                                        if (var61_60 > 0) ** GOTO lbl-1000
                                                        cfr_temp_2 = var60_59 - 0.0f;
                                                        var61_60 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                                                        if (var61_60 == 0) {
                                                            var61_60 = 1;
                                                            var62_61 = 1.4E-45f;
                                                        } else {
                                                            var61_60 = 0;
                                                            var62_61 = 0.0f;
                                                            var6_6 = null;
                                                        }
                                                        if (var61_60 != 0) ** GOTO lbl-1000
                                                        var6_6 = h40_0.K0();
                                                        var61_60 = (int)var6_6.has((String)(var15_15 = "totalDiscountValue"));
                                                        if (var61_60 != 0) {
                                                            var6_6 = h40_0.K0();
                                                            var61_60 = var6_6.getInt((String)var15_15);
                                                        } else {
                                                            var61_60 = 1000;
                                                            var62_61 = 1.401E-42f;
                                                        }
                                                        var62_61 = var61_60;
                                                        var61_60 = (int)(var60_59 == var62_61 ? 0 : (var60_59 > var62_61 ? 1 : -1));
                                                        if (var61_60 >= 0) {
                                                            if (var18_18 != null) {
                                                                var6_6 = qz2_0.x(Float.valueOf(var60_59));
                                                                var16_16 = new StringBuilder();
                                                                var16_16.append((String)var6_6);
                                                                var16_16.append(" off");
                                                                var6_6 = var16_16.toString();
                                                                var18_18.setText((CharSequence)var6_6);
                                                                var6_6 = Unit.a;
                                                            }
                                                            if (var49_48 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                var49_48 = null;
                                                            }
                                                            var6_6 = var49_48.getContext();
                                                            var14_14 = R$string.acc_plp_discount_price;
                                                            var6_6 = var6_6.getString(var14_14);
                                                            Intrinsics.checkNotNullExpressionValue(var6_6, (String)var19_19 /* !! */ );
                                                            var8_8 = qz2_0.x(Float.valueOf(var60_59));
                                                            var14_14 = 1;
                                                            var23_22 = new Object[var14_14];
                                                            var26_25 = 0;
                                                            var27_26 = 0.0f;
                                                            var15_15 = null;
                                                            var23_22[0] = var8_8;
                                                            He1.a((Object[])var23_22, var14_14, (String)var6_6, (String)var12_12, (TextView)var18_18);
                                                            var6_6 = this.w();
                                                            var8_8 = var3_3.getDiscountValue();
                                                            if (var8_8 == null) {
                                                                var8_8 = var7_7 /* !! */ ;
                                                            }
                                                            var16_16 = "pdp_td";
                                                            var6_6.putString((String)var16_16, (String)var8_8);
                                                            var63_62 = var35_34.getEC_PRODUCT_DETAILS_INTERACTIONS();
                                                            var64_63 = var11_11.getPrevScreen();
                                                            var65_64 = var11_11.getPrevScreenType();
                                                            var66_65 = "pricing experiment eligible";
                                                            var67_66 = "";
                                                            var68_67 = "product_priceExperiment";
                                                            var69_68 = "pdp screen";
                                                            var70_69 = "pdp screen";
                                                            var71_70 = 1536;
                                                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var35_34, var63_62, var66_65, var67_66, var68_67, var69_68, var70_69, var64_63, (Bundle)var6_6, var65_64, false, null, var71_70, null);
                                                        } else if ((var61_60 = (int)TextUtils.isEmpty((CharSequence)(var6_6 = var3_3.getDiscountPercent()))) == 0) {
                                                            if (var18_18 != null) {
                                                                var6_6 = var3_3.getDiscountPercent();
                                                                var18_18.setText((CharSequence)var6_6);
                                                                var6_6 = Unit.a;
                                                            }
                                                            if (var49_48 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                var49_48 = null;
                                                            }
                                                            var6_6 = var49_48.getContext();
                                                            var43_42 = R$string.acc_plp_discount_price;
                                                            var6_6 = var6_6.getString(var43_42);
                                                            Intrinsics.checkNotNullExpressionValue(var6_6, (String)var19_19 /* !! */ );
                                                            var8_8 = var3_3.getDiscountPercent();
                                                            var14_14 = 1;
                                                            var23_22 = new Object[var14_14];
                                                            var26_25 = 0;
                                                            var27_26 = 0.0f;
                                                            var15_15 = null;
                                                            var23_22[0] = var8_8;
                                                            He1.a((Object[])var23_22, var14_14, (String)var6_6, (String)var12_12, (TextView)var18_18);
                                                        } else {
                                                            var6_6 = var23_22.a();
                                                            var61_60 = (int)TextUtils.isEmpty((CharSequence)var6_6);
                                                            if (var61_60 == 0) {
                                                                if (var18_18 != null) {
                                                                    var6_6 = var23_22.a();
                                                                    var8_8 = new StringBuilder();
                                                                    var8_8.append((String)var6_6);
                                                                    var8_8.append((String)var16_16);
                                                                    var6_6 = var8_8.toString();
                                                                    var18_18.setText((CharSequence)var6_6);
                                                                    var6_6 = Unit.a;
                                                                }
                                                                if (var49_48 == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                                                                    var49_48 = null;
                                                                }
                                                                var6_6 = var49_48.getContext();
                                                                var43_42 = R$string.acc_plp_discount_price;
                                                                var6_6 = var6_6.getString(var43_42);
                                                                Intrinsics.checkNotNullExpressionValue(var6_6, (String)var19_19 /* !! */ );
                                                                var8_8 = var23_22.a();
                                                                var14_14 = 1;
                                                                var23_22 = new Object[var14_14];
                                                                var26_25 = 0;
                                                                var27_26 = 0.0f;
                                                                var15_15 = null;
                                                                var23_22[0] = var8_8;
                                                                He1.a((Object[])var23_22, var14_14, (String)var6_6, (String)var12_12, (TextView)var18_18);
                                                            } else if (var18_18 != null) {
                                                                var18_18.setText((CharSequence)var7_7 /* !! */ );
                                                                var6_6 = Unit.a;
                                                            }
                                                        }
                                                        break block317;
                                                    }
                                                    var18_18 = var40_39;
                                                    var30_29 /* !! */  = var41_40;
                                                    var15_15 = var54_53;
                                                    if (var54_53 != null) {
                                                        var54_53.setText((CharSequence)var6_6);
                                                        var6_6 = Unit.a;
                                                    }
                                                    if (var5_5 != null) {
                                                        var6_6 = var3_3.getValue();
                                                    } else {
                                                        var61_60 = 0;
                                                        var62_61 = 0.0f;
                                                        var6_6 = null;
                                                    }
                                                    var15_15.setContentDescription((CharSequence)var6_6);
                                                    if (var38_37 != null) {
                                                        var8_8 = var38_37;
                                                        var61_60 = 8;
                                                        var62_61 = 1.1E-44f;
                                                        var38_37.setVisibility(var61_60);
                                                        var8_8 = Unit.a;
                                                    } else {
                                                        var61_60 = 8;
                                                        var62_61 = 1.1E-44f;
                                                    }
                                                    if (var39_38 != null) {
                                                        var8_8 = var39_38;
                                                        var14_14 = 0;
                                                        var16_16 = null;
                                                        var39_38.setVisibility(0);
                                                        var8_8 = Unit.a;
                                                    }
                                                    if (var30_29 /* !! */  != null) {
                                                        var30_29 /* !! */ .setVisibility(var61_60);
                                                        var6_6 = Unit.a;
                                                    }
                                                    if (var18_18 != null) {
                                                        var18_18.setText((CharSequence)var7_7 /* !! */ );
                                                        var6_6 = Unit.a;
                                                    }
                                                }
                                                var6_6 = z40_0.Companion;
                                                AJIOApplication.Companion.getClass();
                                                var8_8 = AJIOApplication$a.a();
                                                var6_6.getClass();
                                                var6_6 = z40$a.a((Context)var8_8).a();
                                                var8_8 = "android_gst_pdp_message";
                                                var72_71 = var6_6.h((String)var8_8);
                                                var74_72 = 1L;
                                                var61_60 = (int)(var72_71 == var74_72 ? 0 : (var72_71 < var74_72 ? -1 : 1));
                                                if (var61_60 != 0) break block318;
                                                var61_60 = (int)var13_13.m7();
                                                if (var61_60 == 0) break block319;
                                                var18_18 = var55_54 /* !! */ ;
                                                if (var55_54 /* !! */  != null) {
                                                    var61_60 = 0;
                                                    var62_61 = 0.0f;
                                                    var55_54 /* !! */ .setVisibility(0);
                                                    var6_6 = Unit.a;
                                                }
                                                if (var5_5 != null) {
                                                    var6_6 = var3_3.getTaxInformation();
                                                } else {
                                                    var61_60 = 0;
                                                    var62_61 = 0.0f;
                                                    var6_6 = null;
                                                }
                                                if (var6_6 == null) ** GOTO lbl-1000
                                                var6_6 = var3_3.getTaxInformation();
                                                if (var6_6 != null && (var6_6 = var6_6.getPriceWithTaxes()) != null && (var6_6 = var6_6.getValue()) != null) {
                                                    var62_61 = Float.parseFloat((String)var6_6);
                                                } else {
                                                    var61_60 = 0;
                                                    var62_61 = 0.0f;
                                                    var6_6 = null;
                                                }
                                                var61_60 = (int)((cfr_temp_3 = var62_61 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                                                if (var61_60 > 0) {
                                                    var6_6 = var3_3.getTaxInformation();
                                                    if (var6_6 != null && (var6_6 = var6_6.getPriceWithTaxes()) != null) {
                                                        var6_6 = var6_6.getDisplayformattedValue();
                                                    } else {
                                                        var61_60 = 0;
                                                        var62_61 = 0.0f;
                                                        var6_6 = null;
                                                    }
                                                    var6_6 = qz2_0.f((String)var6_6);
                                                    var8_8 = StringCompanionObject.INSTANCE;
                                                    var43_42 = R$string.additional_gst_refresh;
                                                    var8_8 = hv3_0.K(var43_42);
                                                    var14_14 = 1;
                                                    var23_22 = new Object[var14_14];
                                                    var26_25 = 0;
                                                    var27_26 = 0.0f;
                                                    var15_15 = null;
                                                    var23_22[0] = var6_6;
                                                    var6_6 = xh2_0.a((Object[])var23_22, var14_14, (String)var8_8, (String)var12_12);
                                                    if (var18_18 != null) {
                                                        var18_18.setText((CharSequence)var6_6);
                                                        var6_6 = Unit.a;
                                                    }
                                                } else if (var18_18 != null) {
                                                    var61_60 = R$string.additional_gst_may_apply;
                                                    var6_6 = hv3_0.K(var61_60);
                                                    var18_18.setText((CharSequence)var6_6);
                                                    var6_6 = Unit.a;
                                                }
                                                break block320;
                                            }
                                            var18_18 = var55_54 /* !! */ ;
                                            if (var55_54 /* !! */  != null) {
                                                var61_60 = 8;
                                                var62_61 = 1.1E-44f;
                                                var55_54 /* !! */ .setVisibility(var61_60);
                                                var6_6 = Unit.a;
                                            }
                                            break block320;
                                        }
                                        var18_18 = var55_54 /* !! */ ;
                                        var6_6 = z40$a.a((Context)AJIOApplication$a.a()).a();
                                        var8_8 = "pdp_gst_info";
                                        var61_60 = (var6_6 = var6_6.b((String)var8_8)).length();
                                        if (var61_60 > 0) {
                                            var61_60 = 1;
                                            var62_61 = 1.4E-45f;
                                        } else {
                                            var61_60 = 0;
                                            var62_61 = 0.0f;
                                            var6_6 = null;
                                        }
                                        if (var61_60 != 0) {
                                            if (var18_18 != null) {
                                                var61_60 = 0;
                                                var62_61 = 0.0f;
                                                var18_18.setVisibility(0);
                                                var6_6 = Unit.a;
                                            }
                                            if (var18_18 != null) {
                                                var6_6 = z40$a.a((Context)AJIOApplication$a.a()).a().b((String)var8_8);
                                                var18_18.setText((CharSequence)var6_6);
                                                var6_6 = Unit.a;
                                            }
                                        } else if (var18_18 != null) {
                                            var61_60 = 8;
                                            var62_61 = 1.1E-44f;
                                            var18_18.setVisibility(var61_60);
                                            var6_6 = Unit.a;
                                        }
                                    }
                                    if ((var61_60 = (int)mz3_0.C((String)(var5_5 = qz2_0.g(var3_3, var4_4)))) != 0) {
                                        var56_55 = Integer.parseInt((String)var5_5);
                                        var6_6 = z40$a.a((Context)AJIOApplication$a.a()).a();
                                        var61_60 = (int)var6_6.a((String)(var8_8 = "enableDiscountForPdp"));
                                        if (var61_60 != 0 && var56_55 > 0 && var56_55 >= (var61_60 = (var6_6 = z40$a.a((Context)AJIOApplication$a.a()).a()).g((String)(var8_8 = "discountValForPdp")))) {
                                            var61_60 = var56_55;
                                            var56_55 = 1;
                                            var57_56 = 1.4E-45f;
                                        } else {
                                            var61_60 = var56_55;
                                            var56_55 = 0;
                                            var57_56 = 0.0f;
                                            var5_5 = null;
                                        }
                                    } else {
                                        var56_55 = 0;
                                        var57_56 = 0.0f;
                                        var5_5 = null;
                                        var61_60 = 0;
                                        var62_61 = 0.0f;
                                        var6_6 = null;
                                    }
                                    if (var56_55 != 0 && var61_60 > 0) {
                                        if (var37_36 != null) {
                                            var5_5 = new StringBuilder();
                                            var5_5.append(var61_60);
                                            var6_6 = "%";
                                            var5_5.append((String)var6_6);
                                            var5_5 = var5_5.toString();
                                            var18_18 = var37_36;
                                            var37_36.setText((CharSequence)var5_5);
                                            var5_5 = Unit.a;
                                        }
                                        if (var36_35 != null) {
                                            var30_29 /* !! */  = var36_35;
                                            var56_55 = 0;
                                            var57_56 = 0.0f;
                                            var36_35.setVisibility(0);
                                            var5_5 = Unit.a;
                                        }
                                    } else {
                                        var30_29 /* !! */  = var36_35;
                                        if (var36_35 != null) {
                                            var56_55 = 8;
                                            var57_56 = 1.1E-44f;
                                            var36_35.setVisibility(var56_55);
                                            var5_5 = Unit.a;
                                        }
                                    }
                                    if ((var5_5 = var13_13.F7()) == null) break block321;
                                    var56_55 = (int)var5_5.isEmpty();
                                    var61_60 = 1;
                                    var62_61 = 1.4E-45f;
                                    if ((var56_55 ^= var61_60) == var61_60) break block322;
                                }
                                var61_60 = 0;
                                var62_61 = 0.0f;
                                var6_6 = null;
                            }
                            if (var61_60 == 0) break block323;
                            var5_5 = var13_13.F7();
                            if (var5_5 == null) ** GOTO lbl-1000
                            var61_60 = 0;
                            var62_61 = 0.0f;
                            var6_6 = null;
                            if ((var5_5 = (ProductPromotion)var5_5.get(0)) != null) {
                                var57_56 = var5_5.getMaxSavingPrice();
                                var5_5 = Float.valueOf(var57_56);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var56_55 = 0;
                                var57_56 = 0.0f;
                                var5_5 = null;
                            }
                            if (var5_5 == null) break block323;
                            var5_5 = var13_13.F7();
                            if (var5_5 == null) ** GOTO lbl-1000
                            var61_60 = 0;
                            var62_61 = 0.0f;
                            var6_6 = null;
                            if ((var5_5 = (ProductPromotion)var5_5.get(0)) != null) {
                                var57_56 = var5_5.getMaxSavingPrice();
                                var5_5 = Float.valueOf(var57_56);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var56_55 = 0;
                                var57_56 = 0.0f;
                                var5_5 = null;
                            }
                            Intrinsics.checkNotNull(var5_5);
                            var57_56 = var5_5.floatValue();
                            var56_55 = (int)var57_56;
                            break block324;
                        }
                        var56_55 = 0;
                        var57_56 = 0.0f;
                        var5_5 = null;
                    }
                    var6_6 = new Bundle();
                    var8_8 = var35_34.getPRODUCT_NAME();
                    var12_12 = var13_13.x5();
                    if (var12_12 == null || (var12_12 = var12_12.getName()) == null) {
                        var12_12 = var7_7 /* !! */ ;
                    }
                    var6_6.putString((String)var8_8, (String)var12_12);
                    var8_8 = var35_34.getPRODUCT_ID();
                    var12_12 = var13_13.x5();
                    if (var12_12 == null || (var12_12 = var12_12.getCode()) == null) {
                        var12_12 = var7_7 /* !! */ ;
                    }
                    var6_6.putString((String)var8_8, (String)var12_12);
                    var8_8 = var35_34.getPRODUCT_BRAND();
                    var12_12 = var13_13.x5();
                    if (var12_12 == null || (var12_12 = var12_12.getBrandName()) == null) {
                        var12_12 = var7_7 /* !! */ ;
                    }
                    var6_6.putString((String)var8_8, (String)var12_12);
                    var8_8 = var35_34.getPRODUCT_PRICE();
                    var12_12 = var13_13.x5();
                    if (var12_12 != null && (var12_12 = var12_12.getPrice()) != null && (var12_12 = var12_12.getValue()) != null) {
                        var7_7 /* !! */  = var12_12;
                    }
                    var6_6.putString((String)var8_8, (String)var7_7 /* !! */ );
                    var7_7 /* !! */  = var35_34.getPRODUCT_COLOR();
                    var8_8 = var13_13.x5();
                    if (var8_8 != null) {
                        var8_8 = hv3_0.n((Product)var8_8);
                    } else {
                        var43_42 = 0;
                        var60_59 = 0.0f;
                        var8_8 = null;
                    }
                    var6_6.putString((String)var7_7 /* !! */ , (String)var8_8);
                    var7_7 /* !! */  = var35_34.getPRODUCT_CATEGORY();
                    var8_8 = var13_13.x5();
                    if (var8_8 != null) {
                        var8_8 = var8_8.getBrickCategory();
                    } else {
                        var43_42 = 0;
                        var60_59 = 0.0f;
                        var8_8 = null;
                    }
                    var6_6.putString((String)var7_7 /* !! */ , (String)var8_8);
                    var7_7 /* !! */  = var35_34.getPRODUCT_BRICK();
                    var8_8 = var13_13.x5();
                    if (var8_8 != null) {
                        var30_29 /* !! */  = var8_8.getBrickCategory();
                    } else {
                        var29_28 = 0;
                        var52_51 = 0.0f;
                        var30_29 /* !! */  = null;
                    }
                    var6_6.putString((String)var7_7 /* !! */ , (String)var30_29 /* !! */ );
                    var48_47 = (int)h40_0.e1();
                    if (var48_47 == 0 || (var48_47 = (int)og1_1.c()) != 0 || (var48_47 = var9_9.getVisibility()) == 0) break block325;
                    if (var56_55 <= 0) break block306;
                    try {
                        var48_47 = h40_0.C();
                        if (var56_55 < var48_47) break block306;
                        if (var45_44 == null) break block307;
                        var8_8 = var45_44;
                        var56_55 = 0;
                        var57_56 = 0.0f;
                        var5_5 = null;
                    }
                    catch (Exception v1) {
                        ** continue;
                    }
                    var45_44.setVisibility(0);
                    var5_5 = Unit.a;
                }
                var63_62 = var35_34.getEC_PRODUCT_DETAILS_INTERACTIONS();
                var66_65 = "Free delivery";
                var67_66 = "visible";
                var68_67 = "product_details_interactions";
                var69_68 = "pdp screen";
                var70_69 = "pdp screen";
                var64_63 = var11_11.getPrevScreen();
                var65_64 = var11_11.getPrevScreenType();
                var71_70 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var35_34, var63_62, var66_65, var67_66, var68_67, var69_68, var70_69, var64_63, (Bundle)var6_6, var65_64, false, null, var71_70, null);
                break block306;
            }
            var8_8 = var45_44;
            var56_55 = (int)og1_1.c();
            if (var56_55 == 0) {
                if (var45_44 != null) {
                    var56_55 = 8;
                    var57_56 = 1.1E-44f;
                    var45_44.setVisibility(var56_55);
                    var5_5 = Unit.a;
                }
                var63_62 = var35_34.getEC_PRODUCT_DETAILS_INTERACTIONS();
                var64_63 = var11_11.getPrevScreen();
                var65_64 = var11_11.getPrevScreenType();
                var66_65 = "Free delivery";
                var67_66 = "not-visible";
                var68_67 = "product_details_interactions";
                var69_68 = "pdp screen";
                var70_69 = "pdp screen";
                var71_70 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var35_34, var63_62, var66_65, var67_66, var68_67, var69_68, var70_69, var64_63, (Bundle)var6_6, var65_64, false, null, var71_70, null);
            } else if (var45_44 != null) {
                var56_55 = 8;
                var57_56 = 1.1E-44f;
                var45_44.setVisibility(var56_55);
                var5_5 = Unit.a;
            }
        }
lbl1523:
        // 2 sources

        while (true) {
            this.z();
            return;
        }
    }

    public final void z() {
        boolean bl2;
        Object object;
        int n3;
        yy2_1 yy2_12 = this;
        Object object2 = this.d;
        Object object3 = "parentView";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object = null;
        } else {
            object = object2;
        }
        object = object.getContext();
        Object object4 = "getContext(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bl2 = false;
            object2 = null;
        }
        Object object5 = new oa_0((Context)object, (View)object2);
        object2 = h40_0.a;
        bl2 = h40_0.b2();
        object2 = bl2;
        ((oa_0)object5).o = object3 = yy2_12.b;
        if (object3 != null) {
            object = object3.R6();
        } else {
            n3 = 0;
            object = null;
        }
        object4 = object != null && (object4 = ((RatingsResponse)object).getAggregateRating()) != null ? ((AggregateRating)object4).getAverageRating() : null;
        ((oa_0)object5).m = object4;
        if (object != null && (object = ((RatingsResponse)object).getAggregateRating()) != null) {
            object = ((AggregateRating)object).getNumUserRatings();
        } else {
            n3 = 0;
            object = null;
        }
        ((oa_0)object5).n = object;
        object4 = ((oa_0)object5).m;
        if (object4 != null && object != null && (n3 = ((String)object).length()) > 0) {
            int n4;
            object = LD2.a;
            object = ((oa_0)object5).m;
            object4 = ((oa_0)object5).n;
            Object object6 = new StringBuilder();
            ((StringBuilder)object6).append(object);
            object = "|";
            ((StringBuilder)object6).append((String)object);
            ((StringBuilder)object6).append((String)object4);
            String string2 = ((StringBuilder)object6).toString();
            if (object3 != null) {
                object = object3.l6();
            } else {
                n3 = 0;
                object = null;
            }
            object4 = object3 != null && (object4 = object3.x5()) != null ? ((Product)object4).getName() : null;
            if (object3 != null && (object3 = object3.x5()) != null) {
                object3 = ((Product)object3).getBrickName();
            } else {
                n4 = 0;
                object3 = null;
            }
            Intrinsics.checkNotNullParameter(string2, "label");
            object6 = AnalyticsManager.Companion;
            String string3 = av_0.a((AnalyticsManager$Companion)object6);
            String string4 = av_0.a((AnalyticsManager$Companion)object6);
            String string5 = bv_0.a((AnalyticsManager$Companion)object6);
            Bundle bundle = LD2.a(null, (String)object, (String)object4, (String)object3);
            String string6 = cv_0.a((AnalyticsManager$Companion)object6);
            NewCustomEventsRevamp newCustomEventsRevamp = LD2.a;
            String string7 = "reviews & ratings interactions";
            String string8 = "Rating shown";
            String string9 = "reviews_rating_interactions";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string7, string8, string2, string9, string3, string4, string5, bundle, string6, false, null, n7, null);
            n4 = 2;
            ((oa_0)object5).d((Boolean)object2, n4);
        } else {
            object2 = ((oa_0)object5).f;
            if (object2 != null) {
                ai0_2.i(object2);
            }
            if ((object5 = ((oa_0)object5).c) != null) {
                ai0_2.i((View)object5);
            }
        }
        object5 = cp_1.Companion;
        boolean bl3 = km_1.b((cp$a)object5);
        if (bl3) {
            object5 = yy2_12.h;
            bl2 = true;
            if (object5 != null) {
                object5.setFocusable(bl2);
            }
            if ((object5 = yy2_12.h) != null) {
                object5.setClickable(bl2);
            }
            if ((object5 = yy2_12.h) != null) {
                ai0_2.a((View)object5);
            }
        }
        if ((object5 = yy2_12.i) != null) {
            object2 = new xy2_0(yy2_12);
            object5.setOnClickListener((View.OnClickListener)object2);
        }
    }
}

