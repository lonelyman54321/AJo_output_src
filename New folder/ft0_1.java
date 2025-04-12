/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Ft0
 */
public final class ft0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ft0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (yn1_2)object;
                Intrinsics.checkNotNullParameter(object, "it");
                KSerializer kSerializer = m03_0.d((yn1_2)object);
                if (kSerializer == null) {
                    n3 = (int)(gt2_2.d((yn1_2)object) ? 1 : 0);
                    if (n3 != 0) {
                        kSerializer = new qw2_2((yn1_2)object);
                    } else {
                        object = null;
                        n3 = 0;
                        kSerializer = null;
                    }
                }
                return kSerializer;
            }
            case 0: 
        }
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$clearAndSetSemantics");
        RY2.d((UY2)object);
        return Unit.a;
    }
}

