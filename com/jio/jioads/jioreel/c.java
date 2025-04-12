/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.media3.exoplayer.dash.manifest.DashManifest
 *  androidx.media3.exoplayer.hls.HlsManifest
 */
package com.jio.jioads.jioreel;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.hls.HlsManifest;
import com.jio.jioads.jioreel.JioReelConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class c
implements f$c {
    public final /* synthetic */ JioReelConfig a;

    public c(JioReelConfig jioReelConfig) {
        this.a = jioReelConfig;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final /* synthetic */ void D(int n3) {
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final /* synthetic */ void K(e e2) {
    }

    public final /* synthetic */ void M() {
    }

    public final /* synthetic */ void P(int n3, int n4) {
    }

    public final /* synthetic */ void Q(f$a f$a) {
    }

    public final /* synthetic */ void T(int n3, f$d f$d, f$d f$d2) {
    }

    public final /* synthetic */ void U(dr_1 dr_12) {
    }

    public final /* synthetic */ void V(Fp3 fp3) {
    }

    public final /* synthetic */ void W(boolean bl2) {
    }

    public final /* synthetic */ void Y(f f5, f$b f$b) {
    }

    public final /* synthetic */ void Z(int n3, boolean bl2) {
    }

    public final /* synthetic */ void a(wc3_0 wc3_02) {
    }

    public final /* synthetic */ void a0(float f5) {
    }

    public final void c0(g object, int n3) {
        Intrinsics.checkNotNullParameter(object, "timeline");
        object = this.a;
        Object object2 = JioReelConfig.access$getExoPlayer$p((JioReelConfig)object);
        if (object2 != null) {
            object2 = JioReelConfig.access$getExoPlayer$p((JioReelConfig)object);
            Intrinsics.checkNotNull(object2);
            n3 = (int)(object2.getPlayWhenReady() ? 1 : 0);
            if (n3 != 0) {
                object2 = JioReelConfig.access$getExoPlayer$p((JioReelConfig)object);
                Intrinsics.checkNotNull(object2);
                object2 = object2.getCurrentManifest();
                if (object2 != null) {
                    boolean bl2 = object2 instanceof HlsManifest;
                    if (bl2) {
                        object2 = (HlsManifest)object2;
                        JioReelConfig.access$readHLSManifest((JioReelConfig)object, (HlsManifest)object2);
                    } else {
                        bl2 = object2 instanceof DashManifest;
                        if (bl2) {
                            object2 = (DashManifest)object2;
                            JioReelConfig.access$readDASHManifest((JioReelConfig)object, (DashManifest)object2);
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ void e0(bq3 bq32) {
    }

    public final /* synthetic */ void g0(e e2) {
    }

    public final /* synthetic */ void h0(int n3, boolean bl2) {
    }

    public final /* synthetic */ void j(boolean bl2) {
    }

    public final /* synthetic */ void j0(ot2_0 ot2_02) {
    }

    public final /* synthetic */ void k0(PlaybackException playbackException) {
    }

    public final /* synthetic */ void l(List list) {
    }

    public final /* synthetic */ void o0(boolean bl2) {
    }

    public final /* synthetic */ void onRepeatModeChanged(int n3) {
    }

    public final /* synthetic */ void p(PlaybackException playbackException) {
    }

    public final /* synthetic */ void t(Ue0 ue0) {
    }

    public final /* synthetic */ void w(Metadata metadata) {
    }
}

