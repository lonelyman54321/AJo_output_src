/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public final class Gt1
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (kJ)object;
        object2 = (kJ)object2;
        long l2 = ((kJ)object).f;
        long l3 = ((kJ)object2).f;
        long l4 = l2 - l3;
        long l7 = 0L;
        long l8 = l4 - l7;
        long l12 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        n3 = l12 == false ? ((kJ)object).a((kJ)object2) : ((n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1))) < 0 ? -1 : 1);
        return n3;
    }
}

