/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.common.io.BaseEncoding$Alphabet;
import com.google.common.io.BaseEncoding$DecodingException;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;

final class BaseEncoding$Base16Encoding
extends BaseEncoding$StandardBaseEncoding {
    final char[] encoding;

    private BaseEncoding$Base16Encoding(BaseEncoding$Alphabet baseEncoding$Alphabet) {
        super(baseEncoding$Alphabet, null);
        char[] cArray = new char[512];
        this.encoding = cArray;
        cArray = BaseEncoding$Alphabet.access$000(baseEncoding$Alphabet);
        int n3 = cArray.length;
        int n4 = 16;
        int n7 = 0;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            cArray = null;
        }
        Preconditions.checkArgument(n3 != 0);
        while (n7 < (n3 = 256)) {
            cArray = this.encoding;
            n4 = n7 >>> 4;
            cArray[n7] = n4 = (int)baseEncoding$Alphabet.encode(n4);
            cArray = this.encoding;
            n4 = n7 | 0x100;
            int n8 = n7 & 0xF;
            cArray[n4] = n8 = (int)baseEncoding$Alphabet.encode(n8);
            ++n7;
        }
    }

    public BaseEncoding$Base16Encoding(String string2, String object) {
        object = ((String)object).toCharArray();
        BaseEncoding$Alphabet baseEncoding$Alphabet = new BaseEncoding$Alphabet(string2, (char[])object);
        this(baseEncoding$Alphabet);
    }

    public int decodeTo(byte[] object, CharSequence charSequence) {
        Preconditions.checkNotNull(object);
        int n3 = charSequence.length() % 2;
        int n4 = 1;
        if (n3 != n4) {
            int n7;
            Object var5_5 = null;
            n4 = 0;
            for (n3 = 0; n3 < (n7 = charSequence.length()); n3 += 2) {
                BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
                int n8 = charSequence.charAt(n3);
                n7 = baseEncoding$Alphabet.decode((char)n8) << 4;
                BaseEncoding$Alphabet baseEncoding$Alphabet2 = this.alphabet;
                char c2 = n3 + 1;
                c2 = charSequence.charAt(c2);
                n8 = baseEncoding$Alphabet2.decode(c2);
                n7 |= n8;
                n8 = n4 + 1;
                object[n4] = n7 = (int)((byte)n7);
                n4 = n8;
            }
            return n4;
        }
        object = new BaseEncoding$DecodingException;
        StringBuilder stringBuilder = new StringBuilder("Invalid input length ");
        int n10 = charSequence.length();
        stringBuilder.append(n10);
        charSequence = stringBuilder.toString();
        object((String)charSequence);
        throw object;
    }

    public void encodeTo(Appendable appendable, byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(appendable);
        int n7 = n3 + n4;
        int c2 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, c2);
        for (n7 = 0; n7 < n4; ++n7) {
            char c3 = n3 + n7;
            c3 = byArray[c3] & 0xFF;
            char c5 = this.encoding[c3];
            appendable.append(c5);
            char[] cArray = this.encoding;
            c3 |= 0x100;
            c3 = cArray[c3];
            appendable.append(c3);
        }
    }

    public BaseEncoding newInstance(BaseEncoding$Alphabet baseEncoding$Alphabet, Character object) {
        object = new BaseEncoding$Base16Encoding(baseEncoding$Alphabet);
        return object;
    }
}

