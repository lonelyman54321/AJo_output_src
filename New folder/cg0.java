/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
import android.app.PendingIntent;
import android.support.customtabs.ICustomTabsCallback;

public final class cg0 {
    public final ICustomTabsCallback a;
    public final PendingIntent b;

    public cg0(ICustomTabsCallback object, PendingIntent pendingIntent) {
        if (object == null && pendingIntent == null) {
            object = new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
            throw object;
        }
        this.a = object;
        this.b = pendingIntent;
        if (object != null) {
            object = new cg0$a(this);
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof cg0;
        ICustomTabsCallback iCustomTabsCallback = null;
        if (!bl2) {
            return false;
        }
        object = (cg0)object;
        Object object2 = ((cg0)object).b;
        boolean bl3 = true;
        PendingIntent pendingIntent = this.b;
        boolean bl4 = pendingIntent == null;
        if (object2 != null) {
            bl3 = false;
        }
        if (bl4 != bl3) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(object2);
        }
        object2 = "CustomTabSessionToken must have valid binder or pending session";
        iCustomTabsCallback = this.a;
        if (iCustomTabsCallback != null) {
            iCustomTabsCallback = iCustomTabsCallback.asBinder();
            object = ((cg0)object).a;
            if (object != null) {
                object = object.asBinder();
                return iCustomTabsCallback.equals(object);
            }
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final int hashCode() {
        Object object = this.b;
        if (object != null) {
            return object.hashCode();
        }
        object = this.a;
        if (object != null) {
            return object.asBinder().hashCode();
        }
        object = new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
        throw object;
    }
}

