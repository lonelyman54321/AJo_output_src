/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory
 *  android.text.SpannableStringBuilder
 *  android.util.Base64
 *  android.util.Pair
 */
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public final class Ns3
implements lf3_0 {
    public final Is3 a;
    public final long[] b;
    public final Map c;
    public final Map d;
    public final Map e;

    public Ns3(Is3 object, HashMap object2, HashMap hashMap, HashMap serializable) {
        int n3;
        this.a = object;
        this.d = hashMap;
        this.e = serializable;
        object2 = Collections.unmodifiableMap(object2);
        this.c = object2;
        object2 = new TreeSet();
        int n4 = 0;
        hashMap = null;
        ((Is3)object).d((TreeSet)object2, false);
        int n7 = ((TreeSet)object2).size();
        object = new long[n7];
        object2 = ((TreeSet)object2).iterator();
        while ((n3 = object2.hasNext()) != 0) {
            serializable = (Long)object2.next();
            long l2 = (Long)serializable;
            n3 = n4 + 1;
            object[n4] = l2;
            n4 = n3;
        }
        this.b = (long[])object;
    }

    public final int a(long l2) {
        int n3;
        long[] lArray = this.b;
        int n4 = gz3.a(lArray, l2, false);
        if (n4 >= (n3 = lArray.length)) {
            n4 = -1;
        }
        return n4;
    }

    public final List b(long l2) {
        Object object;
        int n3;
        Object object2 = this.a;
        object2.getClass();
        Object object3 = new ArrayList();
        Object object4 = ((Is3)object2).h;
        ((Is3)object2).g(l2, (String)object4, (ArrayList)object3);
        TreeMap treeMap = new TreeMap();
        int n4 = 0;
        float f5 = 0.0f;
        Lo0[] lo0Array = ((Is3)object2).h;
        object4 = object2;
        Class<Lo0> clazz = treeMap;
        ((Is3)object2).i(l2, false, (String)lo0Array, treeMap);
        Object object5 = this.c;
        Map map2 = this.d;
        clazz = ((Is3)object2).h;
        lo0Array = map2;
        object2 = treeMap;
        ((Is3)object4).h(l2, (Map)object5, map2, (String)((Object)clazz), treeMap);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator<Object> iterator = ((ArrayList)object3).iterator();
        while (true) {
            float f6;
            n3 = iterator.hasNext();
            int n7 = 0;
            float f7 = 0.0f;
            if (n3 == 0) break;
            object4 = (Pair)iterator.next();
            object = ((Pair)object4).second;
            object5 = this.e;
            if ((object = (String)object5.get(object)) == null) continue;
            object = Base64.decode((String)object, (int)0);
            n4 = ((Object)object).length;
            object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n4);
            object4 = ((Pair)object4).first;
            object4 = (Ks3)map2.get(object4);
            object4.getClass();
            object5 = new Pe0$a();
            ((Pe0$a)object5).b = object;
            ((Pe0$a)object5).h = f6 = ((Ks3)object4).b;
            ((Pe0$a)object5).i = 0;
            ((Pe0$a)object5).e = f6 = ((Ks3)object4).c;
            ((Pe0$a)object5).f = 0;
            ((Pe0$a)object5).g = n7 = ((Ks3)object4).e;
            ((Pe0$a)object5).l = f7 = ((Ks3)object4).f;
            ((Pe0$a)object5).m = f7 = ((Ks3)object4).g;
            ((Pe0$a)object5).p = n3 = ((Ks3)object4).j;
            object4 = ((Pe0$a)object5).a();
            arrayList.add(object4);
        }
        iterator = treeMap.entrySet().iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            int n8;
            int n10;
            int n14;
            int n15;
            object4 = (Map.Entry)iterator.next();
            object = object4.getKey();
            object = (Ks3)map2.get(object);
            object.getClass();
            object4 = (Pe0$a)object4.getValue();
            object5 = ((Pe0$a)object4).a;
            object5.getClass();
            object5 = (SpannableStringBuilder)object5;
            int n16 = object5.length();
            clazz = Lo0.class;
            lo0Array = (Lo0[])object5.getSpans(0, n16, clazz);
            int n17 = lo0Array.length;
            object2 = null;
            for (n15 = 0; n15 < n17; ++n15) {
                object3 = lo0Array[n15];
                n14 = object5.getSpanStart(object3);
                n10 = object5.getSpanEnd(object3);
                String string2 = "";
                object5.replace(n14, n10, (CharSequence)string2);
            }
            n16 = 0;
            lo0Array = null;
            while (true) {
                n17 = object5.length();
                n15 = 32;
                if (n16 >= n17) break;
                n17 = object5.charAt(n16);
                if (n17 == n15) {
                    for (n10 = n17 = n16 + 1; n10 < (n14 = object5.length()) && (n14 = (int)object5.charAt(n10)) == n15; ++n10) {
                    }
                    if ((n10 -= n17) > 0) {
                        object5.delete(n16, n10 += n16);
                    }
                }
                ++n16;
            }
            n16 = object5.length();
            n17 = 1;
            if (n16 > 0 && (n16 = (int)object5.charAt(0)) == n15) {
                object5.delete(0, n17);
            }
            n16 = 0;
            lo0Array = null;
            while (true) {
                n10 = object5.length() - n17;
                n14 = 10;
                if (n16 >= n10) break;
                n10 = object5.charAt(n16);
                if (n10 == n14 && (n14 = (int)object5.charAt(n10 = n16 + 1)) == n15) {
                    n14 = n16 + 2;
                    object5.delete(n10, n14);
                }
                ++n16;
            }
            n16 = object5.length();
            if (n16 > 0) {
                n16 = object5.length() - n17;
                if ((n16 = (int)object5.charAt(n16)) == n15) {
                    n16 = object5.length() - n17;
                    n10 = object5.length();
                    object5.delete(n16, n10);
                }
            }
            lo0Array = null;
            for (n16 = 0; n16 < (n10 = object5.length() - n17); ++n16) {
                char c2;
                n10 = object5.charAt(n16);
                if (n10 != n15 || (c2 = object5.charAt(n10 = n16 + 1)) != n14) continue;
                object5.delete(n16, n10);
            }
            n16 = object5.length();
            if (n16 > 0) {
                n16 = object5.length() - n17;
                if ((n16 = (int)object5.charAt(n16)) == n14) {
                    n16 = object5.length() - n17;
                    n17 = object5.length();
                    object5.delete(n16, n17);
                }
            }
            ((Pe0$a)object4).e = f5 = ((Ks3)object).c;
            ((Pe0$a)object4).f = n4 = ((Ks3)object).d;
            ((Pe0$a)object4).g = n4 = ((Ks3)object).e;
            ((Pe0$a)object4).h = f5 = ((Ks3)object).b;
            ((Pe0$a)object4).l = f5 = ((Ks3)object).f;
            ((Pe0$a)object4).k = f5 = ((Ks3)object).i;
            ((Pe0$a)object4).j = n4 = ((Ks3)object).h;
            ((Pe0$a)object4).p = n8 = ((Ks3)object).j;
            object4 = ((Pe0$a)object4).a();
            arrayList.add(object4);
        }
        return arrayList;
    }

    public final long c(int n3) {
        return this.b[n3];
    }

    public final int d() {
        return this.b.length;
    }
}

