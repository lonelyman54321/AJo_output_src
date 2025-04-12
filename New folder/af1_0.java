/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.Network;

/*
 * Renamed from af1
 */
public final class af1_0
implements Function {
    public final /* synthetic */ Network a;

    public /* synthetic */ af1_0(Network network) {
        this.a = network;
    }

    public final Object apply(Object object) {
        return ImmutableNetwork.a(this.a, object);
    }
}

