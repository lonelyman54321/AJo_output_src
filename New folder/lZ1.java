/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.B;
import java.lang.reflect.Constructor;

public final class lZ1 {
    public static final kZ1 a;
    public static final B b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = null;
        Object object2 = "androidx.datastore.preferences.protobuf.NewInstanceSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (kZ1)object2;
        }
        catch (Exception exception) {}
        a = object;
        object = new Object();
        b = object;
    }
}

