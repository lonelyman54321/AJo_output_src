/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.integration.okhttp3.b$a;
import java.io.InputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;

public final class OQ1 {
    public static final OQ1$c e;
    public static final OQ1$a f;
    public final ArrayList a;
    public final OQ1$c b;
    public final HashSet c;
    public final yw2 d;

    static {
        Object object = new Object();
        e = object;
        f = object = new Object();
    }

    public OQ1(LI0$c lI0$c) {
        AbstractCollection abstractCollection;
        OQ1$c oQ1$c = e;
        this.a = abstractCollection = new AbstractCollection();
        this.c = abstractCollection;
        this.d = lI0$c;
        this.b = oQ1$c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Class serializable, Class clazz, CP1 cP1) {
        synchronized (this) {
            try {
                OQ1$b oQ1$b = new OQ1$b((Class)serializable, clazz, cP1);
                serializable = this.a;
                int n3 = ((ArrayList)serializable).size();
                ((ArrayList)serializable).add(n3, oQ1$b);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final BP1 b(OQ1$b oQ1$b) {
        return oQ1$b.c.c(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final BP1 c(Class object, Class object2) {
        synchronized (this) {
            Throwable throwable2;
            boolean bl2;
            String string2;
            Object object3;
            Serializable serializable;
            block11: {
                try {
                    int n3;
                    serializable = new ArrayList();
                    object3 = this.a;
                    object3 = ((ArrayList)object3).iterator();
                    string2 = null;
                    bl2 = false;
                    while (true) {
                        Object object4;
                        boolean bl3 = object3.hasNext();
                        n3 = 1;
                        if (!bl3) break;
                        Object object5 = object3.next();
                        Serializable serializable2 = this.c;
                        boolean bl4 = ((HashSet)serializable2).contains(object5 = (OQ1$b)object5);
                        if (bl4) {
                            bl2 = true;
                            continue;
                        }
                        serializable2 = ((OQ1$b)object5).a;
                        bl4 = ((Class)serializable2).isAssignableFrom((Class<?>)object);
                        if (!bl4 || !(bl4 = ((Class)(serializable2 = ((OQ1$b)object5).b)).isAssignableFrom((Class<?>)object2))) {
                            n3 = 0;
                            object4 = null;
                        }
                        if (n3 == 0) continue;
                        object4 = this.c;
                        ((HashSet)object4).add(object5);
                        object4 = this.b((OQ1$b)object5);
                        ((ArrayList)serializable).add(object4);
                        object4 = this.c;
                        ((HashSet)object4).remove(object5);
                    }
                    int n4 = ((ArrayList)serializable).size();
                    if (n4 > n3) {
                        object = this.b;
                        object2 = this.d;
                        object.getClass();
                        return new nq1_0((ArrayList)serializable, (yw2)object2);
                    }
                    n4 = ((ArrayList)serializable).size();
                    if (n4 != n3) break block11;
                    object = ((ArrayList)serializable).get(0);
                    return (BP1)object;
                }
                catch (Throwable throwable2) {}
            }
            if (bl2) {
                return f;
            }
            string2 = "Failed to find any ModelLoaders for model: ";
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append(object);
            object = " and data: ";
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(object2);
            object = ((StringBuilder)object3).toString();
            serializable = new RuntimeException((String)object);
            throw serializable;
            object2 = this.c;
            ((HashSet)object2).clear();
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList d(Class clazz) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList<Object> arrayList;
                try {
                    boolean bl2;
                    arrayList = new ArrayList<Object>();
                    Object object = this.a;
                    object = ((ArrayList)object).iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        Object object3 = this.c;
                        boolean bl3 = ((HashSet)object3).contains(object2 = (OQ1$b)object2);
                        if (bl3 || !(bl3 = ((Class)(object3 = ((OQ1$b)object2).a)).isAssignableFrom(clazz))) continue;
                        object3 = this.c;
                        ((HashSet)object3).add(object2);
                        object3 = ((OQ1$b)object2).c;
                        object3 = object3.c(this);
                        arrayList.add(object3);
                        object3 = this.c;
                        ((HashSet)object3).remove(object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return arrayList;
            }
            HashSet hashSet = this.c;
            hashSet.clear();
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList e(Class clazz) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList arrayList;
                try {
                    boolean bl2;
                    arrayList = new ArrayList();
                    Object object = this.a;
                    object = ((ArrayList)object).iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (OQ1$b)object2;
                        Class clazz2 = ((OQ1$b)object2).b;
                        boolean bl3 = arrayList.contains(clazz2);
                        if (bl3 || !(bl3 = (clazz2 = ((OQ1$b)object2).a).isAssignableFrom(clazz))) continue;
                        object2 = ((OQ1$b)object2).b;
                        arrayList.add(object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList f() {
        Class<a01> clazz = a01.class;
        Class<InputStream> clazz2 = InputStream.class;
        synchronized (this) {
            Throwable throwable2;
            block7: {
                ArrayList arrayList;
                try {
                    boolean bl2;
                    arrayList = new ArrayList();
                    Object object = this.a;
                    object = ((ArrayList)object).iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (OQ1$b)object2;
                        Class clazz3 = ((OQ1$b)object2).a;
                        boolean bl3 = clazz3.isAssignableFrom(clazz);
                        if (bl3 && (bl3 = (clazz3 = ((OQ1$b)object2).b).isAssignableFrom(clazz2))) {
                            bl3 = true;
                        } else {
                            bl3 = false;
                            clazz3 = null;
                        }
                        if (!bl3) continue;
                        object.remove();
                        object2 = ((OQ1$b)object2).c;
                        arrayList.add(object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList g(b$a b$a) {
        Class<a01> clazz = a01.class;
        Class<InputStream> clazz2 = InputStream.class;
        synchronized (this) {
            ArrayList arrayList = this.f();
            this.a(clazz, clazz2, b$a);
            return arrayList;
        }
    }
}

