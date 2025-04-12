/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.datasource.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public abstract class Yv
implements DataSource {
    public final boolean a;
    public final ArrayList b;
    public int c;
    public ti0_1 d;

    public Yv(boolean bl2) {
        ArrayList arrayList;
        this.a = bl2;
        this.b = arrayList = new ArrayList(1);
    }

    public Map c() {
        return Collections.emptyMap();
    }

    public final void g(Kq3 kq3) {
        kq3.getClass();
        ArrayList arrayList = this.b;
        boolean bl2 = arrayList.contains(kq3);
        if (!bl2) {
            int n3;
            arrayList.add(kq3);
            this.c = n3 = this.c + 1;
        }
    }

    public final void l(int n3) {
        int n4;
        ti0_1 ti0_12 = this.d;
        int n7 = gz3.a;
        for (n7 = 0; n7 < (n4 = this.c); ++n7) {
            Kq3 kq3 = (Kq3)this.b.get(n7);
            boolean bl2 = this.a;
            kq3.b(ti0_12, bl2, n3);
        }
    }

    public final void m() {
        int n3;
        ti0_1 ti0_12 = this.d;
        int n4 = gz3.a;
        for (n4 = 0; n4 < (n3 = this.c); ++n4) {
            Kq3 kq3 = (Kq3)this.b.get(n4);
            boolean bl2 = this.a;
            kq3.e(ti0_12, bl2);
        }
        this.d = null;
    }

    public final void n(ti0_1 ti0_12) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            Kq3 kq3 = (Kq3)this.b.get(i3);
            kq3.getClass();
        }
    }

    public final void o(ti0_1 ti0_12) {
        int n3;
        this.d = ti0_12;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            Kq3 kq3 = (Kq3)this.b.get(i3);
            boolean bl2 = this.a;
            kq3.f(ti0_12, bl2);
        }
    }
}

