/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.common.math.IntMath;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;

final class BaseEncoding$SeparatedBaseEncoding
extends BaseEncoding {
    private final int afterEveryChars;
    private final BaseEncoding delegate;
    private final String separator;

    public BaseEncoding$SeparatedBaseEncoding(BaseEncoding object, String string2, int n3) {
        boolean bl2;
        object = (BaseEncoding)Preconditions.checkNotNull(object);
        this.delegate = object;
        this.separator = object = (String)Preconditions.checkNotNull(string2);
        this.afterEveryChars = n3;
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2, "Cannot add a separator after every %s chars", n3);
    }

    public boolean canDecode(CharSequence charSequence) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < (n3 = charSequence.length()); ++i3) {
            String string2 = this.separator;
            n3 = charSequence.charAt(i3);
            int n4 = string2.indexOf(n3);
            if (n4 >= 0) continue;
            stringBuilder.append((char)n3);
        }
        return this.delegate.canDecode(stringBuilder);
    }

    public int decodeTo(byte[] byArray, CharSequence charSequence) {
        char c2;
        int n3 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (n3 = 0; n3 < (c2 = charSequence.length()); ++n3) {
            String string2 = this.separator;
            c2 = charSequence.charAt(n3);
            int n4 = string2.indexOf(c2);
            if (n4 >= 0) continue;
            stringBuilder.append(c2);
        }
        return this.delegate.decodeTo(byArray, stringBuilder);
    }

    public InputStream decodingStream(Reader reader) {
        BaseEncoding baseEncoding = this.delegate;
        String string2 = this.separator;
        reader = BaseEncoding.ignoringReader(reader, string2);
        return baseEncoding.decodingStream(reader);
    }

    public void encodeTo(Appendable appendable, byte[] byArray, int n3, int n4) {
        BaseEncoding baseEncoding = this.delegate;
        String string2 = this.separator;
        int n7 = this.afterEveryChars;
        appendable = BaseEncoding.separatingAppendable(appendable, string2, n7);
        baseEncoding.encodeTo(appendable, byArray, n3, n4);
    }

    public OutputStream encodingStream(Writer writer) {
        BaseEncoding baseEncoding = this.delegate;
        String string2 = this.separator;
        int n3 = this.afterEveryChars;
        writer = BaseEncoding.separatingWriter(writer, string2, n3);
        return baseEncoding.encodingStream(writer);
    }

    public BaseEncoding ignoreCase() {
        BaseEncoding baseEncoding = this.delegate.ignoreCase();
        String string2 = this.separator;
        int n3 = this.afterEveryChars;
        return baseEncoding.withSeparator(string2, n3);
    }

    public BaseEncoding lowerCase() {
        BaseEncoding baseEncoding = this.delegate.lowerCase();
        String string2 = this.separator;
        int n3 = this.afterEveryChars;
        return baseEncoding.withSeparator(string2, n3);
    }

    public int maxDecodedSize(int n3) {
        return this.delegate.maxDecodedSize(n3);
    }

    public int maxEncodedSize(int n3) {
        n3 = this.delegate.maxEncodedSize(n3);
        int n4 = this.separator.length();
        int n7 = n3 + -1;
        n7 = Math.max(0, n7);
        int n8 = this.afterEveryChars;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        return IntMath.divide(n7, n8, roundingMode) * n4 + n3;
    }

    public BaseEncoding omitPadding() {
        BaseEncoding baseEncoding = this.delegate.omitPadding();
        String string2 = this.separator;
        int n3 = this.afterEveryChars;
        return baseEncoding.withSeparator(string2, n3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.delegate;
        stringBuilder.append(object);
        stringBuilder.append(".withSeparator(\"");
        object = this.separator;
        stringBuilder.append((String)object);
        stringBuilder.append("\", ");
        return g30.a(this.afterEveryChars, ")", stringBuilder);
    }

    public CharSequence trimTrailingPadding(CharSequence charSequence) {
        return this.delegate.trimTrailingPadding(charSequence);
    }

    public BaseEncoding upperCase() {
        BaseEncoding baseEncoding = this.delegate.upperCase();
        String string2 = this.separator;
        int n3 = this.afterEveryChars;
        return baseEncoding.withSeparator(string2, n3);
    }

    public BaseEncoding withPadChar(char c2) {
        BaseEncoding baseEncoding = this.delegate.withPadChar(c2);
        String string2 = this.separator;
        int n3 = this.afterEveryChars;
        return baseEncoding.withSeparator(string2, n3);
    }

    public BaseEncoding withSeparator(String object, int n3) {
        object = new UnsupportedOperationException("Already have a separator");
        throw object;
    }
}

