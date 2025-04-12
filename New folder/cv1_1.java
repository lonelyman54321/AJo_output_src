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
import com.ril.ajio.remoteconfig.devsettings.Data;

/*
 * Renamed from cv1
 */
public abstract class cv1_1
extends ViewDataBinding {
    public Data a;
    public int b;
    public sk1_0 c;

    public static cv1_1 bind(View view) {
        int n3 = R$layout.list_item;
        return (cv1_1)ViewDataBinding.bind(null, view, n3);
    }

    public static cv1_1 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.list_item;
        return (cv1_1)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, null);
    }
}

