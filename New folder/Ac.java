/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ArgbEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.drawable.GradientDrawable
 *  android.view.View
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class Ac
extends RecyclerView$B {
    public final ma2_1 a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final yc j;
    public final zc k;

    public Ac(View object, ma2_1 object2) {
        int n3 = 2;
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object2, "listener");
        super((View)object);
        this.a = object2;
        int n4 = R$id.cl_earned_points;
        object2 = object.findViewById(n4);
        Object object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ConstraintLayout)((Object)object2);
        this.b = object2;
        int n7 = R$id.oselrTvEarnPoint;
        View view = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
        view = (TextView)view;
        this.c = view;
        n7 = R$id.oselrTvMoreDetails;
        view = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
        view = (TextView)view;
        this.d = view;
        object3 = h40_0.a;
        boolean bl2 = h40_0.y1();
        if (bl2) {
            object3 = object.getContext();
            n7 = R$color.start;
            int n8 = t70.getColor((Context)object3, n7);
            object3 = object.getContext();
            n7 = R$color.mid;
            int n10 = t70.getColor((Context)object3, n7);
            object3 = object.getContext();
            n7 = R$color.end;
            int n14 = t70.getColor((Context)object3, n7);
            object2 = object2.getBackground();
            object3 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable";
            Intrinsics.checkNotNull(object2, (String)object3);
            Object object4 = object2;
            object4 = (GradientDrawable)object2;
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object object5 = object2 = (Object)new float[n3];
            object5[0] = (ma2_1)0.0f;
            object5[1] = (ma2_1)1.0f;
            object2 = ValueAnimator.ofFloat((float[])object2);
            long l2 = 1200L;
            object2.setDuration(l2);
            object2.setRepeatCount(n3);
            object2.setRepeatMode(n3);
            Object object6 = new xc(argbEvaluator, n8, n14, n10, (GradientDrawable)object4);
            object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object6);
            object2.start();
            Intrinsics.checkNotNull(object2);
            object6 = new Ac$a(this, (View)object);
            object2.addListener((Animator.AnimatorListener)object6);
        } else {
            object = object.getContext();
            n3 = R$color.white;
            int n15 = t70.getColor((Context)object, n3);
            object2.setBackgroundColor(n15);
        }
        super(this, 0);
        this.j = object;
        super(this);
        this.k = object;
    }
}

