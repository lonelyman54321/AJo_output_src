/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 */
import android.content.ComponentName;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;

public final class s52$d$a {
    public final ComponentName a;
    public boolean b = false;
    public INotificationSideChannel c;
    public final ArrayDeque d;
    public int e;

    public s52$d$a(ComponentName componentName) {
        ArrayDeque arrayDeque;
        this.d = arrayDeque = new ArrayDeque();
        this.e = 0;
        this.a = componentName;
    }
}

