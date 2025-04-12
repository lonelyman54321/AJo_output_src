/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from cm1
 */
public final class cm1_2 {
    public final py0_2 a;
    public boolean b;

    public cm1_2(SerialDescriptor serialDescriptor) {
        py0_2 py0_22;
        a_0 a_02;
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        super(2, this, cm1_2.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        this.a = py0_22 = new py0_2(serialDescriptor, a_02);
    }
}

