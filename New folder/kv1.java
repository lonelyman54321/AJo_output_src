/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ListView
 */
import android.view.View;
import android.widget.ListView;
import androidx.core.widget.AutoScrollHelper;

public final class kv1
extends AutoScrollHelper {
    public final ListView r;

    public kv1(ListView listView) {
        super((View)listView);
        this.r = listView;
    }
}

