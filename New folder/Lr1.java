/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.d;
import java.util.Comparator;

public final class Lr1
implements Comparator {
    public final /* synthetic */ d a;

    public Lr1(d d2) {
        this.a = d2;
    }

    public final int compare(Object object, Object object2) {
        object = ((gs1_0)object).getKey();
        d d2 = this.a;
        object = d2.b(object);
        object2 = ((gs1_0)object2).getKey();
        object2 = d2.b(object2);
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

