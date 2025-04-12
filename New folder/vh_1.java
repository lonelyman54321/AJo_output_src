/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RelativeLayout$LayoutParams
 */
import android.widget.RelativeLayout;

/*
 * Renamed from VH
 */
public class vh_1
extends rh_1 {
    public final RelativeLayout.LayoutParams cb() {
        int n3 = -1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n3, n3);
        n3 = this.j.getId();
        layoutParams.addRule(11, n3);
        n3 = this.j.getId();
        layoutParams.addRule(10, n3);
        n3 = this.Sa(40) / 4;
        layoutParams.setMargins(0, n3, n3, 0);
        return layoutParams;
    }
}

