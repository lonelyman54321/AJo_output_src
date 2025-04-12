/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.PrimitiveSink;
import com.google.common.io.ByteProcessor;
import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource$AsCharSource;
import com.google.common.io.ByteSource$ByteArrayByteSource;
import com.google.common.io.ByteSource$ConcatenatedByteSource;
import com.google.common.io.ByteSource$EmptyByteSource;
import com.google.common.io.ByteSource$SlicedByteSource;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharSource;
import com.google.common.io.Closer;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class ByteSource {
    public static ByteSource concat(Iterable iterable) {
        ByteSource$ConcatenatedByteSource byteSource$ConcatenatedByteSource = new ByteSource$ConcatenatedByteSource(iterable);
        return byteSource$ConcatenatedByteSource;
    }

    public static ByteSource concat(Iterator iterator) {
        return ByteSource.concat(ImmutableList.copyOf(iterator));
    }

    public static ByteSource concat(ByteSource ... byteSourceArray) {
        return ByteSource.concat(ImmutableList.copyOf(byteSourceArray));
    }

    private long countBySkipping(InputStream inputStream) {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8 = l7 = 0L;
        while ((l4 = (l3 = (l2 = ByteStreams.skipUpTo(inputStream, Integer.MAX_VALUE)) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            l8 += l2;
        }
        return l8;
    }

    public static ByteSource empty() {
        return ByteSource$EmptyByteSource.INSTANCE;
    }

    public static ByteSource wrap(byte[] byArray) {
        ByteSource$ByteArrayByteSource byteSource$ByteArrayByteSource = new ByteSource$ByteArrayByteSource(byArray);
        return byteSource$ByteArrayByteSource;
    }

    public CharSource asCharSource(Charset charset) {
        ByteSource$AsCharSource byteSource$AsCharSource = new ByteSource$AsCharSource(this, charset);
        return byteSource$AsCharSource;
    }

    /*
     * Exception decompiling
     */
    public boolean contentEquals(ByteSource var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[DOLOOP]], but top level block is 11[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public long copyTo(ByteSink object) {
        InputStream inputStream;
        Preconditions.checkNotNull(object);
        Closer closer = Closer.create();
        try {
            inputStream = this.openStream();
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
        Closeable closeable = closer.register(inputStream);
        InputStream inputStream2 = (InputStream)closeable;
        object = ((ByteSink)object).openStream();
        object = closer.register((Closeable)object);
        object = (OutputStream)object;
        long l2 = ByteStreams.copy(inputStream2, (OutputStream)object);
        closer.close();
        return l2;
    }

    public long copyTo(OutputStream outputStream) {
        InputStream inputStream;
        Preconditions.checkNotNull(outputStream);
        Closer closer = Closer.create();
        try {
            inputStream = this.openStream();
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
        Closeable closeable = closer.register(inputStream);
        InputStream inputStream2 = (InputStream)closeable;
        long l2 = ByteStreams.copy(inputStream2, outputStream);
        closer.close();
        return l2;
    }

    public HashCode hash(HashFunction object) {
        object = object.newHasher();
        OutputStream outputStream = Funnels.asOutputStream((PrimitiveSink)object);
        this.copyTo(outputStream);
        return object.hash();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isEmpty() {
        Object object = this.sizeIfKnown();
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
            n3 = ((InputStream)closeable).read();
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

    public InputStream openBufferedStream() {
        InputStream inputStream = this.openStream();
        boolean bl2 = inputStream instanceof BufferedInputStream;
        if (bl2) {
            inputStream = (BufferedInputStream)inputStream;
        } else {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            inputStream = bufferedInputStream;
        }
        return inputStream;
    }

    public abstract InputStream openStream();

    public Object read(ByteProcessor object) {
        InputStream inputStream;
        Preconditions.checkNotNull(object);
        Closer closer = Closer.create();
        try {
            inputStream = this.openStream();
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
        Closeable closeable = closer.register(inputStream);
        InputStream inputStream2 = (InputStream)closeable;
        object = ByteStreams.readBytes(inputStream2, (ByteProcessor)object);
        closer.close();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] read() {
        Throwable throwable2;
        Closer closer;
        block6: {
            Object object;
            block5: {
                block4: {
                    closer = Closer.create();
                    try {
                        object = this.openStream();
                        object = closer.register((Closeable)object);
                        Object object2 = this.sizeIfKnown();
                        boolean bl2 = ((Optional)object2).isPresent();
                        if (!bl2) break block4;
                        object2 = ((Optional)object2).get();
                        object2 = (Long)object2;
                        long l2 = (Long)object2;
                        object = ByteStreams.toByteArray((InputStream)object, l2);
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object = ByteStreams.toByteArray((InputStream)object);
            }
            closer.close();
            return object;
        }
        try {
            RuntimeException runtimeException = closer.rethrow(throwable2);
            throw runtimeException;
        }
        catch (Throwable throwable3) {
            closer.close();
            throw throwable3;
        }
    }

    public long size() {
        Object object = this.sizeIfKnown();
        boolean bl2 = ((Optional)object).isPresent();
        if (bl2) {
            return (Long)((Optional)object).get();
        }
        object = Closer.create();
        try {
            InputStream inputStream = this.openStream();
            Closeable closeable = ((Closer)object).register(inputStream);
            InputStream inputStream2 = (InputStream)closeable;
            long l2 = this.countBySkipping(inputStream2);
            return l2;
        }
        catch (IOException iOException) {
            InputStream inputStream;
            ((Closer)object).close();
            object = Closer.create();
            try {
                inputStream = this.openStream();
            }
            catch (Throwable throwable) {
                RuntimeException runtimeException = ((Closer)object).rethrow(throwable);
                throw runtimeException;
            }
            Closeable closeable = ((Closer)object).register(inputStream);
            InputStream inputStream3 = (InputStream)closeable;
            long l3 = ByteStreams.exhaust(inputStream3);
            return l3;
        }
        finally {
            ((Closer)object).close();
        }
    }

    public Optional sizeIfKnown() {
        return Optional.absent();
    }

    public ByteSource slice(long l2, long l3) {
        ByteSource$SlicedByteSource byteSource$SlicedByteSource = new ByteSource$SlicedByteSource(this, l2, l3);
        return byteSource$SlicedByteSource;
    }
}

