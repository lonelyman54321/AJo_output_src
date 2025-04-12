/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Renamed from dd1
 */
public final class dd1_0 {
    public final HashSet a;

    public dd1_0(HashSet hashSet) {
        HashSet hashSet2;
        this.a = hashSet2 = new HashSet();
        hashSet2.addAll(hashSet);
    }

    /*
     * WARNING - void declaration
     */
    public dd1_0(String[] stringArray) {
        int n3;
        HashSet hashSet;
        this.a = hashSet = new HashSet();
        if (stringArray != null && (n3 = stringArray.length) > 0) {
            for (String string2 : stringArray) {
                void object;
                Serializable serializable = q50_0.c;
                boolean bl2 = yz3_0.a(string2, (HashSet)serializable);
                if (!bl2) continue;
                if (string2 != null && !(bl2 = string2.isEmpty())) {
                    char[] cArray = string2.toCharArray();
                    int n4 = cArray.length;
                    boolean bl3 = true;
                    for (int i3 = 0; i3 < n4; ++i3) {
                        char c2 = cArray[i3];
                        boolean bl4 = Character.isSpaceChar(c2);
                        if (bl4) {
                            bl3 = true;
                        } else if (bl3) {
                            c2 = Character.toTitleCase(c2);
                            bl3 = false;
                        } else {
                            c2 = Character.toLowerCase(c2);
                        }
                        ((StringBuilder)serializable).append(c2);
                    }
                    String string3 = ((StringBuilder)serializable).toString();
                }
                serializable = this.a;
                ((HashSet)serializable).add(object);
            }
        }
    }

    public final boolean equals(Object object) {
        Serializable serializable;
        Class<dd1_0> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = dd1_0.class) == (serializable = object.getClass())) {
            object = (dd1_0)object;
            serializable = this.a;
            object = ((dd1_0)object).a;
            return serializable.equals(object);
        }
        return false;
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            HashSet hashSet = q50_0.c;
            String string2 = (String)iterator.next();
            boolean bl3 = hashSet.contains(string2);
            if (!bl3) continue;
            stringBuilder.append(string2);
            bl2 = iterator.hasNext();
            string2 = bl2 ? "," : "";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }
}

