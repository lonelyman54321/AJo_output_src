/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video;

import com.jio.jioads.instream.video.InstreamVideo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c
extends Lambda
implements Function0 {
    public final /* synthetic */ InstreamVideo c;

    public c(InstreamVideo instreamVideo) {
        this.c = instreamVideo;
        super(0);
    }

    public final Object invoke() {
        return InstreamVideo.access$getHeaders(this.c);
    }
}

