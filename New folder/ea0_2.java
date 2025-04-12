/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from EA0
 */
public final class ea0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fa0_2 c;

    public /* synthetic */ ea0_2(int n3, String string2, fa0_2 fa0_22) {
        this.a = n3;
        this.b = string2;
        this.c = fa0_22;
    }

    public final Object invoke() {
        int n3 = this.a;
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = new StringBuilder();
            Object object2 = this.b;
            ((StringBuilder)object).append((String)object2);
            char c2 = '.';
            ((StringBuilder)object).append(c2);
            object2 = this.c.e[i3];
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            object2 = Ye3$d.a;
            SerialDescriptor[] serialDescriptorArray2 = new SerialDescriptor[]{};
            serialDescriptorArray[i3] = object = uz2_1.d((String)object, (xz2_1)object2, serialDescriptorArray2);
        }
        return serialDescriptorArray;
    }
}

