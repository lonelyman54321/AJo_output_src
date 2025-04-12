/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource$AsByteSource;
import com.google.common.io.CharSource$CharSequenceCharSource;
import com.google.common.io.CharSource$ConcatenatedCharSource;
import com.google.common.io.CharSource$EmptyCharSource;
import com.google.common.io.CharSource$StringCharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Closer;
import com.google.common.io.LineProcessor;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class CharSource {
    public static CharSource concat(Iterable iterable) {
        CharSource$ConcatenatedCharSource charSource$ConcatenatedCharSource = new CharSource$ConcatenatedCharSource(iterable);
        return charSource$ConcatenatedCharSource;
    }

    public static CharSource concat(Iterator iterator) {
        return CharSource.concat(ImmutableList.copyOf(iterator));
    }

    public static CharSource concat(CharSource ... charSourceArray) {
        return CharSource.concat(ImmutableList.copyOf(charSourceArray));
    }

    private long countBySkipping(Reader reader) {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8 = l7 = 0L;
        while ((l4 = (l3 = (l2 = reader.skip(Long.MAX_VALUE)) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            l8 += l2;
        }
        return l8;
    }

    public static CharSource empty() {
        return CharSource$EmptyCharSource.access$000();
    }

    public static CharSource wrap(CharSequence charSequence) {
        CharSource$CharSequenceCharSource charSource$CharSequenceCharSource;
        boolean bl2 = charSequence instanceof String;
        if (bl2) {
            charSequence = (String)charSequence;
            charSource$CharSequenceCharSource = new CharSource$StringCharSource((String)charSequence);
        } else {
            charSource$CharSequenceCharSource = new CharSource$CharSequenceCharSource(charSequence);
        }
        return charSource$CharSequenceCharSource;
    }

    public ByteSource asByteSource(Charset charset) {
        CharSource$AsByteSource charSource$AsByteSource = new CharSource$AsByteSource(this, charset);
        return charSource$AsByteSource;
    }

    public long copyTo(CharSink object) {
        Reader reader;
        Preconditions.checkNotNull(object);
        Closer closer = Closer.create();
        try {
            reader = this.openStream();
        }
        catch (Throwable throwable) {
            RuntimeException runtimeException;
            try {
                runtimeException = closer.rethrow(throwable);
            }
            catch (Throwable throwable2) {
                closer.close();
                throw throwable2;
            }
            throw runtimeException;
        }
        Closeable closeable = closer.register(reader);
        Reader reader2 = (Reader)closeable;
        object = ((CharSink)object).openStream();
        object = closer.register((Closeable)object);
        object = (Writer)object;
        long l2 = CharStreams.copy(reader2, (Appendable)object);
        closer.close();
        return l2;
    }

    public long copyTo(Appendable appendable) {
        Reader reader;
        Preconditions.checkNotNull(appendable);
        Closer closer = Closer.create();
        try {
            reader = this.openStream();
        }
        catch (Throwable throwable) {
            RuntimeException runtimeException;
            try {
                runtimeException = closer.rethrow(throwable);
            }
            catch (Throwable throwable2) {
                closer.close();
                throw throwable2;
            }
            throw runtimeException;
        }
        Closeable closeable = closer.register(reader);
        Reader reader2 = (Reader)closeable;
        long l2 = CharStreams.copy(reader2, appendable);
        closer.close();
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isEmpty() {
        Object object = this.lengthIfKnown();
        int n3 = ((Optional)object).isPresent();
        boolean bl2 = false;
        if (n3 != 0) {
            long l2;
            long l3 = (Long)(object = (Long)((Optional)object).get());
            long l4 = l3 - (l2 = 0L);
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) return bl2;
            return true;
        }
        object = Closer.create();
        try {
            Closeable closeable = this.openStream();
            closeable = ((Closer)object).register(closeable);
            n3 = ((Reader)closeable).read();
            int n4 = -1;
            if (n3 == n4) {
                bl2 = true;
            }
            ((Closer)object).close();
            return bl2;
        }
        catch (Throwable throwable) {
            try {
                RuntimeException runtimeException = ((Closer)object).rethrow(throwable);
                throw runtimeException;
            }
            catch (Throwable throwable2) {
                ((Closer)object).close();
                throw throwable2;
            }
        }
    }

    public long length() {
        Reader reader;
        Object object = this.lengthIfKnown();
        boolean bl2 = ((Optional)object).isPresent();
        if (bl2) {
            return (Long)((Optional)object).get();
        }
        object = Closer.create();
        try {
            reader = this.openStream();
        }
        catch (Throwable throwable) {
            RuntimeException runtimeException;
            try {
                runtimeException = ((Closer)object).rethrow(throwable);
            }
            catch (Throwable throwable2) {
                ((Closer)object).close();
                throw throwable2;
            }
            throw runtimeException;
        }
        Closeable closeable = ((Closer)object).register(reader);
        Reader reader2 = (Reader)closeable;
        long l2 = this.countBySkipping(reader2);
        ((Closer)object).close();
        return l2;
    }

    public Optional lengthIfKnown() {
        return Optional.absent();
    }

    public BufferedReader openBufferedStream() {
        Reader reader = this.openStream();
        boolean bl2 = reader instanceof BufferedReader;
        if (bl2) {
            reader = (BufferedReader)reader;
        } else {
            BufferedReader bufferedReader = new BufferedReader(reader);
            reader = bufferedReader;
        }
        return reader;
    }

    public abstract Reader openStream();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String read() {
        Closer closer = Closer.create();
        try {
            Object object = this.openStream();
            object = closer.register((Closeable)object);
            object = CharStreams.toString((Readable)object);
            closer.close();
            return object;
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
    public String readFirstLine() {
        Closer closer = Closer.create();
        try {
            Object object = this.openBufferedStream();
            object = closer.register((Closeable)object);
            object = ((BufferedReader)object).readLine();
            closer.close();
            return object;
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
    public ImmutableList readLines() {
        Closer closer = Closer.create();
        try {
            Object object = this.openBufferedStream();
            object = closer.register((Closeable)object);
            ArrayList arrayList = Lists.newArrayList();
            while (true) {
                String string2;
                if ((string2 = ((BufferedReader)object).readLine()) == null) {
                    object = ImmutableList.copyOf((Collection)arrayList);
                    closer.close();
                    return object;
                }
                arrayList.add(string2);
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

    public Object readLines(LineProcessor object) {
        Reader reader;
        Preconditions.checkNotNull(object);
        Closer closer = Closer.create();
        try {
            reader = this.openStream();
        }
        catch (Throwable throwable) {
            RuntimeException runtimeException;
            try {
                runtimeException = closer.rethrow(throwable);
            }
            catch (Throwable throwable2) {
                closer.close();
                throw throwable2;
            }
            throw runtimeException;
        }
        Closeable closeable = closer.register(reader);
        Reader reader2 = (Reader)closeable;
        object = CharStreams.readLines(reader2, (LineProcessor)object);
        closer.close();
        return object;
    }
}

