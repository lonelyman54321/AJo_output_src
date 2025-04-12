/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import com.ril.ajio.home.landingpage.widgets.view.VideoComponentView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mp2
 */
public final class mp2_1
implements o60_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mp2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void accept(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                VideoComponentView videoComponentView = (VideoComponentView)((Object)this.b);
                object = (Bitmap)object;
                VideoComponentView.a(videoComponentView, (Bitmap)object);
                return;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

