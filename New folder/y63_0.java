/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.Flushable;
import okio.a;

/*
 * Renamed from y63
 */
public interface y63_0
extends Closeable,
Flushable {
    public void close();

    public void flush();

    public void s0(ce_2 var1, long var2);

    public a timeout();
}

