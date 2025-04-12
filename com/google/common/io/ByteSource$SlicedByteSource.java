/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource;
import com.google.common.io.ByteStreams;
import com.google.common.io.Closer;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;

final class ByteSource$SlicedByteSource
extends ByteSource {
    final long length;
    final long offset;
    final /* synthetic */ ByteSource this$0;

    public ByteSource$SlicedByteSource(ByteSource byteSource, long l2, long l3) {
        this.this$0 = byteSource;
        boolean bl2 = false;
        byteSource = null;
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        l7 = l7 >= 0 ? (long)1 : (long)0;
        String string2 = "offset (%s) may not be negative";
        Preconditions.checkArgument((boolean)l7, string2, l2);
        l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "length (%s) may not be negative", l3);
        this.offset = l2;
        this.length = l3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private InputStream sliceStream(InputStream object) {
        long l2;
        block5: {
            l2 = this.offset;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 > 0) {
                try {
                    l2 = ByteStreams.skipUpTo((InputStream)object, l2);
                    l3 = this.offset;
                    long l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l7 >= 0) break block5;
                }
                catch (Throwable throwable) {
                    Closer closer = Closer.create();
                    closer.register((Closeable)object);
                    try {
                        object = closer.rethrow(throwable);
                        throw object;
                    }
                    catch (Throwable throwable2) {
                        closer.close();
                        throw throwable2;
                    }
                }
                ((InputStream)object).close();
                byte[] byArray = new byte[]{};
                return new ByteArrayInputStream(byArray);
            }
        }
        l2 = this.length;
        return ByteStreams.limit((InputStream)object, l2);
    }

    public boolean isEmpty() {
        boolean bl2;
        long l2 = this.length;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        bl2 = object == false || (bl2 = super.isEmpty());
        return bl2;
    }

    public InputStream openBufferedStream() {
        InputStream inputStream = this.this$0.openBufferedStream();
        return this.sliceStream(inputStream);
    }

    public InputStream openStream() {
        InputStream inputStream = this.this$0.openStream();
        return this.sliceStream(inputStream);
    }

    public Optional sizeIfKnown() {
        Optional optional = this.this$0.sizeIfKnown();
        boolean bl2 = optional.isPresent();
        if (bl2) {
            long l2 = (Long)optional.get();
            long l3 = Math.min(this.offset, l2);
            long l4 = this.length;
            return Optional.of(Math.min(l4, l2 -= l3));
        }
        return Optional.absent();
    }

    public ByteSource slice(long l2, long l3) {
        ByteSource byteSource;
        boolean bl2 = false;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        object = object >= 0 ? (Object)1 : (Object)0;
        String string2 = "offset (%s) may not be negative";
        Preconditions.checkArgument((boolean)object, string2, l2);
        object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object >= 0) {
            bl2 = true;
        }
        String string3 = "length (%s) may not be negative";
        Preconditions.checkArgument(bl2, string3, l3);
        long l8 = this.length - l2;
        object = l8 == l4 ? 0 : (l8 < l4 ? -1 : 1);
        if (object <= 0) {
            byteSource = ByteSource.empty();
        } else {
            ByteSource byteSource2 = this.this$0;
            long l12 = this.offset + l2;
            l2 = Math.min(l3, l8);
            byteSource = byteSource2.slice(l12, l2);
        }
        return byteSource;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.this$0.toString();
        stringBuilder.append(string2);
        stringBuilder.append(".slice(");
        long l2 = this.offset;
        stringBuilder.append(l2);
        stringBuilder.append(", ");
        l2 = this.length;
        return jl0_0.b(stringBuilder, l2, ")");
    }
}

