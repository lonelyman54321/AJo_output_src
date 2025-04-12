/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCuratedWidgetVH;
import kotlin.jvm.internal.Intrinsics;

public final class j71
implements Runnable {
    public final /* synthetic */ HomeCuratedWidgetVH a;

    public /* synthetic */ j71(HomeCuratedWidgetVH homeCuratedWidgetVH) {
        this.a = homeCuratedWidgetVH;
    }

    public final void run() {
        HomeCuratedWidgetVH homeCuratedWidgetVH = this.a;
        Intrinsics.checkNotNullParameter(homeCuratedWidgetVH, "this$0");
        homeCuratedWidgetVH.getClass();
        k71 k712 = new k71(homeCuratedWidgetVH);
        homeCuratedWidgetVH.k.post(k712);
    }
}

