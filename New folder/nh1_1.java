/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 */
import android.graphics.Canvas;
import com.google.android.material.canvas.CanvasCompat$CanvasOperation;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.ril.ajio.data.repo.WishListRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from nH1
 */
public final class nh1_1
implements CanvasCompat$CanvasOperation,
bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Throwable)object;
                return WishListRepo.h((WishListRepo)this.b, (Throwable)object);
            }
            case 1: 
        }
        return (q63_0)oj_0.a((Function1)this.b, "$tmp0", object, "p0", object);
    }

    public void run(Canvas canvas) {
        MaskableFrameLayout.b((MaskableFrameLayout)this.b, canvas);
    }
}

