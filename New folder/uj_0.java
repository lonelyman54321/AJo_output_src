/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.widget.FrameLayout
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.ui.viewbinding.R$id;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from uj
 */
public final class uj_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ gx0_2 d;

    public uj_0(Fragment fragment, gx0_2 gx0_22) {
        this.c = fragment;
        this.d = gx0_22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Context)object;
        Fragment fragment = this.c;
        if (fragment == null || (fragment = fragment.getLayoutInflater()) == null) {
            fragment = LayoutInflater.from((Context)object);
        }
        FrameLayout frameLayout = new FrameLayout((Context)object);
        object = Boolean.FALSE;
        object = (BC3)this.d.invoke(fragment, frameLayout, object);
        fragment = object.getRoot();
        int n3 = R$id.binding_reference;
        fragment.setTag(n3, object);
        return fragment;
    }
}

