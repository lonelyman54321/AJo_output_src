/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$l;
import androidx.media3.ui.R$dimen;
import androidx.media3.ui.R$id;
import java.util.ArrayList;
import java.util.Iterator;

public final class mu2 {
    public boolean A;
    public boolean B;
    public boolean C;
    public final PlayerControlView a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final bu2 s;
    public final hi_1 t;
    public final hu2_0 u;
    public final iu2 v;
    public final ju2_0 w;
    public final ku2_1 x;
    public final ArrayList y;
    public int z;

    public mu2(PlayerControlView object) {
        AnimatorSet animatorSet;
        Object object2;
        Object object3;
        ViewGroup viewGroup;
        int n3 = 2;
        this.a = object;
        Object object4 = new bu2(this);
        this.s = object4;
        int n4 = 1;
        super(this, n4);
        this.t = object4;
        super(this);
        this.u = object4;
        super(this);
        this.v = object4;
        super(this);
        this.w = object4;
        object4 = new ku2_1(this);
        this.x = object4;
        this.C = n4;
        this.z = 0;
        this.y = object4 = new ArrayList();
        int n7 = R$id.exo_controls_background;
        this.b = object4 = object.findViewById(n7);
        n7 = R$id.exo_center_controls;
        object4 = (ViewGroup)object.findViewById(n7);
        this.c = object4;
        n7 = R$id.exo_minimal_controls;
        object4 = (ViewGroup)object.findViewById(n7);
        this.e = object4;
        n7 = R$id.exo_bottom_bar;
        object4 = (ViewGroup)object.findViewById(n7);
        this.d = object4;
        int n8 = R$id.exo_time;
        this.i = viewGroup = (ViewGroup)object.findViewById(n8);
        n8 = R$id.exo_progress;
        viewGroup = object.findViewById(n8);
        this.j = viewGroup;
        int n10 = R$id.exo_basic_controls;
        this.f = object3 = (ViewGroup)object.findViewById(n10);
        n10 = R$id.exo_extra_controls;
        this.g = object3 = (ViewGroup)object.findViewById(n10);
        n10 = R$id.exo_extra_controls_scroll_view;
        this.h = object3 = (ViewGroup)object.findViewById(n10);
        n10 = R$id.exo_overflow_show;
        object3 = object.findViewById(n10);
        this.k = object3;
        int n14 = R$id.exo_overflow_hide;
        Object object5 = object.findViewById(n14);
        if (object3 != null && object5 != null) {
            object2 = new rh2_1(this, n4);
            object3.setOnClickListener((View.OnClickListener)object2);
            super(this, n4);
            object5.setOnClickListener((View.OnClickListener)object3);
        }
        Object object6 = object3 = (Object)new float[n3];
        object6[0] = (ViewGroup)1.0f;
        object6[1] = (ViewGroup)0.0f;
        object3 = ValueAnimator.ofFloat((float[])object3);
        super();
        object3.setInterpolator((TimeInterpolator)object5);
        super(this);
        object3.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object5);
        super(this);
        object3.addListener((Animator.AnimatorListener)object5);
        Object object7 = object5 = (Object)new float[n3];
        object7[0] = (View)0.0f;
        object7[1] = (View)1.0f;
        object5 = ValueAnimator.ofFloat((float[])object5);
        super();
        object5.setInterpolator((TimeInterpolator)object2);
        object2 = new cu2_0(this);
        object5.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        object2 = new mu2$b(this);
        object5.addListener((Animator.AnimatorListener)object2);
        object2 = object.getResources();
        int n15 = R$dimen.exo_styled_bottom_bar_height;
        float f5 = object2.getDimension(n15);
        int n16 = R$dimen.exo_styled_progress_bar_height;
        float f6 = object2.getDimension(n16);
        f5 -= f6;
        n16 = R$dimen.exo_styled_bottom_bar_height;
        float f7 = object2.getDimension(n16);
        this.l = animatorSet = new AnimatorSet();
        long l2 = 250L;
        animatorSet.setDuration(l2);
        AnimatorListenerAdapter animatorListenerAdapter = new mu2$c(this, (PlayerControlView)((Object)object));
        animatorSet.addListener((Animator.AnimatorListener)animatorListenerAdapter);
        animatorSet = animatorSet.play((Animator)object3);
        animatorListenerAdapter = mu2.d(0.0f, f5, (View)viewGroup);
        animatorSet = animatorSet.with((Animator)animatorListenerAdapter);
        animatorListenerAdapter = mu2.d(0.0f, f5, object4);
        animatorSet.with((Animator)animatorListenerAdapter);
        this.m = animatorSet = new AnimatorSet();
        animatorSet.setDuration(l2);
        super(this, (PlayerControlView)((Object)object));
        animatorSet.addListener((Animator.AnimatorListener)animatorListenerAdapter);
        animatorListenerAdapter = mu2.d(f5, f7, (View)viewGroup);
        animatorSet = animatorSet.play((Animator)animatorListenerAdapter);
        animatorListenerAdapter = mu2.d(f5, f7, object4);
        animatorSet.with((Animator)animatorListenerAdapter);
        this.n = animatorSet = new AnimatorSet();
        animatorSet.setDuration(l2);
        super(this, (PlayerControlView)((Object)object));
        animatorSet.addListener((Animator.AnimatorListener)animatorListenerAdapter);
        object = animatorSet.play((Animator)object3);
        object3 = mu2.d(0.0f, f7, (View)viewGroup);
        object = object.with((Animator)object3);
        object3 = mu2.d(0.0f, f7, object4);
        object.with((Animator)object3);
        super();
        this.o = object;
        object.setDuration(l2);
        super(this);
        object.addListener((Animator.AnimatorListener)object3);
        object = object.play((Animator)object5);
        object3 = mu2.d(f5, 0.0f, (View)viewGroup);
        object = object.with((Animator)object3);
        object3 = mu2.d(f5, 0.0f, object4);
        object.with((Animator)object3);
        super();
        this.p = object;
        object.setDuration(l2);
        super(this);
        object.addListener((Animator.AnimatorListener)object3);
        object = object.play((Animator)object5);
        viewGroup = mu2.d(f7, 0.0f, (View)viewGroup);
        object = object.with((Animator)viewGroup);
        object4 = mu2.d(f7, 0.0f, object4);
        object.with((Animator)object4);
        Object object8 = object = (Object)new float[n3];
        object8[0] = (PlayerControlView)0.0f;
        object8[1] = (PlayerControlView)1.0f;
        object = ValueAnimator.ofFloat((float[])object);
        this.q = object;
        object.setDuration(l2);
        super(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object4);
        super(this);
        object.addListener((Animator.AnimatorListener)object4);
        Object object9 = object = (Object)new float[n3];
        object9[0] = (PlayerControlView)1.0f;
        object9[1] = (PlayerControlView)0.0f;
        object = ValueAnimator.ofFloat((float[])object);
        this.r = object;
        object.setDuration(l2);
        Object object10 = new gu2(this);
        object.addUpdateListener(object10);
        super(this);
        object.addListener((Animator.AnimatorListener)object10);
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int n3 = view.getWidth();
        int n4 = (view = view.getLayoutParams()) instanceof ViewGroup.MarginLayoutParams;
        if (n4 != 0) {
            view = (ViewGroup.MarginLayoutParams)view;
            n4 = view.leftMargin;
            int n7 = view.rightMargin;
            n3 += (n4 += n7);
        }
        return n3;
    }

    public static ObjectAnimator d(float f5, float f6, View view) {
        float[] fArray = new float[]{f5, f6};
        return ObjectAnimator.ofFloat((Object)view, (String)"translationY", (float[])fArray);
    }

    public static boolean j(View view) {
        int n3;
        int n4 = view.getId();
        if (n4 != (n3 = R$id.exo_bottom_bar) && n4 != (n3 = R$id.exo_prev) && n4 != (n3 = R$id.exo_next) && n4 != (n3 = R$id.exo_rew) && n4 != (n3 = R$id.exo_rew_with_amount) && n4 != (n3 = R$id.exo_ffwd) && n4 != (n3 = R$id.exo_ffwd_with_amount)) {
            n4 = 0;
            view = null;
        } else {
            n4 = 1;
        }
        return n4 != 0;
    }

    public final void a(float f5) {
        float f6;
        float f7 = 1.0f;
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            f6 = viewGroup.getWidth();
            float f8 = (f7 - f5) * f6;
            int n3 = (int)f8;
            f6 = n3;
            viewGroup.setTranslationX(f6);
        }
        if ((viewGroup = this.i) != null) {
            f6 = f7 - f5;
            viewGroup.setAlpha(f6);
        }
        if ((viewGroup = this.f) != null) {
            viewGroup.setAlpha(f7 -= f5);
        }
    }

    public final boolean b(View view) {
        ArrayList arrayList;
        boolean bl2;
        if (view != null && (bl2 = (arrayList = this.y).contains(view))) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void e(long l2, Runnable runnable2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            PlayerControlView playerControlView = this.a;
            playerControlView.postDelayed(runnable2, l2);
        }
    }

    public final void f() {
        PlayerControlView playerControlView = this.a;
        Runnable runnable2 = this.w;
        playerControlView.removeCallbacks(runnable2);
        runnable2 = this.t;
        playerControlView.removeCallbacks(runnable2);
        runnable2 = this.v;
        playerControlView.removeCallbacks(runnable2);
        runnable2 = this.u;
        playerControlView.removeCallbacks(runnable2);
    }

    public final void g() {
        int n3 = this.z;
        int n4 = 3;
        if (n3 == n4) {
            return;
        }
        this.f();
        Object object = this.a;
        n3 = object.getShowTimeoutMs();
        if (n3 > 0) {
            n4 = (int)(this.C ? 1 : 0);
            if (n4 == 0) {
                ju2_0 ju2_02 = this.w;
                long l2 = n3;
                this.e(l2, ju2_02);
            } else {
                n4 = this.z;
                int n7 = 1;
                if (n4 == n7) {
                    object = this.u;
                    long l3 = 2000L;
                    this.e(l3, (Runnable)object);
                } else {
                    iu2 iu22 = this.v;
                    long l4 = n3;
                    this.e(l4, iu22);
                }
            }
        }
    }

    public final void h(View view, boolean bl2) {
        boolean bl3;
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!bl2) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        boolean bl4 = this.A;
        if (bl4 && (bl3 = mu2.j(view))) {
            int n3 = 4;
            view.setVisibility(n3);
        } else {
            boolean bl5 = false;
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int n3) {
        int n4 = this.z;
        this.z = n3;
        PlayerControlView playerControlView = this.a;
        int n7 = 2;
        if (n3 == n7) {
            n7 = 8;
            playerControlView.setVisibility(n7);
        } else if (n4 == n7) {
            n7 = 0;
            playerControlView.setVisibility(0);
        }
        if (n4 != n3) {
            Iterator iterator = playerControlView.d.iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                PlayerControlView$l playerControlView$l = (PlayerControlView$l)iterator.next();
                n7 = playerControlView.getVisibility();
                playerControlView$l.E(n7);
            }
        }
    }

    public final void k() {
        int n3 = this.C;
        if (n3 == 0) {
            this.i(0);
            this.g();
            return;
        }
        n3 = this.z;
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n4 = 4;
                    if (n3 == n4) {
                        return;
                    }
                } else {
                    this.B = n4;
                }
            } else {
                AnimatorSet animatorSet = this.p;
                animatorSet.start();
            }
        } else {
            AnimatorSet animatorSet = this.o;
            animatorSet.start();
        }
        this.g();
    }
}

