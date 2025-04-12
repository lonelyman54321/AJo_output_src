/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.WindowInsetsController
 */
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

public final class c93 {
    public final c93$a a;

    public c93(View view) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            c93$b c93$b;
            super(view);
            c93$b.b = view;
            this.a = c93$b;
        } else {
            c93$a c93$a;
            this.a = c93$a = new c93$a(view);
        }
    }

    public c93(WindowInsetsController windowInsetsController) {
        c93$b c93$b;
        super(null);
        c93$b.c = windowInsetsController;
        this.a = c93$b;
    }
}

