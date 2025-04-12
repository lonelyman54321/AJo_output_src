/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.functions.Function2;

public final class Zf
implements Comparator {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ Zf(Function2 function2) {
        this.a = function2;
    }

    public final int compare(Object object, Object object2) {
        return ((Number)this.a.invoke(object, object2)).intValue();
    }
}

