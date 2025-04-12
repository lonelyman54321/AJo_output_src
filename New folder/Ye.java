/*
 * Decompiled with CFR 0.152.
 */
public final class Ye {
    public static final Class a;
    public static final boolean b;

    static {
        boolean bl2;
        Object object = "libcore.io.Memory";
        Class<?> clazz = null;
        try {
            object = Class.forName((String)object);
        }
        catch (Throwable throwable) {
            bl2 = false;
            object = null;
        }
        a = object;
        object = "org.robolectric.Robolectric";
        try {
            clazz = Class.forName((String)object);
        }
        catch (Throwable throwable) {}
        if (clazz != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        b = bl2;
    }

    public static boolean a() {
        boolean bl2;
        Class clazz = a;
        if (clazz != null && !(bl2 = b)) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        return bl2;
    }
}

