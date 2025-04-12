/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Order.ReturnAttempt;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.SubStatus;
import com.ril.mp.services.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from fO2
 */
public final class fo2_2
extends vw_0 {
    public final HN2 a;
    public final OnFragmentInteractionListener b;
    public final qz1_2 c;
    public final LinearLayout d;
    public final AjioTextView e;
    public final TextView f;
    public ReturnRequest g;

    public fo2_2(View view, HN2 object, OnFragmentInteractionListener onFragmentInteractionListener, qz1_2 qz1_22) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(qz1_22, "newOrderDetailsViewModel");
        super(view);
        this.a = object;
        this.b = onFragmentInteractionListener;
        this.c = qz1_22;
        int n3 = R$id.main_tracker_layout;
        object = (LinearLayout)view.findViewById(n3);
        this.d = object;
        n3 = R$id.cancelReturn;
        this.e = object = (AjioTextView)view.findViewById(n3);
        n3 = R$id.return_cancel_request_under_process_tv;
        view = (TextView)view.findViewById(n3);
        this.f = view;
    }

    public static Pair x(fo2_2 object, String object2, Drawable drawable2, int n3) {
        block8: {
            int n4;
            block7: {
                int n7;
                block9: {
                    n4 = hv3_0.m(R$color.accent_color_10);
                    if ((n3 &= 4) != 0) {
                        n7 = com.ril.ajio.R$drawable.return_refund_orange_circle;
                        drawable2 = hv3_0.r(n7);
                    }
                    object.getClass();
                    object = h40_0.a;
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    String string2 = "enable_order_cancelltaion_reasons";
                    boolean n8 = ((ao0_0)object).a(string2);
                    if (!n8) break block7;
                    int n10 = ((String)object2).hashCode();
                    switch (n10) {
                        default: {
                            break;
                        }
                        case 68081379: {
                            object = "GREEN";
                            boolean bl2 = ((String)object2).equals(object);
                            if (!bl2) break;
                            int n14 = hv3_0.m(R$color.accent_color_2);
                            object2 = n14;
                            n7 = com.ril.ajio.R$drawable.return_refund_orange_circle;
                            drawable2 = hv3_0.r(n7);
                            object = new Pair(object2, drawable2);
                            break block8;
                        }
                        case 63281119: {
                            object = "BLACK";
                            boolean bl3 = ((String)object2).equals(object);
                            if (!bl3) break;
                            int n15 = hv3_0.m(R$color.accent_color_10);
                            object2 = n15;
                            n7 = com.ril.ajio.R$drawable.return_refund_orange_circle;
                            drawable2 = hv3_0.r(n7);
                            object = new Pair(object2, drawable2);
                            break block8;
                        }
                        case 81009: {
                            object = "RED";
                            boolean bl4 = ((String)object2).equals(object);
                            if (!bl4) break;
                            int n16 = hv3_0.m(R$color.accent_color_1);
                            object2 = n16;
                            n7 = com.ril.ajio.R$drawable.return_refund_red_circle;
                            drawable2 = hv3_0.r(n7);
                            object = new Pair(object2, drawable2);
                            break block8;
                        }
                        case -1680910220: {
                            object = "YELLOW";
                            boolean bl5 = ((String)object2).equals(object);
                            if (bl5) break block9;
                        }
                    }
                    object2 = n4;
                    object = new Pair(object2, drawable2);
                    break block8;
                }
                int n17 = hv3_0.m(R$color.new_accent_color_43);
                object2 = n17;
                n7 = R$drawable.main_ret_status_complete_image;
                drawable2 = hv3_0.r(n7);
                object = new Pair(object2, drawable2);
                break block8;
            }
            object2 = n4;
            object = new Pair(object2, drawable2);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w(Object var1_1, Object var2_2) {
        block142: {
            block141: {
                block133: {
                    var3_3 = this;
                    var4_4 = var1_1;
                    var5_5 = var2_2;
                    var6_6 = var2_2 instanceof ReturnRequest;
                    var7_7 = 0;
                    var8_8 = null;
                    if (var6_6 != 0) {
                        var5_5 = (ReturnRequest)var2_2;
                    } else {
                        var9_9 = 0;
                        var5_5 = null;
                    }
                    var3_3.g = var5_5;
                    Intrinsics.checkNotNull(var4_4, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData");
                    var4_4 = ((pa2_0)var4_4).b;
                    Intrinsics.checkNotNull(var4_4, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Order.ReturnOrderTracker>");
                    var4_4 = (ArrayList)var4_4;
                    var5_5 = var4_4.iterator();
                    var10_10 = 0;
                    var11_11 = null;
                    while (true) {
                        block140: {
                            block139: {
                                block136: {
                                    block137: {
                                        block138: {
                                            block134: {
                                                block135: {
                                                    var12_12 = var5_5.hasNext();
                                                    var13_13 = 1;
                                                    var14_14 = "";
                                                    var15_15 = 10;
                                                    var16_16 = var3_3.d;
                                                    if (var12_12 == 0) break block133;
                                                    var17_17 = var5_5.next();
                                                    var18_18 = var10_10 + 1;
                                                    if (var10_10 < 0) break;
                                                    var17_17 = (ReturnOrderTracker)var17_17;
                                                    var19_19 = var4_4.size() - var13_13;
                                                    if (var10_10 < var19_19) {
                                                        var20_20 = (ReturnOrderTracker)var4_4.get(var18_18);
                                                    } else {
                                                        var19_19 = 0;
                                                        var20_20 = null;
                                                    }
                                                    var21_21 = var4_4.size();
                                                    var22_22 = FontsManager.getInstance();
                                                    var23_23 = AJIOApplication.Companion;
                                                    var23_23.getClass();
                                                    var24_24 = AJIOApplication$a.a();
                                                    var24_24 = var22_22.getTypefaceWithFont((Context)var24_24, var15_15);
                                                    if (var17_17 != null) {
                                                        var22_22 = var17_17.getSubStatus();
                                                    } else {
                                                        var25_25 = 0;
                                                        var22_22 = null;
                                                    }
                                                    var26_26 = "RED";
                                                    var27_27 = 17;
                                                    if (var22_22 == null) break block135;
                                                    var22_22 = var17_17.getSubStatus();
                                                    Intrinsics.checkNotNull(var22_22);
                                                    var25_25 = var22_22.size();
                                                    if (var25_25 <= 0) break block135;
                                                    var22_22 = LayoutInflater.from((Context)var16_16.getContext());
                                                    var28_28 = R$layout.return_refund_tracker_row_with_substatus;
                                                    var29_29 = var22_22.inflate(var28_28, null);
                                                    var25_25 = R$id.top_line;
                                                    var22_22 = (ImageView)var29_29.findViewById(var25_25);
                                                    var7_7 = R$id.main_status_circle;
                                                    var8_8 = (ImageView)var29_29.findViewById(var7_7);
                                                    var13_13 = R$id.main_status_txt;
                                                    var30_30 /* !! */  = (TextView)var29_29.findViewById(var13_13);
                                                    var31_31 = var4_4;
                                                    var32_32 = R$id.main_line;
                                                    var4_4 = (ImageView)var29_29.findViewById(var32_32);
                                                    var33_33 = var5_5;
                                                    var9_9 = R$id.sub_status_circle;
                                                    var5_5 = (ImageView)var29_29.findViewById(var9_9);
                                                    var34_34 = var22_22;
                                                    var25_25 = R$id.sub_status_txt;
                                                    var22_22 = (AjioTextView)var29_29.findViewById(var25_25);
                                                    var35_35 = var14_14;
                                                    var36_36 = R$id.sub_line;
                                                    var14_14 = (ImageView)var29_29.findViewById(var36_36);
                                                    var37_37 = var18_18;
                                                    var38_38 = var30_30 /* !! */ ;
                                                    var38_38 = (AjioTextView)var30_30 /* !! */ ;
                                                    var39_39 = var17_17.getReturnMessage();
                                                    if (var39_39 != null && (var40_40 = var39_39.length()) != 0) {
                                                        var39_39 = var17_17.getReturnMessage();
lbl83:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var39_39 = var17_17.getMainStatusName();
                                                    ** continue;
                                                    var41_41 = var24_24;
                                                    var24_24 = var39_39;
                                                    var38_38.setText((CharSequence)var39_39);
                                                    var24_24 = new StringBuilder();
                                                    var38_38 = var17_17.getSubStatus();
                                                    Intrinsics.checkNotNull(var38_38);
                                                    var38_38 = var38_38.iterator();
                                                    var39_39 = var20_20;
                                                    var20_20 = "iterator(...)";
                                                    Intrinsics.checkNotNullExpressionValue(var38_38, (String)var20_20);
                                                    while ((var19_19 = (int)var38_38.hasNext()) != 0) {
                                                        var20_20 = var38_38.next();
                                                        var42_42 = var38_38;
                                                        Intrinsics.checkNotNullExpressionValue(var20_20, "next(...)");
                                                        var20_20 = (SubStatus)var20_20;
                                                        var38_38 = var20_20.getSubStatusMessage();
                                                        var24_24.append((String)var38_38);
                                                        var38_38 = var42_42;
                                                    }
                                                    var24_24 = var24_24.toString();
                                                    var22_22.setText((CharSequence)var24_24);
                                                    var24_24 = var17_17.getSubStatus();
                                                    Intrinsics.checkNotNull(var24_24);
                                                    var6_6 = (int)var24_24.isEmpty();
                                                    var18_18 = 1;
                                                    if ((var6_6 ^= var18_18) != 0) {
                                                        var24_24 = var17_17.getSubStatus();
                                                        Intrinsics.checkNotNull(var24_24);
                                                        var24_24 = CollectionsKt.L((List)var24_24);
                                                        if (var24_24 != null) {
                                                            var24_24 = var17_17.getSubStatus();
                                                            Intrinsics.checkNotNull(var24_24);
                                                            var24_24 = ((SubStatus)CollectionsKt.L((List)var24_24)).getTextColorCode();
                                                            if (var24_24 != null) {
                                                                var24_24 = var17_17.getSubStatus();
                                                                Intrinsics.checkNotNull(var24_24);
                                                                var24_24 = ((SubStatus)CollectionsKt.L((List)var24_24)).getTextColorCode();
                                                                Intrinsics.checkNotNull(var24_24);
                                                                var18_18 = 0;
                                                                var38_38 = null;
                                                                var19_19 = 6;
                                                                var24_24 = (Number)fo2_2.x((fo2_2)var3_3, (String)var24_24, null, (int)var19_19).a;
                                                                var6_6 = var24_24.intValue();
                                                                var22_22.setTextColor(var6_6);
                                                            }
                                                        }
                                                    }
                                                    var6_6 = com.ril.ajio.R$drawable.return_refund_dotted_line;
                                                    var14_14.setImageResource(var6_6);
                                                    var6_6 = R$string.acc_icon_dotted_line_icon;
                                                    var24_24 = hv3_0.K(var6_6);
                                                    var14_14.setContentDescription((CharSequence)var24_24);
                                                    var24_24 = var17_17.isActive();
                                                    if (var24_24 != null && (var6_6 = (int)Intrinsics.areEqual(var24_24 = var17_17.isActive(), var22_22 = Boolean.FALSE)) == 0) {
                                                        var5_5 = var17_17.isActive();
                                                        if (var5_5 != null && (var9_9 = (int)Intrinsics.areEqual(var5_5 = var17_17.isActive(), var24_24 = Boolean.TRUE)) != 0 && var10_10 == (var9_9 = var21_21 + -1) && (var9_9 = (int)(var5_5 = var17_17.getActiveBar()).equals(var26_26)) == 0) {
                                                            var5_5 = var3_3.g;
                                                            var9_9 = var5_5 != null && (var9_9 = (int)var5_5.isImpsFailed()) == (var6_6 = 1) ? com.ril.ajio.R$drawable.ic_close_red : R$drawable.main_ret_status_complete_image;
                                                            var8_8.setImageResource(var9_9);
                                                            var5_5 = var8_8.getLayoutParams();
                                                            var5_5.height = var6_6 = mz3_0.d(var27_27);
                                                            var5_5 = var8_8.getLayoutParams();
                                                            var5_5.width = var6_6 = mz3_0.d(var27_27);
                                                        } else {
                                                            var5_5 = var17_17.isActive();
                                                            if (var5_5 != null && (var9_9 = (int)Intrinsics.areEqual(var5_5 = var17_17.isActive(), var24_24 = Boolean.TRUE)) != 0 && var10_10 == (var9_9 = var21_21 + -1) && (var9_9 = (int)(var5_5 = var17_17.getActiveBar()).equals(var26_26)) != 0) {
                                                                var5_5 = var3_3.g;
                                                                var9_9 = var5_5 != null && (var9_9 = (int)var5_5.isImpsFailed()) == (var6_6 = 1) ? com.ril.ajio.R$drawable.ic_close_red : R$drawable.main_ret_status_complete_image;
                                                                var8_8.setImageResource(var9_9);
                                                                var5_5 = var8_8.getLayoutParams();
                                                                var5_5.height = var6_6 = mz3_0.d(var27_27);
                                                                var5_5 = var8_8.getLayoutParams();
                                                                var5_5.width = var6_6 = mz3_0.d(var27_27);
                                                            }
                                                        }
                                                    } else {
                                                        var6_6 = com.ril.ajio.R$drawable.return_refund_inactive_circle;
                                                        var8_8.setImageResource(var6_6);
                                                        var6_6 = com.ril.ajio.R$drawable.return_refund_inactive_circle;
                                                        var5_5.setImageResource(var6_6);
                                                        var9_9 = com.ril.ajio.R$drawable.return_refund_dotted_line;
                                                        var4_4.setImageResource(var9_9);
                                                        var5_5 = hv3_0.K(R$string.acc_icon_dotted_line_icon);
                                                        var4_4.setContentDescription((CharSequence)var5_5);
                                                        var9_9 = R$style.muli_regular_14_accent_12;
                                                        Hm3.f(var30_30 /* !! */ , var9_9);
                                                    }
                                                    var16_16.addView((View)var29_29);
                                                    var22_22 = var34_34;
                                                    var20_20 = var41_41;
                                                    var9_9 = 0;
                                                    var5_5 = null;
                                                    break block136;
                                                }
                                                var31_31 = var4_4;
                                                var33_33 = var5_5;
                                                var41_41 = var24_24;
                                                var35_35 = var14_14;
                                                var37_37 = var18_18;
                                                var39_39 = var20_20;
                                                var4_4 = LayoutInflater.from((Context)var16_16.getContext());
                                                var9_9 = R$layout.return_refund_tracker_row_without_subtatus;
                                                var4_4 = var4_4.inflate(var9_9, null);
                                                var9_9 = R$id.top_line;
                                                var22_22 = var5_5 = var4_4.findViewById(var9_9);
                                                var22_22 = (ImageView)var5_5;
                                                var9_9 = R$id.bottom_line;
                                                var5_5 = (ImageView)var4_4.findViewById(var9_9);
                                                var6_6 = R$id.main_status_txt;
                                                var24_24 = var4_4.findViewById(var6_6);
                                                var30_30 /* !! */  = var24_24;
                                                var30_30 /* !! */  = (TextView)var24_24;
                                                var24_24 = var30_30 /* !! */ ;
                                                var24_24 = (AjioTextView)var30_30 /* !! */ ;
                                                if (var17_17 != null) {
                                                    var8_8 = var17_17.getReturnMessage();
                                                } else {
                                                    var7_7 = 0;
                                                    var8_8 = null;
                                                }
                                                if (var8_8 == null || (var7_7 = var8_8.length()) == 0) ** GOTO lbl209
                                                if (var17_17 != null) {
                                                    var8_8 = var17_17.getReturnMessage();
                                                } else {
                                                    while (true) {
                                                        var7_7 = 0;
                                                        var8_8 = null;
                                                        break block134;
                                                        break;
                                                    }
lbl209:
                                                    // 1 sources

                                                    if (var17_17 == null) ** continue;
                                                    var8_8 = var17_17.getMainStatusName();
                                                }
                                            }
                                            var24_24.setText((CharSequence)var8_8);
                                            var6_6 = R$id.main_status_desc;
                                            var24_24 = (AjioTextView)var4_4.findViewById(var6_6);
                                            if (var39_39 != null) {
                                                var8_8 = var39_39.isActive();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var8_8 != null) break block137;
                                            if (var39_39 != null) {
                                                var8_8 = var39_39.isActive();
                                                var29_29 = Boolean.TRUE;
                                                var7_7 = (int)Intrinsics.areEqual(var8_8, var29_29);
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var7_7 != 0) break block137;
                                            if (var17_17 != null) {
                                                var8_8 = var17_17.isActive();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var8_8 != null) break block138;
                                            if (var17_17 != null) {
                                                var8_8 = var17_17.isActive();
                                                var29_29 = Boolean.TRUE;
                                                var7_7 = (int)Intrinsics.areEqual(var8_8, var29_29);
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var7_7 == 0) break block137;
                                        }
                                        if ((var8_8 = var17_17.getMainStatusName()) != null && (var28_28 = var8_8.length()) != 0) {
                                            var28_28 = 0;
                                            var29_29 = null;
                                        } else {
                                            var28_28 = 1;
                                        }
                                        if (var28_28 == 0) {
                                            var29_29 = "Return accepted";
                                            var36_36 = 1;
                                            var28_28 = (int)kotlin.text.b.i((String)var8_8, (String)var29_29, (boolean)var36_36);
                                            if (var28_28 != 0) {
                                                var7_7 = R$string.return_accepted_desc;
                                                var8_8 = hv3_0.K(var7_7);
                                                var24_24.setText((CharSequence)var8_8);
                                                Intrinsics.checkNotNull(var24_24);
                                                ai0_2.B((View)var24_24);
                                            } else {
                                                var29_29 = "Refund initiated";
                                                var7_7 = (int)kotlin.text.b.i((String)var8_8, (String)var29_29, (boolean)var36_36);
                                                if (var7_7 != 0) {
                                                    var7_7 = R$string.return_initiated_desc;
                                                    var8_8 = hv3_0.K(var7_7);
                                                    var24_24.setText((CharSequence)var8_8);
                                                    Intrinsics.checkNotNull(var24_24);
                                                    ai0_2.B((View)var24_24);
                                                }
                                            }
                                        }
                                    }
                                    if (var17_17 != null) {
                                        var8_8 = var17_17.getDescription();
                                    } else {
                                        var7_7 = 0;
                                        var8_8 = null;
                                    }
                                    if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                                        var7_7 = 0;
                                        var8_8 = null;
                                    } else {
                                        var7_7 = 1;
                                    }
                                    if (var7_7 == 0) {
                                        var7_7 = R$id.description;
                                        var8_8 = (AjioTextView)var4_4.findViewById(var7_7);
                                        Intrinsics.checkNotNull(var8_8);
                                        if (var17_17 != null) {
                                            var29_29 = var17_17.getDescription();
                                        } else {
                                            var28_28 = 0;
                                            var29_29 = null;
                                        }
                                        ai0_2.z((TextView)var8_8, (String)var29_29);
                                    }
                                    if (var17_17 != null) {
                                        var8_8 = var17_17.getAttemptList();
                                    } else {
                                        var7_7 = 0;
                                        var8_8 = null;
                                    }
                                    if (var8_8 == null) ** GOTO lbl-1000
                                    var8_8 = var17_17.getAttemptList();
                                    Intrinsics.checkNotNull(var8_8);
                                    var7_7 = var8_8.size();
                                    if (var7_7 > 0) {
                                        var7_7 = R$id.attempts_layout;
                                        var8_8 = (LinearLayout)var4_4.findViewById(var7_7);
                                        var28_28 = 0;
                                        var8_8.setVisibility(0);
                                        var29_29 = var17_17.getAttemptList();
                                        Intrinsics.checkNotNull(var29_29);
                                        var29_29 = var29_29.iterator();
                                        var36_36 = 0;
                                        var14_14 = null;
                                        while ((var18_18 = (int)var29_29.hasNext()) != 0) {
                                            var38_38 = var29_29.next();
                                            var19_19 = var36_36 + 1;
                                            if (var36_36 >= 0) {
                                                var38_38 = (ReturnAttempt)var38_38;
                                                var14_14 = LayoutInflater.from((Context)var16_16.getContext());
                                                var34_34 = var5_5;
                                                var9_9 = R$layout.refund_attempt_tv;
                                                var42_42 = var29_29;
                                                var5_5 = var14_14.inflate(var9_9, null);
                                                var28_28 = R$id.attempt;
                                                var29_29 = var5_5.findViewById(var28_28);
                                                Intrinsics.checkNotNullExpressionValue(var29_29, "findViewById(...)");
                                                var29_29 = (AjioTextView)var29_29;
                                                var14_14 = var38_38.getAttempt();
                                                var29_29.setText((CharSequence)var14_14);
                                                var36_36 = hv3_0.m(R$color.accent_color_20);
                                                var38_38 = var17_17.getAttemptListColor();
                                                var43_43 = var36_36;
                                                var14_14 = "BLACK";
                                                var44_44 = var19_19;
                                                var19_19 = 1;
                                                var36_36 = (int)kotlin.text.b.i((String)var38_38, (String)var14_14, (boolean)var19_19);
                                                var36_36 = var36_36 != 0 ? hv3_0.m(R$color.accent_color_10) : var43_43;
                                                var29_29.setTextColor(var36_36);
                                                var8_8.addView((View)var5_5);
                                                var5_5 = var34_34;
                                                var29_29 = var42_42;
                                                var36_36 = var44_44;
                                                continue;
                                            }
                                            xx_2.n();
                                            throw null;
                                        }
                                        var34_34 = var5_5;
                                        if (var39_39 != null) {
                                            var5_5 = var39_39.isActive();
                                        } else {
                                            var9_9 = 0;
                                            var5_5 = null;
                                        }
                                        if (var5_5 == null || (var9_9 = (int)Intrinsics.areEqual(var5_5 = var39_39.isActive(), var29_29 = Boolean.FALSE)) != 0) {
                                            var9_9 = var8_8.getChildCount();
                                            var28_28 = 1;
                                            var5_5 = var8_8.getChildAt(var9_9 -= var28_28);
                                            var8_8 = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.AjioTextView";
                                            Intrinsics.checkNotNull(var5_5, (String)var8_8);
                                            var5_5 = (AjioTextView)var5_5;
                                            var7_7 = hv3_0.m(R$color.new_accent_color_39);
                                            var5_5.setTextColor(var7_7);
                                        }
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var34_34 = var5_5;
                                    }
                                    var9_9 = R$id.main_status_circle;
                                    var8_8 = var5_5 = var4_4.findViewById(var9_9);
                                    var8_8 = (ImageView)var5_5;
                                    var9_9 = R$id.main_line;
                                    var5_5 = (ImageView)var4_4.findViewById(var9_9);
                                    if (var17_17 != null) {
                                        var29_29 = var17_17.isActive();
                                    } else {
                                        var28_28 = 0;
                                        var29_29 = null;
                                    }
                                    if (var29_29 != null && (var28_28 = (int)Intrinsics.areEqual(var29_29 = var17_17.isActive(), var14_14 = Boolean.FALSE)) == 0) {
                                        var29_29 = var17_17.isActive();
                                        if (var29_29 != null && (var28_28 = (int)Intrinsics.areEqual(var29_29 = var17_17.isActive(), var14_14 = Boolean.TRUE)) != 0 && var10_10 == (var28_28 = var21_21 + -1) && (var28_28 = (int)(var29_29 = var17_17.getActiveBar()).equals(var26_26)) != 0) {
                                            var29_29 = var3_3.g;
                                            if (var29_29 != null && (var28_28 = (int)var29_29.isImpsFailed()) == (var36_36 = 1)) {
                                                var28_28 = 1;
                                            } else {
                                                var28_28 = 0;
                                                var29_29 = null;
                                            }
                                            if (var28_28 != 0) {
                                                var28_28 = com.ril.ajio.R$drawable.ic_close_red;
lbl378:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var28_28 = R$drawable.main_ret_status_complete_image;
                                            ** continue;
                                            var29_29 = hv3_0.r(var28_28);
                                            var14_14 = var17_17.getMilestoneTextColor();
                                            if (var14_14 == null) {
                                                var14_14 = var35_35;
                                            }
                                            var18_18 = 2;
                                            var29_29 = fo2_2.x(var3_3, (String)var14_14, (Drawable)var29_29, var18_18);
                                            Intrinsics.checkNotNull(var41_41);
                                            var14_14 = (Number)var29_29.a;
                                            var36_36 = var14_14.intValue();
                                            var20_20 = var41_41;
                                            ai0_2.w(var30_30 /* !! */ , (Typeface)var41_41, var36_36, var18_18);
                                            var29_29 = (Drawable)var29_29.b;
                                            var8_8.setImageDrawable((Drawable)var29_29);
                                            var29_29 = var8_8.getLayoutParams();
                                            var29_29.height = var36_36 = mz3_0.d(var27_27);
                                            var29_29 = var8_8.getLayoutParams();
                                            var29_29.width = var36_36 = mz3_0.d(var27_27);
                                            Intrinsics.checkNotNull(var24_24);
                                            var29_29 = var17_17.getRefundInformation();
                                            ai0_2.z((TextView)var24_24, (String)var29_29);
                                        } else {
                                            var20_20 = var41_41;
                                            var29_29 = var17_17.isActive();
                                            if (var29_29 != null && (var28_28 = (int)Intrinsics.areEqual(var29_29 = var17_17.isActive(), var14_14 = Boolean.TRUE)) != 0 && var10_10 == (var28_28 = var21_21 + -1) && (var28_28 = (int)(var29_29 = var17_17.getActiveBar()).equals(var26_26)) == 0) {
                                                var29_29 = var3_3.g;
                                                if (var29_29 != null && (var28_28 = (int)var29_29.isImpsFailed()) == (var36_36 = 1)) {
                                                    var28_28 = 1;
                                                } else {
                                                    var28_28 = 0;
                                                    var29_29 = null;
                                                }
                                                if (var28_28 != 0) {
                                                    var28_28 = com.ril.ajio.R$drawable.ic_close_red;
lbl414:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var28_28 = R$drawable.main_ret_status_complete_image;
                                                ** continue;
                                                var29_29 = hv3_0.r(var28_28);
                                                var14_14 = var17_17.getMilestoneTextColor();
                                                if (var14_14 == null) {
                                                    var14_14 = var35_35;
                                                }
                                                var18_18 = 2;
                                                var29_29 = fo2_2.x(var3_3, (String)var14_14, (Drawable)var29_29, var18_18);
                                                Intrinsics.checkNotNull(var20_20);
                                                var14_14 = (Number)var29_29.a;
                                                var36_36 = var14_14.intValue();
                                                ai0_2.w(var30_30 /* !! */ , (Typeface)var20_20, var36_36, var18_18);
                                                var29_29 = (Drawable)var29_29.b;
                                                var8_8.setImageDrawable((Drawable)var29_29);
                                                var29_29 = var8_8.getLayoutParams();
                                                var29_29.height = var36_36 = mz3_0.d(var27_27);
                                                var29_29 = var8_8.getLayoutParams();
                                                var29_29.width = var36_36 = mz3_0.d(var27_27);
                                                Intrinsics.checkNotNull(var24_24);
                                                var29_29 = var17_17.getRefundInformation();
                                                ai0_2.z((TextView)var24_24, (String)var29_29);
                                            } else {
                                                var24_24 = var17_17.getMilestoneTextColor();
                                                if (var24_24 == null) {
                                                    var24_24 = var35_35;
                                                }
                                                var29_29 = null;
                                                var36_36 = 6;
                                                var24_24 = fo2_2.x(var3_3, (String)var24_24, null, var36_36);
                                                Intrinsics.checkNotNull(var20_20);
                                                var24_24 = (Number)var24_24.a;
                                                var6_6 = var24_24.intValue();
                                                var28_28 = 2;
                                                ai0_2.w(var30_30 /* !! */ , (Typeface)var20_20, var6_6, var28_28);
                                            }
                                        }
                                    } else {
                                        var20_20 = var41_41;
                                        var6_6 = com.ril.ajio.R$drawable.return_refund_inactive_circle;
                                        var8_8.setImageResource(var6_6);
                                        var6_6 = com.ril.ajio.R$drawable.return_refund_dotted_line;
                                        var5_5.setImageResource(var6_6);
                                        var24_24 = hv3_0.K(R$string.acc_icon_dotted_line_icon);
                                        var5_5.setContentDescription((CharSequence)var24_24);
                                        var6_6 = com.ril.ajio.R$drawable.return_refund_dotted_line;
                                        var22_22.setImageResource(var6_6);
                                        var24_24 = hv3_0.K(R$string.acc_icon_dotted_line_icon);
                                        var22_22.setContentDescription((CharSequence)var24_24);
                                        var6_6 = R$style.muli_regular_14_accent_12;
                                        Hm3.f(var30_30 /* !! */ , var6_6);
                                    }
                                    var16_16.addView((View)var4_4);
                                    var4_4 = var5_5;
                                    var5_5 = var34_34;
                                }
                                if (var17_17 != null) {
                                    var24_24 = var17_17.isActive();
                                    var29_29 = Boolean.TRUE;
                                    var6_6 = (int)Intrinsics.areEqual(var24_24, var29_29);
                                } else {
                                    var6_6 = 0;
                                    var24_24 = null;
                                }
                                if (var6_6 != 0 && (var6_6 = (int)(var24_24 = var17_17.getActiveBar()).equals(var26_26)) != 0) {
                                    var24_24 = var17_17.getMilestoneTextColor();
                                    var14_14 = var24_24 == null ? var35_35 : var24_24;
                                    var6_6 = com.ril.ajio.R$drawable.return_refund_red_circle;
                                    var24_24 = hv3_0.r(var6_6);
                                    var28_28 = 2;
                                    var24_24 = fo2_2.x(var3_3, (String)var14_14, (Drawable)var24_24, var28_28);
                                    Intrinsics.checkNotNull(var20_20);
                                    var14_14 = (Number)var24_24.a;
                                    var36_36 = var14_14.intValue();
                                    ai0_2.w(var30_30 /* !! */ , (Typeface)var20_20, var36_36, var28_28);
                                    var29_29 = var3_3.g;
                                    if (var29_29 != null && (var28_28 = (int)var29_29.isImpsFailed()) == (var13_13 = 1)) {
                                        var13_13 = 1;
                                    } else {
                                        var13_13 = 0;
                                        var30_30 /* !! */  = null;
                                    }
                                    if (var13_13 != 0) {
                                        var6_6 = com.ril.ajio.R$drawable.ic_close_red;
                                        var24_24 = hv3_0.r(var6_6);
                                    } else {
                                        var24_24 = (Drawable)var24_24.b;
                                    }
                                    var8_8.setImageDrawable((Drawable)var24_24);
                                    var6_6 = com.ril.ajio.R$drawable.return_refund_red_line;
                                    var4_4.setImageResource(var6_6);
                                    if (var5_5 != null) {
                                        var6_6 = com.ril.ajio.R$drawable.return_refund_red_line;
                                        var5_5.setImageResource(var6_6);
                                    }
                                }
                                if (var17_17 != null) {
                                    var24_24 = var17_17.isActive();
                                } else {
                                    var6_6 = 0;
                                    var24_24 = null;
                                }
                                if (var24_24 == null) break block139;
                                if (var39_39 != null) {
                                    var24_24 = var39_39.isActive();
                                    var8_8 = Boolean.FALSE;
                                    var6_6 = (int)Intrinsics.areEqual(var24_24, var8_8);
                                } else {
                                    var6_6 = 0;
                                    var24_24 = null;
                                }
                                if (var6_6 == 0) break block140;
                            }
                            var6_6 = com.ril.ajio.R$drawable.return_refund_dotted_line;
                            var4_4.setImageResource(var6_6);
                            var6_6 = R$string.acc_icon_dotted_line_icon;
                            var24_24 = hv3_0.K(var6_6);
                            var4_4.setContentDescription((CharSequence)var24_24);
                            if (var5_5 != null) {
                                var6_6 = com.ril.ajio.R$drawable.return_refund_dotted_line;
                                var5_5.setImageResource(var6_6);
                            }
                            if (var5_5 != null) {
                                var6_6 = R$string.acc_icon_dotted_line_icon;
                                var24_24 = hv3_0.K(var6_6);
                                var5_5.setContentDescription((CharSequence)var24_24);
                            }
                        }
                        var6_6 = 8;
                        if (var10_10 == 0) {
                            var22_22.setVisibility(var6_6);
                        }
                        if (var10_10 == (var21_21 += -1)) {
                            if (var5_5 != null) {
                                var5_5.setVisibility(var6_6);
                            }
                            var4_4.setVisibility(var6_6);
                        }
                        var4_4 = var31_31;
                        var5_5 = var33_33;
                        var10_10 = var37_37;
                        var7_7 = 0;
                        var8_8 = null;
                    }
                    xx_2.n();
                    throw null;
                }
                var35_35 = var14_14;
                var4_4 = h40_0.a;
                var9_9 = var4_4.i2();
                var24_24 = var3_3.e;
                if (var9_9 == 0) ** GOTO lbl-1000
                var5_5 = var3_3.g;
                if (var5_5 != null && (var9_9 = var5_5.isReturnCancelAvailable()) == (var7_7 = 1)) {
                    var9_9 = 1;
                } else {
                    var9_9 = 0;
                    var5_5 = null;
                }
                if (var9_9 != 0) {
                    var9_9 = 0;
                    var24_24.setVisibility(0);
                    var7_7 = 1;
                    var5_5 = new oo_1(var3_3, var7_7);
                    var24_24.setOnClickListener((View.OnClickListener)var5_5);
                } else lbl-1000:
                // 2 sources

                {
                    var24_24.setVisibility(8);
                    var9_9 = 0;
                    var5_5 = null;
                    var24_24.setOnClickListener(null);
                }
                var32_32 = var4_4.i2();
                var5_5 = var3_3.f;
                if (var32_32 == 0) ** GOTO lbl-1000
                var4_4 = var3_3.g;
                if (var4_4 != null) {
                    var4_4 = var4_4.getReturnCancelCtaMessage();
                } else {
                    var32_32 = 0;
                    var4_4 = null;
                }
                if (var4_4 != null && (var32_32 = var4_4.length()) != 0) {
                    var32_32 = 0;
                    var4_4 = null;
                } else {
                    var32_32 = 1;
                }
                if (var32_32 == 0) {
                    var32_32 = 0;
                    var5_5.setVisibility(0);
                    var4_4 = var3_3.g;
                    if (var4_4 != null) {
                        var4_4 = var4_4.getReturnCancelCtaMessage();
                    } else {
                        var32_32 = 0;
                        var4_4 = null;
                    }
                    var5_5.setText((CharSequence)var4_4);
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = "returnCancelRequestUnderProcessTv";
                    Intrinsics.checkNotNullExpressionValue(var5_5, (String)var4_4);
                    ai0_2.i((View)var5_5);
                }
                var32_32 = h40_0.P1();
                if (var32_32 == 0) break block141;
                var4_4 = var3_3.g;
                if (var4_4 != null) {
                    var4_4 = var4_4.getPriorityDeliveryBreached();
                } else {
                    var32_32 = 0;
                    var4_4 = null;
                }
                if (var4_4 == null) break block141;
                var4_4 = var3_3.g;
                if (var4_4 != null) {
                    var4_4 = var4_4.getPriorityDeliveryBreached();
                    var5_5 = Boolean.TRUE;
                    var28_28 = Intrinsics.areEqual(var4_4, var5_5);
                } else {
                    var28_28 = 0;
                    var29_29 = null;
                }
                if (var28_28 == 0) break block141;
                var4_4 = LayoutInflater.from((Context)var16_16.getContext());
                var9_9 = R$layout.priority_delivery_tracker_info_view;
                var6_6 = 0;
                var4_4 = var4_4.inflate(var9_9, null);
                var9_9 = R$id.priority_delivery_text_info_tv;
                var5_5 = (AjioTextView)var4_4.findViewById(var9_9);
                var24_24 = var3_3.g;
                if (var24_24 != null) {
                    var24_24 = var24_24.getPriorityDeliveryFeeStatus();
                } else {
                    var6_6 = 0;
                    var24_24 = null;
                }
                var8_8 = var3_3.g;
                if (var8_8 != null) {
                    var8_8 = var8_8.getPriorityDeliveryFee();
                } else {
                    var7_7 = 0;
                    var8_8 = null;
                }
                var24_24 = iq1_1.a((String)var24_24, (Double)var8_8);
                var7_7 = (int)TextUtils.isEmpty((CharSequence)var24_24);
                if (var7_7 != 0) break block141;
                var8_8 = hv3_0.f((String)var24_24);
                var5_5.setText((CharSequence)var8_8);
                var8_8 = var3_3.g;
                if (var8_8 != null) {
                    var8_8 = var8_8.getPriorityDeliveryFeeStatus();
                } else {
                    var7_7 = 0;
                    var8_8 = null;
                }
                if (var8_8 == null) ** GOTO lbl-1000
                var8_8 = var3_3.g;
                if (var8_8 != null) {
                    var8_8 = var8_8.getPriorityDeliveryFeeStatus();
                } else {
                    var7_7 = 0;
                    var8_8 = null;
                }
                var11_11 = "REFUNDED";
                var7_7 = (int)Intrinsics.areEqual(var8_8, var11_11);
                if (var7_7 != 0) {
                    var24_24 = hv3_0.f((String)var24_24);
                    var11_11 = new StringBuilder();
                    var11_11.append(var24_24);
                    var24_24 = "Go to Ajio Cash";
                    var11_11.append((String)var24_24);
                    var11_11 = var11_11.toString();
                    var8_8 = new SpannableStringBuilder((CharSequence)var11_11);
                    var10_10 = 6;
                    var18_18 = 0;
                    var38_38 = null;
                    var6_6 = StringsKt.O((CharSequence)var8_8, (String)var24_24, 0, false, var10_10);
                    var11_11 = FontsManager.getInstance();
                    AJIOApplication.Companion.getClass();
                    var17_17 = AJIOApplication$a.a();
                    var11_11 = var11_11.getTypefaceWithFont((Context)var17_17, var15_15);
                    var17_17 = new eo2_1(var3_3);
                    var28_28 = var6_6 + 15;
                    var13_13 = 33;
                    var8_8.setSpan(var17_17, var6_6, var28_28, var13_13);
                    var25_25 = hv3_0.m(R$color.go_to_ajio_cash_color);
                    var17_17 = new ForegroundColorSpan(var25_25);
                    var8_8.setSpan(var17_17, var6_6, var28_28, var13_13);
                    var11_11 = co2_1.a((Typeface)var11_11);
                    var8_8.setSpan(var11_11, var6_6, var28_28, var13_13);
                    var24_24 = TextView.BufferType.SPANNABLE;
                    var5_5.setText((CharSequence)var8_8, (TextView.BufferType)var24_24);
                    var24_24 = LinkMovementMethod.getInstance();
                    var5_5.setMovementMethod((MovementMethod)var24_24);
                } else lbl-1000:
                // 2 sources

                {
                    var18_18 = 0;
                    var38_38 = null;
                }
                var6_6 = var5_5.getPaddingLeft();
                var7_7 = var5_5.getPaddingTop();
                var10_10 = var5_5.getPaddingRight();
                var12_12 = 20;
                var5_5.setPadding(var6_6, var7_7, var10_10, var12_12);
                var16_16.addView((View)var4_4);
                var4_4 = var3_3.g;
                var14_14 = var4_4 != null && (var4_4 = var4_4.getPriorityDeliveryFeeStatus()) != null ? var4_4 : var35_35;
                var4_4 = var3_3.c;
                var4_4.getClass();
                Intrinsics.checkNotNullParameter(var14_14, "type");
                var5_5 = md3_0.c((jD3)var4_4);
                var7_7 = 0;
                var8_8 = null;
                var24_24 = new e02_0(null, (qz1_2)var4_4, (String)var14_14);
                var32_32 = 3;
                Ae3.d((i90_0)var5_5, null, null, (Function2)var24_24, var32_32);
                break block142;
            }
            var18_18 = 0;
            var38_38 = null;
        }
        var32_32 = (int)h40_0.B0();
        if (var32_32 != 0) {
            var4_4 = var3_3.g;
            if (var4_4 != null && (var32_32 = (int)var4_4.isImpsFailed()) == (var9_9 = 1)) {
                var32_32 = 1;
            } else {
                var32_32 = 0;
                var4_4 = null;
            }
            if (var32_32 != 0) {
                var4_4 = LayoutInflater.from((Context)var16_16.getContext());
                var9_9 = R$layout.re_enter_bank_account_details_layout;
                var6_6 = 0;
                var4_4 = var4_4.inflate(var9_9, null);
                var9_9 = R$id.re_enter_bank_account_details_btn;
                var5_5 = (AjioButton)var4_4.findViewById(var9_9);
                var24_24 = new do2_1(var3_3);
                var5_5.setOnClickListener((View.OnClickListener)var24_24);
                var16_16.addView((View)var4_4);
            }
        }
        if ((var32_32 = (int)h40_0.B0()) != 0) {
            var4_4 = var3_3.g;
            if (var4_4 != null && (var32_32 = (int)var4_4.isImpsDetailsRequired()) == (var9_9 = 1)) {
                var6_6 = 1;
            } else {
                var6_6 = 0;
                var24_24 = null;
            }
            if (var6_6 != 0) {
                var4_4 = LayoutInflater.from((Context)var16_16.getContext());
                var9_9 = R$layout.re_enter_bank_account_details_layout;
                var4_4 = var4_4.inflate(var9_9, null);
                var9_9 = R$id.re_enter_bank_account_details_btn;
                var5_5 = (AjioButton)var4_4.findViewById(var9_9);
                var6_6 = R$string.enter_bank_details_for_refund;
                var24_24 = hv3_0.K(var6_6);
                var5_5.setText((CharSequence)var24_24);
                var7_7 = 3;
                var24_24 = new ro_1(var3_3, var7_7);
                var5_5.setOnClickListener((View.OnClickListener)var24_24);
                var16_16.addView((View)var4_4);
            }
        }
    }
}

