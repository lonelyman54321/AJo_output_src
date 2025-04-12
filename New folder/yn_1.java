/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 */
import android.widget.SeekBar;
import androidx.viewpager2.widget.ViewPager2$g;

/*
 * Renamed from YN
 */
public final class yn_1
extends ViewPager2$g {
    public final /* synthetic */ zn_1 a;

    public yn_1(zn_1 zn_12) {
        this.a = zn_12;
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
        super.onPageScrolled(n3, f5, n4);
        SeekBar seekBar = this.a.g;
        if (seekBar != null) {
            seekBar.setProgress(++n3);
        }
    }
}

