/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzbc
implements Iterator {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzbb zzfl;

    public zzbc(zzbb zzbb2) {
        int n3;
        this.zzfl = zzbb2;
        this.limit = n3 = zzbb2.size();
    }

    private final byte nextByte() {
        zzbb zzbb2;
        try {
            zzbb2 = this.zzfl;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            String string2 = indexOutOfBoundsException.getMessage();
            NoSuchElementException noSuchElementException = new NoSuchElementException(string2);
            throw noSuchElementException;
        }
        int n3 = this.position;
        int n4 = n3 + 1;
        this.position = n4;
        return zzbb2.zzj(n3);
    }

    public final boolean hasNext() {
        int n3 = this.position;
        int n4 = this.limit;
        return n3 < n4;
    }

    public final /* synthetic */ Object next() {
        return this.nextByte();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

