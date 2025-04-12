/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yX
 */
public class yx_2
extends xx_2 {
    public static int o(Iterable iterable, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(iterable, string2);
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            n3 = iterable.size();
        }
        return n3;
    }
}

