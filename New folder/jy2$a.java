/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
import android.os.Bundle;
import android.view.View;
import androidx.core.view.a;
import androidx.preference.PreferenceGroupAdapter;

public final class jy2$a
extends a {
    public final /* synthetic */ jy2_0 a;

    public jy2$a(jy2_0 jy2_02) {
        this.a = jy2_02;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C2 object) {
        jy2_0 jy2_02 = this.a;
        a a2 = jy2_02.b;
        a2.onInitializeAccessibilityNodeInfo(view, (C2)object);
        int n3 = jy2_02.a.getChildAdapterPosition(view);
        object = jy2_02.a.getAdapter();
        boolean bl2 = object instanceof PreferenceGroupAdapter;
        if (!bl2) {
            return;
        }
        ((PreferenceGroupAdapter)object).h(n3);
    }

    public final boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        return this.a.b.performAccessibilityAction(view, n3, bundle);
    }
}

