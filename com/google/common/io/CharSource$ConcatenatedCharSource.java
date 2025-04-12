/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.io.CharSource;
import com.google.common.io.MultiReader;
import java.io.Reader;
import java.io.Serializable;
import java.util.Iterator;

final class CharSource$ConcatenatedCharSource
extends CharSource {
    private final Iterable sources;

    public CharSource$ConcatenatedCharSource(Iterable iterable) {
        this.sources = iterable = (Iterable)Preconditions.checkNotNull(iterable);
    }

    public boolean isEmpty() {
        boolean bl2;
        Iterator iterator = this.sources.iterator();
        while (bl2 = iterator.hasNext()) {
            CharSource charSource = (CharSource)iterator.next();
            bl2 = charSource.isEmpty();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public long length() {
        boolean bl2;
        Iterator iterator = this.sources.iterator();
        long l2 = 0L;
        while (bl2 = iterator.hasNext()) {
            CharSource charSource = (CharSource)iterator.next();
            long l3 = charSource.length();
            l2 += l3;
        }
        return l2;
    }

    public Optional lengthIfKnown() {
        boolean bl2;
        Iterator iterator = this.sources.iterator();
        long l2 = 0L;
        while (bl2 = iterator.hasNext()) {
            Serializable serializable = ((CharSource)iterator.next()).lengthIfKnown();
            boolean bl3 = ((Optional)serializable).isPresent();
            if (!bl3) {
                return Optional.absent();
            }
            serializable = (Long)((Optional)serializable).get();
            long l3 = (Long)serializable;
            l2 += l3;
        }
        return Optional.of(l2);
    }

    public Reader openStream() {
        Iterator iterator = this.sources.iterator();
        MultiReader multiReader = new MultiReader(iterator);
        return multiReader;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharSource.concat(");
        Iterable iterable = this.sources;
        stringBuilder.append(iterable);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

