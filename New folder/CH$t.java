/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class CH$t {
    public final CH$e a = null;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public CH$t(CH$e cH$e, String string2) {
        this.b = null;
        if (cH$e == null) {
            cH$e = CH$e.DESCENDANT;
        }
        this.a = cH$e;
        this.b = string2;
    }

    public final void a(String string2, CH$c cH$c, String string3) {
        ArrayList<CH$b> arrayList = this.c;
        if (arrayList == null) {
            this.c = arrayList = new ArrayList<CH$b>();
        }
        arrayList = this.c;
        CH$b cH$b = new CH$b(string2, cH$c, string3);
        arrayList.add(cH$b);
    }

    public final String toString() {
        int n3;
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        Object object2 = CH$e.CHILD;
        if (object == object2) {
            object2 = "> ";
            stringBuilder.append((String)object2);
        } else {
            object2 = CH$e.FOLLOWS;
            if (object == object2) {
                object2 = "+ ";
                stringBuilder.append((String)object2);
            }
        }
        object2 = this.b;
        if (object2 == null) {
            object2 = "*";
        }
        stringBuilder.append((String)object2);
        object2 = this.c;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            while ((c2 = object2.hasNext()) != '\u0000') {
                object = (CH$b)object2.next();
                stringBuilder.append('[');
                Object object3 = ((CH$b)object).a;
                stringBuilder.append((String)object3);
                object3 = CH$a.a;
                CH$c cH$c = ((CH$b)object).b;
                int n4 = cH$c.ordinal();
                n3 = (int)object3[n4];
                n4 = 1;
                object = ((CH$b)object).c;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        n4 = 3;
                        if (n3 == n4) {
                            object3 = "|=";
                            stringBuilder.append((String)object3);
                            stringBuilder.append((String)object);
                        }
                    } else {
                        object3 = "~=";
                        stringBuilder.append((String)object3);
                        stringBuilder.append((String)object);
                    }
                } else {
                    n3 = 61;
                    stringBuilder.append((char)n3);
                    stringBuilder.append((String)object);
                }
                c2 = ']';
                stringBuilder.append(c2);
            }
        }
        if ((object2 = this.d) != null) {
            object2 = ((ArrayList)object2).iterator();
            while ((c2 = object2.hasNext()) != '\u0000') {
                object = (CH$g)object2.next();
                n3 = ':';
                stringBuilder.append((char)n3);
                stringBuilder.append(object);
            }
        }
        return stringBuilder.toString();
    }
}

