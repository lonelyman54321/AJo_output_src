/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import java.io.Serializable;

/*
 * Renamed from b01
 */
public final class b01_0
extends i {
    public static final b01_0 b;
    public static final b01$a c;

    static {
        Object object = new i();
        b = object;
        c = object = new Object();
    }

    public final void a(lu1 object) {
        boolean bl2 = object instanceof jm0_1;
        if (bl2) {
            object = (jm0_1)object;
            b01$a b01$a = c;
            object.A(b01$a);
            object.onStart(b01$a);
            object.p(b01$a);
            return;
        }
        Serializable serializable = new StringBuilder();
        serializable.append(object);
        serializable.append(" must implement androidx.lifecycle.DefaultLifecycleObserver.");
        object = serializable.toString();
        object = object.toString();
        serializable = new IllegalArgumentException((String)object);
        throw serializable;
    }

    public final i$b b() {
        return i$b.RESUMED;
    }

    public final void c(lu1 lu12) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}

