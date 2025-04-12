/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.safe.JuspayWebView;

/*
 * Renamed from sw0
 */
public final class sw0_2
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ JuspayWebView b;
    public final /* synthetic */ String c;

    public /* synthetic */ sw0_2(String string2, JuspayWebView juspayWebView, String string3) {
        this.a = string2;
        this.b = juspayWebView;
        this.c = string3;
    }

    public final void run() {
        JuspayWebView juspayWebView = this.b;
        String string2 = this.c;
        DuiInterface.m(this.a, juspayWebView, string2);
    }
}

