/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;

public final class Q22$f
extends GridLayoutManager$b {
    public final /* synthetic */ q22_0 c;

    public Q22$f(q22_0 q22_02) {
        this.c = q22_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int c(int n3) {
        Object object = this.c.B;
        if (object == null) return 1;
        object = ((RecyclerView)object).getAdapter();
        int n4 = 1;
        if (object == null) return n4;
        if ((n3 = ((RecyclerView$f)object).getItemViewType(n3)) == 0) return 2;
        int n7 = 3;
        if (n3 == n7) return 2;
        n7 = 5;
        if (n3 == n7) return 2;
        n7 = 21;
        if (n3 == n7) return 2;
        n7 = 22;
        if (n3 == n7) return 2;
        switch (n3) {
            default: {
                switch (n3) {
                    default: {
                        switch (n3) {
                            default: {
                                return n4;
                            }
                            case 25: 
                            case 26: 
                            case 27: 
                            case 28: 
                            case 29: 
                        }
                    }
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                }
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                return 2;
            }
        }
    }
}

