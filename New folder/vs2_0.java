/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.k$e;

/*
 * Renamed from Vs2
 */
public final class vs2_0
extends k$b {
    public final /* synthetic */ us2_0 a;
    public final /* synthetic */ us2_0 b;
    public final /* synthetic */ k$e c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public vs2_0(us2_0 us2_02, us2_0 us2_03, k$e k$e, int n3, int n4) {
        this.a = us2_02;
        this.b = us2_03;
        this.c = k$e;
        this.d = n3;
        this.e = n4;
    }

    public final boolean a(int n3, int n4) {
        Object object;
        Object object2;
        Object object3 = this.a.getItem(n3);
        if (object3 == (object2 = (object = this.b).getItem(n4))) {
            n3 = 1;
        } else {
            object = this.c;
            n3 = (int)(((k$e)object).a(object3, object2) ? 1 : 0);
        }
        return n3 != 0;
    }

    public final boolean b(int n3, int n4) {
        Object object;
        Object object2;
        Object object3 = this.a.getItem(n3);
        if (object3 == (object2 = (object = this.b).getItem(n4))) {
            n3 = 1;
        } else {
            object = this.c;
            n3 = (int)(((k$e)object).b(object3, object2) ? 1 : 0);
        }
        return n3 != 0;
    }

    public final Object c(int n3, int n4) {
        us2_0 us2_02;
        Object object;
        Object object2 = this.a.getItem(n3);
        if (object2 == (object = (us2_02 = this.b).getItem(n4))) {
            object2 = Boolean.TRUE;
        } else {
            this.c.getClass();
            n3 = 0;
            object2 = null;
        }
        return object2;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }
}

