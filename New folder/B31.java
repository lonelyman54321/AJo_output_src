/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import android.content.Context;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import com.jio.jioads.videomodule.player.k;
import in.juspay.hypersmshandler.SmsRetriever;
import kotlin.jvm.internal.Intrinsics;

public final class B31
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B31(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        String string2 = "this$0";
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (k)object;
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = ((k)object).f;
                if (string2 != null) {
                    Uri uri = ((k)object).h;
                    Intrinsics.checkNotNull(uri);
                    Context context = ((k)object).a;
                    string2.setDataSource(context, uri);
                }
                if ((string2 = ((k)object).f) != null) {
                    string2.prepareAsync();
                }
                return;
            }
            case 2: {
                ((xo3_0)object).a();
                return;
            }
            case 1: {
                SmsRetriever.a((SmsRetriever)object);
                return;
            }
            case 0: 
        }
        n3 = HaptikWebView.t0;
        object = (HaptikWebView)object;
        Intrinsics.checkNotNullParameter(object, string2);
        ((ComponentActivity)object).onBackPressed();
    }
}

