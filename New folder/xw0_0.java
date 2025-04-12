/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.FrameLayout
 */
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$l;
import androidx.viewpager2.adapter.a;

/*
 * Renamed from xW0
 */
public final class xw0_0
extends FragmentManager$l {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ a c;

    public xw0_0(a a2, Fragment fragment, FrameLayout frameLayout) {
        this.c = a2;
        this.a = fragment;
        this.b = frameLayout;
    }

    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle object) {
        object = this.a;
        if (fragment == object) {
            fragmentManager.m0(this);
            this.c.getClass();
            fragmentManager = this.b;
            androidx.viewpager2.adapter.a.g(view, (FrameLayout)fragmentManager);
        }
    }
}

