/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 */
package androidx.graphics.path;

import android.graphics.Path;

public final class PathIteratorPreApi34Impl
extends mn2 {
    private final native long createInternalPathIterator(Path var1, int var2, float var3);

    private final native void destroyInternalPathIterator(long var1);

    private final native boolean internalPathIteratorHasNext(long var1);

    private final native int internalPathIteratorNext(long var1, float[] var3, int var4);

    private final native int internalPathIteratorPeek(long var1);

    private final native int internalPathIteratorRawSize(long var1);

    private final native int internalPathIteratorSize(long var1);

    public final void finalize() {
        this.destroyInternalPathIterator(0L);
    }
}

