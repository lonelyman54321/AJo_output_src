/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class M22
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ M22(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$onQueryChanged");
                function1.invoke("");
                return Unit.a;
            }
            case 0: 
        }
        q22_0 q22_02 = (q22_0)this.b;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        q22_02 = q22_02.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(q22_02, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)q22_02);
        return jo_22;
    }
}

