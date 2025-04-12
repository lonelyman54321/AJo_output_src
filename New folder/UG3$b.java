/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 */
import android.view.View;
import android.view.Window;

public class UG3$b
extends UG3$a {
    public final boolean d() {
        View view = this.a.getDecorView();
        int n3 = view.getSystemUiVisibility() & 0x2000;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    public final void f(boolean bl2) {
        int n3 = 8192;
        if (bl2) {
            Window window = this.a;
            window.clearFlags(0x4000000);
            int n4 = -1 << -1;
            window.addFlags(n4);
            this.i(n3);
        } else {
            this.j(n3);
        }
    }
}

