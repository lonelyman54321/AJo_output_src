/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c7
 */
public final class c7_0
implements Function0 {
    public final /* synthetic */ j7_0 a;

    public /* synthetic */ c7_0(j7_0 j7_02) {
        this.a = j7_02;
    }

    public final Object invoke() {
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "this$0");
        j7_02 = j7_02.getApplication();
        jo_2 jo_22 = new jo_2((Context)j7_02);
        return jo_22;
    }
}

