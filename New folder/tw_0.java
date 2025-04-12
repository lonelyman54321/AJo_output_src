/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.codeless.CodelessMatcher;
import in.juspay.hypernfc.NfcActivity;
import in.juspay.hypernfc.NfcActivity$onCreate$2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TW
 */
public final class tw_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tw_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NfcActivity$onCreate$2.a((NfcActivity)this.b);
                return;
            }
            case 0: 
        }
        CodelessMatcher codelessMatcher = (CodelessMatcher)this.b;
        Class<CodelessMatcher> clazz = CodelessMatcher.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            String string2 = "this$0";
            try {
                Intrinsics.checkNotNullParameter(codelessMatcher, string2);
                codelessMatcher.b();
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

