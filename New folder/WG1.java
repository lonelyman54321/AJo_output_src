/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import java.lang.reflect.Constructor;

public final class WG1 {
    public static final w a;
    public static final x b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = null;
        Object object2 = "androidx.datastore.preferences.protobuf.MapFieldSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (w)object2;
        }
        catch (Exception exception) {}
        a = object;
        object = new Object();
        b = object;
    }
}

