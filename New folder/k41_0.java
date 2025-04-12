/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from k41
 */
public final class k41_0
extends RecyclerView$B {
    public final View a;
    public final boolean b;
    public final ma2_1 c;
    public final RelativeLayout d;
    public final LottieAnimationView e;
    public final TextView f;
    public final View g;
    public final AjioTextView h;
    public final ConstraintLayout i;
    public final TextView j;
    public float k;
    public float l;
    public float m;
    public final k41$b n;

    /*
     * Enabled aggressive block sorting
     */
    public k41_0(View object, boolean bl2, ma2_1 object2) {
        boolean bl3;
        k41$b k41$b;
        TextView textView;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "listener");
        super((View)object);
        this.a = object;
        this.b = bl2;
        this.c = object2;
        int n3 = R$id.order_conf_header_layout;
        object2 = object.findViewById(n3);
        Object object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (RelativeLayout)object2;
        this.d = object2;
        n3 = R$id.order_header_img;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (LottieAnimationView)((Object)object2);
        this.e = object2;
        int n4 = R$id.ochvrTvOrderId;
        object3 = (TextView)object.findViewById(n4);
        this.f = object3;
        n4 = R$id.order_info_layout;
        object3 = object.findViewById(n4);
        this.g = object3;
        n4 = R$id.tv_you_earned_amount;
        this.h = object3 = (AjioTextView)object.findViewById(n4);
        n4 = R$id.earned_amount_layout;
        object3 = (ConstraintLayout)object.findViewById(n4);
        this.i = object3;
        int n7 = R$id.lbl_order_confirmed;
        this.j = textView = (TextView)object.findViewById(n7);
        this.n = k41$b = new k41$b(this);
        k41$a k41$a = new k41$a(this);
        boolean bl4 = og1_1.b();
        if (!bl4) {
            Object object4 = h40_0.a;
            bl4 = h40_0.y1();
            if (bl4 && bl2) {
                int n8;
                ViewGroup.LayoutParams layoutParams = object2.getLayoutParams();
                object3 = hv3_0.a;
                Context context = object.getContext();
                object4 = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(context, (String)object4);
                object3.getClass();
                n4 = 96;
                layoutParams.height = n7 = hv3_0.O(n4, context);
                object = object.getContext();
                Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                layoutParams.width = n8 = hv3_0.O(n4, (Context)object);
                object2.setLayoutParams(layoutParams);
                n8 = R$drawable.ic_greentick_ty;
                ((LottieAnimationView)((Object)object2)).setImageResource(n8);
                Looper looper = Looper.getMainLooper();
                object = new Handler(looper);
                g41 g412 = new g41(this);
                object.postDelayed((Runnable)g412, 900L);
                Looper looper2 = Looper.getMainLooper();
                object = new Handler(looper2);
                h41 h412 = new h41(this);
                object.postDelayed((Runnable)h412, 2000L);
                Looper looper3 = Looper.getMainLooper();
                object = new Handler(looper3);
                i41_0 i41_02 = new i41_0(this);
                object.postDelayed((Runnable)i41_02, 3000L);
                Looper looper4 = Looper.getMainLooper();
                object = new Handler(looper4);
                n3 = 2;
                gB gB2 = new gB(this, n3);
                long l2 = 3800L;
                object.postDelayed((Runnable)gB2, l2);
                return;
            }
        }
        ai0_2.B((View)object2);
        if (object3 != null) {
            ai0_2.i((View)object3);
        }
        if (bl3 = og1_1.b()) {
            object = "anim_order_confirm_luxe.json";
            ((LottieAnimationView)((Object)object2)).setAnimation((String)object);
        } else {
            object = "anim_order_confirm_revamp.json";
            ((LottieAnimationView)((Object)object2)).setAnimation((String)object);
        }
        object = ((LottieAnimationView)((Object)object2)).e.b;
        ((nw)((Object)object)).addListener(k41$a);
    }

    public final void w() {
        int n3 = this.a.getHeight();
        Object object = this.d;
        int n4 = object.getHeight();
        int n7 = object.getWidth();
        float f5 = n7;
        float f6 = this.e.getHeight();
        f5 /= f6;
        int n8 = 2;
        f6 = 2.8E-45f;
        Object object2 = new float[n8];
        object2[0] = 0.0f;
        object2[1] = 60.0f;
        object2 = ValueAnimator.ofFloat((float[])object2);
        long l2 = 800L;
        object2.setDuration(l2);
        j41_0 j41_02 = new j41_0(this, f5, n4, n3);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)j41_02);
        Object object3 = this.n;
        object2.addListener((Animator.AnimatorListener)object3);
        object2.start();
        object3 = this.c;
        object3.h8();
        object = this.i;
        if (object != null) {
            ai0_2.i((View)object);
        }
        object3.onAnimationEnd();
    }
}

