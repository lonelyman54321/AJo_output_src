/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  android.view.Display
 */
import android.hardware.display.DisplayManager;
import android.view.Display;

public final class OB3$a
implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ OB3 b;

    public OB3$a(OB3 oB3, DisplayManager displayManager) {
        this.b = oB3;
        this.a = displayManager;
    }

    public final void onDisplayAdded(int n3) {
    }

    public final void onDisplayChanged(int n3) {
        if (n3 == 0) {
            Display display = this.a.getDisplay(0);
            OB3 oB3 = this.b;
            OB3.a(oB3, display);
        }
    }

    public final void onDisplayRemoved(int n3) {
    }
}

