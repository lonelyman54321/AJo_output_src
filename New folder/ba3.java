/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.ui.a$b;
import java.util.Comparator;

public final class ba3
implements Comparator {
    public final int compare(Object object, Object object2) {
        String string2;
        String string3;
        object = (a$b)object;
        object2 = (a$b)object2;
        int n3 = ((a$b)object2).a;
        int n4 = ((a$b)object).a;
        if ((n3 = Integer.compare(n3, n4)) == 0 && (n3 = (string3 = ((a$b)object2).c).compareTo(string2 = ((a$b)object).c)) == 0) {
            object2 = ((a$b)object2).d;
            object = ((a$b)object).d;
            n3 = ((String)object2).compareTo((String)object);
        }
        return n3;
    }
}

