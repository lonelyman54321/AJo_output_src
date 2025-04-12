/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.graph.ValueGraph;

/*
 * Renamed from oA3
 */
public final class oa3_0 {
    public static /* bridge */ /* synthetic */ Iterable a(ValueGraph valueGraph, Object object) {
        return valueGraph.predecessors(object);
    }

    public static /* bridge */ /* synthetic */ Iterable b(ValueGraph valueGraph, Object object) {
        return valueGraph.successors(object);
    }
}

