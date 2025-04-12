/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class Ob1$a {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final ArrayList f;
    public ArrayList g;
    public String h;

    public Ob1$a() {
        ArrayList<String> arrayList;
        String string2;
        this.b = string2 = "";
        this.c = string2;
        this.e = -1;
        this.f = arrayList = new ArrayList<String>();
        arrayList.add(string2);
    }

    public final void a(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "name");
        Object object2 = this.g;
        if (object2 == null) {
            object2 = new ArrayList();
            this.g = object2;
        }
        object2 = this.g;
        Intrinsics.checkNotNull(object2);
        int n3 = 0;
        String string3 = null;
        String string4 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
        boolean bl2 = false;
        boolean bl3 = true;
        int n4 = 219;
        object = Ob1$b.a((String)object, 0, 0, string4, false, false, bl3, false, null, n4);
        object2.add(object);
        object = this.g;
        Intrinsics.checkNotNull(object);
        if (string2 != null) {
            bl3 = false;
            string3 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
            string4 = null;
            bl2 = true;
            n3 = 219;
            object2 = string2;
            string2 = Ob1$b.a(string2, 0, 0, string3, false, false, bl2, false, null, n3);
        } else {
            string2 = null;
        }
        object.add(string2);
    }

    public final ob1_1 b() {
        String string2 = this.a;
        if (string2 != null) {
            Object object = this.b;
            String string3 = null;
            int n3 = 7;
            String string4 = Ob1$b.c((String)object, 0, 0, false, n3);
            object = this.c;
            String string5 = Ob1$b.c((String)object, 0, 0, false, n3);
            Object object2 = this.d;
            if (object2 != null) {
                ob1_1 ob1_12;
                String string6;
                ArrayList<String> arrayList;
                Object object3;
                int n4 = this.c();
                object = this.f;
                int n7 = 10;
                int n8 = yx_2.o((Iterable)object, n7);
                Object object4 = new ArrayList(n8);
                object = ((ArrayList)object).iterator();
                while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object3 = Ob1$b.c((String)object.next(), 0, 0, false, n3);
                    ((ArrayList)object4).add(object3);
                }
                object = this.g;
                n8 = 0;
                object3 = null;
                if (object != null) {
                    n7 = yx_2.o((Iterable)object, n7);
                    arrayList = new ArrayList<String>(n7);
                    object = object.iterator();
                    while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        string6 = (String)object.next();
                        if (string6 != null) {
                            int n10 = 3;
                            boolean bl2 = true;
                            string6 = Ob1$b.c(string6, 0, 0, bl2, n10);
                        } else {
                            n7 = 0;
                            string6 = null;
                        }
                        arrayList.add(string6);
                    }
                } else {
                    arrayList = null;
                }
                if ((object = this.h) != null) {
                    object3 = object = Ob1$b.c(object, 0, 0, false, n3);
                }
                string6 = this.toString();
                object = ob1_12;
                string3 = string4;
                string4 = object2;
                object2 = object4;
                object4 = object3;
                ob1_12 = new ob1_1(string2, string3, string5, string4, n4, (ArrayList)object2, arrayList, (String)object3, string6);
                return ob1_12;
            }
            object = new IllegalStateException("host == null");
            throw object;
        }
        IllegalStateException illegalStateException = new IllegalStateException("scheme == null");
        throw illegalStateException;
    }

    public final int c() {
        int n3 = this.e;
        int n4 = -1;
        if (n3 == n4) {
            String string2 = this.a;
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNullParameter(string2, "scheme");
            String string3 = "http";
            boolean bl2 = Intrinsics.areEqual(string2, string3);
            n3 = bl2 ? 80 : ((n3 = (int)(Intrinsics.areEqual(string2, string3 = "https") ? 1 : 0)) != 0 ? 443 : -1);
        }
        return n3;
    }

    public final void d(String arrayList) {
        int n3;
        boolean bl2;
        boolean bl3;
        String string2;
        arrayList = arrayList != null && (arrayList = Ob1$b.a((String)((Object)arrayList), 0, 0, string2 = " \"'<>#", bl3 = true, false, bl2 = true, false, null, n3 = 211)) != null ? Ob1$b.d((String)((Object)arrayList)) : null;
        this.g = arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void e(ob1_1 var1_1, String var2_2) {
        block46: {
            block49: {
                block41: {
                    block48: {
                        block40: {
                            block39: {
                                block47: {
                                    block44: {
                                        block42: {
                                            block45: {
                                                block43: {
                                                    block38: {
                                                        var3_3 = this;
                                                        var4_4 = var1_1;
                                                        var5_5 = var2_2;
                                                        var6_6 = 6;
                                                        var7_7 = 1;
                                                        Intrinsics.checkNotNullParameter(var2_2, "input");
                                                        var8_8 /* !! */  = ez3.a;
                                                        var9_9 = var2_2.length();
                                                        var10_10 = 0;
                                                        var9_9 = ez3.n(0, var9_9, var2_2);
                                                        var11_11 = var2_2.length();
                                                        var12_12 = ez3.o(var9_9, var11_11, var2_2);
                                                        var11_11 = var12_12 - var9_9;
                                                        var13_13 = -1;
                                                        var14_14 = 91;
                                                        var15_15 = 2;
                                                        var16_16 = 58;
                                                        if (var11_11 < var15_15) lbl-1000:
                                                        // 4 sources

                                                        {
                                                            while (true) {
                                                                var11_11 = -1;
                                                                break block38;
                                                                break;
                                                            }
                                                        }
                                                        var11_11 = var2_2.charAt(var9_9);
                                                        var17_17 = 97;
                                                        var18_18 = Intrinsics.compare(var11_11, var17_17);
                                                        var19_19 = 65;
                                                        if (!(var18_18 >= 0 && (var18_18 = Intrinsics.compare(var11_11, 122)) <= 0 || (var18_18 = Intrinsics.compare(var11_11, var19_19)) >= 0 && (var11_11 = Intrinsics.compare(var11_11, var18_18 = 90)) <= 0)) ** GOTO lbl-1000
                                                        var11_11 = var9_9 + 1;
                                                        while (true) {
                                                            if (var11_11 >= var12_12) ** GOTO lbl-1000
                                                            var18_18 = var5_5.charAt(var11_11);
                                                            if (!(var17_17 <= var18_18 && var18_18 < (var17_17 = 123) || var19_19 <= var18_18 && var18_18 < var14_14 || (var17_17 = 48) <= var18_18 && var18_18 < var16_16 || var18_18 == (var17_17 = 43) || var18_18 == (var17_17 = 45)) && var18_18 != (var17_17 = 46)) break;
                                                            var11_11 += var7_7;
                                                            var17_17 = 97;
                                                        }
                                                        if (var18_18 == var16_16) ** break;
                                                        ** while (true)
                                                    }
                                                    var20_20 = "http";
                                                    var21_21 = "https";
                                                    var22_22 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                                                    if (var11_11 == var13_13) break block42;
                                                    var23_23 = "https:";
                                                    var14_14 = (int)kotlin.text.b.r(var9_9, var5_5, (String)var23_23, (boolean)var7_7);
                                                    if (var14_14 == 0) break block43;
                                                    var3_3.a = var21_21;
                                                    var9_9 += var6_6;
                                                    break block44;
                                                }
                                                var24_24 = "http:";
                                                var6_6 = (int)kotlin.text.b.r(var9_9, var5_5, (String)var24_24, (boolean)var7_7);
                                                if (var6_6 == 0) break block45;
                                                var3_3.a = var20_20;
                                                var9_9 += 5;
                                                break block44;
                                            }
                                            var24_24 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                                            var8_8 /* !! */  = (byte[])var5_5.substring(0, var11_11);
                                            Intrinsics.checkNotNullExpressionValue(var8_8 /* !! */ , var22_22);
                                            var24_24.append((String)var8_8 /* !! */ );
                                            var24_24.append('\'');
                                            var24_24 = var24_24.toString();
                                            var4_4 = new IllegalArgumentException((String)var24_24);
                                            throw var4_4;
                                        }
                                        if (var4_4 == null) break block46;
                                        var24_24 = var4_4.a;
                                        var3_3.a = var24_24;
                                    }
                                    var6_6 = var9_9;
                                    var11_11 = 0;
                                    var25_26 = null;
                                    while (true) {
                                        var14_14 = 47;
                                        var10_10 = 92;
                                        if (var6_6 >= var12_12 || (var16_16 = (int)var5_5.charAt(var6_6)) != var10_10 && var16_16 != var14_14) break;
                                        var11_11 += var7_7;
                                        var6_6 += var7_7;
                                        var16_16 = 58;
                                        var10_10 = 0;
                                    }
                                    var26_27 = var3_3.f;
                                    var7_7 = 35;
                                    if (var11_11 >= var15_15 || var4_4 == null || (var6_6 = (int)Intrinsics.areEqual(var24_24 = var4_4.a, var27_28 = var3_3.a)) == 0) break block47;
                                    var24_24 = var1_1.e();
                                    var3_3.b = var24_24;
                                    var24_24 = var1_1.a();
                                    var3_3.c = var24_24;
                                    var24_24 = var4_4.d;
                                    var3_3.d = var24_24;
                                    var3_3.e = var6_6 = var4_4.e;
                                    var26_27.clear();
                                    var24_24 = var1_1.c();
                                    var26_27.addAll(var24_24);
                                    if (var9_9 == var12_12 || (var6_6 = (int)var5_5.charAt(var9_9)) == var7_7) {
                                        var4_4 = var1_1.d();
                                        var3_3.d((String)var4_4);
                                    }
                                    var1_1 = var26_27;
                                    var28_29 = var12_12;
                                    var12_12 = 0;
                                    var29_30 = null;
                                    break block48;
                                }
                                var15_15 = var9_9 += var11_11;
                                var30_31 = 0;
                                var31_32 = false;
                                while ((var32_33 = (var11_11 = ez3.e(var15_15, var12_12, var5_5, (String)(var4_4 = "@/\\?#"))) != var12_12 ? (int)var5_5.charAt(var11_11) : -1) != var13_13 && var32_33 != var7_7 && var32_33 != var14_14 && var32_33 != var10_10 && var32_33 != (var6_6 = 63)) {
                                    var9_9 = 64;
                                    if (var32_33 != var9_9) continue;
                                    var8_8 /* !! */  = (byte[])"%40";
                                    if (var30_31 == 0) {
                                        var32_33 = 58;
                                        var7_7 = ez3.f(var5_5, (char)var32_33, var15_15, var11_11);
                                        var33_35 = " \"':;<=>@[]^`{}|/\\?#";
                                        var34_36 = 1;
                                        var35_37 = 240;
                                        var4_4 = var2_2;
                                        var6_6 = var15_15;
                                        var27_28 = var8_8 /* !! */ ;
                                        var9_9 = var7_7;
                                        var10_10 = var11_11;
                                        var25_26 = var33_35;
                                        var36_38 /* !! */  = var8_8 /* !! */ ;
                                        var15_15 = var34_36;
                                        var37_39 = var22_22;
                                        var17_17 = 0;
                                        var22_22 = null;
                                        var38_40 = var21_21;
                                        var18_18 = 0;
                                        var21_21 = null;
                                        var39_41 = var20_20;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        var1_1 = var26_27;
                                        var16_16 = 0;
                                        var26_27 = null;
                                        var28_29 = var12_12;
                                        var12_12 = 91;
                                        var14_14 = var35_37;
                                        var4_4 = Ob1$b.a(var2_2, var6_6, var7_7, var33_35, (boolean)var34_36, false, false, false, null, var35_37);
                                        if (var31_32) {
                                            var24_24 = new StringBuilder();
                                            var8_8 /* !! */  = (byte[])var3_3.b;
                                            var4_4 = BW0.b((StringBuilder)var24_24, (String)var8_8 /* !! */ , (String)var27_28, (String)var4_4);
                                        }
                                        var3_3.b = var4_4;
                                        if (var7_7 != var10_10) {
                                            var32_33 = 1;
                                            var6_6 = var7_7 + 1;
                                            var19_19 = 0;
                                            var20_20 = null;
                                            var16_16 = 0;
                                            var26_27 = null;
                                            var25_26 = " \"':;<=>@[]^`{}|/\\?#";
                                            var15_15 = 1;
                                            var17_17 = 0;
                                            var22_22 = null;
                                            var18_18 = 0;
                                            var21_21 = null;
                                            var14_14 = 240;
                                            var4_4 = var2_2;
                                            var9_9 = var10_10;
                                            var3_3.c = var4_4 = Ob1$b.a(var2_2, var6_6, var10_10, var25_26, (boolean)var15_15, false, false, false, null, var14_14);
                                            var30_31 = 1;
                                        }
                                        var32_33 = 1;
                                        var31_32 = true;
                                    } else {
                                        var36_38 /* !! */  = var8_8 /* !! */ ;
                                        var10_10 = var11_11;
                                        var37_39 = var22_22;
                                        var38_40 = var21_21;
                                        var39_41 = var20_20;
                                        var1_1 = var26_27;
                                        var28_29 = var12_12;
                                        var12_12 = 91;
                                        var40_42 = new StringBuilder();
                                        var4_4 = var3_3.c;
                                        var40_42.append((String)var4_4);
                                        var40_42.append((String)var8_8 /* !! */ );
                                        var19_19 = 0;
                                        var20_20 = null;
                                        var16_16 = 0;
                                        var26_27 = null;
                                        var25_26 = " \"':;<=>@[]^`{}|/\\?#";
                                        var23_23 = null;
                                        var13_13 = 240;
                                        var4_4 = var2_2;
                                        var6_6 = var15_15;
                                        var9_9 = var11_11;
                                        var15_15 = 1;
                                        var17_17 = 0;
                                        var22_22 = null;
                                        var18_18 = 0;
                                        var21_21 = null;
                                        var14_14 = var13_13;
                                        var4_4 = Ob1$b.a(var2_2, var6_6, var11_11, var25_26, (boolean)var15_15, false, false, false, null, var13_13);
                                        var40_42.append((String)var4_4);
                                        var3_3.c = var4_4 = var40_42.toString();
                                        var32_33 = 1;
                                    }
                                    var15_15 = var10_10 + 1;
                                    var26_27 = var1_1;
                                    var12_12 = var28_29;
                                    var22_22 = var37_39;
                                    var21_21 = var38_40;
                                    var20_20 = var39_41;
                                    var14_14 = 47;
                                    var7_7 = 35;
                                    var10_10 = 92;
                                    var13_13 = -1;
                                }
                                var10_10 = var11_11;
                                var37_39 = var22_22;
                                var38_40 = var21_21;
                                var39_41 = var20_20;
                                var1_1 = var26_27;
                                var28_29 = var12_12;
                                var12_12 = 91;
                                for (var11_11 = var15_15; var11_11 < var10_10; var11_11 += var32_33) {
                                    var32_33 = var5_5.charAt(var11_11);
                                    if (var32_33 == var12_12) {
                                        while ((var11_11 += (var32_33 = 1)) < var10_10 && (var32_33 = (int)var5_5.charAt(var11_11)) != (var6_6 = 93)) {
                                        }
                                        var32_33 = 1;
                                        var6_6 = 58;
                                        continue;
                                    }
                                    var6_6 = 58;
                                    if (var32_33 == var6_6) {
                                        var7_7 = var11_11;
                                        var32_33 = 1;
                                        break block39;
                                    }
                                    var32_33 = 1;
                                }
                                var32_33 = 1;
                                var7_7 = var10_10;
                            }
                            var12_12 = var7_7 + 1;
                            var32_33 = 4;
                            var13_13 = 34;
                            if (var12_12 >= var10_10) ** GOTO lbl293
                            var24_24 = null;
                            var3_3.d = var4_4 = w91_0.b(Ob1$b.c(var5_5, var15_15, var7_7, false, var32_33));
                            var25_26 = "";
                            var14_14 = 248;
                            var41_43 = false;
                            var4_4 = var2_2;
                            var6_6 = var12_12;
                            var9_9 = var10_10;
                            var42_44 = var15_15;
                            var15_15 = 0;
                            var27_28 = null;
                            var17_17 = 0;
                            var22_22 = null;
                            var18_18 = 0;
                            var21_21 = null;
                            var19_19 = 0;
                            var20_20 = null;
                            var16_16 = 0;
                            var26_27 = null;
                            try {
                                var4_4 = Ob1$b.a(var2_2, var12_12, var10_10, var25_26, false, false, false, false, null, var14_14);
                            }
                            catch (NumberFormatException v0) {}
                            var32_33 = Integer.parseInt((String)var4_4);
                            var6_6 = 1;
                            if (var6_6 > var32_33 || var32_33 >= (var6_6 = 65536)) break block40;
                        }
                        var32_33 = -1;
                        var3_3.e = var32_33;
                        var6_6 = -1;
                        if (var32_33 != var6_6) {
                            var8_8 /* !! */  = (byte[])var37_39;
                            var15_15 = var42_44;
                            var12_12 = 0;
                            var29_30 = null;
                        } else {
                            var4_4 = new StringBuilder("Invalid URL port: \"");
                            var24_24 = var5_5.substring(var12_12, var10_10);
                            var8_8 /* !! */  = (byte[])var37_39;
                            Intrinsics.checkNotNullExpressionValue(var24_24, var37_39);
                            var4_4.append((String)var24_24);
                            var4_4.append((char)var13_13);
                            var4_4 = var4_4.toString();
                            var4_4 = var4_4.toString();
                            var24_24 = new IllegalArgumentException((String)var4_4);
                            throw var24_24;
lbl293:
                            // 1 sources

                            var8_8 /* !! */  = (byte[])var37_39;
                            var6_6 = -1;
                            var12_12 = 0;
                            var29_30 = null;
                            var3_3.d = var4_4 = w91_0.b(Ob1$b.c(var5_5, var15_15, var7_7, false, var32_33));
                            var4_4 = var3_3.a;
                            Intrinsics.checkNotNull(var4_4);
                            Intrinsics.checkNotNullParameter(var4_4, "scheme");
                            var25_26 = var39_41;
                            var11_11 = (int)Intrinsics.areEqual(var4_4, var39_41);
                            if (var11_11 != 0) {
                                var32_33 = 80;
                            } else {
                                var25_26 = var38_40;
                                var32_33 = (int)Intrinsics.areEqual(var4_4, var38_40);
                                var32_33 = var32_33 != 0 ? 443 : -1;
                            }
                            var3_3.e = var32_33;
                        }
                        var4_4 = var3_3.d;
                        if (var4_4 == null) break block49;
                        var9_9 = var10_10;
                    }
                    var4_4 = "?#";
                    var7_7 = var28_29;
                    var10_10 = ez3.e(var9_9, var28_29, var5_5, (String)var4_4);
                    if (var9_9 == var10_10) {
                        while (true) {
                            break block41;
                            break;
                        }
                    }
                    var32_33 = var5_5.charAt(var9_9);
                    var36_38 /* !! */  = (byte[])"";
                    var6_6 = 47;
                    if (var32_33 != var6_6 && var32_33 != (var6_6 = 92)) {
                        var32_33 = var1_1.size();
                        var6_6 = 1;
                        var23_23 = var1_1;
                        var1_1.set(var32_33 -= var6_6, var36_38 /* !! */ );
                    } else {
                        var23_23 = var1_1;
                        var6_6 = 1;
                        var1_1.clear();
                        var1_1.add(var36_38 /* !! */ );
                        var9_9 += var6_6;
                    }
                    var6_6 = var9_9;
                    block10: while (true) {
                        if (var6_6 >= var10_10) ** continue;
                        var4_4 = "/\\";
                        var16_16 = ez3.e(var6_6, var10_10, var5_5, (String)var4_4);
                        var41_43 = var16_16 < var10_10;
                        var19_19 = 0;
                        var20_20 = null;
                        var25_26 = " \"<>^`{}|/\\?#";
                        var15_15 = 1;
                        var17_17 = 0;
                        var22_22 = null;
                        var18_18 = 0;
                        var21_21 = null;
                        var28_29 = 240;
                        var4_4 = var2_2;
                        var9_9 = var16_16;
                        var30_31 = var16_16;
                        var16_16 = 0;
                        var26_27 = null;
                        var29_30 = var23_23;
                        var14_14 = var28_29;
                        var4_4 = Ob1$b.a(var2_2, var6_6, var9_9, var25_26, (boolean)var15_15, false, false, false, null, var28_29);
                        var24_24 = ".";
                        var6_6 = (int)Intrinsics.areEqual(var4_4, var24_24);
                        if (var6_6 != 0 || (var6_6 = (int)kotlin.text.b.i((String)var4_4, (String)(var24_24 = "%2e"), (boolean)(var9_9 = 1))) != 0) ** GOTO lbl377
                        var24_24 = "..";
                        var6_6 = (int)Intrinsics.areEqual(var4_4, var24_24);
                        if (var6_6 == 0 && (var6_6 = (int)kotlin.text.b.i((String)var4_4, (String)(var24_24 = "%2e."), (boolean)var9_9)) == 0 && (var6_6 = (int)kotlin.text.b.i((String)var4_4, (String)(var24_24 = ".%2e"), (boolean)var9_9)) == 0 && (var6_6 = (int)kotlin.text.b.i((String)var4_4, (String)(var24_24 = "%2e%2e"), (boolean)var9_9)) == 0) {
                            var24_24 = (CharSequence)pp_0.a(var9_9, (ArrayList)var23_23);
                            var6_6 = var24_24.length();
                            if (var6_6 == 0) {
                                var6_6 = var23_23.size() - var9_9;
                                var23_23.set(var6_6, var4_4);
                            } else {
                                var23_23.add(var4_4);
                            }
                            if (var41_43) {
                                var29_30.add(var36_38 /* !! */ );
                            }
lbl377:
                            // 4 sources

                            var6_6 = 1;
                        } else {
                            var32_33 = var29_30.size();
                            var6_6 = 1;
                            var32_33 -= var6_6;
                            var4_4 = (String)var29_30.remove(var32_33);
                            if ((var32_33 = var4_4.length()) == 0 && (var32_33 = var29_30.isEmpty() ^ var6_6) != 0) {
                                var32_33 = var29_30.size() - var6_6;
                                var29_30.set(var32_33, var36_38 /* !! */ );
                            } else {
                                var29_30.add(var36_38 /* !! */ );
                            }
                        }
                        if (!var41_43) break;
                        var6_6 = var32_33 = var30_31 + 1;
                        var23_23 = var29_30;
lbl393:
                        // 2 sources

                        while (true) {
                            var12_12 = 0;
                            var29_30 = null;
                            continue block10;
                            break;
                        }
                        break;
                    }
                    var23_23 = var29_30;
                    var6_6 = var30_31;
                    ** while (true)
                }
                var6_6 = 1;
                if (var10_10 < var7_7 && (var32_33 = (int)var5_5.charAt(var10_10)) == (var9_9 = 63)) {
                    var32_33 = 35;
                    var12_12 = ez3.f(var5_5, (char)var32_33, var10_10, var7_7);
                    var9_9 = var10_10 + 1;
                    var19_19 = 0;
                    var20_20 = null;
                    var16_16 = 0;
                    var26_27 = null;
                    var25_26 = " \"'<>#";
                    var15_15 = 1;
                    var17_17 = 0;
                    var22_22 = null;
                    var18_18 = 1;
                    var14_14 = 208;
                    var4_4 = var2_2;
                    var6_6 = var9_9;
                    var9_9 = var12_12;
                    var3_3.g = var4_4 = Ob1$b.d(Ob1$b.a(var2_2, var6_6, var12_12, var25_26, (boolean)var15_15, false, (boolean)var18_18, false, null, var14_14));
                    var10_10 = var12_12;
                }
                if (var10_10 < var7_7 && (var32_33 = (int)var5_5.charAt(var10_10)) == (var6_6 = 35)) {
                    var32_33 = 1;
                    var6_6 = var10_10 + 1;
                    var19_19 = 1;
                    var16_16 = 0;
                    var26_27 = null;
                    var25_26 = "";
                    var15_15 = 1;
                    var17_17 = 0;
                    var22_22 = null;
                    var18_18 = 0;
                    var21_21 = null;
                    var14_14 = 176;
                    var4_4 = var2_2;
                    var9_9 = var7_7;
                    var3_3.h = var4_4 = Ob1$b.a(var2_2, var6_6, var7_7, var25_26, (boolean)var15_15, false, false, (boolean)var19_19, null, var14_14);
                }
                return;
            }
            var4_4 = new StringBuilder("Invalid URL host: \"");
            var24_24 = var5_5.substring(var15_15, var7_7);
            Intrinsics.checkNotNullExpressionValue(var24_24, (String)var8_8 /* !! */ );
            var4_4.append((String)var24_24);
            var4_4.append((char)var13_13);
            var4_4 = var4_4.toString();
            var4_4 = var4_4.toString();
            var24_24 = new IllegalArgumentException((String)var4_4);
            throw var24_24;
        }
        var32_34 = var2_2.length();
        if (var32_34 > var6_6) {
            var4_4 = new StringBuilder();
            var24_25 = le3_2.E(var6_6, var5_5);
            var4_4.append((String)var24_25);
            var24_25 = "...";
            var4_4.append((String)var24_25);
            var4_4 = var4_4.toString();
        } else {
            var4_4 = var5_5;
        }
        var4_4 = kp1_0.c("Expected URL scheme 'http' or 'https' but no scheme was found for ", (String)var4_4);
        var24_25 = new IllegalArgumentException((String)var4_4);
        throw var24_25;
    }

    public final void f(String string2, String string3) {
        Object object = "name";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = this.g;
        if (object != null) {
            boolean bl2 = true;
            int n3 = 219;
            ArrayList arrayList = null;
            String string4 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
            Object object2 = string2;
            object = Ob1$b.a(string2, 0, 0, string4, false, false, bl2, false, null, n3);
            object2 = this.g;
            Intrinsics.checkNotNull(object2);
            int n4 = object2.size() + -2;
            int n7 = -2;
            int n8 = vb2_1.a(n4, 0, n7);
            if (n8 <= n4) {
                while (true) {
                    arrayList = this.g;
                    Intrinsics.checkNotNull(arrayList);
                    arrayList = arrayList.get(n4);
                    n7 = (int)(Intrinsics.areEqual(object, arrayList) ? 1 : 0);
                    if (n7 != 0) {
                        arrayList = this.g;
                        Intrinsics.checkNotNull(arrayList);
                        int n10 = n4 + 1;
                        arrayList.remove(n10);
                        arrayList = this.g;
                        Intrinsics.checkNotNull(arrayList);
                        arrayList.remove(n4);
                        arrayList = this.g;
                        Intrinsics.checkNotNull(arrayList);
                        n7 = (int)(arrayList.isEmpty() ? 1 : 0);
                        if (n7 != 0) {
                            object = null;
                            this.g = null;
                            break;
                        }
                    }
                    if (n4 == n8) break;
                    n4 += -2;
                }
            }
        }
        this.a(string2, string3);
    }

    public final String toString() {
        char c2;
        String string2;
        int n3;
        int n4;
        int n7;
        Object object;
        CharSequence charSequence;
        block16: {
            block17: {
                charSequence = new StringBuilder();
                object = this.a;
                if (object != null) {
                    ((StringBuilder)charSequence).append((String)object);
                    object = "://";
                    ((StringBuilder)charSequence).append((String)object);
                } else {
                    object = "//";
                    ((StringBuilder)charSequence).append((String)object);
                }
                object = this.b;
                n7 = ((String)object).length();
                n4 = 58;
                if (n7 > 0 || (n7 = ((String)(object = this.c)).length()) > 0) {
                    object = this.b;
                    ((StringBuilder)charSequence).append((String)object);
                    object = this.c;
                    n7 = ((String)object).length();
                    if (n7 > 0) {
                        ((StringBuilder)charSequence).append((char)n4);
                        object = this.c;
                        ((StringBuilder)charSequence).append((String)object);
                    }
                    n7 = 64;
                    ((StringBuilder)charSequence).append((char)n7);
                }
                if ((object = this.d) != null) {
                    Intrinsics.checkNotNull(object);
                    n7 = (int)(StringsKt.G((CharSequence)object, (char)n4) ? 1 : 0);
                    if (n7 != 0) {
                        ((StringBuilder)charSequence).append('[');
                        object = this.d;
                        ((StringBuilder)charSequence).append((String)object);
                        n7 = 93;
                        ((StringBuilder)charSequence).append((char)n7);
                    } else {
                        object = this.d;
                        ((StringBuilder)charSequence).append((String)object);
                    }
                }
                if ((n7 = this.e) == (n3 = -1) && (object = this.a) == null) break block16;
                n7 = this.c();
                string2 = this.a;
                if (string2 == null) break block17;
                Intrinsics.checkNotNull(string2);
                Intrinsics.checkNotNullParameter(string2, "scheme");
                String string3 = "http";
                boolean bl2 = Intrinsics.areEqual(string2, string3);
                if (bl2) {
                    n3 = 80;
                } else {
                    string3 = "https";
                    c2 = (char)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
                    if (c2 != '\u0000') {
                        n3 = 443;
                    }
                }
                if (n7 == n3) break block16;
            }
            ((StringBuilder)charSequence).append((char)n4);
            ((StringBuilder)charSequence).append(n7);
        }
        object = this.f;
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string4 = "out";
        Intrinsics.checkNotNullParameter(charSequence, string4);
        n4 = ((ArrayList)object).size();
        for (n3 = 0; n3 < n4; ++n3) {
            c2 = '/';
            ((StringBuilder)charSequence).append(c2);
            string2 = (String)object.get(n3);
            ((StringBuilder)charSequence).append(string2);
        }
        object = this.g;
        if (object != null) {
            n7 = 63;
            ((StringBuilder)charSequence).append((char)n7);
            object = this.g;
            Intrinsics.checkNotNull(object);
            Ob1$b.e((List)object, (StringBuilder)charSequence);
        }
        if ((object = this.h) != null) {
            n7 = 35;
            ((StringBuilder)charSequence).append((char)n7);
            object = this.h;
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

