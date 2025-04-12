/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

public final class R11 {
    public final R11$a a;
    public final HashMap b;

    public R11() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = hashMap = new HashMap();
    }

    public final Object a(uw2_0 object) {
        int n3;
        Object object2 = this.b;
        R11$a r11$a = (R11$a)((HashMap)object2).get(object);
        if (r11$a == null) {
            r11$a = new R11$a(object);
            ((HashMap)object2).put(object, r11$a);
        } else {
            object.a();
        }
        object = r11$a.d;
        ((R11$a)object).c = object2 = r11$a.c;
        object2 = r11$a.c;
        ((R11$a)object2).d = object;
        r11$a.d = object = this.a;
        r11$a.c = object = ((R11$a)object).c;
        ((R11$a)object).d = r11$a;
        r11$a.d.c = r11$a;
        object = r11$a.b;
        if (object != null) {
            n3 = ((ArrayList)object).size();
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 > 0) {
            object2 = r11$a.b;
            object = ((ArrayList)object2).remove(n3 += -1);
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final void b(uw2_0 arrayList, Object object) {
        HashMap hashMap = this.b;
        R11$a r11$a = (R11$a)hashMap.get(arrayList);
        if (r11$a == null) {
            R11$a r11$a2;
            r11$a.c = r11$a = new R11$a(arrayList);
            r11$a.d = r11$a;
            R11$a r11$a3 = this.a;
            r11$a.d = r11$a2 = r11$a3.d;
            r11$a.c = r11$a3;
            r11$a3.d = r11$a;
            r11$a3 = r11$a.d;
            r11$a3.c = r11$a;
            hashMap.put(arrayList, r11$a);
        } else {
            arrayList.a();
        }
        arrayList = r11$a.b;
        if (arrayList == null) {
            r11$a.b = arrayList = new ArrayList();
        }
        r11$a.b.add(object);
    }

    public final Object c() {
        R11$a r11$a = this.a;
        R11$a r11$a2 = r11$a.d;
        while (true) {
            int n3 = r11$a2.equals(r11$a);
            Object object = null;
            if (n3 != 0) break;
            Object object2 = r11$a2.b;
            if (object2 != null) {
                n3 = ((ArrayList)object2).size();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (n3 > 0) {
                object = r11$a2.b;
                object = ((ArrayList)object).remove(n3 += -1);
            }
            if (object != null) {
                return object;
            }
            object2 = r11$a2.d;
            ((R11$a)object2).c = object = r11$a2.c;
            r11$a2.c.d = object2;
            object2 = this.b;
            object = r11$a2.a;
            ((HashMap)object2).remove(object);
            object = (uw2_0)object;
            object.a();
            r11$a2 = r11$a2.d;
        }
        return null;
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        R11$a r11$a = this.a;
        R11$a r11$a2 = r11$a.c;
        int n3 = 0;
        Object object = null;
        while (!(bl2 = r11$a2.equals(r11$a))) {
            stringBuilder.append('{');
            object = r11$a2.a;
            stringBuilder.append(object);
            n3 = 58;
            stringBuilder.append((char)n3);
            object = r11$a2.b;
            if (object != null) {
                n3 = ((ArrayList)object).size();
            } else {
                n3 = 0;
                object = null;
            }
            stringBuilder.append(n3);
            object = "}, ";
            stringBuilder.append((String)object);
            r11$a2 = r11$a2.c;
            n3 = 1;
        }
        if (n3 != 0) {
            int n4 = stringBuilder.length() + -2;
            int n7 = stringBuilder.length();
            stringBuilder.delete(n4, n7);
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }
}

