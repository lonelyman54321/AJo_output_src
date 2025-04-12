/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.ui.a$b;
import java.util.Comparator;

/*
 * Renamed from aa3
 */
public final class aa3_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        String string2;
        String string3;
        object = (a$b)object;
        object2 = (a$b)object2;
        int n3 = ((a$b)object2).b;
        int n4 = ((a$b)object).b;
        if ((n3 = Integer.compare(n3, n4)) == 0 && (n3 = (string3 = ((a$b)object).c).compareTo(string2 = ((a$b)object2).c)) == 0) {
            object = ((a$b)object).d;
            object2 = ((a$b)object2).d;
            n3 = ((String)object).compareTo((String)object2);
        }
        return n3;
    }
}

