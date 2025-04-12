/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from OR2
 */
public final class or2_2
implements AppBarLayout$OnOffsetChangedListener {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ pr2_2 b;

    public /* synthetic */ or2_2(Ref$ObjectRef ref$ObjectRef, pr2_2 pr2_22) {
        this.a = ref$ObjectRef;
        this.b = pr2_22;
    }

    public final void onOffsetChanged(AppBarLayout object, int n3) {
        Ref$ObjectRef ref$ObjectRef = this.a;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$currentScrollState");
        pr2_2 pr2_22 = this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(pr2_22, string2);
        n3 = Math.abs(n3);
        int n4 = ((AppBarLayout)object).getTotalScrollRange();
        if ((n3 -= n4) == 0) {
            object = (Integer)ref$ObjectRef.element;
            pr2_22.getClass();
            n3 = 2;
            if ((object == null || (n4 = ((Integer)object).intValue()) != n3) && (n4 = (int)(pr2_22.d ? 1 : 0)) == 0 && (object = pr2_22.o) != null) {
                boolean bl2 = false;
                pr2_22 = null;
                object.setVisibility(0);
            }
            ref$ObjectRef.element = object = Integer.valueOf(n3);
        } else {
            object = (Integer)ref$ObjectRef.element;
            pr2_22.getClass();
            n3 = 1;
            if ((object == null || (n4 = ((Integer)object).intValue()) != n3) && (object = pr2_22.o) != null) {
                int n7 = 8;
                object.setVisibility(n7);
            }
            ref$ObjectRef.element = object = Integer.valueOf(n3);
        }
    }
}

