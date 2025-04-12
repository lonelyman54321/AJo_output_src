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

public abstract class aW0
extends ViewDataBinding {
    public static aW0 bind(View view) {
        int n3 = R$layout.fragment_config_editor;
        return (aW0)ViewDataBinding.bind(null, view, n3);
    }

    public static aW0 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.fragment_config_editor;
        return (aW0)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, null);
    }
}

