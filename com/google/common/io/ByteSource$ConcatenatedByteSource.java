/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource;
import com.google.common.io.MultiInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

final class ByteSource$ConcatenatedByteSource
extends ByteSource {
    final Iterable sources;

    public ByteSource$ConcatenatedByteSource(Iterable iterable) {
        this.sources = iterable = (Iterable)Preconditions.checkNotNull(iterable);
    }

    public boolean isEmpty() {
        boolean bl2;
        Iterator iterator = this.sources.iterator();
        while (bl2 = iterator.hasNext()) {
            ByteSource byteSource = (ByteSource)iterator.next();
            bl2 = byteSource.isEmpty();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public InputStream openStream() {
        Iterator iterator = this.sources.iterator();
        MultiInputStream multiInputStream = new MultiInputStream(iterator);
        return multiInputStream;
    }

    public long size() {
        Object object;
        long l2;
        Iterator iterator = this.sources.iterator();
        long l3 = l2 = 0L;
        while ((object = iterator.hasNext()) != 0) {
            ByteSource byteSource = (ByteSource)iterator.next();
            long l4 = byteSource.size();
            long l7 = (l3 += l4) - l2;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object >= 0) continue;
            return Long.MAX_VALUE;
        }
        return l3;
    }

    public Optional sizeIfKnown() {
        Object object;
        long l2;
        Object object2 = this.sources;
        boolean bl2 = object2 instanceof Collection;
        if (!bl2) {
            return Optional.absent();
        }
        object2 = object2.iterator();
        long l3 = l2 = 0L;
        while ((object = object2.hasNext()) != 0) {
            Serializable serializable = ((ByteSource)object2.next()).sizeIfKnown();
            boolean bl3 = ((Optional)serializable).isPresent();
            if (!bl3) {
                return Optional.absent();
            }
            long l4 = (Long)(serializable = (Long)((Optional)serializable).get());
            long l7 = (l3 += l4) - l2;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object >= 0) continue;
            return Optional.of(Long.MAX_VALUE);
        }
        return Optional.of(l3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ByteSource.concat(");
        Iterable iterable = this.sources;
        stringBuilder.append(iterable);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

