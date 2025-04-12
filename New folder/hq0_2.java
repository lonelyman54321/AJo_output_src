/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hQ0
 */
public final class hq0_2
extends FunctionReferenceImpl
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (Fragment)object;
        object2 = (String)object2;
        Intrinsics.checkNotNullParameter(object, "p0");
        Intrinsics.checkNotNullParameter(object2, "p1");
        Object object3 = (fq0_2)this.receiver;
        object3.getClass();
        object3 = new zp0_0((Fragment)object, (String)object2);
        return object3;
    }
}

