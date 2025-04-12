/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/*
 * Renamed from Uc1
 */
public final class uc1_1
extends k0_0 {
    public static final tc1_1 b;
    public final Uc1$a a;

    static {
        tc1_1 tc1_12;
        b = tc1_12 = new Object();
    }

    public uc1_1(Uc1$a uc1$a) {
        this.a = uc1$a;
    }

    public static ApicFrame a0(Xm2 object, int n3, int n4) {
        int n7;
        String string2;
        Object object2;
        int n8 = ((Xm2)object).w();
        Charset charset = uc1_1.p0(n8);
        byte[] byArray = new byte[n3 += -1];
        int n10 = 0;
        String string3 = null;
        ((Xm2)object).g(0, byArray, n3);
        object = "image/";
        int n14 = 2;
        if (n4 == n14) {
            object2 = new StringBuilder((String)object);
            int n15 = 3;
            Charset charset2 = StandardCharsets.ISO_8859_1;
            object = new String(byArray, 0, n15, charset2);
            object = Ascii.toLowerCase((String)object);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = "image/jpg";
            n4 = (int)(((String)object2).equals(object) ? 1 : 0);
            if (n4 != 0) {
                object = "image/jpeg";
            }
            n4 = 2;
        } else {
            Charset charset3;
            n4 = uc1_1.s0(0, byArray);
            string2 = new String(byArray, 0, n4, charset3 = StandardCharsets.ISO_8859_1);
            string3 = Ascii.toLowerCase(string2);
            int n16 = string3.indexOf(47);
            object = n16 == (n7 = -1) ? ((String)object).concat(string3) : string3;
        }
        n10 = n4 + 1;
        n10 = byArray[n10] & 0xFF;
        n4 += n14;
        n14 = uc1_1.r0(n4, byArray, n8);
        n7 = n14 - n4;
        string2 = new String(byArray, n4, n7, charset);
        n4 = uc1_1.o0(n8) + n14;
        byte[] byArray2 = n3 <= n4 ? gz3.f : Arrays.copyOfRange(byArray, n4, n3);
        object2 = new ApicFrame((String)object, string2, n10, byArray2);
        return object2;
    }

    public static ChapterFrame b0(Xm2 id3FrameArray, int n3, int n4, boolean bl2, int n7, Uc1$a uc1$a) {
        ChapterFrame chapterFrame;
        int n8;
        Id3Frame[] id3FrameArray2 = id3FrameArray;
        int n10 = id3FrameArray.b;
        Object object = id3FrameArray.a;
        int n14 = uc1_1.s0(n10, (byte[])object);
        Object object2 = id3FrameArray.a;
        int n15 = n14 - n10;
        Charset charset = StandardCharsets.ISO_8859_1;
        String string2 = new String((byte[])object2, n10, n15, charset);
        id3FrameArray.I(++n14);
        n15 = id3FrameArray.i();
        int n16 = id3FrameArray.i();
        long l2 = id3FrameArray.y();
        long l3 = -1;
        long l4 = 0xFFFFFFFFL;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        long l8 = l7 == false ? l3 : l2;
        l2 = id3FrameArray.y();
        long l12 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        l4 = l12 == false ? l3 : l2;
        object = new ArrayList;
        ((ArrayList)object)();
        n10 += n3;
        while ((n8 = id3FrameArray2.b) < n10) {
            n8 = n4;
            Id3Frame id3Frame = uc1_1.e0(n4, (Xm2)id3FrameArray, bl2, n7, uc1$a);
            if (id3Frame == null) continue;
            ((ArrayList)object).add(id3Frame);
        }
        id3FrameArray2 = new Id3Frame[]{};
        id3FrameArray2 = ((ArrayList)object).toArray(id3FrameArray2);
        object2 = chapterFrame;
        l3 = l8;
        chapterFrame = new ChapterFrame(string2, n15, n16, l8, l4, id3FrameArray2);
        return chapterFrame;
    }

    /*
     * WARNING - void declaration
     */
    public static ChapterTocFrame c0(Xm2 object, int n3, int n4, boolean bl2, int n7, Uc1$a id3FrameArray) {
        void var9_16;
        void var12_23;
        ChapterTocFrame chapterTocFrame;
        Id3Frame[] id3FrameArray2;
        void var3_4;
        Object object2;
        byte[] byArray;
        int n8;
        int n10;
        Id3Frame[] id3FrameArray3 = object;
        int n14 = ((Xm2)object).b;
        byte[] byArray2 = ((Xm2)object).a;
        int n15 = uc1_1.s0(n14, byArray2);
        Object object3 = ((Xm2)object).a;
        int n16 = n15 - n14;
        Charset charset = StandardCharsets.ISO_8859_1;
        String string2 = new String((byte[])object3, n14, n16, charset);
        int n17 = 1;
        int n18 = n15 + n17;
        ((Xm2)object).I(n18);
        int n19 = ((Xm2)object).w();
        int n20 = n19 & 2;
        charset = null;
        if (n20 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        int n21 = n19 & n17;
        if (n21 != 0) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            byArray2 = null;
        }
        int n22 = ((Xm2)object).w();
        String[] stringArray = new String[n22];
        for (n10 = 0; n10 < n22; ++n10) {
            n8 = id3FrameArray3.b;
            byArray = id3FrameArray3.a;
            int n24 = uc1_1.s0(n8, byArray);
            byte[] byArray3 = id3FrameArray3.a;
            int n25 = n24 - n8;
            Charset charset2 = StandardCharsets.ISO_8859_1;
            stringArray[n10] = object2 = new String(byArray3, n8, n25, charset2);
            id3FrameArray3.I(n24 += n17);
        }
        object3 = new ArrayList;
        ((ArrayList)object3)();
        n14 += n3;
        while ((n22 = id3FrameArray3.b) < n14) {
            void var4_5;
            n22 = n4;
            n10 = var3_4;
            n8 = var4_5;
            byArray = id3FrameArray2;
            object2 = uc1_1.e0(n4, (Xm2)id3FrameArray3, (boolean)var3_4, (int)var4_5, (Uc1$a)id3FrameArray2);
            if (object2 == null) continue;
            ((ArrayList)object3).add(object2);
        }
        id3FrameArray3 = new Id3Frame[]{};
        id3FrameArray3 = ((ArrayList)object3).toArray(id3FrameArray3);
        object = chapterTocFrame;
        void var2_3 = var12_23;
        var3_4 = var9_16;
        id3FrameArray2 = id3FrameArray3;
        chapterTocFrame = new ChapterTocFrame(string2, (boolean)var12_23, (boolean)var9_16, stringArray, id3FrameArray3);
        return chapterTocFrame;
    }

    public static CommentFrame d0(int n3, Xm2 object) {
        int n4 = 4;
        if (n3 < n4) {
            return null;
        }
        int n7 = ((Xm2)object).w();
        Charset charset = uc1_1.p0(n7);
        int n8 = 3;
        byte[] byArray = new byte[n8];
        ((Xm2)object).g(0, byArray, n8);
        String string2 = new String(byArray, 0, n8);
        Object object2 = new byte[n3 -= n4];
        ((Xm2)object).g(0, (byte[])object2, n3);
        n3 = uc1_1.r0(0, object2, n7);
        object = new String((byte[])object2, 0, n3, charset);
        n8 = uc1_1.o0(n7) + n3;
        n3 = uc1_1.r0(n8, object2, n7);
        String string3 = uc1_1.i0(object2, n8, n3, charset);
        object2 = new CommentFrame;
        object2(string2, (String)object, string3);
        return object2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Id3Frame e0(int var0, Xm2 var1_1, boolean var2_2, int var3_3, Uc1$a var4_4) {
        block38: {
            block48: {
                block37: {
                    block36: {
                        block35: {
                            block47: {
                                block46: {
                                    block45: {
                                        block44: {
                                            block43: {
                                                block42: {
                                                    block41: {
                                                        block40: {
                                                            block39: {
                                                                var5_5 = var0;
                                                                var6_6 = var1_1;
                                                                var7_7 = var1_1.w();
                                                                var8_8 = var1_1.w();
                                                                var9_9 = var1_1.w();
                                                                var10_10 = 3;
                                                                var12_12 = var0 >= var10_10 ? (var11_11 = var1_1.w()) : 0;
                                                                var13_13 = 4;
                                                                if (var5_5 == var13_13) {
                                                                    var11_11 = var1_1.A();
                                                                    if (!var2_2) {
                                                                        var14_14 = var11_11 & 255;
                                                                        var15_15 = (var11_11 >> 8 & 255) << 7;
                                                                        var14_14 |= var15_15;
                                                                        var15_15 = (var11_11 >> 16 & 255) << 14;
                                                                        var11_11 = (var11_11 >> 24 & 255) << 21 | (var14_14 |= var15_15);
                                                                    }
                                                                } else {
                                                                    var11_11 = var5_5 == var10_10 ? var1_1.A() : var1_1.z();
                                                                }
                                                                var16_16 = var11_11;
                                                                var17_17 = var5_5 >= var10_10 ? (var11_11 = var1_1.C()) : 0;
                                                                var18_18 = null;
                                                                if (var7_7 == 0 && var8_8 == 0 && var9_9 == 0 && var12_12 == 0 && var16_16 == 0 && var17_17 == 0) {
                                                                    var19_19 = var6_6.c;
                                                                    var6_6.I(var19_19);
                                                                    return null;
                                                                }
                                                                var20_22 = var6_6.b + var16_16;
                                                                var11_11 = var6_6.c;
                                                                if (var20_22 > var11_11) {
                                                                    Cx.f("Frame size exceeds remaining tag data");
                                                                    var19_20 = var6_6.c;
                                                                    var6_6.I(var19_20);
                                                                    return null;
                                                                }
                                                                if (var4_4 != null) {
                                                                    var21_23 = var4_4;
                                                                    var14_14 = var0;
                                                                    var15_15 = var7_7;
                                                                    var22_24 = var8_8;
                                                                    var13_13 = var20_22;
                                                                    var20_22 = var9_9;
                                                                    var19_21 = var17_17;
                                                                    var17_17 = var12_12;
                                                                    var11_11 = (int)var4_4.a(var0, var7_7, var8_8, var9_9, var12_12);
                                                                    if (var11_11 == 0) {
                                                                        var6_6.I(var13_13);
                                                                        return null;
                                                                    }
                                                                } else {
                                                                    var13_13 = var20_22;
                                                                    var19_21 = var17_17;
                                                                }
                                                                var11_11 = 1;
                                                                if (var5_5 == var10_10) {
                                                                    var14_14 = var19_21 & 128;
                                                                    if (var14_14 != 0) {
                                                                        var14_14 = 1;
                                                                        var23_25 = 1.4E-45f;
                                                                    } else {
                                                                        var14_14 = 0;
                                                                        var23_25 = 0.0f;
                                                                        var24_26 = null;
                                                                    }
                                                                    var15_15 = var19_21 & 64;
                                                                    if (var15_15 != 0) {
                                                                        var15_15 = 1;
                                                                        var25_27 = 1.4E-45f;
                                                                    } else {
                                                                        var15_15 = 0;
                                                                        var25_27 = 0.0f;
                                                                    }
                                                                    if ((var19_21 &= 32) != 0) {
                                                                        var19_21 = 1;
                                                                        var26_28 = 1.4E-45f;
                                                                    } else {
                                                                        var19_21 = 0;
                                                                        var26_28 = 0.0f;
                                                                        var27_29 = null;
                                                                    }
                                                                    var22_24 = var15_15;
                                                                    var20_22 = 0;
                                                                    var15_15 = var14_14;
                                                                    var25_27 = var23_25;
                                                                } else {
                                                                    var14_14 = 4;
                                                                    var23_25 = 5.6E-45f;
                                                                    if (var5_5 == var14_14) {
                                                                        var14_14 = var19_21 & 64;
                                                                        if (var14_14 != 0) {
                                                                            var14_14 = 1;
                                                                            var23_25 = 1.4E-45f;
                                                                        } else {
                                                                            var14_14 = 0;
                                                                            var23_25 = 0.0f;
                                                                            var24_26 = null;
                                                                        }
                                                                        var15_15 = var19_21 & 8;
                                                                        if (var15_15 != 0) {
                                                                            var15_15 = 1;
                                                                            var25_27 = 1.4E-45f;
                                                                        } else {
                                                                            var15_15 = 0;
                                                                            var25_27 = 0.0f;
                                                                        }
                                                                        var22_24 = var19_21 & 4;
                                                                        var22_24 = var22_24 != 0 ? 1 : 0;
                                                                        var20_22 = var19_21 & 2;
                                                                        var20_22 = var20_22 != 0 ? 1 : 0;
                                                                        if ((var19_21 &= var11_11) != 0) {
                                                                            var19_21 = 1;
                                                                            var26_28 = 1.4E-45f;
                                                                        } else {
                                                                            var19_21 = 0;
                                                                            var26_28 = 0.0f;
                                                                            var27_29 = null;
                                                                        }
                                                                        var28_33 = var15_15;
                                                                        var29_34 = var25_27;
                                                                        var15_15 = var19_21;
                                                                        var25_27 = var26_28;
                                                                        var19_21 = var14_14;
                                                                        var26_28 = var23_25;
                                                                        var14_14 = var28_33;
                                                                        var23_25 = var29_34;
                                                                    } else {
                                                                        var19_21 = 0;
                                                                        var26_28 = 0.0f;
                                                                        var27_29 = null;
                                                                        var14_14 = 0;
                                                                        var23_25 = 0.0f;
                                                                        var24_26 = null;
                                                                        var15_15 = 0;
                                                                        var25_27 = 0.0f;
                                                                        var22_24 = 0;
                                                                        var20_22 = 0;
                                                                    }
                                                                }
                                                                if (var14_14 != 0 || var22_24 != 0) break block38;
                                                                if (var19_21 != 0) {
                                                                    var16_16 += -1;
                                                                    var6_6.J(var11_11);
                                                                }
                                                                if (var15_15 != 0) {
                                                                    var16_16 += -4;
                                                                    var19_21 = 4;
                                                                    var26_28 = 5.6E-45f;
                                                                    var6_6.J(var19_21);
                                                                }
                                                                if (var20_22 != 0) {
                                                                    var16_16 = uc1_1.t0(var16_16, var6_6);
                                                                }
                                                                var19_21 = 2;
                                                                var26_28 = 2.8E-45f;
                                                                var11_11 = 84;
                                                                var14_14 = 88;
                                                                var23_25 = 1.23E-43f;
                                                                if (var7_7 == var11_11 && var8_8 == var14_14 && var9_9 == var14_14 && (var5_5 == var19_21 || var12_12 == var14_14)) {
                                                                    try {
                                                                        var27_29 = uc1_1.l0(var16_16, var6_6);
                                                                        break block35;
                                                                    }
                                                                    catch (Throwable var27_30) {
                                                                        break block36;
                                                                    }
                                                                    catch (Exception var27_31) {
                                                                        break block37;
                                                                    }
                                                                    catch (OutOfMemoryError var27_32) {
                                                                        break block37;
                                                                    }
                                                                }
                                                                if (var7_7 != var11_11) break block39;
                                                                var27_29 = uc1_1.q0(var5_5, var7_7, var8_8, var9_9, var12_12);
                                                                var27_29 = uc1_1.j0(var16_16, var6_6, (String)var27_29);
                                                                break block35;
                                                            }
                                                            var15_15 = 87;
                                                            var25_27 = 1.22E-43f;
                                                            if (var7_7 != var15_15 || var8_8 != var14_14 || var9_9 != var14_14 || var5_5 != var19_21 && var12_12 != var14_14) break block40;
                                                            var27_29 = uc1_1.n0(var16_16, var6_6);
                                                            break block35;
                                                        }
                                                        if (var7_7 != var15_15) break block41;
                                                        var27_29 = uc1_1.q0(var5_5, var7_7, var8_8, var9_9, var12_12);
                                                        var27_29 = uc1_1.m0(var16_16, var6_6, (String)var27_29);
                                                        break block35;
                                                    }
                                                    var14_14 = 73;
                                                    var23_25 = 1.02E-43f;
                                                    var15_15 = 80;
                                                    var25_27 = 1.12E-43f;
                                                    if (var7_7 != var15_15 || var8_8 != (var22_24 = 82) || var9_9 != var14_14 || var12_12 != (var22_24 = 86)) break block42;
                                                    var27_29 = uc1_1.h0(var16_16, var6_6);
                                                    break block35;
                                                }
                                                var22_24 = 71;
                                                var20_22 = 79;
                                                if (var7_7 != var22_24 || var8_8 != (var22_24 = 69) || var9_9 != var20_22 || var12_12 != (var22_24 = 66) && var5_5 != var19_21) break block43;
                                                var27_29 = uc1_1.f0(var16_16, var6_6);
                                                break block35;
                                            }
                                            var22_24 = 65;
                                            var17_17 = 67;
                                            if (!(var5_5 == var19_21 ? var7_7 == var15_15 && var8_8 == var14_14 && var9_9 == var17_17 : var7_7 == var22_24 && var8_8 == var15_15 && var9_9 == var14_14 && var12_12 == var17_17)) break block44;
                                            var27_29 = uc1_1.a0(var6_6, var16_16, var5_5);
                                            break block35;
                                        }
                                        var14_14 = 77;
                                        var23_25 = 1.08E-43f;
                                        if (var7_7 != var17_17 || var8_8 != var20_22 || var9_9 != var14_14 || var12_12 != var14_14 && var5_5 != var19_21) break block45;
                                        var27_29 = uc1_1.d0(var16_16, var6_6);
                                        break block35;
                                    }
                                    if (var7_7 != var17_17) break block46;
                                    var19_21 = 72;
                                    var26_28 = 1.01E-43f;
                                    if (var8_8 != var19_21 || var9_9 != var22_24 || var12_12 != var15_15) break block46;
                                    var21_23 = var1_1;
                                    var14_14 = var16_16;
                                    var15_15 = var0;
                                    var22_24 = (int)var2_2;
                                    var20_22 = var3_3;
                                    var27_29 = uc1_1.b0(var1_1, var16_16, var0, var2_2, var3_3, var4_4);
                                    break block35;
                                }
                                if (var7_7 != var17_17 || var8_8 != var11_11 || var9_9 != var20_22 || var12_12 != var17_17) break block47;
                                var21_23 = var1_1;
                                var14_14 = var16_16;
                                var15_15 = var0;
                                var22_24 = (int)var2_2;
                                var20_22 = var3_3;
                                var27_29 = uc1_1.c0(var1_1, var16_16, var0, var2_2, var3_3, var4_4);
                                break block35;
                            }
                            if (var7_7 != var14_14) ** GOTO lbl-1000
                            var19_21 = 76;
                            var26_28 = 1.06E-43f;
                            if (var8_8 == var19_21 && var9_9 == var19_21 && var12_12 == var11_11) {
                                var27_29 = uc1_1.g0(var16_16, var6_6);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var27_29 = uc1_1.q0(var5_5, var7_7, var8_8, var9_9, var12_12);
                                var21_23 = new byte[var16_16];
                                var14_14 = 0;
                                var23_25 = 0.0f;
                                var24_26 = null;
                                var6_6.g(0, (byte[])var21_23, var16_16);
                                var27_29 = var24_26 = new BinaryFrame((String)var27_29, (byte[])var21_23);
                            }
                        }
                        var6_6.I(var13_13);
                        var28_33 = 0;
                        var29_34 = 0.0f;
                        var18_18 = var27_29;
                        var19_21 = 0;
                        var27_29 = null;
                        var26_28 = 0.0f;
                        break block48;
                    }
                    var6_6.I(var13_13);
                    throw var27_30;
                }
                var6_6.I(var13_13);
            }
            if (var18_18 == null) {
                var21_23 = new StringBuilder("Failed to decode frame: id=");
                var24_26 = uc1_1.q0(var5_5, var7_7, var8_8, var9_9, var12_12);
                var21_23.append((String)var24_26);
                var24_26 = ", frameSize=";
                var21_23.append((String)var24_26);
                var21_23.append(var16_16);
                var21_23 = var21_23.toString();
                Cx.g((String)var21_23, (Throwable)var27_29);
            }
            return var18_18;
        }
        Cx.f("Skipping unsupported compressed or encrypted frame");
        var6_6.I(var13_13);
        return null;
    }

    public static GeobFrame f0(int n3, Xm2 object) {
        int n4 = ((Xm2)object).w();
        Object object2 = uc1_1.p0(n4);
        byte[] byArray = new byte[n3 += -1];
        ((Xm2)object).g(0, byArray, n3);
        int n7 = uc1_1.s0(0, byArray);
        Charset charset = StandardCharsets.ISO_8859_1;
        String string2 = new String(byArray, 0, n7, charset);
        String string3 = ip1_0.l(string2);
        int n8 = uc1_1.r0(++n7, byArray, n4);
        object = uc1_1.i0(byArray, n7, n8, (Charset)object2);
        int n10 = uc1_1.o0(n4) + n8;
        n8 = uc1_1.r0(n10, byArray, n4);
        object2 = uc1_1.i0(byArray, n10, n8, (Charset)object2);
        n4 = uc1_1.o0(n4) + n8;
        byte[] byArray2 = n3 <= n4 ? gz3.f : Arrays.copyOfRange(byArray, n4, n3);
        GeobFrame geobFrame = new GeobFrame(string3, (String)object, (String)object2, byArray2);
        return geobFrame;
    }

    public static MlltFrame g0(int n3, Xm2 object) {
        int n4 = ((Xm2)object).C();
        int n7 = ((Xm2)object).z();
        int n8 = ((Xm2)object).z();
        int n10 = ((Xm2)object).w();
        int n14 = ((Xm2)object).w();
        Object object2 = new Vm2();
        ((Vm2)object2).l((Xm2)object);
        n3 = (n3 + -10) * 8;
        int n15 = n10 + n14;
        object = new int[n3 /= n15];
        int[] nArray = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n16 = ((Vm2)object2).g(n10);
            int n17 = ((Vm2)object2).g(n14);
            object[i3] = n16;
            nArray[i3] = n17;
        }
        object2 = nArray;
        MlltFrame mlltFrame = new MlltFrame(n4, n7, n8, (int[])object, nArray);
        return mlltFrame;
    }

    public static PrivFrame h0(int n3, Xm2 object) {
        byte[] byArray = new byte[n3];
        ((Xm2)object).g(0, byArray, n3);
        int n4 = uc1_1.s0(0, byArray);
        Charset charset = StandardCharsets.ISO_8859_1;
        String string2 = new String(byArray, 0, n4, charset);
        byte[] byArray2 = n3 <= ++n4 ? gz3.f : Arrays.copyOfRange(byArray, n4, n3);
        object = new PrivFrame(string2, byArray2);
        return object;
    }

    public static String i0(byte[] byArray, int n3, int n4, Charset charset) {
        int n7;
        if (n4 > n3 && n4 <= (n7 = byArray.length)) {
            String string2 = new String(byArray, n3, n4 -= n3, charset);
            return string2;
        }
        return "";
    }

    public static TextInformationFrame j0(int n3, Xm2 object, String string2) {
        int n4 = 1;
        if (n3 < n4) {
            return null;
        }
        int n7 = ((Xm2)object).w();
        byte[] byArray = new byte[n3 -= n4];
        ((Xm2)object).g(0, byArray, n3);
        ImmutableList immutableList = uc1_1.k0(n7, byArray, 0);
        object = new TextInformationFrame(string2, null, immutableList);
        return object;
    }

    public static ImmutableList k0(int n3, byte[] byArray, int n4) {
        int n7 = byArray.length;
        String string2 = "";
        if (n4 >= n7) {
            return ImmutableList.of(string2);
        }
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        int n8 = uc1_1.r0(n4, byArray, n3);
        while (n4 < n8) {
            int n10 = n8 - n4;
            Charset charset = uc1_1.p0(n3);
            String string3 = new String(byArray, n4, n10, charset);
            immutableList$Builder.add(string3);
            n4 = uc1_1.o0(n3) + n8;
            n8 = uc1_1.r0(n4, byArray, n3);
        }
        ImmutableCollection immutableCollection = immutableList$Builder.build();
        boolean bl2 = immutableCollection.isEmpty();
        if (bl2) {
            immutableCollection = ImmutableList.of(string2);
        }
        return immutableCollection;
    }

    public static TextInformationFrame l0(int n3, Xm2 object) {
        int n4 = 1;
        if (n3 < n4) {
            return null;
        }
        int n7 = ((Xm2)object).w();
        Object object2 = new byte[n3 -= n4];
        ((Xm2)object).g(0, (byte[])object2, n3);
        n3 = uc1_1.r0(0, object2, n7);
        Charset charset = uc1_1.p0(n7);
        object = new String((byte[])object2, 0, n3, charset);
        int n8 = uc1_1.o0(n7) + n3;
        ImmutableList immutableList = uc1_1.k0(n7, object2, n8);
        object2 = new TextInformationFrame;
        object2("TXXX", (String)object, immutableList);
        return object2;
    }

    public static UrlLinkFrame m0(int n3, Xm2 object, String string2) {
        byte[] byArray = new byte[n3];
        ((Xm2)object).g(0, byArray, n3);
        n3 = uc1_1.s0(0, byArray);
        Charset charset = StandardCharsets.ISO_8859_1;
        object = new String(byArray, 0, n3, charset);
        UrlLinkFrame urlLinkFrame = new UrlLinkFrame(string2, null, (String)object);
        return urlLinkFrame;
    }

    public static UrlLinkFrame n0(int n3, Xm2 object) {
        int n4 = 1;
        if (n3 < n4) {
            return null;
        }
        int n7 = ((Xm2)object).w();
        Object object2 = new byte[n3 -= n4];
        ((Xm2)object).g(0, (byte[])object2, n3);
        n3 = uc1_1.r0(0, object2, n7);
        Charset charset = uc1_1.p0(n7);
        object = new String((byte[])object2, 0, n3, charset);
        n7 = uc1_1.o0(n7) + n3;
        n3 = uc1_1.s0(n7, object2);
        Charset charset2 = StandardCharsets.ISO_8859_1;
        String string2 = uc1_1.i0(object2, n7, n3, charset2);
        object2 = new UrlLinkFrame;
        object2("WXXX", (String)object, string2);
        return object2;
    }

    public static int o0(int n3) {
        int n4;
        n3 = n3 != 0 && n3 != (n4 = 3) ? 2 : 1;
        return n3;
    }

    public static Charset p0(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String q0(int n3, int n4, int n7, int n8, int n10) {
        Object object;
        int n14 = 1;
        int n15 = 3;
        int n16 = 2;
        if (n3 == n16) {
            object = Locale.US;
            Object object2 = n4;
            Integer n17 = n7;
            Integer n18 = n8;
            Object[] objectArray = new Object[n15];
            objectArray[0] = object2;
            objectArray[n14] = n17;
            objectArray[n16] = n18;
            object2 = "%c%c%c";
            object = String.format((Locale)object, (String)object2, objectArray);
        } else {
            object = Locale.US;
            Object object3 = n4;
            Integer n19 = n7;
            Integer n20 = n8;
            Integer n21 = n10;
            int n22 = 4;
            Object[] objectArray = new Object[n22];
            objectArray[0] = object3;
            objectArray[n14] = n19;
            objectArray[n16] = n20;
            objectArray[n15] = n21;
            object3 = "%c%c%c%c";
            object = String.format((Locale)object, (String)object3, objectArray);
        }
        return object;
    }

    public static int r0(int n3, byte[] byArray, int n4) {
        int n7;
        int n8 = uc1_1.s0(n3, byArray);
        if (n4 != 0 && n4 != (n7 = 3)) {
            while (n8 < (n4 = byArray.length + -1)) {
                n4 = (n8 - n3) % 2;
                if (n4 == 0) {
                    n4 = n8 + 1;
                    if ((n4 = byArray[n4]) == 0) {
                        return n8;
                    }
                }
                n8 = uc1_1.s0(n8 + 1, byArray);
            }
            return byArray.length;
        }
        return n8;
    }

    public static int s0(int n3, byte[] byArray) {
        int n4;
        while (n3 < (n4 = byArray.length)) {
            n4 = byArray[n3];
            if (n4 == 0) {
                return n3;
            }
            ++n3;
        }
        return byArray.length;
    }

    public static int t0(int n3, Xm2 xm2) {
        int n4;
        int n7;
        int n8;
        byte[] byArray = xm2.a;
        int n10 = n8 = xm2.b;
        while ((n7 = n10 + 1) < (n4 = n8 + n3)) {
            n4 = byArray[n10];
            int n14 = 255;
            if ((n4 &= n14) == n14 && (n4 = byArray[n7]) == 0) {
                n4 = n10 - n8;
                n4 = n3 - n4 + -2;
                System.arraycopy(byArray, n10 += 2, byArray, n7, n4);
                n3 += -1;
            }
            n10 = n7;
        }
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean u0(Xm2 xm2, int n3, int n4, boolean bl2) {
        Throwable throwable2;
        int n7;
        Xm2 xm22;
        block13: {
            boolean bl3;
            xm22 = xm2;
            int n8 = n3;
            n7 = xm2.b;
            while (true) {
                long l2;
                long l3;
                long l4;
                int n10;
                int n14;
                block16: {
                    block15: {
                        block17: {
                            int n15;
                            block14: {
                                block12: {
                                    block11: {
                                        try {
                                            n14 = xm2.a();
                                            bl3 = true;
                                            if (n14 < n4) break;
                                            n14 = 3;
                                            if (n8 < n14) break block11;
                                            n10 = xm2.i();
                                            l4 = xm2.y();
                                            n15 = xm2.C();
                                            break block12;
                                        }
                                        catch (Throwable throwable2) {
                                            break block13;
                                        }
                                    }
                                    n10 = xm2.z();
                                    int n16 = xm2.z();
                                    l4 = n16;
                                    n15 = 0;
                                }
                                long l7 = 0L;
                                if (n10 == 0 && (n10 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1))) == 0 && n15 == 0) {
                                    xm22.I(n7);
                                    return bl3;
                                }
                                n10 = 4;
                                if (n8 == n10 && !bl2) {
                                    long l8 = 0x808080L & l4;
                                    long l12 = l8 - l7;
                                    Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                    if (object != false) {
                                        xm22.I(n7);
                                        return false;
                                    }
                                    l7 = 255L;
                                    l8 = l4 & l7;
                                    long l14 = (l4 >> 8 & l7) << 7;
                                    l8 |= l14;
                                    l14 = l4 >> 16 & l7;
                                    int n17 = 14;
                                    object = 24;
                                    l4 = l4 >> object & l7;
                                    int n18 = 21;
                                    l4 = l4 << n18 | (l8 |= (l14 <<= n17));
                                }
                                if (n8 != n10) break block14;
                                n14 = n15 & 0x40;
                                n14 = n14 != 0 ? 1 : 0;
                                n10 = n15 & 1;
                                if (n10 == 0) break block15;
                                break block16;
                            }
                            if (n8 != n14) break block17;
                            n14 = n15 & 0x20;
                            n14 = n14 != 0 ? 1 : 0;
                            n10 = n15 & 0x80;
                            if (n10 == 0) break block15;
                            break block16;
                        }
                        n14 = 0;
                    }
                    bl3 = false;
                }
                if (bl3) {
                    n14 += 4;
                }
                if ((n10 = (int)((l3 = l4 - (l2 = (long)n14)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) < 0) {
                    xm22.I(n7);
                    return false;
                }
                n14 = xm2.a();
                l2 = n14;
                long l15 = l2 - l4;
                n10 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                if (n10 < 0) {
                    xm22.I(n7);
                    return false;
                }
                n14 = (int)l4;
                {
                    xm22.J(n14);
                    continue;
                }
                break;
            }
            xm22.I(n7);
            return bl3;
        }
        xm22.I(n7);
        throw throwable2;
    }

    public final Metadata Q(do1_2 object, ByteBuffer byteBuffer) {
        object = byteBuffer.array();
        int n3 = byteBuffer.limit();
        return this.Z(n3, (byte[])object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Metadata Z(int n3, byte[] byArray) {
        int n4;
        Object object;
        int n7;
        Object object2;
        boolean bl2 = true;
        int n8 = 4;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Xm2 xm2 = new Xm2(byArray, n3);
        n3 = xm2.a();
        int n10 = 2;
        int n14 = 10;
        if (n3 < n14) {
            object2 = "Data too short to be an ID3 tag";
            Cx.f((String)object2);
            return null;
        }
        n3 = xm2.z();
        if (n3 != (n7 = 0x494433)) {
            object2 = n3;
            object = new Object[bl2];
            object[0] = object2;
            object2 = String.format("%06X", (Object[])object);
            object = "Unexpected first three bytes of ID3 tag header: 0x";
            object2 = ((String)object).concat((String)object2);
            Cx.f((String)object2);
            return null;
        }
        n3 = xm2.w();
        xm2.J((int)(bl2 ? 1 : 0));
        n7 = xm2.w();
        int n15 = xm2.v();
        if (n3 == n10) {
            n4 = n7 & 0x40;
            if (n4 != 0) {
                object2 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                Cx.f((String)object2);
                return null;
            }
        } else {
            n4 = 3;
            if (n3 == n4) {
                n4 = n7 & 0x40;
                if (n4 != 0) {
                    n4 = xm2.i();
                    xm2.J(n4);
                    n15 -= (n4 += n8);
                }
            } else {
                if (n3 != n8) {
                    object = "Skipped ID3 tag with unsupported majorVersion=";
                    CS1.a(n3, (String)object);
                    return null;
                }
                n4 = n7 & 0x40;
                if (n4 != 0) {
                    n4 = xm2.v();
                    int n16 = n4 + -4;
                    xm2.J(n16);
                    n15 -= n4;
                }
                if ((n4 = n7 & 0x10) != 0) {
                    n15 += -10;
                }
            }
        }
        if (n3 < n8 && (n7 &= 0x80) != 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        Uc1$b uc1$b = new Uc1$b(n3, n7 != 0, n15);
        if (uc1$b == null) {
            return null;
        }
        n3 = xm2.b;
        n7 = uc1$b.a;
        if (n7 == n10) {
            n14 = 6;
        }
        n10 = (int)(uc1$b.b ? 1 : 0);
        n15 = uc1$b.c;
        if (n10 != 0) {
            n15 = uc1_1.t0(n15, xm2);
        }
        xm2.H(n3 += n15);
        n3 = (int)(uc1_1.u0(xm2, n7, n14, false) ? 1 : 0);
        if (n3 == 0) {
            if (n7 != n8 || (n3 = (int)(uc1_1.u0(xm2, n8, n14, bl2) ? 1 : 0)) == 0) {
                CS1.a(n7, "Failed to validate ID3 tag with majorVersion=");
                return null;
            }
        } else {
            bl2 = false;
        }
        while ((n3 = xm2.a()) >= n14) {
            object2 = this.a;
            if ((object2 = uc1_1.e0(n7, xm2, bl2, n14, (Uc1$a)object2)) == null) continue;
            arrayList.add(object2);
        }
        return new Metadata(arrayList);
    }
}

