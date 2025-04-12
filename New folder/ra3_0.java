/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$b;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$b;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$c;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from Ra3
 */
public final class ra3_0
extends k0_0 {
    public final Xm2 a;
    public final Vm2 b;
    public On3 c;

    public ra3_0() {
        Object object = new Xm2();
        this.a = object;
        this.b = object = new Vm2();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Metadata Q(do1_2 do1_22, ByteBuffer byteBuffer) {
        Object object;
        Object object2;
        int n3;
        Object object3;
        block23: {
            Object object4;
            long l2;
            long l3;
            long l4;
            double d2;
            long l7;
            int n4;
            int n7;
            int n8;
            ArrayList arrayList;
            Xm2 xm2;
            Object object5;
            int n10;
            block32: {
                long l8;
                int n14;
                int n15;
                int n16;
                boolean bl2;
                int n17;
                int n18;
                long l12;
                long l14;
                Object object6;
                int n19;
                boolean bl3;
                long l15;
                block31: {
                    void var57_56;
                    long l16;
                    int n20;
                    long l17;
                    block29: {
                        int n21;
                        double d5;
                        block30: {
                            block24: {
                                block25: {
                                    block26: {
                                        block28: {
                                            ra3_0 ra3_02;
                                            block27: {
                                                long l18;
                                                long l19;
                                                long l20;
                                                ra3_02 = this;
                                                object3 = do1_22;
                                                n10 = 32;
                                                n3 = 1;
                                                object5 = this.c;
                                                if (object5 == null || (l20 = (l19 = (l18 = do1_22.j) - (l17 = ((On3)object5).e())) == 0L ? 0 : (l19 < 0L ? -1 : 1)) != false) {
                                                    l18 = ((DecoderInputBuffer)object3).f;
                                                    object5 = new On3(l18);
                                                    ra3_02.c = object5;
                                                    l18 = ((DecoderInputBuffer)object3).f;
                                                    l17 = ((do1_2)object3).j;
                                                    ((On3)object5).a(l18 -= l17);
                                                }
                                                object3 = byteBuffer.array();
                                                int n22 = byteBuffer.limit();
                                                xm2 = ra3_02.a;
                                                xm2.G(n22, (byte[])object3);
                                                arrayList = ra3_02.b;
                                                ((Vm2)((Object)arrayList)).k(n22, (byte[])object3);
                                                ((Vm2)((Object)arrayList)).o(39);
                                                l17 = (long)((Vm2)((Object)arrayList)).g(n3) << n10;
                                                long l21 = ((Vm2)((Object)arrayList)).g(n10);
                                                l17 |= l21;
                                                ((Vm2)((Object)arrayList)).o(20);
                                                n8 = ((Vm2)((Object)arrayList)).g(12);
                                                int n24 = ((Vm2)((Object)arrayList)).g(8);
                                                n7 = 14;
                                                xm2.J(n7);
                                                if (n24 == 0) break block24;
                                                n7 = 255;
                                                n4 = 4;
                                                if (n24 == n7) break block25;
                                                l7 = 1L;
                                                d2 = Double.MIN_VALUE;
                                                l4 = 0L;
                                                l3 = 128L;
                                                l2 = -9223372036854775807L;
                                                d5 = -4.9E-324;
                                                if (n24 == n4) break block26;
                                                n8 = 5;
                                                if (n24 == n8) break block27;
                                                n8 = 6;
                                                if (n24 != n8) {
                                                    n8 = 0;
                                                    object3 = null;
                                                    break block23;
                                                } else {
                                                    object3 = ra3_02.c;
                                                    long l22 = TimeSignalCommand.a(l17, xm2);
                                                    long l23 = ((On3)object3).b(l22);
                                                    object3 = new TimeSignalCommand(l22, l23);
                                                }
                                                break block23;
                                            }
                                            object3 = ra3_02.c;
                                            l15 = xm2.y();
                                            int n25 = xm2.w() & 0x80;
                                            bl3 = n25 != 0;
                                            object5 = Collections.emptyList();
                                            if (bl3) break block28;
                                            n7 = xm2.w();
                                            n4 = n7 & 0x80;
                                            n4 = n4 != 0 ? 1 : 0;
                                            n20 = n7 & 0x40;
                                            n20 = n20 != 0 ? 1 : 0;
                                            n19 = n7 & 0x20;
                                            n19 = n19 != 0 ? 1 : 0;
                                            if ((n7 &= 0x10) != 0) {
                                                n7 = 1;
                                            } else {
                                                n7 = 0;
                                                arrayList = null;
                                            }
                                            l16 = n20 != 0 && n7 == 0 ? TimeSignalCommand.a(l17, xm2) : l2;
                                            if (n20 != 0) break block29;
                                            n21 = xm2.w();
                                            object2 = new ArrayList(n21);
                                            break block30;
                                        }
                                        object6 = object5;
                                        l14 = l2;
                                        l12 = l2;
                                        n19 = 0;
                                        n18 = 0;
                                        n17 = 0;
                                        bl2 = false;
                                        n16 = 0;
                                        n15 = 0;
                                        n14 = 0;
                                        break block31;
                                    }
                                    n8 = xm2.w();
                                    object2 = new ArrayList(n8);
                                    boolean bl4 = false;
                                    object5 = null;
                                    break block32;
                                }
                                long l24 = xm2.y();
                                byte[] byArray = new byte[n8 -= n4];
                                boolean bl5 = false;
                                object2 = null;
                                xm2.g(0, byArray, n8);
                                Object object7 = object3;
                                object3 = new PrivateCommand(l24, byArray, l17);
                                break block23;
                            }
                            object3 = new Object();
                            break block23;
                        }
                        for (int i3 = 0; i3 < n21; i3 += n3) {
                            long l25;
                            int n26 = xm2.w();
                            if (n7 == 0) {
                                l25 = l8 = TimeSignalCommand.a(l17, xm2);
                            } else {
                                l25 = l2;
                                double d7 = d5;
                            }
                            long l26 = ((On3)object3).b(l25);
                            l8 = l25;
                            SpliceInsertCommand$b spliceInsertCommand$b = new SpliceInsertCommand$b(n26, l25, l26);
                            ((ArrayList)object2).add(spliceInsertCommand$b);
                        }
                        object5 = object2;
                    }
                    if (n19 != 0) {
                        l17 = xm2.w();
                        long l27 = l17 & l3;
                        long l28 = l27 - l4;
                        Object object8 = l28 == 0L ? 0 : (l28 < 0L ? -1 : 1);
                        if (object8 != false) {
                            boolean bl6 = true;
                        } else {
                            boolean bl7 = false;
                            object2 = null;
                        }
                        l17 = (l17 & l7) << n10;
                        l27 = xm2.y();
                        l17 = (l17 | l27) * 1000L;
                        l27 = 90;
                        l2 = l17 / l27;
                    } else {
                        boolean bl8 = false;
                        object2 = null;
                    }
                    n10 = xm2.C();
                    int n27 = xm2.w();
                    int n28 = xm2.w();
                    bl2 = var57_56;
                    n16 = n10;
                    object6 = object5;
                    n14 = n28;
                    n15 = n27;
                    n19 = n4;
                    l12 = l2;
                    l14 = l16;
                    n17 = n7;
                    n18 = n20;
                }
                l8 = ((On3)object3).b(l14);
                object3 = object5 = new SpliceInsertCommand(l15, bl3, n19 != 0, n18 != 0, n17 != 0, l14, l8, (List)object6, bl2, l12, n16, n15, n14);
                break block23;
            }
            while (object4 < n8) {
                int n29;
                int n30;
                int n32;
                long l29;
                int n34;
                int n35;
                ArrayList arrayList2;
                boolean bl9;
                long l30;
                long l31;
                double d9;
                long l34;
                void var77_80;
                int n36;
                long l35 = xm2.y();
                n7 = xm2.w() & 0x80;
                boolean bl10 = n7 != 0;
                arrayList = new ArrayList();
                if (!bl10) {
                    long l36;
                    n36 = xm2.w();
                    int n37 = n36 & 0x80;
                    n37 = n37 != 0 ? 1 : 0;
                    n4 = n36 & 0x40;
                    n4 = n4 != 0 ? 1 : 0;
                    n36 = (n36 &= n10) != 0 ? 1 : 0;
                    long l37 = n4 != 0 ? xm2.y() : l2;
                    if (n4 == 0) {
                        n7 = xm2.w();
                        ArrayList<SpliceScheduleCommand$b> arrayList3 = new ArrayList<SpliceScheduleCommand$b>(n7);
                        for (int i8 = 0; i8 < n7; ++i8) {
                            n10 = xm2.w();
                            var77_80 = object4;
                            long l38 = xm2.y();
                            SpliceScheduleCommand$b spliceScheduleCommand$b = new SpliceScheduleCommand$b(n10, l38);
                            arrayList3.add(spliceScheduleCommand$b);
                            n10 = 32;
                            n3 = 1;
                            l7 = 1L;
                            d2 = Double.MIN_VALUE;
                        }
                        var77_80 = object4;
                        arrayList = arrayList3;
                    } else {
                        var77_80 = object4;
                    }
                    if (n36 != 0) {
                        n10 = xm2.w();
                        l36 = n10;
                        l34 = l36 & l3;
                        long l39 = l34 - l4;
                        object4 = l39 == 0L ? 0 : (l39 < 0L ? -1 : 1);
                        if (object4 != false) {
                            object4 = 1;
                        } else {
                            object4 = 0;
                            object5 = null;
                        }
                        l34 = 1L;
                        d9 = Double.MIN_VALUE;
                        l36 &= l34;
                        n36 = 32;
                        l36 <<= n36;
                        l7 = xm2.y();
                        l36 |= l7;
                        l7 = 1000L;
                        d2 = 4.94E-321;
                        l36 *= l7;
                        l31 = 90;
                        l36 /= l31;
                    } else {
                        n36 = 32;
                        l34 = 1L;
                        d9 = Double.MIN_VALUE;
                        l7 = 1000L;
                        d2 = 4.94E-321;
                        l31 = 90;
                        l36 = l2;
                        object4 = 0;
                        object5 = null;
                    }
                    int n38 = xm2.C();
                    int n39 = xm2.w();
                    int n41 = xm2.w();
                    l30 = l36;
                    bl9 = object4;
                    arrayList2 = arrayList;
                    n35 = n37;
                    n34 = n4;
                    l29 = l37;
                    n32 = n38;
                    n30 = n39;
                    n29 = n41;
                } else {
                    var77_80 = object4;
                    l34 = l7;
                    d9 = d2;
                    n36 = 32;
                    l7 = 1000L;
                    d2 = 4.94E-321;
                    l31 = 90;
                    arrayList2 = arrayList;
                    l29 = l2;
                    l30 = l2;
                    n35 = 0;
                    n34 = 0;
                    bl9 = false;
                    n32 = 0;
                    n30 = 0;
                    n29 = 0;
                }
                object = new SpliceScheduleCommand$c(l35, bl10, n35 != 0, n34 != 0, arrayList2, l29, bl9, l30, n32, n30, n29);
                ((ArrayList)object2).add(object);
                object4 = var77_80 + true;
                l7 = l34;
                d2 = d9;
                n10 = 32;
                n3 = 1;
            }
            object3 = new SpliceScheduleCommand((ArrayList)object2);
        }
        if (object3 == null) {
            boolean bl11 = false;
            object2 = new Metadata$Entry[]{};
            return new Metadata((Metadata$Entry[])object2);
        }
        boolean bl12 = false;
        object2 = null;
        n3 = 1;
        Metadata$Entry[] metadata$EntryArray = new Metadata$Entry[n3];
        metadata$EntryArray[0] = object3;
        object = new Metadata(metadata$EntryArray);
        return object;
    }
}

