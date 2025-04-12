/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.os.Handler
 */
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

public final class gf0$a
extends ContentObserver {
    public final /* synthetic */ gf0_0 a;

    public gf0$a(gf0_0 gf0_02) {
        this.a = gf0_02;
        super((Handler)gf0_02);
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean bl2) {
        Cursor cursor;
        gf0_0 gf0_02 = this.a;
        boolean bl3 = gf0_02.b;
        if (bl3 && (cursor = gf0_02.c) != null && !(bl3 = cursor.isClosed())) {
            cursor = gf0_02.c;
            gf0_02.a = bl3 = cursor.requery();
        }
    }
}

