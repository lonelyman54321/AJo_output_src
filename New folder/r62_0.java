/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from r62
 */
public final class r62_0
implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ s62_0 b;

    public /* synthetic */ r62_0(s62_0 s62_02) {
        this.a = "kotlin.Unit";
        this.b = s62_02;
    }

    public final Object invoke() {
        Ye3$d ye3$d = Ye3$d.a;
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[]{};
        s62_0 s62_02 = this.b;
        cy0_2 cy0_22 = new cy0_2(s62_02, 2);
        return uz2_1.c(this.a, ye3$d, serialDescriptorArray, cy0_22);
    }
}

