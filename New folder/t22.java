/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class t22
implements Function0 {
    public final /* synthetic */ q22_0 a;

    public /* synthetic */ t22(q22_0 q22_02) {
        this.a = q22_02;
    }

    public final Object invoke() {
        q22_0 q22_02 = this.a;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        z40$a z40$a = z40_0.Companion;
        q22_02 = q22_02.requireContext();
        Intrinsics.checkNotNullExpressionValue(q22_02, "requireContext(...)");
        z40$a.getClass();
        return z40$a.a((Context)q22_02).a.b("banner_ad_variant_type");
    }
}

