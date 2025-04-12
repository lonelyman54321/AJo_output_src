/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from me
 */
public final class me_1
implements Deferred$DeferredHandler,
OnSuccessListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ me_1(Object object) {
        this.a = object;
    }

    public void handle(Provider provider) {
        AnalyticsDeferredProxy.a((AnalyticsDeferredProxy)this.a, provider);
    }

    public void onSuccess(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

