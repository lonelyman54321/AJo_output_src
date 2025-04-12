/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rq2
 */
public final class rq2_0 {
    public final List a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final tr1_1 e;
    public final hh3_2 f;

    public rq2_0(int n3, ArrayList arrayList) {
        Object object;
        this.a = arrayList;
        this.b = n3;
        int n4 = 0;
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 != 0) {
            object = new ArrayList();
            this.d = object;
            object = new tr1_1();
            int n7 = arrayList.size();
            int n8 = 0;
            while (n4 < n7) {
                do1_0 do1_02 = (do1_0)this.a.get(n4);
                int n10 = do1_02.c;
                int n14 = do1_02.d;
                O11 o11 = new O11(n4, n8, n14);
                ((tr1_1)object).i(n10, o11);
                n8 += n14;
                ++n4;
            }
            this.e = object;
            object = new qq2_1(this);
            this.f = object = yr1_2.b((Function0)object);
            return;
        }
        sn2.b("Invalid start index");
        throw null;
    }

    public final boolean a(int n3, int n4) {
        Object object = this.e;
        O11 o11 = (O11)((Qi1)object).c(n3);
        if (o11 != null) {
            int n7 = o11.b;
            int n8 = o11.c;
            n8 = n4 - n8;
            o11.c = n4;
            if (n8 != 0) {
                Object[] objectArray = ((Qi1)object).c;
                object = ((Qi1)object).a;
                int n10 = ((Object)object).length + -2;
                if (n10 >= 0) {
                    int n14 = 0;
                    while (true) {
                        reference var10_10 = object[n14];
                        reference var12_11 = var10_10 ^ (long)-1;
                        int n15 = 7;
                        var12_11 = var12_11 << n15 & var10_10;
                        long l2 = -9187201950435737472L;
                        reference cfr_temp_0 = (var12_11 &= l2) - l2;
                        Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (object2 != false) {
                            int n16 = ~(n14 - n10) >>> 31;
                            int n17 = 8;
                            n16 = 8 - n16;
                            for (n15 = 0; n15 < n16; ++n15) {
                                long l3 = 0xFFL & var10_10;
                                long l4 = 128L;
                                long l7 = l3 - l4;
                                Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                if (object3 < 0) {
                                    int n18 = (n14 << 3) + n15;
                                    O11 o112 = (O11)objectArray[n18];
                                    object2 = o112.b;
                                    if (object2 >= n7 && (object2 = (Object)Intrinsics.areEqual(o112, o11)) == false && (object2 = (Object)(o112.b + n8)) >= 0) {
                                        o112.b = (int)object2;
                                    }
                                }
                                var10_10 >>= n17;
                            }
                            if (n16 != n17) break;
                        }
                        if (n14 == n10) break;
                        ++n14;
                    }
                }
            }
            return true;
        }
        return false;
    }
}

