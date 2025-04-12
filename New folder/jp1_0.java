/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.Pair;

/*
 * Renamed from Jp1
 */
public final class jp1_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (Pair)object;
        object2 = (Pair)object2;
        int n3 = ((Number)((Pair)object).b).intValue();
        int n4 = ((Number)((Pair)object).a).intValue();
        n3 -= n4;
        n4 = ((Number)((Pair)object2).b).intValue();
        int n7 = ((Number)((Pair)object2).a).intValue();
        return n3 - (n4 -= n7);
    }
}

