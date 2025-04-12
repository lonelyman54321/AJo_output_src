/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public final class OF3
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (JF3)object;
        object2 = (JF3)object2;
        long l2 = ((JF3)object).b;
        long l3 = ((JF3)object2).b;
        return Long.compare(l2, l3);
    }
}

