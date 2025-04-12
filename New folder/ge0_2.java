/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import com.ril.ajio.simpleCropView.CropImageView;
import java.util.concurrent.Callable;

/*
 * Renamed from ge0
 */
public final class ge0_2
implements Callable {
    public final /* synthetic */ Uri a;
    public final /* synthetic */ CropImageView b;

    public ge0_2(CropImageView cropImageView, Uri uri) {
        this.b = cropImageView;
        this.a = uri;
    }

    public final Object call() {
        CropImageView cropImageView = this.b;
        Uri uri = this.a;
        if (uri != null) {
            cropImageView.w = uri;
        }
        return CropImageView.a(cropImageView);
    }
}

