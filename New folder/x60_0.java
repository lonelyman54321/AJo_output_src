/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.remoteconfig.R$layout;

/*
 * Renamed from x60
 */
public abstract class x60_0
extends ViewDataBinding {
    public final ImageView a;
    public final ProgressBar b;
    public yv2_0 c;
    public boolean d;

    public x60_0(Object object, View view, ImageView imageView, ProgressBar progressBar) {
        super(object, view, 0);
        this.a = imageView;
        this.b = progressBar;
    }

    public static x60_0 bind(View view) {
        int n3 = R$layout.content_config_edit;
        return (x60_0)ViewDataBinding.bind(null, view, n3);
    }

    public static x60_0 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.content_config_edit;
        return (x60_0)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, null);
    }
}

