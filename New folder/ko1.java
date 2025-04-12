/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ko1 {
    public static final ko1 c;
    public final List a;
    public lo1_1 b;

    static {
        ko1 ko12;
        String[] stringArray = new String[]{"COMPOSITION"};
        c = ko12 = new ko1(stringArray);
    }

    public ko1(ko1 object) {
        ArrayList arrayList;
        List list = ((ko1)object).a;
        this.a = arrayList = new ArrayList(list);
        this.b = object = ((ko1)object).b;
    }

    public ko1(String ... object) {
        this.a = object = Arrays.asList(object);
    }

    public final boolean a(int n3, String string2) {
        String string3;
        List list = this.a;
        int n4 = list.size();
        boolean bl2 = false;
        if (n3 >= n4) {
            return false;
        }
        n4 = list.size();
        int n7 = 1;
        n4 = n3 == (n4 -= n7) ? 1 : 0;
        String string4 = (String)list.get(n3);
        boolean bl3 = string4.equals(string3 = "**");
        if (!bl3) {
            String string5;
            boolean bl4 = string4.equals(string2);
            if (!bl4 && !(bl4 = string4.equals(string2 = "*"))) {
                bl4 = false;
                string2 = null;
            } else {
                bl4 = true;
            }
            if ((n4 != 0 || n3 == (n4 = list.size() + -2) && (n3 = (int)((string5 = (String)on_2.d(n7, list)).equals(string3) ? 1 : 0)) != 0) && bl4) {
                bl2 = true;
            }
            return bl2;
        }
        if (n4 == 0) {
            int n8 = n3 + 1;
            string4 = (String)list.get(n8);
            if ((n8 = (int)(string4.equals(string2) ? 1 : 0)) != 0) {
                String string6;
                int n10 = list.size() + -2;
                if (n3 == n10 || n3 == (n10 = list.size() + -3) && (n3 = (int)((string6 = (String)on_2.d(n7, list)).equals(string3) ? 1 : 0)) != 0) {
                    bl2 = true;
                }
                return bl2;
            }
        }
        if (n4 != 0) {
            return n7 != 0;
        }
        n4 = list.size() - n7;
        if ((n3 += n7) < n4) {
            return false;
        }
        return ((String)list.get(n3)).equals(string2);
    }

    public final int b(int n3, String string2) {
        Object object = "__container";
        boolean bl2 = ((String)object).equals(string2);
        if (bl2) {
            return 0;
        }
        object = this.a;
        String string3 = (String)object.get(n3);
        String string4 = "**";
        int n4 = string3.equals(string4);
        int n7 = 1;
        if (n4 == 0) {
            return n7;
        }
        n4 = object.size() - n7;
        if (n3 == n4) {
            return 0;
        }
        n3 += n7;
        String string5 = (String)object.get(n3);
        if ((n3 = (int)(string5.equals(string2) ? 1 : 0)) != 0) {
            return 2;
        }
        return 0;
    }

    public final boolean c(int n3, String string2) {
        String string3;
        Object object = "__container";
        boolean bl2 = ((String)object).equals(string2);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        object = this.a;
        int n4 = object.size();
        if (n3 >= n4) {
            return false;
        }
        String string4 = (String)object.get(n3);
        boolean bl4 = string4.equals(string2);
        if (!bl4 && !(bl4 = (string2 = (String)object.get(n3)).equals(string4 = "**")) && (n3 = (int)((string3 = (String)object.get(n3)).equals(string2 = "*") ? 1 : 0)) == 0) {
            return false;
        }
        return bl3;
    }

    public final boolean d(int n3, String object) {
        String string2;
        String string3 = "__container";
        boolean bl2 = string3.equals(object);
        int n4 = 1;
        if (bl2) {
            return n4 != 0;
        }
        object = this.a;
        int n7 = object.size() - n4;
        if (n3 >= n7 && (n3 = (int)((string2 = (String)object.get(n3)).equals(object = "**") ? 1 : 0)) == 0) {
            n4 = 0;
            string3 = null;
        }
        return n4 != 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = ko1.class) == (object2 = object.getClass())) {
            object = (ko1)object;
            object2 = this.a;
            object3 = ((ko1)object).a;
            boolean bl3 = object2.equals(object3);
            if (!bl3) {
                return false;
            }
            object2 = this.b;
            object = ((ko1)object).b;
            if (object2 != null) {
                bl2 = object2.equals(object);
            } else if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        List list = this.a;
        int n4 = list.hashCode() * 31;
        lo1_1 lo1_12 = this.b;
        if (lo1_12 != null) {
            n3 = lo1_12.hashCode();
        } else {
            n3 = 0;
            lo1_12 = null;
        }
        return n4 + n3;
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("KeyPath{keys=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(",resolved=");
        object = this.b;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return AR.a(stringBuilder, bl2, '}');
    }
}

