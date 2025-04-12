/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Map;

/*
 * Renamed from Px1$a
 */
public final class px1$a_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (String)((Map.Entry)object).getKey();
        object2 = (String)((Map.Entry)object2).getKey();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

