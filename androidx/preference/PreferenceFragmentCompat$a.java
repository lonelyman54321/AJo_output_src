/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package androidx.preference;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.PreferenceFragmentCompat;

public final class PreferenceFragmentCompat$a
extends Handler {
    public final /* synthetic */ PreferenceFragmentCompat a;

    public PreferenceFragmentCompat$a(PreferenceFragmentCompat preferenceFragmentCompat, Looper looper) {
        this.a = preferenceFragmentCompat;
        super(looper);
    }

    public final void handleMessage(Message object) {
        int n3 = ((Message)object).what;
        int n4 = 1;
        if (n3 == n4) {
            object = this.a.b;
            object.getClass();
        }
    }
}

