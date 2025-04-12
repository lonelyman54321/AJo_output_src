/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kN2
 */
public final class kn2_0
implements View.OnClickListener {
    public final /* synthetic */ jn2_1 a;

    public /* synthetic */ kn2_0(jn2_1 jn2_12) {
        this.a = jn2_12;
    }

    public final void onClick(View view) {
        jn2_1 jn2_12 = this.a;
        Intrinsics.checkNotNullParameter(jn2_12, "$listener");
        jn2_12.w4();
    }
}

