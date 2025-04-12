/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding$DecodingException;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;

final class BaseEncoding$Alphabet {
    final int bitsPerChar;
    final int bytesPerChunk;
    private final char[] chars;
    final int charsPerChunk;
    private final byte[] decodabet;
    private final boolean ignoreCase;
    final int mask;
    private final String name;
    private final boolean[] validPadding;

    public BaseEncoding$Alphabet(String string2, char[] cArray) {
        byte[] byArray = BaseEncoding$Alphabet.decodabetFor(cArray);
        this(string2, cArray, byArray, false);
    }

    private BaseEncoding$Alphabet(String object, char[] object2, byte[] object3, boolean bl2) {
        int n3;
        object = (String)Preconditions.checkNotNull(object);
        this.name = object;
        object = (char[])Preconditions.checkNotNull(object2);
        this.chars = (char[])object;
        int n4 = ((char[])object2).length;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        n4 = IntMath.log2(n4, roundingMode);
        try {
            this.bitsPerChar = n4;
        }
        catch (ArithmeticException arithmeticException) {
            object3 = new IllegalArgumentException;
            StringBuilder stringBuilder = new StringBuilder("Illegal alphabet length ");
            int n7 = ((char[])object2).length;
            stringBuilder.append(n7);
            object2 = stringBuilder.toString();
            super((String)object2, arithmeticException);
            throw object3;
        }
        int n8 = Integer.numberOfTrailingZeros(n4);
        int n10 = 3 - n8;
        int n14 = 1;
        this.charsPerChunk = n10 = n14 << n10;
        this.bytesPerChunk = n4 >>= n8;
        this.mask = n4 = ((char[])object2).length - n14;
        this.decodabet = object3;
        object = new boolean[n10];
        object2 = null;
        for (int i3 = 0; i3 < (n3 = this.bytesPerChunk); ++i3) {
            n3 = i3 * 8;
            n8 = this.bitsPerChar;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            n3 = IntMath.divide(n3, n8, roundingMode2);
            object[n3] = n14;
        }
        this.validPadding = (boolean[])object;
        this.ignoreCase = bl2;
        return;
    }

    public static /* synthetic */ char[] access$000(BaseEncoding$Alphabet baseEncoding$Alphabet) {
        return baseEncoding$Alphabet.chars;
    }

    private static byte[] decodabetFor(char[] cArray) {
        int n3;
        int n4 = 128;
        byte[] byArray = new byte[n4];
        byte by2 = -1;
        Arrays.fill(byArray, by2);
        for (int i3 = 0; i3 < (n3 = cArray.length); ++i3) {
            String string2;
            byte by4;
            n3 = cArray[i3];
            byte by5 = 1;
            if (n3 < n4) {
                by4 = 1;
            } else {
                by4 = 0;
                string2 = null;
            }
            String string3 = "Non-ASCII character: %s";
            Preconditions.checkArgument(by4 != 0, string3, (char)n3);
            by4 = byArray[n3];
            if (by4 != by2) {
                by5 = 0;
            }
            string2 = "Duplicate character: %s";
            Preconditions.checkArgument(by5 != 0, string2, (char)n3);
            byArray[n3] = by5 = (byte)i3;
        }
        return byArray;
    }

    private boolean hasLowerCase() {
        char[] cArray = this.chars;
        int n3 = cArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2 = Ascii.isLowerCase(cArray[i3]);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    private boolean hasUpperCase() {
        char[] cArray = this.chars;
        int n3 = cArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2 = Ascii.isUpperCase(cArray[i3]);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public boolean canDecode(char n3) {
        byte[] byArray;
        int n4 = 127;
        n3 = n3 <= n4 && (n3 = (byArray = this.decodabet)[n3]) != (n4 = -1) ? 1 : 0;
        return n3 != 0;
    }

    public int decode(char c2) {
        Object object = "Unrecognized character: 0x";
        char c3 = '\u007f';
        if (c2 <= c3) {
            Object object2 = this.decodabet;
            char c5 = object2[c2];
            char c6 = '\uffffffff';
            if (c5 == c6) {
                c5 = ' ';
                if (c2 > c5 && c2 != c3) {
                    StringBuilder stringBuilder = new StringBuilder("Unrecognized character: ");
                    stringBuilder.append(c2);
                    String string2 = stringBuilder.toString();
                    object = new BaseEncoding$DecodingException(string2);
                    throw object;
                }
                object2 = new StringBuilder;
                object2((String)object);
                String string3 = Integer.toHexString(c2);
                object2.append(string3);
                string3 = object2.toString();
                BaseEncoding$DecodingException baseEncoding$DecodingException = new BaseEncoding$DecodingException(string3);
                throw baseEncoding$DecodingException;
            }
            return c5;
        }
        StringBuilder stringBuilder = new StringBuilder((String)object);
        String string4 = Integer.toHexString(c2);
        stringBuilder.append(string4);
        string4 = stringBuilder.toString();
        BaseEncoding$DecodingException baseEncoding$DecodingException = new BaseEncoding$DecodingException(string4);
        throw baseEncoding$DecodingException;
    }

    public char encode(int n3) {
        return this.chars[n3];
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof BaseEncoding$Alphabet;
        boolean bl3 = false;
        if (bl2) {
            char[] cArray;
            boolean bl4;
            object = (BaseEncoding$Alphabet)object;
            bl2 = this.ignoreCase;
            boolean bl5 = ((BaseEncoding$Alphabet)object).ignoreCase;
            if (bl2 == bl5 && (bl4 = Arrays.equals(cArray = this.chars, (char[])(object = (Object)((BaseEncoding$Alphabet)object).chars)))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public int hashCode() {
        char[] cArray = this.chars;
        int n3 = Arrays.hashCode(cArray);
        int n4 = this.ignoreCase;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public BaseEncoding$Alphabet ignoreCase() {
        Object object;
        boolean bl2;
        boolean bl3 = this.ignoreCase;
        if (bl3) {
            return this;
        }
        byte[] byArray = this.decodabet;
        int n3 = byArray.length;
        byArray = Arrays.copyOf(byArray, n3);
        n3 = 65;
        while (true) {
            int n4 = 90;
            bl2 = true;
            if (n3 > n4) break;
            n4 = n3 | 0x20;
            object = this.decodabet;
            char c2 = object[n3];
            char c3 = object[n4];
            char c5 = '\uffffffff';
            if (c2 == c5) {
                byArray[n3] = c3;
            } else {
                if (c3 != c5) {
                    bl2 = false;
                }
                c3 = (char)n3;
                c5 = (char)n4;
                String string2 = "Can't ignoreCase() since '%s' and '%s' encode different values";
                Preconditions.checkState(bl2, string2, c3, c5);
                byArray[n4] = c2;
            }
            ++n3;
        }
        CharSequence charSequence = new StringBuilder();
        object = this.name;
        charSequence = h30_0.a(charSequence, (String)object, ".ignoreCase()");
        object = this.chars;
        BaseEncoding$Alphabet baseEncoding$Alphabet = new BaseEncoding$Alphabet((String)charSequence, (char[])object, byArray, bl2);
        return baseEncoding$Alphabet;
    }

    public boolean isValidPaddingStartPosition(int n3) {
        boolean[] blArray = this.validPadding;
        int n4 = this.charsPerChunk;
        return blArray[n3 %= n4];
    }

    public BaseEncoding$Alphabet lowerCase() {
        Object object;
        int n3;
        int n4 = this.hasUpperCase();
        if (n4 == 0) {
            return this;
        }
        Preconditions.checkState(this.hasLowerCase() ^ true, "Cannot call lowerCase() on a mixed-case alphabet");
        n4 = this.chars.length;
        char[] cArray = new char[n4];
        BaseEncoding$Alphabet baseEncoding$Alphabet = null;
        for (int i3 = 0; i3 < (n3 = ((char[])(object = this.chars)).length); ++i3) {
            char c2;
            cArray[i3] = c2 = Ascii.toLowerCase(object[i3]);
        }
        object = new StringBuilder;
        object();
        String string2 = this.name;
        String string3 = ".lowerCase()";
        object = h30_0.a((StringBuilder)object, string2, string3);
        baseEncoding$Alphabet = new BaseEncoding$Alphabet((String)object, cArray);
        n4 = (int)(this.ignoreCase ? 1 : 0);
        if (n4 != 0) {
            baseEncoding$Alphabet = baseEncoding$Alphabet.ignoreCase();
        }
        return baseEncoding$Alphabet;
    }

    public boolean matches(char c2) {
        char c3;
        byte[] byArray = this.decodabet;
        int n3 = byArray.length;
        c2 = c2 < n3 && (c2 = byArray[c2]) != (c3 = '\uffffffff') ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public String toString() {
        return this.name;
    }

    public BaseEncoding$Alphabet upperCase() {
        Object object;
        int n3;
        int n4 = this.hasLowerCase();
        if (n4 == 0) {
            return this;
        }
        Preconditions.checkState(this.hasUpperCase() ^ true, "Cannot call upperCase() on a mixed-case alphabet");
        n4 = this.chars.length;
        char[] cArray = new char[n4];
        BaseEncoding$Alphabet baseEncoding$Alphabet = null;
        for (int i3 = 0; i3 < (n3 = ((char[])(object = this.chars)).length); ++i3) {
            char c2;
            cArray[i3] = c2 = Ascii.toUpperCase(object[i3]);
        }
        object = new StringBuilder;
        object();
        String string2 = this.name;
        String string3 = ".upperCase()";
        object = h30_0.a((StringBuilder)object, string2, string3);
        baseEncoding$Alphabet = new BaseEncoding$Alphabet((String)object, cArray);
        n4 = (int)(this.ignoreCase ? 1 : 0);
        if (n4 != 0) {
            baseEncoding$Alphabet = baseEncoding$Alphabet.ignoreCase();
        }
        return baseEncoding$Alphabet;
    }
}

