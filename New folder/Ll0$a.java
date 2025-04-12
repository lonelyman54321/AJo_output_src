/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Ll0$a {
    public final Ll0$a$a a;
    public final AtomicBoolean b;

    public Ll0$a(Ll0$a$a object) {
        this.a = object;
        this.b = object = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final eI0 a(Object ... object) {
        Object object2;
        Serializable serializable;
        block11: {
            String string2;
            block10: {
                serializable = this.b;
                // MONITORENTER : serializable
                object2 = this.b;
                boolean bl2 = ((AtomicBoolean)object2).get();
                string2 = null;
                if (!bl2) break block10;
                // MONITOREXIT : serializable
                return null;
            }
            try {
                object2 = this.a;
                object2 = object2.a();
            }
            catch (Exception exception) {
                string2 = "Error instantiating extension";
                object2 = new RuntimeException(string2, exception);
                throw object2;
            }
            catch (ClassNotFoundException classNotFoundException) {}
            break block11;
            object2 = this.b;
            boolean bl3 = true;
            ((AtomicBoolean)object2).set(bl3);
            // MONITOREXIT : serializable
            return null;
        }
        // MONITOREXIT : serializable
        if (object2 == null) {
            return null;
        }
        try {
            object = ((Constructor)object2).newInstance(object);
            return (eI0)object;
        }
        catch (Exception exception) {
            serializable = new IllegalStateException("Unexpected error creating extractor", exception);
            throw serializable;
        }
    }
}

