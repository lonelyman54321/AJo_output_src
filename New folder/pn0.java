/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.text.TextUtils
 */
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.d;
import androidx.media3.ui.R$string;
import java.util.Locale;

public final class pn0
implements tp3 {
    public final Resources a;

    public pn0(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String a(d var1_1) {
        var2_2 = 2;
        var3_3 = 1;
        var4_4 = var1_1.o;
        var5_5 = ip1_0.g(var4_4);
        var6_6 = -1;
        var7_7 = var1_1.D;
        var8_8 = var1_1.w;
        var9_9 = var1_1.v;
        if (var5_5 == var6_6) {
            var5_5 = 0;
            var4_4 = null;
            var10_10 = var1_1.k;
            if (var10_10 == null) {
                while (true) {
                    var11_17 = false;
                    var12_11 = null;
                    break;
                }
            } else {
                var13_12 = gz3.S((String)var10_10);
                var14_13 = var13_12.length;
                var15_14 = 0;
                var16_15 = null;
                while (true) {
                    if (var15_14 >= var14_13) ** continue;
                    var12_11 = ip1_0.c(var13_12[var15_14]);
                    if (var12_11 != null && (var17_16 = ip1_0.k(var12_11))) break;
                    var15_14 += var3_3;
                }
            }
            if (var12_11 != null) {
                while (true) {
                    var5_5 = 2;
                    break;
                }
            } else {
                if (var10_10 != null) {
                    var10_10 = gz3.S((String)var10_10);
                    var18_19 = var10_10.length;
                    var19_18 = null;
                    for (var14_13 = 0; var14_13 < var18_19; var14_13 += var3_3) {
                        var16_15 = ip1_0.c(var10_10[var14_13]);
                        if (var16_15 == null || !(var11_17 = ip1_0.h(var16_15))) continue;
                        var4_4 = var16_15;
                        break;
                    }
                }
                if (var4_4 != null) {
                    while (true) {
                        var5_5 = 1;
                        break;
                    }
                } else {
                    if (var9_9 != var6_6 || var8_8 != var6_6) ** continue;
                    if (var7_7 != var6_6 || (var5_5 = var1_1.E) != var6_6) ** continue;
                    var5_5 = -1;
                }
            }
        }
        var20_20 = 1000000.0f;
        var13_12 = this.a;
        var19_18 = "";
        var15_14 = var1_1.j;
        if (var5_5 == var2_2) {
            var4_4 = this.c((d)var1_1);
            if (var9_9 != var6_6 && var8_8 != var6_6) {
                var7_7 = R$string.exo_track_resolution;
                var21_21 = var9_9;
                var22_22 = Integer.valueOf(var8_8);
                var23_24 /* !! */  = new Object[var2_2];
                var23_24 /* !! */ [0] = var21_21;
                var23_24 /* !! */ [var3_3] = var22_22;
                var23_24 /* !! */  = var13_12.getString(var7_7, var23_24 /* !! */ );
            } else {
                var23_24 /* !! */  = var19_18;
            }
            if (var15_14 != var6_6) {
                var6_6 = R$string.exo_track_bitrate;
                var24_25 = (float)var15_14 / var20_20;
                var25_27 = Float.valueOf(var24_25);
                var22_22 = new Object[var3_3];
                var22_22[0] = var25_27;
                var19_18 = var13_12.getString(var6_6, var22_22);
            }
            var23_24 /* !! */  = new String[]{var4_4, var23_24 /* !! */ , var19_18};
            var23_24 /* !! */  = this.d((String[])var23_24 /* !! */ );
        } else if (var5_5 == var3_3) {
            var4_4 = this.b((d)var1_1);
            if (var7_7 != var6_6 && var7_7 >= var3_3) {
                if (var7_7 != var3_3) {
                    if (var7_7 != var2_2) {
                        var2_2 = 6;
                        if (var7_7 != var2_2 && var7_7 != (var2_2 = 7)) {
                            var2_2 = 8;
                            if (var7_7 != var2_2) {
                                var2_2 = R$string.exo_track_surround;
                                var23_24 /* !! */  = var13_12.getString(var2_2);
                            } else {
                                var2_2 = R$string.exo_track_surround_7_point_1;
                                var23_24 /* !! */  = var13_12.getString(var2_2);
                            }
                        } else {
                            var2_2 = R$string.exo_track_surround_5_point_1;
                            var23_24 /* !! */  = var13_12.getString(var2_2);
                        }
                    } else {
                        var2_2 = R$string.exo_track_stereo;
                        var23_24 /* !! */  = var13_12.getString(var2_2);
                    }
                } else {
                    var2_2 = R$string.exo_track_mono;
                    var23_24 /* !! */  = var13_12.getString(var2_2);
                }
            } else {
                var23_24 /* !! */  = var19_18;
            }
            if (var15_14 != var6_6) {
                var6_6 = R$string.exo_track_bitrate;
                var24_26 = (float)var15_14 / var20_20;
                var25_28 = Float.valueOf(var24_26);
                var22_23 = new Object[var3_3];
                var22_23[0] = var25_28;
                var19_18 = var13_12.getString(var6_6, var22_23);
            }
            var23_24 /* !! */  = new String[]{var4_4, var23_24 /* !! */ , var19_18};
            var23_24 /* !! */  = this.d((String[])var23_24 /* !! */ );
        } else {
            var23_24 /* !! */  = this.b((d)var1_1);
        }
        var5_5 = var23_24 /* !! */ .length();
        if (var5_5 != 0) {
            return var23_24 /* !! */ ;
        }
        var1_1 = var1_1.d;
        if (var1_1 != null && (var2_2 = (int)(var23_24 /* !! */  = var1_1.trim()).isEmpty()) == 0) {
            var2_2 = R$string.exo_track_unknown_name;
            var26_29 = new Object[var3_3];
            var26_29[0] = var1_1;
            var1_1 = var13_12.getString(var2_2, var26_29);
        } else {
            var27_30 = R$string.exo_track_unknown;
            var1_1 = var13_12.getString(var27_30);
        }
        return var1_1;
    }

    /*
     * Unable to fully structure code
     */
    public final String b(d var1_1) {
        var2_2 = var1_1.d;
        var3_3 = TextUtils.isEmpty((CharSequence)var2_2);
        var4_4 = "";
        if (var3_3 != 0 || (var3_3 = (var5_5 = "und").equals(var2_2)) != 0) ** GOTO lbl-1000
        var2_2 = Locale.forLanguageTag((String)var2_2);
        var3_3 = gz3.a;
        var6_6 = 24;
        var5_5 = var3_3 >= var6_6 ? Sy3.a(Ry3.a()) : Locale.getDefault();
        var6_6 = (int)TextUtils.isEmpty((CharSequence)(var2_2 = var2_2.getDisplayName((Locale)var5_5)));
        if (var6_6 != 0) lbl-1000:
        // 2 sources

        {
            var2_2 = var4_4;
        } else {
            var6_6 = 1;
            var7_7 = null;
            try {
                var6_6 = var2_2.offsetByCodePoints(0, var6_6);
            }
            catch (IndexOutOfBoundsException v0) {}
            var8_8 = new StringBuilder();
            var7_7 = var2_2.substring(0, var6_6);
            var5_5 = var7_7.toUpperCase((Locale)var5_5);
            var8_8.append((String)var5_5);
            var5_5 = var2_2.substring(var6_6);
            var8_8.append((String)var5_5);
            var2_2 = var8_8.toString();
        }
        var5_5 = this.c((d)var1_1);
        var2_2 = new String[]{var2_2, var5_5};
        var2_2 = this.d((String[])var2_2);
        var3_3 = (int)TextUtils.isEmpty((CharSequence)var2_2);
        if (var3_3 != 0) {
            var1_1 = var1_1.b;
            var9_9 = TextUtils.isEmpty((CharSequence)var1_1);
            if (!var9_9) {
                var4_4 = var1_1;
            }
            var2_2 = var4_4;
        }
        return var2_2;
    }

    public final String c(d stringArray) {
        String string2;
        Object object;
        int n3 = stringArray.f & 2;
        Resources resources = this.a;
        if (n3 != 0) {
            n3 = R$string.exo_track_role_alternate;
            object = resources.getString(n3);
        } else {
            object = "";
        }
        int n4 = stringArray.f;
        int n7 = n4 & 4;
        if (n7 != 0) {
            n7 = R$string.exo_track_role_supplementary;
            string2 = resources.getString(n7);
            object = new String[]{object, string2};
            object = this.d((String)object);
        }
        if ((n7 = n4 & 8) != 0) {
            n7 = R$string.exo_track_role_commentary;
            string2 = resources.getString(n7);
            object = new String[]{object, string2};
            object = this.d((String)object);
        }
        if ((n4 &= 0x440) != 0) {
            n4 = R$string.exo_track_role_closed_captions;
            stringArray = resources.getString(n4);
            stringArray = new String[]{object, stringArray};
            object = this.d(stringArray);
        }
        return object;
    }

    public final String d(String ... stringArray) {
        int n3 = 1;
        int n4 = stringArray.length;
        String string2 = "";
        for (int i3 = 0; i3 < n4; i3 += n3) {
            String string3 = stringArray[i3];
            int n7 = string3.length();
            if (n7 <= 0) continue;
            n7 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
            if (n7 != 0) {
                string2 = string3;
                continue;
            }
            n7 = R$string.exo_item_list;
            int n8 = 2;
            Object[] objectArray = new Object[n8];
            objectArray[0] = string2;
            objectArray[n3] = string3;
            string2 = this.a.getString(n7, objectArray);
        }
        return string2;
    }
}

