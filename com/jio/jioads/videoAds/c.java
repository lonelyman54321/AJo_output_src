/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videoAds;

import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.source.d;
import androidx.media3.ui.PlayerView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.videoAds.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

public final class c
extends Lambda
implements Function0 {
    public final /* synthetic */ h c;

    public c(h h3) {
        this.c = h3;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        String string2;
        Object object;
        Exception exception2;
        StringBuilder stringBuilder;
        block14: {
            Object object2;
            block13: {
                try {
                    object2 = this.c;
                    ((h)object2).l();
                    object2 = this.c;
                    object2 = ((h)object2).k;
                    stringBuilder = null;
                    if (object2 == null) break block13;
                    ((p)object2).setVideoSurfaceView(null);
                }
                catch (Exception exception2) {
                    break block14;
                }
            }
            object2 = this.c;
            object2 = ((h)object2).k;
            if (object2 != null) {
                ((p)object2).setVideoTextureView(null);
            }
            object2 = this.c;
            object2 = ((h)object2).k;
            if (object2 != null) {
                ((p)object2).stop();
            }
            object2 = this.c;
            object2 = ((h)object2).k;
            if (object2 != null) {
                ((p)object2).release();
            }
            object2 = this.c;
            h.i((h)object2);
            object2 = this.c;
            object = ((h)object2).y;
            if (object != null) {
                object.cancel();
            }
            ((h)object2).y = null;
            object2 = this.c;
            object2 = ((h)object2).n;
            if (object2 != null) {
                ((ArrayList)object2).clear();
            }
            object2 = this.c;
            object2 = ((h)object2).p;
            if (object2 != null) {
                synchronized (object2) {
                    int n3 = ((d)object2).I();
                    string2 = null;
                    ((d)object2).J(0, n3);
                }
            }
            object2 = this.c;
            ((h)object2).p = null;
            ((h)object2).k = null;
            ((h)object2).n = null;
            object2 = ((h)object2).l;
            if (object2 != null && (object2 = ((PlayerView)((Object)object2)).getPlayer()) != null) {
                object2.release();
            }
            object2 = this.c;
            ((h)object2).l = null;
            ((h)object2).m = null;
            ((h)object2).w = null;
            return Unit.a;
        }
        stringBuilder = new StringBuilder();
        object = this.c.c;
        string2 = ": Exception while cleanUp in ";
        j_0.n((b)object, stringBuilder, string2);
        object = Reflection.getOrCreateKotlinClass(this.c.getClass()).getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append(" : ");
        object = "<this>";
        Intrinsics.checkNotNullParameter(exception2, (String)object);
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return Unit.a;
    }
}

