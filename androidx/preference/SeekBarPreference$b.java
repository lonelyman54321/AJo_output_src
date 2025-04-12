/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
package androidx.preference;

import android.view.KeyEvent;
import android.view.View;
import androidx.preference.SeekBarPreference;

public final class SeekBarPreference$b
implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference a;

    public SeekBarPreference$b(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public final boolean onKey(View object, int n3, KeyEvent keyEvent) {
        int n4 = keyEvent.getAction();
        if (n4 != 0) {
            return false;
        }
        object = this.a;
        int n7 = object.H;
        if (n7 == 0 && (n3 == (n7 = 21) || n3 == (n7 = 22))) {
            return false;
        }
        n7 = 23;
        if (n3 != n7 && n3 != (n7 = 66)) {
            object = object.F;
            if (object == null) {
                return false;
            }
            return object.onKeyDown(n3, keyEvent);
        }
        return false;
    }
}

