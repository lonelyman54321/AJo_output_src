/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class ie
implements eI0 {
    public static final int[] s;
    public static final int[] t;
    public static final byte[] u;
    public static final byte[] v;
    public final byte[] a;
    public final int b;
    public final jq0_0 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int i;
    public int j;
    public long k;
    public gi0_0 l;
    public wp3 m;
    public wp3 n;
    public dx2_1 o;
    public boolean p;
    public long q;
    public boolean r;

    static {
        Object object;
        int[] nArray;
        int n3 = 16;
        int[] nArray2 = nArray = new int[n3];
        int[] nArray3 = nArray;
        nArray2[0] = 13;
        nArray3[1] = 14;
        nArray2[2] = 16;
        nArray3[3] = 18;
        nArray2[4] = 20;
        nArray3[5] = 21;
        nArray2[6] = 27;
        nArray3[7] = 32;
        nArray2[8] = 6;
        nArray3[9] = 7;
        nArray2[10] = 6;
        nArray3[11] = 6;
        nArray2[12] = 1;
        nArray3[13] = 1;
        nArray2[14] = 1;
        nArray3[15] = 1;
        s = nArray;
        int[] nArray4 = object = new int[n3];
        int[] nArray5 = object;
        nArray4[0] = 18;
        nArray5[1] = 24;
        nArray4[2] = 33;
        nArray5[3] = 37;
        nArray4[4] = 41;
        nArray5[5] = 47;
        nArray4[6] = 51;
        nArray5[7] = 59;
        nArray4[8] = 61;
        nArray5[9] = 6;
        nArray4[10] = 1;
        nArray5[11] = 1;
        nArray4[12] = 1;
        nArray5[13] = 1;
        nArray4[14] = 1;
        nArray5[15] = 1;
        t = object;
        n3 = gz3.a;
        object = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes((Charset)object);
        v = "#!AMR-WB\n".getBytes((Charset)object);
    }

    public ie() {
        this.b = 0;
        Object object = new byte[1];
        this.a = object;
        this.i = -1;
        object = new jq0_0;
        this.c = object;
        this.n = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        block30: {
            block32: {
                block31: {
                    block29: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_5 = false;
                        var6_6 = null;
                        var7_7 = 1;
                        ct3.h(this.m);
                        var8_8 /* !! */  = gz3.a;
                        var9_9 = var1_1;
                        var9_9 = (il0_0)var1_1;
                        var10_10 = var9_9.d;
                        var12_11 = 0L;
                        var14_12 = var10_10 == var12_11 ? 0 : (var10_10 < var12_11 ? -1 : 1);
                        if (var14_12 == false) {
                            var9_9 = var1_1;
                            var9_9 = (il0_0)var1_1;
                            var8_8 /* !! */  = (int)this.f((il0_0)var9_9);
                            if (var8_8 /* !! */  == 0) {
                                throw ParserException.a("Could not find AMR header.", null);
                            }
                        }
                        if ((var8_8 /* !! */  = (int)var3_3.r) == 0) {
                            var3_3.r = var7_7;
                            var8_8 /* !! */  = (int)var3_3.d;
                            var15_13 = var8_8 /* !! */  != 0 ? "audio/amr-wb" : "audio/3gpp";
                            var14_12 = var8_8 /* !! */  != 0 ? (long)16000 : (long)8000;
                            if (var8_8 /* !! */  != 0) {
                                var9_9 = ie.t;
                                var16_14 = 8;
                                var8_8 /* !! */  = (int)var9_9[var16_14];
                            } else {
                                var9_9 = ie.s;
                                var16_15 = 7;
                                var8_8 /* !! */  = (int)var9_9[var16_15];
                            }
                            var17_16 = var3_3.n;
                            var18_17 = new d$a();
                            var15_13 = ip1_0.l((String)var15_13);
                            var18_17.n = var15_13;
                            var18_17.o = var8_8 /* !! */ ;
                            var18_17.C = var7_7;
                            var18_17.D = (int)var14_12;
                            var9_9 = new d((d$a)var18_17);
                            var17_16.d((d)var9_9);
                        }
                        var8_8 /* !! */  = var3_3.g;
                        var19_18 = 20000L;
                        var21_19 = -1;
                        if (var8_8 /* !! */  != 0) break block30;
                        var9_9 = var4_4;
                        try {
                            var9_9 = (il0_0)var4_4;
                        }
                        catch (EOFException v0) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var8_8 /* !! */  = -1;
                                break;
                            }
                        }
                        var8_8 /* !! */  = var3_3.d((il0_0)var9_9);
                        var3_3.f = var8_8 /* !! */ ;
                        var3_3.g = var8_8 /* !! */ ;
                        var22_20 = var3_3.i;
                        if (var22_20 != var21_19) break block29;
                        var18_17 = var4_4;
                        var18_17 = (il0_0)var4_4;
                        var3_3.h = var23_21 = var18_17.d;
                        var3_3.i = var8_8 /* !! */ ;
                    }
                    if ((var22_20 = var3_3.i) == var8_8 /* !! */ ) {
                        var3_3.j = var22_20 = var3_3.j + var7_7;
                    }
                    if ((var25_22 = (var18_17 = var3_3.o) instanceof hg1_0) == 0) break block30;
                    var18_17 = (hg1_0)var18_17;
                    var26_23 = var3_3.k;
                    var28_24 = var3_3.e;
                    var26_23 = var26_23 + var28_24 + var19_18;
                    var30_25 = var4_4;
                    var30_25 = (il0_0)var4_4;
                    var28_24 = var30_25.d;
                    var12_11 = var8_8 /* !! */ ;
                    var28_24 += var12_11;
                    var9_9 = var18_17.b;
                    var31_26 = var9_9.a;
                    if (var31_26 == 0) break block31;
                    var12_11 = var9_9.c(var31_26 -= var7_7);
                    var32_27 = 100000L;
                    cfr_temp_0 = (var12_11 = var26_23 - var12_11) - var32_27;
                    var8_8 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var8_8 /* !! */  < 0) break block32;
                }
                var18_17.a(var26_23, var28_24);
            }
            var8_8 /* !! */  = (int)var3_3.p;
            if (var8_8 /* !! */  != 0 && (var8_8 /* !! */  = (int)((cfr_temp_1 = (var12_11 = Math.abs(var3_3.q - var26_23)) - var19_18) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
                var3_3.p = false;
                var3_3.n = var9_9 = var3_3.m;
            }
        }
        ** while ((var8_8 /* !! */  = (var9_9 = var3_3.n).c((mi0_0)var4_4, (int)(var31_26 = var3_3.g), (boolean)var7_7)) == var21_19)
lbl95:
        // 1 sources

        var3_3.g = var31_26 = var3_3.g - var8_8 /* !! */ ;
        if (var31_26 > 0) lbl-1000:
        // 2 sources

        {
            while (true) {
                var8_8 /* !! */  = 0;
                var9_9 = null;
                break;
            }
        } else {
            var9_9 = var3_3.n;
            var12_11 = var3_3.k;
            var23_21 = var3_3.e;
            var34_28 = var12_11 + var23_21;
            var31_26 = var3_3.f;
            var36_29 = 1;
            var9_9.a(var34_28, var36_29, var31_26, 0, null);
            var3_3.e = var12_11 = var3_3.e + var19_18;
            ** continue;
        }
        var4_4 = (il0_0)var4_4;
        var37_30 = var3_3.o;
        if (var37_30 == null) {
            var31_26 = var3_3.b;
            var38_31 = var31_26 & 4;
            var23_21 = -9223372036854775807L;
            if (var38_31 != 0) {
                var12_11 = var3_3.h;
                var39_32 = new long[var7_7];
                var39_32[0] = var12_11;
                var40_33 = new long[var7_7];
                var40_33[0] = var12_11 = 0L;
                var3_3.o = var4_4 = new hg1_0(var39_32, var40_33, var23_21);
            } else {
                var38_31 = var31_26 & 1;
                if (var38_31 != 0 && ((var38_31 = var3_3.i) == var21_19 || var38_31 == (var41_34 = var3_3.f))) {
                    var22_20 = var3_3.j;
                    var25_22 = 20;
                    if (var22_20 >= var25_22 || var8_8 /* !! */  == var21_19) {
                        var42_35 = (var31_26 &= 2) != 0;
                        var43_36 = var38_31;
                        var23_21 = 8000000L;
                        var43_36 = var43_36 * var23_21 / var19_18;
                        var7_7 = (int)var43_36;
                        var19_18 = var3_3.h;
                        var28_24 = var4_4.c;
                        var3_3.o = var6_6 = new n50_0(var28_24, var19_18, var7_7, var38_31, var42_35);
                    }
                } else {
                    var3_3.o = var4_4 = new dX2$b(var23_21);
                }
            }
            var4_4 = var3_3.o;
            if (var4_4 != null) {
                var6_6 = var3_3.l;
                var6_6.h((dx2_1)var4_4);
            }
        }
        if (var8_8 /* !! */  == var21_19 && (var5_5 = (var4_4 = var3_3.o) instanceof hg1_0)) {
            var43_36 = var3_3.k;
            var45_37 = var3_3.e;
            var15_13 = var4_4;
            var15_13 = (hg1_0)var4_4;
            var15_13.c = var43_36 += var45_37;
            var6_6 = var3_3.l;
            var6_6.h((dx2_1)var4_4);
        }
        return var8_8 /* !! */ ;
    }

    public final boolean b(fi0_0 fi0_02) {
        fi0_02 = (il0_0)fi0_02;
        return this.f((il0_0)fi0_02);
    }

    public final void c(long l2, long l3) {
        long l4;
        this.e = l4 = 0L;
        this.f = 0;
        this.g = 0;
        this.q = l3;
        Object object = this.o;
        Object object2 = object instanceof hg1_0;
        if (object2) {
            int n3;
            object = (hg1_0)object;
            ZA1 zA1 = ((hg1_0)object).b;
            int n4 = zA1.a;
            if (n4 == 0) {
                l2 = -9223372036854775807L;
            } else {
                object = ((hg1_0)object).a;
                n3 = gz3.b((ZA1)object, l2);
                l2 = zA1.c(n3);
            }
            this.k = l2;
            l2 = Math.abs(this.q - l2);
            l3 = 20000L;
            n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n4 >= 0) {
                n3 = 1;
                this.p = n3;
                jq0_0 jq0_02 = this.c;
                this.n = jq0_02;
            }
        } else {
            object2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (object2 && (object2 = object instanceof n50_0)) {
                object = (n50_0)object;
                long l7 = ((n50_0)object).b;
                l2 -= l7;
                l2 = Math.max(l4, l2);
                l4 = 8000000L;
                l2 *= l4;
                int n7 = ((n50_0)object).e;
                l3 = n7;
                this.k = l2 /= l3;
            } else {
                this.k = l4;
            }
        }
    }

    public final int d(il0_0 il0_02) {
        Object object = null;
        il0_02.f = 0;
        byte[] byArray = this.a;
        int n3 = 1;
        il0_02.b(byArray, 0, n3, false);
        Object object2 = byArray[0];
        int n4 = object2 & 0x83;
        byArray = null;
        if (n4 <= 0) {
            object2 >>= 3;
            n4 = 15;
            if ((object2 &= n4) >= 0 && object2 <= n4 && ((n4 = (int)(this.d ? 1 : 0)) != 0 && (object2 < (n3 = 10) || object2 > (n3 = 13)) || n4 == 0 && (object2 < (n3 = 12) || object2 > (n3 = 14)))) {
                if (n4 != 0) {
                    object = t;
                    object2 = object[object2];
                } else {
                    object = s;
                    object2 = object[object2];
                }
                return object2;
            }
            String string2 = "Illegal AMR ";
            object = new StringBuilder(string2);
            n3 = (int)(this.d ? 1 : 0);
            string2 = n3 != 0 ? "WB" : "NB";
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(" frame type ");
            ((StringBuilder)object).append((int)object2);
            throw ParserException.a(((StringBuilder)object).toString(), null);
        }
        object = new StringBuilder("Invalid padding bits for frame header ");
        ((StringBuilder)object).append((int)object2);
        throw ParserException.a(((StringBuilder)object).toString(), null);
    }

    public final eI0 e() {
        return this;
    }

    public final boolean f(il0_0 il0_02) {
        int n3 = 0;
        il0_02.f = 0;
        byte[] byArray = u;
        byte[] byArray2 = new byte[byArray.length];
        boolean bl2 = byArray.length;
        il0_02.b(byArray2, 0, (int)(bl2 ? 1 : 0), false);
        boolean bl3 = Arrays.equals(byArray2, byArray);
        bl2 = true;
        if (bl3) {
            this.d = false;
            n3 = byArray.length;
            il0_02.j(n3);
            return bl2;
        }
        il0_02.f = 0;
        byArray = v;
        byArray2 = new byte[byArray.length];
        int n4 = byArray.length;
        il0_02.b(byArray2, 0, n4, false);
        bl3 = Arrays.equals(byArray2, byArray);
        if (bl3) {
            this.d = bl2;
            n3 = byArray.length;
            il0_02.j(n3);
            return bl2;
        }
        return false;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        wp3 wp32;
        this.l = gi0_02;
        this.m = wp32 = gi0_02.n(0, 1);
        this.n = wp32;
        gi0_02.j();
    }

    public final void release() {
    }
}

