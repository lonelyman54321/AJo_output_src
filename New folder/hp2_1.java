/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnFailureListener;
import in.juspay.hypersmshandler.SmsRetriever;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hp2
 */
public final class hp2_1
implements o60_0,
e92,
OnFailureListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ hp2_1(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onFailure(Exception exception) {
        SmsRetriever.a((SmsRetriever)this.a, exception);
    }

    public void onSuccess(Object iterator) {
        boolean bl2;
        iterator = (Void)((Object)iterator);
        iterator = (hC2)this.a;
        ArrayList arrayList = ((hC2)((Object)iterator)).c;
        Object object = ((hC2)((Object)iterator)).a;
        arrayList.addAll(object);
        iterator = ((hC2)((Object)iterator)).b.iterator();
        while (bl2 = iterator.hasNext()) {
            object = ((ci_0)iterator.next()).getPushType();
            arrayList.remove(object);
        }
    }
}

