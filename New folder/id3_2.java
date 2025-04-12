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
 * Renamed from Id3
 */
public final class id3_2
implements View.OnClickListener {
    public final /* synthetic */ ld3_1 a;

    public /* synthetic */ id3_2(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final void onClick(View object) {
        object = ld3_1.Companion;
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ld3_1)object).n;
        if (object != null) {
            object.z1();
        }
    }
}

