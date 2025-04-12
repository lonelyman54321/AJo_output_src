/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ExpandableListView$OnGroupExpandListener
 */
import android.widget.ExpandableListView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WV1
 */
public final class wv1_2
implements ExpandableListView.OnGroupExpandListener {
    public final /* synthetic */ yv1_1 a;

    public /* synthetic */ wv1_2(yv1_1 yv1_12) {
        this.a = yv1_12;
    }

    public final void onGroupExpand(int n3) {
        String string2 = "this$0";
        yv1_1 yv1_12 = this.a;
        Intrinsics.checkNotNullParameter(yv1_12, string2);
        int n4 = yv1_12.j;
        if (n4 >= 0 && n4 != n3) {
            string2 = yv1_12.c;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expandableListView");
                n4 = 0;
                string2 = null;
            }
            int n7 = yv1_12.j;
            string2.collapseGroup(n7);
        }
        yv1_12.j = n3;
    }
}

