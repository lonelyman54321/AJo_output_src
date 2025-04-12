/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instream.video.InstreamVideo;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class f
extends FunctionReferenceImpl
implements jx0_2 {
    public final Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        Object object7 = object;
        object7 = (JioAdError)object;
        boolean bl2 = (Boolean)object2;
        Object object8 = object3;
        object8 = (d)((Object)object3);
        Object object9 = object4;
        object9 = (String)object4;
        Object object10 = object5;
        object10 = (String)object5;
        Object object11 = object6;
        object11 = (String)object6;
        Intrinsics.checkNotNullParameter(object7, "p0");
        Intrinsics.checkNotNullParameter(object8, "p2");
        Intrinsics.checkNotNullParameter(object9, "p3");
        Intrinsics.checkNotNullParameter(object10, "p4");
        Intrinsics.checkNotNullParameter(object11, "p5");
        object = this.receiver;
        InstreamVideo.access$onErrorForInfiniteAdPod((InstreamVideo)object, (JioAdError)object7, bl2, (d)((Object)object8), (String)object9, (String)object10, (String)object11);
        return Unit.a;
    }
}

