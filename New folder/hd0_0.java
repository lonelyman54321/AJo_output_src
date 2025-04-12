/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.SpinnerAdapter
 */
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ExchangeReturnSubReasons;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from hD0
 */
public final class hd0_0
implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ gd0_0 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ NestedScrollView c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ gD0$a e;
    public final /* synthetic */ CartEntry f;

    public hd0_0(gd0_0 gd0_02, List list, NestedScrollView nestedScrollView, FragmentActivity fragmentActivity, gD0$a gD0$a, CartEntry cartEntry) {
        this.a = gd0_02;
        this.b = list;
        this.c = nestedScrollView;
        this.d = fragmentActivity;
        this.e = gD0$a;
        this.f = cartEntry;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onItemSelected(AdapterView var1_1, View var2_2, int var3_3, long var4_4) {
        var6_5 = this;
        var7_6 = var1_1;
        var8_7 = var3_3;
        Intrinsics.checkNotNullParameter(var1_1, "parent");
        var9_8 /* !! */  = var2_2;
        Intrinsics.checkNotNullParameter(var2_2, "view");
        var10_9 = this.a;
        var9_8 /* !! */  = var10_9.j;
        hv3_0.S((Activity)var9_8 /* !! */ );
        var7_6 = var1_1.getItemAtPosition(var3_3).toString();
        var10_9.k = var7_6;
        var11_10 = 1;
        var12_11 = 0;
        if (var7_6 == null || (var13_12 = var7_6.length()) == 0) ** GOTO lbl-1000
        var14_13 = z40_0.Companion;
        var14_13 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var14_13).a;
        var15_14 = "wrong_product_reason";
        var16_15 = TextUtils.isEmpty((CharSequence)(var14_13 = var14_13.b((String)var15_14)));
        if (var16_15 == 0) {
            var15_14 = new String[]{"#"};
            var17_16 = 6;
            var14_13 = StringsKt.a0((CharSequence)var14_13, (String[])var15_14, false, 0, var17_16);
            var15_14 = new String[]{};
            var14_13 = var14_13.toArray((T[])var15_14);
            var16_15 = var14_13.length;
            var19_18 = null;
            for (var18_17 = 0; var18_17 < var16_15; ++var18_17) {
                var20_19 = var14_13[var18_17];
                var21_20 = new String[]{":"};
                var20_19 = StringsKt.a0((CharSequence)var20_19, (String[])var21_20, false, 0, var17_16);
                var21_20 = new String[]{};
                var22_21 = (int)kotlin.text.b.i((String)(var20_19 = StringsKt.m0(var20_19.toArray((T[])var21_20)[0]).toString()), (String)(var21_20 = StringsKt.m0((CharSequence)var7_6).toString()), (boolean)var11_10);
                if (var22_21 == 0) continue;
                var23_22 = 1;
                break;
            }
        } else lbl-1000:
        // 3 sources

        {
            var23_22 = 0;
            var7_6 = null;
        }
        var13_12 = (int)var10_9.a;
        var15_14 = var10_9.b;
        if (var13_12 == 0 || var8_7 <= 0 || var23_22 != 0) ** GOTO lbl-1000
        var7_6 = var10_9.f;
        Intrinsics.checkNotNull(var7_6);
        var7_6 = var7_6.e;
        if (var7_6 == null || (var23_22 = var7_6.getSelectedItemPosition()) != 0) {
            if (var15_14 != null) {
                var14_13 = Boolean.TRUE;
                var24_23 = Boolean.FALSE;
                var7_6 = new Pair(var14_13, var24_23);
                var15_14.E((Pair)var7_6);
            }
        } else if (var15_14 != null) {
            var14_13 = Boolean.FALSE;
            var7_6 = new Pair(var14_13, var14_13);
            var15_14.E((Pair)var7_6);
        }
        var7_6 = var10_9.k;
        Intrinsics.checkNotNull(var7_6);
        var14_13 = var6_5.d;
        var16_15 = 8;
        if (var8_7 == 0) {
            var7_6 = var10_9.f;
            Intrinsics.checkNotNull(var7_6);
            var7_6 = var7_6.f;
            Intrinsics.checkNotNull(var7_6);
            var7_6.setVisibility(var16_15);
            var10_9.f(false);
            var7_6 = var10_9.f;
            Intrinsics.checkNotNull(var7_6);
            var7_6 = var7_6.s;
            if (var7_6 != null) {
                ai0_2.i((View)var7_6);
            }
        } else {
            var24_23 = var10_9.f;
            Intrinsics.checkNotNull(var24_23);
            var24_23 = var24_23.f;
            Intrinsics.checkNotNull(var24_23);
            var24_23.setVisibility(0);
            var24_23 = new ArrayList<String>();
            var24_23.add("Select Sub Reason");
            var19_18 = var10_9.g;
            Intrinsics.checkNotNull(var19_18);
            var19_18.setReason((String)var7_6);
            var19_18 = var10_9.g;
            Intrinsics.checkNotNull(var19_18);
            var19_18.setReasonIndex(var8_7);
            var19_18 = var10_9.g;
            Intrinsics.checkNotNull(var19_18);
            var19_18 = var19_18.getSubreasonIndex();
            var20_19 = "_";
            if (var19_18 != null) {
                var21_20 = fT1.a((String)var20_19, (String)var19_18);
                var25_24 = new String[]{};
                var21_20 = ((String[])var21_20.toArray((T[])var25_24))[0];
                var26_25 = Integer.parseInt((String)var21_20);
                var25_24 = var10_9.g;
                Intrinsics.checkNotNull(var25_24);
                var27_26 = var25_24.getReasonIndex();
                if (var26_25 != var27_26) {
                    var21_20 = var10_9.g;
                    Intrinsics.checkNotNull(var21_20);
                    var25_24 = var10_9.g;
                    Intrinsics.checkNotNull(var25_24);
                    var27_26 = var25_24.getReasonIndex();
                    var28_27 = new StringBuilder();
                    var28_27.append(var27_26);
                    var28_27.append("_0");
                    var25_24 = var28_27.toString();
                    var21_20.setSubreasonIndex((String)var25_24);
                }
            }
            if ((var21_20 = var6_5.b) != null) {
                var25_24 = var21_20;
                var25_24 = xx_2.g((Collection)var21_20);
                var27_26 = var25_24.b;
                if (var27_26 >= 0) {
                    var29_28 = 0;
                    var28_27 = null;
                    while (true) {
                        if (var32_31 = kotlin.text.b.i((String)var7_6, var31_30 /* !! */  = (var30_29 = (ReturnOrderItemDetails$ExchangeReturnSubReasons)var21_20.get(var29_28)).getKey().getValue(), (boolean)var11_10)) {
                            var30_29 = var30_29.getValue();
                            Intrinsics.checkNotNull(var30_29);
                            var31_30 /* !! */  = Pattern.quote("|");
                            Intrinsics.checkNotNullExpressionValue(var31_30 /* !! */ , "quote(...)");
                            var15_14 = fT1.a(var31_30 /* !! */ , (String)var30_29);
                            var30_29 = new ArrayList<String>();
                            var15_14 = var15_14.iterator();
                            while (var32_31 = var15_14.hasNext()) {
                                var33_32 /* !! */  = var31_30 /* !! */  = var15_14.next();
                                var33_32 /* !! */  = var31_30 /* !! */ ;
                                var34_33 = TextUtils.isEmpty((CharSequence)var33_32 /* !! */ ) ^ true;
                                if (!var34_33) continue;
                                var30_29.add(var31_30 /* !! */ );
                            }
                            var15_14 = new String[]{};
                            var15_14 = (String[])var30_29.toArray((T[])var15_14);
                            var35_34 = ((Object)var15_14).length;
                            var15_14 = Arrays.copyOf(var15_14, var35_34);
                            Collections.addAll(var24_23, var15_14);
                        }
                        if (var29_28 == var27_26) break;
                        ++var29_28;
                        var16_15 = 8;
                    }
                }
            }
            var16_15 = R$layout.cancel_reason_spinner_layout;
            var21_20 = var14_13;
            var21_20 = (FragmentActivity)var14_13;
            var7_6 = new ck_2((FragmentActivity)var21_20, var16_15, var24_23);
            var15_14 = var10_9.f;
            Intrinsics.checkNotNull(var15_14);
            var15_14 = var15_14.e;
            Intrinsics.checkNotNull(var15_14);
            var15_14.setAdapter((SpinnerAdapter)var7_6);
            if (var19_18 != null) {
                var15_14 = var10_9.g;
                Intrinsics.checkNotNull(var15_14);
                var15_14 = var15_14.getSubreasonIndex();
                Intrinsics.checkNotNull(var15_14);
                var15_14 = fT1.a((String)var20_19, (String)var15_14);
                var19_18 = new String[]{};
                var15_14 = var15_14.toArray(var19_18);
                var19_18 = var10_9.f;
                Intrinsics.checkNotNull(var19_18);
                var19_18 = var19_18.e;
                Intrinsics.checkNotNull(var19_18);
                var15_14 = var15_14[var11_10];
                var16_15 = Integer.parseInt((String)var15_14);
                var19_18.setSelection(var16_15);
            } else {
                var15_14 = var10_9.f;
                Intrinsics.checkNotNull(var15_14);
                var15_14 = var15_14.e;
                Intrinsics.checkNotNull(var15_14);
                var15_14.setSelection(0);
            }
            var19_18 = var6_5.c;
            var22_21 = 1;
            var15_14 = new c9((ViewGroup)var19_18, var22_21);
            var36_35 = 100;
            var19_18.postDelayed((Runnable)var15_14, var36_35);
            var23_22 = var7_6.getCount();
            if (var23_22 > var11_10) {
                var7_6 = var10_9.f;
                var12_11 = 3;
                gd0_0.o((gD0$a)var7_6, var12_11, var8_7);
            } else {
                var7_6 = var10_9.f;
                var16_15 = 4;
                gd0_0.o((gD0$a)var7_6, var16_15, 0);
                var7_6 = var10_9.f;
                Intrinsics.checkNotNull(var7_6);
                var7_6 = var7_6.d;
                Intrinsics.checkNotNull(var7_6);
                var7_6.setSelection(var8_7);
            }
            var23_22 = var24_23.size();
            if (var23_22 <= var11_10) {
                var7_6 = var10_9.f;
                Intrinsics.checkNotNull(var7_6);
                var7_6 = var7_6.c;
                Intrinsics.checkNotNull(var7_6);
                var11_10 = 8;
                var7_6.setVisibility(var11_10);
            }
        }
        var7_6 = var6_5.e;
        if (var8_7 != 0) {
            var38_36 = var7_6.u;
            if (var38_36 != null) {
                var9_8 /* !! */  = var10_9.k;
                var38_36.setText((CharSequence)var9_8 /* !! */ );
            }
            if ((var38_36 = var7_6.u) != null) {
                var9_8 /* !! */  = var10_9.k;
                var38_36.setContentDescription((CharSequence)var9_8 /* !! */ );
            }
            var38_36 = var7_6.w;
            var9_8 /* !! */  = "Reason";
            if (var38_36 != null) {
                var38_36.setHint((CharSequence)var9_8 /* !! */ );
            }
            if ((var7_6 = var7_6.w) != null) {
                var7_6.setContentDescription((CharSequence)var9_8 /* !! */ );
            }
        } else {
            var38_36 = var7_6.u;
            var9_8 /* !! */  = "";
            if (var38_36 != null) {
                var38_36.setText((CharSequence)var9_8 /* !! */ );
            }
            if ((var38_36 = var7_6.u) != null) {
                var38_36.setContentDescription((CharSequence)var9_8 /* !! */ );
            }
            if ((var38_36 = var7_6.w) != null) {
                var38_36.setHint((CharSequence)var9_8 /* !! */ );
            }
            if ((var7_6 = var7_6.w) != null) {
                var7_6.setContentDescription((CharSequence)var9_8 /* !! */ );
            }
        }
        if ((var38_36 = (var7_6 = var6_5.f).getCancelComments()) != null && (var8_7 = (int)var7_6.getIsReturnItem()) != 0 && (var38_36 = var10_9.l) != null) {
            var10_9.l = var7_6 = var7_6.getCancelComments();
        }
        var10_9.j((Activity)var14_13);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

