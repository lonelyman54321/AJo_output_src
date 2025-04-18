/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding$1;
import com.google.common.io.BaseEncoding$2;
import com.google.common.io.BaseEncoding$3;
import com.google.common.io.BaseEncoding$4;
import com.google.common.io.BaseEncoding$5;
import com.google.common.io.BaseEncoding$Base16Encoding;
import com.google.common.io.BaseEncoding$Base64Encoding;
import com.google.common.io.BaseEncoding$DecodingException;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public abstract class BaseEncoding {
    private static final BaseEncoding BASE16;
    private static final BaseEncoding BASE32;
    private static final BaseEncoding BASE32_HEX;
    private static final BaseEncoding BASE64;
    private static final BaseEncoding BASE64_URL;

    static {
        Character c2 = Character.valueOf('=');
        BaseEncoding$StandardBaseEncoding baseEncoding$StandardBaseEncoding = new BaseEncoding$Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", c2);
        BASE64 = baseEncoding$StandardBaseEncoding;
        baseEncoding$StandardBaseEncoding = new BaseEncoding$Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", c2);
        BASE64_URL = baseEncoding$StandardBaseEncoding;
        baseEncoding$StandardBaseEncoding = new BaseEncoding$StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", c2);
        BASE32 = baseEncoding$StandardBaseEncoding;
        baseEncoding$StandardBaseEncoding = new BaseEncoding$StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", c2);
        BASE32_HEX = baseEncoding$StandardBaseEncoding;
        baseEncoding$StandardBaseEncoding = new BaseEncoding$Base16Encoding("base16()", "0123456789ABCDEF");
        BASE16 = baseEncoding$StandardBaseEncoding;
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    private static byte[] extract(byte[] byArray, int n3) {
        int n4 = byArray.length;
        if (n3 == n4) {
            return byArray;
        }
        byte[] byArray2 = new byte[n3];
        System.arraycopy(byArray, 0, byArray2, 0, n3);
        return byArray2;
    }

    public static Reader ignoringReader(Reader reader, String string2) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(string2);
        BaseEncoding$3 baseEncoding$3 = new BaseEncoding$3(reader, string2);
        return baseEncoding$3;
    }

    public static Appendable separatingAppendable(Appendable appendable, String string2, int n3) {
        BaseEncoding$4 baseEncoding$4;
        boolean bl2;
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(string2);
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            baseEncoding$4 = null;
        }
        Preconditions.checkArgument(bl2);
        baseEncoding$4 = new BaseEncoding$4(n3, appendable, string2);
        return baseEncoding$4;
    }

    public static Writer separatingWriter(Writer writer, String object, int n3) {
        object = BaseEncoding.separatingAppendable(writer, (String)object, n3);
        BaseEncoding$5 baseEncoding$5 = new BaseEncoding$5((Appendable)object, writer);
        return baseEncoding$5;
    }

    public abstract boolean canDecode(CharSequence var1);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return this.decodeChecked(charSequence);
        }
        catch (BaseEncoding$DecodingException baseEncoding$DecodingException) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(baseEncoding$DecodingException);
            throw illegalArgumentException;
        }
    }

    public final byte[] decodeChecked(CharSequence charSequence) {
        charSequence = this.trimTrailingPadding(charSequence);
        int n3 = charSequence.length();
        byte[] byArray = new byte[this.maxDecodedSize(n3)];
        int n4 = this.decodeTo(byArray, charSequence);
        return BaseEncoding.extract(byArray, n4);
    }

    public abstract int decodeTo(byte[] var1, CharSequence var2);

    public final ByteSource decodingSource(CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        BaseEncoding$2 baseEncoding$2 = new BaseEncoding$2(this, charSource);
        return baseEncoding$2;
    }

    public abstract InputStream decodingStream(Reader var1);

    public String encode(byte[] byArray) {
        int n3 = byArray.length;
        return this.encode(byArray, 0, n3);
    }

    public final String encode(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        n8 = this.maxEncodedSize(n4);
        StringBuilder stringBuilder = new StringBuilder(n8);
        try {
            this.encodeTo(stringBuilder, byArray, n3, n4);
            return stringBuilder.toString();
        }
        catch (IOException iOException) {
            AssertionError assertionError = new AssertionError((Object)iOException);
            throw assertionError;
        }
    }

    public abstract void encodeTo(Appendable var1, byte[] var2, int var3, int var4);

    public final ByteSink encodingSink(CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        BaseEncoding$1 baseEncoding$1 = new BaseEncoding$1(this, charSink);
        return baseEncoding$1;
    }

    public abstract OutputStream encodingStream(Writer var1);

    public abstract BaseEncoding ignoreCase();

    public abstract BaseEncoding lowerCase();

    public abstract int maxDecodedSize(int var1);

    public abstract int maxEncodedSize(int var1);

    public abstract BaseEncoding omitPadding();

    public CharSequence trimTrailingPadding(CharSequence charSequence) {
        return (CharSequence)Preconditions.checkNotNull(charSequence);
    }

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char var1);

    public abstract BaseEncoding withSeparator(String var1, int var2);
}

