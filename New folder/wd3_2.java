/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.a;
import com.ril.ajio.home.AjioHomeActivity;
import java.util.ArrayList;

/*
 * Renamed from wD3
 */
public final class wd3_2
extends a {
    public final ArrayList j;

    public wd3_2(AjioHomeActivity arrayList) {
        super((FragmentActivity)((Object)arrayList));
        this.j = arrayList = new ArrayList();
    }

    public final int getItemCount() {
        return this.j.size();
    }

    public final Fragment i(int n3) {
        return (Fragment)this.j.get(n3);
    }
}

