/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hh3
 */
public final class hh3_2
implements rq1_2,
Serializable {
    public Function0 a;
    public volatile Object b;
    public final Object c;

    public hh3_2(Function0 object, Object object2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            object2 = null;
        }
        String string2 = "initializer";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = object = rt3_0.a;
        if (object2 == null) {
            object2 = this;
        }
        this.c = object2;
    }

    private final Object writeReplace() {
        Object object = this.getValue();
        vh1_2 vh1_22 = new vh1_2(object);
        return vh1_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object getValue() {
        Object object = this.b;
        Object object2 = rt3_0.a;
        if (object != object2) {
            return object;
        }
        object = this.c;
        synchronized (object) {
            Object object3 = this.b;
            if (object3 == object2) {
                object2 = this.a;
                Intrinsics.checkNotNull(object2);
                this.b = object3 = object2.invoke();
                object2 = null;
                this.a = null;
            }
            return object3;
        }
    }

    public final boolean isInitialized() {
        boolean bl2;
        Object object = this.b;
        rt3_0 rt3_02 = rt3_0.a;
        if (object != rt3_02) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final String toString() {
        boolean bl2 = this.isInitialized();
        String string2 = bl2 ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
        return string2;
    }
}

