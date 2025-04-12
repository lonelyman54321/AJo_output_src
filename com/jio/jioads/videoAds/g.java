/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videoAds;

import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.source.j;
import com.jio.jioads.videoAds.h;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g
extends Lambda
implements Function0 {
    public final /* synthetic */ h c;

    public g(h h3) {
        this.c = h3;
        super(0);
    }

    public final Object invoke() {
        h h3 = this.c;
        int n3 = h3.e;
        if (n3 != 0) {
            n3 = 0;
            h3.e = false;
            p p2 = h3.k;
            if (p2 != null) {
                Object object;
                int n4 = h3.q;
                boolean bl2 = true;
                if (n4 > 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                h3.f = n4;
                h3.o = object = JioPlayerState.PREPARING;
                p2.setPlayWhenReady(false);
                object = h3.p;
                Intrinsics.checkNotNull(object);
                p2.setMediaSource((j)object, bl2);
                p2.prepare();
                long l2 = -9223372036854775807L;
                p2.seekTo(0, l2);
                n4 = (int)(h3.j ? 1 : 0);
                if (n4 != 0 && (n4 = h3.q) > 0) {
                    n3 = 1;
                }
                p2.setPlayWhenReady(n3 != 0);
                n3 = h3.q;
                if (n3 > 0) {
                    h3.q = n3 += -1;
                }
            }
        }
        return Unit.a;
    }
}

