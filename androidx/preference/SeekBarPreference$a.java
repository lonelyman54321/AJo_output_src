/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package androidx.preference;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

public final class SeekBarPreference$a
implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference a;

    public SeekBarPreference$a(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public final void onProgressChanged(SeekBar seekBar, int n3, boolean bl2) {
        SeekBarPreference seekBarPreference = this.a;
        if (bl2 && ((bl2 = seekBarPreference.J) || !(bl2 = seekBarPreference.E))) {
            seekBarPreference.l(seekBar);
        } else {
            int n4 = seekBarPreference.B;
            n3 += n4;
            seekBar = seekBarPreference.G;
            if (seekBar != null) {
                String string2 = String.valueOf(n3);
                seekBar.setText((CharSequence)string2);
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.E = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.E = false;
        int n3 = seekBar.getProgress();
        int n4 = seekBarPreference.B;
        if ((n3 += n4) != (n4 = seekBarPreference.A)) {
            seekBarPreference.l(seekBar);
        }
    }
}

