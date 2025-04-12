/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from JO0
 */
public final class jo0_1
implements Sequence {
    public final Sequence a;
    public final Function1 b;
    public final Function1 c;

    public jo0_1(yz2_0 yz2_02, f13 f132, Function1 function1) {
        Intrinsics.checkNotNullParameter(yz2_02, "sequence");
        Intrinsics.checkNotNullParameter(f132, "transformer");
        Intrinsics.checkNotNullParameter(function1, "iterator");
        this.a = yz2_02;
        this.b = f132;
        this.c = function1;
    }

    public final Iterator iterator() {
        JO0$a jO0$a = new JO0$a(this);
        return jO0$a;
    }
}

