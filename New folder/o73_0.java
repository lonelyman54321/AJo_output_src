/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.util.Comparator;

/*
 * Renamed from o73
 */
public final class o73_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = ((Field)object).getName();
        object2 = ((Field)object2).getName();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

