/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

public final class jS2
implements iS2 {
    public final Function1 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    public jS2(Map map2, Function1 function1) {
        this.a = function1;
        if (map2 != null) {
            map2 = fh1_2.q(map2);
        } else {
        }
        this.b = map2;
        super();
        this.c = map2;
    }

    public final boolean a(Object object) {
        return (Boolean)this.a.invoke(object);
    }

    public final iS2$a b(String object, Function0 object2) {
        ArrayList arrayList;
        int n3;
        int n4;
        block4: {
            n4 = ((String)object).length();
            n3 = 0;
            arrayList = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                boolean bl2 = CharsKt.b(((String)object).charAt(i3));
                if (bl2) {
                    continue;
                }
                break block4;
            }
            n3 = 1;
        }
        n4 = n3 ^ 1;
        if (n4 != 0) {
            Object object3 = this.c;
            arrayList = (ArrayList)((LinkedHashMap)object3).get(object);
            if (arrayList == null) {
                arrayList = new ArrayList();
                object3.put(object, arrayList);
            }
            ((List)arrayList).add(object2);
            object3 = new jS2$a(this, (String)object, (Function0)object2);
            return object3;
        }
        object2 = "Registered key is empty or blank".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Map e() {
        boolean bl2;
        String string2 = null;
        int n3 = 1;
        LinkedHashMap linkedHashMap = fh1_2.q(this.b);
        Iterator iterator = this.c.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            String string3 = (String)object.getKey();
            int n4 = (object = (List)object.getValue()).size();
            if (n4 == n3) {
                if ((object = ((Function0)object.get(0)).invoke()) == null) continue;
                n4 = (int)(this.a(object) ? 1 : 0);
                if (n4 != 0) {
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object = xx_2.d(objectArray);
                    linkedHashMap.put(string3, object);
                    continue;
                }
                string2 = wi2_0.a(object);
                string2 = string2.toString();
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
            n4 = object.size();
            ArrayList<Object> arrayList = new ArrayList<Object>(n4);
            for (int i3 = 0; i3 < n4; i3 += n3) {
                boolean bl3;
                Object object2 = ((Function0)object.get(i3)).invoke();
                if (object2 != null && !(bl3 = this.a(object2))) {
                    string2 = wi2_0.a(object2);
                    string2 = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                }
                arrayList.add(object2);
            }
            linkedHashMap.put(string3, arrayList);
        }
        return linkedHashMap;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object f(String string2) {
        void var1_4;
        LinkedHashMap linkedHashMap = this.b;
        List list = (List)linkedHashMap.remove(string2);
        if (list != null) {
            Collection collection = list;
            collection = list;
            int n3 = collection.isEmpty();
            int n4 = 1;
            if ((n3 ^= n4) != 0) {
                n3 = list.size();
                if (n3 > n4) {
                    n3 = list.size();
                    collection = list.subList(n4, n3);
                    linkedHashMap.put(string2, collection);
                }
                Object e2 = list.get(0);
                return var1_4;
            }
        }
        Object var1_3 = null;
        return var1_4;
    }
}

