/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class y73$a {
    public static EnumSet a(long l2) {
        boolean bl2;
        EnumSet<y73_0> enumSet = EnumSet.noneOf(y73_0.class);
        Iterator iterator = y73_0.access$getALL$cp().iterator();
        while (bl2 = iterator.hasNext()) {
            long l3;
            y73_0 y73_02 = (y73_0)((Object)iterator.next());
            long l4 = y73_02.getValue() & l2;
            long l7 = l4 - (l3 = 0L);
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object == false) continue;
            enumSet.add(y73_02);
        }
        Intrinsics.checkNotNullExpressionValue(enumSet, "result");
        return enumSet;
    }
}

