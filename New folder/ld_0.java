/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ld
 */
public final class ld_0
implements View.OnClickListener {
    public final /* synthetic */ Kd$b a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ld_0(Kd$b b2, ArrayList arrayList) {
        this.a = b2;
        this.b = arrayList;
    }

    public final void onClick(View view) {
        Kd$b kd$b = this.a;
        Intrinsics.checkNotNullParameter(kd$b, "this$0");
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNullParameter(arrayList, "$list");
        kd$b.a.a2(arrayList);
    }
}

