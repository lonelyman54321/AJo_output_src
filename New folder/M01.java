/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.graph.Graph;

public final class M01 {
    public static /* bridge */ /* synthetic */ Iterable a(Graph graph, Object object) {
        return graph.predecessors(object);
    }

    public static /* bridge */ /* synthetic */ Iterable b(Graph graph, Object object) {
        return graph.successors(object);
    }
}

