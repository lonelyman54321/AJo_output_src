/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/*
 * Renamed from SL
 */
public final class sl_2
implements View.OnLayoutChangeListener {
    public final /* synthetic */ CarouselLayoutManager a;

    public /* synthetic */ sl_2(CarouselLayoutManager carouselLayoutManager) {
        this.a = carouselLayoutManager;
    }

    public final void onLayoutChange(View view, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        CarouselLayoutManager.b(this.a, view, n3, n4, n7, n8, n10, n14, n15, n16);
    }
}

