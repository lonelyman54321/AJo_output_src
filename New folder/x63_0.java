/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from x63
 */
public class x63_0 {
    public Function1 a;
    public volatile Object b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(Object object) {
        Object object2 = this.b;
        if (object2 != null) {
            return object2;
        }
        synchronized (this) {
            object2 = this.b;
            if (object2 == null) {
                object2 = this.a;
                Intrinsics.checkNotNull(object2);
                this.b = object2 = object2.invoke(object);
                object = null;
                this.a = null;
            }
            return object2;
        }
    }
}

