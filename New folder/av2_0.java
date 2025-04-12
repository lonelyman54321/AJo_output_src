/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from av2
 */
public final class av2_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (Map.Entry)object;
        int n3 = ((Number)((Map.Entry)object2).getValue()).intValue();
        object = object.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "<get-value>(...)");
        int n4 = ((Number)object).intValue();
        return Intrinsics.compare(n3, n4);
    }
}

