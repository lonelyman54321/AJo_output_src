/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Fv2
 */
public final class fv2_2
implements Function0 {
    public final /* synthetic */ hv2_2 a;

    public /* synthetic */ fv2_2(hv2_2 hv2_22) {
        this.a = hv2_22;
    }

    public final Object invoke() {
        KSerializer[] kSerializerArray = this.a.b;
        if (kSerializerArray == null || (kSerializerArray = kSerializerArray.childSerializers()) == null) {
            kSerializerArray = o72_0.b;
        }
        return kSerializerArray;
    }
}

