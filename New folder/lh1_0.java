/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from lH1
 */
public final class lh1_0 {
    public final ArrayList a;
    public final ArrayList b;
    public final List c;

    public lh1_0(List list) {
        ArrayList arrayList;
        this.c = list;
        int n3 = list.size();
        this.a = arrayList = new ArrayList(n3);
        n3 = list.size();
        this.b = arrayList = new ArrayList(n3);
        arrayList = null;
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            Object object = this.a;
            Object object2 = ((kh1_0)list.get((int)i3)).b;
            object2 = (List)((tv_0)object2).b;
            r13 r132 = new r13((List)object2);
            ((ArrayList)object).add(r132);
            object = ((kh1_0)list.get((int)i3)).c;
            object2 = this.b;
            object = ((qj_0)object).a();
            ((ArrayList)object2).add(object);
        }
    }
}

