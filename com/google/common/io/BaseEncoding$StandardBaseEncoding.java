/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.common.io.BaseEncoding$Alphabet;
import com.google.common.io.BaseEncoding$DecodingException;
import com.google.common.io.BaseEncoding$SeparatedBaseEncoding;
import com.google.common.io.BaseEncoding$StandardBaseEncoding$1;
import com.google.common.io.BaseEncoding$StandardBaseEncoding$2;
import com.google.common.math.IntMath;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Objects;

class BaseEncoding$StandardBaseEncoding
extends BaseEncoding {
    final BaseEncoding$Alphabet alphabet;
    private volatile BaseEncoding ignoreCase;
    private volatile BaseEncoding lowerCase;
    final Character paddingChar;
    private volatile BaseEncoding upperCase;

    public BaseEncoding$StandardBaseEncoding(BaseEncoding$Alphabet baseEncoding$Alphabet, Character c2) {
        char c3;
        boolean bl2;
        BaseEncoding$Alphabet baseEncoding$Alphabet2;
        this.alphabet = baseEncoding$Alphabet2 = (BaseEncoding$Alphabet)Preconditions.checkNotNull(baseEncoding$Alphabet);
        if (c2 != null && (bl2 = baseEncoding$Alphabet.matches(c3 = c2.charValue()))) {
            bl2 = false;
            baseEncoding$Alphabet = null;
        } else {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "Padding character %s was already in alphabet", (Object)c2);
        this.paddingChar = c2;
    }

    public BaseEncoding$StandardBaseEncoding(String string2, String object, Character c2) {
        object = ((String)object).toCharArray();
        BaseEncoding$Alphabet baseEncoding$Alphabet = new BaseEncoding$Alphabet(string2, (char[])object);
        this(baseEncoding$Alphabet, c2);
    }

    public boolean canDecode(CharSequence charSequence) {
        int n3;
        Preconditions.checkNotNull(charSequence);
        charSequence = this.trimTrailingPadding(charSequence);
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        int n4 = charSequence.length();
        int n7 = baseEncoding$Alphabet.isValidPaddingStartPosition(n4);
        n4 = 0;
        if (n7 == 0) {
            return false;
        }
        baseEncoding$Alphabet = null;
        for (n7 = 0; n7 < (n3 = charSequence.length()); ++n7) {
            BaseEncoding$Alphabet baseEncoding$Alphabet2 = this.alphabet;
            char c2 = charSequence.charAt(n7);
            n3 = (int)(baseEncoding$Alphabet2.canDecode(c2) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public int decodeTo(byte[] object, CharSequence charSequence) {
        Preconditions.checkNotNull(object);
        charSequence = this.trimTrailingPadding(charSequence);
        Object object2 = this.alphabet;
        int n3 = charSequence.length();
        boolean bl2 = ((BaseEncoding$Alphabet)object2).isValidPaddingStartPosition(n3);
        if (bl2) {
            int n4;
            bl2 = false;
            object2 = null;
            int n7 = 0;
            for (n3 = 0; n3 < (n4 = charSequence.length()); n3 += n4) {
                int n8;
                int n10;
                BaseEncoding$Alphabet baseEncoding$Alphabet;
                long l2 = 0L;
                int n14 = 0;
                int n15 = 0;
                while (true) {
                    baseEncoding$Alphabet = this.alphabet;
                    n10 = baseEncoding$Alphabet.charsPerChunk;
                    if (n14 >= n10) break;
                    n8 = baseEncoding$Alphabet.bitsPerChar;
                    l2 <<= n8;
                    n8 = n3 + n14;
                    n10 = charSequence.length();
                    if (n8 < n10) {
                        baseEncoding$Alphabet = this.alphabet;
                        n10 = n15 + 1;
                        n15 += n3;
                        n15 = charSequence.charAt(n15);
                        long l3 = baseEncoding$Alphabet.decode((char)n15);
                        l2 |= l3;
                        n15 = n10;
                    }
                    ++n14;
                }
                n14 = baseEncoding$Alphabet.bytesPerChunk;
                n10 = n14 * 8;
                n8 = baseEncoding$Alphabet.bitsPerChar;
                n10 -= (n15 *= n8);
                for (n14 = (n14 + -1) * 8; n14 >= n10; n14 += -8) {
                    n15 = n7 + 1;
                    long l4 = l2 >>> n14;
                    long l7 = 255L;
                    object[n7] = n8 = (int)((byte)(l4 &= l7));
                    n7 = n15;
                }
                BaseEncoding$Alphabet baseEncoding$Alphabet2 = this.alphabet;
                n4 = baseEncoding$Alphabet2.charsPerChunk;
            }
            return n7;
        }
        object = new BaseEncoding$DecodingException;
        object2 = new StringBuilder("Invalid input length ");
        int n16 = charSequence.length();
        ((StringBuilder)object2).append(n16);
        charSequence = ((StringBuilder)object2).toString();
        object((String)charSequence);
        throw object;
    }

    public InputStream decodingStream(Reader reader) {
        Preconditions.checkNotNull(reader);
        BaseEncoding$StandardBaseEncoding$2 baseEncoding$StandardBaseEncoding$2 = new BaseEncoding$StandardBaseEncoding$2(this, reader);
        return baseEncoding$StandardBaseEncoding$2;
    }

    public void encodeChunkTo(Appendable appendable, byte[] object, int n3, int n4) {
        long l2;
        int n7;
        Preconditions.checkNotNull(appendable);
        int n8 = n3 + n4;
        int n10 = ((byte[])object).length;
        Preconditions.checkPositionIndexes(n3, n8, n10);
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        n8 = baseEncoding$Alphabet.bytesPerChunk;
        n10 = 0;
        if (n4 <= n8) {
            n8 = 1;
        } else {
            n8 = 0;
            baseEncoding$Alphabet = null;
        }
        Preconditions.checkArgument(n8 != 0);
        long l3 = 0L;
        n8 = 0;
        baseEncoding$Alphabet = null;
        while (true) {
            int n14 = 8;
            if (n8 >= n4) break;
            n7 = n3 + n8;
            n7 = object[n7] & 0xFF;
            l2 = n7;
            l3 = (l3 | l2) << n14;
            ++n8;
        }
        int n15 = (n4 + 1) * 8;
        BaseEncoding$Alphabet baseEncoding$Alphabet2 = this.alphabet;
        n3 = baseEncoding$Alphabet2.bitsPerChar;
        n15 -= n3;
        while (n10 < (n3 = n4 * 8)) {
            n3 = n15 - n10;
            l2 = l3 >>> n3;
            n3 = (int)l2;
            baseEncoding$Alphabet = this.alphabet;
            n7 = baseEncoding$Alphabet.mask;
            n3 &= n7;
            n3 = baseEncoding$Alphabet.encode(n3);
            appendable.append((char)n3);
            baseEncoding$Alphabet2 = this.alphabet;
            n3 = baseEncoding$Alphabet2.bitsPerChar;
            n10 += n3;
        }
        object = this.paddingChar;
        if (object != null) {
            while (true) {
                object = this.alphabet;
                n15 = object.bytesPerChunk * 8;
                if (n10 >= n15) break;
                n15 = this.paddingChar.charValue();
                appendable.append((char)n15);
                object = this.alphabet;
                n15 = object.bitsPerChar;
                n10 += n15;
            }
        }
    }

    public void encodeTo(Appendable appendable, byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(appendable);
        int n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        for (n7 = 0; n7 < n4; n7 += n8) {
            n8 = n3 + n7;
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
            int n10 = baseEncoding$Alphabet.bytesPerChunk;
            int n14 = n4 - n7;
            n10 = Math.min(n10, n14);
            this.encodeChunkTo(appendable, byArray, n8, n10);
            BaseEncoding$Alphabet baseEncoding$Alphabet2 = this.alphabet;
            n8 = baseEncoding$Alphabet2.bytesPerChunk;
        }
    }

    public OutputStream encodingStream(Writer writer) {
        Preconditions.checkNotNull(writer);
        BaseEncoding$StandardBaseEncoding$1 baseEncoding$StandardBaseEncoding$1 = new BaseEncoding$StandardBaseEncoding$1(this, writer);
        return baseEncoding$StandardBaseEncoding$1;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof BaseEncoding$StandardBaseEncoding;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (BaseEncoding$StandardBaseEncoding)object;
            Object object2 = this.alphabet;
            BaseEncoding$Alphabet baseEncoding$Alphabet = ((BaseEncoding$StandardBaseEncoding)object).alphabet;
            bl2 = ((BaseEncoding$Alphabet)object2).equals(baseEncoding$Alphabet);
            if (bl2 && (bl4 = Objects.equals(object2 = this.paddingChar, object = ((BaseEncoding$StandardBaseEncoding)object).paddingChar))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public int hashCode() {
        int n3 = this.alphabet.hashCode();
        int n4 = Objects.hashCode(this.paddingChar);
        return n3 ^ n4;
    }

    public BaseEncoding ignoreCase() {
        Object object = this.ignoreCase;
        if (object == null) {
            Object object2;
            object = this.alphabet.ignoreCase();
            if (object == (object2 = this.alphabet)) {
                object = this;
            } else {
                object2 = this.paddingChar;
                object = this.newInstance((BaseEncoding$Alphabet)object, (Character)object2);
            }
            this.ignoreCase = object;
        }
        return object;
    }

    public BaseEncoding lowerCase() {
        Object object = this.lowerCase;
        if (object == null) {
            Object object2;
            object = this.alphabet.lowerCase();
            if (object == (object2 = this.alphabet)) {
                object = this;
            } else {
                object2 = this.paddingChar;
                object = this.newInstance((BaseEncoding$Alphabet)object, (Character)object2);
            }
            this.lowerCase = object;
        }
        return object;
    }

    public int maxDecodedSize(int n3) {
        long l2 = this.alphabet.bitsPerChar;
        long l3 = n3;
        return (int)((l2 * l3 + (long)7) / (long)8);
    }

    public int maxEncodedSize(int n3) {
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        int n4 = baseEncoding$Alphabet.charsPerChunk;
        int n7 = baseEncoding$Alphabet.bytesPerChunk;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return IntMath.divide(n3, n7, roundingMode) * n4;
    }

    public BaseEncoding newInstance(BaseEncoding$Alphabet baseEncoding$Alphabet, Character c2) {
        BaseEncoding$StandardBaseEncoding baseEncoding$StandardBaseEncoding = new BaseEncoding$StandardBaseEncoding(baseEncoding$Alphabet, c2);
        return baseEncoding$StandardBaseEncoding;
    }

    public BaseEncoding omitPadding() {
        Object object = this.paddingChar;
        if (object == null) {
            object = this;
        } else {
            object = this.alphabet;
            object = this.newInstance((BaseEncoding$Alphabet)object, null);
        }
        return object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        Object object = this.alphabet;
        stringBuilder.append(object);
        object = this.alphabet;
        int n3 = ((BaseEncoding$Alphabet)object).bitsPerChar;
        int n4 = 8 % n3;
        if (n4 != 0) {
            object = this.paddingChar;
            if (object == null) {
                object = ".omitPadding()";
                stringBuilder.append((String)object);
            } else {
                stringBuilder.append(".withPadChar('");
                object = this.paddingChar;
                stringBuilder.append(object);
                object = "')";
                stringBuilder.append((String)object);
            }
        }
        return stringBuilder.toString();
    }

    public CharSequence trimTrailingPadding(CharSequence charSequence) {
        char c2;
        int n3;
        Preconditions.checkNotNull(charSequence);
        Character c3 = this.paddingChar;
        if (c3 == null) {
            return charSequence;
        }
        char c5 = c3.charValue();
        for (n3 = charSequence.length() + -1; n3 >= 0 && (c2 = charSequence.charAt(n3)) == c5; n3 += -1) {
        }
        return charSequence.subSequence(0, ++n3);
    }

    public BaseEncoding upperCase() {
        Object object = this.upperCase;
        if (object == null) {
            Object object2;
            object = this.alphabet.upperCase();
            if (object == (object2 = this.alphabet)) {
                object = this;
            } else {
                object2 = this.paddingChar;
                object = this.newInstance((BaseEncoding$Alphabet)object, (Character)object2);
            }
            this.upperCase = object;
        }
        return object;
    }

    public BaseEncoding withPadChar(char c2) {
        Object object = this.alphabet;
        int n3 = ((BaseEncoding$Alphabet)object).bitsPerChar;
        int n4 = 8 % n3;
        if (n4 != 0 && ((object = this.paddingChar) == null || (n3 = (int)((Character)object).charValue()) != c2)) {
            object = this.alphabet;
            Character c3 = Character.valueOf(c2);
            return this.newInstance((BaseEncoding$Alphabet)object, c3);
        }
        return this;
    }

    public BaseEncoding withSeparator(String string2, int n3) {
        boolean bl2 = false;
        BaseEncoding$SeparatedBaseEncoding baseEncoding$SeparatedBaseEncoding = null;
        int n4 = 0;
        Object object = null;
        while (true) {
            int n7 = string2.length();
            int n8 = 1;
            if (n4 >= n7) break;
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
            char c2 = string2.charAt(n4);
            n7 = baseEncoding$Alphabet.matches(c2) ^ n8;
            String string3 = "Separator (%s) cannot contain alphabet characters";
            Preconditions.checkArgument(n7 != 0, string3, (Object)string2);
            ++n4;
        }
        object = this.paddingChar;
        if (object != null) {
            n4 = ((Character)object).charValue();
            if ((n4 = string2.indexOf(n4)) < 0) {
                bl2 = true;
            }
            object = "Separator (%s) cannot contain padding character";
            Preconditions.checkArgument(bl2, (String)object, (Object)string2);
        }
        baseEncoding$SeparatedBaseEncoding = new BaseEncoding$SeparatedBaseEncoding(this, string2, n3);
        return baseEncoding$SeparatedBaseEncoding;
    }
}

