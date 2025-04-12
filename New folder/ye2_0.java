/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 */
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from YE2
 */
public final class ye2_0
implements id3_1 {
    public final View b;
    public final boolean c;

    public ye2_0(View view, boolean bl2) {
        this.b = view;
        this.c = bl2;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl4 = object instanceof ye2_0;
                if (!bl4) break block4;
                object = (ye2_0)object;
                View view = this.b;
                View view2 = ((ye2_0)object).b;
                bl4 = Intrinsics.areEqual(view, view2);
                if (bl4 && (bl4 = this.c) == (bl3 = ((ye2_0)object).c)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        View view = this.b;
        int n3 = view.hashCode() * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final Object j(pe2_0 pe2_02) {
        Object object = fd0_0.b(this);
        if (object == null) {
            Object object2 = zj1_2.b(pe2_02);
            int n3 = 1;
            object = new CancellableContinuationImpl(n3, (f80_0)object2);
            ((CancellableContinuationImpl)object).r();
            object2 = this.b.getViewTreeObserver();
            HD3 hD3 = new HD3(this, (ViewTreeObserver)object2, (CancellableContinuationImpl)object);
            object2.addOnPreDrawListener(hD3);
            gd3_0 gd3_02 = new gd3_0(this, (ViewTreeObserver)object2, hD3);
            ((CancellableContinuationImpl)object).x(gd3_02);
            object = ((CancellableContinuationImpl)object).q();
            object2 = j90_0.COROUTINE_SUSPENDED;
            if (object == object2) {
                object2 = "frame";
                Intrinsics.checkNotNullParameter(pe2_02, (String)object2);
            }
        }
        return object;
    }
}

