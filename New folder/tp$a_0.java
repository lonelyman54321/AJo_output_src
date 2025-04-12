/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.sequences.Sequence;

/*
 * Renamed from Tp$a
 */
public final class tp$a_0
implements Sequence {
    public final /* synthetic */ Object[] a;

    public tp$a_0(Object[] objectArray) {
        this.a = objectArray;
    }

    public final Iterator iterator() {
        return ArrayIteratorKt.iterator(this.a);
    }
}

