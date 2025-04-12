/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/*
 * Renamed from Vm1
 */
public final class vm1_1
extends gm1_0 {
    public static final ff_2 l = ff$a_0.c("'\\");
    public static final ff_2 m = ff$a_0.c("\"\\");
    public static final ff_2 n = ff$a_0.c("{}[]:, \n\t\r\f/\\;#=");
    public final se_1 f;
    public final ce_2 g;
    public int h;
    public long i;
    public int j;
    public String k;

    static {
        ff$a_0.c("\n\r");
        ff$a_0.c("*/");
    }

    public vm1_1(ie2_2 se_12) {
        int n3 = 32;
        Object[] objectArray = new int[n3];
        this.b = objectArray;
        objectArray = new String[n3];
        this.c = (String[])objectArray;
        int[] nArray = new int[n3];
        this.d = nArray;
        this.h = 0;
        this.f = se_12;
        se_12 = se_12.b;
        this.g = se_12;
        this.A(6);
    }

    public final int C(Gm1$a object) {
        int n3 = this.h;
        if (n3 == 0) {
            n3 = this.M();
        }
        int n4 = 12;
        int n7 = -1;
        if (n3 >= n4 && n3 <= (n4 = 15)) {
            if (n3 == n4) {
                String string2 = this.k;
                return this.O(string2, (Gm1$a)object);
            }
            Object object2 = this.f;
            Object object3 = ((Gm1$a)object).b;
            n3 = object2.d0((aa2_2)object3);
            if (n3 != n7) {
                this.h = 0;
                String[] stringArray = this.c;
                n7 = this.a + -1;
                stringArray[n7] = object = ((Gm1$a)object).a[n3];
                return n3;
            }
            object3 = this.c;
            int n8 = this.a + -1;
            object3 = object3[n8];
            object2 = this.Q();
            int n10 = this.O((String)object2, (Gm1$a)object);
            if (n10 == n7) {
                this.h = n4;
                this.k = object2;
                String[] stringArray = this.c;
                n7 = this.a + -1;
                stringArray[n7] = object3;
            }
            return n10;
        }
        return n7;
    }

    public final void G() {
        block9: {
            String[] stringArray;
            int n3;
            block6: {
                int n4;
                block8: {
                    block7: {
                        block5: {
                            n4 = this.h;
                            if (n4 == 0) {
                                n4 = this.M();
                            }
                            if (n4 != (n3 = 14)) break block5;
                            stringArray = n;
                            se_1 se_12 = this.f;
                            long l2 = se_12.E((ff_2)stringArray);
                            long l3 = -1;
                            ce_2 ce_22 = this.g;
                            Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                            if (object == false) {
                                l2 = ce_22.b;
                            }
                            ce_22.skip(l2);
                            break block6;
                        }
                        n3 = 13;
                        if (n4 != n3) break block7;
                        stringArray = m;
                        this.v0((ff_2)stringArray);
                        break block6;
                    }
                    n3 = 12;
                    if (n4 != n3) break block8;
                    stringArray = l;
                    this.v0((ff_2)stringArray);
                    break block6;
                }
                n3 = 15;
                if (n4 != n3) break block9;
            }
            this.h = 0;
            stringArray = this.c;
            n3 = this.a + -1;
            stringArray[n3] = "null";
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected a name but was ");
        Object object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void H() {
        int n3;
        int n4;
        Object var1_1 = null;
        int n7 = 0;
        CharSequence charSequence = null;
        do {
            block10: {
                long l2;
                long l3;
                ce_2 ce_22;
                block16: {
                    block17: {
                        String string2;
                        String string3;
                        int n8;
                        block15: {
                            block14: {
                                block13: {
                                    block12: {
                                        block11: {
                                            if ((n4 = this.h) == 0) {
                                                n4 = this.M();
                                            }
                                            n3 = 1;
                                            n8 = 3;
                                            if (n4 != n8) break block11;
                                            this.A(n3);
                                            break block12;
                                        }
                                        if (n4 != n3) break block13;
                                        this.A(n8);
                                    }
                                    ++n7;
                                    break block10;
                                }
                                n8 = 4;
                                string3 = " at path ";
                                string2 = "Expected a value but was ";
                                if (n4 != n8) break block14;
                                if ((n7 += -1) < 0) {
                                    charSequence = new StringBuilder(string2);
                                    Gm1$b gm1$b = this.z();
                                    ((StringBuilder)charSequence).append((Object)gm1$b);
                                    ((StringBuilder)charSequence).append(string3);
                                    String string4 = this.h();
                                    ((StringBuilder)charSequence).append(string4);
                                    charSequence = ((StringBuilder)charSequence).toString();
                                    yl1_0 yl1_02 = new RuntimeException((String)charSequence);
                                    throw yl1_02;
                                }
                                this.a = n4 = this.a - n3;
                                break block10;
                            }
                            n8 = 2;
                            if (n4 != n8) break block15;
                            if ((n7 += -1) < 0) {
                                charSequence = new StringBuilder(string2);
                                Gm1$b gm1$b = this.z();
                                ((StringBuilder)charSequence).append((Object)gm1$b);
                                ((StringBuilder)charSequence).append(string3);
                                String string5 = this.h();
                                ((StringBuilder)charSequence).append(string5);
                                charSequence = ((StringBuilder)charSequence).toString();
                                yl1_0 yl1_03 = new RuntimeException((String)charSequence);
                                throw yl1_03;
                            }
                            this.a = n4 = this.a - n3;
                            break block10;
                        }
                        n8 = 14;
                        ce_22 = this.g;
                        if (n4 == n8 || n4 == (n8 = 10)) break block16;
                        n8 = 9;
                        if (n4 == n8 || n4 == (n8 = 13)) break block17;
                        n8 = 8;
                        if (n4 != n8 && n4 != (n8 = 12)) {
                            n8 = 17;
                            if (n4 == n8) {
                                n4 = this.j;
                                l3 = n4;
                                ce_22.skip(l3);
                                break block10;
                            } else {
                                n8 = 18;
                                if (n4 == n8) {
                                    charSequence = new StringBuilder(string2);
                                    Gm1$b gm1$b = this.z();
                                    ((StringBuilder)charSequence).append((Object)gm1$b);
                                    ((StringBuilder)charSequence).append(string3);
                                    String string6 = this.h();
                                    ((StringBuilder)charSequence).append(string6);
                                    charSequence = ((StringBuilder)charSequence).toString();
                                    yl1_0 yl1_04 = new RuntimeException((String)charSequence);
                                    throw yl1_04;
                                }
                            }
                            break block10;
                        } else {
                            ff_2 ff_22 = l;
                            this.v0(ff_22);
                        }
                        break block10;
                    }
                    ff_2 ff_23 = m;
                    this.v0(ff_23);
                    break block10;
                }
                se_1 se_12 = this.f;
                ff_2 ff_24 = n;
                l3 = se_12.E(ff_24);
                long l4 = l3 - (l2 = (long)-1);
                n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                if (n4 == 0) {
                    l3 = ce_22.b;
                }
                ce_22.skip(l3);
            }
            this.h = 0;
        } while (n7 != 0);
        int[] nArray = this.d;
        n7 = this.a - n3;
        nArray[n7] = n4 = nArray[n7] + n3;
        this.c[n7] = "null";
    }

    public final void K() {
        this.I("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int M() {
        block49: {
            block51: {
                block52: {
                    block53: {
                        block54: {
                            block55: {
                                block56: {
                                    block57: {
                                        block46: {
                                            block45: {
                                                block50: {
                                                    block48: {
                                                        var1_1 = this;
                                                        var2_2 /* !! */  = this.b;
                                                        var3_3 = this.a;
                                                        var4_4 = 1;
                                                        var5_5 = var2_2 /* !! */ [var3_3 -= var4_4];
                                                        var6_6 = 0;
                                                        var7_7 = 93;
                                                        var8_8 = 6;
                                                        var9_9 = 3;
                                                        var10_10 = 59;
                                                        var11_11 = 44;
                                                        var12_12 = 7;
                                                        var13_13 = 4;
                                                        var14_14 = 5;
                                                        var15_15 = 2;
                                                        var16_16 = this.g;
                                                        if (var5_5 == var4_4) {
                                                            var2_2 /* !! */ [var3_3] = var15_15;
lbl19:
                                                            // 4 sources

                                                            while (true) {
                                                                var17_17 = 0;
                                                                var2_2 /* !! */  = null;
                                                                break block45;
                                                                break;
                                                            }
                                                        }
                                                        if (var5_5 != var15_15) break block48;
                                                        var17_17 = this.R((boolean)var4_4);
                                                        var16_16.readByte();
                                                        if (var17_17 == var11_11) ** GOTO lbl19
                                                        if (var17_17 != var10_10) {
                                                            if (var17_17 == var7_7) {
                                                                this.h = var13_13;
                                                                return var13_13;
                                                            }
                                                            this.I("Unterminated array");
                                                            throw null;
                                                        }
                                                        this.K();
                                                        throw null;
                                                    }
                                                    if (var5_5 == var9_9 || var5_5 == var14_14) break block49;
                                                    if (var5_5 != var13_13) break block50;
                                                    var2_2 /* !! */ [var3_3] = var14_14;
                                                    var17_17 = this.R((boolean)var4_4);
                                                    var16_16.readByte();
                                                    var3_3 = 58;
                                                    if (var17_17 == var3_3) ** GOTO lbl19
                                                    var3_3 = 61;
                                                    if (var17_17 != var3_3) {
                                                        this.I("Expected ':'");
                                                        throw null;
                                                    }
                                                    this.K();
                                                    throw null;
                                                }
                                                if (var5_5 == var8_8) {
                                                    var2_2 /* !! */ [var3_3] = var12_12;
                                                    ** continue;
                                                }
                                                if (var5_5 == var12_12) {
                                                    var2_2 /* !! */  = null;
                                                    var17_18 = this.R(false);
                                                    if (var17_18 == (var3_3 = -1)) {
                                                        this.h = var17_18 = 18;
                                                        return var17_18;
                                                    }
                                                    this.K();
                                                    throw null;
                                                }
                                                var17_17 = 0;
                                                var2_2 /* !! */  = null;
                                                var3_3 = 8;
                                                if (var5_5 == var3_3) break block51;
                                            }
                                            var3_3 = var1_1.R((boolean)var4_4);
                                            var17_17 = 34;
                                            if (var3_3 == var17_17) break block52;
                                            var17_17 = 39;
                                            if (var3_3 == var17_17) break block53;
                                            if (var3_3 == var11_11 || var3_3 == var10_10) break block54;
                                            var17_17 = 91;
                                            if (var3_3 == var17_17) break block55;
                                            if (var3_3 == var7_7) break block56;
                                            var17_17 = 123;
                                            if (var3_3 == var17_17) break block57;
                                            var18_20 = 0L;
                                            var5_5 = var16_16.n(var18_20);
                                            var7_7 = 116;
                                            var20_21 = var1_1.f;
                                            if (var5_5 != var7_7 && var5_5 != (var7_7 = 84)) {
                                                var7_7 = 102;
                                                if (var5_5 != var7_7 && var5_5 != (var7_7 = 70)) {
                                                    var7_7 = 110;
                                                    if (var5_5 != var7_7 && var5_5 != (var7_7 = 78)) lbl-1000:
                                                    // 3 sources

                                                    {
                                                        while (true) {
                                                            var11_11 = 0;
                                                            break block46;
                                                            break;
                                                        }
                                                    }
                                                    var21_22 = "null";
                                                    var22_23 = "NULL";
                                                    var11_11 = 7;
                                                } else {
                                                    var21_22 = "false";
                                                    var22_23 = "FALSE";
                                                    var11_11 = 6;
                                                }
                                            } else {
                                                var21_22 = "true";
                                                var22_23 = "TRUE";
                                                var11_11 = 5;
                                            }
                                            var6_6 = var21_22.length();
                                            var12_12 = 1;
                                            while (var12_12 < var6_6) {
                                                var13_13 = var12_12 + 1;
                                                var23_24 = var13_13;
                                                var8_8 = (int)var20_21.request(var23_24);
                                                if (var8_8 == 0 || (var8_8 = (int)var16_16.n(var23_24 = (long)var12_12)) != (var9_9 = (int)var21_22.charAt(var12_12)) && var8_8 != (var9_9 = (int)var22_23.charAt(var12_12))) ** GOTO lbl-1000
                                                var12_12 = var13_13;
                                                var8_8 = 6;
                                                var9_9 = 3;
                                                var13_13 = 4;
                                            }
                                            var23_24 = var6_6 + 1;
                                            var5_5 = (int)var20_21.request(var23_24);
                                            if (var5_5 != 0) {
                                                var23_24 = var6_6;
                                                var5_5 = var16_16.n(var23_24);
                                                if ((var5_5 = (int)var1_1.P(var5_5)) == 0) ** break;
                                                ** continue;
                                            }
                                            var25_25 = var6_6;
                                            var16_16.skip(var25_25);
                                            var1_1.h = var11_11;
                                        }
                                        if (var11_11 != 0) {
                                            return var11_11;
                                        }
                                        var23_24 = var18_20;
                                        var5_5 = 0;
                                        var21_22 = null;
                                        var6_6 = 0;
                                        var7_7 = 1;
                                        var11_11 = 0;
                                        block3: while (true) {
                                            block47: {
                                                block59: {
                                                    block60: {
                                                        block64: {
                                                            block61: {
                                                                block62: {
                                                                    block58: {
                                                                        block63: {
                                                                            if ((var17_17 = (int)var20_21.request(var18_20 = (long)(var12_12 = var6_6 + 1))) == 0) break block58;
                                                                            var18_20 = var6_6;
                                                                            var17_17 = var16_16.n(var18_20);
                                                                            if (var17_17 == (var3_3 = 43)) break block59;
                                                                            var3_3 = 69;
                                                                            if (var17_17 == var3_3 || var17_17 == (var3_3 = 101)) break block60;
                                                                            var3_3 = 45;
                                                                            if (var17_17 == var3_3) break block61;
                                                                            var3_3 = 46;
                                                                            if (var17_17 == var3_3) break block62;
                                                                            var3_3 = 48;
                                                                            if (var17_17 < var3_3 || var17_17 > (var3_3 = 57)) break block63;
                                                                            if (var5_5 != var4_4 && var5_5 != 0) {
                                                                                if (var5_5 == var15_15) {
                                                                                    var27_26 = 0L;
                                                                                    cfr_temp_0 = var23_24 - var27_26;
                                                                                    var3_3 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                                    if (var3_3 == 0) lbl-1000:
                                                                                    // 7 sources

                                                                                    {
                                                                                        while (true) {
                                                                                            var29_28 = 0;
                                                                                            break block3;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var30_27 = (long)10 * var23_24;
                                                                                    var18_20 = var17_17 += -48;
                                                                                    var30_27 -= var18_20;
                                                                                    var18_20 = -922337203685477580L;
                                                                                    cfr_temp_1 = var23_24 - var18_20;
                                                                                    var6_6 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                                                    if (var6_6 <= 0 && (var6_6 != 0 || (var17_17 = (int)(var30_27 == var23_24 ? 0 : (var30_27 < var23_24 ? -1 : 1))) >= 0)) {
                                                                                        var17_17 = 0;
                                                                                        var2_2 /* !! */  = null;
                                                                                    } else {
                                                                                        var17_17 = 1;
                                                                                    }
                                                                                    var7_7 &= var17_17;
                                                                                    var23_24 = var30_27;
                                                                                    var17_17 = 7;
                                                                                    var3_3 = 6;
                                                                                } else {
                                                                                    var17_17 = 3;
                                                                                    if (var5_5 == var17_17) {
                                                                                        var17_17 = 7;
                                                                                        var3_3 = 6;
                                                                                        var5_5 = 4;
                                                                                    } else {
                                                                                        var3_3 = 6;
                                                                                        if (var5_5 != var14_14 && var5_5 != var3_3) {
                                                                                            var17_17 = 7;
                                                                                        } else {
                                                                                            var17_17 = 7;
                                                                                            var5_5 = 7;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var3_3 = 6;
                                                                                var23_24 = -(var17_17 + -48);
                                                                                var17_17 = 7;
                                                                                var5_5 = 2;
                                                                            }
                                                                            break block47;
                                                                        }
                                                                        if ((var17_17 = (int)var1_1.P(var17_17)) != 0) ** GOTO lbl-1000
                                                                    }
                                                                    if (!(var5_5 != var15_15 || var7_7 == 0 || (var4_4 = (int)((cfr_temp_2 = var23_24 - (var18_20 = -9223372036854775808L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) == 0 && var11_11 == 0 || (var4_4 = (int)((cfr_temp_3 = var23_24 - (var18_20 = 0L)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) == 0 && var11_11 != 0)) {
                                                                        if (var11_11 == 0) {
                                                                            var23_24 = -var23_24;
                                                                        }
                                                                        var1_1.i = var23_24;
                                                                        var18_20 = var6_6;
                                                                        var16_16.skip(var18_20);
                                                                        var1_1.h = var17_17 = 16;
                                                                        var29_28 = 16;
                                                                        break;
                                                                    }
                                                                    if (var5_5 != var15_15 && var5_5 != (var17_17 = 4) && var5_5 != (var17_17 = 7)) ** GOTO lbl-1000
                                                                    var1_1.j = var6_6;
                                                                    var1_1.h = var17_17 = 17;
                                                                    var29_28 = 17;
                                                                    break;
                                                                }
                                                                var17_17 = 7;
                                                                var3_3 = 6;
                                                                if (var5_5 != var15_15) ** GOTO lbl-1000
                                                                var5_5 = 3;
                                                                break block47;
                                                            }
                                                            var17_17 = 7;
                                                            var3_3 = 6;
                                                            if (var5_5 != 0) break block64;
                                                            var5_5 = 1;
                                                            var11_11 = 1;
                                                            break block47;
                                                        }
                                                        if (var5_5 != var14_14) ** GOTO lbl-1000
lbl221:
                                                        // 2 sources

                                                        while (true) {
                                                            var5_5 = 6;
                                                            break block47;
                                                            break;
                                                        }
                                                    }
                                                    var17_17 = 7;
                                                    var3_3 = 6;
                                                    if (var5_5 != var15_15 && var5_5 != (var6_6 = 4)) ** GOTO lbl-1000
                                                    var5_5 = 5;
                                                    break block47;
                                                }
                                                var17_17 = 7;
                                                var3_3 = 6;
                                                if (var5_5 == var14_14) ** break;
                                                ** continue;
                                                ** continue;
                                            }
                                            var6_6 = var12_12;
                                            var18_20 = 0L;
                                        }
                                        if (var29_28 != 0) {
                                            return var29_28;
                                        }
                                        var18_20 = 0L;
                                        var17_17 = var16_16.n(var18_20);
                                        if ((var17_17 = (int)var1_1.P(var17_17)) == 0) {
                                            var1_1.I("Expected value");
                                            throw null;
                                        }
                                        this.K();
                                        throw null;
                                    }
                                    var16_16.readByte();
                                    var1_1.h = var4_4;
                                    return var4_4;
                                }
                                if (var5_5 == var4_4) {
                                    var16_16.readByte();
                                    var1_1.h = var17_17 = 4;
                                    return var17_17;
                                }
                                break block54;
                            }
                            var16_16.readByte();
                            var1_1.h = var17_17 = 3;
                            return var17_17;
                        }
                        if (var5_5 != var4_4 && var5_5 != var15_15) {
                            var1_1.I("Unexpected value");
                            throw null;
                        }
                        var17_17 = 0;
                        var2_2 /* !! */  = null;
                        this.K();
                        throw null;
                    }
                    this.K();
                    throw null;
                }
                var16_16.readByte();
                var1_1.h = var17_17 = 9;
                return var17_17;
            }
            var2_2 /* !! */  = (int[])new IllegalStateException;
            var2_2 /* !! */ ("JsonReader is closed");
            throw var2_2 /* !! */ ;
        }
        var6_6 = 4;
        var2_2 /* !! */ [var3_3] = var6_6;
        var17_19 = 125;
        if (var5_5 == var14_14) {
            var3_3 = var1_1.R((boolean)var4_4);
            var16_16.readByte();
            if (var3_3 != var11_11) {
                if (var3_3 != var10_10) {
                    if (var3_3 == var17_19) {
                        var1_1.h = var15_15;
                        return var15_15;
                    }
                    var1_1.I("Unterminated object");
                    throw null;
                }
                this.K();
                throw null;
            }
        }
        if ((var3_3 = var1_1.R((boolean)var4_4)) != (var4_4 = 34)) {
            var4_4 = 39;
            if (var3_3 != var4_4) {
                if (var3_3 == var17_19) {
                    if (var5_5 != var14_14) {
                        var16_16.readByte();
                        var1_1.h = var15_15;
                        return var15_15;
                    }
                    var1_1.I("Expected name");
                    throw null;
                }
                this.K();
                throw null;
            }
            var16_16.readByte();
            this.K();
            throw null;
        }
        var16_16.readByte();
        var1_1.h = var17_19 = 13;
        return var17_19;
    }

    public final int O(String string2, Gm1$a stringArray) {
        String[] stringArray2 = stringArray.a;
        int n3 = stringArray2.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = stringArray.a[i3];
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            this.h = 0;
            stringArray = this.c;
            n3 = this.a + -1;
            stringArray[n3] = string2;
            return i3;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean P(int var1_1) {
        block4: {
            var2_2 = 9;
            if (var1_1 == var2_2 || var1_1 == (var2_2 = 10) || var1_1 == (var2_2 = 12) || var1_1 == (var2_2 = 13) || var1_1 == (var2_2 = 32)) break block4;
            var2_2 = 35;
            if (var1_1 == var2_2) ** GOTO lbl-1000
            var2_2 = 44;
            if (var1_1 == var2_2) break block4;
            var2_2 = 47;
            if (var1_1 == var2_2 || var1_1 == (var2_2 = 61)) ** GOTO lbl-1000
            var2_2 = 123;
            if (var1_1 == var2_2 || var1_1 == (var2_2 = 125) || var1_1 == (var2_2 = 58)) break block4;
            var2_2 = 59;
            if (var1_1 == var2_2) ** GOTO lbl-1000
            switch (var1_1) {
                default: {
                    return true;
                }
                case 92: lbl-1000:
                // 4 sources

                {
                    this.K();
                    throw null;
                }
                case 91: 
                case 93: 
            }
        }
        return false;
    }

    public final String Q() {
        block8: {
            Object object;
            block5: {
                int n3;
                int n4;
                block7: {
                    block6: {
                        block4: {
                            n4 = this.h;
                            if (n4 == 0) {
                                n4 = this.M();
                            }
                            if (n4 != (n3 = 14)) break block4;
                            object = this.W();
                            break block5;
                        }
                        n3 = 13;
                        if (n4 != n3) break block6;
                        object = m;
                        object = this.U((ff_2)object);
                        break block5;
                    }
                    n3 = 12;
                    if (n4 != n3) break block7;
                    object = l;
                    object = this.U((ff_2)object);
                    break block5;
                }
                n3 = 15;
                if (n4 != n3) break block8;
                object = this.k;
            }
            this.h = 0;
            String[] stringArray = this.c;
            int n7 = this.a + -1;
            stringArray[n7] = object;
            return object;
        }
        CharSequence charSequence = new StringBuilder("Expected a name but was ");
        Object object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    public final int R(boolean n3) {
        int n4;
        long l2;
        se_1 se_12;
        boolean bl2;
        int n7 = 0;
        ce_2 ce_22 = null;
        while (bl2 = (se_12 = this.f).request(l2 = (long)(n4 = n7 + 1))) {
            int n8;
            ce_22 = this.g;
            l2 = n7;
            int n10 = ce_22.n(l2);
            if (n10 != (n8 = 10) && n10 != (n8 = 32) && n10 != (n8 = 13) && n10 != (n8 = 9)) {
                ce_22.skip(l2);
                n3 = 47;
                n7 = 0;
                ce_22 = null;
                if (n10 == n3) {
                    long l3 = 2;
                    n3 = (int)(se_12.request(l3) ? 1 : 0);
                    if (n3 == 0) {
                        return n10;
                    }
                    this.K();
                    throw null;
                }
                n3 = 35;
                if (n10 != n3) {
                    return n10;
                }
                this.K();
                throw null;
            }
            n7 = n4;
        }
        if (n3 == 0) {
            return -1;
        }
        EOFException eOFException = new EOFException("End of input");
        throw eOFException;
    }

    public final String U(ff_2 object) {
        long l2;
        Object object2;
        long l3;
        long l4;
        long l7;
        StringBuilder stringBuilder = null;
        while ((l7 = (l4 = (l3 = (object2 = this.f).E((ff_2)object)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            ce_2 ce_22 = this.g;
            byte by2 = ce_22.n(l3);
            if (by2 == (l7 = (long)92)) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                Charset charset = Charsets.UTF_8;
                object2 = ce_22.H(l3, charset);
                stringBuilder.append((String)object2);
                ce_22.readByte();
                char c2 = this.l0();
                stringBuilder.append(c2);
                continue;
            }
            if (stringBuilder == null) {
                object = Charsets.UTF_8;
                object = ce_22.H(l3, (Charset)object);
                ce_22.readByte();
                return object;
            }
            object = Charsets.UTF_8;
            object = ce_22.H(l3, (Charset)object);
            stringBuilder.append((String)object);
            ce_22.readByte();
            return stringBuilder.toString();
        }
        this.I("Unterminated string");
        throw null;
    }

    public final String W() {
        Object object = n;
        se_1 se_12 = this.f;
        long l2 = se_12.E((ff_2)object);
        long l3 = -1;
        ce_2 ce_22 = this.g;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 != false) {
            ce_22.getClass();
            Charset charset = Charsets.UTF_8;
            object = ce_22.H(l2, charset);
        } else {
            object = ce_22.I();
        }
        return object;
    }

    public final void a() {
        int n3;
        int n4 = this.h;
        if (n4 == 0) {
            n4 = this.M();
        }
        if (n4 == (n3 = 3)) {
            n4 = 1;
            this.A(n4);
            int[] nArray = this.d;
            int n7 = this.a - n4;
            nArray[n7] = 0;
            this.h = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected BEGIN_ARRAY but was ");
        Object object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    public final void b() {
        int n3;
        int n4 = this.h;
        if (n4 == 0) {
            n4 = this.M();
        }
        if (n4 == (n3 = 1)) {
            this.A(3);
            this.h = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected BEGIN_OBJECT but was ");
        Object object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    public final void c() {
        int n3;
        int n4 = this.h;
        if (n4 == 0) {
            n4 = this.M();
        }
        if (n4 == (n3 = 4)) {
            int n7;
            n4 = this.a;
            this.a = n3 = n4 + -1;
            int[] nArray = this.d;
            nArray[n4 += -2] = n7 = nArray[n4] + 1;
            this.h = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected END_ARRAY but was ");
        Object object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    public final void close() {
        this.h = 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.b();
        this.f.close();
    }

    public final void d() {
        int n3;
        int n4 = this.h;
        if (n4 == 0) {
            n4 = this.M();
        }
        if (n4 == (n3 = 2)) {
            int n7;
            n4 = this.a;
            this.a = n7 = n4 + -1;
            this.c[n7] = null;
            int[] nArray = this.d;
            n4 -= n3;
            nArray[n4] = n3 = nArray[n4] + 1;
            this.h = 0;
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected END_OBJECT but was ");
        Object object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    public final boolean k() {
        int n3;
        int n4 = this.h;
        if (n4 == 0) {
            n4 = this.M();
        }
        n4 = n4 != (n3 = 2) && n4 != (n3 = 4) && n4 != (n3 = 18) ? 1 : 0;
        return n4 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final char l0() {
        int n3;
        long l2;
        char c2;
        int n4;
        int n7;
        Object object = this.f;
        long l3 = 1L;
        char c3 = object.request(l3);
        String string2 = null;
        if (c3 == '\u0000') {
            this.I("Unterminated escape sequence");
            throw null;
        }
        Object object2 = this.g;
        int n8 = ((ce_2)object2).readByte();
        if (n8 != (n7 = 10) && n8 != (n4 = 34) && n8 != (n4 = 39) && n8 != (n4 = 47) && n8 != (n4 = 92)) {
            n4 = 98;
            if (n8 == n4) {
                return '\b';
            }
            n4 = 102;
            if (n8 == n4) {
                return '\f';
            }
            c2 = 'n';
            if (n8 == c2) {
                return (char)n7;
            }
            n7 = 114;
            if (n8 == n7) {
                return '\r';
            }
            n7 = 116;
            if (n8 == n7) {
                return '\t';
            }
            n7 = 117;
            if (n8 != n7) {
                object = new StringBuilder("Invalid escape sequence: \\");
                c3 = (char)n8;
                ((StringBuilder)object).append(c3);
                object = ((StringBuilder)object).toString();
                this.I((String)object);
                throw null;
            }
            l2 = 4;
            n3 = object.request(l2);
            if (n3 == 0) {
                object2 = new StringBuilder("Unterminated escape sequence at path ");
                string2 = this.h();
                ((StringBuilder)object2).append(string2);
                object2 = ((StringBuilder)object2).toString();
                object = new EOFException((String)object2);
                throw object;
            }
        } else {
            return (char)n8;
        }
        n3 = 0;
        object = null;
        c2 = '\u0000';
        while (true) {
            int n10;
            if (n3 >= (n10 = 4)) {
                ((ce_2)object2).skip(l2);
                return c2;
            }
            long l4 = n3;
            n10 = ((ce_2)object2).n(l4);
            c2 = (char)(c2 << 4);
            int n14 = 48;
            if (n10 >= n14 && n10 <= (n14 = 57)) {
                n10 += -48;
            } else {
                n14 = 97;
                if (n10 >= n14 && n10 <= n4) {
                    n10 += -87;
                } else {
                    n14 = 65;
                    if (n10 < n14 || n10 > (n14 = 70)) break;
                    n10 += -55;
                }
            }
            n10 += c2;
            c2 = (char)n10;
            ++n3;
        }
        object = Charsets.UTF_8;
        object = ((ce_2)object2).H(l2, (Charset)object);
        object = "\\u".concat((String)object);
        this.I((String)object);
        throw null;
    }

    public final boolean n() {
        int n3 = this.h;
        if (n3 == 0) {
            n3 = this.M();
        }
        int n4 = 5;
        int n7 = 0;
        Object object = null;
        int n8 = 1;
        if (n3 == n4) {
            this.h = 0;
            int[] nArray = this.d;
            n4 = this.a - n8;
            nArray[n4] = n7 = nArray[n4] + n8;
            return n8 != 0;
        }
        n4 = 6;
        if (n3 == n4) {
            int n10;
            this.h = 0;
            int[] nArray = this.d;
            n4 = this.a - n8;
            nArray[n4] = n10 = nArray[n4] + n8;
            return false;
        }
        CharSequence charSequence = new StringBuilder("Expected a boolean but was ");
        object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    public final double p() {
        String string2;
        CharSequence charSequence;
        Object object;
        block14: {
            Object object2;
            Object object3;
            block10: {
                int n3;
                block13: {
                    int n4;
                    block12: {
                        block11: {
                            block9: {
                                n3 = this.h;
                                if (n3 == 0) {
                                    n3 = this.M();
                                }
                                n4 = 16;
                                int n7 = 0;
                                object = null;
                                if (n3 == n4) {
                                    this.h = 0;
                                    int[] nArray = this.d;
                                    n4 = this.a + -1;
                                    nArray[n4] = n7 = nArray[n4] + 1;
                                    return this.i;
                                }
                                n4 = 17;
                                charSequence = "Expected a double but was ";
                                object3 = 11;
                                string2 = " at path ";
                                if (n3 != n4) break block9;
                                n3 = this.j;
                                long l2 = n3;
                                ce_2 ce_22 = this.g;
                                ce_22.getClass();
                                Charset charset = Charsets.UTF_8;
                                this.k = object2 = ce_22.H(l2, charset);
                                break block10;
                            }
                            n4 = 9;
                            if (n3 != n4) break block11;
                            object2 = m;
                            this.k = object2 = this.U((ff_2)object2);
                            break block10;
                        }
                        n4 = 8;
                        if (n3 != n4) break block12;
                        object2 = l;
                        this.k = object2 = this.U((ff_2)object2);
                        break block10;
                    }
                    n4 = 10;
                    if (n3 != n4) break block13;
                    this.k = object2 = this.W();
                    break block10;
                }
                if (n3 != object3) break block14;
            }
            this.h = object3;
            try {
                object2 = this.k;
            }
            catch (NumberFormatException numberFormatException) {
                CharSequence charSequence2 = new StringBuilder((String)charSequence);
                object = this.k;
                charSequence2.append((String)object);
                charSequence2.append(string2);
                object = this.h();
                charSequence2.append((String)object);
                charSequence2 = charSequence2.toString();
                object2 = new RuntimeException((String)charSequence2);
                throw object2;
            }
            double d2 = Double.parseDouble((String)object2);
            int n8 = Double.isNaN(d2);
            if (n8 == 0 && (n8 = Double.isInfinite(d2)) == 0) {
                this.k = null;
                this.h = 0;
                object = this.d;
                n8 = this.a + -1;
                object3 = object[n8] + true;
                object[n8] = (Gm1$b)((Object)object3);
                return d2;
            }
            charSequence = new StringBuilder("JSON forbids NaN and infinities: ");
            ((StringBuilder)charSequence).append(d2);
            ((StringBuilder)charSequence).append(string2);
            object2 = this.h();
            ((StringBuilder)charSequence).append((String)object2);
            object2 = ((StringBuilder)charSequence).toString();
            object = new IOException((String)object2);
            throw object;
        }
        CharSequence charSequence3 = new StringBuilder((String)charSequence);
        object = this.z();
        charSequence3.append(object);
        charSequence3.append(string2);
        object = this.h();
        charSequence3.append((String)object);
        charSequence3 = charSequence3.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence3);
        throw yl1_02;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JsonReader(");
        se_1 se_12 = this.f;
        stringBuilder.append(se_12);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int u() {
        Object object;
        Object object2;
        int n3 = this.h;
        if (n3 == 0) {
            n3 = this.M();
        }
        int n4 = 16;
        Object object3 = 0;
        Object object4 = null;
        String string2 = " at path ";
        String string3 = "Expected an int but was ";
        if (n3 == n4) {
            long l2 = this.i;
            int n7 = (int)l2;
            long l3 = n7;
            long l4 = l2 - l3;
            Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object5 == false) {
                this.h = 0;
                int[] nArray = this.d;
                n4 = this.a + -1;
                nArray[n4] = object3 = nArray[n4] + 1;
                return n7;
            }
            CharSequence charSequence = new StringBuilder(string3);
            long l7 = this.i;
            charSequence.append(l7);
            charSequence.append(string2);
            object4 = this.h();
            charSequence.append((String)object4);
            charSequence = charSequence.toString();
            yl1_0 yl1_02 = new RuntimeException((String)charSequence);
            throw yl1_02;
        }
        n4 = 17;
        int n8 = 11;
        if (n3 == n4) {
            n3 = this.j;
            long l8 = n3;
            ce_2 ce_22 = this.g;
            ce_22.getClass();
            Charset charset = Charsets.UTF_8;
            this.k = object2 = ce_22.H(l8, charset);
        } else {
            int n10;
            n4 = 9;
            if (n3 != n4 && n3 != (n10 = 8)) {
                if (n3 != n8) {
                    CharSequence charSequence = new StringBuilder(string3);
                    object4 = this.z();
                    charSequence.append(object4);
                    charSequence.append(string2);
                    object4 = this.h();
                    charSequence.append((String)object4);
                    charSequence = charSequence.toString();
                    yl1_0 yl1_03 = new RuntimeException((String)charSequence);
                    throw yl1_03;
                }
            } else {
                if (n3 == n4) {
                    object2 = m;
                    object2 = this.U((ff_2)object2);
                } else {
                    object2 = l;
                    object2 = this.U((ff_2)object2);
                }
                this.k = object2;
                try {
                    n3 = Integer.parseInt((String)object2);
                }
                catch (NumberFormatException numberFormatException) {}
                this.h = 0;
                object = this.d;
                n10 = this.a + -1;
                reference var20_25 = object[n10] + true;
                object[n10] = var20_25;
                return n3;
            }
        }
        this.h = n8;
        try {
            object2 = this.k;
        }
        catch (NumberFormatException numberFormatException) {
            object = new StringBuilder(string3);
            object4 = this.k;
            ((StringBuilder)object).append((String)object4);
            ((StringBuilder)object).append(string2);
            object4 = this.h();
            ((StringBuilder)object).append((String)object4);
            object = ((StringBuilder)object).toString();
            object2 = new RuntimeException((String)object);
            throw object2;
        }
        double d2 = Double.parseDouble((String)object2);
        n8 = (int)d2;
        double d5 = n8;
        double d7 = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
        if (d7 == false) {
            this.k = null;
            this.h = 0;
            object2 = this.d;
            n4 = this.a + -1;
            object3 = object2[n4] + true;
            object2[n4] = object3;
            return n8;
        }
        object = new StringBuilder(string3);
        object4 = this.k;
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(string2);
        object4 = this.h();
        ((StringBuilder)object).append((String)object4);
        object = ((StringBuilder)object).toString();
        object2 = new RuntimeException((String)object);
        throw object2;
    }

    public final void v0(ff_2 ff_22) {
        long l2;
        se_1 se_12;
        long l3;
        long l4;
        long l7;
        while ((l7 = (l4 = (l3 = (se_12 = this.f).E(ff_22)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            ce_2 ce_22 = this.g;
            byte by2 = ce_22.n(l3);
            l7 = 92;
            long l8 = 1L;
            if (by2 == l7) {
                ce_22.skip(l3 += l8);
                this.l0();
                continue;
            }
            ce_22.skip(l3 += l8);
            return;
        }
        this.I("Unterminated string");
        throw null;
    }

    public final String w() {
        block10: {
            int n3;
            int[] nArray;
            Object object;
            block5: {
                int n4;
                int n7;
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    n7 = this.h;
                                    if (n7 == 0) {
                                        n7 = this.M();
                                    }
                                    if (n7 != (n4 = 10)) break block4;
                                    object = this.W();
                                    break block5;
                                }
                                n4 = 9;
                                if (n7 != n4) break block6;
                                object = m;
                                object = this.U((ff_2)object);
                                break block5;
                            }
                            n4 = 8;
                            if (n7 != n4) break block7;
                            object = l;
                            object = this.U((ff_2)object);
                            break block5;
                        }
                        n4 = 11;
                        if (n7 != n4) break block8;
                        object = this.k;
                        n4 = 0;
                        nArray = null;
                        this.k = null;
                        break block5;
                    }
                    n4 = 16;
                    if (n7 != n4) break block9;
                    long l2 = this.i;
                    object = Long.toString(l2);
                    break block5;
                }
                n4 = 17;
                if (n7 != n4) break block10;
                n7 = this.j;
                long l3 = n7;
                ce_2 ce_22 = this.g;
                ce_22.getClass();
                Charset charset = Charsets.UTF_8;
                object = ce_22.H(l3, charset);
            }
            this.h = 0;
            nArray = this.d;
            int n8 = this.a + -1;
            nArray[n8] = n3 = nArray[n8] + 1;
            return object;
        }
        CharSequence charSequence = new StringBuilder("Expected a string but was ");
        Object object = this.z();
        charSequence.append(object);
        charSequence.append(" at path ");
        object = this.h();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        yl1_0 yl1_02 = new RuntimeException((String)charSequence);
        throw yl1_02;
    }

    public final Gm1$b z() {
        int n3 = this.h;
        if (n3 == 0) {
            n3 = this.M();
        }
        switch (n3) {
            default: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 18: {
                return Gm1$b.END_DOCUMENT;
            }
            case 16: 
            case 17: {
                return Gm1$b.NUMBER;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return Gm1$b.NAME;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return Gm1$b.STRING;
            }
            case 7: {
                return Gm1$b.NULL;
            }
            case 5: 
            case 6: {
                return Gm1$b.BOOLEAN;
            }
            case 4: {
                return Gm1$b.END_ARRAY;
            }
            case 3: {
                return Gm1$b.BEGIN_ARRAY;
            }
            case 2: {
                return Gm1$b.END_OBJECT;
            }
            case 1: 
        }
        return Gm1$b.BEGIN_OBJECT;
    }
}

