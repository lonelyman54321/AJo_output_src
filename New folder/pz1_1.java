/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pz1
 */
public final class pz1_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pz1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$closeButtonClick");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        sz1_2 sz1_22 = (sz1_2)this.b;
        Intrinsics.checkNotNullParameter(sz1_22, "this$0");
        sz1_22 = sz1_22.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(sz1_22, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)sz1_22);
        return jo_22;
    }
}

