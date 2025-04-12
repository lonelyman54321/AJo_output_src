/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.suggestedevents.b;
import com.facebook.appevents.suggestedevents.b$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tD3
 */
public final class td3_1
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ td3_1(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public final void run() {
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$queriedEvent");
        String string3 = this.b;
        Intrinsics.checkNotNullParameter(string3, "$buttonText");
        Object object = com.facebook.appevents.suggestedevents.b.e;
        object = new float[0];
        b$a.c(string2, string3, (float[])object);
    }
}

