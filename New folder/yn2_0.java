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
 * Renamed from YN2
 */
public final class yn2_0
implements View.OnClickListener {
    public final /* synthetic */ zn2_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ yn2_0(zn2_1 zn2_12, String string2, String string3) {
        this.a = zn2_12;
        this.b = string2;
        this.c = string3;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((zn2_1)object2).a;
        if (object != null) {
            object2 = this.b;
            String string2 = this.c;
            object.b9((String)object2, string2);
        }
    }
}

