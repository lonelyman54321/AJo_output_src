/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.SpannableStringBuilder
 */
import android.text.Layout;
import android.text.SpannableStringBuilder;

public final class eR$a {
    public static final dr_0 c;
    public final Pe0 a;
    public final int b;

    static {
        dr_0 dr_02;
        c = dr_02 = new Object();
    }

    public eR$a(SpannableStringBuilder object, Layout.Alignment alignment, float f5, int n3, float f6, int n4, boolean bl2, int n7, int n8) {
        float f7;
        Pe0$a pe0$a = new Pe0$a();
        pe0$a.a = object;
        pe0$a.c = alignment;
        pe0$a.e = f5;
        object = null;
        pe0$a.f = 0;
        pe0$a.g = n3;
        pe0$a.h = f6;
        pe0$a.i = n4;
        int n10 = -8388609;
        pe0$a.l = f7 = -3.4028235E38f;
        if (bl2) {
            pe0$a.o = n7;
            n10 = 1;
            f7 = Float.MIN_VALUE;
            pe0$a.n = n10;
        }
        object = pe0$a.a();
        this.a = object;
        this.b = n8;
    }
}

