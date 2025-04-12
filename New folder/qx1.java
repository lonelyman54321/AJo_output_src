/*
 * Decompiled with CFR 0.152.
 */
public abstract class qx1 {
    public static final Object a;
    public static volatile qx1 b;

    static {
        Object object;
        a = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static qx1 a() {
        Object object = a;
        synchronized (object) {
            try {
                qx1 qx12 = b;
                if (qx12 != null) return b;
                b = qx12 = new Object();
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static String b(String string2) {
        int n3 = string2.length();
        StringBuilder stringBuilder = new StringBuilder(23);
        String string3 = "WM-";
        stringBuilder.append(string3);
        int n4 = 20;
        if (n3 >= n4) {
            n3 = 0;
            string2 = string2.substring(0, n4);
            stringBuilder.append(string2);
        } else {
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }
}

