/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E$b;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fO
 */
public final class fo_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public final int a;
    public final int b;
    public final int c;
    public final NewEEcommerceEventsRevamp d;
    public final NewCustomEventsRevamp e;
    public int f;
    public String g;
    public String h;
    public TextView i;
    public TextView j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public ImageView n;
    public View o;
    public no_0 p;

    public fo_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        int n3;
        this.a = 1;
        this.b = n3 = 10;
        this.c = n3;
        Object object = AnalyticsManager.Companion;
        this.d = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.e = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.g = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.h = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public static void Pa(ImageView imageView) {
        imageView.setEnabled(false);
        imageView.setClickable(false);
        imageView.setAlpha(0.5f);
    }

    public static void Qa(ImageView imageView, ImageView imageView2, boolean bl2, boolean bl3) {
        imageView.setEnabled(bl2);
        imageView.setClickable(bl2);
        float f5 = 0.5f;
        float f6 = 1.0f;
        if (bl2) {
            imageView.setAlpha(f6);
        } else {
            imageView.setAlpha(f5);
        }
        imageView2.setEnabled(bl3);
        imageView2.setClickable(bl3);
        if (bl3) {
            imageView2.setAlpha(f6);
        } else {
            imageView2.setAlpha(f5);
        }
    }

    public final void Oa(String string2) {
        String string3 = null;
        String string4 = "tvQuantityInfoInUpdateSizeQty";
        if (string2 == null) {
            string2 = this.k;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                string3 = string2;
            }
            string3.setVisibility(4);
            return;
        }
        TextView textView = this.k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            textView = null;
        }
        textView.setText((CharSequence)string2);
        string2 = this.k;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
        } else {
            string3 = string2;
        }
        string3.setVisibility(0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View var1_1) {
        block105: {
            block107: {
                block110: {
                    block109: {
                        block108: {
                            block101: {
                                block100: {
                                    block106: {
                                        block104: {
                                            var2_2 = this;
                                            var3_3 = 0;
                                            var4_4 = null;
                                            if (var1_1 != null) {
                                                var5_5 = var1_1.getId();
                                                var6_6 = var5_5;
                                            } else {
                                                var5_5 = 0;
                                                var6_6 = null;
                                            }
                                            var7_9 = R$id.decQty;
                                            var8_10 = "Quantity Button";
                                            var9_11 = "dec";
                                            var10_12 = "inc";
                                            var11_13 = "tvQtyInCartUpdate";
                                            var12_14 = -1;
                                            var13_15 = "bag screen";
                                            var14_16 = 1;
                                            var15_17 = "cartQuantityUpdateSVM";
                                            if (var6_6 != null && (var16_18 = var6_6.intValue()) == var7_9) {
                                                var6_6 = var2_2.p;
                                                if (var6_6 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                    var5_5 = 0;
                                                    var6_6 = null;
                                                }
                                                var6_6.b = var7_9 = var6_6.b + var12_14;
                                                var6_6 = var2_2.j;
                                                if (var6_6 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var11_13);
                                                    var5_5 = 0;
                                                    var6_6 = null;
                                                }
                                                if ((var17_19 = var2_2.p) == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                    var7_9 = 0;
                                                    var17_19 = null;
                                                }
                                                var7_9 = var17_19.b;
                                                var17_19 = String.valueOf(var7_9);
                                                var6_6.setText((CharSequence)var17_19);
                                                var6_6 = var2_2.p;
                                                if (var6_6 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                    var5_5 = 0;
                                                    var6_6 = null;
                                                }
                                                if ((var5_5 = var6_6.b) == (var7_9 = var2_2.a)) {
                                                    var6_6 = var2_2.m;
                                                    if (var6_6 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_11);
                                                        var5_5 = 0;
                                                        var6_6 = null;
                                                    }
                                                    if ((var17_19 = var2_2.l) == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var10_12);
                                                    } else {
                                                        var4_4 = var17_19;
                                                    }
                                                    fo_2.Qa((ImageView)var6_6, (ImageView)var4_4, false, (boolean)var14_16);
                                                } else {
                                                    var6_6 = var2_2.m;
                                                    if (var6_6 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_11);
                                                        var5_5 = 0;
                                                        var6_6 = null;
                                                    }
                                                    if ((var17_19 = var2_2.l) == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var10_12);
                                                    } else {
                                                        var4_4 = var17_19;
                                                    }
                                                    fo_2.Qa((ImageView)var6_6, (ImageView)var4_4, (boolean)var14_16, (boolean)var14_16);
                                                }
                                                var6_6 = AnalyticsManager.Companion;
                                                var4_4 = "Decrease Quantity";
                                                tj2_0.e((AnalyticsManager$Companion)var6_6, (String)var4_4, (String)var8_10, var13_15);
                                                return;
                                            }
                                            var7_9 = R$id.incQty;
                                            if (var6_6 == null || (var16_18 = var6_6.intValue()) != var7_9) break block104;
                                            var6_6 = var2_2.p;
                                            if (var6_6 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                var5_5 = 0;
                                                var6_6 = null;
                                            }
                                            var6_6.b = var7_9 = var6_6.b + var14_16;
                                            var6_6 = var2_2.j;
                                            if (var6_6 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException((String)var11_13);
                                                var5_5 = 0;
                                                var6_6 = null;
                                            }
                                            if ((var17_20 = var2_2.p) == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                var7_9 = 0;
                                                var17_20 = null;
                                            }
                                            var7_9 = var17_20.b;
                                            var17_20 = String.valueOf(var7_9);
                                            var6_6.setText((CharSequence)var17_20);
                                            var6_6 = var2_2.p;
                                            if (var6_6 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                var5_5 = 0;
                                                var6_6 = null;
                                            }
                                            if ((var5_5 = var6_6.b) == (var7_9 = var2_2.b)) ** GOTO lbl-1000
                                            var6_6 = var2_2.p;
                                            if (var6_6 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                var5_5 = 0;
                                                var6_6 = null;
                                            }
                                            var5_5 = var6_6.b;
                                            var17_20 = var2_2.p;
                                            if (var17_20 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                                var7_9 = 0;
                                                var17_20 = null;
                                            }
                                            if (var5_5 < (var7_9 = var17_20.c)) {
                                                var6_6 = var2_2.m;
                                                if (var6_6 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_11);
                                                    var5_5 = 0;
                                                    var6_6 = null;
                                                }
                                                if ((var17_20 = var2_2.l) == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(var10_12);
                                                } else {
                                                    var4_4 = var17_20;
                                                }
                                                fo_2.Qa((ImageView)var6_6, (ImageView)var4_4, (boolean)var14_16, (boolean)var14_16);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                if ((var6_6 = var2_2.m) == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_11);
                                                    var5_5 = 0;
                                                    var6_6 = null;
                                                }
                                                if ((var17_20 = var2_2.l) == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(var10_12);
                                                } else {
                                                    var4_4 = var17_20;
                                                }
                                                fo_2.Qa((ImageView)var6_6, (ImageView)var4_4, (boolean)var14_16, false);
                                            }
                                            var6_6 = AnalyticsManager.Companion;
                                            var4_4 = "Increase Quantity";
                                            tj2_0.e((AnalyticsManager$Companion)var6_6, (String)var4_4, (String)var8_10, var13_15);
                                            return;
                                        }
                                        var7_9 = R$id.updateBtn;
                                        if (var6_6 == null || (var18_22 = var6_6.intValue()) != var7_9) break block105;
                                        var6_6 = var2_2.p;
                                        if (var6_6 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                            var5_5 = 0;
                                            var6_6 = null;
                                        }
                                        if ((var6_6 = var6_6.a) == null) break block106;
                                        var6_6 = var6_6.getQuantity();
                                        var17_21 = var2_2.p;
                                        if (var17_21 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                            var7_9 = 0;
                                            var17_21 = null;
                                        }
                                        var7_9 = var17_21.b;
                                        if (var6_6 != null && (var5_5 = var6_6.intValue()) == var7_9) break block107;
                                    }
                                    if ((var6_6 = var2_2.p) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                        var5_5 = 0;
                                        var6_6 = null;
                                    }
                                    var6_6 = (var6_6 = var6_6.a) != null && (var5_5 = (int)var6_6.inventoryQtyUpdateNeeded()) == var14_16 ? "Inventory change" : "Quantity updated";
                                    var17_21 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var8_10 = "Change Quantity";
                                    var17_21.pushButtonTapEvent((String)var8_10, var6_6, var13_15);
                                    var6_6 = this.getTargetFragment();
                                    if (var6_6 != null) {
                                        var7_9 = this.getTargetRequestCode();
                                        var6_6.onActivityResult(var7_9, var12_14, null);
                                    }
                                    if ((var6_6 = var2_2.p) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                        var5_5 = 0;
                                        var6_6 = null;
                                    }
                                    if ((var6_6 = var6_6.a) != null) {
                                        var17_21 = var6_6 = var6_6.getProduct();
                                    } else {
                                        var7_9 = 0;
                                        var17_21 = null;
                                    }
                                    var8_10 = new Bundle();
                                    var19_23 = var2_2.e;
                                    var6_6 = var19_23.getPRODUCT_NAME();
                                    if (var17_21 != null) {
                                        var9_11 = var17_21.getName();
                                    } else {
                                        var20_24 = 0;
                                        var9_11 = null;
                                    }
                                    var20_24 = TextUtils.isEmpty((CharSequence)var9_11);
                                    var10_12 = "";
                                    if (var20_24 != 0) {
                                        var9_11 = var10_12;
                                    } else if (var17_21 != null) {
                                        var9_11 = var17_21.getName();
                                    } else {
                                        var20_24 = 0;
                                        var9_11 = null;
                                    }
                                    var8_10.putString((String)var6_6, (String)var9_11);
                                    if (var17_21 != null) {
                                        var6_6 = var17_21.getBaseProduct();
                                    } else {
                                        var5_5 = 0;
                                        var6_6 = null;
                                    }
                                    var5_5 = TextUtils.isEmpty((CharSequence)var6_6);
                                    var21_25 = 0L;
                                    var23_26 = 0.0;
                                    if (var5_5 == 0) {
                                        if (var17_21 != null) {
                                            var6_6 = var17_21.getBaseProduct();
                                        } else {
                                            var5_5 = 0;
                                            var6_6 = null;
                                        }
                                        var6_6 = var19_23.trimProductId((String)var6_6);
                                        var9_11 = var6_6[0];
                                        var20_24 = TextUtils.isEmpty((CharSequence)var9_11);
                                        if (var20_24 != 0) {
                                            var9_11 = var19_23.getPRODUCT_ID();
                                            var8_10.putLong((String)var9_11, var21_25);
                                        }
                                        if ((var9_11 = var6_6[0]) != null) {
                                            var11_13 = var19_23.getPRODUCT_ID();
                                            var25_27 = Long.parseLong((String)var9_11);
                                            var8_10.putLong((String)var11_13, var25_27);
                                        }
                                        if ((var20_24 = ((String[])var6_6).length) > var14_16 && (var20_24 = (int)TextUtils.isEmpty((CharSequence)(var9_11 = var6_6[var14_16]))) == 0) {
                                            var9_11 = var19_23.getPRODUCT_COLOR();
                                            var6_6 = var6_6[var14_16];
                                            var8_10.putString((String)var9_11, (String)var6_6);
                                        }
                                    } else {
                                        if (var17_21 != null) {
                                            var6_6 = var17_21.getCode();
                                        } else {
                                            var5_5 = 0;
                                            var6_6 = null;
                                        }
                                        var6_6 = var19_23.trimProductId((String)var6_6);
                                        var9_11 = var6_6[0];
                                        var20_24 = TextUtils.isEmpty((CharSequence)var9_11);
                                        if (var20_24 != 0) {
                                            var9_11 = var19_23.getPRODUCT_ID();
                                            var8_10.putLong((String)var9_11, var21_25);
                                        }
                                        if ((var20_24 = ((String[])var6_6).length) > var14_16 && (var20_24 = (int)TextUtils.isEmpty((CharSequence)(var9_11 = var6_6[var14_16]))) == 0) {
                                            var9_11 = var19_23.getPRODUCT_COLOR();
                                            var6_6 = var6_6[var14_16];
                                            var8_10.putString((String)var9_11, (String)var6_6);
                                        }
                                    }
                                    var6_6 = var19_23.getPRODUCT_BRAND();
                                    if (var17_21 != null) {
                                        var9_11 = var17_21.getBrandName();
                                    } else {
                                        var20_24 = 0;
                                        var9_11 = null;
                                    }
                                    var20_24 = (int)TextUtils.isEmpty((CharSequence)var9_11);
                                    if (var20_24 != 0) {
                                        var9_11 = var10_12;
                                    } else if (var17_21 != null) {
                                        var9_11 = var17_21.getBrandName();
                                    } else {
                                        var20_24 = 0;
                                        var9_11 = null;
                                    }
                                    var8_10.putString((String)var6_6, (String)var9_11);
                                    var21_25 = 0L;
                                    var23_26 = 0.0;
                                    try {
                                        var6_6 = var2_2.p;
                                        if (var6_6 != null) break block100;
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                        var5_5 = 0;
                                        var6_6 = null;
                                    }
                                    catch (NumberFormatException var6_7) {
                                        break block101;
                                    }
                                }
                                if ((var6_6 = var6_6.a) != null) {
                                    var6_6 = var6_6.getBasePrice();
                                } else {
                                    var5_5 = 0;
                                    var6_6 = null;
                                }
                                if (var6_6 == null) break block108;
                                var6_6 = var2_2.p;
                                if (var6_6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                    var5_5 = 0;
                                    var6_6 = null;
                                }
                                if ((var6_6 = var6_6.a) != null) {
                                    var6_6 = var6_6.getBasePrice();
                                } else {
                                    var5_5 = 0;
                                    var6_6 = null;
                                }
                                Intrinsics.checkNotNull(var6_6);
                                var6_6 = var6_6.getValue();
                                if (var6_6 == null) break block108;
                                var27_28 = Double.parseDouble((String)var6_6);
                                break block109;
                            }
                            var9_11 = yn3_0.a;
                            var9_11.e(var6_7);
                        }
                        var27_28 = var23_26;
                    }
                    var5_5 = (int)(var27_28 == var23_26 ? 0 : (var27_28 < var23_26 ? -1 : 1));
                    if (var5_5 != 0) {
                        block103: {
                            block102: {
                                try {
                                    var6_6 = var2_2.p;
                                    if (var6_6 != null) break block102;
                                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                    var5_5 = 0;
                                    var6_6 = null;
                                }
                                catch (NumberFormatException var6_8) {
                                    break block103;
                                }
                            }
                            if ((var6_6 = var6_6.a) != null && (var6_6 = var6_6.getProduct()) != null && (var6_6 = var6_6.getWasPriceData()) != null) {
                                var6_6 = var6_6.getValue();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                            }
                            if (var6_6 != null) {
                                var6_6 = var2_2.p;
                                if (var6_6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                                    var5_5 = 0;
                                    var6_6 = null;
                                }
                                if ((var6_6 = var6_6.a) != null && (var6_6 = var6_6.getProduct()) != null && (var6_6 = var6_6.getWasPriceData()) != null && (var6_6 = var6_6.getValue()) != null) {
                                    var29_29 = Double.parseDouble((String)var6_6);
                                    var6_6 = var29_29;
                                } else {
                                    var5_5 = 0;
                                    var6_6 = null;
                                }
                                Intrinsics.checkNotNull(var6_6);
                                var23_26 = var6_6.doubleValue() - var27_28;
                            }
                            break block110;
                        }
                        var9_11 = yn3_0.a;
                        var9_11.e(var6_8);
                    }
                }
                var5_5 = (int)hv3_0.Y();
                if (var5_5 != 0) {
                    var6_6 = var2_2.p;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                        var5_5 = 0;
                        var6_6 = null;
                    }
                    var6_6 = var6_6.a;
                    Intrinsics.checkNotNull(var6_6);
                    var6_6 = var6_6.getProduct().getSelectedSizeVariant();
                    var6_6 = var6_6 != null ? Y63.c((ProductOptionVariant)var6_6) : var10_12;
                } else {
                    var6_6 = var2_2.p;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                        var5_5 = 0;
                        var6_6 = null;
                    }
                    var6_6 = ka2_2.a((CartEntry)var6_6.a).c;
                }
                var9_11 = var19_23.getPRODUCT_PRICE();
                var8_10.putDouble((String)var9_11, var27_28);
                var9_11 = var19_23.getPRODUCT_SIZE();
                var8_10.putString((String)var9_11, (String)var6_6);
                var6_6 = var19_23.getPRODUCT_DISCOUNT();
                var8_10.putDouble((String)var6_6, var23_26);
                var6_6 = var19_23.getPRODUCT_CATEGORY();
                if (var17_21 != null) {
                    var9_11 = var17_21.getBrickCategory();
                } else {
                    var20_24 = 0;
                    var9_11 = null;
                }
                var8_10.putString((String)var6_6, (String)var9_11);
                var6_6 = var19_23.getPRODUCT_BRICK();
                if (var17_21 != null) {
                    var9_11 = var17_21.getBrickName();
                } else {
                    var20_24 = 0;
                    var9_11 = null;
                }
                var8_10.putString((String)var6_6, (String)var9_11);
                var6_6 = var19_23.getPRODUCT_TAG();
                var9_11 = hv3_0.a;
                var11_13 = var17_21 != null ? var17_21.getFnlColorVariantData() : null;
                var9_11.getClass();
                var9_11 = hv3_0.A((ProductFnlColorVariantData)var11_13);
                var20_24 = (int)TextUtils.isEmpty((CharSequence)var9_11);
                if (var20_24 == 0) {
                    if (var17_21 != null) {
                        var17_21 = var17_21.getFnlColorVariantData();
                    } else {
                        var7_9 = 0;
                        var17_21 = null;
                    }
                    var10_12 = hv3_0.A((ProductFnlColorVariantData)var17_21);
                }
                var8_10.putString((String)var6_6, var10_12);
                var31_30 = var19_23.getEC_BAG_INTERACTIONS();
                var6_6 = var2_2.g;
                var17_21 = var2_2.h;
                var32_31 = 1540;
                var33_32 = "quantity change";
                var34_33 = null;
                var35_34 = "quantity_change_cart";
                var36_35 = "bag screen";
                var37_36 = "bag screen";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var19_23, (String)var31_30, var33_32, null, var35_34, (String)var36_35, var37_36, (String)var6_6, (Bundle)var8_10, (String)var17_21, false, null, var32_31, null);
                var5_5 = var2_2.f;
                var17_21 = var2_2.p;
                if (var17_21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                    var7_9 = 0;
                    var17_21 = null;
                }
                var7_9 = var17_21.b;
                var8_10 = var2_2.d;
                if (var5_5 > var7_9) {
                    var6_6 = var2_2.p;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                        var5_5 = 0;
                        var6_6 = null;
                    }
                    var31_30 = var6_6.a;
                    var33_32 = var8_10.getEE_REMOVE_FROM_CART();
                    var5_5 = var2_2.f;
                    var17_21 = var2_2.p;
                    if (var17_21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                        var7_9 = 0;
                        var17_21 = null;
                    }
                    var7_9 = var17_21.b;
                    var38_37 = var5_5 -= var7_9;
                    var34_33 = var38_37;
                    var6_6 = var2_2.g;
                    var17_21 = var2_2.h;
                    var35_34 = "bag screen";
                    var37_36 = "bag screen";
                    var19_23 = var2_2.d;
                    var36_35 = var6_6;
                    var19_23.pushEEAddRemoveCart((CartEntry)var31_30, var33_32, var34_33, var35_34, (String)var6_6, var37_36, (String)var17_21);
                    var6_6 = var2_2.p;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                        var5_5 = 0;
                        var6_6 = null;
                    }
                    var2_2.f = var5_5 = var6_6.b;
                }
                var5_5 = var2_2.f;
                var17_21 = var2_2.p;
                if (var17_21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                    var7_9 = 0;
                    var17_21 = null;
                }
                if (var5_5 < (var7_9 = var17_21.b)) {
                    var6_6 = var2_2.p;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                        var5_5 = 0;
                        var6_6 = null;
                    }
                    var31_30 = var6_6.a;
                    var33_32 = var8_10.getEE_ADD_TO_CART();
                    var6_6 = var2_2.p;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                        var5_5 = 0;
                        var6_6 = null;
                    }
                    var5_5 = var6_6.b;
                    var7_9 = var2_2.f;
                    var40_38 = var5_5 -= var7_9;
                    var34_33 = var40_38;
                    var6_6 = var2_2.g;
                    var17_21 = var2_2.h;
                    var35_34 = "bag screen";
                    var37_36 = "bag screen";
                    var19_23 = var2_2.d;
                    var36_35 = var6_6;
                    var19_23.pushEEAddRemoveCart((CartEntry)var31_30, var33_32, var34_33, var35_34, (String)var6_6, var37_36, (String)var17_21);
                    var6_6 = var2_2.p;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_17);
                    } else {
                        var4_4 = var6_6;
                    }
                    var2_2.f = var5_5 = var4_4.b;
                }
            }
            this.dismiss();
            return;
        }
        var3_3 = R$id.cancelBtn;
        if (var6_6 == null) {
            return;
        }
        var5_5 = var6_6.intValue();
        if (var5_5 != var3_3) return;
        this.dismiss();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getParentFragment();
        if (object != null) {
            object = this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(object, "requireParentFragment(...)");
            Object object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = object.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, (E$b)object4, (Wd0)object);
            object2 = no_0.class;
            object3 = "modelClass";
            object2 = do_0.a((Class)object2, (String)object3, (Class)object2, (String)object3, (String)object3);
            Intrinsics.checkNotNullParameter(object2, "<this>");
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object3 = ((String)object4).concat((String)object3);
                this.p = object = (no_0)((pD3)object).a((yn1_2)object2, (String)object3);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        dO dO2 = new dO((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)dO2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.cart_quantity_update_bottomsheet_luxe;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.cart_quantity_update_bottomsheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.parent_layout;
        object2 = (ConstraintLayout)object.findViewById(n4);
        Object object3 = Looper.getMainLooper();
        Object object4 = new Handler(object3);
        object3 = new eo_1((View)object2, 0);
        long l2 = 100;
        object4.postDelayed((Runnable)object3, l2);
        n4 = R$id.updateBtn;
        object2 = (TextView)object.findViewById(n4);
        this.i = object2;
        n4 = R$id.quantityTv;
        object2 = (TextView)object.findViewById(n4);
        this.j = object2;
        n4 = R$id.cart_qty_info_tv_header;
        object2 = (TextView)object.findViewById(n4);
        this.k = object2;
        n4 = R$id.incQty;
        object2 = (ImageView)object.findViewById(n4);
        this.l = object2;
        n4 = R$id.decQty;
        object2 = (ImageView)object.findViewById(n4);
        this.m = object2;
        object4 = "dec";
        object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n4 = 0;
            object2 = null;
        }
        int n7 = R$string.reduce_quantity;
        String string2 = hv3_0.K(n7);
        object2.setContentDescription((CharSequence)string2);
        object2 = this.l;
        string2 = "inc";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object2 = null;
        }
        int n8 = R$string.increase_quantity;
        Object object5 = hv3_0.K(n8);
        object2.setContentDescription((CharSequence)object5);
        n4 = R$id.cancelBtn;
        object2 = (ImageView)object.findViewById(n4);
        this.n = object2;
        object5 = "cancelBtn";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object2 = null;
        }
        int n10 = R$string.close_txt;
        String string3 = hv3_0.K(n10);
        object2.setContentDescription((CharSequence)string3);
        n4 = R$id.qtyContainer;
        this.o = object = object.findViewById(n4);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.p;
        object2 = "cartQuantityUpdateSVM";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        this.f = n3 = object.b;
        object = this.p;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        if ((n3 = object.b) <= (n8 = this.a)) {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            fo_2.Pa((ImageView)object);
        }
        if ((object = this.p) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        if ((n3 = object.b) >= (n8 = this.b)) {
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            fo_2.Pa((ImageView)object);
        }
        if ((object = this.p) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        n3 = object.b;
        object5 = this.p;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n8 = 0;
            object5 = null;
        }
        if (n3 >= (n8 = object5.c)) {
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            fo_2.Pa((ImageView)object);
        }
        if ((object = this.j) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvQtyInCartUpdate");
            n3 = 0;
            object = null;
        }
        if ((object5 = this.p) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n8 = 0;
            object5 = null;
        }
        n8 = object5.b;
        object5 = String.valueOf(n8);
        object.setText((CharSequence)object5);
        object = this.p;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        n3 = object.b;
        object5 = this.p;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n8 = 0;
            object5 = null;
        }
        if (n3 > (n8 = object5.c)) {
            n3 = R$string.qty_update_alert;
            object5 = this.p;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n8 = 0;
                object5 = null;
            }
            n4 = object5.c;
            object2 = n4;
            n8 = 1;
            object5 = new Object[n8];
            object5[0] = object2;
            object = hv3_0.L(n3, object5);
            this.Oa((String)object);
        } else {
            object = this.p;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((n3 = object.c) <= (n4 = this.c)) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(n3);
                ((StringBuilder)object2).append(" left");
                object = ((StringBuilder)object2).toString();
                this.Oa((String)object);
            } else {
                this.Oa(null);
            }
        }
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.i;
        if (object == null) {
            object = "updateButton";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        object3.setOnClickListener((View.OnClickListener)this);
    }
}

