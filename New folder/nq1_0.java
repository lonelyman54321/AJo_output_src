/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from NQ1
 */
public final class nq1_0
implements BP1 {
    public final List a;
    public final yw2 b;

    public nq1_0(ArrayList arrayList, yw2 yw22) {
        this.a = arrayList;
        this.b = yw22;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 z92) {
        List list = this.a;
        int n7 = list.size();
        ArrayList<ei0_0> arrayList = new ArrayList<ei0_0>(n7);
        BP1$a bP1$a = null;
        Object object2 = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            Object object3 = (BP1)list.get(i3);
            boolean bl2 = object3.b(object);
            if (!bl2 || (object3 = object3.a(object, n3, n4, z92)) == null) continue;
            object2 = ((BP1$a)object3).c;
            arrayList.add((ei0_0)object2);
            object2 = ((BP1$a)object3).a;
        }
        boolean bl3 = arrayList.isEmpty();
        if (!bl3 && object2 != null) {
            yw2 yw22 = this.b;
            object = new NQ1$a(arrayList, yw22);
            bP1$a = new BP1$a((qn1_0)object2, (ei0_0)object);
        }
        return bP1$a;
    }

    public final boolean b(Object object) {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            BP1 bP1 = (BP1)iterator.next();
            bl2 = bP1.b(object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiModelLoader{modelLoaders=");
        String string2 = Arrays.toString(this.a.toArray());
        stringBuilder.append(string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

