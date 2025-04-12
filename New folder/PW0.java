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
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class PW0
implements eI0 {
    public static final byte[] J;
    public static final d K;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public gi0_0 F;
    public wp3[] G;
    public wp3[] H;
    public boolean I;
    public final vf3$a_0 a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final Xm2 e;
    public final Xm2 f;
    public final Xm2 g;
    public final byte[] h;
    public final Xm2 i;
    public final MB0 j;
    public final Xm2 k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final wJ2 n;
    public ImmutableList o;
    public int p;
    public int q;
    public long r;
    public int s;
    public Xm2 t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    public PW0$b z;

    static {
        String string2;
        Object object = new byte[16];
        byte[] byArray = object;
        byte[] byArray2 = object;
        byArray[0] = -94;
        byArray2[1] = 57;
        byArray[2] = 79;
        byArray2[3] = 82;
        byArray[4] = 90;
        byArray2[5] = -101;
        byArray[6] = 79;
        byArray2[7] = 20;
        byArray[8] = -94;
        byArray2[9] = 68;
        byArray[10] = 108;
        byArray2[11] = 66;
        byArray[12] = 124;
        byArray2[13] = 100;
        byArray[14] = -115;
        byArray2[15] = -12;
        J = object;
        object = new d$a;
        ((d$a)object)();
        ((d$a)object).n = string2 = ip1_0.l("application/x-emsg");
        K = ((d$a)object).a();
    }

    public PW0(int n3, vf3$a_0 object) {
        long l2;
        Object object2 = ImmutableList.of();
        this.a = object;
        this.b = n3;
        Object object3 = Collections.unmodifiableList(object2);
        this.c = object3;
        object3 = new MB0();
        this.j = object3;
        int n4 = 16;
        object3 = new Xm2(n4);
        this.k = object3;
        object2 = DS1.a;
        object3 = new Xm2((byte[])object2);
        this.e = object3;
        object3 = new Xm2(5);
        this.f = object3;
        object3 = new Xm2();
        this.g = object3;
        object3 = new byte[n4];
        this.h = (byte[])object3;
        object = new Xm2((byte[])object3);
        this.i = object;
        object3 = new ArrayDeque();
        this.l = object3;
        object3 = new ArrayDeque();
        this.m = object3;
        object3 = new SparseArray();
        this.d = object3;
        object3 = ImmutableList.of();
        this.o = object3;
        this.x = l2 = -9223372036854775807L;
        this.w = l2;
        this.y = l2;
        object3 = gi0_0.c0;
        this.F = object3;
        object = new wp3[]{};
        this.G = object;
        object3 = new wp3[]{};
        this.H = object3;
        super(this);
        super((wJ2$b)object);
        this.n = object3;
    }

    public static DrmInitData d(ArrayList object) {
        int n3 = ((ArrayList)object).size();
        Object object2 = null;
        ArrayList<DrmInitData$SchemeData> arrayList = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3;
            Object object4 = (zQ1$b)((ArrayList)object).get(i3);
            int n4 = ((zq1_0)object4).a;
            int n7 = 1886614376;
            if (n4 != n7) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<DrmInitData$SchemeData>();
            }
            if ((object3 = UB2.a((byte[])(object4 = (Object)((zQ1$b)object4).b.a))) == null) {
                n4 = 0;
                object3 = null;
            } else {
                object3 = ((UB2$a)object3).a;
            }
            if (object3 == null) {
                object4 = "Skipped pssh atom (failed to extract uuid)";
                Cx.f((String)object4);
                continue;
            }
            String string2 = "video/mp4";
            DrmInitData$SchemeData drmInitData$SchemeData = new DrmInitData$SchemeData((UUID)object3, null, string2, (byte[])object4);
            arrayList.add(drmInitData$SchemeData);
        }
        if (arrayList != null) {
            DrmInitData$SchemeData[] drmInitData$SchemeDataArray = new DrmInitData$SchemeData[]{};
            drmInitData$SchemeDataArray = arrayList.toArray(drmInitData$SchemeDataArray);
            object2 = object = new DrmInitData(null, false, drmInitData$SchemeDataArray);
        }
        return object2;
    }

    public static void f(Xm2 object, int n3, pp3 pp32) {
        int n4 = 1;
        ((Xm2)object).I(n3 += 8);
        n3 = ((Xm2)object).i();
        int n7 = n3 & 1;
        if (n7 == 0) {
            byte[] byArray;
            n7 = 0;
            if ((n3 &= 2) != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                byArray = null;
            }
            int n8 = ((Xm2)object).A();
            if (n8 == 0) {
                object = pp32.l;
                n3 = pp32.e;
                Arrays.fill((boolean[])object, 0, n3, false);
                return;
            }
            int n10 = pp32.e;
            if (n8 == n10) {
                Arrays.fill(pp32.l, 0, n8, n3 != 0);
                n3 = ((Xm2)object).a();
                Xm2 xm2 = pp32.n;
                xm2.F(n3);
                pp32.k = n4;
                pp32.o = n4;
                byArray = xm2.a;
                n4 = xm2.c;
                ((Xm2)object).g(0, byArray, n4);
                xm2.I(0);
                pp32.o = false;
                return;
            }
            object = wk0_0.a(n8, "Senc sample count ", " is different from fragment sample count");
            n3 = pp32.e;
            ((StringBuilder)object).append(n3);
            throw ParserException.a(((StringBuilder)object).toString(), null);
        }
        throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(fi0_0 fi0_02, Pw2 object) {
        int n3;
        boolean bl2;
        int n4;
        Object object2;
        void var20_32;
        int n7;
        Object object3;
        long l2;
        int n8;
        Object object4;
        Object object5;
        byte by2;
        Object object6;
        wJ2 wJ22;
        byte by4;
        int n10;
        int n14;
        int n15;
        Object object7;
        PW0 pW0;
        block112: {
            Object object8;
            String string2;
            Object object9;
            Object object10;
            int n16;
            Object object11;
            Object object12;
            byte by5;
            byte by6;
            Object object13;
            int n17;
            Object object14;
            Object object15;
            wp3[] wp3Array;
            block111: {
                Object object16;
                block110: {
                    block90: {
                        Object object17;
                        Object object18;
                        byte by7;
                        pW0 = this;
                        object7 = fi0_02;
                        block2: while (true) {
                            n15 = 1;
                            while (true) {
                                int n18;
                                long l3;
                                Object object19;
                                Object object20;
                                Object object21;
                                Object object22;
                                block95: {
                                    block105: {
                                        long l4;
                                        block106: {
                                            Xm2 xm2;
                                            block107: {
                                                block103: {
                                                    long l7;
                                                    block104: {
                                                        Object object23;
                                                        block102: {
                                                            Object object24;
                                                            Object object25;
                                                            block93: {
                                                                block91: {
                                                                    block96: {
                                                                        Object object26;
                                                                        long l8;
                                                                        block101: {
                                                                            long l12;
                                                                            block99: {
                                                                                block100: {
                                                                                    wp3[] wp3Array2;
                                                                                    block98: {
                                                                                        block97: {
                                                                                            block94: {
                                                                                                by7 = pW0.p;
                                                                                                wp3Array = pW0.l;
                                                                                                object15 = pW0.d;
                                                                                                n14 = 0;
                                                                                                object14 = null;
                                                                                                n10 = 1701671783;
                                                                                                by4 = 1936286840;
                                                                                                wJ22 = pW0.n;
                                                                                                n17 = 0;
                                                                                                object13 = null;
                                                                                                by6 = 2;
                                                                                                if (by7 == 0) break block93;
                                                                                                object6 = pW0.m;
                                                                                                if (by7 == n15) break block94;
                                                                                                object22 = Long.MAX_VALUE;
                                                                                                if (by7 != by6) {
                                                                                                    PW0$b pW0$b = pW0.z;
                                                                                                    if (pW0$b != null) break block90;
                                                                                                    by7 = object15.size();
                                                                                                    object21 = object22;
                                                                                                    n10 = 0;
                                                                                                    object18 = null;
                                                                                                    Object var24_52 = null;
                                                                                                    break block95;
                                                                                                } else {
                                                                                                    void var20_34;
                                                                                                    n15 = object15.size();
                                                                                                    by7 = 0;
                                                                                                    Object var20_33 = null;
                                                                                                    wp3Array = null;
                                                                                                    for (object20 = 0; object20 < n15; object20 += n14) {
                                                                                                        Object object27;
                                                                                                        object14 = ((PW0$b)object15.valueAt((int)object20)).b;
                                                                                                        by2 = ((pp3)object14).o;
                                                                                                        if (by2 != 0 && (n14 = (int)((object27 = (object23 = ((pp3)object14).c) - object22) == 0L ? 0 : (object27 < 0L ? -1 : 1))) < 0) {
                                                                                                            PW0$b pW0$b = (PW0$b)object15.valueAt(object20);
                                                                                                            object22 = object23;
                                                                                                        }
                                                                                                        n14 = 1;
                                                                                                    }
                                                                                                    if (var20_34 == null) {
                                                                                                        pW0.p = n15 = 3;
                                                                                                        continue block2;
                                                                                                    }
                                                                                                    object5 = object7;
                                                                                                    object5 = (il0_0)object7;
                                                                                                    object4 = ((il0_0)object5).d;
                                                                                                    n15 = (int)(object22 -= object4);
                                                                                                    if (n15 < 0) {
                                                                                                        throw ParserException.a("Offset to encryption data was negative.", null);
                                                                                                    }
                                                                                                    wp3Array = object7;
                                                                                                    wp3Array = (il0_0)object7;
                                                                                                    wp3Array.j(n15);
                                                                                                    object5 = var20_34.b;
                                                                                                    Xm2 xm22 = ((pp3)object5).n;
                                                                                                    object15 = xm22.a;
                                                                                                    n14 = xm22.c;
                                                                                                    n10 = 0;
                                                                                                    object18 = null;
                                                                                                    wp3Array.e((byte[])object15, 0, n14, false);
                                                                                                    xm22.I(0);
                                                                                                    ((pp3)object5).o = false;
                                                                                                    continue block2;
                                                                                                }
                                                                                            }
                                                                                            l7 = pW0.r;
                                                                                            by7 = (int)l7;
                                                                                            n15 = pW0.s;
                                                                                            by7 -= n15;
                                                                                            object5 = pW0.t;
                                                                                            if (object5 == null) break block96;
                                                                                            object15 = ((Xm2)object5).a;
                                                                                            object14 = object7;
                                                                                            object14 = (il0_0)object7;
                                                                                            by2 = 0;
                                                                                            wJ22 = null;
                                                                                            n8 = 8;
                                                                                            ((il0_0)object14).e((byte[])object15, n8, by7, false);
                                                                                            by5 = pW0.q;
                                                                                            zQ1$b zQ1$b = new zQ1$b(by5, (Xm2)object5);
                                                                                            object14 = object7;
                                                                                            object14 = (il0_0)object7;
                                                                                            object23 = ((il0_0)object14).d;
                                                                                            n14 = (int)(wp3Array.isEmpty() ? 1 : 0);
                                                                                            if (n14 != 0) break block97;
                                                                                            object5 = ((zQ1$a)wp3Array.peek()).c;
                                                                                            ((ArrayList)object5).add(zQ1$b);
                                                                                            break block91;
                                                                                        }
                                                                                        if (by5 != by4) break block98;
                                                                                        ((Xm2)object5).I(8);
                                                                                        by7 = JA.c(((Xm2)object5).i());
                                                                                        object20 = 4;
                                                                                        ((Xm2)object5).J((int)object20);
                                                                                        object4 = ((Xm2)object5).y();
                                                                                        if (by7 == 0) {
                                                                                            l2 = ((Xm2)object5).y();
                                                                                            object25 = ((Xm2)object5).y();
                                                                                        } else {
                                                                                            l2 = ((Xm2)object5).B();
                                                                                            object25 = ((Xm2)object5).B();
                                                                                        }
                                                                                        object25 += object23;
                                                                                        by7 = gz3.a;
                                                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                                                        object19 = 1000000L;
                                                                                        Object object28 = l2;
                                                                                        l8 = gz3.O(l2, (long)object19, object4, roundingMode);
                                                                                        ((Xm2)object5).J(2);
                                                                                        by7 = ((Xm2)object5).C();
                                                                                        object3 = new int[by7];
                                                                                        object12 = new long[by7];
                                                                                        object6 = new long[by7];
                                                                                        object11 = new long[by7];
                                                                                        object28 = l8;
                                                                                        l12 = object25;
                                                                                        object25 = l2;
                                                                                        object14 = null;
                                                                                        for (n14 = 0; n14 < by7; l12 += l3, ++n14) {
                                                                                            n10 = ((Xm2)object5).i();
                                                                                            int n19 = n10 & -1 << -1;
                                                                                            if (n19 != 0) {
                                                                                                throw ParserException.a("Unhandled indirect reference", null);
                                                                                            }
                                                                                            object19 = ((Xm2)object5).y();
                                                                                            int n20 = -1 >>> 1;
                                                                                            object3[n14] = n10 &= n20;
                                                                                            object12[n14] = l12;
                                                                                            object11[n14] = (byte)object28;
                                                                                            roundingMode = RoundingMode.DOWN;
                                                                                            object28 = object25 += object19;
                                                                                            object28 = gz3.O(object25, 1000000L, object4, roundingMode);
                                                                                            object19 = object11[n14];
                                                                                            object6[n14] = object19 = (Object)(object28 - object19);
                                                                                            ((Xm2)object5).J(4);
                                                                                            n10 = object3[n14];
                                                                                            object19 = object4;
                                                                                            l3 = n10;
                                                                                        }
                                                                                        object5 = l8;
                                                                                        gu_0 gu_02 = new gu_0((int[])object3, (long[])object12, (long[])object6, (long[])object11);
                                                                                        object5 = Pair.create((Object)object5, (Object)gu_02);
                                                                                        pW0.y = l3 = ((Long)((Pair)object5).first).longValue();
                                                                                        gi0_0 gi0_02 = pW0.F;
                                                                                        object5 = (dx2_1)((Pair)object5).second;
                                                                                        gi0_02.h((dx2_1)object5);
                                                                                        n15 = 1;
                                                                                        pW0.I = n15;
                                                                                        break block91;
                                                                                    }
                                                                                    if (by5 != n10 || (by7 = (wp3Array2 = pW0.G).length) == 0) break block91;
                                                                                    ((Xm2)object5).I(8);
                                                                                    by7 = JA.c(((Xm2)object5).i());
                                                                                    object4 = -9223372036854775807L;
                                                                                    if (by7 == 0) break block99;
                                                                                    n14 = 1;
                                                                                    if (by7 == n14) break block100;
                                                                                    object5 = "Skipping unsupported emsg version: ";
                                                                                    CS1.a(by7, (String)object5);
                                                                                    break block91;
                                                                                }
                                                                                object16 = ((Xm2)object5).y();
                                                                                l2 = ((Xm2)object5).B();
                                                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                                                object17 = object16;
                                                                                object13 = roundingMode;
                                                                                l12 = gz3.O(l2, 1000000L, (long)object16, roundingMode);
                                                                                l2 = gz3.O(((Xm2)object5).y(), 1000L, (long)object16, roundingMode);
                                                                                l8 = ((Xm2)object5).y();
                                                                                String string3 = ((Xm2)object5).r();
                                                                                string3.getClass();
                                                                                object3 = ((Xm2)object5).r();
                                                                                object3.getClass();
                                                                                object25 = object4;
                                                                                object26 = l12;
                                                                                break block101;
                                                                            }
                                                                            String string4 = ((Xm2)object5).r();
                                                                            string4.getClass();
                                                                            object3 = ((Xm2)object5).r();
                                                                            object3.getClass();
                                                                            l2 = ((Xm2)object5).y();
                                                                            object16 = ((Xm2)object5).y();
                                                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                                                            l12 = 1000000L;
                                                                            object25 = gz3.O((long)object16, l12, l2, roundingMode);
                                                                            object = object3;
                                                                            object23 = pW0.y;
                                                                            by6 = (byte)(object23 == object4 ? 0 : (object23 < object4 ? -1 : 1));
                                                                            object23 = by6 != 0 ? (object23 += object25) : object4;
                                                                            object16 = ((Xm2)object5).y();
                                                                            l12 = 1000L;
                                                                            l2 = gz3.O((long)object16, l12, l2, roundingMode);
                                                                            object16 = ((Xm2)object5).y();
                                                                            object26 = object23;
                                                                            l8 = (long)object16;
                                                                            object3 = object;
                                                                        }
                                                                        by6 = ((Xm2)object5).a();
                                                                        object12 = new byte[by6];
                                                                        n18 = ((Xm2)object5).a();
                                                                        object20 = 0;
                                                                        ((Xm2)object5).g(0, (byte[])object12, n18);
                                                                        wp3Array = pW0.j;
                                                                        object15 = wp3Array.a;
                                                                        ((ByteArrayOutputStream)object15).reset();
                                                                        wp3Array = wp3Array.b;
                                                                        try {
                                                                            void var20_44;
                                                                            wp3Array.writeBytes((String)var20_44);
                                                                            by7 = 0;
                                                                            Object var20_45 = null;
                                                                            wp3Array.writeByte(0);
                                                                            wp3Array.writeBytes((String)object3);
                                                                            wp3Array.writeByte(0);
                                                                            wp3Array.writeLong(l2);
                                                                            wp3Array.writeLong(l8);
                                                                            wp3Array.write((byte[])object12);
                                                                            wp3Array.flush();
                                                                            byte[] byArray = ((ByteArrayOutputStream)object15).toByteArray();
                                                                            object5 = new Xm2(byArray);
                                                                            by7 = ((Xm2)object5).a();
                                                                            wp3Array = pW0.G;
                                                                        }
                                                                        catch (IOException iOException) {
                                                                            object5 = new RuntimeException(iOException);
                                                                            throw object5;
                                                                        }
                                                                        by5 = wp3Array.length;
                                                                        object14 = null;
                                                                        for (n14 = 0; n14 < by5; n14 += n10) {
                                                                            object18 = wp3Array[n14];
                                                                            by4 = 0;
                                                                            Object var24_55 = null;
                                                                            ((Xm2)object5).I(0);
                                                                            object18.f(by7, (Xm2)object5);
                                                                            n10 = 1;
                                                                        }
                                                                        object4 = object26;
                                                                        n10 = 1;
                                                                        l8 = -9223372036854775807L;
                                                                        Object object29 = object26 - l8;
                                                                        n15 = (int)(object29 == 0L ? 0 : (object29 < 0L ? -1 : 1));
                                                                        if (n15 == 0) {
                                                                            object5 = new PW0$a((long)object25, n10 != 0, by7);
                                                                            ((ArrayDeque)object6).addLast(object5);
                                                                            pW0.v = n15 = pW0.v + by7;
                                                                            break block91;
                                                                        } else {
                                                                            n15 = (int)(((ArrayDeque)object6).isEmpty() ? 1 : 0);
                                                                            if (n15 == 0) {
                                                                                n14 = 0;
                                                                                object14 = null;
                                                                                object5 = new PW0$a((long)object26, false, by7);
                                                                                ((ArrayDeque)object6).addLast(object5);
                                                                                pW0.v = n15 = pW0.v + by7;
                                                                                break block91;
                                                                            } else {
                                                                                object5 = pW0.G;
                                                                                n14 = ((Object)object5).length;
                                                                                object18 = null;
                                                                                for (n10 = 0; n10 < n14; n10 += by4) {
                                                                                    object11 = object5[n10];
                                                                                    int n21 = 1;
                                                                                    n16 = 0;
                                                                                    object21 = object4;
                                                                                    object11.a((long)object4, n21, by7, 0, null);
                                                                                    by4 = 1;
                                                                                }
                                                                            }
                                                                        }
                                                                        break block91;
                                                                    }
                                                                    object5 = object7;
                                                                    object5 = (il0_0)object7;
                                                                    ((il0_0)object5).j(by7);
                                                                }
                                                                object5 = object7;
                                                                object5 = (il0_0)object7;
                                                                l7 = ((il0_0)object5).d;
                                                                pW0.g(l7);
                                                                continue block2;
                                                            }
                                                            n15 = pW0.s;
                                                            xm2 = pW0.k;
                                                            if (n15 == 0) {
                                                                object5 = xm2.a;
                                                                object14 = object7;
                                                                object14 = (il0_0)object7;
                                                                n8 = 0;
                                                                object3 = null;
                                                                n7 = 8;
                                                                n17 = 1;
                                                                n15 = (int)(((il0_0)object14).e((byte[])object5, 0, n7, n17 != 0) ? 1 : 0);
                                                                if (n15 == 0) {
                                                                    wJ22.b(0);
                                                                    return -1;
                                                                }
                                                                pW0.s = n7;
                                                                xm2.I(0);
                                                                pW0.r = object23 = xm2.y();
                                                                pW0.q = n15 = xm2.i();
                                                            }
                                                            if ((n15 = (int)((object24 = (object23 = pW0.r) - (object25 = 1L)) == 0L ? 0 : (object24 < 0L ? -1 : 1))) == 0) {
                                                                object5 = xm2.a;
                                                                object14 = object7;
                                                                object14 = (il0_0)object7;
                                                                by2 = 0;
                                                                wJ22 = null;
                                                                n8 = 8;
                                                                ((il0_0)object14).e((byte[])object5, n8, n8, false);
                                                                pW0.s = n15 = pW0.s + n8;
                                                                pW0.r = object23 = xm2.B();
                                                            } else {
                                                                object25 = 0L;
                                                                Object object30 = object23 - object25;
                                                                n15 = (int)(object30 == 0L ? 0 : (object30 < 0L ? -1 : 1));
                                                                if (n15 == 0) {
                                                                    object5 = object7;
                                                                    object5 = (il0_0)object7;
                                                                    object23 = ((il0_0)object5).c;
                                                                    object25 = -1;
                                                                    Object object31 = object23 - object25;
                                                                    n15 = (int)(object31 == 0L ? 0 : (object31 < 0L ? -1 : 1));
                                                                    if (n15 == 0 && (n15 = (int)(wp3Array.isEmpty() ? 1 : 0)) == 0) {
                                                                        object5 = (zQ1$a)wp3Array.peek();
                                                                        object23 = ((zQ1$a)object5).b;
                                                                    }
                                                                    if ((n15 = (int)(object23 == object25 ? 0 : (object23 < object25 ? -1 : 1))) != 0) {
                                                                        object5 = object7;
                                                                        object5 = (il0_0)object7;
                                                                        object25 = ((il0_0)object5).d;
                                                                        object23 -= object25;
                                                                        n15 = pW0.s;
                                                                        object25 = n15;
                                                                        pW0.r = object23 += object25;
                                                                    }
                                                                }
                                                            }
                                                            object23 = pW0.r;
                                                            n15 = pW0.s;
                                                            object25 = n15;
                                                            n14 = object23 == object25 ? 0 : (object23 < object25 ? -1 : 1);
                                                            if (n14 < 0) {
                                                                throw ParserException.b("Atom size less than header length (unsupported).");
                                                            }
                                                            object14 = object7;
                                                            object14 = (il0_0)object7;
                                                            object23 = ((il0_0)object14).d;
                                                            object25 = n15;
                                                            object23 -= object25;
                                                            n15 = pW0.q;
                                                            n14 = 1835295092;
                                                            n7 = 0x6D6F6F66;
                                                            if ((n15 == n7 || n15 == n14) && (n15 = (int)(pW0.I ? 1 : 0)) == 0) {
                                                                object5 = pW0.F;
                                                                long l14 = pW0.x;
                                                                object13 = new dX2$b(l14, (long)object23);
                                                                object5.h((dx2_1)object13);
                                                                n15 = 1;
                                                                pW0.I = n15;
                                                            }
                                                            if ((n15 = pW0.q) == n7) {
                                                                n15 = object15.size();
                                                                object13 = null;
                                                                for (n17 = 0; n17 < n15; n17 += by6) {
                                                                    object12 = ((PW0$b)object15.valueAt((int)n17)).b;
                                                                    object12.getClass();
                                                                    ((pp3)object12).c = object23;
                                                                    ((pp3)object12).b = object23;
                                                                    by6 = 1;
                                                                }
                                                            }
                                                            if ((n15 = pW0.q) != n14) break block102;
                                                            by5 = 0;
                                                            object15 = null;
                                                            pW0.z = null;
                                                            l7 = pW0.r;
                                                            pW0.u = object23 += l7;
                                                            pW0.p = n15 = 2;
                                                            break block103;
                                                        }
                                                        by5 = 1836019574;
                                                        if (n15 != by5 && n15 != (by5 = 1953653099) && n15 != (by5 = 1835297121) && n15 != (by5 = 1835626086) && n15 != (by5 = 1937007212) && n15 != n7 && n15 != (by5 = 1953653094) && n15 != (by5 = 1836475768) && n15 != (by5 = 1701082227)) break block104;
                                                        by7 = 1;
                                                        object15 = object7;
                                                        object15 = (il0_0)object7;
                                                        l4 = ((il0_0)object15).d;
                                                        object22 = pW0.r;
                                                        l4 += object22;
                                                        object18 = new zQ1$a(n15, l4 -= (long)8);
                                                        wp3Array.push(object18);
                                                        object22 = pW0.r;
                                                        object23 = pW0.s;
                                                        n15 = (int)(object22 == object23 ? 0 : (object22 < object23 ? -1 : 1));
                                                        if (n15 != 0) break block105;
                                                        break block106;
                                                    }
                                                    object20 = 1751411826;
                                                    l4 = Integer.MAX_VALUE;
                                                    if (n15 == object20 || n15 == (object20 = 1835296868) || n15 == (object20 = 1836476516) || n15 == by4 || n15 == (object20 = 1937011556) || n15 == (object20 = 0x73747473) || n15 == (object20 = 1668576371) || n15 == (object20 = 1937011555) || n15 == (object20 = 1937011578) || n15 == (object20 = 1937013298) || n15 == (object20 = 1937007471) || n15 == (object20 = 1668232756) || n15 == (object20 = 0x73747373) || n15 == (object20 = 0x74666474) || n15 == (object20 = 1952868452) || n15 == (object20 = 1953196132) || n15 == (object20 = 1953654136) || n15 == (object20 = 1953658222) || n15 == (object20 = 1886614376) || n15 == (object20 = 1935763834) || n15 == (object20 = 1935763823) || n15 == (object20 = 1936027235) || n15 == (object20 = 1970628964) || n15 == (object20 = 1935828848) || n15 == (object20 = 1936158820) || n15 == (object20 = 1701606260) || n15 == (object20 = 1835362404) || n15 == n10) break block107;
                                                    l7 = pW0.r;
                                                    long l15 = l7 - l4;
                                                    object20 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                                                    if (object20 > 0) {
                                                        throw ParserException.b("Skipping atom with length > 2147483647 (unsupported).");
                                                    }
                                                    object5 = null;
                                                    pW0.t = null;
                                                    pW0.p = n15 = 1;
                                                }
                                                by7 = 1;
                                                continue block2;
                                            }
                                            n15 = pW0.s;
                                            object20 = 8;
                                            if (n15 != object20) {
                                                throw ParserException.b("Leaf atom defines extended atom size (unsupported).");
                                            }
                                            object22 = pW0.r;
                                            Object object32 = object22 - l4;
                                            n15 = (int)(object32 == 0L ? 0 : (object32 < 0L ? -1 : 1));
                                            if (n15 > 0) {
                                                throw ParserException.b("Leaf atom with length > 2147483647 (unsupported).");
                                            }
                                            object4 = pW0.r;
                                            by5 = (int)object4;
                                            object5 = new Xm2(by5);
                                            byte[] byArray = xm2.a;
                                            wp3Array = (wp3[])((Xm2)object5).a;
                                            by5 = 0;
                                            object15 = null;
                                            n14 = 8;
                                            System.arraycopy(byArray, 0, wp3Array, 0, n14);
                                            pW0.t = object5;
                                            by7 = 1;
                                            pW0.p = by7;
                                            continue block2;
                                        }
                                        pW0.g(l4);
                                        continue block2;
                                    }
                                    n15 = 0;
                                    object5 = null;
                                    pW0.p = 0;
                                    pW0.s = 0;
                                    continue block2;
                                }
                                for (by4 = 0; by4 < by7; by4 += n15) {
                                    block109: {
                                        block108: {
                                            object3 = object10 = object15.valueAt((int)by4);
                                            object3 = (PW0$b)object10;
                                            by6 = (byte)(((PW0$b)object3).l ? 1 : 0);
                                            if (by6 != 0) break block108;
                                            n18 = ((PW0$b)object3).f;
                                            object9 = ((PW0$b)object3).d;
                                            n7 = ((Bp3)object9).b;
                                            if (n18 == n7) break block109;
                                        }
                                        object9 = ((PW0$b)object3).b;
                                        if (by6 == 0 || (n18 = ((PW0$b)object3).h) != (object20 = ((pp3)object9).d)) {
                                            if (by6 == 0) {
                                                wp3Array = (wp3[])((PW0$b)object3).d.c;
                                                n7 = ((PW0$b)object3).f;
                                                object19 = wp3Array[n7];
                                            } else {
                                                wp3Array = (wp3[])((pp3)object9).f;
                                                n7 = ((PW0$b)object3).h;
                                                object19 = wp3Array[n7];
                                            }
                                            object20 = object19 == object21 ? 0 : (object19 < object21 ? -1 : 1);
                                            if (object20 < 0) {
                                                object18 = object3;
                                                object21 = object19;
                                            }
                                        }
                                    }
                                    by6 = 2;
                                }
                                if (object18 != null) break block2;
                                l3 = pW0.u;
                                object15 = object7;
                                object15 = (il0_0)object7;
                                object22 = ((il0_0)object15).d;
                                object20 = l3 -= object22;
                                if (object20 < 0) {
                                    throw ParserException.a("Offset to end of mdat was negative.", null);
                                }
                                fi0_0 fi0_03 = object7;
                                il0_0 il0_02 = (il0_0)object7;
                                il0_02.j((int)object20);
                                pW0.p = 0;
                                pW0.s = 0;
                            }
                            break;
                        }
                        by7 = (byte)(((PW0$b)object18).l ? 1 : 0);
                        if (by7 == 0) {
                            long[] lArray = ((PW0$b)object18).d.c;
                            int n22 = ((PW0$b)object18).f;
                            object4 = lArray[n22];
                        } else {
                            long[] lArray = ((PW0$b)object18).b.f;
                            int n24 = ((PW0$b)object18).h;
                            object4 = lArray[n24];
                        }
                        fi0_0 fi0_04 = object7;
                        il0_0 il0_03 = (il0_0)object7;
                        object17 = il0_03.d;
                        by7 = (int)(object4 -= object17);
                        if (by7 < 0) {
                            Cx.f("Ignoring negative offset to sample data.");
                            by7 = 0;
                            Object var20_29 = null;
                        }
                        wp3Array = object7;
                        wp3Array = (il0_0)object7;
                        wp3Array.j(by7);
                        pW0.z = object18;
                        Object object33 = object18;
                    }
                    int n25 = pW0.p;
                    by5 = 6;
                    n10 = pW0.b;
                    string2 = "video/avc";
                    object3 = var20_32.b;
                    n7 = 3;
                    if (n25 == n7) {
                        int n26;
                        int n27;
                        boolean bl3;
                        void var30_74;
                        boolean bl4;
                        void var30_69;
                        boolean bl5 = var20_32.l;
                        if (!bl5) {
                            wp3Array = (wp3[])var20_32.d.d;
                            n7 = var20_32.f;
                            Object object34 = wp3Array[n7];
                        } else {
                            wp3Array = (wp3[])((pp3)object3).h;
                            n7 = var20_32.f;
                            Object object35 = wp3Array[n7];
                        }
                        pW0.A = var30_69;
                        int n28 = n10 & 0x40;
                        if (n28 != 0 && (bl4 = Objects.equals(wp3Array = var20_32.d.a.g.o, string2))) {
                            boolean bl6 = false;
                            wp3Array = null;
                        } else {
                            boolean bl7 = true;
                        }
                        pW0.D = var30_74;
                        int n29 = var20_32.f;
                        n7 = var20_32.i;
                        if (n29 < n7) {
                            int n30;
                            n15 = pW0.A;
                            ((il0_0)object7).j(n15);
                            object7 = var20_32.b();
                            if (object7 != null) {
                                Object object36;
                                object5 = ((pp3)object3).n;
                                int n32 = ((op3)object7).d;
                                if (n32 != 0) {
                                    ((Xm2)object5).J(n32);
                                }
                                int n34 = var20_32.f;
                                boolean bl8 = ((pp3)object3).k;
                                if (bl8 && (object36 = (wp3Array = (wp3[])((pp3)object3).l)[n34]) != false) {
                                    int n35 = ((Xm2)object5).C() * 6;
                                    ((Xm2)object5).J(n35);
                                }
                            }
                            boolean bl9 = var20_32.c();
                            if (!bl9) {
                                pW0.z = null;
                            }
                            pW0.p = n30 = 3;
                            return 0;
                        }
                        wp3Array = var20_32.d.a;
                        int n36 = wp3Array.h;
                        if (n36 == n15) {
                            int n37;
                            int n38 = pW0.A;
                            n7 = 8;
                            pW0.A = n37 = n38 - n7;
                            wp3Array = object7;
                            wp3Array = (il0_0)object7;
                            wp3Array.j(n7);
                        }
                        if (bl3 = ((String)(object9 = "audio/ac4")).equals(wp3Array = var20_32.d.a.g.o)) {
                            int n39;
                            int n41;
                            int n42 = pW0.A;
                            n7 = 7;
                            pW0.B = n41 = var20_32.d(n42, n7);
                            int n43 = pW0.A;
                            object12 = pW0.i;
                            z1_0.a(n43, (Xm2)object12);
                            wp3Array = var20_32.a;
                            wp3Array.f(n7, (Xm2)object12);
                            pW0.B = n39 = pW0.B + n7;
                        } else {
                            int n44;
                            int n45 = pW0.A;
                            pW0.B = n44 = var20_32.d(n45, 0);
                        }
                        int n46 = pW0.A;
                        n7 = pW0.B;
                        pW0.A = n27 = n46 + n7;
                        pW0.p = n26 = 4;
                        pW0.C = 0;
                    }
                    wp3Array = var20_32.d;
                    object9 = wp3Array.a;
                    by6 = (byte)(var20_32.l ? 1 : 0);
                    if (by6 == 0) {
                        wp3Array = (wp3[])wp3Array.f;
                        n8 = var20_32.f;
                        object16 = wp3Array[n8];
                    } else {
                        int n47 = var20_32.f;
                        object3 = ((pp3)object3).i;
                        object16 = object3[n47];
                    }
                    object8 = object16;
                    int n48 = ((kp3)object9).k;
                    object3 = var20_32.a;
                    if (n48 == 0) break block110;
                    object12 = pW0.f;
                    object11 = ((Xm2)object12).a;
                    object11[0] = 0;
                    object11[n15] = 0;
                    int n49 = 2;
                    object11[n49] = 0;
                    n17 = n48 + 1;
                    int n50 = 4 - n48;
                    break block111;
                }
                object4 = object16;
                while ((n15 = pW0.B) < (n14 = pW0.A)) {
                    n14 -= n15;
                    object5 = null;
                    n14 = object3.c((mi0_0)object7, n14, false);
                    pW0.B = n15 = pW0.B + n14;
                }
                break block112;
            }
            while ((by5 = pW0.B) < (n15 = pW0.A)) {
                block120: {
                    void var52_139;
                    int n51;
                    block113: {
                        block119: {
                            block118: {
                                block114: {
                                    block117: {
                                        block116: {
                                            block115: {
                                                n15 = pW0.C;
                                                object15 = "video/hevc";
                                                object14 = ((kp3)object9).g;
                                                if (n15 != 0) break block113;
                                                object5 = object7;
                                                object5 = (il0_0)object7;
                                                object10 = object9;
                                                object9 = null;
                                                ((il0_0)object5).e((byte[])object11, n51, n17, false);
                                                ((Xm2)object12).I(0);
                                                n15 = ((Xm2)object12).i();
                                                n7 = 1;
                                                if (n15 < n7) {
                                                    throw ParserException.a("Invalid NAL length", null);
                                                }
                                                pW0.C = n15 -= n7;
                                                object5 = pW0.e;
                                                object9 = null;
                                                ((Xm2)object5).I(0);
                                                n7 = 4;
                                                object3.f(n7, (Xm2)object5);
                                                object3.f(1, (Xm2)object12);
                                                object5 = pW0.H;
                                                n15 = ((Object)object5).length;
                                                if (n15 <= 0) break block114;
                                                n15 = object11[n7];
                                                object9 = ((d)object14).o;
                                                n7 = (int)(Objects.equals(object9, string2) ? 1 : 0);
                                                n16 = n17;
                                                object13 = ((d)object14).k;
                                                if (n7 != 0 || (n7 = (int)(ip1_0.a((String)object13, string2) ? 1 : 0)) != 0) break block115;
                                                object2 = object12;
                                                by6 = 6;
                                                break block116;
                                            }
                                            n7 = n15 & 0x1F;
                                            object2 = object12;
                                            by6 = 6;
                                            if (n7 == by6) break block117;
                                        }
                                        object14 = ((d)object14).o;
                                        n14 = (int)(Objects.equals(object14, object15) ? 1 : 0);
                                        if (n14 == 0 && (by5 = (byte)(ip1_0.a((String)object13, (String)object15) ? 1 : 0)) == 0 || (n15 = (n15 & 0x7E) >> 1) != (by5 = 39)) break block118;
                                    }
                                    n15 = 1;
                                    break block119;
                                }
                                n16 = n17;
                                object2 = object12;
                                by6 = 6;
                            }
                            n15 = 0;
                            object5 = null;
                        }
                        pW0.E = n15;
                        pW0.B = n15 = pW0.B + 5;
                        pW0.A = n15 = pW0.A + n51;
                        n15 = (int)(pW0.D ? 1 : 0);
                        if (n15 == 0 && (n15 = (int)(Objects.equals(object5 = var20_32.d.a.g.o, string2) ? 1 : 0)) != 0 && (n15 = (int)(DS1.c(by5 = object11[4]) ? 1 : 0)) != 0) {
                            n15 = 1;
                            pW0.D = n15;
                        }
                        object9 = object10;
                        n17 = n16;
                        object12 = object2;
                        break block120;
                    }
                    object10 = object9;
                    n16 = n17;
                    object2 = object12;
                    by6 = 6;
                    n7 = (int)(pW0.E ? 1 : 0);
                    if (n7 != 0) {
                        object9 = pW0.g;
                        ((Xm2)object9).F(n15);
                        object5 = ((Xm2)object9).a;
                        n17 = pW0.C;
                        object12 = object7;
                        object12 = (il0_0)object7;
                        var52_139 = n51;
                        ((il0_0)object12).e((byte[])object5, 0, n17, false);
                        n15 = pW0.C;
                        object3.f(n15, (Xm2)object9);
                        n15 = pW0.C;
                        wp3Array = (wp3[])((Xm2)object9).a;
                        n51 = DS1.k(((Xm2)object9).c, (byte[])wp3Array);
                        object13 = ((d)object14).o;
                        n17 = (int)(Objects.equals(object13, object15) ? 1 : 0);
                        if (n17 == 0 && (by5 = (byte)(ip1_0.a((String)(object13 = ((d)object14).k), (String)object15) ? 1 : 0)) == 0) {
                            by5 = 0;
                            object15 = null;
                        } else {
                            by5 = 1;
                        }
                        ((Xm2)object9).I(by5);
                        ((Xm2)object9).H(n51);
                        n51 = ((d)object14).q;
                        by5 = -1;
                        if (n51 == by5) {
                            n51 = wJ22.e;
                            if (n51 != 0) {
                                n51 = 0;
                                wp3Array = null;
                                wJ22.e = 0;
                                wJ22.b(0);
                            }
                        } else {
                            by5 = wJ22.e;
                            if (by5 != n51) {
                                if (n51 >= 0) {
                                    by5 = 1;
                                } else {
                                    by5 = 0;
                                    object15 = null;
                                }
                                ct3.f(by5 != 0);
                                wJ22.e = n51;
                                wJ22.b(n51);
                            }
                        }
                        object4 = object8;
                        wJ22.a((long)object8, (Xm2)object9);
                        n14 = var20_32.a();
                        n7 = 4;
                        if ((n14 &= n7) != 0) {
                            n14 = 0;
                            object14 = null;
                            wJ22.b(0);
                        } else {
                            n14 = 0;
                            object14 = null;
                        }
                    } else {
                        var52_139 = n51;
                        object4 = object8;
                        n14 = 0;
                        object14 = null;
                        n15 = object3.c((mi0_0)object7, n15, false);
                    }
                    pW0.B = n14 = pW0.B + n15;
                    pW0.C = n14 = pW0.C - n15;
                    object8 = object4;
                    object9 = object10;
                    n17 = n16;
                    object12 = object2;
                    n51 = var52_139;
                }
                n15 = 1;
                n14 = 0;
                object14 = null;
            }
            object4 = object8;
        }
        int n52 = var20_32.a();
        n15 = n10 & 0x40;
        if (n15 != 0 && (n15 = (int)(pW0.D ? 1 : 0)) == 0) {
            n15 = 0x4000000;
            n4 = n52 | n15;
        }
        int n54 = n4;
        object7 = var20_32.b();
        Object object37 = object7 != null ? (object7 = ((op3)object7).c) : null;
        int n55 = pW0.A;
        object2 = object3;
        object3.a((long)object4, n54, n55, 0, (wp3$a)object37);
        while (!(bl2 = ((ArrayDeque)object6).isEmpty())) {
            object7 = (PW0$a)((ArrayDeque)object6).removeFirst();
            n15 = pW0.v;
            n14 = ((PW0$a)object7).c;
            pW0.v = n15 -= n14;
            n15 = (int)(((PW0$a)object7).b ? 1 : 0);
            l2 = ((PW0$a)object7).a;
            if (n15 != 0) {
                l2 += object4;
            }
            object5 = pW0.G;
            by4 = ((byte[])object5).length;
            wJ22 = null;
            for (by2 = 0; by2 < by4; by2 += n8) {
                object2 = object5[by2];
                n8 = pW0.v;
                object37 = null;
                n54 = 1;
                n7 = ((PW0$a)object7).c;
                object2.a(l2, n54, n7, n8, null);
                n8 = 1;
            }
        }
        boolean bl10 = var20_32.c();
        if (!bl10) {
            boolean bl11 = false;
            object7 = null;
            pW0.z = null;
        }
        pW0.p = n3 = 3;
        return 0;
    }

    public final boolean b(fi0_0 object) {
        boolean bl2 = true;
        ImmutableList immutableList = (object = J70.b((fi0_0)object, bl2, false)) != null ? ImmutableList.of(object) : ImmutableList.of();
        this.o = immutableList;
        if (object != null) {
            bl2 = false;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        SparseArray sparseArray = this.d;
        int n3 = sparseArray.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            PW0$b pW0$b = (PW0$b)sparseArray.valueAt(i3);
            pW0$b.e();
        }
        this.m.clear();
        this.v = 0;
        this.n.b(0);
        this.w = l3;
        this.l.clear();
        this.p = 0;
        this.s = 0;
    }

    public final eI0 e() {
        return this;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void g(long var1_1) {
        var3_2 = this;
        while (true) {
            block121: {
                block122: {
                    block120: {
                        var4_3 = 1;
                        var5_4 = var3_2.l;
                        var6_5 /* !! */  = var5_4.isEmpty();
                        if (var6_5 /* !! */  != 0) break;
                        var7_6 /* !! */  = (zQ1$a)var5_4.peek();
                        var8_7 = var7_6 /* !! */ .b;
                        cfr_temp_0 = var8_7 - var1_1;
                        var6_5 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var6_5 /* !! */  != 0) break;
                        var10_8 /* !! */  = var7_6 /* !! */  = var5_4.pop();
                        var10_8 /* !! */  = (zQ1$a)var7_6 /* !! */ ;
                        var6_5 /* !! */  = var10_8 /* !! */ .a;
                        var11_9 /* !! */  = var3_2.d;
                        var12_10 = var10_8 /* !! */ .c;
                        var13_11 /* !! */  = 1836019574;
                        var14_12 = var3_2.b;
                        var15_13 = 12;
                        var16_14 = 1.7E-44f;
                        if (var6_5 /* !! */  != var13_11 /* !! */ ) break block120;
                        var5_4 = PW0.d((ArrayList)var12_10);
                        var6_5 /* !! */  = 1836475768;
                        var7_6 /* !! */  = var10_8 /* !! */ .b(var6_5 /* !! */ );
                        var7_6 /* !! */ .getClass();
                        var17_15 /* !! */  = new SparseArray();
                        var7_6 /* !! */  = var7_6 /* !! */ .c;
                        var18_16 = var7_6 /* !! */ .size();
                        var19_17 = -9223372036854775807L;
                        var21_18 /* !! */  = null;
                        for (var13_11 /* !! */  = 0; var13_11 /* !! */  < var18_16; var13_11 /* !! */  += var26_23) {
                            var22_19 /* !! */  = var7_6 /* !! */ .get(var13_11 /* !! */ );
                            var23_20 /* !! */  = var22_19 /* !! */ ;
                            var23_20 /* !! */  = (zQ1$b)var22_19 /* !! */ ;
                            var24_21 /* !! */  = var23_20 /* !! */ .a;
                            var25_22 = 1953654136;
                            var23_20 /* !! */  = var23_20 /* !! */ .b;
                            if (var24_21 /* !! */  == var25_22) {
                                var23_20 /* !! */ .I(var15_13);
                                var25_22 = var23_20 /* !! */ .i();
                                var24_21 /* !! */  = var23_20 /* !! */ .i() - var4_3;
                                var15_13 = var23_20 /* !! */ .i();
                                var4_3 = var23_20 /* !! */ .i();
                                var26_23 = var23_20 /* !! */ .i();
                                var27_24 = var25_22;
                                var28_25 = var7_6 /* !! */ ;
                                var7_6 /* !! */  = new Tm0(var24_21 /* !! */ , var15_13, var4_3, var26_23);
                                var23_20 /* !! */  = Pair.create((Object)var27_24, (Object)var7_6 /* !! */ );
                                var27_24 = (Integer)var23_20 /* !! */ .first;
                                var25_22 = var27_24.intValue();
                                var23_20 /* !! */  = (Tm0)var23_20 /* !! */ .second;
                                var17_15 /* !! */ .put(var25_22, (Object)var23_20 /* !! */ );
                            } else {
                                var28_25 = var7_6 /* !! */ ;
                                var25_22 = 1835362404;
                                if (var24_21 /* !! */  == var25_22) {
                                    var23_20 /* !! */ .I(8);
                                    var25_22 = JA.c(var23_20 /* !! */ .i());
                                    if (var25_22 == 0) {
                                        var29_26 = var23_20 /* !! */ .y();
lbl62:
                                        // 2 sources

                                        while (true) {
                                            var19_17 = var29_26;
                                            break;
                                        }
                                    } else {
                                        var29_26 = var23_20 /* !! */ .B();
                                        ** continue;
                                    }
                                }
                            }
                            var26_23 = 1;
                            var7_6 /* !! */  = var28_25;
                            var4_3 = 1;
                            var15_13 = 12;
                            var16_14 = 1.7E-44f;
                        }
                        var12_10 = new IY0();
                        var26_23 = 16;
                        var25_22 = var14_12 & 16;
                        if (var25_22 != 0) {
                            var26_23 = 1;
                        } else {
                            var26_23 = 0;
                            var23_20 /* !! */  = null;
                        }
                        var27_24 = new NW0((PW0)var3_2);
                        var31_27 /* !! */  = null;
                        var32_28 = var19_17;
                        var34_29 = var5_4;
                        var35_30 /* !! */  = var17_15 /* !! */ ;
                        var36_31 = var26_23;
                        var23_20 /* !! */  = var11_9 /* !! */ ;
                        var37_32 = 0;
                        var11_9 /* !! */  = null;
                        var22_19 /* !! */  = var27_24;
                        var27_24 = JA.g((zQ1$a)var10_8 /* !! */ , (IY0)var12_10, var19_17, (DrmInitData)var5_4, (boolean)var26_23, false, (Function)var27_24);
                        var38_33 = var27_24.size();
                        var4_3 = var23_20 /* !! */ .size();
                        if (var4_3 == 0) {
                            var31_27 /* !! */  = null;
                            for (var4_3 = 0; var4_3 < var38_33; var4_3 += var47_40) {
                                var5_4 = (Bp3)var27_24.get(var4_3);
                                var7_6 /* !! */  = var5_4.a;
                                var10_8 /* !! */  = var3_2.F;
                                var18_16 = var7_6 /* !! */ .b;
                                var10_8 /* !! */  = var10_8 /* !! */ .n(var4_3, var18_16);
                                var18_16 = var35_30 /* !! */ .size();
                                var13_11 /* !! */  = var7_6 /* !! */ .a;
                                var14_12 = 1;
                                var40_35 = 1.4E-45f;
                                if (var18_16 == var14_12) {
                                    var18_16 = 0;
                                    var41_36 = 0.0f;
                                    var12_10 = null;
                                    var42_37 /* !! */  = (long[])((Tm0)var35_30 /* !! */ .valueAt(0));
                                } else {
                                    var12_10 = var35_30 /* !! */ .get(var13_11 /* !! */ );
                                    var42_37 /* !! */  = (long[])var12_10;
                                    var42_37 /* !! */  = (long[])((Tm0)var12_10);
                                    var42_37 /* !! */ .getClass();
                                }
                                var39_34 = new PW0$b((wp3)var10_8 /* !! */ , (Bp3)var5_4, (Tm0)var42_37 /* !! */ );
                                var23_20 /* !! */ .put(var13_11 /* !! */ , var39_34);
                                var43_38 = var3_2.x;
                                var45_39 = var7_6 /* !! */ .e;
                                var3_2.x = var45_39 = Math.max(var43_38, var45_39);
                                var47_40 = 1;
                            }
                            var23_20 /* !! */  = var3_2.F;
                            var23_20 /* !! */ .j();
                        } else {
                            var4_3 = var23_20 /* !! */ .size();
                            if (var4_3 == var38_33) {
                                var4_3 = 1;
                            } else {
                                var4_3 = 0;
                                var31_27 /* !! */  = null;
                            }
                            ct3.f((boolean)var4_3);
                            var31_27 /* !! */  = null;
                            for (var4_3 = 0; var4_3 < var38_33; var4_3 += var47_40) {
                                var5_4 = (Bp3)var27_24.get(var4_3);
                                var7_6 /* !! */  = var5_4.a;
                                var24_21 /* !! */  = var7_6 /* !! */ .a;
                                var39_34 = (PW0$b)var23_20 /* !! */ .get(var24_21 /* !! */ );
                                var48_41 = var35_30 /* !! */ .size();
                                var18_16 = 1;
                                var41_36 = 1.4E-45f;
                                if (var48_41 == var18_16) {
                                    var48_41 = 0;
                                    var49_42 = 0.0f;
                                    var10_8 /* !! */  = null;
                                    var7_6 /* !! */  = (Tm0)var35_30 /* !! */ .valueAt(0);
                                } else {
                                    var6_5 /* !! */  = var7_6 /* !! */ .a;
                                    var7_6 /* !! */  = (Tm0)var35_30 /* !! */ .get(var6_5 /* !! */ );
                                    var7_6 /* !! */ .getClass();
                                }
                                var39_34.d = var5_4;
                                var39_34.e = var7_6 /* !! */ ;
                                var5_4 = var5_4.a.g;
                                var7_6 /* !! */  = var39_34.a;
                                var7_6 /* !! */ .d((d)var5_4);
                                var39_34.e();
                                var47_40 = 1;
                            }
                        }
                        var7_6 /* !! */  = var3_2;
                        var50_43 = 2;
                        var4_3 = 8;
                        var24_21 /* !! */  = 16;
                        var51_44 = 2.2E-44f;
                        var13_11 /* !! */  = 1;
                        var37_32 = 4;
                        break block121;
                    }
                    var23_20 /* !! */  = var11_9 /* !! */ ;
                    var25_22 = 0x6D6F6F66;
                    if (var6_5 /* !! */  != var25_22) break block122;
                    var27_24 = var10_8 /* !! */ .d;
                    var4_3 = var27_24.size();
                    var47_40 = 0;
                    var5_4 = null;
                    while (var47_40 < var4_3) {
                        block129: {
                            block123: {
                                block128: {
                                    block127: {
                                        var39_34 = (zQ1$a)var27_24.get(var47_40);
                                        var48_41 = var39_34.a;
                                        var13_11 /* !! */  = 1953653094;
                                        if (var48_41 != var13_11 /* !! */ ) break block123;
                                        var48_41 = 1952868452;
                                        var49_42 = 7.301914E31f;
                                        var10_8 /* !! */  = var39_34.c(var48_41);
                                        var10_8 /* !! */ .getClass();
                                        var10_8 /* !! */  = var10_8 /* !! */ .b;
                                        var10_8 /* !! */ .I(8);
                                        var13_11 /* !! */  = var10_8 /* !! */ .i();
                                        var34_29 = JA.a;
                                        var15_13 = var10_8 /* !! */ .i();
                                        var34_29 = (PW0$b)var23_20 /* !! */ .get(var15_13);
                                        if (var34_29 == null) {
                                            var15_13 = 0;
                                            var16_14 = 0.0f;
                                            var34_29 = null;
                                        } else {
                                            var36_31 = 1;
                                            var37_32 = var13_11 /* !! */  & 1;
                                            var17_15 /* !! */  = var34_29.b;
                                            if (var37_32 != 0) {
                                                var17_15 /* !! */ .b = var19_17 = var10_8 /* !! */ .B();
                                                var17_15 /* !! */ .c = var19_17;
                                            }
                                            var35_30 /* !! */  = var34_29.e;
                                            var38_33 = 2;
                                            var37_32 = var13_11 /* !! */  & 2;
                                            if (var37_32 != 0) {
                                                var38_33 = var10_8 /* !! */ .i();
                                                var37_32 = 1;
                                                var38_33 -= var37_32;
lbl211:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var38_33 = var35_30 /* !! */ .a;
                                            ** continue;
                                            var37_32 = 8;
                                            var52_45 = var13_11 /* !! */  & 8;
                                            var37_32 = var52_45 != 0 ? var10_8 /* !! */ .i() : var35_30 /* !! */ .b;
                                            var52_45 = var13_11 /* !! */  & 16;
                                            var6_5 /* !! */  = var52_45 != 0 ? (var52_45 = var10_8 /* !! */ .i()) : var35_30 /* !! */ .c;
                                            var50_43 = (var13_11 /* !! */  &= 32) != 0 ? var10_8 /* !! */ .i() : var35_30 /* !! */ .d;
                                            var10_8 /* !! */  = new Tm0(var38_33, var37_32, var6_5 /* !! */ , var50_43);
                                            var17_15 /* !! */ .a = var10_8 /* !! */ ;
                                        }
                                        if (var34_29 == null) break block123;
                                        var35_30 /* !! */  = var34_29.b;
                                        var53_46 = var35_30 /* !! */ .p;
                                        var38_33 = (int)var35_30 /* !! */ .q;
                                        var34_29.e();
                                        var6_5 /* !! */  = 1;
                                        var34_29.l = var6_5 /* !! */ ;
                                        var48_41 = 0x74666474;
                                        var49_42 = 7.3014264E31f;
                                        var10_8 /* !! */  = var39_34.c(var48_41);
                                        if (var10_8 /* !! */  == null) ** GOTO lbl-1000
                                        var13_11 /* !! */  = 2;
                                        var55_47 = var14_12 & 2;
                                        if (var55_47 == 0) {
                                            var56_48 = var10_8 /* !! */ .b;
                                            var49_42 = 1.1E-44f;
                                            var56_48.I(8);
                                            var48_41 = JA.c(var56_48.i());
                                            var53_46 = var48_41 == var6_5 /* !! */  ? var56_48.B() : var56_48.y();
                                            var35_30 /* !! */ .p = var53_46;
                                            var35_30 /* !! */ .q = var6_5 /* !! */ ;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var35_30 /* !! */ .p = var53_46;
                                            var35_30 /* !! */ .q = var38_33;
                                        }
                                        var56_48 = var39_34.c;
                                        var6_5 /* !! */  = var56_48.size();
                                        var48_41 = 0;
                                        var49_42 = 0.0f;
                                        var10_8 /* !! */  = null;
                                        var13_11 /* !! */  = 0;
                                        var21_18 /* !! */  = null;
                                        var36_31 = 0;
                                        var17_15 /* !! */  = null;
                                        while (true) {
                                            var37_32 = 1953658222;
                                            if (var48_41 >= var6_5 /* !! */ ) break;
                                            var57_49 = var56_48.get(var48_41);
                                            var58_50 = var27_24;
                                            var27_24 = var57_49;
                                            var27_24 = (zQ1$b)var57_49;
                                            var59_51 = var4_3;
                                            var4_3 = var27_24.a;
                                            if (var4_3 != var37_32) ** GOTO lbl-1000
                                            var27_24 = var27_24.b;
                                            var4_3 = 12;
                                            var27_24.I(var4_3);
                                            var25_22 = var27_24.A();
                                            if (var25_22 > 0) {
                                                var36_31 += var25_22;
                                                var25_22 = 1;
                                                var13_11 /* !! */  += var25_22;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var25_22 = 1;
                                            }
                                            var48_41 += var25_22;
                                            var4_3 = var59_51;
                                            var27_24 = var58_50;
                                        }
                                        var58_50 = var27_24;
                                        var59_51 = var4_3;
                                        var34_29.h = 0;
                                        var34_29.g = 0;
                                        var34_29.f = 0;
                                        var35_30 /* !! */ .d = var13_11 /* !! */ ;
                                        var35_30 /* !! */ .e = var36_31;
                                        var27_24 = var35_30 /* !! */ .g;
                                        var25_22 = ((Object)var27_24).length;
                                        if (var25_22 < var13_11 /* !! */ ) {
                                            var27_24 = new long[var13_11 /* !! */ ];
                                            var35_30 /* !! */ .f = (long[])var27_24;
                                            var27_24 = new int[var13_11 /* !! */ ];
                                            var35_30 /* !! */ .g = (int[])var27_24;
                                        }
                                        if ((var25_22 = ((Object)(var27_24 = (Object)var35_30 /* !! */ .h)).length) < var36_31) {
                                            var36_31 = var36_31 * 125 / 100;
                                            var27_24 = new int[var36_31];
                                            var35_30 /* !! */ .h = (int[])var27_24;
                                            var27_24 = new long[var36_31];
                                            var35_30 /* !! */ .i = (long[])var27_24;
                                            var27_24 = new boolean[var36_31];
                                            var35_30 /* !! */ .j = (boolean[])var27_24;
                                            var27_24 = new boolean[var36_31];
                                            var35_30 /* !! */ .l = (boolean[])var27_24;
                                        }
                                        var25_22 = 0;
                                        var27_24 = null;
                                        var4_3 = 0;
                                        var31_27 /* !! */  = null;
                                        var48_41 = 0;
                                        var49_42 = 0.0f;
                                        var10_8 /* !! */  = null;
                                        while (true) {
                                            block124: {
                                                block126: {
                                                    block125: {
                                                        var60_52 /* !! */  = 0L;
                                                        if (var25_22 >= var6_5 /* !! */ ) break;
                                                        var21_18 /* !! */  = (zQ1$b)var56_48.get(var25_22);
                                                        var36_31 = var21_18 /* !! */ .a;
                                                        if (var36_31 != var37_32) break block124;
                                                        var62_53 = var4_3 + 1;
                                                        var21_18 /* !! */  = var21_18 /* !! */ .b;
                                                        var21_18 /* !! */ .I(8);
                                                        var36_31 = var21_18 /* !! */ .i();
                                                        var11_9 /* !! */  = var34_29.d.a;
                                                        var63_54 = var6_5 /* !! */ ;
                                                        var7_6 /* !! */  = var35_30 /* !! */ .a;
                                                        var64_55 /* !! */  = var23_20 /* !! */ ;
                                                        var23_20 /* !! */  = (SparseArray)var35_30 /* !! */ .g;
                                                        var65_56 = var21_18 /* !! */ .A();
                                                        var23_20 /* !! */ [var4_3] = var65_56;
                                                        var23_20 /* !! */  = (SparseArray)var35_30 /* !! */ .f;
                                                        var66_57 = var39_34;
                                                        var67_58 = var48_41;
                                                        var43_38 = var35_30 /* !! */ .b;
                                                        var23_20 /* !! */ [var4_3] = (SparseArray)var43_38;
                                                        var55_47 = 1;
                                                        var68_59 = var36_31 & 1;
                                                        if (var68_59 != 0) {
                                                            var69_60 = var12_10;
                                                            var18_16 = var21_18 /* !! */ .i();
                                                            var70_61 = var14_12;
                                                            var71_62 = var34_29;
                                                            var72_63 = var18_16;
                                                            var23_20 /* !! */ [var4_3] = (SparseArray)(var43_38 += var72_63);
lbl344:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var69_60 = var12_10;
                                                        var70_61 = var14_12;
                                                        var71_62 = var34_29;
                                                        ** continue;
                                                        var26_23 = 4;
                                                        var24_21 /* !! */  = var36_31 & 4;
                                                        if (var24_21 /* !! */  != 0) {
                                                            var26_23 = 1;
                                                        } else {
                                                            var26_23 = 0;
                                                            var23_20 /* !! */  = null;
                                                        }
                                                        var24_21 /* !! */  = var7_6 /* !! */ .d;
                                                        if (var26_23 != 0) {
                                                            var24_21 /* !! */  = var21_18 /* !! */ .i();
                                                        }
                                                        if ((var48_41 = var36_31 & 256) != 0) {
                                                            var48_41 = 1;
                                                            var49_42 = 1.4E-45f;
                                                        } else {
                                                            var48_41 = 0;
                                                            var49_42 = 0.0f;
                                                            var10_8 /* !! */  = null;
                                                        }
                                                        var18_16 = var36_31 & 512;
                                                        if (var18_16 != 0) {
                                                            var18_16 = 1;
                                                            var41_36 = 1.4E-45f;
                                                        } else {
                                                            var18_16 = 0;
                                                            var41_36 = 0.0f;
                                                            var12_10 = null;
                                                        }
                                                        var14_12 = var36_31 & 1024;
                                                        if (var14_12 != 0) {
                                                            var14_12 = 1;
                                                            var40_35 = 1.4E-45f;
                                                        } else {
                                                            var14_12 = 0;
                                                            var40_35 = 0.0f;
                                                            var42_37 /* !! */  = null;
                                                        }
                                                        var15_13 = var36_31 & 2048;
                                                        if (var15_13 != 0) {
                                                            var15_13 = 1;
                                                            var16_14 = 1.4E-45f;
                                                        } else {
                                                            var15_13 = 0;
                                                            var16_14 = 0.0f;
                                                            var34_29 = null;
                                                        }
                                                        var17_15 /* !! */  = (SparseArray)var11_9 /* !! */ .i;
                                                        if (var17_15 /* !! */  == null) break block125;
                                                        var74_64 = var24_21 /* !! */ ;
                                                        var24_21 /* !! */  = ((SparseArray)var17_15 /* !! */ ).length;
                                                        var75_65 = var47_40;
                                                        var47_40 = 1;
                                                        if (var24_21 /* !! */  != var47_40 || (var5_4 = (Object)var11_9 /* !! */ .j) == null) {
                                                            var76_66 = var26_23;
lbl399:
                                                            // 2 sources

                                                            while (true) {
                                                                var24_21 /* !! */  = var15_13;
                                                                var51_44 = var16_14;
                                                                ** GOTO lbl439
                                                                break;
                                                            }
                                                        } else {
                                                            var51_44 = 0.0f;
                                                            var39_34 = null;
                                                            var77_67 = var17_15 /* !! */ [0];
                                                            cfr_temp_1 = var77_67 - var60_52 /* !! */ ;
                                                            var24_21 /* !! */  = (int)(cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1));
                                                            if (var24_21 /* !! */  == 0) {
                                                                var76_66 = var26_23;
                                                                var24_21 /* !! */  = var15_13;
                                                                var51_44 = var16_14;
lbl412:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var80_69 /* !! */  = RoundingMode.DOWN;
                                                            var24_21 /* !! */  = var15_13;
                                                            var51_44 = var16_14;
                                                            var83_71 = var81_70 = var11_9 /* !! */ .d;
                                                            var85_72 /* !! */  = var80_69 /* !! */ ;
                                                            var81_70 = gz3.O((long)var77_67, 1000000L, var81_70, var80_69 /* !! */ );
                                                            var86_73 = var5_4[0];
                                                            var83_71 = 1000000L;
                                                            var76_66 = var26_23;
                                                            var88_74 = var11_9 /* !! */ .c;
                                                            var88_74 = gz3.O((long)var86_73, var83_71, var88_74, var80_69 /* !! */ );
                                                            cfr_temp_2 = (var81_70 += var88_74) - (var88_74 = var11_9 /* !! */ .e);
                                                            var90_75 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                                            if (var90_75 >= 0) {
                                                                ** continue;
                                                            }
                                                        }
                                                        break block126;
                                                        var79_68 = 0;
                                                        var3_2 = null;
                                                        var60_52 /* !! */  = (long)var5_4[0];
                                                        break block126;
                                                    }
                                                    var76_66 = var26_23;
                                                    var75_65 = var47_40;
                                                    var74_64 = var24_21 /* !! */ ;
                                                    ** continue;
                                                }
                                                var3_2 = var35_30 /* !! */ .h;
                                                var23_20 /* !! */  = (SparseArray)var35_30 /* !! */ .i;
                                                var5_4 = var35_30 /* !! */ .j;
                                                var15_13 = var11_9 /* !! */ .b;
                                                var36_31 = 2;
                                                if (var15_13 != var36_31) ** GOTO lbl-1000
                                                var15_13 = 1;
                                                var16_14 = 1.4E-45f;
                                                var36_31 = var70_61 & 1;
                                                if (var36_31 != 0) {
                                                    var15_13 = 1;
                                                    var16_14 = 1.4E-45f;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var15_13 = 0;
                                                    var16_14 = 0.0f;
                                                    var34_29 = null;
                                                }
                                                var4_3 = var35_30 /* !! */ .g[var4_3];
                                                var4_3 = var67_58 + var4_3;
                                                var90_75 = var15_13;
                                                var81_70 = var35_30 /* !! */ .p;
                                                var91_76 = var25_22;
                                                var17_15 /* !! */  = var35_30 /* !! */ ;
                                                var92_77 = var81_70;
                                                for (var15_13 = var67_58; var15_13 < var4_3; ++var15_13) {
                                                    if (var48_41 != 0) {
                                                        var67_58 = var21_18 /* !! */ .i();
                                                        var94_78 = var4_3;
                                                        var95_79 = var48_41;
                                                        var96_80 = var49_42;
                                                        var4_3 = var67_58;
                                                    } else {
                                                        var94_78 = var4_3;
                                                        var4_3 = var7_6 /* !! */ .b;
                                                        var95_79 = var48_41;
                                                        var96_80 = var49_42;
                                                    }
                                                    var10_8 /* !! */  = "Unexpected negative value: ";
                                                    if (var4_3 >= 0) {
                                                        if (var18_16 != 0) {
                                                            var67_58 = var21_18 /* !! */ .i();
                                                            var97_81 = var18_16;
                                                            var98_82 = var41_36;
                                                            var18_16 = var67_58;
                                                        } else {
                                                            var97_81 = var18_16;
                                                            var98_82 = var41_36;
                                                            var18_16 = var7_6 /* !! */ .c;
                                                        }
                                                        if (var18_16 >= 0) {
                                                            var48_41 = var14_12 != 0 ? var21_18 /* !! */ .i() : (var15_13 == 0 && var76_66 != 0 ? var74_64 : var7_6 /* !! */ .d);
                                                            if (var24_21 /* !! */  != 0) {
                                                                var67_58 = var21_18 /* !! */ .i();
                                                                var85_72 /* !! */  = var7_6 /* !! */ ;
                                                                var99_83 /* !! */  = var24_21 /* !! */ ;
                                                                var100_84 = var51_44;
                                                                var6_5 /* !! */  = var67_58;
                                                            } else {
                                                                var85_72 /* !! */  = var7_6 /* !! */ ;
                                                                var99_83 /* !! */  = var24_21 /* !! */ ;
                                                                var100_84 = var51_44;
                                                                var6_5 /* !! */  = 0;
                                                                var7_6 /* !! */  = null;
                                                            }
                                                            var101_85 = (long)var6_5 /* !! */  + var92_77 - var60_52 /* !! */ ;
                                                            var103_86 = RoundingMode.DOWN;
                                                            var104_87 = 1000000L;
                                                            var106_88 = var11_9 /* !! */ .c;
                                                            var106_88 = gz3.O(var101_85, var104_87, var106_88, var103_86);
                                                            var23_20 /* !! */ [var15_13] = (SparseArray)var106_88;
                                                            var80_69 /* !! */  = var21_18 /* !! */ ;
                                                            var13_11 /* !! */  = (int)var17_15 /* !! */ .q;
                                                            if (var13_11 /* !! */  == 0) {
                                                                var21_18 /* !! */  = var71_62;
                                                                var108_89 = var14_12;
                                                                var109_90 = var40_35;
                                                                var42_37 /* !! */  = (long[])var71_62.d;
                                                                var110_91 = var71_62;
                                                                var32_28 = var42_37 /* !! */ .h;
                                                                var23_20 /* !! */ [var15_13] = (SparseArray)(var106_88 += var32_28);
                                                            } else {
                                                                var110_91 = var71_62;
                                                                var108_89 = var14_12;
                                                                var109_90 = var40_35;
                                                            }
                                                            var3_2[var15_13] = var18_16;
                                                            var24_21 /* !! */  = var48_41 >> 16;
                                                            var6_5 /* !! */  = 1;
                                                            if ((var24_21 /* !! */  &= var6_5 /* !! */ ) == 0 && (var90_75 == 0 || var15_13 == 0)) {
                                                                var6_5 /* !! */  = 1;
                                                            } else {
                                                                var6_5 /* !! */  = 0;
                                                                var7_6 /* !! */  = null;
                                                            }
                                                            var5_4[var15_13] = var6_5 /* !! */ ;
                                                            var106_88 = var4_3;
                                                            var92_77 += var106_88;
                                                            var14_12 = var108_89;
                                                            var40_35 = var109_90;
                                                            var4_3 = var94_78;
                                                            var48_41 = var95_79;
                                                            var49_42 = var96_80;
                                                            var18_16 = var97_81;
                                                            var41_36 = var98_82;
                                                            var7_6 /* !! */  = var85_72 /* !! */ ;
                                                            var24_21 /* !! */  = var99_83 /* !! */ ;
                                                            var51_44 = var100_84;
                                                            var21_18 /* !! */  = var80_69 /* !! */ ;
                                                            var71_62 = var110_91;
                                                            continue;
                                                        }
                                                        var3_2 = new StringBuilder((String)var10_8 /* !! */ );
                                                        var3_2.append(var18_16);
                                                        throw ParserException.a(var3_2.toString(), null);
                                                    }
                                                    var3_2 = new StringBuilder((String)var10_8 /* !! */ );
                                                    var3_2.append(var4_3);
                                                    throw ParserException.a(var3_2.toString(), null);
                                                }
                                                var94_78 = var4_3;
                                                var110_91 = var71_62;
                                                var17_15 /* !! */ .p = var92_77;
                                                var4_3 = var62_53;
                                                var48_41 = var94_78;
lbl557:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var64_55 /* !! */  = var23_20 /* !! */ ;
                                            var91_76 = var25_22;
                                            var17_15 /* !! */  = var35_30 /* !! */ ;
                                            var75_65 = var47_40;
                                            var63_54 = var6_5 /* !! */ ;
                                            var66_57 = var39_34;
                                            var67_58 = var48_41;
                                            var69_60 = var12_10;
                                            var70_61 = var14_12;
                                            var110_91 = var34_29;
                                            ** continue;
                                            var79_68 = 1;
                                            var25_22 = var91_76 + 1;
                                            var3_2 = this;
                                            var35_30 /* !! */  = var17_15 /* !! */ ;
                                            var6_5 /* !! */  = var63_54;
                                            var23_20 /* !! */  = var64_55 /* !! */ ;
                                            var39_34 = var66_57;
                                            var12_10 = var69_60;
                                            var14_12 = var70_61;
                                            var47_40 = var75_65;
                                            var34_29 = var110_91;
                                            var37_32 = 1953658222;
                                        }
                                        var64_55 /* !! */  = var23_20 /* !! */ ;
                                        var17_15 /* !! */  = var35_30 /* !! */ ;
                                        var75_65 = var47_40;
                                        var66_57 = var39_34;
                                        var69_60 = var12_10;
                                        var70_61 = var14_12;
                                        var3_2 = var34_29.d.a;
                                        var23_20 /* !! */  = var35_30 /* !! */ .a;
                                        var23_20 /* !! */ .getClass();
                                        var3_2 = var3_2.l;
                                        if (var3_2 == null) {
                                            var26_23 = 0;
                                            var23_20 /* !! */  = null;
                                        } else {
                                            var26_23 = var23_20 /* !! */ .a;
                                            var3_2 = var3_2[var26_23];
                                            var23_20 /* !! */  = var3_2;
                                        }
                                        var79_68 = 1935763834;
                                        var39_34 = var66_57;
                                        var3_2 = var66_57.c(var79_68);
                                        if (var3_2 != null) {
                                            var23_20 /* !! */ .getClass();
                                            var3_2 = var3_2.b;
                                            var25_22 = 8;
                                            var3_2.I(var25_22);
                                            var50_43 = var3_2.i();
                                            var31_27 /* !! */  = JA.a;
                                            var4_3 = 1;
                                            if ((var50_43 &= var4_3) == var4_3) {
                                                var3_2.J(var25_22);
                                            }
                                            var25_22 = var3_2.w();
                                            var50_43 = var3_2.A();
                                            if (var50_43 <= (var4_3 = var17_15 /* !! */ .e)) {
                                                var4_3 = var23_20 /* !! */ .d;
                                                if (var25_22 == 0) {
                                                    var27_24 = var17_15 /* !! */ .l;
                                                    var5_4 = null;
                                                    var6_5 /* !! */  = 0;
                                                    var7_6 /* !! */  = null;
                                                    for (var47_40 = 0; var47_40 < var50_43; var47_40 += var48_41) {
                                                        var48_41 = var3_2.w();
                                                        var6_5 /* !! */  += var48_41;
                                                        if (var48_41 > var4_3) {
                                                            var48_41 = 1;
                                                            var49_42 = 1.4E-45f;
                                                        } else {
                                                            var48_41 = 0;
                                                            var49_42 = 0.0f;
                                                            var10_8 /* !! */  = null;
                                                        }
                                                        var27_24[var47_40] = var48_41;
                                                        var48_41 = 1;
                                                        var49_42 = 1.4E-45f;
                                                    }
                                                    var4_3 = 0;
                                                    var31_27 /* !! */  = null;
                                                } else {
                                                    if (var25_22 > var4_3) {
                                                        var79_68 = 1;
                                                    } else {
                                                        var79_68 = 0;
                                                        var3_2 = null;
                                                    }
                                                    var6_5 /* !! */  = var25_22 * var50_43;
                                                    var27_24 = var17_15 /* !! */ .l;
                                                    var4_3 = 0;
                                                    var31_27 /* !! */  = null;
                                                    Arrays.fill((boolean[])var27_24, 0, var50_43, (boolean)var79_68);
                                                }
                                                var3_2 = var17_15 /* !! */ .l;
                                                var25_22 = var17_15 /* !! */ .e;
                                                Arrays.fill((boolean[])var3_2, var50_43, var25_22, false);
                                                if (var6_5 /* !! */  > 0) {
                                                    var3_2 = var17_15 /* !! */ .n;
                                                    var3_2.F(var6_5 /* !! */ );
                                                    var79_68 = 1;
                                                    var17_15 /* !! */ .k = var79_68;
                                                    var17_15 /* !! */ .o = var79_68;
                                                }
                                            } else {
                                                var3_2 = wk0_0.a(var50_43, "Saiz sample count ", " is greater than fragment sample count");
                                                var26_23 = var17_15 /* !! */ .e;
                                                var3_2.append(var26_23);
                                                throw ParserException.a(var3_2.toString(), null);
                                            }
                                        }
                                        if ((var3_2 = var39_34.c(var79_68 = 1935763823)) != null) {
                                            var3_2 = var3_2.b;
                                            var25_22 = 8;
                                            var3_2.I(var25_22);
                                            var50_43 = var3_2.i();
                                            var31_27 /* !! */  = JA.a;
                                            var4_3 = 1;
                                            var47_40 = var50_43 & 1;
                                            if (var47_40 == var4_3) {
                                                var3_2.J(var25_22);
                                            }
                                            if ((var25_22 = var3_2.A()) == var4_3) {
                                                var25_22 = JA.c(var50_43);
                                                var111_92 = var17_15 /* !! */ .c;
                                                var92_77 = var25_22 == 0 ? var3_2.y() : var3_2.B();
                                                var17_15 /* !! */ .c = var111_92 += var92_77;
                                            } else {
                                                var3_2 = new StringBuilder("Unexpected saio entry count: ");
                                                var3_2.append(var25_22);
                                                throw ParserException.a(var3_2.toString(), null);
                                            }
                                        }
                                        var25_22 = 0;
                                        var27_24 = null;
                                        var79_68 = 1936027235;
                                        var3_2 = var39_34.c(var79_68);
                                        if (var3_2 != null) {
                                            var3_2 = var3_2.b;
                                            var50_43 = 0;
                                            var35_30 /* !! */  = null;
                                            PW0.f((Xm2)var3_2, 0, (pp3)var17_15 /* !! */ );
                                        }
                                        if (var23_20 /* !! */  != null) {
                                            var23_20 /* !! */  = var23_20 /* !! */ .b;
                                            var7_6 /* !! */  = var23_20 /* !! */ ;
                                        } else {
                                            var6_5 /* !! */  = 0;
                                            var7_6 /* !! */  = null;
                                        }
                                        var79_68 = 0;
                                        var3_2 = null;
                                        var26_23 = 0;
                                        var23_20 /* !! */  = null;
                                        var35_30 /* !! */  = null;
                                        for (var50_43 = 0; var50_43 < (var4_3 = var56_48.size()); var50_43 += var4_3) {
                                            var31_27 /* !! */  = (byte[])((zQ1$b)var56_48.get(var50_43));
                                            var5_4 = var31_27 /* !! */ .b;
                                            var24_21 /* !! */  = 1935828848;
                                            var51_44 = 1.7937577E31f;
                                            var48_41 = 1936025959;
                                            var49_42 = 1.817587E31f;
                                            var4_3 = var31_27 /* !! */ .a;
                                            if (var4_3 == var24_21 /* !! */ ) {
                                                var15_13 = 12;
                                                var16_14 = 1.7E-44f;
                                                var5_4.I(var15_13);
                                                var4_3 = var5_4.i();
                                                if (var4_3 == var48_41) {
                                                    var23_20 /* !! */  = var5_4;
                                                }
lbl722:
                                                // 6 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var15_13 = 12;
                                            var16_14 = 1.7E-44f;
                                            var24_21 /* !! */  = 1936158820;
                                            var51_44 = 1.8336489E31f;
                                            if (var4_3 != var24_21 /* !! */ ) ** GOTO lbl722
                                            var5_4.I(var15_13);
                                            var4_3 = var5_4.i();
                                            if (var4_3 != var48_41) ** GOTO lbl722
                                            var3_2 = var5_4;
                                            ** continue;
                                            var4_3 = 1;
                                        }
                                        var4_3 = 1;
                                        var15_13 = 12;
                                        var16_14 = 1.7E-44f;
                                        if (var23_20 /* !! */  != null && var3_2 != null) break block127;
                                        var50_43 = 2;
                                        var37_32 = 4;
                                        break block128;
                                    }
                                    var50_43 = 8;
                                    var23_20 /* !! */ .I(var50_43);
                                    var47_40 = JA.c(var23_20 /* !! */ .i());
                                    var37_32 = 4;
                                    var23_20 /* !! */ .J(var37_32);
                                    if (var47_40 == var4_3) {
                                        var23_20 /* !! */ .J(var37_32);
                                    }
                                    if ((var26_23 = var23_20 /* !! */ .i()) != var4_3) ** GOTO lbl800
                                    var3_2.I(var50_43);
                                    var26_23 = JA.c(var3_2.i());
                                    var3_2.J(var37_32);
                                    if (var26_23 != var4_3) ** GOTO lbl763
                                    var111_92 = var3_2.y();
                                    cfr_temp_3 = var111_92 - var60_52 /* !! */ ;
                                    var26_23 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                    if (var26_23 != 0) {
                                        var50_43 = 2;
                                    } else {
                                        throw ParserException.b("Variable length description in sgpd found (unsupported)");
lbl763:
                                        // 1 sources

                                        var50_43 = 2;
                                        if (var26_23 >= var50_43) {
                                            var3_2.J(var37_32);
                                        }
                                    }
                                    var111_92 = var3_2.y();
                                    var43_38 = 1L;
                                    var26_23 = (int)(var111_92 == var43_38 ? 0 : (var111_92 < var43_38 ? -1 : 1));
                                    if (var26_23 == 0) {
                                        var26_23 = 1;
                                        var3_2.J(var26_23);
                                        var4_3 = var3_2.w();
                                        var47_40 = var4_3 & 240;
                                        var18_16 = var47_40 >> 4;
                                        var13_11 /* !! */  = var4_3 & 15;
                                        var4_3 = var3_2.w();
                                        if (var4_3 == var26_23) {
                                            var47_40 = 1;
                                        } else {
                                            var47_40 = 0;
                                            var5_4 = null;
                                        }
                                        if (var47_40 != 0) {
                                            var24_21 /* !! */  = var3_2.w();
                                            var26_23 = 16;
                                            var10_8 /* !! */  = (op3[])new byte[var26_23];
                                            var4_3 = 0;
                                            var31_27 /* !! */  = null;
                                            var3_2.g(0, (byte[])var10_8 /* !! */ , var26_23);
                                            if (var24_21 /* !! */  == 0) {
                                                var26_23 = var3_2.w();
                                                var27_24 = new byte[var26_23];
                                                var3_2.g(0, (byte[])var27_24, var26_23);
                                            }
                                            var42_37 /* !! */  = (long[])var27_24;
                                            var79_68 = 1;
                                            var17_15 /* !! */ .k = var79_68;
                                            var31_27 /* !! */  = (byte[])var3_2;
                                            var17_15 /* !! */ .m = var3_2 = new op3((boolean)var47_40, (String)var7_6 /* !! */ , var24_21 /* !! */ , (byte[])var10_8 /* !! */ , var18_16, var13_11 /* !! */ , (byte[])var27_24);
                                        }
                                    } else {
                                        throw ParserException.b("Entry count in sgpd != 1 (unsupported).");
lbl800:
                                        // 1 sources

                                        throw ParserException.b("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                var79_68 = var56_48.size();
                                var41_36 = 0.0f;
                                var12_10 = null;
                                for (var18_16 = 0; var18_16 < var79_68; var18_16 += var26_23) {
                                    var23_20 /* !! */  = (zQ1$b)var56_48.get(var18_16);
                                    var25_22 = var23_20 /* !! */ .a;
                                    var4_3 = 1970628964;
                                    if (var25_22 == var4_3) {
                                        var23_20 /* !! */  = var23_20 /* !! */ .b;
                                        var4_3 = 8;
                                        var23_20 /* !! */ .I(var4_3);
                                        var7_6 /* !! */  = this;
                                        var27_24 = this.h;
                                        var47_40 = 0;
                                        var24_21 /* !! */  = 16;
                                        var51_44 = 2.2E-44f;
                                        var23_20 /* !! */ .g(0, (byte[])var27_24, var24_21 /* !! */ );
                                        var5_4 = PW0.J;
                                        var25_22 = (int)Arrays.equals((byte[])var27_24, (byte[])var5_4);
                                        if (var25_22 != 0) {
                                            PW0.f((Xm2)var23_20 /* !! */ , var24_21 /* !! */ , (pp3)var17_15 /* !! */ );
                                        }
lbl823:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var4_3 = 8;
                                    var24_21 /* !! */  = 16;
                                    var51_44 = 2.2E-44f;
                                    var7_6 /* !! */  = this;
                                    ** continue;
                                    var26_23 = 1;
                                }
                                var26_23 = 1;
                                var4_3 = 8;
                                var24_21 /* !! */  = 16;
                                var51_44 = 2.2E-44f;
                                var7_6 /* !! */  = this;
                                break block129;
                            }
                            var7_6 /* !! */  = var3_2;
                            var64_55 /* !! */  = var23_20 /* !! */ ;
                            var58_50 = var27_24;
                            var59_51 = var4_3;
                            var75_65 = var47_40;
                            var69_60 = var12_10;
                            var70_61 = var14_12;
                            var26_23 = 1;
                            var50_43 = 2;
                            var4_3 = 8;
                            var24_21 /* !! */  = 16;
                            var51_44 = 2.2E-44f;
                            var15_13 = 12;
                            var16_14 = 1.7E-44f;
                            var37_32 = 4;
                        }
                        var47_40 = var75_65 + 1;
                        var3_2 = var7_6 /* !! */ ;
                        var4_3 = var59_51;
                        var27_24 = var58_50;
                        var23_20 /* !! */  = var64_55 /* !! */ ;
                        var12_10 = var69_60;
                        var14_12 = var70_61;
                    }
                    var7_6 /* !! */  = var3_2;
                    var64_55 /* !! */  = var23_20 /* !! */ ;
                    var69_60 = var12_10;
                    var25_22 = 0;
                    var27_24 = null;
                    var50_43 = 2;
                    var4_3 = 8;
                    var24_21 /* !! */  = 16;
                    var51_44 = 2.2E-44f;
                    var37_32 = 4;
                    var3_2 = PW0.d((ArrayList)var12_10);
                    if (var3_2 != null) {
                        var26_23 = var23_20 /* !! */ .size();
                        var41_36 = 0.0f;
                        var12_10 = null;
                        for (var18_16 = 0; var18_16 < var26_23; var18_16 += var47_40) {
                            var56_48 = var64_55 /* !! */ ;
                            var5_4 = (PW0$b)var64_55 /* !! */ .valueAt(var18_16);
                            var10_8 /* !! */  = var5_4.d.a;
                            var21_18 /* !! */  = var5_4.b.a;
                            var14_12 = gz3.a;
                            var13_11 /* !! */  = var21_18 /* !! */ .a;
                            var10_8 /* !! */  = var10_8 /* !! */ .l;
                            if (var10_8 /* !! */  == null) {
                                var48_41 = 0;
                                var10_8 /* !! */  = null;
                                var49_42 = 0.0f;
                            } else {
                                var10_8 /* !! */  = var10_8 /* !! */ [var13_11 /* !! */ ];
                            }
                            if (var10_8 /* !! */  != null) {
                                var10_8 /* !! */  = var10_8 /* !! */ .b;
                            } else {
                                var48_41 = 0;
                                var10_8 /* !! */  = null;
                                var49_42 = 0.0f;
                            }
                            var10_8 /* !! */  = var3_2.a((String)var10_8 /* !! */ );
                            var21_18 /* !! */  = var5_4.d.a.g.a();
                            var21_18 /* !! */ .r = var10_8 /* !! */ ;
                            var10_8 /* !! */  = new d((d$a)var21_18 /* !! */ );
                            var5_4 = var5_4.a;
                            var5_4.d((d)var10_8 /* !! */ );
                            var47_40 = 1;
                            var64_55 /* !! */  = var56_48;
                        }
                    }
                    var56_48 = var64_55 /* !! */ ;
                    var88_74 = var7_6 /* !! */ .w;
                    var8_7 = -9223372036854775807L;
                    cfr_temp_4 = var88_74 - var8_7;
                    var25_22 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                    if (var25_22 != 0) {
                        var79_68 = var64_55 /* !! */ .size();
                        var23_20 /* !! */  = null;
                        for (var26_23 = 0; var26_23 < var79_68; var26_23 += var13_11 /* !! */ ) {
                            var27_24 = (PW0$b)var56_48.valueAt(var26_23);
                            var8_7 = var7_6 /* !! */ .w;
                            var47_40 = var27_24.f;
                            while (true) {
                                var21_18 /* !! */  = var27_24.b;
                                var14_12 = var21_18 /* !! */ .e;
                                if (var47_40 >= var14_12 || (var14_12 = (int)((cfr_temp_5 = (var81_70 = (var42_37 /* !! */  = var21_18 /* !! */ .i)[var47_40]) - var8_7) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) > 0) break;
                                var21_18 /* !! */  = var21_18 /* !! */ .j;
                                var13_11 /* !! */  = (int)var21_18 /* !! */ [var47_40];
                                if (var13_11 /* !! */  != 0) {
                                    var27_24.i = var47_40;
                                }
                                var13_11 /* !! */  = 1;
                                var47_40 += var13_11 /* !! */ ;
                            }
                            var13_11 /* !! */  = 1;
                        }
                        var29_26 = -9223372036854775807L;
                        var13_11 /* !! */  = 1;
                        var7_6 /* !! */ .w = var29_26;
                    } else {
                        var13_11 /* !! */  = 1;
                    }
                    break block121;
                }
                var7_6 /* !! */  = var3_2;
                var50_43 = 2;
                var4_3 = 8;
                var24_21 /* !! */  = 16;
                var51_44 = 2.2E-44f;
                var13_11 /* !! */  = 1;
                var37_32 = 4;
                var79_68 = var5_4.isEmpty();
                if (var79_68 == 0) {
                    var3_2 = ((zQ1$a)var5_4.peek()).d;
                    var3_2.add(var10_8 /* !! */ );
                }
            }
            var3_2 = var7_6 /* !! */ ;
        }
        var7_6 /* !! */  = var3_2;
        var3_2.p = 0;
        var3_2.s = 0;
    }

    public final ImmutableList i() {
        return this.o;
    }

    public final void k(gi0_0 object) {
        int n3;
        wf3_1 wf3_12;
        wp3[] wp3Array;
        int n4 = this.b;
        int n7 = n4 & 0x20;
        if (n7 == 0) {
            wp3Array = this.a;
            wf3_12 = new wf3_1((gi0_0)object, (vf3$a_0)wp3Array);
            object = wf3_12;
        }
        this.F = object;
        n7 = 0;
        wf3_12 = null;
        this.p = 0;
        this.s = 0;
        int n8 = 2;
        wp3Array = new wp3[n8];
        this.G = wp3Array;
        int n10 = 100;
        if ((n4 &= 4) != 0) {
            n4 = 5;
            wp3Array[0] = object = object.n(n10, n4);
            n3 = 1;
            n10 = 101;
        } else {
            n3 = 0;
            object = null;
        }
        Object object2 = this.G;
        object = (wp3[])gz3.K(n3, (Object[])object2);
        this.G = object;
        n4 = ((wp3[])object).length;
        wp3Array = null;
        for (n8 = 0; n8 < n4; ++n8) {
            wp3 wp32 = object[n8];
            d d2 = K;
            wp32.d(d2);
        }
        object = this.c;
        n4 = object.size();
        object2 = new wp3[n4];
        this.H = object2;
        while (n7 < (n4 = ((Object[])(object2 = this.H)).length)) {
            object2 = this.F;
            n8 = n10 + 1;
            int n14 = 3;
            object2 = object2.n(n10, n14);
            wp3[] wp3Array2 = (wp3[])object.get(n7);
            object2.d((d)wp3Array2);
            wp3Array2 = this.H;
            wp3Array2[n7] = object2;
            ++n7;
            n10 = n8;
        }
    }

    public final void release() {
    }
}

