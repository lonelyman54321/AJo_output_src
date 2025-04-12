/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ON0
 */
public final class on0_0
implements OnSuccessListener,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ on0_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onSuccess(Object object) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging)this.a;
        object = (CloudMessage)object;
        FirebaseMessaging.j(firebaseMessaging, (CloudMessage)object);
    }
}

