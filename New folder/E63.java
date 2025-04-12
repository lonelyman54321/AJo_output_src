/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class E63
implements ZC1 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final E63$c a;
    public final R11 b;
    public final HashMap c;

    static {
        Bitmap.Config config;
        int n3 = 2;
        Bitmap.Config[] configArray = new Bitmap.Config[n3];
        configArray[0] = config = Bitmap.Config.ARGB_8888;
        config = null;
        int n4 = 1;
        configArray[n4] = null;
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 26;
        if (n7 >= n8) {
            Bitmap.Config config2;
            configArray = Arrays.copyOf(configArray, 3);
            n7 = configArray.length - n4;
            configArray[n7] = config2 = Jh.a();
        }
        d = configArray;
        e = configArray;
        configArray = new Bitmap.Config[n4];
        configArray[0] = config = Bitmap.Config.RGB_565;
        f = configArray;
        configArray = new Bitmap.Config[n4];
        configArray[0] = config = Bitmap.Config.ARGB_4444;
        g = configArray;
        configArray = new Bitmap.Config[n4];
        configArray[0] = config = Bitmap.Config.ALPHA_8;
        h = configArray;
    }

    public E63() {
        HashMap hashMap;
        this.a = hashMap;
        hashMap = new HashMap();
        this.b = hashMap;
        this.c = hashMap = new HashMap();
    }

    public static String c(int n3, Bitmap.Config config) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(n3);
        stringBuilder.append("](");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void a(Integer object, Bitmap object2) {
        Object object3 = object2.getConfig();
        Comparable<Integer> comparable = (Integer)(object3 = this.d((Bitmap.Config)object3)).get(object);
        if (comparable != null) {
            int n3;
            int n4 = (Integer)comparable;
            if (n4 == (n3 = 1)) {
                object3.remove(object);
            } else {
                n4 = (Integer)comparable - n3;
                object2 = n4;
                object3.put(object, object2);
            }
            return;
        }
        comparable = new Comparable<Integer>("Tried to decrement empty size, size: ");
        ((StringBuilder)comparable).append(object);
        ((StringBuilder)comparable).append(", removed: ");
        int n7 = dz3.c(object2);
        object2 = object2.getConfig();
        object = E63.c(n7, (Bitmap.Config)object2);
        ((StringBuilder)comparable).append((String)object);
        ((StringBuilder)comparable).append(", this: ");
        ((StringBuilder)comparable).append(this);
        object = ((StringBuilder)comparable).toString();
        object3 = new NullPointerException((String)object);
        throw object3;
    }

    public final Bitmap b(int n3, int n4, Bitmap.Config config) {
        Object object;
        Object object2;
        int n7 = 0;
        Bitmap bitmap = null;
        Object object3 = 1;
        int n8 = n3 * n4;
        int n10 = dz3.d(config) * n8;
        E63$c e63$c = this.a;
        Object object4 = (uw2_0)((ArrayDeque)e63$c.b).poll();
        if (object4 == null) {
            object4 = e63$c.c();
        }
        object4 = (E63$b)object4;
        ((E63$b)object4).b = n10;
        ((E63$b)object4).c = config;
        Object object5 = Build.VERSION.SDK_INT;
        int n14 = 26;
        if (object5 >= n14 && (object5 = (Object)(object2 = Jh.a()).equals(config)) != 0) {
            object2 = e;
        } else {
            object2 = E63$a.a;
            n14 = config.ordinal();
            object5 = object2[n14];
            if (object5 != object3) {
                n14 = 2;
                if (object5 != n14) {
                    n14 = 3;
                    if (object5 != n14) {
                        n14 = 4;
                        if (object5 != n14) {
                            object2 = new Bitmap.Config[object3];
                            object2[0] = config;
                        } else {
                            object2 = h;
                        }
                    } else {
                        object2 = g;
                    }
                } else {
                    object2 = f;
                }
            } else {
                object2 = d;
            }
        }
        n14 = ((Object)object2).length;
        while (n7 < n14) {
            int n15;
            int n16;
            Object object6 = object2[n7];
            Object object7 = this.d((Bitmap.Config)object6);
            Integer n17 = n10;
            if ((object7 = object7.ceilingKey(n17)) != null && (n16 = ((Integer)object7).intValue()) <= (n15 = n10 * 8)) {
                n7 = (Integer)object7;
                if (n7 == n10 && !(object6 == null ? config != null : (n7 = (int)(object6.equals(config) ? 1 : 0)) == 0)) break;
                e63$c.a((uw2_0)object4);
                n7 = (Integer)object7;
                object = (uw2_0)((ArrayDeque)e63$c.b).poll();
                if (object == null) {
                    object = e63$c.c();
                }
                object4 = object;
                object4 = (E63$b)object;
                ((E63$b)object4).b = n7;
                ((E63$b)object4).c = object6;
                break;
            }
            n7 += object3;
        }
        if ((bitmap = (Bitmap)this.b.a((uw2_0)object4)) != null) {
            object3 = ((E63$b)object4).b;
            object = object3;
            this.a((Integer)object, bitmap);
            bitmap.reconfigure(n3, n4, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        TreeMap treeMap = (TreeMap)hashMap.get(config);
        if (treeMap == null) {
            treeMap = new TreeMap();
            hashMap.put(config, treeMap);
        }
        return treeMap;
    }

    public final void e(Bitmap object) {
        int n3 = dz3.c((Bitmap)object);
        Object object2 = object.getConfig();
        E63$c e63$c = this.a;
        uw2_0 uw2_02 = (uw2_0)((ArrayDeque)e63$c.b).poll();
        if (uw2_02 == null) {
            uw2_02 = e63$c.c();
        }
        uw2_02 = (E63$b)uw2_02;
        ((E63$b)uw2_02).b = n3;
        ((E63$b)uw2_02).c = object2;
        this.b.b(uw2_02, object);
        object = object.getConfig();
        object = this.d((Bitmap.Config)object);
        n3 = ((E63$b)uw2_02).b;
        Integer n4 = n3;
        n4 = (Integer)object.get(n4);
        int n7 = ((E63$b)uw2_02).b;
        object2 = n7;
        int n8 = 1;
        if (n4 != null) {
            n3 = n4;
            n8 += n3;
        }
        n4 = n8;
        object.put(object2, n4);
    }

    public final String toString() {
        Object object;
        boolean bl2;
        StringBuilder stringBuilder = Ex0.a("SizeConfigStrategy{groupedMap=");
        Object object2 = this.b;
        stringBuilder.append(object2);
        stringBuilder.append(", sortedSizes=(");
        object2 = this.c;
        Iterator iterator = ((HashMap)object2).entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            Object k2 = object.getKey();
            stringBuilder.append(k2);
            char c2 = '[';
            stringBuilder.append(c2);
            object = object.getValue();
            stringBuilder.append(object);
            object = "], ";
            stringBuilder.append((String)object);
        }
        boolean n3 = ((HashMap)object2).isEmpty();
        if (!n3) {
            int n4 = stringBuilder.length() + -2;
            int n7 = stringBuilder.length();
            object = "";
            stringBuilder.replace(n4, n7, (String)object);
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }
}

