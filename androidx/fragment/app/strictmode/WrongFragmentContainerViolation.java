/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.Intrinsics;

public final class WrongFragmentContainerViolation
extends Violation {
    public final ViewGroup b;

    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        CharSequence charSequence = new StringBuilder("Attempting to add fragment ");
        charSequence.append(fragment);
        charSequence.append(" to container ");
        charSequence.append(viewGroup);
        charSequence.append(" which is not a FragmentContainerView");
        charSequence = charSequence.toString();
        super(fragment, (String)charSequence);
        this.b = viewGroup;
    }
}

