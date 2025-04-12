/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.plp.PLPExtras$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from GV2
 */
public final class gv2_1
extends zj0_0 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Bundle var1_1, String var2_2, String var3_3, boolean var4_4) {
        block20: {
            block21: {
                block17: {
                    block18: {
                        block19: {
                            var5_5 = this;
                            var6_6 /* !! */  = var1_1;
                            var7_8 = var2_2;
                            var8_9 = "SEARCH_TEXT";
                            var9_10 = "SEARCH_TYPE";
                            var10_11 = "q=";
                            var11_12 = "query";
                            var12_13 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                            var13_14 = this.a;
                            var14_15 = this.b;
                            var15_16 = "text";
                            Intrinsics.checkNotNullParameter(var2_2, "searchUrl");
                            var16_17 /* !! */  = null;
                            var17_18 = "text=";
                            try {
                                var18_19 = StringsKt.F(var2_2, var17_18, false);
                                var19_20 = "";
                                var20_21 = "query=";
                                if (!var18_19) break block17;
                                var10_11 = Uri.parse((String)var2_2);
                                var10_11 = var10_11.getQueryParameter(var15_16);
                                var10_11 = String.valueOf(var10_11);
                                var18_19 = StringsKt.F(var2_2, (CharSequence)var20_21, false);
                                if (!var18_19) break block18;
                                var17_18 = Uri.parse((String)var2_2);
                                var20_21 = var17_18.getQueryParameter(var11_12);
                                var21_22 = TextUtils.isEmpty((CharSequence)var10_11);
                                if (var21_22) break block19;
                                var22_23 /* !! */  = var17_18.getQueryParameter(var15_16);
                                var23_24 = var17_18.getQueryParameterNames();
                                var16_17 /* !! */  = new StringBuilder();
                                var16_17 /* !! */ .append(var22_23 /* !! */ );
                                var16_17 /* !! */ .append((String)var20_21);
                                var16_17 /* !! */  = var16_17 /* !! */ .toString();
                                var20_21 = var23_24.iterator();
                                while (var21_22 = var20_21.hasNext()) {
                                    var22_23 /* !! */  = var20_21.next();
                                    var24_27 = Intrinsics.areEqual(var22_23 /* !! */ , var15_16);
                                    if (!var24_27 && !(var24_27 = Intrinsics.areEqual(var22_23 /* !! */ , var11_12))) {
                                        var5_5 = var17_18.getQueryParameter(var22_23 /* !! */ );
                                        var23_24 = var10_11;
                                        var10_11 = new StringBuilder();
                                        var10_11.append((String)var16_17 /* !! */ );
                                        var16_17 /* !! */  = "&";
                                        var10_11.append((String)var16_17 /* !! */ );
                                        var10_11.append(var22_23 /* !! */ );
                                        var16_17 /* !! */  = "=";
                                        var10_11.append((String)var16_17 /* !! */ );
                                        var10_11.append((String)var5_5);
                                        var16_17 /* !! */  = var10_11.toString();
                                    } else {
                                        var23_24 = var10_11;
                                    }
                                    var5_5 = this;
                                    var10_11 = var23_24;
                                }
                            }
                            catch (Exception var6_7) {
                                break block20;
                            }
                            var23_24 = var10_11;
                            var20_21 = var16_17 /* !! */ ;
                            break block21;
                        }
                        var23_25 = var10_11;
                        break block21;
                    }
                    var23_26 = var10_11;
                    var20_21 = var19_20;
                    break block21;
                }
                var25_28 = false;
                var5_5 = null;
                var26_29 = StringsKt.F(var2_2, (CharSequence)var10_11, false);
                if (var26_29) {
                    var20_21 = bj0_1.b(var2_2, (String)var10_11);
lbl82:
                    // 2 sources

                    while (true) {
                        var10_11 = var19_20;
                        break;
                    }
                } else {
                    var27_30 = StringsKt.F(var2_2, (CharSequence)var20_21, false);
                    if (var27_30) {
                        var20_21 = bj0_1.b(var2_2, (String)var20_21);
                        ** continue;
                    }
                    var10_11 = var19_20;
                    var20_21 = var19_20;
                }
            }
            if (var6_6 /* !! */  != null && (var25_28 = var6_6 /* !! */ .containsKey((String)var9_10)) && (var25_28 = var6_6 /* !! */ .containsKey((String)var8_9))) {
                var5_5 = var6_6 /* !! */ .getString((String)var9_10);
                var6_6 /* !! */  = var6_6 /* !! */ .getString((String)var8_9);
            } else {
                var25_28 = false;
                var5_5 = null;
                var6_6 /* !! */  = null;
            }
            var14_15.u();
            var14_15.w();
            var14_15.v();
            var8_9 = new PLPExtras$a();
            var8_9.h = var10_11;
            var9_10 = var20_21 == null ? var19_20 : var20_21;
            var8_9.b = var9_10;
            var28_31 = TextUtils.isEmpty((CharSequence)var20_21);
            if (!var28_31) {
                var10_11 = var20_21;
            }
            if (var10_11 == null) {
                var10_11 = var19_20;
            }
            var8_9.c = var10_11;
            var9_10 = var3_3 == null ? var19_20 : var3_3;
            var8_9.d = var9_10;
            if (var5_5 == null) {
                var5_5 = var19_20;
            }
            var8_9.j = var5_5;
            if (var6_6 /* !! */  == null) {
                var6_6 /* !! */  = var19_20;
            }
            var8_9.k = var6_6 /* !! */ ;
            var8_9.u = var4_4;
            var6_6 /* !! */  = var8_9.a();
            var25_28 = var13_14 instanceof AjioHomeActivity;
            if (var25_28 == false) return;
            {
                Intrinsics.checkNotNull(var13_14, var12_13);
                var5_5 = var13_14;
                var5_5 = (AjioHomeActivity)var13_14;
                var5_5 = var5_5.Q2();
                var5_5 = var5_5.a;
                var5_5.k(var6_6 /* !! */ );
                var5_5 = var6_6 /* !! */ .e;
                if (var5_5 != null) {
                    var19_20 = var5_5;
                }
                var6_6 /* !! */  = var6_6 /* !! */ .H;
                var6_6 /* !! */  = at2_1.b((String)var19_20, (String)var6_6 /* !! */ );
                Intrinsics.checkNotNull(var13_14, var12_13);
                var5_5 = var13_14;
                var5_5 = (AjioHomeActivity)var13_14;
                Intrinsics.checkNotNull(var13_14, var12_13);
                var13_14 = (AjioHomeActivity)var13_14;
                var8_9 = var13_14.T0;
                var28_31 = true;
                j3$a.a((j3_0)var5_5, (Fragment)var8_9, (Fragment)var6_6 /* !! */ , var28_31, var7_8);
                return;
            }
        }
        var5_5 = yn3_0.a;
        var5_5.l("SearchLinkHandler");
        var7_8 = "url: ".concat(var7_8);
        var8_9 = new Object[]{};
        var5_5.a(var7_8, (Object[])var8_9);
        var5_5.e(var6_7);
    }
}

