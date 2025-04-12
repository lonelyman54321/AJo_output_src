/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class CK2 {
    public final ArrayList a;
    public final HashMap b;

    public CK2() {
        Cloneable cloneable;
        this.a = cloneable = new Cloneable();
        this.b = cloneable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List a(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList arrayList;
                block4: {
                    try {
                        arrayList = this.a;
                        boolean bl2 = arrayList.contains(string2);
                        if (bl2) break block4;
                        arrayList = this.a;
                        arrayList.add(string2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                arrayList = this.b;
                arrayList = ((HashMap)((Object)arrayList)).get(string2);
                if ((arrayList = (List)arrayList) == null) {
                    arrayList = new ArrayList();
                    HashMap hashMap = this.b;
                    hashMap.put(string2, arrayList);
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
    public final ArrayList b(Class clazz, Class clazz2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                ArrayList<Object> arrayList;
                try {
                    boolean bl2;
                    arrayList = new ArrayList<Object>();
                    Object object = this.a;
                    object = ((ArrayList)object).iterator();
                    while (bl2 = object.hasNext()) {
                        boolean bl3;
                        Object object2 = object.next();
                        object2 = (String)object2;
                        Object object3 = this.b;
                        object2 = ((HashMap)object3).get(object2);
                        if ((object2 = (List)object2) == null) continue;
                        object2 = object2.iterator();
                        while (bl3 = object2.hasNext()) {
                            object3 = object2.next();
                            object3 = (CK2$a)object3;
                            Class clazz3 = ((CK2$a)object3).a;
                            boolean bl4 = clazz3.isAssignableFrom(clazz);
                            if (bl4 && (bl4 = clazz2.isAssignableFrom(clazz3 = ((CK2$a)object3).b))) {
                                bl4 = true;
                            } else {
                                bl4 = false;
                                clazz3 = null;
                            }
                            if (!bl4 || (bl4 = arrayList.contains(clazz3 = ((CK2$a)object3).b))) continue;
                            object3 = ((CK2$a)object3).b;
                            arrayList.add(object3);
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }
}

