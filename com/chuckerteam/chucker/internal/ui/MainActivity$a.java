/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.chuckerteam.chucker.internal.ui;

import android.content.Context;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener;
import kotlin.jvm.internal.Intrinsics;

public final class MainActivity$a
extends TabLayout$TabLayoutOnPageChangeListener {
    public final /* synthetic */ MainActivity a;

    public MainActivity$a(MainActivity mainActivity, TabLayout tabLayout) {
        this.a = mainActivity;
        super(tabLayout);
    }

    public final void onPageSelected(int n3) {
        super.onPageSelected(n3);
        String string2 = "context";
        MainActivity mainActivity = this.a;
        if (n3 == 0) {
            Intrinsics.checkNotNullParameter(mainActivity, string2);
            l52_0 l52_02 = new l52_0((Context)mainActivity);
            l52_02 = l52_02.b;
            int n4 = 1138;
            l52_02.cancel(n4);
        } else {
            Intrinsics.checkNotNullParameter(mainActivity, string2);
            l52_0 l52_03 = new l52_0((Context)mainActivity);
            l52_03 = l52_03.b;
            int n7 = 3546;
            l52_03.cancel(n7);
        }
    }
}

