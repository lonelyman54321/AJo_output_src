/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal$NewTokenListener;
import com.google.firebase.messaging.FirebaseMessaging;

/*
 * Renamed from KN0
 */
public final class kn0_0
implements FirebaseInstanceIdInternal$NewTokenListener {
    public final /* synthetic */ FirebaseMessaging a;

    public /* synthetic */ kn0_0(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    public final void onNewToken(String string2) {
        FirebaseMessaging.d(this.a, string2);
    }
}

