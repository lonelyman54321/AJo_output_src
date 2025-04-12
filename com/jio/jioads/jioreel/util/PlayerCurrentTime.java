/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.util;

import androidx.media3.common.g;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.ExoPlayer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

public final class PlayerCurrentTime {
    public SimpleDateFormat a;
    public Long b;
    public SimpleDateFormat c;
    public Date d;
    public SimpleDateFormat e;
    public final String f;
    public String g;
    public String h;
    public final String i;
    public String j;
    public final String k;
    public final String l;
    public final String m;

    public PlayerCurrentTime() {
        String string2;
        this.f = "UTC";
        this.i = string2 = "yyyy-MM-dd HH:mm:ss Z";
        this.k = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        this.l = string2;
        this.m = "HH:mm:ss Z";
    }

    public final long getCurrentLiveOffset(ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "_playerID");
        g$c g$c = new g$c();
        Object object = exoPlayer.getCurrentTimeline();
        int n3 = exoPlayer.getCurrentMediaItemIndex();
        object = ((g)object).n(n3, g$c, 0L);
        long l2 = ((g$c)object).f;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            l2 = System.currentTimeMillis();
            l3 = g$c.f;
            l2 -= l3;
            l3 = exoPlayer.getCurrentPosition();
            l3 = l2 - l3;
        }
        return l3;
    }

    public final Long getLiveWindowTime$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(ExoPlayer object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "player");
        Cloneable cloneable = Locale.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", (Locale)cloneable);
        cloneable = TimeZone.getTimeZone("UTC");
        simpleDateFormat.setTimeZone((TimeZone)cloneable);
        long l2 = 0L;
        long l3 = 0L;
        object = this.getPlayerCurrentTime((ExoPlayer)object, bl2, l2, l3);
        bl2 = false;
        Long l4 = null;
        if (object != null && (object = simpleDateFormat.parse((String)object)) != null) {
            long l7 = ((Date)object).getTime();
            l4 = l7;
        }
        return l4;
    }

    public final String getPlayerCurrentTime(ExoPlayer object, boolean bl2, long l2, long l3) {
        Object object2;
        Object object3 = this.i;
        Object object4 = new SimpleDateFormat((String)object3);
        this.a = object4;
        Intrinsics.checkNotNull(object4);
        object3 = TimeZone.getTimeZone(this.f);
        ((DateFormat)object4).setTimeZone((TimeZone)object3);
        Object object5 = l3;
        this.b = object5;
        if (object != null) {
            object2 = new g$c();
            int n3 = object.getCurrentMediaItemIndex();
            object5 = object.getCurrentTimeline();
            ((g)object5).o(n3, (g$c)object2);
            if (bl2) {
                l2 = System.currentTimeMillis();
                l3 = this.getCurrentLiveOffset((ExoPlayer)object);
                this.b = object = Long.valueOf(l3);
            } else {
                l2 = ((g$c)object2).a();
                l3 = object.getCurrentLiveOffset();
                this.b = object = Long.valueOf(l3);
            }
        }
        this.c = object = new SimpleDateFormat("yyyy-MM-dd");
        Intrinsics.checkNotNull(object);
        object5 = TimeZone.getTimeZone(this.f);
        ((DateFormat)object).setTimeZone((TimeZone)object5);
        object = this.c;
        Intrinsics.checkNotNull(object);
        object5 = new Date();
        object = ((DateFormat)object).format((Date)object5);
        Object object6 = this.b;
        Intrinsics.checkNotNull(object6);
        long l4 = (Long)object6;
        this.d = object5 = new Date(l4);
        object6 = this.m;
        this.e = object5 = new SimpleDateFormat((String)object6);
        Intrinsics.checkNotNull(object5);
        object6 = TimeZone.getTimeZone(this.f);
        ((DateFormat)object5).setTimeZone((TimeZone)object6);
        object5 = this.e;
        Intrinsics.checkNotNull(object5);
        object6 = this.d;
        this.h = object5 = ((DateFormat)object5).format((Date)object6);
        object5 = new StringBuilder();
        ((StringBuilder)object5).append((String)object);
        char c2 = ' ';
        ((StringBuilder)object5).append(c2);
        object4 = this.h;
        ((StringBuilder)object5).append((String)object4);
        this.g = object5 = ((StringBuilder)object5).toString();
        object4 = this.i;
        object5 = new SimpleDateFormat((String)object4);
        object4 = this.g;
        Object object7 = this.i;
        Locale locale = Locale.ENGLISH;
        object3 = new SimpleDateFormat((String)object7, locale);
        object4 = ((DateFormat)object3).parse((String)object4);
        object5 = ((DateFormat)object5).format((Date)object4);
        object4 = this.a;
        Intrinsics.checkNotNull(object4);
        object5 = ((DateFormat)object4).parse((String)object5);
        object4 = this.a;
        Intrinsics.checkNotNull(object4);
        object3 = this.a;
        Intrinsics.checkNotNull(object3);
        if (bl2) {
            l2 = System.currentTimeMillis();
        }
        object7 = new Date(l2);
        Object object8 = ((DateFormat)object3).format((Date)object7);
        long l7 = ((DateFormat)object4).parse((String)object8).getTime();
        long l8 = ((Date)object5).getTime();
        Date date = new Date(l7 -= l8);
        object2 = this.m;
        object8 = new SimpleDateFormat((String)object2);
        object2 = TimeZone.getTimeZone(this.f);
        ((DateFormat)object8).setTimeZone((TimeZone)object2);
        object8 = ((DateFormat)object8).format(date);
        Intrinsics.checkNotNullExpressionValue(object8, "format(...)");
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(c2);
        ((StringBuilder)object2).append((String)object8);
        this.j = object = ((StringBuilder)object2).toString();
        object8 = this.l;
        object = new SimpleDateFormat((String)object8);
        object2 = this.k;
        object8 = new SimpleDateFormat((String)object2);
        object2 = TimeZone.getTimeZone(this.f);
        ((DateFormat)object8).setTimeZone((TimeZone)object2);
        object2 = this.j;
        object = ((DateFormat)object).parse((String)object2);
        this.j = object = ((DateFormat)object8).format((Date)object);
        return object;
    }
}

