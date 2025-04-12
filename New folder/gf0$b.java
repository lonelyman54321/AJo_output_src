/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 */
import android.database.DataSetObserver;

public final class gf0$b
extends DataSetObserver {
    public final /* synthetic */ gf0_0 a;

    public gf0$b(gf0_0 gf0_02) {
        this.a = gf0_02;
    }

    public final void onChanged() {
        gf0_0 gf0_02 = this.a;
        gf0_02.a = true;
        gf0_02.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        gf0_0 gf0_02 = this.a;
        gf0_02.a = false;
        gf0_02.notifyDataSetInvalidated();
    }
}

