/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.animation.LinearInterpolator
 */
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackOrderLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Hf2$b
implements View.OnTouchListener {
    public final hf2_0 a;
    public final ArrayList b;
    public final int c;
    public final String d;
    public final /* synthetic */ hf2_0 e;

    public Hf2$b(hf2_0 hf2_02, hf2_0 hf2_03, ArrayList arrayList, int n3, String string2) {
        Intrinsics.checkNotNullParameter(hf2_03, "orderListProductViewHolder");
        Intrinsics.checkNotNullParameter(arrayList, "statusHistoryList");
        Intrinsics.checkNotNullParameter(string2, "orderStatus");
        this.e = hf2_02;
        this.a = hf2_03;
        this.b = arrayList;
        this.c = n3;
        this.d = string2;
    }

    public final boolean onTouch(View object, MotionEvent motionEvent) {
        ObjectAnimator objectAnimator = null;
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = "motionEvent";
        Intrinsics.checkNotNullParameter(motionEvent, (String)object);
        boolean bl2 = motionEvent.getAction();
        boolean bl3 = true;
        if (bl3 == bl2) {
            float f5;
            object = this.a.o;
            float f6 = object.getRotation();
            int n3 = 0x43340000;
            float f7 = 180.0f;
            String string2 = null;
            float f8 = f6 - 0.0f;
            Object object3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object3 == false || (f5 = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1)) == false) {
                Object object4;
                Object object5;
                Object object6;
                object = this.d;
                object3 = TextUtils.isEmpty((CharSequence)object);
                if (object3 == false) {
                    object6 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object5 = "Track Item, status -";
                    object4 = "order listing screen";
                    String string3 = "Order List";
                    cP.b((String)object5, (String)object, (GTMEvents)object6, string3, (String)object4);
                }
                object = this.e;
                object6 = ((hf2_0)object).u;
                int n4 = this.c;
                ((TrackOrderLayout)((Object)object6)).setActivePosition(n4);
                object6 = ((hf2_0)object).u;
                object5 = this.b;
                ((TrackOrderLayout)((Object)object6)).setStatusHistoryList((ArrayList)object5);
                object6 = ((hf2_0)object).o;
                float f11 = object6.getRotation();
                float f12 = f11 == f7 ? 0 : (f11 < f7 ? -1 : 1);
                if (f12 == false) {
                    n3 = 0;
                    f7 = 0.0f;
                    object2 = null;
                }
                string2 = "rotation";
                f12 = 2;
                object4 = new float[f12];
                object4[0] = f11;
                object4[bl3] = f7;
                objectAnimator = ObjectAnimator.ofFloat((Object)object6, (String)string2, (float[])object4);
                n3 = ((hf2_0)object).c;
                long l2 = n3;
                objectAnimator.setDuration(l2);
                objectAnimator.setAutoCancel(bl3);
                object2 = new LinearInterpolator();
                objectAnimator.setInterpolator((TimeInterpolator)object2);
                object2 = new gf2_1((hf2_0)object, f11);
                objectAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
                objectAnimator.start();
            }
            return bl3;
        }
        return false;
    }
}

