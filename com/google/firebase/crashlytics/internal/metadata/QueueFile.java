/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.QueueFile$1;
import com.google.firebase.crashlytics.internal.metadata.QueueFile$Element;
import com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementInputStream;
import com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

class QueueFile
implements Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private QueueFile$Element first;
    private QueueFile$Element last;
    private final RandomAccessFile raf;

    public QueueFile(File object) {
        byte[] byArray = new byte[16];
        this.buffer = byArray;
        boolean bl2 = ((File)object).exists();
        if (!bl2) {
            QueueFile.initialize((File)object);
        }
        this.raf = object = QueueFile.open((File)object);
        this.readHeader();
    }

    public QueueFile(RandomAccessFile randomAccessFile) {
        byte[] byArray = new byte[16];
        this.buffer = byArray;
        this.raf = randomAccessFile;
        this.readHeader();
    }

    public static /* synthetic */ int access$100(QueueFile queueFile, int n3) {
        return queueFile.wrapPosition(n3);
    }

    public static /* synthetic */ Object access$200(Object object, String string2) {
        return QueueFile.nonNull(object, string2);
    }

    public static /* synthetic */ void access$300(QueueFile queueFile, int n3, byte[] byArray, int n4, int n7) {
        queueFile.ringRead(n3, byArray, n4, n7);
    }

    public static /* synthetic */ RandomAccessFile access$400(QueueFile queueFile) {
        return queueFile.raf;
    }

    private void expandIfNecessary(int n3) {
        int n4 = this.remainingBytes();
        if (n4 >= (n3 += 4)) {
            return;
        }
        int n7 = this.fileLength;
        while ((n4 += (n7 <<= 1)) < n3) {
        }
        this.setLength(n7);
        Object object = this.last;
        n4 = ((QueueFile$Element)object).position + 4;
        n3 = ((QueueFile$Element)object).length;
        n4 += n3;
        n3 = this.wrapPosition(n4);
        Object object2 = this.first;
        n4 = ((QueueFile$Element)object2).position;
        if (n3 < n4) {
            object2 = this.raf;
            FileChannel fileChannel = ((RandomAccessFile)object2).getChannel();
            n4 = this.fileLength;
            long l2 = n4;
            fileChannel.position(l2);
            long l3 = n3 + -4;
            long l4 = 16;
            l2 = fileChannel.transferTo(l4, l3, fileChannel);
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 != 0) {
                object = new AssertionError((Object)"Copied insufficient number of bytes!");
                throw object;
            }
        }
        object = this.last;
        n3 = ((QueueFile$Element)object).position;
        object2 = this.first;
        n4 = ((QueueFile$Element)object2).position;
        if (n3 < n4) {
            int n8 = this.fileLength + n3 + -16;
            n3 = this.elementCount;
            this.writeHeader(n7, n3, n4, n8);
            object2 = this.last;
            n4 = ((QueueFile$Element)object2).length;
            this.last = object = new QueueFile$Element(n8, n4);
        } else {
            int n10 = this.elementCount;
            this.writeHeader(n7, n10, n4, n3);
        }
        this.fileLength = n7;
    }

    private static void initialize(File serializable) {
        Object object = new StringBuilder();
        Object object2 = serializable.getPath();
        ((StringBuilder)object).append((String)object2);
        object2 = ".tmp";
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        File file = new File((String)object);
        object = QueueFile.open(file);
        long l2 = 4096L;
        ((RandomAccessFile)object).setLength(l2);
        l2 = 0L;
        ((RandomAccessFile)object).seek(l2);
        int n3 = 16;
        object2 = new byte[n3];
        int[] nArray = null;
        int n4 = 4096;
        nArray = new int[]{n4, 0, 0, 0};
        QueueFile.writeInts((byte[])object2, nArray);
        ((RandomAccessFile)object).write((byte[])object2);
        boolean bl2 = file.renameTo((File)serializable);
        if (bl2) {
            return;
        }
        serializable = new IOException("Rename failed!");
        throw serializable;
        finally {
            ((RandomAccessFile)object).close();
        }
    }

    private static Object nonNull(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    private static RandomAccessFile open(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        return randomAccessFile;
    }

    private QueueFile$Element readElement(int n3) {
        if (n3 == 0) {
            return QueueFile$Element.NULL;
        }
        Object object = this.raf;
        long l2 = n3;
        ((RandomAccessFile)object).seek(l2);
        int n4 = this.raf.readInt();
        object = new QueueFile$Element(n3, n4);
        return object;
    }

    private void readHeader() {
        int n3;
        Object object = this.raf;
        long l2 = 0L;
        ((RandomAccessFile)object).seek(l2);
        object = this.raf;
        Object object2 = this.buffer;
        ((RandomAccessFile)object).readFully((byte[])object2);
        object = this.buffer;
        int n4 = 0;
        object2 = null;
        this.fileLength = n3 = QueueFile.readInt((byte[])object, 0);
        long l3 = n3;
        RandomAccessFile randomAccessFile = this.raf;
        long l4 = randomAccessFile.length();
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 <= 0) {
            this.elementCount = n3 = QueueFile.readInt(this.buffer, 4);
            n3 = QueueFile.readInt(this.buffer, 8);
            n4 = QueueFile.readInt(this.buffer, 12);
            this.first = object = this.readElement(n3);
            this.last = object = this.readElement(n4);
            return;
        }
        object2 = new StringBuilder;
        ((StringBuilder)object2)("File is truncated. Expected length: ");
        int n7 = this.fileLength;
        ((StringBuilder)object2).append(n7);
        ((StringBuilder)object2).append(", Actual length: ");
        l4 = this.raf.length();
        ((StringBuilder)object2).append(l4);
        object2 = ((StringBuilder)object2).toString();
        object = new IOException((String)object2);
        throw object;
    }

    private static int readInt(byte[] byArray, int n3) {
        int n4 = (byArray[n3] & 0xFF) << 24;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 16;
        n4 += n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 8;
        int n8 = byArray[n3 += 3] & 0xFF;
        return (n4 += n7) + n8;
    }

    private int remainingBytes() {
        int n3 = this.fileLength;
        int n4 = this.usedBytes();
        return n3 - n4;
    }

    private void ringRead(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        int n10 = (n3 = this.wrapPosition(n3)) + n7;
        if (n10 <= (n8 = this.fileLength)) {
            RandomAccessFile randomAccessFile = this.raf;
            long l2 = n3;
            randomAccessFile.seek(l2);
            RandomAccessFile randomAccessFile2 = this.raf;
            randomAccessFile2.readFully(byArray, n4, n7);
        } else {
            RandomAccessFile randomAccessFile = this.raf;
            long l3 = n3;
            randomAccessFile.seek(l3);
            this.raf.readFully(byArray, n4, n8 -= n3);
            RandomAccessFile randomAccessFile3 = this.raf;
            l3 = 16;
            randomAccessFile3.seek(l3);
            randomAccessFile3 = this.raf;
            randomAccessFile3.readFully(byArray, n4 += n8, n7 -= n8);
        }
    }

    private void ringWrite(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        int n10 = (n3 = this.wrapPosition(n3)) + n7;
        if (n10 <= (n8 = this.fileLength)) {
            RandomAccessFile randomAccessFile = this.raf;
            long l2 = n3;
            randomAccessFile.seek(l2);
            RandomAccessFile randomAccessFile2 = this.raf;
            randomAccessFile2.write(byArray, n4, n7);
        } else {
            RandomAccessFile randomAccessFile = this.raf;
            long l3 = n3;
            randomAccessFile.seek(l3);
            this.raf.write(byArray, n4, n8 -= n3);
            RandomAccessFile randomAccessFile3 = this.raf;
            l3 = 16;
            randomAccessFile3.seek(l3);
            randomAccessFile3 = this.raf;
            randomAccessFile3.write(byArray, n4 += n8, n7 -= n8);
        }
    }

    private void setLength(int n3) {
        RandomAccessFile randomAccessFile = this.raf;
        long l2 = n3;
        randomAccessFile.setLength(l2);
        this.raf.getChannel().force(true);
    }

    private int wrapPosition(int n3) {
        int n4 = this.fileLength;
        if (n3 >= n4) {
            n3 = n3 + 16 - n4;
        }
        return n3;
    }

    private void writeHeader(int n3, int n4, int n7, int n8) {
        byte[] byArray = this.buffer;
        Object object = new int[]{n3, n4, n7, n8};
        QueueFile.writeInts(byArray, (int[])object);
        this.raf.seek(0L);
        object = this.raf;
        byte[] byArray2 = this.buffer;
        ((RandomAccessFile)object).write(byArray2);
    }

    private static void writeInt(byte[] byArray, int n3, int n4) {
        byte by2;
        int n7;
        byArray[n3] = n7 = (int)(n4 >> 24);
        n7 = n3 + 1;
        byArray[n7] = by2 = (byte)(n4 >> 16);
        n7 = n3 + 2;
        byArray[n7] = by2 = (byte)(n4 >> 8);
        byArray[n3 += 3] = n4 = (int)((byte)n4);
    }

    private static void writeInts(byte[] byArray, int ... nArray) {
        int n3 = nArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray[i3];
            QueueFile.writeInt(byArray, n4, n7);
            n4 += 4;
        }
    }

    public void add(byte[] byArray) {
        int n3 = byArray.length;
        this.add(byArray, 0, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void add(byte[] object, int n3, int n4) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block9: {
                    int n7;
                    Object object2;
                    int n8;
                    int n10;
                    String string2 = "buffer";
                    try {
                        QueueFile.nonNull(object, string2);
                        n10 = n3 | n4;
                        if (n10 < 0 || n4 > (n10 = ((byte[])object).length - n3)) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    this.expandIfNecessary(n4);
                    n10 = (int)(this.isEmpty() ? 1 : 0);
                    int n14 = 4;
                    if (n10 != 0) {
                        n8 = 16;
                    } else {
                        object2 = this.last;
                        int n15 = ((QueueFile$Element)object2).position + n14;
                        n8 = ((QueueFile$Element)object2).length;
                        n15 += n8;
                        n8 = this.wrapPosition(n15);
                    }
                    QueueFile$Element queueFile$Element = new QueueFile$Element(n8, n4);
                    object2 = this.buffer;
                    QueueFile.writeInt((byte[])object2, 0, n4);
                    n8 = queueFile$Element.position;
                    byte[] byArray = this.buffer;
                    this.ringWrite(n8, byArray, 0, n14);
                    n8 = queueFile$Element.position + n14;
                    this.ringWrite(n8, (byte[])object, n3, n4);
                    if (n10 != 0) {
                        n7 = queueFile$Element.position;
                    } else {
                        object = this.first;
                        n7 = object.position;
                    }
                    n3 = this.fileLength;
                    n4 = this.elementCount + 1;
                    n14 = queueFile$Element.position;
                    this.writeHeader(n3, n4, n7, n14);
                    this.last = queueFile$Element;
                    this.elementCount = n7 = this.elementCount + 1;
                    if (n10 != 0) {
                        this.first = queueFile$Element;
                    }
                    return;
                }
                object = new IndexOutOfBoundsException;
                object();
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                int n3;
                block3: {
                    int n4 = 0;
                    QueueFile$Element queueFile$Element = null;
                    n3 = 4096;
                    try {
                        this.writeHeader(n3, 0, 0, 0);
                        this.elementCount = 0;
                        this.first = queueFile$Element = QueueFile$Element.NULL;
                        this.last = queueFile$Element;
                        n4 = this.fileLength;
                        if (n4 <= n3) break block3;
                        this.setLength(n3);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.fileLength = n3;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        synchronized (this) {
            RandomAccessFile randomAccessFile = this.raf;
            randomAccessFile.close();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void forEach(QueueFile$ElementReader queueFile$ElementReader) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    int n3;
                    QueueFile$Element queueFile$Element = this.first;
                    int n4 = queueFile$Element.position;
                    for (int i3 = 0; i3 < (n3 = this.elementCount); n3 += n4, ++i3) {
                        queueFile$Element = this.readElement(n4);
                        int n7 = 0;
                        QueueFile$ElementInputStream queueFile$ElementInputStream = new QueueFile$ElementInputStream(this, queueFile$Element, null);
                        n7 = queueFile$Element.length;
                        queueFile$ElementReader.read(queueFile$ElementInputStream, n7);
                        n3 = queueFile$Element.position + 4;
                        n4 = queueFile$Element.length;
                        n4 = this.wrapPosition(n3);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public boolean hasSpaceFor(int n3, int n4) {
        int n7 = this.usedBytes() + 4 + n3;
        n3 = n7 <= n4 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isEmpty() {
        synchronized (this) {
            boolean bl2 = this.elementCount;
            if (bl2) return false;
            return true;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void peek(QueueFile$ElementReader queueFile$ElementReader) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        int n3 = this.elementCount;
                        if (n3 <= 0) break block4;
                        QueueFile$Element queueFile$Element = this.first;
                        QueueFile$ElementInputStream queueFile$ElementInputStream = new QueueFile$ElementInputStream(this, queueFile$Element, null);
                        queueFile$Element = this.first;
                        int n4 = queueFile$Element.length;
                        queueFile$ElementReader.read(queueFile$ElementInputStream, n4);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] peek() {
        synchronized (this) {
            int n3 = this.isEmpty();
            if (n3 != 0) {
                return null;
            }
            QueueFile$Element queueFile$Element = this.first;
            int n4 = queueFile$Element.length;
            byte[] byArray = new byte[n4];
            n3 = queueFile$Element.position + 4;
            this.ringRead(n3, byArray, 0, n4);
            return byArray;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void remove() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block7: {
                    try {
                        int n3 = this.isEmpty();
                        if (n3 != 0) break block7;
                        n3 = this.elementCount;
                        int n4 = 1;
                        if (n3 == n4) {
                            this.clear();
                        } else {
                            QueueFile$Element queueFile$Element;
                            QueueFile$Element queueFile$Element2 = this.first;
                            int n7 = queueFile$Element2.position;
                            int n8 = 4;
                            n7 += n8;
                            n3 = queueFile$Element2.length;
                            n7 += n3;
                            n3 = this.wrapPosition(n7);
                            byte[] byArray = this.buffer;
                            int n10 = 0;
                            this.ringRead(n3, byArray, 0, n8);
                            byArray = this.buffer;
                            n7 = QueueFile.readInt(byArray, 0);
                            n8 = this.fileLength;
                            n10 = this.elementCount - n4;
                            QueueFile$Element queueFile$Element3 = this.last;
                            int n14 = queueFile$Element3.position;
                            this.writeHeader(n8, n10, n3, n14);
                            n8 = this.elementCount - n4;
                            this.elementCount = n8;
                            this.first = queueFile$Element = new QueueFile$Element(n3, n7);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    return;
                }
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                throw noSuchElementException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int size() {
        synchronized (this) {
            return this.elementCount;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getClass().getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append("[fileLength=");
        int n3 = this.fileLength;
        stringBuilder.append(n3);
        stringBuilder.append(", size=");
        n3 = this.elementCount;
        stringBuilder.append(n3);
        stringBuilder.append(", first=");
        object = this.first;
        stringBuilder.append(object);
        stringBuilder.append(", last=");
        object = this.last;
        stringBuilder.append(object);
        object = ", element lengths=[";
        stringBuilder.append((String)object);
        object = new QueueFile$1(this, stringBuilder);
        try {
            this.forEach((QueueFile$ElementReader)object);
        }
        catch (IOException iOException) {
            Logger logger = LOGGER;
            Level level = Level.WARNING;
            String string2 = "read error";
            logger.log(level, string2, iOException);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

    public int usedBytes() {
        int n3 = this.elementCount;
        int n4 = 16;
        if (n3 == 0) {
            return n4;
        }
        QueueFile$Element queueFile$Element = this.last;
        int n7 = queueFile$Element.position;
        QueueFile$Element queueFile$Element2 = this.first;
        int n8 = queueFile$Element2.position;
        if (n7 >= n8) {
            n7 = n7 - n8 + 4;
            n3 = queueFile$Element.length;
            return n7 + n3 + n4;
        }
        n7 += 4;
        n3 = queueFile$Element.length;
        n7 += n3;
        n3 = this.fileLength;
        return n7 + n3 - n8;
    }
}

