/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsController
 */
import android.view.WindowInsetsController;

public final class UG3$f
extends UG3$e {
    public final boolean c() {
        WindowInsetsController windowInsetsController = this.a;
        int n3 = WG3.a(windowInsetsController) & 0x10;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            windowInsetsController = null;
        }
        return n3 != 0;
    }

    public final boolean d() {
        WindowInsetsController windowInsetsController = this.a;
        int n3 = WG3.a(windowInsetsController) & 8;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            windowInsetsController = null;
        }
        return n3 != 0;
    }
}

