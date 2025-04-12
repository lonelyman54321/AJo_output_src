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
 * Renamed from Ud
 */
public final class ud_0
implements View.OnClickListener {
    public final /* synthetic */ Kd$d a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ud_0(Kd$d d2, ArrayList arrayList) {
        this.a = d2;
        this.b = arrayList;
    }

    public final void onClick(View view) {
        Kd$d kd$d = this.a;
        Intrinsics.checkNotNullParameter(kd$d, "this$0");
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNullParameter(arrayList, "$list");
        kd$d.a.a2(arrayList);
    }
}

