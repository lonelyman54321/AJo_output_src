/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsetsController
 */
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public class UG3$d
extends UG3$g {
    public final WindowInsetsController a;
    public final c93 b;
    public final Window c;

    public UG3$d(Window window, c93 c932) {
        WindowInsetsController windowInsetsController = G31.a(window);
        this(windowInsetsController, c932);
        this.c = window;
    }

    public UG3$d(WindowInsetsController windowInsetsController, c93 c932) {
        new a53();
        this.a = windowInsetsController;
        this.b = c932;
    }

    public int a() {
        Object object = this.c;
        if (object != null) {
            int n3;
            object = object.getDecorView();
            int n4 = 356039078;
            if ((object = object.getTag(n4)) != null) {
                object = (Integer)object;
                n3 = (Integer)object;
            } else {
                n3 = 1;
            }
            return n3;
        }
        return kp0_0.a(this.a);
    }

    public final void b(int n3) {
        Object object;
        int n4 = n3 & 8;
        if (n4 != 0) {
            object = this.b.a;
            ((c93$a)object).a();
        }
        object = this.a;
        J31.a((WindowInsetsController)object, n3 &= 0xFFFFFFF7);
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void var2_5;
        VG3.a(this.a);
        WindowInsetsController windowInsetsController = this.a;
        int bl2 = WG3.a(windowInsetsController) & 0x10;
        if (bl2 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            windowInsetsController = null;
        }
        return (boolean)var2_5;
    }

    /*
     * WARNING - void declaration
     */
    public boolean d() {
        void var2_5;
        VG3.a(this.a);
        WindowInsetsController windowInsetsController = this.a;
        int bl2 = WG3.a(windowInsetsController) & 8;
        if (bl2 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            windowInsetsController = null;
        }
        return (boolean)var2_5;
    }

    public final void e(boolean bl2) {
        Window window = this.c;
        int n3 = 16;
        if (bl2) {
            if (window != null) {
                this.i(n3);
            }
            WindowInsetsController windowInsetsController = this.a;
            ZG3.a(windowInsetsController);
        } else {
            if (window != null) {
                this.j(n3);
            }
            WindowInsetsController windowInsetsController = this.a;
            ah3_0.a(windowInsetsController);
        }
    }

    public final void f(boolean bl2) {
        Window window = this.c;
        int n3 = 8192;
        if (bl2) {
            if (window != null) {
                this.i(n3);
            }
            WindowInsetsController windowInsetsController = this.a;
            lp0_0.b(windowInsetsController);
        } else {
            if (window != null) {
                this.j(n3);
            }
            WindowInsetsController windowInsetsController = this.a;
            YG3.a(windowInsetsController);
        }
    }

    public void g(int n3) {
        Window window = this.c;
        if (window != null) {
            window = window.getDecorView();
            Integer n4 = n3;
            int n7 = 356039078;
            window.setTag(n7, (Object)n4);
            if (n3 != 0) {
                int n8 = 1;
                int n10 = 4096;
                n7 = 2048;
                if (n3 != n8) {
                    n8 = 2;
                    if (n3 == n8) {
                        this.j(n7);
                        this.i(n10);
                    }
                } else {
                    this.j(n10);
                    this.i(n7);
                }
            } else {
                n3 = 6144;
                this.j(n3);
            }
        } else {
            window = this.a;
            XG3.a((WindowInsetsController)window, n3);
        }
    }

    public final void h(int n3) {
        Object object;
        int n4 = n3 & 8;
        if (n4 != 0) {
            object = this.b.a;
            ((c93$a)object).b();
        }
        object = this.a;
        K31.a((WindowInsetsController)object, n3 &= 0xFFFFFFF7);
    }

    public final void i(int n3) {
        View view = this.c.getDecorView();
        int n4 = view.getSystemUiVisibility();
        view.setSystemUiVisibility(n3 |= n4);
    }

    public final void j(int n3) {
        View view = this.c.getDecorView();
        int n4 = view.getSystemUiVisibility();
        n3 = ~n3 & n4;
        view.setSystemUiVisibility(n3);
    }
}

