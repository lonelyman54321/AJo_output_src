/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.installations;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.channels.spi.AbstractInterruptibleChannel;

class CrossProcessLock {
    private static final String TAG = "CrossProcessLock";
    private final FileChannel channel;
    private final FileLock lock;

    private CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
        this.channel = fileChannel;
        this.lock = fileLock;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CrossProcessLock acquire(Context object, String object2) {
        block11: {
            try {
                object = object.getFilesDir();
                Object object3 = new File((File)object, (String)object2);
                object2 = "rw";
                object = new RandomAccessFile((File)object3, (String)object2);
                object = ((RandomAccessFile)object).getChannel();
            }
            catch (IOException | Error | OverlappingFileLockException throwable) {
                object = null;
                object2 = null;
                break block11;
            }
            try {
                object2 = ((FileChannel)object).lock();
            }
            catch (IOException | Error | OverlappingFileLockException throwable) {
                object2 = null;
                break block11;
            }
            try {
                return new CrossProcessLock((FileChannel)object, (FileLock)object2);
            }
            catch (IOException | Error | OverlappingFileLockException throwable) {}
        }
        if (object2 != null) {
            try {
                ((FileLock)object2).release();
            }
            catch (IOException iOException) {}
        }
        if (object == null) return null;
        try {
            ((AbstractInterruptibleChannel)object).close();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void releaseAndClose() {
        AutoCloseable autoCloseable;
        try {
            autoCloseable = this.lock;
        }
        catch (IOException iOException) {
            return;
        }
        ((FileLock)autoCloseable).release();
        autoCloseable = this.channel;
        ((AbstractInterruptibleChannel)autoCloseable).close();
    }
}

