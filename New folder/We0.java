/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public final class We0 {
    public final ImmutableList a;
    public final long b;
    public final long c;
    public final long d;

    public We0(List list, long l2, long l3) {
        list = ImmutableList.copyOf((Collection)list);
        this.a = list;
        this.b = l2;
        this.c = l3;
        long l4 = -9223372036854775807L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 != false && (l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) != false) {
            l4 = l2 + l3;
        }
        this.d = l4;
    }
}

