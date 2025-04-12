/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Gt0
 */
public final class gt0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ gt0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (yn1_2)object;
                Intrinsics.checkNotNullParameter(object, "it");
                KSerializer kSerializer = m03_0.d((yn1_2)object);
                KSerializer kSerializer2 = null;
                if (kSerializer == null) {
                    n3 = (int)(gt2_2.d((yn1_2)object) ? 1 : 0);
                    if (n3 != 0) {
                        kSerializer = new qw2_2((yn1_2)object);
                    } else {
                        n3 = 0;
                        kSerializer = null;
                    }
                }
                if (kSerializer != null) {
                    kSerializer2 = xe_1.p(kSerializer);
                }
                return kSerializer2;
            }
            case 0: 
        }
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$clearAndSetSemantics");
        RY2.d((UY2)object);
        return Unit.a;
    }
}

