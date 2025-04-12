/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class AD3$a
extends ur3 {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ AD3 c;

    public AD3$a(AD3 aD3) {
        this.c = aD3;
    }

    public final void a() {
        boolean bl2 = this.a;
        if (bl2) {
            return;
        }
        this.a = bl2 = true;
        BD3 bD3 = this.c.d;
        if (bD3 != null) {
            bD3.a();
        }
    }

    public final void onAnimationEnd() {
        int n3;
        this.b = n3 = this.b + 1;
        AD3 aD3 = this.c;
        ArrayList arrayList = aD3.a;
        int n4 = arrayList.size();
        if (n3 == n4) {
            BD3 bD3 = aD3.d;
            if (bD3 != null) {
                bD3.onAnimationEnd();
            }
            n3 = 0;
            bD3 = null;
            this.b = 0;
            this.a = false;
            aD3.e = false;
        }
    }
}

