/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.accessibility.AccessibilityNodeProvider
 */
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

public class D2 {
    public final Object a;

    public D2() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            D2$b d2$b;
            super(this);
            this.a = d2$b;
        } else {
            D2$a d2$a = new D2$a(this);
            this.a = d2$a;
        }
    }

    public D2(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }

    public void a(int n3, C2 c2, String string2, Bundle bundle) {
    }

    public C2 b(int n3) {
        return null;
    }

    public C2 c(int n3) {
        return null;
    }

    public boolean d(int n3, int n4, Bundle bundle) {
        return false;
    }
}

