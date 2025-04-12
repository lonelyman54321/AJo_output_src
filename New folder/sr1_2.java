/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SR1
 */
public final class sr1_2 {
    public volatile SoftReference reference;

    public sr1_2() {
        SoftReference<Object> softReference;
        this.reference = softReference = new SoftReference<Object>(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(Function0 object) {
        synchronized (this) {
            SoftReference<Object> softReference = "factory";
            Intrinsics.checkNotNullParameter(object, (String)((Object)softReference));
            softReference = this.reference;
            softReference = softReference.get();
            if (softReference != null) {
                return softReference;
            }
            object = object.invoke();
            this.reference = softReference = new SoftReference<Object>(object);
            return object;
        }
    }
}

