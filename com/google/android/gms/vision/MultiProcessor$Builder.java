/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.MultiProcessor$Factory;

public class MultiProcessor$Builder {
    private MultiProcessor zza;

    public MultiProcessor$Builder(MultiProcessor$Factory object) {
        MultiProcessor multiProcessor;
        this.zza = multiProcessor = new MultiProcessor(null);
        if (object != null) {
            MultiProcessor.zza(multiProcessor, (MultiProcessor$Factory)object);
            return;
        }
        object = new IllegalArgumentException("No factory supplied.");
        throw object;
    }

    public MultiProcessor build() {
        return this.zza;
    }

    public MultiProcessor$Builder setMaxGapFrames(int n3) {
        if (n3 >= 0) {
            MultiProcessor.zza(this.zza, n3);
            return this;
        }
        String string2 = tk3_2.a(28, n3, "Invalid max gap: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

