/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ExpandableListView$OnGroupExpandListener
 */
import android.widget.ExpandableListView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kf3
 */
public final class kf3_1
implements ExpandableListView.OnGroupExpandListener {
    public final /* synthetic */ nf3_2 a;

    public /* synthetic */ kf3_1(nf3_2 nf3_22) {
        this.a = nf3_22;
    }

    public final void onGroupExpand(int n3) {
        String string2 = "this$0";
        nf3_2 nf3_22 = this.a;
        Intrinsics.checkNotNullParameter(nf3_22, string2);
        int n4 = nf3_22.i;
        if (n4 >= 0 && n4 != n3) {
            string2 = nf3_22.b;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expandableListView");
                n4 = 0;
                string2 = null;
            }
            int n7 = nf3_22.i;
            string2.collapseGroup(n7);
        }
        nf3_22.i = n3;
    }
}

