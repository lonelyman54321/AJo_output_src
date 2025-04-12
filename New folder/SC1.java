/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class SC1
implements Kp {
    public final R11 a;
    public final SC1$b b;
    public final HashMap c;
    public final HashMap d;
    public final int e;
    public int f;

    public SC1(int n3) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap = new HashMap();
        this.b = hashMap;
        this.c = hashMap = new HashMap();
        this.d = hashMap = new HashMap();
        this.e = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    int n4 = 40;
                    if (n3 >= n4) {
                        try {
                            this.b();
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    n4 = 20;
                    if (n3 >= n4 || n3 == (n4 = 15)) {
                        n3 = this.e;
                        this.f(n3 /= 2);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Object var1_1 = null;
            this.f(0);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(Class object, int n3) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                Object object2;
                Object object3;
                block7: {
                    block8: {
                        try {
                            object3 = this.i((Class)object);
                            object2 = n3;
                            object3 = object3.ceilingKey(object2);
                            object3 = (Integer)object3;
                            if (object3 == null) break block7;
                            int n4 = this.f;
                            if (n4 == 0) break block8;
                            int n7 = this.e;
                            if ((n7 /= n4) < (n4 = 2) && (n4 = ((Integer)object3).intValue()) > (n7 = n3 * 8)) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    SC1$b sC1$b = this.b;
                    int n8 = (Integer)object3;
                    object2 = sC1$b.b;
                    object2 = (ArrayDeque)object2;
                    object2 = ((ArrayDeque)object2).poll();
                    if ((object2 = (uw2_0)object2) == null) {
                        object2 = sC1$b.c();
                    }
                    object2 = (SC1$a)object2;
                    ((SC1$a)object2).b = n8;
                    ((SC1$a)object2).c = object;
                    return this.h((SC1$a)object2, (Class)object);
                }
                object3 = this.b;
                object2 = ((y62_0)object3).b;
                object2 = (ArrayDeque)object2;
                object2 = ((ArrayDeque)object2).poll();
                if ((object2 = (uw2_0)object2) == null) {
                    object2 = ((SC1$b)object3).c();
                }
                object2 = (SC1$a)object2;
                ((SC1$a)object2).b = n3;
                ((SC1$a)object2).c = object;
                return this.h((SC1$a)object2, (Class)object);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object d() {
        Class<byte[]> clazz = byte[].class;
        synchronized (this) {
            int n3;
            SC1$b sC1$b = this.b;
            Object object = sC1$b.b;
            object = (ArrayDeque)object;
            object = ((ArrayDeque)object).poll();
            object = (uw2_0)object;
            if (object == null) {
                object = sC1$b.c();
            }
            object = (SC1$a)object;
            ((SC1$a)object).b = n3 = 8;
            ((SC1$a)object).c = clazz;
            return this.h((SC1$a)object, clazz);
        }
    }

    public final void e(Class object, int n3) {
        object = this.i((Class)object);
        Comparable<Integer> comparable = n3;
        if ((comparable = (Integer)object.get(comparable)) != null) {
            int n4;
            int n7 = (Integer)comparable;
            if (n7 == (n4 = 1)) {
                Integer n8 = n3;
                object.remove(n8);
            } else {
                Integer n10 = n3;
                int n14 = (Integer)comparable - n4;
                comparable = n14;
                object.put(n10, comparable);
            }
            return;
        }
        comparable = new Comparable<Integer>("Tried to decrement empty size, size: ");
        ((StringBuilder)comparable).append(n3);
        ((StringBuilder)comparable).append(", this: ");
        ((StringBuilder)comparable).append(this);
        String string2 = ((StringBuilder)comparable).toString();
        object = new NullPointerException(string2);
        throw object;
    }

    public final void f(int n3) {
        int n4;
        while ((n4 = this.f) > n3) {
            Object object = this.a.c();
            dV0.b(object);
            Object object2 = object.getClass();
            object2 = this.g((Class)object2);
            int n7 = this.f;
            int n8 = object2.b(object);
            int n10 = object2.a() * n8;
            this.f = n7 -= n10;
            n7 = object2.b(object);
            Class<?> clazz = object.getClass();
            this.e(clazz, n7);
            String string2 = object2.getTag();
            n7 = (int)(Log.isLoggable((String)string2, (int)(n8 = 2)) ? 1 : 0);
            if (n7 == 0) continue;
            object2.b(object);
        }
    }

    public final Bp g(Class object) {
        Class<int[]> clazz;
        block4: {
            Serializable serializable = this.d;
            clazz = (Bp)serializable.get(object);
            if (clazz != null) break block4;
            clazz = int[].class;
            boolean bl2 = object.equals(clazz);
            if (bl2) {
                clazz = new Object();
            } else {
                clazz = byte[].class;
                bl2 = object.equals(clazz);
                if (!bl2) {
                    object = ((Class)object).getSimpleName();
                    object = "No array pool found for: ".concat((String)object);
                    serializable = new IllegalArgumentException((String)object);
                    throw serializable;
                }
                clazz = new Object();
            }
            serializable.put(object, clazz);
        }
        return clazz;
    }

    public final Object h(SC1$a sC1$a, Class object) {
        Bp bp2 = this.g((Class)object);
        Object object2 = this.a.a(sC1$a);
        if (object2 != null) {
            int n3 = this.f;
            int n4 = bp2.b(object2);
            int n7 = bp2.a() * n4;
            this.f = n3 -= n7;
            n3 = bp2.b(object2);
            this.e((Class)object, n3);
        }
        if (object2 == null) {
            object = bp2.getTag();
            int n8 = 2;
            Log.isLoggable((String)object, (int)n8);
            int n10 = sC1$a.b;
            object2 = bp2.newArray(n10);
        }
        return object2;
    }

    public final NavigableMap i(Class clazz) {
        HashMap hashMap = this.c;
        TreeMap treeMap = (TreeMap)hashMap.get(clazz);
        if (treeMap == null) {
            treeMap = new TreeMap();
            hashMap.put(clazz, treeMap);
        }
        return treeMap;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void put(Object object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    int n3;
                    int n4;
                    Constable constable;
                    try {
                        constable = object.getClass();
                        Bp bp2 = this.g((Class)constable);
                        n4 = bp2.b(object);
                        n3 = bp2.a() * n4;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    {
                        int n7;
                        int n8 = this.e;
                        if (n3 > (n8 /= 2)) break block7;
                        SC1$b sC1$b = this.b;
                        Object object2 = sC1$b.b;
                        object2 = (ArrayDeque)object2;
                        object2 = ((ArrayDeque)object2).poll();
                        if ((object2 = (uw2_0)object2) == null) {
                            object2 = sC1$b.c();
                        }
                        object2 = (SC1$a)object2;
                        ((SC1$a)object2).b = n4;
                        ((SC1$a)object2).c = constable;
                        Object object3 = this.a;
                        ((R11)object3).b((uw2_0)object2, object);
                        object = this.i((Class)constable);
                        int n10 = ((SC1$a)object2).b;
                        constable = Integer.valueOf(n10);
                        constable = object.get(constable);
                        constable = (Integer)constable;
                        n4 = ((SC1$a)object2).b;
                        object3 = n4;
                        n8 = 1;
                        if (constable != null) {
                            n10 = (Integer)constable;
                            n8 += n10;
                        }
                        constable = Integer.valueOf(n8);
                        object.put(object3, constable);
                        this.f = n7 = this.f + n3;
                        n7 = this.e;
                        this.f(n7);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

