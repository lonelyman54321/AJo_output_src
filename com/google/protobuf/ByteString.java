/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Android;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString$1;
import com.google.protobuf.ByteString$2;
import com.google.protobuf.ByteString$ArraysByteArrayCopier;
import com.google.protobuf.ByteString$BoundedByteString;
import com.google.protobuf.ByteString$ByteArrayCopier;
import com.google.protobuf.ByteString$ByteIterator;
import com.google.protobuf.ByteString$CodedBuilder;
import com.google.protobuf.ByteString$LiteralByteString;
import com.google.protobuf.ByteString$Output;
import com.google.protobuf.ByteString$SystemByteArrayCopier;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.NioByteString;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.TextFormatEscaper;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class ByteString
implements Iterable,
Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY;
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final ByteString$ByteArrayCopier byteArrayCopier;
    private static final long serialVersionUID = 1L;
    private int hash = 0;

    static {
        byte[] byArray = Internal.EMPTY_BYTE_ARRAY;
        Object object = new ByteString$LiteralByteString(byArray);
        EMPTY = object;
        boolean bl2 = Android.isOnAndroidDevice();
        byArray = null;
        object = bl2 ? new ByteString$SystemByteArrayCopier(null) : new ByteString$ArraysByteArrayCopier(null);
        byteArrayCopier = object;
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = object = new ByteString$2();
    }

    public static /* synthetic */ int access$200(byte by2) {
        return ByteString.toInt(by2);
    }

    private static ByteString balancedConcat(Iterator object, int n3) {
        int n4 = 1;
        if (n3 >= n4) {
            if (n3 == n4) {
                object = (ByteString)object.next();
            } else {
                n4 = n3 >>> 1;
                ByteString byteString = ByteString.balancedConcat((Iterator)object, n4);
                object = ByteString.balancedConcat((Iterator)object, n3 -= n4);
                object = byteString.concat((ByteString)object);
            }
            return object;
        }
        String string2 = Gj0.b(n3, "length (", ") must be >= 1");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static void checkIndex(int n3, int n4) {
        int n7 = n3 + 1;
        if ((n7 = n4 - n7 | n3) < 0) {
            if (n3 < 0) {
                String string2 = hj0_0.a(n3, "Index < 0: ");
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string2);
                throw arrayIndexOutOfBoundsException;
            }
            String string3 = D70.b(n3, n4, "Index > length: ", ", ");
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string3);
            throw arrayIndexOutOfBoundsException;
        }
    }

    public static int checkRange(int n3, int n4, int n7) {
        int n8 = n4 - n3;
        int n10 = n3 | n4 | n8;
        int n14 = n7 - n4;
        if ((n10 |= n14) < 0) {
            if (n3 >= 0) {
                if (n4 < n3) {
                    String string2 = D70.b(n3, n4, "Beginning index larger than ending index: ", ", ");
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
                    throw indexOutOfBoundsException;
                }
                String string3 = D70.b(n4, n7, "End index: ", " >= ");
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
                throw indexOutOfBoundsException;
            }
            String string4 = Gj0.b(n3, "Beginning index: ", " < 0");
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string4);
            throw indexOutOfBoundsException;
        }
        return n8;
    }

    public static ByteString copyFrom(Iterable iterable) {
        int n3;
        boolean bl2 = iterable instanceof Collection;
        if (!bl2) {
            boolean bl3;
            Iterator iterator = iterable.iterator();
            n3 = 0;
            while (bl3 = iterator.hasNext()) {
                iterator.next();
                ++n3;
            }
        } else {
            Iterable iterable2 = iterable;
            iterable2 = (Collection)iterable;
            n3 = iterable2.size();
        }
        if (n3 == 0) {
            return EMPTY;
        }
        return ByteString.balancedConcat(iterable.iterator(), n3);
    }

    public static ByteString copyFrom(String object, String string2) {
        object = ((String)object).getBytes(string2);
        ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString((byte[])object);
        return byteString$LiteralByteString;
    }

    public static ByteString copyFrom(String object, Charset charset) {
        object = ((String)object).getBytes(charset);
        ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString((byte[])object);
        return byteString$LiteralByteString;
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        return ByteString.copyFrom(byteBuffer, n3);
    }

    public static ByteString copyFrom(ByteBuffer object, int n3) {
        int n4 = ((Buffer)object).remaining();
        ByteString.checkRange(0, n3, n4);
        byte[] byArray = new byte[n3];
        ((ByteBuffer)object).get(byArray);
        object = new ByteString$LiteralByteString(byArray);
        return object;
    }

    public static ByteString copyFrom(byte[] byArray) {
        int n3 = byArray.length;
        return ByteString.copyFrom(byArray, 0, n3);
    }

    public static ByteString copyFrom(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        ByteString.checkRange(n3, n7, n8);
        byArray = byteArrayCopier.copyFrom(byArray, n3, n4);
        ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString(byArray);
        return byteString$LiteralByteString;
    }

    public static ByteString copyFromUtf8(String object) {
        Charset charset = Internal.UTF_8;
        object = ((String)object).getBytes(charset);
        ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString((byte[])object);
        return byteString$LiteralByteString;
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String string2, int n3) {
        int n4;
        int n7 = ByteString.hexDigit(string2.charAt(n3));
        if (n7 != (n4 = -1)) {
            return n7;
        }
        StringBuilder stringBuilder = Gn.a("Invalid hexString ", string2, " must only contain [0-9a-fA-F] but contained ");
        char c2 = string2.charAt(n3);
        stringBuilder.append(c2);
        stringBuilder.append(" at index ");
        stringBuilder.append(n3);
        string2 = stringBuilder.toString();
        NumberFormatException numberFormatException = new NumberFormatException(string2);
        throw numberFormatException;
    }

    public static ByteString fromHex(String object) {
        int n3 = ((String)object).length() % 2;
        if (n3 == 0) {
            n3 = ((String)object).length() / 2;
            byte[] byArray = new byte[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = i3 * 2;
                int n7 = ByteString.extractHexDigit((String)object, n4);
                ++n4;
                n4 = ByteString.extractHexDigit((String)object, n4);
                byArray[i3] = n4 = (int)((byte)(n4 | (n7 <<= 4)));
            }
            object = new ByteString$LiteralByteString(byArray);
            return object;
        }
        StringBuilder stringBuilder = Gn.a("Invalid hexString ", (String)object, " of length ");
        int n8 = ((String)object).length();
        stringBuilder.append(n8);
        stringBuilder.append(" must be even.");
        object = stringBuilder.toString();
        NumberFormatException numberFormatException = new NumberFormatException((String)object);
        throw numberFormatException;
    }

    private static int hexDigit(char n3) {
        int n4;
        int n7 = 48;
        if (n3 >= n7 && n3 <= (n4 = 57)) {
            return n3 - n7;
        }
        n7 = 65;
        if (n3 >= n7 && n3 <= (n7 = 70)) {
            return n3 + -55;
        }
        n7 = 97;
        if (n3 >= n7 && n3 <= (n7 = 102)) {
            return n3 + -87;
        }
        return -1;
    }

    public static ByteString$CodedBuilder newCodedBuilder(int n3) {
        ByteString$CodedBuilder byteString$CodedBuilder = new ByteString$CodedBuilder(n3, null);
        return byteString$CodedBuilder;
    }

    public static ByteString$Output newOutput() {
        ByteString$Output byteString$Output = new ByteString$Output(128);
        return byteString$Output;
    }

    public static ByteString$Output newOutput(int n3) {
        ByteString$Output byteString$Output = new ByteString$Output(n3);
        return byteString$Output;
    }

    private static ByteString readChunk(InputStream inputStream, int n3) {
        int n4;
        int n7;
        byte[] byArray = new byte[n3];
        for (n4 = 0; n4 < n3; n4 += n7) {
            int n8;
            n7 = n3 - n4;
            if ((n7 = inputStream.read(byArray, n4, n7)) == (n8 = -1)) break;
        }
        if (n4 == 0) {
            return null;
        }
        return ByteString.copyFrom(byArray, 0, n4);
    }

    public static ByteString readFrom(InputStream inputStream) {
        return ByteString.readFrom(inputStream, 256, 8192);
    }

    public static ByteString readFrom(InputStream inputStream, int n3) {
        return ByteString.readFrom(inputStream, n3, n3);
    }

    public static ByteString readFrom(InputStream inputStream, int n3, int n4) {
        ArrayList<ByteString> arrayList = new ArrayList<ByteString>();
        ByteString byteString;
        while ((byteString = ByteString.readChunk(inputStream, n3)) != null) {
            arrayList.add(byteString);
            n3 = Math.min(n3 * 2, n4);
        }
        return ByteString.copyFrom(arrayList);
    }

    private static int toInt(byte by2) {
        return by2 & 0xFF;
    }

    private String truncateAndEscapeForDisplay() {
        CharSequence charSequence;
        int n3;
        int n4 = this.size();
        if (n4 <= (n3 = 50)) {
            charSequence = TextFormatEscaper.escapeBytes(this);
        } else {
            charSequence = new StringBuilder();
            n3 = 0;
            int n7 = 47;
            String string2 = TextFormatEscaper.escapeBytes(this.substring(0, n7));
            String string3 = "...";
            charSequence = h30_0.a(charSequence, string2, string3);
        }
        return charSequence;
    }

    public static Comparator unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.hasArray();
        if (n3 != 0) {
            n3 = byteBuffer.arrayOffset();
            byte[] byArray = byteBuffer.array();
            int n4 = byteBuffer.position() + n3;
            int n7 = byteBuffer.remaining();
            return ByteString.wrap(byArray, n4, n7);
        }
        NioByteString nioByteString = new NioByteString(byteBuffer);
        return nioByteString;
    }

    public static ByteString wrap(byte[] byArray) {
        ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString(byArray);
        return byteString$LiteralByteString;
    }

    public static ByteString wrap(byte[] byArray, int n3, int n4) {
        ByteString$BoundedByteString byteString$BoundedByteString = new ByteString$BoundedByteString(byArray, n3, n4);
        return byteString$BoundedByteString;
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List asReadOnlyByteBufferList();

    public abstract byte byteAt(int var1);

    public final ByteString concat(ByteString object) {
        int n3 = this.size();
        int n4 = (-1 >>> 1) - n3;
        if (n4 >= (n3 = ((ByteString)object).size())) {
            return RopeByteString.concatenate(this, (ByteString)object);
        }
        StringBuilder stringBuilder = new StringBuilder("ByteString would be too long: ");
        int n7 = this.size();
        stringBuilder.append(n7);
        stringBuilder.append("+");
        int n8 = ((ByteString)object).size();
        stringBuilder.append(n8);
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public abstract void copyTo(ByteBuffer var1);

    public void copyTo(byte[] byArray, int n3) {
        int n4 = this.size();
        this.copyTo(byArray, 0, n3, n4);
    }

    public final void copyTo(byte[] byArray, int n3, int n4, int n7) {
        int n8 = n3 + n7;
        int n10 = this.size();
        ByteString.checkRange(n3, n8, n10);
        n8 = n4 + n7;
        n10 = byArray.length;
        ByteString.checkRange(n4, n8, n10);
        if (n7 > 0) {
            this.copyToInternal(byArray, n3, n4, n7);
        }
    }

    public abstract void copyToInternal(byte[] var1, int var2, int var3, int var4);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean endsWith(ByteString byteString) {
        int n3;
        int n4 = this.size();
        if (n4 < (n3 = byteString.size())) return false;
        n4 = this.size();
        n3 = byteString.size();
        ByteString byteString2 = this.substring(n4 -= n3);
        boolean bl2 = byteString2.equals(byteString);
        if (!bl2) return false;
        return true;
    }

    public abstract boolean equals(Object var1);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int n3 = this.hash;
        if (n3 == 0) {
            n3 = this.size();
            if ((n3 = this.partialHash(n3, 0, n3)) == 0) {
                n3 = 1;
            }
            this.hash = n3;
        }
        return n3;
    }

    public abstract byte internalByteAt(int var1);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        int n3 = this.size();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public abstract boolean isValidUtf8();

    public ByteString$ByteIterator iterator() {
        ByteString$1 byteString$1 = new ByteString$1(this);
        return byteString$1;
    }

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int var1, int var2, int var3);

    public abstract int partialIsValidUtf8(int var1, int var2, int var3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        ByteString byteString2;
        boolean bl2;
        int n3 = this.size();
        int n4 = byteString.size();
        boolean bl3 = false;
        if (n3 >= n4 && (bl2 = (byteString2 = this.substring(0, n3 = byteString.size())).equals(byteString))) {
            bl3 = true;
        }
        return bl3;
    }

    public final ByteString substring(int n3) {
        int n4 = this.size();
        return this.substring(n3, n4);
    }

    public abstract ByteString substring(int var1, int var2);

    public final byte[] toByteArray() {
        int n3 = this.size();
        if (n3 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] byArray = new byte[n3];
        this.copyToInternal(byArray, 0, 0, n3);
        return byArray;
    }

    public final String toString() {
        Object object = Locale.ROOT;
        object = Integer.toHexString(System.identityHashCode(this));
        int n3 = this.size();
        String string2 = this.truncateAndEscapeForDisplay();
        return h30_0.a(oe3_0.a(n3, "<ByteString@", (String)object, " size=", " contents=\""), string2, "\">");
    }

    public final String toString(String string2) {
        Charset charset;
        try {
            charset = Charset.forName(string2);
        }
        catch (UnsupportedCharsetException unsupportedCharsetException) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(string2);
            unsupportedEncodingException.initCause(unsupportedCharsetException);
            throw unsupportedEncodingException;
        }
        return this.toString(charset);
    }

    public final String toString(Charset object) {
        int n3 = this.size();
        object = n3 == 0 ? "" : this.toStringInternal((Charset)object);
        return object;
    }

    public abstract String toStringInternal(Charset var1);

    public final String toStringUtf8() {
        Charset charset = Internal.UTF_8;
        return this.toString(charset);
    }

    public abstract void writeTo(ByteOutput var1);

    public abstract void writeTo(OutputStream var1);

    public final void writeTo(OutputStream outputStream, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = this.size();
        ByteString.checkRange(n3, n7, n8);
        if (n4 > 0) {
            this.writeToInternal(outputStream, n3, n4);
        }
    }

    public abstract void writeToInternal(OutputStream var1, int var2, int var3);

    public abstract void writeToReverse(ByteOutput var1);
}

