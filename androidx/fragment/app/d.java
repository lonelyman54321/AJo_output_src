/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment$InstantiationException;

public class d {
    public static final a53 a;

    static {
        a53 a532;
        a = a532 = new a53();
    }

    public static Class a(ClassLoader classLoader, String string2) {
        Object object = a;
        a53 a532 = (a53)((a53)object).get(classLoader);
        if (a532 == null) {
            a532 = new a53();
            ((a53)object).put(classLoader, a532);
        }
        if ((object = (Class)a532.get(string2)) == null) {
            object = Class.forName(string2, false, classLoader);
            a532.put(string2, object);
        }
        return object;
    }

    public static Class b(ClassLoader classLoader, String string2) {
        String string3 = "Unable to instantiate fragment ";
        try {
            return d.a(classLoader, string2);
        }
        catch (ClassCastException classCastException) {
            string2 = cP.a(string3, string2, ": make sure class is a valid subclass of Fragment");
            Fragment$InstantiationException fragment$InstantiationException = new RuntimeException(string2, classCastException);
            throw fragment$InstantiationException;
        }
        catch (ClassNotFoundException classNotFoundException) {
            string2 = cP.a(string3, string2, ": make sure class name exists");
            Fragment$InstantiationException fragment$InstantiationException = new RuntimeException(string2, classNotFoundException);
            throw fragment$InstantiationException;
        }
    }
}

