/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ve2
 */
public final class ve2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Throwable)object;
                pa3_1 pa3_12 = (pa3_1)this.b;
                Intrinsics.checkNotNullParameter(pa3_12, "this$0");
                zr1_1 zr1_12 = pa3_12.k;
                Intrinsics.checkNotNull(object);
                object = pa3_12.d.handleApiException((Throwable)object, "BackGround_StoreMetaData");
                zr1_12.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        String string2 = (String)this.b;
        Intrinsics.checkNotNullParameter(string2, "$payment");
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        CharSequence charSequence = new StringBuilder("Total amount is ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        RY2.e((UY2)object, (String)charSequence);
        return Unit.a;
    }
}

