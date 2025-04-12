/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class PF3
implements lf3_0 {
    public final List a;
    public final long[] b;
    public final long[] c;

    public PF3(ArrayList object) {
        int n3;
        int n4;
        Object object2 = new ArrayList(object);
        object2 = Collections.unmodifiableList(object2);
        this.a = object2;
        object2 = new long[((ArrayList)object).size() * 2];
        this.b = (long[])object2;
        object2 = null;
        for (n4 = 0; n4 < (n3 = ((ArrayList)object).size()); ++n4) {
            long l2;
            JF3 jF3 = (JF3)((ArrayList)object).get(n4);
            int n7 = n4 * 2;
            long[] lArray = this.b;
            lArray[n7] = l2 = jF3.b;
            lArray[++n7] = l2 = jF3.c;
        }
        object = this.b;
        n4 = ((Object)object).length;
        object = Arrays.copyOf((long[])object, n4);
        this.c = (long[])object;
        Arrays.sort((long[])object);
    }

    public final int a(long l2) {
        int n3;
        long[] lArray = this.c;
        int n4 = gz3.a(lArray, l2, false);
        if (n4 >= (n3 = lArray.length)) {
            n4 = -1;
        }
        return n4;
    }

    public final List b(long l2) {
        int n3;
        Object object;
        int n4;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        int n7 = 0;
        for (int i3 = 0; i3 < (n4 = (object = this.a).size()); ++i3) {
            long l3;
            long l4;
            long l7;
            long[] lArray = this.b;
            n4 = i3 * 2;
            long l8 = lArray[n4];
            long l12 = l8 - l2;
            Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 > 0 || (l7 = (l4 = l2 - (l3 = lArray[++n4])) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) continue;
            object = (JF3)object.get(i3);
            Pe0 pe0 = ((JF3)object).a;
            float f5 = pe0.e;
            l7 = -8388609;
            float f6 = -3.4028235E38f;
            float f7 = f5 - f6;
            Object object3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object3 == false) {
                arrayList2.add(object);
                continue;
            }
            arrayList.add(pe0);
        }
        Object object4 = new Object();
        Collections.sort(arrayList2, object4);
        while (n7 < (n3 = arrayList2.size())) {
            float f8;
            object4 = ((JF3)arrayList2.get((int)n7)).a.a();
            ((Pe0$a)object4).e = f8 = (float)(-1 - n7);
            int n8 = 1;
            f8 = Float.MIN_VALUE;
            ((Pe0$a)object4).f = n8;
            object4 = ((Pe0$a)object4).a();
            arrayList.add(object4);
            ++n7;
        }
        return arrayList;
    }

    public final long c(int n3) {
        long[] lArray;
        boolean bl2;
        boolean bl3 = false;
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            lArray = null;
        }
        ct3.a(bl2);
        lArray = this.c;
        int n4 = lArray.length;
        if (n3 < n4) {
            bl3 = true;
        }
        ct3.a(bl3);
        return lArray[n3];
    }

    public final int d() {
        return this.c.length;
    }
}

