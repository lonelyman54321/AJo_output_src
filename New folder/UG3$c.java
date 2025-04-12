/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 */
import android.view.View;
import android.view.Window;

public final class UG3$c
extends UG3$b {
    public final boolean c() {
        View view = this.a.getDecorView();
        int n3 = view.getSystemUiVisibility() & 0x10;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    public final void e(boolean bl2) {
        int n3 = 16;
        if (bl2) {
            Window window = this.a;
            window.clearFlags(0x8000000);
            int n4 = -1 << -1;
            window.addFlags(n4);
            this.i(n3);
        } else {
            this.j(n3);
        }
    }
}

