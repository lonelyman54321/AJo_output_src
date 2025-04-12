/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;

public final class ik3 {
    public static final boolean a(int n3, KeyEvent keyEvent) {
        long l2 = bo1_1.c(keyEvent) >> 32;
        int n4 = (int)l2;
        n3 = n4 == n3 ? 1 : 0;
        return n3 != 0;
    }
}

