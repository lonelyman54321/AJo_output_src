/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 */
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from db3
 */
public final class db3_1
implements vf3_0 {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final cb3_0 b;
    public final Xm2 c;
    public LinkedHashMap d;
    public float e;
    public float f;

    public db3_1(List object) {
        int n3;
        float f5;
        this.e = f5 = -3.4028235E38f;
        this.f = f5;
        Object object2 = new Xm2();
        this.c = object2;
        f5 = 0.0f;
        object2 = null;
        if (object != null && (n3 = object.isEmpty()) == 0) {
            n3 = 1;
            this.a = n3;
            object2 = gz3.l((byte[])object.get(0));
            String string2 = "Format:";
            boolean bl2 = ((String)object2).startsWith(string2);
            ct3.a(bl2);
            object2 = cb3_0.a((String)object2);
            object2.getClass();
            this.b = object2;
            object = (byte[])object.get(n3);
            object2 = new Xm2((byte[])object);
            object = StandardCharsets.UTF_8;
            this.e((Xm2)object2, (Charset)object);
        } else {
            this.a = false;
            object = null;
            this.b = null;
        }
    }

    public static int d(long l2, ArrayList arrayList, ArrayList arrayList2) {
        int n3;
        block4: {
            for (n3 = arrayList.size() + -1; n3 >= 0; n3 += -1) {
                Long l3 = (Long)arrayList.get(n3);
                long l4 = l3;
                long l7 = l4 - l2;
                Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object == false) {
                    return n3;
                }
                l3 = (Long)arrayList.get(n3);
                l4 = l3;
                long l8 = l4 - l2;
                object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object >= 0) continue;
                ++n3;
                break block4;
            }
            n3 = 0;
        }
        Serializable serializable = l2;
        arrayList.add(n3, serializable);
        if (n3 == 0) {
            serializable = new ArrayList();
        } else {
            int n4 = n3 + -1;
            Collection collection = (Collection)arrayList2.get(n4);
            serializable = new ArrayList(collection);
        }
        arrayList2.add(n3, serializable);
        return n3;
    }

    public static long f(String object) {
        Object object2 = g;
        object = ((String)object).trim();
        boolean bl2 = ((Matcher)(object = ((Pattern)object2).matcher((CharSequence)object))).matches();
        if (!bl2) {
            return -9223372036854775807L;
        }
        object2 = ((Matcher)object).group(1);
        long l2 = Long.parseLong((String)object2) * 3600000000L;
        long l3 = Long.parseLong(((Matcher)object).group(2)) * 60000000L + l2;
        l2 = Long.parseLong(((Matcher)object).group(3)) * 1000000L + l3;
        return Long.parseLong(((Matcher)object).group(4)) * 10000L + l2;
    }

    public final /* synthetic */ lf3_0 a(int n3, byte[] byArray, int n4) {
        return uf3_0.a(this, byArray, n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(byte[] var1_1, int var2_2, int var3_3, Vf3$b var4_4, n60_0 var5_5) {
        var6_6 = this;
        var7_7 = var2_2;
        var8_8 = var4_4;
        var9_9 = var5_5;
        var10_10 = new ArrayList<E>();
        var11_11 = new ArrayList<E>();
        var12_12 = var2_2 + var3_3;
        var13_13 = this.c;
        var14_14 = var1_1;
        var13_13.G(var12_12, var1_1);
        var13_13.I(var2_2);
        var15_15 = var13_13.E();
        if (var15_15 == null) {
            var15_15 = StandardCharsets.UTF_8;
        }
        var12_12 = (int)var6_6.a;
        if (var12_12 == 0) {
            var6_6.e(var13_13, (Charset)var15_15);
        }
        if (var12_12 != 0) {
            var16_16 = var6_6.b;
        } else {
            var12_12 = 0;
            var16_16 = null;
        }
        while (true) {
            block82: {
                block87: {
                    block86: {
                        block85: {
                            var17_17 = var13_13.j((Charset)var15_15);
                            var18_18 = -9223372036854775807L;
                            if (var17_17 == null) break;
                            var20_19 /* !! */  = "Format:";
                            var21_20 = var17_17.startsWith((String)var20_19 /* !! */ );
                            if (var21_20 != 0) {
                                var16_16 = cb3_0.a((String)var17_17);
                                continue;
                            }
                            var20_19 /* !! */  = "Dialogue:";
                            var22_21 = var17_17.startsWith((String)var20_19 /* !! */ );
                            if (var22_21 == 0) break block85;
                            if (var16_16 != null) break block86;
                            var23_22 = "Skipping dialogue line before complete format: ";
                            var17_17 = var23_22.concat((String)var17_17);
                            Cx.f((String)var17_17);
                        }
lbl40:
                        // 3 sources

                        while (true) {
                            var24_23 = var15_15;
lbl42:
                            // 2 sources

                            while (true) {
                                var25_24 = var16_16;
                                var26_25 = var13_13;
                                break block82;
                                break;
                            }
                            break;
                        }
                    }
                    ct3.a(var17_17.startsWith((String)var20_19 /* !! */ ));
                    var21_20 = 9;
                    var20_19 /* !! */  = var17_17.substring(var21_20);
                    var27_26 = ",";
                    var28_27 = var16_16.e;
                    var20_19 /* !! */  = var20_19 /* !! */ .split((String)var27_26, var28_27);
                    var22_21 = var20_19 /* !! */ .length;
                    if (var22_21 == var28_27) break block87;
                    var14_14 = "Skipping dialogue line with fewer columns than format: ".concat((String)var17_17);
                    Cx.f((String)var14_14);
                    ** GOTO lbl40
                }
                var28_27 = var16_16.a;
                var29_28 = db3_1.f(var20_19 /* !! */ [var28_27]);
                var14_14 = "Skipping invalid timing: ";
                var22_21 = (int)(var29_28 == var18_18 ? 0 : (var29_28 < var18_18 ? -1 : 1));
                if (var22_21 == 0) {
                    var14_14 = var14_14.concat((String)var17_17);
                    Cx.f((String)var14_14);
                    ** continue;
                }
                var22_21 = var16_16.b;
                var27_26 = var20_19 /* !! */ [var22_21];
                var24_23 = var15_15;
                var31_29 = db3_1.f((String)var27_26);
                cfr_temp_0 = var31_29 - var18_18;
                var22_21 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var22_21 == 0) {
                    var15_15 = var14_14.concat((String)var17_17);
                    Cx.f((String)var15_15);
                    ** continue;
                }
                var14_14 = var6_6.d;
                var33_30 = -1;
                var34_31 = 0.0f / 0.0f;
                if (var14_14 != null && (var35_32 = var16_16.c) != var33_30) {
                    var36_33 = var20_19 /* !! */ [var35_32].trim();
                    var14_14 = (eb3_1)var14_14.get(var36_33);
                } else {
                    var28_27 = 0;
                    var14_14 = null;
                }
                var35_32 = var16_16.d;
                var36_33 = var20_19 /* !! */ [var35_32];
                var37_34 = eb3$b.a.matcher(var36_33);
                var21_20 = -1;
                var22_21 = 0;
                var27_26 = null;
                block29: while (var38_35 = var37_34.find()) {
                    block83: {
                        var25_24 = var16_16;
                        var33_30 = 1;
                        var34_31 = 1.4E-45f;
                        var16_16 = var37_34.group(var33_30);
                        var16_16.getClass();
                        var17_17 = eb3$b.a((String)var16_16);
                        if (var17_17 == null) break block83;
                        var27_26 = var17_17;
                    }
lbl104:
                    // 2 sources

                    while (true) {
                        block88: {
                            block84: {
                                var17_17 = eb3$b.d;
                                var16_16 = var17_17.matcher((CharSequence)var16_16);
                                var33_30 = (int)var16_16.find();
                                if (var33_30 == 0) break block84;
                                var33_30 = 1;
                                var34_31 = 1.4E-45f;
                                var16_16 = var16_16.group(var33_30);
                                try {
                                    var16_16.getClass();
                                    var12_12 = eb3_1.a((String)var16_16);
                                }
                                catch (RuntimeException v0) {}
lbl120:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break block88;
                            }
                            var12_12 = -1;
                            ** continue;
                            var33_30 = -1;
                            var34_31 = 0.0f / 0.0f;
                            if (var12_12 != var33_30) {
                                var21_20 = var12_12;
                            }
                        }
                        var16_16 = var25_24;
                        var33_30 = -1;
                        var34_31 = 0.0f / 0.0f;
                        continue block29;
                        break;
                    }
                }
                var25_24 = var16_16;
                var16_16 = eb3$b.a.matcher(var36_33).replaceAll("");
                var36_33 = "\n";
                var16_16 = var16_16.replace("\\N", var36_33).replace("\\n", var36_33);
                var17_17 = "\\h";
                var36_33 = "\u00a0";
                var16_16 = var16_16.replace((CharSequence)var17_17, var36_33);
                var34_31 = var6_6.e;
                var39_36 = var6_6.f;
                var37_34 = new SpannableString((CharSequence)var16_16);
                var16_16 = new Pe0$a();
                var16_16.a = var37_34;
                var40_37 = -3.4028235E38f;
                if (var14_14 != null) {
                    var6_6 = var14_14.c;
                    if (var6_6 != null) {
                        var26_25 = var13_13;
                        var41_38 = var6_6.intValue();
                        var13_13 = new ForegroundColorSpan(var41_38);
                        var41_38 = var37_34.length();
                        var42_39 = var31_29;
                        var7_7 = 33;
                        var44_40 = 4.6E-44f;
                        var45_41 = 0;
                        var9_9 = null;
                        var37_34.setSpan(var13_13, 0, var41_38, var7_7);
                    } else {
                        var42_39 = var31_29;
                        var26_25 = var13_13;
                    }
                    var41_38 = var14_14.j;
                    var7_7 = 3;
                    var44_40 = 4.2E-45f;
                    if (var41_38 == var7_7 && (var6_6 = var14_14.d) != null) {
                        var41_38 = var6_6.intValue();
                        var8_8 = new BackgroundColorSpan(var41_38);
                        var41_38 = var37_34.length();
                        var45_41 = 0;
                        var9_9 = null;
                        var46_42 = 33;
                        var37_34.setSpan(var8_8, 0, var41_38, var46_42);
                    }
                    if ((var48_44 = (cfr_temp_1 = (var47_43 = var14_14.e) - var40_37) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) != 0 && (var48_44 = (int)(var39_36 == var40_37 ? 0 : (var39_36 > var40_37 ? 1 : -1))) != 0) {
                        var16_16.k = var47_43 /= var39_36;
                        var41_38 = 1;
                        var47_43 = 1.4E-45f;
                        var16_16.j = var41_38;
                    }
                    var41_38 = (int)var14_14.g;
                    var48_44 = (int)var14_14.f;
                    if (var48_44 != 0 && var41_38 != 0) {
                        var6_6 = new StyleSpan(var7_7);
                        var7_7 = var37_34.length();
                        var45_41 = 0;
                        var9_9 = null;
                        var46_42 = 33;
                        var37_34.setSpan(var6_6, 0, var7_7, var46_42);
                    } else {
                        var45_41 = 0;
                        var9_9 = null;
                        var46_42 = 33;
                        if (var48_44 != 0) {
                            var44_40 = 1.4E-45f;
                            var6_6 = new StyleSpan(1);
                            var7_7 = var37_34.length();
                            var37_34.setSpan(var6_6, 0, var7_7, var46_42);
                        } else if (var41_38 != 0) {
                            var44_40 = 2.8E-45f;
                            var6_6 = new StyleSpan(2);
                            var7_7 = var37_34.length();
                            var37_34.setSpan(var6_6, 0, var7_7, var46_42);
                        }
                    }
                    var41_38 = (int)var14_14.h;
                    if (var41_38 != 0) {
                        var6_6 = new UnderlineSpan();
                        var7_7 = var37_34.length();
                        var37_34.setSpan(var6_6, 0, var7_7, var46_42);
                    }
                    if ((var41_38 = (int)var14_14.i) != 0) {
                        var6_6 = new StrikethroughSpan();
                        var7_7 = var37_34.length();
                        var37_34.setSpan(var6_6, 0, var7_7, var46_42);
                    }
lbl214:
                    // 4 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var42_39 = var31_29;
                var26_25 = var13_13;
                ** continue;
                var41_38 = -1;
                var47_43 = 0.0f / 0.0f;
                if (var21_20 != var41_38) {
                    var41_38 = var21_20;
                } else if (var14_14 != null) {
                    var41_38 = var14_14.b;
                }
                var15_15 = "Unknown alignment: ";
                switch (var41_38) {
                    default: {
                        CS1.a(var41_38, (String)var15_15);
                    }
                    case -1: {
                        var48_44 = 0;
                        var8_8 = null;
                        break;
                    }
                    case 3: 
                    case 6: 
                    case 9: {
                        var8_8 = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 8: {
                        var8_8 = Layout.Alignment.ALIGN_CENTER;
                        break;
                    }
                    case 1: 
                    case 4: 
                    case 7: {
                        var8_8 = Layout.Alignment.ALIGN_NORMAL;
                    }
                }
                var16_16.c = var8_8;
                var48_44 = -1 << -1;
                switch (var41_38) {
                    default: {
                        CS1.a(var41_38, (String)var15_15);
                    }
                    case -1: {
                        var45_41 = -1 << -1;
                        break;
                    }
                    case 3: 
                    case 6: 
                    case 9: {
                        var45_41 = 2;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 8: {
                        var45_41 = 1;
                        break;
                    }
                    case 1: 
                    case 4: 
                    case 7: {
                        var45_41 = 0;
                        var9_9 = null;
                    }
                }
                var16_16.i = var45_41;
                switch (var41_38) {
                    default: {
                        CS1.a(var41_38, (String)var15_15);
                        break;
                    }
                    case 7: 
                    case 8: 
                    case 9: {
                        var48_44 = 0;
                        var8_8 = null;
                        break;
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        var48_44 = 1;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        var48_44 = 2;
                    }
                    case -1: 
                }
                var16_16.g = var48_44;
                if (var27_26 != null && (var41_38 = (int)(var39_36 == var40_37 ? 0 : (var39_36 > var40_37 ? 1 : -1))) != 0 && (var41_38 = (int)(var34_31 == var40_37 ? 0 : (var34_31 > var40_37 ? 1 : -1))) != 0) {
                    var16_16.h = var47_43 = var27_26.x / var34_31;
                    var16_16.e = var47_43 = var27_26.y / var39_36;
                    var41_38 = 0;
                    var47_43 = 0.0f;
                    var6_6 = null;
                    var16_16.f = 0;
                } else {
                    var41_38 = var16_16.i;
                    var7_7 = 1028443341;
                    var44_40 = 0.05f;
                    var45_41 = 0x3F000000;
                    var46_42 = 0x3F733333;
                    if (var41_38 != 0) {
                        var28_27 = 1;
                        if (var41_38 != var28_27) {
                            var33_30 = 2;
                            var34_31 = 2.8E-45f;
                            if (var41_38 != var33_30) {
                                var41_38 = -8388609;
                                var47_43 = -3.4028235E38f;
                            } else {
                                var41_38 = 0x3F733333;
                                var47_43 = 0.95f;
                            }
                        } else {
                            var33_30 = 2;
                            var34_31 = 2.8E-45f;
                            var41_38 = 0x3F000000;
                            var47_43 = 0.5f;
                        }
                    } else {
                        var28_27 = 1;
                        var33_30 = 2;
                        var34_31 = 2.8E-45f;
                        var41_38 = 1028443341;
                        var47_43 = 0.05f;
                    }
                    var16_16.h = var47_43;
                    if (var48_44 != 0) {
                        if (var48_44 != var28_27) {
                            if (var48_44 != var33_30) {
                                var7_7 = -8388609;
                                var44_40 = -3.4028235E38f;
                            } else {
                                var7_7 = 0x3F733333;
                                var44_40 = 0.95f;
                            }
                        } else {
                            var7_7 = 0x3F000000;
                            var44_40 = 0.5f;
                        }
                    }
                    var16_16.e = var44_40;
                    var41_38 = 0;
                    var47_43 = 0.0f;
                    var6_6 = null;
                    var16_16.f = 0;
                }
                var6_6 = var16_16.a();
                var49_45 = var42_39;
                var48_44 = db3_1.d(var42_39, var11_11, var10_10);
                for (var7_7 = db3_1.d(var29_28, var11_11, var10_10); var7_7 < var48_44; ++var7_7) {
                    var9_9 = (List)var10_10.get(var7_7);
                    var9_9.add(var6_6);
                }
            }
            var6_6 = this;
            var8_8 = var4_4;
            var9_9 = var5_5;
            var15_15 = var24_23;
            var16_16 = var25_24;
            var13_13 = var26_25;
        }
        var15_15 = var8_8;
        var41_38 = 0;
        var47_43 = 0.0f;
        var6_6 = null;
        var49_45 = var8_8.a;
        cfr_temp_2 = var49_45 - var18_18;
        var12_12 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
        if (var12_12 != 0 && (var7_7 = (int)var8_8.b) != 0) {
            var14_14 = new ArrayList;
            var14_14();
        } else {
            var28_27 = 0;
            var14_14 = null;
        }
        for (var51_46 = 0; var51_46 < (var41_38 = var10_10.size()); ++var51_46) {
            var27_26 = var6_6 = var10_10.get(var51_46);
            var27_26 = (List)var6_6;
            var41_38 = (int)var27_26.isEmpty();
            if (var41_38 != 0 && var51_46 != 0) {
                var16_16 = var5_5;
                var7_7 = 1;
                var44_40 = 1.4E-45f;
                continue;
            }
            var41_38 = var10_10.size();
            var7_7 = 1;
            var44_40 = 1.4E-45f;
            if (var51_46 != (var41_38 -= var7_7)) {
                var52_47 = (Long)var11_11.get(var51_46);
                var41_38 = var51_46 + 1;
                var54_48 = (Long)var11_11.get(var41_38);
                var6_6 = (Long)var11_11.get(var51_46);
                var56_49 = var6_6.longValue();
                var58_50 = var54_48 - var56_49;
                var41_38 = (int)(var49_45 == var18_18 ? 0 : (var49_45 < var18_18 ? -1 : 1));
                if (var41_38 != 0 && (var41_38 = (int)(var52_47 == var49_45 ? 0 : (var52_47 < var49_45 ? -1 : 1))) < 0) {
                    if (var14_14 != null) {
                        var20_19 /* !! */  = var6_6;
                        var6_6 = new We0((List)var27_26, var52_47, var58_50);
                        var14_14.add(var6_6);
                    }
                    var16_16 = var5_5;
                    continue;
                }
                var20_19 /* !! */  = var6_6;
                var6_6 = new We0((List)var27_26, var52_47, var58_50);
                var16_16 = var5_5;
                var5_5.accept(var6_6);
                continue;
            }
            var6_6 = new IllegalStateException();
            throw var6_6;
        }
        var16_16 = var5_5;
        if (var14_14 != null) {
            var6_6 = var14_14.iterator();
            while ((var7_7 = (int)var6_6.hasNext()) != 0) {
                var15_15 = (We0)var6_6.next();
                var16_16.accept(var15_15);
            }
        }
        return;
        catch (RuntimeException v1) {
            ** continue;
        }
    }

    public final int c() {
        return 1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(Xm2 var1_1, Charset var2_2) {
        var3_3 = this;
        var4_4 = 6;
        var5_5 = 3;
        var6_6 = 7;
        var7_7 = -1;
        var8_8 = 2;
        var9_9 = 2.8E-45f;
        var10_10 = null;
        var11_11 = 1;
        block33: while ((var12_12 = var1_1.j(var2_2)) != null) {
            block65: {
                block63: {
                    block64: {
                        var13_15 = "[Script Info]";
                        var14_16 = var13_15.equalsIgnoreCase((String)var12_12);
                        var15_17 = 91;
                        if (var14_16 != 0) break block63;
                        var13_15 = "[V4+ Styles]";
                        var14_16 = var13_15.equalsIgnoreCase((String)var12_12);
                        if (var14_16 == 0) break block64;
                        var13_15 = new LinkedHashMap();
                        var17_19 = false;
                        var16_18 = null;
                        var19_21 = 0;
                        var20_22 = null;
                        break block65;
                    }
                    var38_40 = "[V4 Styles]";
                    var4_4 = (int)var38_40.equalsIgnoreCase((String)var12_12);
                    if (var4_4 != 0) {
                        var12_12 = "[V4 Styles] are not supported";
                        Cx.e((String)var12_12);
                    } else {
                        var38_40 = "[Events]";
                        var22_24 = var38_40.equalsIgnoreCase((String)var12_12);
                        if (var22_24 != 0) {
                            return;
                        }
                    }
                    ** GOTO lbl245
                }
                while ((var12_12 = var1_1.j(var2_2)) != null && ((var14_16 = var1_1.a()) == 0 || (var14_16 = (int)var1_1.e(var2_2)) != var15_17)) {
                    var13_15 = ":";
                    var14_16 = ((String[])(var12_12 = var12_12.split((String)var13_15))).length;
                    if (var14_16 != var8_8) continue;
                    var13_15 = Ascii.toLowerCase(var12_12[0].trim());
                    var13_15.getClass();
                    var16_18 = "playresx";
                    var17_19 = var13_15.equals(var16_18);
                    if (var17_19) ** GOTO lbl-1000
                    var16_18 = "playresy";
                    var14_16 = (int)var13_15.equals(var16_18);
                    if (var14_16 == 0) continue;
                    try {
                        var12_12 = var12_12[var11_11];
                        var12_12 = var12_12.trim();
                        var3_3.f = var18_20 = Float.parseFloat((String)var12_12);
                    }
                    catch (NumberFormatException v0) {}
                    continue;
lbl-1000:
                    // 1 sources

                    {
                        var12_12 = var12_12[var11_11];
                        var12_12 = var12_12.trim();
                        var3_3.e = var18_20 = Float.parseFloat((String)var12_12);
                    }
                }
                continue;
            }
            while (true) {
                block68: {
                    block66: {
                        block69: {
                            block73: {
                                block72: {
                                    block61: {
                                        block60: {
                                            block59: {
                                                block71: {
                                                    block70: {
                                                        block67: {
                                                            if ((var21_23 = var1_1.j(var2_2)) == null || (var22_24 = var1_1.a()) != 0 && (var22_24 = (int)var1_1.e(var2_2)) == var15_17) break block66;
                                                            var12_12 = "Format:";
                                                            var22_24 = (int)var21_23.startsWith((String)var12_12);
                                                            var23_25 = ",";
                                                            if (var22_24 == 0) break block67;
                                                            var12_12 = TextUtils.split((String)var21_23.substring(var6_6), (String)var23_25);
                                                            var20_22 = null;
                                                            var24_26 = -1;
                                                            var25_27 = -1;
                                                            var26_28 = -1;
                                                            var27_29 = -1;
                                                            var28_30 = -1;
                                                            var29_31 = -1;
                                                            var30_32 = -1;
                                                            var31_33 = -1;
                                                            var32_34 = -1;
                                                            var33_35 = -1;
                                                            break block68;
                                                        }
                                                        var12_12 = "Style:";
                                                        var6_6 = (int)var21_23.startsWith((String)var12_12);
                                                        if (var6_6 == 0) break block69;
                                                        if (var20_22 != null) break block70;
                                                        var12_12 = "Skipping 'Style:' line before 'Format:' line: ".concat((String)var21_23);
                                                        Cx.f((String)var12_12);
                                                        break block69;
                                                    }
                                                    ct3.a(var21_23.startsWith((String)var12_12));
                                                    var12_12 = var21_23.substring(var4_4);
                                                    var36_38 = TextUtils.split((String)var12_12, (String)var23_25);
                                                    var22_24 = ((String[])var36_38).length;
                                                    var24_26 = var20_22.k;
                                                    var37_39 = "'";
                                                    if (var22_24 == var24_26) break block71;
                                                    var22_24 = ((String[])var36_38).length;
                                                    var6_6 = gz3.a;
                                                    var36_38 = Locale.US;
                                                    var36_38 = "Skipping malformed 'Style:' line (expected ";
                                                    var38_40 = " values, found ";
                                                    var39_41 = "): '";
                                                    var12_12 = fQ2.a((String)var36_38, (String)var38_40, (String)var39_41, var24_26, var22_24);
                                                    var12_12.append((String)var21_23);
                                                    var12_12.append(var37_39);
                                                    var12_12 = var12_12.toString();
                                                    Cx.f((String)var12_12);
                                                    break block72;
                                                }
                                                try {
                                                    var22_24 = var20_22.a;
                                                    var12_12 = var36_38[var22_24];
                                                    var40_42 = var12_12.trim();
                                                    var22_24 = var20_22.b;
                                                    if (var22_24 == var7_7) break block59;
                                                    var12_12 = var36_38[var22_24];
                                                    var12_12 = var12_12.trim();
                                                    var41_43 = var22_24 = eb3_1.a((String)var12_12);
                                                    break block60;
                                                }
                                                catch (RuntimeException var12_13) {
                                                    break block61;
                                                }
                                            }
                                            var41_43 = -1;
                                        }
                                        var22_24 = var20_22.c;
                                        if (var22_24 != var7_7) {
                                            var12_12 = var36_38[var22_24];
                                            var12_12 = var12_12.trim();
                                            var42_44 = var12_12 = eb3_1.c((String)var12_12);
                                        } else {
                                            var42_44 = null;
                                        }
                                        var22_24 = var20_22.d;
                                        if (var22_24 != var7_7) {
                                            var12_12 = var36_38[var22_24];
                                            var12_12 = var12_12.trim();
                                            var43_45 = var12_12 = eb3_1.c((String)var12_12);
                                        } else {
                                            var43_45 = null;
                                        }
                                        var22_24 = var20_22.e;
                                        if (var22_24 != var7_7) {
                                            var12_12 = var36_38[var22_24];
                                            var23_25 = var12_12.trim();
                                            try {
                                                var9_9 = Float.parseFloat(var23_25);
                                            }
                                            catch (NumberFormatException var12_14) {
                                                var39_41 = var12_14;
                                                var10_10 = "Failed to parse font size: '";
                                                var12_12 = new StringBuilder(var10_10);
                                                var12_12.append(var23_25);
                                                var12_12.append(var37_39);
                                                var12_12 = var12_12.toString();
                                                Cx.g((String)var12_12, (Throwable)var39_41);
                                                var8_8 = -8388609;
                                                var9_9 = -3.4028235E38f;
                                            }
                                            var44_46 = var9_9;
                                        } else {
                                            var44_46 = -3.4028235E38f;
                                        }
                                        var22_24 = var20_22.f;
                                        if (var22_24 == var7_7) ** GOTO lbl-1000
                                        var12_12 = var36_38[var22_24];
                                        var22_24 = (int)eb3_1.b((String)(var12_12 = var12_12.trim()));
                                        if (var22_24 != 0) {
                                            var45_47 = true;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var45_47 = false;
                                        }
                                        var22_24 = var20_22.g;
                                        if (var22_24 == var7_7) ** GOTO lbl-1000
                                        var12_12 = var36_38[var22_24];
                                        var22_24 = (int)eb3_1.b((String)(var12_12 = var12_12.trim()));
                                        if (var22_24 != 0) {
                                            var46_48 = true;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var46_48 = false;
                                        }
                                        var22_24 = var20_22.h;
                                        if (var22_24 == var7_7) ** GOTO lbl-1000
                                        var12_12 = var36_38[var22_24];
                                        var22_24 = (int)eb3_1.b((String)(var12_12 = var12_12.trim()));
                                        if (var22_24 != 0) {
                                            var47_49 = true;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var47_49 = false;
                                        }
                                        var22_24 = var20_22.i;
                                        if (var22_24 == var7_7) ** GOTO lbl-1000
                                        var12_12 = var36_38[var22_24];
                                        var22_24 = (int)eb3_1.b((String)(var12_12 = var12_12.trim()));
                                        if (var22_24 != 0) {
                                            var48_50 = true;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var48_50 = false;
                                        }
                                        var22_24 = var20_22.j;
                                        if (var22_24 != var7_7) {
                                            block62: {
                                                var12_12 = var36_38[var22_24];
                                                var12_12 = var12_12.trim();
                                                try {
                                                    var36_38 = var12_12.trim();
                                                    var6_6 = Integer.parseInt((String)var36_38);
                                                    if (var6_6 == var11_11 || var6_6 == var5_5) break block62;
                                                }
                                                catch (NumberFormatException v1) {}
                                                var39_41 = "Ignoring unknown BorderStyle: ";
                                                var36_38 = new StringBuilder((String)var39_41);
                                                var36_38.append((String)var12_12);
                                                var12_12 = var36_38.toString();
                                                Cx.f((String)var12_12);
                                                var6_6 = -1;
                                            }
                                            var49_51 = var6_6;
                                        } else {
                                            var49_51 = -1;
                                        }
                                        var38_40 = new eb3_1(var40_42, var41_43, (Integer)var42_44, (Integer)var43_45, var44_46, var45_47, var46_48, var47_49, var48_50, var49_51);
                                        break block73;
                                    }
                                    var36_38 = "Skipping malformed 'Style:' line: '";
                                    var38_40 = new StringBuilder((String)var36_38);
                                    var38_40.append((String)var21_23);
                                    var38_40.append(var37_39);
                                    var38_40 = var38_40.toString();
                                    Cx.g((String)var38_40, var12_13);
                                }
                                var4_4 = 0;
                                var38_40 = null;
                            }
                            if (var38_40 != null) {
                                var12_12 = var38_40.a;
                                var13_15.put(var12_12, var38_40);
                            }
                        }
                        var4_4 = 6;
                        var6_6 = 7;
                        var8_8 = 2;
                        var9_9 = 2.8E-45f;
                        var10_10 = null;
                        continue;
                    }
                    var3_3.d = var13_15;
lbl245:
                    // 3 sources

                    var4_4 = 6;
                    var6_6 = 7;
                    var8_8 = 2;
                    var9_9 = 2.8E-45f;
                    var10_10 = null;
                    continue block33;
                }
                for (var19_21 = 0; var19_21 < (var34_36 = ((Object)var12_12).length); var19_21 += var11_11) {
                    block74: {
                        block75: {
                            var21_23 = Ascii.toLowerCase(var12_12[var19_21].trim());
                            var21_23.getClass();
                            var35_37 = var21_23.hashCode();
                            switch (var35_37) {
                                case 1988365454: {
                                    var36_38 = "outlinecolour";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 9;
                                    break block74;
                                }
                                case 1767875043: {
                                    var36_38 = "alignment";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 8;
                                    break block74;
                                }
                                case 767321349: {
                                    var36_38 = "borderstyle";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 7;
                                    break block74;
                                }
                                case 366554320: {
                                    var36_38 = "fontsize";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 6;
                                    break block74;
                                }
                                case 3373707: {
                                    var36_38 = "name";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 5;
                                    break block74;
                                }
                                case 3029637: {
                                    var36_38 = "bold";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 4;
                                    break block74;
                                }
                                case -70925746: {
                                    var36_38 = "primarycolour";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 3;
                                    break block74;
                                }
                                case -192095652: {
                                    var36_38 = "strikeout";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 2;
                                    break block74;
                                }
                                case -1026963764: {
                                    var36_38 = "underline";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 == 0) break;
                                    var6_6 = 1;
                                    break block74;
                                }
                                case -1178781136: {
                                    var36_38 = "italic";
                                    var6_6 = (int)var21_23.equals(var36_38);
                                    if (var6_6 != 0) break block75;
                                }
                            }
                            var6_6 = -1;
                            break block74;
                        }
                        var6_6 = 0;
                        var36_38 = null;
                    }
                    switch (var6_6) {
                        default: {
                            break;
                        }
                        case 9: {
                            var27_29 = var19_21;
                            break;
                        }
                        case 8: {
                            var25_27 = var19_21;
                            break;
                        }
                        case 7: {
                            var33_35 = var19_21;
                            break;
                        }
                        case 6: {
                            var28_30 = var19_21;
                            break;
                        }
                        case 5: {
                            var24_26 = var19_21;
                            break;
                        }
                        case 4: {
                            var29_31 = var19_21;
                            break;
                        }
                        case 3: {
                            var26_28 = var19_21;
                            break;
                        }
                        case 2: {
                            var32_34 = var19_21;
                            break;
                        }
                        case 1: {
                            var31_33 = var19_21;
                            break;
                        }
                        case 0: {
                            var30_32 = var19_21;
                        }
                    }
                    var6_6 = 7;
                }
                if (var24_26 != var7_7) {
                    var22_24 = ((Object)var12_12).length;
                    var21_23 = var36_38;
                    var35_37 = var22_24;
                    var20_22 = var36_38 = new eb3$a(var24_26, var25_27, var26_28, var27_29, var28_30, var29_31, var30_32, var31_33, var32_34, var33_35, var22_24);
                } else {
                    var19_21 = 0;
                    var20_22 = null;
                }
                var6_6 = 7;
            }
        }
    }

    public final /* synthetic */ void reset() {
    }
}

