/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableSortedMap;
import java.util.Comparator;
import java.util.Map;

/*
 * Renamed from bf1
 */
public final class bf1_1
implements Comparator {
    public final /* synthetic */ Comparator a;

    public /* synthetic */ bf1_1(Comparator comparator) {
        this.a = comparator;
    }

    public final int compare(Object object, Object object2) {
        object = (Map.Entry)object;
        object2 = (Map.Entry)object2;
        return ImmutableSortedMap.a(this.a, (Map.Entry)object, (Map.Entry)object2);
    }
}

