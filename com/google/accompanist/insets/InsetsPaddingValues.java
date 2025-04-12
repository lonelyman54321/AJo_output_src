/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.InsetsPaddingValues$WhenMappings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class InsetsPaddingValues
implements mk2_0 {
    private final tr1_0 additionalBottom$delegate;
    private final tr1_0 additionalEnd$delegate;
    private final tr1_0 additionalStart$delegate;
    private final tr1_0 additionalTop$delegate;
    private final tr1_0 applyBottom$delegate;
    private final tr1_0 applyEnd$delegate;
    private final tr1_0 applyStart$delegate;
    private final tr1_0 applyTop$delegate;
    private final Vo0 density;
    private final Insets insets;

    public InsetsPaddingValues(Insets object, Vo0 object2) {
        Intrinsics.checkNotNullParameter(object, "insets");
        Intrinsics.checkNotNullParameter(object2, "density");
        this.insets = object;
        this.density = object2;
        object = Boolean.FALSE;
        this.applyStart$delegate = object2 = J83.g(object);
        this.applyTop$delegate = object2 = J83.g(object);
        this.applyEnd$delegate = object2 = J83.g(object);
        this.applyBottom$delegate = object = J83.g(object);
        float f5 = 0.0f;
        object2 = new xs0_0(f5);
        this.additionalStart$delegate = object2 = J83.g(object2);
        object2 = new xs0_0(f5);
        this.additionalTop$delegate = object2 = J83.g(object2);
        object2 = new xs0_0(f5);
        this.additionalEnd$delegate = object2 = J83.g(object2);
        object2 = new xs0_0(f5);
        this.additionalBottom$delegate = object = J83.g(object2);
    }

    public float calculateBottomPadding-D9Ej5fM() {
        float f5;
        float f6 = this.getAdditionalBottom-D9Ej5fM();
        boolean bl2 = this.getApplyBottom();
        if (bl2) {
            Vo0 vo0 = this.density;
            Insets insets = this.insets;
            int n3 = insets.getBottom();
            f5 = vo0.D0(n3);
        } else {
            bl2 = false;
            Object var3_4 = null;
            f5 = 0.0f;
        }
        return f6 + f5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float calculateLeftPadding-u2uoSUM(bp1_0 object) {
        Insets insets;
        int n3;
        float f5;
        Object object2;
        block8: {
            block7: {
                float f6;
                int n4;
                block6: {
                    Intrinsics.checkNotNullParameter(object, "layoutDirection");
                    object2 = InsetsPaddingValues$WhenMappings.$EnumSwitchMapping$0;
                    int n7 = ((Enum)object).ordinal();
                    n7 = object2[n7];
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                    n3 = 0;
                    insets = null;
                    if (n7 == n4) break block6;
                    n4 = 2;
                    f5 = 2.8E-45f;
                    if (n7 != n4) {
                        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                        throw noWhenBranchMatchedException;
                    }
                    f6 = this.getAdditionalEnd-D9Ej5fM();
                    n4 = (int)(this.getApplyEnd() ? 1 : 0);
                    if (n4 != 0) {
                        object2 = this.density;
                        insets = this.insets;
                        n3 = insets.getLeft();
                        f5 = object2.D0(n3);
                        return f6 += f5;
                    }
                    break block7;
                }
                f6 = this.getAdditionalStart-D9Ej5fM();
                n4 = (int)(this.getApplyStart() ? 1 : 0);
                if (n4 != 0) break block8;
            }
            f5 = 0.0f;
            return f6 += f5;
        }
        object2 = this.density;
        insets = this.insets;
        n3 = insets.getLeft();
        f5 = object2.D0(n3);
        return f6 += f5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float calculateRightPadding-u2uoSUM(bp1_0 object) {
        Insets insets;
        int n3;
        float f5;
        Object object2;
        block8: {
            block7: {
                float f6;
                int n4;
                block6: {
                    Intrinsics.checkNotNullParameter(object, "layoutDirection");
                    object2 = InsetsPaddingValues$WhenMappings.$EnumSwitchMapping$0;
                    int n7 = ((Enum)object).ordinal();
                    n7 = object2[n7];
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                    n3 = 0;
                    insets = null;
                    if (n7 == n4) break block6;
                    n4 = 2;
                    f5 = 2.8E-45f;
                    if (n7 != n4) {
                        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                        throw noWhenBranchMatchedException;
                    }
                    f6 = this.getAdditionalStart-D9Ej5fM();
                    n4 = (int)(this.getApplyStart() ? 1 : 0);
                    if (n4 != 0) {
                        object2 = this.density;
                        insets = this.insets;
                        n3 = insets.getRight();
                        f5 = object2.D0(n3);
                        return f6 += f5;
                    }
                    break block7;
                }
                f6 = this.getAdditionalEnd-D9Ej5fM();
                n4 = (int)(this.getApplyEnd() ? 1 : 0);
                if (n4 != 0) break block8;
            }
            f5 = 0.0f;
            return f6 += f5;
        }
        object2 = this.density;
        insets = this.insets;
        n3 = insets.getRight();
        f5 = object2.D0(n3);
        return f6 += f5;
    }

    public float calculateTopPadding-D9Ej5fM() {
        float f5;
        float f6 = this.getAdditionalTop-D9Ej5fM();
        boolean bl2 = this.getApplyTop();
        if (bl2) {
            Vo0 vo0 = this.density;
            Insets insets = this.insets;
            int n3 = insets.getTop();
            f5 = vo0.D0(n3);
        } else {
            bl2 = false;
            Object var3_4 = null;
            f5 = 0.0f;
        }
        return f6 + f5;
    }

    public final float getAdditionalBottom-D9Ej5fM() {
        return ((xs0_0)this.additionalBottom$delegate.getValue()).a;
    }

    public final float getAdditionalEnd-D9Ej5fM() {
        return ((xs0_0)this.additionalEnd$delegate.getValue()).a;
    }

    public final float getAdditionalStart-D9Ej5fM() {
        return ((xs0_0)this.additionalStart$delegate.getValue()).a;
    }

    public final float getAdditionalTop-D9Ej5fM() {
        return ((xs0_0)this.additionalTop$delegate.getValue()).a;
    }

    public final boolean getApplyBottom() {
        return (Boolean)this.applyBottom$delegate.getValue();
    }

    public final boolean getApplyEnd() {
        return (Boolean)this.applyEnd$delegate.getValue();
    }

    public final boolean getApplyStart() {
        return (Boolean)this.applyStart$delegate.getValue();
    }

    public final boolean getApplyTop() {
        return (Boolean)this.applyTop$delegate.getValue();
    }

    public final void setAdditionalBottom-0680j_4(float f5) {
        tr1_0 tr1_02 = this.additionalBottom$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }

    public final void setAdditionalEnd-0680j_4(float f5) {
        tr1_0 tr1_02 = this.additionalEnd$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }

    public final void setAdditionalStart-0680j_4(float f5) {
        tr1_0 tr1_02 = this.additionalStart$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }

    public final void setAdditionalTop-0680j_4(float f5) {
        tr1_0 tr1_02 = this.additionalTop$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }

    public final void setApplyBottom(boolean bl2) {
        tr1_0 tr1_02 = this.applyBottom$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }

    public final void setApplyEnd(boolean bl2) {
        tr1_0 tr1_02 = this.applyEnd$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }

    public final void setApplyStart(boolean bl2) {
        tr1_0 tr1_02 = this.applyStart$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }

    public final void setApplyTop(boolean bl2) {
        tr1_0 tr1_02 = this.applyTop$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }
}

