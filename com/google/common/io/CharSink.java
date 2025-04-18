/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.CharStreams;
import com.google.common.io.Closer;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.Writer;

public abstract class CharSink {
    public Writer openBufferedStream() {
        Writer writer = this.openStream();
        boolean bl2 = writer instanceof BufferedWriter;
        if (bl2) {
            writer = (BufferedWriter)writer;
        } else {
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            writer = bufferedWriter;
        }
        return writer;
    }

    public abstract Writer openStream();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Closer closer = Closer.create();
        try {
            Closeable closeable = this.openStream();
            closeable = closer.register(closeable);
            ((Writer)closeable).append(charSequence);
            ((Writer)closeable).flush();
            closer.close();
            return;
        }
        catch (Throwable throwable) {
            try {
                RuntimeException runtimeException = closer.rethrow(throwable);
                throw runtimeException;
            }
            catch (Throwable throwable2) {
                closer.close();
                throw throwable2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long writeFrom(Readable readable) {
        Preconditions.checkNotNull(readable);
        Closer closer = Closer.create();
        try {
            Closeable closeable = this.openStream();
            closeable = closer.register(closeable);
            long l2 = CharStreams.copy(readable, (Appendable)((Object)closeable));
            ((Writer)closeable).flush();
            closer.close();
            return l2;
        }
        catch (Throwable throwable) {
            try {
                RuntimeException runtimeException = closer.rethrow(throwable);
                throw runtimeException;
            }
            catch (Throwable throwable2) {
                closer.close();
                throw throwable2;
            }
        }
    }

    public void writeLines(Iterable iterable) {
        String string2 = System.getProperty("line.separator");
        this.writeLines(iterable, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeLines(Iterable object, String string2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(string2);
        Closer closer = Closer.create();
        try {
            Closeable closeable = this.openBufferedStream();
            closeable = closer.register(closeable);
            object = object.iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    ((Writer)closeable).flush();
                    closer.close();
                    return;
                }
                Object object2 = object.next();
                object2 = (CharSequence)object2;
                object2 = ((Writer)closeable).append((CharSequence)object2);
                ((Writer)object2).append(string2);
            }
        }
        catch (Throwable throwable) {}
        try {
            RuntimeException runtimeException = closer.rethrow(throwable);
            throw runtimeException;
        }
        catch (Throwable throwable) {
            closer.close();
            throw throwable;
        }
    }
}

