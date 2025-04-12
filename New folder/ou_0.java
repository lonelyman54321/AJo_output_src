/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/*
 * Renamed from oU
 */
public final class ou_0
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Chip a;

    public /* synthetic */ ou_0(Chip chip) {
        this.a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        Chip.a(this.a, compoundButton, bl2);
    }
}

