/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.f;

public final class Tl {
    public static final Sl a;

    static {
        Sl sl;
        a = sl = new Sl(6, "", null);
    }

    public static final ArrayList a(int n3, int n4, List arrayList) {
        if (n3 <= n4) {
            ArrayList arrayList2 = null;
            if (arrayList != null) {
                int n7;
                Object object;
                Object object2;
                int n8 = arrayList.size();
                ArrayList arrayList3 = new ArrayList(n8);
                n8 = arrayList.size();
                int n10 = 0;
                Object object3 = null;
                for (int i3 = 0; i3 < n8; ++i3) {
                    object = object2 = arrayList.get(i3);
                    object = (Sl$b)object2;
                    n7 = ((Sl$b)object).b;
                    int n14 = ((Sl$b)object).c;
                    if ((n14 = (int)(Tl.c(n3, n4, n7, n14) ? 1 : 0)) == 0) continue;
                    arrayList3.add(object2);
                }
                n8 = arrayList3.size();
                arrayList = new ArrayList(n8);
                n8 = arrayList3.size();
                while (n10 < n8) {
                    object3 = (Sl$b)arrayList3.get(n10);
                    object = ((Sl$b)object3).a;
                    n7 = ((Sl$b)object3).b;
                    n7 = Math.max(n3, n7) - n3;
                    int n15 = ((Sl$b)object3).c;
                    n15 = Math.min(n4, n15) - n3;
                    object3 = ((Sl$b)object3).d;
                    object2 = new Object(object, (String)object3, n7, n15);
                    arrayList.add(object2);
                    ++n10;
                }
                n3 = arrayList.isEmpty() ? 1 : 0;
                if (n3 == 0) {
                    arrayList2 = arrayList;
                }
            }
            return arrayList2;
        }
        arrayList = new ArrayList("start (");
        ((StringBuilder)((Object)arrayList)).append(n3);
        ((StringBuilder)((Object)arrayList)).append(") should be less than or equal to end (");
        ((StringBuilder)((Object)arrayList)).append(n4);
        ((StringBuilder)((Object)arrayList)).append(')');
        String string2 = ((StringBuilder)((Object)arrayList)).toString();
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final List b(Sl arrayList, int n3, int n4) {
        int n7;
        Object object;
        Object object2;
        int n8;
        int n10;
        int n14 = 0;
        ArrayList arrayList2 = null;
        if (n3 == n4) {
            return null;
        }
        List list = ((Sl)((Object)arrayList)).b;
        if (list == null) {
            return null;
        }
        if (n3 == 0 && n4 >= (n10 = ((String)((Object)(arrayList = ((Sl)((Object)arrayList)).a))).length())) {
            return list;
        }
        n14 = list.size();
        arrayList = new ArrayList(n14);
        n14 = list.size();
        int n15 = 0;
        Sl$b sl$b = null;
        for (n8 = 0; n8 < n14; ++n8) {
            object = object2 = list.get(n8);
            object = (Sl$b)object2;
            n7 = ((Sl$b)object).b;
            int n16 = ((Sl$b)object).c;
            if ((n16 = (int)(Tl.c(n3, n4, n7, n16) ? 1 : 0)) == 0) continue;
            arrayList.add(object2);
        }
        int n17 = arrayList.size();
        arrayList2 = new ArrayList(n17);
        n17 = arrayList.size();
        while (n15 < n17) {
            sl$b = (Sl$b)arrayList.get(n15);
            object = sl$b.a;
            n7 = f.g(sl$b.b, n3, n4) - n3;
            n8 = f.g(sl$b.c, n3, n4) - n3;
            object2 = new Object(n7, n8, object);
            arrayList2.add(object2);
            ++n15;
        }
        return arrayList2;
    }

    public static final boolean c(int n3, int n4, int n7, int n8) {
        int n10 = Math.max(n3, n7);
        int n14 = Math.min(n4, n8);
        boolean bl2 = true;
        if (n10 >= n14) {
            int n15;
            n10 = 0;
            if ((n3 > n7 || n8 > n4 || n4 == n8 && (n14 = n7 == n8 ? 1 : 0) != (n15 = n3 == n4 ? 1 : 0)) && (n7 > n3 || n4 > n8 || n8 == n4 && (n3 = n3 == n4 ? 1 : 0) != (n4 = n7 == n8 ? 1 : 0))) {
                bl2 = false;
            }
        }
        return bl2;
    }
}

