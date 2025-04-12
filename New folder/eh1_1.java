/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.widget.PopupMenu$OnMenuItemClickListener
 */
import android.view.MenuItem;
import android.widget.PopupMenu;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from eh1
 */
public final class eh1_1
implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ InflateView a;
    public final /* synthetic */ String b;

    public /* synthetic */ eh1_1(InflateView inflateView, String string2) {
        this.a = inflateView;
        this.b = string2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        InflateView inflateView = this.a;
        String string2 = this.b;
        return InflateView.f(inflateView, string2, menuItem);
    }
}

