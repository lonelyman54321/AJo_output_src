/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from Fu1
 */
public final class fu1_2
implements Sequence {
    public final BufferedReader a;

    public fu1_2(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "reader");
        this.a = bufferedReader;
    }

    public final Iterator iterator() {
        Fu1$a fu1$a = new Fu1$a(this);
        return fu1$a;
    }
}

