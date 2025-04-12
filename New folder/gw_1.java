/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$Combiner;

/*
 * Renamed from GW
 */
public final class gw_1
implements Function {
    public final Object apply(Object object) {
        return ClosingFuture$Combiner.a((ClosingFuture)object);
    }
}

