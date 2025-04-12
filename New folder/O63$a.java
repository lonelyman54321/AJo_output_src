/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.view.animation.DecelerateInterpolator
 */
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.Intrinsics;

public final class O63$a
implements View.OnLayoutChangeListener {
    public final /* synthetic */ O63 a;
    public final /* synthetic */ CharSequence b;

    public O63$a(O63 o63, CharSequence charSequence) {
        this.a = o63;
        this.b = charSequence;
    }

    public final void onLayoutChange(View object, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        Intrinsics.checkNotNullParameter(object, "v");
        O63 o63 = this.a;
        Object object2 = o63.q;
        long l2 = 500L;
        String string2 = "width";
        CharSequence charSequence = this.b;
        if (object2 != null && (n4 = object2.getVisibility()) == (n15 = 8)) {
            int n17 = object.getWidth();
            n4 = (int)(o63.P ? 1 : 0);
            if (n4 == 0 && (object2 = o63.q) != null) {
                n15 = 0;
                Object var17_17 = null;
                object2.setVisibility(0);
            }
            object2 = o63.q;
            Intrinsics.checkNotNull(object2);
            object = new int[]{n17};
            object = ObjectAnimator.ofInt((Object)object2, (String)string2, (int[])object);
            object.setDuration(l2);
            object2 = new DecelerateInterpolator();
            object.setInterpolator((TimeInterpolator)object2);
            object.start();
            Intrinsics.checkNotNull(object);
            object2 = new S63(o63, charSequence);
            object.addListener((Animator.AnimatorListener)object2);
        } else {
            int n18 = object.getWidth();
            object2 = o63.q;
            Object object3 = "";
            if (object2 != null) {
                object2.setContentDescription((CharSequence)object3);
            }
            if ((object2 = o63.q) != null) {
                object2.setText((CharSequence)object3);
            }
            object2 = o63.q;
            Intrinsics.checkNotNull(object2);
            n15 = mz3_0.L(4);
            object3 = new int[]{n15};
            object2 = ObjectAnimator.ofInt((Object)object2, (String)string2, (int[])object3);
            object2.setDuration(l2);
            Object object4 = new DecelerateInterpolator();
            object2.setInterpolator((TimeInterpolator)object4);
            object2.start();
            Intrinsics.checkNotNull(object2);
            object4 = new p63_0(o63, n18, charSequence);
            object2.addListener((Animator.AnimatorListener)object4);
        }
        object = o63.i;
        if (object != null) {
            object.removeOnLayoutChangeListener((View.OnLayoutChangeListener)this);
        }
    }
}

