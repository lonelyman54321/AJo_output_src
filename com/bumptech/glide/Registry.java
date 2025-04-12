/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide;

import com.bumptech.glide.Registry$NoImageHeaderParserException;
import com.bumptech.glide.integration.okhttp3.b$a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.data.a$a;
import com.bumptech.glide.load.data.b;
import com.bumptech.glide.load.engine.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class Registry {
    public final DP1 a;
    public final Fz0 b;
    public final CK2 c;
    public final FK2 d;
    public final b e;
    public final Jq3 f;
    public final Nd1 g;
    public final JP1 h;
    public final Nv1 i;
    public final LI0$c j;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Registry() {
        Object object;
        ArrayList<ArrayList<ArrayList<String>>> arrayList;
        Object object2 = new JP1();
        this.h = object2;
        this.i = object2 = new Nv1();
        int n3 = 20;
        object2 = new bw2_1(n3);
        super();
        Object object3 = new LI0$c((bw2_1)object2, (LI0$b)((Object)arrayList), (LI0$e)object);
        this.j = object3;
        this.a = object2 = new DP1((LI0$c)object3);
        this.b = object2 = new Fz0();
        this.c = object2 = new CK2();
        this.d = object2 = new FK2();
        this.e = object2 = new b();
        this.f = object2 = new Jq3();
        this.g = object2 = new Nd1();
        object2 = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        int n4 = object2.size();
        arrayList = new ArrayList<ArrayList<ArrayList<String>>>(n4);
        object = "legacy_prepend_all";
        arrayList.add((ArrayList<ArrayList<String>>)object);
        object2 = object2.iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = (String)object2.next();
            arrayList.add((ArrayList<ArrayList<String>>)object);
        }
        arrayList.add((ArrayList<ArrayList<String>>)((Object)"legacy_append"));
        object2 = this.c;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                Object object4;
                boolean bl2;
                try {
                    object3 = ((CK2)object2).a;
                    object = new ArrayList(object3);
                    object3 = ((CK2)object2).a;
                    ((ArrayList)object3).clear();
                    object3 = arrayList.iterator();
                    while (bl2 = object3.hasNext()) {
                        object4 = object3.next();
                        object4 = (String)object4;
                        ArrayList arrayList2 = ((CK2)object2).a;
                        arrayList2.add(object4);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object = ((ArrayList)object).iterator();
                while (true) {
                    boolean bl3;
                    if (!(bl3 = object.hasNext())) {
                        return;
                    }
                    object3 = object.next();
                    bl2 = arrayList.contains(object3 = (String)object3);
                    if (bl2) continue;
                    object4 = ((CK2)object2).a;
                    ((ArrayList)object4).add((Object)object3);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Class clazz, Ez0 ez0) {
        Fz0 fz0 = this.b;
        synchronized (fz0) {
            ArrayList arrayList = fz0.a;
            Fz0$a fz0$a = new Fz0$a(clazz, ez0);
            arrayList.add(fz0$a);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Class clazz, ek2_0 ek2_02) {
        FK2 fK2 = this.d;
        synchronized (fK2) {
            ArrayList arrayList = fK2.a;
            FK2$a fK2$a = new FK2$a(clazz, ek2_02);
            arrayList.add(fK2$a);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Class object, Class clazz, CP1 cP1) {
        DP1 dP1 = this.a;
        synchronized (dP1) {
            OQ1 oQ1 = dP1.a;
            oQ1.a((Class)object, clazz, cP1);
            object = dP1.b;
            object = ((DP1$a)object).a;
            ((HashMap)object).clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(String object, Class clazz, Class clazz2, BK2 bK2) {
        CK2 cK2 = this.c;
        synchronized (cK2) {
            object = cK2.a((String)object);
            CK2$a cK2$a = new CK2$a(clazz, clazz2, bK2);
            object.add(cK2$a);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList e(Class clazz, Class object, Class clazz2) {
        Throwable throwable2;
        ArrayList<e> arrayList = new ArrayList<e>();
        Object object2 = this.c;
        object = ((CK2)object2).b(clazz, (Class)object).iterator();
        block4: while (true) {
            boolean bl2;
            if (!(bl2 = object.hasNext())) {
                return arrayList;
            }
            object2 = (Class)object.next();
            Object object3 = this.f.b((Class)object2, clazz2);
            Iterator iterator = ((ArrayList)object3).iterator();
            while (true) {
                e e2;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                ArrayList<Object> arrayList2;
                boolean bl3;
                if (!(bl3 = iterator.hasNext())) continue block4;
                object3 = iterator.next();
                Serializable serializable = object3;
                serializable = (Class)object3;
                object3 = this.c;
                synchronized (object3) {
                    try {
                        boolean bl4;
                        arrayList2 = new ArrayList<Object>();
                        object7 = ((CK2)object3).a;
                        object7 = ((ArrayList)object7).iterator();
                        while (bl4 = object7.hasNext()) {
                            boolean bl5;
                            object6 = object7.next();
                            object6 = (String)object6;
                            object5 = ((CK2)object3).b;
                            object6 = ((HashMap)object5).get(object6);
                            if ((object6 = (List)object6) == null) continue;
                            object6 = object6.iterator();
                            while (bl5 = object6.hasNext()) {
                                object5 = object6.next();
                                object5 = (CK2$a)object5;
                                object4 = ((CK2$a)object5).a;
                                boolean bl6 = ((Class)object4).isAssignableFrom(clazz);
                                if (bl6 && (bl6 = ((Class)object2).isAssignableFrom((Class<?>)(object4 = ((CK2$a)object5).b)))) {
                                    bl6 = true;
                                } else {
                                    bl6 = false;
                                    object4 = null;
                                }
                                if (!bl6) continue;
                                object5 = ((CK2$a)object5).c;
                                arrayList2.add(object5);
                            }
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object5 = this.f.a((Class)object2, (Class)serializable);
                object4 = this.j;
                object3 = e2;
                object7 = clazz;
                object6 = object2;
                e2 = new e(clazz, (Class)object2, (Class)serializable, arrayList2, (RK2)object5, (yw2)object4);
                arrayList.add(e2);
            }
            break;
        }
        {
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList f() {
        ArrayList arrayList;
        Object object = this.g;
        synchronized (object) {
            arrayList = ((Nd1)object).a;
        }
        boolean bl2 = arrayList.isEmpty();
        if (!bl2) {
            return arrayList;
        }
        object = new Registry$NoImageHeaderParserException();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final List g(Object object) {
        DP1$a$a dP1$a$a;
        Object object2;
        Object object5 = this.a;
        object5.getClass();
        Object object4 = object.getClass();
        // MONITORENTER : object5
        Object object3 = ((DP1)object5).b;
        object3 = ((DP1$a)object3).a;
        object3 = ((HashMap)object3).get(object4);
        object3 = (DP1$a$a)object3;
        object3 = object3 == null ? null : ((DP1$a$a)object3).a;
        if (object3 == null) {
            object3 = ((DP1)object5).a;
            object3 = ((OQ1)object3).d((Class)object4);
            object3 = Collections.unmodifiableList(object3);
            object2 = ((DP1)object5).b;
            object2 = ((DP1$a)object2).a;
            dP1$a$a = new DP1$a$a((List)object3);
            object2 = ((HashMap)object2).put(object4, dP1$a$a);
            if ((object2 = (DP1$a$a)object2) != null) {
                object2 = "Already cached loaders for model: ";
                object3 = new StringBuilder((String)object2);
                ((StringBuilder)object3).append(object4);
                object4 = ((StringBuilder)object3).toString();
                object = new IllegalStateException((String)object4);
                throw object;
            }
        }
        int n3 = object3.isEmpty();
        if (n3 != 0) {
            object4 = new StringBuilder("Failed to find any ModelLoaders registered for model class: ");
            object = object.getClass();
            ((StringBuilder)object4).append(object);
            object = ((StringBuilder)object4).toString();
            object5 = new RuntimeException((String)object);
            throw object5;
        }
        n3 = object3.size();
        object4 = Collections.emptyList();
        int n4 = 1;
        dP1$a$a = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            BP1 bP1 = (BP1)object3.get(i3);
            boolean bl2 = bP1.b(object);
            if (!bl2) continue;
            if (n4 != 0) {
                n4 = n3 - i3;
                object4 = new ArrayList(n4);
                n4 = 0;
                object2 = null;
            }
            object4.add(bP1);
        }
        n3 = (int)(object4.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            return object4;
        }
        object4 = new StringBuilder("Found ModelLoaders for model class: ");
        ((StringBuilder)object4).append(object3);
        ((StringBuilder)object4).append(", but none that handle this specific model instance: ");
        ((StringBuilder)object4).append(object);
        object = ((StringBuilder)object4).toString();
        object5 = new RuntimeException((String)object);
        throw object5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a h(Object object) {
        b b2 = this.e;
        synchronized (b2) {
            Throwable throwable2;
            block6: {
                Object object2;
                block5: {
                    try {
                        boolean bl2;
                        dV0.b(object);
                        object2 = b2.a;
                        Iterator iterator = object.getClass();
                        object2 = ((HashMap)object2).get(iterator);
                        object2 = (a$a)object2;
                        if (object2 != null) break block5;
                        iterator = b2.a;
                        iterator = ((HashMap)((Object)iterator)).values();
                        iterator = iterator.iterator();
                        while (bl2 = iterator.hasNext()) {
                            Class<?> clazz;
                            Object object3 = iterator.next();
                            Class clazz2 = (object3 = (a$a)object3).a();
                            boolean bl3 = clazz2.isAssignableFrom(clazz = object.getClass());
                            if (!bl3) continue;
                            object2 = object3;
                            break;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (object2 != null) return object2.b(object);
                object2 = com.bumptech.glide.load.data.b.b;
                return object2.b(object);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(ImageHeaderParser imageHeaderParser) {
        Nd1 nd1 = this.g;
        synchronized (nd1) {
            ArrayList arrayList = nd1.a;
            arrayList.add(imageHeaderParser);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(a$a a$a) {
        b b2 = this.e;
        synchronized (b2) {
            HashMap hashMap = b2.a;
            Class clazz = a$a.a();
            hashMap.put(clazz, a$a);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(Class clazz, Class clazz2, RK2 rK2) {
        Jq3 jq3 = this.f;
        synchronized (jq3) {
            ArrayList arrayList = jq3.a;
            Jq3$a jq3$a = new Jq3$a(clazz, clazz2, rK2);
            arrayList.add(jq3$a);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(b$a object) {
        DP1 dP1 = this.a;
        synchronized (dP1) {
            Object object2 = dP1.a;
            object = ((OQ1)object2).g((b$a)object);
            object = ((ArrayList)object).iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    object = dP1.b;
                    object = ((DP1$a)object).a;
                    ((HashMap)object).clear();
                    return;
                }
                object2 = object.next();
                object2 = (CP1)object2;
                object2.getClass();
            }
        }
    }
}

