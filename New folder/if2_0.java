/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Message
 *  android.text.SpannableString
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RatingBar$OnRatingBarChangeListener
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$font;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.myaccount.order.fragment.b$c;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.entity.Component;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from If2
 */
public final class if2_0
extends RecyclerView$f {
    public List a;
    public final List b;
    public final jv1_2 c;
    public final Av d;
    public final Activity e;
    public final xc1_2 f;
    public final int g;
    public g82_0 h;
    public g82_0 i;
    public final Typeface j;
    public final Typeface k;
    public R71 l;
    public String m;
    public boolean n;

    public if2_0(ArrayList object, List list, jv1_2 jv1_22, Av av2, FragmentActivity fragmentActivity, xc1_2 xc1_22) {
        this.a = object;
        this.b = list;
        this.c = jv1_22;
        this.d = av2;
        this.e = fragmentActivity;
        this.f = xc1_22;
        this.g = -1 >>> 1;
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        object = WK2.c(R$font.muli_bold_font, (Context)object);
        this.j = object;
        object = AJIOApplication$a.a();
        object = WK2.c(R$font.muli_regular_font, (Context)object);
        this.k = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getItemCount() {
        Collection collection = this.a;
        if (collection == null) return 0;
        if (collection == null) return 0;
        collection = collection;
        int n3 = (int)(collection.isEmpty() ? 1 : 0);
        int n4 = 1;
        if ((n3 ^= n4) != n4) return 0;
        collection = this.a;
        Intrinsics.checkNotNull(collection);
        return collection.size() + 2;
    }

    public final int getItemViewType(int n3) {
        if (n3 == 0) {
            n3 = 0;
            Object var2_2 = null;
        } else {
            List list = this.a;
            Intrinsics.checkNotNull(list);
            int n4 = list.size();
            if ((n3 += -1) < n4) {
                list = this.a;
                Intrinsics.checkNotNull(list);
                OrderItemLine orderItemLine = (OrderItemLine)list.get(n3);
                Intrinsics.checkNotNull(orderItemLine);
                n3 = orderItemLine.getViewType();
            } else {
                n3 = this.g;
            }
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block149: {
            block163: {
                block147: {
                    block162: {
                        block158: {
                            block146: {
                                block161: {
                                    block160: {
                                        block159: {
                                            block157: {
                                                block153: {
                                                    block156: {
                                                        block155: {
                                                            block154: {
                                                                block152: {
                                                                    block151: {
                                                                        block150: {
                                                                            block148: {
                                                                                var3_3 = this;
                                                                                var4_4 = var1_1;
                                                                                var5_5 = var2_2;
                                                                                var6_6 = 5;
                                                                                var7_7 = 7.0E-45f;
                                                                                var8_8 = 2;
                                                                                var9_9 = 2.8E-45f;
                                                                                var10_10 = "viewHolder";
                                                                                Intrinsics.checkNotNullParameter(var1_1, (String)var10_10);
                                                                                var11_11 = 1;
                                                                                var12_12 = 1.4E-45f;
                                                                                var13_13 = var2_2 + -1;
                                                                                var5_5 = this.getItemViewType(var2_2);
                                                                                var14_14 = 4;
                                                                                var15_15 = 0;
                                                                                var16_16 /* !! */  = null;
                                                                                if (var5_5 != 0) break block148;
                                                                                var4_4 = (oa2_1)var1_1;
                                                                                var17_17 = this.m;
                                                                                var18_24 = this.n;
                                                                                var19_30 = var4_4.d;
                                                                                var11_11 = var4_4.c;
                                                                                var20_34 = var4_4.f;
                                                                                var21_36 = var4_4.e;
                                                                                if (var18_24) {
                                                                                    if (var17_17 != null) {
                                                                                        var19_30.setText((CharSequence)var17_17);
                                                                                        if (var11_11 != 0) {
                                                                                            var21_36.setVisibility(0);
                                                                                            var17_17 = new na2_0(var4_4, 0);
                                                                                            var21_36.setOnClickListener((View.OnClickListener)var17_17);
                                                                                        } else {
                                                                                            var20_34.setVisibility(0);
                                                                                            var17_17 = new jx0_0(var4_4, var8_8);
                                                                                            var20_34.setOnClickListener((View.OnClickListener)var17_17);
                                                                                        }
                                                                                    } else if (var11_11 != 0) {
                                                                                        ai0_2.i((View)var21_36);
                                                                                    } else {
                                                                                        ai0_2.i((View)var20_34);
                                                                                    }
                                                                                } else {
                                                                                    var22_38 = R$string.last_six_month;
                                                                                    var4_4 = hv3_0.K(var22_38);
                                                                                    var19_30.setText((CharSequence)var4_4);
                                                                                    if (var11_11 != 0) {
                                                                                        var21_36.setVisibility(var14_14);
                                                                                    } else {
                                                                                        var20_34.setVisibility(var14_14);
                                                                                    }
                                                                                }
                                                                                break block149;
                                                                            }
                                                                            var23_39 = this.g;
                                                                            var24_40 = 8;
                                                                            if (var5_5 != var23_39) break block150;
                                                                            var4_4 = (kv1_2)var1_1;
                                                                            var17_18 = var4_4.b;
                                                                            var4_4 = var4_4.a;
                                                                            if (var4_4 != null && (var18_25 = var4_4.p4())) {
                                                                                var17_18.setVisibility(0);
                                                                                var4_4.I();
                                                                            } else {
                                                                                var17_18.setVisibility(var24_40);
                                                                            }
                                                                            break block149;
                                                                        }
                                                                        var21_37 /* !! */  = "";
                                                                        var25_41 = 3;
                                                                        var26_42 = "orderItemLine";
                                                                        if (var5_5 != var25_41) break block151;
                                                                        var4_4 = (qo2_0)var1_1;
                                                                        var17_19 = this.a;
                                                                        Intrinsics.checkNotNull(var17_19);
                                                                        var17_19 = (OrderItemLine)var17_19.get(var13_13);
                                                                        var4_4.getClass();
                                                                        Intrinsics.checkNotNullParameter(var17_19, (String)var26_42);
                                                                        var27_43 = var4_4.g;
                                                                        var8_8 = ((ImageView[])var27_43).length;
                                                                        var28_45 = null;
                                                                        for (var14_14 = 0; var14_14 < var8_8; var14_14 += var11_11) {
                                                                            var29_48 /* !! */  = var27_43[var14_14];
                                                                            if (var29_48 /* !! */  == null) continue;
                                                                            var29_48 /* !! */ .setVisibility(var24_40);
                                                                        }
                                                                        var30_50 /* !! */  = var17_19.getImageUrlList();
                                                                        var28_45 = var4_4.k;
                                                                        if (var30_50 /* !! */  != null) {
                                                                            var30_50 /* !! */  = var17_19.getImageUrlList();
                                                                            var8_8 = var30_50 /* !! */ .size();
                                                                            if (var8_8 > var6_6) {
                                                                                var28_45.setVisibility(0);
                                                                                var24_40 = R$string.more_text;
                                                                                var25_41 = var8_8 + -5;
                                                                                var29_48 /* !! */  = Integer.valueOf(var25_41);
                                                                                var26_42 = new Object[var11_11];
                                                                                var26_42[0] = var29_48 /* !! */ ;
                                                                                var31_52 /* !! */  = hv3_0.L(var24_40, (Object[])var26_42);
                                                                                var28_45.setText((CharSequence)var31_52 /* !! */ );
                                                                            } else {
                                                                                var28_45.setVisibility(var24_40);
                                                                            }
                                                                            if (var8_8 <= var6_6) {
                                                                                var6_6 = var8_8;
                                                                            }
                                                                            var9_9 = 0.0f;
                                                                            var30_50 /* !! */  = null;
                                                                            for (var8_8 = 0; var8_8 < var6_6; var8_8 += var11_11) {
                                                                                var28_45 = var27_43[var8_8];
                                                                                if (var28_45 != null) {
                                                                                    var28_45.setVisibility(0);
                                                                                }
                                                                                if ((var14_14 = (int)TextUtils.isEmpty((CharSequence)(var28_45 = (CharSequence)var17_19.getImageUrlList().get(var8_8)))) == 0) {
                                                                                    var28_45 = new da$a();
                                                                                    var28_45.k = var11_11;
                                                                                    var28_45.r = var11_11;
                                                                                    var24_40 = R$string.acc_banner;
                                                                                    var31_52 /* !! */  = hv3_0.K(var24_40);
                                                                                    var28_45.b(var31_52 /* !! */ );
                                                                                    var31_52 /* !! */  = var17_19.getImageUrlList().get(var8_8);
                                                                                    var29_48 /* !! */  = var27_43[var8_8];
                                                                                    Intrinsics.checkNotNull(var29_48 /* !! */ );
                                                                                    var28_45.n = var31_52 /* !! */ ;
                                                                                    var28_45.u = var29_48 /* !! */ ;
                                                                                    var28_45.a();
                                                                                    continue;
                                                                                }
                                                                                var28_45 = var27_43[var8_8];
                                                                                if (var28_45 == null) continue;
                                                                                var24_40 = R$drawable.ic_placeholder_revamp;
                                                                                var28_45.setImageResource(var24_40);
                                                                            }
                                                                        } else {
                                                                            var28_45.setVisibility(var24_40);
                                                                        }
                                                                        var27_43 = hv3_0.u(no_2.d((OrderItemLine)var17_19));
                                                                        var4_4.j.setText((CharSequence)var27_43);
                                                                        var18_26 = R$string.order_no_could_not_be_confirmed;
                                                                        var19_31 = var17_19.getOrderId();
                                                                        var30_50 /* !! */  = new Object[var11_11];
                                                                        var30_50 /* !! */ [0] = var19_31;
                                                                        var27_43 = hv3_0.L(var18_26, (Object[])var30_50 /* !! */ );
                                                                        var4_4.h.setText((CharSequence)var27_43);
                                                                        var18_26 = R$string.order_total;
                                                                        var27_43 = hv3_0.K(var18_26);
                                                                        var7_7 = var17_19.getTotalAmount();
                                                                        var19_31 = qz2_0.u(var7_7);
                                                                        var19_31 = Ft2.a((String)var27_43, var19_31);
                                                                        var30_50 /* !! */  = new SpannableStringBuilder((CharSequence)var19_31);
                                                                        var11_11 = 34;
                                                                        var12_12 = 4.8E-44f;
                                                                        var28_45 = var4_4.b;
                                                                        if (var28_45 != null) {
                                                                            var31_52 /* !! */  = new AjioCustomTypefaceSpan((String)var21_37 /* !! */ , (Typeface)var28_45);
                                                                            var14_14 = var27_43.length();
                                                                            var30_50 /* !! */ .setSpan((Object)var31_52 /* !! */ , 0, var14_14, var11_11);
                                                                        }
                                                                        if ((var28_45 = var4_4.c) != null) {
                                                                            var16_16 /* !! */  = new AjioCustomTypefaceSpan((String)var21_37 /* !! */ , (Typeface)var28_45);
                                                                            var18_26 = var27_43.length();
                                                                            var6_6 = var19_31.length();
                                                                            var30_50 /* !! */ .setSpan((Object)var16_16 /* !! */ , var18_26, var6_6, var11_11);
                                                                        }
                                                                        var4_4.i.setText((CharSequence)var30_50 /* !! */ );
                                                                        var27_43 = new po2_0((qo2_0)var4_4, (OrderItemLine)var17_19, var13_13);
                                                                        var4_4 = var4_4.f;
                                                                        var4_4.setOnClickListener((View.OnClickListener)var27_43);
                                                                        break block149;
                                                                    }
                                                                    if (var5_5 != var11_11) break block152;
                                                                    var4_4 = (of2_0)var1_1;
                                                                    var17_20 = this.a;
                                                                    Intrinsics.checkNotNull(var17_20);
                                                                    var17_20 = (OrderItemLine)var17_20.get(var13_13);
                                                                    var4_4.getClass();
                                                                    Intrinsics.checkNotNullParameter(var17_20, (String)var26_42);
                                                                    var18_27 = R$string.order_id_format;
                                                                    var17_20 = var17_20.getOrderId();
                                                                    var19_32 = new Object[var11_11];
                                                                    var19_32[0] = var17_20;
                                                                    var17_20 = hv3_0.L(var18_27, var19_32);
                                                                    var4_4 = var4_4.a;
                                                                    var4_4.setText((CharSequence)var17_20);
                                                                    break block149;
                                                                }
                                                                var32_54 = "%s%s";
                                                                var29_49 = "format(...)";
                                                                var33_55 = "getTypefaceWithFont(...)";
                                                                var19_33 = "EX";
                                                                var30_51 = "getOrderId(...)";
                                                                var27_44 = "toUpperCase(...)";
                                                                var31_53 = "RETURN CANCELLED";
                                                                if (var5_5 != var14_14) break block153;
                                                                var4_4 = (nf2_1)var1_1;
                                                                var17_21 = this.a;
                                                                Intrinsics.checkNotNull(var17_21);
                                                                var17_21 = (OrderItemLine)var17_21.get(var13_13);
                                                                var4_4.getClass();
                                                                Intrinsics.checkNotNullParameter(var17_21, (String)var26_42);
                                                                var28_46 = cp_1.Companion;
                                                                var14_14 = (int)km_1.b((cp$a)var28_46);
                                                                var26_42 = var4_4.c;
                                                                if (var14_14 == 0) {
                                                                    var28_46 = new jf2_0((nf2_1)var4_4, (OrderItemLine)var17_21, var13_13);
                                                                    var26_42.setOnClickListener((View.OnClickListener)var28_46);
                                                                } else {
                                                                    var28_46 = new kf2_0((nf2_1)var4_4, (OrderItemLine)var17_21, var13_13);
                                                                    var10_10 = var4_4.d;
                                                                    var10_10.setOnClickListener((View.OnClickListener)var28_46);
                                                                    var26_42.setClickable(false);
                                                                    var26_42.setFocusable(false);
                                                                }
                                                                var10_10 = var17_21.getImageUrl();
                                                                var11_11 = (int)TextUtils.isEmpty((CharSequence)var10_10);
                                                                var28_46 = var4_4.k;
                                                                if (var11_11 == 0) {
                                                                    var10_10 = new da$a();
                                                                    var10_10.k = var34_56 = 1;
                                                                    var10_10.r = var34_56;
                                                                    var34_56 = R$string.product_image;
                                                                    var26_42 = hv3_0.K(var34_56);
                                                                    var10_10.b((String)var26_42);
                                                                    var10_10.n = var26_42 = var17_21.getImageUrl();
                                                                    var10_10.u = var28_46;
                                                                    var10_10.a();
                                                                } else {
                                                                    var11_11 = R$drawable.ic_placeholder_revamp;
                                                                    var28_46.setImageResource(var11_11);
                                                                    var11_11 = R$string.product_image;
                                                                    var10_10 = hv3_0.K(var11_11);
                                                                    var28_46.setContentDescription((CharSequence)var10_10);
                                                                }
                                                                var10_10 = no_2.d((OrderItemLine)var17_21);
                                                                var11_11 = (int)TextUtils.isEmpty((CharSequence)var10_10);
                                                                var28_46 = var4_4.j;
                                                                if (var11_11 != 0) break block154;
                                                                var10_10 = no_2.d((OrderItemLine)var17_21).toUpperCase();
                                                                Intrinsics.checkNotNullExpressionValue(var10_10, (String)var27_44);
                                                                var11_11 = (int)Intrinsics.areEqual(var10_10, var31_53);
                                                                if (var11_11 == 0) break block154;
                                                                var28_46.setVisibility(0);
                                                                var6_6 = R$string.cancelled;
                                                                var19_33 = hv3_0.K(var6_6);
                                                                var28_46.setText((CharSequence)var19_33);
                                                                break block155;
                                                            }
                                                            if ((var11_11 = (int)TextUtils.isEmpty((CharSequence)(var10_10 = var17_21.getOrderId()))) != 0) ** GOTO lbl-1000
                                                            var10_10 = var17_21.getOrderId();
                                                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var30_51);
                                                            var6_6 = (int)kotlin.text.b.s((String)var10_10, (String)var19_33, false);
                                                            if (var6_6 != 0) {
                                                                ai0_2.B((View)var28_46);
                                                                var6_6 = R$string.exchange;
                                                                var19_33 = hv3_0.K(var6_6);
                                                                var28_46.setText((CharSequence)var19_33);
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var6_6 = 8;
                                                                var7_7 = 1.1E-44f;
                                                                var28_46.setVisibility(var6_6);
                                                            }
                                                        }
                                                        var19_33 = no_2.d((OrderItemLine)var17_21);
                                                        var6_6 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                                        var30_51 = var4_4.l;
                                                        var10_10 = var4_4.i;
                                                        if (var6_6 != 0) {
                                                            ai0_2.i((View)var10_10);
                                                            ai0_2.i((View)var30_51);
                                                        } else {
                                                            var19_33 = no_2.a((OrderItemLine)var17_21);
                                                            var6_6 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                                            if (var6_6 == 0) {
                                                                var10_10.setVisibility(0);
                                                                var19_33 = hv3_0.u(no_2.a((OrderItemLine)var17_21));
                                                                var10_10.setText((CharSequence)var19_33);
                                                            } else {
                                                                ai0_2.i((View)var10_10);
                                                                ai0_2.i((View)var30_51);
                                                            }
                                                        }
                                                        no_2.g((OrderItemLine)var17_21);
                                                        var19_33 = no_2.g((OrderItemLine)var17_21);
                                                        var8_8 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                                        var10_10 = var4_4.f;
                                                        var28_46 = var4_4.e;
                                                        var26_42 = var4_4.g;
                                                        if (var8_8 != 0) {
                                                            var8_8 = 8;
                                                            var9_9 = 1.1E-44f;
                                                            var26_42.setVisibility(var8_8);
                                                            var10_10.setVisibility(var8_8);
                                                            var28_46.setVisibility(var8_8);
                                                        } else {
                                                            var26_42.setVisibility(0);
                                                            var26_42.setText((CharSequence)var19_33);
                                                        }
                                                        var19_33 = no_2.e((OrderItemLine)var17_21);
                                                        var6_6 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                                        var30_51 = var4_4.h;
                                                        if (var6_6 == 0) {
                                                            var30_51.setVisibility(0);
                                                            var19_33 = no_2.e((OrderItemLine)var17_21);
                                                            var30_51.setText((CharSequence)var19_33);
                                                            var19_33 = hv3_0.u(no_2.a((OrderItemLine)var17_21));
                                                            var34_56 = 1;
                                                            var6_6 = (int)kotlin.text.b.i((String)var19_33, (String)var31_53, (boolean)var34_56);
                                                            if (var6_6 != 0 && (var6_6 = (int)no_2.i((OrderItemLine)var17_21)) != 0) {
                                                                var19_33 = FontsManager.getInstance();
                                                                AJIOApplication.Companion.getClass();
                                                                var31_53 = AJIOApplication$a.a();
                                                                var19_33 = var19_33.getTypefaceWithFont((Context)var31_53, 10);
                                                                Intrinsics.checkNotNullExpressionValue(var19_33, var33_55);
                                                                var24_40 = hv3_0.m(R$color.accent_color_1);
                                                                var34_56 = 2;
                                                                ai0_2.w((TextView)var30_51, (Typeface)var19_33, var24_40, var34_56);
                                                            } else {
                                                                var19_33 = FontsManager.getInstance();
                                                                AJIOApplication.Companion.getClass();
                                                                var31_53 = AJIOApplication$a.a();
                                                                var34_56 = 9;
                                                                var19_33 = var19_33.getTypefaceWithFont((Context)var31_53, var34_56);
                                                                Intrinsics.checkNotNullExpressionValue(var19_33, var33_55);
                                                                var24_40 = 6;
                                                                ai0_2.w((TextView)var30_51, (Typeface)var19_33, 0, var24_40);
                                                            }
                                                        } else {
                                                            var6_6 = 8;
                                                            var7_7 = 1.1E-44f;
                                                            var30_51.setVisibility(var6_6);
                                                        }
                                                        var19_33 = no_2.d((OrderItemLine)var17_21);
                                                        var6_6 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                                        if (var6_6 != 0) break block156;
                                                        var19_33 = no_2.d((OrderItemLine)var17_21).toUpperCase();
                                                        Intrinsics.checkNotNullExpressionValue(var19_33, (String)var27_44);
                                                        var30_51 = "REFUND INITIATED";
                                                        var6_6 = (int)Intrinsics.areEqual(var19_33, var30_51);
                                                        if (var6_6 != 0) ** GOTO lbl-1000
                                                    }
                                                    if ((var6_6 = (int)TextUtils.isEmpty((CharSequence)(var19_33 = no_2.d((OrderItemLine)var17_21)))) == 0) {
                                                        var19_33 = no_2.d((OrderItemLine)var17_21).toUpperCase();
                                                        Intrinsics.checkNotNullExpressionValue(var19_33, (String)var27_44);
                                                        var27_44 = "REFUNDED";
                                                        var18_28 = (int)Intrinsics.areEqual(var19_33, var27_44);
                                                        ** if (var18_28 == 0) goto lbl-1000
                                                    }
                                                    ** GOTO lbl-1000
lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var35_58 = var17_21.getRefundTotal();
                                                        var6_6 = 0;
                                                        var7_7 = 0.0f;
                                                        var19_33 = null;
                                                        cfr_temp_0 = var35_58 - 0.0f;
                                                        var18_28 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                        if (var18_28 > 0) {
                                                            var10_10.setVisibility(0);
                                                            var28_46.setVisibility(0);
                                                            var27_44 = StringCompanionObject.INSTANCE;
                                                            var27_44 = hv3_0.K(R$string.rs_symbol);
                                                            var7_7 = var17_21.getRefundTotal();
                                                            var19_33 = qz2_0.p(var7_7);
                                                            var8_8 = 2;
                                                            var9_9 = 2.8E-45f;
                                                            var28_46 = new Object[var8_8];
                                                            var28_46[0] = var27_44;
                                                            var18_28 = 1;
                                                            var35_58 = 1.4E-45f;
                                                            var28_46[var18_28] = var19_33;
                                                            zn0_1.b((Object[])var28_46, var8_8, var32_54, var29_49, (TextView)var10_10);
                                                        } else {
                                                            var18_28 = 8;
                                                            var35_58 = 1.1E-44f;
                                                            var10_10.setVisibility(var18_28);
                                                            var28_46.setVisibility(var18_28);
                                                        }
                                                        ** GOTO lbl383
                                                    }
lbl-1000:
                                                    // 2 sources

                                                    {
                                                        if ((var18_28 = (int)(var35_58 = var17_21.getEstimatedRefundAmount())) > 0) {
                                                            var10_10.setVisibility(0);
                                                            var28_46.setVisibility(0);
                                                            var27_44 = StringCompanionObject.INSTANCE;
                                                            var27_44 = hv3_0.K(R$string.rs_symbol);
                                                            var7_7 = var17_21.getEstimatedRefundAmount();
                                                            var19_33 = qz2_0.p(var7_7);
                                                            var8_8 = 2;
                                                            var9_9 = 2.8E-45f;
                                                            var28_46 = new Object[var8_8];
                                                            var28_46[0] = var27_44;
                                                            var18_28 = 1;
                                                            var35_58 = 1.4E-45f;
                                                            var28_46[var18_28] = var19_33;
                                                            zn0_1.b((Object[])var28_46, var8_8, var32_54, var29_49, (TextView)var10_10);
                                                        } else {
                                                            var18_28 = 8;
                                                            var35_58 = 1.1E-44f;
                                                            var10_10.setVisibility(var18_28);
                                                            var28_46.setVisibility(var18_28);
                                                        }
                                                    }
lbl383:
                                                    // 4 sources

                                                    var27_44 = h40_0.a;
                                                    var18_28 = (int)h40_0.a2();
                                                    var19_33 = var4_4.o;
                                                    var30_51 = var4_4.p;
                                                    if (var18_28 != 0 && (var27_44 = var17_21.getProductRating()) != null) {
                                                        var27_44 = var17_21.getProductRating();
                                                        var11_11 = 0;
                                                        var12_12 = 0.0f;
                                                        var10_10 = null;
                                                        var18_28 = (int)Intrinsics.areEqual((Float)var27_44, 0.0f);
                                                        var28_46 = var4_4.n;
                                                        var31_53 = var4_4.m;
                                                        if (var18_28 != 0) {
                                                            var30_51.setVisibility(0);
                                                            var19_33.setVisibility(8);
                                                            var31_53.setRating(0.0f);
                                                            var35_58 = var17_21.getProductRating().floatValue();
                                                            var18_28 = (int)var35_58;
                                                            var19_33 = var13_13;
                                                            ai0_2.c((ScaleRatingBar)var31_53, var18_28, (Integer)var19_33);
                                                            var28_46.setRating(0.0f);
                                                            var27_44 = new lf2_0((nf2_1)var4_4, (OrderItemLine)var17_21, var13_13);
                                                            var28_46.setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)var27_44);
                                                        } else {
                                                            var30_51.setVisibility(8);
                                                            var19_33.setVisibility(0);
                                                            var28_46.setRating(0.0f);
                                                            var27_44 = new Object();
                                                            var28_46.setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)var27_44);
                                                            var35_58 = var17_21.getProductRating().floatValue();
                                                            var31_53.setRating(var35_58);
                                                            var27_44 = var17_21.getProductRating();
                                                            var35_58 = var27_44.floatValue();
                                                            var18_28 = (int)var35_58;
                                                            var19_33 = var13_13;
                                                            ai0_2.c((ScaleRatingBar)var31_53, var18_28, (Integer)var19_33);
                                                        }
                                                    } else {
                                                        var18_28 = 8;
                                                        var35_58 = 1.1E-44f;
                                                        var30_51.setVisibility(var18_28);
                                                        var19_33.setVisibility(var18_28);
                                                    }
                                                    var18_28 = (int)h40_0.B0();
                                                    var19_33 = var4_4.q;
                                                    if (var18_28 != 0 && (var18_28 = (int)TextUtils.isEmpty((CharSequence)(var27_44 = var17_21.getImpsFailureRefundText()))) == 0) {
                                                        ai0_2.B((View)var19_33);
                                                        var27_44 = var17_21.getImpsFailureRefundText();
                                                        var19_33.setText((CharSequence)var27_44);
                                                    } else {
                                                        ai0_2.i((View)var19_33);
                                                    }
                                                    var18_28 = (int)h40_0.P1();
                                                    var4_4 = var4_4.r;
                                                    if (var18_28 != 0 && (var27_44 = var17_21.getPriorityDeliveryApplied()) != null && (var5_5 = (int)(var17_21 = var17_21.getPriorityDeliveryApplied()).booleanValue()) != 0) {
                                                        var17_21 = var4_4.getLayoutParams();
                                                        var18_28 = h40_0.j0().getPriorityTagImageWidth();
                                                        AJIOApplication.Companion.getClass();
                                                        var19_33 = AJIOApplication$a.a();
                                                        var17_21.width = var18_28 = ai0_2.e(var18_28, (Context)var19_33);
                                                        var17_21 = var4_4.getLayoutParams();
                                                        var18_28 = h40_0.j0().getPriorityTagImageHeight();
                                                        var19_33 = AJIOApplication$a.a();
                                                        var17_21.height = var18_28 = ai0_2.e(var18_28, (Context)var19_33);
                                                        var4_4.requestLayout();
                                                        var17_21 = AJIOApplication$a.a();
                                                        var18_28 = R$string.pd_icon_content_description;
                                                        var17_21 = var17_21.getString(var18_28);
                                                        var4_4.setContentDescription((CharSequence)var17_21);
                                                        var17_21 = new da$a();
                                                        var18_28 = 1;
                                                        var35_58 = 1.4E-45f;
                                                        var17_21.k = var18_28;
                                                        var17_21.g = var18_28;
                                                        var17_21.b = var18_28 = R$drawable.ic_priority_delivery;
                                                        var17_21.c = var18_28;
                                                        var27_44 = h40_0.j0().getPriorityDeliveryIcon();
                                                        if (var27_44 != null) {
                                                            var21_37 /* !! */  = var27_44;
                                                        }
                                                        var17_21.n = var21_37 /* !! */ ;
                                                        var17_21.u = var4_4;
                                                        var17_21.a();
                                                        ai0_2.B((View)var4_4);
                                                    } else {
                                                        ai0_2.i((View)var4_4);
                                                    }
                                                    break block149;
                                                }
                                                var11_11 = 5;
                                                var12_12 = 7.0E-45f;
                                                if (var5_5 != var11_11) break block157;
                                                var4_4 = (yg_1)var1_1;
                                                var17_22 = this.a;
                                                Intrinsics.checkNotNull(var17_22);
                                                var17_22 = ((OrderItemLine)var17_22.get(var13_13)).getBannerComponent();
                                                var27_44 = this.e;
                                                var19_33 = this.f;
                                                var4_4.x((Component)var17_22, (Activity)var27_44, (xc1_2)var19_33);
                                                break block149;
                                            }
                                            var4_4 = (hf2_0)var1_1;
                                            var17_23 = this.a;
                                            Intrinsics.checkNotNull(var17_23);
                                            var17_23 = (OrderItemLine)var17_23.get(var13_13);
                                            var4_4.getClass();
                                            Intrinsics.checkNotNullParameter(var17_23, (String)var26_42);
                                            var10_10 = z40_0.Companion;
                                            var10_10 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var10_10).a;
                                            var11_11 = (int)var10_10.a("enableConfirmedOrdersDelayTrackbar");
                                            var28_47 = cp_1.Companion;
                                            var14_14 = (int)km_1.b((cp$a)var28_47);
                                            var26_42 = var4_4.e;
                                            if (var14_14 == 0) {
                                                var28_47 = new cf2_0((hf2_0)var4_4, (OrderItemLine)var17_23, var13_13);
                                                var26_42.setOnClickListener((View.OnClickListener)var28_47);
                                            } else {
                                                var28_47 = new df2_0((hf2_0)var4_4, (OrderItemLine)var17_23, var13_13);
                                                var3_3 = var4_4.f;
                                                var3_3.setOnClickListener((View.OnClickListener)var28_47);
                                                var26_42.setClickable(false);
                                                var26_42.setFocusable(false);
                                            }
                                            var3_3 = no_2.a((OrderItemLine)var17_23);
                                            var28_47 = Locale.ROOT;
                                            var3_3 = var3_3.toUpperCase((Locale)var28_47);
                                            Intrinsics.checkNotNullExpressionValue(var3_3, (String)var27_44);
                                            var28_47 = "CANCELLED";
                                            var34_57 = 1;
                                            var36_60 /* !! */  = kotlin.text.b.i((String)var3_3, (String)var28_47, (boolean)var34_57);
                                            var26_42 = var4_4.x;
                                            if (var36_60 /* !! */  == 0) {
                                                var3_3 = a21.a;
                                                var37_61 = a21$a.ORDER_DETAIL;
                                                var38_62 = var17_23.getGiftProducts();
                                                var3_3.getClass();
                                                Intrinsics.checkNotNullParameter(var26_42, "tvFreebies");
                                                var3_3 = h40_0.a;
                                                var36_60 /* !! */  = (int)var3_3.f1();
                                                if (var36_60 /* !! */  != 0) {
                                                    if (var38_62 != null) {
                                                        var36_60 /* !! */  = var38_62.intValue();
                                                        if (var36_60 /* !! */  > 0) {
                                                            ai0_2.B((View)var26_42);
                                                            if (var37_61 == null) {
                                                                var36_60 /* !! */  = -1;
                                                                var39_63 = 0.0f / 0.0f;
lbl528:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var3_3 = a21$b.$EnumSwitchMapping$0;
                                                            var40_64 = var37_61.ordinal();
                                                            var36_60 /* !! */  = (int)var3_3[var40_64];
                                                            ** continue;
                                                            var15_15 = 8;
                                                            if (var36_60 /* !! */  == var15_15) {
                                                                var36_60 /* !! */  = var38_62.intValue();
                                                                var15_15 = 0;
                                                                var37_61 = h40_0.D(false);
                                                                var41_65 = var21_37 /* !! */ ;
                                                                var21_37 /* !! */  = var37_61.getOrderDetailsReturnFreebies();
                                                                var37_61 = h40_0.D(false);
                                                                var16_16 /* !! */  = var37_61.getOrderDetailsReturnMoreFreebies();
                                                                var3_3 = a21.d(var36_60 /* !! */ , (String)var21_37 /* !! */ , (String)var16_16 /* !! */ );
                                                            } else {
                                                                var41_65 = var21_37 /* !! */ ;
                                                                var36_60 /* !! */  = var38_62.intValue();
                                                                var15_15 = 0;
                                                                var21_37 /* !! */  = h40_0.D(false).getOrderListingFreebiesWithProduct();
                                                                var37_61 = h40_0.D(false);
                                                                var16_16 /* !! */  = var37_61.getOrderListingMoreFreebiesWithProduct();
                                                                var3_3 = a21.d(var36_60 /* !! */ , (String)var21_37 /* !! */ , (String)var16_16 /* !! */ );
                                                            }
                                                            var26_42.setText((CharSequence)var3_3);
                                                        } else {
                                                            var41_65 = var21_37 /* !! */ ;
                                                            ai0_2.i((View)var26_42);
                                                        }
                                                    } else {
                                                        var41_65 = var21_37 /* !! */ ;
                                                        ai0_2.i((View)var26_42);
                                                    }
                                                } else {
                                                    var41_65 = var21_37 /* !! */ ;
                                                }
                                            } else {
                                                var41_65 = var21_37 /* !! */ ;
                                                ai0_2.i((View)var26_42);
                                            }
                                            var3_3 = var17_23.getImageUrl();
                                            var36_60 /* !! */  = TextUtils.isEmpty((CharSequence)var3_3);
                                            var16_16 /* !! */  = var4_4.n;
                                            if (var36_60 /* !! */  == 0) {
                                                var3_3 = new da$a();
                                                var23_39 = 1;
                                                var3_3.k = var23_39;
                                                var3_3.r = var23_39;
                                                var23_39 = R$string.product_image;
                                                var21_37 /* !! */  = hv3_0.K(var23_39);
                                                var3_3.b((String)var21_37 /* !! */ );
                                                var21_37 /* !! */  = var17_23.getImageUrl();
                                                var3_3.n = var21_37 /* !! */ ;
                                                var3_3.u = var16_16 /* !! */ ;
                                                var3_3.a();
                                            } else {
                                                var36_60 /* !! */  = R$drawable.ic_placeholder_revamp;
                                                var16_16 /* !! */ .setImageResource(var36_60 /* !! */ );
                                                var36_60 /* !! */  = R$string.product_image;
                                                var3_3 = hv3_0.K(var36_60 /* !! */ );
                                                var16_16 /* !! */ .setContentDescription((CharSequence)var3_3);
                                            }
                                            var42_66 = var17_23.getEpochPSD();
                                            var44_67 = System.currentTimeMillis();
                                            var36_60 /* !! */  = (int)(var42_66 == var44_67 ? 0 : (var42_66 < var44_67 ? -1 : 1));
                                            if (var36_60 /* !! */  < 0) {
                                                var36_60 /* !! */  = 1;
                                                var39_63 = 1.4E-45f;
                                            } else {
                                                var36_60 /* !! */  = 0;
                                                var39_63 = 0.0f;
                                                var3_3 = null;
                                            }
                                            var42_66 = var17_23.getEpochEddUpper();
                                            var44_67 = System.currentTimeMillis();
                                            var34_57 = var42_66 == var44_67 ? 0 : (var42_66 < var44_67 ? -1 : 1);
                                            if (var34_57 < 0) {
                                                var15_15 = 1;
                                            } else {
                                                var15_15 = 0;
                                                var16_16 /* !! */  = null;
                                            }
                                            if (var11_11 == 0) {
                                                var36_60 /* !! */  = 0;
                                                var39_63 = 0.0f;
                                                var3_3 = null;
                                                var15_15 = 0;
                                                var16_16 /* !! */  = null;
                                            }
                                            var10_10 = no_2.d((OrderItemLine)var17_23);
                                            var21_37 /* !! */  = "CONFIRMED";
                                            var11_11 = (int)var21_37 /* !! */ .equalsIgnoreCase((String)var10_10);
                                            var26_42 = "CREATED";
                                            if (var11_11 == 0 && (var11_11 = (int)var26_42.equalsIgnoreCase((String)(var10_10 = no_2.d((OrderItemLine)var17_23)))) == 0) {
                                                var46_68 = var13_13;
                                                var11_11 = 0;
                                                var12_12 = 0.0f;
                                                var10_10 = null;
                                            } else {
                                                var46_68 = var13_13;
                                                var11_11 = 1;
                                                var12_12 = 1.4E-45f;
                                            }
                                            var20_35 /* !! */  = var4_4.d;
                                            var20_35 /* !! */ .setTag(var4_4);
                                            var1_1 = var28_47;
                                            var4_4.x(0);
                                            var28_47 = var4_4.o;
                                            var47_69 = var33_55;
                                            var48_70 = 0;
                                            var28_47.setRotation(0.0f);
                                            var28_47 = var17_23.getOrderId();
                                            var14_14 = (int)TextUtils.isEmpty((CharSequence)var28_47);
                                            var33_55 = var4_4.m;
                                            if (var14_14 != 0) ** GOTO lbl-1000
                                            var28_47 = var17_23.getOrderId();
                                            Intrinsics.checkNotNullExpressionValue(var28_47, (String)var30_51);
                                            var8_8 = 0;
                                            var9_9 = 0.0f;
                                            var30_51 = null;
                                            var6_6 = (int)kotlin.text.b.s((String)var28_47, (String)var19_33, false);
                                            if (var6_6 != 0) {
                                                var33_55.setVisibility(0);
                                                var6_6 = R$string.exchange;
                                                var19_33 = hv3_0.K(var6_6);
                                                var33_55.setText((CharSequence)var19_33);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var6_6 = 8;
                                                var7_7 = 1.1E-44f;
                                                var33_55.setVisibility(var6_6);
                                            }
                                            var19_33 = no_2.d((OrderItemLine)var17_23);
                                            var6_6 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                            if (var6_6 != 0) {
                                                var36_60 /* !! */  = var11_11;
                                                var39_63 = var12_12;
                                            } else {
                                                var19_33 = no_2.d((OrderItemLine)var17_23).toUpperCase();
                                                Intrinsics.checkNotNullExpressionValue(var19_33, (String)var27_44);
                                                var30_51 = "DELIVERY UNSUCCESSFUL";
                                                var8_8 = (int)Intrinsics.areEqual(var19_33, var30_51);
                                                var28_47 = var4_4.l;
                                                if (var8_8 == 0 && (var6_6 = (int)Intrinsics.areEqual(var19_33, var30_51 = "DELIVERY REFUSED")) == 0) {
                                                    var6_6 = hv3_0.m(R$color.accent_color_10);
                                                    var28_47.setTextColor(var6_6);
                                                } else {
                                                    var6_6 = hv3_0.m(R$color.accent_color_1);
                                                    var28_47.setTextColor(var6_6);
                                                }
                                                var19_33 = " product ";
                                                if (var11_11 != 0 && var15_15 != 0) {
                                                    var8_8 = 0;
                                                    var9_9 = 0.0f;
                                                    var28_47.setVisibility(0);
                                                    var3_3 = hv3_0.K(R$string.od_delivery_delayed);
                                                    var28_47.setText((CharSequence)var3_3);
                                                    var3_3 = hv3_0.K(R$string.od_delivery_delayed);
                                                    var30_51 = var17_23.getTitle();
                                                    var19_33 = var3_3 = n1.a((String)var3_3, (String)var19_33, (String)var30_51);
                                                    var36_60 /* !! */  = var11_11;
                                                    var39_63 = var12_12;
                                                } else if (var11_11 != 0 && var36_60 /* !! */  != 0) {
                                                    var3_3 = null;
                                                    var28_47.setVisibility(0);
                                                    var36_60 /* !! */  = var11_11;
                                                    var39_63 = var12_12;
                                                    var49_71 = var17_23.getEpochEddUpper();
                                                    var30_51 = k7.f(var49_71, "dd MMM");
                                                    var33_55 = "Arriving by ";
                                                    var10_10 = new StringBuilder(var33_55);
                                                    var10_10.append((String)var30_51);
                                                    var10_10 = var10_10.toString();
                                                    var28_47.setText((CharSequence)var10_10);
                                                    var10_10 = var17_23.getTitle();
                                                    var19_33 = UX.c(var33_55, (String)var30_51, (String)var19_33, (String)var10_10);
                                                } else {
                                                    var36_60 /* !! */  = var11_11;
                                                    var39_63 = var12_12;
                                                    var30_51 = no_2.a((OrderItemLine)var17_23);
                                                    var8_8 = (int)TextUtils.isEmpty((CharSequence)var30_51);
                                                    if (var8_8 == 0) {
                                                        var8_8 = 0;
                                                        var9_9 = 0.0f;
                                                        var28_47.setVisibility(0);
                                                        var30_51 = hv3_0.u(no_2.a((OrderItemLine)var17_23));
                                                        var28_47.setText((CharSequence)var30_51);
                                                        var10_10 = var17_23.getTitle();
                                                        var19_33 = n1.a((String)var30_51, (String)var19_33, (String)var10_10);
                                                    } else {
                                                        var6_6 = 8;
                                                        var7_7 = 1.1E-44f;
                                                        var28_47.setVisibility(var6_6);
                                                        var19_33 = var41_65;
                                                    }
                                                }
                                                var28_47.setContentDescription((CharSequence)var19_33);
                                            }
                                            no_2.g((OrderItemLine)var17_23);
                                            var19_33 = no_2.g((OrderItemLine)var17_23);
                                            var8_8 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                            var10_10 = var4_4.g;
                                            var28_47 = var4_4.h;
                                            var33_55 = var4_4.i;
                                            if (var8_8 != 0) {
                                                var8_8 = 8;
                                                var9_9 = 1.1E-44f;
                                                var33_55.setVisibility(var8_8);
                                                var28_47.setVisibility(var8_8);
                                                var10_10.setVisibility(var8_8);
                                                var51_72 = var31_53;
                                            } else {
                                                var30_51 = null;
                                                var33_55.setVisibility(0);
                                                var9_9 = var17_23.getRefundTotal();
                                                cfr_temp_1 = var9_9 - 0.0f;
                                                var8_8 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                                if (var8_8 > 0) {
                                                    var8_8 = hv3_0.m(R$color.accent_color_2);
                                                    var33_55.setTextColor(var8_8);
                                                } else {
                                                    var8_8 = hv3_0.m(R$color.accent_color_10);
                                                    var33_55.setTextColor(var8_8);
                                                }
                                                var33_55.setText((CharSequence)var19_33);
                                                var7_7 = var17_23.getRefundTotal();
                                                var8_8 = 0;
                                                var9_9 = 0.0f;
                                                var30_51 = null;
                                                cfr_temp_2 = var7_7 - 0.0f;
                                                var6_6 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                                if (var6_6 > 0) {
                                                    var19_33 = null;
                                                    var28_47.setVisibility(0);
                                                    var10_10.setVisibility(0);
                                                    var30_51 = StringCompanionObject.INSTANCE;
                                                    var8_8 = R$string.rs_symbol;
                                                    var30_51 = hv3_0.K(var8_8);
                                                    var12_12 = var17_23.getRefundTotal();
                                                    var10_10 = qz2_0.p(var12_12);
                                                    var51_72 = var31_53;
                                                    var48_70 = 2;
                                                    var31_53 = new Object[var48_70];
                                                    var31_53[0] = var30_51;
                                                    var6_6 = 1;
                                                    var7_7 = 1.4E-45f;
                                                    var31_53[var6_6] = var10_10;
                                                    zn0_1.b((Object[])var31_53, var48_70, var32_54, var29_49, (TextView)var28_47);
                                                } else {
                                                    var51_72 = var31_53;
                                                    var6_6 = 8;
                                                    var7_7 = 1.1E-44f;
                                                    var28_47.setVisibility(var6_6);
                                                    var10_10.setVisibility(var6_6);
                                                }
                                            }
                                            var19_33 = no_2.d((OrderItemLine)var17_23);
                                            var6_6 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                                            var30_51 = "DELIVERY ATTEMPTED";
                                            var10_10 = "SHIPPED";
                                            var28_47 = "OUT FOR DELIVERY";
                                            var31_53 = "PACKED";
                                            if (var6_6 != 0) break block158;
                                            hf2_0.Companion.getClass();
                                            var19_33 = z40$a.a((Context)AJIOApplication$a.a()).a;
                                            var29_49 = "orderTrackEnable";
                                            var6_6 = (int)var19_33.a(var29_49);
                                            if (var6_6 == 0) break block158;
                                            var19_33 = no_2.d((OrderItemLine)var17_23).toUpperCase();
                                            Intrinsics.checkNotNullExpressionValue(var19_33, (String)var27_44);
                                            var25_41 = var19_33.hashCode();
                                            switch (var25_41) {
                                                default: {
                                                    ** GOTO lbl-1000
                                                }
                                                case 1982485311: {
                                                    var19_33.equals(var21_37 /* !! */ );
                                                    ** GOTO lbl-1000
                                                }
                                                case 1746537160: {
                                                    var19_33.equals(var26_42);
                                                    ** GOTO lbl-1000
                                                }
                                                case 163659488: {
                                                    var25_41 = (int)var19_33.equals(var30_51);
                                                    if (var25_41 != 0) ** GOTO lbl809
                                                    ** GOTO lbl-1000
                                                }
                                                case -1515427533: {
                                                    var25_41 = (int)var19_33.equals(var10_10);
                                                    if (var25_41 == 0) ** GOTO lbl-1000
                                                    var25_41 = 2;
                                                    break block159;
                                                }
                                                case -1812315843: {
                                                    var25_41 = (int)var19_33.equals(var28_47);
                                                    if (var25_41 == 0) ** GOTO lbl-1000
lbl809:
                                                    // 2 sources

                                                    var25_41 = 3;
                                                    break block159;
                                                }
                                                case -1942536072: 
                                            }
                                            var25_41 = (int)var19_33.equals(var31_53);
                                            if (var25_41 == 0) lbl-1000:
                                            // 7 sources

                                            {
                                                var25_41 = 0;
                                                var29_49 = null;
                                            } else {
                                                var25_41 = 1;
                                            }
                                        }
                                        var48_70 = var19_33.hashCode();
                                        var32_54 = "getStatusHistory(...)";
                                        switch (var48_70) {
                                            default: {
                                                break block160;
                                            }
                                            case 163659488: {
                                                var6_6 = (int)var19_33.equals(var30_51);
                                                if (var6_6 != 0) ** GOTO lbl835
                                                break block160;
                                            }
                                            case -1515427533: {
                                                var6_6 = (int)var19_33.equals(var10_10);
                                                if (var6_6 != 0) ** GOTO lbl835
                                                break block160;
                                            }
                                            case -1812315843: {
                                                var6_6 = (int)var19_33.equals(var28_47);
                                                if (var6_6 == 0) break block160;
lbl835:
                                                // 3 sources

                                                var19_33 = var17_23.getStatusHistory();
                                                Intrinsics.checkNotNullExpressionValue(var19_33, var32_54);
                                                var33_55 = var17_23.getPromisedDeliveryDate();
                                                var32_54 = "getPromisedDeliveryDate(...)";
                                                Intrinsics.checkNotNullExpressionValue(var33_55, var32_54);
                                                var19_33 = hf2_0.w(var33_55, (ArrayList)var19_33);
lbl841:
                                                // 3 sources

                                                while (true) {
                                                    var52_73 = var19_33;
                                                    break block146;
                                                    break;
                                                }
                                            }
                                            case -1942536072: 
                                        }
                                        var6_6 = (int)var19_33.equals(var31_53);
                                        if (var6_6 != 0) break block161;
                                    }
                                    var6_6 = 0;
                                    var7_7 = 0.0f;
                                    var19_33 = null;
                                    var20_35 /* !! */ .setOnTouchListener(null);
                                    var48_70 = 8;
                                    var20_35 /* !! */ .setVisibility(var48_70);
                                    ** GOTO lbl841
                                }
                                var19_33 = var17_23.getStatusHistory();
                                Intrinsics.checkNotNullExpressionValue(var19_33, var32_54);
                                var33_55 = var17_23.getEddUpperRange();
                                var32_54 = "getEddUpperRange(...)";
                                Intrinsics.checkNotNullExpressionValue(var33_55, var32_54);
                                var19_33 = hf2_0.w(var33_55, (ArrayList)var19_33);
                                ** while (true)
                            }
                            if (var19_33 == null) ** GOTO lbl882
                            var6_6 = var19_33.size();
                            if (var6_6 > 0) {
                                var6_6 = var19_33.size();
                                var48_70 = 1;
                                if (var25_41 == (var6_6 -= var48_70)) {
                                    var6_6 = -1;
                                    var7_7 = 0.0f / 0.0f;
                                    var25_41 += var6_6;
                                }
                                var6_6 = 0;
                                var7_7 = 0.0f;
                                var20_35 /* !! */ .setVisibility(0);
                                var53_74 = no_2.d((OrderItemLine)var17_23);
                                var37_61 = var19_33;
                                var38_62 = var4_4;
                                var19_33 = new Hf2$b((hf2_0)var4_4, (hf2_0)var4_4, (ArrayList)var52_73, var25_41, var53_74);
                                var20_35 /* !! */ .setOnTouchListener((View.OnTouchListener)var19_33);
lbl882:
                                // 2 sources

                                var6_6 = 8;
                                var7_7 = 1.1E-44f;
                            } else {
                                var6_6 = 8;
                                var7_7 = 1.1E-44f;
                                var20_35 /* !! */ .setVisibility(var6_6);
                            }
                            break block162;
                        }
                        var6_6 = 8;
                        var7_7 = 1.1E-44f;
                        var20_35 /* !! */ .setVisibility(var6_6);
                    }
                    var19_33 = no_2.e((OrderItemLine)var17_23);
                    var6_6 = (int)TextUtils.isEmpty((CharSequence)var19_33);
                    var20_35 /* !! */  = var4_4.j;
                    if (var6_6 == 0 && var36_60 /* !! */  != 0 && var15_15 != 0) {
                        var19_33 = no_2.e((OrderItemLine)var17_23);
                        var3_3 = new SpannableString((CharSequence)var19_33);
                        var19_33 = new StrikethroughSpan();
                        var15_15 = var3_3.length();
                        var25_41 = 33;
                        var48_70 = 0;
                        var33_55 = null;
                        var3_3.setSpan(var19_33, 0, var15_15, var25_41);
                        var20_35 /* !! */ .setVisibility(0);
                        var20_35 /* !! */ .setText((CharSequence)var3_3);
                    } else {
                        var48_70 = 0;
                        var33_55 = null;
                        var3_3 = no_2.e((OrderItemLine)var17_23);
                        var36_60 /* !! */  = (int)TextUtils.isEmpty((CharSequence)var3_3);
                        if (var36_60 /* !! */  == 0) {
                            var20_35 /* !! */ .setVisibility(0);
                            var3_3 = no_2.e((OrderItemLine)var17_23);
                            var20_35 /* !! */ .setText((CharSequence)var3_3);
                            var3_3 = hv3_0.u(no_2.a((OrderItemLine)var17_23));
                            var16_16 /* !! */  = var51_72;
                            var6_6 = 1;
                            var7_7 = 1.4E-45f;
                            var36_60 /* !! */  = (int)kotlin.text.b.i((String)var3_3, (String)var51_72, (boolean)var6_6);
                            if (var36_60 /* !! */  != 0 && (var36_60 /* !! */  = (int)no_2.i((OrderItemLine)var17_23)) != 0) {
                                var3_3 = FontsManager.getInstance();
                                var19_33 = AJIOApplication$a.a();
                                var3_3 = var3_3.getTypefaceWithFont((Context)var19_33, 10);
                                var19_33 = var47_69;
                                Intrinsics.checkNotNullExpressionValue(var3_3, var47_69);
                                var6_6 = hv3_0.m(R$color.accent_color_1);
                                var15_15 = 2;
                                ai0_2.w((TextView)var20_35 /* !! */ , (Typeface)var3_3, var6_6, var15_15);
                            } else {
                                var19_33 = var47_69;
                                var3_3 = FontsManager.getInstance();
                                var16_16 /* !! */  = AJIOApplication$a.a();
                                var25_41 = 9;
                                var3_3 = var3_3.getTypefaceWithFont((Context)var16_16 /* !! */ , var25_41);
                                Intrinsics.checkNotNullExpressionValue(var3_3, var47_69);
                                var6_6 = 0;
                                var7_7 = 0.0f;
                                var19_33 = null;
                                var15_15 = 6;
                                ai0_2.w((TextView)var20_35 /* !! */ , (Typeface)var3_3, 0, var15_15);
                            }
                        } else {
                            var36_60 /* !! */  = 8;
                            var39_63 = 1.1E-44f;
                            var20_35 /* !! */ .setVisibility(var36_60 /* !! */ );
                        }
                    }
                    var3_3 = no_2.d((OrderItemLine)var17_23);
                    var36_60 /* !! */  = (int)TextUtils.isEmpty((CharSequence)var3_3);
                    if (var36_60 /* !! */  != 0) break block163;
                    var3_3 = no_2.d((OrderItemLine)var17_23).toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var27_44);
                    var18_29 = var3_3.hashCode();
                    var19_33 = var4_4.k;
                    switch (var18_29) lbl-1000:
                    // 9 sources

                    {
                        default: {
                            var36_60 /* !! */  = 8;
                            var39_63 = 1.1E-44f;
                            break;
                        }
                        case 1982485311: {
                            var36_60 /* !! */  = (int)var3_3.equals(var21_37 /* !! */ );
                            if (var36_60 /* !! */  == 0) ** GOTO lbl-1000
lbl962:
                            // 8 sources

                            while (true) {
                                var36_60 /* !! */  = 8;
                                var39_63 = 1.1E-44f;
                                break block147;
                                break;
                            }
                        }
                        case 1746537160: {
                            var36_60 /* !! */  = (int)var3_3.equals(var26_42);
                            if (var36_60 /* !! */  != 0) ** GOTO lbl962
                            ** GOTO lbl-1000
                        }
                        case 163659488: {
                            var36_60 /* !! */  = (int)var3_3.equals(var30_51);
                            if (var36_60 /* !! */  != 0) ** GOTO lbl962
                            ** GOTO lbl-1000
                        }
                        case -1031784143: {
                            var27_44 = var1_1;
                            var36_60 /* !! */  = (int)var3_3.equals(var1_1);
                            if (var36_60 /* !! */  != 0) ** GOTO lbl962
                            ** GOTO lbl-1000
                        }
                        case -1161358223: {
                            var27_44 = "CANCELLATION REQUESTED";
                            var36_60 /* !! */  = (int)var3_3.equals(var27_44);
                            if (var36_60 /* !! */  != 0) ** GOTO lbl962
                            ** GOTO lbl-1000
                        }
                        case -1515427533: {
                            var36_60 /* !! */  = (int)var3_3.equals(var10_10);
                            if (var36_60 /* !! */  == 0) ** GOTO lbl-1000
                            ** GOTO lbl962
                        }
                        case -1812315843: {
                            var36_60 /* !! */  = (int)var3_3.equals(var28_47);
                            if (var36_60 /* !! */  != 0) ** GOTO lbl962
                            ** GOTO lbl-1000
                        }
                        case -1942536072: {
                            var36_60 /* !! */  = (int)var3_3.equals(var31_53);
                            if (var36_60 /* !! */  == 0) ** break;
                            ** continue;
                            ** GOTO lbl-1000
                        }
                    }
                    var19_33.setVisibility(var36_60 /* !! */ );
                    break block163;
                }
                var27_44 = var17_23.getPaymentMode();
                var18_29 = (int)TextUtils.isEmpty((CharSequence)var27_44);
                if (var18_29 == 0) {
                    var18_29 = 0;
                    var35_59 = 0.0f;
                    var19_33.setVisibility(0);
                    var27_44 = var17_23.getPaymentMode();
                    var19_33.setText((CharSequence)var27_44);
                } else {
                    var19_33.setVisibility(var36_60 /* !! */ );
                }
            }
            var3_3 = h40_0.a;
            var36_60 /* !! */  = (int)h40_0.a2();
            var27_44 = var4_4.s;
            var19_33 = var4_4.t;
            if (var36_60 /* !! */  != 0 && (var3_3 = var17_23.getProductRating()) != null) {
                var3_3 = var17_23.getProductRating();
                var8_8 = 0;
                var9_9 = 0.0f;
                var30_51 = null;
                var36_60 /* !! */  = (int)Intrinsics.areEqual((Float)var3_3, 0.0f);
                var10_10 = var4_4.p;
                var20_35 /* !! */  = var4_4.r;
                if (var36_60 /* !! */  != 0) {
                    var19_33.setVisibility(0);
                    var27_44.setVisibility(8);
                    var10_10.setRating(0.0f);
                    var39_63 = var17_23.getProductRating().floatValue();
                    var36_60 /* !! */  = (int)var39_63;
                    var27_44 = var46_68;
                    ai0_2.c((ScaleRatingBar)var10_10, var36_60 /* !! */ , (Integer)var27_44);
                    var20_35 /* !! */ .setRating(0.0f);
                    var3_3 = AJIOApplication$a.a();
                    var18_29 = R$string.rate_the_product_text;
                    var19_33 = var17_23.getTitle();
                    var10_10 = new Object[1];
                    var8_8 = 0;
                    var9_9 = 0.0f;
                    var30_51 = null;
                    var10_10[0] = var19_33;
                    var3_3 = var3_3.getString(var18_29, (Object[])var10_10);
                    var20_35 /* !! */ .setContentDescription((CharSequence)var3_3);
                    var14_14 = var46_68;
                    var3_3 = new ef2_0((hf2_0)var4_4, (OrderItemLine)var17_23, var46_68);
                    var20_35 /* !! */ .setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)var3_3);
                } else {
                    var14_14 = var46_68;
                    var19_33.setVisibility(8);
                    var27_44.setVisibility(0);
                    var20_35 /* !! */ .setRating(0.0f);
                    var3_3 = new Object();
                    var20_35 /* !! */ .setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener)var3_3);
                    var39_63 = var17_23.getProductRating().floatValue();
                    var10_10.setRating(var39_63);
                    var3_3 = var17_23.getProductRating();
                    var39_63 = var3_3.floatValue();
                    var36_60 /* !! */  = (int)var39_63;
                    var27_44 = var46_68;
                    var19_33 = var4_4.q;
                    var30_51 = "<this>";
                    Intrinsics.checkNotNullParameter(var19_33, (String)var30_51);
                    var8_8 = 1;
                    var9_9 = 1.4E-45f;
                    if (var36_60 /* !! */  <= var8_8) {
                        var10_10 = " star";
lbl1065:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var10_10 = " stars";
                    ** continue;
                    var3_3 = UX.a(var36_60 /* !! */ , (String)var10_10);
                    var11_11 = R$string.rated_text;
                    var10_10 = hv3_0.K(var11_11);
                    var20_35 /* !! */  = AJIOApplication$a.a();
                    var15_15 = R$string.acc_rating_read_only;
                    var21_37 /* !! */  = new Object[var8_8];
                    var30_51 = null;
                    var21_37 /* !! */ [0] = var3_3;
                    var3_3 = var20_35 /* !! */ .getString(var15_15, var21_37 /* !! */ );
                    var3_3 = Ft2.a((String)var10_10, (String)var3_3);
                    var8_8 = -1;
                    var9_9 = 0.0f / 0.0f;
                    if (var14_14 != var8_8) {
                        var30_51 = new StringBuilder();
                        var30_51.append((String)var3_3);
                        var30_51.append(" index ");
                        var30_51.append(var27_44);
                        var3_3 = var30_51.toString();
                    }
                    var19_33.setContentDescription((CharSequence)var3_3);
                    var36_60 /* !! */  = 0;
                    var39_63 = 0.0f;
                    var3_3 = null;
                    var19_33.setClickable(false);
                }
            } else {
                var36_60 /* !! */  = 8;
                var39_63 = 1.1E-44f;
                var19_33.setVisibility(var36_60 /* !! */ );
                var27_44.setVisibility(var36_60 /* !! */ );
            }
            var36_60 /* !! */  = (int)h40_0.P1();
            var4_4 = var4_4.w;
            if (var36_60 /* !! */  != 0 && (var3_3 = var17_23.getPriorityDeliveryApplied()) != null && (var36_60 /* !! */  = (int)(var3_3 = var17_23.getPriorityDeliveryApplied()).booleanValue()) != 0) {
                var3_3 = var4_4.getLayoutParams();
                var5_5 = h40_0.j0().getPriorityTagImageWidth();
                var27_44 = AJIOApplication$a.a();
                var3_3.width = var5_5 = ai0_2.e(var5_5, (Context)var27_44);
                var3_3 = var4_4.getLayoutParams();
                var5_5 = h40_0.j0().getPriorityTagImageHeight();
                var27_44 = AJIOApplication$a.a();
                var3_3.height = var5_5 = ai0_2.e(var5_5, (Context)var27_44);
                var4_4.requestLayout();
                var3_3 = AJIOApplication$a.a();
                var5_5 = R$string.pd_icon_content_description;
                var3_3 = var3_3.getString(var5_5);
                var4_4.setContentDescription((CharSequence)var3_3);
                var3_3 = new da$a();
                var5_5 = 1;
                var3_3.k = var5_5;
                var3_3.g = var5_5;
                var3_3.b = var5_5 = R$drawable.ic_priority_delivery;
                var3_3.c = var5_5;
                var17_23 = h40_0.j0().getPriorityDeliveryIcon();
                var21_37 /* !! */  = var17_23 == null ? var41_65 : var17_23;
                var3_3.n = var21_37 /* !! */ ;
                var3_3.u = var4_4;
                var3_3.a();
                ai0_2.B((View)var4_4);
            } else {
                ai0_2.i((View)var4_4);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Object object2 = null;
        if (n3 == 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.layout_order_date_change;
            viewGroup = object.inflate(n4, viewGroup, false);
            object2 = (ap0_0)this.i;
            object = new oa2_1((View)viewGroup, (ap0_0)object2);
        } else {
            int n7 = 1;
            if (n3 == n7) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n7 = R$layout.row_order_revamp_title;
                viewGroup = object.inflate(n7, viewGroup, false);
                object = new of2_0((View)viewGroup);
            } else {
                n7 = this.g;
                if (n3 == n7) {
                    object = LayoutInflater.from((Context)viewGroup.getContext());
                    n7 = R$layout.load_more_layout;
                    viewGroup = object.inflate(n7, viewGroup, false);
                    object2 = this.c;
                    object = new kv1_2((View)viewGroup, (jv1_2)object2);
                } else {
                    n7 = 3;
                    if (n3 == n7) {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n7 = R$layout.row_order_revamp_payment;
                        viewGroup = object.inflate(n7, viewGroup, false);
                        object2 = this.h;
                        Typeface typeface = this.j;
                        Typeface typeface2 = this.k;
                        object2 = (if0_0)object2;
                        object = new qo2_0((View)viewGroup, (if0_0)object2, typeface, typeface2);
                    } else {
                        n7 = 4;
                        if (n3 == n7) {
                            object = LayoutInflater.from((Context)viewGroup.getContext());
                            n7 = R$layout.row_return_order_card;
                            viewGroup = object.inflate(n7, viewGroup, false);
                            object2 = this.h;
                            R71 r71 = this.l;
                            object2 = (if0_0)object2;
                            r71 = (b$c)r71;
                            object = new nf2_1((View)viewGroup, (if0_0)object2, (b$c)r71);
                        } else {
                            n7 = 5;
                            if (n3 == n7) {
                                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                                int n8 = R$layout.item_cms_banner_layout;
                                viewGroup = layoutInflater.inflate(n8, viewGroup, false);
                                Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
                                object2 = this.d;
                                object = new yg_1((View)viewGroup, (Av)object2);
                            } else {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n7 = R$layout.row_order_revamp_product;
                                viewGroup = object.inflate(n7, viewGroup, false);
                                object2 = this.h;
                                R71 r71 = this.l;
                                object2 = (if0_0)object2;
                                r71 = (b$c)r71;
                                object = new hf2_0((View)viewGroup, (if0_0)object2, (b$c)r71);
                            }
                        }
                    }
                }
            }
        }
        return object;
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        super.onViewAttachedToWindow(recyclerView$B);
        boolean bl2 = recyclerView$B instanceof yg_1;
        if (bl2) {
            recyclerView$B = (yg_1)recyclerView$B;
            ((yg_1)recyclerView$B).w();
        }
    }

    public final void onViewRecycled(RecyclerView$B recyclerView$B) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, object);
        boolean bl2 = recyclerView$B instanceof yg_1;
        if (bl2) {
            int n3;
            recyclerView$B = new Message();
            ((Message)recyclerView$B).what = n3 = 1004;
            object = AnalyticsGAEventHandler.Companion.getInstance();
            object.sendMessage((Message)recyclerView$B);
        }
    }
}

