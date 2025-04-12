/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 */
import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MW0
 */
public final class mw0_0 {
    public final androidx.fragment.app.Fragment a;
    public final Fragment b;

    public mw0_0(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.b = fragment;
    }

    public mw0_0(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.a = fragment;
    }

    public final Activity a() {
        FragmentActivity fragmentActivity = null;
        androidx.fragment.app.Fragment fragment = this.a;
        if (fragment != null) {
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            }
        } else {
            fragment = this.b;
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            }
        }
        return fragmentActivity;
    }
}

