/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.a;
import androidx.compose.ui.platform.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class AndroidComposeView$o
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidComposeView c;

    public AndroidComposeView$o(AndroidComposeView androidComposeView) {
        this.c = androidComposeView;
        super(1);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        LT0 lT0;
        int n3;
        object = ((Yn1)object).a;
        Object object2 = this.c;
        object2.getClass();
        long l2 = bo1_1.c((KeyEvent)object);
        long l3 = Rn1.h;
        boolean bl2 = Rn1.a(l2, l3);
        int n4 = 1;
        int n7 = 2;
        if (bl2) {
            n3 = object.isShiftPressed();
            n3 = n3 != 0 ? 2 : 1;
            lT0 = new LT0(n3);
        } else {
            long l4 = Rn1.f;
            bl2 = Rn1.a(l2, l4);
            if (bl2) {
                n3 = 4;
                lT0 = new LT0(n3);
            } else {
                l4 = Rn1.e;
                bl2 = Rn1.a(l2, l4);
                if (bl2) {
                    n3 = 3;
                    lT0 = new LT0(n3);
                } else {
                    l4 = Rn1.c;
                    bl2 = Rn1.a(l2, l4);
                    if (bl2) {
                        bl2 = true;
                    } else {
                        l4 = Rn1.k;
                        bl2 = Rn1.a(l2, l4);
                    }
                    if (bl2) {
                        n3 = 5;
                        lT0 = new LT0(n3);
                    } else {
                        l4 = Rn1.d;
                        bl2 = Rn1.a(l2, l4);
                        if (bl2) {
                            bl2 = true;
                        } else {
                            l4 = Rn1.l;
                            bl2 = Rn1.a(l2, l4);
                        }
                        if (bl2) {
                            n3 = 6;
                            lT0 = new LT0(n3);
                        } else {
                            l4 = Rn1.g;
                            bl2 = Rn1.a(l2, l4);
                            if (bl2) {
                                bl2 = true;
                            } else {
                                l4 = Rn1.i;
                                bl2 = Rn1.a(l2, l4);
                            }
                            if (bl2) {
                                bl2 = true;
                            } else {
                                l4 = Rn1.m;
                                bl2 = Rn1.a(l2, l4);
                            }
                            if (bl2) {
                                n3 = 7;
                                lT0 = new LT0(n3);
                            } else {
                                l4 = Rn1.b;
                                bl2 = Rn1.a(l2, l4);
                                if (bl2) {
                                    n3 = 1;
                                } else {
                                    l4 = Rn1.j;
                                    n3 = (int)(Rn1.a(l2, l4) ? 1 : 0);
                                }
                                if (n3 != 0) {
                                    n3 = 8;
                                    lT0 = new LT0(n3);
                                } else {
                                    lT0 = null;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (lT0 == null) return Boolean.FALSE;
        boolean bl3 = ao1_2.a(bo1_1.d((KeyEvent)object), n7);
        if (!bl3) return Boolean.FALSE;
        object = ((AndroidComposeView)object2).R();
        Object object3 = ((AndroidComposeView)object2).getFocusOwner();
        int n8 = lT0.a;
        Object object4 = new b(lT0);
        n3 = (object3 = object3.a(n8, (aG2)object, (Function1)object4)) != null ? (int)(((Boolean)object3).booleanValue() ? 1 : 0) : 1;
        if (n3 != 0) {
            return Boolean.TRUE;
        }
        n3 = (int)(LT0.a(n8, n4) ? 1 : 0);
        n3 = n3 != 0 ? 1 : (int)(LT0.a(n8, n7) ? 1 : 0);
        if (n3 == 0) {
            return Boolean.FALSE;
        }
        object3 = WT0.c(n8);
        if (object3 != null) {
            n3 = ((Number)object3).intValue();
            if (object != null) {
                object = cf_2.e((aG2)object);
            } else {
                bl3 = false;
                object = null;
            }
            if (object != null) {
                block36: {
                    object4 = object2;
                    block0: while (object4 != null) {
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = object2.getRootView();
                        String string2 = "null cannot be cast to non-null type android.view.ViewGroup";
                        Intrinsics.checkNotNull(view, string2);
                        if ((object4 = focusFinder.findNextFocus((ViewGroup)(view = (ViewGroup)view), (View)object4, n3)) == null) continue;
                        Fg$a fg$a = Fg.a;
                        n7 = (int)(Intrinsics.areEqual(object4, object2) ? 1 : 0);
                        if (n7 == 0) {
                            void var18_19;
                            ViewParent viewParent = object4.getParent();
                            while (var18_19 != null) {
                                if (var18_19 == object2) continue block0;
                                ViewParent viewParent2 = var18_19.getParent();
                            }
                        }
                        break block36;
                    }
                    bl2 = false;
                    object4 = null;
                }
                n7 = Intrinsics.areEqual(object4, object2) ^ n4;
                if (n7 == 0) {
                    bl2 = false;
                    object4 = null;
                }
                if (object4 != null && (bl3 = WT0.b((View)object4, (Integer)(object3 = Integer.valueOf(n3)), (Rect)object))) {
                    return Boolean.TRUE;
                }
                object = ((AndroidComposeView)object2).getFocusOwner();
                n3 = 0;
                object3 = null;
                bl3 = object.l(n8, false, false);
                if (!bl3) {
                    return Boolean.TRUE;
                }
                object = ((AndroidComposeView)object2).getFocusOwner();
                object2 = new a(lT0);
                if ((object = object.a(n8, null, (Function1)object2)) == null) return n4 != 0;
                n4 = ((Boolean)object).booleanValue();
                return n4 != 0;
            }
            object2 = "Invalid rect".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = "Invalid focus direction".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

