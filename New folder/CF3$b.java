/*
 * Decompiled with CFR 0.152.
 */
public final class CF3$b
extends mm$d {
    public final boolean c() {
        int n3 = super.c();
        if (n3 == 0) {
            return false;
        }
        Object object = "MULTI_PROCESS";
        n3 = h83.c((String)object);
        if (n3 != 0) {
            n3 = BF3.a;
            object = CF3.b;
            n3 = (int)(((mm)object).c() ? 1 : 0);
            if (n3 != 0) {
                return DF3$a.a.getStatics().isMultiProcessEnabled();
            }
            object = new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            throw object;
        }
        return false;
    }
}

