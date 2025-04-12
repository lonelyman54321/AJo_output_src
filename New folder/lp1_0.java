/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from lp1
 */
public final class lp1_0 {
    public final Object a;
    public List b;
    public List c;
    public boolean d;

    public lp1_0() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
        this.c = arrayList = new ArrayList();
        this.d = true;
    }

    public final boolean a() {
        Object object = this.a;
        synchronized (object) {
            boolean bl2 = this.d;
            return bl2;
        }
    }
}

