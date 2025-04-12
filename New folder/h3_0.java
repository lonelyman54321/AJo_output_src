/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 */
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.remoteconfig.R$layout;

/*
 * Renamed from h3
 */
public abstract class h3_0
extends ViewDataBinding {
    public final x60_0 a;

    public h3_0(Object object, View view, x60_0 x60_02) {
        super(object, view, 1);
        this.a = x60_02;
    }

    public static h3_0 bind(View view) {
        int n3 = R$layout.activity_config_edit;
        return (h3_0)ViewDataBinding.bind(null, view, n3);
    }

    public static h3_0 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.activity_config_edit;
        return (h3_0)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, null);
    }
}

