/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public final class Fr1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final List a(wr1_0 object, ws1_0 object2, Br1 object3) {
        IntRange intRange;
        int n3;
        int n4;
        int n7;
        Object object4;
        Object object5;
        int n8;
        List list;
        WR1 wR1 = ((Br1)object3).a;
        boolean bl2 = wR1.l();
        if (!bl2 && (bl2 = (list = ((ws1_0)object2).a).isEmpty())) {
            return mz0_2.a;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object3 = ((Br1)object3).a;
        boolean bl3 = ((WR1)object3).l();
        int n10 = 0;
        if (bl3) {
            Br1$a br1$a;
            int n14;
            n8 = ((WR1)object3).k();
            object5 = "MutableVector is empty.";
            if (n8 != 0) {
                object = new NoSuchElementException((String)object5);
                throw object;
            }
            object4 = ((WR1)object3).a;
            Br1$a br1$a2 = (Br1$a)object4[0];
            n7 = br1$a2.a;
            int n15 = ((WR1)object3).c;
            if (n15 > 0) {
                n14 = 0;
                br1$a = null;
                do {
                    Br1$a br1$a3 = (Br1$a)object4[n14];
                    int n16 = br1$a3.a;
                    if (n16 >= n7) continue;
                    n7 = n16;
                } while (++n14 < n15);
            }
            if (n7 < 0) {
                object2 = "negative minIndex".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            n8 = ((WR1)object3).k();
            if (n8 != 0) {
                object = new NoSuchElementException((String)object5);
                throw object;
            }
            object4 = ((WR1)object3).a;
            object5 = (Br1$a)object4[0];
            n4 = ((Br1$a)object5).b;
            n3 = ((WR1)object3).c;
            if (n3 > 0) {
                n15 = 0;
                do {
                    br1$a = (Br1$a)object4[n15];
                    n14 = br1$a.b;
                    if (n14 <= n4) continue;
                    n4 = n14;
                } while (++n15 < n3);
            }
            n3 = object.getItemCount();
            n8 = 1;
            n3 -= n8;
            n3 = Math.min(n4, n3);
            intRange = new c(n7, n3, n8);
        } else {
            object3 = IntRange.e;
            object3.getClass();
            intRange = IntRange.f;
        }
        object3 = ((ws1_0)object2).a;
        n3 = object3.size();
        while (n10 < n3) {
            object4 = (ws1$a)((ws1_0)object2).get(n10);
            object5 = object4.getKey();
            n8 = vn3_0.b(object4.getIndex(), (wr1_0)object, object5);
            n4 = intRange.a;
            n7 = intRange.b;
            if ((n8 > n7 || n4 > n8) && n8 >= 0 && n8 < (n4 = object.getItemCount())) {
                object4 = n8;
                arrayList.add(object4);
            }
            ++n10;
        }
        int n17 = intRange.a;
        int n18 = intRange.b;
        if (n17 <= n18) {
            while (true) {
                object3 = n17;
                arrayList.add(object3);
                if (n17 == n18) break;
                ++n17;
            }
        }
        return arrayList;
    }
}

