/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.data.a$a;

public final class ParcelFileDescriptorRewinder$a
implements a$a {
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    public final a b(Object object) {
        object = (ParcelFileDescriptor)object;
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = new ParcelFileDescriptorRewinder((ParcelFileDescriptor)object);
        return parcelFileDescriptorRewinder;
    }
}

