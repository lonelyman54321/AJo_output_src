/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.b$a;
import androidx.fragment.app.n$c;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class b$a$a
implements Animation.AnimationListener {
    public final /* synthetic */ n$c a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ b$a d;

    public b$a$a(n$c n$c, ViewGroup viewGroup, View view, b$a b$a) {
        this.a = n$c;
        this.b = viewGroup;
        this.c = view;
        this.d = b$a;
    }

    public final void onAnimationEnd(Animation object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        ViewGroup viewGroup = this.b;
        View view = this.c;
        b$a b$a = this.d;
        object = new Zm0(viewGroup, 0, view, b$a);
        viewGroup.post((Runnable)object);
        object = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            object = this.a;
            Objects.toString(object);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation object) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            object = this.a;
            Objects.toString(object);
        }
    }
}

