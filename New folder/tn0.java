/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class tn0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        object = (zn0$a)Collections.max(object);
        object2 = (zn0$a)Collections.max(object2);
        return ((zn0$a)object).c((zn0$a)object2);
    }
}

