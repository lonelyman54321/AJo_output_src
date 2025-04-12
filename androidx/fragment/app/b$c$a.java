/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b$c;
import androidx.fragment.app.n$a;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class b$c$a
extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ n$c d;
    public final /* synthetic */ b$c e;

    public b$c$a(ViewGroup viewGroup, View view, boolean bl2, n$c n$c, b$c c2) {
        this.a = viewGroup;
        this.b = view;
        this.c = bl2;
        this.d = n$c;
        this.e = c2;
    }

    public final void onAnimationEnd(Animator object) {
        Intrinsics.checkNotNullParameter(object, "anim");
        object = this.a;
        Object object2 = this.b;
        object.endViewTransition((View)object2);
        boolean bl2 = this.c;
        n$c n$c = this.d;
        if (bl2) {
            n$c$b n$c$b = n$c.a;
            String string2 = "viewToAnimate";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            n$c$b.applyState((View)object2, (ViewGroup)object);
        }
        object = this.e;
        object2 = object.c.a;
        ((n$c)object2).c((n$a)object);
        object = "FragmentManager";
        int n3 = 2;
        boolean bl3 = Log.isLoggable((String)object, (int)n3);
        if (bl3) {
            Objects.toString(n$c);
        }
    }
}

