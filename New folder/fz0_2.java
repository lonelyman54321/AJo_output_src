/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from fZ0
 */
public final class fz0_2
implements Sequence {
    public final Function0 a;
    public final Function1 b;

    public fz0_2(Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(function0, "getInitialValue");
        Intrinsics.checkNotNullParameter(function1, "getNextValue");
        this.a = function0;
        this.b = function1;
    }

    public final Iterator iterator() {
        fz0$a_0 fz0$a_0 = new fz0$a_0(this);
        return fz0$a_0;
    }
}

