/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Size
 *  android.util.SizeF
 *  android.util.SparseArray
 */
package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.x$b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class x {
    public static final Class[] f;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final xS2$b e;

    static {
        Class<Comparable<Boolean>> clazz = Boolean.TYPE;
        clazz = Double.TYPE;
        clazz = Integer.TYPE;
        clazz = Long.TYPE;
        clazz = Byte.TYPE;
        clazz = Character.TYPE;
        clazz = Float.TYPE;
        clazz = Short.TYPE;
        Class[] classArray = new Class[]{clazz, boolean[].class, clazz, double[].class, clazz, int[].class, clazz, long[].class, String.class, String[].class, Binder.class, Bundle.class, clazz, byte[].class, clazz, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, clazz, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, clazz, short[].class, SparseArray.class, Size.class, SizeF.class};
        f = classArray;
    }

    public x() {
        Object object = new LinkedHashMap();
        this.a = object;
        object = new LinkedHashMap();
        this.b = object;
        object = new LinkedHashMap();
        this.c = object;
        object = new LinkedHashMap();
        this.d = object;
        this.e = object = new ss2_0(this);
    }

    public x(HashMap hashMap) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(hashMap, "initialState");
        this.a = linkedHashMap = new LinkedHashMap();
        Object object = new LinkedHashMap();
        this.b = object;
        object = new LinkedHashMap();
        this.c = object;
        object = new LinkedHashMap();
        this.d = object;
        this.e = object = new ss2_0(this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(x object) {
        ArrayList<String> arrayList;
        Pair[] pairArray;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = fh1_2.o(((x)object).b).entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            pairArray = object2.next();
            arrayList = (String)pairArray.getKey();
            pairArray = ((xS2$b)pairArray.getValue()).a();
            ((x)object).c(pairArray, (String)((Object)arrayList));
        }
        object = ((x)object).a;
        object2 = ((LinkedHashMap)object).keySet();
        int n3 = object2.size();
        pairArray = new ArrayList(n3);
        int n4 = pairArray.size();
        arrayList = new ArrayList<String>(n4);
        object2 = object2.iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            String string2 = (String)object2.next();
            pairArray.add(string2);
            string2 = ((LinkedHashMap)object).get(string2);
            arrayList.add(string2);
        }
        object = new Pair("keys", pairArray);
        object2 = new Pair("values", arrayList);
        pairArray = new Pair[]{object, object2};
        return DE.b(pairArray);
    }

    public final Object b(String string2) {
        Object object = this.a;
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        try {
            string2 = ((LinkedHashMap)object).get(string2);
        }
        catch (ClassCastException classCastException) {
            Intrinsics.checkNotNullParameter(string2, string3);
            object.remove(string2);
            object = (x$b)this.c.remove(string2);
            object = this.d;
            object.remove(string2);
            string2 = null;
        }
        return string2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final void c(Object object, String object2) {
        Object object3 = "key";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = true;
        while (true) {
            int n3;
            block10: {
                block9: {
                    int n4;
                    block8: {
                        if (!bl2 || (bl2 = false)) break block8;
                        if (object == null) break block9;
                        object3 = f;
                        n3 = 0;
                    }
                    if (n3 >= (n4 = 29)) {
                        object3 = new StringBuilder("Can't put value with type ");
                        Intrinsics.checkNotNull(object);
                        object = object.getClass();
                        ((StringBuilder)object3).append(object);
                        ((StringBuilder)object3).append(" into saved state");
                        object = ((StringBuilder)object3).toString();
                        object2 = new IllegalArgumentException((String)object);
                        throw object2;
                    }
                    Class clazz = object3[n3];
                    Intrinsics.checkNotNull(clazz);
                    n4 = (int)(clazz.isInstance(object) ? 1 : 0);
                    if (n4 == 0) break block10;
                }
                object3 = this.c.get(object2);
                n3 = object3 instanceof zr1_1;
                object3 = n3 != 0 ? (zr1_1)object3 : null;
                if (object3 != null) {
                    ((LiveData)object3).k(object);
                } else {
                    object3 = this.a;
                    object3.put(object2, object);
                }
                object3 = this.d;
                object2 = (ur1_2)((LinkedHashMap)object3).get(object2);
                if (object2 == null) {
                    return;
                }
                object2.setValue(object);
                return;
            }
            ++n3;
        }
    }
}

