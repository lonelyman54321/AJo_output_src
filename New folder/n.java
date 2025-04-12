/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class n
implements View.OnClickListener {
    public final /* synthetic */ p a;
    public final /* synthetic */ Float b;

    public /* synthetic */ n(p p2, Float f5) {
        this.a = p2;
        this.b = f5;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((p)object2).a;
        if (object != null) {
            object2 = this.b;
            float f5 = ((Float)object2).floatValue();
            object.r2(f5);
        }
    }
}

