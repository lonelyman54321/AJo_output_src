/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.DecodeJob$e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class d {
    public final ArrayList a;
    public final ArrayList b;
    public c c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public DecodeJob$e h;
    public Z92 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public qn1_0 n;
    public Az2 o;
    public Nq0 p;
    public boolean q;
    public boolean r;

    public d() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.b = arrayList = new ArrayList();
    }

    public final ArrayList a() {
        boolean bl2 = this.m;
        ArrayList arrayList = this.b;
        if (!bl2) {
            this.m = bl2 = true;
            arrayList.clear();
            ArrayList arrayList2 = this.b();
            int n3 = arrayList2.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                List list;
                int n4;
                BP1$a bP1$a = (BP1$a)arrayList2.get(i3);
                qn1_0 qn1_02 = bP1$a.a;
                int n7 = arrayList.contains(qn1_02);
                if (n7 == 0) {
                    qn1_02 = bP1$a.a;
                    arrayList.add(qn1_02);
                }
                qn1_02 = null;
                for (n7 = 0; n7 < (n4 = (list = bP1$a.b).size()); ++n7) {
                    Object e2 = list.get(n7);
                    n4 = (int)(arrayList.contains(e2) ? 1 : 0);
                    if (n4 != 0) continue;
                    list = list.get(n7);
                    arrayList.add(list);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean bl2 = this.l;
        ArrayList arrayList = this.a;
        if (!bl2) {
            this.l = bl2 = true;
            arrayList.clear();
            Object object = this.c.b();
            Object object2 = this.d;
            object = ((Registry)object).g(object2);
            int n3 = object.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object3 = (BP1)object.get(i3);
                Object object4 = this.d;
                int n4 = this.e;
                int n7 = this.f;
                Z92 z92 = this.i;
                if ((object3 = object3.a(object4, n4, n7, z92)) == null) continue;
                arrayList.add(object3);
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Mv1 c(Class clazz) {
        Object object;
        Object object2 = this.c.b();
        Class clazz2 = this.g;
        Class clazz3 = this.k;
        Object object3 = ((Registry)object2).i;
        Object object4 = ((Nv1)object3).b;
        Object object5 = null;
        if ((object4 = (IQ1)((AtomicReference)object4).getAndSet(null)) == null) {
            object4 = new IQ1();
        }
        ((IQ1)object4).a = clazz;
        ((IQ1)object4).b = clazz2;
        ((IQ1)object4).c = clazz3;
        Object object6 = ((Nv1)object3).a;
        synchronized (object6) {
            object = ((Nv1)object3).a;
            object = ((a53)object).get(object4);
            object = (Mv1)object;
        }
        ((Nv1)object3).b.set(object4);
        ((Registry)object2).i.getClass();
        object3 = Nv1.c;
        boolean bl2 = object3.equals(object);
        if (bl2) {
            return object5;
        }
        if (object != null) {
            return object;
        }
        object = ((Registry)object2).e(clazz, clazz2, clazz3);
        bl2 = ((ArrayList)object).isEmpty();
        if (!bl2) {
            Mv1 mv1;
            LI0$c lI0$c = ((Registry)object2).j;
            object3 = mv1;
            object4 = clazz;
            object5 = clazz2;
            object6 = clazz3;
            mv1 = new Mv1(clazz, clazz2, clazz3, (List)object, lI0$c);
            object5 = mv1;
        }
        object2 = ((Registry)object2).i;
        ((Nv1)object2).a(clazz, clazz2, clazz3, (Mv1)object5);
        return object5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List d() {
        ArrayList<Object> arrayList;
        Object object = this.c.b();
        Class<?> clazz = this.d.getClass();
        Class clazz2 = this.g;
        Class clazz3 = this.k;
        Object object2 = ((Registry)object).h;
        Iterator iterator = ((JP1)object2).a;
        boolean bl2 = false;
        Object object3 = null;
        if ((iterator = (IQ1)((AtomicReference)((Object)iterator)).getAndSet(null)) == null) {
            iterator = new Iterator(clazz, clazz2, clazz3);
        } else {
            ((IQ1)((Object)iterator)).a = clazz;
            ((IQ1)((Object)iterator)).b = clazz2;
            ((IQ1)((Object)iterator)).c = clazz3;
        }
        object3 = ((JP1)object2).b;
        synchronized (object3) {
            arrayList = ((JP1)object2).b;
            arrayList = ((a53)((Object)arrayList)).get(iterator);
            arrayList = arrayList;
        }
        object2 = ((JP1)object2).a;
        ((AtomicReference)object2).set(iterator);
        if (arrayList == null) {
            boolean bl3;
            arrayList = new ArrayList<Object>();
            object2 = ((Registry)object).a.a(clazz).iterator();
            while (bl3 = object2.hasNext()) {
                iterator = (Class)object2.next();
                object3 = ((Registry)object).c;
                iterator = ((CK2)object3).b((Class)((Object)iterator), clazz2).iterator();
                while (bl2 = iterator.hasNext()) {
                    object3 = (Class)iterator.next();
                    ArrayList arrayList2 = ((Registry)object).f.b((Class)object3, clazz3);
                    boolean bl4 = arrayList2.isEmpty();
                    if (bl4 || (bl4 = arrayList.contains(object3))) continue;
                    arrayList.add(object3);
                }
            }
            object = ((Registry)object).h;
            object2 = Collections.unmodifiableList(arrayList);
            ((JP1)object).a(clazz, clazz2, clazz3, (List)object2);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Ez0 e(Object object) {
        Object object2;
        Object object3;
        block6: {
            boolean bl2;
            object3 = this.c.b().b;
            object2 = object.getClass();
            // MONITORENTER : object3
            Object object4 = ((Fz0)object3).a;
            object4 = ((ArrayList)object4).iterator();
            while (bl2 = object4.hasNext()) {
                Object object5 = object4.next();
                object5 = (Fz0$a)object5;
                Class clazz = ((Fz0$a)object5).a;
                boolean bl3 = clazz.isAssignableFrom((Class<?>)object2);
                if (!bl3) continue;
                object2 = ((Fz0$a)object5).b;
            }
            {
                // MONITOREXIT : object3
                break block6;
                break;
            }
            object2 = null;
        }
        if (object2 != null) {
            return object2;
        }
        object = object.getClass();
        object2 = new StringBuilder("Failed to find source encoder for data class: ");
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        object3 = new RuntimeException((String)object);
        throw object3;
    }

    public final xq3_0 f(Class object) {
        Object object2;
        Object object3 = (xq3_0)this.j.get(object);
        if (object3 == null) {
            boolean bl2;
            object2 = this.j.entrySet().iterator();
            while (bl2 = object2.hasNext()) {
                Map.Entry entry = object2.next();
                Class clazz = (Class)entry.getKey();
                boolean bl3 = clazz.isAssignableFrom((Class<?>)object);
                if (!bl3) continue;
                object3 = (xq3_0)entry.getValue();
                break;
            }
        }
        if (object3 == null) {
            object3 = this.j;
            boolean bl4 = object3.isEmpty();
            if (bl4 && (bl4 = this.q)) {
                object2 = new StringBuilder("Missing transformation for ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
                object = ((StringBuilder)object2).toString();
                object3 = new IllegalArgumentException((String)object);
                throw object3;
            }
            return cw3.b;
        }
        return object3;
    }
}

