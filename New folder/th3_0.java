/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.net.Uri
 *  android.os.Handler
 */
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/*
 * Renamed from tH3
 */
public final class th3_0
extends ContentObserver {
    public final /* synthetic */ dr_2 a;

    public th3_0(le_2 le_22, Handler handler) {
        this.a = le_22;
        super(handler);
    }

    public final void onChange(boolean bl2, Uri object) {
        dr_2 dr_22 = this.a;
        object = Unit.a;
        dr_22.j(object);
    }
}

