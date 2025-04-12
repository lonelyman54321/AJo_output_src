/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class d82$d
implements al_0 {
    public final W72 a;
    public final /* synthetic */ d82_0 b;

    public d82$d(d82_0 d82_02, W72 w72) {
        Intrinsics.checkNotNullParameter(w72, "onBackPressedCallback");
        this.b = d82_02;
        this.a = w72;
    }

    public final void cancel() {
        Object object = this.b;
        Object object2 = ((d82_0)object).c;
        W72 w72 = this.a;
        ((fp_2)object2).remove(w72);
        object2 = ((d82_0)object).d;
        boolean bl2 = Intrinsics.areEqual(object2, w72);
        if (bl2) {
            w72.handleOnBackCancelled();
            ((d82_0)object).d = null;
        }
        w72.removeCancellable(this);
        object = w72.getEnabledChangedCallback$activity_release();
        if (object != null) {
            object.invoke();
        }
        w72.setEnabledChangedCallback$activity_release(null);
    }
}

