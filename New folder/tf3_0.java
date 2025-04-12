/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from TF3
 */
public class tf3_0
extends Y50 {
    public ArrayList x0;

    public tf3_0() {
        ArrayList arrayList;
        this.x0 = arrayList = new ArrayList();
    }

    public void H() {
        this.x0.clear();
        super.H();
    }

    public final void K(SI sI) {
        super.K(sI);
        ArrayList arrayList = this.x0;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Y50 y50 = (Y50)this.x0.get(i3);
            y50.K(sI);
        }
    }

    public void Z() {
        ArrayList arrayList = this.x0;
        if (arrayList == null) {
            return;
        }
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Y50 y50 = (Y50)this.x0.get(i3);
            boolean bl2 = y50 instanceof tf3_0;
            if (!bl2) continue;
            y50 = (tf3_0)y50;
            ((tf3_0)y50).Z();
        }
    }

    public final void a(Y50 y50) {
        this.x0.add(y50);
        Object object = y50.X;
        if (object != null) {
            object = ((tf3_0)object).x0;
            ((ArrayList)object).remove(y50);
            y50.H();
        }
        y50.X = this;
    }
}

