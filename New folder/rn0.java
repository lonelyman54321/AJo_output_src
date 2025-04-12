/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;

public final class rn0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        object = (zn0$b)object.get(0);
        object2 = (zn0$b)object2.get(0);
        int n3 = ((zn0$b)object).f;
        int n4 = ((zn0$b)object2).f;
        return Integer.compare(n3, n4);
    }
}

