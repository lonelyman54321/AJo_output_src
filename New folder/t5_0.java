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
 * Renamed from T5
 */
public final class t5_0
implements View.OnClickListener {
    public final /* synthetic */ U5 a;

    public /* synthetic */ t5_0(U5 u5) {
        this.a = u5;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((U5)object).b;
        int n3 = 8;
        if (object2 != null) {
            object2.setVisibility(n3);
        }
        if ((object2 = ((U5)object).f) != null) {
            object2.setVisibility(n3);
        }
        if ((object2 = ((U5)object).c) != null) {
            ih2_0 ih2_02 = new Object();
            object2.setOnClickListener(ih2_02);
        }
        hv3_0.p0(((U5)object).d);
        object2 = ((U5)object).e;
        ((U5)object).Oa((String)object2);
    }
}

