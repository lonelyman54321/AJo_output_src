/*
 * Decompiled with CFR 0.152.
 */
import androidx.databinding.ViewDataBinding;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/*
 * Renamed from iF3
 */
public final class if3_0
extends WeakReference {
    public final z62_0 a;
    public final int b;
    public Object c;

    public if3_0(ViewDataBinding viewDataBinding, int n3, z62_0 z62_02, ReferenceQueue referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.b = n3;
        this.a = z62_02;
    }

    public final boolean a() {
        boolean bl2;
        Object object = this.c;
        if (object != null) {
            z62_0 z62_02 = this.a;
            z62_02.c(object);
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        this.c = null;
        return bl2;
    }
}

