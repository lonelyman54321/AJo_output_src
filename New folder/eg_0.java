/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eg
 */
public final class eg_0
implements Comparator {
    public final /* synthetic */ Comparator a;

    public eg_0(Comparator comparator) {
        this.a = comparator;
    }

    public final int compare(Object object, Object object2) {
        Comparator comparator = this.a;
        int n3 = comparator.compare(object, object2);
        if (n3 == 0) {
            object = ((GY2)object).c;
            object2 = ((GY2)object2).c;
            comparator = xp1_0.M;
            n3 = ((Wp1)comparator).compare(object, object2);
        }
        return n3;
    }
}

