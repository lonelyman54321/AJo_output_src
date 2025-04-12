/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from hF
 */
public final class hf_0 {
    public static final AtomicReference a;

    static {
        AtomicReference atomicReference;
        a = atomicReference = new AtomicReference();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MappedByteBuffer a(File object) {
        RandomAccessFile randomAccessFile;
        block16: {
            void var0_3;
            AbstractInterruptibleChannel abstractInterruptibleChannel;
            block17: {
                block14: {
                    block15: {
                        abstractInterruptibleChannel = null;
                        long l2 = ((File)object).length();
                        long l3 = Integer.MAX_VALUE;
                        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (object2 > 0) break block14;
                        l3 = 0L;
                        long l4 = l2 - l3;
                        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object2 == false) break block15;
                        Object object3 = "r";
                        randomAccessFile = new RandomAccessFile((File)object, (String)object3);
                        try {
                            abstractInterruptibleChannel = randomAccessFile.getChannel();
                            FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
                            long l7 = 0L;
                            object3 = abstractInterruptibleChannel;
                            object = ((FileChannel)abstractInterruptibleChannel).map(mapMode, l7, l2);
                            object = ((MappedByteBuffer)object).load();
                        }
                        catch (Throwable throwable) {}
                        try {
                            abstractInterruptibleChannel.close();
                            break block16;
                        }
                        catch (IOException iOException) {}
                        break block17;
                    }
                    try {
                        String string2 = "File unsuitable for memory mapping";
                        object = new IOException(string2);
                        throw object;
                    }
                    catch (Throwable throwable) {
                        randomAccessFile = null;
                    }
                    break block17;
                }
                String string3 = "File too large to map into memory";
                object = new IOException(string3);
                throw object;
            }
            if (abstractInterruptibleChannel != null) {
                try {
                    abstractInterruptibleChannel.close();
                }
                catch (IOException iOException) {}
            }
            if (randomAccessFile == null) throw var0_3;
            try {
                randomAccessFile.close();
            }
            catch (IOException iOException) {
                throw var0_3;
            }
            throw var0_3;
        }
        try {
            randomAccessFile.close();
            return object;
        }
        catch (IOException iOException) {
            return object;
        }
    }

    public static ByteBuffer b(InputStream object) {
        int n3 = 16384;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n3);
        AtomicReference atomicReference = a;
        byte[] byArray = atomicReference.getAndSet(null);
        if (byArray == null) {
            byArray = new byte[n3];
        }
        while ((n3 = ((InputStream)object).read(byArray)) >= 0) {
            byteArrayOutputStream.write(byArray, 0, n3);
        }
        atomicReference.set(byArray);
        object = byteArrayOutputStream.toByteArray();
        return hf_0.c(ByteBuffer.allocateDirect(((Object)object).length).put((byte[])object));
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer)byteBuffer.position(0);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        block13: {
            void var0_3;
            AbstractInterruptibleChannel abstractInterruptibleChannel;
            block14: {
                hf_0.c(byteBuffer);
                abstractInterruptibleChannel = null;
                String string2 = "rw";
                randomAccessFile = new RandomAccessFile(file, string2);
                try {
                    abstractInterruptibleChannel = randomAccessFile.getChannel();
                    ((FileChannel)abstractInterruptibleChannel).write(byteBuffer);
                    byteBuffer = null;
                    ((FileChannel)abstractInterruptibleChannel).force(false);
                    abstractInterruptibleChannel.close();
                    randomAccessFile.close();
                }
                catch (Throwable throwable) {}
                try {
                    abstractInterruptibleChannel.close();
                    break block13;
                }
                catch (IOException iOException) {}
                break block14;
                catch (Throwable throwable) {
                    randomAccessFile = null;
                }
            }
            if (abstractInterruptibleChannel != null) {
                try {
                    abstractInterruptibleChannel.close();
                }
                catch (IOException iOException) {}
            }
            if (randomAccessFile == null) throw var0_3;
            try {
                randomAccessFile.close();
            }
            catch (IOException iOException) {
                throw var0_3;
            }
            throw var0_3;
        }
        try {
            randomAccessFile.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

