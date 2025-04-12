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
 * Renamed from Tz1
 */
public final class tz1_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                tr1_0 tr1_02 = (tr1_0)this.b;
                Intrinsics.checkNotNullParameter(tr1_02, "$isExpanded$delegate");
                Boolean bl2 = (Boolean)tr1_02.getValue() ^ true;
                tr1_02.setValue(bl2);
                return Unit.a;
            }
            case 0: 
        }
        da1_1 da1_12 = (da1_1)this.b;
        Intrinsics.checkNotNullParameter(da1_12, "this$0");
        da1_12 = da1_12.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(da1_12, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)da1_12);
        return jo_22;
    }
}

