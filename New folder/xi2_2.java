/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.BulletSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import com.ril.ajio.services.data.Product.MandatoryInfo;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from xi2
 */
public final class xi2_2
extends RecyclerView$B
implements View.OnClickListener {
    public static final xi2$a Companion;
    public final View a;
    public final yi2_1 b;
    public final Context c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final AjioButton f;
    public final RelativeLayout g;
    public final View h;

    static {
        xi2$a xi2$a;
        Companion = xi2$a = new Object();
    }

    public xi2_2(View object, yi2_1 yi2_12) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.h = object;
        yi2_12 = null;
        String string2 = "parentView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        object = object.getContext();
        this.c = object;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        int n4 = R$id.row_pdp_description_layout_dynamic;
        object = (LinearLayout)object.findViewById(n4);
        this.d = object;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.more_less_tv;
        object = (AjioButton)object.findViewById(n4);
        this.f = object;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.row_pdp_description_layout_other_info;
        object = (RelativeLayout)object.findViewById(n4);
        this.g = object;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.row_pdp_description_layout_disclosure;
        object = (LinearLayout)object.findViewById(n4);
        this.e = object;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            yi2_12 = object;
        }
        n3 = R$id.product_details_header;
        object = yi2_12.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        ai0_2.t((View)((TextView)object));
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.more_less_tv;
        if (n3 == n4) {
            object = this.h;
            n4 = 0;
            string2 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentView");
                n3 = 0;
                object = null;
            }
            ai0_2.a(object);
            object = this.f;
            String string3 = "mMoreLessbutton";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object = null;
            }
            object = ((Object)object.getText()).toString();
            String string4 = "More";
            int n7 = 0;
            String string5 = null;
            n3 = (int)(StringsKt.F((CharSequence)object, string4, false) ? 1 : 0);
            int n8 = 4;
            String string6 = "mOtherInfoLayout";
            String string7 = "mDisclosureDynamicLayout";
            String string8 = "mDescDynamicLayout";
            int n10 = 8;
            if (n3 != 0) {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                int n14 = R$string.less_info;
                String string9 = hv3_0.K(n14);
                object.setText((CharSequence)string9);
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                int n15 = R$string.acc_less_product_details;
                string3 = hv3_0.K(n15);
                object.setContentDescription((CharSequence)string3);
                object = this.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string8);
                    n3 = 0;
                    object = null;
                }
                n3 = object.getChildCount();
                while (n8 < n3) {
                    string3 = this.d;
                    if (string3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n15 = 0;
                        string3 = null;
                    }
                    if ((string3 = string3.getChildAt(n8)) != null) {
                        string3.setVisibility(0);
                    }
                    ++n8;
                }
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string7);
                    n3 = 0;
                    object = null;
                }
                if ((n3 = object.getChildCount()) > 0) {
                    object = this.g;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n3 = 0;
                        object = null;
                    }
                    object.setVisibility(0);
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string7);
                    } else {
                        string2 = object;
                    }
                    string2.setVisibility(0);
                } else {
                    object = this.g;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n3 = 0;
                        object = null;
                    }
                    object.setVisibility(n10);
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string7);
                    } else {
                        string2 = object;
                    }
                    string2.setVisibility(n10);
                }
                object = AnalyticsManager.Companion;
                string2 = "pdp screen";
                string3 = "PDP: Click";
                string4 = "More product details";
                tj2_0.e((AnalyticsManager$Companion)object, string3, string4, string2);
            } else {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                n7 = R$string.more_info;
                string5 = hv3_0.K(n7);
                object.setText((CharSequence)string5);
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                int n16 = R$string.acc_more_product_details;
                string3 = hv3_0.K(n16);
                object.setContentDescription((CharSequence)string3);
                object = this.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string8);
                    n3 = 0;
                    object = null;
                }
                n3 = object.getChildCount();
                while (n8 < n3) {
                    string3 = this.d;
                    if (string3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n16 = 0;
                        string3 = null;
                    }
                    if ((string3 = string3.getChildAt(n8)) != null) {
                        string3.setVisibility(n10);
                    }
                    ++n8;
                }
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string7);
                    n3 = 0;
                    object = null;
                }
                object.setVisibility(n10);
                object = this.g;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string6);
                } else {
                    string2 = object;
                }
                string2.setVisibility(n10);
            }
        }
    }

    public final View w(String string2, SpannableString spannableString) {
        boolean bl2;
        int n3;
        yi2_1 yi2_12 = this.b;
        boolean bl3 = yi2_12.c9();
        Object object = "context";
        int n4 = 0;
        AjioTextView ajioTextView = null;
        if (bl3) {
            yi2_12 = this.c;
            if (yi2_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl3 = false;
                yi2_12 = null;
            }
            yi2_12 = LayoutInflater.from((Context)yi2_12);
            n3 = R$layout.luxe_new_view_pdp_product_detail;
            yi2_12 = yi2_12.inflate(n3, null);
        } else {
            yi2_12 = this.c;
            if (yi2_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl3 = false;
                yi2_12 = null;
            }
            yi2_12 = LayoutInflater.from((Context)yi2_12);
            n3 = R$layout.new_view_pdp_product_detail;
            yi2_12 = yi2_12.inflate(n3, null);
        }
        if (yi2_12 != null) {
            n3 = R$id.view_pdp_product_detail_tv_name;
            object = (AjioTextView)yi2_12.findViewById(n3);
        } else {
            n3 = 0;
            object = null;
        }
        if (yi2_12 != null) {
            n4 = R$id.view_pdp_product_detail_tv_value;
            ajioTextView = (AjioTextView)yi2_12.findViewById(n4);
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        int n7 = 8;
        if (bl4) {
            if (object != null) {
                object.setVisibility(n7);
            }
        } else if (object != null) {
            object.setText((CharSequence)string2);
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)spannableString)) {
            if (ajioTextView != null) {
                ajioTextView.setVisibility(n7);
            }
        } else if (ajioTextView != null) {
            ajioTextView.setText((CharSequence)spannableString);
        }
        return yi2_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(ArrayList var1_1, ArrayList var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        if (var1_1 == null) {
            return;
        }
        var6_6 /* !! */  = this.d;
        var7_7 = "mDescDynamicLayout";
        var8_8 = false;
        var9_9 = null;
        if (var6_6 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
            var6_6 /* !! */  = null;
        }
        var6_6 /* !! */ .removeAllViews();
        var6_6 /* !! */  = var3_3.h;
        if (var6_6 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            var6_6 /* !! */  = null;
        }
        var10_10 = R$id.parent_product_details;
        var6_6 /* !! */  = (LinearLayout)var6_6 /* !! */ .findViewById(var10_10);
        var10_10 = var1_1.size();
        var11_11 = 0;
        var12_12 /* !! */  = null;
        var13_13 = 0;
        var14_14 = null;
        while (true) {
            block45: {
                block44: {
                    var15_15 = 1;
                    var16_16 = "\n";
                    var17_17 = "get(...)";
                    var18_18 = "  ";
                    if (var13_13 >= var10_10) break;
                    var19_19 = var4_4.get(var13_13);
                    Intrinsics.checkNotNullExpressionValue(var19_19, (String)var17_17);
                    var19_19 = (FeatureData)var19_19;
                    var17_17 = var19_19.getFeatureValues();
                    var20_20 = var19_19.getCode();
                    if (var20_20 == null) break block44;
                    var21_21 = var19_19.getCode();
                    if (var21_21 != null) {
                        var22_22 = StringsKt.F((CharSequence)var21_21, ".segmentusp", false);
                        var23_23 = (boolean)var22_22;
                    } else {
                        var22_22 = 0;
                        var23_23 = null;
                    }
                    Intrinsics.checkNotNull(var23_23);
                    var22_22 = var23_23.booleanValue();
                    if (var22_22 == 0 || var17_17 == null) break block44;
                    var23_23 = var17_17;
                    var23_23 = (Collection)var17_17;
                    var22_22 = var23_23.isEmpty() ^ var15_15;
                    if (var22_22 == 0 || (var22_22 = (int)TextUtils.isEmpty((CharSequence)(var23_23 = ((FeatureValue)var17_17.get(0)).getValue()))) != 0) break block44;
                    var24_24 /* !! */  = ((FeatureValue)var17_17.get(0)).getValue();
                    var23_23 = new StringBuilder();
                    var23_23.append((String)var24_24 /* !! */ );
                    var23_23.append((String)var16_16);
                    var24_24 /* !! */  = var23_23.toString();
                    var24_24 /* !! */  = var3_3.w((String)var24_24 /* !! */ , null);
                    var23_23 = var3_3.d;
                    if (var23_23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                        var22_22 = 0;
                        var23_23 = null;
                    }
                    var23_23.addView(var24_24 /* !! */ );
                    break block45;
                }
                var23_23 = var19_19.getName();
                if (var17_17 == null) ** GOTO lbl-1000
                var16_16 = var17_17;
                var16_16 = (Collection)var17_17;
                var25_25 = var16_16.isEmpty() ^ var15_15;
                if (var25_25 != 0 && (var25_25 = TextUtils.isEmpty((CharSequence)(var16_16 = ((FeatureValue)var17_17.get(0)).getValue()))) == 0) {
                    var16_16 = ((FeatureValue)var17_17.get(0)).getValue();
                } else lbl-1000:
                // 2 sources

                {
                    var16_16 = var19_19.getValue();
                }
                var26_26 = TextUtils.isEmpty((CharSequence)var16_16);
                if (!var26_26) {
                    var26_26 = TextUtils.isEmpty((CharSequence)var23_23);
                    if (!var26_26) {
                        var17_17 = hv3_0.K(R$string.product_code);
                        var26_26 = kotlin.text.b.i((String)var17_17, (String)var23_23, (boolean)var15_15);
                        if (var26_26) {
                            var21_21 = " ";
                            var23_23 = UX.c(var18_18, (String)var23_23, (String)var21_21, (String)var16_16);
                            var17_17 = new SpannableString((CharSequence)var23_23);
                        } else {
                            var23_23 = kp1_0.c(var18_18, (String)var16_16);
                            var17_17 = new SpannableString((CharSequence)var23_23);
                        }
                        var23_23 = new BulletSpan();
                        var25_25 = 33;
                        var17_17.setSpan(var23_23, 0, var15_15, var25_25);
                    } else {
                        var17_17 = new SpannableString((CharSequence)var16_16);
                    }
                    var24_24 /* !! */  = var3_3.w(null, (SpannableString)var17_17);
                    var23_23 = var3_3.d;
                    if (var23_23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                        var22_22 = 0;
                        var23_23 = null;
                    }
                    var23_23.addView(var24_24 /* !! */ );
                    var22_22 = 4;
                    if (var13_13 >= var22_22 && var24_24 /* !! */  != null) {
                        var22_22 = 8;
                        var24_24 /* !! */ .setVisibility(var22_22);
                    }
                }
            }
            ++var13_13;
        }
        var7_7 = var3_3.f;
        var27_27 = "mMoreLessbutton";
        if (var7_7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var27_27);
            var28_28 = 0;
            var7_7 = null;
        }
        var13_13 = R$string.more_info;
        var14_14 = hv3_0.K(var13_13);
        var7_7.setText((CharSequence)var14_14);
        var7_7 = var3_3.f;
        if (var7_7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var27_27);
            var28_28 = 0;
            var7_7 = null;
        }
        var13_13 = R$string.acc_more_product_details;
        var14_14 = hv3_0.K(var13_13);
        var7_7.setContentDescription((CharSequence)var14_14);
        var7_7 = var3_3.f;
        if (var7_7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var27_27);
            var28_28 = 0;
            var7_7 = null;
        }
        var7_7.setOnClickListener((View.OnClickListener)var3_3);
        var7_7 = var3_3.f;
        if (var7_7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var27_27);
            var28_28 = 0;
            var7_7 = null;
        }
        var7_7.setVisibility(0);
        var7_7 = var3_3.g;
        var27_27 = "mOtherInfoLayout";
        if (var7_7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var27_27);
            var28_28 = 0;
            var7_7 = null;
        }
        var13_13 = 8;
        var7_7.setVisibility(var13_13);
        var29_29 = var1_1.isEmpty() ^ var15_15;
        if (var29_29 != 0) {
            var6_6 /* !! */ .setVisibility(0);
        } else {
            var6_6 /* !! */ .setVisibility(var13_13);
        }
        var4_4 = var3_3.e;
        var6_6 /* !! */  = "mDisclosureDynamicLayout";
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var6_6 /* !! */ );
            var29_29 = 0;
            var4_4 = null;
        }
        var4_4.removeAllViews();
        if (var5_5 != null && (var29_29 = var2_2.size()) != 0) {
            var29_29 = var2_2.size();
            var28_28 = 0;
            var7_7 = null;
            while (var28_28 < var29_29) {
                var27_27 = var5_5.get(var28_28);
                Intrinsics.checkNotNullExpressionValue(var27_27, (String)var17_17);
                var27_27 = (MandatoryInfo)var27_27;
                var14_14 = var27_27.getTitle();
                var23_23 = var27_27.getSubTitle();
                var27_27 = var27_27.getKey();
                var21_21 = var3_3.b;
                var30_30 = var21_21.c9();
                var19_19 = "context";
                if (var30_30) {
                    var21_21 = var3_3.c;
                    if (var21_21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var19_19);
                        var30_30 = false;
                        var21_21 = null;
                    }
                    var21_21 = LayoutInflater.from((Context)var21_21);
                    var31_31 = R$layout.luxe_new_row_pdp_mandatory_disclosure;
                    var21_21 = var21_21.inflate(var31_31, null);
                } else {
                    var21_21 = var3_3.c;
                    if (var21_21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var19_19);
                        var30_30 = false;
                        var21_21 = null;
                    }
                    var21_21 = LayoutInflater.from((Context)var21_21);
                    var31_31 = R$layout.new_row_pdp_mandatory_disclosure;
                    var21_21 = var21_21.inflate(var31_31, null);
                }
                Intrinsics.checkNotNull(var21_21);
                var31_31 = R$id.row_pdp_disclosures_tv_name;
                var19_19 = var21_21.findViewById(var31_31);
                var9_9 = "findViewById(...)";
                Intrinsics.checkNotNullExpressionValue(var19_19, (String)var9_9);
                var19_19 = (AjioTextView)var19_19;
                var11_11 = R$id.row_pdp_disclosures_tv_value;
                var12_12 /* !! */  = var21_21.findViewById(var11_11);
                Intrinsics.checkNotNullExpressionValue(var12_12 /* !! */ , (String)var9_9);
                var12_12 /* !! */  = (AjioTextView)var12_12 /* !! */ ;
                var8_8 = TextUtils.isEmpty((CharSequence)var27_27);
                var24_24 /* !! */  = "";
                var32_32 = var29_29;
                var4_4 = "\\\n";
                var5_5 = "\\\\n";
                if (!var8_8) {
                    if (var27_27 != null) {
                        var9_9 = oo1_1.a((String)var5_5, (String)var27_27, (String)var4_4);
                    } else {
                        var8_8 = false;
                        var9_9 = null;
                    }
                    var9_9 = kp1_0.c(var18_18, (String)var9_9);
                    var27_27 = new SpannableString((CharSequence)var9_9);
                    var9_9 = new BulletSpan();
                    var33_33 = var28_28;
                    var34_34 = var17_17;
                    var35_35 = var18_18;
                    var28_28 = 33;
                    var26_26 = false;
                    var17_17 = null;
                    var36_36 = 1;
                    var27_27.setSpan(var9_9, 0, var36_36, var28_28);
                    var19_19.setText((CharSequence)var27_27);
                } else {
                    var33_33 = var28_28;
                    var34_34 = var17_17;
                    var35_35 = var18_18;
                    var28_28 = 33;
                    var26_26 = false;
                    var17_17 = null;
                    var36_36 = 1;
                    var19_19.setText((CharSequence)var24_24 /* !! */ );
                }
                var8_8 = TextUtils.isEmpty((CharSequence)var14_14);
                if (var8_8) {
                    var14_14 = var24_24 /* !! */ ;
                }
                var8_8 = TextUtils.isEmpty((CharSequence)var23_23);
                if (!var8_8) {
                    var14_14 = n1.a(var14_14, (String)var16_16, (String)var23_23);
                }
                if (var14_14 != null) {
                    var4_4 = oo1_1.a((String)var5_5, var14_14, (String)var4_4);
                } else {
                    var29_29 = 0;
                    var4_4 = null;
                }
                var12_12 /* !! */ .setText((CharSequence)var4_4);
                Ru1.a((AjioTextView)var12_12 /* !! */ );
                var4_4 = var3_3.e;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6 /* !! */ );
                    var29_29 = 0;
                    var4_4 = null;
                }
                var4_4.addView((View)var21_21);
                var29_29 = var33_33 + 1;
                var5_5 = var2_2;
                var28_28 = var29_29;
                var18_18 = var35_35;
                var17_17 = var34_34;
                var8_8 = false;
                var9_9 = null;
                var11_11 = 0;
                var12_12 /* !! */  = null;
                var15_15 = 1;
                var29_29 = var32_32;
            }
            var4_4 = var3_3.e;
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6 /* !! */ );
                var29_29 = 8;
                var8_8 = false;
                var9_9 = null;
            } else {
                var9_9 = var4_4;
                var29_29 = 8;
            }
            var9_9.setVisibility(var29_29);
        } else {
            var29_29 = 8;
            var5_5 = var3_3.g;
            if (var5_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var27_27);
                var8_8 = false;
                var9_9 = null;
            } else {
                var9_9 = var5_5;
            }
            var9_9.setVisibility(var29_29);
        }
    }
}

