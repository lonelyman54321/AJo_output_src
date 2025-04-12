/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class pX1
implements Comparator {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ pX1(ox1_0 ox1_02) {
        this.a = ox1_02;
    }

    public final int compare(Object object, Object object2) {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        return ((Number)function2.invoke(object, object2)).intValue();
    }
}

