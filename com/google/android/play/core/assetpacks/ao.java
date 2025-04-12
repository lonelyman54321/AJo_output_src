/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.am;
import com.google.android.play.core.assetpacks.ax;

final class ao
extends am {
    public ao(ax ax2, TaskCompletionSource taskCompletionSource) {
        super(ax2, taskCompletionSource);
    }

    public final void e(Bundle bundle, Bundle bundle2) {
        super.e(bundle, bundle2);
        bundle = (ParcelFileDescriptor)bundle.getParcelable("chunk_file_descriptor");
        this.a.trySetResult(bundle);
    }
}

