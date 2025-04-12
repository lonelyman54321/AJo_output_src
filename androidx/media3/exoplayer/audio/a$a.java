/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 */
package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import androidx.media3.exoplayer.audio.a;
import java.util.Objects;

public final class a$a
extends AudioDeviceCallback {
    public final /* synthetic */ a a;

    public a$a(a a2) {
        this.a = a2;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] object) {
        object = this.a;
        Object object2 = ((a)object).a;
        dr_1 dr_12 = ((a)object).i;
        rr_0 rr_02 = ((a)object).h;
        object2 = or_0.b(object2, dr_12, rr_02);
        ((a)object).a((or_0)object2);
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] object) {
        Object object2 = this.a.h;
        int n3 = gz3.a;
        n3 = ((AudioDeviceInfo[])object).length;
        rr_0 rr_02 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            AudioDeviceInfo audioDeviceInfo = object[i3];
            boolean bl2 = Objects.equals(audioDeviceInfo, object2);
            if (!bl2) continue;
            object = this.a;
            object2 = null;
            ((a)object).h = null;
            break;
        }
        object = this.a;
        object2 = ((a)object).a;
        dr_1 dr_12 = ((a)object).i;
        rr_02 = ((a)object).h;
        object2 = or_0.b((Context)object2, dr_12, rr_02);
        ((a)object).a((or_0)object2);
    }
}

