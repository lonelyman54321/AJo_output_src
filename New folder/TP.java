/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class TP
implements Comparator {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ TP(SP sP) {
        this.a = sP;
    }

    public final int compare(Object object, Object object2) {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        return ((Number)function2.invoke(object, object2)).intValue();
    }
}

