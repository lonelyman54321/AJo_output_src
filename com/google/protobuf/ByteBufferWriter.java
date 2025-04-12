/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.UnsafeUtil;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

final class ByteBufferWriter {
    private static final ThreadLocal BUFFER;
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET = 0L;
    private static final Class FILE_OUTPUT_STREAM_CLASS;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    static {
        Object object = new ThreadLocal();
        BUFFER = object;
        FILE_OUTPUT_STREAM_CLASS = object = ByteBufferWriter.safeGetClass("java.io.FileOutputStream");
        CHANNEL_FIELD_OFFSET = ByteBufferWriter.getChannelFieldOffset((Class)object);
    }

    private ByteBufferWriter() {
    }

    public static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    private static byte[] getBuffer() {
        Object object = (SoftReference)BUFFER.get();
        object = object == null ? null : (Object)((byte[])((SoftReference)object).get());
        return object;
    }

    private static long getChannelFieldOffset(Class annotatedElement) {
        block5: {
            if (annotatedElement != null) {
                String string2;
                try {
                    boolean bl2 = UnsafeUtil.hasUnsafeArrayOperations();
                    if (!bl2) break block5;
                    string2 = "channel";
                }
                catch (Throwable throwable) {}
                annotatedElement = annotatedElement.getDeclaredField(string2);
                return UnsafeUtil.objectFieldOffset((Field)annotatedElement);
            }
        }
        return -1;
    }

    private static byte[] getOrCreateBuffer(int n3) {
        byte[] byArray;
        block5: {
            int n4;
            block4: {
                int n7 = 1024;
                n3 = Math.max(n3, n7);
                byArray = ByteBufferWriter.getBuffer();
                if (byArray == null) break block4;
                n4 = byArray.length;
                if ((n4 = (int)(ByteBufferWriter.needToReallocate(n3, n4) ? 1 : 0)) == 0) break block5;
            }
            byArray = new byte[n3];
            n4 = 16384;
            if (n3 <= n4) {
                ByteBufferWriter.setBuffer(byArray);
            }
        }
        return byArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean needToReallocate(int n3, int n4) {
        if (n4 >= n3) return 0 != 0;
        float f5 = n4;
        float f6 = n3;
        float f7 = 0.5f;
        float f8 = f5 - (f6 *= f7);
        n3 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1));
        if (n3 >= 0) return 0 != 0;
        return 1 != 0;
    }

    private static Class safeGetClass(String string2) {
        try {
            return Class.forName(string2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    private static void setBuffer(byte[] byArray) {
        ThreadLocal threadLocal = BUFFER;
        SoftReference<byte[]> softReference = new SoftReference<byte[]>(byArray);
        threadLocal.set(softReference);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void write(ByteBuffer byteBuffer, OutputStream outputStream) {
        Throwable throwable2;
        int n3;
        block6: {
            block5: {
                int n4;
                block4: {
                    n3 = byteBuffer.position();
                    try {
                        n4 = byteBuffer.hasArray();
                        if (n4 == 0) break block4;
                        byte[] byArray = byteBuffer.array();
                        int n7 = byteBuffer.arrayOffset();
                        int n8 = byteBuffer.position();
                        n7 += n8;
                        n8 = byteBuffer.remaining();
                        outputStream.write(byArray, n7, n8);
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                n4 = ByteBufferWriter.writeToChannel(byteBuffer, outputStream);
                if (n4 == 0) {
                    int n10;
                    n4 = byteBuffer.remaining();
                    byte[] byArray = ByteBufferWriter.getOrCreateBuffer(n4);
                    while ((n10 = byteBuffer.hasRemaining()) != 0) {
                        n10 = byteBuffer.remaining();
                        int n14 = byArray.length;
                        n10 = Math.min(n10, n14);
                        n14 = 0;
                        byteBuffer.get(byArray, 0, n10);
                        outputStream.write(byArray, 0, n10);
                    }
                }
            }
            Java8Compatibility.position(byteBuffer, n3);
            return;
        }
        Java8Compatibility.position(byteBuffer, n3);
        throw throwable2;
    }

    private static boolean writeToChannel(ByteBuffer byteBuffer, OutputStream object) {
        Class clazz;
        boolean bl2;
        long l2 = CHANNEL_FIELD_OFFSET;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 >= 0 && (bl2 = (clazz = FILE_OUTPUT_STREAM_CLASS).isInstance(object))) {
            object = UnsafeUtil.getObject(object, l2);
            try {
                object = (WritableByteChannel)object;
            }
            catch (ClassCastException classCastException) {
                object = null;
            }
            if (object != null) {
                object.write(byteBuffer);
                return true;
            }
        }
        return false;
    }
}

