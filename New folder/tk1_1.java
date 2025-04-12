/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.util.SparseArray
 */
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.DrmInitData$SchemeData;
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/*
 * Renamed from TK1
 */
public final class tk1_1
implements eI0 {
    public static final byte[] e0;
    public static final byte[] f0;
    public static final byte[] g0;
    public static final byte[] h0;
    public static final UUID i0;
    public static final Map j0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    public ZA1 E;
    public ZA1 F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final gx0_1 a;
    public int a0;
    public final vA3 b;
    public byte b0;
    public final SparseArray c;
    public boolean c0;
    public final boolean d;
    public gi0_0 d0;
    public final boolean e;
    public final vf3$a_0 f;
    public final Xm2 g;
    public final Xm2 h;
    public final Xm2 i;
    public final Xm2 j;
    public final Xm2 k;
    public final Xm2 l;
    public final Xm2 m;
    public final Xm2 n;
    public final Xm2 o;
    public final Xm2 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public TK1$b w;
    public boolean x;
    public int y;
    public long z;

    static {
        Object object;
        Object object2;
        int n3 = 32;
        byte[] byArray = object2 = new byte[n3];
        byte[] byArray2 = object2;
        byArray[0] = 49;
        byArray2[1] = 10;
        byArray[2] = 48;
        byArray2[3] = 48;
        byArray[4] = 58;
        byArray2[5] = 48;
        byArray[6] = 48;
        byArray2[7] = 58;
        byArray[8] = 48;
        byArray2[9] = 48;
        byArray[10] = 44;
        byArray2[11] = 48;
        byArray[12] = 48;
        byArray2[13] = 48;
        byArray[14] = 32;
        byArray2[15] = 45;
        byArray[16] = 45;
        byArray2[17] = 62;
        byArray[18] = 32;
        byArray2[19] = 48;
        byArray[20] = 48;
        byArray2[21] = 58;
        byArray[22] = 48;
        byArray2[23] = 48;
        byArray[24] = 58;
        byArray2[25] = 48;
        byArray[26] = 48;
        byArray2[27] = 44;
        byArray[28] = 48;
        byArray2[29] = 48;
        byArray[30] = 48;
        byArray2[31] = 10;
        e0 = object2;
        object2 = StandardCharsets.UTF_8;
        f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes((Charset)object2);
        byte[] byArray3 = object = new byte[n3];
        byte[] byArray4 = object;
        byArray3[0] = 68;
        byArray4[1] = 105;
        byArray3[2] = 97;
        byArray4[3] = 108;
        byArray3[4] = 111;
        byArray4[5] = 103;
        byArray3[6] = 117;
        byArray4[7] = 101;
        byArray3[8] = 58;
        byArray4[9] = 32;
        byArray3[10] = 48;
        byArray4[11] = 58;
        byArray3[12] = 48;
        byArray4[13] = 48;
        byArray3[14] = 58;
        byArray4[15] = 48;
        byArray3[16] = 48;
        byArray4[17] = 58;
        byArray3[18] = 48;
        byArray4[19] = 48;
        byArray3[20] = 44;
        byArray4[21] = 48;
        byArray3[22] = 58;
        byArray4[23] = 48;
        byArray3[24] = 48;
        byArray4[25] = 58;
        byArray3[26] = 48;
        byArray4[27] = 48;
        byArray3[28] = 58;
        byArray4[29] = 48;
        byArray3[30] = 48;
        byArray4[31] = 44;
        g0 = object;
        byte[] byArray5 = object = new byte[38];
        byte[] byArray6 = object;
        byArray5[0] = 87;
        byArray6[1] = 69;
        byArray5[2] = 66;
        byArray6[3] = 86;
        byArray5[4] = 84;
        byArray6[5] = 84;
        byArray5[6] = 10;
        byArray6[7] = 10;
        byArray5[8] = 48;
        byArray6[9] = 48;
        byArray5[10] = 58;
        byArray6[11] = 48;
        byArray5[12] = 48;
        byArray6[13] = 58;
        byArray5[14] = 48;
        byArray6[15] = 48;
        byArray5[16] = 46;
        byArray6[17] = 48;
        byArray5[18] = 48;
        byArray6[19] = 48;
        byArray5[20] = 32;
        byArray6[21] = 45;
        byArray5[22] = 45;
        byArray6[23] = 62;
        byArray5[24] = 32;
        byArray6[25] = 48;
        byArray5[26] = 48;
        byArray6[27] = 58;
        byArray5[28] = 48;
        byArray6[29] = 48;
        byArray5[30] = 58;
        byArray6[31] = 48;
        byArray5[32] = 48;
        byArray6[33] = 46;
        byArray5[34] = 48;
        byArray6[35] = 48;
        byArray5[36] = 48;
        byArray6[37] = 10;
        h0 = object;
        object = new UUID;
        object(0x100000000001000L, -9223371306706625679L);
        i0 = object;
        object = new HashMap;
        object();
        cy_1.a(0, (HashMap)object, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        cy_1.a(180, (HashMap)object, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        j0 = Collections.unmodifiableMap(object);
    }

    public tk1_1(int n3, vf3$a_0 vf3$a_0) {
        long l2;
        long l3;
        fl0_0 fl0_02 = new fl0_0();
        this.s = l3 = (long)-1;
        this.t = l2 = -9223372036854775807L;
        this.u = l2;
        this.v = l2;
        this.B = l3;
        this.C = l3;
        this.D = l2;
        this.a = fl0_02;
        Object object = new TK1$a(this);
        fl0_02.d = object;
        this.f = vf3$a_0;
        int n4 = n3 & 1;
        int n7 = 1;
        boolean bl2 = false;
        object = null;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            vf3$a_0 = null;
        }
        this.d = n4;
        if ((n3 &= 2) == 0) {
            bl2 = true;
        }
        this.e = bl2;
        Object object2 = new vA3();
        this.b = object2;
        this.c = object2;
        n4 = 4;
        this.i = object2 = new Xm2(n4);
        object = ByteBuffer.allocate(n4).putInt(-1).array();
        this.j = object2 = new Xm2((byte[])object);
        this.k = object2 = new Xm2(n4);
        object = DS1.a;
        this.g = object2 = new Xm2((byte[])object);
        this.h = object2 = new Xm2(n4);
        this.l = object2 = new Xm2();
        this.m = object2 = new Xm2();
        this.n = object2 = new Xm2(8);
        this.o = object2 = new Xm2();
        this.p = object2 = new Xm2();
        object2 = new int[n7];
        this.N = (int[])object2;
    }

    public static byte[] h(long l2, String string2, long l3) {
        Integer n3;
        boolean bl2;
        int n4 = 1;
        long l4 = -9223372036854775807L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            bl2 = true;
        } else {
            bl2 = false;
            n3 = null;
        }
        ct3.a(bl2);
        l4 = 3600000000L;
        int n7 = (int)(l2 / l4);
        long l8 = (long)n7 * l4;
        l4 = 60000000L;
        object = (int)((l2 -= l8) / l4);
        l8 = (long)object * l4;
        l4 = 1000000L;
        int n8 = (int)((l2 -= l8) / l4);
        long l12 = (long)n8 * l4;
        int n10 = (int)((l2 - l12) / l3);
        Object object2 = Locale.US;
        Integer n14 = n7;
        Integer n15 = (int)object;
        n3 = n8;
        Comparable<Integer> comparable = n10;
        Object[] objectArray = new Object[4];
        objectArray[0] = n14;
        objectArray[n4] = n15;
        objectArray[2] = n3;
        objectArray[3] = comparable;
        object2 = String.format((Locale)object2, string2, objectArray);
        n10 = gz3.a;
        comparable = StandardCharsets.UTF_8;
        return ((String)object2).getBytes((Charset)comparable);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        var3_3 = this;
        var4_4 = var2_2;
        var5_5 = "A_MPEG/L2";
        var6_6 /* !! */  = "A_VORBIS";
        var7_7 /* !! */  = "A_TRUEHD";
        var8_8 = "A_MS/ACM";
        var9_9 = "V_MPEG4/ISO/SP";
        var10_10 = "V_MPEG4/ISO/AP";
        var11_11 = "A_OPUS";
        var12_12 = 0;
        var13_13 = 0.0f;
        var14_14 = null;
        this.H = false;
        var15_15 = true;
        block149: while (true) {
            if (!var15_15 || (var16_16 = var3_3.H) != 0) {
                if (var15_15 != false) return 0;
                var12_12 = 0;
                var13_13 = 0.0f;
                var14_14 = null;
                while (var12_12 < (var38_35 /* !! */  = (var4_4 = var3_3.c).size())) {
                    var4_4 = (TK1$b)var4_4.valueAt(var12_12);
                    var4_4.Y.getClass();
                    var5_5 = var4_4.U;
                    if (var5_5 != null) {
                        var6_6 /* !! */  = var4_4.Y;
                        var4_4 = var4_4.j;
                        var5_5.a((wp3)var6_6 /* !! */ , (wp3$a)var4_4);
                    }
                    var62_53 = 1;
                    var12_12 += var62_53;
                }
                return -1;
            }
            var17_17 = (fl0_0)var3_3.a;
            var18_18 = var17_17.d;
            ct3.h(var18_18);
            while (true) {
                block274: {
                    block240: {
                        block275: {
                            block276: {
                                block281: {
                                    block279: {
                                        block280: {
                                            block277: {
                                                block278: {
                                                    block263: {
                                                        block241: {
                                                            block262: {
                                                                block271: {
                                                                    block253: {
                                                                        block255: {
                                                                            block259: {
                                                                                block257: {
                                                                                    block266: {
                                                                                        block267: {
                                                                                            block268: {
                                                                                                block270: {
                                                                                                    block269: {
                                                                                                        block265: {
                                                                                                            block258: {
                                                                                                                block239: {
                                                                                                                    block261: {
                                                                                                                        block260: {
                                                                                                                            block243: {
                                                                                                                                block244: {
                                                                                                                                    block245: {
                                                                                                                                        block256: {
                                                                                                                                            block246: {
                                                                                                                                                block254: {
                                                                                                                                                    block247: {
                                                                                                                                                        block248: {
                                                                                                                                                            block249: {
                                                                                                                                                                block250: {
                                                                                                                                                                    block251: {
                                                                                                                                                                        block252: {
                                                                                                                                                                            var18_18 = var17_17.b;
                                                                                                                                                                            var19_19 /* !! */  = var18_18.peek();
                                                                                                                                                                            var20_20 = var19_19 /* !! */ ;
                                                                                                                                                                            var20_20 = (Fl0$a)var19_19 /* !! */ ;
                                                                                                                                                                            var21_21 = var11_11;
                                                                                                                                                                            var22_22 = 374648427;
                                                                                                                                                                            var23_23 = 1.718026E-25f;
                                                                                                                                                                            var12_12 = 357149030;
                                                                                                                                                                            var13_13 = 4.072526E-26f;
                                                                                                                                                                            if (var20_20 == null) break block243;
                                                                                                                                                                            var11_11 = var1_1;
                                                                                                                                                                            var11_11 = (il0_0)var1_1;
                                                                                                                                                                            var24_24 = var11_11.d;
                                                                                                                                                                            var26_25 = var18_18;
                                                                                                                                                                            var27_26 = var20_20.b;
                                                                                                                                                                            cfr_temp_0 = var24_24 - var27_26;
                                                                                                                                                                            var29_27 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                                                                                                                            if (var29_27 /* !! */  < 0) break block244;
                                                                                                                                                                            var20_20 = var17_17.d;
                                                                                                                                                                            var30_28 = (Fl0$a)var18_18.pop();
                                                                                                                                                                            var31_29 = var30_28.a;
                                                                                                                                                                            var20_20 = ((TK1$a)var20_20).a;
                                                                                                                                                                            ct3.h(var20_20.d0);
                                                                                                                                                                            var11_11 = var20_20.c;
                                                                                                                                                                            var16_16 = 160;
                                                                                                                                                                            if (var31_29 == var16_16) break block245;
                                                                                                                                                                            var16_16 = 174;
                                                                                                                                                                            if (var31_29 == var16_16) break block246;
                                                                                                                                                                            var16_16 = 19899;
                                                                                                                                                                            if (var31_29 == var16_16) break block247;
                                                                                                                                                                            var16_16 = 25152;
                                                                                                                                                                            if (var31_29 == var16_16) break block248;
                                                                                                                                                                            var16_16 = 28032;
                                                                                                                                                                            if (var31_29 == var16_16) break block249;
                                                                                                                                                                            var32_30 = -9223372036854775807L;
                                                                                                                                                                            if (var31_29 == var12_12) break block250;
                                                                                                                                                                            if (var31_29 == var22_22) break block251;
                                                                                                                                                                            var12_12 = 475249515;
                                                                                                                                                                            var13_13 = 7.0056276E-22f;
                                                                                                                                                                            if (var31_29 == var12_12) break block252;
                                                                                                                                                                            var34_31 = var5_5;
                                                                                                                                                                            var35_32 = var6_6 /* !! */ ;
                                                                                                                                                                            var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                                            var37_34 = var8_8;
                                                                                                                                                                            var30_28 = var10_10;
                                                                                                                                                                            var7_7 /* !! */  = var21_21;
                                                                                                                                                                            var38_35 /* !! */  = 25;
                                                                                                                                                                            var39_36 = 3.5E-44f;
                                                                                                                                                                            var40_37 /* !! */  = 0;
                                                                                                                                                                            var6_6 /* !! */  = null;
                                                                                                                                                                            var10_10 = var9_9;
                                                                                                                                                                            break block253;
                                                                                                                                                                        }
                                                                                                                                                                        var31_29 = (int)var20_20.x;
                                                                                                                                                                        if (var31_29 == 0) {
                                                                                                                                                                            var30_28 = var20_20.d0;
                                                                                                                                                                            var11_11 = var20_20.E;
                                                                                                                                                                            var14_14 = var20_20.F;
                                                                                                                                                                            var41_38 = var20_20.s;
                                                                                                                                                                            var43_39 = -1;
                                                                                                                                                                            cfr_temp_1 = var41_38 - var43_39;
                                                                                                                                                                            var45_40 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                                                                                                                                            if (var45_40 /* !! */  == false || (var45_40 /* !! */  = (cfr_temp_2 = (var41_38 = var20_20.v) - var32_30) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false || var11_11 == null || (var16_16 = var11_11.a) == 0 || var14_14 == null || (var46_41 = var14_14.a) != var16_16) {
                                                                                                                                                                                var37_34 = var8_8;
                                                                                                                                                                                var47_42 = var9_9;
                                                                                                                                                                                var35_32 = var10_10;
                                                                                                                                                                                var59_51 = var20_20.v;
                                                                                                                                                                                var3_3 = new dX2$b(var59_51);
                                                                                                                                                                            } else {
                                                                                                                                                                                block235: {
                                                                                                                                                                                    var48_43 = new int[var16_16];
                                                                                                                                                                                    var18_18 = new long[var16_16];
                                                                                                                                                                                    var49_44 = new long[var16_16];
                                                                                                                                                                                    var4_4 = new long[var16_16];
                                                                                                                                                                                    var3_3 = null;
                                                                                                                                                                                    for (var50_45 = 0; var50_45 < var16_16; var50_45 += var55_48 /* !! */ ) {
                                                                                                                                                                                        var51_46 /* !! */  = var11_11.c(var50_45);
                                                                                                                                                                                        var4_4[var50_45] = var51_46 /* !! */ ;
                                                                                                                                                                                        var47_42 = var9_9;
                                                                                                                                                                                        var35_32 = var10_10;
                                                                                                                                                                                        var53_47 = var20_20.s;
                                                                                                                                                                                        var51_46 /* !! */  = var14_14.c(var50_45) + var53_47;
                                                                                                                                                                                        var18_18[var50_45] = var51_46 /* !! */ ;
                                                                                                                                                                                        var55_48 /* !! */  = 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    var47_42 = var9_9;
                                                                                                                                                                                    var35_32 = var10_10;
                                                                                                                                                                                    var55_48 /* !! */  = 1;
                                                                                                                                                                                    var50_45 = 0;
                                                                                                                                                                                    var3_3 = null;
                                                                                                                                                                                    while (var50_45 < (var56_49 = var16_16 + -1)) {
                                                                                                                                                                                        var56_49 = var50_45 + 1;
                                                                                                                                                                                        var57_50 = (long)var18_18[var56_49];
                                                                                                                                                                                        var51_46 /* !! */  = (long)var18_18[var50_45];
                                                                                                                                                                                        var55_48 /* !! */  = (int)(var57_50 - var51_46 /* !! */ );
                                                                                                                                                                                        var48_43[var50_45] = var55_48 /* !! */ ;
                                                                                                                                                                                        var57_50 = (long)var4_4[var56_49];
                                                                                                                                                                                        var51_46 /* !! */  = (long)var4_4[var50_45];
                                                                                                                                                                                        var49_44[var50_45] = var57_50 -= var51_46 /* !! */ ;
                                                                                                                                                                                        var50_45 = var56_49;
                                                                                                                                                                                        var55_48 /* !! */  = 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    for (var50_45 = var56_49; var50_45 > 0; var50_45 += var61_52 /* !! */ ) {
                                                                                                                                                                                        var57_50 = (long)var4_4[var50_45];
                                                                                                                                                                                        var37_34 = var8_8;
                                                                                                                                                                                        var59_51 = var20_20.v;
                                                                                                                                                                                        cfr_temp_3 = var57_50 - var59_51;
                                                                                                                                                                                        var16_16 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                                                                                                                                                                        if (var16_16 > 0) {
                                                                                                                                                                                            var61_52 /* !! */  = -1;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        }
                                                                                                                                                                                        break block235;
                                                                                                                                                                                    }
                                                                                                                                                                                    var37_34 = var8_8;
                                                                                                                                                                                }
                                                                                                                                                                                var59_51 = var20_20.s;
                                                                                                                                                                                var57_50 = var20_20.r;
                                                                                                                                                                                var59_51 += var57_50;
                                                                                                                                                                                var57_50 = (long)var18_18[var50_45];
                                                                                                                                                                                var55_48 /* !! */  = (int)(var59_51 - var57_50);
                                                                                                                                                                                var48_43[var50_45] = var55_48 /* !! */ ;
                                                                                                                                                                                var59_51 = var20_20.v;
                                                                                                                                                                                var57_50 = (long)var4_4[var50_45];
                                                                                                                                                                                var49_44[var50_45] = var59_51 -= var57_50;
                                                                                                                                                                                if (var50_45 < var56_49) {
                                                                                                                                                                                    var8_8 = "Discarding trailing cue points with timestamps greater than total duration";
                                                                                                                                                                                    Cx.f((String)var8_8);
                                                                                                                                                                                    var61_52 /* !! */  = 1;
                                                                                                                                                                                    var48_43 = Arrays.copyOf((int[])var48_43, var50_45 += var61_52 /* !! */ );
                                                                                                                                                                                    var18_18 = Arrays.copyOf((long[])var18_18, var50_45);
                                                                                                                                                                                    var49_44 = Arrays.copyOf((long[])var49_44, var50_45);
                                                                                                                                                                                    var4_4 = Arrays.copyOf((long[])var4_4, var50_45);
                                                                                                                                                                                }
                                                                                                                                                                                var3_3 = new gu_0((int[])var48_43, (long[])var18_18, (long[])var49_44, (long[])var4_4);
                                                                                                                                                                            }
                                                                                                                                                                            var30_28.h((dx2_1)var3_3);
                                                                                                                                                                            var50_45 = 1;
                                                                                                                                                                            var20_20.x = var50_45;
                                                                                                                                                                        } else {
                                                                                                                                                                            var37_34 = var8_8;
                                                                                                                                                                            var47_42 = var9_9;
                                                                                                                                                                            var35_32 = var10_10;
                                                                                                                                                                        }
                                                                                                                                                                        var50_45 = 0;
                                                                                                                                                                        var3_3 = null;
                                                                                                                                                                        var20_20.E = null;
                                                                                                                                                                        var20_20.F = null;
                                                                                                                                                                        break block254;
                                                                                                                                                                    }
                                                                                                                                                                    var37_34 = var8_8;
                                                                                                                                                                    var47_42 = var9_9;
                                                                                                                                                                    var35_32 = var10_10;
                                                                                                                                                                    var50_45 = 0;
                                                                                                                                                                    var3_3 = null;
                                                                                                                                                                    var62_53 = var11_11.size();
                                                                                                                                                                    if (var62_53 == 0) throw ParserException.a("No valid tracks were found", null);
                                                                                                                                                                    var3_3 = var20_20.d0;
                                                                                                                                                                    var3_3.j();
                                                                                                                                                                    break block254;
                                                                                                                                                                }
                                                                                                                                                                var37_34 = var8_8;
                                                                                                                                                                var47_42 = var9_9;
                                                                                                                                                                var35_32 = var10_10;
                                                                                                                                                                var63_54 = var20_20.t;
                                                                                                                                                                cfr_temp_4 = var63_54 - var32_30;
                                                                                                                                                                var61_52 /* !! */  = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                                                                                                                                                if (var61_52 /* !! */  == 0) {
                                                                                                                                                                    var20_20.t = var63_54 = 1000000L;
                                                                                                                                                                }
                                                                                                                                                                if ((var61_52 /* !! */  = (int)((cfr_temp_5 = (var63_54 = var20_20.u) - var32_30) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) != 0) {
                                                                                                                                                                    var20_20.v = var63_54 = var20_20.m(var63_54);
                                                                                                                                                                }
                                                                                                                                                                break block254;
                                                                                                                                                            }
                                                                                                                                                            var37_34 = var8_8;
                                                                                                                                                            var47_42 = var9_9;
                                                                                                                                                            var35_32 = var10_10;
                                                                                                                                                            var20_20.f(var31_29);
                                                                                                                                                            var3_3 = var20_20.w;
                                                                                                                                                            var62_53 = (int)var3_3.h;
                                                                                                                                                            if (var62_53 != 0) {
                                                                                                                                                                var3_3 = var3_3.i;
                                                                                                                                                                if (var3_3 != null) throw ParserException.a("Combining encryption and compression is not supported", null);
                                                                                                                                                            }
                                                                                                                                                            break block254;
                                                                                                                                                        }
                                                                                                                                                        var37_34 = var8_8;
                                                                                                                                                        var47_42 = var9_9;
                                                                                                                                                        var35_32 = var10_10;
                                                                                                                                                        var20_20.f(var31_29);
                                                                                                                                                        var3_3 = var20_20.w;
                                                                                                                                                        var62_53 = (int)var3_3.h;
                                                                                                                                                        if (var62_53 != 0) {
                                                                                                                                                            var4_4 = var3_3.j;
                                                                                                                                                            if (var4_4 == null) throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                                                                                                                                            var10_10 = OF.a;
                                                                                                                                                            var4_4 = var4_4.b;
                                                                                                                                                            var31_29 = 0;
                                                                                                                                                            var30_28 = null;
                                                                                                                                                            var9_9 = new DrmInitData$SchemeData((UUID)var10_10, null, "video/webm", (byte[])var4_4);
                                                                                                                                                            var62_53 = 1;
                                                                                                                                                            var10_10 = new DrmInitData$SchemeData[var62_53];
                                                                                                                                                            var29_27 /* !! */  = 0;
                                                                                                                                                            var65_55 = 0.0f;
                                                                                                                                                            var20_20 = null;
                                                                                                                                                            var10_10[0] = var9_9;
                                                                                                                                                            var8_8 = new DrmInitData(null, (boolean)var62_53, var10_10);
                                                                                                                                                            var3_3.l = var8_8;
                                                                                                                                                        }
                                                                                                                                                        break block254;
                                                                                                                                                    }
                                                                                                                                                    var37_34 = var8_8;
                                                                                                                                                    var47_42 = var9_9;
                                                                                                                                                    var35_32 = var10_10;
                                                                                                                                                    var50_45 = var20_20.y;
                                                                                                                                                    var62_53 = -1;
                                                                                                                                                    if (var50_45 == var62_53) throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
                                                                                                                                                    var59_51 = var20_20.z;
                                                                                                                                                    var24_24 = -1;
                                                                                                                                                    cfr_temp_6 = var59_51 - var24_24;
                                                                                                                                                    var62_53 = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                                                                                                                                                    if (var62_53 == 0) throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
                                                                                                                                                    var62_53 = 475249515;
                                                                                                                                                    if (var50_45 == var62_53) {
                                                                                                                                                        var20_20.B = var59_51;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var34_31 = var5_5;
                                                                                                                                                var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                var7_7 /* !! */  = var21_21;
                                                                                                                                                var10_10 = var47_42;
                                                                                                                                                var30_28 = var35_32;
                                                                                                                                                var38_35 /* !! */  = 25;
                                                                                                                                                var39_36 = 3.5E-44f;
                                                                                                                                                var35_32 = var6_6 /* !! */ ;
                                                                                                                                                break block255;
                                                                                                                                            }
                                                                                                                                            var37_34 = var8_8;
                                                                                                                                            var47_42 = var9_9;
                                                                                                                                            var35_32 = var10_10;
                                                                                                                                            var3_3 = var20_20.w;
                                                                                                                                            ct3.h(var3_3);
                                                                                                                                            var4_4 = var3_3.b;
                                                                                                                                            if (var4_4 == null) throw ParserException.a("CodecId is missing in TrackEntry element", null);
                                                                                                                                            var61_52 /* !! */  = var4_4.hashCode();
                                                                                                                                            switch (var61_52 /* !! */ ) {
                                                                                                                                                default: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    ** GOTO lbl617
                                                                                                                                                }
                                                                                                                                                case 1951062397: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var21_21);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var9_9;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 32;
                                                                                                                                                    var13_13 = 4.5E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 1950789798: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_FLAC";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 31;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 31;
                                                                                                                                                    var13_13 = 4.3E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 1950749482: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_EAC3";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 30;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 30;
                                                                                                                                                    var13_13 = 4.2E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 1809237540: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_MPEG2";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 29;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 29;
                                                                                                                                                    var13_13 = 4.1E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 1422270023: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "S_TEXT/UTF8";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 28;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 28;
                                                                                                                                                    var13_13 = 3.9E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 1045209816: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "S_TEXT/WEBVTT";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 27;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 27;
                                                                                                                                                    var13_13 = 3.8E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 855502857: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_MPEGH/ISO/HEVC";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 26;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 26;
                                                                                                                                                    var13_13 = 3.6E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 738597099: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "S_TEXT/ASS";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 25;
                                                                                                                                                    var13_13 = 3.5E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 725957860: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_PCM/INT/LIT";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 24;
                                                                                                                                                    var13_13 = 3.4E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 725948237: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_PCM/INT/BIG";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 23;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 23;
                                                                                                                                                    var13_13 = 3.2E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 635596514: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_PCM/FLOAT/IEEE";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 22;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 22;
                                                                                                                                                    var13_13 = 3.1E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 542569478: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_DTS/EXPRESS";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 21;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 21;
                                                                                                                                                    var13_13 = 2.9E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 444813526: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_THEORA";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 20;
                                                                                                                                                    var13_13 = 2.8E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 99146302: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "S_HDMV/PGS";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 19;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 19;
                                                                                                                                                    var13_13 = 2.7E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 82338134: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_VP9";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 18;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 18;
                                                                                                                                                    var13_13 = 2.5E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 82338133: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_VP8";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 17;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 17;
                                                                                                                                                    var13_13 = 2.4E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 82318131: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_AV1";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 16;
                                                                                                                                                    var13_13 = 2.2E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 62927045: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_DTS";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 15;
                                                                                                                                                    var13_13 = 2.1E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 62923603: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_AC3";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 14;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 14;
                                                                                                                                                    var13_13 = 2.0E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case 62923557: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_AAC";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 13;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 13;
                                                                                                                                                    var13_13 = 1.8E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -356037306: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_DTS/LOSSLESS";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 12;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 12;
                                                                                                                                                    var13_13 = 1.7E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -425012669: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "S_VOBSUB";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 11;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 11;
                                                                                                                                                    var13_13 = 1.5E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -538363109: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_MPEG4/ISO/AVC";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 10;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 10;
                                                                                                                                                    var13_13 = 1.4E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -538363189: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_MPEG4/ISO/ASP";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 9;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 9;
                                                                                                                                                    var13_13 = 1.3E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -933872740: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "S_DVBSUB";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 8;
                                                                                                                                                    var13_13 = 1.1E-44f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -1373388978: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "V_MS/VFW/FOURCC";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 7;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 7;
                                                                                                                                                    var13_13 = 9.8E-45f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -1482641357: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = "A_MPEG/L3";
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var55_48 /* !! */  = 6;
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 6;
                                                                                                                                                    var13_13 = 8.4E-45f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -1482641358: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var5_5);
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var9_9;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 5;
                                                                                                                                                    var13_13 = 7.0E-45f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -1730367663: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var6_6 /* !! */ );
                                                                                                                                                    if (var55_48 /* !! */  == 0) ** GOTO lbl617
                                                                                                                                                    var10_10 = var9_9;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 4;
                                                                                                                                                    var13_13 = 5.6E-45f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -1784763192: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var55_48 /* !! */  = (int)var4_4.equals(var7_7 /* !! */ );
                                                                                                                                                    if (var55_48 /* !! */  != 0) ** GOTO lbl621
lbl617:
                                                                                                                                                    // 31 sources

                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    ** GOTO lbl-1000
lbl621:
                                                                                                                                                    // 1 sources

                                                                                                                                                    var10_10 = var9_9;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var12_12 = 3;
                                                                                                                                                    var13_13 = 4.2E-45f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -1985379776: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var56_49 = var4_4.equals(var37_34);
                                                                                                                                                    if (var56_49 != 0) ** GOTO lbl634
                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    ** GOTO lbl645
lbl634:
                                                                                                                                                    // 1 sources

                                                                                                                                                    var10_10 = var47_42;
                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var12_12 = 2;
                                                                                                                                                    var13_13 = 2.8E-45f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -2095575984: {
                                                                                                                                                    var8_8 = var21_21;
                                                                                                                                                    var10_10 = var9_9;
                                                                                                                                                    var9_9 = var37_34;
                                                                                                                                                    var31_29 = (int)var4_4.equals(var47_42);
                                                                                                                                                    if (var31_29 != 0) ** GOTO lbl647
lbl645:
                                                                                                                                                    // 2 sources

                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    ** GOTO lbl-1000
lbl647:
                                                                                                                                                    // 1 sources

                                                                                                                                                    var30_28 = var35_32;
                                                                                                                                                    var12_12 = 1;
                                                                                                                                                    var13_13 = 1.4E-45f;
                                                                                                                                                    break block256;
                                                                                                                                                }
                                                                                                                                                case -2095576542: 
                                                                                                                                            }
                                                                                                                                            var8_8 = var21_21;
                                                                                                                                            var10_10 = var9_9;
                                                                                                                                            var30_28 = var35_32;
                                                                                                                                            var9_9 = var37_34;
                                                                                                                                            var12_12 = (int)var4_4.equals(var35_32);
                                                                                                                                            if (var12_12 == 0) lbl-1000:
                                                                                                                                            // 3 sources

                                                                                                                                            {
                                                                                                                                                var12_12 = -1;
                                                                                                                                                var13_13 = 0.0f / 0.0f;
                                                                                                                                            } else {
                                                                                                                                                var12_12 = 0;
                                                                                                                                                var13_13 = 0.0f;
                                                                                                                                                var14_14 = null;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        switch (var12_12) {
                                                                                                                                            default: {
                                                                                                                                                var34_31 = var5_5;
                                                                                                                                                var35_32 = var6_6 /* !! */ ;
                                                                                                                                                var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                var47_42 = var8_8;
                                                                                                                                                var37_34 = var9_9;
                                                                                                                                                var4_4 = var20_20;
                                                                                                                                                var50_45 = 0;
                                                                                                                                                var3_3 = null;
                                                                                                                                                var38_35 /* !! */  = 25;
                                                                                                                                                var39_36 = 3.5E-44f;
                                                                                                                                                break block257;
                                                                                                                                            }
                                                                                                                                            case 0: 
                                                                                                                                            case 1: 
                                                                                                                                            case 2: 
                                                                                                                                            case 3: 
                                                                                                                                            case 4: 
                                                                                                                                            case 5: 
                                                                                                                                            case 6: 
                                                                                                                                            case 7: 
                                                                                                                                            case 8: 
                                                                                                                                            case 9: 
                                                                                                                                            case 10: 
                                                                                                                                            case 11: 
                                                                                                                                            case 12: 
                                                                                                                                            case 13: 
                                                                                                                                            case 14: 
                                                                                                                                            case 15: 
                                                                                                                                            case 16: 
                                                                                                                                            case 17: 
                                                                                                                                            case 18: 
                                                                                                                                            case 19: 
                                                                                                                                            case 20: 
                                                                                                                                            case 21: 
                                                                                                                                            case 22: 
                                                                                                                                            case 23: 
                                                                                                                                            case 24: 
                                                                                                                                            case 25: 
                                                                                                                                            case 26: 
                                                                                                                                            case 27: 
                                                                                                                                            case 28: 
                                                                                                                                            case 29: 
                                                                                                                                            case 30: 
                                                                                                                                            case 31: 
                                                                                                                                            case 32: {
                                                                                                                                                var14_14 = var20_20.d0;
                                                                                                                                                var16_16 = var3_3.c;
                                                                                                                                                var49_44 = "application/vobsub";
                                                                                                                                                var48_43 = "application/pgs";
                                                                                                                                                var26_25 = var20_20;
                                                                                                                                                var20_20 = "video/x-unknown";
                                                                                                                                                var66_56 = var11_11;
                                                                                                                                                var11_11 = "text/x-ssa";
                                                                                                                                                var67_57 = var14_14;
                                                                                                                                                var14_14 = "text/vtt";
                                                                                                                                                var68_58 = var16_16;
                                                                                                                                                var17_17 = "application/x-subrip";
                                                                                                                                                var69_59 = "application/dvbsubs";
                                                                                                                                                var18_18 = ". Setting mimeType to audio/x-unknown";
                                                                                                                                                var70_60 = "audio/raw";
                                                                                                                                                var71_61 = "audio/x-unknown";
                                                                                                                                                var72_62 /* !! */  = var4_4.hashCode();
                                                                                                                                                switch (var72_62 /* !! */ ) {
                                                                                                                                                    case 1951062397: {
                                                                                                                                                        var72_62 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var72_62 /* !! */  != 0) ** GOTO lbl703
                                                                                                                                                    }
                                                                                                                                                    default: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        ** GOTO lbl-1000
                                                                                                                                                    }
lbl703:
                                                                                                                                                    // 1 sources

                                                                                                                                                    var47_42 = var8_8;
                                                                                                                                                    var61_52 /* !! */  = 32;
                                                                                                                                                    ** GOTO lbl926
                                                                                                                                                    case 1950789798: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_FLAC";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 31;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 1950749482: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_EAC3";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 30;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 1809237540: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_MPEG2";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 29;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 1422270023: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "S_TEXT/UTF8";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 28;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 1045209816: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "S_TEXT/WEBVTT";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 27;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 855502857: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_MPEGH/ISO/HEVC";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 26;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 738597099: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "S_TEXT/ASS";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 25;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 725957860: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_PCM/INT/LIT";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 24;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 725948237: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_PCM/INT/BIG";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 23;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 635596514: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_PCM/FLOAT/IEEE";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 22;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 542569478: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_DTS/EXPRESS";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 21;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 444813526: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_THEORA";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 20;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 99146302: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "S_HDMV/PGS";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 19;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 82338134: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_VP9";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 18;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 82338133: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_VP8";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 17;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 82318131: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_AV1";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 16;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 62927045: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_DTS";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 15;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 62923603: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_AC3";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 14;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case 62923557: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_AAC";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 13;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -356037306: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_DTS/LOSSLESS";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 12;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -425012669: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "S_VOBSUB";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 11;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -538363109: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_MPEG4/ISO/AVC";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 10;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -538363189: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_MPEG4/ISO/ASP";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 9;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -933872740: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "S_DVBSUB";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 8;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -1373388978: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "V_MS/VFW/FOURCC";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 7;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -1482641357: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var8_8 = "A_MPEG/L3";
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var8_8);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 6;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -1482641358: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var5_5);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 5;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -1730367663: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var6_6 /* !! */ );
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 4;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -1784763192: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var7_7 /* !! */ );
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 3;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -1985379776: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var9_9);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 2;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -2095575984: {
                                                                                                                                                        var47_42 = var8_8;
                                                                                                                                                        var61_52 /* !! */  = (int)var4_4.equals(var10_10);
                                                                                                                                                        if (var61_52 /* !! */  == 0) ** GOTO lbl-1000
                                                                                                                                                        var61_52 /* !! */  = 1;
                                                                                                                                                        ** GOTO lbl926
                                                                                                                                                    }
                                                                                                                                                    case -2095576542: 
                                                                                                                                                }
                                                                                                                                                var47_42 = var8_8;
                                                                                                                                                var61_52 /* !! */  = (int)var4_4.equals(var30_28);
                                                                                                                                                if (var61_52 /* !! */  == 0) lbl-1000:
                                                                                                                                                // 33 sources

                                                                                                                                                {
                                                                                                                                                    var61_52 /* !! */  = -1;
                                                                                                                                                } else {
                                                                                                                                                    var61_52 /* !! */  = 0;
                                                                                                                                                    var8_8 = null;
                                                                                                                                                }
lbl926:
                                                                                                                                                // 34 sources

                                                                                                                                                switch (var61_52 /* !! */ ) {
                                                                                                                                                    default: {
                                                                                                                                                        throw ParserException.a("Unrecognized codec identifier.", null);
                                                                                                                                                    }
                                                                                                                                                    case 32: {
                                                                                                                                                        var4_4 = new ArrayList(3);
                                                                                                                                                        var8_8 = var3_3.b;
                                                                                                                                                        var8_8 = (Pair)var3_3.a((String)var8_8);
                                                                                                                                                        var4_4.add(var8_8);
                                                                                                                                                        var20_20 = ByteBuffer.allocate(8);
                                                                                                                                                        var18_18 = ByteOrder.LITTLE_ENDIAN;
                                                                                                                                                        var20_20 = var20_20.order((ByteOrder)var18_18);
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var59_51 = var3_3.S;
                                                                                                                                                        var8_8 = (Pair)var20_20.putLong(var59_51).array();
                                                                                                                                                        var4_4.add(var8_8);
                                                                                                                                                        var8_8 = ByteBuffer.allocate(8).order((ByteOrder)var18_18);
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var73_63 = var3_3.T;
                                                                                                                                                        var5_5 = var8_8.putLong(var73_63).array();
                                                                                                                                                        var4_4.add(var5_5);
                                                                                                                                                        var20_20 = "audio/opus";
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        var75_64 /* !! */  = 5760;
                                                                                                                                                        ** GOTO lbl1258
                                                                                                                                                    }
                                                                                                                                                    case 31: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var4_4 = Collections.singletonList(var3_3.a((String)var4_4));
                                                                                                                                                        var20_20 = "audio/flac";
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        ** GOTO lbl1252
                                                                                                                                                    }
                                                                                                                                                    case 30: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var20_20 = "audio/eac3";
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 29: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var20_20 = "video/mpeg2";
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 28: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var17_17;
                                                                                                                                                        ** GOTO lbl1198
                                                                                                                                                    }
                                                                                                                                                    case 27: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var14_14;
                                                                                                                                                        ** GOTO lbl1198
                                                                                                                                                    }
                                                                                                                                                    case 26: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var5_5 = var3_3.b;
                                                                                                                                                        var5_5 = var3_3.a((String)var5_5);
                                                                                                                                                        var4_4 = new Xm2((byte[])var5_5);
                                                                                                                                                        var6_6 /* !! */  = null;
                                                                                                                                                        var4_4 = T41.a((Xm2)var4_4, false, null);
                                                                                                                                                        var3_3.Z = var38_35 /* !! */  = var4_4.b;
                                                                                                                                                        var20_20 = "video/hevc";
                                                                                                                                                        var5_5 = var4_4.a;
                                                                                                                                                        var4_4 = var4_4.k;
                                                                                                                                                        var8_8 = var4_4;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        var75_64 /* !! */  = -1;
                                                                                                                                                        var7_7 /* !! */  = var5_5;
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    case 25: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var4_4 = var3_3.a((String)var4_4);
                                                                                                                                                        var5_5 = tk1_1.f0;
                                                                                                                                                        var4_4 = ImmutableList.of(var5_5, var4_4);
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var11_11;
                                                                                                                                                        ** GOTO lbl1252
                                                                                                                                                    }
                                                                                                                                                    case 24: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var62_53 = gz3.s(var3_3.Q);
                                                                                                                                                        if (var62_53 != 0) ** GOTO lbl1040
                                                                                                                                                        var5_5 = "Unsupported little endian PCM bit depth: ";
                                                                                                                                                        var4_4 = new StringBuilder((String)var5_5);
                                                                                                                                                        var38_35 /* !! */  = var3_3.Q;
                                                                                                                                                        var4_4.append(var38_35 /* !! */ );
                                                                                                                                                        var4_4.append((String)var18_18);
                                                                                                                                                        var4_4 = var4_4.toString();
                                                                                                                                                        Cx.f((String)var4_4);
                                                                                                                                                        ** GOTO lbl1116
lbl1040:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var38_35 /* !! */  = var62_53;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var70_60;
                                                                                                                                                        ** GOTO lbl1200
                                                                                                                                                    }
                                                                                                                                                    case 23: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var62_53 = var3_3.Q;
                                                                                                                                                        var38_35 /* !! */  = 8;
                                                                                                                                                        var39_36 = 1.1E-44f;
                                                                                                                                                        if (var62_53 != var38_35 /* !! */ ) ** GOTO lbl1057
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var70_60;
                                                                                                                                                        var38_35 /* !! */  = 3;
                                                                                                                                                        var39_36 = 4.2E-45f;
                                                                                                                                                        ** GOTO lbl1200
lbl1057:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var38_35 /* !! */  = 16;
                                                                                                                                                        var39_36 = 2.2E-44f;
                                                                                                                                                        if (var62_53 != var38_35 /* !! */ ) ** GOTO lbl1066
                                                                                                                                                        var62_53 = 0x10000000;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var70_60;
                                                                                                                                                        var38_35 /* !! */  = 0x10000000;
                                                                                                                                                        var39_36 = 2.524355E-29f;
                                                                                                                                                        ** GOTO lbl1200
lbl1066:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var38_35 /* !! */  = 24;
                                                                                                                                                        var39_36 = 3.4E-44f;
                                                                                                                                                        if (var62_53 != var38_35 /* !! */ ) ** GOTO lbl1075
                                                                                                                                                        var62_53 = 0x50000000;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var70_60;
                                                                                                                                                        var38_35 /* !! */  = 0x50000000;
                                                                                                                                                        var39_36 = 8.589935E9f;
                                                                                                                                                        ** GOTO lbl1200
lbl1075:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        if (var62_53 != var38_35 /* !! */ ) ** GOTO lbl1084
                                                                                                                                                        var62_53 = 0x60000000;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var70_60;
                                                                                                                                                        var38_35 /* !! */  = 0x60000000;
                                                                                                                                                        var39_36 = 3.689349E19f;
                                                                                                                                                        ** GOTO lbl1200
lbl1084:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var5_5 = "Unsupported big endian PCM bit depth: ";
                                                                                                                                                        var4_4 = new StringBuilder((String)var5_5);
                                                                                                                                                        var38_35 /* !! */  = var3_3.Q;
                                                                                                                                                        var4_4.append(var38_35 /* !! */ );
                                                                                                                                                        var4_4.append((String)var18_18);
                                                                                                                                                        var4_4 = var4_4.toString();
                                                                                                                                                        Cx.f((String)var4_4);
                                                                                                                                                        ** GOTO lbl1116
                                                                                                                                                    }
                                                                                                                                                    case 22: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var62_53 = var3_3.Q;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        if (var62_53 != var38_35 /* !! */ ) ** GOTO lbl1107
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var70_60;
                                                                                                                                                        var38_35 /* !! */  = 4;
                                                                                                                                                        var39_36 = 5.6E-45f;
                                                                                                                                                        ** GOTO lbl1200
lbl1107:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var6_6 /* !! */  = "Unsupported floating point PCM bit depth: ";
                                                                                                                                                        var4_4 = new StringBuilder((String)var6_6 /* !! */ );
                                                                                                                                                        var40_37 /* !! */  = var3_3.Q;
                                                                                                                                                        var4_4.append(var40_37 /* !! */ );
                                                                                                                                                        var4_4.append((String)var18_18);
                                                                                                                                                        var4_4 = var4_4.toString();
                                                                                                                                                        Cx.f((String)var4_4);
lbl1116:
                                                                                                                                                        // 3 sources

                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var71_61;
                                                                                                                                                        ** GOTO lbl1198
                                                                                                                                                    }
                                                                                                                                                    case 20: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 19: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var48_43;
                                                                                                                                                        ** GOTO lbl1198
                                                                                                                                                    }
                                                                                                                                                    case 18: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "video/x-vnd.on2.vp9";
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 17: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "video/x-vnd.on2.vp8";
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 16: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "video/av01";
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 15: 
                                                                                                                                                    case 21: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "audio/vnd.dts";
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 14: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "audio/ac3";
                                                                                                                                                        ** GOTO lbl1197
                                                                                                                                                    }
                                                                                                                                                    case 13: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var4_4 = Collections.singletonList(var3_3.a((String)var4_4));
                                                                                                                                                        var6_6 /* !! */  = (DrmInitData$SchemeData[])var3_3.k;
                                                                                                                                                        var29_27 /* !! */  = var6_6 /* !! */ .length;
                                                                                                                                                        var8_8 = new Vm2((byte[])var6_6 /* !! */ , (int)var29_27 /* !! */ );
                                                                                                                                                        var8_8 = y0.b((Vm2)var8_8, false);
                                                                                                                                                        var3_3.R = var40_37 /* !! */  = var8_8.a;
                                                                                                                                                        var3_3.P = var40_37 /* !! */  = var8_8.b;
                                                                                                                                                        var20_20 = "audio/mp4a-latm";
                                                                                                                                                        var6_6 /* !! */  = var8_8.c;
                                                                                                                                                        var8_8 = var6_6 /* !! */ ;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        ** GOTO lbl1257
                                                                                                                                                    }
                                                                                                                                                    case 12: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "audio/vnd.dts.hd";
lbl1197:
                                                                                                                                                        // 9 sources

                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
lbl1198:
                                                                                                                                                        // 5 sources

                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
lbl1200:
                                                                                                                                                        // 7 sources

                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        var76_65 = 0;
                                                                                                                                                        var7_7 /* !! */  = null;
                                                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        var75_64 /* !! */  = -1;
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    case 11: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var4_4 = ImmutableList.of((Object)var3_3.a((String)var4_4));
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var49_44;
                                                                                                                                                        ** GOTO lbl1252
                                                                                                                                                    }
                                                                                                                                                    case 10: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var6_6 /* !! */  = var3_3.b;
                                                                                                                                                        var6_6 /* !! */  = (DrmInitData$SchemeData[])var3_3.a((String)var6_6 /* !! */ );
                                                                                                                                                        var4_4 = new Xm2((byte[])var6_6 /* !! */ );
                                                                                                                                                        var4_4 = iu_0.a((Xm2)var4_4);
                                                                                                                                                        var3_3.Z = var40_37 /* !! */  = var4_4.b;
                                                                                                                                                        var20_20 = "video/avc";
                                                                                                                                                        var6_6 /* !! */  = var4_4.a;
                                                                                                                                                        var4_4 = var4_4.l;
                                                                                                                                                        var8_8 = var4_4;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        var75_64 /* !! */  = -1;
                                                                                                                                                        var7_7 /* !! */  = var6_6 /* !! */ ;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    case 8: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var40_37 /* !! */  = 4;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var8_8 = (Pair)new byte[var40_37 /* !! */ ];
                                                                                                                                                        var4_4 = var3_3.a((String)var4_4);
                                                                                                                                                        var29_27 /* !! */  = 0;
                                                                                                                                                        var65_55 = 0.0f;
                                                                                                                                                        System.arraycopy(var4_4, 0, var8_8, 0, var40_37 /* !! */ );
                                                                                                                                                        var4_4 = ImmutableList.of(var8_8);
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var20_20 = var69_59;
lbl1252:
                                                                                                                                                        // 4 sources

                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                                                        var8_8 = null;
lbl1257:
                                                                                                                                                        // 2 sources

                                                                                                                                                        var75_64 /* !! */  = -1;
lbl1258:
                                                                                                                                                        // 2 sources

                                                                                                                                                        var7_7 /* !! */  = var4_4;
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    case 7: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var6_6 /* !! */  = var3_3.b;
                                                                                                                                                        var6_6 /* !! */  = (DrmInitData$SchemeData[])var3_3.a((String)var6_6 /* !! */ );
                                                                                                                                                        var4_4 = new Xm2((byte[])var6_6 /* !! */ );
                                                                                                                                                        var40_37 /* !! */  = 16;
                                                                                                                                                        var4_4.J(var40_37 /* !! */ );
                                                                                                                                                        var77_66 = var4_4.n();
                                                                                                                                                        var79_67 = 1482049860L;
                                                                                                                                                        var61_52 /* !! */  = (int)(var77_66 == var79_67 ? 0 : (var77_66 < var79_67 ? -1 : 1));
                                                                                                                                                        if (var61_52 /* !! */  != 0) ** GOTO lbl1287
                                                                                                                                                        var8_8 = "video/divx";
                                                                                                                                                        var29_27 /* !! */  = 0;
                                                                                                                                                        var65_55 = 0.0f;
                                                                                                                                                        var20_20 = null;
                                                                                                                                                        try {
                                                                                                                                                            var4_4 = new Pair((Object)var8_8, null);
                                                                                                                                                        }
                                                                                                                                                        catch (ArrayIndexOutOfBoundsException v0) {
                                                                                                                                                            var61_52 /* !! */  = 0;
                                                                                                                                                            var8_8 = null;
                                                                                                                                                            throw ParserException.a("Error parsing FourCC private data", null);
                                                                                                                                                        }
lbl1287:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var79_67 = 859189832L;
                                                                                                                                                        cfr_temp_7 = var77_66 - var79_67;
                                                                                                                                                        var61_52 /* !! */  = (int)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                                                                                                                                                        if (var61_52 /* !! */  != 0) ** GOTO lbl1301
                                                                                                                                                        var8_8 = "video/3gpp";
                                                                                                                                                        var29_27 /* !! */  = 0;
                                                                                                                                                        var65_55 = 0.0f;
                                                                                                                                                        var20_20 = null;
                                                                                                                                                        var4_4 = new Pair((Object)var8_8, null);
                                                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        var75_64 /* !! */  = 15;
                                                                                                                                                        break block239;
lbl1301:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var79_67 = 826496599L;
                                                                                                                                                        cfr_temp_8 = var77_66 - var79_67;
                                                                                                                                                        var61_52 /* !! */  = (int)(cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1));
                                                                                                                                                        if (var61_52 /* !! */  == 0) {
                                                                                                                                                            var61_52 /* !! */  = var4_4.b + 20;
                                                                                                                                                            var4_4 = var4_4.a;
                                                                                                                                                        }
                                                                                                                                                        var75_64 /* !! */  = 15;
                                                                                                                                                        Cx.f("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        var4_4 = new Pair(var20_20, null);
                                                                                                                                                        break block239;
                                                                                                                                                    }
                                                                                                                                                    case 6: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var40_37 /* !! */  = 16;
                                                                                                                                                        var75_64 /* !! */  = 15;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "audio/mpeg";
                                                                                                                                                        ** GOTO lbl1334
                                                                                                                                                    }
                                                                                                                                                    case 5: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var40_37 /* !! */  = 16;
                                                                                                                                                        var75_64 /* !! */  = 15;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var20_20 = "audio/mpeg-L2";
lbl1334:
                                                                                                                                                        // 2 sources

                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        var76_65 = 0;
                                                                                                                                                        var7_7 /* !! */  = null;
                                                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        var75_64 /* !! */  = 4096;
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    case 4: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var40_37 /* !! */  = 16;
                                                                                                                                                        var75_64 /* !! */  = 15;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var38_35 /* !! */  = 32;
                                                                                                                                                        var39_36 = 4.5E-44f;
                                                                                                                                                        var4_4 = var3_3.a((String)var4_4);
                                                                                                                                                        var8_8 = "Error parsing vorbis codec private";
                                                                                                                                                        var29_27 /* !! */  = 0;
                                                                                                                                                        var65_55 = 0.0f;
                                                                                                                                                        var20_20 = null;
                                                                                                                                                        try {
                                                                                                                                                            var38_35 /* !! */  = (int)var4_4[0];
                                                                                                                                                            var29_27 /* !! */  = 2;
                                                                                                                                                            var65_55 = 2.8E-45f;
                                                                                                                                                            if (var38_35 /* !! */  != var29_27 /* !! */ ) ** GOTO lbl1443
                                                                                                                                                            var38_35 /* !! */  = 1;
                                                                                                                                                            var39_36 = 1.4E-45f;
                                                                                                                                                            var29_27 /* !! */  = 0;
                                                                                                                                                            var65_55 = 0.0f;
                                                                                                                                                            var20_20 = null;
                                                                                                                                                            while (true) {
                                                                                                                                                                var40_37 /* !! */  = (int)var4_4[var38_35 /* !! */ ];
                                                                                                                                                                var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                                var76_65 = 255;
                                                                                                                                                                if ((var40_37 /* !! */  &= var76_65) != var76_65) break;
                                                                                                                                                                var29_27 /* !! */  += var76_65;
                                                                                                                                                                var40_37 /* !! */  = 1;
                                                                                                                                                                var38_35 /* !! */  += var40_37 /* !! */ ;
                                                                                                                                                            }
                                                                                                                                                            var75_64 /* !! */  = 1;
                                                                                                                                                            var38_35 /* !! */  += var75_64 /* !! */ ;
                                                                                                                                                            var29_27 /* !! */  += var40_37 /* !! */ ;
                                                                                                                                                            var40_37 /* !! */  = 0;
                                                                                                                                                            var6_6 /* !! */  = null;
                                                                                                                                                            while ((var75_64 /* !! */  = (long)(var4_4[var38_35 /* !! */ ] & var76_65)) == var76_65) {
                                                                                                                                                                var40_37 /* !! */  += var76_65;
                                                                                                                                                                var75_64 /* !! */  = 1;
                                                                                                                                                                var38_35 /* !! */  += var75_64 /* !! */ ;
                                                                                                                                                            }
                                                                                                                                                            var76_65 = 1;
                                                                                                                                                            var40_37 /* !! */  += var75_64 /* !! */ ;
                                                                                                                                                            var75_64 /* !! */  = (long)var4_4[var38_35 /* !! */  += var76_65];
                                                                                                                                                            if (var75_64 /* !! */  != var76_65) ** GOTO lbl1439
                                                                                                                                                            var7_7 /* !! */  = (DrmInitData$SchemeData[])new byte[var29_27 /* !! */ ];
                                                                                                                                                            var75_64 /* !! */  = 0;
                                                                                                                                                            var18_18 = null;
                                                                                                                                                            System.arraycopy(var4_4, var38_35 /* !! */ , var7_7 /* !! */ , 0, (int)var29_27 /* !! */ );
                                                                                                                                                            var38_35 /* !! */  += var29_27 /* !! */ ;
                                                                                                                                                            var29_27 /* !! */  = (long)var4_4[var38_35 /* !! */ ];
                                                                                                                                                            var75_64 /* !! */  = 3;
                                                                                                                                                            if (var29_27 /* !! */  != var75_64 /* !! */ ) ** GOTO lbl1435
                                                                                                                                                            var38_35 /* !! */  += var40_37 /* !! */ ;
                                                                                                                                                            var40_37 /* !! */  = (int)var4_4[var38_35 /* !! */ ];
                                                                                                                                                            var29_27 /* !! */  = 5;
                                                                                                                                                            var65_55 = 7.0E-45f;
                                                                                                                                                            if (var40_37 /* !! */  != var29_27 /* !! */ ) ** GOTO lbl1430
                                                                                                                                                            var40_37 /* !! */  = ((List<Object>)var4_4).length - var38_35 /* !! */ ;
                                                                                                                                                            var6_6 /* !! */  = (DrmInitData$SchemeData[])new byte[var40_37 /* !! */ ];
                                                                                                                                                            var29_27 /* !! */  = ((Pair)var4_4).length - var38_35 /* !! */ ;
                                                                                                                                                        }
                                                                                                                                                        catch (ArrayIndexOutOfBoundsException v1) {
                                                                                                                                                            var50_45 = 0;
                                                                                                                                                            var3_3 = null;
                                                                                                                                                            throw ParserException.a((String)var8_8, null);
                                                                                                                                                        }
                                                                                                                                                        var75_64 /* !! */  = 0;
                                                                                                                                                        var18_18 = null;
                                                                                                                                                        System.arraycopy(var4_4, var38_35 /* !! */ , var6_6 /* !! */ , 0, (int)var29_27 /* !! */ );
                                                                                                                                                        var38_35 /* !! */  = 2;
                                                                                                                                                        var39_36 = 2.8E-45f;
                                                                                                                                                        var4_4 = new ArrayList(var38_35 /* !! */ );
                                                                                                                                                        var4_4.add(var7_7 /* !! */ );
                                                                                                                                                        var4_4.add(var6_6 /* !! */ );
                                                                                                                                                        var20_20 = "audio/vorbis";
                                                                                                                                                        var7_7 /* !! */  = var4_4;
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                                                        var8_8 = null;
                                                                                                                                                        var75_64 /* !! */  = 8192;
                                                                                                                                                        ** break;
lbl1430:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var50_45 = 0;
                                                                                                                                                        var3_3 = null;
                                                                                                                                                        var4_4 = ParserException.a((String)var8_8, null);
                                                                                                                                                        throw var4_4;
lbl1435:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var50_45 = 0;
                                                                                                                                                        var3_3 = null;
                                                                                                                                                        var4_4 = ParserException.a((String)var8_8, null);
                                                                                                                                                        throw var4_4;
lbl1439:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var50_45 = 0;
                                                                                                                                                        var3_3 = null;
                                                                                                                                                        var4_4 = ParserException.a((String)var8_8, null);
                                                                                                                                                        throw var4_4;
lbl1443:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var50_45 = 0;
                                                                                                                                                        var3_3 = null;
                                                                                                                                                        var4_4 = ParserException.a((String)var8_8, null);
                                                                                                                                                        throw var4_4;
                                                                                                                                                    }
                                                                                                                                                    case 3: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var3_3.U = var4_4 = new zs3();
                                                                                                                                                        var20_20 = "audio/true-hd";
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        ** GOTO lbl1505
                                                                                                                                                    }
                                                                                                                                                    case 2: {
                                                                                                                                                        var35_32 = var6_6 /* !! */ ;
                                                                                                                                                        var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                        var37_34 = var9_9;
                                                                                                                                                        var62_53 = 15;
                                                                                                                                                        var9_9 = var5_5;
                                                                                                                                                        var6_6 /* !! */  = var3_3.b;
                                                                                                                                                        var6_6 /* !! */  = (DrmInitData$SchemeData[])var3_3.a((String)var6_6 /* !! */ );
                                                                                                                                                        var5_5 = new Xm2((byte[])var6_6 /* !! */ );
                                                                                                                                                        try {
                                                                                                                                                            var40_37 /* !! */  = var5_5.p();
                                                                                                                                                            var76_65 = 1;
                                                                                                                                                            if (var40_37 /* !! */  != var76_65) ** GOTO lbl1475
                                                                                                                                                            var40_37 /* !! */  = 24;
                                                                                                                                                        }
                                                                                                                                                        catch (ArrayIndexOutOfBoundsException v2) {
                                                                                                                                                            throw ParserException.a("Error parsing MS/ACM codec private", null);
                                                                                                                                                        }
lbl1475:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var76_65 = (char)-2;
                                                                                                                                                        if (var40_37 /* !! */  != var76_65) ** GOTO lbl1499
                                                                                                                                                        var40_37 /* !! */  = 24;
                                                                                                                                                        var5_5.I(var40_37 /* !! */ );
                                                                                                                                                        var82_69 = var5_5.q();
                                                                                                                                                        var20_20 = tk1_1.i0;
                                                                                                                                                        var79_67 = var20_20.getMostSignificantBits();
                                                                                                                                                        var84_70 = var82_69 == var79_67 ? 0 : (var82_69 < var79_67 ? -1 : 1);
                                                                                                                                                        if (var84_70 != false || (var38_35 /* !! */  = (int)((cfr_temp_9 = (var82_69 = var5_5.q()) - (var79_67 = var20_20.getLeastSignificantBits())) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1))) != 0) ** GOTO lbl1500
                                                                                                                                                        var38_35 /* !! */  = gz3.s(var3_3.Q);
                                                                                                                                                        if (var38_35 /* !! */  != 0) ** GOTO lbl1497
                                                                                                                                                        var7_7 /* !! */  = "Unsupported PCM bit depth: ";
                                                                                                                                                        var5_5 = new StringBuilder((String)var7_7 /* !! */ );
                                                                                                                                                        var76_65 = var3_3.Q;
                                                                                                                                                        var5_5.append(var76_65);
                                                                                                                                                        var5_5.append((String)var18_18);
                                                                                                                                                        var5_5 = var5_5.toString();
                                                                                                                                                        Cx.f((String)var5_5);
                                                                                                                                                        ** GOTO lbl1502
lbl1497:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var20_20 = var70_60;
                                                                                                                                                        ** GOTO lbl1505
lbl1499:
                                                                                                                                                        // 1 sources

                                                                                                                                                        var40_37 /* !! */  = 24;
lbl1500:
                                                                                                                                                        // 2 sources

                                                                                                                                                        var5_5 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                                                                                                                                                        Cx.f((String)var5_5);
lbl1502:
                                                                                                                                                        // 2 sources

                                                                                                                                                        var20_20 = var71_61;
                                                                                                                                                        var38_35 /* !! */  = -1;
                                                                                                                                                        var39_36 = 0.0f / 0.0f;
lbl1505:
                                                                                                                                                        // 3 sources

                                                                                                                                                        var76_65 = 0;
                                                                                                                                                        var7_7 /* !! */  = null;
                                                                                                                                                        ** GOTO lbl1526
                                                                                                                                                    }
                                                                                                                                                    case 0: 
                                                                                                                                                    case 1: 
                                                                                                                                                    case 9: 
                                                                                                                                                }
                                                                                                                                                var35_32 = var6_6 /* !! */ ;
                                                                                                                                                var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                                var37_34 = var9_9;
                                                                                                                                                var62_53 = 15;
                                                                                                                                                var40_37 /* !! */  = 24;
                                                                                                                                                var9_9 = var5_5;
                                                                                                                                                var5_5 = var3_3.k;
                                                                                                                                                if (var5_5 == null) {
                                                                                                                                                    var38_35 /* !! */  = 0;
                                                                                                                                                    var39_36 = 0.0f;
                                                                                                                                                    var5_5 = null;
                                                                                                                                                } else {
                                                                                                                                                    var5_5 = Collections.singletonList(var5_5);
                                                                                                                                                }
                                                                                                                                                var20_20 = "video/mp4v-es";
                                                                                                                                                var7_7 /* !! */  = var5_5;
                                                                                                                                                var38_35 /* !! */  = -1;
                                                                                                                                                var39_36 = 0.0f / 0.0f;
lbl1526:
                                                                                                                                                // 2 sources

                                                                                                                                                var61_52 /* !! */  = 0;
                                                                                                                                                var8_8 = null;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break block258;
                                                                                                                                    }
                                                                                                                                    var34_31 = var5_5;
                                                                                                                                    var35_32 = var6_6 /* !! */ ;
                                                                                                                                    var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                    var37_34 = var8_8;
                                                                                                                                    var30_28 = var10_10;
                                                                                                                                    var4_4 = var20_20;
                                                                                                                                    var6_6 /* !! */  = var11_11;
                                                                                                                                    var47_42 = var21_21;
                                                                                                                                    var38_35 /* !! */  = 25;
                                                                                                                                    var39_36 = 3.5E-44f;
                                                                                                                                    var10_10 = var9_9;
                                                                                                                                    var50_45 = var20_20.I;
                                                                                                                                    var76_65 = 2;
                                                                                                                                    if (var50_45 != var76_65) break block259;
                                                                                                                                    var50_45 = var20_20.O;
                                                                                                                                    var3_3 = (TK1$b)var11_11.get(var50_45);
                                                                                                                                    var6_6 /* !! */  = var3_3.Y;
                                                                                                                                    var6_6 /* !! */ .getClass();
                                                                                                                                    var92_78 = var20_20.T;
                                                                                                                                    var59_51 = 0L;
                                                                                                                                    var29_27 /* !! */  = var92_78 == var59_51 ? 0 : (var92_78 < var59_51 ? -1 : 1);
                                                                                                                                    if (var29_27 /* !! */  > 0) {
                                                                                                                                        var6_6 /* !! */  = var3_3.b;
                                                                                                                                        var7_7 /* !! */  = var21_21;
                                                                                                                                        var40_37 /* !! */  = (int)var21_21.equals(var6_6 /* !! */ );
                                                                                                                                        if (var40_37 /* !! */  != 0) {
                                                                                                                                            var40_37 /* !! */  = 8;
                                                                                                                                            var8_8 = ByteBuffer.allocate(var40_37 /* !! */ );
                                                                                                                                            var6_6 /* !! */  = ByteOrder.LITTLE_ENDIAN;
                                                                                                                                            var6_6 /* !! */  = var8_8.order((ByteOrder)var6_6 /* !! */ );
                                                                                                                                            var59_51 = var20_20.T;
                                                                                                                                            var6_6 /* !! */  = (DrmInitData$SchemeData[])var6_6 /* !! */ .putLong(var59_51).array();
                                                                                                                                            var8_8 = var20_20.p;
                                                                                                                                            var8_8.getClass();
                                                                                                                                            var55_48 /* !! */  = var6_6 /* !! */ .length;
                                                                                                                                            var8_8.G(var55_48 /* !! */ , (byte[])var6_6 /* !! */ );
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var7_7 /* !! */  = var21_21;
                                                                                                                                    }
                                                                                                                                    var6_6 /* !! */  = null;
                                                                                                                                    var61_52 /* !! */  = 0;
                                                                                                                                    var8_8 = null;
                                                                                                                                    for (var40_37 /* !! */  = 0; var40_37 /* !! */  < (var55_48 /* !! */  = var4_4.M); var61_52 /* !! */  += var55_48 /* !! */ , var40_37 /* !! */  += var55_48 /* !! */ ) {
                                                                                                                                        var9_9 = var4_4.N;
                                                                                                                                        var55_48 /* !! */  = (int)var9_9[var40_37 /* !! */ ];
                                                                                                                                        var55_48 /* !! */  = 1;
                                                                                                                                    }
                                                                                                                                    var6_6 /* !! */  = null;
                                                                                                                                    for (var40_37 /* !! */  = 0; var40_37 /* !! */  < (var55_48 /* !! */  = var4_4.M); var40_37 /* !! */  += var55_48 /* !! */ ) {
                                                                                                                                        var57_50 = var4_4.J;
                                                                                                                                        var32_30 = var3_3.e * var40_37 /* !! */  / 1000;
                                                                                                                                        var94_79 = var57_50 + var32_30;
                                                                                                                                        var55_48 /* !! */  = var4_4.Q;
                                                                                                                                        if (var40_37 /* !! */  == 0 && (var29_27 /* !! */  = (long)var4_4.S) == false) {
                                                                                                                                            var29_27 /* !! */  = 1;
                                                                                                                                            var65_55 = 1.4E-45f;
                                                                                                                                            var55_48 /* !! */  |= var29_27 /* !! */ ;
                                                                                                                                        }
                                                                                                                                        var9_9 = var4_4.N;
                                                                                                                                        var72_62 /* !! */  = (int)var9_9[var40_37 /* !! */ ];
                                                                                                                                        var67_57 = var4_4;
                                                                                                                                        var4_4.g((TK1$b)var3_3, var94_79, var55_48 /* !! */ , var72_62 /* !! */ , var61_52 /* !! */  -= var72_62 /* !! */ );
                                                                                                                                        var55_48 /* !! */  = 1;
                                                                                                                                    }
                                                                                                                                    var40_37 /* !! */  = 0;
                                                                                                                                    var6_6 /* !! */  = null;
                                                                                                                                    var4_4.I = 0;
                                                                                                                                    break block253;
                                                                                                                                }
                                                                                                                                var34_31 = var5_5;
                                                                                                                                var35_32 = var6_6 /* !! */ ;
                                                                                                                                var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                                var37_34 = var8_8;
                                                                                                                                var30_28 = var10_10;
                                                                                                                                break block260;
                                                                                                                            }
                                                                                                                            var34_31 = var5_5;
                                                                                                                            var35_32 = var6_6 /* !! */ ;
                                                                                                                            var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                            var37_34 = var8_8;
                                                                                                                            var30_28 = var10_10;
                                                                                                                            var26_25 = var18_18;
                                                                                                                        }
                                                                                                                        var7_7 /* !! */  = var21_21;
                                                                                                                        var38_35 /* !! */  = 25;
                                                                                                                        var39_36 = 3.5E-44f;
                                                                                                                        var40_37 /* !! */  = 0;
                                                                                                                        var6_6 /* !! */  = null;
                                                                                                                        var10_10 = var9_9;
                                                                                                                        var50_45 = var17_17.e;
                                                                                                                        var4_4 = var17_17.c;
                                                                                                                        if (var50_45 != 0) break block261;
                                                                                                                        var3_3 = var1_1;
                                                                                                                        var3_3 = (il0_0)var1_1;
                                                                                                                        var55_48 /* !! */  = 4;
                                                                                                                        var27_26 = var4_4.c((il0_0)var3_3, true, false, var55_48 /* !! */ );
                                                                                                                        cfr_temp_10 = var27_26 - (var96_80 = (long)-2);
                                                                                                                        var61_52 /* !! */  = (int)(cfr_temp_10 == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1));
                                                                                                                        if (var61_52 /* !! */  != 0) ** GOTO lbl1969
                                                                                                                        break block262;
                                                                                                                    }
                                                                                                                    var40_37 /* !! */  = 1;
                                                                                                                    break block263;
                                                                                                                    catch (ArrayIndexOutOfBoundsException v3) {
                                                                                                                        throw ParserException.a((String)var8_8, null);
                                                                                                                    }
                                                                                                                    catch (ArrayIndexOutOfBoundsException v4) {
                                                                                                                        var61_52 /* !! */  = 0;
                                                                                                                        var8_8 = null;
                                                                                                                        throw ParserException.a("Error parsing FourCC private data", null);
                                                                                                                    }
                                                                                                                    while (true) {
                                                                                                                        block264: {
                                                                                                                            block238: {
                                                                                                                                block236: {
                                                                                                                                    block237: {
                                                                                                                                        var29_27 /* !! */  = ((Object)var4_4).length;
                                                                                                                                        var75_64 /* !! */  = 4;
                                                                                                                                        if (var61_52 /* !! */  >= (var29_27 /* !! */  -= var75_64 /* !! */ )) break;
                                                                                                                                        {
                                                                                                                                            var29_27 /* !! */  = (long)var4_4[var61_52 /* !! */ ];
                                                                                                                                            if (var29_27 /* !! */  != false) break block236;
                                                                                                                                            var29_27 /* !! */  = 1;
                                                                                                                                            var65_55 = 1.4E-45f;
                                                                                                                                            var75_64 /* !! */  = var61_52 /* !! */  + 1;
                                                                                                                                            if ((var75_64 /* !! */  = (long)var4_4[var75_64 /* !! */ ]) != false) break block237;
                                                                                                                                            var75_64 /* !! */  = 2;
                                                                                                                                            var81_68 = var61_52 /* !! */  + 2;
                                                                                                                                            var75_64 /* !! */  = (long)var4_4[var81_68];
                                                                                                                                            if (var75_64 /* !! */  != var29_27 /* !! */ ) break block237;
                                                                                                                                            var29_27 /* !! */  = 3;
                                                                                                                                            var65_55 = 4.2E-45f;
                                                                                                                                            var75_64 /* !! */  = var61_52 /* !! */  + 3;
                                                                                                                                            var29_27 /* !! */  = (long)var4_4[var75_64 /* !! */ ];
                                                                                                                                            if (var29_27 /* !! */  != (var75_64 /* !! */  = (long)15)) break block238;
                                                                                                                                            var29_27 /* !! */  = ((Object)var4_4).length;
                                                                                                                                            var4_4 = Arrays.copyOfRange((byte[])var4_4, var61_52 /* !! */ , (int)var29_27 /* !! */ );
                                                                                                                                            var20_20 = "video/wvc1";
                                                                                                                                            var4_4 = Collections.singletonList(var4_4);
                                                                                                                                            var8_8 = new Pair(var20_20, var4_4);
                                                                                                                                            var4_4 = var8_8;
                                                                                                                                            var61_52 /* !! */  = 0;
                                                                                                                                            var8_8 = null;
                                                                                                                                            break block239;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var75_64 /* !! */  = 15;
                                                                                                                                    break block264;
                                                                                                                                }
                                                                                                                                var75_64 /* !! */  = 15;
                                                                                                                            }
                                                                                                                            var29_27 /* !! */  = 1;
                                                                                                                            var65_55 = 1.4E-45f;
                                                                                                                        }
                                                                                                                        var61_52 /* !! */  += var29_27 /* !! */ ;
                                                                                                                    }
                                                                                                                    var3_3 = "Failed to find FourCC VC1 initialization data";
                                                                                                                    var62_53 = 0;
                                                                                                                    var4_4 = null;
                                                                                                                    try {
                                                                                                                        var3_3 = ParserException.a((String)var3_3, null);
                                                                                                                    }
                                                                                                                    catch (ArrayIndexOutOfBoundsException v5) {}
                                                                                                                    {
                                                                                                                        throw var3_3;
                                                                                                                    }
                                                                                                                }
                                                                                                                var20_20 = (String)var4_4.first;
                                                                                                                var4_4 = var4_4.second;
                                                                                                                var19_19 /* !! */  = var4_4;
                                                                                                                var19_19 /* !! */  = (List)var4_4;
                                                                                                                var36_33 /* !! */  = var7_7 /* !! */ ;
                                                                                                                var7_7 /* !! */  = var19_19 /* !! */ ;
                                                                                                                var38_35 /* !! */  = -1;
                                                                                                                var39_36 = 0.0f / 0.0f;
                                                                                                                var40_37 /* !! */  = 24;
                                                                                                            }
                                                                                                            var75_64 /* !! */  = -1;
                                                                                                            ** break;
lbl1699:
                                                                                                            // 7 sources

                                                                                                            var4_4 = var3_3.O;
                                                                                                            if (var4_4 != null) {
                                                                                                                var6_6 /* !! */  = (DrmInitData$SchemeData[])var3_3.O;
                                                                                                                var4_4 = new Xm2((byte[])var6_6 /* !! */ );
                                                                                                                if ((var4_4 = fs0_0.a((Xm2)var4_4)) != null) {
                                                                                                                    var8_8 = var4_4.a;
                                                                                                                    var20_20 = "video/dolby-vision";
                                                                                                                }
                                                                                                            }
                                                                                                            var62_53 = (int)var3_3.W;
                                                                                                            var40_37 /* !! */  = (int)var3_3.V;
                                                                                                            if (var40_37 /* !! */  != 0) {
                                                                                                                var40_37 /* !! */  = 2;
                                                                                                            } else {
                                                                                                                var40_37 /* !! */  = 0;
                                                                                                                var6_6 /* !! */  = null;
                                                                                                            }
                                                                                                            var62_53 |= var40_37 /* !! */ ;
                                                                                                            var6_6 /* !! */  = new d$a();
                                                                                                            var85_71 = ip1_0.h((String)var20_20);
                                                                                                            var34_31 = var9_9;
                                                                                                            var9_9 = tk1_1.j0;
                                                                                                            if (!var85_71) break block265;
                                                                                                            var6_6 /* !! */ .C = var86_72 = var3_3.P;
                                                                                                            var6_6 /* !! */ .D = var86_72 = var3_3.R;
                                                                                                            var6_6 /* !! */ .E = var38_35 /* !! */ ;
                                                                                                            var38_35 /* !! */  = 25;
                                                                                                            var39_36 = 3.5E-44f;
                                                                                                            var86_72 = 1;
                                                                                                            var87_73 = 1.4E-45f;
                                                                                                            break block266;
                                                                                                        }
                                                                                                        var38_35 /* !! */  = (int)ip1_0.k((String)var20_20);
                                                                                                        if (var38_35 /* !! */  == 0) break block267;
                                                                                                        var38_35 /* !! */  = var3_3.r;
                                                                                                        if (var38_35 /* !! */  == 0) {
                                                                                                            var38_35 /* !! */  = var3_3.p;
                                                                                                            var86_72 = -1;
                                                                                                            var87_73 = 0.0f / 0.0f;
                                                                                                            if (var38_35 /* !! */  == var86_72) {
                                                                                                                var38_35 /* !! */  = var3_3.m;
                                                                                                            }
                                                                                                            var3_3.p = var38_35 /* !! */ ;
                                                                                                            var38_35 /* !! */  = var3_3.q;
                                                                                                            if (var38_35 /* !! */  == var86_72) {
                                                                                                                var38_35 /* !! */  = var3_3.n;
                                                                                                            }
                                                                                                            var3_3.q = var38_35 /* !! */ ;
                                                                                                        } else {
                                                                                                            var86_72 = -1;
                                                                                                            var87_73 = 0.0f / 0.0f;
                                                                                                        }
                                                                                                        var38_35 /* !! */  = var3_3.p;
                                                                                                        var12_12 = -1082130432;
                                                                                                        var13_13 = -1.0f;
                                                                                                        if (var38_35 /* !! */  != var86_72 && (var16_16 = var3_3.q) != var86_72) {
                                                                                                            var39_36 = var3_3.n * var38_35 /* !! */ ;
                                                                                                            var86_72 = var3_3.m * var16_16;
                                                                                                            var87_73 = var86_72;
                                                                                                            var39_36 /= var87_73;
                                                                                                        } else {
                                                                                                            var38_35 /* !! */  = -1082130432;
                                                                                                            var39_36 = -1.0f;
                                                                                                        }
                                                                                                        var86_72 = (int)var3_3.y;
                                                                                                        if (var86_72 != 0) {
                                                                                                            var87_73 = var3_3.E;
                                                                                                            cfr_temp_11 = var87_73 - var13_13;
                                                                                                            var86_72 = (int)(cfr_temp_11 == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1));
                                                                                                            if (var86_72 == 0 || (var86_72 = (int)((cfr_temp_12 = (var87_73 = var3_3.F) - var13_13) == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_13 = (var87_73 = var3_3.G) - var13_13) == 0.0f ? 0 : (cfr_temp_13 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_14 = (var87_73 = var3_3.H) - var13_13) == 0.0f ? 0 : (cfr_temp_14 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_15 = (var87_73 = var3_3.I) - var13_13) == 0.0f ? 0 : (cfr_temp_15 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_16 = (var87_73 = var3_3.J) - var13_13) == 0.0f ? 0 : (cfr_temp_16 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_17 = (var87_73 = var3_3.K) - var13_13) == 0.0f ? 0 : (cfr_temp_17 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_18 = (var87_73 = var3_3.L) - var13_13) == 0.0f ? 0 : (cfr_temp_18 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_19 = (var87_73 = var3_3.M) - var13_13) == 0.0f ? 0 : (cfr_temp_19 > 0.0f ? 1 : -1))) == 0 || (var86_72 = (int)((cfr_temp_20 = (var87_73 = var3_3.N) - var13_13) == 0.0f ? 0 : (cfr_temp_20 > 0.0f ? 1 : -1))) == 0) {
                                                                                                                var86_72 = 25;
                                                                                                                var87_73 = 3.5E-44f;
                                                                                                                var90_76 = null;
                                                                                                            } else {
                                                                                                                var86_72 = 25;
                                                                                                                var87_73 = 3.5E-44f;
                                                                                                                var14_14 = new byte[var86_72];
                                                                                                                var17_17 = ByteBuffer.wrap((byte[])var14_14);
                                                                                                                var48_43 = ByteOrder.LITTLE_ENDIAN;
                                                                                                                var17_17 = var17_17.order((ByteOrder)var48_43);
                                                                                                                var48_43 = null;
                                                                                                                var17_17.put((byte)0);
                                                                                                                var88_74 = var3_3.E;
                                                                                                                var22_22 = 1195593728;
                                                                                                                var23_23 = 50000.0f;
                                                                                                                var89_75 = 0.5f;
                                                                                                                var46_41 = (short)((var88_74 *= var23_23) + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.F * var23_23 + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.G * var23_23 + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.H * var23_23 + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.I * var23_23 + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.J * var23_23 + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.K * var23_23 + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.L * var23_23 + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)(var3_3.M + var89_75);
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var88_74 = var3_3.N + var89_75;
                                                                                                                var46_41 = (short)var88_74;
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)var3_3.C;
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var46_41 = (short)var3_3.D;
                                                                                                                var17_17.putShort(var46_41);
                                                                                                                var90_76 = var14_14;
                                                                                                            }
                                                                                                            var12_12 = var3_3.z;
                                                                                                            var16_16 = var3_3.B;
                                                                                                            var46_41 = var3_3.A;
                                                                                                            var22_22 = var3_3.o;
                                                                                                            var91_77 = new VX(var12_12, var16_16, var46_41, var22_22, var22_22, (byte[])var90_76);
                                                                                                            var14_14 = var91_77;
                                                                                                        } else {
                                                                                                            var86_72 = 25;
                                                                                                            var87_73 = 3.5E-44f;
                                                                                                            var12_12 = 0;
                                                                                                            var13_13 = 0.0f;
                                                                                                            var14_14 = null;
                                                                                                        }
                                                                                                        var17_17 = var3_3.a;
                                                                                                        if (var17_17 != null && (var16_16 = (int)var9_9.containsKey(var17_17)) != 0) {
                                                                                                            var17_17 = var3_3.a;
                                                                                                            var17_17 = (Integer)var9_9.get(var17_17);
                                                                                                            var16_16 = var17_17.intValue();
                                                                                                        } else {
                                                                                                            var16_16 = -1;
                                                                                                        }
                                                                                                        var46_41 = var3_3.s;
                                                                                                        if (var46_41 != 0) break block268;
                                                                                                        var88_74 = var3_3.t;
                                                                                                        var22_22 = 0;
                                                                                                        var23_23 = 0.0f;
                                                                                                        var49_44 = null;
                                                                                                        var46_41 = Float.compare(var88_74, 0.0f);
                                                                                                        if (var46_41 != 0 || (var46_41 = Float.compare(var88_74 = var3_3.u, 0.0f)) != 0) break block268;
                                                                                                        var88_74 = var3_3.v;
                                                                                                        var46_41 = Float.compare(var88_74, 0.0f);
                                                                                                        if (var46_41 != 0) break block269;
                                                                                                        var16_16 = 0;
                                                                                                        var17_17 = null;
                                                                                                        break block268;
                                                                                                    }
                                                                                                    var88_74 = var3_3.v;
                                                                                                    var22_22 = 1119092736;
                                                                                                    var23_23 = 90.0f;
                                                                                                    var46_41 = Float.compare(var88_74, var23_23);
                                                                                                    if (var46_41 != 0) break block270;
                                                                                                    var16_16 = 90;
                                                                                                    break block268;
                                                                                                }
                                                                                                var88_74 = var3_3.v;
                                                                                                var22_22 = -1020002304;
                                                                                                var23_23 = -180.0f;
                                                                                                var46_41 = Float.compare(var88_74, var23_23);
                                                                                                if (var46_41 == 0) ** GOTO lbl-1000
                                                                                                var88_74 = var3_3.v;
                                                                                                var22_22 = 0x43340000;
                                                                                                var23_23 = 180.0f;
                                                                                                var46_41 = Float.compare(var88_74, var23_23);
                                                                                                if (var46_41 != 0) {
                                                                                                    var88_74 = var3_3.v;
                                                                                                    var22_22 = -1028390912;
                                                                                                    var23_23 = -90.0f;
                                                                                                    var46_41 = Float.compare(var88_74, var23_23);
                                                                                                    if (var46_41 == 0) {
                                                                                                        var16_16 = 270;
                                                                                                    }
                                                                                                } else lbl-1000:
                                                                                                // 2 sources

                                                                                                {
                                                                                                    var16_16 = 180;
                                                                                                }
                                                                                            }
                                                                                            var46_41 = var3_3.m;
                                                                                            var6_6 /* !! */ .u = var46_41;
                                                                                            var46_41 = var3_3.n;
                                                                                            var6_6 /* !! */ .v = var46_41;
                                                                                            var6_6 /* !! */ .y = var39_36;
                                                                                            var6_6 /* !! */ .x = var16_16;
                                                                                            var5_5 = var3_3.w;
                                                                                            var6_6 /* !! */ .z = (byte[])var5_5;
                                                                                            var6_6 /* !! */ .A = var38_35 /* !! */  = var3_3.x;
                                                                                            var6_6 /* !! */ .B = var14_14;
                                                                                            var38_35 /* !! */  = 25;
                                                                                            var39_36 = 3.5E-44f;
                                                                                            var86_72 = 2;
                                                                                            var87_73 = 2.8E-45f;
                                                                                            break block266;
                                                                                        }
                                                                                        var38_35 /* !! */  = 25;
                                                                                        var39_36 = 3.5E-44f;
                                                                                        var16_16 = (int)var17_17.equals(var20_20);
                                                                                        if (var16_16 == 0 && (var86_72 = (int)var11_11.equals(var20_20)) == 0 && (var86_72 = (int)var14_14.equals(var20_20)) == 0 && (var86_72 = (int)var49_44.equals(var20_20)) == 0 && (var86_72 = (int)var48_43.equals(var20_20)) == 0) {
                                                                                            var11_11 = var69_59;
                                                                                            var86_72 = (int)var69_59.equals(var20_20);
                                                                                            if (var86_72 == 0) throw ParserException.a("Unexpected MIME type.", null);
                                                                                        }
                                                                                        var86_72 = 3;
                                                                                        var87_73 = 4.2E-45f;
                                                                                    }
                                                                                    var14_14 = var3_3.a;
                                                                                    if (var14_14 != null && (var55_48 /* !! */  = (int)var9_9.containsKey(var14_14)) == 0) {
                                                                                        var6_6 /* !! */ .b = var9_9 = var3_3.a;
                                                                                    }
                                                                                    var6_6 /* !! */ .a = var9_9 = Integer.toString(var68_58);
                                                                                    var6_6 /* !! */ .n = var9_9 = ip1_0.l((String)var20_20);
                                                                                    var6_6 /* !! */ .o = (int)var75_64 /* !! */ ;
                                                                                    var6_6 /* !! */ .d = var9_9 = var3_3.X;
                                                                                    var6_6 /* !! */ .e = var62_53;
                                                                                    var6_6 /* !! */ .q = var7_7 /* !! */ ;
                                                                                    var6_6 /* !! */ .j = var8_8;
                                                                                    var6_6 /* !! */ .r = var4_4 = var3_3.l;
                                                                                    var4_4 = new d((d$a)var6_6 /* !! */ );
                                                                                    var40_37 /* !! */  = var3_3.c;
                                                                                    var7_7 /* !! */  = var67_57;
                                                                                    var6_6 /* !! */  = var67_57.n(var40_37 /* !! */ , var86_72);
                                                                                    var3_3.Y = var6_6 /* !! */ ;
                                                                                    var6_6 /* !! */ .d((d)var4_4);
                                                                                    var62_53 = var3_3.c;
                                                                                    var6_6 /* !! */  = var66_56;
                                                                                    var66_56.put(var62_53, var3_3);
                                                                                    var4_4 = var26_25;
                                                                                    var50_45 = 0;
                                                                                    var3_3 = null;
                                                                                }
                                                                                var4_4.w = null;
                                                                            }
                                                                            var7_7 /* !! */  = var47_42;
                                                                        }
                                                                        var40_37 /* !! */  = 0;
                                                                        var6_6 /* !! */  = null;
                                                                    }
                                                                    var62_53 = 2;
                                                                    var40_37 /* !! */  = 3;
                                                                    var61_52 /* !! */  = 5;
                                                                    var55_48 /* !! */  = 8;
                                                                    var22_22 = 4;
                                                                    var23_23 = 5.6E-45f;
                                                                    break block271;
                                                                    var61_52 /* !! */  = 0;
                                                                    var8_8 = null;
                                                                    throw ParserException.a("Error parsing FourCC private data", null);
                                                                }
lbl1946:
                                                                // 6 sources

                                                                while (true) {
                                                                    var15_15 = true;
                                                                    break block240;
                                                                    break;
                                                                }
                                                            }
                                                            var3_3.f = 0;
                                                            while (true) {
                                                                block273: {
                                                                    block272: {
                                                                        var3_3 = var1_1;
                                                                        var3_3 = (il0_0)var1_1;
                                                                        var8_8 = (Pair)var17_17.a;
                                                                        var3_3.b((byte[])var8_8, 0, var55_48 /* !! */ , false);
                                                                        var29_27 /* !! */  = vA3.b((int)var8_8[0]);
                                                                        var86_72 = -1;
                                                                        var87_73 = 0.0f / 0.0f;
                                                                        if (var29_27 /* !! */  == var86_72 || var29_27 /* !! */  > var55_48 /* !! */ ) break block272;
                                                                        var59_51 = vA3.a((byte[])var8_8, (int)var29_27 /* !! */ , false);
                                                                        var40_37 /* !! */  = (int)var59_51;
                                                                        var8_8 = ((TK1$a)var17_17.d).a;
                                                                        var8_8.getClass();
                                                                        if (var40_37 /* !! */  != var12_12 && var40_37 /* !! */  != (var61_52 /* !! */  = 524531317) && var40_37 /* !! */  != (var61_52 /* !! */  = 475249515) && var40_37 /* !! */  != var22_22) break block273;
                                                                        var3_3.j((int)var29_27 /* !! */ );
                                                                        var27_26 = var40_37 /* !! */ ;
lbl1969:
                                                                        // 2 sources

                                                                        var40_37 /* !! */  = 1;
                                                                        var59_51 = -1;
                                                                        cfr_temp_21 = var27_26 - var59_51;
                                                                        var50_45 = (int)(cfr_temp_21 == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1));
                                                                        if (var50_45 == 0) {
                                                                            break;
                                                                        }
                                                                        break block241;
                                                                    }
                                                                    var61_52 /* !! */  = 475249515;
                                                                }
                                                                var40_37 /* !! */  = 1;
                                                                var3_3.j(var40_37 /* !! */ );
                                                                var40_37 /* !! */  = 0;
                                                                var6_6 /* !! */  = null;
                                                                var55_48 /* !! */  = 4;
                                                            }
                                                            var62_53 = 2;
                                                            var40_37 /* !! */  = 3;
                                                            var61_52 /* !! */  = 5;
                                                            var55_48 /* !! */  = 8;
                                                            var22_22 = 4;
                                                            var23_23 = 5.6E-45f;
                                                            var15_15 = false;
                                                            var19_19 /* !! */  = null;
                                                            break block240;
                                                        }
                                                        var17_17.f = var50_45 = (int)var27_26;
                                                        var17_17.e = var40_37 /* !! */ ;
                                                    }
                                                    var50_45 = var17_17.e;
                                                    if (var50_45 == var40_37 /* !! */ ) {
                                                        var3_3 = var1_1;
                                                        var3_3 = (il0_0)var1_1;
                                                        var61_52 /* !! */  = 0;
                                                        var8_8 = null;
                                                        var55_48 /* !! */  = 8;
                                                        var17_17.g = var63_54 = var4_4.c((il0_0)var3_3, false, (boolean)var40_37 /* !! */ , var55_48 /* !! */ );
                                                        var17_17.e = var50_45 = 2;
                                                    } else {
                                                        var55_48 /* !! */  = 8;
                                                    }
                                                    var3_3 = var17_17.d;
                                                    var62_53 = var17_17.f;
                                                    var3_3 = ((TK1$a)var3_3).a;
                                                    var3_3.getClass();
                                                    switch (var62_53) {
                                                        default: {
                                                            var50_45 = 0;
                                                            var3_3 = null;
                                                            break;
                                                        }
                                                        case 181: 
                                                        case 17545: 
                                                        case 21969: 
                                                        case 21970: 
                                                        case 21971: 
                                                        case 21972: 
                                                        case 21973: 
                                                        case 21974: 
                                                        case 21975: 
                                                        case 21976: 
                                                        case 21977: 
                                                        case 21978: 
                                                        case 30323: 
                                                        case 30324: 
                                                        case 30325: {
                                                            var50_45 = 5;
                                                            break;
                                                        }
                                                        case 161: 
                                                        case 163: 
                                                        case 165: 
                                                        case 16877: 
                                                        case 16981: 
                                                        case 18402: 
                                                        case 21419: 
                                                        case 25506: 
                                                        case 30322: {
                                                            var50_45 = 4;
                                                            break;
                                                        }
                                                        case 160: 
                                                        case 166: 
                                                        case 174: 
                                                        case 183: 
                                                        case 187: 
                                                        case 224: 
                                                        case 225: 
                                                        case 16868: 
                                                        case 18407: 
                                                        case 19899: 
                                                        case 20532: 
                                                        case 20533: 
                                                        case 21936: 
                                                        case 21968: 
                                                        case 25152: 
                                                        case 28032: 
                                                        case 30113: 
                                                        case 30320: 
                                                        case 290298740: 
                                                        case 357149030: 
                                                        case 374648427: 
                                                        case 408125543: 
                                                        case 440786851: 
                                                        case 475249515: 
                                                        case 524531317: {
                                                            var50_45 = 1;
                                                            break;
                                                        }
                                                        case 134: 
                                                        case 17026: 
                                                        case 21358: 
                                                        case 2274716: {
                                                            var50_45 = 3;
                                                            break;
                                                        }
                                                        case 131: 
                                                        case 136: 
                                                        case 155: 
                                                        case 159: 
                                                        case 176: 
                                                        case 179: 
                                                        case 186: 
                                                        case 215: 
                                                        case 231: 
                                                        case 238: 
                                                        case 241: 
                                                        case 251: 
                                                        case 16871: 
                                                        case 16980: 
                                                        case 17029: 
                                                        case 17143: 
                                                        case 18401: 
                                                        case 18408: 
                                                        case 20529: 
                                                        case 20530: 
                                                        case 21420: 
                                                        case 21432: 
                                                        case 21680: 
                                                        case 21682: 
                                                        case 21690: 
                                                        case 21930: 
                                                        case 21938: 
                                                        case 21945: 
                                                        case 21946: 
                                                        case 21947: 
                                                        case 21948: 
                                                        case 21949: 
                                                        case 21998: 
                                                        case 22186: 
                                                        case 22203: 
                                                        case 25188: 
                                                        case 30114: 
                                                        case 30321: 
                                                        case 2352003: 
                                                        case 2807729: {
                                                            var50_45 = 2;
                                                        }
                                                    }
                                                    if (var50_45 == 0) break block274;
                                                    var62_53 = 1;
                                                    if (var50_45 == var62_53) break block275;
                                                    var57_50 = 8;
                                                    var98_81 = 4.0E-323;
                                                    var62_53 = 2;
                                                    if (var50_45 == var62_53) break block276;
                                                    var40_37 /* !! */  = 3;
                                                    if (var50_45 == var40_37 /* !! */ ) break block277;
                                                    var61_52 /* !! */  = 4;
                                                    if (var50_45 == var61_52 /* !! */ ) break block278;
                                                    var61_52 /* !! */  = 5;
                                                    if (var50_45 != var61_52 /* !! */ ) {
                                                        var4_4 = new StringBuilder("Invalid element type ");
                                                        var4_4.append(var50_45);
                                                        throw ParserException.a(var4_4.toString(), null);
                                                    }
                                                    var27_26 = var17_17.g;
                                                    var100_82 = 4;
                                                    cfr_temp_22 = var27_26 - var100_82;
                                                    var50_45 = (int)(cfr_temp_22 == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1));
                                                    if (var50_45 != 0 && (var50_45 = (int)(var27_26 == var57_50 ? 0 : (var27_26 < var57_50 ? -1 : 1))) != 0) {
                                                        var3_3 = new StringBuilder("Invalid float size: ");
                                                        var102_83 = var17_17.g;
                                                        var3_3.append(var102_83);
                                                        throw ParserException.a(var3_3.toString(), null);
                                                    }
                                                    var3_3 = var17_17.d;
                                                    var29_27 /* !! */  = var17_17.f;
                                                    var86_72 = (int)var27_26;
                                                    var14_14 = var1_1;
                                                    var14_14 = (il0_0)var1_1;
                                                    var27_26 = var17_17.a((il0_0)var14_14, var86_72);
                                                    var22_22 = 4;
                                                    var23_23 = 5.6E-45f;
                                                    if (var86_72 == var22_22) {
                                                        var86_72 = (int)var27_26;
                                                        var87_73 = Float.intBitsToFloat(var86_72);
                                                        var98_81 = var87_73;
                                                    } else {
                                                        var98_81 = Double.longBitsToDouble(var27_26);
                                                    }
                                                    var3_3 = ((TK1$a)var3_3).a;
                                                    var46_41 = 181;
                                                    var88_74 = 2.54E-43f;
                                                    if (var29_27 /* !! */  != var46_41) {
                                                        var46_41 = 17545;
                                                        var88_74 = 2.4586E-41f;
                                                        if (var29_27 /* !! */  != var46_41) {
                                                            block126 : switch (var29_27 /* !! */ ) {
                                                                default: {
                                                                    switch (var29_27 /* !! */ ) {
                                                                        default: {
                                                                            var3_3.getClass();
                                                                            break block126;
                                                                        }
                                                                        case 30325: {
                                                                            var3_3.f((int)var29_27 /* !! */ );
                                                                            var3_3 = var3_3.w;
                                                                            var3_3.v = var65_55 = (float)var98_81;
                                                                            break block126;
                                                                        }
                                                                        case 30324: {
                                                                            var3_3.f((int)var29_27 /* !! */ );
                                                                            var3_3 = var3_3.w;
                                                                            var3_3.u = var65_55 = (float)var98_81;
                                                                            break block126;
                                                                        }
                                                                        case 30323: 
                                                                    }
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.t = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21978: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.N = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21977: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.M = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21976: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.L = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21975: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.K = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21974: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.J = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21973: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.I = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21972: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.H = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21971: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.G = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21970: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.F = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                                case 21969: {
                                                                    var3_3.f((int)var29_27 /* !! */ );
                                                                    var3_3 = var3_3.w;
                                                                    var3_3.E = var65_55 = (float)var98_81;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            var3_3.u = var57_50 = (long)var98_81;
                                                        }
                                                    } else {
                                                        var3_3.f((int)var29_27 /* !! */ );
                                                        var3_3 = var3_3.w;
                                                        var29_27 /* !! */  = (int)var98_81;
                                                        var3_3.R = (int)var29_27 /* !! */ ;
                                                    }
                                                    var50_45 = 0;
                                                    var3_3 = null;
                                                    var17_17.e = 0;
                                                    ** GOTO lbl1946
                                                }
                                                var61_52 /* !! */  = 5;
                                                var22_22 = 4;
                                                var23_23 = 5.6E-45f;
                                                var3_3 = var17_17.d;
                                                var29_27 /* !! */  = var17_17.f;
                                                var57_50 = var17_17.g;
                                                var12_12 = (int)var57_50;
                                                var3_3 = (TK1$a)var3_3;
                                                var11_11 = var1_1;
                                                var11_11 = (il0_0)var1_1;
                                                var3_3.a((int)var29_27 /* !! */ , var12_12, (il0_0)var11_11);
                                                var50_45 = 0;
                                                var3_3 = null;
                                                var17_17.e = 0;
                                                ** GOTO lbl1946
                                            }
                                            var61_52 /* !! */  = 5;
                                            var22_22 = 4;
                                            var23_23 = 5.6E-45f;
                                            var57_50 = var17_17.g;
                                            var27_26 = 0x7FFFFFFFL;
                                            cfr_temp_23 = var57_50 - var27_26;
                                            var50_45 = (int)(cfr_temp_23 == 0L ? 0 : (cfr_temp_23 < 0L ? -1 : 1));
                                            if (var50_45 > 0) {
                                                var3_3 = new StringBuilder("String element size: ");
                                                var102_84 = var17_17.g;
                                                var3_3.append(var102_84);
                                                throw ParserException.a(var3_3.toString(), null);
                                            }
                                            var3_3 = var17_17.d;
                                            var29_27 /* !! */  = var17_17.f;
                                            var12_12 = (int)var57_50;
                                            if (var12_12 == 0) {
                                                var11_11 = "";
                                            } else {
                                                var11_11 = new byte[var12_12];
                                                var48_43 = var1_1;
                                                var48_43 = (il0_0)var1_1;
                                                var75_64 /* !! */  = 0;
                                                var18_18 = null;
                                                var48_43.e((byte[])var11_11, 0, var12_12, false);
                                                while (var12_12 > 0) {
                                                    var88_74 = 1.4E-45f;
                                                    var75_64 /* !! */  = var12_12 + -1;
                                                    var46_41 = (short)var11_11[var75_64 /* !! */ ];
                                                    if (var46_41 != 0) break;
                                                    var46_41 = -1;
                                                    var88_74 = 0.0f / 0.0f;
                                                    var12_12 += var46_41;
                                                }
                                                var75_64 /* !! */  = 0;
                                                var18_18 = null;
                                                var11_11 = var48_43 = new String((byte[])var11_11, 0, var12_12);
                                            }
                                            var3_3 = ((TK1$a)var3_3).a;
                                            var3_3.getClass();
                                            var12_12 = 134;
                                            var13_13 = 1.88E-43f;
                                            if (var29_27 /* !! */  == var12_12) break block279;
                                            var12_12 = 17026;
                                            var13_13 = 2.3859E-41f;
                                            if (var29_27 /* !! */  == var12_12) break block280;
                                            var12_12 = 21358;
                                            var13_13 = 2.9929E-41f;
                                            if (var29_27 /* !! */  != var12_12) {
                                                var12_12 = 2274716;
                                                var13_13 = 3.187556E-39f;
                                                if (var29_27 /* !! */  == var12_12) {
                                                    var3_3.f((int)var29_27 /* !! */ );
                                                    var3_3 = var3_3.w;
                                                    var3_3.X = var11_11;
                                                }
                                                break block281;
                                            } else {
                                                var3_3.f((int)var29_27 /* !! */ );
                                                var3_3 = var3_3.w;
                                                var3_3.a = var11_11;
                                            }
                                            break block281;
                                        }
                                        var3_3 = "webm";
                                        var50_45 = (int)var3_3.equals(var11_11);
                                        if (var50_45 == 0 && (var50_45 = (int)(var3_3 = "matroska").equals(var11_11)) == 0) {
                                            var3_3 = new StringBuilder("DocType ");
                                            var3_3.append((String)var11_11);
                                            var3_3.append(" not supported");
                                            throw ParserException.a(var3_3.toString(), null);
                                        }
                                        break block281;
                                    }
                                    var3_3.f((int)var29_27 /* !! */ );
                                    var3_3 = var3_3.w;
                                    var3_3.b = var11_11;
                                }
                                var50_45 = 0;
                                var3_3 = null;
                                var17_17.e = 0;
                                ** GOTO lbl1946
                            }
                            var40_37 /* !! */  = 3;
                            var61_52 /* !! */  = 5;
                            var22_22 = 4;
                            var23_23 = 5.6E-45f;
                            var27_26 = var17_17.g;
                            cfr_temp_24 = var27_26 - var57_50;
                            var50_45 = (int)(cfr_temp_24 == 0L ? 0 : (cfr_temp_24 < 0L ? -1 : 1));
                            if (var50_45 > 0) {
                                var3_3 = new StringBuilder("Invalid integer size: ");
                                var102_85 = var17_17.g;
                                var3_3.append(var102_85);
                                throw ParserException.a(var3_3.toString(), null);
                            }
                            var3_3 = var17_17.d;
                            var29_27 /* !! */  = var17_17.f;
                            var86_72 = (int)var27_26;
                            var14_14 = var1_1;
                            var14_14 = (il0_0)var1_1;
                            var57_50 = var17_17.a((il0_0)var14_14, var86_72);
                            ((TK1$a)var3_3).b((int)var29_27 /* !! */ , var57_50);
                            var50_45 = 0;
                            var3_3 = null;
                            var17_17.e = 0;
                            ** GOTO lbl1946
                        }
                        var62_53 = 2;
                        var40_37 /* !! */  = 3;
                        var61_52 /* !! */  = 5;
                        var22_22 = 4;
                        var23_23 = 5.6E-45f;
                        var3_3 = var1_1;
                        var57_50 = ((il0_0)var1_1).d;
                        var27_26 = var17_17.g + var57_50;
                        var29_27 /* !! */  = var17_17.f;
                        var3_3 = new Fl0$a((int)var29_27 /* !! */ , var27_26);
                        var20_20 = var26_25;
                        var26_25.push(var3_3);
                        var3_3 = var17_17.d;
                        var29_27 /* !! */  = var17_17.f;
                        var27_26 = var17_17.g;
                        var66_56 = var3_3;
                        var66_56 = (TK1$a)var3_3;
                        var77_66 = var27_26;
                        var66_56.c((int)var29_27 /* !! */ , var57_50, var27_26);
                        var50_45 = 0;
                        var3_3 = null;
                        var17_17.e = 0;
                        ** continue;
                    }
                    if (var15_15) {
                        var3_3 = var1_1;
                        var57_50 = ((il0_0)var1_1).d;
                        var3_3 = this;
                        var29_27 /* !! */  = (long)this.A;
                        if (var29_27 /* !! */  != false) {
                            this.C = var57_50;
                            var102_86 = this.B;
                            var20_20 = var2_2;
                            var2_2.a = var102_86;
                            var62_53 = 0;
                            var4_4 = null;
                            this.A = false;
                            return 1;
                        }
                        var20_20 = var2_2;
                        var86_72 = (int)this.x;
                        if (var86_72 != 0 && (var75_64 /* !! */  = (cfr_temp_25 = (var57_50 = this.C) - (var32_30 = (long)-1)) == 0L ? 0 : (cfr_temp_25 < 0L ? -1 : 1)) != false) {
                            var2_2.a = var57_50;
                            this.C = var32_30;
                            return 1;
                        }
                    } else {
                        var3_3 = this;
                        var20_20 = var2_2;
                    }
                    var11_11 = var7_7 /* !! */ ;
                    var9_9 = var10_10;
                    var4_4 = var20_20;
                    var10_10 = var30_28;
                    var7_7 /* !! */  = var36_33 /* !! */ ;
                    var6_6 /* !! */  = var35_32;
                    var8_8 = var37_34;
                    var5_5 = var34_31;
                    var12_12 = 0;
                    var13_13 = 0.0f;
                    var14_14 = null;
                    continue block149;
                }
                var62_53 = 2;
                var40_37 /* !! */  = 3;
                var61_52 /* !! */  = 5;
                var22_22 = 4;
                var23_23 = 5.6E-45f;
                var3_3 = this;
                var20_20 = var2_2;
                var57_50 = var17_17.g;
                var12_12 = (int)var57_50;
                var11_11 = var1_1;
                ((il0_0)var1_1).j(var12_12);
                var86_72 = 0;
                var87_73 = 0.0f;
                var17_17.e = 0;
                var11_11 = var7_7 /* !! */ ;
                var9_9 = var10_10;
                var4_4 = var2_2;
                var10_10 = var30_28;
                var7_7 /* !! */  = var36_33 /* !! */ ;
                var6_6 /* !! */  = var35_32;
                var8_8 = var37_34;
                var5_5 = var34_31;
                var12_12 = 0;
                var13_13 = 0.0f;
                var14_14 = null;
            }
            break;
        }
    }

    public final boolean b(fi0_0 fi0_02) {
        boolean bl2;
        block7: {
            long l2;
            long l3;
            long l4;
            long l7;
            int n3;
            X83 x83 = new X83();
            fi0_0 fi0_03 = fi0_02;
            fi0_03 = (il0_0)fi0_02;
            long l8 = ((il0_0)fi0_03).c;
            long l12 = -1;
            long l14 = 1024L;
            Object object = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (object != false && (n3 = (int)(l8 == l14 ? 0 : (l8 < l14 ? -1 : 1))) <= 0) {
                l14 = l8;
            }
            n3 = (int)l14;
            Xm2 xm2 = x83.a;
            byte[] byArray = xm2.a;
            bl2 = false;
            int n4 = 4;
            ((il0_0)fi0_03).b(byArray, 0, n4, false);
            long l15 = xm2.y();
            x83.b = n4;
            while (true) {
                long l16 = 440786851L;
                int n7 = 1;
                n4 = (int)(l15 == l16 ? 0 : (l15 < l16 ? -1 : 1));
                if (n4 == 0) break;
                x83.b = n4 = x83.b + n7;
                if (n4 != n3) {
                    byte[] byArray2 = xm2.a;
                    ((il0_0)fi0_03).b(byArray2, 0, n7, false);
                    l7 = l15 << 8 & 0xFFFFFFFFFFFFFF00L;
                    byArray = xm2.a;
                    n7 = byArray[0] & 0xFF;
                    l4 = n7;
                    l15 = l7 | l4;
                    continue;
                }
                break block7;
                break;
            }
            l12 = x83.a((il0_0)fi0_03);
            n4 = x83.b;
            l7 = n4;
            l4 = Long.MIN_VALUE;
            long l17 = l12 - l4;
            Object object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
            if (object2 != false && (object == false || (object = (l3 = (l2 = l7 + l12) - l8) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0)) {
                int n8;
                long l18;
                while ((object = (l18 = (l8 = (long)(n8 = x83.b)) - (l2 = l7 + l12)) == 0L ? 0 : (l18 < 0L ? -1 : 1)) < 0) {
                    long l19;
                    long l20;
                    long l21;
                    l8 = x83.a((il0_0)fi0_03);
                    long l22 = l8 - l4;
                    object = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                    if (object != false && (object = (l21 = (l8 = x83.a((il0_0)fi0_03)) - (l2 = 0L)) == 0L ? 0 : (l21 < 0L ? -1 : 1)) >= 0 && (l20 = (l19 = l8 - (l2 = Integer.MAX_VALUE)) == 0L ? 0 : (l19 < 0L ? -1 : 1)) <= 0) {
                        if (object == false) continue;
                        int n10 = (int)l8;
                        ((il0_0)fi0_03).l(n10, false);
                        x83.b = n8 = x83.b + n10;
                        continue;
                    }
                    break block7;
                }
                if (object == false) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        int n3;
        this.D = l2 = -9223372036854775807L;
        this.I = 0;
        Object object = (fl0_0)this.a;
        ((fl0_0)object).e = 0;
        Object object2 = ((fl0_0)object).b;
        ((ArrayDeque)object2).clear();
        object = ((fl0_0)object).c;
        ((vA3)object).b = 0;
        ((vA3)object).c = 0;
        object = this.b;
        ((vA3)object).b = 0;
        ((vA3)object).c = 0;
        this.l();
        object = null;
        for (int i3 = 0; i3 < (n3 = (object2 = this.c).size()); ++i3) {
            object2 = ((TK1$b)object2.valueAt((int)i3)).U;
            if (object2 == null) continue;
            ((zs3)object2).b = false;
            ((zs3)object2).c = 0;
        }
    }

    public final void d(int n3) {
        Object object = this.E;
        if (object != null && (object = this.F) != null) {
            return;
        }
        object = new StringBuilder("Element ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" must be in a Cues");
        throw ParserException.a(((StringBuilder)object).toString(), null);
    }

    public final eI0 e() {
        return this;
    }

    public final void f(int n3) {
        Object object = this.w;
        if (object != null) {
            return;
        }
        object = new StringBuilder("Element ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" must be in a TrackEntry");
        throw ParserException.a(((StringBuilder)object).toString(), null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void g(TK1$b var1_1, long var2_2, int var4_3, int var5_4, int var6_5) {
        block17: {
            block18: {
                block16: {
                    var7_6 = this;
                    var8_7 = var1_1;
                    var9_8 = 2;
                    var10_9 = "S_TEXT/WEBVTT";
                    var11_10 = "S_TEXT/ASS";
                    var12_11 = null;
                    var13_12 = "S_TEXT/UTF8";
                    var14_13 = var1_1.U;
                    var15_14 = 1;
                    if (var14_13 == null) break block16;
                    var16_15 = var1_1.Y;
                    var17_16 = var1_1.j;
                    var18_18 = var2_2;
                    var20_20 = var4_3;
                    var14_13.b(var16_15, var2_2, var4_3, var5_4, var6_5, var17_16);
                    break block17;
                }
                var14_13 = var1_1.b;
                var21_22 = var13_12.equals(var14_13);
                if (var21_22 == 0 && (var21_22 = (int)var11_10.equals(var14_13 = var1_1.b)) == 0 && (var21_22 = (int)var10_9.equals(var14_13 = var1_1.b)) == 0) ** GOTO lbl34
                var21_22 = var7_6.M;
                if (var21_22 <= var15_14) break block18;
                var10_9 = "Skipping subtitle sample in laced block.";
                Cx.f((String)var10_9);
                ** GOTO lbl34
            }
            var22_23 = var7_6.K;
            var18_19 = -9223372036854775807L;
            cfr_temp_0 = var22_23 - var18_19;
            var20_21 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var20_21 /* !! */  == false) {
                var10_9 = "Skipping subtitle sample with no duration.";
                Cx.f((String)var10_9);
lbl34:
                // 3 sources

                var24_24 = var5_4;
            } else {
                var25_25 = var8_7.b;
                var26_26 = var7_6.m;
                var27_27 = var26_26.a;
                var25_25.getClass();
                var28_28 = 1000L;
                var30_29 = -1;
                var31_30 = var25_25.hashCode();
                switch (var31_30) {
                    default: {
                        break;
                    }
                    case 1422270023: {
                        var24_24 = (int)var25_25.equals(var13_12);
                        if (var24_24 == 0) break;
                        var30_29 = 2;
                        break;
                    }
                    case 1045209816: {
                        var24_24 = (int)var25_25.equals(var10_9);
                        if (var24_24 == 0) break;
                        var30_29 = 1;
                        break;
                    }
                    case 738597099: {
                        var24_24 = (int)var25_25.equals(var11_10);
                        if (var24_24 == 0) break;
                        var30_29 = 0;
                        var17_17 = null;
                    }
                }
                switch (var30_29) {
                    default: {
                        var8_7 = new IllegalArgumentException();
                        throw var8_7;
                    }
                    case 2: {
                        var10_9 = tk1_1.h(var22_23, "%02d:%02d:%02d,%03d", var28_28);
                        var32_31 /* !! */  = 19;
                        break;
                    }
                    case 1: {
                        var10_9 = tk1_1.h(var22_23, "%02d:%02d:%02d.%03d", var28_28);
                        var32_31 /* !! */  = 25;
                        break;
                    }
                    case 0: {
                        var28_28 = 10000L;
                        var10_9 = tk1_1.h(var22_23, "%01d:%02d:%02d:%02d", var28_28);
                        var32_31 /* !! */  = 21;
                    }
                }
                var33_32 = ((Object)var10_9).length;
                System.arraycopy(var10_9, 0, var27_27, var32_31 /* !! */ , var33_32);
                for (var24_24 = var26_26.b; var24_24 < (var32_31 /* !! */  = var26_26.c); var24_24 += var15_14) {
                    var11_10 = var26_26.a;
                    var32_31 /* !! */  = (int)var11_10[var24_24];
                    if (var32_31 /* !! */  != 0) continue;
                    var26_26.H(var24_24);
                    break;
                }
                var10_9 = var8_7.Y;
                var32_31 /* !! */  = var26_26.c;
                var10_9.f(var32_31 /* !! */ , var26_26);
                var24_24 = var26_26.c;
                var24_24 = var5_4 + var24_24;
            }
            var32_31 /* !! */  = var4_3 & 0x10000000;
            if (var32_31 /* !! */  != 0) {
                var32_31 /* !! */  = var7_6.M;
                var13_12 = var7_6.p;
                if (var32_31 /* !! */  > var15_14) {
                    var13_12.F(0);
                } else {
                    var32_31 /* !! */  = var13_12.c;
                    var12_11 = var8_7.Y;
                    var12_11.b((Xm2)var13_12, var32_31 /* !! */ , var9_8);
                    var24_24 += var32_31 /* !! */ ;
                }
            }
            var13_12 = var8_7.Y;
            var34_33 = var8_7.j;
            var22_23 = var2_2;
            var20_21 /* !! */  = var6_5;
            var13_12.a(var2_2, var4_3, var24_24, var6_5, var34_33);
        }
        var7_6.H = var15_14;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void j(il0_0 il0_02, int n3) {
        Xm2 xm2 = this.i;
        int n4 = xm2.c;
        if (n4 >= n3) {
            return;
        }
        byte[] byArray = xm2.a;
        int n7 = byArray.length;
        if (n7 < n3) {
            n4 = Math.max(byArray.length * 2, n3);
            xm2.b(n4);
        }
        byArray = xm2.a;
        n7 = xm2.c;
        int n8 = n3 - n7;
        il0_02.e(byArray, n7, n8, false);
        xm2.H(n3);
    }

    public final void k(gi0_0 gi0_02) {
        boolean bl2 = this.e;
        if (bl2) {
            vf3$a_0 vf3$a_0 = this.f;
            wf3_1 wf3_12 = new wf3_1(gi0_02, vf3$a_0);
            gi0_02 = wf3_12;
        }
        this.d0 = gi0_02;
    }

    public final void l() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = false;
        this.l.F(0);
    }

    public final long m(long l2) {
        long l3 = this.t;
        long l4 = -9223372036854775807L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            RoundingMode roundingMode = RoundingMode.DOWN;
            l4 = l2;
            return gz3.O(l2, l3, 1000L, roundingMode);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /*
     * WARNING - void declaration
     */
    public final int n(il0_0 il0_02, TK1$b tK1$b, int n3, boolean bl2) {
        int n4;
        boolean bl3;
        Object object;
        int n7;
        int n8;
        int n10;
        Object object2;
        tk1_1 tk1_12 = this;
        Object object3 = il0_02;
        Object object4 = tK1$b;
        int n14 = n3;
        Object object5 = "S_TEXT/UTF8";
        Object object6 = tK1$b.b;
        boolean bl32 = ((String)object5).equals(object6);
        if (bl32) {
            object4 = e0;
            this.o(il0_02, (byte[])object4, n3);
            int n15 = this.V;
            this.l();
            return n15;
        }
        object6 = "S_TEXT/ASS";
        object5 = tK1$b.b;
        bl32 = ((String)object6).equals(object5);
        if (bl32) {
            object4 = g0;
            this.o(il0_02, (byte[])object4, n3);
            int n16 = this.V;
            this.l();
            return n16;
        }
        object6 = "S_TEXT/WEBVTT";
        object5 = tK1$b.b;
        bl32 = ((String)object6).equals(object5);
        if (bl32) {
            object4 = h0;
            this.o(il0_02, (byte[])object4, n3);
            int n17 = this.V;
            this.l();
            return n17;
        }
        object6 = tK1$b.Y;
        boolean s7 = this.X;
        int n15 = 2;
        int n16 = 4;
        int n17 = 1;
        Xm2 xm2 = this.l;
        if (!s7) {
            void var13_43;
            boolean bl4;
            boolean bl5 = tK1$b.h;
            object2 = this.i;
            if (bl5) {
                byte by2;
                int n18;
                this.Q = n18 = this.Q & 0xBFFFFFFF;
                boolean bl6 = this.Y;
                n10 = 128;
                if (!bl6) {
                    int n19;
                    object5 = ((Xm2)object2).a;
                    il0_02.e((byte[])object5, 0, n17, false);
                    this.U = n19 = this.U + n17;
                    object5 = ((Xm2)object2).a;
                    Object object7 = object5[0];
                    n8 = object7 & 0x80;
                    if (n8 != n10) {
                        this.b0 = (byte)object7;
                        this.Y = n17;
                    } else {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                }
                if ((n8 = (by2 = tk1_12.b0) & 1) == n17) {
                    void var13_26;
                    int n20;
                    Object object8;
                    int n21 = by2 & n15;
                    if (n21 == n15) {
                        boolean bl7 = true;
                    } else {
                        boolean bl8 = false;
                        object5 = null;
                    }
                    n8 = tk1_12.Q;
                    n7 = 0x40000000;
                    tk1_12.Q = n8 |= n7;
                    n8 = (int)(tk1_12.c0 ? 1 : 0);
                    if (n8 == 0) {
                        object8 = tk1_12.n;
                        byte[] byArray = ((Xm2)object8).a;
                        n20 = 8;
                        ((il0_0)object3).e(byArray, 0, n20, false);
                        tk1_12.U = n7 = tk1_12.U + n20;
                        tk1_12.c0 = n17;
                        byArray = ((Xm2)object2).a;
                        if (var13_26 == false) {
                            n10 = 0;
                            object = null;
                        }
                        byArray[0] = n10 = (int)((byte)(n10 | n20));
                        ((Xm2)object2).I(0);
                        object6.b((Xm2)object2, n17, n17);
                        tk1_12.V = n10 = tk1_12.V + n17;
                        ((Xm2)object8).I(0);
                        object6.b((Xm2)object8, n20, n17);
                        tk1_12.V = n10 = tk1_12.V + n20;
                    }
                    if (var13_26 != false) {
                        int n22;
                        void var13_33;
                        boolean bl9 = tk1_12.Z;
                        if (!bl9) {
                            int n24;
                            int n25;
                            object5 = ((Xm2)object2).a;
                            ((il0_0)object3).e((byte[])object5, 0, n17, false);
                            tk1_12.U = n25 = tk1_12.U + n17;
                            ((Xm2)object2).I(0);
                            tk1_12.a0 = n24 = ((Xm2)object2).w();
                            tk1_12.Z = n17;
                        }
                        int n26 = tk1_12.a0 * 4;
                        ((Xm2)object2).F(n26);
                        object = ((Xm2)object2).a;
                        ((il0_0)object3).e((byte[])object, 0, n26, false);
                        tk1_12.U = n10 = tk1_12.U + n26;
                        short s8 = (short)(tk1_12.a0 / n15 + n17);
                        n10 = s8 * 6 + n15;
                        object8 = tk1_12.q;
                        if (object8 == null || (n8 = ((Buffer)object8).capacity()) < n10) {
                            tk1_12.q = object8 = ByteBuffer.allocate(n10);
                        }
                        tk1_12.q.position(0);
                        tk1_12.q.putShort(s8);
                        boolean bl10 = false;
                        object5 = null;
                        n8 = 0;
                        object8 = null;
                        while (var13_33 < (n7 = tk1_12.a0)) {
                            ByteBuffer byteBuffer;
                            n7 = ((Xm2)object2).A();
                            n20 = var13_33 % 2;
                            if (n20 == 0) {
                                byteBuffer = tk1_12.q;
                                n8 = (short)(n7 - n8);
                                byteBuffer.putShort((short)n8);
                            } else {
                                byteBuffer = tk1_12.q;
                                n8 = n7 - n8;
                                byteBuffer.putInt(n8);
                            }
                            ++var13_33;
                            n8 = n7;
                        }
                        int n28 = tk1_12.U;
                        n28 = n14 - n28 - n8;
                        if ((n7 %= n15) == n17) {
                            object8 = tk1_12.q;
                            ((ByteBuffer)object8).putInt(n28);
                        } else {
                            object8 = tk1_12.q;
                            short s10 = (short)n28;
                            ((ByteBuffer)object8).putShort(s10);
                            object5 = tk1_12.q;
                            ((ByteBuffer)object5).putInt(0);
                        }
                        object5 = tk1_12.q.array();
                        object8 = tk1_12.o;
                        ((Xm2)object8).G(n10, (byte[])object5);
                        object6.b((Xm2)object8, n10, n17);
                        tk1_12.V = n22 = tk1_12.V + n10;
                    }
                }
            } else {
                object5 = tK1$b.i;
                if (object5 != null) {
                    n10 = ((Object)object5).length;
                    xm2.G(n10, (byte[])object5);
                }
            }
            if (bl4 = ((String)(object = "A_OPUS")).equals(object5 = ((TK1$b)object4).b)) {
                boolean bl11 = bl2;
            } else {
                int n29 = ((TK1$b)object4).f;
                if (n29 > 0) {
                    boolean bl12 = true;
                } else {
                    boolean bl13 = false;
                    object5 = null;
                }
            }
            if (var13_43 != false) {
                int n30;
                int n32;
                tk1_12.Q = n32 = tk1_12.Q | 0x10000000;
                object5 = tk1_12.p;
                ((Xm2)object5).F(0);
                int n34 = xm2.c + n14;
                n10 = tk1_12.U;
                int n35 = n34 - n10;
                ((Xm2)object2).F(n16);
                object = ((Xm2)object2).a;
                n8 = (byte)(n35 >> 24 & 0xFF);
                object[0] = n8;
                n8 = (byte)(n35 >> 16 & 0xFF);
                object[n17] = n8;
                n8 = (byte)(n35 >> 8 & 0xFF);
                object[n15] = n8;
                byte by4 = (byte)(n35 & 0xFF);
                n8 = 3;
                object[n8] = by4;
                object6.b((Xm2)object2, n16, n15);
                tk1_12.V = n30 = tk1_12.V + n16;
            }
            tk1_12.X = n17;
        }
        int n36 = xm2.c;
        n14 += n36;
        object5 = "V_MPEG4/ISO/AVC";
        object2 = ((TK1$b)object4).b;
        boolean bl14 = ((String)object5).equals(object2);
        if (!bl14 && !(bl3 = ((String)(object5 = "V_MPEGH/ISO/HEVC")).equals(object2 = ((TK1$b)object4).b))) {
            int n37;
            object5 = ((TK1$b)object4).U;
            if (object5 != null) {
                int n38 = xm2.c;
                if (n38 != 0) {
                    n17 = 0;
                }
                ct3.f(n17 != 0);
                object5 = ((TK1$b)object4).U;
                ((zs3)object5).c((fi0_0)object3);
            }
            while ((n37 = tk1_12.U) < n14) {
                n37 = n14 - n37;
                n15 = xm2.a();
                if (n15 > 0) {
                    n37 = Math.min(n37, n15);
                    object6.f(n37, xm2);
                } else {
                    n37 = object6.c((mi0_0)object3, n37, false);
                }
                tk1_12.U = n15 = tk1_12.U + n37;
                tk1_12.V = n15 = tk1_12.V + n37;
            }
        } else {
            object5 = tk1_12.h;
            object2 = ((Xm2)object5).a;
            object2[0] = false;
            object2[n17] = false;
            object2[n15] = false;
            n15 = ((TK1$b)object4).Z;
            n17 = 4 - n15;
            while ((n10 = tk1_12.U) < n14) {
                n10 = tk1_12.W;
                if (n10 == 0) {
                    n10 = xm2.a();
                    n10 = Math.min(n15, n10);
                    n8 = n17 + n10;
                    n7 = n15 - n10;
                    ((il0_0)object3).e((byte[])object2, n8, n7, false);
                    if (n10 > 0) {
                        xm2.g(n17, (byte[])object2, n10);
                    }
                    tk1_12.U = n10 = tk1_12.U + n15;
                    ((Xm2)object5).I(0);
                    tk1_12.W = n10 = ((Xm2)object5).A();
                    object = tk1_12.g;
                    ((Xm2)object).I(0);
                    object6.f(n16, (Xm2)object);
                    tk1_12.V = n10 = tk1_12.V + n16;
                    continue;
                }
                n8 = xm2.a();
                if (n8 > 0) {
                    n10 = Math.min(n10, n8);
                    object6.f(n10, xm2);
                } else {
                    n10 = object6.c((mi0_0)object3, n10, false);
                }
                tk1_12.U = n8 = tk1_12.U + n10;
                tk1_12.V = n8 = tk1_12.V + n10;
                tk1_12.W = n8 = tk1_12.W - n10;
            }
        }
        if ((n4 = ((String)(object3 = "A_VORBIS")).equals(object4 = ((TK1$b)object4).b)) != 0) {
            object3 = tk1_12.j;
            ((Xm2)object3).I(0);
            object6.f(n16, (Xm2)object3);
            tk1_12.V = n4 = tk1_12.V + n16;
        }
        n4 = tk1_12.V;
        this.l();
        return n4;
    }

    public final void o(il0_0 il0_02, byte[] byArray, int n3) {
        int n4 = byArray.length + n3;
        Xm2 xm2 = this.m;
        byte[] byArray2 = xm2.a;
        int n7 = byArray2.length;
        if (n7 < n4) {
            int n8 = n4 + n3;
            byArray2 = Arrays.copyOf(byArray, n8);
            n7 = byArray2.length;
            xm2.G(n7, byArray2);
        } else {
            n7 = byArray.length;
            System.arraycopy(byArray, 0, byArray2, 0, n7);
        }
        byArray2 = xm2.a;
        int n10 = byArray.length;
        il0_02.e(byArray2, n10, n3, false);
        xm2.I(0);
        xm2.H(n4);
    }

    public final void release() {
    }
}

