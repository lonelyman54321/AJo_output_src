/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from UM0
 */
public final class um0_2
implements Sequence {
    public final Sequence a;
    public final boolean b;
    public final Function1 c;

    public um0_2(Sequence sequence, boolean bl2, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(function1, "predicate");
        this.a = sequence;
        this.b = bl2;
        this.c = function1;
    }

    public final Iterator iterator() {
        UM0$a uM0$a = new UM0$a(this);
        return uM0$a;
    }
}

