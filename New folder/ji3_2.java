/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableTable$Builder;
import java.util.function.BinaryOperator;

/*
 * Renamed from ji3
 */
public final class ji3_2
implements BinaryOperator {
    public final Object apply(Object object, Object object2) {
        object = (ImmutableTable$Builder)object;
        object2 = (ImmutableTable$Builder)object2;
        return ((ImmutableTable$Builder)object).combine((ImmutableTable$Builder)object2);
    }
}

