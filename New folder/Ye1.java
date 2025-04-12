/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.Network;

public final class Ye1
implements Function {
    public final /* synthetic */ Network a;

    public /* synthetic */ Ye1(Network network) {
        this.a = network;
    }

    public final Object apply(Object object) {
        return ImmutableNetwork.b(this.a, object);
    }
}

