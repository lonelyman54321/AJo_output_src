/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wj2
 */
public final class wj2_0
implements jm0_1 {
    public final /* synthetic */ xj2_0 a;

    public wj2_0(xj2_0 xj2_02) {
        this.a = xj2_02;
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    public final void onDestroy(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final void onStart(mu1_1 object) {
        float f5;
        float f6;
        Intrinsics.checkNotNullParameter(object, "owner");
        im0.c((mu1_1)object);
        object = this.a;
        object.getClass();
        Object object2 = new Rect();
        View view = ((RecyclerView$B)object).itemView;
        int n3 = view.getLocalVisibleRect((Rect)object2);
        View view2 = ((RecyclerView$B)object).itemView;
        int n4 = view2.getHeight();
        int n7 = ((Rect)object2).bottom;
        int n8 = ((Rect)object2).top;
        if (n3 != 0 && (n7 -= n8) > 0 && n4 > 0) {
            f6 = n7;
            f5 = n4;
            f6 /= f5;
            n3 = 100;
            f5 = n3;
            f6 *= f5;
        } else {
            n8 = 0;
            f6 = 0.0f;
            object2 = null;
        }
        n3 = 1116471296;
        f5 = 70.0f;
        n8 = (int)(f6 == f5 ? 0 : (f6 > f5 ? 1 : -1));
        if (n8 > 0 && (object2 = ((xj2_0)object).b) != null) {
            n3 = 0;
            f5 = 0.0f;
            view = null;
            if ((object2 = ((ow_0)object2).e(0)) != null) {
                object2 = ((lt2_1)object2).e;
                n3 = ((RecyclerView$B)object).getLayoutPosition();
                if (object2 != null && (n8 = ((Integer)object2).intValue()) == n3 && (n8 = (int)((object2 = ((RecyclerView$B)object).itemView).isAttachedToWindow() ? 1 : 0)) != 0) {
                    ((xj2_0)object).y();
                }
            }
        }
    }

    public final void onStop(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final /* synthetic */ void p(mu1_1 mu1_12) {
        im0.b(mu1_12);
    }

    public final void w(mu1_1 mu1_12) {
        String string2 = "owner";
        Intrinsics.checkNotNullParameter(mu1_12, string2);
        Intrinsics.checkNotNullParameter(mu1_12, string2);
        this.a.x();
    }
}

