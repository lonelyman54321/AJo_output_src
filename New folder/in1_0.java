/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultiset;
import java.util.Collection;

/*
 * Renamed from IN1
 */
public final class in1_0
implements Function {
    public final Object apply(Object object) {
        return ImmutableMultiset.copyOf((Collection)object);
    }
}

