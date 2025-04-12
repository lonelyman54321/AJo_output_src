/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.util.ArrayList;
import java.util.Collection;

public final class j4
extends kw_0 {
    public final iv_0 f;
    public final VV g;

    public j4(qp3 object, int[] nArray, iv_0 iv_02, long l2, long l3, ImmutableList immutableList) {
        super((qp3)object, nArray);
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 < 0) {
            object = "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs";
            Cx.f((String)object);
        }
        this.f = iv_02;
        ImmutableList.copyOf((Collection)immutableList);
    }

    public static void m(ArrayList arrayList, long[] lArray) {
        int n3;
        int n4;
        long l2 = 0L;
        int n7 = 0;
        ImmutableList$Builder immutableList$Builder = null;
        for (n4 = 0; n4 < (n3 = lArray.length); ++n4) {
            long l3 = lArray[n4];
            l2 += l3;
        }
        while (n7 < (n4 = arrayList.size())) {
            immutableList$Builder = (ImmutableList$Builder)arrayList.get(n7);
            if (immutableList$Builder != null) {
                long l4 = lArray[n7];
                j4$a j4$a = new j4$a(l2, l4);
                immutableList$Builder.add(j4$a);
            }
            ++n7;
        }
    }

    public final void e() {
    }

    public final void f(float f5) {
    }

    public final void i() {
    }
}

