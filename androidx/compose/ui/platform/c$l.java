/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 */
package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c$l
extends Lambda
implements Function1 {
    public final /* synthetic */ c c;

    public c$l(c c2) {
        this.c = c2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (AccessibilityEvent)object;
        Object object2 = this.c;
        ViewParent viewParent = ((c)object2).a.getParent();
        object2 = ((c)object2).a;
        return viewParent.requestSendAccessibilityEvent((View)object2, (AccessibilityEvent)object);
    }
}

