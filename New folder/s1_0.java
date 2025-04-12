/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.graph.AbstractValueGraph;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.ValueGraph;

/*
 * Renamed from s1
 */
public final class s1_0
implements Function {
    public final /* synthetic */ ValueGraph a;

    public /* synthetic */ s1_0(ValueGraph valueGraph) {
        this.a = valueGraph;
    }

    public final Object apply(Object object) {
        ValueGraph valueGraph = this.a;
        object = (EndpointPair)object;
        return AbstractValueGraph.a(valueGraph, (EndpointPair)object);
    }
}

