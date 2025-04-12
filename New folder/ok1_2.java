/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from ok1
 */
public final class ok1_2
extends cl1_2 {
    public final Function1 e;

    public ok1_2(Function1 function1) {
        this.e = function1;
    }

    public final boolean i() {
        return false;
    }

    public final void j(Throwable throwable) {
        this.e.invoke(throwable);
    }
}

