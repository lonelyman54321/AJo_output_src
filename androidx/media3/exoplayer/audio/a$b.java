/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 *  android.os.Handler
 */
package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.audio.a;

public final class a$b
extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ a c;

    public a$b(a a2, Handler handler, ContentResolver contentResolver, Uri uri) {
        this.c = a2;
        super(handler);
        this.a = contentResolver;
        this.b = uri;
    }

    public final void onChange(boolean bl2) {
        a a2 = this.c;
        Object object = a2.a;
        dr_1 dr_12 = a2.i;
        rr_0 rr_02 = a2.h;
        object = or_0.b(object, dr_12, rr_02);
        a2.a((or_0)object);
    }
}

