/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.accessibility.AccessibilityEvent
 */
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.Intrinsics;

public final class kg0
extends View.AccessibilityDelegate {
    public final /* synthetic */ String a;

    public kg0(String string2) {
        this.a = string2;
    }

    public final void onPopulateAccessibilityEvent(View object, AccessibilityEvent accessibilityEvent) {
        Intrinsics.checkNotNullParameter(object, "host");
        Intrinsics.checkNotNullParameter(accessibilityEvent, "event");
        super.onPopulateAccessibilityEvent(object, accessibilityEvent);
        object = this.a;
        accessibilityEvent.setContentDescription((CharSequence)object);
    }
}

