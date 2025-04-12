/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation;
import androidx.fragment.app.b$a$a;
import androidx.fragment.app.b$b;
import androidx.fragment.app.b$f;
import androidx.fragment.app.n$a;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import kotlin.jvm.internal.Intrinsics;

public final class b$a
extends n$a {
    public final b$b c;

    public b$a(b$b b$b) {
        Intrinsics.checkNotNullParameter(b$b, "animationInfo");
        this.c = b$b;
    }

    public final void b(ViewGroup object) {
        Intrinsics.checkNotNullParameter(object, "container");
        b$b b$b = this.c;
        n$c n$c = b$b.a;
        View view = n$c.c.mView;
        view.clearAnimation();
        object.endViewTransition(view);
        b$b.a.c(this);
        object = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            n$c.toString();
        }
    }

    public final void c(ViewGroup object) {
        Intrinsics.checkNotNullParameter(object, "container");
        Object object2 = this.c;
        boolean bl2 = ((b$f)object2).a();
        if (bl2) {
            ((b$f)object2).a.c(this);
            return;
        }
        Object object3 = object.getContext();
        n$c n$c = ((b$f)object2).a;
        View view = n$c.c.mView;
        Intrinsics.checkNotNullExpressionValue(object3, "context");
        object3 = ((b$b)object2).b((Context)object3);
        Object object4 = "Required value was null.";
        if (object3 != null) {
            object3 = object3.a;
            if (object3 != null) {
                object4 = n$c.a;
                n$c$b n$c$b = n$c$b.REMOVED;
                if (object4 != n$c$b) {
                    view.startAnimation((Animation)object3);
                    object = ((b$f)object2).a;
                    ((n$c)object).c(this);
                } else {
                    object.startViewTransition(view);
                    object2 = new FragmentAnim$EndViewTransitionAnimation((Animation)object3, (ViewGroup)object, view);
                    object3 = new b$a$a(n$c, (ViewGroup)object, view, this);
                    object2.setAnimationListener((Animation.AnimationListener)object3);
                    view.startAnimation((Animation)object2);
                    object = "FragmentManager";
                    int n3 = 2;
                    boolean bl3 = Log.isLoggable((String)object, (int)n3);
                    if (bl3) {
                        n$c.toString();
                    }
                }
                return;
            }
            object2 = object4.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = object4.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

