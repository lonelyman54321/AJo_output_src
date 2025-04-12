/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout$LayoutParams
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.data.database.entity.NotificationActions;
import com.ril.ajio.data.database.entity.Notifications;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DZ1
 */
public final class dz1_2
extends RecyclerView$f {
    public static final DZ1$a Companion;
    public final n52_0 a;
    public ArrayList b;
    public final jo_2 c;

    static {
        DZ1$a dZ1$a;
        Companion = dZ1$a = new Object();
    }

    public dz1_2(n52_0 object, ArrayList object2) {
        this.a = object;
        this.b = object2;
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        this.c = object = new jo_2((Context)object2);
    }

    public final int getItemCount() {
        int n3;
        int n4;
        ArrayList arrayList = this.b;
        if (arrayList != null && (arrayList == null || (n4 = arrayList.isEmpty()) != (n3 = 1))) {
            arrayList = this.b;
            Intrinsics.checkNotNull(arrayList);
            n4 = arrayList.size();
        } else {
            n4 = 0;
            arrayList = null;
        }
        return n4;
    }

    public final int getItemViewType(int n3) {
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNull(arrayList);
        Notifications notifications = (Notifications)arrayList.get(n3);
        long l2 = notifications.getNotiType();
        long l3 = 5002L;
        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        n3 = n3 == 0 ? 1 : 2;
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block44: {
            block46: {
                block43: {
                    block42: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_10 = var2_2;
                        var6_11 = "holder";
                        Intrinsics.checkNotNullParameter(var1_1, (String)var6_11);
                        var7_12 = var1_1 instanceof mz1_2;
                        var8_13 = "get(...)";
                        if (var7_12 != 0) {
                            var6_11 = this.b;
                            Intrinsics.checkNotNull(var6_11);
                            var6_11 = var6_11.get(var2_2);
                            Intrinsics.checkNotNullExpressionValue(var6_11, (String)var8_13);
                            var6_11 = (Notifications)var6_11;
                            var6_11.setPosition(var2_2);
                            var9_14 = var1_1;
                            var9_14 = (mz1_2)var1_1;
                            var9_14.getClass();
                            Intrinsics.checkNotNullParameter(var6_11, "notifications");
                            var4_4 = mz1_2.w(var6_11.getActionsList());
                            var9_14.x = var10_16 = var6_11.getPosition();
                            var11_17 = var4_4.isEmpty();
                            var8_13 = var9_14.t;
                            var12_18 = var9_14.f;
                            var13_19 = var9_14.m;
                            var14_20 /* !! */  = var9_14.p;
                            var15_21 = var9_14.e;
                            var16_22 = var9_14.s;
                            var17_23 = var9_14.d;
                            var18_24 /* !! */  = var9_14.c;
                            var19_25 = 1;
                            var20_26 = 1.4E-45f;
                            var21_27 = 8;
                            var22_28 = null;
                            if (var11_17 != 0) {
                                var4_4 = var6_11.getTitle();
                                var18_24 /* !! */ .setText((CharSequence)var4_4);
                                var18_24 /* !! */ .setVisibility(0);
                                var4_4 = var6_11.getMessage();
                                var17_23.setText((CharSequence)var4_4);
                                var17_23.setVisibility(0);
                                var11_17 = var6_11.getUnread();
                                if (var11_17 == var19_25) {
                                    var16_22.setVisibility(0);
                                } else {
                                    var16_22.setVisibility(var21_27);
                                }
                                var4_4 = var6_11.getImgUrl();
                                if (var4_4 != null && (var11_17 = (var4_4 = var6_11.getImgUrl()).length()) > 0) {
                                    var14_20 /* !! */ .setVisibility(0);
                                    var13_19.setVisibility(0);
                                    var13_19.setClipToOutline((boolean)var19_25);
                                    var4_4 = new da$a();
                                    var4_4.k = var19_25;
                                    var4_4.a = var23_29 = R$drawable.component_placeholder;
                                    var4_4.b = var23_29;
                                    var14_20 /* !! */  = var6_11.getImgUrl();
                                    var4_4.n = var14_20 /* !! */ ;
                                    var4_4.u = var13_19;
                                    var4_4.a();
                                    var15_21.setVisibility(var21_27);
                                } else {
                                    var14_20 /* !! */ .setVisibility(var21_27);
                                    var15_21.setVisibility(0);
                                    var4_4 = var12_18.getLayoutParams();
                                    var13_19 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
                                    Intrinsics.checkNotNull(var4_4, (String)var13_19);
                                    var4_4 = (RelativeLayout.LayoutParams)var4_4;
                                    var24_30 = hv3_0.q(R$dimen.margin_8);
                                    var4_4.setMargins(var24_30, 0, 0, 0);
                                    var12_18.setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                }
                                var8_13.setVisibility(var21_27);
                            } else {
                                var4_4 = mz1_2.w(var6_11.getActionsList());
                                var25_31 = var4_4.isEmpty() ^ var19_25;
                                if (var25_31) {
                                    var8_13.setVisibility(0);
                                    var18_24 /* !! */ .setVisibility(var21_27);
                                    var17_23.setVisibility(var21_27);
                                    var14_20 /* !! */ .setVisibility(0);
                                    var8_13 = ((NotificationActions)var4_4.get(0)).getDeepLinkUrl();
                                    var14_20 /* !! */  = var9_14.n;
                                    var14_20 /* !! */ .setText((CharSequence)var8_13);
                                    var13_19.setVisibility(var21_27);
                                    var4_4 = ((NotificationActions)var4_4.get(0)).getDeepLinkUrl();
                                    var14_20 /* !! */ .setText((CharSequence)var4_4);
                                    var4_4 = var9_14.u;
                                    var8_13 = var6_11.getTitle();
                                    var4_4.setText((CharSequence)var8_13);
                                    var4_4 = var9_14.v;
                                    var8_13 = var6_11.getMessage();
                                    var4_4.setText((CharSequence)var8_13);
                                    var15_21.setVisibility(var21_27);
                                    var11_17 = var6_11.getUnread();
                                    var8_13 = var9_14.w;
                                    if (var11_17 == var19_25) {
                                        var8_13.setVisibility(0);
                                        var16_22.setVisibility(var21_27);
                                    } else {
                                        var8_13.setVisibility(var21_27);
                                    }
                                }
                            }
                            var4_4 = var6_11.getActionsList();
                            var8_13 = new ArrayList();
                            if (var4_4 != null) {
                                var4_4 = var4_4.iterator();
                                while ((var24_30 = var4_4.hasNext()) != 0) {
                                    var13_19 = (NotificationActions)var4_4.next();
                                    var23_29 = var13_19.getActionType();
                                    if (var23_29 != (var26_32 = 5003)) continue;
                                    var8_13.add(var13_19);
                                }
                            }
                            var11_17 = var8_13.size();
                            var13_19 = var9_14.l;
                            var14_20 /* !! */  = var9_14.k;
                            var15_21 = var9_14.j;
                            var16_22 = var9_14.q;
                            var17_23 = var9_14.r;
                            var18_24 /* !! */  = var9_14.a;
                            var27_33 = var9_14.o;
                            if (var11_17 > 0) {
                                var4_4 = ((NotificationActions)var8_13.get(0)).getDeepLinkUrl();
                                var28_34 = "getDeepLinkUrl(...)";
                                Intrinsics.checkNotNullExpressionValue(var4_4, var28_34);
                                var29_35 = " ";
                                var3_3 = "dd-MM-yyyy HH:mm:ss";
                                var22_28 = new SimpleDateFormat((String)var3_3);
                                var4_4 = var22_28.parse((String)var4_4);
                                var30_36 = var4_4.getTime();
                                var4_4 = Calendar.getInstance();
                                var32_37 = var4_4.getTimeInMillis();
                                var30_36 -= var32_37;
                                var11_17 = 86400000;
                                var34_38 = var9_14;
                                var22_28 = var6_11;
                            }
                            var34_38 = var9_14;
                            var41_43 = var6_11;
                            var37_40 = var12_18;
                            var8_13 = var13_19;
                            var6_11 = var14_20 /* !! */ ;
                            var9_14 = var15_21;
                            var52_52 = 8;
                            var50_50 = 1;
                            var51_51 = 1.4E-45f;
                            var27_33.setVisibility(var52_52);
                            var16_22.setVisibility(var52_52);
                            var17_23.setVisibility(var52_52);
                            var18_24 /* !! */ .setClickable((boolean)var50_50);
                            var15_21.setClickable((boolean)var50_50);
                            var14_20 /* !! */ .setClickable((boolean)var50_50);
                            var13_19.setClickable((boolean)var50_50);
lbl153:
                            // 3 sources

                            while (true) {
                                var4_4 = var41_43.getActionsList();
                                var3_3 = new ArrayList();
                                if (var4_4 != null) {
                                    var4_4 = var4_4.iterator();
                                    while ((var50_50 = var4_4.hasNext()) != 0) {
                                        var12_18 = (NotificationActions)var4_4.next();
                                        var24_30 = var12_18.getActionType();
                                        if (var24_30 != (var23_29 = 5001)) continue;
                                        var3_3.add(var12_18);
                                    }
                                }
                                var11_17 = var3_3.size();
                                var12_18 = var34_38;
                                var13_19 = var34_38.g;
                                var14_20 /* !! */  = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
                                var26_32 = 1;
                                if (var11_17 == var26_32) {
                                    var4_4 = var9_14.getLayoutParams();
                                    Intrinsics.checkNotNull(var4_4, (String)var14_20 /* !! */ );
                                    var4_4 = (LinearLayout.LayoutParams)var4_4;
                                    var50_50 = 1065353216;
                                    var4_4.weight = var51_51 = 1.0f;
                                    var9_14.setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                    var26_32 = 0;
                                    var15_21 = null;
                                    var4_4 = ((NotificationActions)var3_3.get(0)).getTitle();
                                    var13_19.setText((CharSequence)var4_4);
                                    var4_4 = var3_3.get(0);
                                    var9_14.setTag(var4_4);
                                    var9_14.invalidate();
                                    var9_14.setVisibility(0);
                                    var52_52 = 8;
                                    var6_11.setVisibility(var52_52);
                                    var8_13.setVisibility(var52_52);
                                    var16_22 = var37_40;
                                    var37_40.setVisibility(0);
                                } else {
                                    var16_22 = var37_40;
                                    var26_32 = 0;
                                    var15_21 = null;
                                    var11_17 = var3_3.size();
                                    var17_23 = var34_38.h;
                                    var53_54 = 2;
                                    if (var11_17 == var53_54) {
                                        var4_4 = var9_14.getLayoutParams();
                                        Intrinsics.checkNotNull(var4_4, (String)var14_20 /* !! */ );
                                        var4_4 = (LinearLayout.LayoutParams)var4_4;
                                        var4_4.weight = var51_51 = 0.5f;
                                        var18_24 /* !! */  = ((NotificationActions)var3_3.get(0)).getTitle();
                                        var13_19.setText((CharSequence)var18_24 /* !! */ );
                                        var13_19 = var3_3.get(0);
                                        var9_14.setTag(var13_19);
                                        var9_14.setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                        var9_14.invalidate();
                                        var4_4 = var6_11.getLayoutParams();
                                        Intrinsics.checkNotNull(var4_4, (String)var14_20 /* !! */ );
                                        var4_4 = (LinearLayout.LayoutParams)var4_4;
                                        var4_4.weight = var51_51;
                                        var6_11.setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                        var50_50 = 1;
                                        var51_51 = 1.4E-45f;
                                        var4_4 = ((NotificationActions)var3_3.get(var50_50)).getTitle();
                                        var17_23.setText((CharSequence)var4_4);
                                        var4_4 = var3_3.get(var50_50);
                                        var6_11.setTag(var4_4);
                                        var26_32 = 0;
                                        var15_21 = null;
                                        var9_14.setVisibility(0);
                                        var6_11.setVisibility(0);
                                        var52_52 = 8;
                                        var8_13.setVisibility(var52_52);
                                        var37_40.setVisibility(0);
                                    } else {
                                        var11_17 = var3_3.size();
                                        var19_25 = 3;
                                        var20_26 = 4.2E-45f;
                                        if (var11_17 == var19_25) {
                                            var4_4 = var9_14.getLayoutParams();
                                            Intrinsics.checkNotNull(var4_4, (String)var14_20 /* !! */ );
                                            var4_4 = (LinearLayout.LayoutParams)var4_4;
                                            var19_25 = 1051260355;
                                            var4_4.weight = var20_26 = 0.33f;
                                            var9_14.setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                            var4_4 = ((NotificationActions)var3_3.get(0)).getTitle();
                                            var13_19.setText((CharSequence)var4_4);
                                            var4_4 = var3_3.get(0);
                                            var9_14.setTag(var4_4);
                                            var4_4 = var6_11.getLayoutParams();
                                            Intrinsics.checkNotNull(var4_4, (String)var14_20 /* !! */ );
                                            var4_4 = (LinearLayout.LayoutParams)var4_4;
                                            var4_4.weight = var20_26;
                                            var6_11.setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                            var6_11.invalidate();
                                            var24_30 = 1;
                                            var4_4 = ((NotificationActions)var3_3.get(var24_30)).getTitle();
                                            var17_23.setText((CharSequence)var4_4);
                                            var4_4 = var3_3.get(var24_30);
                                            var6_11.setTag(var4_4);
                                            var4_4 = var8_13.getLayoutParams();
                                            Intrinsics.checkNotNull(var4_4, (String)var14_20 /* !! */ );
                                            var4_4 = (LinearLayout.LayoutParams)var4_4;
                                            var4_4.weight = var20_26;
                                            var8_13.setLayoutParams((ViewGroup.LayoutParams)var4_4);
                                            var4_4 = ((NotificationActions)var3_3.get(var53_54)).getTitle();
                                            var12_18 = var34_38.i;
                                            var12_18.setText((CharSequence)var4_4);
                                            var4_4 = var3_3.get(var53_54);
                                            var8_13.setTag(var4_4);
                                            var52_52 = 0;
                                            var3_3 = null;
                                            var9_14.setVisibility(0);
                                            var6_11.setVisibility(0);
                                            var8_13.setVisibility(0);
                                            var37_40.setVisibility(0);
                                        } else {
                                            var52_52 = 8;
                                            var37_40.setVisibility(var52_52);
                                        }
                                    }
                                }
lbl271:
                                // 5 sources

                                while (true) {
                                    var3_3 = this;
                                    return;
                                }
                                break;
                            }
                        }
                        ** while (!(var52_53 = var1_1 instanceof cp2_0))
lbl275:
                        // 1 sources

                        var6_11 = this.b;
                        Intrinsics.checkNotNull(var6_11);
                        var6_11 = var6_11.get(var2_2);
                        Intrinsics.checkNotNullExpressionValue(var6_11, (String)var8_13);
                        var6_11 = (Notifications)var6_11;
                        var6_11.setPosition(var2_2);
                        var4_4 = (cp2_0)var1_1;
                        var4_4.w((Notifications)var6_11);
                        var6_11 = this.b;
                        Intrinsics.checkNotNull(var6_11);
                        var9_15 /* !! */  = var6_11.get(var2_2);
                        Intrinsics.checkNotNullExpressionValue(var9_15 /* !! */ , (String)var8_13);
                        var9_15 /* !! */  = (Notifications)var9_15 /* !! */ ;
                        var4_4.w((Notifications)var9_15 /* !! */ );
                        return;
                        var35_39 = var11_17;
                        var37_40 = var12_18;
                        var38_41 = var13_19;
                        var39_42 = var30_36 / var35_39;
                        var11_17 = R$string.expiry_text;
                        var4_4 = hv3_0.K(var11_17);
                        var41_43 = var6_11;
                        try {
                            var22_28 = new StringBuilder();
                            var22_28.append((String)var4_4);
                            var22_28.append(var29_35);
                            var4_4 = var22_28.toString();
                            var30_36 %= var35_39;
                            var5_10 = 33;
                            var42_44 = 0L;
                            var7_12 = var39_42 == var42_44 ? 0 : (var39_42 < var42_44 ? -1 : 1);
                            if (var7_12 <= 0) break block42;
                            var7_12 = 0;
                            var6_11 = null;
                            var27_33.setVisibility(0);
                            var6_11 = new StringBuilder();
                            var6_11.append((String)var4_4);
                            var6_11.append(var39_42);
                            var4_4 = " Days";
                            var6_11.append((String)var4_4);
                            var4_4 = var6_11.toString();
                            var6_11 = new SpannableString((CharSequence)var4_4);
                            var24_30 = R$color.color_939393;
                            var24_30 = hv3_0.m(var24_30);
                            var12_18 = new ForegroundColorSpan(var24_30);
                            var11_17 = var4_4.length();
                            var24_30 = 0;
                            var13_19 = null;
                            var6_11.setSpan(var12_18, 0, var11_17, var5_10);
                            var27_33.setText((CharSequence)var6_11);
                            var44_45 /* !! */  = var14_20 /* !! */ ;
                            var45_46 /* !! */  = var15_21;
lbl333:
                            // 4 sources

                            while (true) {
                                var5_10 = 0;
                                var9_14 = null;
                                var4_4 = ((NotificationActions)var8_13.get(0)).getDeepLinkUrl();
                                break;
                            }
                        }
                        catch (ParseException var4_5) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var44_45 /* !! */  = var14_20 /* !! */ ;
                                var45_46 /* !! */  = var15_21;
                                break;
                            }
                        }
                        {
                            block45: {
                                Intrinsics.checkNotNullExpressionValue(var4_4, var28_34);
                                var9_14 = new SimpleDateFormat((String)var3_3);
                                try {
                                    var4_4 = var9_14.parse((String)var4_4);
                                    var3_3 = Calendar.getInstance();
                                    var35_39 = var4_4.getTime();
                                    var3_3.setTimeInMillis(var35_39);
                                    var4_4 = Calendar.getInstance();
                                    var11_17 = (int)var3_3.before(var4_4);
                                }
                                catch (ParseException var4_9) {
                                    var3_3 = yn3_0.a;
                                    var3_3.e(var4_9);
                                    var11_17 = 0;
                                    var4_4 = null;
                                }
                                if (var11_17 == 0) break block45;
                                var3_3 = null;
                                var16_22.setVisibility(0);
                                var17_23.setVisibility(0);
                                var18_24 /* !! */ .setClickable(false);
                                var9_14 = var45_46 /* !! */ ;
                                var45_46 /* !! */ .setClickable(false);
                                var6_11 = var44_45 /* !! */ ;
                                var44_45 /* !! */ .setClickable(false);
                                var8_13 = var38_41;
                                var38_41.setClickable(false);
                                var52_52 = 8;
                                var50_50 = 1;
                                var51_51 = 1.4E-45f;
                                ** GOTO lbl153
                            }
                            var8_13 = var38_41;
                            var6_11 = var44_45 /* !! */ ;
                            var9_14 = var45_46 /* !! */ ;
                            var52_52 = 8;
                            var16_22.setVisibility(var52_52);
                            var17_23.setVisibility(var52_52);
                            var50_50 = 1;
                            var51_51 = 1.4E-45f;
                            var18_24 /* !! */ .setClickable((boolean)var50_50);
                            var45_46 /* !! */ .setClickable((boolean)var50_50);
                            var44_45 /* !! */ .setClickable((boolean)var50_50);
                            var38_41.setClickable((boolean)var50_50);
                            ** continue;
                        }
                        catch (ParseException var4_8) {
                            var34_38 = var9_14;
                            var41_43 = var6_11;
                            var37_40 = var12_18;
                            var38_41 = var13_19;
                            ** continue;
                        }
                        catch (ParseException var4_7) {
                            var44_45 /* !! */  = var14_20 /* !! */ ;
                            var45_46 /* !! */  = var15_21;
                            var41_43 = var22_28;
                        }
                        break block44;
                    }
                    var7_12 = 3600000;
                    var39_42 = var7_12;
                    var35_39 = var30_36 / var39_42;
                    var46_47 = 1L;
                    var22_28 = "00";
                    var48_48 /* !! */  = (long)(var35_39 == var42_44 ? 0 : (var35_39 < var42_44 ? -1 : 1));
                    if (var48_48 /* !! */  > 0) {
                        var44_45 /* !! */  = var14_20 /* !! */ ;
                        var14_20 /* !! */  = " hrs";
                        var49_49 /* !! */  = (long)(var35_39 == var46_47 ? 0 : (var35_39 < var46_47 ? -1 : 1));
                        if (var49_49 /* !! */  > 0) {
                            var45_46 /* !! */  = var15_21;
                            try {
                                var15_21 = new StringBuilder();
                                var15_21.append(var35_39);
                                var15_21.append((String)var14_20 /* !! */ );
lbl416:
                                // 2 sources

                                while (true) {
                                    var9_14 = var15_21.toString();
                                    break block43;
                                    break;
                                }
                            }
                            catch (ParseException var4_6) {
                                break block44;
                            }
                        }
                        var45_46 /* !! */  = var15_21;
                        var15_21 = new StringBuilder();
                        var15_21.append(var35_39);
                        var15_21.append((String)var14_20 /* !! */ );
                        ** continue;
                    }
                    var44_45 /* !! */  = var14_20 /* !! */ ;
                    var45_46 /* !! */  = var15_21;
                    var9_14 = var22_28;
                }
                var30_36 %= var39_42;
                var7_12 = 60000;
                var39_42 = var7_12;
                var39_42 = var30_36 / var39_42;
                var7_12 = (int)(var39_42 == var42_44 ? 0 : (var39_42 < var42_44 ? -1 : 1));
                if (var7_12 > 0) {
                    var7_12 = (int)(var39_42 == var46_47 ? 0 : (var39_42 < var46_47 ? -1 : 1));
                    if (var7_12 > 0) {
                        var6_11 = new StringBuilder();
                        var6_11.append(var39_42);
                        var12_18 = " mins";
                        var6_11.append((String)var12_18);
                    } else {
                        var6_11 = new StringBuilder();
                        var6_11.append(var39_42);
                        var12_18 = " min";
                        var6_11.append((String)var12_18);
                    }
                    var6_11 = var6_11.toString();
                } else {
                    var6_11 = var22_28;
                }
                var50_50 = 60;
                var51_51 = 8.4E-44f;
                var39_42 = var50_50;
                var30_36 %= var39_42;
                var50_50 = 1000;
                var51_51 = 1.401E-42f;
                var39_42 = var50_50;
                cfr_temp_0 = (var30_36 /= var39_42) - var42_44;
                var50_50 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                var12_18 = var50_50 > 0 ? String.valueOf(var30_36) : var22_28;
                var13_19 = new StringBuilder();
                var13_19.append((String)var9_14);
                var13_19.append(var29_35);
                var13_19.append((String)var6_11);
                var13_19 = var13_19.toString();
                var5_10 = (int)Intrinsics.areEqual(var9_14, var22_28);
                if (var5_10 == 0 || (var5_10 = (int)Intrinsics.areEqual(var6_11, var22_28)) == 0 || (var5_10 = (int)Intrinsics.areEqual(var12_18, var22_28)) == 0) break block46;
                var5_10 = 8;
                var27_33.setVisibility(var5_10);
                ** GOTO lbl333
            }
            var5_10 = 0;
            var9_14 = null;
            var27_33.setVisibility(0);
            var9_14 = new StringBuilder();
            var9_14.append((String)var4_4);
            var9_14.append((String)var13_19);
            var4_4 = var9_14.toString();
            var9_14 = new SpannableString((CharSequence)var4_4);
            var50_50 = R$color.color_939393;
            var50_50 = hv3_0.m(var50_50);
            var6_11 = new ForegroundColorSpan(var50_50);
            var50_50 = 10;
            var51_51 = 1.4E-44f;
            var24_30 = 0;
            var13_19 = null;
            var23_29 = 33;
            var9_14.setSpan(var6_11, 0, var50_50, var23_29);
            var50_50 = R$color.red;
            var50_50 = hv3_0.m(var50_50);
            var6_11 = new ForegroundColorSpan(var50_50);
            var50_50 = var4_4.length();
            var24_30 = 11;
            var23_29 = 33;
            var9_14.setSpan(var6_11, var24_30, var50_50, var23_29);
            var50_50 = 1;
            var51_51 = 1.4E-45f;
            var6_11 = new StyleSpan(var50_50);
            var11_17 = var4_4.length();
            var9_14.setSpan(var6_11, var24_30, var11_17, var23_29);
            var27_33.setText((CharSequence)var9_14);
            ** GOTO lbl333
        }
        var9_14 = yn3_0.a;
        var9_14.e((Throwable)var4_4);
        var5_10 = 8;
        var27_33.setVisibility(var5_10);
        ** while (true)
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Object object2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object2);
        int n4 = 1;
        n52_0 n52_02 = this.a;
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.layout_notification_rewards_expiring;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object2 = this.b;
            Intrinsics.checkNotNull(object2);
            object = new cp2_0((View)viewGroup, (List)object2, n52_02);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.new_notification_list_item;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object2 = this.b;
            object = new mz1_2((View)viewGroup, (List)object2, n52_02);
        }
        return object;
    }
}

