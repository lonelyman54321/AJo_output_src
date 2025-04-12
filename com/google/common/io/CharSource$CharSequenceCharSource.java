/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.io.CharSequenceReader;
import com.google.common.io.CharSource;
import com.google.common.io.CharSource$CharSequenceCharSource$1;
import com.google.common.io.LineProcessor;
import java.io.Reader;
import java.util.Iterator;

class CharSource$CharSequenceCharSource
extends CharSource {
    private static final Splitter LINE_SPLITTER = Splitter.onPattern("\r\n|\n|\r");
    protected final CharSequence seq;

    public CharSource$CharSequenceCharSource(CharSequence charSequence) {
        this.seq = charSequence = (CharSequence)Preconditions.checkNotNull(charSequence);
    }

    public static /* synthetic */ Splitter access$100() {
        return LINE_SPLITTER;
    }

    private Iterator linesIterator() {
        CharSource$CharSequenceCharSource$1 charSource$CharSequenceCharSource$1 = new CharSource$CharSequenceCharSource$1(this);
        return charSource$CharSequenceCharSource$1;
    }

    public boolean isEmpty() {
        CharSequence charSequence = this.seq;
        int n3 = charSequence.length();
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            charSequence = null;
        }
        return n3 != 0;
    }

    public long length() {
        return this.seq.length();
    }

    public Optional lengthIfKnown() {
        return Optional.of(this.seq.length());
    }

    public Reader openStream() {
        CharSequence charSequence = this.seq;
        CharSequenceReader charSequenceReader = new CharSequenceReader(charSequence);
        return charSequenceReader;
    }

    public String read() {
        return this.seq.toString();
    }

    public String readFirstLine() {
        Object object = this.linesIterator();
        boolean bl2 = object.hasNext();
        object = bl2 ? (String)object.next() : null;
        return object;
    }

    public ImmutableList readLines() {
        return ImmutableList.copyOf(this.linesIterator());
    }

    public Object readLines(LineProcessor lineProcessor) {
        String string2;
        boolean bl2;
        Iterator iterator = this.linesIterator();
        while ((bl2 = iterator.hasNext()) && (bl2 = lineProcessor.processLine(string2 = (String)iterator.next()))) {
        }
        return lineProcessor.getResult();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharSource.wrap(");
        String string2 = Ascii.truncate(this.seq, 30, "...");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

