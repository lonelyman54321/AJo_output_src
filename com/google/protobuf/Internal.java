/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Utf8;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final Charset ISO_8859_1;
    static final Charset US_ASCII;
    static final Charset UTF_8;

    static {
        US_ASCII = Charset.forName("US-ASCII");
        UTF_8 = Charset.forName("UTF-8");
        ISO_8859_1 = Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        EMPTY_BYTE_ARRAY = byArray;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(byArray);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(byArray);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String string2) {
        Charset charset = ISO_8859_1;
        return string2.getBytes(charset);
    }

    public static ByteBuffer byteBufferDefaultValue(String string2) {
        return ByteBuffer.wrap(Internal.byteArrayDefaultValue(string2));
    }

    public static ByteString bytesDefaultValue(String string2) {
        Charset charset = ISO_8859_1;
        return ByteString.copyFrom(string2.getBytes(charset));
    }

    public static Object checkNotNull(Object object) {
        object.getClass();
        return object;
    }

    public static Object checkNotNull(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer = byteBuffer.duplicate();
        ((Buffer)byteBuffer).clear();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer2.put(byteBuffer);
        ((Buffer)byteBuffer2).clear();
        return byteBuffer2;
    }

    public static boolean equals(List list, List list2) {
        int n3;
        int n4 = list.size();
        if (n4 != (n3 = list2.size())) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = list.size()); ++n4) {
            byte[] byArray;
            byte[] byArray2 = (byte[])list.get(n4);
            n3 = (int)(Arrays.equals(byArray2, byArray = (byte[])list2.get(n4)) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int n3;
        int n4 = byteBuffer.capacity();
        if (n4 != (n3 = byteBuffer2.capacity())) {
            return false;
        }
        byteBuffer = byteBuffer.duplicate();
        Java8Compatibility.clear(byteBuffer);
        byteBuffer2 = byteBuffer2.duplicate();
        Java8Compatibility.clear(byteBuffer2);
        return byteBuffer.equals(byteBuffer2);
    }

    public static boolean equalsByteBuffer(List list, List list2) {
        int n3;
        int n4 = list.size();
        if (n4 != (n3 = list2.size())) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = list.size()); ++n4) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2 = (ByteBuffer)list.get(n4);
            n3 = (int)(Internal.equalsByteBuffer(byteBuffer2, byteBuffer = (ByteBuffer)list2.get(n4)) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public static MessageLite getDefaultInstance(Class object) {
        Object object2 = "getDefaultInstance";
        RuntimeException runtimeException = null;
        try {
            object2 = ((Class)object).getMethod((String)object2, null);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Failed to get default instance for ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            runtimeException = new RuntimeException((String)object, exception);
            throw runtimeException;
        }
        object2 = ((Method)object2).invoke(object2, null);
        return (MessageLite)object2;
    }

    /*
     * WARNING - void declaration
     */
    public static int hashBoolean(boolean bl2) {
        void var0_3;
        if (bl2) {
            int n3 = 1231;
        } else {
            int n4 = 1237;
        }
        return (int)var0_3;
    }

    public static int hashCode(List object) {
        int n3;
        object = object.iterator();
        int n4 = 1;
        while ((n3 = object.hasNext()) != 0) {
            byte[] byArray = (byte[])object.next();
            n4 *= 31;
            n3 = Internal.hashCode(byArray);
            n4 += n3;
        }
        return n4;
    }

    public static int hashCode(byte[] byArray) {
        int n3 = byArray.length;
        return Internal.hashCode(byArray, 0, n3);
    }

    public static int hashCode(byte[] byArray, int n3, int n4) {
        int n7 = Internal.partialHash(n4, byArray, n3, n4);
        if (n7 == 0) {
            n7 = 1;
        }
        return n7;
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        int n3;
        int n4;
        int n7 = byteBuffer.hasArray();
        int n8 = 1;
        if (n7 != 0) {
            n7 = byteBuffer.capacity();
            byte[] byArray = byteBuffer.array();
            int n10 = byteBuffer.arrayOffset();
            int n14 = byteBuffer.capacity();
            if ((n14 = Internal.partialHash(n7, byArray, n10, n14)) != 0) {
                n8 = n14;
            }
            return n8;
        }
        n7 = byteBuffer.capacity();
        if (n7 <= (n4 = 4096)) {
            n4 = byteBuffer.capacity();
        }
        byte[] byArray = new byte[n4];
        ByteBuffer byteBuffer2 = byteBuffer.duplicate();
        Java8Compatibility.clear(byteBuffer2);
        int n15 = byteBuffer.capacity();
        while ((n3 = byteBuffer2.remaining()) > 0) {
            n3 = byteBuffer2.remaining();
            n3 = n3 <= n4 ? byteBuffer2.remaining() : n4;
            byteBuffer2.get(byArray, 0, n3);
            n15 = Internal.partialHash(n15, byArray, 0, n3);
        }
        if (n15 != 0) {
            n8 = n15;
        }
        return n8;
    }

    public static int hashCodeByteBuffer(List object) {
        int n3;
        object = object.iterator();
        int n4 = 1;
        while ((n3 = object.hasNext()) != 0) {
            ByteBuffer byteBuffer = (ByteBuffer)object.next();
            n4 *= 31;
            n3 = Internal.hashCodeByteBuffer(byteBuffer);
            n4 += n3;
        }
        return n4;
    }

    public static int hashEnum(Internal$EnumLite internal$EnumLite) {
        return internal$EnumLite.getNumber();
    }

    public static int hashEnumList(List object) {
        int n3;
        object = object.iterator();
        int n4 = 1;
        while ((n3 = object.hasNext()) != 0) {
            Internal$EnumLite internal$EnumLite = (Internal$EnumLite)object.next();
            n4 *= 31;
            n3 = Internal.hashEnum(internal$EnumLite);
            n4 += n3;
        }
        return n4;
    }

    public static int hashLong(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] byArray) {
        return Utf8.isValidUtf8(byArray);
    }

    public static Object mergeMessage(Object object, Object object2) {
        object = ((MessageLite)object).toBuilder();
        object2 = (MessageLite)object2;
        return object.mergeFrom((MessageLite)object2).buildPartial();
    }

    public static int partialHash(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        for (int i3 = n4; i3 < (n8 = n4 + n7); ++i3) {
            n3 *= 31;
            n8 = byArray[i3];
            n3 += n8;
        }
        return n3;
    }

    public static String stringDefaultValue(String object) {
        Charset charset = ISO_8859_1;
        object = ((String)object).getBytes(charset);
        charset = UTF_8;
        String string2 = new String((byte[])object, charset);
        return string2;
    }

    public static byte[] toByteArray(String string2) {
        Charset charset = UTF_8;
        return string2.getBytes(charset);
    }

    public static String toStringUtf8(byte[] byArray) {
        Charset charset = UTF_8;
        String string2 = new String(byArray, charset);
        return string2;
    }
}

