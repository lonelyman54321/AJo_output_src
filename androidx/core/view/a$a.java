/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
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

import android.os.Build;
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
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$g;
import androidx.core.view.ViewCompat$i;
import androidx.core.view.a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class a$a
extends View.AccessibilityDelegate {
    public final a a;

    public a$a(a a2) {
        this.a = a2;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View object) {
        a a2 = this.a;
        object = (object = a2.getAccessibilityNodeProvider((View)object)) != null ? (AccessibilityNodeProvider)object.a : null;
        return object;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int n3;
        void var7_33;
        String string2;
        void var7_25;
        int n4;
        void var7_18;
        Object object = view;
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        int n7 = 1;
        C2 c2 = new C2(accessibilityNodeInfo);
        WeakHashMap weakHashMap = ViewCompat.a;
        int n8 = R$id.tag_screen_reader_focusable;
        int n10 = Build.VERSION.SDK_INT;
        Object object2 = Boolean.class;
        ClickableSpan[] clickableSpanArray = null;
        int n14 = 28;
        if (n10 >= n14) {
            n8 = (int)(ViewCompat$g.c(view) ? 1 : 0);
            Boolean bl2 = n8 != 0;
        } else {
            Object object3 = view.getTag(n8);
            n10 = (int)(((Class)object2).isInstance(object3) ? 1 : 0);
            if (n10 == 0) {
                n8 = 0;
                Object var7_17 = null;
            }
        }
        Boolean bl3 = (Boolean)var7_18;
        n10 = 0;
        Object var13_41 = null;
        if (bl3 != null && (n8 = bl3.booleanValue()) != 0) {
            n8 = 1;
        } else {
            n8 = 0;
            Object var7_20 = null;
        }
        int n15 = Build.VERSION.SDK_INT;
        if (n15 >= n14) {
            Z1.a(accessibilityNodeInfo2, n8 != 0);
        } else {
            c2.j(n7, n8 != 0);
        }
        n8 = R$id.tag_accessibility_heading;
        int n16 = Build.VERSION.SDK_INT;
        if (n16 >= n14) {
            n8 = (int)(ViewCompat$g.b(view) ? 1 : 0);
            Boolean bl4 = n8 != 0;
        } else {
            Object object4 = object.getTag(n8);
            n4 = ((Class)object2).isInstance(object4);
            if (n4 == 0) {
                n8 = 0;
                Object var7_24 = null;
            }
        }
        Boolean bl5 = (Boolean)var7_25;
        if (bl5 != null && (n8 = bl5.booleanValue()) != 0) {
            n8 = 1;
        } else {
            n8 = 0;
            Object var7_27 = null;
        }
        c2.p(n8 != 0);
        CharSequence charSequence = ViewCompat.e(view);
        if (n15 >= n14) {
            a2_0.a(accessibilityNodeInfo2, charSequence);
        } else {
            object2 = accessibilityNodeInfo.getExtras();
            string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
            object2.putCharSequence(string2, charSequence);
        }
        n8 = R$id.tag_state_description;
        n4 = Build.VERSION.SDK_INT;
        n14 = 30;
        if (n4 >= n14) {
            CharSequence charSequence2 = ViewCompat$i.a(view);
        } else {
            object2 = CharSequence.class;
            Object object5 = object.getTag(n8);
            n4 = (int)(((Class)object2).isInstance(object5) ? 1 : 0);
            if (n4 == 0) {
                n8 = 0;
                Object var7_32 = null;
            }
        }
        CharSequence charSequence3 = (CharSequence)var7_33;
        if (n15 >= n14) {
            C2$b.b(accessibilityNodeInfo2, charSequence3);
        } else {
            object2 = accessibilityNodeInfo.getExtras();
            string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
            object2.putCharSequence(string2, charSequence3);
        }
        a$a a$a = this;
        this.a.onInitializeAccessibilityNodeInfo((View)object, c2);
        object2 = accessibilityNodeInfo.getText();
        n14 = 26;
        if (n15 < n14) {
            int n17;
            int n18;
            ClickableSpan clickableSpan;
            Object object6;
            string2 = accessibilityNodeInfo.getExtras();
            String string3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
            string2.remove(string3);
            string2 = accessibilityNodeInfo.getExtras();
            String string4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
            string2.remove(string4);
            string2 = accessibilityNodeInfo.getExtras();
            String string5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
            string2.remove(string5);
            string2 = accessibilityNodeInfo.getExtras();
            String string6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
            string2.remove(string6);
            n14 = R$id.tag_accessibility_clickable_spans;
            string2 = (SparseArray)object.getTag(n14);
            if (string2 != null) {
                object6 = new ArrayList();
                clickableSpan = null;
                for (n18 = 0; n18 < (n17 = string2.size()); n18 += n7) {
                    Object t3 = ((WeakReference)string2.valueAt(n18)).get();
                    if (t3 != null) continue;
                    Integer n19 = n18;
                    ((ArrayList)object6).add(n19);
                }
                clickableSpan = null;
                for (n18 = 0; n18 < (n17 = ((ArrayList)object6).size()); n18 += n7) {
                    Integer n20 = (Integer)((ArrayList)object6).get(n18);
                    n17 = n20;
                    string2.remove(n17);
                }
            }
            if ((n14 = object2 instanceof Spanned) != 0) {
                clickableSpanArray = object2;
                clickableSpanArray = (Spanned)object2;
                n14 = ((CharSequence)object2).length();
                object6 = ClickableSpan.class;
                clickableSpanArray = (ClickableSpan[])clickableSpanArray.getSpans(0, n14, (Class)object6);
            }
            if (clickableSpanArray != null && (n14 = clickableSpanArray.length) > 0) {
                Bundle bundle = accessibilityNodeInfo.getExtras();
                string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
                int n21 = R$id.accessibility_action_clickable_span;
                bundle.putInt(string2, n21);
                n3 = R$id.tag_accessibility_clickable_spans;
                SparseArray sparseArray = (SparseArray)object.getTag(n3);
                if (sparseArray == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    n14 = R$id.tag_accessibility_clickable_spans;
                    object.setTag(n14, (Object)sparseArray2);
                }
                string2 = null;
                for (n14 = 0; n14 < (n21 = clickableSpanArray.length); n14 += n7) {
                    void var4_8;
                    block30: {
                        object6 = clickableSpanArray[n14];
                        clickableSpan = null;
                        for (n18 = 0; n18 < (n17 = var4_8.size()); n18 += n7) {
                            ClickableSpan clickableSpan2 = (ClickableSpan)((WeakReference)var4_8.valueAt(n18)).get();
                            n17 = (int)(object6.equals(clickableSpan2) ? 1 : 0);
                            if (n17 == 0) continue;
                            n21 = var4_8.keyAt(n18);
                            break block30;
                        }
                        n21 = C2.d;
                        C2.d = n18 = n21 + 1;
                    }
                    ClickableSpan clickableSpan3 = clickableSpanArray[n14];
                    clickableSpan = new WeakReference(clickableSpan3);
                    var4_8.put(n21, clickableSpan);
                    clickableSpan = clickableSpanArray[n14];
                    Object object7 = object2;
                    Spanned spanned = (Spanned)object2;
                    ArrayList arrayList = c2.c(string3);
                    int n22 = spanned.getSpanStart((Object)clickableSpan);
                    Serializable serializable = Integer.valueOf(n22);
                    arrayList.add(serializable);
                    serializable = c2.c(string4);
                    Integer n24 = spanned.getSpanEnd((Object)clickableSpan);
                    serializable.add(n24);
                    serializable = c2.c(string5);
                    Integer n25 = spanned.getSpanFlags((Object)clickableSpan);
                    serializable.add(n25);
                    serializable = c2.c(string6);
                    Integer n26 = n21;
                    serializable.add(n26);
                    n7 = 1;
                    n10 = 0;
                    Object var13_47 = null;
                }
            }
        }
        object = androidx.core.view.a.getActionList(view);
        n10 = 0;
        Object var13_48 = null;
        while (n10 < (n3 = object.size())) {
            C2$a c2$a = (C2$a)object.get(n10);
            c2.b(c2$a);
            n3 = 1;
            n10 += n3;
        }
        return;
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        return this.a.performAccessibilityAction(view, n3, bundle);
    }

    public final void sendAccessibilityEvent(View view, int n3) {
        this.a.sendAccessibilityEvent(view, n3);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

