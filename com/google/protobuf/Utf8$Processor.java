/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$DecodeUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;

abstract class Utf8$Processor {
    private static int partialIsValidUtf8(ByteBuffer byteBuffer, int n3, int n4) {
        int n7 = Utf8.access$200(byteBuffer, n3, n4);
        n3 += n7;
        while (n3 < n4) {
            n7 = n3 + 1;
            int n8 = byteBuffer.get(n3);
            if (n8 < 0) {
                int n10 = -32;
                int n14 = -1;
                int n15 = -65;
                if (n8 < n10) {
                    if (n7 >= n4) {
                        return n8;
                    }
                    n10 = -62;
                    if (n8 >= n10 && (n7 = (int)byteBuffer.get(n7)) <= n15) {
                        n3 += 2;
                        continue;
                    }
                    return n14;
                }
                int n16 = -16;
                if (n8 < n16) {
                    n16 = n4 + -1;
                    if (n7 >= n16) {
                        return Utf8.access$300(byteBuffer, n8, n7, n4 -= n7);
                    }
                    n16 = n3 + 2;
                    if ((n7 = (int)byteBuffer.get(n7)) <= n15) {
                        int n17 = -96;
                        if (!(n8 == n10 && n7 < n17 || n8 == (n10 = -19) && n7 >= n17 || (n7 = (int)byteBuffer.get(n16)) > n15)) {
                            n3 += 3;
                            continue;
                        }
                    }
                    return n14;
                }
                n10 = n4 + -2;
                if (n7 >= n10) {
                    return Utf8.access$300(byteBuffer, n8, n7, n4 -= n7);
                }
                n10 = n3 + 2;
                if ((n7 = (int)byteBuffer.get(n7)) <= n15 && (n7 = n7 + 112 + (n8 <<= 28) >> 30) == 0) {
                    n7 = n3 + 3;
                    n8 = byteBuffer.get(n10);
                    if (n8 <= n15) {
                        n3 += 4;
                        if ((n7 = (int)byteBuffer.get(n7)) <= n15) continue;
                    }
                }
                return n14;
            }
            n3 = n7;
        }
        return 0;
    }

    public final String decodeUtf8(ByteBuffer object, int n3, int n4) {
        boolean n7 = ((ByteBuffer)object).hasArray();
        if (n7) {
            int n8 = ((ByteBuffer)object).arrayOffset();
            object = ((ByteBuffer)object).array();
            int n10 = n8 + n3;
            return this.decodeUtf8((byte[])object, n10, n4);
        }
        boolean bl2 = ((ByteBuffer)object).isDirect();
        if (bl2) {
            return this.decodeUtf8Direct((ByteBuffer)object, n3, n4);
        }
        return this.decodeUtf8Default((ByteBuffer)object, n3, n4);
    }

    public abstract String decodeUtf8(byte[] var1, int var2, int var3);

    public final String decodeUtf8Default(ByteBuffer object, int n3, int n4) {
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        int n14 = n3 | n4;
        int n15 = ((Buffer)object).limit() - n3 - n4;
        if ((n14 |= n15) >= 0) {
            int n16;
            int n17;
            n14 = n3 + n4;
            char[] cArray = new char[n4];
            n15 = 0;
            while (n3 < n14 && (n17 = Utf8$DecodeUtil.access$400((byte)(n16 = ((ByteBuffer)object).get(n3)))) != 0) {
                n3 += n10;
                n17 = n15 + 1;
                Utf8$DecodeUtil.access$500((byte)n16, cArray, n15);
                n15 = n17;
            }
            int n18 = n15;
            while (n3 < n14) {
                int n19;
                n15 = n3 + 1;
                n16 = ((ByteBuffer)object).get(n3);
                n17 = Utf8$DecodeUtil.access$400((byte)n16);
                if (n17 != 0) {
                    n3 = n18 + 1;
                    Utf8$DecodeUtil.access$500((byte)n16, cArray, n18);
                    while (n15 < n14 && (n17 = (int)(Utf8$DecodeUtil.access$400((byte)(n16 = ((ByteBuffer)object).get(n15))) ? 1 : 0)) != 0) {
                        n15 += n10;
                        n17 = n3 + 1;
                        Utf8$DecodeUtil.access$500((byte)n16, cArray, n3);
                        n3 = n17;
                    }
                    n18 = n3;
                    n3 = n15;
                    continue;
                }
                n17 = (int)(Utf8$DecodeUtil.access$600((byte)n16) ? 1 : 0);
                if (n17 != 0) {
                    if (n15 < n14) {
                        n3 += n8;
                        n15 = ((ByteBuffer)object).get(n15);
                        n17 = n18 + 1;
                        Utf8$DecodeUtil.access$700((byte)n16, (byte)n15, cArray, n18);
                        n18 = n17;
                        continue;
                    }
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                n17 = (int)(Utf8$DecodeUtil.access$800((byte)n16) ? 1 : 0);
                if (n17 != 0) {
                    n17 = n14 + -1;
                    if (n15 < n17) {
                        n17 = n3 + 2;
                        n15 = ((ByteBuffer)object).get(n15);
                        n3 += n7;
                        n17 = ((ByteBuffer)object).get(n17);
                        n19 = n18 + 1;
                        Utf8$DecodeUtil.access$900((byte)n16, (byte)n15, (byte)n17, cArray, n18);
                        n18 = n19;
                        continue;
                    }
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                n17 = n14 + -2;
                if (n15 < n17) {
                    n17 = n3 + 2;
                    n19 = ((ByteBuffer)object).get(n15);
                    n15 = n3 + 3;
                    n17 = ((ByteBuffer)object).get(n17);
                    n3 += 4;
                    byte by2 = ((ByteBuffer)object).get(n15);
                    n15 = n16;
                    n16 = n19;
                    n19 = by2;
                    Utf8$DecodeUtil.access$1000((byte)n15, (byte)n16, (byte)n17, by2, cArray, n18);
                    n18 += n8;
                    continue;
                }
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            object = new String(cArray, 0, n18);
            return object;
        }
        object = ((Buffer)object).limit();
        Integer n20 = n3;
        Integer n21 = n4;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object;
        objectArray[n10] = n20;
        objectArray[n8] = n21;
        object = String.format("buffer limit=%d, index=%d, limit=%d", objectArray);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
        throw arrayIndexOutOfBoundsException;
    }

    public abstract String decodeUtf8Direct(ByteBuffer var1, int var2, int var3);

    public abstract int encodeUtf8(CharSequence var1, byte[] var2, int var3, int var4);

    public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        int n3 = byteBuffer.hasArray();
        if (n3 != 0) {
            n3 = byteBuffer.arrayOffset();
            byte[] byArray = byteBuffer.array();
            int n4 = byteBuffer.position() + n3;
            int n7 = byteBuffer.remaining();
            int n8 = Utf8.encode(charSequence, byArray, n4, n7) - n3;
            Java8Compatibility.position(byteBuffer, n8);
        } else {
            n3 = (int)(byteBuffer.isDirect() ? 1 : 0);
            if (n3 != 0) {
                this.encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                this.encodeUtf8Default(charSequence, byteBuffer);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void encodeUtf8Default(CharSequence var1_1, ByteBuffer var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [17 : 464->470)] java.lang.IndexOutOfBoundsException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public abstract void encodeUtf8Direct(CharSequence var1, ByteBuffer var2);

    public final boolean isValidUtf8(ByteBuffer byteBuffer, int n3, int n4) {
        boolean bl2 = false;
        int n7 = this.partialIsValidUtf8(0, byteBuffer, n3, n4);
        if (n7 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean isValidUtf8(byte[] byArray, int n3, int n4) {
        boolean bl2 = false;
        int n7 = this.partialIsValidUtf8(0, byArray, n3, n4);
        if (n7 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final int partialIsValidUtf8(int n3, ByteBuffer object, int n4, int n7) {
        boolean n8 = ((ByteBuffer)object).hasArray();
        if (n8) {
            int n10 = ((ByteBuffer)object).arrayOffset();
            object = ((ByteBuffer)object).array();
            int n14 = n10 + n7;
            return this.partialIsValidUtf8(n3, (byte[])object, n4 += n10, n14);
        }
        boolean bl2 = ((ByteBuffer)object).isDirect();
        if (bl2) {
            return this.partialIsValidUtf8Direct(n3, (ByteBuffer)object, n4, n7);
        }
        return this.partialIsValidUtf8Default(n3, (ByteBuffer)object, n4, n7);
    }

    public abstract int partialIsValidUtf8(int var1, byte[] var2, int var3, int var4);

    /*
     * Enabled aggressive block sorting
     */
    public final int partialIsValidUtf8Default(int n3, ByteBuffer byteBuffer, int n4, int n7) {
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        block17: {
            block18: {
                block16: {
                    block15: {
                        if (n3 == 0) return Utf8$Processor.partialIsValidUtf8(byteBuffer, n4, n7);
                        if (n4 >= n7) {
                            return n3;
                        }
                        n16 = n3;
                        n15 = -32;
                        n14 = -1;
                        n10 = -65;
                        if (n16 >= n15) break block15;
                        n3 = -62;
                        if (n16 < n3) return n14;
                        n3 = n4 + 1;
                        if ((n4 = (int)byteBuffer.get(n4)) > n10) {
                            return n14;
                        }
                        break block16;
                    }
                    int n17 = -16;
                    if (n16 >= n17) break block17;
                    if ((n3 = (int)((byte)(~(n3 >> 8)))) == 0) {
                        n3 = n4 + 1;
                        n4 = byteBuffer.get(n4);
                        if (n3 >= n7) {
                            return Utf8.access$000(n16, n4);
                        }
                        int n18 = n4;
                        n4 = n3;
                        n3 = n18;
                    }
                    if (n3 > n10) return n14;
                    n17 = -96;
                    if (n16 == n15) {
                        if (n3 < n17) return n14;
                    }
                    if (n16 == (n15 = -19)) {
                        if (n3 >= n17) return n14;
                    }
                    n3 = n4 + 1;
                    if ((n4 = (int)byteBuffer.get(n4)) > n10) break block18;
                }
                n4 = n3;
                return Utf8$Processor.partialIsValidUtf8(byteBuffer, n4, n7);
            }
            return n14;
        }
        n15 = (byte)(~(n3 >> 8));
        if (n15 == 0) {
            n3 = n4 + 1;
            n15 = byteBuffer.get(n4);
            if (n3 >= n7) {
                return Utf8.access$000(n16, n15);
            }
            n4 = 0;
        } else {
            n3 = (byte)(n3 >> 16);
            n8 = n4;
            n4 = n3;
            n3 = n8;
        }
        if (n4 == 0) {
            n4 = n3 + 1;
            n3 = byteBuffer.get(n3);
            if (n4 >= n7) {
                return Utf8.access$100(n16, n15, n3);
            }
            n8 = n4;
            n4 = n3;
            n3 = n8;
        }
        if (n15 > n10) return n14;
        n16 <<= 28;
        if ((n16 = (n15 = n15 + 112 + n16) >> 30) != 0) return n14;
        if (n4 > n10) return n14;
        n4 = n3 + 1;
        if ((n3 = (int)byteBuffer.get(n3)) <= n10) return Utf8$Processor.partialIsValidUtf8(byteBuffer, n4, n7);
        return n14;
    }

    public abstract int partialIsValidUtf8Direct(int var1, ByteBuffer var2, int var3, int var4);
}

