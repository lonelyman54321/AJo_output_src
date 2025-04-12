/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.graph.Network;

/*
 * Renamed from h1
 */
public final class h1_0
implements Function {
    public final /* synthetic */ Network a;

    public /* synthetic */ h1_0(Network network) {
        this.a = network;
    }

    public final Object apply(Object object) {
        return this.a.incidentNodes(object);
    }
}

