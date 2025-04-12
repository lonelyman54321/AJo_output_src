/*
 * Decompiled with CFR 0.152.
 */
import androidx.loader.content.a;

/*
 * Renamed from Vv1$c
 */
public final class vv1$c_0
extends jD3 {
    public static final Vv1$c$a c;
    public final ca3 a;
    public boolean b;

    static {
        Vv1$c$a vv1$c$a;
        c = vv1$c$a = new Object();
    }

    public vv1$c_0() {
        ca3 ca32;
        this.a = ca32 = new ca3();
        this.b = false;
    }

    public final void onCleared() {
        int n3;
        a a2;
        vv1$a_0 vv1$a_0;
        super.onCleared();
        ca3 ca32 = this.a;
        int n4 = ca32.j();
        Object[] objectArray = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            vv1$a_0 = (vv1$a_0)ca32.k(i3);
            a2 = vv1$a_0.n;
            a2.cancelLoad();
            a2.abandon();
            vv1$b_0 vv1$b_0 = vv1$a_0.p;
            if (vv1$b_0 != null) {
                vv1$a_0.j(vv1$b_0);
                boolean bl2 = vv1$b_0.c;
                if (bl2) {
                    Uv1$a uv1$a = vv1$b_0.b;
                    a a3 = vv1$b_0.a;
                    uv1$a.onLoaderReset(a3);
                }
            }
            a2.unregisterListener(vv1$a_0);
            if (vv1$b_0 != null) {
                n3 = (int)(vv1$b_0.c ? 1 : 0);
            }
            a2.reset();
        }
        n4 = ca32.d;
        objectArray = ca32.c;
        vv1$a_0 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            a2 = null;
            objectArray[n3] = null;
        }
        ca32.d = 0;
        ca32.a = false;
    }
}

