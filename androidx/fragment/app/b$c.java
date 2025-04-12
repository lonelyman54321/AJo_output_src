/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b$b;
import androidx.fragment.app.b$c$a;
import androidx.fragment.app.b$d;
import androidx.fragment.app.b$e;
import androidx.fragment.app.b$f;
import androidx.fragment.app.n$a;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class b$c
extends n$a {
    public final b$b c;
    public AnimatorSet d;

    public b$c(b$b b$b) {
        Intrinsics.checkNotNullParameter(b$b, "animatorInfo");
        this.c = b$b;
    }

    public final void b(ViewGroup object) {
        Intrinsics.checkNotNullParameter(object, "container");
        object = this.d;
        Object object2 = this.c;
        if (object == null) {
            object = ((b$f)object2).a;
            ((n$c)object).c(this);
        } else {
            boolean bl2;
            object2 = ((b$f)object2).a;
            int n3 = ((n$c)object2).g;
            if (n3 != 0) {
                n3 = Build.VERSION.SDK_INT;
                int n4 = 26;
                if (n3 >= n4) {
                    b$e b$e = b$e.a;
                    b$e.a((AnimatorSet)object);
                }
            } else {
                object.end();
            }
            if (bl2 = Log.isLoggable((String)(object = "FragmentManager"), (int)(n3 = 2))) {
                ((n$c)object2).toString();
            }
        }
    }

    public final void c(ViewGroup object) {
        Intrinsics.checkNotNullParameter(object, "container");
        object = this.c.a;
        Object object2 = this.d;
        if (object2 == null) {
            ((n$c)object).c(this);
            return;
        }
        object2.start();
        object2 = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)object2, (int)n3);
        if (bl2) {
            Objects.toString(object);
        }
    }

    public final void d(uu_0 object, ViewGroup object2) {
        Intrinsics.checkNotNullParameter(object, "backEvent");
        Intrinsics.checkNotNullParameter(object2, "container");
        object2 = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            ((n$c)object2).c(this);
            return;
        }
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            Object object3 = ((n$c)object2).c;
            n3 = (int)(((Fragment)object3).mTransitioning ? 1 : 0);
            if (n3 != 0) {
                object3 = "FragmentManager";
                n4 = 2;
                boolean bl2 = Log.isLoggable((String)object3, (int)n4);
                if (bl2) {
                    ((n$c)object2).toString();
                }
                b$d b$d = b$d.a;
                long l2 = b$d.a(animatorSet);
                float f5 = ((uu_0)object).c;
                float f6 = l2;
                long l3 = (long)(f5 *= f6);
                long l4 = 0L;
                long l7 = 1L;
                Object object4 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (object4 == false) {
                    l3 = l7;
                }
                if ((object4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) == false) {
                    l3 = l2 - l7;
                }
                if ((object4 = (Object)Log.isLoggable((String)object3, (int)n4)) != false) {
                    animatorSet.toString();
                    ((n$c)object2).toString();
                }
                object = b$e.a;
                ((b$e)object).b(animatorSet, l3);
            }
        }
    }

    public final void e(ViewGroup viewGroup) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Object object = this.c;
        boolean bl3 = ((b$f)object).a();
        if (bl3) {
            return;
        }
        Object object2 = viewGroup.getContext();
        Object object3 = "context";
        Intrinsics.checkNotNullExpressionValue(object2, object3);
        object2 = ((b$b)object).b((Context)object2);
        if (object2 != null) {
            object2 = object2.b;
        } else {
            bl3 = false;
            object2 = null;
        }
        this.d = object2;
        n$c n$c = ((b$f)object).a;
        object = n$c.c;
        object2 = n$c.a;
        object3 = n$c$b.GONE;
        if (object2 == object3) {
            bl3 = true;
            bl2 = true;
        } else {
            bl3 = false;
            object2 = null;
            bl2 = false;
        }
        object = ((Fragment)object).mView;
        viewGroup.startViewTransition((View)object);
        object2 = this.d;
        if (object2 != null) {
            b$c$a b$c$a;
            object3 = b$c$a;
            b$c$a = new b$c$a(viewGroup, (View)object, bl2, n$c, this);
            object2.addListener((Animator.AnimatorListener)b$c$a);
        }
        if ((viewGroup = this.d) != null) {
            viewGroup.setTarget(object);
        }
    }
}

