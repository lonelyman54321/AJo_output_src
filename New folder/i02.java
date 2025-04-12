/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class i02
implements View.OnClickListener {
    public final /* synthetic */ j02_0 a;

    public /* synthetic */ i02(j02_0 j02_02) {
        this.a = j02_02;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((j02_0)object2).f;
        if (object != null) {
            object2 = ((j02_0)object2).d;
            Intrinsics.checkNotNull(object2);
            int n3 = (Integer)object2;
            object.D9(n3);
        }
    }
}

