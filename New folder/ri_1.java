/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/*
 * Renamed from rI
 */
public final class ri_1
extends vw0_0 {
    public final Fragment[] h;
    public final ArrayList i;

    public ri_1(FragmentManager fragmentArray, int n3) {
        super((FragmentManager)fragmentArray);
        this.i = fragmentArray = new ArrayList();
        fragmentArray = new Fragment[n3];
        this.h = fragmentArray;
    }

    public final int c() {
        return this.h.length;
    }

    public final CharSequence e(int n3) {
        return (CharSequence)this.i.get(n3);
    }

    public final Object f(int n3, ViewGroup object) {
        object = super.f(n3, (ViewGroup)object);
        Fragment[] fragmentArray = this.h;
        Object object2 = object;
        object2 = (Fragment)object;
        fragmentArray[n3] = object2;
        return object;
    }

    public final Fragment n(int n3) {
        return this.h[n3];
    }
}

