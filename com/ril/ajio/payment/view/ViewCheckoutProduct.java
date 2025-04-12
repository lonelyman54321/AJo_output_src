/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.payment.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ViewCheckoutProduct
extends FrameLayout {
    public OnCheckoutClickListener a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public ImageView h;
    public ConstraintLayout i;
    public TextView j;
    public int k;
    public ImageView l;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void setRevampData(Object var1_1) {
        block92: {
            block91: {
                var2_2 = 1;
                Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry");
                var1_1 = (CartEntry)var1_1;
                var3_3 /* !! */  = h40_0.a;
                var4_4 = h40_0.O1();
                var5_5 = "ivPDImage";
                var6_6 = null;
                if (var4_4 == 0) ** GOTO lbl-1000
                var7_7 = var1_1.getServicabilityInfo();
                if (var7_7 != null) {
                    var7_7 = var7_7.getPriorityDelivery();
                } else {
                    var4_4 = 0;
                    var7_7 = null;
                }
                if (var7_7 != null) {
                    var7_7 = this.l;
                    if (var7_7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                        var4_4 = 0;
                        var7_7 = null;
                    }
                    ai0_2.B((View)var7_7);
                    var7_7 = this.l;
                    if (var7_7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                        var4_4 = 0;
                        var7_7 = null;
                    }
                    lp_0.h((ImageView)var7_7);
                } else lbl-1000:
                // 2 sources

                {
                    if ((var7_7 = this.l) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                        var4_4 = 0;
                        var7_7 = null;
                    }
                    ai0_2.i((View)var7_7);
                }
                hv3_0.a.getClass();
                var7_7 = "";
                var8_8 = var1_1 == null ? var7_7 : hv3_0.k(var1_1.getProduct());
                var9_9 = this.d;
                var10_10 = "deliveryDateTv";
                if (var9_9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var11_11 = 0;
                    var9_9 = null;
                }
                var9_9.setVisibility(0);
                var11_11 = TextUtils.isEmpty((CharSequence)var8_8);
                var12_12 = "productImv";
                if (var11_11 == 0) {
                    var9_9 = new da$a();
                    var9_9.k = var2_2;
                    var9_9.a = var13_13 = R$drawable.component_placeholder;
                    var9_9.b = var13_13;
                    var9_9.c = var13_13;
                    var9_9.s = var2_2;
                    var13_13 = R$string.acc_icon_product_placeholder;
                    var14_14 = hv3_0.K(var13_13);
                    var9_9.b((String)var14_14);
                    var14_14 = this.h;
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                        var13_13 = 0;
                        var14_14 = null;
                    }
                    var9_9.n = var8_8;
                    var9_9.u = var14_14;
                    var9_9.i = var2_2;
                    var9_9.a();
                } else {
                    var8_8 = this.h;
                    if (var8_8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                        var15_15 = 0;
                        var8_8 = null;
                    }
                    var11_11 = R$drawable.item_dummy_noimg;
                    var8_8.setImageResource(var11_11);
                }
                var15_15 = this.k;
                if (var15_15 == 0) {
                    var8_8 = this.h;
                    if (var8_8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                        var15_15 = 0;
                        var8_8 = null;
                    }
                    var11_11 = R$string.acc_list_of_product;
                    var9_9 = hv3_0.K(var11_11);
                    var16_16 = R$string.product_image;
                    var12_12 = hv3_0.K(var16_16);
                    var14_14 = new StringBuilder();
                    var14_14.append((String)var9_9);
                    var14_14.append(". ");
                    var14_14.append((String)var12_12);
                    var9_9 = var14_14.toString();
                    var8_8.setContentDescription((CharSequence)var9_9);
                }
                if ((var8_8 = var1_1.getProduct()) != null) {
                    var8_8 = var8_8.getFnlColorVariantData();
                } else {
                    var15_15 = 0;
                    var8_8 = null;
                }
                var8_8 = hv3_0.A((ProductFnlColorVariantData)var8_8);
                var11_11 = 8;
                var12_12 = "exclusiveLbl";
                if (var8_8 != null) {
                    var14_14 = this.c;
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                        var13_13 = 0;
                        var14_14 = null;
                    }
                    var14_14.setText((CharSequence)var8_8);
                    var14_14 = this.c;
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                        var13_13 = 0;
                        var14_14 = null;
                    }
                    var14_14.setVisibility(0);
                } else {
                    var14_14 = this.c;
                    if (var14_14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                        var13_13 = 0;
                        var14_14 = null;
                    }
                    var14_14.setVisibility(var11_11);
                }
                var17_17 = var3_3 /* !! */ .f1();
                if (var17_17 != 0 && (var17_17 = (var3_3 /* !! */  = var1_1.isGiftProduct()).booleanValue()) != 0) {
                    var3_3 /* !! */  = this.j;
                    if (var3_3 /* !! */  != null) {
                        var14_14 = h40_0.D(false).getFreeTextOnProduct();
                        var3_3 /* !! */ .setText(var14_14);
                    }
                    if ((var17_17 = og1_1.c()) != 0 && (var3_3 /* !! */  = this.j) != null && (var3_3 /* !! */  = var3_3 /* !! */ .getParent()) != null && (var13_13 = var3_3 /* !! */  instanceof ConstraintLayout) != 0) {
                        var3_3 /* !! */  = (ConstraintLayout)var3_3 /* !! */ ;
                        var14_14 = var3_3 /* !! */ .getContext();
                        var18_18 = R$color.luxe_color_121212;
                        var14_14 = t70.getDrawable((Context)var14_14, var18_18);
                        var3_3 /* !! */ .setBackground((Drawable)var14_14);
                    }
                    if ((var3_3 /* !! */  = this.i) != null) {
                        ai0_2.B((View)var3_3 /* !! */ );
                    }
                    if (var8_8 != null) {
                        var3_3 /* !! */  = this.c;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                            var17_17 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var3_3 /* !! */ .setVisibility(var11_11);
                    }
                } else {
                    var3_3 /* !! */  = this.i;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.i((View)var3_3 /* !! */ );
                    }
                }
                if ((var3_3 /* !! */  = var1_1.getProduct()) != null) {
                    var3_3 /* !! */  = var1_1.getProduct().getBrandName();
                    var17_17 = TextUtils.isEmpty((CharSequence)var3_3 /* !! */ );
                    if (var17_17 == 0) {
                        var3_3 /* !! */  = var1_1.getProduct().getBrandName();
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                    } else {
                        var3_3 /* !! */  = var7_7;
                    }
                    var8_8 = var1_1.getProduct().getName();
                    var15_15 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                    if (var15_15 == 0) {
                        var8_8 = var1_1.getProduct().getName();
                        var8_8 = kp1_0.c((String)var7_7, (String)var8_8);
                    } else {
                        var8_8 = var7_7;
                    }
                } else {
                    var3_3 /* !! */  = var7_7;
                    var8_8 = var7_7;
                }
                var16_16 = (int)TextUtils.isEmpty((CharSequence)var3_3 /* !! */ );
                var14_14 = "nameTv";
                if (var16_16 == 0) {
                    var12_12 = this.b;
                    if (var12_12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                        var16_16 = 0;
                        var12_12 = null;
                    }
                    var12_12.setText((CharSequence)var3_3 /* !! */ );
                } else {
                    var3_3 /* !! */  = this.b;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                        var17_17 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setText((CharSequence)var7_7);
                }
                var3_3 /* !! */  = ka2_2.a((CartEntry)var1_1);
                var16_16 = (int)var3_3 /* !! */ .b;
                if (var16_16 != 0) {
                    var12_12 = this.f;
                    if (var12_12 != null) {
                        var12_12.setVisibility(var11_11);
                    }
                } else {
                    var12_12 = this.f;
                    if (var12_12 != null) {
                        var12_12.setVisibility(0);
                    }
                    var12_12 = hv3_0.i((CartEntry)var1_1);
                    var14_14 = this.f;
                    if (var14_14 != null) {
                        if (var12_12 != null && (var18_18 = (int)kotlin.text.b.k((CharSequence)var12_12)) == 0) {
                            var19_19 = "Size ";
                            var12_12 = var19_19.concat((String)var12_12);
                        } else {
                            var12_12 = var7_7;
                        }
                        var14_14.setText((CharSequence)var12_12);
                    }
                }
                if ((var16_16 = (int)TextUtils.isEmpty((CharSequence)var8_8)) == 0) {
                    var12_12 = var3_3 /* !! */ .a;
                    if (var12_12 != null && (var16_16 = var12_12.length()) != 0) {
                        var12_12 = this.e;
                        if (var12_12 != null) {
                            var3_3 /* !! */  = var3_3 /* !! */ .a;
                            var14_14 = new StringBuilder();
                            var14_14.append((String)var8_8);
                            var8_8 = " | ";
                            var14_14.append((String)var8_8);
                            var14_14.append((String)var3_3 /* !! */ );
                            var3_3 /* !! */  = var14_14.toString();
                            var12_12.setText((CharSequence)var3_3 /* !! */ );
                        }
                    } else {
                        var3_3 /* !! */  = this.e;
                        if (var3_3 /* !! */  != null) {
                            var3_3 /* !! */ .setText((CharSequence)var8_8);
                        }
                    }
                } else {
                    var3_3 /* !! */  = this.e;
                    if (var3_3 /* !! */  != null) {
                        var3_3 /* !! */ .setText((CharSequence)var7_7);
                    }
                }
                if ((var17_17 = var1_1.isServicability()) != 0) break block91;
                var3_3 /* !! */  = this.l;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var17_17 = 0;
                    var3_3 /* !! */  = null;
                }
                ai0_2.i((View)var3_3 /* !! */ );
                var17_17 = og1_1.b();
                if (var17_17 != 0) {
                    var3_3 /* !! */  = this.d;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var17_17 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var20_20 = hv3_0.m(R$color.err_color_B10F2E);
                    var3_3 /* !! */ .setTextColor(var20_20);
                } else {
                    var3_3 /* !! */  = this.d;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                        var17_17 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var20_20 = hv3_0.m(R$color.accent_color_1);
                    var3_3 /* !! */ .setTextColor(var20_20);
                }
                var3_3 /* !! */  = var1_1.getReasonForNotServiceability();
                var5_5 = this.d;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var20_20 = 0;
                    var5_5 = null;
                }
                var5_5.setText((CharSequence)var7_7);
                var5_5 = this.d;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                } else {
                    var6_6 = var5_5;
                }
                if (var3_3 /* !! */  != null) {
                    var5_5 = Locale.ENGLISH;
                    var8_8 = "ENGLISH";
                    var10_10 = "toLowerCase(...)";
                    var20_20 = (int)Intrinsics.areEqual(var3_3 /* !! */  = zn0_1.a((Locale)var5_5, (String)var8_8, (String)var3_3 /* !! */ , (Locale)var5_5, var10_10), var5_5 = "ns");
                    if (var20_20 != 0) {
                        var7_7 = "Can\u2019t be delivered to selected address";
                    } else {
                        var5_5 = "oos";
                        var17_17 = (int)Intrinsics.areEqual(var3_3 /* !! */ , var5_5);
                        if (var17_17 != 0) {
                            var7_7 = "Out of stock";
                        }
                    }
                }
                var6_6.setText((CharSequence)var7_7);
                break block92;
            }
            var17_17 = og1_1.b();
            if (var17_17 != 0) {
                var3_3 /* !! */  = this.d;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var17_17 = 0;
                    var3_3 /* !! */  = null;
                }
                var4_4 = hv3_0.m(R$color.luxe_color_121212);
                var3_3 /* !! */ .setTextColor(var4_4);
            } else {
                var3_3 /* !! */  = this.d;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    var17_17 = 0;
                    var3_3 /* !! */  = null;
                }
                var4_4 = hv3_0.m(R$color.accent_color_2);
                var3_3 /* !! */ .setTextColor(var4_4);
            }
            var3_3 /* !! */  = var1_1.getEddDate();
            var4_4 = (int)h40_0.Q1();
            if (var4_4 == 0) ** GOTO lbl-1000
            var7_7 = var1_1.getServicabilityInfo();
            if (var7_7 != null) {
                var7_7 = var7_7.getDeliverySLA();
            } else {
                var4_4 = 0;
                var7_7 = null;
            }
            if (var7_7 != null && (var4_4 = var7_7.length()) != 0) {
                var4_4 = (int)h40_0.Q1();
                if (var4_4 == 0 || (var7_7 = h40_0.k0(false)) == null || (var7_7 = var7_7.getSpc()) == null || (var7_7 = var7_7.getDeliverySLA()) == null || (var20_21 = var7_7.isEmpty() ^ var2_2) == 0) {
                    var4_4 = 0;
                    var7_7 = null;
                }
                if (var7_7 != null) {
                    var5_5 = var1_1.getServicabilityInfo();
                    if (var5_5 != null) {
                        var5_5 = var5_5.getDeliverySLA();
                    } else {
                        var20_21 = 0;
                        var5_5 = null;
                    }
                    var7_7 = (String)var7_7.get(var5_5);
                } else {
                    var4_4 = 0;
                    var7_7 = null;
                }
                if (var7_7 != null && (var20_21 = var7_7.length()) != 0) {
                    var3_3 /* !! */  = this.d;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    } else {
                        var6_6 = var3_3 /* !! */ ;
                    }
                    var6_6.setText((CharSequence)var7_7);
                } else {
                    var7_7 = this.d;
                    if (var7_7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                    } else {
                        var6_6 = var7_7;
                    }
                    var6_6.setText((CharSequence)var3_3 /* !! */ );
                }
            } else lbl-1000:
            // 2 sources

            {
                if ((var7_7 = this.d) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                } else {
                    var6_6 = var7_7;
                }
                var6_6.setText((CharSequence)var3_3 /* !! */ );
            }
        }
        var3_3 /* !! */  = var1_1.getQuantity();
        var17_17 = var3_3 /* !! */ .intValue();
        if (var17_17 > var2_2) {
            var3_3 /* !! */  = this.g;
            if (var3_3 /* !! */  != null) {
                var3_3 /* !! */ .setVisibility(0);
            }
            if ((var3_3 /* !! */  = this.g) != null) {
                var4_4 = R$string.qty_text_2;
                var1_1 = var1_1.getQuantity();
                var21_22 = new Object[var2_2];
                var21_22[0] = var1_1;
                var1_1 = hv3_0.L(var4_4, var21_22);
                var3_3 /* !! */ .setText((CharSequence)var1_1);
            }
        } else {
            var1_1 = this.g;
            if (var1_1 != null) {
                var1_1.setVisibility(var11_11);
            }
        }
    }

    public void setData(Object object, Object object2) {
        this.setRevampData(object);
    }
}

