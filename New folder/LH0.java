/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k_0;
import java.lang.reflect.Constructor;

public final class LH0 {
    public static final k_0 a;
    public static final j b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = new j();
        a = object;
        object = null;
        Object object2 = "androidx.datastore.preferences.protobuf.ExtensionSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (j)object2;
        }
        catch (Exception exception) {}
        b = object;
    }
}

