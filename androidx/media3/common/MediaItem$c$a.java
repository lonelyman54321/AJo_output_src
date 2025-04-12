/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.common;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.UUID;

public final class MediaItem$c$a {
    public UUID a;
    public Uri b;
    public ImmutableMap c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ImmutableList g;
    public byte[] h;

    public MediaItem$c$a() {
        Serializable serializable;
        this.c = serializable = ImmutableMap.of();
        this.e = true;
        serializable = ImmutableList.of();
        this.g = serializable;
    }
}

