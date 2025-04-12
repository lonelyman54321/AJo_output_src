/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.SpannableStringBuilder
 */
import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eR
 */
public final class er_1
extends gr_1 {
    public final Xm2 h;
    public final Vm2 i;
    public int j;
    public final int k;
    public final eR$b[] l;
    public eR$b m;
    public List n;
    public List o;
    public eR$c p;
    public int q;

    public er_1(int n3, List object) {
        Object object2;
        int n4;
        Object[] objectArray = new Xm2();
        this.h = objectArray;
        objectArray = new Vm2();
        this.i = objectArray;
        this.j = n4 = -1;
        int n7 = 1;
        if (n3 == n4) {
            n3 = 1;
        }
        this.k = n3;
        n3 = 0;
        eR$b eR$b = null;
        if (object != null) {
            objectArray = LW.a;
            n4 = object.size();
            if (n4 == n7 && (n4 = (objectArray = (Object[])((byte[])object.get(0))).length) == n7) {
                object = (byte[])object.get(0);
                object2 = object[0];
            }
        }
        object2 = 8;
        objectArray = new eR$b[object2];
        this.l = objectArray;
        objectArray = null;
        for (n4 = 0; n4 < object2; n4 += n7) {
            eR$b eR$b2;
            eR$b[] eR$bArray = this.l;
            eR$bArray[n4] = eR$b2 = new eR$b();
        }
        this.m = eR$b = this.l[0];
    }

    public final void flush() {
        eR$b eR$b;
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = eR$b = this.l[0];
        this.m();
        this.p = null;
    }

    public final hr_1 g() {
        List list;
        this.o = list = this.n;
        list.getClass();
        hr_1 hr_12 = new hr_1(list);
        return hr_12;
    }

    public final void h(gR$a object) {
        int n3;
        object = ((DecoderInputBuffer)object).d;
        object.getClass();
        Object object2 = ((ByteBuffer)object).array();
        int n4 = ((Buffer)object).limit();
        Xm2 xm2 = this.h;
        xm2.G(n4, (byte[])object2);
        while ((n4 = xm2.a()) >= (n3 = 3)) {
            n4 = xm2.w();
            int n7 = n4 & 3;
            int n8 = 4;
            int n10 = 1;
            boolean bl2 = false;
            if ((n4 &= n8) == n8) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            byte by2 = (byte)xm2.w();
            byte by4 = (byte)xm2.w();
            int n14 = 2;
            if (n7 != n14 && n7 != n3 || n4 == 0) continue;
            if (n7 == n3) {
                Object object3;
                this.k();
                n4 = (by2 & 0xC0) >> 6;
                n3 = this.j;
                n7 = -1;
                if (n3 != n7 && n4 != (n3 = (n3 + 1) % n8)) {
                    this.m();
                    object2 = new StringBuilder;
                    ((StringBuilder)object2)("Sequence number discontinuity. previous=");
                    n7 = this.j;
                    ((StringBuilder)object2).append(n7);
                    object3 = " current=";
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append(n4);
                    object2 = ((StringBuilder)object2).toString();
                    Cx.f((String)object2);
                }
                this.j = n4;
                n3 = by2 & 0x3F;
                if (n3 == 0) {
                    n3 = 64;
                }
                object3 = new eR$c(n4, n3);
                this.p = object3;
                ((eR$c)object3).d = n10;
                object = ((eR$c)object3).c;
                object[0] = by4;
            } else {
                if (n7 == n14) {
                    bl2 = true;
                }
                ct3.a(bl2);
                object = this.p;
                if (object == null) {
                    object = "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START";
                    Cx.c((String)object);
                    continue;
                }
                n3 = ((eR$c)object).d;
                ((eR$c)object).d = n7 = n3 + 1;
                byte[] byArray = ((eR$c)object).c;
                byArray[n3] = by2;
                ((eR$c)object).d = n3 += n14;
                byArray[n7] = by4;
            }
            object = this.p;
            n3 = ((eR$c)object).d;
            n4 = ((eR$c)object).b * 2 - n10;
            if (n3 != n4) continue;
            this.k();
        }
    }

    public final boolean j() {
        boolean bl2;
        List list = this.n;
        List list2 = this.o;
        if (list != list2) {
            bl2 = true;
        } else {
            bl2 = false;
            list = null;
        }
        return bl2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final void k() {
        var1_1 = this;
        var2_2 = this.p;
        if (var2_2 == null) {
            return;
        }
        var3_3 = var2_2.d;
        var4_4 = var2_2.b;
        var5_5 = 2;
        var4_4 *= 2;
        var6_6 /* !! */  = 1;
        if (var3_3 != (var4_4 -= var6_6 /* !! */ )) {
            var2_2 = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            var3_3 = this.p.b * 2 - var6_6 /* !! */ ;
            var2_2.append(var3_3);
            var2_2.append(", but current index is ");
            var3_3 = this.p.d;
            var2_2.append(var3_3);
            var2_2.append(" (sequence number ");
            var3_3 = this.p.a;
            var2_2.append(var3_3);
            var7_7 /* !! */  = (byte[])");";
            var2_2.append((String)var7_7 /* !! */ );
            var2_2 = var2_2.toString();
            Cx.b((String)var2_2);
        }
        var2_2 = var1_1.p;
        var7_7 /* !! */  = var2_2.c;
        var4_4 = var2_2.d;
        var8_8 = var1_1.i;
        var8_8.k(var4_4, var7_7 /* !! */ );
        var3_3 = 0;
        var7_7 /* !! */  = null;
        while ((var9_9 = var8_8.b()) > 0) {
            var9_9 = 3;
            var10_10 = var8_8.g(var9_9);
            var11_11 = var8_8.g(5);
            var12_12 = 6;
            var13_13 = 7;
            if (var10_10 == var13_13) {
                var8_8.o(var5_5);
                var10_10 = var8_8.g(var12_12);
                if (var10_10 < var13_13) {
                    var14_14 = "Invalid extended service number: ";
                    CS1.a(var10_10, var14_14);
                }
            }
            if (var11_11 == 0) {
                if (var10_10 == 0) break;
                var2_2 = new StringBuilder("serviceNumber is non-zero (");
                var2_2.append(var10_10);
                var15_23 = ") when blockSize is 0";
                var2_2.append(var15_23);
                var2_2 = var2_2.toString();
                Cx.f((String)var2_2);
                break;
            }
            var16_15 = var1_1.k;
            if (var10_10 != var16_15) {
                var8_8.p(var11_11);
                continue;
            }
            var10_10 = var8_8.e();
            var11_11 = var11_11 * 8 + var10_10;
            while ((var10_10 = var8_8.e()) < var11_11) {
                block83: {
                    block101: {
                        block103: {
                            block102: {
                                block92: {
                                    block82: {
                                        block93: {
                                            block94: {
                                                block95: {
                                                    block96: {
                                                        block97: {
                                                            block98: {
                                                                block99: {
                                                                    block100: {
                                                                        block89: {
                                                                            block91: {
                                                                                block90: {
                                                                                    block84: {
                                                                                        block87: {
                                                                                            block88: {
                                                                                                block86: {
                                                                                                    block85: {
                                                                                                        var10_10 = 8;
                                                                                                        var16_15 = var8_8.g(var10_10);
                                                                                                        var17_16 = 23;
                                                                                                        var18_17 = 159;
                                                                                                        var19_18 = 127;
                                                                                                        var4_4 = 24;
                                                                                                        var20_19 = 31;
                                                                                                        var6_6 /* !! */  = 16;
                                                                                                        if (var16_15 == var6_6 /* !! */ ) break block84;
                                                                                                        var12_12 = 10;
                                                                                                        if (var16_15 > var20_19) ** GOTO lbl121
                                                                                                        if (var16_15 == 0) break block85;
                                                                                                        if (var16_15 == var9_9) ** GOTO lbl119
                                                                                                        if (var16_15 == var10_10) ** GOTO lbl112
                                                                                                        switch (var16_15) {
                                                                                                            default: {
                                                                                                                var12_12 = 17;
                                                                                                                if (var16_15 >= var12_12 && var16_15 <= var17_16) {
                                                                                                                    var21_20 = "Currently unsupported COMMAND_EXT1 Command: ";
                                                                                                                    var2_2 = new StringBuilder((String)var21_20);
                                                                                                                    var2_2.append(var16_15);
                                                                                                                    var2_2 = var2_2.toString();
                                                                                                                    Cx.f((String)var2_2);
                                                                                                                    var8_8.o(var10_10);
                                                                                                                    break;
                                                                                                                }
                                                                                                                if (var16_15 >= var4_4 && var16_15 <= var20_19) {
                                                                                                                    var22_21 = "Currently unsupported COMMAND_P16 Command: ";
                                                                                                                    var2_2 = new StringBuilder(var22_21);
                                                                                                                    var2_2.append(var16_15);
                                                                                                                    var2_2 = var2_2.toString();
                                                                                                                    Cx.f((String)var2_2);
                                                                                                                    var8_8.o(var6_6 /* !! */ );
                                                                                                                    break;
                                                                                                                }
                                                                                                                var2_2 = "Invalid C0 command: ";
                                                                                                                CS1.a(var16_15, (String)var2_2);
                                                                                                                break;
                                                                                                            }
                                                                                                            case 13: {
                                                                                                                var2_2 = var1_1.m;
                                                                                                                var2_2.a((char)var12_12);
                                                                                                                break;
                                                                                                            }
                                                                                                            case 12: {
                                                                                                                this.m();
                                                                                                                break;
                                                                                                            }
lbl112:
                                                                                                            // 1 sources

                                                                                                            var2_2 = var1_1.m.b;
                                                                                                            var6_6 /* !! */  = var2_2.length();
                                                                                                            if (var6_6 /* !! */  <= 0) break;
                                                                                                            var10_10 = var6_6 /* !! */  + -1;
                                                                                                            var2_2.delete(var10_10, var6_6 /* !! */ );
                                                                                                            break;
lbl119:
                                                                                                            // 1 sources

                                                                                                            var1_1.n = var2_2 = this.l();
                                                                                                            break;
lbl121:
                                                                                                            // 1 sources

                                                                                                            if (var16_15 <= var19_18) {
                                                                                                                if (var16_15 == var19_18) {
                                                                                                                    var2_2 = var1_1.m;
                                                                                                                    var3_3 = 9835;
                                                                                                                    var2_2.a((char)var3_3);
                                                                                                                } else {
                                                                                                                    var2_2 = var1_1.m;
                                                                                                                    var3_3 = (char)(var16_15 & 255);
                                                                                                                    var2_2.a((char)var3_3);
                                                                                                                }
                                                                                                                var3_3 = 1;
                                                                                                                break;
                                                                                                            }
                                                                                                            break block86;
                                                                                                            case 14: 
                                                                                                        }
                                                                                                    }
                                                                                                    var5_5 = 3;
                                                                                                    var6_6 /* !! */  = 2;
                                                                                                    var12_12 = 1;
                                                                                                    var13_13 = 0;
                                                                                                    break block87;
                                                                                                }
                                                                                                if (var16_15 > var18_17) break block88;
                                                                                                var3_3 = 4;
                                                                                                var23_22 = var1_1.l;
                                                                                                cfr_temp_0 = 0;
                                                                                                block43: do {
                                                                                                    switch (cfr_temp_0 == 0 ? var16_15 : cfr_temp_0) {
                                                                                                        default: {
                                                                                                            var2_2 = "Invalid C1 command: ";
                                                                                                            CS1.a(var16_15, (String)var2_2);
                                                                                                            cfr_temp_0 = 142;
                                                                                                            continue block43;
                                                                                                        }
                                                                                                        case 152: 
                                                                                                        case 153: 
                                                                                                        case 154: 
                                                                                                        case 155: 
                                                                                                        case 156: 
                                                                                                        case 157: 
                                                                                                        case 158: 
                                                                                                        case 159: {
                                                                                                            var2_2 = var23_22[var16_15 += -152];
                                                                                                            var8_8.o(var5_5);
                                                                                                            var6_6 /* !! */  = (int)var8_8.f();
                                                                                                            var8_8.o(var5_5);
                                                                                                            var12_12 = var8_8.g(var9_9);
                                                                                                            var20_19 = (int)var8_8.f();
                                                                                                            var17_16 = var8_8.g(var13_13);
                                                                                                            var10_10 = var8_8.g(var10_10);
                                                                                                            var19_18 = var8_8.g(var3_3);
                                                                                                            var3_3 = var8_8.g(var3_3);
                                                                                                            var8_8.o(var5_5);
                                                                                                            var8_8.o(6);
                                                                                                            var8_8.o(var5_5);
                                                                                                            var13_13 = var8_8.g(var9_9);
                                                                                                            var5_5 = var8_8.g(var9_9);
                                                                                                            var9_9 = 1;
                                                                                                            var2_2.c = var9_9;
                                                                                                            var2_2.d = var6_6 /* !! */ ;
                                                                                                            var2_2.e = var12_12;
                                                                                                            var2_2.f = var20_19;
                                                                                                            var2_2.g = var17_16;
                                                                                                            var2_2.h = var10_10;
                                                                                                            var2_2.i = var19_18;
                                                                                                            var6_6 /* !! */  = var2_2.j;
                                                                                                            if (var6_6 /* !! */  != (var3_3 += var9_9)) {
                                                                                                                var2_2.j = var3_3;
                                                                                                                while ((var6_6 /* !! */  = (var7_7 /* !! */  = var2_2.a).size()) >= (var9_9 = var2_2.j) || (var6_6 /* !! */  = var7_7 /* !! */ .size()) >= (var9_9 = 15)) {
                                                                                                                    var6_6 /* !! */  = 0;
                                                                                                                    var21_20 = null;
                                                                                                                    var7_7 /* !! */ .remove(0);
                                                                                                                }
                                                                                                            }
                                                                                                            if (var13_13 != 0 && (var3_3 = var2_2.l) != var13_13) {
                                                                                                                var2_2.l = var13_13;
                                                                                                                var7_7 /* !! */  = (byte[])eR$b.B;
                                                                                                                var3_3 = var7_7 /* !! */ [var13_13 += -1];
                                                                                                                var6_6 /* !! */  = eR$b.A[var13_13];
                                                                                                                var6_6 /* !! */  = eR$b.y[var13_13];
                                                                                                                var6_6 /* !! */  = eR$b.z[var13_13];
                                                                                                                var21_20 = eR$b.x;
                                                                                                                var6_6 /* !! */  = (int)var21_20[var13_13];
                                                                                                                var2_2.n = var3_3;
                                                                                                                var2_2.k = var6_6 /* !! */ ;
                                                                                                            }
                                                                                                            if (var5_5 != 0 && (var3_3 = var2_2.m) != var5_5) {
                                                                                                                var2_2.m = var5_5;
                                                                                                                var3_3 = eR$b.D[var5_5 += -1];
                                                                                                                var3_3 = eR$b.C[var5_5];
                                                                                                                var2_2.e(false, false);
                                                                                                                var7_7 /* !! */  = (byte[])eR$b.E;
                                                                                                                var3_3 = var7_7 /* !! */ [var5_5];
                                                                                                                var5_5 = eR$b.v;
                                                                                                                var2_2.f(var5_5, var3_3);
                                                                                                            }
                                                                                                            cfr_temp_0 = 142;
                                                                                                            var4_4 = var1_1.q;
                                                                                                            if (var4_4 == var16_15) continue block43;
                                                                                                            var1_1.q = var16_15;
                                                                                                            var1_1.m = var2_2 = var23_22[var16_15];
                                                                                                            cfr_temp_0 = 142;
                                                                                                            continue block43;
                                                                                                        }
                                                                                                        case 151: {
                                                                                                            var2_2 = var1_1.m;
                                                                                                            var4_4 = (int)var2_2.c;
                                                                                                            if (var4_4 == 0) {
                                                                                                                var4_4 = 32;
                                                                                                                var8_8.o(var4_4);
                                                                                                                cfr_temp_0 = 142;
                                                                                                                continue block43;
                                                                                                            }
                                                                                                            var4_4 = 2;
                                                                                                            var3_3 = var8_8.g(var4_4);
                                                                                                            var5_5 = var8_8.g(var4_4);
                                                                                                            var6_6 /* !! */  = var8_8.g(var4_4);
                                                                                                            var9_9 = var8_8.g(var4_4);
                                                                                                            var3_3 = eR$b.c(var5_5, var6_6 /* !! */ , var9_9, var3_3);
                                                                                                            var8_8.g(var4_4);
                                                                                                            var5_5 = var8_8.g(var4_4);
                                                                                                            var6_6 /* !! */  = var8_8.g(var4_4);
                                                                                                            var9_9 = var8_8.g(var4_4);
                                                                                                            var12_12 = 0;
                                                                                                            eR$b.c(var5_5, var6_6 /* !! */ , var9_9, 0);
                                                                                                            var8_8.f();
                                                                                                            var8_8.f();
                                                                                                            var8_8.g(var4_4);
                                                                                                            var8_8.g(var4_4);
                                                                                                            var5_5 = var8_8.g(var4_4);
                                                                                                            var8_8.o(var10_10);
                                                                                                            var2_2 = var1_1.m;
                                                                                                            var2_2.n = var3_3;
                                                                                                            var2_2.k = var5_5;
                                                                                                            cfr_temp_0 = 142;
                                                                                                            continue block43;
                                                                                                        }
                                                                                                        case 146: {
                                                                                                            var2_2 = var1_1.m;
                                                                                                            var4_4 = (int)var2_2.c;
                                                                                                            if (var4_4 == 0) {
                                                                                                                var8_8.o(var6_6 /* !! */ );
                                                                                                                cfr_temp_0 = 142;
                                                                                                                continue block43;
                                                                                                            }
                                                                                                            var8_8.o(var3_3);
                                                                                                            var4_4 = var8_8.g(var3_3);
                                                                                                            var8_8.o(2);
                                                                                                            var3_3 = 6;
                                                                                                            var8_8.g(var3_3);
                                                                                                            var7_7 /* !! */  = var1_1.m;
                                                                                                            var5_5 = var7_7 /* !! */ .u;
                                                                                                            if (var5_5 != var4_4) {
                                                                                                                var7_7 /* !! */ .a((char)var12_12);
                                                                                                            }
                                                                                                            var7_7 /* !! */ .u = var4_4;
                                                                                                            cfr_temp_0 = 142;
                                                                                                            continue block43;
                                                                                                        }
                                                                                                        case 145: {
                                                                                                            var7_7 /* !! */  = (byte[])var1_1.m;
                                                                                                            var3_3 = (int)var7_7 /* !! */ .c;
                                                                                                            if (var3_3 == 0) {
                                                                                                                var8_8.o(var4_4);
                                                                                                                cfr_temp_0 = 142;
                                                                                                                continue block43;
                                                                                                            }
                                                                                                            var4_4 = 2;
                                                                                                            var3_3 = var8_8.g(var4_4);
                                                                                                            var5_5 = var8_8.g(var4_4);
                                                                                                            var6_6 /* !! */  = var8_8.g(var4_4);
                                                                                                            var9_9 = var8_8.g(var4_4);
                                                                                                            var3_3 = eR$b.c(var5_5, var6_6 /* !! */ , var9_9, var3_3);
                                                                                                            var5_5 = var8_8.g(var4_4);
                                                                                                            var6_6 /* !! */  = var8_8.g(var4_4);
                                                                                                            var9_9 = var8_8.g(var4_4);
                                                                                                            var10_10 = var8_8.g(var4_4);
                                                                                                            var5_5 = eR$b.c(var6_6 /* !! */ , var9_9, var10_10, var5_5);
                                                                                                            var8_8.o(var4_4);
                                                                                                            var6_6 /* !! */  = var8_8.g(var4_4);
                                                                                                            var9_9 = var8_8.g(var4_4);
                                                                                                            var10_10 = var8_8.g(var4_4);
                                                                                                            var4_4 = 0;
                                                                                                            eR$b.c(var6_6 /* !! */ , var9_9, var10_10, 0);
                                                                                                            var2_2 = var1_1.m;
                                                                                                            var2_2.f(var3_3, var5_5);
                                                                                                            cfr_temp_0 = 142;
                                                                                                            continue block43;
                                                                                                        }
                                                                                                        case 144: {
                                                                                                            var2_2 = var1_1.m;
                                                                                                            var4_4 = (int)var2_2.c;
                                                                                                            if (var4_4 != 0) ** GOTO lbl306
                                                                                                            var8_8.o(var6_6 /* !! */ );
                                                                                                        }
                                                                                                        case 142: {
                                                                                                            var5_5 = 3;
                                                                                                            ** GOTO lbl377
                                                                                                        }
lbl306:
                                                                                                        // 1 sources

                                                                                                        var8_8.g(var3_3);
                                                                                                        var4_4 = 2;
                                                                                                        var8_8.g(var4_4);
                                                                                                        var8_8.g(var4_4);
                                                                                                        var4_4 = (int)var8_8.f();
                                                                                                        var3_3 = (int)var8_8.f();
                                                                                                        var5_5 = 3;
                                                                                                        var8_8.g(var5_5);
                                                                                                        var8_8.g(var5_5);
                                                                                                        var21_20 = var1_1.m;
                                                                                                        var21_20.e((boolean)var4_4, (boolean)var3_3);
                                                                                                        ** GOTO lbl377
                                                                                                        case 143: {
                                                                                                            var5_5 = 3;
                                                                                                            this.m();
                                                                                                            ** GOTO lbl377
                                                                                                        }
                                                                                                        case 141: {
                                                                                                            var5_5 = 3;
                                                                                                            var8_8.o(var10_10);
                                                                                                            ** GOTO lbl377
                                                                                                        }
                                                                                                        case 140: {
                                                                                                            var5_5 = 3;
                                                                                                            for (var4_4 = 1; var4_4 <= var10_10; ++var4_4) {
                                                                                                                var3_3 = (int)var8_8.f();
                                                                                                                if (var3_3 == 0) continue;
                                                                                                                var3_3 = 8 - var4_4;
                                                                                                                var7_7 /* !! */  = var23_22[var3_3];
                                                                                                                var7_7 /* !! */ .d();
                                                                                                            }
                                                                                                            ** GOTO lbl377
                                                                                                        }
                                                                                                        case 139: {
                                                                                                            var5_5 = 3;
                                                                                                            for (var9_9 = 1; var9_9 <= var10_10; ++var9_9) {
                                                                                                                var4_4 = (int)var8_8.f();
                                                                                                                if (var4_4 == 0) continue;
                                                                                                                var4_4 = 8 - var9_9;
                                                                                                                var2_2 = var23_22[var4_4];
                                                                                                                var3_3 = (int)var2_2.d;
                                                                                                                var6_6 /* !! */  = 1;
                                                                                                                var2_2.d = var3_3 ^= var6_6 /* !! */ ;
                                                                                                            }
                                                                                                            ** GOTO lbl377
                                                                                                        }
                                                                                                        case 138: {
                                                                                                            var5_5 = 3;
                                                                                                            for (var9_9 = 1; var9_9 <= var10_10; ++var9_9) {
                                                                                                                var4_4 = (int)var8_8.f();
                                                                                                                if (var4_4 == 0) continue;
                                                                                                                var4_4 = 8 - var9_9;
                                                                                                                var2_2 = var23_22[var4_4];
                                                                                                                var3_3 = 0;
                                                                                                                var7_7 /* !! */  = null;
                                                                                                                var2_2.d = false;
                                                                                                            }
                                                                                                            ** GOTO lbl377
                                                                                                        }
                                                                                                        case 137: {
                                                                                                            var5_5 = 3;
                                                                                                            var9_9 = 1;
                                                                                                            while (true) {
                                                                                                                if (var9_9 > var10_10) ** GOTO lbl377
                                                                                                                var4_4 = (int)var8_8.f();
                                                                                                                if (var4_4 == 0) ** GOTO lbl379
                                                                                                                var4_4 = 8 - var9_9;
                                                                                                                var2_2 = var23_22[var4_4];
                                                                                                                var12_12 = 1;
                                                                                                                var2_2.d = var12_12;
                                                                                                                ** GOTO lbl380
lbl377:
                                                                                                                // 8 sources

                                                                                                                var12_12 = 1;
                                                                                                                ** GOTO lbl402
lbl379:
                                                                                                                // 1 sources

                                                                                                                var12_12 = 1;
lbl380:
                                                                                                                // 2 sources

                                                                                                                ++var9_9;
                                                                                                            }
                                                                                                        }
                                                                                                        case 136: {
                                                                                                            var5_5 = 3;
                                                                                                            var12_12 = 1;
                                                                                                            var9_9 = 1;
                                                                                                            while (true) {
                                                                                                                if (var9_9 > var10_10) ** GOTO lbl402
                                                                                                                var4_4 = (int)var8_8.f();
                                                                                                                if (var4_4 == 0) ** GOTO lbl404
                                                                                                                var4_4 = 8 - var9_9;
                                                                                                                var2_2 = var23_22[var4_4];
                                                                                                                var2_2.a.clear();
                                                                                                                var7_7 /* !! */  = var2_2.b;
                                                                                                                var7_7 /* !! */ .clear();
                                                                                                                var2_2.o = var3_3 = -1;
                                                                                                                var2_2.p = var3_3;
                                                                                                                var2_2.q = var3_3;
                                                                                                                var2_2.s = var3_3;
                                                                                                                var13_13 = 0;
                                                                                                                var2_2.u = 0;
                                                                                                                ** GOTO lbl405
lbl402:
                                                                                                                // 2 sources

                                                                                                                var13_13 = 0;
                                                                                                                ** break;
lbl404:
                                                                                                                // 1 sources

                                                                                                                var13_13 = 0;
lbl405:
                                                                                                                // 2 sources

                                                                                                                ++var9_9;
                                                                                                            }
                                                                                                        }
                                                                                                        case 128: 
                                                                                                        case 129: 
                                                                                                        case 130: 
                                                                                                        case 131: 
                                                                                                        case 132: 
                                                                                                        case 133: 
                                                                                                        case 134: 
                                                                                                        case 135: 
                                                                                                    }
                                                                                                    break;
                                                                                                } while (true);
                                                                                                var5_5 = 3;
                                                                                                var12_12 = 1;
                                                                                                var13_13 = 0;
                                                                                                var4_4 = var1_1.q;
                                                                                                if (var4_4 != (var16_15 += -128)) {
                                                                                                    var1_1.q = var16_15;
                                                                                                    var1_1.m = var2_2 = var23_22[var16_15];
                                                                                                }
                                                                                                ** GOTO lbl427
                                                                                            }
                                                                                            var4_4 = 255;
                                                                                            var5_5 = 3;
                                                                                            var12_12 = 1;
                                                                                            var13_13 = 0;
                                                                                            if (var16_15 <= var4_4) {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = (char)(var16_15 & 255);
                                                                                                var2_2.a((char)var3_3);
lbl427:
                                                                                                // 3 sources

                                                                                                var3_3 = 1;
                                                                                            } else {
                                                                                                var2_2 = "Invalid base command: ";
                                                                                                CS1.a(var16_15, (String)var2_2);
                                                                                            }
                                                                                            var6_6 /* !! */  = 2;
                                                                                        }
                                                                                        var16_15 = 7;
                                                                                        ** GOTO lbl638
                                                                                    }
                                                                                    var5_5 = 3;
                                                                                    var12_12 = 1;
                                                                                    var13_13 = 0;
                                                                                    var9_9 = var8_8.g(var10_10);
                                                                                    if (var9_9 > var20_19) break block89;
                                                                                    var16_15 = 7;
                                                                                    if (var9_9 <= var16_15) ** GOTO lbl-1000
                                                                                    var18_17 = 15;
                                                                                    if (var9_9 > var18_17) break block90;
                                                                                    var8_8.o(var10_10);
                                                                                    ** GOTO lbl-1000
                                                                                }
                                                                                if (var9_9 > var17_16) break block91;
                                                                                var8_8.o(var6_6 /* !! */ );
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                            if (var9_9 > var20_19) ** GOTO lbl-1000
                                                                            var8_8.o(var4_4);
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        var16_15 = 7;
                                                                        var4_4 = 160;
                                                                        if (var9_9 > var19_18) break block92;
                                                                        var6_6 /* !! */  = 32;
                                                                        if (var9_9 == var6_6 /* !! */ ) break block93;
                                                                        var3_3 = 33;
                                                                        if (var9_9 == var3_3) break block94;
                                                                        var4_4 = 37;
                                                                        if (var9_9 == var4_4) break block95;
                                                                        var4_4 = 42;
                                                                        if (var9_9 == var4_4) break block96;
                                                                        var4_4 = 44;
                                                                        if (var9_9 == var4_4) break block97;
                                                                        var4_4 = 63;
                                                                        if (var9_9 == var4_4) break block98;
                                                                        var4_4 = 57;
                                                                        if (var9_9 == var4_4) break block99;
                                                                        var4_4 = 58;
                                                                        if (var9_9 == var4_4) break block100;
                                                                        var4_4 = 60;
                                                                        if (var9_9 != var4_4) {
                                                                            var4_4 = 61;
                                                                            if (var9_9 != var4_4) {
                                                                                block21 : switch (var9_9) {
                                                                                    default: {
                                                                                        switch (var9_9) {
                                                                                            default: {
                                                                                                var2_2 = "Invalid G2 character: ";
                                                                                                CS1.a(var9_9, (String)var2_2);
                                                                                                break block21;
                                                                                            }
                                                                                            case 127: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 9484;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 126: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 9496;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 125: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 9472;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 124: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 9492;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 123: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 9488;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 122: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 9474;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 121: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 8542;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 120: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 8541;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 119: {
                                                                                                var2_2 = var1_1.m;
                                                                                                var3_3 = 8540;
                                                                                                var2_2.a((char)var3_3);
                                                                                                break block21;
                                                                                            }
                                                                                            case 118: 
                                                                                        }
                                                                                        var2_2 = var1_1.m;
                                                                                        var3_3 = 8539;
                                                                                        var2_2.a((char)var3_3);
                                                                                        break;
                                                                                    }
                                                                                    case 53: {
                                                                                        var2_2 = var1_1.m;
                                                                                        var3_3 = 8226;
                                                                                        var2_2.a((char)var3_3);
                                                                                        break;
                                                                                    }
                                                                                    case 52: {
                                                                                        var2_2 = var1_1.m;
                                                                                        var3_3 = 8221;
                                                                                        var2_2.a((char)var3_3);
                                                                                        break;
                                                                                    }
                                                                                    case 51: {
                                                                                        var2_2 = var1_1.m;
                                                                                        var3_3 = 8220;
                                                                                        var2_2.a((char)var3_3);
                                                                                        break;
                                                                                    }
                                                                                    case 50: {
                                                                                        var2_2 = var1_1.m;
                                                                                        var3_3 = 8217;
                                                                                        var2_2.a((char)var3_3);
                                                                                        break;
                                                                                    }
                                                                                    case 49: {
                                                                                        var2_2 = var1_1.m;
                                                                                        var3_3 = 8216;
                                                                                        var2_2.a((char)var3_3);
                                                                                        break;
                                                                                    }
                                                                                    case 48: {
                                                                                        var2_2 = var1_1.m;
                                                                                        var3_3 = 9608;
                                                                                        var2_2.a((char)var3_3);
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break block82;
                                                                            } else {
                                                                                var2_2 = var1_1.m;
                                                                                var3_3 = 8480;
                                                                                var2_2.a((char)var3_3);
                                                                            }
                                                                            break block82;
                                                                        } else {
                                                                            var2_2 = var1_1.m;
                                                                            var3_3 = 339;
                                                                            var2_2.a((char)var3_3);
                                                                        }
                                                                        break block82;
                                                                    }
                                                                    var2_2 = var1_1.m;
                                                                    var3_3 = 353;
                                                                    var2_2.a((char)var3_3);
                                                                    break block82;
                                                                }
                                                                var2_2 = var1_1.m;
                                                                var3_3 = 8482;
                                                                var2_2.a((char)var3_3);
                                                                break block82;
                                                            }
                                                            var2_2 = var1_1.m;
                                                            var3_3 = 376;
                                                            var2_2.a((char)var3_3);
                                                            break block82;
                                                        }
                                                        var2_2 = var1_1.m;
                                                        var3_3 = 338;
                                                        var2_2.a((char)var3_3);
                                                        break block82;
                                                    }
                                                    var2_2 = var1_1.m;
                                                    var3_3 = 352;
                                                    var2_2.a((char)var3_3);
                                                    break block82;
                                                }
                                                var2_2 = var1_1.m;
                                                var3_3 = 8230;
                                                var2_2.a((char)var3_3);
                                                break block82;
                                            }
                                            var7_7 /* !! */  = (byte[])var1_1.m;
                                            var7_7 /* !! */ .a((char)var4_4);
                                            break block82;
                                        }
                                        var2_2 = var1_1.m;
                                        var6_6 /* !! */  = 32;
                                        var2_2.a((char)var6_6 /* !! */ );
                                    }
                                    var3_3 = 1;
                                    ** GOTO lbl-1000
                                }
                                var6_6 /* !! */  = 32;
                                if (var9_9 > var18_17) break block101;
                                var4_4 = 135;
                                if (var9_9 > var4_4) break block102;
                                var8_8.o(var6_6 /* !! */ );
                                ** GOTO lbl-1000
                            }
                            var4_4 = 143;
                            if (var9_9 > var4_4) break block103;
                            var4_4 = 40;
                            var8_8.o(var4_4);
                            ** GOTO lbl-1000
                        }
                        if (var9_9 <= var18_17) {
                            var6_6 /* !! */  = 2;
                            var8_8.o(var6_6 /* !! */ );
                            var18_17 = 6;
                            var4_4 = var8_8.g(var18_17) * 8;
                            var8_8.o(var4_4);
                            break block83;
                        } else lbl-1000:
                        // 9 sources

                        {
                            var6_6 /* !! */  = 2;
lbl638:
                            // 2 sources

                            var18_17 = 6;
                        }
                        break block83;
                    }
                    var6_6 /* !! */  = 2;
                    var10_10 = 255;
                    var18_17 = 6;
                    if (var9_9 <= var10_10) {
                        if (var9_9 == var4_4) {
                            var2_2 = var1_1.m;
                            var3_3 = 13252;
                            var2_2.a((char)var3_3);
                        } else {
                            CS1.a(var9_9, "Invalid G3 character: ");
                            var2_2 = var1_1.m;
                            var3_3 = 95;
                            var2_2.a((char)var3_3);
                        }
                        var3_3 = 1;
                    } else {
                        var2_2 = "Invalid extended command: ";
                        CS1.a(var9_9, (String)var2_2);
                    }
                }
                var5_5 = 2;
                var6_6 /* !! */  = 1;
                var9_9 = 3;
                var12_12 = 6;
                var13_13 = 7;
            }
            var12_12 = 1;
            var6_6 /* !! */  = 1;
        }
        if (var3_3 != 0) {
            var1_1.n = var2_2 = this.l();
        }
        var1_1.p = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final List l() {
        int n3;
        Object object;
        int n4;
        ArrayList<ArrayList> arrayList = new ArrayList<ArrayList>();
        int n7 = 0;
        Object var3_4 = null;
        ArrayList<Object> arrayList2 = null;
        for (int i3 = 0; i3 < (n4 = 8); ++i3) {
            Object object2;
            block16: {
                int n8;
                block11: {
                    float f5;
                    int n10;
                    float f6;
                    int n14;
                    float f7;
                    Object object3;
                    int n15;
                    SpannableStringBuilder spannableStringBuilder;
                    int n16;
                    Object object4;
                    block15: {
                        block12: {
                            block13: {
                                block14: {
                                    object = this.l;
                                    object4 = object[i3];
                                    n8 = ((eR$b)object4).c;
                                    if (n8 == 0 || (n8 = ((ArrayList)(object2 = ((eR$b)object4).a)).isEmpty()) != 0 && (n16 = (object4 = ((eR$b)object4).b).length()) == 0) continue;
                                    object = object[i3];
                                    n16 = (int)(((eR$b)object).d ? 1 : 0);
                                    if (n16 == 0) continue;
                                    n16 = (int)(((eR$b)object).c ? 1 : 0);
                                    if (n16 == 0 || (n8 = ((ArrayList)(object4 = ((eR$b)object).a)).isEmpty()) != 0 && (n8 = (object2 = ((eR$b)object).b).length()) == 0) break block11;
                                    spannableStringBuilder = new SpannableStringBuilder();
                                    object2 = null;
                                    for (n8 = 0; n8 < (n15 = ((ArrayList)object4).size()); ++n8) {
                                        object3 = (CharSequence)((ArrayList)object4).get(n8);
                                        spannableStringBuilder.append((CharSequence)object3);
                                        n15 = 10;
                                        spannableStringBuilder.append((char)n15);
                                    }
                                    object4 = ((eR$b)object).b();
                                    spannableStringBuilder.append((CharSequence)object4);
                                    n16 = ((eR$b)object).k;
                                    n8 = 1;
                                    n15 = 2;
                                    if (n16 == 0) break block12;
                                    if (n16 == n8) break block13;
                                    if (n16 == n15) break block14;
                                    int n17 = 3;
                                    if (n16 != n17) {
                                        StringBuilder stringBuilder = new StringBuilder("Unexpected justification value: ");
                                        i3 = ((eR$b)object).k;
                                        stringBuilder.append(i3);
                                        String string2 = stringBuilder.toString();
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                                        throw illegalArgumentException;
                                    }
                                    break block12;
                                }
                                object4 = Layout.Alignment.ALIGN_CENTER;
                                break block15;
                            }
                            object4 = Layout.Alignment.ALIGN_OPPOSITE;
                            break block15;
                        }
                        object4 = Layout.Alignment.ALIGN_NORMAL;
                    }
                    Object object5 = object4;
                    n16 = (int)(((eR$b)object).f ? 1 : 0);
                    if (n16 != 0) {
                        n16 = ((eR$b)object).h;
                        f7 = n16;
                        n14 = 1120272384;
                        f6 = 99.0f;
                        f7 /= f6;
                        n10 = ((eR$b)object).g;
                        f5 = (float)n10 / f6;
                    } else {
                        n16 = ((eR$b)object).h;
                        f7 = (float)n16 / 209.0f;
                        n14 = ((eR$b)object).g;
                        f6 = n14;
                        n10 = 1116995584;
                        f5 = f6 / 74.0f;
                    }
                    n14 = 0x3F666666;
                    f6 = 0.9f;
                    f7 *= f6;
                    float f8 = 0.05f;
                    f7 += f8;
                    f5 *= f6;
                    f6 = f5 + f8;
                    n10 = ((eR$b)object).i;
                    int n18 = n10 / 3;
                    if (n18 == 0) {
                        n18 = 0;
                        f8 = 0.0f;
                    } else if (n18 == n8) {
                        n18 = 1;
                        f8 = Float.MIN_VALUE;
                    } else {
                        n18 = 2;
                        f8 = 2.8E-45f;
                    }
                    int n19 = (n10 %= 3) == 0 ? 0 : (n10 == n8 ? 1 : 2);
                    int n20 = ((eR$b)object).n;
                    n15 = eR$b.w;
                    boolean bl2 = n20 != n15;
                    n3 = ((eR$b)object).e;
                    object3 = object2;
                    n10 = n18;
                    f5 = f8;
                    f8 = f7;
                    object2 = new eR$a(spannableStringBuilder, (Layout.Alignment)object5, f6, n18, f7, n19, bl2, n20, n3);
                    break block16;
                }
                n8 = 0;
                object2 = null;
            }
            if (object2 == null) continue;
            arrayList.add((ArrayList)object2);
        }
        arrayList2 = eR$a.c;
        Collections.sort(arrayList, arrayList2);
        n3 = arrayList.size();
        arrayList2 = new ArrayList<Object>(n3);
        while (n7 < (n3 = arrayList.size())) {
            object = ((eR$a)arrayList.get((int)n7)).a;
            arrayList2.add(object);
            ++n7;
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void m() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 8); ++i3) {
            eR$b eR$b = this.l[i3];
            eR$b.d();
        }
    }
}

