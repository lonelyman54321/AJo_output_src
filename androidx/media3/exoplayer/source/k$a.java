/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.k$a$a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k$a {
    public final int a;
    public final j$b b;
    public final CopyOnWriteArrayList c;

    public k$a(CopyOnWriteArrayList copyOnWriteArrayList, int n3, j$b j$b) {
        this.c = copyOnWriteArrayList;
        this.a = n3;
        this.b = j$b;
    }

    public final void a(n60_0 n60_02) {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            k$a$a k$a$a = (k$a$a)iterator.next();
            k k2 = k$a$a.b;
            rn1_0 rn1_02 = new rn1_0(n60_02, k2);
            k$a$a = k$a$a.a;
            gz3.L((Handler)k$a$a, rn1_02);
        }
    }
}

