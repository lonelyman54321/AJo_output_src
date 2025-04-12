/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class LP1$a
implements LP1 {
    public static final /* synthetic */ LP1$a b;

    static {
        LP1$a lP1$a;
        b = lP1$a = new Object();
    }

    public final boolean all(Function1 function1) {
        return true;
    }

    public final boolean any(Function1 function1) {
        return false;
    }

    public final Object foldIn(Object object, Function2 function2) {
        return object;
    }

    public final LP1 then(LP1 lP1) {
        return lP1;
    }

    public final String toString() {
        return "Modifier";
    }
}

