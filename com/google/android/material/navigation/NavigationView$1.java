/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.navigation;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout$f;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

class NavigationView$1
extends DrawerLayout$f {
    final /* synthetic */ NavigationView this$0;

    public NavigationView$1(NavigationView navigationView) {
        this.this$0 = navigationView;
    }

    public void onDrawerClosed(View object) {
        NavigationView navigationView = this.this$0;
        if (object == navigationView) {
            NavigationView.access$000(navigationView).stopListeningForBackCallbacks();
            object = this.this$0;
            NavigationView.access$100((NavigationView)object);
        }
    }

    public void onDrawerOpened(View view) {
        Object object = this.this$0;
        if (view == object) {
            object = NavigationView.access$000((NavigationView)object);
            Objects.requireNonNull(object);
            ju1_1 ju1_12 = new ju1_1((MaterialBackOrchestrator)object);
            view.post((Runnable)ju1_12);
        }
    }
}

