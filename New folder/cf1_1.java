/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.graph.ImmutableValueGraph;
import com.google.common.graph.ValueGraph;

/*
 * Renamed from cf1
 */
public final class cf1_1
implements Function {
    public final /* synthetic */ ValueGraph a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cf1_1(ValueGraph valueGraph, Object object) {
        this.a = valueGraph;
        this.b = object;
    }

    public final Object apply(Object object) {
        ValueGraph valueGraph = this.a;
        Object object2 = this.b;
        return ImmutableValueGraph.b(valueGraph, object2, object);
    }
}

