/*
 * Decompiled with CFR 0.152.
 */
import androidx.viewpager2.widget.ViewPager2$g;

public final class GO2
extends ViewPager2$g {
    public final /* synthetic */ EO2 a;

    public GO2(EO2 eO2) {
        this.a = eO2;
    }

    public final void onPageSelected(int n3) {
        String string2;
        super.onPageSelected(n3);
        EO2 eO2 = this.a;
        int n4 = eO2.w;
        if (n4 > n3) {
            string2 = eO2.c;
            eO2.Ra(string2);
        }
        if ((n4 = eO2.w) < n3) {
            string2 = eO2.d;
            eO2.Ra(string2);
        }
        eO2.w = n3;
        eO2.Pa();
        eO2.Oa();
    }
}

