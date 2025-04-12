/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from yq0
 */
public class yq0_0
extends dp0 {
    public int m;

    public yq0_0(wf3_0 object) {
        super((wf3_0)object);
        boolean bl2 = object instanceof v91;
        if (bl2) {
            object = dp0$a.HORIZONTAL_DIMENSION;
            this.e = object;
        } else {
            object = dp0$a.VERTICAL_DIMENSION;
            this.e = object;
        }
    }

    public final void d(int n3) {
        boolean bl2 = this.j;
        if (bl2) {
            return;
        }
        this.j = bl2 = true;
        this.g = n3;
        Iterator iterator = this.k.iterator();
        while (bl2 = iterator.hasNext()) {
            Zo0 zo0 = (Zo0)iterator.next();
            zo0.a(zo0);
        }
    }
}

