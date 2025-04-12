/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video;

import com.jio.jioads.instream.video.InstreamVideo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends FunctionReferenceImpl
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (HashMap)object;
        object2 = (String)object2;
        Intrinsics.checkNotNullParameter(object, "p0");
        Intrinsics.checkNotNullParameter(object2, "p1");
        InstreamVideo.access$onResponseReceivedForInfiniteAdPod((InstreamVideo)this.receiver, (HashMap)object, (String)object2);
        return Unit.a;
    }
}

