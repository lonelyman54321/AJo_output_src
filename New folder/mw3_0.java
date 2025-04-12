/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mw3
 */
public final class mw3_0
implements rq1_2,
Serializable {
    public Function0 a;
    public Object b;

    private final Object writeReplace() {
        Object object = this.getValue();
        vh1_2 vh1_22 = new vh1_2(object);
        return vh1_22;
    }

    public final Object getValue() {
        Object object = this.b;
        rt3_0 rt3_02 = rt3_0.a;
        if (object == rt3_02) {
            object = this.a;
            Intrinsics.checkNotNull(object);
            this.b = object = object.invoke();
            object = null;
            this.a = null;
        }
        return this.b;
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

