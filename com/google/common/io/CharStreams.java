/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.AppendableWriter;
import com.google.common.io.CharStreams$NullWriter;
import com.google.common.io.Java8Compatibility;
import com.google.common.io.LineProcessor;
import com.google.common.io.LineReader;
import java.io.EOFException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    private CharStreams() {
    }

    public static Writer asWriter(Appendable appendable) {
        boolean bl2 = appendable instanceof Writer;
        if (bl2) {
            return (Writer)appendable;
        }
        AppendableWriter appendableWriter = new AppendableWriter(appendable);
        return appendableWriter;
    }

    public static long copy(Readable readable, Appendable appendable) {
        int n3;
        int n4;
        boolean bl2 = readable instanceof Reader;
        if (bl2) {
            bl2 = appendable instanceof StringBuilder;
            if (bl2) {
                readable = (Reader)readable;
                appendable = (StringBuilder)appendable;
                return CharStreams.copyReaderToBuilder((Reader)readable, (StringBuilder)appendable);
            }
            readable = (Reader)readable;
            appendable = CharStreams.asWriter(appendable);
            return CharStreams.copyReaderToWriter((Reader)readable, (Writer)appendable);
        }
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(appendable);
        CharBuffer charBuffer = CharStreams.createBuffer();
        long l2 = 0L;
        while ((n4 = readable.read(charBuffer)) != (n3 = -1)) {
            Java8Compatibility.flip(charBuffer);
            appendable.append(charBuffer);
            n4 = charBuffer.remaining();
            long l3 = n4;
            l2 += l3;
            Java8Compatibility.clear(charBuffer);
        }
        return l2;
    }

    public static long copyReaderToBuilder(Reader reader, StringBuilder stringBuilder) {
        int n3;
        int n4;
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(stringBuilder);
        int n7 = 2048;
        char[] cArray = new char[n7];
        long l2 = 0L;
        while ((n4 = reader.read(cArray)) != (n3 = -1)) {
            n3 = 0;
            stringBuilder.append(cArray, 0, n4);
            long l3 = n4;
            l2 += l3;
        }
        return l2;
    }

    public static long copyReaderToWriter(Reader reader, Writer writer) {
        int n3;
        int n4;
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(writer);
        int n7 = 2048;
        char[] cArray = new char[n7];
        long l2 = 0L;
        while ((n4 = reader.read(cArray)) != (n3 = -1)) {
            n3 = 0;
            writer.write(cArray, 0, n4);
            long l3 = n4;
            l2 += l3;
        }
        return l2;
    }

    public static CharBuffer createBuffer() {
        return CharBuffer.allocate(2048);
    }

    public static long exhaust(Readable readable) {
        long l2;
        int n3;
        long l3;
        long l4;
        long l7;
        CharBuffer charBuffer = CharStreams.createBuffer();
        long l8 = 0L;
        while ((l7 = (l4 = (l3 = (long)(n3 = readable.read(charBuffer))) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            l8 += l3;
            Java8Compatibility.clear(charBuffer);
        }
        return l8;
    }

    public static Writer nullWriter() {
        return CharStreams$NullWriter.access$000();
    }

    public static Object readLines(Readable object, LineProcessor lineProcessor) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(lineProcessor);
        LineReader lineReader = new LineReader((Readable)object);
        while ((object = lineReader.readLine()) != null && (bl2 = lineProcessor.processLine((String)object))) {
        }
        return lineProcessor.getResult();
    }

    public static List readLines(Readable object) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        LineReader lineReader = new LineReader((Readable)object);
        while ((object = lineReader.readLine()) != null) {
            arrayList.add(object);
        }
        return arrayList;
    }

    public static void skipFully(Reader object, long l2) {
        long l3;
        long l4;
        long l7;
        Preconditions.checkNotNull(object);
        while ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            long l8 = ((Reader)object).skip(l2);
            long l12 = l8 - l3;
            Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 != false) {
                l2 -= l8;
                continue;
            }
            object = new EOFException();
            throw object;
        }
    }

    public static String toString(Readable readable) {
        return CharStreams.toStringBuilder(readable).toString();
    }

    private static StringBuilder toStringBuilder(Readable readable) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = readable instanceof Reader;
        if (bl2) {
            readable = (Reader)readable;
            CharStreams.copyReaderToBuilder((Reader)readable, stringBuilder);
        } else {
            CharStreams.copy(readable, stringBuilder);
        }
        return stringBuilder;
    }
}

