/*
 * Decompiled with CFR 0.152.
 */
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import kotlin.jvm.internal.Intrinsics;

public final class x9
extends TapTargetView$Listener {
    public final /* synthetic */ q9_0 a;

    public x9(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void onOuterCircleClick(TapTargetView tapTargetView) {
        super.onOuterCircleClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }

    public final void onTargetCancel(TapTargetView object) {
        super.onTargetCancel((TapTargetView)((Object)object));
        object = this.a;
        int n3 = ((q9_0)object).Y0;
        if (n3 != 0) {
            n3 = 0;
            ((q9_0)object).Y0 = false;
            object = ((q9_0)object).X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                object = null;
            }
            object = ((x9_0)object).b;
            String string2 = "image_search_coachmark";
            n3 = ((sw_0)object).getPreference(string2, 0) + 1;
            ((sw_0)object).putPreference(string2, n3);
        }
    }

    public final void onTargetClick(TapTargetView object) {
        super.onTargetClick((TapTargetView)((Object)object));
        object = this.a;
        int n3 = ((q9_0)object).Y0;
        if (n3 != 0) {
            n3 = 0;
            ((q9_0)object).Y0 = false;
            object = ((q9_0)object).X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                object = null;
            }
            object = ((x9_0)object).b;
            String string2 = "image_search_coachmark";
            n3 = ((sw_0)object).getPreference(string2, 0) + 1;
            ((sw_0)object).putPreference(string2, n3);
        }
    }

    public final void onTargetDismissed(TapTargetView object, boolean bl2) {
        super.onTargetDismissed((TapTargetView)((Object)object), bl2);
        object = this.a;
        boolean bl3 = ((q9_0)object).Y0;
        if (bl3) {
            boolean bl4 = false;
            ((q9_0)object).Y0 = false;
            object = ((q9_0)object).X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                object = null;
            }
            object = ((x9_0)object).b;
            String string2 = "image_search_coachmark";
            int n3 = ((sw_0)object).getPreference(string2, 0) + 1;
            ((sw_0)object).putPreference(string2, n3);
        }
    }

    public final void onTargetLongClick(TapTargetView tapTargetView) {
        super.onTargetLongClick(tapTargetView);
        this.onTargetClick(tapTargetView);
    }
}

