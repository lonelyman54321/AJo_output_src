/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Q0
 */
public abstract class q0_0 {
    public int a;
    public final cm1_1 b;
    public String c;
    public final StringBuilder d;

    public q0_0() {
        int n3;
        Object object;
        int n4 = 8;
        Object[] objectArray = new Object[n4];
        ((cm1_1)object).a = objectArray;
        objectArray = new int[n4];
        int n7 = 0;
        while (true) {
            n3 = -1;
            if (n7 >= n4) break;
            objectArray[n7] = n3;
            ++n7;
        }
        ((cm1_1)object).b = (int[])objectArray;
        ((cm1_1)object).c = n3;
        this.b = object;
        this.d = object = new StringBuilder();
    }

    public static /* synthetic */ void r(q0_0 q0_02, String string2, int n3, String string3, int n4) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            n3 = q0_02.a;
        }
        if ((n4 &= 4) != 0) {
            string3 = "";
        }
        q0_02.q(n3, string2, string3);
        throw null;
    }

    public static boolean u(char n3) {
        int n4 = 44;
        n3 = n3 != n4 && n3 != (n4 = 58) && n3 != (n4 = 93) && n3 != (n4 = 125) ? 1 : 0;
        return n3 != 0;
    }

    public String A(int n3, int n4) {
        return ((Object)this.t().subSequence(n3, n4)).toString();
    }

    public final boolean B() {
        int n3;
        CharSequence charSequence;
        int n4;
        int n7 = this.z();
        if (n7 < (n4 = (charSequence = this.t()).length()) && n7 != (n4 = -1) && (n7 = (int)charSequence.charAt(n7)) == (n3 = 44)) {
            n7 = this.a;
            n3 = 1;
            this.a = n7 += n3;
            return n3 != 0;
        }
        return false;
    }

    public final boolean C(boolean bl2) {
        int n3;
        int n4;
        int n7 = this.z();
        n7 = this.y(n7);
        CharSequence charSequence = this.t();
        int n8 = charSequence.length() - n7;
        if (n8 >= (n4 = 4) && n7 != (n3 = -1)) {
            for (n3 = 0; n3 < n4; ++n3) {
                int n10;
                CharSequence charSequence2;
                char c2;
                String string2 = "null";
                char c3 = string2.charAt(n3);
                if (c3 == (c2 = (charSequence2 = this.t()).charAt(n10 = n7 + n3))) continue;
                return false;
            }
            if (n8 > n4 && (n8 = (int)r0_0.a((charSequence = this.t()).charAt(n3 = n7 + 4))) == 0) {
                return false;
            }
            if (bl2) {
                this.a = n7 += n4;
            }
            return true;
        }
        return false;
    }

    public final void D(char n3) {
        String string2;
        int n4;
        int n7;
        block7: {
            n7 = this.a;
            if (n7 > 0 && n3 == (n4 = 34)) {
                n4 = n7 + -1;
                this.a = n4;
                String string3 = this.l();
                string2 = "null";
                n7 = (int)(Intrinsics.areEqual(string3, string2) ? 1 : 0);
                if (n7 != 0) {
                    n3 = this.a + -1;
                    this.q(n3, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
                break block7;
                finally {
                    this.a = n7;
                }
            }
        }
        n3 = r0_0.a((char)n3);
        String string4 = r0_0.d((byte)n3);
        n7 = this.a;
        n4 = n7 + -1;
        CharSequence charSequence = this.t();
        int n8 = charSequence.length();
        if (n7 != n8 && n4 >= 0) {
            n7 = this.t().charAt(n4);
            string2 = String.valueOf((char)n7);
        } else {
            string2 = "EOF";
        }
        string4 = uc0_0.a("Expected ", string4, ", but had '", string2, "' instead");
        q0_0.r(this, string4, n4, null, 4);
        throw null;
    }

    public final int a(int n3, CharSequence charSequence) {
        int n4 = n3 + 4;
        int n7 = charSequence.length();
        if (n4 >= n7) {
            this.a = n3;
            this.o();
            n3 = this.a + 4;
            n4 = charSequence.length();
            if (n3 < n4) {
                n3 = this.a;
                return this.a(n3, charSequence);
            }
            q0_0.r(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        n7 = this.s(n3, charSequence) << 12;
        int n8 = n3 + 1;
        n8 = this.s(n8, charSequence) << 8;
        n7 += n8;
        n8 = n3 + 2;
        n8 = this.s(n8, charSequence) << 4;
        n3 += 3;
        n3 = (char)(this.s(n3, charSequence) + (n7 += n8));
        this.d.append((char)n3);
        return n4;
    }

    public void b(int n3, int n4) {
        StringBuilder stringBuilder = this.d;
        CharSequence charSequence = this.t();
        stringBuilder.append(charSequence, n3, n4);
    }

    public abstract boolean c();

    public final void d(int n3, String string2) {
        CharSequence charSequence = this.t();
        int n4 = charSequence.length() - n3;
        int n7 = string2.length();
        int n8 = 6;
        if (n4 >= n7) {
            int n10;
            n4 = string2.length();
            for (n7 = 0; n7 < n4; ++n7) {
                int n14;
                CharSequence charSequence2;
                int n15;
                char c2 = string2.charAt(n7);
                if (c2 == (n15 = (charSequence2 = this.t()).charAt(n14 = n3 + n7) | 0x20)) {
                    continue;
                }
                CharSequence charSequence3 = new StringBuilder("Expected valid boolean literal prefix, but had '");
                string2 = this.l();
                charSequence3.append(string2);
                charSequence3.append('\'');
                charSequence3 = charSequence3.toString();
                q0_0.r(this, (String)charSequence3, 0, null, n8);
                throw null;
            }
            this.a = n10 = string2.length() + n3;
            return;
        }
        q0_0.r(this, "Unexpected end of boolean literal", 0, null, n8);
        throw null;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte by2) {
        byte c2 = this.f();
        if (c2 != by2) {
            String string2;
            String string3 = r0_0.d(by2);
            int n3 = this.a;
            int n4 = n3 + -1;
            CharSequence charSequence = this.t();
            int n7 = charSequence.length();
            if (n3 != n7 && n4 >= 0) {
                char c3 = this.t().charAt(n4);
                string2 = String.valueOf(c3);
            } else {
                string2 = "EOF";
            }
            string3 = uc0_0.a("Expected ", string3, ", but had '", string2, "' instead");
            q0_0.r(this, string3, n4, null, 4);
            throw null;
        }
        return c2;
    }

    public abstract void h(char var1);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long i() {
        block26: {
            block27: {
                block33: {
                    block32: {
                        block29: {
                            block31: {
                                block30: {
                                    block28: {
                                        block24: {
                                            block23: {
                                                block25: {
                                                    var1_1 = this;
                                                    var2_2 = this.z();
                                                    var2_2 = this.y(var2_2);
                                                    var3_3 = this.t();
                                                    var4_4 = var3_3.length();
                                                    var5_5 = "EOF";
                                                    var6_6 = 6;
                                                    var7_7 = 0;
                                                    if (var2_2 >= var4_4 || var2_2 == (var4_4 = -1)) break block26;
                                                    var3_3 = this.t();
                                                    var4_4 = var3_3.charAt(var2_2);
                                                    if (var4_4 != (var8_8 = 34)) ** GOTO lbl20
                                                    var3_3 = this.t();
                                                    var4_4 = var3_3.length();
                                                    if (++var2_2 != var4_4) {
                                                        var4_4 = 1;
                                                    } else {
                                                        q0_0.r(this, (String)var5_5, 0, null, var6_6);
                                                        throw null;
lbl20:
                                                        // 1 sources

                                                        var4_4 = 0;
                                                        var3_3 = null;
                                                    }
                                                    var9_9 = var2_2;
                                                    var10_10 = 0L;
                                                    var12_11 = 0.0;
                                                    var14_12 = false;
                                                    var15_13 = false;
                                                    var16_14 = 0L;
                                                    block0: while (true) {
                                                        var18_15 = 0;
                                                        block1: while (true) {
                                                            var19_16 = this.t();
                                                            var20_17 = var19_16.length();
                                                            var21_18 = "Numeric value overflow";
                                                            if (var9_9 == var20_17) break block23;
                                                            var22_19 = this.t();
                                                            var20_17 = var22_19.charAt(var9_9);
                                                            if (!(var20_17 != (var6_6 = 101) && var20_17 != (var6_6 = 69) || var14_12)) {
                                                                if (var9_9 != var2_2) {
                                                                    ++var9_9;
                                                                    var6_6 = 6;
                                                                    var14_12 = true;
lbl42:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var18_15 = 1;
                                                                        continue block1;
                                                                        break;
                                                                    }
                                                                }
                                                                var23_26 /* !! */  = new StringBuilder("Unexpected symbol ");
                                                                var23_26 /* !! */ .append((char)var20_17);
                                                                var23_26 /* !! */ .append(" in numeric literal");
                                                                var23_26 /* !! */  = var23_26 /* !! */ .toString();
                                                                q0_0.r(var1_1, (String)var23_26 /* !! */ , 0, null, 6);
                                                                throw null;
                                                            }
                                                            var24_20 = "Unexpected symbol '-' in numeric literal";
                                                            var7_7 = 45;
                                                            if (var20_17 == var7_7 && var14_12) {
                                                                if (var9_9 != var2_2) {
                                                                    ++var9_9;
                                                                    var6_6 = 6;
                                                                    var7_7 = 0;
                                                                    continue block0;
                                                                }
                                                                q0_0.r(var1_1, var24_20, 0, null, 6);
                                                                throw null;
                                                            }
                                                            var7_7 = 43;
                                                            if (var20_17 == var7_7 && var14_12) {
                                                                if (var9_9 != var2_2) {
                                                                    ++var9_9;
                                                                    var6_6 = 6;
                                                                    var7_7 = 0;
                                                                    ** continue;
                                                                }
                                                                q0_0.r(var1_1, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                                                                throw null;
                                                            }
                                                            var25_21 = var5_5;
                                                            var7_7 = 6;
                                                            var26_22 = 45;
                                                            if (var20_17 == var26_22) {
                                                                if (var9_9 == var2_2) {
                                                                    ++var9_9;
                                                                    var6_6 = 6;
                                                                    var7_7 = 0;
                                                                    var15_13 = true;
                                                                    continue;
                                                                }
                                                                q0_0.r(var1_1, var24_20, 0, null, var7_7);
                                                                throw null;
                                                            }
                                                            var26_22 = r0_0.a((char)var20_17);
                                                            if (var26_22 != 0) break block24;
                                                            ++var9_9;
                                                            var26_22 = var20_17 + -48;
                                                            if (var26_22 < 0 || var26_22 >= (var6_6 = 10)) break block25;
                                                            if (!var14_12) break block0;
                                                            var27_23 = var6_6;
                                                            var10_10 *= var27_23;
                                                            var29_24 = var26_22;
                                                            var10_10 += var29_24;
lbl94:
                                                            // 2 sources

                                                            while (true) {
                                                                var5_5 = var25_21;
                                                                var6_6 = 6;
                                                                var7_7 = 0;
                                                                continue block1;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    var27_23 = var6_6;
                                                    var16_14 *= var27_23;
                                                    var29_24 = var26_22;
                                                    var16_14 -= var29_24;
                                                    var29_24 = 0L;
                                                    var31_25 = 0.0;
                                                    ** while ((var7_7 = (int)(var16_14 == var29_24 ? 0 : (var16_14 < var29_24 ? -1 : 1))) <= 0)
lbl106:
                                                    // 1 sources

                                                    q0_0.r(var1_1, var21_18, 0, null, 6);
                                                    throw null;
                                                }
                                                var23_27 /* !! */  = new StringBuilder("Unexpected symbol '");
                                                var23_27 /* !! */ .append((char)var20_17);
                                                var23_27 /* !! */ .append("' in numeric literal");
                                                var23_27 /* !! */  = var23_27 /* !! */ .toString();
                                                q0_0.r(var1_1, (String)var23_27 /* !! */ , 0, null, 6);
                                                throw null;
                                            }
                                            var25_21 = var5_5;
                                        }
                                        if (var9_9 != var2_2) {
                                            var26_22 = 1;
                                        } else {
                                            var26_22 = 0;
                                            var5_5 = null;
                                        }
                                        if (var2_2 == var9_9 || var15_13 && var2_2 == (var6_6 = var9_9 + -1)) break block27;
                                        if (var4_4 == 0) break block28;
                                        if (var26_22 == 0) ** GOTO lbl135
                                        var23_28 = this.t();
                                        var2_2 = var23_28.charAt(var9_9);
                                        if (var2_2 == (var4_4 = 34)) {
                                            ++var9_9;
                                        } else {
                                            q0_0.r(var1_1, "Expected closing quotation mark", 0, null, 6);
                                            throw null;
lbl135:
                                            // 1 sources

                                            var23_29 = var25_21;
                                            q0_0.r(var1_1, var25_21, 0, null, 6);
                                            throw null;
                                        }
                                    }
                                    var1_1.a = var9_9;
                                    if (!var14_12) break block29;
                                    var33_31 = var16_14;
                                    var29_24 = 0x4024000000000000L;
                                    var31_25 = 10.0;
                                    var7_7 = var18_15;
                                    if (var18_15 != 0) break block30;
                                    var12_11 = -((double)var10_10);
                                    var31_25 = Math.pow(var31_25, var12_11);
                                    break block31;
                                }
                                var20_17 = 1;
                                if (var18_15 != var20_17) ** GOTO lbl181
                                var12_11 = var10_10;
                                var31_25 = Math.pow(var31_25, var12_11);
                            }
                            var33_31 *= var31_25;
                            var29_24 = 4890909195324358656L;
                            var31_25 = 9.223372036854776E18;
                            var7_7 = (int)(var33_31 == var31_25 ? 0 : (var33_31 > var31_25 ? 1 : -1));
                            if (var7_7 > 0) ** GOTO lbl179
                            var29_24 = -4332462841530417152L;
                            var31_25 = -9.223372036854776E18;
                            cfr_temp_0 = var33_31 - var31_25;
                            var7_7 = (int)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                            if (var7_7 < 0) ** GOTO lbl179
                            var31_25 = Math.floor(var33_31);
                            cfr_temp_1 = var31_25 - var33_31;
                            var7_7 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                            if (var7_7 == 0) {
                                var16_14 = (long)var33_31;
                            } else {
                                var5_5 = new StringBuilder("Can't convert ");
                                var5_5.append(var33_31);
                                var5_5.append(" to Long");
                                var23_28 = var5_5.toString();
                                q0_0.r(var1_1, (String)var23_28, 0, null, 6);
                                throw null;
lbl179:
                                // 2 sources

                                q0_0.r(var1_1, var21_18, 0, null, 6);
                                throw null;
lbl181:
                                // 1 sources

                                var23_28 = new NoWhenBranchMatchedException();
                                throw var23_28;
                            }
                        }
                        if (var15_13) break block32;
                        var35_32 = -9223372036854775808L;
                        var33_31 = -0.0;
                        var26_22 = (int)(var16_14 == var35_32 ? 0 : (var16_14 < var35_32 ? -1 : 1));
                        if (var26_22 == 0) break block33;
                        var16_14 = -var16_14;
                    }
                    return var16_14;
                }
                q0_0.r(var1_1, var21_18, 0, null, 6);
                throw null;
            }
            var4_4 = 6;
            var26_22 = 0;
            var5_5 = null;
            q0_0.r(var1_1, "Expected numeric literal", 0, null, var4_4);
            throw null;
        }
        var23_30 = var5_5;
        q0_0.r(var1_1, (String)var5_5, 0, null, 6);
        throw null;
    }

    public final String j() {
        String string2 = this.c;
        if (string2 != null) {
            Intrinsics.checkNotNull(string2);
            this.c = null;
            return string2;
        }
        return this.e();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String k(int var1_1, int var2_2, CharSequence var3_3) {
        var4_4 = "source";
        Intrinsics.checkNotNullParameter(var3_3, (String)var4_4);
        var5_5 = var3_3.charAt(var2_2);
        var6_6 = 0;
        while (true) {
            block8: {
                block7: {
                    var7_7 = 34;
                    var8_8 = 1;
                    if (var5_5 == var7_7) break;
                    var9_9 = "Unexpected EOF";
                    var10_10 = 4;
                    var11_11 = 92;
                    var12_12 = -1;
                    if (var5_5 != var11_11) ** GOTO lbl54
                    this.b(var1_1, var2_2);
                    var1_1 = this.y(++var2_2);
                    var2_2 = 6;
                    if (var1_1 == var12_12) ** GOTO lbl52
                    var4_4 = this.t();
                    var6_6 = var1_1 + 1;
                    if ((var1_1 = (int)var4_4.charAt(var1_1)) != (var5_5 = 117)) break block7;
                    var13_13 = this.t();
                    var6_6 = this.a(var6_6, var13_13);
                    break block8;
                }
                if (var1_1 < var5_5) {
                    var4_4 = hs_2.a;
                    var5_5 = (char)var4_4[var1_1];
                } else {
                    var5_5 = 0;
                    var4_4 = null;
                }
                if (var5_5 == 0) ** GOTO lbl44
                var13_13 = this.d;
                var13_13.append(var5_5);
            }
            var1_1 = this.y(var6_6);
            if (var1_1 != var12_12) {
                while (true) {
                    var2_2 = var1_1;
                    var6_6 = 1;
                    break;
                }
            } else {
                q0_0.r(this, var9_9, var1_1, null, var10_10);
                throw null;
lbl44:
                // 1 sources

                var3_3 = new StringBuilder("Invalid escaped char '");
                var3_3.append((char)var1_1);
                var3_3.append('\'');
                var13_13 = var3_3.toString();
                q0_0.r(this, (String)var13_13, 0, null, var2_2);
                throw null;
lbl52:
                // 1 sources

                q0_0.r(this, "Expected escape sequence to continue, got EOF", 0, null, var2_2);
                throw null;
lbl54:
                // 1 sources

                var5_5 = (char)var3_3.length();
                if (++var2_2 >= var5_5) {
                    this.b(var1_1, var2_2);
                    var1_1 = this.y(var2_2);
                    if (var1_1 != var12_12) ** continue;
                    q0_0.r(this, var9_9, var1_1, null, var10_10);
                    throw null;
                }
            }
            var5_5 = var3_3.charAt(var2_2);
        }
        var13_13 = var6_6 == 0 ? this.A(var1_1, var2_2) : this.n(var1_1, var2_2);
        this.a = var2_2 += var8_8;
        return var13_13;
    }

    public final String l() {
        CharSequence charSequence;
        int n3;
        String string2 = this.c;
        int n4 = 0;
        String string3 = null;
        if (string2 != null) {
            Intrinsics.checkNotNull(string2);
            this.c = null;
            return string2;
        }
        int n7 = this.z();
        if (n7 < (n3 = (charSequence = this.t()).length()) && n7 != (n3 = -1)) {
            int n8;
            CharSequence charSequence2 = this.t();
            int n10 = r0_0.a(charSequence2.charAt(n7));
            if (n10 == (n8 = 1)) {
                return this.j();
            }
            if (n10 == 0) {
                n4 = 0;
                string3 = null;
                while ((n10 = r0_0.a((charSequence2 = this.t()).charAt(n7))) == 0) {
                    charSequence2 = this.t();
                    n10 = charSequence2.length();
                    if (++n7 < n10) continue;
                    n4 = this.a;
                    this.b(n4, n7);
                    n4 = this.y(n7);
                    if (n4 == n3) {
                        this.a = n7;
                        return this.n(0, 0);
                    }
                    n7 = n4;
                    n4 = 1;
                }
                if (n4 == 0) {
                    n4 = this.a;
                    string3 = this.A(n4, n7);
                } else {
                    n4 = this.a;
                    string3 = this.n(n4, n7);
                }
                this.a = n7;
                return string3;
            }
            charSequence = new StringBuilder("Expected beginning of the string, but got ");
            n7 = this.t().charAt(n7);
            ((StringBuilder)charSequence).append((char)n7);
            string2 = ((StringBuilder)charSequence).toString();
            q0_0.r(this, string2, 0, null, 6);
            throw null;
        }
        q0_0.r(this, "EOF", n7, null, 4);
        throw null;
    }

    public final String m() {
        CharSequence charSequence;
        String string2 = this.l();
        char c2 = Intrinsics.areEqual(string2, charSequence = "null");
        if (c2 != '\u0000') {
            charSequence = this.t();
            int n3 = this.a + -1;
            c2 = charSequence.charAt(n3);
            if (c2 != (n3 = 34)) {
                q0_0.r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return string2;
    }

    public final String n(int n3, int n4) {
        this.b(n3, n4);
        StringBuilder stringBuilder = this.d;
        String string2 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        stringBuilder.setLength(0);
        return string2;
    }

    public void o() {
    }

    public final void p() {
        char c2;
        char c3 = this.f();
        if (c3 == (c2 = '\n')) {
            return;
        }
        CharSequence charSequence = new StringBuilder("Expected EOF after parsing, but had ");
        CharSequence charSequence2 = this.t();
        int n3 = this.a + -1;
        c2 = charSequence2.charAt(n3);
        charSequence.append(c2);
        charSequence.append(" instead");
        charSequence = charSequence.toString();
        q0_0.r(this, (String)charSequence, 0, null, 6);
        throw null;
    }

    public final void q(int n3, String charSequence, String string2) {
        Intrinsics.checkNotNullParameter(charSequence, "message");
        String string3 = "hint";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n4 = string2.length();
        if (n4 == 0) {
            string2 = "";
        } else {
            string3 = "\n";
            string2 = string3.concat(string2);
        }
        charSequence = nn_2.a((String)charSequence, " at path: ");
        string3 = this.b.a();
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        throw HT2.d(this.t(), n3, (String)charSequence);
    }

    public final int s(int n3, CharSequence charSequence) {
        block5: {
            block3: {
                int n4;
                block4: {
                    block2: {
                        int n7;
                        n4 = 48;
                        if (n4 > (n3 = (int)charSequence.charAt(n3)) || n3 >= (n7 = 58)) break block2;
                        n3 -= n4;
                        break block3;
                    }
                    n4 = 97;
                    if (n4 > n3 || n3 >= (n4 = 103)) break block4;
                    n3 += -87;
                    break block3;
                }
                n4 = 65;
                if (n4 > n3 || n3 >= (n4 = 71)) break block5;
                n3 += -55;
            }
            return n3;
        }
        charSequence = new StringBuilder("Invalid toHexChar char '");
        ((StringBuilder)charSequence).append((char)n3);
        ((StringBuilder)charSequence).append("' in unicode escape");
        String string2 = ((StringBuilder)charSequence).toString();
        q0_0.r(this, string2, 0, null, 6);
        throw null;
    }

    public abstract CharSequence t();

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JsonReader(source='");
        CharSequence charSequence = this.t();
        stringBuilder.append((Object)charSequence);
        stringBuilder.append("', currentPosition=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }

    public abstract String v(String var1, boolean var2);

    public byte w() {
        char c2;
        char c3;
        CharSequence charSequence = this.t();
        int c32 = this.a;
        while (true) {
            char c5;
            c3 = this.y(c3);
            char c6 = '\uffffffff';
            c2 = '\n';
            if (c3 == c6) break;
            c6 = charSequence.charAt(c3);
            if (c6 != (c5 = '\t') && c6 != c2 && c6 != (c2 = '\r') && c6 != (c2 = ' ')) {
                this.a = c3;
                return r0_0.a(c6);
            }
            ++c3;
        }
        this.a = c3;
        return (byte)c2;
    }

    public final String x(boolean bl2) {
        String string2;
        byte by2 = this.w();
        byte by4 = 1;
        if (bl2) {
            if (by2 != by4 && by2 != 0) {
                return null;
            }
            string2 = this.l();
        } else {
            if (by2 != by4) {
                return null;
            }
            string2 = this.j();
        }
        this.c = string2;
        return string2;
    }

    public abstract int y(int var1);

    public abstract int z();
}

