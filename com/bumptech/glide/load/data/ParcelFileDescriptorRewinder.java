/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;
import com.bumptech.glide.load.data.a;

public final class ParcelFileDescriptorRewinder
implements a {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptorRewinder$InternalRewinder parcelFileDescriptorRewinder$InternalRewinder;
        this.a = parcelFileDescriptorRewinder$InternalRewinder = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final Object a() {
        return this.a.rewind();
    }

    public final void b() {
    }

    public final ParcelFileDescriptor c() {
        return this.a.rewind();
    }
}

