/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.material.textfield;

import android.util.SparseArray;
import com.google.android.material.R$styleable;
import com.google.android.material.textfield.ClearTextEndIconDelegate;
import com.google.android.material.textfield.CustomEndIconDelegate;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.NoEndIconDelegate;
import com.google.android.material.textfield.PasswordToggleEndIconDelegate;

class EndCompoundLayout$EndIconDelegates {
    private final int customEndIconDrawableId;
    private final SparseArray delegates;
    private final EndCompoundLayout endLayout;
    private final int passwordIconDrawableId;

    public EndCompoundLayout$EndIconDelegates(EndCompoundLayout endCompoundLayout, Tn3 tn3) {
        SparseArray sparseArray;
        this.delegates = sparseArray = new SparseArray();
        this.endLayout = endCompoundLayout;
        int n3 = R$styleable.TextInputLayout_endIconDrawable;
        this.customEndIconDrawableId = n3 = tn3.b.getResourceId(n3, 0);
        n3 = R$styleable.TextInputLayout_passwordToggleDrawable;
        this.passwordIconDrawableId = n3 = tn3.b.getResourceId(n3, 0);
    }

    public static /* synthetic */ int access$500(EndCompoundLayout$EndIconDelegates endCompoundLayout$EndIconDelegates) {
        return endCompoundLayout$EndIconDelegates.customEndIconDrawableId;
    }

    private EndIconDelegate create(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            if (n3 != 0) {
                n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        n4 = 3;
                        if (n3 == n4) {
                            EndCompoundLayout endCompoundLayout = this.endLayout;
                            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = new DropdownMenuEndIconDelegate(endCompoundLayout);
                            return dropdownMenuEndIconDelegate;
                        }
                        String string2 = hj0_0.a(n3, "Invalid end icon mode: ");
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                        throw illegalArgumentException;
                    }
                    EndCompoundLayout endCompoundLayout = this.endLayout;
                    ClearTextEndIconDelegate clearTextEndIconDelegate = new ClearTextEndIconDelegate(endCompoundLayout);
                    return clearTextEndIconDelegate;
                }
                EndCompoundLayout endCompoundLayout = this.endLayout;
                int n7 = this.passwordIconDrawableId;
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = new PasswordToggleEndIconDelegate(endCompoundLayout, n7);
                return passwordToggleEndIconDelegate;
            }
            EndCompoundLayout endCompoundLayout = this.endLayout;
            NoEndIconDelegate noEndIconDelegate = new NoEndIconDelegate(endCompoundLayout);
            return noEndIconDelegate;
        }
        EndCompoundLayout endCompoundLayout = this.endLayout;
        CustomEndIconDelegate customEndIconDelegate = new CustomEndIconDelegate(endCompoundLayout);
        return customEndIconDelegate;
    }

    public EndIconDelegate get(int n3) {
        EndIconDelegate endIconDelegate = (EndIconDelegate)this.delegates.get(n3);
        if (endIconDelegate == null) {
            endIconDelegate = this.create(n3);
            SparseArray sparseArray = this.delegates;
            sparseArray.append(n3, (Object)endIconDelegate);
        }
        return endIconDelegate;
    }
}

