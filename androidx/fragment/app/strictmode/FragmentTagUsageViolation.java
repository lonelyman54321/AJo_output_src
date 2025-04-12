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

public final class FragmentTagUsageViolation
extends Violation {
    public final ViewGroup b;

    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        CharSequence charSequence = new StringBuilder("Attempting to use <fragment> tag to add fragment ");
        charSequence.append(fragment);
        charSequence.append(" to container ");
        charSequence.append(viewGroup);
        charSequence = charSequence.toString();
        super(fragment, (String)charSequence);
        this.b = viewGroup;
    }
}

