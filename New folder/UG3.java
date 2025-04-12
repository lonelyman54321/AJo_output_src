/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsetsController
 */
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class UG3 {
    public final UG3$g a;

    public UG3(View object, Window window) {
        c93 c932 = new c93((View)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 35;
        if (n3 >= n4) {
            super(window, c932);
            this.a = object;
        } else {
            n4 = 30;
            if (n3 >= n4) {
                super(window, c932);
                this.a = object;
            } else {
                n4 = 26;
                if (n3 >= n4) {
                    super(window, c932);
                    this.a = object;
                } else {
                    n4 = 23;
                    if (n3 >= n4) {
                        super(window, c932);
                        this.a = object;
                    } else {
                        super(window, c932);
                        this.a = object;
                    }
                }
            }
        }
    }

    public UG3(WindowInsetsController windowInsetsController) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 35;
        if (n3 >= n4) {
            UG3$f uG3$f;
            c93 c932 = new c93(windowInsetsController);
            super(windowInsetsController, c932);
            this.a = uG3$f;
        } else {
            c93 c933 = new c93(windowInsetsController);
            UG3$d uG3$d = new UG3$d(windowInsetsController, c933);
            this.a = uG3$d;
        }
    }
}

