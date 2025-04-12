/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IU$a
 */
public final class iu$a_0
implements Comparator {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int compare(Object object, Object object2) {
        int n3;
        int n4;
        object = (String)object;
        object2 = (String)object2;
        Intrinsics.checkNotNullParameter(object, "a");
        String string2 = "b";
        Intrinsics.checkNotNullParameter(object2, string2);
        int n7 = ((String)object).length();
        int n8 = ((String)object2).length();
        n7 = Math.min(n7, n8);
        n8 = 4;
        while (true) {
            char c2;
            n4 = 1;
            if (n8 >= n7) break;
            char c3 = ((String)object).charAt(n8);
            if (c3 != (c2 = ((String)object2).charAt(n8))) {
                int n10 = Intrinsics.compare(c3, c2);
                if (n10 >= 0) return n4;
                return -1;
            }
            ++n8;
        }
        int n14 = ((String)object).length();
        if (n14 == (n3 = ((String)object2).length())) return 0;
        if (n14 >= n3) return n4;
        return -1;
    }
}

