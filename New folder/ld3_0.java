/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lD3
 */
public final class ld3_0 {
    public final ih3_0 a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public volatile boolean d;

    public ld3_0() {
        Cloneable cloneable;
        this.a = cloneable;
        this.b = cloneable = new Cloneable();
        super();
        this.c = cloneable;
    }

    public ld3_0(i90_0 object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "viewModelScope");
        this.a = object2;
        object2 = new LinkedHashMap();
        this.b = object2;
        super();
        this.c = object2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "coroutineScope");
        object = object.getCoroutineContext();
        object2 = new aW((CoroutineContext)object);
        this.b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", (AutoCloseable)object2);
    }

    public ld3_0(i90_0 object, AutoCloseable ... autoCloseableArray) {
        Cloneable cloneable;
        Intrinsics.checkNotNullParameter(object, "viewModelScope");
        Intrinsics.checkNotNullParameter(autoCloseableArray, "closeables");
        this.a = cloneable;
        this.b = cloneable = new Cloneable();
        super();
        this.c = cloneable;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "coroutineScope");
        object = object.getCoroutineContext();
        aW aW2 = new aW((CoroutineContext)object);
        this.b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aW2);
        cx_2.t(cloneable, autoCloseableArray);
    }

    public ld3_0(AutoCloseable ... autoCloseableArray) {
        Cloneable cloneable;
        Intrinsics.checkNotNullParameter(autoCloseableArray, "closeables");
        this.a = cloneable;
        this.b = cloneable = new Cloneable();
        super();
        this.c = cloneable;
        cx_2.t(cloneable, autoCloseableArray);
    }

    public static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            }
            catch (Exception exception) {
                RuntimeException runtimeException = new RuntimeException(exception);
                throw runtimeException;
            }
        }
    }

    public final void a(AutoCloseable object) {
        Object object2 = "closeable";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.d;
        if (bl2) {
            ld3_0.c((AutoCloseable)object);
            return;
        }
        object2 = this.a;
        synchronized (object2) {
            LinkedHashSet linkedHashSet = this.c;
            linkedHashSet.add(object);
            object = Unit.a;
            return;
        }
    }

    public final void b(String object, AutoCloseable autoCloseable) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = "closeable";
        Intrinsics.checkNotNullParameter(autoCloseable, (String)object2);
        boolean bl2 = this.d;
        if (bl2) {
            ld3_0.c(autoCloseable);
            return;
        }
        object2 = this.a;
        synchronized (object2) {
            LinkedHashMap linkedHashMap = this.b;
            object = linkedHashMap.put(object, autoCloseable);
            object = (AutoCloseable)object;
            ld3_0.c((AutoCloseable)object);
            return;
        }
    }
}

