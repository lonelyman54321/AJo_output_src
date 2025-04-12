/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Rq0$c
implements Closeable {
    public final String a;
    public final long b;
    public final List c;
    public final /* synthetic */ rq0_2 d;

    public Rq0$c(rq0_2 rq0_22, String string2, long l2, ArrayList arrayList, long[] lArray) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(arrayList, "sources");
        Intrinsics.checkNotNullParameter(lArray, "lengths");
        this.d = rq0_22;
        this.a = string2;
        this.b = l2;
        this.c = arrayList;
    }

    public final void close() {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            a93_0 a93_02 = (a93_0)iterator.next();
            ez3.c(a93_02);
        }
    }
}

