/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public final class H11
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        String string2 = ":";
        int n3 = Integer.parseInt(((String)object).split(string2)[0]);
        int n4 = Integer.parseInt(((String)object2).split(string2)[0]);
        return n3 - n4;
    }
}

