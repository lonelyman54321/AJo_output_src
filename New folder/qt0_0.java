/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 */
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QT0
 */
public final class qt0_0
extends LP1$c
implements lu0_0,
ViewTreeObserver.OnGlobalFocusChangeListener,
View.OnAttachStateChangeListener {
    public View n;

    public final void J(gU0 gU02) {
        gU02.a(false);
        FunctionReferenceImpl functionReferenceImpl = new FunctionReferenceImpl(1, this, qt0_0.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        gU02.d((QT0$a)functionReferenceImpl);
        functionReferenceImpl = new FunctionReferenceImpl(1, this, qt0_0.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        gU02.b((QT0$b)functionReferenceImpl);
    }

    public final void j1() {
        PT0.c(this).addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public final void k1() {
        PT0.c(this).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.n = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onGlobalFocusChanged(View object, View object2) {
        boolean bl2;
        boolean bl3;
        int n3;
        boolean bl4;
        sg2_0 sg2_02 = go0.f((fo0)this).i;
        if (sg2_02 == null) {
            return;
        }
        sg2_02 = PT0.c(this);
        bu0_1 bu0_12 = go0.g(this).getFocusOwner();
        sg2_0 sg2_03 = go0.g(this);
        boolean bl5 = true;
        if (object != null && !(bl4 = Intrinsics.areEqual(object, sg2_03)) && (n3 = PT0.a((View)sg2_02, (View)object)) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        if (object2 != null && !(bl3 = Intrinsics.areEqual(object2, sg2_03)) && (bl2 = PT0.a((View)sg2_02, (View)object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            sg2_02 = null;
        }
        if (n3 != 0 && bl2) {
            this.n = object2;
            return;
        }
        if (bl2) {
            Throwable throwable2;
            block11: {
                block10: {
                    this.n = object2;
                    object = this.r1();
                    object2 = ((FocusTargetNode)object).s1();
                    boolean bl6 = ((uu0_1)object2).getHasFocus();
                    if (bl6) return;
                    object2 = bu0_12.c();
                    try {
                        bl2 = ((xu0_0)object2).c;
                        if (!bl2) break block10;
                        xu0_0.a((xu0_0)object2);
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                ((xu0_0)object2).c = bl5;
                yu0_1.f((FocusTargetNode)object);
                xu0_0.b((xu0_0)object2);
                return;
            }
            xu0_0.b((xu0_0)object2);
            throw throwable2;
        }
        boolean bl7 = false;
        object2 = null;
        if (n3 != 0) {
            this.n = null;
            object = this.r1().s1();
            n3 = ((uu0_1)object).isFocused();
            if (n3 == 0) return;
            n3 = 8;
            bu0_12.l(n3, false, false);
            return;
        }
        this.n = null;
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener((ViewTreeObserver.OnGlobalFocusChangeListener)this);
    }

    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener((ViewTreeObserver.OnGlobalFocusChangeListener)this);
    }

    public final FocusTargetNode r1() {
        Object object = this.a;
        int n3 = ((LP1$c)object).m;
        if (n3 != 0) {
            String string2;
            n3 = ((LP1$c)object).d & 0x400;
            if (n3 != 0) {
                object = ((LP1$c)object).f;
                n3 = 0;
                string2 = null;
                boolean bl2 = false;
                while (object != null) {
                    int n4 = ((LP1$c)object).c & 0x400;
                    if (n4 != 0) {
                        Object object2 = object;
                        WR1 wR1 = null;
                        while (object2 != null) {
                            int n7 = object2 instanceof FocusTargetNode;
                            int n8 = 1;
                            if (n7 != 0) {
                                object2 = (FocusTargetNode)object2;
                                if (bl2) {
                                    return object2;
                                }
                                bl2 = true;
                            } else {
                                n7 = ((LP1$c)object2).c & 0x400;
                                if (n7 != 0 && (n7 = object2 instanceof mo0_0) != 0) {
                                    Object object3 = object2;
                                    object3 = ((mo0_0)object2).o;
                                    int n10 = 0;
                                    while (object3 != null) {
                                        int n14 = ((LP1$c)object3).c & 0x400;
                                        if (n14 != 0) {
                                            if (++n10 == n8) {
                                                object2 = object3;
                                            } else {
                                                if (wR1 == null) {
                                                    n14 = 16;
                                                    Object[] objectArray = new LP1$c[n14];
                                                    wR1 = new WR1(objectArray);
                                                }
                                                if (object2 != null) {
                                                    wR1.b(object2);
                                                    n4 = 0;
                                                    object2 = null;
                                                }
                                                wR1.b(object3);
                                            }
                                        }
                                        object3 = ((LP1$c)object3).f;
                                    }
                                    if (n10 == n8) continue;
                                }
                            }
                            object2 = go0.b(wR1);
                        }
                    }
                    object = ((LP1$c)object).f;
                }
            }
            string2 = "Could not find focus target of embedded view wrapper".toString();
            object = new IllegalStateException(string2);
            throw object;
        }
        bh1_1.c("visitLocalDescendants called on an unattached node");
        throw null;
    }
}

