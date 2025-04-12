/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.graph.Network;

/*
 * Renamed from LU1
 */
public final class lu1_2 {
    public static /* bridge */ /* synthetic */ Iterable a(Network network, Object object) {
        return network.predecessors(object);
    }

    public static /* bridge */ /* synthetic */ Iterable b(Network network, Object object) {
        return network.successors(object);
    }
}

