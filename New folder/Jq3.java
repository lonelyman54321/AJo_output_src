/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class Jq3 {
    public final ArrayList a;

    public Jq3() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final RK2 a(Class object, Class clazz) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                Object object2;
                Object object3;
                Object object4;
                try {
                    boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
                    if (bl2) {
                        return bw3.a;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                {
                    boolean bl3;
                    object4 = this.a;
                    object4 = ((ArrayList)object4).iterator();
                    while (bl3 = object4.hasNext()) {
                        object3 = object4.next();
                        object3 = (Jq3$a)object3;
                        object2 = ((Jq3$a)object3).a;
                        boolean bl4 = ((Class)object2).isAssignableFrom((Class<?>)object);
                        if (bl4 && (bl4 = clazz.isAssignableFrom((Class<?>)(object2 = ((Jq3$a)object3).b)))) {
                            bl4 = true;
                        } else {
                            bl4 = false;
                            object2 = null;
                        }
                        if (!bl4) continue;
                        return ((Jq3$a)object3).c;
                    }
                }
                {
                    object3 = new StringBuilder();
                    object2 = "No transcoder registered to transcode from ";
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(object);
                    object = " to ";
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(clazz);
                    object = ((StringBuilder)object3).toString();
                    object4 = new IllegalArgumentException((String)object);
                    throw object4;
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
    public final ArrayList b(Class clazz, Class clazz2) {
        synchronized (this) {
            ArrayList<Class<Object>> arrayList;
            try {
                arrayList = new ArrayList<Class<Object>>();
                boolean bl2 = clazz2.isAssignableFrom(clazz);
                if (bl2) {
                    arrayList.add(clazz2);
                    return arrayList;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
            Object object = this.a;
            object = ((ArrayList)object).iterator();
            boolean bl3;
            while (bl3 = object.hasNext()) {
                Object object2 = object.next();
                object2 = (Jq3$a)object2;
                Class clazz3 = ((Jq3$a)object2).a;
                boolean bl4 = clazz3.isAssignableFrom(clazz);
                if (bl4 && (bl4 = clazz2.isAssignableFrom(clazz3 = ((Jq3$a)object2).b))) {
                    bl4 = true;
                } else {
                    bl4 = false;
                    clazz3 = null;
                }
                if (!bl4 || (bl4 = arrayList.contains(clazz3 = ((Jq3$a)object2).b))) continue;
                object2 = ((Jq3$a)object2).b;
                arrayList.add((Class<Object>)object2);
            }
            return arrayList;
        }
    }
}

