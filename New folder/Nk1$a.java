/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;

public final class Nk1$a {
    public static final Nk1$a a;
    public static final Integer b;

    static {
        int n3;
        Object object;
        Object object2;
        block6: {
            String string2;
            object2 = new Object();
            a = object2;
            object2 = null;
            object = "android.os.Build$VERSION";
            try {
                object = Class.forName((String)object);
                string2 = "SDK_INT";
            }
            catch (Throwable throwable) {}
            object = ((Class)object).getField(string2);
            object = ((Field)object).get(null);
            n3 = object instanceof Integer;
            if (n3 == 0) break block6;
            object = (Integer)object;
        }
        object = null;
        if (object != null && (n3 = ((Number)object).intValue()) > 0) {
            object2 = object;
        }
        b = object2;
    }
}

