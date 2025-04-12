/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.Spanned
 *  android.text.style.ClickableSpan
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 */
package androidx.core.view;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;

public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE;
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    static {
        View.AccessibilityDelegate accessibilityDelegate;
        DEFAULT_DELEGATE = accessibilityDelegate = new View.AccessibilityDelegate();
    }

    public a() {
        View.AccessibilityDelegate accessibilityDelegate = DEFAULT_DELEGATE;
        this(accessibilityDelegate);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        super(this);
        this.mBridge = accessibilityDelegate;
    }

    public static List getActionList(View object) {
        int n3 = R$id.tag_accessibility_actions;
        if ((object = (List)object.getTag(n3)) == null) {
            object = Collections.emptyList();
        }
        return object;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View clickableSpanArray) {
        if (clickableSpan != null) {
            int n3;
            View view;
            int n4;
            Object object;
            int n7 = (clickableSpanArray = clickableSpanArray.createAccessibilityNodeInfo().getText()) instanceof Spanned;
            if (n7 != 0) {
                object = clickableSpanArray;
                object = (Spanned)clickableSpanArray;
                n4 = ((CharSequence)clickableSpanArray).length();
                view = ClickableSpan.class;
                clickableSpanArray = (ClickableSpan[])object.getSpans(0, n4, view);
            } else {
                n4 = 0;
                clickableSpanArray = null;
            }
            object = null;
            for (n7 = 0; clickableSpanArray != null && n7 < (n3 = clickableSpanArray.length); ++n7) {
                view = clickableSpanArray[n7];
                n3 = (int)(clickableSpan.equals(view) ? 1 : 0);
                if (n3 == 0) continue;
                return true;
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int n3, View view) {
        WeakReference weakReference;
        int n4 = R$id.tag_accessibility_clickable_spans;
        SparseArray sparseArray = (SparseArray)view.getTag(n4);
        if (sparseArray != null && (weakReference = (WeakReference)sparseArray.get(n3)) != null && (n4 = (int)(this.isSpanStillValid((ClickableSpan)(weakReference = (ClickableSpan)weakReference.get()), view) ? 1 : 0)) != 0) {
            weakReference.onClick(view);
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public D2 getAccessibilityNodeProvider(View view) {
        Object object = this.mOriginalDelegate;
        if ((view = object.getAccessibilityNodeProvider(view)) != null) {
            object = new D2((AccessibilityNodeProvider)view);
            return object;
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        View.AccessibilityDelegate accessibilityDelegate = this.mOriginalDelegate;
        c2 = c2.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)c2);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        int n4;
        Object object = a.getActionList(view);
        boolean bl2 = false;
        Object object2 = null;
        Object object3 = null;
        for (int i3 = 0; i3 < (n4 = object.size()); ++i3) {
            C2$a c2$a = (C2$a)object.get(i3);
            int n7 = c2$a.a();
            if (n7 != n3) continue;
            object = c2$a.d;
            if (object == null) break;
            object2 = c2$a.c;
            i3 = 0;
            object3 = null;
            if (object2 != null) {
                try {
                    object2 = ((Class)object2).getDeclaredConstructor(null);
                    object2 = ((Constructor)object2).newInstance(null);
                    object2 = (E2$a)object2;
                }
                catch (Exception exception) {}
                try {
                    object2.getClass();
                }
                catch (Exception exception) {}
                object3 = object2;
            }
            bl2 = object.perform(view, (E2$a)object3);
            break;
        }
        if (!bl2) {
            object = this.mOriginalDelegate;
            bl2 = object.performAccessibilityAction(view, n3, bundle);
        }
        if (bl2) return bl2;
        int n8 = R$id.accessibility_action_clickable_span;
        if (n3 != n8) return bl2;
        if (bundle == null) return bl2;
        String string2 = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
        n8 = -1;
        n3 = bundle.getInt(string2, n8);
        return this.performClickableSpanAction(n3, view);
    }

    public void sendAccessibilityEvent(View view, int n3) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, n3);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

