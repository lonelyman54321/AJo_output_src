/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from fr3
 */
public final class fr3_0
implements Sequence {
    public final Sequence a;
    public final Function1 b;

    public fr3_0(Sequence sequence, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(function1, "transformer");
        this.a = sequence;
        this.b = function1;
    }

    public final Iterator iterator() {
        fr3$a fr3$a = new fr3$a(this);
        return fr3$a;
    }
}

