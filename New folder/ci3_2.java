/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from Ci3
 */
public final class ci3_2
implements Sequence {
    public final Sequence a;
    public final Function1 b;

    public ci3_2(Sequence sequence, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(function1, "predicate");
        this.a = sequence;
        this.b = function1;
    }

    public final Iterator iterator() {
        ci3$a_0 ci3$a_0 = new ci3$a_0(this);
        return ci3$a_0;
    }
}

