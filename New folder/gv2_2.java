/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Gv2
 */
public final class gv2_2
implements Function0 {
    public final /* synthetic */ hv2_2 a;

    public /* synthetic */ gv2_2(hv2_2 hv2_22) {
        this.a = hv2_22;
    }

    public final Object invoke() {
        hv2_2 hv2_22 = this.a;
        SerialDescriptor[] serialDescriptorArray = (SerialDescriptor[])hv2_22.j.getValue();
        return iv2_2.b(hv2_22, serialDescriptorArray);
    }
}

