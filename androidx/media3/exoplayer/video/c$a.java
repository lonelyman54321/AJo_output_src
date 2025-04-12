/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import androidx.media3.exoplayer.video.c$e;
import androidx.media3.exoplayer.video.c$f;
import androidx.media3.exoplayer.video.d;
import com.google.common.collect.ImmutableList;

public final class c$a {
    public final Context a;
    public final d b;
    public c.e c;
    public c.f d;
    public final ImmutableList e;
    public VV f;
    public boolean g;

    public c$a(Context object, d d2) {
        this.a = object = object.getApplicationContext();
        this.b = d2;
        object = ImmutableList.of();
        this.e = object;
        object = VV.a;
        this.f = object;
    }
}

