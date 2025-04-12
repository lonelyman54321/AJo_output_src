/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class HH0
extends a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = 255;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS;
    private static final vU0$a NODE_ADAPTER;
    private static final vU0$b SPARSE_VALUES_ADAPTER;
    int mAccessibilityFocusedVirtualViewId;
    private final View mHost;
    private int mHoveredVirtualViewId;
    int mKeyboardFocusedVirtualViewId;
    private final AccessibilityManager mManager;
    private HH0$c mNodeProvider;
    private final int[] mTempGlobalRect;
    private final Rect mTempParentRect;
    private final Rect mTempScreenRect;
    private final Rect mTempVisibleRect;

    static {
        Object object;
        int n3 = -1 >>> 1;
        int n4 = -1 << -1;
        INVALID_PARENT_BOUNDS = object = new Rect(n3, n3, n4, n4);
        object = new Object();
        NODE_ADAPTER = object;
        object = new Object();
        SPARSE_VALUES_ADAPTER = object;
    }

    public HH0(View object) {
        int n3;
        Object object2;
        this.mTempScreenRect = object2 = new Rect();
        this.mTempParentRect = object2 = new Rect();
        this.mTempVisibleRect = object2 = new Rect();
        object2 = new int[2];
        this.mTempGlobalRect = (int[])object2;
        this.mAccessibilityFocusedVirtualViewId = n3 = -1 << -1;
        this.mKeyboardFocusedVirtualViewId = n3;
        this.mHoveredVirtualViewId = n3;
        if (object != null) {
            this.mHost = object;
            object2 = (AccessibilityManager)object.getContext().getSystemService("accessibility");
            this.mManager = object2;
            n3 = 1;
            object.setFocusable(n3 != 0);
            int n4 = object.getImportantForAccessibility();
            if (n4 == 0) {
                object.setImportantForAccessibility(n3);
            }
            return;
        }
        super("View may not be null");
        throw object;
    }

    private boolean clearAccessibilityFocus(int n3) {
        int n4 = this.mAccessibilityFocusedVirtualViewId;
        if (n4 == n3) {
            this.mAccessibilityFocusedVirtualViewId = -1 << -1;
            this.mHost.invalidate();
            this.sendEventForVirtualView(n3, 65536);
            return true;
        }
        return false;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int n3 = this.mKeyboardFocusedVirtualViewId;
        int n4 = -1 << -1;
        n3 = n3 != n4 && (n3 = (int)(this.onPerformActionForVirtualView(n3, n4 = 16, null) ? 1 : 0)) != 0 ? 1 : 0;
        return n3 != 0;
    }

    private AccessibilityEvent createEvent(int n3, int n4) {
        int n7 = -1;
        if (n3 != n7) {
            return this.createEventForChild(n3, n4);
        }
        return this.createEventForHost(n4);
    }

    private AccessibilityEvent createEventForChild(int n3, int n4) {
        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain((int)n4);
        Object object = this.obtainAccessibilityNodeInfo(n3);
        Object object2 = accessibilityEvent.getText();
        CharSequence charSequence = ((C2)object).g();
        object2.add(charSequence);
        object = ((C2)object).a;
        object2 = object.getContentDescription();
        accessibilityEvent.setContentDescription((CharSequence)object2);
        boolean bl2 = object.isScrollable();
        accessibilityEvent.setScrollable(bl2);
        bl2 = object.isPassword();
        accessibilityEvent.setPassword(bl2);
        bl2 = object.isEnabled();
        accessibilityEvent.setEnabled(bl2);
        bl2 = object.isChecked();
        accessibilityEvent.setChecked(bl2);
        this.onPopulateEventForVirtualView(n3, accessibilityEvent);
        object2 = accessibilityEvent.getText();
        bl2 = object2.isEmpty();
        if (bl2 && (object2 = accessibilityEvent.getContentDescription()) == null) {
            RuntimeException runtimeException = new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            throw runtimeException;
        }
        object = object.getClassName();
        accessibilityEvent.setClassName((CharSequence)object);
        object = this.mHost;
        accessibilityEvent.setSource((View)object, n3);
        String string2 = this.mHost.getContext().getPackageName();
        accessibilityEvent.setPackageName((CharSequence)string2);
        return accessibilityEvent;
    }

    private AccessibilityEvent createEventForHost(int n3) {
        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain((int)n3);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEvent);
        return accessibilityEvent;
    }

    private C2 createNodeForChild(int n3) {
        int n4;
        Object object = AccessibilityNodeInfo.obtain();
        C2 c2 = new C2((AccessibilityNodeInfo)object);
        boolean bl2 = true;
        object.setEnabled(bl2);
        object.setFocusable(bl2);
        c2.l(DEFAULT_CLASS_NAME);
        Object object2 = INVALID_PARENT_BOUNDS;
        object.setBoundsInParent(object2);
        c2.k((Rect)object2);
        Object object3 = this.mHost;
        c2.b = n4 = -1;
        object.setParent(object3);
        this.onPopulateNodeForVirtualView(n3, c2);
        object3 = c2.g();
        if (object3 == null && (object3 = object.getContentDescription()) == null) {
            RuntimeException runtimeException = new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            throw runtimeException;
        }
        object3 = this.mTempParentRect;
        c2.f((Rect)object3);
        object3 = this.mTempParentRect;
        int n7 = object3.equals(object2);
        if (n7 == 0) {
            n7 = object.getActions();
            int n8 = n7 & 0x40;
            if (n8 == 0) {
                n8 = 128;
                if ((n7 &= n8) == 0) {
                    Object object4;
                    Object object5;
                    View view;
                    object3 = this.mHost.getContext().getPackageName();
                    object.setPackageName((CharSequence)object3);
                    object3 = this.mHost;
                    c2.c = n3;
                    object.setSource(object3, n3);
                    n7 = this.mAccessibilityFocusedVirtualViewId;
                    if (n7 == n3) {
                        c2.h(bl2);
                        c2.a(n8);
                    } else {
                        c2.h(false);
                        n7 = 64;
                        c2.a(n7);
                    }
                    n7 = this.mKeyboardFocusedVirtualViewId;
                    if (n7 == n3) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        view = null;
                    }
                    if (n3 != 0) {
                        n7 = 2;
                        c2.a(n7);
                    } else {
                        n7 = (int)(object.isFocusable() ? 1 : 0);
                        if (n7 != 0) {
                            c2.a((int)(bl2 ? 1 : 0));
                        }
                    }
                    object.setFocused(n3 != 0);
                    view = this.mHost;
                    object3 = this.mTempGlobalRect;
                    view.getLocationOnScreen((int[])object3);
                    view = this.mTempScreenRect;
                    object.getBoundsInScreen((Rect)view);
                    view = this.mTempScreenRect;
                    n3 = (int)(view.equals(object2) ? 1 : 0);
                    if (n3 != 0) {
                        view = this.mTempScreenRect;
                        c2.f((Rect)view);
                        n3 = c2.b;
                        if (n3 != n4) {
                            view = AccessibilityNodeInfo.obtain();
                            object = new C2((AccessibilityNodeInfo)view);
                            n3 = c2.b;
                            while (n3 != n4) {
                                object2 = this.mHost;
                                ((C2)object).b = n4;
                                object3 = ((C2)object).a;
                                object3.setParent((View)object2, n4);
                                object2 = INVALID_PARENT_BOUNDS;
                                object3.setBoundsInParent(object2);
                                this.onPopulateNodeForVirtualView(n3, (C2)object);
                                view = this.mTempParentRect;
                                ((C2)object).f((Rect)view);
                                view = this.mTempScreenRect;
                                object2 = this.mTempParentRect;
                                n7 = object2.left;
                                object5 = object2.top;
                                view.offset(n7, object5);
                                n3 = ((C2)object).b;
                            }
                        }
                        view = this.mTempScreenRect;
                        object = this.mTempGlobalRect;
                        object4 = object[0];
                        object5 = this.mHost.getScrollX();
                        object4 -= object5;
                        object2 = this.mTempGlobalRect;
                        object5 = object2[bl2];
                        object3 = this.mHost;
                        n7 = object3.getScrollY();
                        view.offset(object4, object5 -= n7);
                    }
                    if ((n3 = (int)((view = this.mHost).getLocalVisibleRect((Rect)(object = this.mTempVisibleRect)) ? 1 : 0)) != 0) {
                        view = this.mTempVisibleRect;
                        object4 = this.mTempGlobalRect[0];
                        object5 = this.mHost.getScrollX();
                        object4 -= object5;
                        object2 = this.mTempGlobalRect;
                        object5 = object2[bl2];
                        object3 = this.mHost;
                        n7 = object3.getScrollY();
                        view.offset(object4, object5 -= n7);
                        view = this.mTempScreenRect;
                        object = this.mTempVisibleRect;
                        n3 = (int)(view.intersect((Rect)object) ? 1 : 0);
                        if (n3 != 0) {
                            view = this.mTempScreenRect;
                            c2.k((Rect)view);
                            view = this.mTempScreenRect;
                            n3 = (int)(this.isVisibleToUser((Rect)view) ? 1 : 0);
                            if (n3 != 0) {
                                view = c2.a;
                                view.setVisibleToUser(bl2);
                            }
                        }
                    }
                    return c2;
                }
                RuntimeException runtimeException = new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                throw runtimeException;
            }
            RuntimeException runtimeException = new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            throw runtimeException;
        }
        RuntimeException runtimeException = new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        throw runtimeException;
    }

    private C2 createNodeForHost() {
        Object object = AccessibilityNodeInfo.obtain((View)this.mHost);
        C2 c2 = new C2((AccessibilityNodeInfo)object);
        Object object2 = this.mHost;
        object2.onInitializeAccessibilityNodeInfo(object);
        object2 = new ArrayList();
        this.getVisibleVirtualViews((List)object2);
        int n3 = object.getChildCount();
        if (n3 > 0 && (n3 = ((ArrayList)object2).size()) > 0) {
            object = new RuntimeException("Views cannot have both real and virtual children");
            throw object;
        }
        n3 = ((ArrayList)object2).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.mHost;
            Integer n4 = (Integer)((ArrayList)object2).get(i3);
            int n7 = n4;
            AccessibilityNodeInfo accessibilityNodeInfo = c2.a;
            accessibilityNodeInfo.addChild(view, n7);
        }
        return c2;
    }

    private ca3 getAllNodes() {
        int n3;
        ArrayList arrayList = new ArrayList();
        this.getVisibleVirtualViews(arrayList);
        ca3 ca32 = new ca3();
        for (int i3 = 0; i3 < (n3 = arrayList.size()); ++i3) {
            n3 = (Integer)arrayList.get(i3);
            C2 c2 = this.createNodeForChild(n3);
            Integer n4 = (Integer)arrayList.get(i3);
            int n7 = n4;
            ca32.i(n7, c2);
        }
        return ca32;
    }

    private void getBoundsInParent(int n3, Rect rect) {
        this.obtainAccessibilityNodeInfo(n3).f(rect);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static Rect guessPreviouslyFocusedRect(View object, int n3, Rect rect) {
        void var2_3;
        void var1_2;
        int n4 = object.getWidth();
        int n7 = object.getHeight();
        int n8 = 17;
        if (var1_2 == n8) {
            var2_3.set(n4, 0, n4, n7);
            return var2_3;
        }
        n8 = 33;
        if (var1_2 == n8) {
            var2_3.set(0, n7, n4, n7);
            return var2_3;
        }
        n8 = 66;
        int n10 = -1;
        if (var1_2 == n8) {
            var2_3.set(n10, 0, n10, n7);
            return var2_3;
        }
        n7 = 130;
        if (var1_2 == n7) {
            var2_3.set(0, n10, n4, n10);
            return var2_3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        throw illegalArgumentException;
    }

    private boolean isVisibleToUser(Rect rect) {
        int n3;
        boolean bl2 = false;
        if (rect != null && (n3 = rect.isEmpty()) == 0) {
            Object object;
            rect = this.mHost;
            n3 = rect.getWindowVisibility();
            if (n3 != 0) {
                return false;
            }
            rect = this.mHost.getParent();
            while ((object = rect instanceof View) != 0) {
                float f5 = (rect = (View)rect).getAlpha();
                float f6 = f5 - 0.0f;
                object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
                if (object > 0 && (object = rect.getVisibility()) == 0) {
                    rect = rect.getParent();
                    continue;
                }
                return false;
            }
            if (rect != null) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private static int keyToDirection(int n3) {
        int n4 = 19;
        if (n3 != n4) {
            n4 = 21;
            if (n3 != n4) {
                n4 = 22;
                if (n3 != n4) {
                    return 130;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    /*
     * Unable to fully structure code
     */
    private boolean moveFocus(int var1_1, Rect var2_2) {
        block27: {
            block28: {
                block31: {
                    block29: {
                        block30: {
                            var3_3 = this;
                            var4_4 = var1_1;
                            var5_5 = var2_2;
                            var6_6 = 1;
                            var7_7 = this.getAllNodes();
                            var8_8 = this.mKeyboardFocusedVirtualViewId;
                            var9_9 = -1 << -1;
                            if (var8_8 == var9_9) {
                                var8_8 = 0;
                                var10_10 = null;
                            } else {
                                var10_10 = (C2)var7_7.f(var8_8);
                            }
                            var11_11 = -1;
                            var12_12 = 2;
                            var13_13 = 0;
                            if (var4_4 == var6_6 || var4_4 == var12_12) break block28;
                            var12_12 = 130;
                            var14_14 = 66;
                            var15_15 = 33;
                            var16_16 = 17;
                            if (var4_4 != var16_16 && var4_4 != var15_15 && var4_4 != var14_14 && var4_4 != var12_12) {
                                var17_17 = new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                throw var17_17;
                            }
                            var18_21 = new Rect();
                            var19_22 = var3_3.mKeyboardFocusedVirtualViewId;
                            if (var19_22 != var9_9) {
                                var3_3.getBoundsInParent(var19_22, var18_21);
                            } else if (var5_5 != null) {
                                var18_21.set((Rect)var5_5);
                            } else {
                                var5_5 = var3_3.mHost;
                                HH0.guessPreviouslyFocusedRect((View)var5_5, var4_4, var18_21);
                            }
                            var5_5 = HH0.SPARSE_VALUES_ADAPTER;
                            var20_23 = HH0.NODE_ADAPTER;
                            var21_24 = new Rect(var18_21);
                            if (var4_4 == var16_16) break block29;
                            if (var4_4 == var15_15) break block30;
                            if (var4_4 == var14_14) ** GOTO lbl47
                            if (var4_4 == var12_12) {
                                var12_12 = -(var18_21.height() + var6_6);
                                var21_24.offset(0, var12_12);
                            } else {
                                var17_18 = new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                throw var17_18;
lbl47:
                                // 1 sources

                                var12_12 = -(var18_21.width() + var6_6);
                                var21_24.offset(var12_12, 0);
                            }
                            break block31;
                        }
                        var12_12 = var18_21.height() + var6_6;
                        var21_24.offset(0, var12_12);
                        break block31;
                    }
                    var12_12 = var18_21.width() + var6_6;
                    var21_24.offset(var12_12, 0);
                }
                var5_5 = (HH0$b)var5_5;
                var5_5.getClass();
                var22_25 = var7_7.j();
                var23_26 = new Rect();
                var24_27 = null;
                var25_28 = null;
                for (var14_14 = 0; var14_14 < var22_25; var14_14 += var6_6) {
                    block32: {
                        block33: {
                            var26_29 = (C2)var7_7.k(var14_14);
                            if (var26_29 == var10_10) break block32;
                            var27_30 = var20_23;
                            var27_30 = (HH0$a)var20_23;
                            var27_30.getClass();
                            var26_29.f(var23_26);
                            var16_16 = (int)vU0.c(var4_4, var18_21, var23_26);
                            if (var16_16 == 0) break block32;
                            var16_16 = (int)vU0.c(var4_4, var18_21, (Rect)var21_24);
                            if (var16_16 == 0 || (var16_16 = (int)vU0.a(var4_4, var18_21, var23_26, (Rect)var21_24)) != 0) break block33;
                            var16_16 = (int)vU0.a(var4_4, var18_21, (Rect)var21_24, var23_26);
                            if (var16_16 != 0) break block32;
                            var16_16 = vU0.d(var4_4, var18_21, var23_26);
                            var28_31 = vU0.e(var4_4, var18_21, var23_26);
                            var29_32 = var16_16 * 13 * var16_16;
                            var16_16 = var28_31 * var28_31 + var29_32;
                            var28_31 = vU0.d(var4_4, var18_21, (Rect)var21_24);
                            var29_32 = vU0.e(var4_4, var18_21, (Rect)var21_24);
                            var30_33 = var28_31 * 13 * var28_31;
                            if (var16_16 >= (var9_9 = (var29_32 *= var29_32) + var30_33)) break block32;
                        }
                        var21_24.set(var23_26);
                        var25_28 = var26_29;
                    }
                    var9_9 = -1 << -1;
                }
lbl93:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_5 = var3_3.mHost;
            var21_24 = ViewCompat.a;
            var22_25 = var5_5.getLayoutDirection();
            if (var22_25 == var6_6) {
                var22_25 = 1;
            } else {
                var22_25 = 0;
                var5_5 = null;
            }
            var21_24 = HH0.SPARSE_VALUES_ADAPTER;
            var31_34 = HH0.NODE_ADAPTER;
            var21_24 = (HH0$b)var21_24;
            var21_24.getClass();
            var32_35 = var7_7.j();
            var24_27 = new ArrayList<C2>(var32_35);
            var26_29 = null;
            for (var15_15 = 0; var15_15 < var32_35; var15_15 += var6_6) {
                var27_30 = (C2)var7_7.k(var15_15);
                var24_27.add((C2)var27_30);
            }
            var21_24 = new vU0$c((boolean)var22_25, var31_34);
            Collections.sort(var24_27, var21_24);
            if (var4_4 == var6_6) ** GOTO lbl132
            if (var4_4 != var12_12) ** GOTO lbl130
            var4_4 = var24_27.size();
            var22_25 = var10_10 == null ? -1 : var24_27.lastIndexOf(var10_10);
            if ((var22_25 += var6_6) < var4_4) {
                var21_24 = var24_27.get(var22_25);
            } else {
                while (true) {
                    var32_35 = 0;
                    var21_24 = null;
                    break block27;
                    break;
                }
lbl130:
                // 1 sources

                var17_20 = new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                throw var17_20;
lbl132:
                // 1 sources

                var4_4 = var24_27.size();
                if (var10_10 != null) {
                    var4_4 = var24_27.indexOf(var10_10);
                }
                if ((var4_4 -= var6_6) < 0) ** continue;
                var21_24 = var24_27.get(var4_4);
            }
        }
        var25_28 = var21_24;
        var25_28 = (C2)var21_24;
        ** while (true)
        var17_19 = var25_28;
        if (var25_28 == null) {
            var9_9 = -1 << -1;
        } else {
            var22_25 = (int)var7_7.a;
            if (var22_25 != 0) {
                da3_0.a(var7_7);
            }
            var22_25 = var7_7.d;
            while (var13_13 < var22_25) {
                var10_10 = var7_7.c[var13_13];
                if (var10_10 == var17_19) {
                    var11_11 = var13_13;
                    break;
                }
                var13_13 += var6_6;
            }
            var9_9 = var7_7.g(var11_11);
        }
        return var3_3.requestKeyboardFocusForVirtualView(var9_9);
    }

    private boolean performActionForChild(int n3, int n4, Bundle bundle) {
        int n7 = 1;
        if (n4 != n7) {
            n7 = 2;
            if (n4 != n7) {
                n7 = 64;
                if (n4 != n7) {
                    n7 = 128;
                    if (n4 != n7) {
                        return this.onPerformActionForVirtualView(n3, n4, bundle);
                    }
                    return this.clearAccessibilityFocus(n3);
                }
                return this.requestAccessibilityFocus(n3);
            }
            return this.clearKeyboardFocusForVirtualView(n3);
        }
        return this.requestKeyboardFocusForVirtualView(n3);
    }

    private boolean performActionForHost(int n3, Bundle bundle) {
        View view = this.mHost;
        return view.performAccessibilityAction(n3, bundle);
    }

    private boolean requestAccessibilityFocus(int n3) {
        AccessibilityManager accessibilityManager = this.mManager;
        int n4 = accessibilityManager.isEnabled();
        int n7 = 0;
        if (n4 != 0 && (n4 = (accessibilityManager = this.mManager).isTouchExplorationEnabled()) != 0 && (n4 = this.mAccessibilityFocusedVirtualViewId) != n3) {
            n7 = -1 << -1;
            if (n4 != n7) {
                this.clearAccessibilityFocus(n4);
            }
            this.mAccessibilityFocusedVirtualViewId = n3;
            this.mHost.invalidate();
            this.sendEventForVirtualView(n3, 32768);
            return true;
        }
        return false;
    }

    private void updateHoveredVirtualView(int n3) {
        int n4 = this.mHoveredVirtualViewId;
        if (n4 == n3) {
            return;
        }
        this.mHoveredVirtualViewId = n3;
        this.sendEventForVirtualView(n3, 128);
        this.sendEventForVirtualView(n4, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int n3) {
        int n4 = this.mKeyboardFocusedVirtualViewId;
        if (n4 != n3) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = -1 << -1;
        this.onVirtualViewKeyboardFocusChanged(n3, false);
        this.sendEventForVirtualView(n3, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.mManager;
        int n3 = accessibilityManager.isEnabled();
        boolean bl2 = false;
        if (n3 != 0 && (n3 = (accessibilityManager = this.mManager).isTouchExplorationEnabled()) != 0) {
            n3 = motionEvent.getAction();
            int n4 = 7;
            boolean bl3 = true;
            int n7 = -1 << -1;
            if (n3 != n4 && n3 != (n4 = 9)) {
                int n8 = 10;
                float f5 = 1.4E-44f;
                if (n3 != n8) {
                    return false;
                }
                n8 = this.mHoveredVirtualViewId;
                if (n8 != n7) {
                    this.updateHoveredVirtualView(n7);
                    return bl3;
                }
                return false;
            }
            float f6 = motionEvent.getX();
            float f7 = motionEvent.getY();
            int n10 = this.getVirtualViewAt(f6, f7);
            this.updateHoveredVirtualView(n10);
            if (n10 != n7) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n3;
        int n4 = keyEvent.getAction();
        int n7 = 0;
        int n8 = 1;
        if (n4 == n8) return n7 != 0;
        n4 = keyEvent.getKeyCode();
        if (n4 != (n3 = 61)) {
            n3 = 66;
            if (n4 != n3) {
                switch (n4) {
                    default: {
                        return n7 != 0;
                    }
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: {
                        n3 = (int)(keyEvent.hasNoModifiers() ? 1 : 0);
                        if (n3 == 0) return n7 != 0;
                        n4 = HH0.keyToDirection(n4);
                        int n10 = keyEvent.getRepeatCount() + n8;
                        n3 = 0;
                        while (n7 < n10) {
                            boolean bl2 = this.moveFocus(n4, null);
                            if (!bl2) return n3 != 0;
                            ++n7;
                            n3 = 1;
                        }
                        return n3 != 0;
                    }
                    case 23: 
                }
            }
            if ((n4 = (int)(keyEvent.hasNoModifiers() ? 1 : 0)) == 0) return n7 != 0;
            int n14 = keyEvent.getRepeatCount();
            if (n14 != 0) return n7 != 0;
            this.clickKeyboardFocusedVirtualView();
            return 1 != 0;
        }
        n4 = (int)(keyEvent.hasNoModifiers() ? 1 : 0);
        if (n4 != 0) {
            int n15 = 2;
            return this.moveFocus(n15, null) != 0;
        }
        boolean bl3 = keyEvent.hasModifiers(n8);
        if (!bl3) return n7 != 0;
        return this.moveFocus(n8, null) != 0;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public D2 getAccessibilityNodeProvider(View object) {
        object = this.mNodeProvider;
        if (object == null) {
            object = new HH0$c(this);
            this.mNodeProvider = object;
        }
        return this.mNodeProvider;
    }

    public int getFocusedVirtualView() {
        return this.getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float var1, float var2);

    public abstract void getVisibleVirtualViews(List var1);

    public final void invalidateRoot() {
        this.invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int n3) {
        this.invalidateVirtualView(n3, 0);
    }

    public final void invalidateVirtualView(int n3, int n4) {
        AccessibilityManager accessibilityManager;
        int n7 = -1 << -1;
        if (n3 != n7 && (n7 = (int)((accessibilityManager = this.mManager).isEnabled() ? 1 : 0)) != 0 && (accessibilityManager = this.mHost.getParent()) != null) {
            int n8 = 2048;
            AccessibilityEvent accessibilityEvent = this.createEvent(n3, n8);
            accessibilityEvent.setContentChangeTypes(n4);
            View view = this.mHost;
            accessibilityManager.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public C2 obtainAccessibilityNodeInfo(int n3) {
        int n4 = -1;
        if (n3 == n4) {
            return this.createNodeForHost();
        }
        return this.createNodeForChild(n3);
    }

    public final void onFocusChanged(boolean bl2, int n3, Rect rect) {
        int n4 = this.mKeyboardFocusedVirtualViewId;
        int n7 = -1 << -1;
        if (n4 != n7) {
            this.clearKeyboardFocusForVirtualView(n4);
        }
        if (bl2) {
            this.moveFocus(n3, rect);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        this.onPopulateEventForHost(accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(view, c2);
        this.onPopulateNodeForHost(c2);
    }

    public abstract boolean onPerformActionForVirtualView(int var1, int var2, Bundle var3);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int n3, AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(C2 c2) {
    }

    public abstract void onPopulateNodeForVirtualView(int var1, C2 var2);

    public void onVirtualViewKeyboardFocusChanged(int n3, boolean bl2) {
    }

    public boolean performAction(int n3, int n4, Bundle bundle) {
        int n7 = -1;
        if (n3 != n7) {
            return this.performActionForChild(n3, n4, bundle);
        }
        return this.performActionForHost(n4, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int n3) {
        View view = this.mHost;
        int n4 = view.isFocused();
        if (!n4 && !(n4 = (int)((view = this.mHost).requestFocus() ? 1 : 0))) {
            return false;
        }
        n4 = this.mKeyboardFocusedVirtualViewId;
        if (n4 == n3) {
            return false;
        }
        int n7 = -1 << -1;
        if (n4 != n7) {
            this.clearKeyboardFocusForVirtualView(n4);
        }
        if (n3 == n7) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = n3;
        n4 = 1;
        this.onVirtualViewKeyboardFocusChanged(n3, n4 != 0);
        this.sendEventForVirtualView(n3, 8);
        return n4 != 0;
    }

    public final boolean sendEventForVirtualView(int n3, int n4) {
        AccessibilityManager accessibilityManager;
        int n7 = -1 << -1;
        if (n3 != n7 && (n7 = (int)((accessibilityManager = this.mManager).isEnabled() ? 1 : 0)) != 0) {
            accessibilityManager = this.mHost.getParent();
            if (accessibilityManager == null) {
                return false;
            }
            AccessibilityEvent accessibilityEvent = this.createEvent(n3, n4);
            View view = this.mHost;
            return accessibilityManager.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}

