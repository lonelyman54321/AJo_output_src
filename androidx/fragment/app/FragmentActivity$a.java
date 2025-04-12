/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.Window
 */
package androidx.fragment.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.core.app.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.i;
import java.io.PrintWriter;

public final class FragmentActivity$a
extends lw0_0
implements s82,
j92_0,
I82,
O82,
sD3,
h82_0,
O3,
zs2_1,
uW0,
WN1 {
    public final /* synthetic */ FragmentActivity e;

    public FragmentActivity$a(FragmentActivity fragmentActivity) {
        this.e = fragmentActivity;
        super(fragmentActivity);
    }

    public final void a(Fragment fragment) {
        this.e.onAttachFragment(fragment);
    }

    public final void addMenuProvider(fo1_0 fo1_02) {
        this.e.addMenuProvider(fo1_02);
    }

    public final void addOnConfigurationChangedListener(p60_0 p60_02) {
        this.e.addOnConfigurationChangedListener(p60_02);
    }

    public final void addOnMultiWindowModeChangedListener(p60_0 p60_02) {
        this.e.addOnMultiWindowModeChangedListener(p60_02);
    }

    public final void addOnPictureInPictureModeChangedListener(p60_0 p60_02) {
        this.e.addOnPictureInPictureModeChangedListener(p60_02);
    }

    public final void addOnTrimMemoryListener(p60_0 p60_02) {
        this.e.addOnTrimMemoryListener(p60_02);
    }

    public final View b(int n3) {
        return this.e.findViewById(n3);
    }

    public final boolean c() {
        boolean bl2;
        Window window = this.e.getWindow();
        if (window != null && (window = window.peekDecorView()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            window = null;
        }
        return bl2;
    }

    public final void d(PrintWriter printWriter, String[] stringArray) {
        this.e.dump("  ", null, printWriter, stringArray);
    }

    public final FragmentActivity e() {
        return this.e;
    }

    public final LayoutInflater f() {
        FragmentActivity fragmentActivity = this.e;
        return fragmentActivity.getLayoutInflater().cloneInContext((Context)fragmentActivity);
    }

    public final boolean g(String string2) {
        return androidx.core.app.b.b(this.e, string2);
    }

    public final K3 getActivityResultRegistry() {
        return this.e.getActivityResultRegistry();
    }

    public final i getLifecycle() {
        return this.e.mFragmentLifecycleRegistry;
    }

    public final d82_0 getOnBackPressedDispatcher() {
        return this.e.getOnBackPressedDispatcher();
    }

    public final xs2_1 getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    public final rd3_0 getViewModelStore() {
        return this.e.getViewModelStore();
    }

    public final void i() {
        this.e.invalidateMenu();
    }

    public final void removeMenuProvider(fo1_0 fo1_02) {
        this.e.removeMenuProvider(fo1_02);
    }

    public final void removeOnConfigurationChangedListener(p60_0 p60_02) {
        this.e.removeOnConfigurationChangedListener(p60_02);
    }

    public final void removeOnMultiWindowModeChangedListener(p60_0 p60_02) {
        this.e.removeOnMultiWindowModeChangedListener(p60_02);
    }

    public final void removeOnPictureInPictureModeChangedListener(p60_0 p60_02) {
        this.e.removeOnPictureInPictureModeChangedListener(p60_02);
    }

    public final void removeOnTrimMemoryListener(p60_0 p60_02) {
        this.e.removeOnTrimMemoryListener(p60_02);
    }
}

