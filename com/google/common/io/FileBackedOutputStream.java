/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource;
import com.google.common.io.FileBackedOutputStream$1;
import com.google.common.io.FileBackedOutputStream$2;
import com.google.common.io.FileBackedOutputStream$MemoryOutput;
import com.google.common.io.TempFileCreator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;

public final class FileBackedOutputStream
extends OutputStream {
    private File file;
    private final int fileThreshold;
    private FileBackedOutputStream$MemoryOutput memory;
    private OutputStream out;
    private final boolean resetOnFinalize;
    private final ByteSource source;

    public FileBackedOutputStream(int n3) {
        this(n3, false);
    }

    public FileBackedOutputStream(int n3, boolean bl2) {
        boolean bl3 = n3 >= 0;
        String string2 = "fileThreshold must be non-negative, but was %s";
        Preconditions.checkArgument(bl3, string2, n3);
        this.fileThreshold = n3;
        this.resetOnFinalize = bl2;
        bl3 = false;
        Object object = new FileBackedOutputStream$MemoryOutput(null);
        this.memory = object;
        this.out = object;
        this.source = bl2 ? (object = new FileBackedOutputStream$1(this)) : (object = new FileBackedOutputStream$2(this));
    }

    public static /* synthetic */ InputStream access$100(FileBackedOutputStream fileBackedOutputStream) {
        return fileBackedOutputStream.openInputStream();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private InputStream openInputStream() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                try {
                    object = this.file;
                    if (object != null) {
                        File file = this.file;
                        return new FileInputStream(file);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = this.memory;
                Objects.requireNonNull(object);
                Object object2 = this.memory;
                object2 = ((FileBackedOutputStream$MemoryOutput)object2).getBuffer();
                FileBackedOutputStream$MemoryOutput fileBackedOutputStream$MemoryOutput = this.memory;
                int n3 = fileBackedOutputStream$MemoryOutput.getCount();
                return new ByteArrayInputStream((byte[])object2, 0, n3);
            }
            throw throwable2;
        }
    }

    private void update(int n3) {
        int n4;
        Object object = this.memory;
        if (object != null && (n4 = ((FileBackedOutputStream$MemoryOutput)object).getCount() + n3) > (n3 = this.fileThreshold)) {
            Object object2;
            Object object3 = TempFileCreator.INSTANCE;
            object = "FileBackedOutputStream";
            object3 = ((TempFileCreator)object3).createTempFile((String)object);
            n4 = (int)(this.resetOnFinalize ? 1 : 0);
            if (n4 != 0) {
                ((File)object3).deleteOnExit();
            }
            try {
                object = new FileOutputStream((File)object3);
                object2 = this.memory;
            }
            catch (IOException iOException) {
                ((File)object3).delete();
                throw iOException;
            }
            object2 = ((FileBackedOutputStream$MemoryOutput)object2).getBuffer();
            FileBackedOutputStream$MemoryOutput fileBackedOutputStream$MemoryOutput = this.memory;
            int n7 = fileBackedOutputStream$MemoryOutput.getCount();
            ((FileOutputStream)object).write((byte[])object2, 0, n7);
            ((OutputStream)object).flush();
            this.out = object;
            this.file = object3;
            n3 = 0;
            object3 = null;
            this.memory = null;
        }
    }

    public ByteSource asByteSource() {
        return this.source;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        synchronized (this) {
            OutputStream outputStream = this.out;
            outputStream.close();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void flush() {
        synchronized (this) {
            OutputStream outputStream = this.out;
            outputStream.flush();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public File getFile() {
        synchronized (this) {
            return this.file;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reset() {
        Object object = "Could not delete: ";
        String string2 = "Could not delete: ";
        synchronized (this) {
            Throwable throwable3;
            block13: {
                Serializable serializable;
                boolean bl2;
                block12: {
                    block11: {
                        bl2 = false;
                        serializable = null;
                        try {
                            this.close();
                        }
                        catch (Throwable throwable2) {
                            Object object2 = this.memory;
                            if (object2 == null) {
                                object2 = new FileBackedOutputStream$MemoryOutput(null);
                                this.memory = object2;
                            } else {
                                object2 = this.memory;
                                ((ByteArrayOutputStream)object2).reset();
                            }
                            object2 = this.memory;
                            this.out = object2;
                            object2 = this.file;
                            if (object2 != null) {
                                this.file = null;
                                bl2 = ((File)object2).delete();
                                if (!bl2) {
                                    serializable = new StringBuilder((String)object);
                                    ((StringBuilder)serializable).append(object2);
                                    object = ((StringBuilder)serializable).toString();
                                    IOException iOException = new IOException((String)object);
                                    throw iOException;
                                }
                            }
                            throw throwable2;
                        }
                        try {
                            object = this.memory;
                            if (object != null) break block11;
                            this.memory = object = new FileBackedOutputStream$MemoryOutput(null);
                            break block12;
                        }
                        catch (Throwable throwable3) {
                            break block13;
                        }
                    }
                    ((ByteArrayOutputStream)object).reset();
                }
                this.out = object = this.memory;
                object = this.file;
                if (object != null) {
                    this.file = null;
                    bl2 = ((File)object).delete();
                    if (!bl2) {
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        stringBuilder.append(object);
                        object = stringBuilder.toString();
                        serializable = new IOException((String)object);
                        throw serializable;
                    }
                }
                return;
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(int n3) {
        synchronized (this) {
            int n4 = 1;
            this.update(n4);
            OutputStream outputStream = this.out;
            outputStream.write(n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(byte[] byArray) {
        synchronized (this) {
            int n3 = byArray.length;
            this.write(byArray, 0, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(byte[] byArray, int n3, int n4) {
        synchronized (this) {
            this.update(n4);
            OutputStream outputStream = this.out;
            outputStream.write(byArray, n3, n4);
            return;
        }
    }
}

