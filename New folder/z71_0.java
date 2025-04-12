/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z71
 */
public final class z71_0
extends RecyclerView$B {
    public static final /* synthetic */ int h;
    public final View a;
    public final g71_0 b;
    public final OnGAEventHandlerListener c;
    public final boolean d;
    public final gx0_2 e;
    public final ma_2 f;
    public int g;

    public z71_0() {
        throw null;
    }

    public z71_0(View object, g71_0 g71_02, OnGAEventHandlerListener onGAEventHandlerListener, gx0_2 gx0_22) {
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(onGAEventHandlerListener, "onGAEventHandlerListener");
        Intrinsics.checkNotNullParameter(gx0_22, "trackBannerImpression");
        super((View)object);
        this.a = object;
        this.b = g71_02;
        this.c = onGAEventHandlerListener;
        this.d = false;
        this.e = gx0_22;
        object = eb_2.a;
        this.f = object;
        this.g = -1;
    }
}

