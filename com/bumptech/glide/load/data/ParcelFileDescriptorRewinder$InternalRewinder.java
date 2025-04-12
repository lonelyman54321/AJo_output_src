/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 *  android.system.ErrnoException
 *  android.system.Os
 *  android.system.OsConstants
 */
package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.IOException;

final class ParcelFileDescriptorRewinder$InternalRewinder {
    public final ParcelFileDescriptor a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        Object object;
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        try {
            object = parcelFileDescriptor.getFileDescriptor();
        }
        catch (ErrnoException errnoException) {
            object = new IOException(errnoException);
            throw object;
        }
        int n3 = OsConstants.SEEK_SET;
        long l2 = 0L;
        Os.lseek((FileDescriptor)object, (long)l2, (int)n3);
        return parcelFileDescriptor;
    }
}

