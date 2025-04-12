/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from NZ2
 */
public final class nz2_2
implements Function0 {
    public final /* synthetic */ pz2_1 a;

    public /* synthetic */ nz2_2(pz2_1 pz2_12) {
        this.a = pz2_12;
    }

    public final Object invoke() {
        pz2_1 pz2_12 = this.a;
        SerialDescriptor[] serialDescriptorArray = pz2_12.k;
        return iv2_2.b(pz2_12, serialDescriptorArray);
    }
}

