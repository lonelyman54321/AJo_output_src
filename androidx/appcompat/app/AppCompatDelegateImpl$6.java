/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$6$a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;

class AppCompatDelegateImpl$6
implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public AppCompatDelegateImpl$6(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final void run() {
        boolean bl2;
        Object object = this.a;
        Object object2 = ((AppCompatDelegateImpl)object).w;
        ActionBarContextView actionBarContextView = ((AppCompatDelegateImpl)object).v;
        int n3 = 55;
        object2.showAtLocation((View)actionBarContextView, n3, 0, 0);
        object2 = ((AppCompatDelegateImpl)object).y;
        if (object2 != null) {
            ((zd3_1)object2).b();
        }
        if ((bl2 = ((AppCompatDelegateImpl)object).A) && (object2 = ((AppCompatDelegateImpl)object).B) != null && (bl2 = object2.isLaidOut())) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        float f5 = 1.0f;
        if (bl2) {
            object2 = ((AppCompatDelegateImpl)object).v;
            n3 = 0;
            object2.setAlpha(0.0f);
            object2 = ViewCompat.a((View)((AppCompatDelegateImpl)object).v);
            ((zd3_1)object2).a(f5);
            ((AppCompatDelegateImpl)object).y = object2;
            object = new AppCompatDelegateImpl$6$a(this);
            ((zd3_1)object2).d((BD3)object);
        } else {
            object2 = ((AppCompatDelegateImpl)object).v;
            object2.setAlpha(f5);
            object = ((AppCompatDelegateImpl)object).v;
            ((ActionBarContextView)((Object)object)).setVisibility(0);
        }
    }
}

