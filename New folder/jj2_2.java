/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.Notes;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Jj2
 */
public final class jj2_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jj2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke() {
        void var1_4;
        int bl2 = this.a;
        switch (bl2) {
            default: {
                ArrayList<SerialDescriptor> arrayList;
                KSerializer[] kSerializerArray = ((hv2_2)this.b).b;
                if (kSerializerArray != null && (kSerializerArray = kSerializerArray.typeParametersSerializers()) != null) {
                    int n3 = kSerializerArray.length;
                    arrayList = new ArrayList<SerialDescriptor>(n3);
                    n3 = kSerializerArray.length;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        SerialDescriptor serialDescriptor = kSerializerArray[i3].getDescriptor();
                        arrayList.add(serialDescriptor);
                    }
                } else {
                    arrayList = null;
                }
                return kt2_2.b(arrayList);
            }
            case 0: 
        }
        kj2_1 kj2_12 = (kj2_1)this.b;
        Intrinsics.checkNotNullParameter(kj2_12, "this$0");
        Object object = kj2_12.s;
        if (object != null && (object = ((PaymentInstruments)object).getNotes()) != null && (object = ((Notes)object).getSTORED_CARD_NOTE_ENABLED()) != null) {
            boolean bl3 = (Boolean)object;
        } else {
            boolean bl4 = false;
            object = null;
        }
        return (boolean)var1_4;
    }
}

