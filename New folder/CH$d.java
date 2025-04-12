/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class CH$d
extends uR2$i {
    public CH$d(String string2) {
        string2 = string2.replaceAll("(?s)/\\*.*?\\*/", "");
        super(string2);
    }

    public static int r(int n3) {
        int n4;
        int n7 = 48;
        if (n3 >= n7 && n3 <= (n4 = 57)) {
            return n3 - n7;
        }
        n7 = 65;
        if (n3 >= n7 && n3 <= (n7 = 70)) {
            return n3 + -55;
        }
        n7 = 97;
        if (n3 >= n7 && n3 <= (n7 = 102)) {
            return n3 + -87;
        }
        return -1;
    }

    public final String s() {
        int n3;
        char c2 = this.f();
        StringBuilder stringBuilder = null;
        if (c2 != '\u0000') {
            return null;
        }
        String string2 = this.a;
        int n4 = this.b;
        c2 = string2.charAt(n4);
        if (c2 != (n4 = 39) && c2 != (n4 = 34)) {
            return null;
        }
        stringBuilder = new StringBuilder();
        n4 = this.b;
        int n7 = 1;
        this.b = n4 += n7;
        Integer n8 = this.h();
        n4 = n8;
        while (n4 != (n3 = -1) && n4 != c2) {
            int n10 = 92;
            if (n4 == n10) {
                n8 = this.h();
                n4 = n8;
                if (n4 == n3) continue;
                n10 = 10;
                if (n4 != n10 && n4 != (n10 = 13) && n4 != (n10 = 12)) {
                    n10 = CH$d.r(n4);
                    if (n10 != n3) {
                        int n14;
                        for (int i3 = 1; i3 <= (n14 = 5) && (n14 = CH$d.r(n4 = (n8 = this.h()).intValue())) != n3; ++i3) {
                            n10 = n10 * 16 + n14;
                        }
                        n3 = (char)n10;
                        stringBuilder.append((char)n3);
                        continue;
                    }
                } else {
                    n8 = this.h();
                    n4 = n8;
                    continue;
                }
            }
            n4 = (char)n4;
            stringBuilder.append((char)n4);
            n8 = this.h();
            n4 = n8;
        }
        return stringBuilder.toString();
    }

    public final String t() {
        int n3;
        int n4 = this.f();
        String string2 = this.a;
        if (n4 != 0) {
            n4 = this.b;
        } else {
            block7: {
                int n7;
                n4 = this.b;
                n3 = string2.charAt(n4);
                if (n3 == (n7 = 45)) {
                    n3 = this.a();
                }
                int n8 = 95;
                int n10 = 122;
                int n14 = 97;
                int n15 = 90;
                int n16 = 65;
                if (n3 >= n16 && n3 <= n15 || n3 >= n14 && n3 <= n10 || n3 == n8) {
                    n3 = this.a();
                    while (true) {
                        int n17;
                        if (!(n3 >= n16 && n3 <= n15 || n3 >= n14 && n3 <= n10 || n3 >= (n17 = 48) && n3 <= (n17 = 57) || n3 == n7 || n3 == n8)) {
                            n3 = this.b;
                            break block7;
                        }
                        n3 = this.a();
                    }
                }
                n3 = n4;
            }
            this.b = n4;
            n4 = n3;
        }
        n3 = this.b;
        if (n4 == n3) {
            return null;
        }
        string2 = string2.substring(n3, n4);
        this.b = n4;
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ArrayList u() {
        var1_1 = this;
        var2_2 = this.f();
        var3_3 = 0;
        var4_4 = null;
        if (var2_2) {
            return null;
        }
        var6_6 = 1;
        var5_5 /* !! */  = new ArrayList<CH$s>(var6_6);
        var7_7 = new CH$s();
        while ((var8_8 = this.f()) == 0 && (var8_8 = this.f()) == 0) {
            var8_8 = var1_1.b;
            var9_9 /* !! */  = var7_7.a;
            var10_10 = 0;
            var11_11 = null;
            if (var9_9 /* !! */  != null && !(var12_12 = var9_9 /* !! */ .isEmpty())) {
                var12_12 = false;
                var9_9 /* !! */  = null;
            } else {
                var12_12 = true;
            }
            var13_13 = '+';
            if (var12_12) ** GOTO lbl-1000
            var12_12 = var1_1.d('>');
            if (var12_12) {
                var9_9 /* !! */  = CH$e.CHILD;
                this.q();
            } else {
                var12_12 = var1_1.d(var13_13);
                if (var12_12) {
                    var9_9 /* !! */  = CH$e.FOLLOWS;
                    this.q();
                } else lbl-1000:
                // 2 sources

                {
                    var12_12 = false;
                    var9_9 /* !! */  = null;
                }
            }
            var14_14 = var1_1.d('*');
            if (var14_14 != 0) {
                var15_15 = new CH$t((CH$e)var9_9 /* !! */ , null);
            } else {
                var15_15 = this.t();
                if (var15_15 != null) {
                    var16_16 = new CH$t((CH$e)var9_9 /* !! */ , (String)var15_15);
                    var7_7.b = var14_14 = var7_7.b + var6_6;
                    var15_15 = var16_16;
                } else {
                    var14_14 = 0;
                    var15_15 = null;
                }
            }
            while ((var17_17 = this.f()) == 0) {
                block82: {
                    block80: {
                        block81: {
                            var17_17 = var1_1.d('.');
                            if (var17_17 != 0) {
                                if (var15_15 == null) {
                                    var15_15 = new CH$t((CH$e)var9_9 /* !! */ , null);
                                }
                                if ((var16_16 = this.t()) != null) {
                                    var18_18 = "class";
                                    var19_19 = CH$c.EQUALS;
                                    var15_15.a((String)var18_18, (CH$c)var19_19, (String)var16_16);
                                    var7_7.a();
                                    continue;
                                }
                                var5_5 /* !! */  = new ArrayList<CH$s>("Invalid \".class\" simpleSelectors");
                                throw var5_5 /* !! */ ;
                            }
                            var17_17 = var1_1.d('#');
                            if (var17_17 != 0) {
                                if (var15_15 == null) {
                                    var15_15 = new CH$t((CH$e)var9_9 /* !! */ , null);
                                }
                                if ((var16_16 = this.t()) != null) {
                                    var18_18 = "id";
                                    var19_19 = CH$c.EQUALS;
                                    var15_15.a((String)var18_18, (CH$c)var19_19, (String)var16_16);
                                    var17_17 = var7_7.b;
                                    var20_20 = 1000000;
                                    var7_7.b = var17_17 += var20_20;
                                    continue;
                                }
                                var5_5 /* !! */  = new ArrayList<CH$s>("Invalid \"#id\" simpleSelectors");
                                throw var5_5 /* !! */ ;
                            }
                            var17_17 = var1_1.d('[');
                            if (var17_17 == 0) break block80;
                            if (var15_15 == null) {
                                var15_15 = new CH$t((CH$e)var9_9 /* !! */ , null);
                            }
                            this.q();
                            var16_16 = this.t();
                            var18_18 = "Invalid attribute simpleSelectors";
                            if (var16_16 == null) break block81;
                            this.q();
                            var21_21 = var1_1.d('=');
                            if (var21_21 != 0) {
                                var19_19 = CH$c.EQUALS;
                            } else {
                                var19_19 = "~=";
                                var21_21 = var1_1.e((String)var19_19);
                                if (var21_21 != 0) {
                                    var19_19 = CH$c.INCLUDES;
                                } else {
                                    var19_19 = "|=";
                                    var21_21 = var1_1.e((String)var19_19);
                                    if (var21_21 != 0) {
                                        var19_19 = CH$c.DASHMATCH;
                                    } else {
                                        var21_21 = 0;
                                        var19_19 = null;
                                    }
                                }
                            }
                            if (var19_19 == null) ** GOTO lbl113
                            this.q();
                            var22_22 = (int)this.f();
                            if (var22_22 != 0) {
                                var22_22 = 0;
                                var23_23 = null;
                            } else {
                                var23_23 = this.k();
                                if (var23_23 == null) {
                                    var23_23 = this.t();
                                }
                            }
                            if (var23_23 != null) {
                                this.q();
                            } else {
                                var5_5 /* !! */  = new ArrayList<CH$s>((String)var18_18);
                                throw var5_5 /* !! */ ;
lbl113:
                                // 1 sources

                                var22_22 = 0;
                                var23_23 = null;
                            }
                            var24_24 = (int)var1_1.d(']');
                            if (var24_24 != 0) {
                                if (var19_19 == null) {
                                    var19_19 = CH$c.EXISTS;
                                }
                                var15_15.a((String)var16_16, (CH$c)var19_19, var23_23);
                                var7_7.a();
                                continue;
                            }
                            var5_5 /* !! */  = new ArrayList<CH$s>((String)var18_18);
                            throw var5_5 /* !! */ ;
                        }
                        var5_5 /* !! */  = new ArrayList<CH$s>((String)var18_18);
                        throw var5_5 /* !! */ ;
                    }
                    var17_17 = var1_1.d(':');
                    if (var17_17 == 0) break;
                    if (var15_15 == null) {
                        var15_15 = new CH$t((CH$e)var9_9 /* !! */ , null);
                    }
                    if ((var16_16 = this.t()) == null) break block82;
                    var18_18 = CH$j.fromString((String)var16_16);
                    var19_19 = CH$a.b;
                    var22_22 = var18_18.ordinal();
                    var21_21 = var19_19[var22_22];
                    var23_23 = "Invalid or missing parameter section for pseudo class: ";
                    var24_24 = 41;
                    var25_25 = '(';
                    block0 : switch (var21_21 ? 1 : 0) {
                        default: {
                            var4_4 = "Unsupported pseudo class: ".concat((String)var16_16);
                            var5_5 /* !! */  = new ArrayList<CH$s>((String)var4_4);
                            throw var5_5 /* !! */ ;
                        }
                        case 16: 
                        case 17: 
                        case 18: 
                        case 19: 
                        case 20: 
                        case 21: 
                        case 22: 
                        case 23: 
                        case 24: {
                            var18_18 = new CH$l((String)var16_16);
                            var7_7.a();
                            break;
                        }
                        case 15: {
                            var20_20 = (int)this.f();
                            if (var20_20 != 0) ** GOTO lbl171
                            var20_20 = var1_1.b;
                            var21_21 = var1_1.d(var25_25);
                            if (var21_21 == 0) ** GOTO lbl171
                            this.q();
                            var21_21 = 0;
                            var19_19 = null;
                            do {
                                if ((var23_23 = this.t()) != null) ** GOTO lbl162
                                var1_1.b = var20_20;
                                ** GOTO lbl171
lbl162:
                                // 1 sources

                                if (var19_19 == null) {
                                    var19_19 = new ArrayList();
                                }
                                var19_19.add(var23_23);
                                this.q();
                            } while ((var22_22 = (int)this.p()) != 0);
                            var21_21 = (int)var1_1.d((char)var24_24);
                            if (var21_21 == 0) {
                                var1_1.b = var20_20;
                            }
lbl171:
                            // 6 sources

                            var18_18 = new CH$l((String)var16_16);
                            var7_7.a();
                            break;
                        }
                        case 14: {
                            var18_18 = new Object();
                            var7_7.a();
                            break;
                        }
                        case 13: {
                            var20_20 = (int)this.f();
                            if (var20_20 == 0) ** GOTO lbl185
lbl181:
                            // 4 sources

                            while (true) {
                                var21_21 = 0;
                                var19_19 = null;
                                ** GOTO lbl217
                                break;
                            }
lbl185:
                            // 1 sources

                            var20_20 = var1_1.b;
                            var21_21 = var1_1.d(var25_25);
                            if (var21_21 == 0) ** GOTO lbl181
                            this.q();
                            var19_19 = this.u();
                            if (var19_19 != null) ** GOTO lbl193
                            var1_1.b = var20_20;
                            ** GOTO lbl181
lbl193:
                            // 1 sources

                            if ((var24_24 = (int)var1_1.d((char)var24_24)) == 0) {
                                var1_1.b = var20_20;
                                ** continue;
                            }
                            var18_18 = var19_19.iterator();
                            block19: while ((var24_24 = (int)var18_18.hasNext()) != 0 && (var26_26 = ((CH$s)var18_18.next()).a) != null) {
                                var26_26 = var26_26.iterator();
                                while ((var25_25 = (char)var26_26.hasNext()) != '\u0000' && (var27_27 = ((CH$t)var26_26.next()).d) != null) {
                                    var27_27 = var27_27.iterator();
                                    while ((var28_28 = var27_27.hasNext()) != 0) {
                                        var29_29 = var27_27.next();
                                        var4_4 = var29_29;
                                        var4_4 = var29_29;
                                        var3_3 = var4_4 instanceof CH$k;
                                        if (var3_3 != 0) {
                                            var21_21 = 0;
                                            var19_19 = null;
                                            break block19;
                                        }
                                        var3_3 = 0;
                                        var4_4 = null;
                                    }
                                }
                                var3_3 = 0;
                                var4_4 = null;
                            }
lbl217:
                            // 3 sources

                            if (var19_19 != null) {
                                var18_18 = new Object();
                                var18_18.a = var19_19;
                                var4_4 = var19_19.iterator();
                                var17_17 = -1 << -1;
                                while ((var21_21 = var4_4.hasNext()) != 0) {
                                    var19_19 = (CH$s)var4_4.next();
                                    var21_21 = var19_19.b;
                                    if (var21_21 <= var17_17) continue;
                                    var17_17 = var21_21;
                                }
                                var7_7.b = var17_17;
                                var3_3 = 0;
                                var4_4 = null;
                                break;
                            }
                            var4_4 = var23_23.concat((String)var16_16);
                            var5_5 /* !! */  = new ArrayList<CH$s>((String)var4_4);
                            throw var5_5 /* !! */ ;
                        }
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: {
                            var4_4 = CH$j.nth_child;
                            var30_30 = var18_18 == var4_4 || var18_18 == (var4_4 = CH$j.nth_of_type);
                            var4_4 = CH$j.nth_of_type;
                            var31_31 = var18_18 == var4_4 || var18_18 == (var4_4 = CH$j.nth_last_of_type);
                            var3_3 = this.f();
                            if (var3_3 == 0) ** GOTO lbl248
                            while (true) {
                                var32_32 /* !! */  = var15_15;
lbl244:
                                // 3 sources

                                while (true) {
                                    var20_20 = 0;
                                    var18_18 = null;
                                    ** GOTO lbl324
                                    break;
                                }
                                break;
                            }
lbl248:
                            // 1 sources

                            var3_3 = var1_1.b;
                            if ((var20_20 = (int)var1_1.d(var25_25)) == 0) ** continue;
                            this.q();
                            var18_18 = "odd";
                            var20_20 = (int)var1_1.e((String)var18_18);
                            var21_21 = 2;
                            if (var20_20 == 0) ** GOTO lbl259
                            var18_18 = new CH$d$a(var21_21, var6_6);
lbl256:
                            // 2 sources

                            while (true) {
                                var32_32 /* !! */  = var15_15;
                                ** GOTO lbl319
                                break;
                            }
lbl259:
                            // 1 sources

                            var18_18 = "even";
                            var20_20 = (int)var1_1.e((String)var18_18);
                            if (var20_20 != 0) {
                                var18_18 = new CH$d$a(var21_21, 0);
                                ** continue;
                            }
                            var20_20 = (int)var1_1.d(var13_13);
                            var25_25 = '-';
                            var20_20 = var20_20 == 0 && (var20_20 = (int)var1_1.d(var25_25)) != 0 ? -1 : 1;
                            var21_21 = var1_1.b;
                            var6_6 = var1_1.c;
                            var11_11 = var1_1.a;
                            var19_19 = ij1.a(var21_21, var6_6, (String)var11_11);
                            if (var19_19 != null) {
                                var1_1.b = var24_24 = var19_19.a;
                            }
                            if ((var24_24 = (int)var1_1.d('n')) != 0 || (var24_24 = (int)var1_1.d('N')) != 0) ** GOTO lbl281
                            var32_32 /* !! */  = var15_15;
                            var28_28 = var20_20;
                            var33_33 = var19_19;
                            var20_20 = 1;
                            var21_21 = 0;
                            var19_19 = null;
                            ** GOTO lbl303
lbl281:
                            // 1 sources

                            if (var19_19 != null) {
                                var32_32 /* !! */  = var15_15;
                            } else {
                                var32_32 /* !! */  = var15_15;
                                var34_34 = 1L;
                                var24_24 = var1_1.b;
                                var19_19 = new ij1(var34_34, var24_24);
                            }
                            this.q();
                            var13_13 = '+';
                            var14_14 = (int)var1_1.d(var13_13);
                            var28_28 = var14_14 == 0 && (var14_14 = (int)var1_1.d(var25_25)) != 0 ? -1 : 1;
                            if (var14_14 == 0) ** GOTO lbl301
                            this.q();
                            var14_14 = var1_1.b;
                            var33_33 = ij1.a(var14_14, var6_6, (String)var11_11);
                            if (var33_33 == null) ** GOTO lbl299
                            var1_1.b = var10_10 = var33_33.a;
                            ** GOTO lbl303
lbl299:
                            // 1 sources

                            var1_1.b = var3_3;
                            ** GOTO lbl244
lbl301:
                            // 1 sources

                            var6_6 = 0;
                            var33_33 = null;
lbl303:
                            // 3 sources

                            if (var19_19 == null) {
                                var20_20 = 0;
                                var18_18 = null;
                            } else {
                                var36_35 = var19_19.b;
                                var14_14 = (int)var36_35;
                                var20_20 *= var14_14;
                            }
                            if (var33_33 == null) {
                                var6_6 = 0;
                                var33_33 = null;
                            } else {
                                var36_35 = var33_33.b;
                                var6_6 = (int)var36_35;
                                var28_28 *= var6_6;
                                var6_6 = var28_28;
                            }
                            var18_18 = var11_11 = new CH$d$a(var20_20, var6_6);
lbl319:
                            // 2 sources

                            this.q();
                            var6_6 = (int)var1_1.d(')');
                            if (var6_6 == 0) {
                                var1_1.b = var3_3;
                                ** continue;
                            }
lbl324:
                            // 3 sources

                            if (var18_18 != null) {
                                var6_6 = var18_18.a;
                                var10_10 = var18_18.b;
                                var15_15 = var32_32 /* !! */ ;
                                var16_16 = var32_32 /* !! */ .b;
                                var38_36 = var10_10;
                                var4_4 = new CH$h((String)var16_16, var6_6, var10_10, var30_30, var31_31);
                                var7_7.a();
                                var18_18 = var4_4;
lbl333:
                                // 3 sources

                                while (true) {
                                    var3_3 = 0;
                                    var4_4 = null;
                                    var6_6 = 1;
lbl337:
                                    // 2 sources

                                    while (true) {
                                        var10_10 = 0;
                                        var11_11 = null;
                                        break block0;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var4_4 = var23_23.concat((String)var16_16);
                            var5_5 /* !! */  = new ArrayList<CH$s>((String)var4_4);
                            throw var5_5 /* !! */ ;
                        }
                        case 8: {
                            var18_18 = new Object();
                            var7_7.a();
                            ** GOTO lbl333
                        }
                        case 7: {
                            var18_18 = new Object();
                            var7_7.a();
                            ** continue;
                        }
                        case 6: {
                            var4_4 = var15_15.b;
                            var6_6 = 1;
                            var18_18 = new CH$m((boolean)var6_6, (String)var4_4);
                            var7_7.a();
lbl357:
                            // 3 sources

                            while (true) {
                                var3_3 = 0;
                                var4_4 = null;
                                ** continue;
                                break;
                            }
                        }
                        case 5: {
                            var4_4 = var15_15.b;
                            var38_36 = 1;
                            var30_30 = false;
                            var31_31 = true;
                            var18_18 = new CH$h((String)var4_4, 0, var38_36, false, var31_31);
                            var7_7.a();
                            ** GOTO lbl357
                        }
                        case 4: {
                            var4_4 = var15_15.b;
                            var39_37 = 1;
                            var40_38 = true;
                            var41_39 = true;
                            var32_32 /* !! */  = var4_4;
                            var18_18 = new CH$h((String)var4_4, 0, var39_37, var40_38, var41_39);
                            var7_7.a();
                            ** continue;
                        }
                        case 3: {
                            var3_3 = 0;
                            var4_4 = null;
                            var10_10 = 0;
                            var11_11 = null;
                            var18_18 = new CH$m(false, null);
                            var7_7.a();
                            break;
                        }
                        case 2: {
                            var25_25 = '\u0001';
                            var28_28 = 0;
                            var29_29 = null;
                            var24_24 = 0;
                            var26_26 = null;
                            var22_22 = 0;
                            var23_23 = null;
                            var19_19 = var18_18;
                            var18_18 = new CH$h(null, 0, var25_25, false, false);
                            var7_7.a();
                            break;
                        }
                        case 1: {
                            var38_36 = 1;
                            var30_30 = true;
                            var31_31 = false;
                            var18_18 = new CH$h(null, 0, var38_36, var30_30, false);
                            var7_7.a();
                        }
                    }
                    var16_16 = var15_15.d;
                    if (var16_16 == null) {
                        var16_16 = new ArrayList();
                        var15_15.d = var16_16;
                    }
                    var16_16 = var15_15.d;
                    var16_16.add(var18_18);
                    continue;
                }
                var5_5 /* !! */  = new ArrayList<CH$s>("Invalid pseudo class");
                throw var5_5 /* !! */ ;
            }
            if (var15_15 != null) {
                var42_40 = var7_7.a;
                if (var42_40 == null) {
                    var7_7.a = var42_40 = new ArrayList<Object>();
                }
                var42_40 = var7_7.a;
                var42_40.add(var15_15);
                var8_8 = (int)this.p();
                if (var8_8 == 0) continue;
                var5_5 /* !! */ .add(var7_7);
                var7_7 = new CH$s();
                continue;
            }
            var1_1.b = var8_8;
            break;
        }
        if ((var4_4 = var7_7.a) != null && (var3_3 = var4_4.isEmpty()) == 0) {
            var5_5 /* !! */ .add(var7_7);
        }
        return var5_5 /* !! */ ;
    }
}

