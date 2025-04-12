/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 */
import android.view.View;
import android.view.Window;

public class UG3$a
extends UG3$g {
    public final Window a;
    public final c93 b;

    public UG3$a(Window window, c93 c932) {
        this.a = window;
        this.b = c932;
    }

    public final int a() {
        int n3;
        Object object = this.a.getDecorView();
        int n4 = 356039078;
        if ((object = object.getTag(n4)) != null) {
            object = (Integer)object;
            n3 = (Integer)object;
        } else {
            n3 = 1;
        }
        return n3;
    }

    public final void b(int n3) {
        int n4;
        int n7 = 1;
        for (int i3 = 1; i3 <= (n4 = 256); i3 <<= 1) {
            n4 = n3 & i3;
            if (n4 == 0) continue;
            if (i3 != n7) {
                n4 = 2;
                if (i3 != n4) {
                    n4 = 8;
                    if (i3 != n4) continue;
                    c93$a c93$a = this.b.a;
                    c93$a.a();
                    continue;
                }
                this.i(n4);
                continue;
            }
            n4 = 4;
            this.i(n4);
        }
    }

    public final void g(int n3) {
        View view = this.a.getDecorView();
        Integer n4 = n3;
        int n7 = 356039078;
        view.setTag(n7, (Object)n4);
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
    }

    public final void h(int n3) {
        int n4;
        int n7 = 1;
        for (int i3 = 1; i3 <= (n4 = 256); i3 <<= 1) {
            Object object;
            n4 = n3 & i3;
            if (n4 == 0) continue;
            if (i3 != n7) {
                n4 = 2;
                if (i3 != n4) {
                    n4 = 8;
                    if (i3 != n4) continue;
                    object = this.b.a;
                    ((c93$a)object).b();
                    continue;
                }
                this.j(n4);
                continue;
            }
            n4 = 4;
            this.j(n4);
            object = this.a;
            int n8 = 1024;
            object.clearFlags(n8);
        }
    }

    public final void i(int n3) {
        View view = this.a.getDecorView();
        int n4 = view.getSystemUiVisibility();
        view.setSystemUiVisibility(n3 |= n4);
    }

    public final void j(int n3) {
        View view = this.a.getDecorView();
        int n4 = view.getSystemUiVisibility();
        n3 = ~n3 & n4;
        view.setSystemUiVisibility(n3);
    }
}

