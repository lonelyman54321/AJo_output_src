/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

/*
 * Renamed from DX
 */
public class dx_2
extends cx_2 {
    public static final int A(int n3, List list) {
        int n4;
        int n7 = list.size();
        Object object = new c(0, n7, n4 = 1);
        boolean bl2 = ((IntRange)object).e(n3);
        if (bl2) {
            return list.size() - n3;
        }
        CharSequence charSequence = wk0_0.a(n3, "Position index ", " must be in range [");
        int n8 = list.size();
        IntRange intRange = new c(0, n8, n4);
        charSequence.append(intRange);
        charSequence.append("].");
        charSequence = charSequence.toString();
        object = new IndexOutOfBoundsException((String)charSequence);
        throw object;
    }

    public static final int z(int n3, List list) {
        int n4;
        int n7 = xx_2.h(list);
        Object object = new c(0, n7, n4 = 1);
        boolean bl2 = ((IntRange)object).e(n3);
        if (bl2) {
            return xx_2.h(list) - n3;
        }
        CharSequence charSequence = wk0_0.a(n3, "Element index ", " must be in range [");
        int n8 = xx_2.h(list);
        IntRange intRange = new c(0, n8, n4);
        charSequence.append(intRange);
        charSequence.append("].");
        charSequence = charSequence.toString();
        object = new IndexOutOfBoundsException((String)charSequence);
        throw object;
    }
}

