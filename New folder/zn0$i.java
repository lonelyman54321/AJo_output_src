/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public final class zn0$i
extends zn0$h {
    public final boolean e;
    public final zn0$d f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;

    /*
     * Unable to fully structure code
     */
    public zn0$i(int var1_1, qp3 var2_2, int var3_3, zn0$d var4_4, int var5_5, int var6_6, boolean var7_7) {
        block37: {
            block36: {
                var8_8 = 4;
                var9_9 = -1;
                var10_10 = 2;
                var11_11 = 0;
                var12_12 = 1;
                super(var1_1, (qp3)var2_2, var3_3);
                this.f = var4_4;
                var1_1 = (int)var4_4.F;
                var1_1 = var1_1 != 0 ? 24 : 16;
                var13_13 = var4_4.E;
                if (var13_13 != 0 && (var13_13 = var6_6 & var1_1) != 0) {
                    var13_13 = 1;
                    var14_14 = 1.4E-45f;
                } else {
                    var13_13 = 0;
                    var14_14 = 0.0f;
                    var2_2 = null;
                }
                this.o = var13_13;
                var13_13 = -1082130432;
                var14_14 = -1.0f;
                if (var7_7 == 0) ** GOTO lbl-1000
                var15_15 = this.d;
                var6_6 = var15_15.v;
                if (!(var6_6 != var9_9 && var6_6 > (var16_16 = var4_4.a) || (var6_6 = var15_15.w) != var9_9 && var6_6 > (var16_16 = var4_4.b) || (var16_16 = (int)((cfr_temp_0 = (var17_17 = var15_15.x) - var14_14) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) != 0 && (var6_6 = (int)((cfr_temp_1 = var17_17 - (var18_18 = (float)(var16_16 = var4_4.c))) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1))) > 0 || (var3_3 = var15_15.j) != var9_9 && var3_3 > (var6_6 = var4_4.d))) {
                    var3_3 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = 0;
                    var15_15 = null;
                }
                this.e = var3_3;
                if (var7_7 == 0) ** GOTO lbl-1000
                var15_15 = this.d;
                var6_6 = var15_15.v;
                if (!(var6_6 != var9_9 && var6_6 < (var7_7 = var4_4.e) || (var6_6 = var15_15.w) != var9_9 && var6_6 < (var7_7 = var4_4.f) || (var7_7 = (int)((cfr_temp_2 = (var17_17 = var15_15.x) - var14_14) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) != 0 && (var6_6 = (int)((cfr_temp_3 = var17_17 - (var19_19 = (float)(var7_7 = var4_4.g))) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) < 0 || (var3_3 = var15_15.j) != var9_9 && var3_3 < (var6_6 = var4_4.h))) {
                    var3_3 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = 0;
                    var15_15 = null;
                }
                this.g = var3_3;
                var3_3 = (int)tj2_0.d(var5_5, false);
                this.h = var3_3;
                var15_15 = this.d;
                var17_17 = var15_15.x;
                var13_13 = (int)(var17_17 == var14_14 ? 0 : (var17_17 > var14_14 ? 1 : -1));
                if (var13_13 != 0 && (var13_13 = (int)((cfr_temp_4 = var17_17 - (var14_14 = 10.0f)) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) >= 0) {
                    var13_13 = 1;
                    var14_14 = 1.4E-45f;
                } else {
                    var13_13 = 0;
                    var14_14 = 0.0f;
                    var2_2 = null;
                }
                this.i = var13_13;
                this.j = var13_13 = var15_15.j;
                this.k = var13_13 = var15_15.b();
                var13_13 = this.d.f;
                var3_3 = var4_4.m;
                this.m = var13_13 = zn0.h(var13_13, var3_3);
                var2_2 = this.d;
                var13_13 = var2_2.f;
                if (var13_13 != 0 && (var13_13 &= var12_12) == 0) {
                    var13_13 = 0;
                    var14_14 = 0.0f;
                    var2_2 = null;
                } else {
                    var13_13 = 1;
                    var14_14 = 1.4E-45f;
                }
                this.n = var13_13;
                var14_14 = 0.0f;
                var2_2 = null;
                for (var13_13 = 0; var13_13 < (var6_6 = (var15_15 = var4_4.l).size()); var13_13 += var12_12) {
                    var20_20 = this.d.o;
                    if (var20_20 == null || (var3_3 = (int)var20_20.equals(var15_15 = var15_15.get(var13_13))) == 0) {
                        continue;
                    }
                    break block36;
                }
                var13_13 = -1 >>> 1;
                var14_14 = 0.0f / 0.0f;
            }
            this.l = var13_13;
            var13_13 = tj2_0.b(var5_5);
            var3_3 = 128;
            if (var13_13 == var3_3) {
                var13_13 = 1;
                var14_14 = 1.4E-45f;
            } else {
                var13_13 = 0;
                var14_14 = 0.0f;
                var2_2 = null;
            }
            this.q = var13_13;
            var13_13 = tj2_0.c(var5_5);
            var3_3 = 64;
            if (var13_13 == var3_3) {
                var13_13 = 1;
                var14_14 = 1.4E-45f;
            } else {
                var13_13 = 0;
                var14_14 = 0.0f;
                var2_2 = null;
            }
            this.r = var13_13;
            var2_2 = this.d.o;
            if (var2_2 == null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_8 = 0;
                    break block37;
                    break;
                }
            }
            var3_3 = var2_2.hashCode();
            switch (var3_3) lbl-1000:
            // 6 sources

            {
                default: {
                    var13_13 = -1;
                    var14_14 = 0.0f / 0.0f;
                    break;
                }
                case 1599127257: {
                    var15_15 = "video/x-vnd.on2.vp9";
                    var13_13 = (int)var2_2.equals(var15_15);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 4;
                    var14_14 = 5.6E-45f;
                    break;
                }
                case 1331836730: {
                    var15_15 = "video/avc";
                    var13_13 = (int)var2_2.equals(var15_15);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 3;
                    var14_14 = 4.2E-45f;
                    break;
                }
                case -1662541442: {
                    var15_15 = "video/hevc";
                    var13_13 = (int)var2_2.equals(var15_15);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 2;
                    var14_14 = 2.8E-45f;
                    break;
                }
                case -1662735862: {
                    var15_15 = "video/av01";
                    var13_13 = (int)var2_2.equals(var15_15);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 1;
                    var14_14 = 1.4E-45f;
                    break;
                }
                case -1851077871: {
                    var15_15 = "video/dolby-vision";
                    var13_13 = (int)var2_2.equals(var15_15);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 0;
                    var14_14 = 0.0f;
                    var2_2 = null;
                }
            }
            switch (var13_13) {
                default: {
                    ** continue;
                }
                case 4: {
                    var8_8 = 2;
                    break;
                }
                case 3: {
                    var8_8 = 1;
                    break;
                }
                case 2: {
                    var8_8 = 3;
                    break;
                }
                case 0: {
                    var8_8 = 5;
                }
                case 1: 
            }
        }
        this.s = var8_8;
        var2_2 = this.d;
        var3_3 = var2_2.f & 16384;
        if (var3_3 == 0) {
            var15_15 = this.f;
            var21_21 = var15_15.O;
            if ((var21_21 = tj2_0.d(var5_5, var21_21)) && ((var21_21 = this.e) || (var6_6 = (int)var15_15.D) != 0)) {
                var6_6 = (int)tj2_0.d(var5_5, false);
                if (var6_6 == 0 || (var6_6 = (int)this.g) == 0 || !var21_21 || (var13_13 = var2_2.j) == var9_9 || (var13_13 = (int)var15_15.z) != 0 || (var13_13 = (int)var15_15.y) != 0 || (var1_1 &= var5_5) == 0) {
                    var10_10 = 1;
                }
                var11_11 = var10_10;
            }
        }
        this.p = var11_11;
    }

    public final int a() {
        return this.p;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(zn0$h zn0$h) {
        Object object;
        zn0$h = (zn0$i)zn0$h;
        boolean bl2 = this.o;
        if (!bl2) {
            object = this.d.o;
            String string2 = zn0$h.d.o;
            bl2 = Objects.equals(object, string2);
            if (!bl2) return false;
        }
        object = this.f;
        bl2 = ((zn0$d)object).G;
        if (bl2) return true;
        boolean bl3 = this.q;
        bl2 = ((zn0$i)zn0$h).q;
        if (bl3 != bl2) return false;
        bl2 = this.r;
        boolean bl4 = ((zn0$i)zn0$h).r;
        if (bl2 != bl4) return false;
        return true;
    }
}

