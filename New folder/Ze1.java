/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.Network;

public final class Ze1
implements Function {
    public final /* synthetic */ Network a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Ze1(Network network, Object object) {
        this.a = network;
        this.b = object;
    }

    public final Object apply(Object object) {
        Network network = this.a;
        Object object2 = this.b;
        return ImmutableNetwork.c(network, object2, object);
    }
}

