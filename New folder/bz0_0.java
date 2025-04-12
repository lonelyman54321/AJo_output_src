/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$f;

/*
 * Renamed from bZ0
 */
public final class bz0_0
implements uO1 {
    public static final bz0_0 a;

    static {
        bz0_0 bz0_02;
        a = bz0_02 = new Object();
    }

    public final boolean isSupported(Class clazz) {
        return n.class.isAssignableFrom(clazz);
    }

    public final tO1 messageInfoFor(Class object) {
        Class<n> clazz = n.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
        if (bl2) {
            Object object2;
            try {
                clazz = ((Class)object).asSubclass(clazz);
            }
            catch (Exception exception) {
                object = ((Class)object).getName();
                object = "Unable to get message info for ".concat((String)object);
                object2 = new RuntimeException((String)object, exception);
                throw object2;
            }
            clazz = n.g(clazz);
            object2 = n$f.BUILD_MESSAGE_INFO;
            clazz = ((n)((Object)clazz)).f((n$f)((Object)object2));
            return (tO1)((Object)clazz);
        }
        object = ((Class)object).getName();
        object = "Unsupported message type: ".concat((String)object);
        clazz = new IllegalArgumentException((String)object);
        throw clazz;
    }
}

