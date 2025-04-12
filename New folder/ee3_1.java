/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from ee3
 */
public final class ee3_1 {
    public static final Set a;

    static {
        xe_1.s(ht3_0.b);
        xe_1.t(mt3_0.b);
        xe_1.r(ct3_0.b);
        xe_1.u(lu3_0.b);
        Object[] objectArray = new SerialDescriptor[4];
        yh1_2 yh1_22 = lt3_0.b;
        objectArray[0] = yh1_22;
        yh1_22 = qt3_0.b;
        objectArray[1] = yh1_22;
        yh1_22 = gt3_0.b;
        objectArray[2] = yh1_22;
        yh1_22 = pu3_0.b;
        objectArray[3] = yh1_22;
        a = p03_0.f(objectArray);
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        boolean bl2;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(serialDescriptor, (String)object);
        boolean bl3 = serialDescriptor.isInline();
        if (bl3 && (bl2 = (object = a).contains(serialDescriptor))) {
            bl2 = true;
        } else {
            bl2 = false;
            serialDescriptor = null;
        }
        return bl2;
    }
}

