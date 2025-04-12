/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Android;
import com.google.protobuf.Utf8$Processor;
import com.google.protobuf.Utf8$SafeProcessor;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.Utf8$UnsafeProcessor;
import java.nio.ByteBuffer;

final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = 255;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Utf8$Processor processor;

    static {
        boolean bl2 = Utf8$UnsafeProcessor.isAvailable();
        Utf8$Processor utf8$Processor = bl2 && !(bl2 = Android.isOnAndroidDevice()) ? new Utf8$UnsafeProcessor() : new Utf8$SafeProcessor();
        processor = utf8$Processor;
    }

    private Utf8() {
    }

    public static /* synthetic */ int access$000(int n3, int n4) {
        return Utf8.incompleteStateFor(n3, n4);
    }

    public static /* synthetic */ int access$100(int n3, int n4, int n7) {
        return Utf8.incompleteStateFor(n3, n4, n7);
    }

    public static /* synthetic */ int access$1100(byte[] byArray, int n3, int n4) {
        return Utf8.incompleteStateFor(byArray, n3, n4);
    }

    public static /* synthetic */ int access$1200(int n3) {
        return Utf8.incompleteStateFor(n3);
    }

    public static /* synthetic */ int access$200(ByteBuffer byteBuffer, int n3, int n4) {
        return Utf8.estimateConsecutiveAscii(byteBuffer, n3, n4);
    }

    public static /* synthetic */ int access$300(ByteBuffer byteBuffer, int n3, int n4, int n7) {
        return Utf8.incompleteStateFor(byteBuffer, n3, n4, n7);
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int n3, int n4) {
        return processor.decodeUtf8(byteBuffer, n3, n4);
    }

    public static String decodeUtf8(byte[] byArray, int n3, int n4) {
        return processor.decodeUtf8(byArray, n3, n4);
    }

    public static int encode(CharSequence charSequence, byte[] byArray, int n3, int n4) {
        return processor.encodeUtf8(charSequence, byArray, n3, n4);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence object) {
        int n3;
        int n4;
        int n7;
        int n8 = object.length();
        for (n7 = 0; n7 < n8 && (n4 = (int)object.charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n10;
            n3 = object.charAt(n7);
            if (n3 < (n10 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            int n14 = Utf8.encodedLengthGeneral((CharSequence)object, n7);
            n4 += n14;
            break;
        }
        if (n4 >= n8) {
            return n4;
        }
        CharSequence charSequence = new StringBuilder("UTF-8 length does not fit in int: ");
        long l2 = (long)n4 + 0x100000000L;
        charSequence.append(l2);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    private static int encodedLengthGeneral(CharSequence object, int n3) {
        int n4 = object.length();
        int n7 = 0;
        while (n3 < n4) {
            int n8;
            int n10 = object.charAt(n3);
            if (n10 < (n8 = 2048)) {
                n10 = 127 - n10 >>> 31;
                n7 += n10;
            } else {
                n7 += 2;
                n8 = 55296;
                if (n8 <= n10 && n10 <= (n8 = 57343)) {
                    n10 = Character.codePointAt((CharSequence)object, n3);
                    if (n10 >= (n8 = 65536)) {
                        ++n3;
                    } else {
                        object = new Utf8$UnpairedSurrogateException(n3, n4);
                        throw object;
                    }
                }
            }
            ++n3;
        }
        return n7;
    }

    private static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int n3, int n4) {
        long l2;
        long l3;
        long l4;
        long l7;
        int n7;
        n4 += -7;
        for (n7 = n3; n7 < n4 && (l7 = (l4 = (l3 = byteBuffer.getLong(n7) & 0x8080808080808080L) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false; n7 += 8) {
        }
        return n7 - n3;
    }

    private static int incompleteStateFor(int n3) {
        int n4 = -12;
        if (n3 > n4) {
            n3 = -1;
        }
        return n3;
    }

    private static int incompleteStateFor(int n3, int n4) {
        int n7 = -12;
        n3 = n3 <= n7 && n4 <= (n7 = -65) ? (n3 ^= (n4 <<= 8)) : -1;
        return n3;
    }

    private static int incompleteStateFor(int n3, int n4, int n7) {
        int n8 = -12;
        if (n3 <= n8 && n4 <= (n8 = -65) && n7 <= n8) {
            n3 ^= (n4 <<= 8);
            n4 = n7 << 16;
            n3 ^= n4;
        } else {
            n3 = -1;
        }
        return n3;
    }

    private static int incompleteStateFor(ByteBuffer object, int n3, int n4, int n7) {
        if (n7 != 0) {
            int n8 = 1;
            if (n7 != n8) {
                int n10 = 2;
                if (n7 == n10) {
                    n7 = ((ByteBuffer)object).get(n4);
                    byte by2 = ((ByteBuffer)object).get(n4 += n8);
                    return Utf8.incompleteStateFor(n3, n7, (int)by2);
                }
                object = new AssertionError();
                throw object;
            }
            byte by4 = ((ByteBuffer)object).get(n4);
            return Utf8.incompleteStateFor(n3, by4);
        }
        return Utf8.incompleteStateFor(n3);
    }

    private static int incompleteStateFor(byte[] object, int n3, int n4) {
        int n7 = n3 + -1;
        n7 = object[n7];
        if ((n4 -= n3) != 0) {
            int n8 = 1;
            if (n4 != n8) {
                int n10 = 2;
                if (n4 == n10) {
                    n4 = object[n3];
                    byte by2 = object[n3 += n8];
                    return Utf8.incompleteStateFor(n7, n4, (int)by2);
                }
                object = new AssertionError;
                object();
                throw object;
            }
            byte by4 = object[n3];
            return Utf8.incompleteStateFor(n7, by4);
        }
        return Utf8.incompleteStateFor(n7);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        Utf8$Processor utf8$Processor = processor;
        int n3 = byteBuffer.position();
        int n4 = byteBuffer.remaining();
        return utf8$Processor.isValidUtf8(byteBuffer, n3, n4);
    }

    public static boolean isValidUtf8(byte[] byArray) {
        Utf8$Processor utf8$Processor = processor;
        int n3 = byArray.length;
        return utf8$Processor.isValidUtf8(byArray, 0, n3);
    }

    public static boolean isValidUtf8(byte[] byArray, int n3, int n4) {
        return processor.isValidUtf8(byArray, n3, n4);
    }

    public static int partialIsValidUtf8(int n3, ByteBuffer byteBuffer, int n4, int n7) {
        return processor.partialIsValidUtf8(n3, byteBuffer, n4, n7);
    }

    public static int partialIsValidUtf8(int n3, byte[] byArray, int n4, int n7) {
        return processor.partialIsValidUtf8(n3, byArray, n4, n7);
    }
}

