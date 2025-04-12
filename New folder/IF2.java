/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class IF2
extends Lambda
implements Function0 {
    public final /* synthetic */ pr1_1 c;
    public final /* synthetic */ k80 d;

    public IF2(k80 k802, pr1_1 pr1_12) {
        this.c = pr1_12;
        this.d = k802;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object[] objectArray = ((ft2_0)object).b;
        object = ((ft2_0)object).a;
        int n3 = ((Object)object).length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                reference var5_5 = object[n4];
                reference var7_6 = var5_5 ^ (long)-1;
                int n7 = 7;
                var7_6 = var7_6 << n7 & var5_5;
                long l2 = -9187201950435737472L;
                reference cfr_temp_0 = (var7_6 &= l2) - l2;
                Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object2 != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l3 = 0xFFL & var5_5;
                        long l4 = 128L;
                        long l7 = l3 - l4;
                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object3 < 0) {
                            int n14 = (n4 << 3) + n7;
                            Object object4 = objectArray[n14];
                            k80 k802 = this.d;
                            k802.t(object4);
                        }
                        var5_5 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return Unit.a;
    }
}

