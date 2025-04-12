/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings$Global
 */
package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.media3.exoplayer.audio.a$a;
import androidx.media3.exoplayer.audio.a$b;
import androidx.media3.exoplayer.audio.a$c;
import androidx.media3.exoplayer.audio.a$d;
import java.util.Objects;

public final class a {
    public final Context a;
    public final a$d b;
    public final Handler c;
    public final a$a d;
    public final a$c e;
    public final a$b f;
    public or_0 g;
    public rr_0 h;
    public dr_1 i;
    public boolean j;

    public a(Context context, Tk0 object, dr_1 dr_12, rr_0 object2) {
        this.a = context = context.getApplicationContext();
        this.b = object;
        this.i = dr_12;
        this.h = object2;
        int n3 = gz3.a;
        object = Looper.myLooper();
        if (object == null) {
            object = Looper.getMainLooper();
        }
        object2 = null;
        super((Looper)object, null);
        this.c = dr_12;
        n3 = gz3.a;
        int n4 = 23;
        if (n3 >= n4) {
            super(this);
        } else {
            n3 = 0;
            object = null;
        }
        this.d = object;
        super(this);
        this.e = object;
        object = or_0.c;
        object = gz3.c;
        String string2 = "Amazon";
        n4 = (int)(string2.equals(object) ? 1 : 0);
        if (n4 == 0 && (n3 = (int)((string2 = "Xiaomi").equals(object) ? 1 : 0)) == 0) {
            n3 = 0;
            object = null;
        } else {
            object = Settings.Global.getUriFor((String)"external_surround_sound_enabled");
        }
        if (object != null) {
            context = context.getContentResolver();
            super(this, (Handler)dr_12, (ContentResolver)context, (Uri)object);
        }
        this.f = object2;
    }

    public final void a(or_0 or_02) {
        Object object;
        boolean bl2 = this.j;
        if (bl2 && !(bl2 = or_02.equals(object = this.g))) {
            this.g = or_02;
            object = this.b;
            object.a(or_02);
        }
    }

    public final void b(AudioDeviceInfo object) {
        boolean bl2;
        Object object2 = this.h;
        rr_0 rr_02 = null;
        if (object2 == null) {
            bl2 = false;
            object2 = null;
        } else {
            object2 = ((rr_0)object2).a;
        }
        bl2 = Objects.equals(object, object2);
        if (bl2) {
            return;
        }
        if (object != null) {
            rr_02 = new rr_0((AudioDeviceInfo)object);
        }
        this.h = rr_02;
        object = this.a;
        object2 = this.i;
        object = or_0.b((Context)object, (dr_1)object2, rr_02);
        this.a((or_0)object);
    }
}

