/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video;

import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.instream.video.InstreamVideo;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m
extends Lambda
implements Function2 {
    public final /* synthetic */ InstreamVideo c;

    public m(InstreamVideo instreamVideo) {
        this.c = instreamVideo;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        c c2 = InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object3);
        object3 = InstreamVideo.access$getHeaders((InstreamVideo)object3);
        return ((f)c2).f((String)object, (String)object2, (Map)object3);
    }
}

