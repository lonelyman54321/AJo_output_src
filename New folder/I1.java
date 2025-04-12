/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.style.ClickableSpan
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class I1
extends ClickableSpan {
    public final int a;
    public final C2 b;
    public final int c;

    public I1(int n3, C2 c2, int n4) {
        this.a = n3;
        this.b = c2;
        this.c = n4;
    }

    public final void onClick(View view) {
        view = new Bundle();
        int n3 = this.a;
        view.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", n3);
        AccessibilityNodeInfo accessibilityNodeInfo = this.b.a;
        n3 = this.c;
        accessibilityNodeInfo.performAction(n3, (Bundle)view);
    }
}

