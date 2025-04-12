/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.common.io.BaseEncoding$Alphabet;
import com.google.common.io.BaseEncoding$DecodingException;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;

final class BaseEncoding$Base64Encoding
extends BaseEncoding$StandardBaseEncoding {
    private BaseEncoding$Base64Encoding(BaseEncoding$Alphabet object, Character c2) {
        super((BaseEncoding$Alphabet)object, c2);
        object = BaseEncoding$Alphabet.access$000((BaseEncoding$Alphabet)object);
        boolean bl2 = ((Object)object).length;
        boolean bl3 = 64 != 0;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
    }

    public BaseEncoding$Base64Encoding(String string2, String object, Character c2) {
        object = ((String)object).toCharArray();
        BaseEncoding$Alphabet baseEncoding$Alphabet = new BaseEncoding$Alphabet(string2, (char[])object);
        this(baseEncoding$Alphabet, c2);
    }

    /*
     * WARNING - void declaration
     */
    public int decodeTo(byte[] object, CharSequence charSequence) {
        Preconditions.checkNotNull(object);
        charSequence = this.trimTrailingPadding(charSequence);
        Object object2 = this.alphabet;
        int n3 = charSequence.length();
        boolean c2 = ((BaseEncoding$Alphabet)object2).isValidPaddingStartPosition(n3);
        if (c2) {
            int n4;
            void var5_7;
            boolean bl2 = false;
            object2 = null;
            n3 = 0;
            while (var5_7 < (n4 = charSequence.length())) {
                BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
                int n7 = var5_7 + true;
                int n8 = charSequence.charAt((int)var5_7);
                n4 = baseEncoding$Alphabet.decode((char)n8) << 18;
                BaseEncoding$Alphabet baseEncoding$Alphabet2 = this.alphabet;
                char c3 = var5_7 + 2;
                n7 = charSequence.charAt(n7);
                n7 = baseEncoding$Alphabet2.decode((char)n7) << 12;
                n4 |= n7;
                n7 = n3 + 1;
                n8 = (byte)(n4 >>> 16);
                object[n3] = n8;
                n8 = charSequence.length();
                if (c3 < n8) {
                    baseEncoding$Alphabet2 = this.alphabet;
                    void var12_14 = var5_7 + 3;
                    c3 = charSequence.charAt(c3);
                    n8 = baseEncoding$Alphabet2.decode(c3) << 6;
                    n4 |= n8;
                    n8 = n3 + 2;
                    c3 = (char)(n4 >>> 8 & 0xFF);
                    object[n7] = c3;
                    n7 = charSequence.length();
                    if (var12_14 < n7) {
                        BaseEncoding$Alphabet baseEncoding$Alphabet3 = this.alphabet;
                        var5_7 += 4;
                        c3 = charSequence.charAt((int)var12_14);
                        n7 = baseEncoding$Alphabet3.decode(c3);
                        n4 |= n7;
                        n3 += 3;
                        n4 = (byte)(n4 & 0xFF);
                        object[n8] = n4;
                        continue;
                    }
                    n3 = n8;
                    var5_7 = var12_14;
                    continue;
                }
                n3 = n7;
                var5_7 = c3;
            }
            return n3;
        }
        object2 = new StringBuilder("Invalid input length ");
        int n10 = charSequence.length();
        ((StringBuilder)object2).append(n10);
        charSequence = ((StringBuilder)object2).toString();
        object = new BaseEncoding$DecodingException((String)charSequence);
        throw object;
    }

    public void encodeTo(Appendable appendable, byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(appendable);
        int n7 = n3 + n4;
        char c2 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, c2);
        while (n4 >= (c2 = '\u0003')) {
            c2 = n3 + 1;
            char c3 = (byArray[n3] & 0xFF) << 16;
            int n8 = n3 + 2;
            c2 = (byArray[c2] & 0xFF) << 8 | c3;
            n3 += 3;
            c3 = byArray[n8] & 0xFF;
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
            n8 = (c2 |= c3) >>> 18;
            c3 = baseEncoding$Alphabet.encode(n8);
            appendable.append(c3);
            baseEncoding$Alphabet = this.alphabet;
            n8 = c2 >>> 12 & 0x3F;
            c3 = baseEncoding$Alphabet.encode(n8);
            appendable.append(c3);
            baseEncoding$Alphabet = this.alphabet;
            n8 = c2 >>> 6 & 0x3F;
            c3 = baseEncoding$Alphabet.encode(n8);
            appendable.append(c3);
            baseEncoding$Alphabet = this.alphabet;
            c2 &= 0x3F;
            c2 = baseEncoding$Alphabet.encode(c2);
            appendable.append(c2);
            n4 += -3;
        }
        if (n3 < n7) {
            this.encodeChunkTo(appendable, byArray, n3, n7 -= n3);
        }
    }

    public BaseEncoding newInstance(BaseEncoding$Alphabet baseEncoding$Alphabet, Character c2) {
        BaseEncoding$Base64Encoding baseEncoding$Base64Encoding = new BaseEncoding$Base64Encoding(baseEncoding$Alphabet, c2);
        return baseEncoding$Base64Encoding;
    }
}

