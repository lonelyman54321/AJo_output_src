/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 */
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

public final class C2 {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;

    public C2(AccessibilityNodeInfo accessibilityNodeInfo) {
        int n3;
        this.b = n3 = -1;
        this.c = n3;
        this.a = accessibilityNodeInfo;
    }

    public static String d(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                switch (n3) {
                    default: {
                        switch (n3) {
                            default: {
                                switch (n3) {
                                    default: {
                                        switch (n3) {
                                            default: {
                                                return "ACTION_UNKNOWN";
                                            }
                                            case 16908375: {
                                                return "ACTION_DRAG_CANCEL";
                                            }
                                            case 16908374: {
                                                return "ACTION_DRAG_DROP";
                                            }
                                            case 16908373: {
                                                return "ACTION_DRAG_START";
                                            }
                                            case 16908372: 
                                        }
                                        return "ACTION_IME_ENTER";
                                    }
                                    case 16908362: {
                                        return "ACTION_PRESS_AND_HOLD";
                                    }
                                    case 16908361: {
                                        return "ACTION_PAGE_RIGHT";
                                    }
                                    case 16908360: {
                                        return "ACTION_PAGE_LEFT";
                                    }
                                    case 16908359: {
                                        return "ACTION_PAGE_DOWN";
                                    }
                                    case 16908358: {
                                        return "ACTION_PAGE_UP";
                                    }
                                    case 16908357: {
                                        return "ACTION_HIDE_TOOLTIP";
                                    }
                                    case 16908356: 
                                }
                                return "ACTION_SHOW_TOOLTIP";
                            }
                            case 16908349: {
                                return "ACTION_SET_PROGRESS";
                            }
                            case 16908348: {
                                return "ACTION_CONTEXT_CLICK";
                            }
                            case 16908347: {
                                return "ACTION_SCROLL_RIGHT";
                            }
                            case 16908346: {
                                return "ACTION_SCROLL_DOWN";
                            }
                            case 16908345: {
                                return "ACTION_SCROLL_LEFT";
                            }
                            case 16908344: {
                                return "ACTION_SCROLL_UP";
                            }
                            case 16908343: {
                                return "ACTION_SCROLL_TO_POSITION";
                            }
                            case 16908342: 
                        }
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                    case 16908382: {
                        return "ACTION_SCROLL_IN_DIRECTION";
                    }
                    case 16908354: {
                        return "ACTION_MOVE_WINDOW";
                    }
                    case 0x200000: {
                        return "ACTION_SET_TEXT";
                    }
                    case 524288: {
                        return "ACTION_COLLAPSE";
                    }
                    case 262144: {
                        return "ACTION_EXPAND";
                    }
                    case 131072: {
                        return "ACTION_SET_SELECTION";
                    }
                    case 65536: {
                        return "ACTION_CUT";
                    }
                    case 32768: {
                        return "ACTION_PASTE";
                    }
                    case 16384: {
                        return "ACTION_COPY";
                    }
                    case 8192: {
                        return "ACTION_SCROLL_BACKWARD";
                    }
                    case 4096: {
                        return "ACTION_SCROLL_FORWARD";
                    }
                    case 2048: {
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    }
                    case 1024: {
                        return "ACTION_NEXT_HTML_ELEMENT";
                    }
                    case 512: {
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    }
                    case 256: {
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    }
                    case 128: {
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    }
                    case 64: {
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    }
                    case 32: {
                        return "ACTION_LONG_CLICK";
                    }
                    case 16: {
                        return "ACTION_CLICK";
                    }
                    case 8: {
                        return "ACTION_CLEAR_SELECTION";
                    }
                    case 4: 
                }
                return "ACTION_SELECT";
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void a(int n3) {
        this.a.addAction(n3);
    }

    public final void b(C2$a c2$a) {
        c2$a = (AccessibilityNodeInfo.AccessibilityAction)c2$a.a;
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction)c2$a);
    }

    public final ArrayList c(String string2) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        ArrayList arrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(string2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            accessibilityNodeInfo = accessibilityNodeInfo.getExtras();
            accessibilityNodeInfo.putIntegerArrayList(string2, arrayList);
        }
        return arrayList;
    }

    public final boolean e(int n3) {
        Bundle bundle = this.a.getExtras();
        boolean bl2 = false;
        if (bundle == null) {
            return false;
        }
        String string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
        int n4 = bundle.getInt(string2, 0) & n3;
        if (n4 == n3) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        int n3 = object instanceof C2;
        if (n3 == 0) {
            return false;
        }
        object = (C2)object;
        AccessibilityNodeInfo accessibilityNodeInfo = ((C2)object).a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.a;
        if (accessibilityNodeInfo2 == null ? accessibilityNodeInfo != null : (n3 = accessibilityNodeInfo2.equals((Object)accessibilityNodeInfo)) == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((C2)object).c;
        if (n3 != n4) {
            return false;
        }
        n3 = this.b;
        int n7 = ((C2)object).b;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final void f(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        Object object = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
        ArrayList arrayList = this.c((String)object);
        boolean bl2 = arrayList.isEmpty() ^ true;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (bl2) {
            int n3;
            object = this.c((String)object);
            arrayList = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList arrayList2 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList arrayList3 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            Object object2 = accessibilityNodeInfo.getText();
            Object object3 = accessibilityNodeInfo.getText();
            int n4 = object3.length();
            object2 = TextUtils.substring((CharSequence)object2, (int)0, (int)n4);
            SpannableString spannableString = new SpannableString(object2);
            for (int i3 = 0; i3 < (n3 = object.size()); ++i3) {
                n4 = (Integer)arrayList3.get(i3);
                int n7 = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY");
                object2 = new I1(n4, this, n7);
                object3 = (Integer)object.get(i3);
                n4 = (Integer)object3;
                Integer n8 = (Integer)arrayList.get(i3);
                n7 = n8;
                Integer n10 = (Integer)arrayList2.get(i3);
                int n14 = n10;
                spannableString.setSpan(object2, n4, n7, n14);
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void h(boolean bl2) {
        this.a.setAccessibilityFocused(bl2);
    }

    public final int hashCode() {
        int n3;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            n3 = 0;
            accessibilityNodeInfo = null;
        } else {
            n3 = accessibilityNodeInfo.hashCode();
        }
        return n3;
    }

    public final void i(ArrayList arrayList) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            V1.b(accessibilityNodeInfo, arrayList);
        }
    }

    public final void j(int n3, boolean bl2) {
        Bundle bundle = this.a.getExtras();
        if (bundle != null) {
            String string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int n4 = bundle.getInt(string2, 0);
            int n7 = ~n3;
            n4 &= n7;
            if (!bl2) {
                n3 = 0;
            }
            bundle.putInt(string2, n3 |= n4);
        }
    }

    public final void k(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void l(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void m(C2$e c2$e) {
        c2$e = c2$e == null ? null : (AccessibilityNodeInfo.CollectionInfo)c2$e.a;
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)c2$e);
    }

    public final void n(C2$f c2$f) {
        c2$f = (AccessibilityNodeInfo.CollectionItemInfo)c2$f.a;
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)c2$f);
    }

    public final void o(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void p(boolean bl2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            b2_0.a(accessibilityNodeInfo, bl2);
        } else {
            n3 = 2;
            this.j(n3, bl2);
        }
    }

    public final void q(CharSequence charSequence) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (n3 >= n4) {
            d2_0.b(accessibilityNodeInfo, charSequence);
        } else {
            Bundle bundle = accessibilityNodeInfo.getExtras();
            String string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
            bundle.putCharSequence(string2, charSequence);
        }
    }

    public final void r(boolean bl2) {
        this.a.setScrollable(bl2);
    }

    public final void s(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void t(int n3, int n4) {
        this.a.setTextSelection(n3, n4);
    }

    public final String toString() {
        int n3;
        int n4;
        int n7;
        String string2;
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = super.toString();
        stringBuilder.append((String)object2);
        object2 = new Rect();
        this.f((Rect)object2);
        ArrayList<Object> arrayList = new ArrayList<Object>("; boundsInParent: ");
        ((StringBuilder)((Object)arrayList)).append(object2);
        arrayList = ((StringBuilder)((Object)arrayList)).toString();
        stringBuilder.append((String)((Object)arrayList));
        arrayList = this.a;
        arrayList.getBoundsInScreen((Rect)object2);
        Object object3 = "; boundsInScreen: ";
        CharSequence charSequence = new StringBuilder((String)object3);
        ((StringBuilder)charSequence).append(object2);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 34;
        if (n8 >= n10) {
            C2$d.b((AccessibilityNodeInfo)arrayList, (Rect)object2);
        } else {
            object = arrayList.getExtras();
            string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";
            if ((object = (Rect)object.getParcelable(string2)) != null) {
                n7 = ((Rect)object).left;
                n4 = ((Rect)object).top;
                int n14 = ((Rect)object).right;
                n3 = ((Rect)object).bottom;
                object2.set(n7, n4, n14, n3);
            }
        }
        string2 = "; boundsInWindow: ";
        object = new StringBuilder(string2);
        ((StringBuilder)object).append(object2);
        object2 = ((StringBuilder)object).toString();
        stringBuilder.append((String)object2);
        stringBuilder.append("; packageName: ");
        object2 = arrayList.getPackageName();
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; className: ");
        object2 = arrayList.getClassName();
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; text: ");
        object2 = this.g();
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; error: ");
        object2 = arrayList.getError();
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; maxTextLength: ");
        int n15 = arrayList.getMaxTextLength();
        stringBuilder.append(n15);
        object2 = "; stateDescription: ";
        stringBuilder.append((String)object2);
        n15 = 30;
        if (n8 >= n15) {
            object2 = C2$b.a((AccessibilityNodeInfo)arrayList);
        } else {
            object2 = arrayList.getExtras();
            object = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
            object2 = object2.getCharSequence((String)object);
        }
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; contentDescription: ");
        object2 = arrayList.getContentDescription();
        stringBuilder.append((CharSequence)object2);
        object2 = "; tooltipText: ";
        stringBuilder.append((String)object2);
        n15 = 28;
        if (n8 >= n15) {
            object2 = c2_0.a((AccessibilityNodeInfo)arrayList);
        } else {
            object2 = arrayList.getExtras();
            object = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
            object2 = object2.getCharSequence((String)object);
        }
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; viewIdResName: ");
        object2 = arrayList.getViewIdResourceName();
        stringBuilder.append((String)object2);
        object2 = "; uniqueId: ";
        stringBuilder.append((String)object2);
        n15 = 33;
        if (n8 >= n15) {
            object = C2$c.a((AccessibilityNodeInfo)arrayList);
        } else {
            object = arrayList.getExtras();
            string2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
            object = object.getString(string2);
        }
        stringBuilder.append((String)object);
        stringBuilder.append("; checkable: ");
        n3 = arrayList.isCheckable() ? 1 : 0;
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; checked: ");
        n3 = arrayList.isChecked();
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; focusable: ");
        n3 = arrayList.isFocusable();
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; focused: ");
        n3 = arrayList.isFocused();
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; selected: ");
        n3 = arrayList.isSelected();
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; clickable: ");
        n3 = arrayList.isClickable();
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; longClickable: ");
        n3 = arrayList.isLongClickable();
        stringBuilder.append(n3 != 0);
        object = "; contextClickable: ";
        stringBuilder.append((String)object);
        n3 = 23;
        n7 = 0;
        string2 = null;
        if (n8 >= n3) {
            n3 = f2.a((AccessibilityNodeInfo)arrayList) ? 1 : 0;
        } else {
            n3 = 0;
            object = null;
        }
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; enabled: ");
        n3 = arrayList.isEnabled();
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; password: ");
        n3 = arrayList.isPassword();
        stringBuilder.append(n3 != 0);
        String string3 = "; scrollable: ";
        object = new StringBuilder(string3);
        n4 = arrayList.isScrollable() ? 1 : 0;
        ((StringBuilder)object).append(n4 != 0);
        object = ((StringBuilder)object).toString();
        stringBuilder.append((String)object);
        object = "; containerTitle: ";
        stringBuilder.append((String)object);
        if (n8 >= n10) {
            object = C2$d.c((AccessibilityNodeInfo)arrayList);
        } else {
            object = arrayList.getExtras();
            string3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";
            object = object.getCharSequence(string3);
        }
        stringBuilder.append((CharSequence)object);
        stringBuilder.append("; granularScrollingSupported: ");
        n3 = this.e(0x4000000);
        stringBuilder.append(n3 != 0);
        object = "; importantForAccessibility: ";
        stringBuilder.append((String)object);
        n3 = 24;
        n4 = 1;
        n3 = n8 >= n3 ? (int)(Y1.a((AccessibilityNodeInfo)arrayList) ? 1 : 0) : 1;
        stringBuilder.append(n3 != 0);
        stringBuilder.append("; visible: ");
        n3 = arrayList.isVisibleToUser();
        stringBuilder.append(n3 != 0);
        object = "; isTextSelectable: ";
        stringBuilder.append((String)object);
        n15 = n8 >= n15 ? (int)(C2$c.b((AccessibilityNodeInfo)arrayList) ? 1 : 0) : (int)(this.e(0x800000) ? 1 : 0);
        stringBuilder.append(n15 != 0);
        object2 = "; accessibilityDataSensitive: ";
        stringBuilder.append((String)object2);
        n15 = n8 >= n10 ? C2$d.d((AccessibilityNodeInfo)arrayList) : this.e(64);
        stringBuilder.append(n15 != 0);
        stringBuilder.append("; [");
        object2 = arrayList.getActionList();
        arrayList = new ArrayList<Object>();
        n8 = object2.size();
        object3 = null;
        for (n10 = 0; n10 < n8; ++n10) {
            Object e2 = object2.get(n10);
            object = new C2$a(e2, 0, null, null, null);
            arrayList.add(object);
        }
        while (n7 < (n15 = arrayList.size())) {
            object2 = (C2$a)arrayList.get(n7);
            n8 = ((C2$a)object2).a();
            charSequence = C2.d(n8);
            n10 = ((String)charSequence).equals(object3 = "ACTION_UNKNOWN") ? 1 : 0;
            if (n10 != 0) {
                object3 = object2 = ((C2$a)object2).a;
                object3 = ((AccessibilityNodeInfo.AccessibilityAction)object2).getLabel();
                if (object3 != null) {
                    object2 = ((AccessibilityNodeInfo.AccessibilityAction)object2).getLabel();
                    charSequence = object2.toString();
                }
            }
            stringBuilder.append((String)charSequence);
            n15 = arrayList.size() - n4;
            if (n7 != n15) {
                object2 = ", ";
                stringBuilder.append((String)object2);
            }
            ++n7;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void u(View view) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 22;
        if (n3 >= n4) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            S1.a(view, accessibilityNodeInfo);
        }
    }
}

