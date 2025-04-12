/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.Profile;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jB2$a
 */
public final class jb2$a_0
extends BroadcastReceiver {
    public final /* synthetic */ jb2_0 a;

    public jb2$a_0(jb2_0 jb2_02) {
        this.a = jb2_02;
    }

    public final void onReceive(Context object, Intent object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "intent");
        object = object2.getAction();
        String string2 = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
        boolean bl2 = Intrinsics.areEqual(string2, object);
        if (bl2) {
            object = (Profile)object2.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE");
            object = (Profile)object2.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE");
            object2 = this.a;
            ((jb2_0)object2).a((Profile)object);
        }
    }
}

