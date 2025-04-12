/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding$Alphabet;
import com.google.common.io.BaseEncoding$DecodingException;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import java.io.InputStream;
import java.io.Reader;

class BaseEncoding$StandardBaseEncoding$2
extends InputStream {
    int bitBuffer = 0;
    int bitBufferLength = 0;
    boolean hitPadding = false;
    int readChars = 0;
    final /* synthetic */ BaseEncoding$StandardBaseEncoding this$0;
    final /* synthetic */ Reader val$reader;

    public BaseEncoding$StandardBaseEncoding$2(BaseEncoding$StandardBaseEncoding baseEncoding$StandardBaseEncoding, Reader reader) {
        this.this$0 = baseEncoding$StandardBaseEncoding;
        this.val$reader = reader;
    }

    public void close() {
        this.val$reader.close();
    }

    public int read() {
        Object object;
        Object object2;
        Object object3;
        int n3;
        block6: {
            int n4;
            int n7;
            while (true) {
                block7: {
                    block8: {
                        block9: {
                            if ((n3 = ((Reader)(object3 = this.val$reader)).read()) == (n7 = -1)) {
                                n3 = (int)(this.hitPadding ? 1 : 0);
                                if (n3 == 0 && (n3 = (int)(((BaseEncoding$Alphabet)(object3 = this.this$0.alphabet)).isValidPaddingStartPosition(n4 = this.readChars) ? 1 : 0)) == 0) {
                                    object2 = new StringBuilder("Invalid input length ");
                                    n4 = this.readChars;
                                    ((StringBuilder)object2).append(n4);
                                    object2 = ((StringBuilder)object2).toString();
                                    object3 = new BaseEncoding$DecodingException((String)object2);
                                    throw object3;
                                }
                                return n7;
                            }
                            n7 = this.readChars;
                            n4 = 1;
                            this.readChars = n7 += n4;
                            n3 = (char)n3;
                            object2 = this.this$0.paddingChar;
                            if (object2 == null || (n7 = (int)((Character)object2).charValue()) != n3) break block7;
                            n3 = (int)(this.hitPadding ? 1 : 0);
                            if (n3 != 0) break block8;
                            n3 = this.readChars;
                            if (n3 == n4) break block9;
                            object2 = this.this$0.alphabet;
                            n3 += -1;
                            if ((n3 = (int)(((BaseEncoding$Alphabet)object2).isValidPaddingStartPosition(n3) ? 1 : 0)) != 0) break block8;
                        }
                        object2 = new StringBuilder("Padding cannot start at index ");
                        n4 = this.readChars;
                        ((StringBuilder)object2).append(n4);
                        object2 = ((StringBuilder)object2).toString();
                        object3 = new BaseEncoding$DecodingException((String)object2);
                        throw object3;
                    }
                    this.hitPadding = n4;
                    continue;
                }
                n7 = (int)(this.hitPadding ? 1 : 0);
                if (n7 != 0) break block6;
                n7 = this.bitBuffer;
                object = this.this$0.alphabet;
                int n8 = ((BaseEncoding$Alphabet)object).bitsPerChar;
                this.bitBuffer = n7 <<= n8;
                this.bitBuffer = n3 = ((BaseEncoding$Alphabet)object).decode((char)n3) | n7;
                n7 = this.bitBufferLength;
                object = this.this$0.alphabet;
                n4 = ((BaseEncoding$Alphabet)object).bitsPerChar;
                this.bitBufferLength = n7 += n4;
                n4 = 8;
                if (n7 >= n4) break;
            }
            this.bitBufferLength = n7 -= n4;
            return n3 >> n7 & 0xFF;
        }
        object = new StringBuilder("Expected padding character but found '");
        ((StringBuilder)object).append((char)n3);
        ((StringBuilder)object).append("' at index ");
        n3 = this.readChars;
        ((StringBuilder)object).append(n3);
        object3 = ((StringBuilder)object).toString();
        object2 = new BaseEncoding$DecodingException((String)object3);
        throw object2;
    }

    public int read(byte[] byArray, int n3, int n4) {
        int n7 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n4 += n3, n7);
        for (n7 = n3; n7 < n4; ++n7) {
            int n8;
            int n10 = this.read();
            if (n10 == (n8 = -1)) {
                if ((n7 -= n3) != 0) {
                    n8 = n7;
                }
                return n8;
            }
            byArray[n7] = n10 = (int)((byte)n10);
        }
        return n7 - n3;
    }
}

