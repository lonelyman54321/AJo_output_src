/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.d;
import java.util.Comparator;

/*
 * Renamed from Or1
 */
public final class or1_0
implements Comparator {
    public final /* synthetic */ d a;

    public or1_0(d d2) {
        this.a = d2;
    }

    public final int compare(Object object, Object object2) {
        object2 = ((gs1_0)object2).getKey();
        d d2 = this.a;
        object2 = d2.b(object2);
        object = ((gs1_0)object).getKey();
        object = d2.b(object);
        return q00_0.a((Comparable)object2, (Comparable)object);
    }
}

