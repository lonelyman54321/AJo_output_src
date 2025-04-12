/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Map;

/*
 * Renamed from dp
 */
public final class dp_2
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (Integer)((Map.Entry)object).getValue();
        object2 = (Integer)((Map.Entry)object2).getValue();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

