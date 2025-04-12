/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from cm1$a
 */
public final class cm1$a_0
extends FunctionReferenceImpl
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        object = (SerialDescriptor)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(object, "p0");
        cm1_2 cm1_22 = (cm1_2)this.receiver;
        cm1_22.getClass();
        boolean bl3 = object.i(n3);
        if (!bl3 && (bl2 = (object = object.g(n3)).b())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        cm1_22.b = bl2;
        return bl2;
    }
}

