/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SpreadBuilder {
    private final ArrayList list;

    public SpreadBuilder(int n3) {
        ArrayList arrayList;
        this.list = arrayList = new ArrayList(n3);
    }

    public void add(Object object) {
        this.list.add(object);
    }

    public void addSpread(Object object) {
        block9: {
            block6: {
                int n3;
                block8: {
                    block7: {
                        block5: {
                            if (object == null) {
                                return;
                            }
                            n3 = object instanceof Object[];
                            if (n3 == 0) break block5;
                            n3 = ((Object[])(object = (Object[])object)).length;
                            if (n3 > 0) {
                                ArrayList arrayList = this.list;
                                int n4 = arrayList.size();
                                int n7 = ((Object[])object).length;
                                arrayList.ensureCapacity(n4 += n7);
                                arrayList = this.list;
                                Collections.addAll(arrayList, object);
                            }
                            break block6;
                        }
                        n3 = object instanceof Collection;
                        if (n3 == 0) break block7;
                        ArrayList arrayList = this.list;
                        object = (Collection)object;
                        arrayList.addAll(object);
                        break block6;
                    }
                    n3 = object instanceof Iterable;
                    if (n3 == 0) break block8;
                    object = ((Iterable)object).iterator();
                    while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        Object e2 = object.next();
                        ArrayList arrayList = this.list;
                        arrayList.add(e2);
                    }
                    break block6;
                }
                n3 = object instanceof Iterator;
                if (n3 != 0) {
                    object = (Iterator)object;
                    while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        ArrayList arrayList = this.list;
                        Object e5 = object.next();
                        arrayList.add(e5);
                    }
                }
                break block9;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Don't know how to spread ");
        object = object.getClass();
        stringBuilder.append(object);
        object = stringBuilder.toString();
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }

    public int size() {
        return this.list.size();
    }

    public Object[] toArray(Object[] objectArray) {
        return this.list.toArray(objectArray);
    }
}

