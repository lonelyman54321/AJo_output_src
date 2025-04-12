/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;

/*
 * Renamed from jy2
 */
public final class jy2_0
extends v {
    public final RecyclerView a;
    public final a b;
    public final jy2$a c;

    public jy2_0(RecyclerView recyclerView) {
        super(recyclerView);
        a a2;
        this.b = a2 = super.getItemDelegate();
        super(this);
        this.c = a2;
        this.a = recyclerView;
    }

    public final a getItemDelegate() {
        return this.c;
    }
}

