/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fg
 */
public final class fg_0
implements Comparator {
    public final /* synthetic */ Comparator a;

    public fg_0(eg_0 eg_02) {
        this.a = eg_02;
    }

    public final int compare(Object object, Object object2) {
        Comparator comparator = this.a;
        int n3 = comparator.compare(object, object2);
        if (n3 == 0) {
            int n4 = ((GY2)object).g;
            object = n4;
            int n7 = ((GY2)object2).g;
            object2 = n7;
            n3 = q00_0.a((Comparable)object, (Comparable)object2);
        }
        return n3;
    }
}

