/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;

/*
 * Renamed from Tl0
 */
public final class tl0_1
implements Provider {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public /* synthetic */ tl0_1(Context context, String string2) {
        this.a = context;
        this.b = string2;
    }

    public final Object get() {
        Context context = this.a;
        String string2 = this.b;
        return DefaultHeartBeatController.b(context, string2);
    }
}

