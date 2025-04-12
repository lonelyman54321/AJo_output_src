/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from No0
 */
public final class no0_2
implements Sequence {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final Function2 d;

    public no0_2(CharSequence charSequence, int n3, int n4, Function2 function2) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Intrinsics.checkNotNullParameter(function2, "getNextMatch");
        this.a = charSequence;
        this.b = n3;
        this.c = n4;
        this.d = function2;
    }

    public final Iterator iterator() {
        No0$a no0$a = new No0$a(this);
        return no0$a;
    }
}

